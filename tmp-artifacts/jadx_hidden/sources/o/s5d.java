package o;

import android.content.pm.PackageInfo;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s5d {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(s5d.class);
    private final long IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final PackageInfo onNavigationEvent;
    private final long onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i5) | i);
        int i8 = ~i2;
        int i9 = i7 | (~(i8 | i));
        int i10 = ~i;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i5);
        int i13 = (~(i8 | i5)) | i11 | i12;
        int i14 = (~(i2 | i10)) | i12;
        int i15 = i5 + i + i6 + (1039959776 * i3) + ((-2046201414) * i4);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i5) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i6) + ((-201326592) * i3) + ((-406847488) * i4) + (529399808 * i16);
        int i18 = ((i5 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i6 * 868239597) + (i3 * 817356128) + (i4 * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public s5d(@NotNull String str, long j, long j2, @NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(packageInfo, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = j;
        this.onWarmupCompleted = j2;
        this.onNavigationEvent = packageInfo;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        s5d s5dVar = (s5d) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
        String str = s5dVar.onExtraCallbackWithResult;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5772);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 13) & 1) != 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        s5d s5dVar = (s5d) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 20) & 1) == 0) {
            long j = s5dVar.IAuthTabCallback;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
            return Long.valueOf(j);
        }
        long j2 = s5dVar.IAuthTabCallback;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        s5d s5dVar = (s5d) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
        long j = s5dVar.onWarmupCompleted;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 18) & 1) == 0) {
            return Long.valueOf(j);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        s5d s5dVar = (s5d) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4004);
        int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 3) & 1;
        PackageInfo packageInfo = s5dVar.onNavigationEvent;
        if (i3 != 0) {
            return packageInfo;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        return ((Long) IAuthTabCallback(1429779055, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), -1429779055, new Object[]{this}, iOnExtraCallbackWithResult2)).longValue();
    }

    public final long onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        return ((Long) IAuthTabCallback(-594610833, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), 594610834, new Object[]{this}, iOnExtraCallbackWithResult2)).longValue();
    }

    public final String IAuthTabCallback() {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(1021071853, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), -1021071850, new Object[]{this}, iOnExtraCallbackWithResult2);
    }

    public final PackageInfo onWarmupCompleted() {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (PackageInfo) IAuthTabCallback(-1138299217, iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), 1138299219, new Object[]{this}, iOnExtraCallbackWithResult2);
    }
}
