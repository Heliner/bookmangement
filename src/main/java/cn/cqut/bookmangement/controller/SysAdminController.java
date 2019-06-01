package cn.cqut.bookmangement.controller;

import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.DTO.SysAdminCenterDTO;
import cn.cqut.bookmangement.entity.BookAdmin;
import cn.cqut.bookmangement.entity.User;
import cn.cqut.bookmangement.service.BookAdminService;
import cn.cqut.bookmangement.service.SysAdminService;
import cn.cqut.bookmangement.service.UserService;
import cn.cqut.bookmangement.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static cn.cqut.bookmangement.util.ResultGenerator.GENERATE_SUCCESS_MESSAGE;
import static cn.cqut.bookmangement.util.ResultGenerator.GENERATE_SUCCESS_RESULT;

@RequestMapping("/sysAdmin")
@RestController
public class SysAdminController {
    @Autowired
    UserService userService;
    @Autowired
    BookAdminService bookAdminService;
    @Autowired
    SysAdminService sysAdminService;

    @RequestMapping("/insertUser")
    public AjaxResult A01(@RequestBody User user) {
        userService.insertSelective(user);
        return GENERATE_SUCCESS_MESSAGE("成功");
    }

    @RequestMapping("/oneUser")
    public AjaxResult A02(@RequestBody User user) {
        user =userService.getOneByPk(user);
        return GENERATE_SUCCESS_RESULT(user);
    }

    @RequestMapping("/updateUser")
    public AjaxResult A03(@RequestBody User user) {
        userService.update(user);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/deleteUser")
    public AjaxResult A10(@RequestBody User user) {
        userService.delete(user);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/insertBookAdmin")
    public AjaxResult A04(@RequestBody BookAdmin bookAdmin) {
        bookAdminService.insert(bookAdmin);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/deleteBookAdmin")
    public AjaxResult A05(@RequestBody BookAdmin bookAdmin) {
        bookAdminService.delete(bookAdmin);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/updateSysAdmin")
    public AjaxResult A07(@RequestBody SysAdminCenterDTO sysAdminCenterDTO, HttpServletRequest request) {
        sysAdminService.update(sysAdminCenterDTO, request);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/oneBookAdmin")
    public AjaxResult A08(@RequestBody BookAdmin bookAdmin) {
        return GENERATE_SUCCESS_RESULT(bookAdminService.getOne(bookAdmin));
    }

    @RequestMapping("/searchBookAdmin")
    public AjaxResult A09(@RequestBody SearchContent searchContent) {
        System.out.println("searchContent:" + searchContent);

        AjaxResult result = GENERATE_SUCCESS_RESULT(bookAdminService.selectPage(searchContent));
        System.out.println(result);
        return result;
    }

    @RequestMapping("/searchUsers")
    public AjaxResult A11(@RequestBody SearchContent searchContent) {
        return GENERATE_SUCCESS_RESULT(userService.selectPage(searchContent));
    }

    @RequestMapping("/getSysAdmin")
    public AjaxResult A12(HttpServletRequest request) {
        return GENERATE_SUCCESS_RESULT(userService.getSysAdmin(request));
    }
    @RequestMapping("/updateBookAdmin")
    public AjaxResult A13(@RequestBody BookAdmin bookAdmin) {
        bookAdminService.update(bookAdmin);
        return GENERATE_SUCCESS_RESULT();
    }
}
