package pers.wossge.mall.product.dao;

import pers.wossge.mall.common.entity.pms.PmsCommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:16
 */
@Mapper
public interface PmsCommentReplayDao extends BaseMapper<PmsCommentReplayEntity> {
	
}
