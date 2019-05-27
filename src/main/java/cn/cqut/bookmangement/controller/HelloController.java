package cn.cqut.bookmangement.controller;

import cn.cqut.bookmangement.entity.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class HelloController {
    //for brow
//    @RequestMapping("/world")
    public ModelAndView hello(ModelAndView modelAndView) {
        modelAndView.setViewName("/helloworld");
        modelAndView.addObject("cont", "你好！世界");
        return modelAndView;
    }

    @RequestMapping("/su")
    @ResponseBody
    public String su(@RequestBody Hello hello) {
        System.out.println(hello);
        return "ok";
    }

    @RequestMapping("/session")
    @ResponseBody
    public String session(HttpServletRequest request) {
        request.getSession().setAttribute("session", "你找到我了");
        return "ok";
    }

    //for wx
    @RequestMapping("/err/{open}")
    @ResponseBody
    public String error(@PathVariable("open") Boolean open) {
        if (open)
            throw new IllegalArgumentException("自己创造的错误");
        return "ok";
    }

    @RequestMapping("/valid")
    @ResponseBody
    public String valid(@Valid @RequestBody Hello hello) {
        return "ok";
    }
}
