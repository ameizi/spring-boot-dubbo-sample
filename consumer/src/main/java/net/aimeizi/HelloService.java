package net.aimeizi;

import com.alibaba.dubbo.config.annotation.Reference;
import net.aimeizi.service.EchoService;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Reference
    EchoService echoService;

}
