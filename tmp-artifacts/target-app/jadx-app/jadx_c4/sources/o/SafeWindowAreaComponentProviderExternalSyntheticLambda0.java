package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.RearDisplayPresentationSessionPresenterImpl;
import o.SafeWindowAreaComponentProviderExternalSyntheticLambda0;
import o.WebViewCompatExternalSyntheticLambda1;
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
public final class SafeWindowAreaComponentProviderExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1 = (WebViewCompatExternalSyntheticLambda1) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function2, iIntValue, webViewCompatExternalSyntheticLambda1);
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onNavigationEvent(266131167, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{num}, -266131165, iOnNavigationEvent2, iOnNavigationEvent);
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(function0, function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(function0, function1);
        int i3 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(ontransact, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 30 / 0;
        }
        int i6 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(ontransact, iAuthTabCallback, z, quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, function0, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(function0);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i3 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, boolean z, String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(ontransact, z, str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = ~i4;
        int i10 = ~i6;
        int i11 = i8 | (~(i9 | i10 | i));
        int i12 = (~(i6 | i9 | i)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i4 + i + i5 + (563899752 * i2) + (667302295 * i3);
        int i15 = i14 * i14;
        int i16 = ((i4 * 1426164010) - 416808960) + (1426164010 * i) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i5) + ((-1270874112) * i2) + (1914175488 * i3) + ((-1995833344) * i15);
        int i17 = (i4 * (-901935710)) + 144807674 + (i * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i5 * (-901935539)) + (i2 * 42244168) + (i3 * (-913566613)) + (i15 * (-1006501888));
        int i18 = i16 + (i17 * i17 * (-1006239744));
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 4) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 5) {
            return IAuthTabCallback(objArr);
        }
        Function0 function0 = (Function0) objArr[0];
        int i19 = 2 % 2;
        int i20 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i20 % 128;
        int i21 = i20 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(1671138912, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{function0}, -1671138909, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
        int i22 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i22 % 128;
        int i23 = i22 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(function1, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, i);
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.asBinder asbinder, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function0 function0, Function2 function2, boolean z, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(-130437291, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{asbinder, quirksExternalSyntheticBackport0, function1, function0, function2, Boolean.valueOf(z), function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, 130437292, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        } else {
            onNavigationEvent(-130437291, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{asbinder, quirksExternalSyntheticBackport0, function1, function0, function2, Boolean.valueOf(z), function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, 130437292, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.asBinder asbinder, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(asbinder, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(asbinder, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(ontransact, iAuthTabCallback, z, quirksExternalSyntheticBackport0, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 2 / 0;
        }
        int i8 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.asBinder asbinder, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function0 function0, Function2 function2, boolean z, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(asbinder, quirksExternalSyntheticBackport0, function1, function0, function2, z, function12, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {ontransact, iAuthTabCallback, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i4 != 0) {
            return (Unit) onNavigationEvent(534844650, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -534844646, iOnNavigationEvent2, iOnNavigationEvent);
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, boolean z, String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(ontransact, z, str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(ontransact, z, str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.asBinder asbinder, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                    i3 = 4;
                } else {
                    int i7 = onExtraCallbackWithResult + 81;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i9 % 128;
            z = i9 % 2 == 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1972106763, i2, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCard.<anonymous>.<anonymous> (NativeAdsBpsMultiListCard.kt:51)");
                int i10 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            }
            areAllItemsEnabled.onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1975818925, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{areallitemsenabled, SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(asbinder.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 18) & 3670016), 62}, -1975818925);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i12 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i5 % 128;
        boolean z = true;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w0aVar, "");
            if ((i & 59) == 0) {
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w0aVar)) {
                    i2 = 2;
                } else {
                    int i6 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w0aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i8 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 / 3;
            }
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-332658127, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsMultiListCard.kt:53)");
                    int i11 = 2 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-332658127, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsMultiListCard.kt:53)");
                }
            }
            w0aVar.IAuthTabCallback(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 458752 & (i3 << 15), 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function2 function2, int i, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webViewCompatExternalSyntheticLambda1, "");
            function2.invoke(Integer.valueOf(i), webViewCompatExternalSyntheticLambda1);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(webViewCompatExternalSyntheticLambda1, "");
        function2.invoke(Integer.valueOf(i), webViewCompatExternalSyntheticLambda1);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(Function0 function0, Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (function0 != null) {
            function0.invoke();
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            function1.invoke((Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4 A[PHI: r18
      0x00e4: PHI (r18v11 int) = (r18v0 int), (r18v3 int), (r18v4 int) binds: [B:56:0x00e2, B:63:0x00f4, B:62:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda10, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i9;
        int i10;
        Object obj;
        final Function2 function2;
        final boolean z;
        final Function1 function1;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String str;
        boolean z2;
        getBacktraceNote getbacktracenote;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        boolean z3;
        String strOnExtraCallback;
        final RearDisplayPresentationSessionPresenterImpl.asBinder asbinder = (RearDisplayPresentationSessionPresenterImpl.asBinder) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[1];
        final Function1 function12 = (Function1) objArr[2];
        final Function0 function0 = (Function0) objArr[3];
        final Function2 function22 = (Function2) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        Function1 function13 = (Function1) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(asbinder, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1963211347);
        if ((iIntValue & 6) != 0) {
            i = iIntValue;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(asbinder)) {
            int i12 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2 != 0 ? 2 : 4;
            i = i13 | iIntValue;
        }
        int i14 = iIntValue2 & 2;
        if (i14 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3) ? 32 : 16;
        }
        int i15 = iIntValue2 & 4;
        if (i15 == 0) {
            if ((iIntValue & 384) == 0) {
                int i16 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                    int i18 = onNavigationEvent + 109;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    i2 = 256;
                } else {
                    i2 = 128;
                }
                i3 = i2 | i;
            }
            i4 = iIntValue2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((iIntValue & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
            }
            i5 = iIntValue2 & 16;
            if (i5 != 0) {
                if ((iIntValue & 24576) == 0) {
                    i6 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 16384 : 8192) | i3;
                }
                i7 = iIntValue2 & 32;
                int i20 = 196608;
                if (i7 != 0) {
                    i6 |= i20;
                } else if ((iIntValue & 196608) == 0) {
                    i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 131072 : 65536;
                    i6 |= i20;
                }
                i8 = iIntValue2 & 64;
                if (i8 == 0) {
                    if ((iIntValue & 1572864) == 0) {
                        int i21 = onExtraCallbackWithResult + 47;
                        onextracallback = onextracallback3;
                        onNavigationEvent = i21 % 128;
                        if (i21 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13);
                            throw null;
                        }
                        i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 1048576 : 524288;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i6) == 599186, i6 & 1)) {
                        i9 = iIntValue;
                        i10 = iIntValue2;
                        obj = null;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        function2 = function22;
                        z = zBooleanValue;
                        function1 = function13;
                        onextracallback2 = onextracallback;
                    } else {
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
                        if (i15 != 0) {
                            ?? OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            Function1 function14 = OnMinimized;
                            if (OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function1 function15 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda6
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj2) {
                                        int i22 = 2 % 2;
                                        int i23 = onWarmupCompleted + 113;
                                        IAuthTabCallback = i23 % 128;
                                        Integer num = (Integer) obj2;
                                        if (i23 % 2 != 0) {
                                            return SafeWindowAreaComponentProviderExternalSyntheticLambda0.IAuthTabCallback(num);
                                        }
                                        SafeWindowAreaComponentProviderExternalSyntheticLambda0.IAuthTabCallback(num);
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function15);
                                function14 = function15;
                            }
                            function12 = function14;
                        }
                        if (i4 != 0) {
                            function0 = null;
                        }
                        if (i5 != 0) {
                            int i22 = onNavigationEvent + 61;
                            onExtraCallbackWithResult = i22 % 128;
                            int i23 = i22 % 2;
                            function22 = null;
                        }
                        if (i7 != 0) {
                            zBooleanValue = true;
                        }
                        if (i8 != 0) {
                            int i24 = onExtraCallbackWithResult + 123;
                            onNavigationEvent = i24 % 128;
                            if (i24 % 2 != 0) {
                                int i25 = 70 / 0;
                            }
                            function13 = null;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1963211347, i6, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCard (NativeAdsBpsMultiListCard.kt:33)");
                        }
                        String strOnExtraCallbackWithResult = asbinder.onExtraCallbackWithResult();
                        String strOnWarmupCompleted = asbinder.onWarmupCompleted();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback4, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 0.0f, 0.0f, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onExtraCallback(!(strOnWarmupCompleted == null || StringsKt.isBlank(strOnWarmupCompleted)), strOnExtraCallbackWithResult != null, asbinder.onNavigationEvent()), 7, (Object) null);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback5 = onextracallback4;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        i10 = iIntValue2;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                            i9 = iIntValue;
                            int i26 = onNavigationEvent + 105;
                            str = strOnWarmupCompleted;
                            onExtraCallbackWithResult = i26 % 128;
                            int i27 = i26 % 2;
                        } else {
                            str = strOnWarmupCompleted;
                            i9 = iIntValue;
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
                        if (StringsKt.isBlank(asbinder.IAuthTabCallback()) && ((strOnExtraCallback = asbinder.onExtraCallback()) == null || StringsKt.isBlank(strOnExtraCallback))) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1258946309);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            z2 = true;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1258456850);
                            wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback = wa.IAuthTabCallback.Companion.onExtraCallback();
                            final String strOnExtraCallback2 = asbinder.onExtraCallback();
                            if (strOnExtraCallback2 == null) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1258637734);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                z2 = true;
                                getbacktracenote = null;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1258637735);
                                z2 = true;
                                getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-332658127, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda7
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        int i28 = 2 % 2;
                                        int i29 = onNavigationEvent + 123;
                                        onExtraCallbackWithResult = i29 % 128;
                                        int i30 = i29 % 2;
                                        Unit unitOnNavigationEvent = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallback2, (w0a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                        int i31 = onNavigationEvent + 21;
                                        onExtraCallbackWithResult = i31 % 128;
                                        int i32 = i31 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                getbacktracenote = getbacktracenoteOnExtraCallback;
                            }
                            w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1972106763, z2, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda8
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    Unit unitOnNavigationEvent;
                                    int i28 = 2 % 2;
                                    int i29 = IAuthTabCallback + 69;
                                    onExtraCallbackWithResult = i29 % 128;
                                    if (i29 % 2 != 0) {
                                        unitOnNavigationEvent = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(asbinder, (areAllItemsEnabled) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                        int i30 = 2 / 0;
                                    } else {
                                        unitOnNavigationEvent = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(asbinder, (areAllItemsEnabled) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    }
                                    int i31 = IAuthTabCallback + 73;
                                    onExtraCallbackWithResult = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        int i32 = 3 / 0;
                                    }
                                    return unitOnNavigationEvent;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, iAuthTabCallbackOnExtraCallback, 0.9f, wa.onNavigationEvent.Bottom, getbacktracenote, (wa.IAuthTabCallbackStub) null, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.IAuthTabCallback(), (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100887558, 0, 3718);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1980275210);
                        final int i28 = 0;
                        for (Object obj2 : asbinder.asBinder()) {
                            if (i28 < 0) {
                                int i29 = onNavigationEvent + 95;
                                onExtraCallbackWithResult = i29 % 128;
                                int i30 = i29 % 2;
                                CollectionsKt.throwIndexOverflow();
                            }
                            RearDisplayPresentationSessionPresenterImpl.onTransact ontransact = (RearDisplayPresentationSessionPresenterImpl.onTransact) obj2;
                            RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = asbinder.onNavigationEvent();
                            if (function22 != null) {
                                int i31 = onExtraCallbackWithResult + 95;
                                onNavigationEvent = i31 % 128;
                                int i32 = i31 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1250894584);
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback6 = QuirksExternalSyntheticBackport0.Companion;
                                Object objOnTransact = ontransact.onTransact();
                                if (objOnTransact == null) {
                                    objOnTransact = Integer.valueOf(i28);
                                }
                                boolean z4 = (57344 & i6) == 16384 ? z2 : false;
                                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i28);
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if ((z4 | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda9
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallback = 1;

                                        public final Object invoke(Object obj3) {
                                            int i33 = 2 % 2;
                                            int i34 = IAuthTabCallback + 59;
                                            onExtraCallback = i34 % 128;
                                            Object obj4 = null;
                                            if (i34 % 2 == 0) {
                                                Function2 function23 = function22;
                                                Integer numValueOf = Integer.valueOf(i28);
                                                int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                                                int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                                                throw null;
                                            }
                                            Function2 function24 = function22;
                                            Integer numValueOf2 = Integer.valueOf(i28);
                                            int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                                            int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                                            Unit unit = (Unit) SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(1113704907, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{function24, numValueOf2, (WebViewCompatExternalSyntheticLambda1) obj3}, -1113704907, iOnNavigationEvent4, iOnNavigationEvent3);
                                            int i35 = onExtraCallback + 15;
                                            IAuthTabCallback = i35 % 128;
                                            if (i35 % 2 == 0) {
                                                return unit;
                                            }
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                quirksExternalSyntheticBackport0OnExtraCallback = PageImplExternalSyntheticLambda0.onExtraCallback(onextracallback6, objOnTransact, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1250762214);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                quirksExternalSyntheticBackport0OnExtraCallback = QuirksExternalSyntheticBackport0.Companion;
                            }
                            if (function13 == null || (quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) function13.invoke(Integer.valueOf(i28))) == null) {
                                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(quirksExternalSyntheticBackport0);
                            if ((i6 & 896) == 256) {
                                int i33 = onNavigationEvent + 37;
                                onExtraCallbackWithResult = i33 % 128;
                                z3 = i33 % 2 != 0;
                            }
                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i28);
                            Function0 function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z3 | zOnExtraCallback2) || function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                function0OnMinimized = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda10
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke() {
                                        int i34 = 2 % 2;
                                        int i35 = onWarmupCompleted + 25;
                                        IAuthTabCallback = i35 % 128;
                                        int i36 = i35 % 2;
                                        Unit unitOnNavigationEvent = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(function12, i28);
                                        int i37 = onWarmupCompleted + 1;
                                        IAuthTabCallback = i37 % 128;
                                        if (i37 % 2 != 0) {
                                            return unitOnNavigationEvent;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((Object) function0OnMinimized);
                            }
                            onExtraCallbackWithResult(ontransact, iAuthTabCallbackOnNavigationEvent, zBooleanValue, quirksExternalSyntheticBackport0OnExtraCallback3, function0OnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 >> 9) & 896, 0);
                            i28++;
                            z2 = true;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        if (strOnExtraCallbackWithResult != null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1259716659);
                            hasProvider hasproviderOnNavigationEvent = SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(strOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            boolean z5 = (i6 & 7168) == 2048;
                            boolean z6 = (i6 & 896) == 256;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z6 | z5)) {
                                Object obj3 = objOnMinimized2;
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function02 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda11
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke() {
                                            int i34 = 2 % 2;
                                            int i35 = onWarmupCompleted + 63;
                                            IAuthTabCallback = i35 % 128;
                                            int i36 = i35 % 2;
                                            Unit unitIAuthTabCallback = SafeWindowAreaComponentProviderExternalSyntheticLambda0.IAuthTabCallback(function0, function12);
                                            int i37 = IAuthTabCallback + 17;
                                            onWarmupCompleted = i37 % 128;
                                            int i38 = i37 % 2;
                                            return unitIAuthTabCallback;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                    obj3 = function02;
                                }
                                WebViewRenderProcessClientAdapterExternalSyntheticLambda1.onNavigationEvent(hasproviderOnNavigationEvent, null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1259887717);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        obj = null;
                        RequiresWindowSdkExtension.onExtraCallbackWithResult(str, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        function2 = function22;
                        z = zBooleanValue;
                        function1 = function13;
                        onextracallback2 = onextracallback5;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        final int i34 = i9;
                        final int i35 = i10;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda12
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj4, Object obj5) {
                                int i36 = 2 % 2;
                                int i37 = onExtraCallbackWithResult + 41;
                                onExtraCallback = i37 % 128;
                                int i38 = i37 % 2;
                                Unit unitOnWarmupCompleted = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onWarmupCompleted(asbinder, onextracallback2, function12, function0, function2, z, function1, i34, i35, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                int i39 = onExtraCallback + 85;
                                onExtraCallbackWithResult = i39 % 128;
                                int i40 = i39 % 2;
                                return unitOnWarmupCompleted;
                            }
                        });
                    }
                    return obj;
                }
                i6 |= 1572864;
                onextracallback = onextracallback3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i6) == 599186, i6 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return obj;
            }
            i3 |= 24576;
            i6 = i3;
            i7 = iIntValue2 & 32;
            int i202 = 196608;
            if (i7 != 0) {
            }
            i8 = iIntValue2 & 64;
            if (i8 == 0) {
            }
            onextracallback = onextracallback3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i6) == 599186, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return obj;
        }
        i |= 384;
        i3 = i;
        i4 = iIntValue2 & 8;
        if (i4 == 0) {
        }
        i5 = iIntValue2 & 16;
        if (i5 != 0) {
        }
        i6 = i3;
        i7 = iIntValue2 & 32;
        int i2022 = 196608;
        if (i7 != 0) {
        }
        i8 = iIntValue2 & 64;
        if (i8 == 0) {
        }
        onextracallback = onextracallback3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i6) == 599186, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z;
        RearDisplayPresentationSessionPresenterImpl.onTransact ontransact = (RearDisplayPresentationSessionPresenterImpl.onTransact) objArr[0];
        RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback = (RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback) objArr[1];
        w3b w3bVar = (w3b) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i4 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 38 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1622257064, iIntValue, -1, "im.toss.ads_sdk.ui.compose.bps.MultiListProductRow.<anonymous> (NativeAdsBpsMultiListCard.kt:97)");
                }
                RearDisplaySessionImpl.onNavigationEvent(w3bVar, ontransact.IAuthTabCallback(), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i8 = onNavigationEvent + 19;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i9 == 0) {
                        throw null;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                RearDisplaySessionImpl.onNavigationEvent(w3bVar, ontransact.IAuthTabCallback(), iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 14);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1790106587, i, -1, "im.toss.ads_sdk.ui.compose.bps.MultiListProductRow.<anonymous>.<anonymous> (NativeAdsBpsMultiListCard.kt:101)");
                    int i5 = onNavigationEvent + 17;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(ontransact.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), 0L, (handshake) null, 2, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, AppLovinVastMediaViewf.Companion.onNavigationEvent(), false, GraphicDeviceInfo.Companion.asBinder(), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 12607488, 1597440, 180070);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = onExtraCallbackWithResult + 115;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(ontransact.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesImplBaseParcelizer(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), 0L, (handshake) null, 2, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, AppLovinVastMediaViewf.Companion.onNavigationEvent(), false, GraphicDeviceInfo.Companion.asBinder(), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 12607488, 1597440, 180070);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, boolean z, String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1286581092, i, -1, "im.toss.ads_sdk.ui.compose.bps.MultiListProductRow.<anonymous>.<anonymous> (NativeAdsBpsMultiListCard.kt:111)");
            }
            WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(ontransact.onExtraCallback(), z, null, str, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 81 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, final boolean z, final String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i6 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i6 % 128;
                i2 = i6 % 2 != 0 ? 3 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i7 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i9 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(576686515, i, -1, "im.toss.ads_sdk.ui.compose.bps.MultiListProductRow.<anonymous> (NativeAdsBpsMultiListCard.kt:99)");
                    int i12 = 36 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(576686515, i, -1, "im.toss.ads_sdk.ui.compose.bps.MultiListProductRow.<anonymous> (NativeAdsBpsMultiListCard.kt:99)");
                }
            }
            w5aVar.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1790106587, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 87;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    RearDisplayPresentationSessionPresenterImpl.onTransact ontransact2 = ontransact;
                    RowScope rowScope = (RowScope) obj;
                    if (i15 != 0) {
                        return SafeWindowAreaComponentProviderExternalSyntheticLambda0.IAuthTabCallback(ontransact2, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    SafeWindowAreaComponentProviderExternalSyntheticLambda0.IAuthTabCallback(ontransact2, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1286581092, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda14
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 115;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnExtraCallbackWithResult = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onExtraCallbackWithResult(ontransact, z, str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i16 = IAuthTabCallback + 59;
                    onExtraCallbackWithResult = i16 % 128;
                    if (i16 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, final Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i5 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1280013280, i2, -1, "im.toss.ads_sdk.ui.compose.bps.MultiListProductRow.<anonymous>.<anonymous> (NativeAdsBpsMultiListCard.kt:121)");
                int i7 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i9 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = onExtraCallbackWithResult + 39;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr = {function0};
                            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                            Unit unit = (Unit) SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(699263603, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -699263598, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
                            int i14 = onExtraCallbackWithResult + 47;
                            IAuthTabCallback = i14 % 128;
                            int i15 = i14 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj = function02;
                }
                rightPreset.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, iAuthTabCallbackOnNavigationEvent, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, (Function0) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 384, (i2 << 3) & 112, 1018);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, final RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, final boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getBacktraceNote getbacktracenote;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(234595152);
        if ((i & 6) == 0) {
            i3 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i8 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                int i10 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                int i12 = onNavigationEvent + 3;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                    int i14 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) == 9362) {
                int i16 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i18 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 80 / 0;
                    quirksExternalSyntheticBackport03 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                } else if (i9 != 0) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(234595152, i3, -1, "im.toss.ads_sdk.ui.compose.bps.MultiListProductRow (NativeAdsBpsMultiListCard.kt:91)");
                }
                final String strOnWarmupCompleted = ontransact.onWarmupCompleted();
                final String strOnExtraCallbackWithResult = ontransact.onExtraCallbackWithResult();
                if (!(!StringsKt.isBlank(strOnExtraCallbackWithResult))) {
                    strOnExtraCallbackWithResult = null;
                }
                if (strOnExtraCallbackWithResult == null) {
                    int i20 = onExtraCallbackWithResult + 95;
                    onNavigationEvent = i20 % 128;
                    if (i20 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(913634576);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(913634576);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    getbacktracenote = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(913634577);
                    getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1280013280, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i21 = 2 % 2;
                            int i22 = onNavigationEvent + 105;
                            IAuthTabCallback = i22 % 128;
                            int i23 = i22 % 2;
                            Unit unitOnExtraCallbackWithResult = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onExtraCallbackWithResult(strOnExtraCallbackWithResult, function0, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i24 = IAuthTabCallback + 45;
                            onNavigationEvent = i24 % 128;
                            if (i24 % 2 == 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    getbacktracenote = getbacktracenoteOnExtraCallback;
                }
                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onNavigationEvent(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{null, 1, null}, 1043637404, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -1043637404, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(576686515, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i21 = 2 % 2;
                        int i22 = onWarmupCompleted + 15;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        RearDisplayPresentationSessionPresenterImpl.onTransact ontransact2 = ontransact;
                        boolean z3 = z;
                        String str = strOnWarmupCompleted;
                        w5a w5aVar = (w5a) obj;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (i23 == 0) {
                            SafeWindowAreaComponentProviderExternalSyntheticLambda0.onWarmupCompleted(ontransact2, z3, str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onWarmupCompleted(ontransact2, z3, str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                        int i24 = onExtraCallbackWithResult + 1;
                        onWarmupCompleted = i24 % 128;
                        if (i24 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(1622257064, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i21 = 2 % 2;
                        int i22 = onNavigationEvent + 65;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        Unit unitOnWarmupCompleted = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onWarmupCompleted(ontransact, iAuthTabCallback, (w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i24 = onExtraCallbackWithResult + 33;
                        onNavigationEvent = i24 % 128;
                        int i25 = i24 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                boolean z3 = (57344 & i3) == 16384;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z3) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function02 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda4
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i21 = 2 % 2;
                                int i22 = onExtraCallbackWithResult + 77;
                                onNavigationEvent = i22 % 128;
                                int i23 = i22 % 2;
                                Unit unitOnExtraCallbackWithResult = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onExtraCallbackWithResult(function0);
                                int i24 = onNavigationEvent + 111;
                                onExtraCallbackWithResult = i24 % 128;
                                if (i24 % 2 != 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                        obj = function02;
                    }
                    w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport03, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, getbacktracenote, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 3) & 896) | 3078, 0, 57264);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i21 = onExtraCallbackWithResult + 5;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsMultiListCardKt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        Unit unitOnNavigationEvent;
                        int i23 = 2 % 2;
                        int i24 = onExtraCallback + 125;
                        onNavigationEvent = i24 % 128;
                        if (i24 % 2 == 0) {
                            unitOnNavigationEvent = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(ontransact, iAuthTabCallback, z, quirksExternalSyntheticBackport04, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i25 = 73 / 0;
                        } else {
                            unitOnNavigationEvent = SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(ontransact, iAuthTabCallback, z, quirksExternalSyntheticBackport04, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i26 = onNavigationEvent + 51;
                        onExtraCallback = i26 % 128;
                        if (i26 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, int i, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        Object[] objArr = {function2, Integer.valueOf(i), webViewCompatExternalSyntheticLambda1};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(1113704907, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -1113704907, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(699263603, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{function0}, -699263598, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(Function0 function0) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(1671138912, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{function0}, -1671138909, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.onTransact ontransact, RearDisplayPresentationSessionPresenterImpl.IAuthTabCallback iAuthTabCallback, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {ontransact, iAuthTabCallback, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(534844650, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -534844646, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }

    public static final void IAuthTabCallback(@NotNull RearDisplayPresentationSessionPresenterImpl.asBinder asbinder, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<? super Integer, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function2, boolean z, @Nullable Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {asbinder, quirksExternalSyntheticBackport0, function1, function0, function2, Boolean.valueOf(z), function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(-130437291, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 130437292, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(Integer num) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(266131167, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{num}, -266131165, iOnNavigationEvent2, iOnNavigationEvent);
    }
}
