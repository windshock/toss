package im.toss.features.loan.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getErrCode;
import o.getStreamSharingChildren;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda9 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getStreamSharingChildren f$0;
    public final /* synthetic */ getStreamSharingChildren f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ getStreamSharingChildren f$3;

    public /* synthetic */ LoanTermsV2CustomContentKt$$ExternalSyntheticLambda9(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren getstreamsharingchildren2, int i, getStreamSharingChildren getstreamsharingchildren3) {
        this.f$0 = getstreamsharingchildren;
        this.f$1 = getstreamsharingchildren2;
        this.f$2 = i;
        this.f$3 = getstreamsharingchildren3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getErrCode.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = getErrCode.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
        int i3 = IAuthTabCallback + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
