package pers.wossge.mall.order.dao;

import pers.wossge.mall.common.entity.oms.OmsOrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:50:55
 */
@Mapper
public interface OmsOrderReturnReasonDao extends BaseMapper<OmsOrderReturnReasonEntity> {
	
}
