package pers.wossge.mall.ware.dao;

import pers.wossge.mall.common.entity.wms.WmsWareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:38
 */
@Mapper
public interface WmsWareSkuDao extends BaseMapper<WmsWareSkuEntity> {
	
}
