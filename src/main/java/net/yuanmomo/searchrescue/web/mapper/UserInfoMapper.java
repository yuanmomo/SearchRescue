package net.yuanmomo.searchrescue.web.mapper;

import java.util.List;
import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfoCriteria;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    int countByExample(UserInfoCriteria example);
    int deleteByExample(UserInfoCriteria example);
    int deleteByPrimaryKey(Long id);
    int insert(UserInfo record);
    int insertSelective(UserInfo record);
    List<UserInfo> selectByExample(UserInfoCriteria example);
    UserInfo selectByPrimaryKey(Long id);
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoCriteria example);
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoCriteria example);
    int updateByPrimaryKeySelective(UserInfo record);
    int updateByPrimaryKey(UserInfo record);
}