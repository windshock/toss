package o;

import kotlin.jvm.internal.Intrinsics;
import o.RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderKtaddServiceLoaderComponentslambda3inlinedsortedByDescending1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final String IAuthTabCallback(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            onExtraCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, str, str2).IAuthTabCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strIAuthTabCallback = onExtraCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, str, str2).IAuthTabCallback();
        int i3 = onNavigationEvent + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return strIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final boolean onNavigationEvent(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull RealImageLoader_androidKt realImageLoader_androidKt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(realImageLoader_androidKt, "");
            return onExtraCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, str, str2, realImageLoader_androidKt).onExtraCallbackWithResult(str3);
        }
        Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(realImageLoader_androidKt, "");
        onExtraCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, str, str2, realImageLoader_androidKt).onExtraCallbackWithResult(str3);
        throw null;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnWarmupCompleted = onExtraCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1).onWarmupCompleted(new newImageLoader(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted(), str), new RealImageLoader_nonNativeKt(str2));
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return zOnWarmupCompleted;
    }

    public static final boolean onNavigationEvent(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zOnExtraCallback = onExtraCallback(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1).onExtraCallback(new newImageLoader(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted(), str), new RealImageLoader_nonNativeKt(str2));
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent onExtraCallback(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent onnavigationevent = new RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onNavigationEvent(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, new newImageLoader(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted(), str), new RealImageLoader_nonNativeKt(str2));
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return onnavigationevent;
    }

    public static final RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted onExtraCallback(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, @NotNull String str, @NotNull String str2, @NotNull RealImageLoader_androidKt realImageLoader_androidKt) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(realImageLoader_androidKt, "");
        RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted onwarmupcompleted = new RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, new newImageLoader(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted(), str), new RealImageLoader_nonNativeKt(str2), realImageLoader_androidKt);
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    public static final RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onExtraCallbackWithResult onExtraCallback(@NotNull RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1, "");
        RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onExtraCallbackWithResult onextracallbackwithresult = new RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onExtraCallbackWithResult(realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1.onWarmupCompleted());
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }
}
