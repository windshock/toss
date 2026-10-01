package im.toss.features.credit.ui.legacy.detail;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.connectWithOverlayPermission;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ connectWithOverlayPermission f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ CreditStatusItemDetailActivity f$2;

    public /* synthetic */ CreditStatusItemDetailActivity$$ExternalSyntheticLambda13(connectWithOverlayPermission connectwithoverlaypermission, String str, CreditStatusItemDetailActivity creditStatusItemDetailActivity) {
        this.f$0 = connectwithoverlaypermission;
        this.f$1 = str;
        this.f$2 = creditStatusItemDetailActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditStatusItemDetailActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
