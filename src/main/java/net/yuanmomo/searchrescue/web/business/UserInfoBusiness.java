package net.yuanmomo.searchrescue.web.business;

import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.util.BasicBusiness;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserInfoBusiness extends BasicBusiness {

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public UserInfo selectById(long id) {
		UserInfo user = this.userInfoMapper.selectByPrimaryKey(id);
		return user;
	}
}
