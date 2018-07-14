package com.guppy.api.config;

import com.guppy.api.config.rest.RestConfig;
import com.guppy.api.config.rest.RestConfigProperties;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by guppy.kang on 2018. 7. 14.
 * email : guppy.kang@kakaocorp.com
 */

@RunWith(SpringRunner.class)
public class RestConfigTest {


    private RestConfig restConfig;

    @Before
    public void setRestConfig () {
        restConfig = new RestConfig(new RestConfigProperties());
    }

    @Test
    public void defaultPropertiesValues () {
        assertEquals(2000, restConfig.getProperties().getReadTimeOut());
        assertEquals(2000, restConfig.getProperties().getConnectionTimeOut());
        assertEquals(2, restConfig.getProperties().getMaxConnectionPerRoute());
        assertEquals(20, restConfig.getProperties().getMaxConnectionPool());
    }



}
