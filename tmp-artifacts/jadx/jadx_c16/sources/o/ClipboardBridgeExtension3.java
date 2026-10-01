package o;

import android.content.Context;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ClipboardBridgeExtension3 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final ClipboardBridgeExtension3 onExtraCallbackWithResult = new ClipboardBridgeExtension3();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 15;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    private ClipboardBridgeExtension3() {
    }

    public final void onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        onWarmupCompleted(context);
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(Context context) {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Class<?> cls = Class.forName("com.applovin.sdk.AppLovinSdk");
            Object objInvoke = cls.getMethod("getSettings", null).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), null);
            obj = Result.constructor-impl(objInvoke.getClass().getMethod("setCreativeDebuggerEnabled", Boolean.TYPE).invoke(objInvoke, Boolean.FALSE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("disableApplovinCreateDebugger", th2);
        }
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
