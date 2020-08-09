package pers.wossge.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.pms.PmsSkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:15
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

