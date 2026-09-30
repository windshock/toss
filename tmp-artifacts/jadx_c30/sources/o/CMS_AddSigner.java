package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CMS_AddSigner implements SearchBarKtExternalSyntheticLambda5 {
    private final LinearLayout onExtraCallback;
    public final WebView onNavigationEvent;

    private CMS_AddSigner(@NonNull LinearLayout linearLayout, @NonNull WebView webView) {
        this.onExtraCallback = linearLayout;
        this.onNavigationEvent = webView;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.onExtraCallback;
    }

    public static CMS_AddSigner onExtraCallbackWithResult(@NonNull LayoutInflater layoutInflater) {
        return onWarmupCompleted(layoutInflater, null, false);
    }

    public static CMS_AddSigner onWarmupCompleted(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_suspendingclear_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return IAuthTabCallback(viewInflate);
    }

    public static CMS_AddSigner IAuthTabCallback(@NonNull View view) {
        int i = R.id.webView;
        WebView webView = (WebView) SearchBarKtExternalSyntheticLambda4.onNavigationEvent(view, i);
        if (webView != null) {
            return new CMS_AddSigner((LinearLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
