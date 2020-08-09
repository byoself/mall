package pers.wossge.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.entity.ums.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:52:12
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

