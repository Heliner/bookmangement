package cn.cqut.bookmangement.config;

import cn.cqut.bookmangement.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
//        registry.addResourceHandler("/world").addResourceLocations("/helloworld.html");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/world").setViewName("/helloworld");

        //系统管理员
        registry.addViewController("/sysAdmin/").setViewName("/SysAdmin/adminPersonal");
        registry.addViewController("/sysAdmin/adminAddReader.html").setViewName("/SysAdmin/adminAddReader");
        registry.addViewController("/sysAdmin/adminOutReader.html").setViewName("/SysAdmin/adminOutReader");
        registry.addViewController("/sysAdmin/adminAlterReader.html").setViewName("/SysAdmin/adminAlterReader");
        registry.addViewController("/sysAdmin/adminAddAd.html").setViewName("/SysAdmin/adminAddAd");
        registry.addViewController("/sysAdmin/adminOutAd.html").setViewName("/SysAdmin/adminOutAd");
        registry.addViewController("/sysAdmin/adminAlterAd.html").setViewName("/SysAdmin/adminAlterAd");
        registry.addViewController("/sysAdmin/adminSearchReader.html").setViewName("/SysAdmin/adminSearchReader");
        registry.addViewController("/sysAdmin/adminSearchAd.html").setViewName("/SysAdmin/adminSearchAd");
        registry.addViewController("/sysAdmin/adminPersonal.html").setViewName("/SysAdmin/adminPersonal");


//        图书管理员

        registry.addViewController("/bookAdmin/").setViewName("/BookAdmin/adPersonal");
        registry.addViewController("/bookAdmin/adBorrowBook.html").setViewName("/BookAdmin/adBorrowBook");
        registry.addViewController("/bookAdmin/adReturnBook.html").setViewName("/BookAdmin/adReturnBook");
        registry.addViewController("/bookAdmin/adAddBook.html").setViewName("/BookAdmin/adAddBook");
        registry.addViewController("/bookAdmin/adOutBook.html").setViewName("/BookAdmin/adOutBook");
        registry.addViewController("/bookAdmin/adAlterBook.html").setViewName("/BookAdmin/adAlterBook");
        registry.addViewController("/bookAdmin/adCheckBook.html").setViewName("/BookAdmin/adCheckBook");
        registry.addViewController("/bookAdmin/adSearchBook.html").setViewName("/BookAdmin/adSearchBook");
        registry.addViewController("/bookAdmin/adPersonal.html").setViewName("/BookAdmin/adPersonal");
//用户
        registry.addViewController("/user/").setViewName("/User/readerPersonal");
        registry.addViewController("/user/readerAlterData.html").setViewName("/User/readerAlterData");
        registry.addViewController("/user/readerAlterPaswd.html").setViewName("/User/readerAlterPaswd");
        registry.addViewController("/user/readerBorrowed.html").setViewName("/User/readerBorrowed");
        registry.addViewController("/user/readerBorrowing.html").setViewName("/User/readerBorrowing");
        registry.addViewController("/user/readerPersonal.html").setViewName("/User/readerPersonal");

        //公共
        registry.addViewController("/login.html").setViewName("/login");
        registry.addViewController("/searchResult.html").setViewName("/searchResult");
        registry.addViewController("/index.html").setViewName("/index");

        //添加默认
        registry.addViewController("/").setViewName("/login");

        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    public void addInterceptors(InterceptorRegistry registry) {

        //这里参数是一个实现了HandlerInterceptor接口的拦截器
        registry.addInterceptor(reThis())
                .addPathPatterns("/sysAdmin/**")//需要拦截的请求
                .addPathPatterns("/bookAdmin/**")
                .addPathPatterns("/user/**")
                .excludePathPatterns("/*");

    }

    //    @Bean
    public MyInterceptor reThis() {
        return new MyInterceptor();
    }
}