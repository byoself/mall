package pers.wossge.mall.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.wossge.mall.common.utils.R;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${configType}")
    private String configType;

    @RequestMapping("/getConfigType")
    public R getConfigType(){
        return R.ok().put("configType",configType);
    }

}
