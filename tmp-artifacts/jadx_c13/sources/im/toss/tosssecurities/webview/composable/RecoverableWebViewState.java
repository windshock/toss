package im.toss.tosssecurities.webview.composable;

import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import kotlin.jvm.internal.Intrinsics;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.getTimebase;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RecoverableWebViewState {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final getTimebase onExtraCallback;
    private final TossSecuritiesWebView onNavigationEvent;

    public RecoverableWebViewState(@NotNull TossSecuritiesWebView tossSecuritiesWebView, @NotNull getTimebase gettimebase) {
        Intrinsics.checkNotNullParameter(tossSecuritiesWebView, "");
        Intrinsics.checkNotNullParameter(gettimebase, "");
        this.onNavigationEvent = tossSecuritiesWebView;
        this.onExtraCallback = gettimebase;
    }

    public final TossSecuritiesWebView onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        TossSecuritiesWebView tossSecuritiesWebView = this.onNavigationEvent;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return tossSecuritiesWebView;
    }

    public final CameraPresenceProviderExternalSyntheticLambda6<Integer> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback() {
        getTimebase gettimebase;
        int iOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            gettimebase = this.onExtraCallback;
            iOnWarmupCompleted = gettimebase.onWarmupCompleted() % 1;
        } else {
            gettimebase = this.onExtraCallback;
            iOnWarmupCompleted = gettimebase.onWarmupCompleted() + 1;
        }
        gettimebase.onExtraCallback(iOnWarmupCompleted);
        int i3 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
