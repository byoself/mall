package pers.wossge.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.wms.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:38
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

