package net.yuanmomo.searchrescue.web.mapper;

import java.util.List;
import net.yuanmomo.searchrescue.web.bean.BeaconInfo;
import net.yuanmomo.searchrescue.web.bean.BeaconInfoCriteria;
import net.yuanmomo.searchrescue.web.bean.BeaconInfoKey;
import org.apache.ibatis.annotations.Param;

public interface BeaconInfoMapper {
    int countByExample(BeaconInfoCriteria example);

    int deleteByExample(BeaconInfoCriteria example);

    int deleteByPrimaryKey(BeaconInfoKey key);

    int insert(BeaconInfo record);

    int insertSelective(BeaconInfo record);

    List<BeaconInfo> selectByExample(BeaconInfoCriteria example);

    BeaconInfo selectByPrimaryKey(BeaconInfoKey key);

    int updateByExampleSelective(@Param("record") BeaconInfo record, @Param("example") BeaconInfoCriteria example);

    int updateByExample(@Param("record") BeaconInfo record, @Param("example") BeaconInfoCriteria example);

    int updateByPrimaryKeySelective(BeaconInfo record);

    int updateByPrimaryKey(BeaconInfo record);
}