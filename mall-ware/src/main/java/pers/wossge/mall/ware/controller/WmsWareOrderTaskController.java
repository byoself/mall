package pers.wossge.mall.ware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.wossge.mall.common.utils.PageUtils;
import pers.wossge.mall.common.utils.R;
import pers.wossge.mall.common.entity.wms.WmsWareOrderTaskEntity;
import pers.wossge.mall.ware.service.WmsWareOrderTaskService;
import java.util.Arrays;
import java.util.Map;

////import org.apache.shiro.authz.annotation.RequiresPermissions;
;



/**
 * 库存工作单
 *
 * @author wossge
 * @email wossge@hotmail.com
 * @date 2020-07-21 00:53:38
 */
@RestController
@RequestMapping("ware/wmswareordertask")
public class WmsWareOrderTaskController {
    @Autowired
    private WmsWareOrderTaskService wmsWareOrderTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    ////@RequiresPermissions("ware:wmswareordertask:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareOrderTaskService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    ////@RequiresPermissions("ware:wmswareordertask:info")
    public R info(@PathVariable("id") Long id){
		WmsWareOrderTaskEntity wmsWareOrderTask = wmsWareOrderTaskService.getById(id);

        return R.ok().put("wmsWareOrderTask", wmsWareOrderTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    ////@RequiresPermissions("ware:wmswareordertask:save")
    public R save(@RequestBody WmsWareOrderTaskEntity wmsWareOrderTask){
		wmsWareOrderTaskService.save(wmsWareOrderTask);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions("ware:wmswareordertask:update")
    public R update(@RequestBody WmsWareOrderTaskEntity wmsWareOrderTask){
		wmsWareOrderTaskService.updateById(wmsWareOrderTask);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions("ware:wmswareordertask:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareOrderTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
