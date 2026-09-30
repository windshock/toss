package o;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaFP1Wedqhw_3GpPb7HzEjaomLQYM {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final <T> updateFocusedState<T> onExtraCallbackWithResult(@NotNull AppLovinSdkSettings appLovinSdkSettings, int i) {
        setOnQueryTextListener setonquerytextlistenerIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Integer numAccess100 = appLovinSdkSettings.access100();
        int iIntValue = numAccess100 != null ? numAccess100.intValue() : getIconContentView.onWarmupCompleted.IAuthTabCallback().onExtraCallback();
        Interpolator interpolatorIAuthTabCallback_Parcel = appLovinSdkSettings.IAuthTabCallback_Parcel();
        if (interpolatorIAuthTabCallback_Parcel != null) {
            setonquerytextlistenerIAuthTabCallback = new getMediaContentViewGroup(interpolatorIAuthTabCallback_Parcel);
        } else {
            setonquerytextlistenerIAuthTabCallback = getIconContentView.onWarmupCompleted.IAuthTabCallback();
            int i5 = IAuthTabCallback + 119;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        getThumbPosition getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallback(iIntValue, i, setonquerytextlistenerIAuthTabCallback);
        int i7 = onExtraCallback + 109;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return getthumbpositionOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ updateFocusedState onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 65;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 31;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        return onExtraCallbackWithResult(appLovinSdkSettings, i);
    }
}
