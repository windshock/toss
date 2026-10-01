package im.toss.features.home.ui.dst.view.asset.edit;

import android.view.View;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetEditBottomSheetActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ AssetEditBottomSheetActivity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;
    public final /* synthetic */ List f$2;
    public final /* synthetic */ TdsBottomCtaV1View f$3;

    public /* synthetic */ AssetEditBottomSheetActivity$$ExternalSyntheticLambda7(AssetEditBottomSheetActivity assetEditBottomSheetActivity, getTypedExportedConstants gettypedexportedconstants, List list, TdsBottomCtaV1View tdsBottomCtaV1View) {
        this.f$0 = assetEditBottomSheetActivity;
        this.f$1 = gettypedexportedconstants;
        this.f$2 = list;
        this.f$3 = tdsBottomCtaV1View;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetEditBottomSheetActivity assetEditBottomSheetActivity = this.f$0;
        if (i3 != 0) {
            Object[] objArr = {assetEditBottomSheetActivity, this.f$1, this.f$2, this.f$3, (View) obj};
            int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
            return (Unit) AssetEditBottomSheetActivity.onNavigationEvent(MaxNativeAdListener.onExtraCallbackWithResult(), -2000581981, MaxNativeAdListener.onExtraCallbackWithResult(), objArr, MaxNativeAdListener.onExtraCallbackWithResult(), 2000581984, iOnExtraCallbackWithResult);
        }
        Object[] objArr2 = {assetEditBottomSheetActivity, this.f$1, this.f$2, this.f$3, (View) obj};
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        throw null;
    }
}
