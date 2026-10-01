package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import im.toss.tds.view.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.createCameraCaptureCallback;
import o.decrementVideoUsage;
import o.flipHorizontally;
import o.getStreamSharingChildren;
import o.initSDK;
import o.isExtraPreviewRequired;
import o.isInVideoUsage;
import o.oExternalSyntheticLambda0;
import o.r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg;
import o.readFully;
import o.removeObserverLocked;
import o.setCallToAction;
import o.setCurrentIndex;
import o.setOrientationDegrees;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u3;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static final float onWarmupCompleted = MaxAdReviewListener.onWarmupCompleted.IAuthTabCallback();

    public static /* synthetic */ float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fAsInterface = asInterface();
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return fAsInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        Object objOnMinimized;
        Function0 function0;
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i2;
        int i10 = i5 | i7;
        int i11 = (~(i5 | i2)) | (~(i7 | (~i2) | i8)) | (~(i2 | i3));
        int i12 = i2 + i3 + i + (764943627 * i6) + (189947931 * i4);
        int i13 = i12 * i12;
        int i14 = ((i2 * (-973936384)) - 801505280) + ((-973936384) * i3) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i) + ((-1475084288) * i6) + ((-1479278592) * i4) + ((-626393088) * i13);
        int i15 = (i2 * 1860537600) + 224780607 + (i3 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (1860538117 * i) + ((-1861700041) * i6) + ((-831392377) * i4) + (i13 * 995229696);
        switch (i14 + (i15 * i15 * 1053163520)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                final t5a t5aVar = (t5a) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i16 = 2 % 2;
                int i17 = onNavigationEvent;
                int i18 = i17 + 13;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                if ((iIntValue2 & 1) != 0) {
                    int i20 = i17 + 1;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    t5aVar = t5a.Unspecified;
                }
                if ((iIntValue2 & 2) != 0) {
                    zBooleanValue = true;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1314743689, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.rememberKeyboardState (TdsBottomCtaV1.kt:868)");
                    int i22 = onExtraCallback + 35;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                }
                Object[] objArr2 = new Object[0];
                getCaptureIds<r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg, ?> getcaptureidsOnWarmupCompleted = r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg.Companion.onWarmupCompleted();
                if (((iIntValue & 14) ^ 6) > 4) {
                    z = true;
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(t5aVar.ordinal())) {
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!z || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda8
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke() {
                                int i24 = 2 % 2;
                                int i25 = IAuthTabCallback + 53;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                Object[] objArr3 = {t5aVar};
                                if (i26 != 0) {
                                    int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                                    return (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr3, -262194345, 262194351, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
                                }
                                int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    final r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) RememberSaveableKt.onWarmupCompleted(objArr2, getcaptureidsOnWarmupCompleted, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    final View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
                    if (zBooleanValue) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1723647257);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1722849627);
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnExtraCallback | zOnNavigationEvent) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda9
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj) {
                                    int i24 = 2 % 2;
                                    int i25 = onExtraCallbackWithResult + 101;
                                    onExtraCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    View view2 = view;
                                    if (i26 == 0) {
                                        Object[] objArr3 = {view2, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, (isInVideoUsage) obj};
                                        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                                        return (decrementVideoUsage) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr3, -659095678, 659095697, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
                                    }
                                    Object[] objArr4 = {view2, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, (isInVideoUsage) obj};
                                    int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                                    int i27 = 60 / 0;
                                    return (decrementVideoUsage) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr4, -659095678, 659095697, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, setCurrentIndex.onNavigationEvent());
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        }
                        isZslDisabledByByUserCaseConfig.onExtraCallback(view, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        return r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
                    }
                    int i24 = onNavigationEvent + 87;
                    onExtraCallback = i24 % 128;
                    int i25 = i24 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    return r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
                }
                z = true;
                if ((6 & iIntValue) != 4) {
                    z = false;
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!z) {
                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda8
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i242 = 2 % 2;
                            int i252 = IAuthTabCallback + 53;
                            onExtraCallbackWithResult = i252 % 128;
                            int i26 = i252 % 2;
                            Object[] objArr3 = {t5aVar};
                            if (i26 != 0) {
                                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                                return (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr3, -262194345, 262194351, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
                            }
                            int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                final r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg2 = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) RememberSaveableKt.onWarmupCompleted(objArr2, getcaptureidsOnWarmupCompleted, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                final View view2 = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
                if (zBooleanValue) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                break;
            case 3:
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
                u3 u3Var = (u3) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int i26 = 2 % 2;
                if ((iIntValue3 & 3) != 2) {
                    z = true;
                } else {
                    int i27 = onNavigationEvent + 41;
                    onExtraCallback = i27 % 128;
                    int i28 = i27 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue3 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1022040526, iIntValue3, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:552)");
                        int i29 = onNavigationEvent + 113;
                        onExtraCallback = i29 % 128;
                        int i30 = i29 % 2;
                    }
                    getbacktracenote.invoke(u3Var, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 4:
                return onExtraCallback(objArr);
            case 5:
                getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[0];
                getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[1];
                oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = (oExternalSyntheticLambda0.onWarmupCompleted) objArr[2];
                final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[3];
                final u3 u3Var2 = (u3) objArr[4];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
                int iIntValue4 = ((Number) objArr[6]).intValue();
                int i31 = 2 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    int i32 = onNavigationEvent + 99;
                    onExtraCallback = i32 % 128;
                    int i33 = i32 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-705472843, iIntValue4, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:569)");
                        int i34 = onExtraCallback + 105;
                        onNavigationEvent = i34 % 128;
                        int i35 = i34 % 2;
                    }
                    putCharSequence.onExtraCallback(gethumanreadablename, gethumanreadablename2, null, onwarmupcompleted, null, false, ForwardingCameraControl.onExtraCallback(1048058857, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2) {
                            int i36 = 2 % 2;
                            int i37 = onNavigationEvent + 85;
                            onExtraCallbackWithResult = i37 % 128;
                            int i38 = i37 % 2;
                            Unit unitOnExtraCallbackWithResult = u1.onExtraCallbackWithResult(getbacktracenote2, u3Var2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i39 = onExtraCallbackWithResult + 101;
                            onNavigationEvent = i39 % 128;
                            if (i39 % 2 == 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult3, 54), cameraCaptureResultEmptyCameraCaptureResult3, 1572864, 52);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i36 = onNavigationEvent + 67;
                        onExtraCallback = i36 % 128;
                        int i37 = i36 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return onNavigationEvent(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return onTransact(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return access100(objArr);
            case 15:
                int iIntValue5 = ((Number) objArr[0]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                ((Number) objArr[2]).intValue();
                int i38 = 2 % 2;
                int i39 = onNavigationEvent + 7;
                onExtraCallback = i39 % 128;
                int i40 = i39 % 2;
                IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult4, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue5))}, -558428521, 558428541, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                Unit unit = Unit.INSTANCE;
                int i41 = onNavigationEvent + 91;
                onExtraCallback = i41 % 128;
                int i42 = i41 % 2;
                return unit;
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                String str = (String) objArr[0];
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
                Function0 function02 = (Function0) objArr[2];
                boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
                setCallToAction.onWarmupCompleted onwarmupcompleted2 = (setCallToAction.onWarmupCompleted) objArr[5];
                setCallToAction.onExtraCallback onextracallback2 = (setCallToAction.onExtraCallback) objArr[6];
                boolean zBooleanValue4 = ((Boolean) objArr[7]).booleanValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
                int iIntValue6 = ((Number) objArr[9]).intValue();
                int iIntValue7 = ((Number) objArr[10]).intValue();
                int i43 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                if ((iIntValue7 & 2) != 0) {
                    onextracallback = QuirksExternalSyntheticBackport0.Companion;
                }
                if ((iIntValue7 & 4) != 0) {
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult5.onMinimized();
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke() {
                                int i44 = 2 % 2;
                                int i45 = onExtraCallback + 65;
                                IAuthTabCallback = i45 % 128;
                                int i46 = i45 % 2;
                                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                                Unit unit2 = (Unit) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[0], 2114896217, -2114896199, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
                                int i47 = onExtraCallback + 109;
                                IAuthTabCallback = i47 % 128;
                                int i48 = i47 % 2;
                                return unit2;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(objOnMinimized3);
                    }
                    function0 = (Function0) objOnMinimized3;
                } else {
                    function0 = function02;
                }
                boolean z2 = (iIntValue7 & 8) != 0 ? false : zBooleanValue2;
                if ((iIntValue7 & 16) != 0) {
                    zBooleanValue3 = true;
                }
                if ((iIntValue7 & 32) != 0) {
                    onwarmupcompleted2 = setCallToAction.onWarmupCompleted.Primary;
                }
                if ((iIntValue7 & 64) != 0) {
                    int i44 = onExtraCallback + 43;
                    onNavigationEvent = i44 % 128;
                    int i45 = i44 % 2;
                    onextracallback2 = setCallToAction.onExtraCallback.Fill;
                }
                setCallToAction.onExtraCallback onextracallback3 = onextracallback2;
                boolean z3 = (iIntValue7 & 128) != 0 ? true : zBooleanValue4;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i46 = onExtraCallback + 29;
                    onNavigationEvent = i46 % 128;
                    int i47 = i46 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-798287908, iIntValue6, -1, "im.toss.tds.compose.component.compound.bottomcta.KeyboardBottomCta (TdsBottomCtaV1.kt:791)");
                }
                onWarmupCompleted(((r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{null, false, cameraCaptureResultEmptyCameraCaptureResult5, 0, 3}, -1912856437, 1912856439, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).onNavigationEvent(), str, (QuirksExternalSyntheticBackport0) onextracallback, (Function0<Unit>) function0, z2, zBooleanValue3, onwarmupcompleted2, onextracallback3, z3, cameraCaptureResultEmptyCameraCaptureResult5, (iIntValue6 << 3) & 268435440, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return null;
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return IAuthTabCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return getInterfaceDescriptor(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return access000(objArr);
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return readTypedObject(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return extraCallbackWithResult(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        t5a t5aVar = (t5a) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(t5aVar);
            obj.hashCode();
            throw null;
        }
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrgOnExtraCallback = onExtraCallback(t5aVar);
        int i3 = onExtraCallback + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrgOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            access000(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitAccess000 = access000(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onNavigationEvent + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Integer.valueOf(i), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 1057178913, -1057178901, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i6 = onExtraCallback + 33;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, u2 u2Var, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(j, u2Var, setorientationdegrees);
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.IntRef intRef, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(objectRef, objectRef2, intRef, f, onextracallbackwithresult);
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, getbacktracenote, onextracallbackwithresult, getbacktracenote2, onextracallbackwithresult2, onwarmupcompleted, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 962484907, -962484900, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i7 = onExtraCallback + 83;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 43 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -24215419, 24215422, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i5 = onExtraCallback + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(gethumanreadablename, gethumanreadablename2, onwarmupcompleted, getbacktracenote, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ t7ExternalSyntheticLambda0.onExtraCallback IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends t7ExternalSyntheticLambda0.onExtraCallback>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallbackOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallbackStubProxy(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 90 / 0;
        }
        int i7 = onNavigationEvent + 111;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 97;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        asInterface(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 117;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        View view = (View) objArr[0];
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) objArr[1];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(view, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, isinvideousage);
        }
        onExtraCallbackWithResult(view, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, isinvideousage);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access000(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit access100(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 17;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final float asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        float f = i2 % 2 != 0 ? 2.0f : 1.0f;
        int i4 = i3 + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Unit unit;
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
        Ref.ObjectRef objectRef2 = (Ref.ObjectRef) objArr[1];
        Ref.IntRef intRef = (Ref.IntRef) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {objectRef, objectRef2, intRef, Float.valueOf(fFloatValue), onextracallbackwithresult};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        if (i3 != 0) {
            unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr2, 158684332, -158684319, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
            int i4 = 7 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr2, 158684332, -158684319, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        }
        int i5 = onExtraCallback + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        u2 u2Var = (u2) objArr[0];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(u2Var, fliphorizontally);
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit extraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -387427707, 387427724, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 79;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact();
        }
        onTransact();
        throw null;
    }

    private static final Unit getInterfaceDescriptor(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 125;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onExtraCallback + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[0], 1524308627, -1524308618, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 344002847, -344002832, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i6 = onExtraCallback + 55;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(audioRestrictionControllerImplExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = onExtraCallback + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, u2 u2Var, getBacktraceNote getbacktracenote, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, long j, boolean z, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 87;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, u2Var, getbacktracenote, onextracallbackwithresult, getbacktracenote2, onextracallbackwithresult2, getbacktracenote3, getbacktracenote4, j, z, onextracallback, onwarmupcompleted, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, u2Var, getbacktracenote, onextracallbackwithresult, getbacktracenote2, onextracallbackwithresult2, getbacktracenote3, getbacktracenote4, j, z, onextracallback, onwarmupcompleted, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onNavigationEvent + 115;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 8 / 0;
        }
        int i6 = onNavigationEvent + 117;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(u2 u2Var, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(u2Var, fliphorizontally);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = onNavigationEvent + 117;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallback(skipBytes skipbytes, MediationAdapterBase mediationAdapterBase, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = onExtraCallbackWithResult(skipbytes, mediationAdapterBase, sessionProcessorCaptureCallback);
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(View view, r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(view, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = onWarmupCompleted;
        int i4 = i2 + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return f;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onExtraCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, u2 u2Var, getBacktraceNote getbacktracenote, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote3, getBacktraceNote getbacktracenote4, long j, boolean z, t7ExternalSyntheticLambda0.onExtraCallback onextracallback, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 39;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, u2Var, getbacktracenote, onextracallbackwithresult, getbacktracenote2, onextracallbackwithresult2, getbacktracenote3, getbacktracenote4, j, z, onextracallback, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            IAuthTabCallback(quirksExternalSyntheticBackport0, u2Var, getbacktracenote, onextracallbackwithresult, getbacktracenote2, onextracallbackwithresult2, getbacktracenote3, getbacktracenote4, j, z, onextracallback, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, u2 u2Var, boolean z, long j, getBacktraceNote getbacktracenote, float f, getBacktraceNote getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote3, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, u2Var, Boolean.valueOf(z), Long.valueOf(j), getbacktracenote, Float.valueOf(f), getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, onwarmupcompleted, getbacktracenote4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -608062230, 608062240, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        int i4 = onNavigationEvent + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(getbacktracenote, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(readFully readfully, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(readfully, f, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = onNavigationEvent + 77;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(t7ExternalSyntheticLambda0.onExtraCallback onextracallback, u2 u2Var, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, long j, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote3, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallback(onextracallback, u2Var, quirksExternalSyntheticBackport0, z, j, getbacktracenote, getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, onwarmupcompleted, getbacktracenote4, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(onextracallback, u2Var, quirksExternalSyntheticBackport0, z, j, getbacktracenote, getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, onwarmupcompleted, getbacktracenote4, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(t7ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallbackwithresult, onextracallbackwithresult2, getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = onNavigationEvent + 37;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(u2 u2Var, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(u2Var, extensionsManager1);
        }
        onNavigationEvent(u2Var, extensionsManager1);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult = (setCallToAction.onExtraCallbackWithResult) objArr[2];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[3];
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2 = (setCallToAction.onExtraCallbackWithResult) objArr[4];
        t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = (t7ExternalSyntheticLambda0.onWarmupCompleted) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, getbacktracenote, onextracallbackwithresult, getbacktracenote2, onextracallbackwithresult2, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 77;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult, getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        int i6 = onExtraCallback + 31;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, boolean z2, boolean z3, setClickDestinationBackupUri setclickdestinationbackupuri, boolean z4, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, str, quirksExternalSyntheticBackport0, function0, z2, z3, setclickdestinationbackupuri, z4, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 103;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return extraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        extraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAccess100 = access100(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 92 / 0;
        }
        return unitAccess100;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {gethumanreadablename, gethumanreadablename2, onwarmupcompleted, getbacktracenote, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 2016948549, -2016948544, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i5 = onExtraCallback + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(onnavigationevent);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(onnavigationevent);
        int i3 = onExtraCallback + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(t4 t4Var, getBacktraceNote getbacktracenote, t7ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(t4Var, getbacktracenote, onextracallbackwithresult, onextracallbackwithresult2, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(t4Var, getbacktracenote, onextracallbackwithresult, onextracallbackwithresult2, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(boolean z, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, boolean z2, boolean z3, setClickDestinationBackupUri setclickdestinationbackupuri, boolean z4, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(z, str, quirksExternalSyntheticBackport0, function0, z2, z3, setclickdestinationbackupuri, z4, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallbackWithResult(z, str, quirksExternalSyntheticBackport0, function0, z2, z3, setclickdestinationbackupuri, z4, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, skipBytes skipbytes, MediationAdapterBase mediationAdapterBase) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, skipbytes, mediationAdapterBase);
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    public static /* synthetic */ component8 onWarmupCompleted(setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, getbacktracenote, onextracallbackwithresult2, getbacktracenote2, onwarmupcompleted, isextrapreviewrequired, virtualCameraCaptureResult);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return component8VarIAuthTabCallback;
    }

    private static final Unit readTypedObject(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 81;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit writeTypedObject(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        asBinder(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener onNavigationEvent;
        final /* synthetic */ View onWarmupCompleted;

        public onNavigationEvent(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.onWarmupCompleted = view;
            this.onNavigationEvent = onGlobalLayoutListener;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.getViewTreeObserver().removeOnGlobalLayoutListener(this.onNavigationEvent);
                throw null;
            }
            this.onWarmupCompleted.getViewTreeObserver().removeOnGlobalLayoutListener(this.onNavigationEvent);
            int i3 = onExtraCallbackWithResult + 15;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function1<createBitmapFromImageProxy, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ boolean $enabled$inlined;
        final /* synthetic */ Function1 $onScroll$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Function1 function1, boolean z) {
            super(1);
            this.$onScroll$inlined = function1;
            this.$enabled$inlined = z;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((createBitmapFromImageProxy) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(createBitmapFromImageProxy createbitmapfromimageproxy) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            createbitmapfromimageproxy.onNavigationEvent("tdsBottomCtaV1");
            createbitmapfromimageproxy.onExtraCallbackWithResult().onNavigationEvent("onScroll", this.$onScroll$inlined);
            createbitmapfromimageproxy.onExtraCallbackWithResult().onNavigationEvent("enabled", Boolean.valueOf(this.$enabled$inlined));
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onTransact extends Lambda implements Function1<createBitmapFromImageProxy, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ boolean $enabled$inlined;
        final /* synthetic */ u2 $state$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(u2 u2Var, boolean z) {
            super(1);
            this.$state$inlined = u2Var;
            this.$enabled$inlined = z;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((createBitmapFromImageProxy) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(createBitmapFromImageProxy createbitmapfromimageproxy) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                createbitmapfromimageproxy.onNavigationEvent("tdsBottomCtaV1");
                createbitmapfromimageproxy.onExtraCallbackWithResult().onNavigationEvent("state", this.$state$inlined);
                createbitmapfromimageproxy.onExtraCallbackWithResult().onNavigationEvent("enabled", Boolean.valueOf(this.$enabled$inlined));
                int i3 = 55 / 0;
            } else {
                createbitmapfromimageproxy.onNavigationEvent("tdsBottomCtaV1");
                createbitmapfromimageproxy.onExtraCallbackWithResult().onNavigationEvent("state", this.$state$inlined);
                createbitmapfromimageproxy.onExtraCallbackWithResult().onNavigationEvent("enabled", Boolean.valueOf(this.$enabled$inlined));
            }
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ u2 $state;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<t7ExternalSyntheticLambda0.onExtraCallback> $transition$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(u2 u2Var, CameraPresenceProviderExternalSyntheticLambda6<? extends t7ExternalSyntheticLambda0.onExtraCallback> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = u2Var;
            this.$transition$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$transition$delegate, access13800Var);
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$state.onWarmupCompleted()) {
                int i3 = onWarmupCompleted + 79;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (!Intrinsics.areEqual(u1.IAuthTabCallback(this.$transition$delegate), t7ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback.onWarmupCompleted)) {
                    int i5 = onWarmupCompleted + 41;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (this.$state.asBinder() < 1.0f) {
                        this.$state.onExtraCallback(u1.IAuthTabCallback(this.$transition$delegate));
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 79;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit onNavigationEvent(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationevent.onExtraCallback("cta_yn", "Y");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onnavigationevent.onExtraCallback("cta_yn", "Y");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(u2 u2Var, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            u2Var.onExtraCallback((int) extensionsManager1.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 25;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        u2Var.onExtraCallback((int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(u2 u2Var, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.access000(u2Var.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onExtraCallback implements skipBytes {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ long onWarmupCompleted;

        onExtraCallback(long j) {
            this.onWarmupCompleted = j;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            long j = this.onWarmupCompleted;
            if (i4 != 0) {
                int i5 = 62 / 0;
            }
            int i6 = i3 + 111;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return j;
        }
    }

    static final class onWarmupCompleted implements MediationAdapterBase {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ u2 onExtraCallbackWithResult;

        onWarmupCompleted(u2 u2Var) {
            this.onExtraCallbackWithResult = u2Var;
        }

        @Override // o.MediationAdapterBase
        public final float invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {this.onExtraCallbackWithResult};
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
            if (i3 == 0) {
                return ((Float) u2.onWarmupCompleted(-865984870, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, objArr, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 865984876)).floatValue();
            }
            int i4 = 16 / 0;
            return ((Float) u2.onWarmupCompleted(-865984870, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, objArr, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 865984876)).floatValue();
        }
    }

    private static final Unit onExtraCallbackWithResult(long j, u2 u2Var, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        long jOnExtraCallbackWithResult = getMaxAdCount.onExtraCallbackWithResult(j, ((Float) u2.onWarmupCompleted(-865984870, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 865984876)).floatValue());
        long jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
        long jOnTransact = setorientationdegrees.onTransact();
        int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = alertWithArgs.onExtraCallbackWithResult();
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, jOnExtraCallbackWithResult, jIAuthTabCallback, setUseCaseDetached.onExtraCallback(jOnTransact, 0.0f, ((Float) u2.onWarmupCompleted(-576215392, iOnExtraCallbackWithResult5, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, 576215396)).floatValue(), 1, (Object) null), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(u2 u2Var, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
            fliphorizontally.IAuthTabCallbackStubProxy(((Float) u2.onWarmupCompleted(-1424808820, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, 1424808822)).floatValue());
            int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = alertWithArgs.onExtraCallbackWithResult();
            fliphorizontally.getInterfaceDescriptor(((Float) u2.onWarmupCompleted(-1424808820, iOnExtraCallbackWithResult5, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult6, 1424808822)).floatValue());
            int iOnExtraCallbackWithResult7 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult8 = alertWithArgs.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult9 = alertWithArgs.onExtraCallbackWithResult();
            fliphorizontally.IAuthTabCallbackStub(((Float) u2.onWarmupCompleted(-865984870, iOnExtraCallbackWithResult8, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult7, iOnExtraCallbackWithResult9, 865984876)).floatValue());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        int iOnExtraCallbackWithResult10 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult11 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult12 = alertWithArgs.onExtraCallbackWithResult();
        fliphorizontally.IAuthTabCallbackStubProxy(((Float) u2.onWarmupCompleted(-1424808820, iOnExtraCallbackWithResult11, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult10, iOnExtraCallbackWithResult12, 1424808822)).floatValue());
        int iOnExtraCallbackWithResult13 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult14 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult15 = alertWithArgs.onExtraCallbackWithResult();
        fliphorizontally.getInterfaceDescriptor(((Float) u2.onWarmupCompleted(-1424808820, iOnExtraCallbackWithResult14, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult13, iOnExtraCallbackWithResult15, 1424808822)).floatValue());
        int iOnExtraCallbackWithResult16 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult17 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult18 = alertWithArgs.onExtraCallbackWithResult();
        fliphorizontally.IAuthTabCallbackStub(((Float) u2.onWarmupCompleted(-865984870, iOnExtraCallbackWithResult17, alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult16, iOnExtraCallbackWithResult18, 865984876)).floatValue());
        int i3 = 53 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, final getBacktraceNote getbacktracenote, final u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i3 = onExtraCallback + 51;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1702388734, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:547)");
                int i5 = onExtraCallback + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            putCharSequence.onExtraCallback(gethumanreadablename, gethumanreadablename2, null, onwarmupcompleted, null, false, ForwardingCameraControl.onExtraCallback(-1022040526, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda20
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = IAuthTabCallback + 69;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitIAuthTabCallback = u1.IAuthTabCallback(getbacktracenote, u3Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = IAuthTabCallback + 51;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 90 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 52);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onNavigationEvent + 47;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onNavigationEvent + 53;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1048058857, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:574)");
                    int i6 = 14 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1048058857, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:574)");
                }
            }
            getbacktracenote.invoke(u3Var, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 125;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final u2 u2Var = (u2) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        final long jLongValue = ((Number) objArr[3]).longValue();
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        float fFloatValue = ((Number) objArr[5]).floatValue();
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[6];
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult = (setCallToAction.onExtraCallbackWithResult) objArr[7];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[8];
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2 = (setCallToAction.onExtraCallbackWithResult) objArr[9];
        t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted = (t7ExternalSyntheticLambda0.onWarmupCompleted) objArr[10];
        final getBacktraceNote getbacktracenote4 = (getBacktraceNote) objArr[11];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        int iIntValue = ((Number) objArr[13]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = onNavigationEvent + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-835526918, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:498)");
            }
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            long jOnExtraCallback = t7b.onExtraCallback.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6);
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
            final getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(gethumanreadablename, jOnExtraCallback, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, iAuthTabCallback.IAuthTabCallback(), 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744446, (Object) null);
            final getHumanReadableName gethumanreadablenameOnNavigationEvent2 = getHumanReadableName.onNavigationEvent(appLovinPostbackService.getInterfaceDescriptor(), 0L, 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, iAuthTabCallback.IAuthTabCallback(), 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16744443, (Object) null);
            final oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = oExternalSyntheticLambda0.onWarmupCompleted.onExtraCallbackWithResult((oExternalSyntheticLambda0.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallback()), oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), oExternalSyntheticLambda0.IAuthTabCallback.Companion.onWarmupCompleted(), null, 4, null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u2Var);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda21
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 85;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnExtraCallbackWithResult = u1.onExtraCallbackWithResult(u2Var, (ExtensionsManager1) obj);
                        int i8 = IAuthTabCallback + 65;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 44 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, (Function1) objOnMinimized);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u2Var);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda22
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 7;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        u2 u2Var2 = u2Var;
                        flipHorizontally fliphorizontally = (flipHorizontally) obj;
                        if (i7 == 0) {
                            return u1.onExtraCallback(u2Var2, fliphorizontally);
                        }
                        u1.onExtraCallback(u2Var2, fliphorizontally);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = putCharSequence.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized2), 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), cameraCaptureResultEmptyCameraCaptureResult2, 24576, 7);
            if (zBooleanValue) {
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = quirksExternalSyntheticBackport0OnExtraCallbackWithResult2.onExtraCallback(onWarmupCompleted((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, (skipBytes) new onExtraCallback(jLongValue), (MediationAdapterBase) new onWarmupCompleted(u2Var)));
            }
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jLongValue);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u2Var);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if ((zOnWarmupCompleted | zOnNavigationEvent3) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda23
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 3;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitIAuthTabCallback = u1.IAuthTabCallback(jLongValue, u2Var, (setOrientationDegrees) obj);
                        int i8 = onWarmupCompleted + 93;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, (Function1) objOnMinimized3);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u2Var);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (zOnNavigationEvent4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda24
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 25;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Object[] objArr2 = {u2Var, (flipHorizontally) obj};
                        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                        Unit unit = (Unit) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr2, 1884452768, -1884452747, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
                        int i8 = onExtraCallback + 93;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = getMaxSize.onExtraCallbackWithResult(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, (Function1) objOnMinimized4), "tds_bottom_cta_v1");
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResult2, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult4);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized5 = new u3(u3.onExtraCallback.Top);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
            }
            final u3 u3Var = (u3) objOnMinimized5;
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1878893352);
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                putBooleanArray.IAuthTabCallback(t7ExternalSyntheticLambda0.onExtraCallbackWithResult.TopAccessory, ForwardingCameraControl.onExtraCallback(1702388734, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda25
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 81;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            return u1.IAuthTabCallback(gethumanreadablenameOnNavigationEvent, gethumanreadablenameOnNavigationEvent2, onwarmupcompletedOnExtraCallbackWithResult, getbacktracenote, u3Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        u1.IAuthTabCallback(gethumanreadablenameOnNavigationEvent, gethumanreadablenameOnNavigationEvent2, onwarmupcompletedOnExtraCallbackWithResult, getbacktracenote, u3Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1879364242);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            onWarmupCompleted(putCharSequence.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, fFloatValue, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 54, 2), getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized6 = new u3(u3.onExtraCallback.Bottom);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
            }
            final u3 u3Var2 = (u3) objOnMinimized6;
            if (getbacktracenote4 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1879946143);
                putBooleanArray.IAuthTabCallback(t7ExternalSyntheticLambda0.onExtraCallbackWithResult.BottomAccessory, ForwardingCameraControl.onExtraCallback(-705472843, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda26
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 55;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            u1.onWarmupCompleted(gethumanreadablenameOnNavigationEvent, gethumanreadablenameOnNavigationEvent2, onwarmupcompletedOnExtraCallbackWithResult, getbacktracenote4, u3Var2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = u1.onWarmupCompleted(gethumanreadablenameOnNavigationEvent, gethumanreadablenameOnNavigationEvent2, onwarmupcompletedOnExtraCallbackWithResult, getbacktracenote4, u3Var2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i7 = onExtraCallback + 55;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1880425682);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(t7ExternalSyntheticLambda0.onExtraCallback onextracallback, final u2 u2Var, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z, final long j, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote getbacktracenote3, final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, final t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, final getBacktraceNote getbacktracenote4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 15;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1772242374, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.<anonymous> (TdsBottomCtaV1.kt:485)");
            }
            final float fOnNavigationEvent = t7b.onExtraCallback.onNavigationEvent();
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, 0);
            t7ExternalSyntheticLambda0.onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<? extends t7ExternalSyntheticLambda0.onExtraCallback>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u2Var);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                int i5 = onExtraCallback + 9;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(u2Var, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(onextracallbackOnExtraCallbackWithResult, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
                accessisMonitoringp accessismonitoringp = (accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 174994773, -174994756, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda11
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj) {
                            int i7 = 2 % 2;
                            int i8 = IAuthTabCallback + 123;
                            onExtraCallback = i8 % 128;
                            initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) obj;
                            if (i8 % 2 != 0) {
                                return u1.onWarmupCompleted(onnavigationevent);
                            }
                            u1.onWarmupCompleted(onnavigationevent);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                setPostviewFormatSelector.onNavigationEvent(accessismonitoringp.onExtraCallback((Function1) objOnMinimized2), ForwardingCameraControl.onExtraCallback(-835526918, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda12
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 63;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallbackWithResult = u1.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, u2Var, z, j, getbacktracenote, fOnNavigationEvent, getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, onwarmupcompleted, getbacktracenote4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i10 = onWarmupCompleted + 125;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = onExtraCallback + 87;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable u2 u2Var, @Nullable getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, @Nullable getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, @Nullable getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4, long j, boolean z, @Nullable t7ExternalSyntheticLambda0.onExtraCallback onextracallback, @Nullable t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
        int i4;
        u2 u2Var2;
        getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        int i5;
        int i6;
        setCallToAction.onExtraCallbackWithResult onExtraCallbackWithResult2;
        int i7;
        getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult3;
        final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        final getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        final getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9;
        final long j2;
        boolean z3;
        t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted2;
        final u2 u2VarOnWarmupCompleted;
        final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10;
        final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult4;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i18;
        int i19;
        int i20;
        int i21;
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11;
        getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12;
        long jIAuthTabCallback;
        boolean z4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
        int i22;
        t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult5;
        int i23;
        int i24 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-260580323);
        int i25 = i3 & 1;
        if (i25 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                u2Var2 = u2Var;
                int i26 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(u2Var2) ? 32 : 16;
                i4 |= i26;
            } else {
                u2Var2 = u2Var;
            }
            i4 |= i26;
        } else {
            u2Var2 = u2Var;
        }
        int i27 = i3 & 4;
        if (i27 != 0) {
            i4 |= 384;
            getbacktracenote5 = getbacktracenote;
        } else {
            getbacktracenote5 = getbacktracenote;
            if ((i & 384) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 256 : 128;
            }
        }
        int i28 = i3 & 8;
        if (i28 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 2048 : 1024;
        }
        int i29 = i3 & 16;
        if (i29 != 0) {
            int i30 = onExtraCallback + 47;
            onNavigationEvent = i30 % 128;
            i4 = i30 % 2 == 0 ? i4 | 24905 : i4 | 24576;
        } else {
            if ((i & 24576) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 16384 : 8192) | i4;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i5 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    onExtraCallbackWithResult2 = onextracallbackwithresult2;
                    i5 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onExtraCallbackWithResult2) ? 65536 : 131072;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        getbacktracenote6 = getbacktracenote3;
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i9 = i8;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4)) {
                                int i31 = onNavigationEvent + 37;
                                onExtraCallback = i31 % 128;
                                i10 = 8388608;
                                if (i31 % 2 != 0) {
                                    int i32 = 73 / 0;
                                }
                            } else {
                                i10 = 4194304;
                            }
                            i11 = i10 | i5;
                        }
                        if ((100663296 & i) == 0) {
                            i11 |= ((i3 & 256) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            int i33 = onExtraCallback + 125;
                            onNavigationEvent = i33 % 128;
                            if (i33 % 2 == 0) {
                                getbacktracenote.hashCode();
                                throw null;
                            }
                            i11 |= 805306368;
                        } else if ((805306368 & i) == 0) {
                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = i2 | 6;
                            onextracallback2 = onextracallback;
                        } else {
                            onextracallback2 = onextracallback;
                            if ((i2 & 6) == 0) {
                                i14 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 4 : 2);
                            } else {
                                i14 = i2;
                            }
                        }
                        i15 = i3 & 2048;
                        if (i15 == 0) {
                            i16 = i13;
                            if ((i2 & 48) == 0) {
                                int i34 = onNavigationEvent + 21;
                                onExtraCallback = i34 % 128;
                                int i35 = i34 % 2;
                                i17 = i14 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted) ? 32 : 16);
                            }
                            if ((i11 & 306783379) == 306783378 || (i17 & 19) != 18) {
                                z2 = true;
                            } else {
                                int i36 = onNavigationEvent + 115;
                                onExtraCallback = i36 % 128;
                                if (i36 % 2 == 0) {
                                    z2 = false;
                                }
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i11 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                onextracallbackwithresult3 = onextracallbackwithresult;
                                getbacktracenote7 = getbacktracenote2;
                                getbacktracenote8 = getbacktracenote3;
                                getbacktracenote9 = getbacktracenote4;
                                j2 = j;
                                z3 = z;
                                onwarmupcompleted2 = onwarmupcompleted;
                                u2VarOnWarmupCompleted = u2Var2;
                                getbacktracenote10 = getbacktracenote5;
                                onextracallbackwithresult4 = onextracallbackwithresult2;
                                onextracallback3 = onextracallback;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((i & 1) != 0) {
                                    int i37 = onExtraCallback + 115;
                                    onNavigationEvent = i37 % 128;
                                    int i38 = i37 % 2;
                                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((i3 & 2) != 0) {
                                            int i39 = onNavigationEvent + 33;
                                            onExtraCallback = i39 % 128;
                                            i11 = i39 % 2 != 0 ? i11 & 118 : i11 & (-113);
                                        }
                                        if ((i3 & 256) != 0) {
                                            i11 &= -234881025;
                                        }
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                        getbacktracenote11 = getbacktracenote2;
                                        getbacktracenote = getbacktracenote4;
                                        z4 = z;
                                        i22 = i11;
                                        i19 = i17;
                                        u2VarOnWarmupCompleted = u2Var2;
                                        getbacktracenote12 = getbacktracenote6;
                                        onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
                                        jIAuthTabCallback = j;
                                        onwarmupcompleted3 = onwarmupcompleted;
                                    } else {
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i25 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                        if ((i3 & 2) != 0) {
                                            int i40 = onNavigationEvent + 15;
                                            onExtraCallback = i40 % 128;
                                            int i41 = i40 % 2;
                                            i18 = i16;
                                            i19 = i17;
                                            i20 = i12;
                                            i21 = i15;
                                            u2VarOnWarmupCompleted = t7a.onWarmupCompleted(false, null, null, 0.0f, null, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 63);
                                            i11 &= -113;
                                        } else {
                                            i18 = i16;
                                            i19 = i17;
                                            i20 = i12;
                                            i21 = i15;
                                            u2VarOnWarmupCompleted = u2Var2;
                                        }
                                        if (i27 != 0) {
                                            getbacktracenote5 = null;
                                        }
                                        onextracallbackwithresultOnWarmupCompleted = i28 != 0 ? t7b.onExtraCallback.onWarmupCompleted() : onextracallbackwithresult;
                                        getbacktracenote11 = i29 != 0 ? null : getbacktracenote2;
                                        onExtraCallbackWithResult2 = i6 != 0 ? t7b.onExtraCallback.onExtraCallbackWithResult() : onextracallbackwithresult2;
                                        getbacktracenote12 = i7 != 0 ? null : getbacktracenote3;
                                        getbacktracenote = i9 == 0 ? getbacktracenote4 : null;
                                        if ((i3 & 256) != 0) {
                                            jIAuthTabCallback = t7b.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                            i11 &= -234881025;
                                        } else {
                                            jIAuthTabCallback = j;
                                        }
                                        z4 = i20 != 0 ? true : z;
                                        onextracallback2 = i18 != 0 ? t7ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback.onWarmupCompleted : onextracallback;
                                        if (i21 != 0) {
                                            int i42 = onExtraCallback + 83;
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                            onNavigationEvent = i42 % 128;
                                            if (i42 % 2 == 0) {
                                                onwarmupcompletedOnExtraCallbackWithResult = t7ExternalSyntheticLambda0.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                                                int i43 = 71 / 0;
                                            } else {
                                                onwarmupcompletedOnExtraCallbackWithResult = t7ExternalSyntheticLambda0.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                                            }
                                        } else {
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                            onwarmupcompletedOnExtraCallbackWithResult = onwarmupcompleted;
                                        }
                                        i22 = i11;
                                        onwarmupcompleted3 = onwarmupcompletedOnExtraCallbackWithResult;
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        onextracallbackwithresult5 = onExtraCallbackWithResult2;
                                        i23 = i19;
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-260580323, i22, i23, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1 (TdsBottomCtaV1.kt:481)");
                                    } else {
                                        onextracallbackwithresult5 = onExtraCallbackWithResult2;
                                        i23 = i19;
                                    }
                                    final t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult2 = onwarmupcompleted3.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i23 >> 3) & 14);
                                    final t7ExternalSyntheticLambda0.onExtraCallback onextracallback4 = onextracallback2;
                                    final u2 u2Var3 = u2VarOnWarmupCompleted;
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                    final boolean z5 = z4;
                                    final long j3 = jIAuthTabCallback;
                                    final getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13 = getbacktracenote12;
                                    final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote14 = getbacktracenote5;
                                    final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult6 = onextracallbackwithresultOnWarmupCompleted;
                                    final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote15 = getbacktracenote11;
                                    final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult7 = onextracallbackwithresult5;
                                    final getBacktraceNote<? super u3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote16 = getbacktracenote;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport04;
                                    putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.IAuthTabCallbackDefault(), null, null, ForwardingCameraControl.onExtraCallback(-1772242374, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda42
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i44 = 2 % 2;
                                            int i45 = onWarmupCompleted + 15;
                                            onExtraCallbackWithResult = i45 % 128;
                                            int i46 = i45 % 2;
                                            Unit unitOnExtraCallbackWithResult = u1.onExtraCallbackWithResult(onextracallback4, u2Var3, quirksExternalSyntheticBackport06, z5, j3, getbacktracenote13, getbacktracenote14, onextracallbackwithresult6, getbacktracenote15, onextracallbackwithresult7, onwarmupcompletedOnExtraCallbackWithResult2, getbacktracenote16, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i47 = onExtraCallbackWithResult + 75;
                                            onWarmupCompleted = i47 % 128;
                                            if (i47 % 2 == 0) {
                                                return unitOnExtraCallbackWithResult;
                                            }
                                            throw null;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    onwarmupcompleted2 = onwarmupcompleted3;
                                    getbacktracenote7 = getbacktracenote11;
                                    z3 = z4;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport07;
                                    onextracallbackwithresult3 = onextracallbackwithresultOnWarmupCompleted;
                                    getbacktracenote10 = getbacktracenote5;
                                    onextracallback3 = onextracallback2;
                                    j2 = jIAuthTabCallback;
                                    getbacktracenote9 = getbacktracenote;
                                    getbacktracenote8 = getbacktracenote12;
                                    onextracallbackwithresult4 = onextracallbackwithresult5;
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                final boolean z6 = z3;
                                final t7ExternalSyntheticLambda0.onExtraCallback onextracallback5 = onextracallback3;
                                final t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted2;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda43
                                    private static int IAuthTabCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i44 = 2 % 2;
                                        int i45 = onNavigationEvent + 107;
                                        IAuthTabCallback = i45 % 128;
                                        int i46 = i45 % 2;
                                        Unit unitOnExtraCallback = u1.onExtraCallback(quirksExternalSyntheticBackport02, u2VarOnWarmupCompleted, getbacktracenote10, onextracallbackwithresult3, getbacktracenote7, onextracallbackwithresult4, getbacktracenote8, getbacktracenote9, j2, z6, onextracallback5, onwarmupcompleted4, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i47 = onNavigationEvent + 23;
                                        IAuthTabCallback = i47 % 128;
                                        if (i47 % 2 == 0) {
                                            int i48 = 8 / 0;
                                        }
                                        return unitOnExtraCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        int i44 = onNavigationEvent + 99;
                        i16 = i13;
                        onExtraCallback = i44 % 128;
                        i14 = i44 % 2 != 0 ? i14 | 57 : i14 | 48;
                        i17 = i14;
                        if ((i11 & 306783379) == 306783378) {
                            z2 = true;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i11 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i9 = i8;
                    i11 = i5;
                    if ((100663296 & i) == 0) {
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                    }
                    i17 = i14;
                    if ((i11 & 306783379) == 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i11 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                getbacktracenote6 = getbacktracenote3;
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i11 = i5;
                if ((100663296 & i) == 0) {
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                i17 = i14;
                if ((i11 & 306783379) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i11 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            onExtraCallbackWithResult2 = onextracallbackwithresult2;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            getbacktracenote6 = getbacktracenote3;
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i11 = i5;
            if ((100663296 & i) == 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            i17 = i14;
            if ((i11 & 306783379) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i11 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i5 = i4;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        onExtraCallbackWithResult2 = onextracallbackwithresult2;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        getbacktracenote6 = getbacktracenote3;
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i11 = i5;
        if ((100663296 & i) == 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        i17 = i14;
        if ((i11 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i11 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, u2 u2Var, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 75;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        return onExtraCallback(quirksExternalSyntheticBackport0, u2Var, z);
    }

    static final /* synthetic */ class asInterface extends FunctionReferenceImpl implements Function1<Float, Float> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        asInterface(Object obj) {
            super(1, obj, u2.class, "onScroll", "onScroll$tds_compose_release(F)F", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Float fOnExtraCallbackWithResult = onExtraCallbackWithResult(((Number) obj).floatValue());
            if (i3 != 0) {
                int i4 = 44 / 0;
            }
            int i5 = onNavigationEvent + 55;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return fOnExtraCallbackWithResult;
        }

        public final Float onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Float fValueOf = Float.valueOf(((u2) ((CallableReference) this).receiver).onExtraCallbackWithResult(f));
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            return fValueOf;
        }
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function0<Float> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        asBinder(Object obj) {
            super(0, obj, u2.class, "onScrollEnd", "onScrollEnd$tds_compose_release()F", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Float fOnNavigationEvent = onNavigationEvent();
            int i3 = onExtraCallback + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return fOnNavigationEvent;
        }

        public final Float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Float fValueOf = Float.valueOf(((u2) ((CallableReference) this).receiver).onTransact());
            int i4 = onExtraCallback + 55;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return fValueOf;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[0];
        final t7ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (t7ExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[1];
        final t4 t4Var = (t4) objArr[2];
        final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2 = (setCallToAction.onExtraCallbackWithResult) objArr[3];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        int i = 2 % 2;
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(getWrite.IAuthTabCallback(onextracallbackwithresult, t4Var), ForwardingCameraControl.onExtraCallbackWithResult(-1249314940, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda32
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 105;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = u1.onWarmupCompleted(t4Var, getbacktracenote, onextracallbackwithresult, onextracallbackwithresult2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i5 = onNavigationEvent + 23;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }));
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return listIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1606449081, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:680)");
                int i5 = onExtraCallback + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            getbacktracenote.invoke(u4Var, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 43;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onExtraCallback + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1067433723, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:679)");
                    int i7 = onNavigationEvent + 25;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                putCharSequence.onExtraCallback(null, null, null, null, onextracallbackwithresult, false, ForwardingCameraControl.onExtraCallback(-1606449081, true, new TdsBottomCtaV1Kt$$ExternalSyntheticLambda18(getbacktracenote, u4Var), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 47);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                putCharSequence.onExtraCallback(null, null, null, null, onextracallbackwithresult, false, ForwardingCameraControl.onExtraCallback(-1606449081, true, new TdsBottomCtaV1Kt$$ExternalSyntheticLambda18(getbacktracenote, u4Var), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 47);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(t7ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, final getBacktraceNote getbacktracenote, final u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 97;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i7 = i4 + 31;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2136320270, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:678)");
            }
            putBooleanArray.IAuthTabCallback(onextracallbackwithresult, ForwardingCameraControl.onExtraCallback(1067433723, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda34
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 103;
                    onExtraCallback = i10 % 128;
                    Object obj3 = null;
                    if (i10 % 2 != 0) {
                        u1.onExtraCallback(onextracallbackwithresult2, getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = u1.onExtraCallback(onextracallbackwithresult2, getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = onExtraCallback + 69;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 19;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                i2 = onExtraCallback + 49;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i11 = i2 % 2;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 39;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = onNavigationEvent + 47;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-907139490, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:687)");
            }
            getbacktracenote.invoke(u4Var, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, final getBacktraceNote getbacktracenote, final u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i3 + 31;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 103;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1435794670, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:686)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1435794670, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:686)");
            }
            putCharSequence.onExtraCallback(null, null, null, null, onextracallbackwithresult, false, ForwardingCameraControl.onExtraCallback(-907139490, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 33;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnNavigationEvent = u1.onNavigationEvent(getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = IAuthTabCallback + 67;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 47);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 13;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 8 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onNavigationEvent + 83;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(t4 t4Var, final getBacktraceNote getbacktracenote, final t7ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallback + 115;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 111;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1249314940, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous> (TdsBottomCtaV1.kt:673)");
                    int i5 = 14 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1249314940, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot.<anonymous>.<anonymous>.ctaMeasurable.<anonymous> (TdsBottomCtaV1.kt:673)");
                }
            }
            t4 t4Var2 = t4.ContentSize;
            boolean z = t4Var != t4Var2;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new u4(z);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final u4 u4Var = (u4) objOnMinimized;
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1845412462);
                if (t4Var == t4Var2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1845466867);
                    setPostviewFormatSelector.onNavigationEvent(setThreadList.access100().onExtraCallback((Object) null), ForwardingCameraControl.onExtraCallback(2136320270, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda36
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 95;
                            onExtraCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                return u1.onExtraCallbackWithResult(onextracallbackwithresult, onextracallbackwithresult2, getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            u1.onExtraCallbackWithResult(onextracallbackwithresult, onextracallbackwithresult2, getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1845829102);
                    putBooleanArray.IAuthTabCallback(onextracallbackwithresult, ForwardingCameraControl.onExtraCallback(-1435794670, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda37
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 15;
                            onExtraCallback = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitOnNavigationEvent = u1.onNavigationEvent(onextracallbackwithresult2, getbacktracenote, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i9 = onWarmupCompleted + 91;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1846073630);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 97;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 15;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.IntRef intRef, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Iterator it = ((Iterable) objectRef.element).iterator();
        while (it.hasNext()) {
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) it.next(), 0, 0, 0.0f, 4, (Object) null);
        }
        Iterator it2 = ((Iterable) objectRef2.element).iterator();
        while (it2.hasNext()) {
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            Integer num = null;
            if (i2 % 2 == 0) {
                Integer.valueOf(intRef.element).intValue();
                throw null;
            }
            getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) it2.next();
            Integer numValueOf = Integer.valueOf(intRef.element);
            if (numValueOf.intValue() <= 0) {
                int i3 = onExtraCallback + 5;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            } else {
                num = numValueOf;
            }
            if (num != null) {
                int i5 = onNavigationEvent + 17;
                onExtraCallback = i5 % 128;
                iIntValue = i5 % 2 != 0 ? num.intValue() >>> getBacktraceNoteBytes.onExtraCallback(f) : num.intValue() + getBacktraceNoteBytes.onExtraCallback(f);
            } else {
                iIntValue = 0;
            }
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, iIntValue, 0.0f, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final component8 IAuthTabCallback(setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote getbacktracenote2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        long jOnExtraCallback;
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        List list = (List) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{isextrapreviewrequired, t7ExternalSyntheticLambda0.onExtraCallbackWithResult.CtaButton, t4.ContentSize, onextracallbackwithresult, getbacktracenote}, -1568174950, 1568174961, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(((component7) it.next()).onExtraCallback(virtualCameraCaptureResult.onExtraCallback()));
        }
        List list2 = (List) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{isextrapreviewrequired, t7ExternalSyntheticLambda0.onExtraCallbackWithResult.SecondaryButton, t4.ContentSize, onextracallbackwithresult2, getbacktracenote2}, -1568174950, 1568174961, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 5;
        }
        while (it2.hasNext()) {
            arrayList2.add(((component7) it2.next()).onExtraCallback(virtualCameraCaptureResult.onExtraCallback()));
        }
        float fOnExtraCallback = isextrapreviewrequired.onExtraCallback(t7b.onExtraCallback.onExtraCallback());
        float fAsInterface = (VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()) - fOnExtraCallback) / 2.0f;
        boolean zOnNavigationEvent = onwarmupcompleted.onNavigationEvent(((float) y1g.onExtraCallback(arrayList)) > fAsInterface || ((float) y1g.onExtraCallback(arrayList2)) > fAsInterface);
        if (y1g.onExtraCallback(arrayList) > 0) {
            int i6 = onNavigationEvent + 103;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            jOnExtraCallback = (y1g.onExtraCallback(arrayList2) <= 0 || zOnNavigationEvent) ? virtualCameraCaptureResult.onExtraCallback() : VirtualCameraCaptureResult.IAuthTabCallback(virtualCameraCaptureResult.onExtraCallback(), 0, getBacktraceNoteBytes.onExtraCallback((VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()) - fOnExtraCallback) / 2.0f), 0, 0, 13, (Object) null);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        List list3 = (List) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{isextrapreviewrequired, t7ExternalSyntheticLambda0.onExtraCallbackWithResult.CtaButton, t4.Final, onextracallbackwithresult, getbacktracenote}, -1568174950, 1568174961, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((component7) it3.next()).onExtraCallback(jOnExtraCallback));
        }
        objectRef.element = arrayList3;
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        List list4 = (List) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{isextrapreviewrequired, t7ExternalSyntheticLambda0.onExtraCallbackWithResult.SecondaryButton, t4.Final, onextracallbackwithresult2, getbacktracenote2}, -1568174950, 1568174961, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            int i8 = onNavigationEvent + 73;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            arrayList4.add(((component7) it4.next()).onExtraCallback(jOnExtraCallback));
        }
        objectRef2.element = arrayList4;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = y1g.IAuthTabCallback((List) objectRef.element);
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = y1g.onExtraCallback((List) objectRef2.element);
        int iIAuthTabCallback = y1g.IAuthTabCallback((List) objectRef2.element);
        if (!zOnNavigationEvent) {
            int i10 = onNavigationEvent + 35;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = intRef.element;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i12 = intRef.element;
            if (i12 <= 0 || iIAuthTabCallback <= 0) {
                f = fOnExtraCallback;
            } else {
                int i13 = onExtraCallback + 119;
                f = fOnExtraCallback;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                if (i12 != iIAuthTabCallback) {
                    long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(jOnExtraCallback, 0, 0, Math.max(i12, iIAuthTabCallback), 0, 11, (Object) null);
                    List list5 = (List) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{isextrapreviewrequired, t7ExternalSyntheticLambda0.onExtraCallbackWithResult.CtaButton, t4.EqualHeight, onextracallbackwithresult, getbacktracenote}, -1568174950, 1568174961, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        int i15 = onExtraCallback + 125;
                        onNavigationEvent = i15 % 128;
                        int i16 = i15 % 2;
                        arrayList5.add(((component7) it5.next()).onExtraCallback(jIAuthTabCallback));
                    }
                    objectRef.element = arrayList5;
                    List list6 = (List) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{isextrapreviewrequired, t7ExternalSyntheticLambda0.onExtraCallbackWithResult.SecondaryButton, t4.EqualHeight, onextracallbackwithresult2, getbacktracenote2}, -1568174950, 1568174961, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(((component7) it6.next()).onExtraCallback(jIAuthTabCallback));
                    }
                    objectRef2.element = arrayList6;
                    intRef.element = y1g.IAuthTabCallback((List) objectRef.element);
                    intRef2.element = y1g.onExtraCallback((List) objectRef2.element);
                    iIAuthTabCallback = y1g.IAuthTabCallback((List) objectRef2.element);
                }
            }
        }
        if (!zOnNavigationEvent) {
            final float f2 = f;
            return component4.IAuthTabCallback(isextrapreviewrequired, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), Math.max(iIAuthTabCallback, intRef.element), (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda17
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i17 = 2 % 2;
                    int i18 = onWarmupCompleted + 87;
                    IAuthTabCallback = i18 % 128;
                    if (i18 % 2 != 0) {
                        Ref.ObjectRef objectRef3 = objectRef2;
                        Ref.ObjectRef objectRef4 = objectRef;
                        Ref.IntRef intRef3 = intRef2;
                        Float fValueOf = Float.valueOf(f2);
                        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                        throw null;
                    }
                    Ref.ObjectRef objectRef5 = objectRef2;
                    Ref.ObjectRef objectRef6 = objectRef;
                    Ref.IntRef intRef4 = intRef2;
                    Float fValueOf2 = Float.valueOf(f2);
                    int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                    Unit unit = (Unit) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{objectRef5, objectRef6, intRef4, fValueOf2, (getStreamSharingChildren.onExtraCallbackWithResult) obj2}, -224956511, 224956519, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, setCurrentIndex.onNavigationEvent());
                    int i19 = IAuthTabCallback + 107;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    return unit;
                }
            }, 4, (Object) null);
        }
        int iOnExtraCallback = intRef.element;
        if (iOnExtraCallback > 0 && iIAuthTabCallback > 0) {
            iOnExtraCallback += getBacktraceNoteBytes.onExtraCallback(f);
        }
        final float f3 = f;
        return component4.IAuthTabCallback(isextrapreviewrequired, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), iOnExtraCallback + iIAuthTabCallback, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda16
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i17 = 2 % 2;
                int i18 = onWarmupCompleted + 9;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                Unit unitIAuthTabCallback = u1.IAuthTabCallback(objectRef, objectRef2, intRef, f3, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                int i20 = onWarmupCompleted + 19;
                onNavigationEvent = i20 % 128;
                if (i20 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008d A[PHI: r2
      0x008d: PHI (r2v9 o.getStreamSharingChildren) = (r2v8 o.getStreamSharingChildren), (r2v17 o.getStreamSharingChildren) binds: [B:15:0x008b, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getStreamSharingChildren getstreamsharingchildren;
        Integer numValueOf;
        int iIntValue;
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
        Ref.ObjectRef objectRef2 = (Ref.ObjectRef) objArr[1];
        Ref.IntRef intRef = (Ref.IntRef) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Iterator it = ((Iterable) objectRef.element).iterator();
        while (it.hasNext()) {
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) it.next(), 0, 0, 0.0f, 4, (Object) null);
        }
        Iterator it2 = ((Iterable) objectRef2.element).iterator();
        while (it2.hasNext()) {
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                getstreamsharingchildren = (getStreamSharingChildren) it2.next();
                numValueOf = Integer.valueOf(intRef.element);
                int i5 = 0 / 0;
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
            } else {
                getstreamsharingchildren = (getStreamSharingChildren) it2.next();
                numValueOf = Integer.valueOf(intRef.element);
                if (numValueOf.intValue() <= 0) {
                }
            }
            getStreamSharingChildren getstreamsharingchildren2 = getstreamsharingchildren;
            if (numValueOf != null) {
                int i6 = onExtraCallback + 81;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                iIntValue = numValueOf.intValue() + getBacktraceNoteBytes.onExtraCallback(fFloatValue);
            } else {
                iIntValue = 0;
            }
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, iIntValue, 0, 0.0f, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        int i5;
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted;
        int i6;
        getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        int i7;
        int i8;
        t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted2;
        final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i9;
        setCallToAction.onExtraCallbackWithResult onExtraCallbackWithResult2;
        boolean z;
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1354791980);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i12 = onNavigationEvent + 101;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            int i15 = onNavigationEvent + 41;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                getbacktracenote3 = getbacktracenote;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 32 : 16;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresultOnWarmupCompleted) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        getbacktracenote4 = getbacktracenote2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4) ? 2048 : 1024;
                    }
                    i7 = i2 & 16;
                    if (i7 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        int i17 = onNavigationEvent + 89;
                        onExtraCallback = i17 % 128;
                        if (i17 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2);
                            throw null;
                        }
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult2) ? 16384 : 8192;
                    }
                    i8 = i2 & 32;
                    if (i8 == 0) {
                        i3 |= 196608;
                        onwarmupcompletedOnExtraCallbackWithResult = onwarmupcompleted;
                    } else {
                        onwarmupcompletedOnExtraCallbackWithResult = onwarmupcompleted;
                        if ((i & 196608) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompletedOnExtraCallbackWithResult) ? 131072 : 65536;
                        }
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        getbacktracenote5 = getbacktracenote3;
                        onwarmupcompleted2 = onwarmupcompletedOnExtraCallbackWithResult;
                        getbacktracenote6 = getbacktracenote4;
                        onextracallbackwithresult3 = onextracallbackwithresult2;
                    } else {
                        quirksExternalSyntheticBackport03 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if (i14 != 0) {
                            getbacktracenote3 = null;
                        }
                        if (i5 != 0) {
                            int i18 = onExtraCallback + 17;
                            onNavigationEvent = i18 % 128;
                            if (i18 % 2 == 0) {
                                t7b.onExtraCallback.onWarmupCompleted();
                                throw null;
                            }
                            onextracallbackwithresultOnWarmupCompleted = t7b.onExtraCallback.onWarmupCompleted();
                        }
                        if (i6 != 0) {
                            int i19 = onExtraCallback + 71;
                            onNavigationEvent = i19 % 128;
                            i9 = 2;
                            int i20 = i19 % 2;
                            getbacktracenote4 = null;
                        } else {
                            i9 = 2;
                        }
                        if (i7 != 0) {
                            int i21 = onExtraCallback + 109;
                            onNavigationEvent = i21 % 128;
                            if (i21 % i9 == 0) {
                                onExtraCallbackWithResult2 = t7b.onExtraCallback.onExtraCallbackWithResult();
                                int i22 = 81 / 0;
                            } else {
                                onExtraCallbackWithResult2 = t7b.onExtraCallback.onExtraCallbackWithResult();
                            }
                            int i23 = onNavigationEvent + 83;
                            onExtraCallback = i23 % 128;
                            int i24 = i23 % 2;
                        } else {
                            onExtraCallbackWithResult2 = onextracallbackwithresult2;
                        }
                        if (i8 != 0) {
                            onwarmupcompletedOnExtraCallbackWithResult = t7ExternalSyntheticLambda0.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i25 = onNavigationEvent + 37;
                            onExtraCallback = i25 % 128;
                            if (i25 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1354791980, i3, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot (TdsBottomCtaV1.kt:665)");
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1354791980, i3, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaSlot (TdsBottomCtaV1.kt:665)");
                        }
                        boolean z2 = (i3 & 896) == 256;
                        boolean z3 = (i3 & 112) == 32;
                        if ((57344 & i3) == 16384) {
                            int i26 = onExtraCallback + 107;
                            onNavigationEvent = i26 % 128;
                            int i27 = i26 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z4 = (i3 & 7168) == 2048;
                        boolean z5 = (458752 & i3) == 131072;
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((z3 | z2 | z | z4 | z5) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresultOnWarmupCompleted;
                            final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = getbacktracenote3;
                            final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult5 = onExtraCallbackWithResult2;
                            final getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = getbacktracenote4;
                            final t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted3 = onwarmupcompletedOnExtraCallbackWithResult;
                            objOnMinimized = new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda5
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i28 = 2 % 2;
                                    int i29 = onNavigationEvent + 21;
                                    onExtraCallback = i29 % 128;
                                    int i30 = i29 % 2;
                                    component8 component8VarOnWarmupCompleted = u1.onWarmupCompleted(onextracallbackwithresult4, getbacktracenote7, onextracallbackwithresult5, getbacktracenote8, onwarmupcompleted3, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                    int i31 = onNavigationEvent + 41;
                                    onExtraCallback = i31 % 128;
                                    int i32 = i31 % 2;
                                    return component8VarOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport03, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 14, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        onextracallbackwithresult3 = onExtraCallbackWithResult2;
                        getbacktracenote5 = getbacktracenote3;
                        onwarmupcompleted2 = onwarmupcompletedOnExtraCallbackWithResult;
                        getbacktracenote6 = getbacktracenote4;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final setCallToAction.onExtraCallbackWithResult onextracallbackwithresult6 = onextracallbackwithresultOnWarmupCompleted;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda6
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj, Object obj2) {
                                int i28 = 2 % 2;
                                int i29 = onExtraCallback + 55;
                                IAuthTabCallback = i29 % 128;
                                int i30 = i29 % 2;
                                Unit unitIAuthTabCallback = u1.IAuthTabCallback(quirksExternalSyntheticBackport03, getbacktracenote5, onextracallbackwithresult6, getbacktracenote6, onextracallbackwithresult3, onwarmupcompleted2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i31 = IAuthTabCallback + 57;
                                onExtraCallback = i31 % 128;
                                if (i31 % 2 == 0) {
                                    return unitIAuthTabCallback;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                getbacktracenote4 = getbacktracenote2;
                i7 = i2 & 16;
                if (i7 == 0) {
                }
                i8 = i2 & 32;
                if (i8 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            getbacktracenote4 = getbacktracenote2;
            i7 = i2 & 16;
            if (i7 == 0) {
            }
            i8 = i2 & 32;
            if (i8 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        getbacktracenote3 = getbacktracenote;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        getbacktracenote4 = getbacktracenote2;
        i7 = i2 & 16;
        if (i7 == 0) {
        }
        i8 = i2 & 32;
        if (i8 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 74899) == 74898, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 16 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Deprecated
    public static final void onWarmupCompleted(boolean z, @NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, boolean z2, boolean z3, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, boolean z4, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Function0<Unit> function02;
        boolean z5;
        setCallToAction.onWarmupCompleted onwarmupcompleted2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 8) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = IAuthTabCallback + 95;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            u1.onExtraCallback();
                            throw null;
                        }
                        Unit unitOnExtraCallback = u1.onExtraCallback();
                        int i6 = IAuthTabCallback + 69;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 69 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function02 = (Function0) objOnMinimized;
        } else {
            function02 = function0;
        }
        if ((i2 & 16) != 0) {
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            z5 = i4 % 2 != 0;
        } else {
            z5 = z2;
        }
        boolean z6 = (i2 & 32) != 0 ? true : z3;
        if ((i2 & 64) != 0) {
            int i5 = onExtraCallback + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            onwarmupcompleted2 = setCallToAction.onWarmupCompleted.Primary;
        } else {
            onwarmupcompleted2 = onwarmupcompleted;
        }
        setCallToAction.onExtraCallback onextracallback2 = (i2 & 128) != 0 ? setCallToAction.onExtraCallback.Fill : onextracallback;
        boolean z7 = (i2 & 256) != 0 ? true : z4;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-16077312, i, -1, "im.toss.tds.compose.component.compound.bottomcta.KeyboardBottomCta (TdsBottomCtaV1.kt:819)");
        }
        int i7 = i >> 18;
        onExtraCallbackWithResult(z, str, quirksExternalSyntheticBackport02, function02, z5, z6, setBody.onExtraCallback.onWarmupCompleted(onwarmupcompleted2, onextracallback2, cameraCaptureResultEmptyCameraCaptureResult, (i7 & 14) | 384 | (i7 & 112), 0), z7, cameraCaptureResultEmptyCameraCaptureResult, (524286 & i) | ((i >> 3) & 29360128), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 29;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i9 != 0) {
                throw null;
            }
        }
    }

    private static final Unit IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean $keyboardState;
        final /* synthetic */ r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, boolean z, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
            this.$keyboardState = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$keyboardState, access13800Var);
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            t5a t5aVar;
            int i;
            int i2 = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i4 == 0) {
                throw null;
            }
            r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = this.$state;
            if (!this.$keyboardState) {
                t5aVar = t5a.Closed;
                i = onExtraCallbackWithResult + 71;
                onNavigationEvent = i % 128;
            } else {
                t5aVar = t5a.Opened;
                i = onNavigationEvent + 39;
                onExtraCallbackWithResult = i % 128;
            }
            int i5 = i % 2;
            r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1285273150, getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1285273150, new Object[]{r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, t5aVar});
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0147  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(final boolean z, @NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, boolean z2, boolean z3, @Nullable setClickDestinationBackupUri setclickdestinationbackupuri, boolean z4, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        Function0<Unit> function02;
        int i6;
        int i7;
        boolean z5;
        int i8;
        int i9;
        boolean z6;
        int i10;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final setClickDestinationBackupUri setclickdestinationbackupuri2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final boolean z7;
        final boolean z8;
        final Function0<Unit> function03;
        final boolean z9;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        setClickDestinationBackupUri setclickdestinationbackupuriOnExtraCallbackWithResult;
        setClickDestinationBackupUri setclickdestinationbackupuri3;
        boolean z10;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Function0<Unit> function04;
        boolean z11;
        boolean z12;
        t5a t5aVar;
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
        boolean zOnNavigationEvent;
        boolean z13;
        Object objOnMinimized;
        int i11 = 2 % 2;
        int i12 = onNavigationEvent + 35;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-926460536);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i15 = onExtraCallback + 53;
                    onNavigationEvent = i15 % 128;
                    i4 = i15 % 2 == 0 ? 20326 : 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                        int i16 = onNavigationEvent + 47;
                        onExtraCallback = i16 % 128;
                        i6 = i16 % 2 != 0 ? 9396 : 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z5 = z2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5)) {
                            int i17 = onExtraCallback + 35;
                            onNavigationEvent = i17 % 128;
                            i8 = i17 % 2 == 0 ? 29059 : 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            int i18 = onExtraCallback + 69;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            z6 = z3;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z6) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                int i20 = onExtraCallback + 31;
                                onNavigationEvent = i20 % 128;
                                int i21 = i20 % 2;
                                int i22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclickdestinationbackupuri) ? 1048576 : 524288;
                                i3 |= i22;
                            }
                            i3 |= i22;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 8388608 : 4194304;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 4793491) != 4793490, i3 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                if (i14 != 0) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                                    int i23 = onExtraCallback + 113;
                                    onNavigationEvent = i23 % 128;
                                    int i24 = i23 % 2;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                }
                                if (i5 != 0) {
                                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda40
                                            private static int onExtraCallback = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke() {
                                                int i25 = 2 % 2;
                                                int i26 = onExtraCallback + 119;
                                                onWarmupCompleted = i26 % 128;
                                                int i27 = i26 % 2;
                                                Unit unitOnNavigationEvent = u1.onNavigationEvent();
                                                int i28 = onWarmupCompleted + 5;
                                                onExtraCallback = i28 % 128;
                                                if (i28 % 2 == 0) {
                                                    return unitOnNavigationEvent;
                                                }
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                    }
                                    function02 = (Function0) objOnMinimized2;
                                }
                                if (i7 != 0) {
                                    int i25 = onExtraCallback + 115;
                                    onNavigationEvent = i25 % 128;
                                    int i26 = i25 % 2;
                                    z5 = false;
                                }
                                if (i9 != 0) {
                                    z6 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    setclickdestinationbackupuriOnExtraCallbackWithResult = setBody.onExtraCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                    i3 &= -3670017;
                                } else {
                                    setclickdestinationbackupuriOnExtraCallbackWithResult = setclickdestinationbackupuri;
                                }
                                if (i10 != 0) {
                                    setclickdestinationbackupuri3 = setclickdestinationbackupuriOnExtraCallbackWithResult;
                                    z10 = z6;
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                    function04 = function02;
                                    z11 = z5;
                                    z12 = true;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-926460536, i3, -1, "im.toss.tds.compose.component.compound.bottomcta.KeyboardBottomCta (TdsBottomCtaV1.kt:843)");
                                }
                                if (z) {
                                    t5aVar = t5a.Closed;
                                } else {
                                    int i27 = onExtraCallback + 113;
                                    onNavigationEvent = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        t5a t5aVar2 = t5a.Opened;
                                        throw null;
                                    }
                                    t5aVar = t5a.Opened;
                                }
                                r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{t5aVar, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0}, -1912856437, 1912856439, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg);
                                int i28 = i3 & 14;
                                z13 = i28 == 4;
                                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z13 | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new onExtraCallbackWithResult(r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, z, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i28);
                                int i29 = i3 >> 3;
                                int i30 = i3 << 3;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                t7ExternalSyntheticLambda0.onNavigationEvent.IAuthTabCallback(str, quirksExternalSyntheticBackport04, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setclickdestinationbackupuri3, 0L, z11, z10, z12, function04, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i29 & 14) | 805306368 | (i29 & 112) | ((i3 >> 9) & 7168) | (458752 & i30) | (i30 & 3670016) | (29360128 & i3) | ((i3 << 15) & 234881024), 16);
                                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                function03 = function04;
                                z7 = z11;
                                z8 = z10;
                                setclickdestinationbackupuri2 = setclickdestinationbackupuri3;
                                z9 = z12;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                setclickdestinationbackupuriOnExtraCallbackWithResult = setclickdestinationbackupuri;
                            }
                            z12 = z4;
                            setclickdestinationbackupuri3 = setclickdestinationbackupuriOnExtraCallbackWithResult;
                            z10 = z6;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                            function04 = function02;
                            z11 = z5;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            if (z) {
                            }
                            r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{t5aVar, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0}, -1912856437, 1912856439, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg);
                            int i282 = i3 & 14;
                            if (i282 == 4) {
                            }
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z13 | zOnNavigationEvent)) {
                                objOnMinimized = new onExtraCallbackWithResult(r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, z, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i282);
                                int i292 = i3 >> 3;
                                int i302 = i3 << 3;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                t7ExternalSyntheticLambda0.onNavigationEvent.IAuthTabCallback(str, quirksExternalSyntheticBackport04, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setclickdestinationbackupuri3, 0L, z11, z10, z12, function04, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i292 & 14) | 805306368 | (i292 & 112) | ((i3 >> 9) & 7168) | (458752 & i302) | (i302 & 3670016) | (29360128 & i3) | ((i3 << 15) & 234881024), 16);
                                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                }
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                function03 = function04;
                                z7 = z11;
                                z8 = z10;
                                setclickdestinationbackupuri2 = setclickdestinationbackupuri3;
                                z9 = z12;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            setclickdestinationbackupuri2 = setclickdestinationbackupuri;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            z7 = z5;
                            z8 = z6;
                            function03 = function02;
                            z9 = z4;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda41
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i31 = 2 % 2;
                                    int i32 = onExtraCallbackWithResult + 23;
                                    onNavigationEvent = i32 % 128;
                                    int i33 = i32 % 2;
                                    Unit unitOnNavigationEvent = u1.onNavigationEvent(z, str, quirksExternalSyntheticBackport03, function03, z7, z8, setclickdestinationbackupuri2, z9, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i34 = onNavigationEvent + 11;
                                    onExtraCallbackWithResult = i34 % 128;
                                    if (i34 % 2 == 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    throw null;
                                }
                            });
                            int i31 = onExtraCallback + 39;
                            onNavigationEvent = i31 % 128;
                            int i32 = i31 % 2;
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    z6 = z3;
                    if ((1572864 & i) == 0) {
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                z5 = z2;
                i9 = i2 & 32;
                if (i9 != 0) {
                }
                z6 = z3;
                if ((1572864 & i) == 0) {
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            function02 = function0;
            i7 = i2 & 16;
            if (i7 != 0) {
            }
            z5 = z2;
            i9 = i2 & 32;
            if (i9 != 0) {
            }
            z6 = z3;
            if ((1572864 & i) == 0) {
            }
            i10 = i2 & 128;
            if (i10 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function02 = function0;
        i7 = i2 & 16;
        if (i7 != 0) {
        }
        z5 = z2;
        i9 = i2 & 32;
        if (i9 != 0) {
        }
        z6 = z3;
        if ((1572864 & i) == 0) {
        }
        i10 = i2 & 128;
        if (i10 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg onExtraCallback(t5a t5aVar) {
        int i = 2 % 2;
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = new r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg(t5aVar);
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
        }
        throw null;
    }

    private static final void IAuthTabCallback(View view, r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg) {
        t5a t5aVar;
        int i = 2 % 2;
        view.getWindowVisibleDisplayFrame(new Rect());
        if (r7 - r1.bottom > view.getRootView().getHeight() * 0.15d) {
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                t5aVar = t5a.Opened;
                int i3 = 74 / 0;
            } else {
                t5aVar = t5a.Opened;
            }
        } else {
            t5aVar = t5a.Closed;
            int i4 = onNavigationEvent + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg.IAuthTabCallback(getKekid.onExtraCallback(), getKekid.onExtraCallback(), 1285273150, getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1285273150, new Object[]{r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, t5aVar});
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1224880172);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1224880172);
        if (i != 0) {
            z = true;
        } else {
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i6 = onNavigationEvent + 111;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1224880172, i, -1, "im.toss.tds.compose.component.compound.bottomcta.OneButton (TdsBottomCtaV1.kt:923)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, t5.onExtraCallback.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 12582912, 98303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsBottomCtaV1Kt$.ExternalSyntheticLambda35(i));
        }
    }

    private static final void asInterface(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1483218502);
        if (i != 0) {
            int i3 = onExtraCallback + 125;
            onNavigationEvent = i3 % 128;
            z = !(i3 % 2 == 0);
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 15;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1483218502, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TwoButton (TdsBottomCtaV1.kt:956)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, t5.onExtraCallback.asBinder(), cameraCaptureResultEmptyCameraCaptureResult2, 0, 12582912, 98303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda28
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 7;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = i;
                        int iIntValue = ((Integer) obj2).intValue();
                        Object[] objArr = {Integer.valueOf(i8), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                        throw null;
                    }
                    int i9 = i;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object[] objArr2 = {Integer.valueOf(i9), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
                    int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                    Unit unit = (Unit) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr2, 558687803, -558687802, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent2, setCurrentIndex.onNavigationEvent());
                    int i10 = onNavigationEvent + 87;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            });
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        boolean z = true;
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(850240791);
        if (iIntValue != 0) {
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = onNavigationEvent + 53;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(850240791, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.TwoButtonEmptyCase (TdsBottomCtaV1.kt:993)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
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
            AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(new AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), null), null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
            t5 t5Var = t5.onExtraCallback;
            obj = null;
            IAuthTabCallback(null, null, t5Var.mayLaunchUrl(), null, t5Var.readTypedObject(), null, (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, 1916108172, -1916108163, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, 1467967318, -1467967296, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 14180736, 0, 3883);
            AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(new AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), null), null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
            IAuthTabCallback(null, null, t5Var.ICustomTabsCallback(), null, (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, 1921663358, -1921663358, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), null, t5Var.extraCallbackWithResult(), t5Var.onActivityResized(), 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 14180736, 0, 3883);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda31
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 117;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnTransact = u1.onTransact(iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i8 = onNavigationEvent + 27;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    return unitOnTransact;
                }
            });
            int i5 = onNavigationEvent + 107;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return obj;
    }

    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-362639725);
        if (i != 0) {
            int i5 = onExtraCallback + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i7 = onNavigationEvent + 25;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-362639725, i, -1, "im.toss.tds.compose.component.compound.bottomcta.KeyboardAware (TdsBottomCtaV1.kt:1049)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, t5.onExtraCallback.ICustomTabsCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult2, 0, 12582912, 98303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsBottomCtaV1Kt$.ExternalSyntheticLambda38(i));
            int i9 = onExtraCallback + 99;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = onNavigationEvent + 61;
        onExtraCallback = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 87 / 0;
        }
    }

    private static final void asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1890316290);
        if (i != 0) {
            int i5 = onNavigationEvent + 87;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1))) {
            if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onExtraCallback + 83;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1890316290, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TextButtonWithSize (TdsBottomCtaV1.kt:1066)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, t5.onExtraCallback.onMinimized(), cameraCaptureResultEmptyCameraCaptureResult2, 0, 12582912, 98303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 37;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda33
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 33;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        return (Unit) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{Integer.valueOf(i), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, -27240170, 27240170, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(931870111);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onNavigationEvent + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(931870111, i, -1, "im.toss.tds.compose.component.compound.bottomcta.PaddingTest (TdsBottomCtaV1.kt:1096)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, (getBacktraceNote) t5.onExtraCallback(new Object[]{t5.onExtraCallback}, 1425670835, -1425670824, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResult2, 0, 12582912, 98303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsBottomCtaV1Kt$.ExternalSyntheticLambda13(i));
            int i5 = onNavigationEvent + 89;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 3;
            }
        }
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2121163669);
        if (i != 0) {
            int i3 = onNavigationEvent + 79;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 37;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 15;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2121163669, i, -1, "im.toss.tds.compose.component.compound.bottomcta.AccessoryContainerPreview (TdsBottomCtaV1.kt:1134)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2121163669, i, -1, "im.toss.tds.compose.component.compound.bottomcta.AccessoryContainerPreview (TdsBottomCtaV1.kt:1134)");
                int i9 = onNavigationEvent + 51;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 % 3;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), 0L, t5.onExtraCallback.access000(), cameraCaptureResultEmptyCameraCaptureResult2, 0, 12582912, 98303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsBottomCtaV1Kt$.ExternalSyntheticLambda2(i));
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1660912939);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1660912939);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 29;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1660912939, i, -1, "im.toss.tds.compose.component.compound.bottomcta.CtaBreakPreview (TdsBottomCtaV1.kt:1177)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f));
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f), 0.0f, 0.0f, 13, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
                int i6 = onExtraCallback + 9;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            t5 t5Var = t5.onExtraCallback;
            IAuthTabCallback(null, null, t5Var.getInterfaceDescriptor(), null, (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, -1282613669, 1282613692, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), null, null, null, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960, 0, 4075);
            IAuthTabCallback(null, null, t5Var.onUnminimized(), null, t5Var.writeTypedObject(), null, null, null, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960, 0, 4075);
            IAuthTabCallback(null, null, t5Var.extraCallback(), null, t5Var.onExtraCallbackWithResult(), null, null, null, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960, 0, 4075);
            IAuthTabCallback(null, null, t5Var.ICustomTabsCallbackStub(), null, t5Var.onMessageChannelReady(), null, null, null, 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24960, 0, 4075);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsBottomCtaV1Kt$.ExternalSyntheticLambda39(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue2 & 6) == 0) {
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = onNavigationEvent + 113;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2 != 0 ? 2 : 4;
                iIntValue2 |= i6;
            }
        }
        if ((iIntValue2 & 19) != 18) {
            int i7 = onNavigationEvent;
            int i8 = i7 + 91;
            onExtraCallback = i8 % 128;
            z = i8 % 2 == 0;
            int i9 = i7 + 83;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 % 5;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1)) {
            int i11 = onExtraCallback + 1;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1566449217, iIntValue2, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateColumnPreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:1257)");
            }
            w5aVar.onExtraCallbackWithResult("TEST: " + iIntValue, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue2 << 6) & 896, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallback + 73;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    private static final void IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        ?? r26;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(932762198);
        boolean z = true;
        int i3 = 0;
        int i4 = 3;
        Integer num = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 83;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(932762198, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateColumnPreview (TdsBottomCtaV1.kt:1240)");
            }
            u2 u2VarOnWarmupCompleted = t7a.onWarmupCompleted(false, null, null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), new t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(num, i3, i4, num), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 38);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), u2VarOnWarmupCompleted, false, 2, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i7 = onExtraCallback + 115;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    int i8 = 40 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(475902131);
            IntIterator it = new IntRange(0, 100).iterator();
            while (it.hasNext()) {
                final int iNextInt = it.nextInt();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1566449217, z, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda29
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 85;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitIAuthTabCallback = u1.IAuthTabCallback(iNextInt, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i12 = onNavigationEvent + 67;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 6, 0, 131070);
                int i9 = onNavigationEvent + 65;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                num = num;
                z = z;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3;
            }
            Integer num2 = num;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.onWarmupCompleted());
            t5 t5Var = t5.onExtraCallback;
            IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted3, u2VarOnWarmupCompleted, (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, -1216242071, 1216242090, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), null, t5Var.onExtraCallback(), null, (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, -677864692, 677864707, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, 1677231245, -1677231228, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 14180736, 0, 3880);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            r26 = num2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                r26 = num2;
            }
        } else {
            Object obj = null;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i11 = onNavigationEvent + 23;
            onExtraCallback = i11 % 128;
            r26 = obj;
            if (i11 % 2 != 0) {
                int i12 = 5 / 3;
                r26 = obj;
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda30
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        return (Unit) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{Integer.valueOf(i), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, -1243454351, 1243454355, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
            int i13 = onNavigationEvent + 11;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = onExtraCallback + 9;
        onNavigationEvent = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        r26.hashCode();
        throw r26;
    }

    private static final Unit onWarmupCompleted(AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, 107, (Function1) null, (Function1) null, t5.onExtraCallback.onWarmupCompleted(), 126, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, 100, (Function1) null, (Function1) null, t5.onExtraCallback.onWarmupCompleted(), 6, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 47;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        boolean z;
        Object obj;
        int i = 0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1193950018);
        if (iIntValue != 0) {
            int i3 = onNavigationEvent + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, iIntValue & 1)) {
            int i5 = onExtraCallback + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1193950018, iIntValue, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1StateLazyColumnPreview (TdsBottomCtaV1.kt:1289)");
            }
            u2 u2VarOnWarmupCompleted = t7a.onWarmupCompleted(false, null, null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), new t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(num, i, 3, num), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 39);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), u2VarOnWarmupCompleted, false, 2, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i7 = onNavigationEvent + 81;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda14
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 89;
                        IAuthTabCallback = i10 % 128;
                        Object obj3 = null;
                        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) obj2;
                        if (i10 % 2 != 0) {
                            u1.onExtraCallback(audioRestrictionControllerImplExternalSyntheticLambda0);
                            throw null;
                        }
                        Unit unitOnExtraCallback = u1.onExtraCallback(audioRestrictionControllerImplExternalSyntheticLambda0);
                        int i11 = onNavigationEvent + 59;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                int i9 = onExtraCallback + 11;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            obj = null;
            ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805306368, 511);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted());
            t5 t5Var = t5.onExtraCallback;
            IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2, u2VarOnWarmupCompleted, (getBacktraceNote) t5.onExtraCallback(new Object[]{t5Var}, 2135781442, -2135781434, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent()), null, t5Var.IAuthTabCallback_Parcel(), null, t5Var.IAuthTabCallbackStub(), t5Var.asInterface(), 0L, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 14180736, 0, 3880);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 67;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i12 = 87 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda15
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 75;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = iIntValue;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    if (i15 != 0) {
                        return u1.onExtraCallback(i16, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    }
                    u1.onExtraCallback(i16, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    throw null;
                }
            });
        }
        return obj;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        skipBytes skipbytes = (skipBytes) objArr[1];
        MediationAdapterBase mediationAdapterBase = (MediationAdapterBase) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue & 2) != 0) {
            mediationAdapterBase = new MediationAdapterBase() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                @Override // o.MediationAdapterBase
                public final float invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 79;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    float fIAuthTabCallback = u1.IAuthTabCallback();
                    int i7 = IAuthTabCallback + 31;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return fIAuthTabCallback;
                }
            };
            int i4 = onNavigationEvent + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, skipbytes, mediationAdapterBase);
        int i6 = onExtraCallback + 41;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final skipBytes skipbytes, final MediationAdapterBase mediationAdapterBase) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda27
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 15;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                removeObserverLocked removeobserverlockedOnExtraCallback = u1.onExtraCallback(skipbytes, mediationAdapterBase, (SessionProcessorCaptureCallback) obj);
                int i5 = IAuthTabCallback + 125;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return removeobserverlockedOnExtraCallback;
            }
        }));
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    private static final removeObserverLocked onExtraCallbackWithResult(skipBytes skipbytes, MediationAdapterBase mediationAdapterBase, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final float f = -sessionProcessorCaptureCallback.onExtraCallback(onWarmupCompleted);
        final readFully readfullyIAuthTabCallback = readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.25f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(skipbytes.onExtraCallback(), mediationAdapterBase.invoke()))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()))}, 0.0f, f, 0, 8, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 93;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = u1.onExtraCallbackWithResult(readfullyIAuthTabCallback, f, (setOrientationDegrees) obj);
                int i5 = onNavigationEvent + 49;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(readFully readfully, float f, setOrientationDegrees setorientationdegrees) {
        long jIAuthTabCallback;
        float f2;
        long jOnExtraCallback;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
            jOnExtraCallback = setUseCaseDetached.onExtraCallback(setorientationdegrees.onTransact(), 1.0f, f, 1, (Object) null);
            f2 = 0.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 1;
            i2 = 22;
            obj = null;
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
            f2 = 0.0f;
            jOnExtraCallback = setUseCaseDetached.onExtraCallback(setorientationdegrees.onTransact(), 0.0f, f, 1, (Object) null);
            hasmoreelements = null;
            seekVar = null;
            i = 0;
            i2 = 120;
            obj = null;
        }
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, jIAuthTabCallback, jOnExtraCallback, f2, hasmoreelements, seekVar, i, i2, obj);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return unit;
    }

    static {
        int i = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull u2 u2Var, boolean z) {
        Function1 function1OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(u2Var, "");
        if (ArrayRingBuffer.onExtraCallbackWithResult()) {
            function1OnWarmupCompleted = new onTransact(u2Var, z);
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            function1OnWarmupCompleted = ArrayRingBuffer.onWarmupCompleted();
        }
        return ArrayRingBuffer.IAuthTabCallback(quirksExternalSyntheticBackport0, function1OnWarmupCompleted, onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, (Function1<? super Float, Float>) new asInterface(u2Var), (Function0<Float>) new asBinder(u2Var), z));
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, boolean z) {
        Function1 function1OnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (ArrayRingBuffer.onExtraCallbackWithResult()) {
            function1OnWarmupCompleted = new IAuthTabCallbackStub(function1, z);
        } else {
            function1OnWarmupCompleted = ArrayRingBuffer.onWarmupCompleted();
            int i4 = onExtraCallback + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return ArrayRingBuffer.IAuthTabCallback(quirksExternalSyntheticBackport0, function1OnWarmupCompleted, updateSensorToBufferTransform.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, new t8(function1, function0, z), (reverseSizeF) null, 2, (Object) null));
    }

    private static final t7ExternalSyntheticLambda0.onExtraCallback onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<? extends t7ExternalSyntheticLambda0.onExtraCallback> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback = (t7ExternalSyntheticLambda0.onExtraCallback) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onextracallback;
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(final View view, final r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    u1.onExtraCallback(view, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg);
                    throw null;
                }
                u1.onExtraCallback(view, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg);
                int i4 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        onNavigationEvent onnavigationevent = new onNavigationEvent(view, onGlobalLayoutListener);
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    public static /* synthetic */ Unit onNavigationEvent(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.IntRef intRef, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Object[] objArr = {objectRef, objectRef2, intRef, Float.valueOf(f), onextracallbackwithresult};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -224956511, 224956519, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(u2 u2Var, flipHorizontally fliphorizontally) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{u2Var, fliphorizontally}, 1884452768, -1884452747, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -27240170, 27240170, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg onNavigationEvent(t5a t5aVar) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{t5aVar}, -262194345, 262194351, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[0], 2114896217, -2114896199, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(View view, r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, isInVideoUsage isinvideousage) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (decrementVideoUsage) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{view, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, isinvideousage}, -659095678, 659095697, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit asInterface(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 558687803, -558687802, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit asBinder(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -1243454351, 1243454355, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.IntRef intRef, float f, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Object[] objArr = {objectRef, objectRef2, intRef, Float.valueOf(f), onextracallbackwithresult};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 158684332, -158684319, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final List<component7> onExtraCallback(isExtraPreviewRequired isextrapreviewrequired, t7ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, t4 t4Var, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, getBacktraceNote<? super u4, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (List) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{isextrapreviewrequired, onextracallbackwithresult, t4Var, onextracallbackwithresult2, getbacktracenote}, -1568174950, 1568174961, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, getbacktracenote, onextracallbackwithresult, getbacktracenote2, onextracallbackwithresult2, onwarmupcompleted, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 962484907, -962484900, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    @Deprecated
    public static final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, boolean z, boolean z2, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {str, quirksExternalSyntheticBackport0, function0, Boolean.valueOf(z), Boolean.valueOf(z2), onwarmupcompleted, onextracallback, Boolean.valueOf(z3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 83146657, -83146641, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit IAuthTabCallbackDefault() {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[0], 1524308627, -1524308618, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 1057178913, -1057178901, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final void onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -558428521, 558428541, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit extraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 344002847, -344002832, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, u2 u2Var, boolean z, long j, getBacktraceNote getbacktracenote, float f, getBacktraceNote getbacktracenote2, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult, getBacktraceNote getbacktracenote3, setCallToAction.onExtraCallbackWithResult onextracallbackwithresult2, t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, u2Var, Boolean.valueOf(z), Long.valueOf(j), getbacktracenote, Float.valueOf(f), getbacktracenote2, onextracallbackwithresult, getbacktracenote3, onextracallbackwithresult2, onwarmupcompleted, getbacktracenote4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -608062230, 608062240, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -24215419, 24215422, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(getHumanReadableName gethumanreadablename, getHumanReadableName gethumanreadablename2, oExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, getBacktraceNote getbacktracenote, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {gethumanreadablename, gethumanreadablename2, onwarmupcompleted, getbacktracenote, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, 2016948549, -2016948544, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    private static final void IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -387427707, 387427724, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    public static final r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg onNavigationEvent(@Nullable t5a t5aVar, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {t5aVar, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -1912856437, 1912856439, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }

    static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, skipBytes skipbytes, MediationAdapterBase mediationAdapterBase, int i, Object obj) {
        Object[] objArr = {quirksExternalSyntheticBackport0, skipbytes, mediationAdapterBase, Integer.valueOf(i), obj};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(setCurrentIndex.onNavigationEvent(), objArr, -970187454, 970187468, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
    }
}
