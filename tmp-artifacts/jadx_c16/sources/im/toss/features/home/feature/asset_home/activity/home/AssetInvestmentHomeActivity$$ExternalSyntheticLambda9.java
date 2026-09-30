package im.toss.features.home.feature.asset_home.activity.home;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.jvm.functions.Function1;
import o.decrementVideoUsage;
import o.findResAndMsg;
import o.getInternalId;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetInvestmentHomeActivity f$0;
    public final /* synthetic */ findResAndMsg f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getInternalId f$3;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda9(AssetInvestmentHomeActivity assetInvestmentHomeActivity, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getInternalId getinternalid) {
        this.f$0 = assetInvestmentHomeActivity;
        this.f$1 = findresandmsg;
        this.f$2 = getsupportedhighspeedresolutionsfor;
        this.f$3 = getinternalid;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, (isInVideoUsage) obj};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) AssetInvestmentHomeActivity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), iOnExtraCallback, 1607105334, objArr, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1607105327);
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousage;
    }
}
