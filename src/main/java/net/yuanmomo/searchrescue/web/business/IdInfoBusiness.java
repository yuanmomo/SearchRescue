package net.yuanmomo.searchrescue.web.business;

import net.yuanmomo.searchrescue.web.bean.IdInfo;
import net.yuanmomo.searchrescue.web.bean.IdInfoCriteria;
import net.yuanmomo.searchrescue.web.util.BasicBusiness;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IdInfoBusiness extends BasicBusiness {
	
	public boolean isCerNoRegistered(String cerNo) {
		// 判断userInfo是不是已经注册
		IdInfoCriteria param = new IdInfoCriteria();
		param.createCriteria().andCerNoEqualTo(cerNo);
		int count = this.idInfoMapper.countByExample(param);
		if (count > 0) {
			return true;// 用户名已经存在，请重新输入用户名
		}
		return false;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(IdInfo idInfo){
		return this.idInfoMapper.insert(idInfo)>0?true:false;
	}
}
