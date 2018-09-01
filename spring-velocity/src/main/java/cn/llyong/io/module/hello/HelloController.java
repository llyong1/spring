package cn.llyong.io.module.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Base64;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/26
 * @time: 13:08
 * @version: 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("hello","hello velocity");
        return "hello/hello";
    }

    public static void main(String[] args) {
        byte[] decode = Base64.getDecoder().decode("4AvVhmFLUs0KTA3Kprsdag==");
        System.out.println(new String(decode));
    }
}
