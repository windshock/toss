package im.toss.features.home.ui.view.lock;

import com.google.android.gms.internal.ads.zzgsa;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;
import o.isJSONTypeIgnore;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeAppLockOfferBottomSheetActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda10(HomeAppLockOfferBottomSheetActivity homeAppLockOfferBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = homeAppLockOfferBottomSheetActivity;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (isJSONTypeIgnore) obj};
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        Unit unit = (Unit) HomeAppLockOfferBottomSheetActivity.onNavigationEvent(zzgsa.onWarmupCompleted(), objArr, 806694203, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), iOnWarmupCompleted, -806694200);
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
