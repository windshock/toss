package viva.republica.toss.service;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ReadableType;
import o.shouldBeKeptAsChild;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CaWebChromeClient$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ UIKitBaseActivity f$0;
    public final /* synthetic */ ReadableType f$1;

    public /* synthetic */ CaWebChromeClient$$ExternalSyntheticLambda11(UIKitBaseActivity uIKitBaseActivity, ReadableType readableType) {
        this.f$0 = uIKitBaseActivity;
        this.f$1 = readableType;
    }

    public final Object invoke(Object obj) {
        Object[] objArr = {this.f$0, this.f$1, (shouldBeKeptAsChild) obj};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) ReadableType.onNavigationEvent(1035523658, -1035523656, iOnExtraCallbackWithResult, TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }
}
