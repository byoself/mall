package pers.wossge.mall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.utils.Query;

import pers.wossge.mall.coupon.dao.SmsSkuLadderDao;
import pers.wossge.mall.common.entity.sms.SmsSkuLadderEntity;
import pers.wossge.mall.coupon.service.SmsSkuLadderService;


@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl extends ServiceImpl<SmsSkuLadderDao, SmsSkuLadderEntity> implements SmsSkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSkuLadderEntity> page = this.page(
                new Query<SmsSkuLadderEntity>().getPage(params),
                new QueryWrapper<SmsSkuLadderEntity>()
        );

        return new PageUtils(page);
    }

}