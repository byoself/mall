package pers.wossge.mall.coupon.dao;

import pers.wossge.mall.common.entity.sms.SmsCouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:52:40
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseMapper<SmsCouponHistoryEntity> {
	
}
