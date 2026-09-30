package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.tosscert.ui.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFg1cSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;
import o.getStreamSharingChildren;
import o.oExternalSyntheticLambda0;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.wa;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1cSDK {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = i5 | i3;
        int i8 = ~((~i3) | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i | i3));
        int i11 = (~(i3 | i9)) | i;
        int i12 = i5 + i + i6 + (2127773517 * i2) + (1026174006 * i4);
        int i13 = i12 * i12;
        int i14 = (i5 * (-484454144)) + 743702528 + ((-484454144) * i) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i6) + (367263744 * i2) + ((-1434976256) * i4) + (1105526784 * i13);
        int i15 = (i5 * 21308160) + 1622758390 + (i * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i6 * 21309107) + (i2 * 1708896471) + (i4 * 664464834) + (i13 * 287244288);
        int i16 = i14 + (i15 * i15 * 966983680);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, setContentInsetsRelative setcontentinsetsrelative, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function2, setcontentinsetsrelative, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(708056747, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -708056745, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i5 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(AFg1gSDK aFg1gSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setContentInsetsRelative setcontentinsetsrelative, long j, long j2, float f, Function2 function2, Function2 function22, getBacktraceNote getbacktracenote, Function2 function23, getBacktraceNote getbacktracenote2, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(aFg1gSDK, quirksExternalSyntheticBackport0, setcontentinsetsrelative, j, j2, f, function2, function22, getbacktracenote, function23, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getShouldExtendMsg getshouldextendmsg, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2, getshouldextendmsg, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 52 / 0;
        }
        int i7 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, getBacktraceNote getbacktracenote, Function2 function2, setContentInsetsRelative setcontentinsetsrelative, getBacktraceNote getbacktracenote2, Function2 function22, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, f, getbacktracenote, function2, setcontentinsetsrelative, getbacktracenote2, function22, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Function2 function22 = (Function2) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(function2, function22, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function2, function22, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, getShouldExtendMsg getshouldextendmsg, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        onExtraCallback(highSpeedResolverExternalSyntheticLambda2, getshouldextendmsg, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setContentInsetsRelative setcontentinsetsrelative, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(-856577579, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{setcontentinsetsrelative, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 856577582, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1gSDK aFg1gSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setContentInsetsRelative setcontentinsetsrelative, long j, long j2, float f, Function2 function2, Function2 function22, getBacktraceNote getbacktracenote, Function2 function23, getBacktraceNote getbacktracenote2, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            onExtraCallback(aFg1gSDK, quirksExternalSyntheticBackport0, setcontentinsetsrelative, j, j2, f, function2, function22, getbacktracenote, function23, getbacktracenote2, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(aFg1gSDK, quirksExternalSyntheticBackport0, setcontentinsetsrelative, j, j2, f, function2, function22, getbacktracenote, function23, getbacktracenote2, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallbackStub(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2094052850, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TossSecTopSheet.kt:66)");
            }
            getbacktracenote.invoke(r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(final getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 87;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(834837466, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous>.<anonymous>.<anonymous> (TossSecTopSheet.kt:60)");
            }
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            u7 u7Var = u7.IAuthTabCallback;
            putCharSequence.onExtraCallback(getHumanReadableName.onNavigationEvent(appLovinPostbackService.onWarmupCompleted(u7Var.onExtraCallback().access100()), ((Long) w0b.onExtraCallbackWithResult(new Object[]{w0b.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 6}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1444473882, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1444473882)).longValue(), 0L, (GraphicDeviceInfo) wa.IAuthTabCallback.onExtraCallbackWithResult(new Object[]{u7Var.onExtraCallback()}, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -1283139858, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 1283139859), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null), (getHumanReadableName) null, (dispatchPostbackAsync) null, (oExternalSyntheticLambda0.onWarmupCompleted) null, (setCallToAction.onExtraCallbackWithResult) null, false, ForwardingCameraControl.onExtraCallback(-2094052850, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 55;
                    onWarmupCompleted = i11 % 128;
                    Object obj3 = null;
                    if (i11 % 2 == 0) {
                        AFg1cSDK.onWarmupCompleted(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = AFg1cSDK.onWarmupCompleted(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = onWarmupCompleted + 59;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864, 62);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z = false;
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if ((iIntValue & 3) != 2) {
            int i5 = i2 + 5;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1361299731, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous>.<anonymous> (TossSecTopSheet.kt:58)");
            }
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1399127611);
                lExternalSyntheticLambda4.onNavigationEvent(1.6f, ForwardingCameraControl.onExtraCallback(834837466, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 11;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unit = (Unit) AFg1cSDK.IAuthTabCallback(430530530, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -430530529, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                        int i12 = IAuthTabCallback + 35;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1399638863);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 35;
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

    private static final Unit onWarmupCompleted(Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 91;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-700035092, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous>.<anonymous>.<anonymous> (TossSecTopSheet.kt:77)");
            }
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
            if (function2 == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1457311511);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1432483370);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                int i10 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            function22.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        }
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, true);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setContentInsetsRelative setcontentinsetsrelative = (setContentInsetsRelative) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i2 % 2 == 0 ? (iIntValue & 3) != 2 : (iIntValue & 3) != 3, iIntValue & 1)) {
            int i3 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1097490709, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous>.<anonymous>.<anonymous> (TossSecTopSheet.kt:83)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
                int i5 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setcontentinsetsrelative, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 105;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnWarmupCompleted = AFg1cSDK.onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
                        int i10 = IAuthTabCallback + 89;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 4 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, false, (Function1) objOnMinimized, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            getbacktracenote.invoke(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (setcontentinsetsrelative.IAuthTabCallback() > 0) {
                int i9 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1682389871);
                onExtraCallback((HighSpeedResolverExternalSyntheticLambda2) highSpeedResolverExternalSyntheticLambda1, getShouldExtendMsg.Top, cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1682474439);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function2 function2, setContentInsetsRelative setcontentinsetsrelative, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        getShouldExtendMsg getshouldextendmsg;
        int i2;
        int i3 = 2 % 2;
        if ((i & 3) != 2) {
            int i4 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 31 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onExtraCallbackWithResult + 105;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-645566732, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous>.<anonymous>.<anonymous> (TossSecTopSheet.kt:98)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-645566732, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous>.<anonymous>.<anonymous> (TossSecTopSheet.kt:98)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
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
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                if (function2 == null) {
                    int i9 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        setcontentinsetsrelative.IAuthTabCallback();
                        throw null;
                    }
                    if (setcontentinsetsrelative.IAuthTabCallback() > 0) {
                        int i10 = onNavigationEvent + 83;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(412432525);
                            getshouldextendmsg = getShouldExtendMsg.Bottom;
                            i2 = 86;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(412432525);
                            getshouldextendmsg = getShouldExtendMsg.Bottom;
                            i2 = 54;
                        }
                        onExtraCallback((HighSpeedResolverExternalSyntheticLambda2) highSpeedResolverExternalSyntheticLambda1, getshouldextendmsg, cameraCaptureResultEmptyCameraCaptureResult, i2);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(412519976);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (function2 == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(412552959);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2064901822);
                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                if (function2 == null) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements getCameraUseCases {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ float onWarmupCompleted;

        IAuthTabCallback(float f) {
            this.onWarmupCompleted = f;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(List list, int i, List list2, int i2, List list3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i3 = 2 % 2;
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                IAuthTabCallback(list, i, list2, i2, list3, onextracallbackwithresult);
                throw null;
            }
            Unit unitIAuthTabCallback = IAuthTabCallback(list, i, list2, i2, list3, onextracallbackwithresult);
            int i5 = onNavigationEvent + 47;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public /* bridge */ int IAuthTabCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends List<? extends FuturesExternalSyntheticLambda2>> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 119;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            }
            super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            throw null;
        }

        public /* bridge */ int onExtraCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends List<? extends FuturesExternalSyntheticLambda2>> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallback = super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
            if (i4 == 0) {
                int i5 = 45 / 0;
            }
            return iOnExtraCallback;
        }

        public /* bridge */ int onExtraCallbackWithResult(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends List<? extends FuturesExternalSyntheticLambda2>> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int iOnExtraCallbackWithResult = super.onExtraCallbackWithResult(futuresExternalSyntheticLambda3, list, i);
            if (i4 == 0) {
                int i5 = 99 / 0;
            }
            int i6 = onExtraCallback + 25;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return iOnExtraCallbackWithResult;
        }

        public /* bridge */ int onWarmupCompleted(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends List<? extends FuturesExternalSyntheticLambda2>> list, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 9;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iOnWarmupCompleted = super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iOnWarmupCompleted;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final component8 onNavigationEvent(component4 component4Var, List<? extends List<? extends component7>> list, long j) {
            ArrayList arrayList;
            int iIntValue;
            Integer numValueOf;
            int iIntValue2;
            Integer num;
            Integer numValueOf2;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            int iAsInterface = VirtualCameraCaptureResult.asInterface(j);
            int iIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(j);
            int i4 = 0;
            List<? extends component7> list2 = list.get(0);
            List<? extends component7> list3 = list.get(1);
            List list4 = (List) CollectionsKt___CollectionsKt.getOrNull(list, 2);
            if (list4 != null) {
                ArrayList arrayList2 = new ArrayList(list4.size());
                int size = list4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(((component7) list4.get(i5)).onExtraCallback(j));
                }
                arrayList = arrayList2;
            } else {
                int i6 = onExtraCallback + 61;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                arrayList = null;
            }
            if (arrayList == null) {
                iIntValue = 0;
            } else {
                if (arrayList.isEmpty()) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(((getStreamSharingChildren) arrayList.get(0)).T_());
                    int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex > 0) {
                        int i8 = onExtraCallback + 7;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = 1;
                        while (true) {
                            Integer numValueOf3 = Integer.valueOf(((getStreamSharingChildren) arrayList.get(i10)).T_());
                            if (numValueOf3.compareTo(numValueOf2) > 0) {
                                int i11 = onNavigationEvent + 109;
                                onExtraCallback = i11 % 128;
                                if (i11 % 2 != 0) {
                                    int i12 = 17 / 0;
                                }
                                numValueOf2 = numValueOf3;
                            }
                            if (i10 == lastIndex) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue();
                }
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            int i13 = 0;
            while (i13 < size2) {
                component7 component7Var = list2.get(i13);
                int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(VirtualCameraCaptureResult.IAuthTabCallbackDefault(j) - iIntValue, i4);
                ArrayList arrayList4 = arrayList3;
                arrayList4.add(component7Var.onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iAsInterface, 0, iCoerceAtLeast, 5, (Object) null)));
                i13++;
                arrayList3 = arrayList4;
                size2 = size2;
                i4 = 0;
            }
            final ArrayList arrayList5 = arrayList3;
            if (arrayList5.isEmpty()) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((getStreamSharingChildren) arrayList5.get(0)).T_());
                int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList5);
                if (lastIndex2 > 0) {
                    int i14 = onNavigationEvent + 17;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = 1;
                    while (true) {
                        Integer numValueOf4 = Integer.valueOf(((getStreamSharingChildren) arrayList5.get(i16)).T_());
                        if (numValueOf4.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf4;
                        }
                        if (i16 == lastIndex2) {
                            break;
                        }
                        int i17 = onExtraCallback + 119;
                        onNavigationEvent = i17 % 128;
                        int i18 = i17 % 2;
                        i16++;
                    }
                }
            }
            final int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
            int iOnNavigationEvent = getCurrentBacktraceOrBuilderList.onNavigationEvent(iIAuthTabCallbackDefault * this.onWarmupCompleted);
            final ArrayList arrayList6 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i19 = 0; i19 < size3; i19++) {
                arrayList6.add(list3.get(i19).onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, VirtualCameraCaptureResult.asInterface(j), 0, RangesKt___RangesKt.coerceAtLeast((iOnNavigationEvent - iIntValue3) - iIntValue, 0), 5, (Object) null)));
            }
            if (arrayList6.isEmpty()) {
                iIntValue2 = 0;
                num = null;
            } else {
                iIntValue2 = 0;
                Integer numValueOf5 = Integer.valueOf(((getStreamSharingChildren) arrayList6.get(0)).T_());
                int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList6);
                if (lastIndex3 > 0) {
                    int i20 = 1;
                    while (true) {
                        Integer numValueOf6 = Integer.valueOf(((getStreamSharingChildren) arrayList6.get(i20)).T_());
                        if (numValueOf6.compareTo(numValueOf5) > 0) {
                            numValueOf5 = numValueOf6;
                        }
                        if (i20 == lastIndex3) {
                            break;
                        }
                        int i21 = onExtraCallback + 41;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        i20++;
                    }
                }
                num = numValueOf5;
            }
            if (num != null) {
                int i23 = onExtraCallback + 53;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                iIntValue2 = num.intValue();
            }
            final int i25 = iIntValue2;
            final ArrayList arrayList7 = arrayList;
            return component4.IAuthTabCallback(component4Var, VirtualCameraCaptureResult.asInterface(j), iIntValue3 + i25 + iIntValue, (Map) null, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$TossSecTopSheet$1$2$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i26 = 2 % 2;
                    int i27 = onNavigationEvent + 33;
                    onExtraCallback = i27 % 128;
                    int i28 = i27 % 2;
                    Unit unitOnExtraCallbackWithResult = AFg1cSDK.IAuthTabCallback.onExtraCallbackWithResult(arrayList5, iIntValue3, arrayList6, i25, arrayList7, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i29 = onExtraCallback + 123;
                    onNavigationEvent = i29 % 128;
                    int i30 = i29 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, 4, (Object) null);
        }

        private static final Unit IAuthTabCallback(List list, int i, List list2, int i2, List list3, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
            }
            int i6 = 0;
            while (i6 < size) {
                int i7 = onExtraCallback + 63;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i6), 1, 1, 0.0f, 5, (Object) null);
                    arrayList.add(Unit.INSTANCE);
                    i6 += 91;
                } else {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list.get(i6), 0, 0, 0.0f, 4, (Object) null);
                    arrayList.add(Unit.INSTANCE);
                    i6++;
                }
            }
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            int i8 = 0;
            while (i8 < size2) {
                int i9 = onExtraCallback + 59;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list2.get(i8), 0, i, 0.0f, 4, (Object) null);
                    arrayList2.add(Unit.INSTANCE);
                    i8 += 31;
                } else {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list2.get(i8), 0, i, 0.0f, 4, (Object) null);
                    arrayList2.add(Unit.INSTANCE);
                    i8++;
                }
            }
            if (list3 != null) {
                ArrayList arrayList3 = new ArrayList(list3.size());
                int size3 = list3.size();
                int i10 = onExtraCallback + 109;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 0;
                while (i12 < size3) {
                    int i13 = onNavigationEvent + 107;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list3.get(i12), 0, i / i2, 0.0f, 4, (Object) null);
                        arrayList3.add(Unit.INSTANCE);
                        i12 += 102;
                    } else {
                        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, (getStreamSharingChildren) list3.get(i12), 0, i + i2, 0.0f, 4, (Object) null);
                        arrayList3.add(Unit.INSTANCE);
                        i12++;
                    }
                    int i14 = onNavigationEvent + 57;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, final getBacktraceNote getbacktracenote, final Function2 function2, final setContentInsetsRelative setcontentinsetsrelative, final getBacktraceNote getbacktracenote2, final Function2 function22, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = onNavigationEvent + 51;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1735372109, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous> (TossSecTopSheet.kt:57)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1735372109, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet.<anonymous> (TossSecTopSheet.kt:57)");
                }
                final EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1361299731, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 77;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        getBacktraceNote getbacktracenote3 = getbacktracenote;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                        if (i7 == 0) {
                            return AFg1cSDK.IAuthTabCallback(getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                        }
                        Unit unitIAuthTabCallback = AFg1cSDK.IAuthTabCallback(getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                        int i8 = 3 / 0;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = YuvImageOnePixelShiftQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0);
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1245261342);
                List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(-700035092, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 41;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unit = (Unit) AFg1cSDK.IAuthTabCallback(1503262715, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{function2, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1503262715, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                        int i7 = onExtraCallbackWithResult + 67;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        return unit;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54));
                listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(1097490709, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit unitOnExtraCallbackWithResult;
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            unitOnExtraCallbackWithResult = AFg1cSDK.onExtraCallbackWithResult(setcontentinsetsrelative, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i7 = 26 / 0;
                        } else {
                            unitOnExtraCallbackWithResult = AFg1cSDK.onExtraCallbackWithResult(setcontentinsetsrelative, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        int i8 = onNavigationEvent + 49;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54));
                listCreateListBuilder.add(ForwardingCameraControl.onExtraCallback(-645566732, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallback + 119;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            AFg1cSDK.IAuthTabCallback(function22, setcontentinsetsrelative, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = AFg1cSDK.IAuthTabCallback(function22, setcontentinsetsrelative, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i7 = onExtraCallback + 37;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54));
                List listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(f);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                getCameraUseCases getcamerausecases = (getCameraUseCases) objOnMinimized;
                Function2 function2OnWarmupCompleted = callAllGets.onWarmupCompleted(listBuild);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getcamerausecases);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = getCameraUseCasesToDetach.onExtraCallbackWithResult(getcamerausecases);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                component5 component5Var = (component5) objOnMinimized2;
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }
        int i5 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 % 4;
        }
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final AFg1gSDK aFg1gSDK, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setContentInsetsRelative setcontentinsetsrelative, long j, long j2, float f, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable getBacktraceNote<? super r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23, @NotNull final getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
        int i4;
        long jOnWarmupCompleted;
        int i5;
        int i6;
        int i7;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function24;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        char c;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback;
        final long j3;
        final float f2;
        final long j4;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function25;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function26;
        final getBacktraceNote<? super r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function27;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jIAuthTabCallback;
        float f3;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2OnExtraCallback;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function28;
        getBacktraceNote<? super r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        int i12;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function29;
        int i13;
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-897860928);
        if ((i & 6) == 0) {
            int i15 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFg1gSDK);
                throw null;
            }
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFg1gSDK) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                int i17 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 != 0 ? (i3 & 4) == 0 : i16 == 0) {
                    int i18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative) ? 256 : 128;
                    i4 |= i18;
                }
                i4 |= i18;
            }
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jOnWarmupCompleted = j;
                    int i19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnWarmupCompleted) ? 2048 : 1024;
                    i4 |= i19;
                } else {
                    jOnWarmupCompleted = j;
                }
                i4 |= i19;
            } else {
                jOnWarmupCompleted = j;
            }
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    i5 = i16;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
                        int i20 = onExtraCallbackWithResult + 119;
                        onNavigationEvent = i20 % 128;
                        i13 = i20 % 2 == 0 ? 30569 : Http2.INITIAL_MAX_FRAME_SIZE;
                    }
                    i4 |= i13;
                } else {
                    i5 = i16;
                }
                i13 = TTHistoryActivity2.SIZE;
                i4 |= i13;
            } else {
                i5 = i16;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        function24 = function2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function24) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 8388608 : 4194304;
                        }
                        i9 = i3 & 256;
                        if (i9 == 0) {
                            if ((i & 100663296) == 0) {
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 67108864 : 33554432;
                            }
                            i10 = i3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                            if (i10 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                int i21 = onNavigationEvent + 69;
                                onExtraCallbackWithResult = i21 % 128;
                                if (i21 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23);
                                    throw null;
                                }
                                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 536870912 : 268435456;
                            }
                            if ((i2 & 6) != 0) {
                                i11 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 4 : 2);
                            } else {
                                i11 = i2;
                            }
                            if ((i4 & 306783379) != 306783378) {
                                int i22 = onNavigationEvent + 111;
                                onExtraCallbackWithResult = i22 % 128;
                                int i23 = i22 % 2;
                                z = (i11 & 3) != 2;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                                c = 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                setcontentinsetsrelativeIAuthTabCallback = setcontentinsetsrelative;
                                j3 = j2;
                                f2 = f;
                                j4 = jOnWarmupCompleted;
                                function25 = function24;
                                function26 = function22;
                                getbacktracenote3 = getbacktracenote;
                                function27 = function23;
                            } else {
                                int i24 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                                onNavigationEvent = i24 % 128;
                                int i25 = i24 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((i & 1) == 0 || !(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage())) {
                                    if (i5 != 0) {
                                        int i26 = onNavigationEvent + 73;
                                        onExtraCallbackWithResult = i26 % 128;
                                        if (i26 % 2 != 0) {
                                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                            throw null;
                                        }
                                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                    } else {
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    }
                                    if ((i3 & 4) != 0) {
                                        setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                                        i4 &= -897;
                                    } else {
                                        setcontentinsetsrelativeIAuthTabCallback = setcontentinsetsrelative;
                                    }
                                    if ((i3 & 8) != 0) {
                                        jOnWarmupCompleted = AFg1hSDKCompanion.onNavigationEvent.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        int i27 = onNavigationEvent + 123;
                                        onExtraCallbackWithResult = i27 % 128;
                                        int i28 = i27 % 2;
                                        jIAuthTabCallback = AFg1hSDKCompanion.onNavigationEvent.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        i4 = (-57345) & i4;
                                    } else {
                                        jIAuthTabCallback = j2;
                                    }
                                    if (i6 != 0) {
                                        int i29 = onNavigationEvent + 67;
                                        onExtraCallbackWithResult = i29 % 128;
                                        c = 2;
                                        int i30 = i29 % 2;
                                        f3 = 0.8f;
                                    } else {
                                        c = 2;
                                        f3 = f;
                                    }
                                    function2OnExtraCallback = i7 != 0 ? AFg1eSDKAFa1uSDK.onNavigationEvent.onExtraCallback() : function24;
                                    function28 = i8 != 0 ? null : function22;
                                    getbacktracenote4 = i9 != 0 ? null : getbacktracenote;
                                    if (i10 != 0) {
                                        i12 = i4;
                                        function29 = null;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-897860928, i12, i11, "im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheet (TossSecTopSheet.kt:50)");
                                    }
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    final float f4 = f3;
                                    final getBacktraceNote<? super r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5 = getbacktracenote4;
                                    final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function210 = function28;
                                    final setContentInsetsRelative setcontentinsetsrelative2 = setcontentinsetsrelativeIAuthTabCallback;
                                    final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function211 = function29;
                                    float f5 = f3;
                                    int i31 = i12 >> 6;
                                    AFf1zSDK.onExtraCallback(-1032121787, 1032121788, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{aFg1gSDK, Long.valueOf(jOnWarmupCompleted), Long.valueOf(jIAuthTabCallback), function2OnExtraCallback, ForwardingCameraControl.onExtraCallback(-1735372109, true, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda8
                                        private static int IAuthTabCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        @Override // o.getBacktraceNote
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            int i32 = 2 % 2;
                                            int i33 = IAuthTabCallback + 49;
                                            onExtraCallbackWithResult = i33 % 128;
                                            int i34 = i33 % 2;
                                            Unit unitOnExtraCallback = AFg1cSDK.onExtraCallback(quirksExternalSyntheticBackport04, f4, getbacktracenote5, function210, setcontentinsetsrelative2, getbacktracenote2, function211, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                            int i35 = IAuthTabCallback + 77;
                                            onExtraCallbackWithResult = i35 % 128;
                                            int i36 = i35 % 2;
                                            return unitOnExtraCallback;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i12 >> 9) & 7168) | (i31 & 896) | (i12 & 14) | 24576 | (i31 & 112)), 0});
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    f2 = f5;
                                    function25 = function2OnExtraCallback;
                                    function27 = function29;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                    j3 = jIAuthTabCallback;
                                    long j5 = jOnWarmupCompleted;
                                    function26 = function28;
                                    getbacktracenote3 = getbacktracenote4;
                                    j4 = j5;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    setcontentinsetsrelativeIAuthTabCallback = setcontentinsetsrelative;
                                    jIAuthTabCallback = j2;
                                    f3 = f;
                                    function28 = function22;
                                    getbacktracenote4 = getbacktracenote;
                                    function2OnExtraCallback = function24;
                                    c = 2;
                                }
                                i12 = i4;
                                function29 = function23;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport042 = quirksExternalSyntheticBackport03;
                                final float f42 = f3;
                                final getBacktraceNote getbacktracenote52 = getbacktracenote4;
                                final Function2 function2102 = function28;
                                final setContentInsetsRelative setcontentinsetsrelative22 = setcontentinsetsrelativeIAuthTabCallback;
                                final Function2 function2112 = function29;
                                float f52 = f3;
                                int i312 = i12 >> 6;
                                AFf1zSDK.onExtraCallback(-1032121787, 1032121788, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{aFg1gSDK, Long.valueOf(jOnWarmupCompleted), Long.valueOf(jIAuthTabCallback), function2OnExtraCallback, ForwardingCameraControl.onExtraCallback(-1735372109, true, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda8
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    @Override // o.getBacktraceNote
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i32 = 2 % 2;
                                        int i33 = IAuthTabCallback + 49;
                                        onExtraCallbackWithResult = i33 % 128;
                                        int i34 = i33 % 2;
                                        Unit unitOnExtraCallback = AFg1cSDK.onExtraCallback(quirksExternalSyntheticBackport042, f42, getbacktracenote52, function2102, setcontentinsetsrelative22, getbacktracenote2, function2112, (MeteringRepeatingSessionExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i35 = IAuthTabCallback + 77;
                                        onExtraCallbackWithResult = i35 % 128;
                                        int i36 = i35 % 2;
                                        return unitOnExtraCallback;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i12 >> 9) & 7168) | (i312 & 896) | (i12 & 14) | 24576 | (i312 & 112)), 0});
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                f2 = f52;
                                function25 = function2OnExtraCallback;
                                function27 = function29;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                j3 = jIAuthTabCallback;
                                long j52 = jOnWarmupCompleted;
                                function26 = function28;
                                getbacktracenote3 = getbacktracenote4;
                                j4 = j52;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                final setContentInsetsRelative setcontentinsetsrelative3 = setcontentinsetsrelativeIAuthTabCallback;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda9
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i32 = 2 % 2;
                                        int i33 = IAuthTabCallback + 41;
                                        onNavigationEvent = i33 % 128;
                                        int i34 = i33 % 2;
                                        Unit unitOnWarmupCompleted = AFg1cSDK.onWarmupCompleted(aFg1gSDK, quirksExternalSyntheticBackport02, setcontentinsetsrelative3, j4, j3, f2, function25, function26, getbacktracenote3, function27, getbacktracenote2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i35 = IAuthTabCallback + 79;
                                        onNavigationEvent = i35 % 128;
                                        if (i35 % 2 != 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                });
                                int i32 = onExtraCallbackWithResult + 3;
                                onNavigationEvent = i32 % 128;
                                int i33 = i32 % 2;
                                return;
                            }
                            return;
                        }
                        i4 |= 100663296;
                        i10 = i3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                        if (i10 == 0) {
                        }
                        if ((i2 & 6) != 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                    if (i10 == 0) {
                    }
                    if ((i2 & 6) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                function24 = function2;
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                if (i10 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            function24 = function2;
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
            if (i10 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        function24 = function2;
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
        if (i10 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onExtraCallback(final HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, final getShouldExtendMsg getshouldextendmsg, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1419436386);
        if ((i & 6) == 0) {
            int i6 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2)) {
                int i8 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getshouldextendmsg.ordinal())) {
                i3 = 16;
            } else {
                int i12 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i12 % 128;
                i3 = i12 % 2 != 0 ? 84 : 32;
            }
            i2 |= i3;
            int i13 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
        }
        if ((i2 & 19) != 18) {
            int i15 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i17 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i17 % 128;
            int i18 = i17 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1419436386, i2, -1, "im.toss.tosssecurities.uikit.compound.topsheet.GradientBox (TossSecTopSheet.kt:170)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CaptureNoResponseQuirk.onWarmupCompleted(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), getshouldextendmsg.m155getHeightD9Ej5fM()), getshouldextendmsg.getAlignment()), 0.0f, getshouldextendmsg.m156getOffsetD9Ej5fM(), 1, (Object) null);
            float angle = getshouldextendmsg.getAngle();
            AFg1hSDKCompanion aFg1hSDKCompanion = AFg1hSDKCompanion.onNavigationEvent;
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(aFg1hSDKCompanion.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))), getWrite.IAuthTabCallback(Float.valueOf(0.8f), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(aFg1hSDKCompanion.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null)))}, angle, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.TossSecTopSheetKt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnExtraCallback;
                    int i19 = 2 % 2;
                    int i20 = onWarmupCompleted + 13;
                    IAuthTabCallback = i20 % 128;
                    if (i20 % 2 != 0) {
                        unitOnExtraCallback = AFg1cSDK.onExtraCallback(highSpeedResolverExternalSyntheticLambda2, getshouldextendmsg, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i21 = 53 / 0;
                    } else {
                        unitOnExtraCallback = AFg1cSDK.onExtraCallback(highSpeedResolverExternalSyntheticLambda2, getshouldextendmsg, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i22 = onWarmupCompleted + 39;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, Function2 function22, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(1503262715, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{function2, function22, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1503262715, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(430530530, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -430530529, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(708056747, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -708056745, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(setContentInsetsRelative setcontentinsetsrelative, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(-856577579, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{setcontentinsetsrelative, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 856577582, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }
}
