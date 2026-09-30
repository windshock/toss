package o;

import dagger.Lazy;
import im.toss.di.TossApiServiceModule;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setVisitUrl implements captureStartValues<OkHttpClient> {
    private static int IAuthTabCallbackStub = 1;
    public static int onExtraCallbackWithResult;
    public static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final createAnimators<CertificatePinner> IAuthTabCallback;
    private final createAnimators<ea> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback();
            throw null;
        }
        OkHttpClient okHttpClientOnExtraCallback = onExtraCallback();
        int i3 = onWarmupCompleted + 27;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return okHttpClientOnExtraCallback;
        }
        throw null;
    }

    public OkHttpClient onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult((ea) this.onExtraCallback.get(), clearValues.onExtraCallback(this.IAuthTabCallback));
            throw null;
        }
        OkHttpClient okHttpClientOnExtraCallbackWithResult = onExtraCallbackWithResult((ea) this.onExtraCallback.get(), clearValues.onExtraCallback(this.IAuthTabCallback));
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return okHttpClientOnExtraCallbackWithResult;
    }

    public static OkHttpClient onExtraCallbackWithResult(ea eaVar, Lazy<CertificatePinner> lazy) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClient = (OkHttpClient) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onWarmupCompleted(eaVar, lazy));
        int i4 = onWarmupCompleted + 39;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return okHttpClient;
        }
        throw null;
    }

    public static int onExtraCallbackWithResult() {
        int i = onNavigationEvent;
        int i2 = i % 5033780;
        onNavigationEvent = i + 1;
        if (i2 != 0) {
            return onExtraCallbackWithResult;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        onExtraCallbackWithResult = iMaxMemory;
        return iMaxMemory;
    }
}
