/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.remote.rpc.messages;

import akka.actor.ActorRef;

public class Monitor {
    private final ActorRef actorRef;

    public Monitor(ActorRef actorRef){

        this.actorRef = actorRef;
    }

    public ActorRef getActorRef() {
        return actorRef;
    }
}
