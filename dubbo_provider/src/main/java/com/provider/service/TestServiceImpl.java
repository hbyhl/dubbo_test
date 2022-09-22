package com.provider.service;
import com.api.Result;
import com.api.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ClassName TestServiceImpl
 * Description
 * @Author admin
 * @Date 2022/9/22 12:31 PM
 **/
@Service
public class TestServiceImpl implements TestService {
    @Override
    public Result hello(String name) {
        return  Result.fail("1","suc",name);
    }
}
