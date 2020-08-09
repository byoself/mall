package pers.wossge.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.pms.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:16
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

