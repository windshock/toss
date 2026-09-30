package o;

import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onInitialized implements captureStartValues<ResourceUriFetcherFactory> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<GifDecoderExternalSyntheticLambda0> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactoryIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return resourceUriFetcherFactoryIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ResourceUriFetcherFactory IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactoryOnWarmupCompleted = onWarmupCompleted((GifDecoderExternalSyntheticLambda0) this.onWarmupCompleted.get());
        int i4 = onNavigationEvent + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return resourceUriFetcherFactoryOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ResourceUriFetcherFactory onWarmupCompleted(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) createAnimator.onNavigationEvent(PrefsModule.onWarmupCompleted.onWarmupCompleted(gifDecoderExternalSyntheticLambda0));
        if (i3 != 0) {
            return resourceUriFetcherFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
