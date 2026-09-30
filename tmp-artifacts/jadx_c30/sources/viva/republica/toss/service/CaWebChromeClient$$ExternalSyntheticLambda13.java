package viva.republica.toss.service;

import android.webkit.WebView;
import im.toss.activitydelegate.DelegateActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import o.ReadableType;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CaWebChromeClient$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ Ref.ObjectRef f$0;
    public final /* synthetic */ WebView f$1;
    public final /* synthetic */ ReadableType f$2;
    public final /* synthetic */ Boolean f$3;

    public /* synthetic */ CaWebChromeClient$$ExternalSyntheticLambda13(Ref.ObjectRef objectRef, WebView webView, ReadableType readableType, Boolean bool) {
        this.f$0 = objectRef;
        this.f$1 = webView;
        this.f$2 = readableType;
        this.f$3 = bool;
    }

    public final Object invoke(Object obj) {
        return ReadableType.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (DelegateActivity) obj);
    }
}
