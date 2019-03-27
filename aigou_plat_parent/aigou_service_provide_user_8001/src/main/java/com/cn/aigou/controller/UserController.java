package com.cn.aigou.controller;

import com.cn.aigou.domain.User;
import com.cn.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 根据id拿user对象
     * @param id
     * @return user对象
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User findById(Long id){
        return new User(id,"admin");
    }
    /**
     * 拿到所有user对象
     * @param
     * @return List
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> findAll(){
        List list = new ArrayList();
        list.add(new User("admin"));
        list.add(new User("admin1"));
        list.add(new User("admin2"));
        list.add(new User("admin3"));
        return list;
    }

      /**
     *  修改
     * @param user
     * @return AjaxResult
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult update(@RequestBody User user){
        user.setId(2L);
        user.setUsername("xxooxoxo");
        return AjaxResult.me().setObject(user).setMsg("成功").setSuccess(true);
    }
    /**
     *  修改
     * @param id
     * @return AjaxResult
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public AjaxResult delete(Long id){
        return AjaxResult.me().setSuccess(true).setMsg("删除成功");
    }


}
