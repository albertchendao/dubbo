package org.apache.dubbo.demo.provider.extension;

import org.apache.dubbo.common.URL;

public class WorldEchoImpl implements Echo {

    @Override
    public String echo(URL url, String name) {
        return name + " world";
    }
}
