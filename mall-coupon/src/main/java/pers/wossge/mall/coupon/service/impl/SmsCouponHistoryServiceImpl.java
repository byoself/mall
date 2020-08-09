package pers.wossge.mall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.utils.Query;
import pers.wossge.mall.coupon.dao.SmsCouponHistoryDao;
import pers.wossge.mall.common.entity.sms.SmsCouponHistoryEntity;
import pers.wossge.mall.coupon.service.SmsCouponHistoryService;

import java.util.Map;


@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryDao, SmsCouponHistoryEntity> implements SmsCouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponHistoryEntity> page = this.page(
                new Query<SmsCouponHistoryEntity>().getPage(params),
                new QueryWrapper<SmsCouponHistoryEntity>()
        );

        return new PageUtils(page);
    }

}