package pers.wossge.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.wms.WmsWareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:39
 */
public interface WmsWareInfoService extends IService<WmsWareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

