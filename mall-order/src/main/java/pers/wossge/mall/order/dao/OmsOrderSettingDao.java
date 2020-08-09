package pers.wossge.mall.order.dao;

import pers.wossge.mall.common.entity.oms.OmsOrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:50:55
 */
@Mapper
public interface OmsOrderSettingDao extends BaseMapper<OmsOrderSettingEntity> {
	
}
