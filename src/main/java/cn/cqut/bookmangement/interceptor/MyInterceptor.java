package cn.cqut.bookmangement.interceptor;

import cn.cqut.bookmangement.entity.BookAdmin;
import cn.cqut.bookmangement.entity.SysAdmin;
import cn.cqut.bookmangement.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Pattern;

//@Configuration
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean acc = false;
        String url = request.getRequestURI();
        Object user = request.getSession().getAttribute("user");

        String patternForSysAdmin = "/sysAdmin/.*";
        String patternForBookAdmin = "/bookAdmin/.*";
        String patterForUser = "/user/.*";

        if (user == null)
            acc = false;
        else if (user instanceof User) {
            acc = Pattern.matches(patterForUser, url);
        } else if (user instanceof SysAdmin) {
            acc = Pattern.matches(patternForSysAdmin, url);
        } else if (user instanceof BookAdmin)
            acc = Pattern.matches(patternForBookAdmin, url);
        System.out.println(String.format("###拦截器  请求的地址: %s , user值:%s , 拦截？: %s", request.getRequestURI(), request.getSession().getAttribute("user"), acc));
        if (!acc)
            response.sendRedirect("/");
        return acc;
    }
}