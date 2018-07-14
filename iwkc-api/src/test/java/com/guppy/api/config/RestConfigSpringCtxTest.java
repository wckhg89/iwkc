package com.guppy.api.config;

import com.guppy.api.config.rest.RestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by guppy.kang on 2018. 7. 14.
 * email : guppy.kang@kakaocorp.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestConfigSpringCtxTest {

    @Autowired
    private RestConfig restConfig;


    @Test
    public void propertiesValueTest () {
        assertEquals(restConfig.getProperties().getConnectionTimeOut(), 1000);
    }

}
