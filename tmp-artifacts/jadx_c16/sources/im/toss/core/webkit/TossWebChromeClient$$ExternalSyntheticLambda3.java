package im.toss.core.webkit;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.IEngagementSignalsCallback_Parcel;
import o.setCircleColor;
import o.shouldBeKeptAsChild;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FragmentActivity f$0;
    public final /* synthetic */ setCircleColor f$1;
    public final /* synthetic */ IEngagementSignalsCallback_Parcel f$2;

    public /* synthetic */ TossWebChromeClient$$ExternalSyntheticLambda3(FragmentActivity fragmentActivity, setCircleColor setcirclecolor, IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel) {
        this.f$0 = fragmentActivity;
        this.f$1 = setcirclecolor;
        this.f$2 = iEngagementSignalsCallback_Parcel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = setCircleColor.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (shouldBeKeptAsChild) obj);
        int i4 = onExtraCallback + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
