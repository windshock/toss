package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class NativeScreensModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSModule";

    public NativeScreensModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Nonnull
    public String getName() {
        return "RNSModule";
    }
}
