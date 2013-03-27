package net.yuanmomo.searchrescue.web.mapper;

import java.util.List;
import net.yuanmomo.searchrescue.web.bean.BoughtBeacon;
import net.yuanmomo.searchrescue.web.bean.BoughtBeaconCriteria;
import org.apache.ibatis.annotations.Param;

public interface BoughtBeaconMapper {
    int countByExample(BoughtBeaconCriteria example);

    int deleteByExample(BoughtBeaconCriteria example);

    int insert(BoughtBeacon record);

    int insertSelective(BoughtBeacon record);

    List<BoughtBeacon> selectByExample(BoughtBeaconCriteria example);

    int updateByExampleSelective(@Param("record") BoughtBeacon record, @Param("example") BoughtBeaconCriteria example);

    int updateByExample(@Param("record") BoughtBeacon record, @Param("example") BoughtBeaconCriteria example);
}