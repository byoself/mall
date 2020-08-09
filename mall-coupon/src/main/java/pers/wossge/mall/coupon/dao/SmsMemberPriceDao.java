package pers.wossge.mall.coupon.dao;

import pers.wossge.mall.common.entity.sms.SmsMemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:52:40
 */
@Mapper
public interface SmsMemberPriceDao extends BaseMapper<SmsMemberPriceEntity> {
	
}
