package pers.wossge.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.wms.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:38
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

