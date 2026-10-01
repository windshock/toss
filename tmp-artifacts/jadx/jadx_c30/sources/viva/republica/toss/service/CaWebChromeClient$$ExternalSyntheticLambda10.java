package viva.republica.toss.service;

import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.jvm.functions.Function1;
import o.ReadableType;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CaWebChromeClient$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ UIKitBaseActivity f$0;
    public final /* synthetic */ ReadableType f$1;

    public /* synthetic */ CaWebChromeClient$$ExternalSyntheticLambda10(UIKitBaseActivity uIKitBaseActivity, ReadableType readableType) {
        this.f$0 = uIKitBaseActivity;
        this.f$1 = readableType;
    }

    public final Object invoke(Object obj) {
        return ReadableType.onNavigationEvent(this.f$0, this.f$1, (Throwable) obj);
    }
}
