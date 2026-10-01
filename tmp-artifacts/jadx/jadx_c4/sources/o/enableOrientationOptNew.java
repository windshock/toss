package o;

import com.google.android.gms.internal.ads.zzgc;
import im.toss.feature.credit.overview.network.response.CreditOverview;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableOrientationOptNew {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private CreditOverview onExtraCallbackWithResult;

    @Inject
    public enableOrientationOptNew() {
    }

    public final void onExtraCallbackWithResult(@NotNull CreditOverview creditOverview) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(creditOverview, "");
        this.onExtraCallbackWithResult = creditOverview;
        int i4 = onNavigationEvent + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        Object obj = null;
        if (this.onExtraCallbackWithResult != null) {
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CreditOverviewCache", "local overview cache cleared", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        this.onExtraCallbackWithResult = null;
        int i4 = IAuthTabCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final CreditOverview onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        CreditOverview creditOverview = this.onExtraCallbackWithResult;
        int i5 = i3 + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return creditOverview;
    }
}
