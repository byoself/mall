package pers.wossge.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.ums.UmsMemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:52:12
 */
public interface UmsMemberLevelService extends IService<UmsMemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

