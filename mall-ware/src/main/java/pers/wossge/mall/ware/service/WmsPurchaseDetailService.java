package pers.wossge.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.wms.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:39
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

