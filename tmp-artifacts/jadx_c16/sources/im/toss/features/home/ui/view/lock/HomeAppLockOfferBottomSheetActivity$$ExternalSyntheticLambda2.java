package im.toss.features.home.ui.view.lock;

import com.google.android.gms.internal.ads.zzgsa;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ HomeAppLockOfferBottomSheetActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0};
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            throw null;
        }
        Object[] objArr2 = {this.f$0};
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) HomeAppLockOfferBottomSheetActivity.onNavigationEvent(zzgsa.onWarmupCompleted(), objArr2, 636866397, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, -636866391);
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
