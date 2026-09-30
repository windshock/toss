package o;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.omid.NativeAdsOmSdkComposeKt$;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.Futures3;
import o.QuirksExternalSyntheticBackport0;
import o.canScroll;
import o.computeScroll;
import o.decrementVideoUsage;
import o.isInVideoUsage;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class canScroll {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit onExtraCallback(getPageMargin getpagemargin, computeScroll.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, executeKeyEvent executekeyevent, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getpagemargin, onextracallbackwithresult, quirksExternalSyntheticBackport0, executekeyevent, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(computeScroll computescroll, View view, isInVideoUsage isinvideousage) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onWarmupCompleted(130930448, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{computescroll, view, isinvideousage}, iOnNavigationEvent2, iOnNavigationEvent3, -130930447, iOnNavigationEvent);
        int i5 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return decrementvideousage;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(infoForPosition infoforposition, isInVideoUsage isinvideousage) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onWarmupCompleted(974503080, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{infoforposition, isinvideousage}, iOnNavigationEvent2, iOnNavigationEvent3, -974503078, iOnNavigationEvent);
        int i5 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return decrementvideousage;
        }
        throw null;
    }

    public static final /* synthetic */ float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        float fIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutions);
        int i5 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return fIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        executeKeyEvent executekeyevent = (executeKeyEvent) objArr[0];
        getPageMargin getpagemargin = (getPageMargin) objArr[1];
        computeScroll.onExtraCallbackWithResult onextracallbackwithresult = (computeScroll.onExtraCallbackWithResult) objArr[2];
        initViewPager initviewpager = (initViewPager) objArr[3];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onExtraCallbackWithResult(executekeyevent, getpagemargin, onextracallbackwithresult, initviewpager, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i5 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onNavigationEvent(computeScroll computescroll, initViewPager initviewpager, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(computescroll, initviewpager, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = (~i7) | i9;
        int i11 = i8 | (~i10);
        int i12 = i7 | i9;
        int i13 = ~(i10 | i6);
        int i14 = i2 + i6 + i4 + (1075552530 * i5) + ((-1519595880) * i3);
        int i15 = i14 * i14;
        int i16 = (((-1050772794) * i2) - 1639710720) + ((-2116975300) * i6) + (i11 * (-533101253)) + (533101253 * i12) + ((-533101253) * i13) + ((-1583874048) * i4) + ((-189792256) * i5) + (1111490560 * i3) + (1415839744 * i15);
        int i17 = (i2 * 251836610) + 257048825 + (i6 * 251838484) + (i11 * 937) + (i12 * (-937)) + (i13 * 937) + (i4 * 251837547) + (i5 * 1710852742) + (i3 * (-1855850104)) + (i15 * (-1244921856));
        int i18 = i16 + (i17 * i17 * (-1300496384));
        if (i18 == 1) {
            computeScroll computescroll = (computeScroll) objArr[0];
            View view = (View) objArr[1];
            int i19 = 2 % 2;
            Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[2], "");
            computescroll.onNavigationEvent(view);
            computescroll.onNavigationEvent();
            onExtraCallback onextracallback = new onExtraCallback(computescroll);
            int i20 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            return onextracallback;
        }
        if (i18 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i18 != 3) {
            return onNavigationEvent(objArr);
        }
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        View view2 = (View) objArr[1];
        Futures3 futures3 = (Futures3) objArr[2];
        int i22 = 2 % 2;
        int i23 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i23 % 128;
        int i24 = i23 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutions, view2, futures3);
        int i25 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i25 % 128;
        int i26 = i25 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(getPageMargin getpagemargin, computeScroll.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, executeKeyEvent executekeyevent, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(getpagemargin, onextracallbackwithresult, quirksExternalSyntheticBackport0, executekeyevent, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 6 / 0;
        }
        return unit;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(computeScroll computescroll, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(computescroll, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 29 / 0;
        }
        int i7 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final computeScroll onNavigationEvent(@NotNull getPageMargin getpagemargin, @NotNull computeScroll.onExtraCallbackWithResult onextracallbackwithresult, @Nullable executeKeyEvent executekeyevent, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(getpagemargin, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if ((i3 & 4) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new distanceInfluenceForSnapDuration();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            executekeyevent = (distanceInfluenceForSnapDuration) objOnMinimized;
        }
        Object obj = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(707784910, i2, -1, "im.toss.ads_sdk.omid.rememberNativeAdsOmSdkController (NativeAdsOmSdkCompose.kt:23)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(707784910, i2, -1, "im.toss.ads_sdk.omid.rememberNativeAdsOmSdkController (NativeAdsOmSdkCompose.kt:23)");
        }
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getpagemargin)) || (i2 & 6) == 4;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
        if ((((i2 & 896) ^ 384) <= 256 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(executekeyevent)) && (i2 & 384) != 256) {
            z = false;
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z2 | zOnNavigationEvent | z)) {
            int i6 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = onextracallbackwithresult.onExtraCallback(getpagemargin, executekeyevent);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        computeScroll computescroll = (computeScroll) objOnMinimized2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return computescroll;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(executeKeyEvent executekeyevent, getPageMargin getpagemargin, computeScroll.onExtraCallbackWithResult onextracallbackwithresult, initViewPager initviewpager, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(189451779);
            int i5 = 43 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(189451779, i2, -1, "im.toss.ads_sdk.omid.nativeAdsOmSdk.<anonymous> (NativeAdsOmSdkCompose.kt:38)");
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(189451779);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        if (executekeyevent == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(370959160);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new distanceInfluenceForSnapDuration();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            executekeyevent = (distanceInfluenceForSnapDuration) objOnMinimized;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1674534069);
            int i6 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        executeKeyEvent executekeyevent2 = executekeyevent;
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        computeScroll computescrollOnNavigationEvent = onNavigationEvent(getpagemargin, onextracallbackwithresult, executekeyevent2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = onExtraCallbackWithResult(onExtraCallbackWithResult(quirksExternalSyntheticBackport0, computescrollOnNavigationEvent), computescrollOnNavigationEvent, initviewpager);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final computeScroll computescroll) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(computescroll, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.ads_sdk.omid.NativeAdsOmSdkComposeKt$$ExternalSyntheticLambda6
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 13;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = canScroll.onWarmupCompleted(computescroll, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i6 = onExtraCallback + 9;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return quirksExternalSyntheticBackport0OnWarmupCompleted;
                }
                throw null;
            }
        }, 1, (Object) null);
        int i3 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallback(final computeScroll computescroll, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2007796930);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2007796930, i2, -1, "im.toss.ads_sdk.omid.nativeAdsOmSdk.<anonymous> (NativeAdsOmSdkCompose.kt:50)");
        }
        final View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(computescroll);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | zOnExtraCallback2)) {
            int i6 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.omid.NativeAdsOmSdkComposeKt$$ExternalSyntheticLambda4
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onNavigationEvent + 77;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        decrementVideoUsage decrementvideousageOnExtraCallback = canScroll.onExtraCallback(computescroll, view, (isInVideoUsage) obj);
                        int i11 = onWarmupCompleted + 109;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        return decrementvideousageOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        isZslDisabledByByUserCaseConfig.onWarmupCompleted(computescroll, view, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0;
    }

    public static final class onExtraCallback implements decrementVideoUsage {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ computeScroll onExtraCallbackWithResult;

        public onExtraCallback(computeScroll computescroll) {
            this.onExtraCallbackWithResult = computescroll;
        }

        public void dispose() {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                this.onExtraCallbackWithResult.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.onExtraCallbackWithResult.IAuthTabCallback();
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 62 / 0;
            }
        }
    }

    public static final class onWarmupCompleted implements decrementVideoUsage {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ infoForPosition onExtraCallbackWithResult;

        public onWarmupCompleted(infoForPosition infoforposition) {
            this.onExtraCallbackWithResult = infoforposition;
        }

        public void dispose() {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallbackWithResult.onWarmupCompleted();
            if (i4 == 0) {
                throw null;
            }
        }
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, computeScroll computescroll, initViewPager initviewpager, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 2) != 0) {
            initviewpager = new initViewPager(0.0f, 0.0f, 0.0f, 0L, 0L, 31, null);
            int i6 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return onExtraCallbackWithResult(quirksExternalSyntheticBackport0, computescroll, initviewpager);
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final computeScroll computescroll, @NotNull final initViewPager initviewpager) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(computescroll, "");
        Intrinsics.checkNotNullParameter(initviewpager, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.ads_sdk.omid.NativeAdsOmSdkComposeKt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 123;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                computeScroll computescroll2 = computescroll;
                if (i5 != 0) {
                    return canScroll.onNavigationEvent(computescroll2, initviewpager, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                canScroll.onNavigationEvent(computescroll2, initviewpager, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, 1, (Object) null);
        int i3 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ initViewPager $config;
        final /* synthetic */ computeScroll $controller;
        final /* synthetic */ infoForPosition $visibilityState;
        final /* synthetic */ getSupportedHighSpeedResolutions $visibleRatio$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(infoForPosition infoforposition, computeScroll computescroll, initViewPager initviewpager, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$visibilityState = infoforposition;
            this.$controller = computescroll;
            this.$config = initviewpager;
            this.$visibleRatio$delegate = getsupportedhighspeedresolutions;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$visibilityState, this.$controller, this.$config, this.$visibleRatio$delegate, access13800Var);
            int i3 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i5 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            long jOnNavigationEvent;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.onNavigationEvent(obj);
            do {
                List<NativeAdsEventLogType> listOnExtraCallback = this.$visibilityState.onExtraCallback(canScroll.onNavigationEvent(this.$visibleRatio$delegate), SystemClock.uptimeMillis());
                computeScroll computescroll = this.$controller;
                Iterator<T> it = listOnExtraCallback.iterator();
                while (it.hasNext()) {
                    computescroll.IAuthTabCallback((NativeAdsEventLogType) it.next());
                }
                jOnNavigationEvent = this.$config.onNavigationEvent();
                this.label = 1;
            } while (formatMsgs.onWarmupCompleted(jOnNavigationEvent, this) != objOnWarmupCompleted);
            int i5 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 86 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onExtraCallback(computeScroll computescroll, initViewPager initviewpager, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1383879377);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1383879377, i2, -1, "im.toss.ads_sdk.omid.nativeAdsOmSdkVisibility.<anonymous> (NativeAdsOmSdkCompose.kt:72)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1383879377, i2, -1, "im.toss.ads_sdk.omid.nativeAdsOmSdkVisibility.<anonymous> (NativeAdsOmSdkCompose.kt:72)");
        }
        final View view = (View) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(computescroll);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initviewpager);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new infoForPosition(initviewpager);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        final infoForPosition infoforposition = (infoForPosition) objOnMinimized;
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(computescroll);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent3 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized2;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(infoforposition);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutions);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(computescroll);
        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initviewpager);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnExtraCallback | zOnNavigationEvent4 | zOnExtraCallback2 | zOnNavigationEvent5) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(infoforposition, computescroll, initviewpager, getsupportedhighspeedresolutions, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onnavigationevent);
            objOnMinimized3 = onnavigationevent;
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(computescroll, initviewpager, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 0);
        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(infoforposition);
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback3) {
            int i5 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new Function1() { // from class: im.toss.ads_sdk.omid.NativeAdsOmSdkComposeKt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 19;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        decrementVideoUsage decrementvideousageOnExtraCallback = canScroll.onExtraCallback(infoforposition, (isInVideoUsage) obj);
                        int i10 = onExtraCallbackWithResult + 65;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        return decrementvideousageOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(computescroll, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0);
        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutions);
        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(view);
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent6 | zOnExtraCallback4)) {
            int i7 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.omid.NativeAdsOmSdkComposeKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        Unit unit;
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 67;
                        IAuthTabCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            Object[] objArr = {getsupportedhighspeedresolutions, view, (Futures3) obj};
                            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                            unit = (Unit) canScroll.onWarmupCompleted(1954067829, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1954067826, iOnNavigationEvent);
                            int i11 = 46 / 0;
                        } else {
                            Object[] objArr2 = {getsupportedhighspeedresolutions, view, (Futures3) obj};
                            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                            unit = (Unit) canScroll.onWarmupCompleted(1954067829, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1954067826, iOnNavigationEvent2);
                        }
                        int i12 = onNavigationEvent + 81;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) objOnMinimized5);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        r2 = new android.graphics.Rect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r8.getGlobalVisibleRect(r2) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r8 = o.canScroll.onNavigationEvent + 93;
        o.canScroll.onExtraCallbackWithResult = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if ((r8 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        onWarmupCompleted(r7, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        onWarmupCompleted(r7, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r8 = r1.IAuthTabCallback(androidx.compose.ui.graphics.RectHelper_androidKt.onExtraCallback(r2));
        r0 = ((int) (r9.asBinder() >> 32)) * ((int) r9.asBinder());
        r9 = (r8.IAuthTabCallback_Parcel() - r8.IAuthTabCallbackStubProxy()) * (r8.IAuthTabCallbackDefault() - r8.extraCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r0 <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r9 > 0.0f) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r6 = kotlin.ranges.RangesKt.coerceIn(r9 / r0, 0.0f, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        onWarmupCompleted(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1.onMinimized() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1.onMinimized() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        onWarmupCompleted(r7, 0.0f);
        r7 = kotlin.Unit.INSTANCE;
        r8 = o.canScroll.onExtraCallbackWithResult + 67;
        o.canScroll.onNavigationEvent = r8 % 128;
        r8 = r8 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, View view, Futures3 futures3) {
        Rect rectOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i3 % 128;
        float fCoerceIn = 0.0f;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            rectOnWarmupCompleted = FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(futures3, "");
            rectOnWarmupCompleted = FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null);
        }
    }

    public static final void onWarmupCompleted(@NotNull getPageMargin getpagemargin, @NotNull computeScroll.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable executeKeyEvent executekeyevent, @NotNull getBacktraceNote<? super computeScroll, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4;
        int i5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        executeKeyEvent executekeyevent2;
        executeKeyEvent executekeyevent3;
        int i6;
        int i7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(getpagemargin, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1666094956);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getpagemargin) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i9 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult)) {
                int i11 = onExtraCallbackWithResult;
                int i12 = i11 + 57;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 71;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            i4 |= i7;
        }
        int i16 = i3 & 4;
        Object obj = null;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            int i17 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i17 % 128;
            if (i17 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 256 : 128;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            int i19 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(executekeyevent) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(executekeyevent)) {
                int i21 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                i6 = 16384;
            } else {
                int i23 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 5 / 3;
                }
                i6 = 8192;
            }
            i4 |= i6;
        }
        int i25 = i4;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i25 & 9363) != 9362, i25 & 1)) {
            if (i16 != 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            if (i18 != 0) {
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new distanceInfluenceForSnapDuration();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                executekeyevent3 = (distanceInfluenceForSnapDuration) objOnMinimized;
            } else {
                executekeyevent3 = executekeyevent;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1666094956, i25, -1, "im.toss.ads_sdk.omid.NativeAdsOmSdkBox (NativeAdsOmSdkCompose.kt:123)");
            }
            computeScroll computescrollOnNavigationEvent = onNavigationEvent(getpagemargin, onextracallbackwithresult, executekeyevent3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i25 & 126) | ((i25 >> 3) & 896), 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback(onExtraCallbackWithResult(quirksExternalSyntheticBackport04, computescrollOnNavigationEvent), computescrollOnNavigationEvent, (initViewPager) null, 2, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i26 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i26 % 128;
                if (i26 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i27 = 47 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
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
            getbacktracenote.invoke(computescrollOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i25 >> 9) & 112));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            executekeyevent2 = executekeyevent3;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            executekeyevent2 = executekeyevent;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new NativeAdsOmSdkComposeKt$.ExternalSyntheticLambda1(getpagemargin, onextracallbackwithresult, quirksExternalSyntheticBackport02, executekeyevent2, getbacktracenote, i2, i3));
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        infoForPosition infoforposition = (infoForPosition) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[1], "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(infoforposition);
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return onwarmupcompleted;
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i5 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i5 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, View view, Futures3 futures3) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onWarmupCompleted(1954067829, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutions, view, futures3}, iOnNavigationEvent2, iOnNavigationEvent3, -1954067826, iOnNavigationEvent);
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 IAuthTabCallback(executeKeyEvent executekeyevent, getPageMargin getpagemargin, computeScroll.onExtraCallbackWithResult onextracallbackwithresult, initViewPager initviewpager, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {executekeyevent, getpagemargin, onextracallbackwithresult, initviewpager, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (QuirksExternalSyntheticBackport0) onWarmupCompleted(-108993149, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 108993149, iOnNavigationEvent);
    }

    private static final decrementVideoUsage IAuthTabCallback(computeScroll computescroll, View view, isInVideoUsage isinvideousage) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (decrementVideoUsage) onWarmupCompleted(130930448, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{computescroll, view, isinvideousage}, iOnNavigationEvent2, iOnNavigationEvent3, -130930447, iOnNavigationEvent);
    }

    private static final decrementVideoUsage onWarmupCompleted(infoForPosition infoforposition, isInVideoUsage isinvideousage) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (decrementVideoUsage) onWarmupCompleted(974503080, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{infoforposition, isinvideousage}, iOnNavigationEvent2, iOnNavigationEvent3, -974503078, iOnNavigationEvent);
    }
}
