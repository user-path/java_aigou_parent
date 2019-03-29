package com.cn.aigou;

import com.cn.aigou.domain.User;
import com.cn.aigou.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoginClientApplication8100.class)
public class Tests {
    @Autowired
    private IUserService iUserService;

    @Test
    public void test(){
        System.out.println(iUserService.selectById(1L));
    }
}
