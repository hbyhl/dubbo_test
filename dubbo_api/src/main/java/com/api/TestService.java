package com.api;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;


/**
 * @ClassName TestService
 * Description
 * @Author admin
 * @Date 2022/9/22 11:32 AM
 **/
@Path("test")
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
public interface TestService {
    @GET
    @Path("hello")
    Result hello(@QueryParam("name") String name);
}
