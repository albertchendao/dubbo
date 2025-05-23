package org.apache.dubbo.demo.provider.extension;

import com.google.common.collect.ImmutableMap;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

public class ExtensionTest {

    @Test
    public void loadExtension() {
        ExtensionLoader<Echo> extensionLoader = ExtensionLoader.getExtensionLoader(Echo.class);
        System.out.println(extensionLoader.getSupportedExtensions());
        Echo worldEcho = extensionLoader.getExtension("world");
        System.out.println(worldEcho.echo(null, "worldEcho hh"));

        Echo defaultExtension = extensionLoader.getDefaultExtension();
        System.out.println(defaultExtension.echo(null, "defaultExtension hh"));

        Echo adaptiveExtension = extensionLoader.getAdaptiveExtension();
        System.out.println(adaptiveExtension.echo(new URL("dubbo", "localhost", 11111), "adaptiveExtension hh"));
        System.out.println(adaptiveExtension.echo(new URL("dubbo", "localhost", 11111, ImmutableMap.of("echo", "hello")), "adaptiveExtension hh"));
        System.out.println(adaptiveExtension.echo(new URL("dubbo", "localhost", 11111, ImmutableMap.of("echo", "world")), "adaptiveExtension hh"));
    }
}
