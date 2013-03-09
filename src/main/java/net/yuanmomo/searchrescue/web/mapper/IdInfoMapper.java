package net.yuanmomo.searchrescue.web.mapper;

import java.util.List;
import net.yuanmomo.searchrescue.web.bean.IdInfo;
import net.yuanmomo.searchrescue.web.bean.IdInfoCriteria;
import org.apache.ibatis.annotations.Param;

public interface IdInfoMapper {
    int countByExample(IdInfoCriteria example);

    int deleteByExample(IdInfoCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(IdInfo record);

    int insertSelective(IdInfo record);

    List<IdInfo> selectByExampleWithBLOBs(IdInfoCriteria example);

    List<IdInfo> selectByExample(IdInfoCriteria example);

    IdInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IdInfo record, @Param("example") IdInfoCriteria example);

    int updateByExampleWithBLOBs(@Param("record") IdInfo record, @Param("example") IdInfoCriteria example);

    int updateByExample(@Param("record") IdInfo record, @Param("example") IdInfoCriteria example);

    int updateByPrimaryKeySelective(IdInfo record);

    int updateByPrimaryKeyWithBLOBs(IdInfo record);

    int updateByPrimaryKey(IdInfo record);
}