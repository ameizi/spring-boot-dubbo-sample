package net.aimeizi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import net.aimeizi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName(String username) {
        return username;
    }

}
