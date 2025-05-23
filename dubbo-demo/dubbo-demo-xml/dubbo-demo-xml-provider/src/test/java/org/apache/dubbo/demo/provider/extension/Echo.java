package org.apache.dubbo.demo.provider.extension;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("hello")
public interface Echo {

    @Adaptive
    String echo(URL url, String name);
}
