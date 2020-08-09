package pers.wossge.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.wms.WmsPurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:39
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

