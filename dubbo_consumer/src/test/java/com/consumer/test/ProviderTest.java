package com.consumer.test;

import com.api.Result;
import com.api.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName ProviderTest
 * Description
 * @Author admin
 * @Date 2022/9/22 2:00 PM
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderTest {

    @DubboReference(protocol = "rest")
    private TestService testService;

    @Test
    public void helloTest() {
        String name = "张三";
        Result r = testService.hello(name);
        System.out.println(r);
    }
}
