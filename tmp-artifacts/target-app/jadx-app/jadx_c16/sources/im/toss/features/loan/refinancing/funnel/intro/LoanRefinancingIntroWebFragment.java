package im.toss.features.loan.refinancing.funnel.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.ui.R;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingIntroWebFragment extends Hilt_LoanRefinancingIntroWebFragment {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private int IAuthTabCallback = R.layout.fragment_loan_refinancing_web_intro;

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 87;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoanRefinancingAppScreen", "LoanRefinancingIntroTrampolineFragment launched", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i4 = onWarmupCompleted + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        access100().IAuthTabCallbackStub(true);
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, false, (Intent) null, 2, (Object) null);
        } else {
            LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, false, (Intent) null, 3, (Object) null);
        }
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
