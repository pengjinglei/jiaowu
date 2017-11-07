package jiaowuproject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: pengjinglei
 * @Date: 17-10-18 星期三 上午11:10
 */
@RequestMapping(value = "/hello")
public class HelloCtrl {

    @GetMapping(value = "helloget")
    public String Hello(){
        return "sa";
    }
}
