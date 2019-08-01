package org.sonatype.se.hacks.lolz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.pippo.core.Application;
import ro.pippo.core.HttpConstants;
import ro.pippo.core.route.RouteContext;
import ro.pippo.jaxb.JaxbEngine;

public class App extends Application {
    private final static Logger log = LoggerFactory.getLogger(App.class);

    @Override
    protected void onInit() {
        GET("/", routeContext -> routeContext.send("Sample app that demonstates a billion laughs attack\n"));

        PUT("/config", routeContext -> {
            String xml = routeContext.getRequest().getBody();

            JaxbEngine jaxbEngine = new JaxbEngine();
            Object myObj = jaxbEngine.fromString(xml, Config.class);

            // System.out.println(routeContext.getRequest().getBody());
            routeContext.send("Received config");
        });
    }
}
