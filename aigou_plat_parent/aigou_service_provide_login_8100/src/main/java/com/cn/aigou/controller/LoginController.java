package com.cn.aigou.controller;

import com.cn.aigou.domain.User;
import com.cn.aigou.util.AjaxResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        /*判断登陆*/
        if(user!=null && !StringUtils.isEmpty(user.getUsername()) && !StringUtils.isEmpty(user.getPassword()) ){
            /*判断登陆成功*/
            if("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())){

                return AjaxResult.me().setMsg("登陆成功").setObject(user);
            }else {
                return AjaxResult.me().setSuccess(false).setMsg("登陆失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登陆失败");
    }
}
