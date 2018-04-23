package com.hassam.advanced.proxy;

import com.hassam.advanced.core.ParkourKeyBindings;
import com.hassam.advanced.proxy.CommonProxy;

public class ClientProxy
extends CommonProxy {
    @Override
    public void registerKeyBindings() {
        super.registerKeyBindings();
        ParkourKeyBindings.init();
    }

    public static void registerChannel() {
    }
}

