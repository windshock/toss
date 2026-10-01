package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.RearDisplayPresentationSessionPresenterImpl;
import o.WebViewCompatExternalSyntheticLambda1;
import o.WindowAreaControllerImplExternalSyntheticLambda1;
import o.areAllItemsEnabled;
import o.getViewTypeCount;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.w0a;
import o.w3b;
import o.w5a;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WindowAreaControllerImplExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault.values().length];
            try {
                iArr[RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault.PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackDefault.SERVICE.ordinal()] = 2;
                int i = onExtraCallback + 55;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
            int i4 = onExtraCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub = (RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallbackStub, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1);
        int i3 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function2, webViewCompatExternalSyntheticLambda1);
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        int i6 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = i3 | i7 | (~i2);
        int i9 = ~i3;
        int i10 = (~(i2 | i7)) | (~(i7 | i9));
        int i11 = i6 + i3 + i + ((-92689393) * i4) + (1942122663 * i5);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i6) - 357761024) + ((-674687396) * i3) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i) + ((-1056047104) * i4) + ((-742522880) * i5) + ((-592117760) * i12);
        int i14 = (i6 * 1048061654) + 1366922925 + (i3 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i * 1048061961) + (i4 * 439444615) + (i5 * (-1279783457)) + (i12 * 173867008);
        int i15 = i13 + (i14 * i14 * (-1898250240));
        if (i15 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i15 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        int i16 = 2 % 2;
        int i17 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i17 % 128;
        int i18 = i17 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1);
        int i19 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function1 function1, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, function1, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallbackStub, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 428110496, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -428110494, new Object[]{iAuthTabCallbackStub, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)});
        int i5 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {iAuthTabCallbackStub, Boolean.valueOf(z), str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2128083942, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -2128083941, objArr);
        int i5 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub = (RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        Function1 function12 = (Function1) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue3 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallbackStub, quirksExternalSyntheticBackport0, function1, function0, function2, zBooleanValue, function12, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(num);
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(iAuthTabCallbackStub, z, str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(iAuthTabCallbackStub, z, str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, function1);
        int i4 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function0 function0, Function2 function2, boolean z, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i5 % 128;
        onWarmupCompleted(iAuthTabCallbackStub, quirksExternalSyntheticBackport0, function1, function0, function2, z, function12, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1679957832, i2, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard.<anonymous>.<anonymous> (NativeAdsBpsSingleListCard.kt:56)");
            }
            areAllItemsEnabled.onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1975818925, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{areallitemsenabled, SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallbackStub.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 18) & 3670016), 62}, -1975818925);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i9 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w0aVar, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w0aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i4 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-223686302, i2, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsSingleListCard.kt:58)");
                }
                w0aVar.IAuthTabCallback(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 458752 & (i2 << 15), 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w0aVar.IAuthTabCallback(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 458752 & (i2 << 15), 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Function2 function2, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webViewCompatExternalSyntheticLambda1, "");
            i = 0;
        } else {
            Intrinsics.checkNotNullParameter(webViewCompatExternalSyntheticLambda1, "");
            i = 0;
        }
        function2.invoke(i, webViewCompatExternalSyntheticLambda1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        boolean z = false;
        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub = (RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 99 / 0;
                i = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
            }
            iIntValue |= i;
            int i5 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            int i7 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i9 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1607461070, iIntValue, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard.<anonymous>.<anonymous> (NativeAdsBpsSingleListCard.kt:72)");
            }
            RearDisplaySessionImpl.onNavigationEvent(w3bVar, iAuthTabCallbackStub.IAuthTabCallbackStub(), iAuthTabCallbackStub.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1847744063, i, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsSingleListCard.kt:76)");
                int i5 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallbackStub.asBinder(), cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), 0L, (handshake) null, 2, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, AppLovinVastMediaViewf.Companion.onNavigationEvent(), false, GraphicDeviceInfo.Companion.asBinder(), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 12607488, 1597440, 180070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z2;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(731624642, i, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsSingleListCard.kt:86)");
            }
            String strOnTransact = iAuthTabCallbackStub.onTransact();
            int i5 = onNavigationEvent.onWarmupCompleted[iAuthTabCallbackStub.access100().ordinal()];
            if (i5 == 1) {
                str2 = str;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                str2 = null;
            }
            WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(strOnTransact, z, null, str2, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub = (RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final String str = (String) objArr[2];
        w5a w5aVar = (w5a) objArr[3];
        int i = 4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            int i3 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1209107047, iIntValue, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard.<anonymous>.<anonymous> (NativeAdsBpsSingleListCard.kt:74)");
                int i6 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            w5aVar.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1847744063, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unit;
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 77;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        Object[] objArr2 = {iAuthTabCallbackStub, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        unit = (Unit) WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 611727181, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -611727181, objArr2);
                        int i10 = 64 / 0;
                    } else {
                        Object[] objArr3 = {iAuthTabCallbackStub, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        unit = (Unit) WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 611727181, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -611727181, objArr3);
                    }
                    int i11 = IAuthTabCallback + 81;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(731624642, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 55;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnNavigationEvent = WindowAreaControllerImplExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallbackStub, zBooleanValue, str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i11 = IAuthTabCallback + 31;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 6) & 896) | 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(0);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, final Function1 function1, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i7 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i8 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i10 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                z = true;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i11 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(482428467, i2, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsSingleListCard.kt:99)");
            }
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i15 = 2 % 2;
                            int i16 = IAuthTabCallback + 51;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            Object[] objArr = {function1};
                            int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                            if (i17 != 0) {
                                return (Unit) WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -133441509, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 133441512, objArr);
                            }
                            int i18 = 92 / 0;
                            return (Unit) WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -133441509, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 133441512, objArr);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj2 = function0;
                }
                rightPreset.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, iAuthTabCallbackOnNavigationEvent, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, (Function0) null, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResult, 384, (i2 << 3) & 112, 1018);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i15 % 128;
                    if (i15 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(0);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function0 function0, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (function0 != null) {
            int i4 = i2 + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            function0.invoke();
            int i6 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 4;
            }
        } else {
            function1.invoke((Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<? super Integer, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function2, boolean z, @Nullable Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        Function1<? super Integer, Unit> function13;
        int i5;
        Function0<Unit> function02;
        int i6;
        int i7;
        int i8;
        Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function22;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        final Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function14;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function1<? super Integer, Unit> function15;
        final Function0<Unit> function03;
        final Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function23;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final Function1<? super Integer, Unit> function16;
        final String str;
        boolean z4;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        String str2;
        String str3;
        String str4;
        Function0<Unit> function04;
        Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function17;
        boolean z5;
        int i11;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i12;
        boolean z6;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2;
        Object obj;
        String str5;
        final Function0<Unit> function05;
        boolean z7;
        int i13;
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1330375168);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub)) {
                int i15 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    int i18 = IAuthTabCallback + 121;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    function13 = function1;
                    i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 128 : 256;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                            int i20 = IAuthTabCallback + 101;
                            onExtraCallbackWithResult = i20 % 128;
                            i6 = i20 % 2 != 0 ? 29044 : 2048;
                        } else {
                            i6 = 1024;
                        }
                        i7 = i6 | i3;
                    }
                    i8 = i2 & 16;
                    if (i8 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function22 = function2;
                            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 16384 : 8192;
                        }
                        i9 = i2 & 32;
                        if (i9 == 0) {
                            if ((i & 196608) == 0) {
                                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 131072 : 65536;
                            }
                            i10 = i2 & 64;
                            if (i10 == 0) {
                                i7 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 1048576 : 524288;
                            }
                            if ((i7 & 599187) == 599186) {
                                int i21 = IAuthTabCallback + 47;
                                onExtraCallbackWithResult = i21 % 128;
                                int i22 = i21 % 2;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                z3 = z;
                                function14 = function12;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                function15 = function13;
                                function03 = function02;
                                function23 = function22;
                            } else {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i17 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                                if (i4 != 0) {
                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda3
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke(Object obj2) {
                                                int i23 = 2 % 2;
                                                int i24 = onNavigationEvent + 61;
                                                onExtraCallbackWithResult = i24 % 128;
                                                int i25 = i24 % 2;
                                                Unit unitOnNavigationEvent = WindowAreaControllerImplExternalSyntheticLambda1.onNavigationEvent((Integer) obj2);
                                                int i26 = onExtraCallbackWithResult + 57;
                                                onNavigationEvent = i26 % 128;
                                                int i27 = i26 % 2;
                                                return unitOnNavigationEvent;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    function16 = (Function1) objOnMinimized;
                                } else {
                                    function16 = function13;
                                }
                                if (i5 != 0) {
                                    function02 = null;
                                }
                                function23 = i8 != 0 ? null : function22;
                                boolean z8 = i9 != 0 ? true : z;
                                Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function18 = i10 != 0 ? null : function12;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1330375168, i7, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCard (NativeAdsBpsSingleListCard.kt:34)");
                                }
                                String strAsInterface = iAuthTabCallbackStub.asInterface();
                                String strIAuthTabCallback = iAuthTabCallbackStub.IAuthTabCallback();
                                String strOnExtraCallbackWithResult = iAuthTabCallbackStub.onExtraCallbackWithResult();
                                String str6 = (String) RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub.onExtraCallbackWithResult(new Object[]{iAuthTabCallbackStub}, alertWithArgs.onExtraCallbackWithResult(), 1848105013, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1848105012, alertWithArgs.onExtraCallbackWithResult());
                                if (StringsKt.isBlank(str6)) {
                                    int i23 = onExtraCallbackWithResult + 11;
                                    IAuthTabCallback = i23 % 128;
                                    int i24 = i23 % 2;
                                    str = null;
                                } else {
                                    str = str6;
                                }
                                getViewTypeCount.onTransact ontransactIAuthTabCallback = getViewTypeCount.onTransact.Companion.IAuthTabCallback();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport05, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 0.0f, 0.0f, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onExtraCallback(!(strIAuthTabCallback == null || StringsKt.isBlank(strIAuthTabCallback)), strOnExtraCallbackWithResult != null, iAuthTabCallbackStub.onExtraCallback()), 7, (Object) null);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                if (StringsKt.isBlank(iAuthTabCallbackStub.IAuthTabCallbackDefault())) {
                                    int i25 = IAuthTabCallback + 7;
                                    onExtraCallbackWithResult = i25 % 128;
                                    if (i25 % 2 != 0) {
                                        iAuthTabCallbackStub.onWarmupCompleted();
                                        throw null;
                                    }
                                    String strOnWarmupCompleted = iAuthTabCallbackStub.onWarmupCompleted();
                                    if (strOnWarmupCompleted == null || StringsKt.isBlank(strOnWarmupCompleted)) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1753368460);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        str4 = strAsInterface;
                                        str2 = strOnExtraCallbackWithResult;
                                        str3 = strIAuthTabCallback;
                                        function04 = function02;
                                        function17 = function18;
                                        z5 = z8;
                                        i11 = 16384;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1752879001);
                                        wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback = wa.IAuthTabCallback.Companion.onExtraCallback();
                                        final String strOnWarmupCompleted2 = iAuthTabCallbackStub.onWarmupCompleted();
                                        if (strOnWarmupCompleted2 == null) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1753059885);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
                                            z4 = true;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1753059886);
                                            z4 = true;
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-223686302, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda4
                                                private static int onExtraCallbackWithResult = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    int i26 = 2 % 2;
                                                    int i27 = onExtraCallbackWithResult + 35;
                                                    onWarmupCompleted = i27 % 128;
                                                    int i28 = i27 % 2;
                                                    String str7 = strOnWarmupCompleted2;
                                                    w0a w0aVar = (w0a) obj2;
                                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    if (i28 == 0) {
                                                        return WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallback(str7, w0aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                                                    }
                                                    WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallback(str7, w0aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                                                    Object obj5 = null;
                                                    obj5.hashCode();
                                                    throw null;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        str2 = strOnExtraCallbackWithResult;
                                        str3 = strIAuthTabCallback;
                                        str4 = strAsInterface;
                                        function04 = function02;
                                        function17 = function18;
                                        z5 = z8;
                                        i11 = 16384;
                                        w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1679957832, z4, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda5
                                            private static int onNavigationEvent = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                int i26 = 2 % 2;
                                                int i27 = onWarmupCompleted + 111;
                                                onNavigationEvent = i27 % 128;
                                                int i28 = i27 % 2;
                                                RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                                areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) obj2;
                                                if (i28 == 0) {
                                                    return WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(iAuthTabCallbackStub2, areallitemsenabled, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                }
                                                Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(iAuthTabCallbackStub2, areallitemsenabled, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                int i29 = 77 / 0;
                                                return unitOnExtraCallbackWithResult;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, iAuthTabCallbackOnExtraCallback, 0.9f, wa.onNavigationEvent.Bottom, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (wa.IAuthTabCallbackStub) null, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.IAuthTabCallback(), (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100887558, 0, 3718);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                    if (function23 != null) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1753448471);
                                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                        Object obj2 = (String) RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub.onExtraCallbackWithResult(new Object[]{iAuthTabCallbackStub}, alertWithArgs.onExtraCallbackWithResult(), 711978474, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -711978474, alertWithArgs.onExtraCallbackWithResult());
                                        if (obj2 == null) {
                                            obj2 = 0;
                                        }
                                        boolean z9 = (57344 & i7) == i11;
                                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!z9) {
                                            int i26 = IAuthTabCallback + 27;
                                            onExtraCallbackWithResult = i26 % 128;
                                            int i27 = i26 % 2;
                                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda6
                                                    private static int onExtraCallbackWithResult = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj3) {
                                                        int i28 = 2 % 2;
                                                        int i29 = onWarmupCompleted + 113;
                                                        onExtraCallbackWithResult = i29 % 128;
                                                        int i30 = i29 % 2;
                                                        Unit unitIAuthTabCallback = WindowAreaControllerImplExternalSyntheticLambda1.IAuthTabCallback(function23, (WebViewCompatExternalSyntheticLambda1) obj3);
                                                        int i31 = onExtraCallbackWithResult + 5;
                                                        onWarmupCompleted = i31 % 128;
                                                        int i32 = i31 % 2;
                                                        return unitIAuthTabCallback;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                            }
                                            quirksExternalSyntheticBackport0OnExtraCallback = PageImplExternalSyntheticLambda0.onExtraCallback(onextracallback, obj2, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1753629604);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        quirksExternalSyntheticBackport0OnExtraCallback = QuirksExternalSyntheticBackport0.Companion;
                                    }
                                    Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function19 = function17;
                                    if (function19 == null || (quirksExternalSyntheticBackport04 = (QuirksExternalSyntheticBackport0) function19.invoke(0)) == null) {
                                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(quirksExternalSyntheticBackport04);
                                    if (str == null) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1754927418);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = null;
                                        i12 = 54;
                                        z6 = true;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1754927419);
                                        getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda7
                                            private static int onExtraCallback = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                int i28 = 2 % 2;
                                                int i29 = onWarmupCompleted + 71;
                                                onExtraCallback = i29 % 128;
                                                int i30 = i29 % 2;
                                                Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(str, function16, (RightPreset) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                                int i31 = onExtraCallback + 27;
                                                onWarmupCompleted = i31 % 128;
                                                int i32 = i31 % 2;
                                                return unitOnExtraCallbackWithResult;
                                            }
                                        };
                                        i12 = 54;
                                        z6 = true;
                                        encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(482428467, true, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onNavigationEvent(ontransactIAuthTabCallback);
                                    final String str7 = str4;
                                    final boolean z10 = z5;
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback3 = ForwardingCameraControl.onExtraCallback(-1209107047, z6, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda8
                                        private static int IAuthTabCallback = 1;
                                        private static int onNavigationEvent;

                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            int i28 = 2 % 2;
                                            int i29 = onNavigationEvent + 49;
                                            IAuthTabCallback = i29 % 128;
                                            int i30 = i29 % 2;
                                            Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(iAuthTabCallbackStub, z10, str7, (w5a) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                            int i31 = IAuthTabCallback + 113;
                                            onNavigationEvent = i31 % 128;
                                            int i32 = i31 % 2;
                                            return unitOnExtraCallbackWithResult;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i12);
                                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback4 = ForwardingCameraControl.onExtraCallback(1607461070, z6, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda9
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            int i28 = 2 % 2;
                                            int i29 = onWarmupCompleted + 1;
                                            onExtraCallbackWithResult = i29 % 128;
                                            int i30 = i29 % 2;
                                            Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(iAuthTabCallbackStub, (w3b) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                            int i31 = onWarmupCompleted + 43;
                                            onExtraCallbackWithResult = i31 % 128;
                                            if (i31 % 2 == 0) {
                                                return unitOnExtraCallbackWithResult;
                                            }
                                            throw null;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i12);
                                    int i28 = i7 & 896;
                                    boolean z11 = i28 == 256 ? z6 : false;
                                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!z11) {
                                        int i29 = onExtraCallbackWithResult + 93;
                                        IAuthTabCallback = i29 % 128;
                                        if (i29 % 2 == 0) {
                                            int i30 = 73 / 0;
                                            obj = objOnMinimized3;
                                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                Function0 function06 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda10
                                                    private static int onExtraCallbackWithResult = 0;
                                                    private static int onNavigationEvent = 1;

                                                    public final Object invoke() {
                                                        int i31 = 2 % 2;
                                                        int i32 = onNavigationEvent + 43;
                                                        onExtraCallbackWithResult = i32 % 128;
                                                        int i33 = i32 % 2;
                                                        Unit unitIAuthTabCallback = WindowAreaControllerImplExternalSyntheticLambda1.IAuthTabCallback(function16);
                                                        int i34 = onExtraCallbackWithResult + 15;
                                                        onNavigationEvent = i34 % 128;
                                                        if (i34 % 2 != 0) {
                                                            return unitIAuthTabCallback;
                                                        }
                                                        Object obj3 = null;
                                                        obj3.hashCode();
                                                        throw null;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function06);
                                                obj = function06;
                                            }
                                            z3 = z10;
                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, quirksExternalSyntheticBackport0OnExtraCallback3, encoderProfilesProxyVideoProfileProxyOnExtraCallback4, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 57264);
                                            str5 = str2;
                                            if (str5 == null) {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1755368890);
                                                hasProvider hasproviderOnNavigationEvent = SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                if ((i7 & 7168) == 2048) {
                                                    int i31 = onExtraCallbackWithResult + 79;
                                                    IAuthTabCallback = i31 % 128;
                                                    int i32 = i31 % 2;
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                boolean z12 = i28 == 256;
                                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if ((z7 || z12) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    function05 = function04;
                                                    objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda11
                                                        private static int IAuthTabCallback = 0;
                                                        private static int onNavigationEvent = 1;

                                                        public final Object invoke() {
                                                            int i33 = 2 % 2;
                                                            int i34 = onNavigationEvent + 95;
                                                            IAuthTabCallback = i34 % 128;
                                                            int i35 = i34 % 2;
                                                            Function0 function07 = function05;
                                                            if (i35 == 0) {
                                                                return WindowAreaControllerImplExternalSyntheticLambda1.onWarmupCompleted(function07, function16);
                                                            }
                                                            WindowAreaControllerImplExternalSyntheticLambda1.onWarmupCompleted(function07, function16);
                                                            Object obj3 = null;
                                                            obj3.hashCode();
                                                            throw null;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                                } else {
                                                    function05 = function04;
                                                }
                                                WebViewRenderProcessClientAdapterExternalSyntheticLambda1.onNavigationEvent(hasproviderOnNavigationEvent, null, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            } else {
                                                function05 = function04;
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1755539948);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            }
                                            RequiresWindowSdkExtension.onExtraCallbackWithResult(str3, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            function15 = function16;
                                            function03 = function05;
                                            function14 = function19;
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                                        } else {
                                            obj = objOnMinimized3;
                                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            }
                                            z3 = z10;
                                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback3, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, quirksExternalSyntheticBackport0OnExtraCallback3, encoderProfilesProxyVideoProfileProxyOnExtraCallback4, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 57264);
                                            str5 = str2;
                                            if (str5 == null) {
                                            }
                                            RequiresWindowSdkExtension.onExtraCallbackWithResult(str3, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            }
                                            function15 = function16;
                                            function03 = function05;
                                            function14 = function19;
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                                        }
                                    }
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                final Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function24 = function23;
                                final boolean z13 = z3;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsSingleListCardKt$$ExternalSyntheticLambda12
                                    private static int IAuthTabCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i33 = 2 % 2;
                                        int i34 = onNavigationEvent + 15;
                                        IAuthTabCallback = i34 % 128;
                                        int i35 = i34 % 2;
                                        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport03;
                                        Function1 function110 = function15;
                                        Function0 function07 = function03;
                                        Function2 function25 = function24;
                                        boolean z14 = z13;
                                        Function1 function111 = function14;
                                        int i36 = i;
                                        int i37 = i2;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        Object[] objArr = {iAuthTabCallbackStub2, quirksExternalSyntheticBackport07, function110, function07, function25, Boolean.valueOf(z14), function111, Integer.valueOf(i36), Integer.valueOf(i37), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                                        Unit unit = (Unit) WindowAreaControllerImplExternalSyntheticLambda1.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 65825693, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -65825689, objArr);
                                        int i38 = IAuthTabCallback + 67;
                                        onNavigationEvent = i38 % 128;
                                        int i39 = i38 % 2;
                                        return unit;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        int i33 = onExtraCallbackWithResult + 107;
                        IAuthTabCallback = i33 % 128;
                        int i34 = i33 % 2;
                        i7 |= 196608;
                        i10 = i2 & 64;
                        if (i10 == 0) {
                        }
                        if ((i7 & 599187) == 599186) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    function22 = function2;
                    i9 = i2 & 32;
                    if (i9 == 0) {
                    }
                    i10 = i2 & 64;
                    if (i10 == 0) {
                    }
                    if ((i7 & 599187) == 599186) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                function02 = function0;
                i7 = i3;
                i8 = i2 & 16;
                if (i8 == 0) {
                }
                function22 = function2;
                i9 = i2 & 32;
                if (i9 == 0) {
                }
                i10 = i2 & 64;
                if (i10 == 0) {
                }
                if ((i7 & 599187) == 599186) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            i7 = i3;
            i8 = i2 & 16;
            if (i8 == 0) {
            }
            function22 = function2;
            i9 = i2 & 32;
            if (i9 == 0) {
            }
            i10 = i2 & 64;
            if (i10 == 0) {
            }
            if ((i7 & 599187) == 599186) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        i7 = i3;
        i8 = i2 & 16;
        if (i8 == 0) {
        }
        function22 = function2;
        i9 = i2 & 32;
        if (i9 == 0) {
        }
        i10 = i2 & 64;
        if (i10 == 0) {
        }
        if ((i7 & 599187) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function0 function0, Function2 function2, boolean z, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {iAuthTabCallbackStub, quirksExternalSyntheticBackport0, function1, function0, function2, Boolean.valueOf(z), function12, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 65825693, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -65825689, objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -133441509, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 133441512, new Object[]{function1});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallbackStub, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 611727181, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -611727181, objArr);
    }

    private static final Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallbackStub, Boolean.valueOf(z), str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2128083942, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -2128083941, objArr);
    }

    private static final Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub iAuthTabCallbackStub, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallbackStub, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 428110496, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -428110494, objArr);
    }
}
