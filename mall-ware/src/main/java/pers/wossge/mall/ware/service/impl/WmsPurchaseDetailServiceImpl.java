package pers.wossge.mall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.utils.Query;
import pers.wossge.mall.ware.dao.WmsPurchaseDetailDao;
import pers.wossge.mall.common.entity.wms.WmsPurchaseDetailEntity;
import pers.wossge.mall.ware.service.WmsPurchaseDetailService;

import java.util.Map;


@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl extends ServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetailEntity> implements WmsPurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsPurchaseDetailEntity> page = this.page(
                new Query<WmsPurchaseDetailEntity>().getPage(params),
                new QueryWrapper<WmsPurchaseDetailEntity>()
        );

        return new PageUtils(page);
    }

}