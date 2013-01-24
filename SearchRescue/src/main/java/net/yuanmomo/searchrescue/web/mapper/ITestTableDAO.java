package net.yuanmomo.searchrescue.web.mapper;

import net.yuanmomo.searchrescue.web.bean.TestTable;

public interface ITestTableDAO{
	public int add(TestTable test) throws Exception;
	public int update(TestTable test) throws Exception;
	public TestTable get(int id) throws Exception;
	public TestTable getForUpdate(int id) throws Exception;
}
