package cn.wolfcode.test;

import cn.wolfcode.ssm.domain.Facebook;
import cn.wolfcode.ssm.mapper.FacebookMapper;
import cn.wolfcode.ssm.service.FaceBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class App {
    @Autowired
    private FacebookMapper mapper;

    @Autowired
    private FaceBookService service;

    @Test
    public void testService() throws Exception{
        System.out.println(service.listAll());
    }


    @Test
    public void testMapper() throws Exception{
        Facebook f = new Facebook();
        f.setUsername("susan");
        f.setEmail("susan166@163.com");
        f.setAddress("Beijing");
        int i = mapper.insert(f);
        System.out.println(i);
    }

}
