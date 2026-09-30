package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.RearDisplayPresentationSessionPresenterImpl;
import o.WindowAreaControllerExternalSyntheticLambda0;
import o.areAllItemsEnabled;
import o.getViewTypeCount;
import o.setCallToAction;
import o.setClickTrackingUrls;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.w0a;
import o.w5a;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WindowAreaControllerExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback = (RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) objArr[0];
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(c0018onExtraCallback, liveDataObservableExternalSyntheticLambda1, iIntValue, zBooleanValue);
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(num);
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallback onextracallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 95;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onExtraCallback(onextracallback, quirksExternalSyntheticBackport0, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(onextracallback, quirksExternalSyntheticBackport0, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = (RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult) objArr[0];
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(onextracallbackwithresult, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {function1, Boolean.valueOf(z)};
        if (i3 != 0) {
            return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -627336168, 627336173, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(c0018onExtraCallback, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(c0018onExtraCallback, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallback onextracallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(onextracallback, quirksExternalSyntheticBackport0, (Function1<? super Integer, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 65;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, Function1 function1, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, function1, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 9 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = i2 | i7;
        int i11 = (~(i2 | i3)) | (~(i7 | (~i3) | i8)) | (~(i3 | i4));
        int i12 = i3 + i4 + i5 + (764943627 * i) + (189947931 * i6);
        int i13 = i12 * i12;
        int i14 = ((i3 * (-973936384)) - 801505280) + ((-973936384) * i4) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i5) + ((-1475084288) * i) + ((-1479278592) * i6) + ((-626393088) * i13);
        int i15 = (i3 * 1860537600) + 224780607 + (i4 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i5 * 1860538117) + (i * (-1861700041)) + (i6 * (-831392377)) + (i13 * 995229696);
        switch (i14 + (i15 * i15 * 1053163520)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return onTransact(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        w0a w0aVar = (w0a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, boolean z, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1);
        if (i5 != 0) {
            onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -57856656, 57856658, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(z), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult)});
        } else {
            onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -57856656, 57856658, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(z), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iOnExtraCallbackWithResult)});
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1);
        int i4 = onExtraCallback + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {c0018onExtraCallback, quirksExternalSyntheticBackport0, function1, Boolean.valueOf(z), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1177947711, -1177947707, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
        int i6 = IAuthTabCallback + 109;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(onextracallbackwithresult, quirksExternalSyntheticBackport0, (Function1<? super Integer, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 91;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback = (RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        onNavigationEvent(c0018onExtraCallback, quirksExternalSyntheticBackport0, (Function1<? super Integer, Unit>) function1, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 25;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 109;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, boolean z, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, z, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 77 / 0;
        }
        int i7 = onExtraCallback + 119;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1);
        int i4 = onExtraCallback + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(onextracallbackwithresult, quirksExternalSyntheticBackport0, function1, z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(onextracallbackwithresult, quirksExternalSyntheticBackport0, function1, z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback = (RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(c0018onExtraCallback, function1, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final RearDisplayPresentationSessionPresenterImpl.onExtraCallback onextracallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<? super Integer, Unit> function1, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        Function1<? super Integer, Unit> function12;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Function1<? super Integer, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function1<? super Integer, Unit> function14;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(402569933);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        Object obj = null;
        if (i7 != 0) {
            int i8 = IAuthTabCallback + 23;
            onExtraCallback = i8 % 128;
            i3 = i8 % 2 != 0 ? i3 | 111 : i3 | 48;
        } else if ((i & 48) == 0) {
            int i9 = IAuthTabCallback + 117;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function12 = function1;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                    int i11 = IAuthTabCallback + 107;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    int i13 = IAuthTabCallback + 111;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    z2 = z;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    int i15 = onExtraCallback + 43;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    z3 = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                    int i17 = IAuthTabCallback + 63;
                    onExtraCallback = i17 % 128;
                    if (i17 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i7 != 0) {
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if (i10 != 0) {
                        int i18 = IAuthTabCallback + 63;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda14
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2) {
                                    int i20 = 2 % 2;
                                    int i21 = onExtraCallbackWithResult + 97;
                                    onWarmupCompleted = i21 % 128;
                                    int i22 = i21 % 2;
                                    Unit unitIAuthTabCallback = WindowAreaControllerExternalSyntheticLambda0.IAuthTabCallback((Integer) obj2);
                                    int i23 = onWarmupCompleted + 35;
                                    onExtraCallbackWithResult = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function14 = (Function1) objOnMinimized;
                    } else {
                        function14 = function12;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(402569933, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCard (NativeAdsBpsLeadFormCard.kt:33)");
                    }
                    if (onextracallback instanceof RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) {
                        int i20 = IAuthTabCallback + 99;
                        onExtraCallback = i20 % 128;
                        if (i20 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(322657576);
                            onNavigationEvent((RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) onextracallback, quirksExternalSyntheticBackport03, function14, z2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 25013);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(322657576);
                            onNavigationEvent((RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback) onextracallback, quirksExternalSyntheticBackport03, function14, z2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 8190);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                    } else {
                        if (!(onextracallback instanceof RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(322655459);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            throw new NoWhenBranchMatchedException();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(322661188);
                        onNavigationEvent((RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult) onextracallback, quirksExternalSyntheticBackport03, function14, z2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 8190);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i21 = IAuthTabCallback + 55;
                        onExtraCallback = i21 % 128;
                        if (i21 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i22 = 17 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    function13 = function14;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    function13 = function12;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final boolean z4 = z2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda15
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i23 = 2 % 2;
                            int i24 = IAuthTabCallback + 113;
                            onExtraCallback = i24 % 128;
                            int i25 = i24 % 2;
                            Unit unitIAuthTabCallback = WindowAreaControllerExternalSyntheticLambda0.IAuthTabCallback(onextracallback, quirksExternalSyntheticBackport02, function13, z4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i26 = onExtraCallback + 123;
                            IAuthTabCallback = i26 % 128;
                            int i27 = i26 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                int i5 = IAuthTabCallback + 59;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = onExtraCallback + 11;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onExtraCallback + 15;
            IAuthTabCallback = i9 % 128;
            z = i9 % 2 != 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1269805378, i2, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormSelection.<anonymous>.<anonymous> (NativeAdsBpsLeadFormCard.kt:65)");
            }
            areAllItemsEnabled.onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1975818925, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{areallitemsenabled, SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(c0018onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 18) & 3670016), 62}, -1975818925);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallback + 91;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w0aVar, "");
        if ((i & 17) != 16) {
            int i5 = IAuthTabCallback + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(214451782, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormSelection.<anonymous>.<anonymous> (NativeAdsBpsLeadFormCard.kt:67)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262142);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 95;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
            if (c0018onExtraCallback.onWarmupCompleted() == RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onWarmupCompleted.SINGLE) {
                int i5 = IAuthTabCallback + 21;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                liveDataObservableExternalSyntheticLambda1.clear();
                if (z) {
                    liveDataObservableExternalSyntheticLambda1.add(Integer.valueOf(i));
                }
            } else if (!(!z)) {
                if (!liveDataObservableExternalSyntheticLambda1.contains(Integer.valueOf(i))) {
                    liveDataObservableExternalSyntheticLambda1.add(Integer.valueOf(i));
                }
            } else {
                liveDataObservableExternalSyntheticLambda1.remove(Integer.valueOf(i));
            }
        } else if (c0018onExtraCallback.onWarmupCompleted() == RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onWarmupCompleted.SINGLE) {
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, final Function1 function1, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onExtraCallback + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(408406303, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormSelection.<anonymous>.<anonymous> (NativeAdsBpsLeadFormCard.kt:112)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(408406303, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormSelection.<anonymous>.<anonymous> (NativeAdsBpsLeadFormCard.kt:112)");
        }
        String strAsBinder = c0018onExtraCallback.asBinder();
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = setCallToAction.IAuthTabCallback.Companion.onWarmupCompleted();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 13, (Object) null), WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onWarmupCompleted(), 0.0f, 2, (Object) null);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i6 = onExtraCallback + 91;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda5
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 67;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallbackWithResult = WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(function1);
                        if (i9 != 0) {
                            int i10 = 80 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strAsBinder, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, iAuthTabCallbackOnWarmupCompleted, null, null, null, (Function0) objOnMinimized, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 432, 952}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onExtraCallback + 15;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function1<? super Integer, Unit> function1, final boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        getBacktraceNote<im.toss.tds.compose.component.compound.listheader.v3.RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnNavigationEvent;
        int i2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-245735343);
        int i5 = (i & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(c0018onExtraCallback) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i6 = onExtraCallback + 103;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                throw null;
            }
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 2048 : 1024;
        }
        int i7 = i5;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) != 1170, i7 & 1)) {
            int i8 = onExtraCallback + 51;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-245735343, i7, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormSelection (NativeAdsBpsLeadFormCard.kt:46)");
            }
            List<String> listOnExtraCallbackWithResult = c0018onExtraCallback.onExtraCallbackWithResult();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(listOnExtraCallbackWithResult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent) {
                int i10 = IAuthTabCallback + 49;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult();
                    Integer numIAuthTabCallbackStub = c0018onExtraCallback.IAuthTabCallbackStub();
                    if (numIAuthTabCallbackStub != null) {
                        liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.add(Integer.valueOf(numIAuthTabCallbackStub.intValue()));
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult);
                    obj = liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult;
                }
                LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) obj;
                final String strOnExtraCallback = c0018onExtraCallback.onExtraCallback();
                String strOnNavigationEvent = c0018onExtraCallback.onNavigationEvent();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                String strIAuthTabCallback = c0018onExtraCallback.IAuthTabCallback();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback2, 0.0f, 0.0f, 0.0f, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onWarmupCompleted(!(strIAuthTabCallback == null || StringsKt.isBlank(strIAuthTabCallback)), false, null, 6, null), 7, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback3);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                    int i12 = onExtraCallback + 109;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i14 = onExtraCallback + 117;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
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
                if (StringsKt.isBlank(strOnExtraCallback)) {
                    int i16 = IAuthTabCallback + 105;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1840636522);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1444848299);
                    encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(214451782, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallback + 81;
                            onExtraCallbackWithResult = i19 % 128;
                            int i20 = i19 % 2;
                            Unit unitOnExtraCallback = WindowAreaControllerExternalSyntheticLambda0.onExtraCallback(strOnExtraCallback, (w0a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i21 = onExtraCallbackWithResult + 83;
                            onExtraCallback = i21 % 128;
                            if (i21 % 2 != 0) {
                                int i22 = 76 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                wa.onNavigationEvent onnavigationevent = wa.onNavigationEvent.Top;
                wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback = wa.IAuthTabCallback.Companion.onExtraCallback();
                if (!z) {
                    getbacktracenoteOnNavigationEvent = null;
                } else {
                    int i18 = onExtraCallback + 75;
                    IAuthTabCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        WebViewProviderAdapterExternalSyntheticLambda1.onExtraCallback.onNavigationEvent();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    getbacktracenoteOnNavigationEvent = WebViewProviderAdapterExternalSyntheticLambda1.onExtraCallback.onNavigationEvent();
                }
                LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda12 = liveDataObservableExternalSyntheticLambda1;
                w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1269805378, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i19 = 2 % 2;
                        int i20 = onExtraCallback + 55;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnExtraCallback = WindowAreaControllerExternalSyntheticLambda0.onExtraCallback(c0018onExtraCallback, (areAllItemsEnabled) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        int i22 = onExtraCallback + 61;
                        IAuthTabCallback = i22 % 128;
                        if (i22 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, iAuthTabCallbackOnExtraCallback, 0.9f, onnavigationevent, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (wa.IAuthTabCallbackStub) null, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.IAuthTabCallback(), getbacktracenoteOnNavigationEvent, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100887558, 0, 3206);
                if (strOnNavigationEvent != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1840103290);
                    hasProvider hasproviderOnNavigationEvent = SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(strOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15);
                    GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent = GraphicDeviceInfo.Companion.onNavigationEvent();
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i2 = 0;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnNavigationEvent, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, (DeviceQuirksExternalSyntheticLambda0) WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onNavigationEvent(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{Float.valueOf(getViewTypeCount.onTransact.Companion.onWarmupCompleted().onTransact())}, 192219824, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -192219823, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())), (getHumanReadableName) null, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).RatingCompat1(), jOnExtraCallback, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, graphicDeviceInfoOnNavigationEvent, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 1572864, 196580);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i2 = 0;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1839765669);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1444818974);
                final int i19 = i2;
                for (Object obj3 : listOnExtraCallbackWithResult) {
                    if (i19 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj3;
                    if (i19 > 0) {
                        int i20 = IAuthTabCallback + 73;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-694539112);
                        AppLovinNativeAdImplExternalSyntheticLambda6.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback.Default, AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.Side, AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult2, 3504, 1);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-694295979);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    final LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda13 = liveDataObservableExternalSyntheticLambda12;
                    boolean zContains = liveDataObservableExternalSyntheticLambda13.contains(Integer.valueOf(i19));
                    if ((i7 & 14) == 4) {
                        int i22 = onExtraCallback + 93;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        i3 = 1;
                    } else {
                        i3 = i2;
                    }
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(liveDataObservableExternalSyntheticLambda13);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i19);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (((zOnNavigationEvent2 ? 1 : 0) | i3 | (zOnExtraCallback ? 1 : 0)) != 0 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj4) {
                                int i24 = 2 % 2;
                                int i25 = onExtraCallback + 95;
                                onNavigationEvent = i25 % 128;
                                int i26 = i25 % 2;
                                RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback2 = c0018onExtraCallback;
                                if (i26 != 0) {
                                    Object[] objArr = {c0018onExtraCallback2, liveDataObservableExternalSyntheticLambda13, Integer.valueOf(i19), Boolean.valueOf(((Boolean) obj4).booleanValue())};
                                    return (Unit) WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -133045840, 133045840, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
                                }
                                Object[] objArr2 = {c0018onExtraCallback2, liveDataObservableExternalSyntheticLambda13, Integer.valueOf(i19), Boolean.valueOf(((Boolean) obj4).booleanValue())};
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -57856656, 57856658, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(zContains), (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i2)});
                    i19++;
                    liveDataObservableExternalSyntheticLambda12 = liveDataObservableExternalSyntheticLambda13;
                }
                LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda14 = liveDataObservableExternalSyntheticLambda12;
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                setVerticalGravity.IAuthTabCallback(lowLightBoostControlExternalSyntheticLambda0, !liveDataObservableExternalSyntheticLambda14.isEmpty(), (QuirksExternalSyntheticBackport0) null, (ResourceManagerInternalResourceManagerHooks) null, (SearchView) null, (String) null, ForwardingCameraControl.onExtraCallback(408406303, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        Unit unit;
                        int i24 = 2 % 2;
                        int i25 = onExtraCallbackWithResult + 35;
                        IAuthTabCallback = i25 % 128;
                        if (i25 % 2 != 0) {
                            Object[] objArr = {c0018onExtraCallback, function1, (setHorizontalGravity) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())};
                            unit = (Unit) WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1421249604, 1421249610, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
                            int i26 = 33 / 0;
                        } else {
                            Object[] objArr2 = {c0018onExtraCallback, function1, (setHorizontalGravity) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())};
                            unit = (Unit) WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1421249604, 1421249610, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2);
                        }
                        int i27 = onExtraCallbackWithResult + 25;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 1572870, 30);
                RequiresWindowSdkExtension.onExtraCallbackWithResult(c0018onExtraCallback.IAuthTabCallback(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, !liveDataObservableExternalSyntheticLambda14.isEmpty() ? getViewTypeCount.onTransact.Companion.onWarmupCompleted().onTransact() : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 0.0f, 0.0f, 13, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, i2, i2);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = IAuthTabCallback + 45;
                    onExtraCallback = i24 % 128;
                    int i25 = i24 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i26 = 2 % 2;
                    int i27 = onExtraCallbackWithResult + 57;
                    IAuthTabCallback = i27 % 128;
                    if (i27 % 2 != 0) {
                        WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(c0018onExtraCallback, quirksExternalSyntheticBackport0, function1, z, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(c0018onExtraCallback, quirksExternalSyntheticBackport0, function1, z, i, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i28 = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(areallitemsenabled, "");
            if ((i & 124) == 0) {
                int i6 = onExtraCallback + 43;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                    int i8 = onExtraCallback + 119;
                    IAuthTabCallback = i8 % 128;
                    i2 = i8 % 2 == 0 ? 5 : 4;
                } else {
                    int i9 = IAuthTabCallback + 109;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(areallitemsenabled, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i11 = onExtraCallback + 13;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-840542694, i3, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormField.<anonymous>.<anonymous> (NativeAdsBpsLeadFormCard.kt:150)");
            }
            areAllItemsEnabled.onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1975818925, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{areallitemsenabled, SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(onextracallbackwithresult.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 << 18) & 3670016), 62}, -1975818925);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallback + 51;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i14 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w0aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IAuthTabCallback + 3;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-227387998, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormField.<anonymous>.<anonymous> (NativeAdsBpsLeadFormCard.kt:151)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262142);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 51;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function1<? super Integer, Unit> function1, final boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        getBacktraceNote getbacktracenote;
        getBacktraceNote<im.toss.tds.compose.component.compound.listheader.v3.RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote2;
        float fOnTransact;
        boolean z2;
        boolean z3;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-449271123);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ^ true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 2048 : 1024;
        }
        int i4 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) != 1170, i4 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 77;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-449271123, i4, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormField (NativeAdsBpsLeadFormCard.kt:139)");
                int i7 = IAuthTabCallback + 43;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            final String strOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            String strOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 0.0f, 0.0f, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onExtraCallback(), 7, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i9 = IAuthTabCallback + 59;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            if (StringsKt.isBlank(strOnExtraCallback)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1215841370);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                getbacktracenote = null;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1840336401);
                getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-227387998, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda10
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallbackWithResult + 35;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr = {strOnExtraCallback, (w0a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        Unit unit = (Unit) WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -772762117, 772762120, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
                        int i14 = onNavigationEvent + 105;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                getbacktracenote = getbacktracenoteOnExtraCallback;
            }
            wa.onNavigationEvent onnavigationevent = wa.onNavigationEvent.Top;
            wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback = wa.IAuthTabCallback.Companion.onExtraCallback();
            if (z) {
                getBacktraceNote<im.toss.tds.compose.component.compound.listheader.v3.RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnWarmupCompleted = WebViewProviderAdapterExternalSyntheticLambda1.onExtraCallback.onWarmupCompleted();
                int i11 = onExtraCallback + 81;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                getbacktracenote2 = getbacktracenoteOnWarmupCompleted;
            } else {
                getbacktracenote2 = null;
            }
            w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-840542694, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda11
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 109;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        Object[] objArr = {onextracallbackwithresult, (areAllItemsEnabled) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        throw null;
                    }
                    Object[] objArr2 = {onextracallbackwithresult, (areAllItemsEnabled) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    Unit unit = (Unit) WindowAreaControllerExternalSyntheticLambda0.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 165071914, -165071913, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2);
                    int i15 = IAuthTabCallback + 45;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, iAuthTabCallbackOnExtraCallback, 0.9f, onnavigationevent, getbacktracenote, (wa.IAuthTabCallbackStub) null, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.IAuthTabCallback(), getbacktracenote2, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100887558, 0, 3206);
            if (strOnExtraCallbackWithResult != null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1216373455);
                hasProvider hasproviderOnNavigationEvent = SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(strOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15);
                GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent = GraphicDeviceInfo.Companion.onNavigationEvent();
                long jRatingCompat1 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).RatingCompat1();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnNavigationEvent, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, (DeviceQuirksExternalSyntheticLambda0) WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onNavigationEvent(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f))}, 192219824, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -192219823, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())), (getHumanReadableName) null, jRatingCompat1, jOnExtraCallback, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, graphicDeviceInfoOnNavigationEvent, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 1572864, 196580);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1216675519);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            String strOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = setCallToAction.IAuthTabCallback.Companion.onWarmupCompleted();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            String strOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
            if (strOnNavigationEvent == null || StringsKt.isBlank(strOnNavigationEvent)) {
                fOnTransact = getViewTypeCount.onTransact.Companion.onWarmupCompleted().onTransact();
            } else {
                int i13 = IAuthTabCallback + 29;
                onExtraCallback = i13 % 128;
                if (i13 % 2 != 0) {
                    getViewTypeCount.onTransact.Companion.onNavigationEvent().onTransact();
                    throw null;
                }
                fOnTransact = getViewTypeCount.onTransact.Companion.onNavigationEvent().onTransact();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback3, 0.0f, fOnTransact, 0.0f, 0.0f, 13, (Object) null), getViewTypeCount.onNavigationEvent.Companion.IAuthTabCallback().IAuthTabCallback(), 0.0f, 2, (Object) null);
            if ((i4 & 896) == 256) {
                z3 = false;
                z2 = true;
            } else {
                z2 = true;
                z3 = true;
            }
            boolean z4 = z2 ^ z3;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!z4) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda12
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i14 = 2 % 2;
                            int i15 = onExtraCallbackWithResult + 89;
                            onExtraCallback = i15 % 128;
                            int i16 = i15 % 2;
                            Function1 function12 = function1;
                            if (i16 == 0) {
                                return WindowAreaControllerExternalSyntheticLambda0.onNavigationEvent(function12);
                            }
                            WindowAreaControllerExternalSyntheticLambda0.onNavigationEvent(function12);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0);
                    obj = function0;
                }
                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnWarmupCompleted, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, iAuthTabCallbackOnWarmupCompleted, null, null, null, (Function0) obj, null, false, false, cameraCaptureResultEmptyCameraCaptureResult2, 384, 952}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                RequiresWindowSdkExtension.onExtraCallbackWithResult(onextracallbackwithresult.onNavigationEvent(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, getViewTypeCount.onTransact.Companion.onWarmupCompleted().onTransact(), 0.0f, 0.0f, 13, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i14 = 2 % 2;
                    int i15 = onNavigationEvent + 17;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    Unit unitOnNavigationEvent = WindowAreaControllerExternalSyntheticLambda0.onNavigationEvent(onextracallbackwithresult, quirksExternalSyntheticBackport0, function1, z, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i17 = onExtraCallback + 121;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static final Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallback + 95;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1155854845, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormItemRow.<anonymous>.<anonymous> (NativeAdsBpsLeadFormCard.kt:203)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, 1, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, AppLovinVastMediaViewf.Companion.onNavigationEvent(), false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 24576, 245630);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onExtraCallback + 3;
                int i5 = i4 % 128;
                IAuthTabCallback = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 103;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 103;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1865830987, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormItemRow.<anonymous> (NativeAdsBpsLeadFormCard.kt:201)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1865830987, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormItemRow.<anonymous> (NativeAdsBpsLeadFormCard.kt:201)");
            }
            w5aVar.onExtraCallback(ForwardingCameraControl.onExtraCallback(1155854845, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda16
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onWarmupCompleted + 107;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnNavigationEvent = WindowAreaControllerExternalSyntheticLambda0.onNavigationEvent(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = onWarmupCompleted + 51;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(boolean z, Function1 function1, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 47) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i5 = IAuthTabCallback + 3;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            z2 = true;
        } else {
            int i7 = IAuthTabCallback + 73;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i9 = onExtraCallback + 51;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 89;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-253690074, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormItemRow.<anonymous> (NativeAdsBpsLeadFormCard.kt:212)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-253690074, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormItemRow.<anonymous> (NativeAdsBpsLeadFormCard.kt:212)");
            }
            rightPreset.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, (setClickTrackingUrls.IAuthTabCallback) null, (setClickTrackingUrls.onNavigationEvent) null, false, function1, cameraCaptureResultEmptyCameraCaptureResult, (i << 18) & 3670016, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Boolean.valueOf(!zBooleanValue));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        boolean z = false;
        final String str = (String) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final Function1 function1 = (Function1) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i2 = 4;
        final int iIntValue = ((Number) objArr[4]).intValue();
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1471248366);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i4 = IAuthTabCallback + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 16 : 32;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 147) != 146, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 19;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1471248366, i, -1, "im.toss.ads_sdk.ui.compose.bps.LeadFormItemRow (NativeAdsBpsLeadFormCard.kt:197)");
            }
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnNavigationEvent = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onNavigationEvent(getViewTypeCount.onTransact.Companion.onNavigationEvent());
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1865830987, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    String str2 = str;
                    w5a w5aVar = (w5a) obj2;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if (i10 == 0) {
                        return WindowAreaControllerExternalSyntheticLambda0.onWarmupCompleted(str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    }
                    WindowAreaControllerExternalSyntheticLambda0.onWarmupCompleted(str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-253690074, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Unit unitOnExtraCallback;
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 19;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        unitOnExtraCallback = WindowAreaControllerExternalSyntheticLambda0.onExtraCallback(zBooleanValue, function1, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i10 = 54 / 0;
                    } else {
                        unitOnExtraCallback = WindowAreaControllerExternalSyntheticLambda0.onExtraCallback(zBooleanValue, function1, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    int i11 = onWarmupCompleted + 49;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            boolean z2 = (i & 896) == 256;
            if ((i & 112) == 32) {
                int i8 = onExtraCallback + 39;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z | z2)) {
                int i10 = onExtraCallback + 115;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda8
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = IAuthTabCallback + 121;
                            onNavigationEvent = i12 % 128;
                            if (i12 % 2 != 0) {
                                WindowAreaControllerExternalSyntheticLambda0.onExtraCallback(function1, zBooleanValue);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallback = WindowAreaControllerExternalSyntheticLambda0.onExtraCallback(function1, zBooleanValue);
                            int i13 = onNavigationEvent + 87;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                    obj2 = function0;
                }
                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, deviceQuirksExternalSyntheticLambda0OnNavigationEvent, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) obj2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1572870, 0, 57276);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = onExtraCallback + 61;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i13 = onExtraCallback + 55;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i15 = 2 % 2;
                    int i16 = onWarmupCompleted + 67;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnNavigationEvent = WindowAreaControllerExternalSyntheticLambda0.onNavigationEvent(str, zBooleanValue, function1, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i18 = IAuthTabCallback + 93;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, int i, boolean z) {
        Object[] objArr = {c0018onExtraCallback, liveDataObservableExternalSyntheticLambda1, Integer.valueOf(i), Boolean.valueOf(z)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -133045840, 133045840, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 165071914, -165071913, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, Function1 function1, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {c0018onExtraCallback, function1, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1421249604, 1421249610, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -772762117, 772762120, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private static final void onNavigationEvent(String str, boolean z, Function1<? super Boolean, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, Boolean.valueOf(z), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -57856656, 57856658, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private static final Unit IAuthTabCallback(Function1 function1, boolean z) {
        Object[] objArr = {function1, Boolean.valueOf(z)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -627336168, 627336173, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private static final Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.onExtraCallback.C0018onExtraCallback c0018onExtraCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {c0018onExtraCallback, quirksExternalSyntheticBackport0, function1, Boolean.valueOf(z), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1177947711, -1177947707, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }
}
