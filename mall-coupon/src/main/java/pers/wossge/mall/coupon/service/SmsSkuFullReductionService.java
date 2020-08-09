package pers.wossge.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.sms.SmsSkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:52:40
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

