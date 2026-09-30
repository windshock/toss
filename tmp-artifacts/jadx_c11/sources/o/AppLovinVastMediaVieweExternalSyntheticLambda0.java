package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.component.atom.text.TdsTextKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AppLovinErrorCodes;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AppLovinVastMediaViewf;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.SurfaceProcessorNodeOut;
import o.decrementVideoUsage;
import o.flipHorizontally;
import o.getSurfaceSize;
import o.hasProvider;
import o.isInVideoUsage;
import o.readFully;
import o.removeObserverLocked;
import o.setByteOrder;
import o.setIso;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinVastMediaVieweExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static final accessisMonitoringp<Boolean> onExtraCallbackWithResult = setPostviewFormatSelector.IAuthTabCallback(new Function0() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda7
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback();
            if (i3 == 0) {
                return Boolean.valueOf(zOnExtraCallback);
            }
            Boolean.valueOf(zOnExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onTransact {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[AppLovinErrorCodes.onWarmupCompleted.values().length];
            try {
                iArr[AppLovinErrorCodes.onWarmupCompleted.Blue.ordinal()] = 1;
                int i = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppLovinErrorCodes.onWarmupCompleted.Elephant.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppLovinErrorCodes.onWarmupCompleted.Yellow.ordinal()] = 3;
                int i4 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppLovinErrorCodes.onWarmupCompleted.Red.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppLovinErrorCodes.onWarmupCompleted.Green.ordinal()] = 5;
                int i6 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AppLovinErrorCodes.onWarmupCompleted.Teal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[AppLovinErrorCodes.IAuthTabCallback.values().length];
            try {
                iArr2[AppLovinErrorCodes.IAuthTabCallback.Fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AppLovinErrorCodes.IAuthTabCallback.Weak.ordinal()] = 2;
                int i9 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            onExtraCallback = iArr2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = onWarmupCompleted + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, int i2, getHumanReadableName gethumanreadablename, hasProvider hasprovider, Context context, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, List list2, float f2, long j, Function1 function1, boolean z, Map map, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2, gethumanreadablename, hasprovider, context, quirksExternalSyntheticBackport0, list, f, deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, list2, f2, j, function1, z, map, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 77;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 123;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws NoWhenBranchMatchedException {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(new Object[]{surfaceProcessorNodeOut}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1842085120, 1842085126, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        int i3 = onWarmupCompleted + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 32 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 55;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(iIntValue, iIntValue2, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i4) | i3);
        int i11 = i9 | i10 | (~(i3 | i2));
        int i12 = (~(i2 | i4)) | (~(i7 | i4));
        int i13 = i8 | i10;
        int i14 = i4 + i3 + i + (793188503 * i5) + (2090109681 * i6);
        int i15 = i14 * i14;
        int i16 = ((i4 * 1389925299) - 652765764) + (i3 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (1389926445 * i) + ((-1551828341) * i5) + ((-2047638435) * i6) + (i15 * 1214709760);
        boolean z = false;
        switch ((837707615 * i4) + 1286602752 + ((-1676358574) * i3) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i) + (1186463744 * i5) + (1166540800 * i6) + ((-1956446208) * i15) + (i16 * i16 * 445972480)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                final int iIntValue = ((Number) objArr[0]).intValue();
                final int iIntValue2 = ((Number) objArr[1]).intValue();
                final getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
                final String str = (String) objArr[4];
                final Function1 function1 = (Function1) objArr[5];
                final boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
                int iIntValue3 = ((Number) objArr[8]).intValue();
                int i17 = 2 % 2;
                if ((iIntValue3 & 3) != 2) {
                    z = true;
                } else {
                    int i18 = onExtraCallback + 123;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue3 & 1)) {
                    int i20 = onExtraCallback + 113;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i22 = onExtraCallback + 77;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2144057818, iIntValue3, -1, "im.toss.tds.compose.component.atom.text.TdsText.<anonymous> (TdsText.kt:264)");
                    }
                    putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), null, null, ForwardingCameraControl.onExtraCallback(-2013990551, true, new Function2() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda20
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onExtraCallback + 31;
                            onWarmupCompleted = i25 % 128;
                            if (i25 % 2 != 0) {
                                return AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(iIntValue, iIntValue2, gethumanreadablename, quirksExternalSyntheticBackport0, str, function1, zBooleanValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(iIntValue, iIntValue2, gethumanreadablename, quirksExternalSyntheticBackport0, str, function1, zBooleanValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 3:
                hasProvider hasprovider = (hasProvider) objArr[0];
                getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[1];
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[2];
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[3];
                dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) objArr[4];
                Map map = (Map) objArr[5];
                boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
                Function1 function12 = (Function1) objArr[7];
                Integer num = (Integer) objArr[8];
                int iIntValue4 = ((Number) objArr[9]).intValue();
                int iIntValue5 = ((Number) objArr[10]).intValue();
                int iIntValue6 = ((Number) objArr[11]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
                ((Number) objArr[13]).intValue();
                int i24 = 2 % 2;
                int i25 = onExtraCallback + 81;
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
                onWarmupCompleted(hasprovider, gethumanreadablename2, quirksExternalSyntheticBackport02, r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchpostbackasync, map, zBooleanValue2, function12, num, iIntValue4, cameraCaptureResultEmptyCameraCaptureResult2, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue5 | 1), iIntValue6);
                return Unit.INSTANCE;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return IAuthTabCallbackStubProxy(objArr);
            case 13:
                return access100(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(fliphorizontally);
        int i4 = onExtraCallback + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(getAdditionalConsentStatus getadditionalconsentstatus, setVideoView setvideoview, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getadditionalconsentstatus, setvideoview, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(hasProvider hasprovider, getHumanReadableName gethumanreadablename, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchPostbackAsync dispatchpostbackasync, Map map, boolean z, Function1 function1, Integer num, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 67;
        onWarmupCompleted = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(new Object[]{hasprovider, gethumanreadablename, quirksExternalSyntheticBackport0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchpostbackasync, map, Boolean.valueOf(z), function1, num, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1123619893, 1123619896, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        int i7 = onExtraCallback + 89;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(hasProvider hasprovider, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(hasprovider, isinvideousage);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = onExtraCallback + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return decrementvideousageOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) onExtraCallback(new Object[0], MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 957369536, -957369531, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).booleanValue();
        int i4 = onWarmupCompleted + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, int i2, getHumanReadableName gethumanreadablename, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function1 function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), gethumanreadablename, quirksExternalSyntheticBackport0, str, function1, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1375379057, 1375379059, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 25;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, List list2, Function1 function1, hasProvider hasprovider, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f2, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, list2, function1, hasprovider, f, deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f2, j, getsupportedhighspeedresolutionsfor, surfaceProcessorNodeOut);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = onExtraCallback + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(list, getsupportedhighspeedresolutionsfor, j, setorientationdegrees);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {surfaceProcessorNodeOut};
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent4 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(objArr, iOnNavigationEvent2, iOnNavigationEvent, 368106104, -368106097, iOnNavigationEvent3, iOnNavigationEvent4);
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getAdditionalConsentStatus getadditionalconsentstatus, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(getadditionalconsentstatus, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getadditionalconsentstatus, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(readFully readfully, readFully readfully2, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{readfully, readfully2, setiso}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1557271722, -1557271711, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return unit;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, AppLovinVastMediaViewd appLovinVastMediaViewd) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd>) getsupportedhighspeedresolutionsfor, appLovinVastMediaViewd);
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, int i2, getHumanReadableName gethumanreadablename, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function1 function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i, i2, gethumanreadablename, quirksExternalSyntheticBackport0, str, function1, z, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 58 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, int i2, getHumanReadableName gethumanreadablename, hasProvider hasprovider, Context context, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, List list2, float f2, long j, Function1 function1, boolean z, Map map, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), gethumanreadablename, hasprovider, context, quirksExternalSyntheticBackport0, list, Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, list2, Float.valueOf(f2), Long.valueOf(j), function1, Boolean.valueOf(z), map, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -176309720, 176309720, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        int i7 = onWarmupCompleted + 15;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getAdditionalConsentStatus getadditionalconsentstatus, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(getadditionalconsentstatus, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getadditionalconsentstatus, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = onWarmupCompleted + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(List list, hasProvider hasprovider, List list2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(list, hasprovider, list2, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(list, hasprovider, list2, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(float f, setContentInsetsRelative setcontentinsetsrelative, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(f, setcontentinsetsrelative, sessionProcessorCaptureCallback);
        }
        IAuthTabCallback(f, setcontentinsetsrelative, sessionProcessorCaptureCallback);
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(AppLovinVastMediaViewd appLovinVastMediaViewd, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(appLovinVastMediaViewd, j);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(surfaceProcessorNodeOut);
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static final class onWarmupCompleted implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ hasProvider onExtraCallback;

        public onWarmupCompleted(hasProvider hasprovider) {
            this.onExtraCallback = hasprovider;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AppLovinPrivacySettings.IAuthTabCallback(this.onExtraCallback);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final float f, @Nullable final setContentInsetsRelative setcontentinsetsrelative) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(attachTimestamp.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 57;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback((flipHorizontally) obj);
                if (i4 == 0) {
                    int i5 = 61 / 0;
                }
                return unitOnExtraCallback;
            }
        }), new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 121;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                removeObserverLocked removeobserverlockedOnNavigationEvent = AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(f, setcontentinsetsrelative, (SessionProcessorCaptureCallback) obj);
                int i5 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 83 / 0;
                }
                return removeobserverlockedOnNavigationEvent;
            }
        }));
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final Unit IAuthTabCallback(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final removeObserverLocked IAuthTabCallback(float f, setContentInsetsRelative setcontentinsetsrelative, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int iIAuthTabCallbackStub;
        int iIAuthTabCallback;
        final readFully readfullyOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        int iOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(f);
        if (setcontentinsetsrelative != null) {
            iIAuthTabCallbackStub = setcontentinsetsrelative.IAuthTabCallbackStub();
            int i2 = onWarmupCompleted + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 3;
            }
        } else {
            iIAuthTabCallbackStub = iOnExtraCallbackWithResult;
        }
        if (setcontentinsetsrelative != null) {
            iIAuthTabCallback = setcontentinsetsrelative.IAuthTabCallback();
        } else {
            int i4 = onExtraCallback + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iIAuthTabCallback = Integer.MAX_VALUE;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        int iCoerceAtMost = RangesKt.coerceAtMost(iIAuthTabCallbackStub, iOnExtraCallbackWithResult);
        int iCoerceAtMost2 = RangesKt.coerceAtMost(iIAuthTabCallback - iIAuthTabCallbackStub, iOnExtraCallbackWithResult);
        int iIAuthTabCallbackStub2 = setcontentinsetsrelative != null ? setcontentinsetsrelative.IAuthTabCallbackStub() : 0;
        final readFully readfullyOnExtraCallback2 = null;
        if (iCoerceAtMost2 > 0) {
            int i6 = onExtraCallback + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            readFully.onExtraCallback onextracallback = readFully.Companion;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            readfullyOnExtraCallback = readFully.onExtraCallback.onExtraCallback(onextracallback, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault()), setByteOrder.onNavigationEvent(onextracallbackwithresult.onNavigationEvent())}), fIntBitsToFloat - iCoerceAtMost2, fIntBitsToFloat, 0, 8, (Object) null);
            int i8 = onExtraCallback + 75;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        } else {
            readfullyOnExtraCallback = null;
        }
        if (iIAuthTabCallbackStub2 > 0) {
            readFully.onExtraCallback onextracallback2 = readFully.Companion;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult2 = setByteOrder.Companion;
            readfullyOnExtraCallback2 = readFully.onExtraCallback.onExtraCallback(onextracallback2, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(onextracallbackwithresult2.onNavigationEvent()), setByteOrder.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallbackDefault())}), 0.0f, iCoerceAtMost, 0, 8, (Object) null);
        }
        return sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i10 = 2 % 2;
                int i11 = IAuthTabCallback + 65;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(readfullyOnExtraCallback, readfullyOnExtraCallback2, (setIso) obj);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(readfullyOnExtraCallback, readfullyOnExtraCallback2, (setIso) obj);
                int i12 = IAuthTabCallback + 9;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int iIAuthTabCallbackDefault;
        long j;
        long j2;
        float f;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int iIAuthTabCallbackDefault2;
        long j3;
        long j4;
        float f2;
        hasMoreElements hasmoreelements2;
        seek seekVar2;
        int i2;
        readFully readfully = (readFully) objArr[0];
        readFully readfully2 = (readFully) objArr[1];
        setIso setiso = (setIso) objArr[2];
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setiso, "");
            setiso.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        if (readfully != null) {
            int i5 = onExtraCallback + 27;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                iIAuthTabCallbackDefault2 = readBoolean.Companion.IAuthTabCallbackDefault();
                j3 = 0;
                j4 = 1;
                f2 = 2.0f;
                hasmoreelements2 = null;
                seekVar2 = null;
                i2 = 2;
            } else {
                iIAuthTabCallbackDefault2 = readBoolean.Companion.IAuthTabCallbackDefault();
                j3 = 0;
                j4 = 0;
                f2 = 0.0f;
                hasmoreelements2 = null;
                seekVar2 = null;
                i2 = 62;
            }
            setOrientationDegrees.onExtraCallback(setiso, readfully, j3, j4, f2, hasmoreelements2, seekVar2, iIAuthTabCallbackDefault2, i2, (Object) null);
        }
        if (readfully2 != null) {
            int i6 = onExtraCallback + 11;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                iIAuthTabCallbackDefault = readBoolean.Companion.IAuthTabCallbackDefault();
                j = 1;
                j2 = 1;
                f = 1.0f;
                hasmoreelements = null;
                seekVar = null;
                i = 76;
            } else {
                iIAuthTabCallbackDefault = readBoolean.Companion.IAuthTabCallbackDefault();
                j = 0;
                j2 = 0;
                f = 0.0f;
                hasmoreelements = null;
                seekVar = null;
                i = 62;
            }
            setOrientationDegrees.onExtraCallback(setiso, readfully2, j, j2, f, hasmoreelements, seekVar, iIAuthTabCallbackDefault, i, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        int iOnExtraCallback;
        String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        long jLongValue3 = ((Number) objArr[5]).longValue();
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (InterfaceC0083handshake) objArr[6];
        Integer num = (Integer) objArr[7];
        createCameraCaptureCallback createcameracapturecallback = (createCameraCaptureCallback) objArr[8];
        float fFloatValue = ((Number) objArr[9]).floatValue();
        bindChildren bindchildren = (bindChildren) objArr[10];
        use useVar = (use) objArr[11];
        long jLongValue4 = ((Number) objArr[12]).longValue();
        int iIntValue = ((Number) objArr[13]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[14]).booleanValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[15];
        Function1 function1 = (Function1) objArr[16];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        int iIntValue2 = ((Number) objArr[18]).intValue();
        int iIntValue3 = ((Number) objArr[19]).intValue();
        int iIntValue4 = ((Number) objArr[20]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (iIntValue4 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
        if ((iIntValue4 & 4) != 0) {
            gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        }
        getHumanReadableName gethumanreadablename2 = gethumanreadablename;
        if ((iIntValue4 & 8) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
        }
        long j = jLongValue;
        if ((iIntValue4 & 16) != 0) {
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j2 = jLongValue2;
        if ((iIntValue4 & 32) != 0) {
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            jLongValue3 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j3 = jLongValue3;
        if ((iIntValue4 & 64) != 0) {
            int i4 = onExtraCallback + 109;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
                int i5 = 22 / 0;
            } else {
                interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
            }
        }
        InterfaceC0083handshake interfaceC0083handshake = interfaceC0083handshakeIAuthTabCallback;
        Object obj = null;
        if ((iIntValue4 & 128) != 0) {
            int i6 = onExtraCallback + 1;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            num = null;
        }
        if ((iIntValue4 & 256) != 0) {
            createcameracapturecallback = null;
        }
        if ((iIntValue4 & 512) != 0) {
            int i8 = onExtraCallback + 93;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            fFloatValue = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        }
        bindChildren bindchildren2 = (iIntValue4 & 1024) != 0 ? null : bindchildren;
        if ((iIntValue4 & 2048) != 0) {
            int i10 = onWarmupCompleted + 121;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            useVar = null;
        }
        if ((iIntValue4 & 4096) != 0) {
            jLongValue4 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        if ((iIntValue4 & 8192) != 0) {
            iIntValue = AppLovinVastMediaViewf.Companion.onWarmupCompleted();
        }
        int i11 = iIntValue;
        if ((iIntValue4 & 16384) != 0) {
            zBooleanValue = true;
        }
        if ((32768 & iIntValue4) != 0) {
            int i12 = onWarmupCompleted + 109;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            graphicDeviceInfo = null;
        }
        if ((iIntValue4 & 65536) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj2 = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj3 = new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda9
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj4) {
                        int i14 = 2 % 2;
                        int i15 = onExtraCallbackWithResult + 7;
                        onNavigationEvent = i15 % 128;
                        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) obj4;
                        if (i15 % 2 == 0) {
                            return AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted(surfaceProcessorNodeOut);
                        }
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted(surfaceProcessorNodeOut);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj3);
                obj2 = obj3;
            }
            function1 = (Function1) obj2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i14 = onExtraCallback + 77;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-596211029, iIntValue2, iIntValue3, "im.toss.tds.compose.component.atom.text.TdsText (TdsText.kt:212)");
        }
        if (bindchildren2 == null || !bindchildren2.onNavigationEvent(bindChildren.Companion.IAuthTabCallback())) {
            bindChildren bindchildrenOnMessageChannelReady = gethumanreadablename2.onMessageChannelReady();
            if (bindchildrenOnMessageChannelReady != null) {
                int i16 = onWarmupCompleted + 113;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                if (!bindchildrenOnMessageChannelReady.onNavigationEvent(bindChildren.Companion.IAuthTabCallback())) {
                    if (CacheCacheResponseBody1.onNavigationEvent.onNavigationEvent(str)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2031900251);
                        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), onextracallback2, gethumanreadablename2, j, j2, j3, interfaceC0083handshake, num, createcameracapturecallback, fFloatValue, null, bindchildren2, useVar, jLongValue4, i11, zBooleanValue, graphicDeviceInfo, function1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2 & 2147483632, (iIntValue3 << 3) & 33554416, 1024);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2031192273);
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted());
                        int i18 = iIntValue2 >> 3;
                        final getHumanReadableName gethumanreadablenameOnWarmupCompleted = onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchpostbackasync, gethumanreadablename2, j, j2, j3, interfaceC0083handshake, createcameracapturecallback, fFloatValue, bindchildren2, useVar, jLongValue4, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue2 & 4194176) | (29360128 & i18) | (i18 & 234881024) | ((iIntValue3 << 27) & 1879048192), ((iIntValue3 >> 3) & 126) | ((iIntValue3 >> 9) & 896), 0);
                        final String string = ConnectionSpec.onExtraCallbackWithResult(str, dispatchpostbackasync.asInterface().onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())), gethumanreadablenameOnWarmupCompleted.IAuthTabCallbackStub())).toString();
                        if (num != null) {
                            int i19 = onWarmupCompleted + 101;
                            onExtraCallback = i19 % 128;
                            int i20 = i19 % 2;
                            iOnExtraCallback = num.intValue();
                        } else {
                            iOnExtraCallback = dispatchpostbackasync.onExtraCallback();
                        }
                        final int i21 = iOnExtraCallback;
                        final int iOnExtraCallbackWithResult = AppLovinVastMediaViewf.onExtraCallbackWithResult(i11, AppLovinVastMediaViewf.Companion.onWarmupCompleted()) ? dispatchpostbackasync.onExtraCallbackWithResult() : i11;
                        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
                        final Function1 function12 = function1;
                        final boolean z = zBooleanValue;
                        setThreadList.IAuthTabCallback(string, ForwardingCameraControl.onExtraCallback(-2144057818, true, new Function2() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda10
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj4, Object obj5) {
                                int i22 = 2 % 2;
                                int i23 = onWarmupCompleted + 85;
                                onExtraCallback = i23 % 128;
                                if (i23 % 2 == 0) {
                                    return AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(iOnExtraCallbackWithResult, i21, gethumanreadablenameOnWarmupCompleted, onextracallback3, string, function12, z, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                }
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(iOnExtraCallbackWithResult, i21, gethumanreadablenameOnWarmupCompleted, onextracallback3, string, function12, z, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i22 = onExtraCallback + 21;
            onWarmupCompleted = i22 % 128;
            int i23 = i22 % 2;
        }
        return null;
    }

    static final class onExtraCallback implements skipBytes {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getHumanReadableName onExtraCallbackWithResult;

        onExtraCallback(getHumanReadableName gethumanreadablename) {
            this.onExtraCallbackWithResult = gethumanreadablename;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            long jAsInterface = this.onExtraCallbackWithResult.asInterface();
            int i4 = IAuthTabCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return jAsInterface;
        }
    }

    static final class onExtraCallbackWithResult implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String onExtraCallback;

        onExtraCallbackWithResult(String str) {
            this.onExtraCallback = str;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, this.onExtraCallback);
            int i4 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onExtraCallback(int i, int i2, getHumanReadableName gethumanreadablename, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function1 function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        bindChildren bindchildrenOnWarmupCompleted;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i5;
        int i6 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 3) != 2, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onWarmupCompleted + 65;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2013990551, i3, -1, "im.toss.tds.compose.component.atom.text.TdsText.<anonymous>.<anonymous> (TdsText.kt:265)");
                int i9 = onExtraCallback + 23;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2);
            bindChildren bindchildrenOnMessageChannelReady = gethumanreadablename.onMessageChannelReady();
            Object obj = null;
            if (bindchildrenOnMessageChannelReady != null) {
                int i11 = onExtraCallback + 83;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    disconnect.onWarmupCompleted(bindchildrenOnMessageChannelReady);
                    obj.hashCode();
                    throw null;
                }
                bindchildrenOnWarmupCompleted = disconnect.onWarmupCompleted(bindchildrenOnMessageChannelReady);
            } else {
                bindchildrenOnWarmupCompleted = null;
            }
            getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(gethumanreadablename, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindchildrenOnWarmupCompleted, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16773119, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(gethumanreadablename);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onExtraCallback(gethumanreadablename);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            skipBytes skipbytes = (skipBytes) objOnMinimized;
            if (((Boolean) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(onExtraCallbackWithResult)).booleanValue()) {
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(getExtensionsBeforeInitialized.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, new onExtraCallbackWithResult(str)));
                i5 = i;
                i4 = i2;
            } else {
                i4 = i2;
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
                i5 = i;
            }
            CameraInfoUnavailableException.onNavigationEvent(str, setAdVideoPlaybackListener.onWarmupCompleted(onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, i4, i5), "BasicText"), gethumanreadablenameOnNavigationEvent, function1, iOnExtraCallbackWithResult, z, i2, 0, skipbytes, (CameraX) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 640);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onExtraCallback + 17;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final void onNavigationEvent(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable Map<String, select> map, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, int i, boolean z, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) throws NoWhenBranchMatchedException {
        getHumanReadableName gethumanreadablename2;
        long jOnNavigationEvent;
        long jOnNavigationEvent2;
        Integer num2;
        float fOnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        bindChildren bindchildren2;
        bindChildren bindchildren3;
        use useVar2;
        Function1<? super SurfaceProcessorNodeOut, Unit> function12;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 115;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (i4 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        Object obj = null;
        if ((i4 & 4) != 0) {
            int i8 = onWarmupCompleted + 13;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        long jOnTransact = (i4 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i4 & 16) != 0) {
            int i9 = onWarmupCompleted + 65;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        if ((i4 & 32) != 0) {
            int i10 = onExtraCallback + 69;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            jOnNavigationEvent2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent2 = j3;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i4 & 64) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        Integer num3 = (i4 & 128) != 0 ? null : num;
        createCameraCaptureCallback createcameracapturecallback2 = (i4 & 256) != 0 ? null : createcameracapturecallback;
        if ((i4 & 512) != 0) {
            int i11 = onExtraCallback + 23;
            num2 = num3;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        } else {
            num2 = num3;
            fOnExtraCallback = f;
        }
        Map<String, select> mapOnNavigationEvent = (i4 & 1024) != 0 ? access8100.onNavigationEvent() : map;
        if ((i4 & 2048) != 0) {
            int i13 = onWarmupCompleted + 65;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            bindchildren2 = null;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            bindchildren2 = bindchildren;
        }
        if ((i4 & 4096) != 0) {
            int i15 = onWarmupCompleted + 9;
            bindchildren3 = bindchildren2;
            int i16 = i15 % 128;
            onExtraCallback = i16;
            if (i15 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i17 = i16 + 19;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 2 / 2;
            }
            useVar2 = null;
        } else {
            bindchildren3 = bindchildren2;
            useVar2 = useVar;
        }
        long jOnNavigationEvent3 = (i4 & 8192) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        int iOnWarmupCompleted = (i4 & 16384) != 0 ? AppLovinVastMediaViewf.Companion.onWarmupCompleted() : i;
        boolean z2 = (i4 & 32768) != 0 ? true : z;
        GraphicDeviceInfo graphicDeviceInfo2 = (i4 & 65536) != 0 ? null : graphicDeviceInfo;
        if ((i4 & 131072) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj3) {
                        int i19 = 2 % 2;
                        int i20 = onExtraCallbackWithResult + 121;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnExtraCallbackWithResult = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult((SurfaceProcessorNodeOut) obj3);
                        if (i21 == 0) {
                            int i22 = 45 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function12 = (Function1) objOnMinimized;
        } else {
            function12 = function1;
        }
        Function1<? super SurfaceProcessorNodeOut, Unit> function13 = function12;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-282698393, i2, i3, "im.toss.tds.compose.component.atom.text.TdsText (TdsText.kt:312)");
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted());
        int i19 = i2 >> 3;
        int i20 = i2 << 3;
        int i21 = i3 << 15;
        onWarmupCompleted(hasprovider, onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchpostbackasync, gethumanreadablename2, jOnTransact, jOnNavigationEvent, jOnNavigationEvent2, interfaceC0083handshakeIAuthTabCallback, createcameracapturecallback2, fOnExtraCallback, bindchildren3, useVar2, jOnNavigationEvent3, graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 4194176) | (i19 & 29360128) | (i19 & 234881024) | ((i3 << 24) & 1879048192), ((i3 >> 6) & 126) | ((i3 >> 12) & 896), 0), quirksExternalSyntheticBackport02, r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchpostbackasync, mapOnNavigationEvent, z2, function13, num2, iOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 14) | (i20 & 896) | (458752 & i21) | ((i3 << 3) & 3670016) | (i3 & 29360128) | (i20 & 234881024) | (i21 & 1879048192), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i22 = onExtraCallback + 63;
            onWarmupCompleted = i22 % 128;
            if (i22 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i23 = 95 / 0;
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(List list, List list2, Function1 function1, hasProvider hasprovider, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f2, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        Object objPrevious;
        long jOnTransact;
        long j2;
        SurfaceProcessorNode surfaceProcessorNode;
        SurfaceProcessorNodeOut surfaceProcessorNodeOut2 = surfaceProcessorNodeOut;
        int i = 2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut2, "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i3 = onWarmupCompleted + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            AppLovinVastMediaViewd appLovinVastMediaViewd = (AppLovinVastMediaViewd) it.next();
            appLovinVastMediaViewd.onWarmupCompleted((List<? extends removeTimestamp>) onExtraCallback(new Object[]{surfaceProcessorNodeOut, hasprovider.onTransact(), Integer.valueOf(appLovinVastMediaViewd.onWarmupCompleted().IAuthTabCallbackStub()), Integer.valueOf(appLovinVastMediaViewd.onWarmupCompleted().IAuthTabCallback() - 1), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1086038069, 1086038078, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            int i5 = onExtraCallback + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % i != 0) {
                hasProvider.onExtraCallbackWithResult onextracallbackwithresult = (hasProvider.onExtraCallbackWithResult) it2.next();
                onextracallbackwithresult.IAuthTabCallbackStub();
                onextracallbackwithresult.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            hasProvider.onExtraCallbackWithResult onextracallbackwithresult2 = (hasProvider.onExtraCallbackWithResult) it2.next();
            int iIAuthTabCallbackStub = onextracallbackwithresult2.IAuthTabCallbackStub();
            int iIAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            while (iIAuthTabCallbackStub < iIAuthTabCallback) {
                if (!surfaceProcessorNodeOut2.getInterfaceDescriptor(surfaceProcessorNodeOut2.IAuthTabCallbackStub(iIAuthTabCallbackStub))) {
                    List listOnWarmupCompleted = hasprovider.onWarmupCompleted();
                    ListIterator listIterator = listOnWarmupCompleted.listIterator(listOnWarmupCompleted.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        int i6 = onExtraCallback + 103;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % i;
                        objPrevious = listIterator.previous();
                        hasProvider.onExtraCallbackWithResult onextracallbackwithresult3 = (hasProvider.onExtraCallbackWithResult) objPrevious;
                        if (onextracallbackwithresult3.IAuthTabCallbackStub() <= iIAuthTabCallbackStub && iIAuthTabCallbackStub < onextracallbackwithresult3.IAuthTabCallback()) {
                            break;
                        }
                    }
                    hasProvider.onExtraCallbackWithResult onextracallbackwithresult4 = (hasProvider.onExtraCallbackWithResult) objPrevious;
                    if (onextracallbackwithresult4 == null || (surfaceProcessorNode = (SurfaceProcessorNode) onextracallbackwithresult4.onExtraCallback()) == null) {
                        jOnTransact = setByteOrder.Companion.onTransact();
                    } else {
                        int i8 = onExtraCallback + 97;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % i;
                        jOnTransact = surfaceProcessorNode.onExtraCallback();
                    }
                    if (jOnTransact == 16) {
                        int i10 = onExtraCallback + 109;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % i != 0) {
                            int i11 = 31 / 0;
                        }
                        j2 = j;
                    } else {
                        j2 = jOnTransact;
                    }
                    long jOnExtraCallbackWithResult = setUseCaseAttached.onExtraCallbackWithResult(surfaceProcessorNodeOut2.onWarmupCompleted(iIAuthTabCallbackStub).onTransact(), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)));
                    iIAuthTabCallbackStub = iIAuthTabCallbackStub;
                    arrayList.add(new PostbackServiceImpl(onextracallbackwithresult2, f2, j2, jOnExtraCallbackWithResult, setUseCaseAttached.onExtraCallbackWithResult(surfaceProcessorNodeOut2.onWarmupCompleted(iIAuthTabCallbackStub).asInterface(), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null));
                }
                iIAuthTabCallbackStub++;
                surfaceProcessorNodeOut2 = surfaceProcessorNodeOut;
                i = 2;
            }
            surfaceProcessorNodeOut2 = surfaceProcessorNodeOut;
        }
        onExtraCallback((getSupportedHighSpeedResolutionsFor<List<PostbackServiceImpl>>) getsupportedhighspeedresolutionsfor, arrayList);
        function1.invoke(surfaceProcessorNodeOut);
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent implements skipBytes {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getHumanReadableName onWarmupCompleted;

        onNavigationEvent(getHumanReadableName gethumanreadablename) {
            this.onWarmupCompleted = gethumanreadablename;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getHumanReadableName gethumanreadablename = this.onWarmupCompleted;
            if (i3 != 0) {
                return gethumanreadablename.asInterface();
            }
            int i4 = 53 / 0;
            return gethumanreadablename.asInterface();
        }
    }

    static final class IAuthTabCallback implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ hasProvider onNavigationEvent;

        IAuthTabCallback(hasProvider hasprovider) {
            this.onNavigationEvent = hasprovider;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, this.onNavigationEvent.onTransact());
                throw null;
            }
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, this.onNavigationEvent.onTransact());
            int i3 = onExtraCallbackWithResult + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        float f;
        boolean z;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
        final hasProvider hasprovider = (hasProvider) objArr[3];
        Context context = (Context) objArr[4];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
        final List list = (List) objArr[6];
        final float fFloatValue = ((Number) objArr[7]).floatValue();
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[8];
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[9];
        final List list2 = (List) objArr[10];
        float fFloatValue2 = ((Number) objArr[11]).floatValue();
        final long jLongValue = ((Number) objArr[12]).longValue();
        final Function1 function1 = (Function1) objArr[13];
        boolean zBooleanValue = ((Boolean) objArr[14]).booleanValue();
        Map map = (Map) objArr[15];
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[16];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        int iIntValue3 = ((Number) objArr[18]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if ((iIntValue3 & 3) != 2) {
            int i5 = i2 + 39;
            f = fFloatValue2;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            f = fFloatValue2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-806015143, iIntValue3, -1, "im.toss.tds.compose.component.atom.text.TdsText.<anonymous>.<anonymous> (TdsText.kt:398)");
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iIntValue, iIntValue2);
            bindChildren bindchildrenOnMessageChannelReady = gethumanreadablename.onMessageChannelReady();
            Object obj = null;
            bindChildren bindchildrenOnWarmupCompleted = bindchildrenOnMessageChannelReady != null ? disconnect.onWarmupCompleted(bindchildrenOnMessageChannelReady) : null;
            r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubmOnExtraCallbackWithResult = AppLovinVastMediaViewfExternalSyntheticLambda0.onExtraCallbackWithResult(gethumanreadablename.onMinimized(), CacheCacheResponseBody1.onNavigationEvent.onNavigationEvent(hasprovider.onTransact()) && r8lambdaLbZPPDfoZZmhOSA2066odmnkNxc.onWarmupCompleted.onExtraCallbackWithResult(context) != null);
            final float f2 = f;
            getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(gethumanreadablename, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindchildrenOnWarmupCompleted, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, r8lambdak6cwcefle9txulslgjo2burubmOnExtraCallbackWithResult, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16248831, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(gethumanreadablename);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onNavigationEvent(gethumanreadablename);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            skipBytes skipbytes = (skipBytes) objOnMinimized;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onextracallback.onExtraCallback(quirksExternalSyntheticBackport0);
            if (((Boolean) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(onExtraCallbackWithResult)).booleanValue()) {
                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, new IAuthTabCallback(hasprovider)));
            }
            int i7 = onWarmupCompleted + 111;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = setAdVideoPlaybackListener.onWarmupCompleted(onWarmupCompleted(onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, iIntValue2, iIntValue), hasprovider, (List<AppLovinVastMediaViewd>) list, onWarmupCompleted((getSupportedHighSpeedResolutionsFor<List<PostbackServiceImpl>>) getsupportedhighspeedresolutionsfor)), "BasicText");
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(hasprovider);
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fFloatValue);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list2);
            boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2);
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue);
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent2 | zOnNavigationEvent3 | zIAuthTabCallback | zOnNavigationEvent4 | zOnNavigationEvent5 | zOnNavigationEvent6 | zIAuthTabCallback2 | zOnWarmupCompleted | zOnNavigationEvent7)) {
                Object obj2 = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function12 = new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda23
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj3) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallback + 119;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 == 0) {
                                return AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(list, list2, function1, hasprovider, fFloatValue, deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f2, jLongValue, getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj3);
                            }
                            int i11 = 7 / 0;
                            return AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(list, list2, function1, hasprovider, fFloatValue, deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f2, jLongValue, getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj3);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function12);
                    obj2 = function12;
                }
                CameraInfoUnavailableException.IAuthTabCallback(hasprovider, quirksExternalSyntheticBackport0OnWarmupCompleted, gethumanreadablenameOnNavigationEvent, (Function1) obj2, iOnExtraCallbackWithResult, zBooleanValue, iIntValue2, 0, map, skipbytes, (CameraX) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 1152);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onWarmupCompleted + 123;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
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

    private static final Unit onExtraCallbackWithResult(final int i, final int i2, final getHumanReadableName gethumanreadablename, final hasProvider hasprovider, final Context context, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final List list, final float f, final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, final List list2, final float f2, final long j, final Function1 function1, final boolean z, final Map map, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 3) != 2, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(473428924, i3, -1, "im.toss.tds.compose.component.atom.text.TdsText.<anonymous> (TdsText.kt:397)");
            }
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), null, null, ForwardingCameraControl.onExtraCallback(-806015143, true, new Function2() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda13
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 119;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnNavigationEvent = AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(i, i2, gethumanreadablename, hasprovider, context, quirksExternalSyntheticBackport0, list, f, deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, list2, f2, j, function1, z, map, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = onNavigationEvent + 105;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 47;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final hasProvider hasprovider, @NotNull final getHumanReadableName gethumanreadablename, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @Nullable dispatchPostbackAsync dispatchpostbackasync, @Nullable Map<String, select> map, boolean z, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function1, @Nullable Integer num, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws NoWhenBranchMatchedException {
        dispatchPostbackAsync dispatchpostbackasync2;
        int i4;
        Map<String, select> mapOnNavigationEvent;
        int i5;
        int i6;
        int i7;
        int i8;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42;
        final boolean z2;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function12;
        final Map<String, select> map2;
        final dispatchPostbackAsync dispatchpostbackasync3;
        final Integer num2;
        final int i9;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky43;
        dispatchPostbackAsync dispatchpostbackasync4;
        Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        Integer num3;
        int iOnWarmupCompleted;
        Integer num4;
        Function1<? super SurfaceProcessorNodeOut, Unit> function14;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky44;
        dispatchPostbackAsync dispatchpostbackasync5;
        Map<String, select> map3;
        boolean z3;
        int iOnExtraCallback;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(gethumanreadablename, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(14977019);
        int i11 = (i2 & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i11 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i11 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 128 : 256;
            }
            if ((i2 & 3072) != 0) {
                int i13 = onExtraCallback;
                int i14 = i13 + 19;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                if ((i3 & 8) == 0) {
                    int i16 = i13 + 83;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4) ? 2048 : 1024;
                    i11 |= i18;
                }
                i11 |= i18;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    dispatchpostbackasync2 = dispatchpostbackasync;
                    int i19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(dispatchpostbackasync2) ? 16384 : 8192;
                    i11 |= i19;
                } else {
                    dispatchpostbackasync2 = dispatchpostbackasync;
                }
                i11 |= i19;
            } else {
                dispatchpostbackasync2 = dispatchpostbackasync;
            }
            i4 = i3 & 32;
            if (i4 != 0) {
                if ((i2 & 196608) == 0) {
                    int i20 = onWarmupCompleted + 93;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    mapOnNavigationEvent = map;
                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mapOnNavigationEvent) ? 131072 : 65536;
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                    i11 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i11 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 8388608 : 4194304;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i11 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num) ? 67108864 : 33554432;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i11 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 536870912 : 268435456;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 306783379) != 306783378, i11 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    Object obj = null;
                    if ((i2 & 1) != 0) {
                        int i22 = onWarmupCompleted + 103;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage();
                            obj.hashCode();
                            throw null;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            if ((i3 & 8) != 0) {
                                r8lambdanm9dm2eewl4vrptnjmesfjqky43 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                                i11 &= -7169;
                            } else {
                                r8lambdanm9dm2eewl4vrptnjmesfjqky43 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                            }
                            if ((i3 & 16) != 0) {
                                dispatchpostbackasync4 = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted());
                                i11 &= -57345;
                            } else {
                                dispatchpostbackasync4 = dispatchpostbackasync2;
                            }
                            if (i4 != 0) {
                                mapOnNavigationEvent = access8100.onNavigationEvent();
                            }
                            boolean z4 = i5 != 0 ? true : z;
                            if (i6 != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda1
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj2) {
                                            Unit unit;
                                            int i23 = 2 % 2;
                                            int i24 = onWarmupCompleted + 37;
                                            onExtraCallbackWithResult = i24 % 128;
                                            SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) obj2;
                                            if (i24 % 2 == 0) {
                                                unit = (Unit) AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{surfaceProcessorNodeOut}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 319165407, -319165397, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                                int i25 = 68 / 0;
                                            } else {
                                                unit = (Unit) AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{surfaceProcessorNodeOut}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 319165407, -319165397, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                            }
                                            int i26 = onExtraCallbackWithResult + 61;
                                            onWarmupCompleted = i26 % 128;
                                            int i27 = i26 % 2;
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                function13 = (Function1) objOnMinimized;
                            } else {
                                function13 = function1;
                            }
                            if (i7 != 0) {
                                num3 = null;
                            } else {
                                int i23 = onExtraCallback + 29;
                                onWarmupCompleted = i23 % 128;
                                int i24 = i23 % 2;
                                num3 = num;
                            }
                            if (i8 != 0) {
                                num4 = num3;
                                iOnWarmupCompleted = AppLovinVastMediaViewf.Companion.onWarmupCompleted();
                            } else {
                                iOnWarmupCompleted = i;
                                num4 = num3;
                            }
                            function14 = function13;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            r8lambdanm9dm2eewl4vrptnjmesfjqky44 = r8lambdanm9dm2eewl4vrptnjmesfjqky43;
                            dispatchpostbackasync5 = dispatchpostbackasync4;
                            map3 = mapOnNavigationEvent;
                            z3 = z4;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i3 & 8) != 0) {
                                i11 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i11 &= -57345;
                                int i25 = onExtraCallback + 13;
                                onWarmupCompleted = i25 % 128;
                                int i26 = i25 % 2;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            r8lambdanm9dm2eewl4vrptnjmesfjqky44 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                            z3 = z;
                            function14 = function1;
                            num4 = num;
                            iOnWarmupCompleted = i;
                            map3 = mapOnNavigationEvent;
                            dispatchpostbackasync5 = dispatchpostbackasync2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(14977019, i11, -1, "im.toss.tds.compose.component.atom.text.TdsText (TdsText.kt:357)");
                        }
                        final hasProvider hasproviderOnNavigationEvent = disconnect.onNavigationEvent(hasprovider, gethumanreadablename.onMessageChannelReady(), dispatchpostbackasync5.asInterface().onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky44, readIntokhttp.onNavigationEvent((Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())), gethumanreadablename.IAuthTabCallbackStub()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11 & 14);
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasproviderOnNavigationEvent);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent) {
                            Object obj2 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                List<hasProvider.onExtraCallbackWithResult> listOnNavigationEvent = hasproviderOnNavigationEvent.onNavigationEvent(0, hasproviderOnNavigationEvent.length());
                                ArrayList arrayList = new ArrayList();
                                for (hasProvider.onExtraCallbackWithResult onextracallbackwithresult : listOnNavigationEvent) {
                                    Function0<Unit> function0IAuthTabCallback = AppLovinPrivacySettings.IAuthTabCallback((hasProvider.onExtraCallbackWithResult<String>) onextracallbackwithresult);
                                    AppLovinVastMediaViewd appLovinVastMediaViewd = function0IAuthTabCallback != null ? new AppLovinVastMediaViewd(onextracallbackwithresult, function0IAuthTabCallback) : null;
                                    if (appLovinVastMediaViewd != null) {
                                        arrayList.add(appLovinVastMediaViewd);
                                    }
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(arrayList);
                                obj2 = arrayList;
                            }
                            final List list = (List) obj2;
                            final List listIAuthTabCallback = hasproviderOnNavigationEvent.IAuthTabCallback("tds:underline", 0, hasproviderOnNavigationEvent.length());
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                int i27 = onWarmupCompleted + 53;
                                onExtraCallback = i27 % 128;
                                int i28 = i27 % 2;
                                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(CollectionsKt.emptyList(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                            final Map map4 = (Map) onExtraCallback(new Object[]{hasproviderOnNavigationEvent, gethumanreadablename, null, map3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i11 & 112) | ((i11 >> 6) & 7168)), 4}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1365419148, -1365419136, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(gethumanreadablename.IAuthTabCallbackStub());
                            int i29 = (i11 & 7168) ^ 3072;
                            boolean z5 = (i29 > 2048 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky44)) || (i11 & 3072) == 2048;
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((zOnWarmupCompleted | z5) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized4 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(((Float) onExtraCallback(new Object[]{Long.valueOf(gethumanreadablename.IAuthTabCallbackStub()), r8lambdanm9dm2eewl4vrptnjmesfjqky44}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -559871569, 559871582, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).floatValue());
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                            }
                            final float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized4).IAuthTabCallback();
                            boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(gethumanreadablename.IAuthTabCallbackStub());
                            boolean z6 = (i29 > 2048 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky44)) || (i11 & 3072) == 2048;
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnWarmupCompleted2 | z6)) {
                                Object obj3 = objOnMinimized5;
                                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted(gethumanreadablename.IAuthTabCallbackStub(), r8lambdanm9dm2eewl4vrptnjmesfjqky44);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0OnWarmupCompleted);
                                    obj3 = deviceQuirksExternalSyntheticLambda0OnWarmupCompleted;
                                }
                                final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj3;
                                boolean zOnWarmupCompleted3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(gethumanreadablename.IAuthTabCallbackStub());
                                boolean z7 = (i29 > 2048 && !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky44) ^ true)) || (i11 & 3072) == 2048;
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zOnWarmupCompleted3 | z7)) {
                                    int i30 = onExtraCallback + 83;
                                    onWarmupCompleted = i30 % 128;
                                    int i31 = i30 % 2;
                                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                        long jIAuthTabCallbackStub = gethumanreadablename.IAuthTabCallbackStub();
                                        GraphicDeviceInfo interfaceDescriptor = gethumanreadablename.getInterfaceDescriptor();
                                        if (interfaceDescriptor == null) {
                                            int i32 = onWarmupCompleted + 59;
                                            onExtraCallback = i32 % 128;
                                            int i33 = i32 % 2;
                                            interfaceDescriptor = (GraphicDeviceInfo) isRepeatingEnabled.IAuthTabCallback(new Object[]{isRepeatingEnabled.onExtraCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1863337886, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1863337887);
                                        }
                                        objOnMinimized6 = Float.valueOf(onExtraCallback(jIAuthTabCallbackStub, interfaceDescriptor, r8lambdanm9dm2eewl4vrptnjmesfjqky44));
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                    }
                                    final float fFloatValue = ((Number) objOnMinimized6).floatValue();
                                    final long jAsInterface = gethumanreadablename.asInterface();
                                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasproviderOnNavigationEvent);
                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (zOnNavigationEvent2 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda2
                                            private static int onExtraCallback = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj4) {
                                                int i34 = 2 % 2;
                                                int i35 = onWarmupCompleted + 85;
                                                onExtraCallback = i35 % 128;
                                                int i36 = i35 % 2;
                                                decrementVideoUsage decrementvideousageOnExtraCallback = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(hasproviderOnNavigationEvent, (isInVideoUsage) obj4);
                                                int i37 = onWarmupCompleted + 101;
                                                onExtraCallback = i37 % 128;
                                                if (i37 % 2 != 0) {
                                                    int i38 = 16 / 0;
                                                }
                                                return decrementvideousageOnExtraCallback;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                                    }
                                    isZslDisabledByByUserCaseConfig.onExtraCallback(hasproviderOnNavigationEvent, (Function1) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    if (num4 != null) {
                                        int i34 = onWarmupCompleted + 79;
                                        onExtraCallback = i34 % 128;
                                        int i35 = i34 % 2;
                                        iOnExtraCallback = num4.intValue();
                                    } else {
                                        iOnExtraCallback = dispatchpostbackasync5.onExtraCallback();
                                    }
                                    final int i36 = iOnExtraCallback;
                                    final int iOnExtraCallbackWithResult = !AppLovinVastMediaViewf.onExtraCallbackWithResult(iOnWarmupCompleted, AppLovinVastMediaViewf.Companion.onWarmupCompleted()) ? iOnWarmupCompleted : dispatchpostbackasync5.onExtraCallbackWithResult();
                                    final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                                    int i37 = iOnWarmupCompleted;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                                    r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky45 = r8lambdanm9dm2eewl4vrptnjmesfjqky44;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    final Function1<? super SurfaceProcessorNodeOut, Unit> function15 = function14;
                                    final boolean z8 = z3;
                                    setThreadList.IAuthTabCallback(hasproviderOnNavigationEvent.onTransact(), ForwardingCameraControl.onExtraCallback(473428924, true, new Function2() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda3
                                        private static int IAuthTabCallback = 0;
                                        private static int onExtraCallback = 1;

                                        public final Object invoke(Object obj4, Object obj5) {
                                            int i38 = 2 % 2;
                                            int i39 = onExtraCallback + 47;
                                            IAuthTabCallback = i39 % 128;
                                            int i40 = i39 % 2;
                                            Unit unitIAuthTabCallback = AppLovinVastMediaVieweExternalSyntheticLambda0.IAuthTabCallback(iOnExtraCallbackWithResult, i36, gethumanreadablename, hasproviderOnNavigationEvent, context, quirksExternalSyntheticBackport05, list, fIAuthTabCallback, deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky44, listIAuthTabCallback, fFloatValue, jAsInterface, function15, z8, map4, getsupportedhighspeedresolutionsfor, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                            int i41 = IAuthTabCallback + 97;
                                            onExtraCallback = i41 % 128;
                                            if (i41 % 2 == 0) {
                                                int i42 = 72 / 0;
                                            }
                                            return unitIAuthTabCallback;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 48);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                    dispatchpostbackasync3 = dispatchpostbackasync5;
                                    map2 = map3;
                                    z2 = z3;
                                    function12 = function14;
                                    num2 = num4;
                                    i9 = i37;
                                    r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky45;
                                }
                            }
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                    z2 = z;
                    function12 = function1;
                    map2 = mapOnNavigationEvent;
                    dispatchpostbackasync3 = dispatchpostbackasync2;
                    num2 = num;
                    i9 = i;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i38 = 2 % 2;
                            int i39 = onExtraCallbackWithResult + 77;
                            IAuthTabCallback = i39 % 128;
                            int i40 = i39 % 2;
                            Unit unitOnExtraCallback = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(hasprovider, gethumanreadablename, quirksExternalSyntheticBackport02, r8lambdanm9dm2eewl4vrptnjmesfjqky42, dispatchpostbackasync3, map2, z2, function12, num2, i9, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i41 = onExtraCallbackWithResult + 73;
                            IAuthTabCallback = i41 % 128;
                            int i42 = i41 % 2;
                            return unitOnExtraCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i11 |= 196608;
            mapOnNavigationEvent = map;
            i5 = i3 & 64;
            if (i5 != 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 306783379) != 306783378, i11 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i4 = i3 & 32;
        if (i4 != 0) {
        }
        mapOnNavigationEvent = map;
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 306783379) != 306783378, i11 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return o.notifySessionStart.Companion.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        o.notifySessionStart.Companion.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (o.AppLovinVastMediaViewf.onExtraCallbackWithResult(r4, r0.onNavigationEvent()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return o.notifySessionStart.Companion.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (o.AppLovinVastMediaViewf.onExtraCallbackWithResult(r4, r0.onExtraCallbackWithResult()) == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if ((!o.AppLovinVastMediaViewf.onExtraCallbackWithResult(r4, r0.onExtraCallback())) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        r4 = o.AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback + 95;
        o.AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if ((r4 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        r5 = 62 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        return o.notifySessionStart.Companion.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r4 = o.notifySessionStart.Companion.onExtraCallbackWithResult();
        r0 = o.AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback + 37;
        o.AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if ((r0 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r4 = o.AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted + 23;
        o.AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if ((r4 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        return o.notifySessionStart.Companion.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        o.notifySessionStart.Companion.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return o.notifySessionStart.Companion.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (o.AppLovinVastMediaViewf.onExtraCallbackWithResult(r4, r0.IAuthTabCallback()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (o.AppLovinVastMediaViewf.onExtraCallbackWithResult(r4, r0.IAuthTabCallback()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r4 = o.AppLovinVastMediaVieweExternalSyntheticLambda0.onWarmupCompleted + 89;
        o.AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int onExtraCallbackWithResult(int i, int i2) {
        AppLovinVastMediaViewf.IAuthTabCallback iAuthTabCallback;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            iAuthTabCallback = AppLovinVastMediaViewf.Companion;
            int i5 = 99 / 0;
        } else {
            iAuthTabCallback = AppLovinVastMediaViewf.Companion;
        }
    }

    private static final Pair<AvoidCaptureProcessProgressAvailabilityCheckQuirk, connectionCount> onWarmupCompleted(float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallbackDefault(j)) {
                Object[] objArr = {Long.valueOf(j), Float.valueOf(f)};
                connectionCount connectioncount = (connectionCount) AppLovinInitProvider.onExtraCallbackWithResult(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -539097095, objArr, 539097096, zzaq.onNavigationEvent());
                Pair<AvoidCaptureProcessProgressAvailabilityCheckQuirk, connectionCount> pairIAuthTabCallback = getWrite.IAuthTabCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(AppLovinInitProvider.onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, connectioncount, f)), connectioncount);
                int i3 = onExtraCallback + 3;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 38 / 0;
                }
                return pairIAuthTabCallback;
            }
            return getWrite.IAuthTabCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(j), (Object) null);
        }
        AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallbackDefault(j);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01dc A[PHI: r9
      0x01dc: PHI (r9v6 o.AvoidCaptureProcessProgressAvailabilityCheckQuirk) = (r9v5 o.AvoidCaptureProcessProgressAvailabilityCheckQuirk), (r9v10 o.AvoidCaptureProcessProgressAvailabilityCheckQuirk) binds: [B:84:0x0190, B:89:0x01b2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final getHumanReadableName onWarmupCompleted(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull dispatchPostbackAsync dispatchpostbackasync, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        getHumanReadableName gethumanreadablename2;
        long jOnNavigationEvent;
        float fOnNavigationEvent;
        createCameraCaptureCallback createcameracapturecallback2;
        long jIAuthTabCallback;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(dispatchpostbackasync, "");
        if ((i3 & 4) != 0) {
            int i5 = onWarmupCompleted + 101;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                int i6 = 79 / 0;
            } else {
                gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            }
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        long jOnTransact = (i3 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent2 = (i3 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        Object obj = null;
        if ((i3 & 32) != 0) {
            int i7 = onExtraCallback + 93;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j3;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i3 & 64) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        createCameraCaptureCallback createcameracapturecallback3 = (i3 & 128) != 0 ? null : createcameracapturecallback;
        if ((i3 & 256) != 0) {
            int i8 = onWarmupCompleted + 77;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            fOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        } else {
            fOnNavigationEvent = f;
        }
        bindChildren bindchildren2 = (i3 & 512) != 0 ? null : bindchildren;
        use useVar2 = (i3 & 1024) != 0 ? null : useVar;
        long jOnNavigationEvent3 = (i3 & 2048) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        GraphicDeviceInfo interfaceDescriptor = (i3 & 4096) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            createcameracapturecallback2 = createcameracapturecallback3;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-160008860, i, i2, "im.toss.tds.compose.component.atom.text.tdsTextStyle (TdsText.kt:512)");
        } else {
            createcameracapturecallback2 = createcameracapturecallback3;
        }
        if (Float.isNaN(fOnNavigationEvent)) {
            int i10 = onWarmupCompleted + 37;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            fOnNavigationEvent = dispatchpostbackasync.onNavigationEvent();
        }
        if (!protocol.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback)) {
            interfaceC0083handshakeIAuthTabCallback = null;
        }
        if (interfaceC0083handshakeIAuthTabCallback == null) {
            int i12 = onWarmupCompleted + 41;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            interfaceC0083handshakeIAuthTabCallback = dispatchpostbackasync.IAuthTabCallback();
        }
        Pair<AvoidCaptureProcessProgressAvailabilityCheckQuirk, connectionCount> pairOnWarmupCompleted = AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnNavigationEvent2) == 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(gethumanreadablename2.IAuthTabCallbackStub()) == 0 ? onWarmupCompleted(fOnNavigationEvent, r8lambdanm9dm2eewl4vrptnjmesfjqky4, RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(accessgetTlsVersionsAsStringp.Typography5.getSize())) : onWarmupCompleted(fOnNavigationEvent, r8lambdanm9dm2eewl4vrptnjmesfjqky4, gethumanreadablename2.IAuthTabCallbackStub()) : onWarmupCompleted(fOnNavigationEvent, r8lambdanm9dm2eewl4vrptnjmesfjqky4, jOnNavigationEvent2);
        long jIAuthTabCallback2 = ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) pairOnWarmupCompleted.onExtraCallbackWithResult()).IAuthTabCallback();
        connectionCount connectioncount = (connectionCount) pairOnWarmupCompleted.IAuthTabCallback();
        if (protocol.onNavigationEvent(interfaceC0083handshakeIAuthTabCallback)) {
            jIAuthTabCallback = connectioncount != null ? AppLovinInitProvider.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, connectioncount, 0.0f, interfaceC0083handshakeIAuthTabCallback, 2, null) : AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(jOnNavigationEvent);
            if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult.IAuthTabCallback()) == 0) {
                avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult = null;
            }
            if (avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult != null) {
                jIAuthTabCallback = avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult.IAuthTabCallback();
            } else {
                avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(gethumanreadablename2.writeTypedObject());
                if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult.IAuthTabCallback()) == 0) {
                    int i14 = onWarmupCompleted + 115;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult = null;
                }
                if (avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult == null) {
                    AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult2 = connectioncount != null ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(AppLovinInitProvider.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, connectioncount, 0.0f, null, 6, null)) : null;
                    jIAuthTabCallback = avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult2 != null ? avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult2.IAuthTabCallback() : AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                }
            }
        }
        long j5 = jIAuthTabCallback;
        long jAccess100 = ((setByteOrder) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(convertYUVToRGB.IAuthTabCallback())).access100();
        float fFloatValue = ((Number) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(copyBitmapToByteBuffer.IAuthTabCallback())).floatValue();
        if (jOnTransact == 16) {
            jOnTransact = gethumanreadablename2.asInterface() != 16 ? gethumanreadablename2.asInterface() : setByteOrder.onExtraCallbackWithResult(jAccess100, fFloatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        }
        long j6 = jOnTransact;
        getChildPreviewOutConfig getchildpreviewoutconfigICustomTabsCallback = gethumanreadablename2.ICustomTabsCallback();
        if (getchildpreviewoutconfigICustomTabsCallback == null) {
            getchildpreviewoutconfigICustomTabsCallback = AppLovinPostbackService.onExtraCallbackWithResult.onExtraCallback();
        }
        getChildPreviewOutConfig getchildpreviewoutconfig = getchildpreviewoutconfigICustomTabsCallback;
        getSurfaceSize getsurfacesizeOnExtraCallbackWithResult = setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult();
        if (interfaceDescriptor == null) {
            interfaceDescriptor = gethumanreadablename2.getInterfaceDescriptor();
        }
        if (interfaceDescriptor == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(850382638);
            interfaceDescriptor = ((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())).getInterfaceDescriptor();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(850380871);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i16 = onExtraCallback;
        int i17 = i16 + 123;
        onWarmupCompleted = i17 % 128;
        int i18 = i17 % 2;
        if (interfaceDescriptor == null) {
            int i19 = i16 + 107;
            onWarmupCompleted = i19 % 128;
            if (i19 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            graphicDeviceInfo2 = (GraphicDeviceInfo) isRepeatingEnabled.IAuthTabCallback(new Object[]{isRepeatingEnabled.onExtraCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1863337886, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1863337887);
        } else {
            graphicDeviceInfo2 = interfaceDescriptor;
        }
        getHumanReadableName gethumanreadablenameOnWarmupCompleted = getHumanReadableName.onWarmupCompleted(gethumanreadablename2, j6, jIAuthTabCallback2, graphicDeviceInfo2, useVar2, (delete) null, getsurfacesizeOnExtraCallbackWithResult, (String) null, jOnNavigationEvent3, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindchildren2, (ExifSpeedConverter) null, (hasMoreElements) null, createcameracapturecallback2 != null ? createcameracapturecallback2.asInterface() : createCameraCaptureCallback.Companion.IAuthTabCallbackDefault(), 0, j5, (mergeChildrenConfigs) null, getchildpreviewoutconfig, 0, getPreviewFromChildren.Companion.onNavigationEvent(), (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (notifySessionStop) null, 13987664, (Object) null);
        if (gethumanreadablename2.onNavigationEvent() != null) {
            gethumanreadablenameOnWarmupCompleted = getHumanReadableName.onNavigationEvent(gethumanreadablenameOnWarmupCompleted, gethumanreadablename2.onNavigationEvent(), gethumanreadablename2.onExtraCallbackWithResult(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 33554428, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return gethumanreadablenameOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056 A[PHI: r1 r3 r4
      0x0056: PHI (r1v5 java.lang.Integer) = (r1v4 int), (r1v6 int) binds: [B:8:0x0040, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r3v3 java.lang.Integer) = (r3v1 int), (r3v4 int) binds: [B:8:0x0040, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r4v12 int) = (r4v3 int), (r4v19 int) binds: [B:8:0x0040, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[PHI: r3
      0x0042: PHI (r3v2 java.lang.Integer) = (r3v1 int), (r3v4 int) binds: [B:8:0x0040, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DeviceQuirksExternalSyntheticLambda0 onWarmupCompleted(long j, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i;
        int i2;
        int iIAuthTabCallback;
        Pair pair;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i = 2;
            i2 = 0;
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            iIAuthTabCallback = (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(j));
            if (iIAuthTabCallback <= 52) {
                pair = new Pair(i2, 4);
                int i5 = onWarmupCompleted + 47;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                pair = iIAuthTabCallback <= 22 ? new Pair(i2, 5) : iIAuthTabCallback <= 28 ? new Pair(1, 6) : iIAuthTabCallback <= 40 ? new Pair(i, 8) : new Pair(i, 10);
            }
        } else {
            i = 2;
            i2 = 0;
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            iIAuthTabCallback = (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(j));
            if (iIAuthTabCallback <= 18) {
            }
        }
        return CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Number) pair.getSecond()).intValue()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Number) pair.getFirst()).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float onExtraCallback(long j, @NotNull GraphicDeviceInfo graphicDeviceInfo, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        float f;
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        int iIAuthTabCallback = (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(j));
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        if (!Intrinsics.areEqual(graphicDeviceInfo, isrepeatingenabled.asBinder()) && !Intrinsics.areEqual(graphicDeviceInfo, isrepeatingenabled.onTransact())) {
            int i4 = onWarmupCompleted + 101;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            if (iIAuthTabCallback <= 15) {
                f = 1.0f;
            } else if (iIAuthTabCallback <= 18) {
                f = 1.3f;
            } else if (iIAuthTabCallback <= 22) {
                f = 1.5f;
            } else if (iIAuthTabCallback <= 28) {
                f = 1.8f;
            } else if (iIAuthTabCallback <= 34) {
                f = 2.0f;
            } else if (iIAuthTabCallback > 40) {
                if (iIAuthTabCallback <= 49) {
                    int i7 = i5 + 47;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    f = 2.5f;
                }
            }
        } else if (iIAuthTabCallback <= 15) {
            f = 0.7f;
        } else {
            if (iIAuthTabCallback > 18) {
                if (iIAuthTabCallback > 22) {
                    if (iIAuthTabCallback > 28) {
                        int i9 = onExtraCallback + 11;
                        int i10 = i9 % 128;
                        onWarmupCompleted = i10;
                        int i11 = i9 % 2;
                        if (iIAuthTabCallback > 34) {
                            int i12 = i10 + 57;
                            onExtraCallback = i12 % 128;
                            if (i12 % 2 != 0 ? iIAuthTabCallback > 40 : iIAuthTabCallback > 5) {
                                f = iIAuthTabCallback <= 49 ? 2.3f : 2.8f;
                            }
                            f = 2.0f;
                        }
                        f = 1.8f;
                    }
                    f = 1.5f;
                }
                f = 1.3f;
            }
            f = 1.0f;
        }
        return r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f));
    }

    private static final QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final hasProvider hasprovider, final List<AppLovinVastMediaViewd> list, final List<PostbackServiceImpl> list2) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(list, hasprovider, list2, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = IAuthTabCallback + 19;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 39 / 0;
                }
                return quirksExternalSyntheticBackport0OnNavigationEvent2;
            }
        }, 1, (Object) null);
        int i2 = onExtraCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    static final class asInterface implements PointerInputEventHandler {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ List<AppLovinVastMediaViewd> onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd> onWarmupCompleted;

        asInterface(List<AppLovinVastMediaViewd> list, getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd> getsupportedhighspeedresolutionsfor) {
            this.onExtraCallbackWithResult = list;
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, new AnonymousClass1(this.onExtraCallbackWithResult, this.onWarmupCompleted, null), access13800Var);
            if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
                int i2 = onNavigationEvent + 29;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 63 / 0;
                }
                return objOnWarmupCompleted;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* renamed from: o.AppLovinVastMediaVieweExternalSyntheticLambda0$asInterface$1, reason: invalid class name */
        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ List<AppLovinVastMediaViewd> $clickableData;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd> $pressedClickable$delegate;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<AppLovinVastMediaViewd> list, getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd> getsupportedhighspeedresolutionsfor, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$clickableData = list;
                this.$pressedClickable$delegate = getsupportedhighspeedresolutionsfor;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$clickableData, this.$pressedClickable$delegate, access13800Var);
                anonymousClass1.L$0 = obj;
                int i2 = IAuthTabCallback + 99;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((AudioExecutor1) obj, (access13800) obj2);
                if (i3 == 0) {
                    int i4 = 13 / 0;
                }
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(audioExecutor1, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 31;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[PHI: r0 r1
              0x0071: PHI (r0v20 o.AudioExecutor1) = (r0v5 o.AudioExecutor1), (r0v24 o.AudioExecutor1) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
              0x0071: PHI (r1v8 java.lang.Object) = (r1v1 java.lang.Object), (r1v11 java.lang.Object) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[PHI: r9 r15
              0x0119: PHI (r9v18 java.lang.Object) = (r9v16 java.lang.Object), (r9v19 java.lang.Object) binds: [B:44:0x0117, B:41:0x0109] A[DONT_GENERATE, DONT_INLINE]
              0x0119: PHI (r15v6 o.HandlerScheduledExecutorService2) = (r15v5 o.HandlerScheduledExecutorService2), (r15v8 o.HandlerScheduledExecutorService2) binds: [B:44:0x0117, B:41:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x009b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r0 r1 r2
              0x002f: PHI (r0v6 o.AudioExecutor1) = (r0v5 o.AudioExecutor1), (r0v24 o.AudioExecutor1) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
              0x002f: PHI (r1v2 java.lang.Object) = (r1v1 java.lang.Object), (r1v11 java.lang.Object) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
              0x002f: PHI (r2v1 int) = (r2v0 int), (r2v11 int) binds: [B:8:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0196 -> B:32:0x00bd). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 448
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.AppLovinVastMediaVieweExternalSyntheticLambda0.asInterface.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(List list, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        AppLovinVastMediaViewd appLovinVastMediaViewdOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd>) getsupportedhighspeedresolutionsfor);
        if (appLovinVastMediaViewdOnNavigationEvent != null) {
            int i2 = onExtraCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 37 / 0;
                if (!(!appLovinVastMediaViewdOnNavigationEvent.onExtraCallback())) {
                    Iterator<T> it = appLovinVastMediaViewdOnNavigationEvent.onExtraCallbackWithResult().iterator();
                    while (it.hasNext()) {
                        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, (removeTimestamp) it.next(), j, 0.0f, ExifDataBuilder2.onExtraCallback, (seek) null, 0, 52, (Object) null);
                    }
                }
            } else if (appLovinVastMediaViewdOnNavigationEvent.onExtraCallback()) {
            }
        }
        if (!list.isEmpty()) {
            int i4 = onExtraCallback + 97;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                list.iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int i5 = onExtraCallback + 39;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                PostbackServiceImpl postbackServiceImpl = (PostbackServiceImpl) it2.next();
                setOrientationDegrees.onExtraCallback(setorientationdegrees, postbackServiceImpl.IAuthTabCallback(), postbackServiceImpl.onWarmupCompleted(), postbackServiceImpl.onExtraCallback(), postbackServiceImpl.onNavigationEvent(), 0, (fromKilometersPerHour) null, 0.0f, (seek) null, 0, 496, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(List list, hasProvider hasprovider, final List list2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        final long jLongValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2103939123);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2103939123, i, -1, "im.toss.tds.compose.component.atom.text.applyStyleData.<anonymous> (TdsText.kt:649)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            int i3 = onWarmupCompleted + 125;
            onExtraCallback = i3 % 128;
            objOnMinimized = i3 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        List list3 = list;
        if (list3.isEmpty()) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1994174451);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            quirksExternalSyntheticBackport0OnExtraCallbackWithResult = quirksExternalSyntheticBackport0;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1992849139);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new asInterface(list, getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, hasprovider, (PointerInputEventHandler) objOnMinimized2);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1994258399);
            jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onRelationshipValidationResult();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1994311967);
            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (list3.isEmpty()) {
            int i6 = onExtraCallback + 5;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 0;
                if (list2.isEmpty()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1995077295);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1994448584);
                    boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list2);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(!(zOnWarmupCompleted | zOnNavigationEvent2))) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda5
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj) {
                                int i8 = 2 % 2;
                                int i9 = onExtraCallbackWithResult + 107;
                                onWarmupCompleted = i9 % 128;
                                int i10 = i9 % 2;
                                List list4 = list2;
                                if (i10 == 0) {
                                    return AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(list4, getsupportedhighspeedresolutionsfor, jLongValue, (setOrientationDegrees) obj);
                                }
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(list4, getsupportedhighspeedresolutionsfor, jLongValue, (setOrientationDegrees) obj);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized3);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        int i8 = onWarmupCompleted + 73;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            onwarmupcompleted.onExtraCallback();
                            throw null;
                        }
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        }
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized3);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            } else if (list2.isEmpty()) {
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallback + 69;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    private static final boolean onExtraCallback(AppLovinVastMediaViewd appLovinVastMediaViewd, long j) {
        int i = 2 % 2;
        List<removeTimestamp> listOnExtraCallbackWithResult = appLovinVastMediaViewd.onExtraCallbackWithResult();
        if ((listOnExtraCallbackWithResult instanceof Collection) && listOnExtraCallbackWithResult.isEmpty()) {
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        Iterator<T> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            if (((removeTimestamp) it.next()).onWarmupCompleted().onNavigationEvent(j)) {
                int i3 = onExtraCallback + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[0];
        String str = (String) objArr[1];
        int i = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[6];
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(y1ExternalSyntheticLambda8.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0) + y1ExternalSyntheticLambda8.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0));
        IntRange intRange = new IntRange(iIntValue, iIntValue2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            int i3 = onExtraCallback + 9;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                linkedHashMap.get(Integer.valueOf(surfaceProcessorNodeOut.IAuthTabCallbackStub(((Number) it.next()).intValue())));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            Integer numValueOf = Integer.valueOf(surfaceProcessorNodeOut.IAuthTabCallbackStub(((Number) next).intValue()));
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList<List> arrayList3 = new ArrayList();
        for (Object obj2 : collectionValues) {
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!((List) obj2).isEmpty()) {
                arrayList3.add(obj2);
            }
        }
        for (List list : arrayList3) {
            Integer num = (Integer) CollectionsKt.minOrNull(list);
            if (num != null) {
                int iIntValue3 = num.intValue();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i6 = onExtraCallback + 119;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % i;
                    Character orNull = StringsKt.getOrNull(str, ((Number) obj3).intValue());
                    if (orNull != null) {
                        int i8 = onWarmupCompleted + 123;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % i;
                        if (orNull.charValue() != '\n') {
                        }
                    }
                    arrayList4.add(obj3);
                }
                Integer num2 = (Integer) CollectionsKt.maxOrNull(arrayList4);
                if (num2 != null) {
                    int iIntValue4 = num2.intValue();
                    int iIAuthTabCallbackStub = surfaceProcessorNodeOut.IAuthTabCallbackStub(iIntValue3);
                    if (!surfaceProcessorNodeOut.getInterfaceDescriptor(iIAuthTabCallbackStub)) {
                        Rect rect = new Rect(surfaceProcessorNodeOut.onWarmupCompleted(iIntValue3).IAuthTabCallbackStubProxy(), surfaceProcessorNodeOut.IAuthTabCallbackDefault(iIAuthTabCallbackStub), surfaceProcessorNodeOut.onWarmupCompleted(iIntValue4).IAuthTabCallback_Parcel(), surfaceProcessorNodeOut.onExtraCallbackWithResult(iIAuthTabCallbackStub));
                        removeTimestamp removetimestampOnWarmupCompleted = getMappingAreaSize.onWarmupCompleted();
                        deprecated_noStore deprecated_nostore = deprecated_noStore.onExtraCallback;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (rect.access100() >> 32));
                        float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallback(deviceQuirksExternalSyntheticLambda0));
                        removeTimestamp removetimestampOnWarmupCompleted2 = getMappingAreaSize.onWarmupCompleted(deprecated_noStore.onExtraCallbackWithResult(deprecated_nostore, r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(y1ExternalSyntheticLambda8.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) + fIntBitsToFloat + fOnExtraCallback, Float.intBitsToFloat((int) rect.access100()) + r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fIAuthTabCallback), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fFloatValue), 0, false, 24, (Object) null));
                        float fIAuthTabCallbackStubProxy = rect.IAuthTabCallbackStubProxy();
                        float fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallback(deviceQuirksExternalSyntheticLambda0));
                        float fExtraCallback = rect.extraCallback();
                        float fOnExtraCallback3 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0));
                        removetimestampOnWarmupCompleted.onWarmupCompleted(removetimestampOnWarmupCompleted2, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIAuthTabCallbackStubProxy - fOnExtraCallback2) << 32) | (Float.floatToRawIntBits(fExtraCallback - fOnExtraCallback3) & 4294967295L)));
                        arrayList.add(removetimestampOnWarmupCompleted);
                    }
                }
                i = 2;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z;
        hasProvider hasprovider = (hasProvider) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = (SurfaceProcessorWithExecutorExternalSyntheticLambda1) objArr[2];
        Map mapOnNavigationEvent = (Map) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if ((iIntValue2 & 4) != 0) {
            surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
        }
        if ((iIntValue2 & 8) != 0) {
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            mapOnNavigationEvent = access8100.onNavigationEvent();
            int i6 = onWarmupCompleted + 47;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1083131477, iIntValue, -1, "im.toss.tds.compose.component.atom.text.rememberInlineContents (TdsText.kt:761)");
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        boolean z2 = ((6 ^ (iIntValue & 14)) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(hasprovider)) || (iIntValue & 6) == 4;
        if (((iIntValue & 112) ^ 48) > 32) {
            int i8 = onWarmupCompleted + 57;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(gethumanreadablename);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(gethumanreadablename)) {
                z = (iIntValue & 48) == 32;
            }
        }
        boolean z3 = (((iIntValue & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback)) || (iIntValue & 384) == 256;
        boolean z4 = (((iIntValue & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mapOnNavigationEvent)) || (iIntValue & 3072) == 2048;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z4 | z2 | z | z3 | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = onExtraCallbackWithResult(hasprovider, gethumanreadablename, surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, (Map<String, select>) mapOnNavigationEvent, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        Map map = (Map) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 89;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i11 = onWarmupCompleted + 45;
        onExtraCallback = i11 % 128;
        int i12 = i11 % 2;
        return map;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Map<String, select> onExtraCallbackWithResult(hasProvider hasprovider, getHumanReadableName gethumanreadablename, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, Map<String, select> map, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) throws NoWhenBranchMatchedException {
        LinkedHashMap linkedHashMap;
        float f;
        int i = 2;
        int i2 = 2 % 2;
        float fIAuthTabCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(gethumanreadablename.IAuthTabCallbackStub()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        Iterator it = hasprovider.IAuthTabCallback("androidx.compose.foundation.text.inlineContent", 0, hasprovider.length()).iterator();
        while (it.hasNext()) {
            int i3 = onExtraCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % i;
            final getAdditionalConsentStatus getadditionalconsentstatusOnWarmupCompleted = AppLovinPrivacySettings.onWarmupCompleted((hasProvider.onExtraCallbackWithResult<String>) it.next());
            if (getadditionalconsentstatusOnWarmupCompleted != null) {
                int i5 = onWarmupCompleted + 43;
                onExtraCallback = i5 % 128;
                int i6 = i5 % i;
                if (getadditionalconsentstatusOnWarmupCompleted instanceof AppLovinEventService) {
                    long jOnWarmupCompleted = ((AppLovinEventService) getadditionalconsentstatusOnWarmupCompleted).onWarmupCompleted();
                    if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnWarmupCompleted) == 0) {
                        jOnWarmupCompleted = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(getBacktraceNoteBytes.IAuthTabCallback((fIAuthTabCallback - 11.0f) * 1.16d) + 12)));
                    }
                    long j = jOnWarmupCompleted;
                    linkedHashMap2.put(getadditionalconsentstatusOnWarmupCompleted.IAuthTabCallbackDefault(), new select(new SurfaceOutputImplExternalSyntheticLambda1(j, j, SurfaceOutputImplExternalSyntheticLambda0.Companion.IAuthTabCallback(), (DefaultConstructorMarker) null), ForwardingCameraControl.onExtraCallbackWithResult(102021841, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda17
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 83;
                            IAuthTabCallback = i8 % 128;
                            Object obj4 = null;
                            if (i8 % 2 == 0) {
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(getadditionalconsentstatusOnWarmupCompleted, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                obj4.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallbackWithResult = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallbackWithResult(getadditionalconsentstatusOnWarmupCompleted, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i9 = onWarmupCompleted + 55;
                            IAuthTabCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    })));
                } else {
                    if (getadditionalconsentstatusOnWarmupCompleted instanceof AppLovinErrorCodes) {
                        final setVideoView setvideoview = new setVideoView(r8lambdanm9dm2eewl4vrptnjmesfjqky4, AppLovinNativeAdImplExternalSyntheticLambda3.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, fIAuthTabCallback), null, 4, null);
                        AppLovinErrorCodes appLovinErrorCodes = (AppLovinErrorCodes) getadditionalconsentstatusOnWarmupCompleted;
                        GraphicDeviceInfo graphicDeviceInfoOnExtraCallback = appLovinErrorCodes.onExtraCallback();
                        if (graphicDeviceInfoOnExtraCallback == null) {
                            graphicDeviceInfoOnExtraCallback = isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub();
                        }
                        getHumanReadableName gethumanreadablenameIAuthTabCallback = AppLovinNativeAdImplExternalSyntheticLambda4.IAuthTabCallback.IAuthTabCallback(setvideoview.onNavigationEvent(), setByteOrder.Companion.IAuthTabCallbackDefault(), graphicDeviceInfoOnExtraCallback);
                        f = fIAuthTabCallback;
                        SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult = SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1, appLovinErrorCodes.onExtraCallbackWithResult(), getHumanReadableName.onNavigationEvent(gethumanreadablename, gethumanreadablenameIAuthTabCallback.asInterface(), gethumanreadablenameIAuthTabCallback.IAuthTabCallbackStub(), gethumanreadablenameIAuthTabCallback.getInterfaceDescriptor(), (use) null, (delete) null, gethumanreadablenameIAuthTabCallback.IAuthTabCallbackDefault(), (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777176, (Object) null), 0, false, 0, 0L, (ExtensionsManagerExtensionsAvailability) null, r8lambdanm9dm2eewl4vrptnjmesfjqky4, (getSurfaceSize.IAuthTabCallback) null, false, 892, (Object) null);
                        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = ExtensionsManagerExtensionsAvailability.Ltr;
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = setvideoview.onWarmupCompleted();
                        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, extensionsManagerExtensionsAvailability) + CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, extensionsManagerExtensionsAvailability));
                        float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(deviceQuirksExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback() + deviceQuirksExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback());
                        float fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) (surfaceProcessorNodeOutOnExtraCallbackWithResult.asBinder() >> 32));
                        float fC_2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) surfaceProcessorNodeOutOnExtraCallbackWithResult.asBinder());
                        linkedHashMap = linkedHashMap2;
                        linkedHashMap.put(getadditionalconsentstatusOnWarmupCompleted.IAuthTabCallbackDefault(), new select(new SurfaceOutputImplExternalSyntheticLambda1(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fC_ + fIAuthTabCallback2)), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fC_2 + fIAuthTabCallback3)), SurfaceOutputImplExternalSyntheticLambda0.Companion.onExtraCallback(), (DefaultConstructorMarker) null), ForwardingCameraControl.onExtraCallbackWithResult(-1670813176, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda18
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallback + 51;
                                onExtraCallbackWithResult = i8 % 128;
                                if (i8 % 2 != 0) {
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(getadditionalconsentstatusOnWarmupCompleted, setvideoview, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    throw null;
                                }
                                Unit unitOnExtraCallback = AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(getadditionalconsentstatusOnWarmupCompleted, setvideoview, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i9 = onExtraCallbackWithResult + 85;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return unitOnExtraCallback;
                            }
                        })));
                    } else {
                        linkedHashMap = linkedHashMap2;
                        f = fIAuthTabCallback;
                        if (!(getadditionalconsentstatusOnWarmupCompleted instanceof AppLovinEventTypes)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        linkedHashMap.put(getadditionalconsentstatusOnWarmupCompleted.IAuthTabCallbackDefault(), new select(((AppLovinEventTypes) getadditionalconsentstatusOnWarmupCompleted).onWarmupCompleted(), ForwardingCameraControl.onExtraCallbackWithResult(2056181897, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda19
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i7 = 2 % 2;
                                int i8 = onNavigationEvent + 115;
                                onExtraCallback = i8 % 128;
                                if (i8 % 2 != 0) {
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(getadditionalconsentstatusOnWarmupCompleted, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    throw null;
                                }
                                Unit unitOnNavigationEvent = AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(getadditionalconsentstatusOnWarmupCompleted, (String) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i9 = onNavigationEvent + 3;
                                onExtraCallback = i9 % 128;
                                if (i9 % 2 == 0) {
                                    return unitOnNavigationEvent;
                                }
                                throw null;
                            }
                        })));
                    }
                    linkedHashMap2 = linkedHashMap;
                    fIAuthTabCallback = f;
                    i = 2;
                }
            }
        }
        return linkedHashMap2;
    }

    private static final Unit onWarmupCompleted(getAdditionalConsentStatus getadditionalconsentstatus, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 17) == 16), i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(102021841, i, -1, "im.toss.tds.compose.component.atom.text.createInlineContents.<anonymous>.<anonymous> (TdsText.kt:796)");
            }
            AppLovinEventService appLovinEventService = (AppLovinEventService) getadditionalconsentstatus;
            if (appLovinEventService.onTransact() != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1504098557);
                String strOnTransact = appLovinEventService.onTransact();
                Intrinsics.checkNotNull(strOnTransact);
                AppLovinNativeAdImplc.onExtraCallbackWithResult(strOnTransact, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), appLovinEventService.asBinder(), (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 504);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (appLovinEventService.onNavigationEvent() != null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1503840327);
                    Drawable drawableOnNavigationEvent = appLovinEventService.onNavigationEvent();
                    Intrinsics.checkNotNull(drawableOnNavigationEvent);
                    AppLovinNativeAdImplc.onExtraCallbackWithResult(drawableOnNavigationEvent, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), appLovinEventService.asBinder(), (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 504);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    i2 = onWarmupCompleted + 31;
                } else if (appLovinEventService.onExtraCallbackWithResult() != null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1503574595);
                    Bitmap bitmapOnExtraCallbackWithResult = appLovinEventService.onExtraCallbackWithResult();
                    Intrinsics.checkNotNull(bitmapOnExtraCallbackWithResult);
                    AppLovinNativeAdImplc.onNavigationEvent(bitmapOnExtraCallbackWithResult, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), appLovinEventService.asBinder(), null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 504);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else if (appLovinEventService.onExtraCallback() != null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1503315807);
                    Integer numOnExtraCallback = appLovinEventService.onExtraCallback();
                    Intrinsics.checkNotNull(numOnExtraCallback);
                    AppLovinNativeAdImplc.onExtraCallback(numOnExtraCallback.intValue(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), appLovinEventService.asBinder(), null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 504);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    i2 = onWarmupCompleted + 33;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1503094095);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                onExtraCallback = i2 % 128;
                int i4 = i2 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallback + 71;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(getAdditionalConsentStatus getadditionalconsentstatus, setVideoView setvideoview, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        AppLovinErrorCodes appLovinErrorCodes;
        Object objOnMinimized;
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult;
        int i2;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted;
        GraphicDeviceInfo graphicDeviceInfoOnExtraCallback;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i6 = onWarmupCompleted + 83;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onWarmupCompleted + 123;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 25 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1670813176, i, -1, "im.toss.tds.compose.component.atom.text.createInlineContents.<anonymous>.<anonymous> (TdsText.kt:854)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i10 = onExtraCallback + 39;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                appLovinErrorCodes = (AppLovinErrorCodes) getadditionalconsentstatus;
                hasProvider hasprovider = new hasProvider(appLovinErrorCodes.onExtraCallbackWithResult(), (List) null, 2, (DefaultConstructorMarker) null);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult2.onExtraCallback());
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda8
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i12 = 2 % 2;
                            int i13 = onNavigationEvent + 81;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitOnNavigationEvent = AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
                            int i15 = onNavigationEvent + 87;
                            onExtraCallbackWithResult = i15 % 128;
                            if (i15 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted2, (Function1) objOnMinimized);
                AppLovinNativeAdImplExternalSyntheticLambda4 appLovinNativeAdImplExternalSyntheticLambda4 = AppLovinNativeAdImplExternalSyntheticLambda4.IAuthTabCallback;
                switch (onTransact.onNavigationEvent[appLovinErrorCodes.onNavigationEvent().ordinal()]) {
                    case 1:
                        onextracallbackwithresult = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue;
                        int i12 = onWarmupCompleted + 63;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        break;
                    case 2:
                        onextracallbackwithresult = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Elephant;
                        break;
                    case 3:
                        onextracallbackwithresult = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Yellow;
                        break;
                    case 4:
                        onextracallbackwithresult = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Red;
                        break;
                    case 5:
                        onextracallbackwithresult = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Green;
                        break;
                    case 6:
                        onextracallbackwithresult = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Teal;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                i2 = onTransact.onExtraCallback[appLovinErrorCodes.onWarmupCompleted().ordinal()];
                if (i2 != 1) {
                    onwarmupcompleted = AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Fill;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onwarmupcompleted = AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Weak;
                }
                AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted = appLovinNativeAdImplExternalSyntheticLambda4.onWarmupCompleted(onextracallbackwithresult, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 384);
                graphicDeviceInfoOnExtraCallback = appLovinErrorCodes.onExtraCallback();
                if (graphicDeviceInfoOnExtraCallback == null) {
                    graphicDeviceInfoOnExtraCallback = isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub();
                }
                AppLovinNativeAdImplExternalSyntheticLambda10.IAuthTabCallback(hasprovider, quirksExternalSyntheticBackport0OnWarmupCompleted3, setvideoview, appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted, graphicDeviceInfoOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult22 = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult22.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult32 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult32.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult32.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult32.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult32.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult32.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult32.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                appLovinErrorCodes = (AppLovinErrorCodes) getadditionalconsentstatus;
                hasProvider hasprovider2 = new hasProvider(appLovinErrorCodes.onExtraCallbackWithResult(), (List) null, 2, (DefaultConstructorMarker) null);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = highSpeedResolverExternalSyntheticLambda12.onWarmupCompleted(onextracallback2, onextracallbackwithresult22.onExtraCallback());
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted22, (Function1) objOnMinimized);
                AppLovinNativeAdImplExternalSyntheticLambda4 appLovinNativeAdImplExternalSyntheticLambda42 = AppLovinNativeAdImplExternalSyntheticLambda4.IAuthTabCallback;
                switch (onTransact.onNavigationEvent[appLovinErrorCodes.onNavigationEvent().ordinal()]) {
                }
                i2 = onTransact.onExtraCallback[appLovinErrorCodes.onWarmupCompleted().ordinal()];
                if (i2 != 1) {
                }
                AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted2 = appLovinNativeAdImplExternalSyntheticLambda42.onWarmupCompleted(onextracallbackwithresult, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 384);
                graphicDeviceInfoOnExtraCallback = appLovinErrorCodes.onExtraCallback();
                if (graphicDeviceInfoOnExtraCallback == null) {
                }
                AppLovinNativeAdImplExternalSyntheticLambda10.IAuthTabCallback(hasprovider2, quirksExternalSyntheticBackport0OnWarmupCompleted32, setvideoview, appLovinNativeAdImplExternalSyntheticLambda11OnWarmupCompleted2, graphicDeviceInfoOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getAdditionalConsentStatus getadditionalconsentstatus, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            z = (i & 22) != 110;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 93;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2056181897, i, -1, "im.toss.tds.compose.component.atom.text.createInlineContents.<anonymous>.<anonymous> (TdsText.kt:882)");
                    int i5 = 99 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2056181897, i, -1, "im.toss.tds.compose.component.atom.text.createInlineContents.<anonymous>.<anonymous> (TdsText.kt:882)");
                }
            }
            ((AppLovinEventTypes) getadditionalconsentstatus).onNavigationEvent().invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 91;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final int i, final int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda21
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i2;
                int i8 = i;
                int iIntValue = ((Integer) obj3).intValue();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -523550118, 523550126, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                int i9 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    return quirksExternalSyntheticBackport02;
                }
                throw null;
            }
        }, 1, (Object) null);
        int i4 = onWarmupCompleted + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(int i, int i2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1326910405);
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1326910405);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1326910405, i3, -1, "im.toss.tds.compose.component.atom.text.textOverflow.<anonymous> (TdsText.kt:893)");
        }
        if (!(!AppLovinVastMediaViewf.onExtraCallbackWithResult(i, AppLovinVastMediaViewf.Companion.onExtraCallback()))) {
            int i6 = onWarmupCompleted + 49;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i2 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-891045696);
                setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                quirksExternalSyntheticBackport0 = setContentInsetsAbsolute.onExtraCallbackWithResult(onWarmupCompleted(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), setcontentinsetsrelativeIAuthTabCallback), setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 12, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-890888247);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i8 = onWarmupCompleted + 65;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0;
    }

    static {
        int i = IAuthTabCallback + 107;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final accessisMonitoringp<Boolean> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        throw null;
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1778668339);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onWarmupCompleted + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1778668339, i, -1, "im.toss.tds.compose.component.atom.text.TdsTextPreview (TdsText.kt:912)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.onWarmupCompleted(-1821412738, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.IAuthTabCallback}, 1821412738, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.text.TdsTextKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 51;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Unit unit = (Unit) AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{Integer.valueOf(i8), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1207451104, 1207451108, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    int i9 = IAuthTabCallback + 87;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            });
        }
        int i5 = onExtraCallback + 33;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1516795226);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = onWarmupCompleted + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallback + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1516795226, i, -1, "im.toss.tds.compose.component.atom.text.LineHeightPreview (TdsText.kt:930)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.IAuthTabCallback.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 123;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTextKt$.ExternalSyntheticLambda16(i));
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1862225340);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1862225340);
        if (i != 0) {
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 125;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1862225340, i, -1, "im.toss.tds.compose.component.atom.text.LineHeightPreviewWithCanvas (TdsText.kt:948)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) r8lambdaXEiCe5vVF7dnGNG4vKjN4hz90S4.IAuthTabCallback.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsTextKt$.ExternalSyntheticLambda6(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[PHI: r7
      0x004f: PHI (r7v11 int) = (r7v4 int), (r7v5 int), (r7v18 int) binds: [B:8:0x003e, B:10:0x004b, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r7
      0x0040: PHI (r7v5 int) = (r7v4 int), (r7v18 int) binds: [B:8:0x003e, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access100(Object[] objArr) {
        int iIAuthTabCallback;
        int i;
        long jLongValue = ((Number) objArr[0]).longValue();
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[1];
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            iIAuthTabCallback = (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(jLongValue));
            int i4 = 25 / 0;
            if (Integer.MIN_VALUE <= iIAuthTabCallback) {
                int i5 = onExtraCallback + 15;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (iIAuthTabCallback < 20) {
                    i = 5;
                } else if (22 > iIAuthTabCallback || iIAuthTabCallback >= 28) {
                    i = 7;
                } else {
                    int i7 = onWarmupCompleted + 91;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i = 6;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            iIAuthTabCallback = (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(jLongValue));
            if (Integer.MIN_VALUE <= iIAuthTabCallback) {
            }
        }
        return Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i));
    }

    private static final decrementVideoUsage onWarmupCompleted(hasProvider hasprovider, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(hasprovider);
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    private static final List<PostbackServiceImpl> onWarmupCompleted(getSupportedHighSpeedResolutionsFor<List<PostbackServiceImpl>> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<PostbackServiceImpl> list = (List) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<List<PostbackServiceImpl>> getsupportedhighspeedresolutionsfor, List<PostbackServiceImpl> list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(list);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        int i5 = onExtraCallback + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final AppLovinVastMediaViewd onNavigationEvent(getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppLovinVastMediaViewd appLovinVastMediaViewd = (AppLovinVastMediaViewd) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return appLovinVastMediaViewd;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<AppLovinVastMediaViewd> getsupportedhighspeedresolutionsfor, AppLovinVastMediaViewd appLovinVastMediaViewd) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(appLovinVastMediaViewd);
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(int i, int i2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (QuirksExternalSyntheticBackport0) onExtraCallback(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -523550118, 523550126, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1207451104, 1207451108, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        return (Unit) onExtraCallback(new Object[]{surfaceProcessorNodeOut}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 319165407, -319165397, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final boolean IAuthTabCallback() {
        return ((Boolean) onExtraCallback(new Object[0], MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 957369536, -957369531, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).booleanValue();
    }

    public static final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, int i, boolean z, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), interfaceC0083handshake, num, createcameracapturecallback, Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), Integer.valueOf(i), Boolean.valueOf(z), graphicDeviceInfo, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit onExtraCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        return (Unit) onExtraCallback(new Object[]{surfaceProcessorNodeOut}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 368106104, -368106097, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        return (Unit) onExtraCallback(new Object[]{surfaceProcessorNodeOut}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1842085120, 1842085126, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit onExtraCallback(int i, int i2, getHumanReadableName gethumanreadablename, hasProvider hasprovider, Context context, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, List list2, float f2, long j, Function1 function1, boolean z, Map map, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), gethumanreadablename, hasprovider, context, quirksExternalSyntheticBackport0, list, Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, list2, Float.valueOf(f2), Long.valueOf(j), function1, Boolean.valueOf(z), map, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -176309720, 176309720, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(hasProvider hasprovider, getHumanReadableName gethumanreadablename, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchPostbackAsync dispatchpostbackasync, Map map, boolean z, Function1 function1, Integer num, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onExtraCallback(new Object[]{hasprovider, gethumanreadablename, quirksExternalSyntheticBackport0, r8lambdanm9dm2eewl4vrptnjmesfjqky4, dispatchpostbackasync, map, Boolean.valueOf(z), function1, num, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1123619893, 1123619896, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(int i, int i2, getHumanReadableName gethumanreadablename, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function1 function1, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), gethumanreadablename, quirksExternalSyntheticBackport0, str, function1, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1375379057, 1375379059, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    public static final float onExtraCallback(long j, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        return ((Float) onExtraCallback(new Object[]{Long.valueOf(j), r8lambdanm9dm2eewl4vrptnjmesfjqky4}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -559871569, 559871582, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).floatValue();
    }

    private static final List<removeTimestamp> IAuthTabCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut, String str, int i, int i2, float f, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        return (List) onExtraCallback(new Object[]{surfaceProcessorNodeOut, str, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), deviceQuirksExternalSyntheticLambda0, r8lambdanm9dm2eewl4vrptnjmesfjqky4}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1086038069, 1086038078, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(readFully readfully, readFully readfully2, setIso setiso) {
        return (Unit) onExtraCallback(new Object[]{readfully, readfully2, setiso}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1557271722, -1557271711, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }

    private static final Map<String, select> onExtraCallbackWithResult(hasProvider hasprovider, getHumanReadableName gethumanreadablename, SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1, Map<String, select> map, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        return (Map) onExtraCallback(new Object[]{hasprovider, gethumanreadablename, surfaceProcessorWithExecutorExternalSyntheticLambda1, map, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1365419148, -1365419136, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
    }
}
