package net.aimeizi.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import net.aimeizi.service.EchoService;
import net.aimeizi.service.UserService;

@Service
public class EchoServiceImpl implements EchoService {

    @Reference(check = false)
    private UserService userService;

    public String echo(String username) {
        username = userService.getName(username);
        System.out.println("EchoServiceImpl->"+username);
        return username;
    }
}
