package pers.wossge.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.oms.OmsRefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:50:55
 */
public interface OmsRefundInfoService extends IService<OmsRefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

