package net.yuanmomo.searchrescue.web.mapper;

import java.util.List;
import net.yuanmomo.searchrescue.web.bean.LeaseInfo;
import net.yuanmomo.searchrescue.web.bean.LeaseInfoCriteria;
import org.apache.ibatis.annotations.Param;

public interface LeaseInfoMapper {
    int countByExample(LeaseInfoCriteria example);

    int deleteByExample(LeaseInfoCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(LeaseInfo record);

    int insertSelective(LeaseInfo record);

    List<LeaseInfo> selectByExampleWithBLOBs(LeaseInfoCriteria example);

    List<LeaseInfo> selectByExample(LeaseInfoCriteria example);

    LeaseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LeaseInfo record, @Param("example") LeaseInfoCriteria example);

    int updateByExampleWithBLOBs(@Param("record") LeaseInfo record, @Param("example") LeaseInfoCriteria example);

    int updateByExample(@Param("record") LeaseInfo record, @Param("example") LeaseInfoCriteria example);

    int updateByPrimaryKeySelective(LeaseInfo record);

    int updateByPrimaryKeyWithBLOBs(LeaseInfo record);

    int updateByPrimaryKey(LeaseInfo record);
}