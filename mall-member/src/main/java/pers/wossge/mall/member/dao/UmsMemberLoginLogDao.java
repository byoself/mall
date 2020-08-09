package pers.wossge.mall.member.dao;

import pers.wossge.mall.common.entity.ums.UmsMemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:52:12
 */
@Mapper
public interface UmsMemberLoginLogDao extends BaseMapper<UmsMemberLoginLogEntity> {
	
}
