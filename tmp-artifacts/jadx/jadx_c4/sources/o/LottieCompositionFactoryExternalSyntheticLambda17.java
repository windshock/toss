package o;

import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class LottieCompositionFactoryExternalSyntheticLambda17 {
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    private final getSupportedHighSpeedResolutionsFor onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(CollectionsKt.emptyList(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    private final ResourceManagerInternalResourceManagerHooks onExtraCallbackWithResult = ResourceManagerInternalResourceManagerHooks.Companion.onExtraCallbackWithResult();
    private final SearchView onExtraCallback = SearchView.Companion.onExtraCallbackWithResult();

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = (~(i7 | i4)) | (~(i7 | i2));
        int i9 = (~i4) | i6;
        int i10 = ~(i9 | i2);
        int i11 = (~(i4 | (~i2))) | (~i9);
        int i12 = i6 + i2 + i3 + (243328196 * i) + (549715570 * i5);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i6) + 1264254976 + ((-1099560353) * i2) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i3) + (781713408 * i) + (665583616 * i5) + (1005256704 * i13);
        int i15 = (i6 * 1467389705) + 421362043 + (i2 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i3 * 1467388771) + (i * (-1383267380)) + (i5 * 1030937622) + (i13 * 484507648);
        return i14 + ((i15 * i15) * 1164771328) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    protected abstract List<LottieCompositionFactoryExternalSyntheticLambda18> onExtraCallbackWithResult(long j, float f);

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17 = (LottieCompositionFactoryExternalSyntheticLambda17) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = lottieCompositionFactoryExternalSyntheticLambda17.asBinder();
        int i4 = onNavigationEvent + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zAsBinder);
    }

    public final List<LottieCompositionFactoryExternalSyntheticLambda18> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List<LottieCompositionFactoryExternalSyntheticLambda18> listAsInterface = asInterface();
        int i4 = asInterface + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return listAsInterface;
    }

    public ResourceManagerInternalResourceManagerHooks onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public SearchView onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SearchView searchView = this.onExtraCallback;
        int i5 = i2 + 43;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return searchView;
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(true);
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(false);
        int i4 = asInterface + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17 = (LottieCompositionFactoryExternalSyntheticLambda17) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateGradientStates-viCIZxY");
        }
        int i5 = i3 + 37;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if ((iIntValue & 2) != 0) {
            int i7 = i3 + 41;
            onNavigationEvent = i7 % 128;
            fFloatValue = i7 % 2 != 0 ? 2.0f : 0.0f;
        }
        lottieCompositionFactoryExternalSyntheticLambda17.IAuthTabCallback(jLongValue, fFloatValue);
        return null;
    }

    public final void IAuthTabCallback(long j, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(onExtraCallbackWithResult(j, f));
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        int i5 = onNavigationEvent + 15;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    private final boolean asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.IAuthTabCallback(Boolean.valueOf(z));
            return;
        }
        this.IAuthTabCallback.IAuthTabCallback(Boolean.valueOf(z));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<LottieCompositionFactoryExternalSyntheticLambda18> asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            List<LottieCompositionFactoryExternalSyntheticLambda18> list = (List) this.onWarmupCompleted.onExtraCallbackWithResult();
            int i3 = asInterface + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return list;
            }
            throw null;
        }
        throw null;
    }

    private final void IAuthTabCallback(List<LottieCompositionFactoryExternalSyntheticLambda18> list) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.IAuthTabCallback(list);
            int i3 = onNavigationEvent + 91;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onWarmupCompleted.IAuthTabCallback(list);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17, long j, float f, int i, Object obj) {
        Object[] objArr = {lottieCompositionFactoryExternalSyntheticLambda17, Long.valueOf(j), Float.valueOf(f), Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1406038806, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1406038806, objArr);
    }

    public final boolean IAuthTabCallback() {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -379597656, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 379597657, new Object[]{this})).booleanValue();
    }
}
