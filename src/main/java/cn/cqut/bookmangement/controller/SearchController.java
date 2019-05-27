package cn.cqut.bookmangement.controller;

import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.entity.UserLoginDTO;
import cn.cqut.bookmangement.service.BookInfoService;
import cn.cqut.bookmangement.service.UserService;
import cn.cqut.bookmangement.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static cn.cqut.bookmangement.util.ResultGenerator.GENERATE_SUCCESS_RESULT;

@RestController
public class SearchController {
    @Autowired
    BookInfoService bookInfoService;
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/searchResult"})
    public AjaxResult A01(@RequestBody SearchContent searchContent) {
        return GENERATE_SUCCESS_RESULT(bookInfoService.selectBookPGByBookName(searchContent));
    }

    @RequestMapping("/login")
    public AjaxResult A02(@RequestBody UserLoginDTO userLoginDTO, HttpServletRequest request) {
        userService.login(userLoginDTO, request);
        return GENERATE_SUCCESS_RESULT();
    }

    @RequestMapping("/loginOut")
    public AjaxResult A03(HttpServletRequest request) {
        userService.loginOut(request);
        return GENERATE_SUCCESS_RESULT();
    }
}
