/*
 * Copyright (C) 2017-2018 Lightbend Inc. <http://www.lightbend.com>
 */

package akka.management.http;

import akka.actor.ActorSystem;
import akka.management.cluster.ClusterHttpManagementRouteProvider;
import org.junit.Test;

public class ClusterHttpManagementJavaCompileTest {

    public void test() {
        ActorSystem actorSystem = ActorSystem.create("test");
        ClusterHttpManagementRouteProvider x = ClusterHttpManagementRouteProvider.get(actorSystem);
    }

    @Test
    public void compileOnly() {}
}
