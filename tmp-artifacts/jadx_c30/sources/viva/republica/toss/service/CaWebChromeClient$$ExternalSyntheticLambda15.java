package viva.republica.toss.service;

import android.webkit.WebView;
import im.toss.activitydelegate.DelegateActivity;
import kotlin.jvm.functions.Function1;
import o.ReadableType;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CaWebChromeClient$$ExternalSyntheticLambda15 implements Function1 {
    public final /* synthetic */ WebView f$0;
    public final /* synthetic */ ReadableType f$1;

    public /* synthetic */ CaWebChromeClient$$ExternalSyntheticLambda15(WebView webView, ReadableType readableType) {
        this.f$0 = webView;
        this.f$1 = readableType;
    }

    public final Object invoke(Object obj) {
        return ReadableType.onWarmupCompleted(this.f$0, this.f$1, (DelegateActivity) obj);
    }
}
