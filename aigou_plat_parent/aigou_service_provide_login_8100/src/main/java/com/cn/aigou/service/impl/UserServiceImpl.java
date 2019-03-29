package com.cn.aigou.service.impl;

import com.cn.aigou.domain.User;
import com.cn.aigou.mapper.UserMapper;
import com.cn.aigou.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zp
 * @since 2019-03-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
