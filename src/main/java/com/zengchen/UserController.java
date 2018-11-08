package com.zengchen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: Zengchen
 * @create: 2018-11-08 14:28
 **/
@RestController
public class UserController {


    @RequestMapping
    public String findAll() {
        //我是前台，我修改了这里哟，啦啦啦
        return null;
    }
}
