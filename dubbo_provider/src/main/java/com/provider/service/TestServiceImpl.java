package com.provider.service;
import com.api.Result;
import com.api.TestService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class TestServiceImpl implements TestService {
    @Override
    public Result hello(String name) {
        System.out.println(this.getClass());
        return  Result.fail("1","suc",name);
    }
}
