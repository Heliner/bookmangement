package cn.cqut.bookmangement;

import cn.cqut.bookmangement.entity.BookInfoExample;
import cn.cqut.bookmangement.mapper.BookInfoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookmangementApplicationTests {
    @Autowired
    BookInfoMapper bookInfoMapper;

    @Test
    public void contextLoads() {
        ADTO adto = new ADTO();
        adto.setA("this is String from adto");
        B b = new B();
        b.setB("this is String from B");
        A a = new A();
        BeanUtils.copyProperties(adto, a);
        BeanUtils.copyProperties(b, a, "a");
        Assert.assertEquals(a.getA(), "this is String from adto");
        Assert.assertEquals(a.getB(), "this is String from B");
    }


    @Test
    public void stringUtil() {
        BookInfoExample bookInfoExample = new BookInfoExample();
        bookInfoExample.clear();
        BookInfoExample.Criteria criteria = bookInfoExample.createCriteria();
        criteria.andBookNameEqualTo("哈利波特");
        bookInfoMapper.selectByExample(bookInfoExample);
    }

}
