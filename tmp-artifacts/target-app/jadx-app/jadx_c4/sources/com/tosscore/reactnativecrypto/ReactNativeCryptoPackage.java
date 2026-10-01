package com.tosscore.reactnativecrypto;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.soloader.SoLoader;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ReactNativeCryptoPackage extends BaseReactPackage {
    public NativeModule getModule(@NotNull String str, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return null;
    }

    public ReactNativeCryptoPackage() {
        SoLoader.IAuthTabCallback("tcj");
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.tosscore.reactnativecrypto.ReactNativeCryptoPackage$$ExternalSyntheticLambda0
            public final Map getReactModuleInfos() {
                return ReactNativeCryptoPackage.onWarmupCompleted();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map onWarmupCompleted() {
        return new HashMap();
    }
}
