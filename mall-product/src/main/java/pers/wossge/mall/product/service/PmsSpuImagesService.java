package pers.wossge.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.pms.PmsSpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:15
 */
public interface PmsSpuImagesService extends IService<PmsSpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

