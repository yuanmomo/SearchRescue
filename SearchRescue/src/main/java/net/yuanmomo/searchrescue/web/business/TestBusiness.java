package net.yuanmomo.searchrescue.web.business;

import net.yuanmomo.searchrescue.web.bean.TestTable;
import net.yuanmomo.searchrescue.web.mapper.ITestTableDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestBusiness{

	@Autowired
	private ITestTableDAO iTestTableDAO=null;

	public ITestTableDAO getiTestTableDAO() {
		return iTestTableDAO;
	}

	public void setiTestTableDAO(ITestTableDAO iTestTableDAO) {
		this.iTestTableDAO = iTestTableDAO;
	}

	public void add(TestTable test) throws Exception {
		this.iTestTableDAO.add(test);
	}

	public TestTable getOneTest(int id) throws Exception {
		return this.iTestTableDAO.get(id);
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.SERIALIZABLE, rollbackFor = Exception.class)
	public boolean updateOneTest(int id) throws Exception {
		TestTable temp = this.iTestTableDAO.get(id);
		System.err.println("AAAAAAAAAAAA  线程开始更新，这儿要睡10秒，更新之前 name = " + temp.getName());
		Thread.sleep(10000);
		System.err.println("$AAAAAAAAAAAA   线程 睡眠完成，执行更新, A线程给name 加上一个  '%' 号");
		temp.setName(temp.getName() + "%");
		this.iTestTableDAO.update(temp);
		temp=this.iTestTableDAO.get(id);
		System.err.println("$AAAAAAAAAAAA   线程更新完成, 现在的name = " + temp.getName());
		return true;
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.SERIALIZABLE, rollbackFor = Exception.class)
	public boolean updateOneTest2(int id) throws Exception {
		TestTable temp2 = this.iTestTableDAO.get(id);
		System.err.println("BBBBBBBBBBBBBB  线程开始更新，但是理论上应该等带 A 线程更新了，或者直接跑错，那么B就不能执行更新");
		System.err.println("BBBBBBBBBBBBBB  线程 更新之前，BB线程给name 加上两个  '%' 号的 name = " + temp2.getName());
		temp2.setName(temp2.getName()+"%%");
		this.iTestTableDAO.update(temp2);
		TestTable temp3 = this.iTestTableDAO.get(id);
		System.err.println("BBBBBBBBBBBBBB  线程 更新之后的 name = " + temp3.getName());
//		Thread.sleep(10000);
		return true;
	}
}
// if(temp.getName().endsWith("$$")){
// System.err.println("$ 已经两条$了， 不更新了啦 $$");
//
// // //这个时候看能不能查出来test id=5
// TestTable temp2=this.testDAO.get(5);
// System.out.println("In bussiness, " +temp2.getId());
// System.out.println("In bussiness, " +temp2.getName());
// System.out.println("In bussiness, " +temp2.getBirthday());

// @Transactional(isolation=Isolation.REPEATABLE_READ,
// rollbackFor=RuntimeException.class)
//(propagation=Propagation.REQUIRES_NEW,isolation =Isolation.SERIALIZABLE, rollbackFor = Exception.class)
// }else{
// Thread.sleep(20000);
// System.err.println("$ 更新一次 $$");
// temp.setName(temp.getName()+"$");
// this.testDAO.update(temp);
// //System.err.println("更新之后，哇咔咔"+temp.getName());
// }