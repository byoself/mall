package pers.wossge.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.pms.PmsSkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:16
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

