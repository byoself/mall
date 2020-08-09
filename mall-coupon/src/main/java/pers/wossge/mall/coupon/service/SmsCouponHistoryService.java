package pers.wossge.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.sms.SmsCouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:52:40
 */
public interface SmsCouponHistoryService extends IService<SmsCouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

