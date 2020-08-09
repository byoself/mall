package pers.wossge.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.pms.PmsSpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:15
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

