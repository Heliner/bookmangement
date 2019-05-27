package cn.cqut.bookmangement;

import cn.cqut.bookmangement.DTO.SearchContent;
import cn.cqut.bookmangement.entity.BookAdminExample;
import cn.cqut.bookmangement.mapper.BookAdminMapper;
import cn.cqut.bookmangement.service.BookAdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookmangementApplicationTests {
    @Autowired
    BookAdminMapper bookAdminMapper;
    @Autowired
    BookAdminService bookAdminService;

    @Test
    public void contextLoads() {
//        JSON.parseArray(,);
        BookAdminExample bookAdminExample = new BookAdminExample();
        BookAdminExample.Criteria criteria = bookAdminExample.createCriteria();
        criteria.andAdpasswordEqualTo("123");
        System.out.println(bookAdminMapper.selectByExample(bookAdminExample));
    }

    @Test
    public void count() {
        BookAdminExample bookAdminExample = new BookAdminExample();
        bookAdminExample.clear();
        Assert.assertEquals(3, bookAdminMapper.countByExample(bookAdminExample));
    }

    @Test
    public void pageResult() {
        SearchContent searchContent = new SearchContent();
        searchContent.setContent("");
        searchContent.setCurrentPage(1);
        bookAdminService.selectPage(searchContent);
    }

    @Test
    public void patter() {
        String pattern = "/sysAdmin/.*";
        Assert.assertEquals(false,Pattern.matches(pattern,"/sysAdmi"));
        Assert.assertEquals(true,Pattern.matches(pattern,"/sysAdmin/"));
        Assert.assertEquals(true,Pattern.matches(pattern,"/sysAdmin/gfj/das"));
        Assert.assertEquals(true,Pattern.matches(pattern,"/sysAdmin/gfj"));
    }

}
