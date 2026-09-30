package im.toss.features.home.feature.asset_home.activity.home;

import androidx.fragment.app.FragmentContainerView;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ AssetInvestmentHomeActivity f$1;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda5(int i, AssetInvestmentHomeActivity assetInvestmentHomeActivity) {
        this.f$0 = i;
        this.f$1 = assetInvestmentHomeActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        if (i3 != 0) {
            Object[] objArr = {Integer.valueOf(i4), this.f$1, (FragmentContainerView) obj};
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            return (Unit) AssetInvestmentHomeActivity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), iOnExtraCallback, -621313156, objArr, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 621313159);
        }
        Object[] objArr2 = {Integer.valueOf(i4), this.f$1, (FragmentContainerView) obj};
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
