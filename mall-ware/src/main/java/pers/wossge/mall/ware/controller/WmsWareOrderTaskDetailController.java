package pers.wossge.mall.ware.controller;

import java.util.Arrays;
import java.util.Map;

////import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pers.wossge.mall.common.entity.wms.WmsWareOrderTaskDetailEntity;
import pers.wossge.mall.ware.service.WmsWareOrderTaskDetailService;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.utils.R;



/**
 * 库存工作单
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:38
 */
@RestController
@RequestMapping("ware/wmswareordertaskdetail")
public class WmsWareOrderTaskDetailController {
    @Autowired
    private WmsWareOrderTaskDetailService wmsWareOrderTaskDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    ////@RequiresPermissions("ware:wmswareordertaskdetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareOrderTaskDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    ////@RequiresPermissions("ware:wmswareordertaskdetail:info")
    public R info(@PathVariable("id") Long id){
		WmsWareOrderTaskDetailEntity wmsWareOrderTaskDetail = wmsWareOrderTaskDetailService.getById(id);

        return R.ok().put("wmsWareOrderTaskDetail", wmsWareOrderTaskDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    ////@RequiresPermissions("ware:wmswareordertaskdetail:save")
    public R save(@RequestBody WmsWareOrderTaskDetailEntity wmsWareOrderTaskDetail){
		wmsWareOrderTaskDetailService.save(wmsWareOrderTaskDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions("ware:wmswareordertaskdetail:update")
    public R update(@RequestBody WmsWareOrderTaskDetailEntity wmsWareOrderTaskDetail){
		wmsWareOrderTaskDetailService.updateById(wmsWareOrderTaskDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions("ware:wmswareordertaskdetail:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareOrderTaskDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
