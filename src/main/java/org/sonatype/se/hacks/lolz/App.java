package org.sonatype.se.hacks.lolz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.pippo.core.Application;
import ro.pippo.core.HttpConstants;
import ro.pippo.core.route.RouteContext;

public class App extends Application {
    private final static Logger log = LoggerFactory.getLogger(App.class);

    @Override
    protected void onInit() {
        GET("/", routeContext -> routeContext.send("TODO: LOLZ"));
    }
}
