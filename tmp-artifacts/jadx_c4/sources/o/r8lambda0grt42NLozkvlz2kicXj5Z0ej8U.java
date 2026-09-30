package o;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambda0grt42NLozkvlz2kicXj5Z0ej8U {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final Object onExtraCallbackWithResult = new Object();
    private final Map<onExtraCallbackWithResult, onExtraCallback> onWarmupCompleted = new LinkedHashMap();

    static {
        int i = onNavigationEvent + 47;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final IAuthTabCallback onNavigationEvent(@Nullable WebView webView, boolean z, boolean z2, @Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(webView, z, System.currentTimeMillis(), z2, str);
        }
        onNavigationEvent(webView, z, System.currentTimeMillis(), z2, str);
        throw null;
    }

    public final IAuthTabCallback onNavigationEvent(@Nullable WebView webView, boolean z, long j, boolean z2, @Nullable String str) {
        synchronized (this.onExtraCallbackWithResult) {
            onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.onNavigationEvent.onExtraCallbackWithResult;
            onExtraCallback onextracallback = this.onWarmupCompleted.get(onextracallbackwithresult);
            if (onextracallback == null) {
                onextracallback = new onExtraCallback(0, 0L, 0L, (Integer) null, false, 31, (DefaultConstructorMarker) null);
            }
            if (onextracallback.onNavigationEvent() > 0 && j - onextracallback.onNavigationEvent() > 300000) {
                onextracallback = new onExtraCallback(0, 0L, 0L, (Integer) null, false, 31, (DefaultConstructorMarker) null);
                this.onWarmupCompleted.remove(onextracallbackwithresult);
            }
            if (!z) {
                onNavigationEvent(j);
                return new IAuthTabCallback(false, onextracallback.IAuthTabCallback(), true);
            }
            if (j - onextracallback.onExtraCallbackWithResult() < 100) {
                onNavigationEvent(j);
                return new IAuthTabCallback(true, onextracallback.IAuthTabCallback(), onextracallback.onExtraCallback());
            }
            Integer numOnWarmupCompleted = onWarmupCompleted.onWarmupCompleted(Companion, webView);
            if (numOnWarmupCompleted != null) {
                int iIntValue = numOnWarmupCompleted.intValue();
                Integer numOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                if (numOnWarmupCompleted2 != null && iIntValue == numOnWarmupCompleted2.intValue()) {
                    onNavigationEvent(j);
                    return new IAuthTabCallback(true, onextracallback.IAuthTabCallback(), onextracallback.onExtraCallback());
                }
            }
            int iIAuthTabCallback = onextracallback.IAuthTabCallback();
            boolean z3 = iIAuthTabCallback < 3;
            this.onWarmupCompleted.put(onextracallbackwithresult, onextracallback.onWarmupCompleted(onextracallback.IAuthTabCallback() + 1, onextracallback.IAuthTabCallback() == 0 ? j : onextracallback.onNavigationEvent(), j, numOnWarmupCompleted, z3));
            onNavigationEvent(j);
            return new IAuthTabCallback(true, iIAuthTabCallback, z3);
        }
    }

    private final void onNavigationEvent(long j) {
        int i = 2 % 2;
        if (!this.onWarmupCompleted.isEmpty()) {
            int i2 = IAuthTabCallback + 89;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                Iterator<Map.Entry<onExtraCallbackWithResult, onExtraCallback>> it = this.onWarmupCompleted.entrySet().iterator();
                while (it.hasNext()) {
                    onExtraCallback value = it.next().getValue();
                    if (value.onNavigationEvent() > 0) {
                        int i3 = asBinder + 25;
                        IAuthTabCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            if ((value.onNavigationEvent() & j) > 300000) {
                                it.remove();
                            }
                        } else if (j - value.onNavigationEvent() > 300000) {
                            it.remove();
                        }
                    }
                }
                return;
            }
            this.onWarmupCompleted.entrySet().iterator();
            throw null;
        }
    }

    public static final class onWarmupCompleted {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public static final /* synthetic */ Integer onWarmupCompleted(onWarmupCompleted onwarmupcompleted, WebView webView) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Integer numOnExtraCallback = onwarmupcompleted.onExtraCallback(webView);
            int i4 = onNavigationEvent + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return numOnExtraCallback;
        }

        private final Integer onExtraCallback(WebView webView) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (Build.VERSION.SDK_INT < 29) {
                return null;
            }
            int i4 = onNavigationEvent + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
                if (webView == null) {
                    return null;
                }
            } else if (webView == null) {
                return null;
            }
            WebViewRenderProcess webViewRenderProcess = webView.getWebViewRenderProcess();
            if (webViewRenderProcess == null) {
                return null;
            }
            int i6 = onNavigationEvent + 21;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return Integer.valueOf(System.identityHashCode(webViewRenderProcess));
        }
    }
}
