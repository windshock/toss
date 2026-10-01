package o;

import com.google.android.gms.internal.ads.zzaq;
import im.toss.di.PrefsModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class createRender implements captureStartValues<TextRoundCornerProgressBarSavedState1> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<ResourceUriFetcherFactory> IAuthTabCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
        }
        throw null;
    }

    public TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) this.IAuthTabCallback.get();
        if (i3 == 0) {
            return IAuthTabCallback(resourceUriFetcherFactory);
        }
        IAuthTabCallback(resourceUriFetcherFactory);
        throw null;
    }

    public static TextRoundCornerProgressBarSavedState1 IAuthTabCallback(ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {PrefsModule.onWarmupCompleted, resourceUriFetcherFactory};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {PrefsModule.onWarmupCompleted, resourceUriFetcherFactory};
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) createAnimator.onNavigationEvent((TextRoundCornerProgressBarSavedState1) PrefsModule.onWarmupCompleted(zzaq.onNavigationEvent(), -9939198, objArr2, zzaq.onNavigationEvent(), 9939201, zzaq.onNavigationEvent(), zzaq.onNavigationEvent()));
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
