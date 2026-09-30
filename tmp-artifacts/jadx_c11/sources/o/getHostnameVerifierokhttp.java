package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getHostnameVerifierokhttp {
    void dismissLoadingIndicator();

    void showLoadingIndicator(@Nullable String str);

    static /* synthetic */ void onNavigationEvent(getHostnameVerifierokhttp gethostnameverifierokhttp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadingIndicator");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        gethostnameverifierokhttp.showLoadingIndicator(str);
    }
}
