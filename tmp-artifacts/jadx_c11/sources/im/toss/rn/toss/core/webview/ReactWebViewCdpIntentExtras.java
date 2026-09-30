package im.toss.rn.toss.core.webview;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactWebViewCdpIntentExtras {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final ReactWebViewCdpIntentExtras onExtraCallbackWithResult = new ReactWebViewCdpIntentExtras();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 111;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 64 / 0;
        }
    }

    private ReactWebViewCdpIntentExtras() {
    }

    public final void IAuthTabCallback(@NotNull Intent intent, boolean z, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(intent);
                return;
            } else {
                onWarmupCompleted(intent);
                throw null;
            }
        }
        intent.putExtra("reactNative.webView.cdp.enabled", true);
        if (str.length() > 32768) {
            int i3 = onWarmupCompleted + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            str = "{}";
        }
        intent.putExtra("reactNative.webView.cdp.requestHeadersJson", str);
        int i5 = onNavigationEvent + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(intent, "");
        } else {
            Intrinsics.checkNotNullParameter(intent, "");
        }
        intent.putExtra("reactNative.webView.cdp.enabled", false);
        intent.removeExtra("reactNative.webView.cdp.requestHeadersJson");
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
