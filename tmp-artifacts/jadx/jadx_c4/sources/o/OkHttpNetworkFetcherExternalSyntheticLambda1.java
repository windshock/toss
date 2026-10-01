package o;

import android.content.Context;
import im.toss.components.tuba.prefs.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class OkHttpNetworkFetcherExternalSyntheticLambda1 implements captureStartValues<UtilsKtExternalSyntheticLambda4> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<StaticImageDecoderKtExternalSyntheticLambda0> IAuthTabCallback;
    private final createAnimators<Context> onExtraCallback;
    private final createAnimators<ResourceMetadata> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4IAuthTabCallback = IAuthTabCallback();
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return utilsKtExternalSyntheticLambda4IAuthTabCallback;
        }
        throw null;
    }

    public UtilsKtExternalSyntheticLambda4 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallback.get();
        if (i3 != 0) {
            return IAuthTabCallback((Context) obj, (ResourceMetadata) this.onNavigationEvent.get(), (StaticImageDecoderKtExternalSyntheticLambda0) this.IAuthTabCallback.get());
        }
        int i4 = 7 / 0;
        return IAuthTabCallback((Context) obj, (ResourceMetadata) this.onNavigationEvent.get(), (StaticImageDecoderKtExternalSyntheticLambda0) this.IAuthTabCallback.get());
    }

    public static UtilsKtExternalSyntheticLambda4 IAuthTabCallback(Context context, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4 = (UtilsKtExternalSyntheticLambda4) createAnimator.onNavigationEvent(PrefsModule.onNavigationEvent.IAuthTabCallback(context, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0));
        if (i3 != 0) {
            return utilsKtExternalSyntheticLambda4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
