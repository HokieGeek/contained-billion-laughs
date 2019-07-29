package org.sonatype.se.hacks.lolz;

import ro.pippo.core.Pippo;

public class Main {
    public static void main(String[] args) {
        Pippo pippo = new Pippo(new App());

        // add routes for static content
        pippo.addPublicResourceRoute();
        pippo.addWebjarsResourceRoute();

        pippo.start();
    }
}
