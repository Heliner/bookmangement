package cn.cqut.bookmangement.controller;

import cn.cqut.bookmangement.DTO.UserCenterDTO;
import cn.cqut.bookmangement.entity.User;
import cn.cqut.bookmangement.service.UserService;
import cn.cqut.bookmangement.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static cn.cqut.bookmangement.util.ResultGenerator.GENERATE_SUCCESS_MESSAGE;
import static cn.cqut.bookmangement.util.ResultGenerator.GENERATE_SUCCESS_RESULT;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public AjaxResult A01(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        user.setPassword(null);
        return GENERATE_SUCCESS_RESULT(user);
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public AjaxResult A02(@RequestBody User user, HttpServletRequest request) {
        userService.update(user, request);
        return GENERATE_SUCCESS_RESULT("更新成功");
    }

    @RequestMapping("/bookReced")
    @ResponseBody
    public AjaxResult A03(HttpServletRequest request) {
        return GENERATE_SUCCESS_RESULT(userService.getOnRecBook(request));
    }

    @RequestMapping("/bookUnReced")
    @ResponseBody
    public AjaxResult A04(HttpServletRequest request) {
        return GENERATE_SUCCESS_RESULT(userService.getOnUnRecBook(request));
    }

    @RequestMapping("/updateValidateUser")
    @ResponseBody
    public AjaxResult A05(@RequestBody UserCenterDTO userCenterDTO, HttpServletRequest request) {
        userService.update(userCenterDTO, request);
        return GENERATE_SUCCESS_RESULT();
    }

}
