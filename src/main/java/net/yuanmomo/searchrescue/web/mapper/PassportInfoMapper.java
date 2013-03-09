package net.yuanmomo.searchrescue.web.mapper;

import java.util.List;
import net.yuanmomo.searchrescue.web.bean.PassportInfo;
import net.yuanmomo.searchrescue.web.bean.PassportInfoCriteria;
import org.apache.ibatis.annotations.Param;

public interface PassportInfoMapper {
    int countByExample(PassportInfoCriteria example);

    int deleteByExample(PassportInfoCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(PassportInfo record);

    int insertSelective(PassportInfo record);

    List<PassportInfo> selectByExample(PassportInfoCriteria example);

    PassportInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PassportInfo record, @Param("example") PassportInfoCriteria example);

    int updateByExample(@Param("record") PassportInfo record, @Param("example") PassportInfoCriteria example);

    int updateByPrimaryKeySelective(PassportInfo record);

    int updateByPrimaryKey(PassportInfo record);
}