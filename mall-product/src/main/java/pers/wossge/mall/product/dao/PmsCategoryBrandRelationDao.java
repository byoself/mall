package pers.wossge.mall.product.dao;

import pers.wossge.mall.common.entity.pms.PmsCategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:16
 */
@Mapper
public interface PmsCategoryBrandRelationDao extends BaseMapper<PmsCategoryBrandRelationEntity> {
	
}
