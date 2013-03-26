package net.yuanmomo.searchrescue.web.business;

import java.util.List;

import net.yuanmomo.searchrescue.web.bean.IdInfo;
import net.yuanmomo.searchrescue.web.bean.PassportInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfoCriteria;
import net.yuanmomo.searchrescue.web.bean.UserInfoID;
import net.yuanmomo.searchrescue.web.bean.UserInfoPassport;
import net.yuanmomo.searchrescue.web.util.BasicBusiness;
import net.yuanmomo.searchrescue.web.util.MD5;
import net.yuanmomo.searchrescue.web.util.UserConvert;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserInfoBusiness extends BasicBusiness {

	public boolean isUserNameRegistered(String userName) {
		// 判断userInfo是不是已经注册
		UserInfoCriteria param = new UserInfoCriteria();
		param.createCriteria().andUserNameEqualTo(userName);
		int count = this.userInfoMapper.countByExample(param);
		if (count > 0) {
			return true;// 用户名已经存在，请重新输入用户名
		}
		return false;
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public int doRegisterForCerStyle1(UserInfoID userInfoId) throws Exception {
		// 判断userInfo是不是已经注册
		boolean isUserNameRegistered = this.isUserNameRegistered(userInfoId
				.getUserName());
		if (isUserNameRegistered) {
			return 1;// 用户名已经存在，请重新输入用户名
		} else {
			// 用户名不存在，可以注册.先注册userInfo,在注册IDInfo
			userInfoId.setUserStyle((byte) 3);// 默认都是注册用户

			userInfoId.setCipher(MD5.getMD5(userInfoId.getPassword()));
			UserInfo userInfo = UserConvert
					.convertUserInfoIDToUserInfo(userInfoId);
			long result = this.userInfoMapper.insertSelective(userInfo);
			if (result >= 0) {
				// UserInfo 数据插入成功，接下来插入IDinfo
				userInfoId.setUserInfoId(userInfo.getId());
				IdInfo idInfo = UserConvert
						.convertUserInfoIDToIdInfo(userInfoId);
				// 插入idInfo
				this.idInfoMapper.insert(idInfo);
				return 100; // 100表示用户注册成功。
			} else {
				throw new Exception("插入UserInfo表失败，回滚。。。");
			}
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public int doRegisterForCerStyle2(UserInfoPassport userInfoPassport)
			throws Exception {
		// 判断userInfo是不是已经注册
		boolean isUserNameRegistered = this
				.isUserNameRegistered(userInfoPassport.getUserName());
		if (isUserNameRegistered) {
			return 1;// 用户名已经存在，请重新输入用户名
		} else {
			// 用户名不存在，可以注册.先注册userInfo,在注册IDInfo
			userInfoPassport.setUserStyle((byte) 3);// 默认都是注册用户

			userInfoPassport.setCipher(MD5.getMD5(userInfoPassport
					.getPassword()));
			UserInfo userInfo = UserConvert
					.convertUserInfoPassportToUserInfo(userInfoPassport);
			long result = this.userInfoMapper.insertSelective(userInfo);
			if (result >= 0) {
				// UserInfo 数据插入成功，接下来插入IDinfo
				userInfoPassport.setUserInfoId(userInfo.getId());
				PassportInfo passportInfo = UserConvert
						.convertUserInfoPassportToPassportInfo(userInfoPassport);
				// 插入idInfo
				this.passportInfoMapper.insert(passportInfo);
				return 100; // 100表示用户注册成功。
			} else {
				throw new Exception("插入UserInfo表失败，回滚。。。");
			}
		}
	}

	public UserInfo selectById(long id) {
		UserInfo user = this.userInfoMapper.selectByPrimaryKey(id);
		return user;
	}

	public UserInfo doLogin(String userName, String password) {
		UserInfoCriteria param = new UserInfoCriteria();
		param.createCriteria().andUserNameEqualTo(userName).andCipherEqualTo(MD5.getMD5(password));
		List<UserInfo> users = this.userInfoMapper.selectByExample(param);
		if(users!=null && users.size()>0 && users.size()==1){
			return users.get(0);
		}
		return null;
	}
	public boolean saveNewPassword(UserInfo user,String oldPassword,String newPassword){
		user.setPassword(newPassword);
		user.setCipher(MD5.getMD5(newPassword));
		UserInfoCriteria param=new UserInfoCriteria();
		param.createCriteria().andUserNameEqualTo(user.getUserName()).andCipherEqualTo(MD5.getMD5(oldPassword));
		return this.userInfoMapper.updateByExample(user, param)>0?true:false;
	}
}
