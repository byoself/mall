package pers.wossge.mall.ware.dao;

import pers.wossge.mall.common.entity.wms.WmsPurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:39
 */
@Mapper
public interface WmsPurchaseDao extends BaseMapper<WmsPurchaseEntity> {
	
}
