package im.toss.di;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1;
import o.StaticImageDecoderKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FileCacheModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final FileCacheModule onNavigationEvent = new FileCacheModule();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private FileCacheModule() {
    }

    @Singleton
    public final RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 onExtraCallbackWithResult(@NotNull Context context, @NotNull StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(staticImageDecoderKtExternalSyntheticLambda0, "");
        RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1 = new RealImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1(context, staticImageDecoderKtExternalSyntheticLambda0, "");
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return realImageLoaderKtaddServiceLoaderComponentslambda6inlinedsortedByDescending1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
