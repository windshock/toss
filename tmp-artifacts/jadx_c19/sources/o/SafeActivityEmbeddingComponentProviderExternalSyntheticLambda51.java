package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.appsintoss.R;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51;
import o.getSupportedHighSpeedResolutionsFor;
import o.getViewTypeCount;
import o.initSDK;
import o.setCacheComposition;
import o.setCallToAction;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.w5a;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51 {
    private static final byte[] $$a = {15, 58, -59};
    private static final int $$b = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int onExtraCallback = -1776194565;
    private static char onNavigationEvent = 23664;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, short s) {
        int i3;
        byte[] bArr = $$a;
        int i4 = i2 + 109;
        int i5 = s * 4;
        int i6 = 3 - (b * 2);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i6;
            i4 = i7;
            int i9 = 0;
            i4 += i6;
            i6 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i3 + 1;
            i8 = i6;
            i6 = bArr[i6];
            i9 = i10;
            i4 += i6;
            i6 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) throws Throwable {
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i8 | i4)) | (~(i8 | i9));
        int i11 = ~i4;
        int i12 = (~(i2 | i11 | i3)) | i10;
        int i13 = ~(i9 | i11);
        int i14 = i4 + i3 + i5 + ((-1228711472) * i7) + ((-141981132) * i6);
        int i15 = i14 * i14;
        int i16 = (((-639131287) * i4) - 2072313856) + (1118068377 * i3) + (i12 * (-1268883816)) + ((-1757199664) * i10) + ((-1268883816) * i13) + ((-1908015104) * i5) + ((-287309824) * i7) + ((-1573388288) * i6) + ((-2138374144) * i15);
        int i17 = ((i4 * (-646461497)) - 273503129) + (i3 * (-646460521)) + (i12 * 488) + (i10 * (-976)) + (i13 * 488) + (i5 * (-646461009)) + (i7 * 1623110960) + (i6 * (-2035004020)) + (i15 * 33882112);
        int i18 = i16 + (i17 * i17 * (-1051394048));
        if (i18 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
            ((Number) objArr[2]).intValue();
            int i19 = 2 % 2;
            int i20 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
            onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
            Unit unit = Unit.INSTANCE;
            int i22 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            return unit;
        }
        if (i18 != 2) {
            return i18 != 3 ? i18 != 4 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
        }
        String str = (String) objArr[0];
        List list = (List) objArr[1];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[2];
        int i24 = 2 % 2;
        int i25 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i25 % 128;
        int i26 = i25 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, list, onnavigationevent);
        int i27 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i27 % 128;
        int i28 = i27 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str);
        int i5 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Integer numValueOf = Integer.valueOf(i2);
        Integer numValueOf2 = Integer.valueOf(i3);
        if (i6 != 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback5 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback6 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(iIAuthTabCallback4, 1925893159, -1925893158, iIAuthTabCallback5, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, iIAuthTabCallback6);
        int i7 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, List list, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, list, function1, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(function1, getsupportedhighspeedresolutionsfor);
        }
        onWarmupCompleted(function1, getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, List list, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, list, function1, getsupportedhighspeedresolutionsfor);
        int i5 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), function1, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        Unit unit = (Unit) IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -291043596, 291043596, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i8 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 53 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, zBooleanValue, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, str);
        if (i4 == 0) {
            int i5 = 37 / 0;
        }
        int i6 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, List list, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        String strIntern;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (Intrinsics.areEqual(str, list.get(0))) {
            int i3 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            strIntern = "not_delivered";
        } else if (Intrinsics.areEqual(str, list.get(1))) {
            strIntern = "duplicate_payment";
        } else if (Intrinsics.areEqual(str, list.get(2))) {
            strIntern = "not_needed";
        } else if (!(!Intrinsics.areEqual(str, list.get(3)))) {
            strIntern = "other_person";
        } else if (Intrinsics.areEqual(str, list.get(4))) {
            int i5 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            strIntern = "etc";
        } else {
            Object[] objArr = new Object[1];
            a((char) ((Process.getThreadPriority(0) + 20) >> 6), (-1758754442) - (Process.myTid() >> 22), new char[]{12527, 4948, 56652, 20, 18789, 38123, 63177}, new char[]{0, 0, 0, 0}, new char[]{30463, 11145, 11671, 8058}, objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        onnavigationevent.onExtraCallback("reason_type", strIntern);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i5 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i7 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-373269832, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:81)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-373269832, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:81)");
            }
            w5aVar.onExtraCallbackWithResult(str, new getHumanReadableName(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i3 << 6) & 896, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i11 == 0) {
                    int i12 = 1 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, List list, Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        if (Intrinsics.areEqual(str, CollectionsKt.last(list))) {
            onNavigationEvent(getsupportedhighspeedresolutionsfor, !onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor));
            int i3 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final String str, final List list, final Function1 function1, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1811436933, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:78)");
                    int i7 = 13 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1811436933, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:78)");
                }
            }
            getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = onnavigationevent.onNavigationEvent();
            getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent2 = onnavigationevent.onNavigationEvent();
            getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-373269832, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 51;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onExtraCallback(str, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onExtraCallback(str, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = onNavigationEvent + 27;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda3
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 55;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onNavigationEvent(str, list, function1, getsupportedhighspeedresolutionsfor);
                            int i11 = onWarmupCompleted + 91;
                            onNavigationEvent = i11 % 128;
                            if (i11 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, onextracallbackOnNavigationEvent, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, onextracallbackOnNavigationEvent2, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactOnNavigationEvent, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 1575942, 384, 110518);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 59;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int edgeSlop = 43 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int threadPriority = 1451 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b = (byte) ($$b & 7);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, edgeSlop, threadPriority, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16728093) - Color.rgb(0, 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 44, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 23972), 50 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45848), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 53;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onWarmupCompleted(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            function1.invoke((String) IAuthTabCallback(iIAuthTabCallback, -119031686, 119031690, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3));
            unit = Unit.INSTANCE;
            int i4 = 67 / 0;
        } else {
            int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback5 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback6 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            function1.invoke((String) IAuthTabCallback(iIAuthTabCallback4, -119031686, 119031690, iIAuthTabCallback5, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback6));
            unit = Unit.INSTANCE;
        }
        int i5 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(final Function1 function1, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object obj;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-564929597, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContent.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailRefundContent.kt:97)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
        String str = (String) IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -119031686, 119031690, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                    String str2 = (String) obj2;
                    if (i6 != 0) {
                        return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onWarmupCompleted(getsupportedhighspeedresolutionsfor2, str2);
                    }
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onWarmupCompleted(getsupportedhighspeedresolutionsfor2, str2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        setDefaultFontFileExtension.onWarmupCompleted(str, (Function1) objOnMinimized2, new setCacheComposition.IAuthTabCallbackStub.onWarmupCompleted((setCacheComposition.onTransact) null, (setCacheComposition.onNavigationEvent) null, 3, (DefaultConstructorMarker) null), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), 0.0f, 1, (Object) null), (setCacheComposition.onExtraCallback) null, (Function0) null, (getBacktraceNote) null, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48.IAuthTabCallback.onNavigationEvent(), false, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (setCacheComposition.IAuthTabCallbackDefault) null, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, (CameraUnavailableException) null, (CameraState) null, false, false, false, 0, 0, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, cameraCaptureResultEmptyCameraCaptureResult, 12586416, 0, 0, 134217584);
        String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_etc_cta, cameraCaptureResultEmptyCameraCaptureResult, 0);
        Object obj2 = null;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), 7, (Object) null), 0.0f, 1, (Object) null);
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = setCallToAction.IAuthTabCallback.Companion.onWarmupCompleted();
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i4 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                onwarmupcompleted.onExtraCallback();
                obj2.hashCode();
                throw null;
            }
            obj = objOnMinimized3;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                Function0 function0 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 25;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        Object[] objArr = {function1, getsupportedhighspeedresolutionsfor};
                        Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1615686849, 1615686852, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                        int i8 = onExtraCallbackWithResult + 1;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                obj = function0;
            }
        }
        setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallback, iAuthTabCallbackOnWarmupCompleted, null, null, null, (Function0) obj, null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 432, 952}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        Function1<? super String, Unit> function12;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final Function1<? super String, Unit> function13 = function1;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1685260171);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i2 & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 == 0) {
            if ((i2 & 48) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i11 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                int i13 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 2 / 0;
                    i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 256 : 128;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13)) {
                }
                i4 |= i7;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 147) == 146, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                function12 = function13;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                z3 = z2;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                boolean z4 = i10 != 0 ? false : z2;
                if (i6 != 0) {
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda4
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i15 = 2 % 2;
                                int i16 = onExtraCallbackWithResult + 27;
                                onWarmupCompleted = i16 % 128;
                                int i17 = i16 % 2;
                                Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.IAuthTabCallback((String) obj);
                                int i18 = onWarmupCompleted + 19;
                                onExtraCallbackWithResult = i18 % 128;
                                if (i18 % 2 == 0) {
                                    return unitIAuthTabCallback;
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    function13 = (Function1) objOnMinimized;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1685260171, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContent (InAppPurchaseHistoryDetailRefundContent.kt:37)");
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(quirksExternalSyntheticBackport04, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
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
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda48.IAuthTabCallback.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 432, 10234);
                final List<String> listListOf = CollectionsKt.listOf(new String[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_reason_item_not_delivered, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_reason_duplicate_charge, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_reason_unused_no_longer_needed, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_reason_unauthorized_or_minor, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_reason_other, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)});
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1099915838);
                for (final String str : listListOf) {
                    int i15 = IAuthTabCallback + 45;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    accessisMonitoringp accessismonitoringp = (accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -444290187, 444290201, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(listListOf);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj) {
                                Unit unit;
                                int i17 = 2 % 2;
                                int i18 = IAuthTabCallback + 59;
                                onNavigationEvent = i18 % 128;
                                if (i18 % 2 != 0) {
                                    Object[] objArr = {str, listListOf, (initSDK.onNavigationEvent) obj};
                                    unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 689973746, -689973744, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                    int i19 = 61 / 0;
                                } else {
                                    Object[] objArr2 = {str, listListOf, (initSDK.onNavigationEvent) obj};
                                    unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 689973746, -689973744, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                }
                                int i20 = onNavigationEvent + 31;
                                IAuthTabCallback = i20 % 128;
                                int i21 = i20 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    setPostviewFormatSelector.onNavigationEvent(accessismonitoringp.onExtraCallback((Function1) objOnMinimized3), ForwardingCameraControl.onExtraCallback(-1811436933, true, new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda6
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            Unit unitOnExtraCallbackWithResult;
                            int i17 = 2 % 2;
                            int i18 = IAuthTabCallback + 89;
                            onWarmupCompleted = i18 % 128;
                            if (i18 % 2 != 0) {
                                unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onExtraCallbackWithResult(str, listListOf, function13, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i19 = 18 / 0;
                            } else {
                                unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onExtraCallbackWithResult(str, listListOf, function13, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            int i20 = onWarmupCompleted + 89;
                            IAuthTabCallback = i20 % 128;
                            int i21 = i20 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                setVerticalGravity.IAuthTabCallback(lowLightBoostControlExternalSyntheticLambda0, onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) || z4, (QuirksExternalSyntheticBackport0) null, (ResourceManagerInternalResourceManagerHooks) null, (SearchView) null, (String) null, ForwardingCameraControl.onExtraCallback(-564929597, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i17 = 2 % 2;
                        int i18 = onExtraCallback + 83;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        Function1 function14 = function13;
                        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) obj;
                        if (i19 == 0) {
                            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onWarmupCompleted(function14, sethorizontalgravity, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onWarmupCompleted(function14, sethorizontalgravity, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1572870, 30);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                function12 = function13;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                z3 = z4;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final Function1<? super String, Unit> function14 = function12;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = 2 % 2;
                        int i20 = onExtraCallback + 79;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onNavigationEvent(quirksExternalSyntheticBackport03, z3, function14, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i22 = IAuthTabCallback + 125;
                        onExtraCallback = i22 % 128;
                        int i23 = i22 % 2;
                        return unitOnNavigationEvent;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        int i19 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i19 % 128;
        int i20 = i19 % 2;
        z2 = z;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 147) == 146, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1174780911);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1174780911);
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i2 != 0, i2 & 1))) {
            int i7 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1174780911, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailScreenPreview (InAppPurchaseHistoryDetailRefundContent.kt:136)");
            }
            onNavigationEvent(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), true, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i3 = IAuthTabCallback + 73;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailRefundContentKt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 71;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda51.onExtraCallback(i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i14 = onExtraCallbackWithResult + 41;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                int i11 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
            }
            i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        i3 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i13 = i3 % 2;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        i4 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i5 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        int i6 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        return zBooleanValue;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i5 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, -1615686849, 1615686852, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{function1, getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, List list, initSDK.onNavigationEvent onnavigationevent) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(iIAuthTabCallback, 689973746, -689973744, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{str, list, onnavigationevent}, iIAuthTabCallback3);
    }

    private static final String IAuthTabCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (String) IAuthTabCallback(iIAuthTabCallback, -119031686, 119031690, iIAuthTabCallback2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iIAuthTabCallback3);
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), function1, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -291043596, 291043596, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1925893159, -1925893158, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }
}
