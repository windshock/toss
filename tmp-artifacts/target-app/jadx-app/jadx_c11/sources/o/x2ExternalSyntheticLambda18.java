package o;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import o.AUTextView;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.readFully;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda18;
import o.x2ExternalSyntheticLambda19;
import o.x2ExternalSyntheticLambda21;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda18 {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    public static final x2ExternalSyntheticLambda18 onWarmupCompleted = new x2ExternalSyntheticLambda18();
    private static getBacktraceNote<x2ExternalSyntheticLambda21, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1387434611, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda2
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                x2ExternalSyntheticLambda18.onWarmupCompleted(x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda18.onWarmupCompleted(x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<x2ExternalSyntheticLambda21, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-104528847, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = x2ExternalSyntheticLambda18.onNavigationEvent((x2ExternalSyntheticLambda21) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(1409502535, false, new Function2() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda4
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda18.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface();
        int i4 = onExtraCallbackWithResult + 111;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {list, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        if (i4 == 0) {
            return (Unit) onNavigationEvent(-1212377942, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, 1212377946, objArr, iOnExtraCallback3);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000();
        int i4 = onExtraCallbackWithResult + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit onExtraCallback(List list, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {list, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(-122296733, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, 122296735, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback());
        int i5 = onTransact + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor();
        int i4 = onTransact + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 103;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9, types: [im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda5, java.lang.Object] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        boolean z;
        boolean z2;
        boolean z3;
        int i7 = ~((~i5) | i);
        int i8 = ~i4;
        int i9 = i7 | (~(i8 | i));
        int i10 = ~i;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i5);
        int i13 = (~(i8 | i5)) | i11 | i12;
        int i14 = (~(i4 | i10)) | i12;
        int i15 = i5 + i + i3 + (1039959776 * i6) + ((-2046201414) * i2);
        int i16 = i15 * i15;
        int i17 = ((i5 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (868239597 * i3) + (817356128 * i6) + (406493490 * i2) + (i16 * 645267456);
        int i18 = ((357140864 * i5) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i3) + ((-201326592) * i6) + ((-406847488) * i2) + (529399808 * i16) + (i17 * i17 * 681705472);
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            List list = (List) objArr[0];
            x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
            if ((iIntValue & 6) == 0) {
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda21) ? 4 : 2;
            }
            int i20 = iIntValue;
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i20 & 19) != 18, i20 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1354445324, i20, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:929)");
                }
                int size = list.size();
                int i21 = 0;
                while (i21 < size) {
                    String str = (String) list.get(i21);
                    if (i21 == 1) {
                        int i22 = onTransact + 63;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    Function0<Unit> function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        function0OnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda5
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                Unit unitIAuthTabCallback;
                                int i24 = 2 % 2;
                                int i25 = onExtraCallback + 19;
                                onNavigationEvent = i25 % 128;
                                if (i25 % 2 == 0) {
                                    unitIAuthTabCallback = x2ExternalSyntheticLambda18.IAuthTabCallback();
                                    int i26 = 41 / 0;
                                } else {
                                    unitIAuthTabCallback = x2ExternalSyntheticLambda18.IAuthTabCallback();
                                }
                                int i27 = onExtraCallback + 17;
                                onNavigationEvent = i27 % 128;
                                if (i27 % 2 == 0) {
                                    int i28 = 88 / 0;
                                }
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((Object) function0OnMinimized);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    x2externalsyntheticlambda21.IAuthTabCallback(str, z, function0OnMinimized, null, false, 0L, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 384, (i20 << 3) & 112, 2040);
                    i21++;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = onExtraCallbackWithResult + 113;
                    onTransact = i24 % 128;
                    int i25 = i24 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i26 = onExtraCallbackWithResult + 5;
                    onTransact = i26 % 128;
                    int i27 = i26 % 2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
        if (i18 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i18 != 4) {
            if (i18 == 5) {
                return onWarmupCompleted(objArr);
            }
            final List list2 = (List) objArr[0];
            final int iIntValue2 = ((Number) objArr[1]).intValue();
            x2ExternalSyntheticLambda19.onExtraCallbackWithResult onExtraCallbackWithResult2 = (x2ExternalSyntheticLambda19.onExtraCallbackWithResult) objArr[2];
            final int iIntValue3 = ((Number) objArr[3]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
            int iIntValue4 = ((Number) objArr[5]).intValue();
            int iIntValue5 = ((Number) objArr[6]).intValue();
            int i28 = 2 % 2;
            int i29 = onTransact + 43;
            onExtraCallbackWithResult = i29 % 128;
            if (i29 % 2 == 0 ? (iIntValue5 & 2) != 0 : (iIntValue5 & 5) != 0) {
                onExtraCallbackWithResult2 = x2ExternalSyntheticLambda19.asBinder.Companion.onExtraCallbackWithResult();
            }
            x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult2;
            if ((iIntValue5 & 4) != 0) {
                iIntValue3 = RangesKt.coerceAtMost(2, iIntValue2);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1225114898, iIntValue4, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous>.<anonymous>.NumberExam (TdsSegmentedControlV1.kt:962)");
                int i30 = onTransact + 75;
                onExtraCallbackWithResult = i30 % 128;
                int i31 = i30 % 2;
            }
            x2ExternalSyntheticLambda22.onWarmupCompleted(iIntValue3, (QuirksExternalSyntheticBackport0) null, (DeviceQuirksExternalSyntheticLambda0) null, onextracallbackwithresult, (getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, (getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(36086427, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda6
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i32 = 2 % 2;
                    int i33 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i33 % 128;
                    if (i33 % 2 == 0) {
                        return x2ExternalSyntheticLambda18.onWarmupCompleted(list2, iIntValue2, iIntValue3, (x2ExternalSyntheticLambda21) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    x2ExternalSyntheticLambda18.onWarmupCompleted(list2, iIntValue2, iIntValue3, (x2ExternalSyntheticLambda21) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult3, 54), cameraCaptureResultEmptyCameraCaptureResult3, ((iIntValue4 >> 6) & 14) | 196608 | ((iIntValue4 << 6) & 7168), 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i32 = onTransact + 31;
                onExtraCallbackWithResult = i32 % 128;
                int i33 = i32 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return null;
        }
        List list3 = (List) objArr[0];
        x2ExternalSyntheticLambda21 x2externalsyntheticlambda212 = (x2ExternalSyntheticLambda21) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue6 = ((Number) objArr[3]).intValue();
        int i34 = 2 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda212, "");
        if ((iIntValue6 & 6) == 0) {
            int i35 = onExtraCallbackWithResult + 31;
            onTransact = i35 % 128;
            int i36 = i35 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(x2externalsyntheticlambda212)) {
                int i37 = onExtraCallbackWithResult + 65;
                onTransact = i37 % 128;
                int i38 = i37 % 2;
                i = 2;
            }
            iIntValue6 |= i;
            int i39 = onTransact + 3;
            onExtraCallbackWithResult = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = iIntValue6;
        if ((i41 & 19) != 18) {
            int i42 = onTransact + 51;
            onExtraCallbackWithResult = i42 % 128;
            int i43 = i42 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(z2, i41 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i44 = onTransact + 65;
                onExtraCallbackWithResult = i44 % 128;
                int i45 = i44 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1591959573, i41, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:914)");
            }
            int size2 = list3.size();
            int i46 = onExtraCallbackWithResult + 67;
            onTransact = i46 % 128;
            int i47 = i46 % 2;
            int i48 = 0;
            while (i48 < size2) {
                String str2 = (String) list3.get(i48);
                if (i48 == 2) {
                    int i49 = onTransact + 45;
                    onExtraCallbackWithResult = i49 % 128;
                    int i50 = i49 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                Function0<Unit> function0OnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                if (function0OnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    function0OnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda7
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i51 = 2 % 2;
                            int i52 = IAuthTabCallback + 65;
                            onWarmupCompleted = i52 % 128;
                            int i53 = i52 % 2;
                            Unit unitOnTransact = x2ExternalSyntheticLambda18.onTransact();
                            int i54 = onWarmupCompleted + 41;
                            IAuthTabCallback = i54 % 128;
                            if (i54 % 2 == 0) {
                                int i55 = 59 / 0;
                            }
                            return unitOnTransact;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted((Object) function0OnMinimized2);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult4;
                x2externalsyntheticlambda212.IAuthTabCallback(str2, z3, function0OnMinimized2, null, false, 0L, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult5, 384, (i41 << 3) & 112, 2040);
                i48++;
                cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult5;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 39;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder();
        int i4 = onTransact + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 13;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i4 = i2 + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return function2;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i3 = onExtraCallbackWithResult + 89;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, int i, int i2, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Unit unit;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 15;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            unit = (Unit) onNavigationEvent(1805288623, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1805288620, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback());
            int i6 = 98 / 0;
        } else {
            Object[] objArr2 = {list, Integer.valueOf(i), Integer.valueOf(i2), x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            unit = (Unit) onNavigationEvent(1805288623, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1805288620, objArr2, AUTextView.onExtraCallbackWithResult.onExtraCallback());
        }
        int i7 = onExtraCallbackWithResult + 71;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(list, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 63;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {iAuthTabCallback, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        if (i4 == 0) {
            return (Unit) onNavigationEvent(1237078407, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -1237078406, objArr, iOnExtraCallback3);
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static {
        int i = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final Unit access000() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 31 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onTransact + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        IntIterator it;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 63;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
            if ((i & 78) != 0) {
                i2 = i;
            } else if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x2externalsyntheticlambda21)) {
                int i6 = onTransact + 9;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2 != 0 ? 2 : 4;
                i2 = i | i7;
            }
        } else {
            Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
            if ((i & 6) == 0) {
            }
        }
        boolean z2 = false;
        int i8 = 1;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = onTransact + 55;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 34 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1387434611, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$-1387434611.<anonymous> (TdsSegmentedControlV1.kt:944)");
                }
                it = new IntRange(0, 4).iterator();
                int i11 = 0;
                while (it.hasNext() == i8) {
                    int iNextInt = it.nextInt();
                    if (i11 < 0) {
                        int i12 = onExtraCallbackWithResult + 97;
                        onTransact = i12 % 128;
                        int i13 = i12 % i3;
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = "Item" + (iNextInt + i8);
                    if (i11 == i3) {
                        z = i8;
                    } else {
                        int i14 = onTransact + 109;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % i3;
                        z = z2;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda12
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i16 = 2 % 2;
                                int i17 = IAuthTabCallback + 57;
                                onWarmupCompleted = i17 % 128;
                                if (i17 % 2 != 0) {
                                    return x2ExternalSyntheticLambda18.onExtraCallback();
                                }
                                x2ExternalSyntheticLambda18.onExtraCallback();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    }
                    x2externalsyntheticlambda21.IAuthTabCallback(str, z, (Function0) objOnMinimized, null, false, 0L, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, (i2 << 3) & 112, 2040);
                    i11++;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    i8 = i8;
                    z2 = z2;
                    i2 = i2;
                    i3 = i3;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                it = new IntRange(0, 4).iterator();
                int i112 = 0;
                while (it.hasNext() == i8) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v20, types: [im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda0, java.lang.Object] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z;
        boolean z2;
        List list = (List) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[3];
        int i = 4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
        if ((iIntValue3 & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda21)) {
                i = 2;
            } else {
                int i3 = onExtraCallbackWithResult + 107;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    i = 5;
                }
            }
            iIntValue3 |= i;
        }
        int i4 = iIntValue3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            int i5 = onExtraCallbackWithResult + 47;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i4 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(36086427, i4, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous>.<anonymous>.NumberExam.<anonymous> (TdsSegmentedControlV1.kt:965)");
            }
            Iterator it = CollectionsKt.take(list, iIntValue).iterator();
            int i7 = 0;
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (i7 < 0) {
                    int i8 = onTransact + 13;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) next;
                if (i7 == iIntValue2) {
                    z2 = true;
                } else {
                    int i9 = onExtraCallbackWithResult + 71;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    z2 = false;
                }
                Function0<Unit> function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    function0OnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke() {
                            Unit unitOnExtraCallbackWithResult;
                            int i11 = 2 % 2;
                            int i12 = onExtraCallback + 27;
                            onExtraCallbackWithResult = i12 % 128;
                            if (i12 % 2 != 0) {
                                unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda18.onExtraCallbackWithResult();
                                int i13 = 83 / 0;
                            } else {
                                unitOnExtraCallbackWithResult = x2ExternalSyntheticLambda18.onExtraCallbackWithResult();
                            }
                            int i14 = onExtraCallbackWithResult + 101;
                            onExtraCallback = i14 % 128;
                            if (i14 % 2 != 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((Object) function0OnMinimized);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                x2externalsyntheticlambda21.IAuthTabCallback(str, z2, function0OnMinimized, null, false, 0L, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 384, (i4 << 3) & 112, 2040);
                i7++;
                i4 = i4;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 7;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(List list, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
        boolean z = true;
        int i5 = (i & 6) == 0 ? i | (!cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x2externalsyntheticlambda21) ? 2 : 4) : i;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(!((i5 & 19) == 18), i5 & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onTransact + 77;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(94421981, i5, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:988)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(94421981, i5, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:988)");
            }
            int i7 = 0;
            for (Object obj2 : list) {
                if (i7 < 0) {
                    int i8 = onExtraCallbackWithResult + 125;
                    onTransact = i8 % 128;
                    if (i8 % 2 == 0) {
                        CollectionsKt.throwIndexOverflow();
                        obj.hashCode();
                        throw null;
                    }
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj2;
                boolean z2 = i7 == 8 ? z : false;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda13
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 105;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnNavigationEvent = x2ExternalSyntheticLambda18.onNavigationEvent();
                            int i12 = onNavigationEvent + 25;
                            onWarmupCompleted = i12 % 128;
                            if (i12 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                }
                x2externalsyntheticlambda21.IAuthTabCallback(str, z2, (Function0) objOnMinimized, null, false, 0L, null, 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, (i5 << 3) & 112, 2040);
                i7++;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i5 = i5;
                z = z;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onTransact + 55;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        List listListOf;
        x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback = (x2ExternalSyntheticLambda19.IAuthTabCallback) objArr[0];
        List list = (List) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i4 = onExtraCallbackWithResult + 97;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1539506576, iIntValue, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsSegmentedControlV1.kt:1022)");
            }
            x2ExternalSyntheticLambda2 x2externalsyntheticlambda2 = (x2ExternalSyntheticLambda2) CollectionsKt.getOrNull(list, 0);
            if (x2externalsyntheticlambda2 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1779797025);
                x2ExternalSyntheticLambda17 x2externalsyntheticlambda17 = x2ExternalSyntheticLambda17.IAuthTabCallback;
                toMetersPerSecond tometerspersecondOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = x2externalsyntheticlambda17.onExtraCallback((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, x2externalsyntheticlambda2);
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
                readFully.onExtraCallback onextracallback = readFully.Companion;
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1780275882);
                    listListOf = CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), 0.05f)), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())});
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1780447963);
                    listListOf = CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel()), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())});
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                x2externalsyntheticlambda17.onWarmupCompleted(tometerspersecondOnExtraCallbackWithResult, ensureNavButtonView.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, fIAuthTabCallback, readFully.onExtraCallback.onWarmupCompleted(onextracallback, listListOf, 0.0f, 0.0f, 0, 14, (Object) null), iAuthTabCallback.onExtraCallbackWithResult()), 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 4);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1780797426);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallbackWithResult + 47;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b A[PHI: r0 r3
      0x017b: PHI (r0v31 o.GraphicDeviceInfo) = (r0v27 o.GraphicDeviceInfo), (r0v32 o.GraphicDeviceInfo) binds: [B:45:0x0179, B:42:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x017b: PHI (r3v7 o.QuirksExternalSyntheticBackport0) = (r3v3 o.QuirksExternalSyntheticBackport0), (r3v8 o.QuirksExternalSyntheticBackport0) binds: [B:45:0x0179, B:42:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        long jOnUnminimized;
        GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        Function0<Unit> function0OnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i3 = 2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
        int i5 = 4;
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x2externalsyntheticlambda21) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = onTransact + 55;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i2 & 1)) {
            Throwable th = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onTransact + 103;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-104528847, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$-104528847.<anonymous> (TdsSegmentedControlV1.kt:1043)");
                    th.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-104528847, i2, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$-104528847.<anonymous> (TdsSegmentedControlV1.kt:1043)");
            }
            Iterator it = CollectionsKt.listOf(new String[]{"내 자동차", "자동차 관리"}).iterator();
            int i9 = 0;
            while (it.hasNext()) {
                int i10 = onExtraCallbackWithResult + 59;
                onTransact = i10 % 128;
                if (i10 % i3 == 0) {
                    Throwable th2 = th;
                    it.next();
                    throw th2;
                }
                Object next = it.next();
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) next;
                boolean z2 = i9 == 0;
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1031713106);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1031714066);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).onUnminimized();
                }
                long j = jOnUnminimized;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i11 = onTransact + 89;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % i3 != 0) {
                    graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
                    quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(34.0f), 0.0f, i5, th);
                    function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        function0OnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i12 = 2 % 2;
                                int i13 = onExtraCallback + 113;
                                onWarmupCompleted = i13 % 128;
                                int i14 = i13 % 2;
                                Unit unitOnWarmupCompleted = x2ExternalSyntheticLambda18.onWarmupCompleted();
                                int i15 = onWarmupCompleted + 13;
                                onExtraCallback = i15 % 128;
                                if (i15 % 2 == 0) {
                                    return unitOnWarmupCompleted;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((Object) function0OnMinimized);
                    }
                } else {
                    graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
                    quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(34.0f), 0.0f, i3, th);
                    function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                }
                x2externalsyntheticlambda21.IAuthTabCallback(str, z2, function0OnMinimized, quirksExternalSyntheticBackport0OnExtraCallback, false, jLongValue, graphicDeviceInfoOnExtraCallbackWithResult, j, graphicDeviceInfoIAuthTabCallbackStub, null, null, cameraCaptureResultEmptyCameraCaptureResult, 102239616, (i2 << 3) & 112, 1552);
                i9++;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i2 = i2;
                i5 = i5;
                i3 = i3;
                th = th;
            }
            Throwable th3 = th;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallbackWithResult + 119;
                onTransact = i12 % 128;
                if (i12 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    th3.hashCode();
                    throw th3;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 53;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 61;
            onTransact = i6 % 128;
            z = i6 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1409502535, i, -1, "im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt.lambda$1409502535.<anonymous> (TdsSegmentedControlV1.kt:895)");
            }
            final List listListOf = CollectionsKt.listOf(new String[]{"줄바꿈이 생기면 단어 단위로 끊어요", "텍스트", "텍스트가 길어질 때"});
            final List listListOf2 = CollectionsKt.listOf(new String[]{"Recommended\nCards", "Segmented Control"});
            List listListOf3 = CollectionsKt.listOf(new String[]{"하나", "둘", "셋", "넷", "다섯"});
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = onExtraCallbackWithResult + 79;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onExtraCallbackWithResult + 51;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
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
            x2ExternalSyntheticLambda19.onNavigationEvent onnavigationevent = x2ExternalSyntheticLambda19.onNavigationEvent.Fixed;
            x2ExternalSyntheticLambda19.asBinder.onWarmupCompleted onwarmupcompleted = x2ExternalSyntheticLambda19.asBinder.Companion;
            x2ExternalSyntheticLambda22.IAuthTabCallback(new Object[]{2, null, onnavigationevent, onwarmupcompleted.onExtraCallbackWithResult(), null, null, ForwardingCameraControl.onExtraCallback(1591959573, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda8
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 45;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    List list = listListOf;
                    x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) obj2;
                    if (i12 != 0) {
                        return x2ExternalSyntheticLambda18.IAuthTabCallback(list, x2externalsyntheticlambda21, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    x2ExternalSyntheticLambda18.IAuthTabCallback(list, x2externalsyntheticlambda21, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1576326, 50}, -878512974, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 878512985, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            x2ExternalSyntheticLambda22.IAuthTabCallback(new Object[]{1, null, onnavigationevent, onwarmupcompleted.onExtraCallbackWithResult(), null, null, ForwardingCameraControl.onExtraCallback(1354445324, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 115;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallback = x2ExternalSyntheticLambda18.onExtraCallback(listListOf2, (x2ExternalSyntheticLambda21) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i13 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1576326, 50}, -878512974, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 878512985, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            x2ExternalSyntheticLambda22.IAuthTabCallback(new Object[]{2, null, onnavigationevent, onwarmupcompleted.onExtraCallbackWithResult(), null, null, onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 1576326, 50}, -878512974, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 878512985, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            onNavigationEvent(-1106743606, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1106743606, new Object[]{listListOf3, 3, null, -1, cameraCaptureResultEmptyCameraCaptureResult, 390, 2}, AUTextView.onExtraCallbackWithResult.onExtraCallback());
            onNavigationEvent(-1106743606, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1106743606, new Object[]{listListOf3, 3, null, 0, cameraCaptureResultEmptyCameraCaptureResult, 6, 6}, AUTextView.onExtraCallbackWithResult.onExtraCallback());
            onNavigationEvent(-1106743606, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1106743606, new Object[]{listListOf3, 5, null, 0, cameraCaptureResultEmptyCameraCaptureResult, 6, 6}, AUTextView.onExtraCallbackWithResult.onExtraCallback());
            onNavigationEvent(-1106743606, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1106743606, new Object[]{listListOf3, 5, onwarmupcompleted.onWarmupCompleted(), 0, cameraCaptureResultEmptyCameraCaptureResult, 54, 4}, AUTextView.onExtraCallbackWithResult.onExtraCallback());
            IntRange intRange = new IntRange(1, 12);
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            IntIterator it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(it.nextInt() + "월");
            }
            x2ExternalSyntheticLambda22.onNavigationEvent(8, (QuirksExternalSyntheticBackport0) null, (x2ExternalSyntheticLambda19.IAuthTabCallback) null, (getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) null, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (x2ExternalSyntheticLambda19.onWarmupCompleted) null, (getBacktraceNote<? super x2ExternalSyntheticLambda21, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(94421981, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda10
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Unit unitOnWarmupCompleted;
                    int i10 = 2 % 2;
                    int i11 = onWarmupCompleted + 97;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        unitOnWarmupCompleted = x2ExternalSyntheticLambda18.onWarmupCompleted(arrayList, (x2ExternalSyntheticLambda21) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i12 = 40 / 0;
                    } else {
                        unitOnWarmupCompleted = x2ExternalSyntheticLambda18.onWarmupCompleted(arrayList, (x2ExternalSyntheticLambda21) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    int i13 = onWarmupCompleted + 105;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1597446, 46);
            RoundedCornerShape roundedCornerShapeOnWarmupCompleted = RoundedCornerShapeKt.onWarmupCompleted();
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
            x2ExternalSyntheticLambda19.onExtraCallback onextracallback = x2ExternalSyntheticLambda19.onExtraCallback.Uniform;
            RoundedCornerShape roundedCornerShapeOnWarmupCompleted2 = RoundedCornerShapeKt.onWarmupCompleted();
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            List<x2ExternalSyntheticLambda19.IAuthTabCallback> listListOf4 = CollectionsKt.listOf(new x2ExternalSyntheticLambda19.IAuthTabCallback[]{new x2ExternalSyntheticLambda19.IAuthTabCallback(roundedCornerShapeOnWarmupCompleted, deviceQuirksExternalSyntheticLambda0OnExtraCallback, false, onextracallback, roundedCornerShapeOnWarmupCompleted2, deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())), new x2ExternalSyntheticLambda19.IAuthTabCallback(RoundedCornerShapeKt.onWarmupCompleted(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), false, x2ExternalSyntheticLambda19.onExtraCallback.Intrinsic, RoundedCornerShapeKt.onWarmupCompleted(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))});
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1705609100);
            for (final x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback : listListOf4) {
                x2ExternalSyntheticLambda22.onNavigationEvent(0, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback, (getBacktraceNote<? super List<x2ExternalSyntheticLambda2>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1539506576, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.segmentedcontrol.ComposableSingletons$TdsSegmentedControlV1Kt$$ExternalSyntheticLambda11
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Unit unitOnWarmupCompleted;
                        int i10 = 2 % 2;
                        int i11 = onExtraCallbackWithResult + 17;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            unitOnWarmupCompleted = x2ExternalSyntheticLambda18.onWarmupCompleted(iAuthTabCallback, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i12 = 90 / 0;
                        } else {
                            unitOnWarmupCompleted = x2ExternalSyntheticLambda18.onWarmupCompleted(iAuthTabCallback, (List) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        int i13 = IAuthTabCallback + 11;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), (DeviceQuirksExternalSyntheticLambda0) null, (x2ExternalSyntheticLambda19.onWarmupCompleted) null, onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 1575942, 50);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 9;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onExtraCallbackWithResult + 107;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(List list, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {list, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onNavigationEvent(-1212377942, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, 1212377946, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    private static final Unit onNavigationEvent(List list, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {list, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onNavigationEvent(-122296733, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, 122296735, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallback, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onNavigationEvent(1237078407, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, -1237078406, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    private static final void IAuthTabCallback(List<String> list, int i, x2ExternalSyntheticLambda19.onExtraCallbackWithResult onextracallbackwithresult, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4) {
        Object[] objArr = {list, Integer.valueOf(i), onextracallbackwithresult, Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3), Integer.valueOf(i4)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(-1106743606, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, 1106743606, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    private static final Unit onNavigationEvent(List list, int i, int i2, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Unit) onNavigationEvent(1805288623, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, -1805288620, objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (Function2) onNavigationEvent(1837397238, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -1837397233, new Object[]{this}, iOnExtraCallback3);
    }
}
