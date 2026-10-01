package o;

import dagger.Lazy;
import im.toss.di.WebSocketModule;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EmbedType implements captureStartValues<OkHttpClient> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<zzad> IAuthTabCallback;
    private final createAnimators<ea> onExtraCallback;
    private final createAnimators<CertificatePinner> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public OkHttpClient onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClientOnNavigationEvent = onNavigationEvent((ea) this.onExtraCallback.get(), clearValues.onExtraCallback(this.onWarmupCompleted), (zzad) this.IAuthTabCallback.get());
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return okHttpClientOnNavigationEvent;
        }
        throw null;
    }

    public static OkHttpClient onNavigationEvent(ea eaVar, Lazy<CertificatePinner> lazy, zzad zzadVar) {
        OkHttpClient okHttpClient;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            okHttpClient = (OkHttpClient) createAnimator.onNavigationEvent(WebSocketModule.onWarmupCompleted.onExtraCallbackWithResult(eaVar, lazy, zzadVar));
            int i3 = 16 / 0;
        } else {
            okHttpClient = (OkHttpClient) createAnimator.onNavigationEvent(WebSocketModule.onWarmupCompleted.onExtraCallbackWithResult(eaVar, lazy, zzadVar));
        }
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return okHttpClient;
    }
}
