package im.toss.features.home.ui.view.hideamount;

import android.widget.CompoundButton;
import androidx.lifecycle.MutableLiveData;
import o.checkAppxSupportCrossVersionSnapshot;
import o.setVisitUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountBottomSheetActivity$$ExternalSyntheticLambda3 implements CompoundButton.OnCheckedChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ MutableLiveData f$0;
    public final /* synthetic */ HomeHideAmountBottomSheetActivity f$1;
    public final /* synthetic */ checkAppxSupportCrossVersionSnapshot f$2;

    public /* synthetic */ HomeHideAmountBottomSheetActivity$$ExternalSyntheticLambda3(MutableLiveData mutableLiveData, HomeHideAmountBottomSheetActivity homeHideAmountBottomSheetActivity, checkAppxSupportCrossVersionSnapshot checkappxsupportcrossversionsnapshot) {
        this.f$0 = mutableLiveData;
        this.f$1 = homeHideAmountBottomSheetActivity;
        this.f$2 = checkappxsupportcrossversionsnapshot;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, compoundButton, Boolean.valueOf(z)};
            HomeHideAmountBottomSheetActivity.onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), 722072599, objArr, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -722072599);
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1, this.f$2, compoundButton, Boolean.valueOf(z)};
        HomeHideAmountBottomSheetActivity.onExtraCallback(setVisitUrl.onExtraCallbackWithResult(), 722072599, objArr2, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -722072599);
        int i3 = IAuthTabCallback + 99;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
