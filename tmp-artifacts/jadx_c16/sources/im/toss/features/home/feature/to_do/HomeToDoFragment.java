package im.toss.features.home.feature.to_do;

import android.os.Bundle;
import android.view.View;
import im.toss.uikit.widget.TdsSkeletonV1View;
import im.toss.webview.TossWebView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.alertWithArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.service.LabFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeToDoFragment extends LabFragment {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private boolean onExtraCallback = true;
    private IAuthTabCallback onExtraCallbackWithResult;

    public int au_() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.layout.home_v2_feature_to_do_fragment;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.home_v2_feature_to_do_fragment;
        int i5 = onWarmupCompleted + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallback activity = getActivity();
        TdsSkeletonV1View tdsSkeletonV1View = null;
        if (activity instanceof IAuthTabCallback) {
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                tdsSkeletonV1View.hashCode();
                throw null;
            }
            iAuthTabCallback = activity;
        } else {
            int i3 = onWarmupCompleted + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iAuthTabCallback = null;
        }
        this.onExtraCallbackWithResult = iAuthTabCallback;
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        TdsSkeletonV1View tdsSkeletonV1View2 = (View) LabFragment.onExtraCallback(alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 433640589, iOnExtraCallbackWithResult, new Object[]{this, 0, 1, null}, alertWithArgs.onExtraCallbackWithResult(), -433640576);
        if (tdsSkeletonV1View2 instanceof TdsSkeletonV1View) {
            int i5 = onWarmupCompleted + 95;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                tdsSkeletonV1View.hashCode();
                throw null;
            }
            tdsSkeletonV1View = tdsSkeletonV1View2;
        }
        if (tdsSkeletonV1View != null) {
            tdsSkeletonV1View.setSkeletonColor(TdsSkeletonV1View.onWarmupCompleted.Grey);
            tdsSkeletonV1View.setSkeletonType(TdsSkeletonV1View.IAuthTabCallback.asBinder.onExtraCallback);
            tdsSkeletonV1View.setVisibility(0);
        }
        TossWebView tossWebViewICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (tossWebViewICustomTabsCallback_Parcel != null) {
            tossWebViewICustomTabsCallback_Parcel.setVerticalScrollBarEnabled(false);
        }
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.onExtraCallback) {
            int i4 = i3 + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallback = false;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "HomeToDoFragment_setHomeToDoNativeDrawerHeight_firstCalled", (String) null, (Map) null, (String) null, false, (String) null, 62, (Object) null);
        }
        View viewICustomTabsCallbackStub = ICustomTabsCallbackStub();
        if (viewICustomTabsCallbackStub != null) {
            int i6 = IAuthTabCallback + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            viewICustomTabsCallbackStub.setVisibility(8);
        }
        IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallbackWithResult(f);
        }
        int i8 = IAuthTabCallback + 93;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }
}
