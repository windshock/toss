package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleEventObserver;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.Futures3;
import o.LottieDrawableExternalSyntheticLambda17;
import o.LottieDrawableExternalSyntheticLambda2;
import o.LottieDrawableExternalSyntheticLambda3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.flipHorizontally;
import o.isInVideoUsage;
import o.readFully;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieDrawableExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static char[] onExtraCallback = {64982, 64977, 64924, 64925, 64980, 64963, 64990, 64961, 64976, 64978, 64905, 64989, 64983, 64988, 64967, 64960, 64991, 65065, 64985, 64987, 64926, 64986, 64964, 64966, 64984};
    private static char IAuthTabCallback = 51244;

    public static final /* synthetic */ class access100 {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 1;
                int i = onWarmupCompleted + 107;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i3 = onNavigationEvent + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(float f, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, fliphorizontally);
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, fliphorizontally);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = onWarmupCompleted + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(lottieDrawableExternalSyntheticLambda3, fliphorizontally);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(lottieDrawableExternalSyntheticLambda3, fliphorizontally);
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor);
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, boolean z2, boolean z3, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent(z, z2, z3, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(z, z2, z3, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        if (i3 == 0) {
            onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), objArr, iOnExtraCallback2, 734369894, iOnExtraCallback3, -734369893);
        } else {
            onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), objArr, iOnExtraCallback2, 734369894, iOnExtraCallback3, -734369893);
            int i4 = 52 / 0;
        }
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, lottieDrawableExternalSyntheticLambda17, zBooleanValue, fFloatValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(getsupportedhighspeedresolutionsfor);
        }
        asBinder(getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[3]).booleanValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3 = (LottieDrawableExternalSyntheticLambda3) objArr[6];
        Function0 function0 = (Function0) objArr[7];
        Function2 function2 = (Function2) objArr[8];
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int iIntValue3 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        onExtraCallback(zBooleanValue, quirksExternalSyntheticBackport0, zBooleanValue2, zBooleanValue3, fFloatValue, iIntValue, lottieDrawableExternalSyntheticLambda3, function0, function2, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1), iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(gettimebase, iIntValue);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        asInterface(gettimebase, iIntValue);
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(float f, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            onNavigationEvent(f, z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(f, z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(List list, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(list, f, setorientationdegrees);
        }
        onNavigationEvent(list, f, setorientationdegrees);
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(ViewGroup viewGroup, ComposeView composeView, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup, composeView, isinvideousage);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return decrementvideousageOnExtraCallbackWithResult;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        float fFloatValue = ((Float) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{lottieDrawableExternalSyntheticLambda17}, iOnExtraCallback2, 1327390014, iOnExtraCallback3, -1327390001)).floatValue();
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unitIAuthTabCallback;
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[5];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[6];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitIAuthTabCallback = IAuthTabCallback(lottieDrawableExternalSyntheticLambda17, fFloatValue, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, fliphorizontally);
            int i3 = 80 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback(lottieDrawableExternalSyntheticLambda17, fFloatValue, getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, fliphorizontally);
        }
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, float f, float f2, float f3, float f4, float f5, float f6, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(lottieDrawableExternalSyntheticLambda3, f, f2, f3, f4, f5, f6, fliphorizontally);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(lottieDrawableExternalSyntheticLambda3, f, f2, f3, f4, f5, f6, fliphorizontally);
        int i3 = onNavigationEvent + 23;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 9;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, i, lottieDrawableExternalSyntheticLambda17, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 65;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, float f, int i, LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, Function0 function0, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 109;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{Boolean.valueOf(z), quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Boolean.valueOf(z3), Float.valueOf(f), Integer.valueOf(i), lottieDrawableExternalSyntheticLambda3, function0, function2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, PushInfo.Companion.onExtraCallback(), -731811785, PushInfo.Companion.onExtraCallback(), 731811790);
        int i7 = onNavigationEvent + 69;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, -852525281, iOnExtraCallback3, 852525287)).booleanValue();
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return zBooleanValue;
    }

    private static final Unit onNavigationEvent(float f, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(f, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 21;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, futures3);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(boolean z, boolean z2, boolean z3, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
            onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), -1756790757, PushInfo.Companion.onExtraCallback(), 1756790765);
        } else {
            Object[] objArr2 = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
            onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr2, PushInfo.Companion.onExtraCallback(), -1756790757, PushInfo.Companion.onExtraCallback(), 1756790765);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 7;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor, isinvideousage);
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        int i4 = onNavigationEvent + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = i6 | i7 | i8;
        int i10 = (~(i7 | i)) | (~(i8 | i6));
        int i11 = (~(i | i6)) | (~(i7 | (~i6) | i8));
        int i12 = i6 + i4 + i3 + ((-160716491) * i5) + (1883135422 * i2);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i6) - 666828800) + ((-962678542) * i4) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i3) + ((-1967783936) * i5) + ((-2092695552) * i2) + ((-870252544) * i13);
        int i15 = (i6 * 1975847376) + 750996803 + (i4 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i3 * 1975846509) + (i5 * (-526956143)) + (i2 * 972447206) + (i13 * (-1341325312));
        switch (i14 + (i15 * i15 * 1929838592)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                getTimebase gettimebase = (getTimebase) objArr[0];
                int i16 = 2 % 2;
                int i17 = onWarmupCompleted + 3;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
                int i19 = onWarmupCompleted + 113;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                return Integer.valueOf(iOnWarmupCompleted);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return access000(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access100(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[0];
                int i21 = 2 % 2;
                int i22 = onWarmupCompleted + 115;
                onNavigationEvent = i22 % 128;
                int i23 = i22 % 2;
                float fOnNavigationEvent = lottieDrawableExternalSyntheticLambda17.onNavigationEvent();
                float fOnExtraCallbackWithResult = lottieDrawableExternalSyntheticLambda17.onExtraCallbackWithResult();
                return Float.valueOf(i23 == 0 ? fOnNavigationEvent * fOnExtraCallbackWithResult : fOnNavigationEvent / fOnExtraCallbackWithResult);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = (LottieDrawableExternalSyntheticLambda17) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int iIntValue3 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue4 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, iIntValue, lottieDrawableExternalSyntheticLambda17, fFloatValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i4 = onWarmupCompleted + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(f, z, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(f, z, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, fliphorizontally);
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(lottieDrawableExternalSyntheticLambda17, fliphorizontally);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = onNavigationEvent + 57;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, boolean z, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 71;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, lottieDrawableExternalSyntheticLambda17, z, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 87;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 83 / 0;
        }
        return unit;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            return (decrementVideoUsage) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{lottieDrawableExternalSyntheticLambda3, isinvideousage}, iOnExtraCallback2, 1284990508, iOnExtraCallback3, -1284990494);
        }
        int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback5 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback6 = PushInfo.Companion.onExtraCallback();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onWarmupCompleted(iOnExtraCallback4, PushInfo.Companion.onExtraCallback(), new Object[]{lottieDrawableExternalSyntheticLambda3, isinvideousage}, iOnExtraCallback5, 1284990508, iOnExtraCallback6, -1284990494);
        int i3 = 3 / 0;
        return decrementvideousage;
    }

    public static /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(gettimebase, i);
        int i5 = onWarmupCompleted + 59;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class IAuthTabCallbackDefault implements decrementVideoUsage {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda3 IAuthTabCallback;

        public IAuthTabCallbackDefault(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3) {
            this.IAuthTabCallback = lottieDrawableExternalSyntheticLambda3;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3 = this.IAuthTabCallback;
                if (lottieDrawableExternalSyntheticLambda3 != null) {
                    lottieDrawableExternalSyntheticLambda3.onExtraCallbackWithResult(0.0f);
                }
                LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda32 = this.IAuthTabCallback;
                if (lottieDrawableExternalSyntheticLambda32 != null) {
                    int i3 = onExtraCallback + 39;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    lottieDrawableExternalSyntheticLambda32.onNavigationEvent(0.0f);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements decrementVideoUsage {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallback;
        final /* synthetic */ LifecycleEventObserver onExtraCallbackWithResult;

        public IAuthTabCallbackStub(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.IAuthTabCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallbackWithResult = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.getLifecycle().onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            int i4 = onExtraCallback + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class access000 implements decrementVideoUsage {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ViewGroup IAuthTabCallback;
        final /* synthetic */ ComposeView onNavigationEvent;

        public access000(ViewGroup viewGroup, ComposeView composeView) {
            this.IAuthTabCallback = viewGroup;
            this.onNavigationEvent = composeView;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
          0x001b: PHI (r1v5 android.view.ViewGroup) = (r1v4 android.view.ViewGroup), (r1v9 android.view.ViewGroup) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void dispose() {
            ViewGroup viewGroup;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup = this.IAuthTabCallback;
                int i3 = 53 / 0;
                if (viewGroup != null) {
                    viewGroup.removeView(this.onNavigationEvent);
                }
            } else {
                viewGroup = this.IAuthTabCallback;
                if (viewGroup != null) {
                }
            }
            int i4 = onExtraCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final LottieDrawableExternalSyntheticLambda3 onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1273654255, i, -1, "im.toss.compose.widget.ptr.rememberTdsPullToRefreshCoordinateState (TdsPullToRefreshContainer.kt:76)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new LottieDrawableExternalSyntheticLambda3();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3 = (LottieDrawableExternalSyntheticLambda3) objOnMinimized;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onNavigationEvent + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return lottieDrawableExternalSyntheticLambda3;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        float f7;
        float fIAuthTabCallback;
        int i2 = 2 % 2;
        float f8 = 1.0f;
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 71;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 3;
            }
            f7 = 1.0f;
        } else {
            f7 = f;
        }
        float f9 = (i & 4) != 0 ? 0.92f : f2;
        if ((i & 8) != 0) {
            int i5 = onNavigationEvent + 5;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            f8 = f3;
        }
        float f10 = (i & 16) != 0 ? 0.4f : f4;
        float fIAuthTabCallback2 = (i & 32) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f5;
        if ((i & 64) != 0) {
            int i7 = onNavigationEvent + 71;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            int i9 = onNavigationEvent + 91;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        } else {
            fIAuthTabCallback = f6;
        }
        return onExtraCallback(quirksExternalSyntheticBackport0, lottieDrawableExternalSyntheticLambda3, f7, f9, f8, f10, fIAuthTabCallback2, fIAuthTabCallback);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;
        private static final byte[] $$a = {69, 81, 99, -123};
        private static final int $$b = 219;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onExtraCallbackWithResult = {60860, 9205, 28938, 34651, 54515, 59975, 14341, 18856, 40719, 44381, 58087, 12295, 17985, 38886, 42332, 64347, 2283, 24066, 27741, 48565, 62233, 320, 22197, 25630, 47680, 52213, 6403, 12112, 31980, 45574, 49167, 4604, 10011, 30028, 35571, 55332, 61006, 16306, 19768, 33614, 53484, 58937, 13386, 17910, 39781, 43340, 65279, 3118, 16963, 37876, 41312, 63307, 1278, 23082};
        private static long onWarmupCompleted = -6318319441947253887L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, int i, byte b2) {
            int i2;
            int i3 = 97 - (b2 * 3);
            int i4 = b + 4;
            byte[] bArr = $$a;
            int i5 = i * 4;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i6;
                i2 = 0;
                i3 += -i7;
                bArr2[i2] = (byte) i3;
                i4++;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                i2++;
                i7 = bArr[i4];
                i3 += -i7;
                bArr2[i2] = (byte) i3;
                i4++;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                i4++;
                if (i2 == i6) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Context context, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$context, access13800Var);
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return objInvokeSuspend;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 25;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - ((byte) KeyEvent.getModifierMetaStateMask())), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46133), 31 - View.resolveSizeAndState(0, 0, 0), Gravity.getAbsoluteGravity(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                            try {
                                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                                if (objOnExtraCallback3 == null) {
                                    byte b = (byte) (-1);
                                    byte b2 = (byte) (b + 1);
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getOffsetAfter("", 0) + 44, TextUtils.indexOf((CharSequence) "", '0') + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - ((byte) KeyEvent.getModifierMetaStateMask())), 17 - TextUtils.indexOf("", "", 0, 0), 10973 - View.MeasureSpec.makeMeasureSpec(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31, 20219 - TextUtils.lastIndexOf("", '0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 49123), Color.red(0) + 44, 1494 - View.getDefaultSize(0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $10 + 31;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i9 = $11 + 125;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback7 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 49123), 44 - Color.argb(0, 0, 0, 0), 1494 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback7).invoke(null, objArr8);
                    int i10 = 57 / 0;
                } else {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback8 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 49123), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494, -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback8).invoke(null, objArr9);
                }
            }
            objArr[0] = new String(cArr);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(this.$context);
            Object[] objArr = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 54 - TextUtils.getCapsMode("", 0, 0), (char) View.MeasureSpec.getMode(0), objArr);
            LinkGenerator.IAuthTabCallback(carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult, ((String) objArr[0]).intern(), this.$context);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return unit;
        }
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, float f, float f2, float f3, float f4, float f5, float f6) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(lottieDrawableExternalSyntheticLambda3, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0, new TdsPullToRefreshContainerKt$.ExternalSyntheticLambda21(lottieDrawableExternalSyntheticLambda3, f, f2, f3, f4, f5, f6));
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, float f, float f2, float f3, float f4, float f5, float f6, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        float fIAuthTabCallback = lottieDrawableExternalSyntheticLambda3.IAuthTabCallback();
        float fIAuthTabCallback2 = PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(f, f2, fIAuthTabCallback);
        fliphorizontally.IAuthTabCallbackStubProxy(fIAuthTabCallback2);
        fliphorizontally.getInterfaceDescriptor(fIAuthTabCallback2);
        fliphorizontally.IAuthTabCallbackStub(PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(f3, f4, fIAuthTabCallback));
        fliphorizontally.access000(PostviewFormatValidatorExternalSyntheticLambda0.IAuthTabCallback(fliphorizontally.onExtraCallback(f5), fliphorizontally.onExtraCallback(f6), fIAuthTabCallback));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(lottieDrawableExternalSyntheticLambda3, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0, new TdsPullToRefreshContainerKt$.ExternalSyntheticLambda22(lottieDrawableExternalSyntheticLambda3));
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    private static final Unit onExtraCallback(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.access000(lottieDrawableExternalSyntheticLambda3.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i2 = access100.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        if (i2 != 1) {
            int i3 = onNavigationEvent + 43;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (i2 != 2) {
                int i6 = i4 + 73;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, true}, iOnExtraCallback2, 1018312685, iOnExtraCallback3, -1018312683);
        int i8 = onNavigationEvent + 3;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, false}, PushInfo.Companion.onExtraCallback(), 1018312685, PushInfo.Companion.onExtraCallback(), -1018312683);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, false}, iOnExtraCallback2, 1018312685, iOnExtraCallback3, -1018312683);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, i2 % 2 != 0);
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda3 $coordinateState;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda17 $pullRefreshState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$coordinateState = lottieDrawableExternalSyntheticLambda3;
            this.$pullRefreshState = lottieDrawableExternalSyntheticLambda17;
        }

        public static /* synthetic */ Pair IAuthTabCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Pair pairOnNavigationEvent = onNavigationEvent(lottieDrawableExternalSyntheticLambda17);
            if (i3 != 0) {
                int i4 = 18 / 0;
            }
            return pairOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$coordinateState, this.$pullRefreshState, access13800Var);
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 20 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return objInvokeSuspend;
        }

        private static final Pair onNavigationEvent(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            float fOnNavigationEvent = lottieDrawableExternalSyntheticLambda17.onNavigationEvent();
            float fOnExtraCallbackWithResult = lottieDrawableExternalSyntheticLambda17.onExtraCallbackWithResult();
            float fCoerceIn = 0.0f;
            if (fOnExtraCallbackWithResult > 0.0f) {
                int i4 = onNavigationEvent + 39;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                fCoerceIn = RangesKt.coerceIn(fOnNavigationEvent / fOnExtraCallbackWithResult, 0.0f, 1.0f);
                int i6 = IAuthTabCallback + 15;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            return getWrite.IAuthTabCallback(Float.valueOf(fOnNavigationEvent), Float.valueOf(fCoerceIn));
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$coordinateState == null) {
                    Unit unit = Unit.INSTANCE;
                    int i5 = IAuthTabCallback + 39;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }
                final LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17 = this.$pullRefreshState;
                IAnimation iAnimationOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$TdsPullToRefreshContainer$3$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        Pair pairIAuthTabCallback;
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 83;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            pairIAuthTabCallback = LottieDrawableExternalSyntheticLambda2.onExtraCallback.IAuthTabCallback(lottieDrawableExternalSyntheticLambda17);
                            int i9 = 37 / 0;
                        } else {
                            pairIAuthTabCallback = LottieDrawableExternalSyntheticLambda2.onExtraCallback.IAuthTabCallback(lottieDrawableExternalSyntheticLambda17);
                        }
                        int i10 = IAuthTabCallback + 39;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        return pairIAuthTabCallback;
                    }
                });
                final LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3 = this.$coordinateState;
                setRipple setripple = new setRipple() { // from class: o.LottieDrawableExternalSyntheticLambda2.onExtraCallback.2
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 67;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Object objOnWarmupCompleted2 = onWarmupCompleted((Pair) obj2, access13800Var);
                        int i10 = onExtraCallbackWithResult + 109;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            return objOnWarmupCompleted2;
                        }
                        throw null;
                    }

                    public final Object onWarmupCompleted(Pair<Float, Float> pair, access13800<? super Unit> access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 103;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        float fFloatValue = ((Number) pair.onExtraCallbackWithResult()).floatValue();
                        float fFloatValue2 = ((Number) pair.IAuthTabCallback()).floatValue();
                        lottieDrawableExternalSyntheticLambda3.onNavigationEvent(fFloatValue);
                        lottieDrawableExternalSyntheticLambda3.onExtraCallbackWithResult(fFloatValue2);
                        Unit unit2 = Unit.INSTANCE;
                        int i10 = onExtraCallback + 53;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        return unit2;
                    }
                };
                this.label = 1;
                if (iAnimationOnWarmupCompleted.collect(setripple, this) == objOnWarmupCompleted) {
                    int i7 = onNavigationEvent + 21;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 91 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = IAuthTabCallback + 97;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isRippleVisible$delegate;
        final /* synthetic */ boolean $showRipple;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$showRipple = z;
            this.$isRippleVisible$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$showRipple, this.$isRippleVisible$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return ontransactCreate.invokeSuspend(unit);
            }
            ontransactCreate.invokeSuspend(unit);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (LottieDrawableExternalSyntheticLambda2.onExtraCallbackWithResult(this.$isRippleVisible$delegate) && this.$showRipple) {
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(1500L, this) == objOnWarmupCompleted) {
                        int i4 = IAuthTabCallback + 123;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            LottieDrawableExternalSyntheticLambda2.onNavigationEvent((getSupportedHighSpeedResolutionsFor) this.$isRippleVisible$delegate, false);
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        Object obj = null;
        if (!(!FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null).onMinimized())) {
            onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor, true}, PushInfo.Companion.onExtraCallback(), 1018312685, PushInfo.Companion.onExtraCallback(), -1018312683);
            int i4 = onWarmupCompleted + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 57;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static final class asBinder implements PointerInputEventHandler {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda17 onWarmupCompleted;

        asBinder(boolean z, LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
            this.onExtraCallbackWithResult = z;
            this.onWarmupCompleted = lottieDrawableExternalSyntheticLambda17;
        }

        public static /* synthetic */ Unit IAuthTabCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(lottieDrawableExternalSyntheticLambda17);
                throw null;
            }
            Unit unitOnNavigationEvent = onNavigationEvent(lottieDrawableExternalSyntheticLambda17);
            int i3 = onExtraCallback + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Unit IAuthTabCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(lottieDrawableExternalSyntheticLambda17, handlerScheduledExecutorService2, f);
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        private static final Unit onExtraCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
            lottieDrawableExternalSyntheticLambda17.IAuthTabCallback(f);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final Unit onNavigationEvent(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            lottieDrawableExternalSyntheticLambda17.onExtraCallback(0.0f);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if (r11 != o.access14300.onWarmupCompleted()) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            r11 = kotlin.Unit.INSTANCE;
            r12 = o.LottieDrawableExternalSyntheticLambda2.asBinder.onExtraCallback + 51;
            o.LottieDrawableExternalSyntheticLambda2.asBinder.IAuthTabCallback = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r10.onExtraCallbackWithResult != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r10.onExtraCallbackWithResult != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r0 = r10.onWarmupCompleted;
            r4 = new im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$TdsPullToRefreshContainer$7$1$1$$ExternalSyntheticLambda0(r0);
            r0 = r10.onWarmupCompleted;
            r11 = o.FeatureCombinationQueryImplExternalSyntheticLambda10.onWarmupCompleted(r11, (kotlin.jvm.functions.Function1) null, r4, (kotlin.jvm.functions.Function0) null, new im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$TdsPullToRefreshContainer$7$1$1$$ExternalSyntheticLambda1(r0), r12, 5, (java.lang.Object) null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
            }
        }
    }

    private static final Unit onExtraCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, flipHorizontally fliphorizontally) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.access000(lottieDrawableExternalSyntheticLambda17.onNavigationEvent());
            unit = Unit.INSTANCE;
            int i3 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.access000(lottieDrawableExternalSyntheticLambda17.onNavigationEvent());
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallback;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 7;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, 23139 - (ViewConfiguration.getPressedStateDuration() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 23139 - View.MeasureSpec.getSize(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i2 = i + 124;
                cArr4[i2] = (char) (cArr[i2] + b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 24824), 74 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 8087 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.getDeadChar(0, 0) + 30, 19488 - (ViewConfiguration.getEdgeSlop() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(final boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, float f, int i, @Nullable LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws Throwable {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        float f2;
        int i8;
        int i9;
        int i10;
        int i11;
        final int i12;
        LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda32;
        final boolean z6;
        final boolean z7;
        final float f3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i13;
        boolean z8;
        Object objOnMinimized;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        Object objOnMinimized2;
        boolean z9;
        boolean z10;
        boolean zOnExtraCallback;
        Object objOnMinimized3;
        boolean zOnExtraCallback2;
        Object objOnMinimized4;
        int i14;
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-570415145);
        if ((i2 & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                i14 = 2;
            } else {
                int i16 = onNavigationEvent + 67;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                i14 = 4;
            }
            i4 = i14 | i2;
        } else {
            i4 = i2;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                int i19 = onWarmupCompleted + 21;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    z4 = z2;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z3;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 != 0) {
                        if ((i2 & 24576) == 0) {
                            f2 = f;
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                                int i21 = onWarmupCompleted + 53;
                                onNavigationEvent = i21 % 128;
                                int i22 = i21 % 2;
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i4 |= i9;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            int i23 = onWarmupCompleted + 103;
                            onNavigationEvent = i23 % 128;
                            int i24 = i23 % 2;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda3)) {
                                int i25 = onWarmupCompleted + 61;
                                onNavigationEvent = i25 % 128;
                                int i26 = i25 % 2;
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                        if ((12582912 & i2) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 8388608 : 4194304;
                        }
                        if ((100663296 & i2) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 67108864 : 33554432;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
                            if (i18 != 0) {
                                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            z6 = i5 != 0 ? true : z4;
                            boolean z11 = i6 != 0 ? true : z5;
                            float fIAuthTabCallback = i7 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2;
                            int i27 = i8 != 0 ? 1000 : i;
                            final LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda33 = i10 != 0 ? null : lottieDrawableExternalSyntheticLambda3;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i28 = onNavigationEvent + 123;
                                onWarmupCompleted = i28 % 128;
                                if (i28 % 2 != 0) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-570415145, i4, -1, "im.toss.compose.widget.ptr.TdsPullToRefreshContainer (TdsPullToRefreshContainer.kt:145)");
                                    int i29 = 38 / 0;
                                } else {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-570415145, i4, -1, "im.toss.compose.widget.ptr.TdsPullToRefreshContainer (TdsPullToRefreshContainer.kt:145)");
                                }
                            }
                            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                i13 = 2;
                                objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                            } else {
                                i13 = 2;
                            }
                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, i13, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                            }
                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
                            if (!z11) {
                                onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, false);
                            }
                            Boolean bool = Boolean.TRUE;
                            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnExtraCallback3 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized7 = new IAuthTabCallback(context, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(bool, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnExtraCallback4 || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized8 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda12
                                    private static int onExtraCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj) {
                                        int i30 = 2 % 2;
                                        int i31 = onExtraCallbackWithResult + 89;
                                        onExtraCallback = i31 % 128;
                                        int i32 = i31 % 2;
                                        decrementVideoUsage decrementvideousageOnNavigationEvent = LottieDrawableExternalSyntheticLambda2.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, getsupportedhighspeedresolutionsfor3, (isInVideoUsage) obj);
                                        int i33 = onExtraCallback + 71;
                                        onExtraCallbackWithResult = i33 % 128;
                                        if (i33 % 2 != 0) {
                                            int i34 = 5 / 0;
                                        }
                                        return decrementvideousageOnNavigationEvent;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                            }
                            isZslDisabledByByUserCaseConfig.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, (Function1) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            boolean zIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3);
                            boolean z12 = (29360128 & i4) == 8388608;
                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z12) {
                                Object obj = objOnMinimized9;
                                if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                    Function0 function02 = new Function0() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda13
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onNavigationEvent;

                                        public final Object invoke() {
                                            int i30 = 2 % 2;
                                            int i31 = onNavigationEvent + 61;
                                            onExtraCallbackWithResult = i31 % 128;
                                            int i32 = i31 % 2;
                                            Unit unitOnExtraCallbackWithResult = LottieDrawableExternalSyntheticLambda2.onExtraCallbackWithResult(function0, getsupportedhighspeedresolutionsfor3);
                                            int i33 = onExtraCallbackWithResult + 11;
                                            onNavigationEvent = i33 % 128;
                                            if (i33 % 2 == 0) {
                                                return unitOnExtraCallbackWithResult;
                                            }
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                    obj = function02;
                                }
                                Function0 function03 = (Function0) obj;
                                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized10 = new Function0() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda14
                                        private static int IAuthTabCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        public final Object invoke() {
                                            int i30 = 2 % 2;
                                            int i31 = onExtraCallbackWithResult + 125;
                                            IAuthTabCallback = i31 % 128;
                                            int i32 = i31 % 2;
                                            Object[] objArr = {getsupportedhighspeedresolutionsfor3};
                                            Unit unit = (Unit) LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), 1278164123, PushInfo.Companion.onExtraCallback(), -1278164111);
                                            int i33 = IAuthTabCallback + 73;
                                            onExtraCallbackWithResult = i33 % 128;
                                            int i34 = i33 % 2;
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                                }
                                Function0 function04 = (Function0) objOnMinimized10;
                                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized11 = new Function0() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda15
                                        private static int onNavigationEvent = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke() {
                                            int i30 = 2 % 2;
                                            int i31 = onNavigationEvent + 85;
                                            onWarmupCompleted = i31 % 128;
                                            int i32 = i31 % 2;
                                            Unit unitIAuthTabCallback = LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(getsupportedhighspeedresolutionsfor2);
                                            int i33 = onWarmupCompleted + 41;
                                            onNavigationEvent = i33 % 128;
                                            int i34 = i33 % 2;
                                            return unitIAuthTabCallback;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                                }
                                final LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17OnNavigationEvent = LottieDrawableExternalSyntheticLambda6.onNavigationEvent(z, zIAuthTabCallbackStub, function03, function04, (Function0) objOnMinimized11, 0.0f, 0.0f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 & 14) | 27648, 96);
                                int i30 = 3670016 & i4;
                                boolean z13 = i30 == 1048576;
                                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17OnNavigationEvent);
                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z13 | zOnExtraCallback5)) {
                                    int i31 = onWarmupCompleted + 79;
                                    onNavigationEvent = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        onwarmupcompleted.onExtraCallback();
                                        throw null;
                                    }
                                    if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized12 = new onExtraCallback(lottieDrawableExternalSyntheticLambda33, lottieDrawableExternalSyntheticLambda17OnNavigationEvent, null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                                    }
                                    int i32 = (i4 >> 18) & 14;
                                    isZslDisabledByByUserCaseConfig.onExtraCallback(lottieDrawableExternalSyntheticLambda33, lottieDrawableExternalSyntheticLambda17OnNavigationEvent, (Function2) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i32);
                                    boolean z14 = i30 == 1048576;
                                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(!z14)) {
                                        objOnMinimized13 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda16
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            public final Object invoke(Object obj2) {
                                                int i33 = 2 % 2;
                                                int i34 = onExtraCallback + 45;
                                                IAuthTabCallback = i34 % 128;
                                                int i35 = i34 % 2;
                                                LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda34 = lottieDrawableExternalSyntheticLambda33;
                                                isInVideoUsage isinvideousage = (isInVideoUsage) obj2;
                                                if (i35 == 0) {
                                                    return LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda34, isinvideousage);
                                                }
                                                LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda34, isinvideousage);
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                                        isZslDisabledByByUserCaseConfig.onExtraCallback(lottieDrawableExternalSyntheticLambda33, (Function1) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i32);
                                        boolean zBooleanValue = ((Boolean) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor2}, PushInfo.Companion.onExtraCallback(), -852525281, PushInfo.Companion.onExtraCallback(), 852525287)).booleanValue();
                                        z8 = (i4 & 7168) != 2048;
                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!z8 || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                                            objOnMinimized = new onTransact(z11, getsupportedhighspeedresolutionsfor, null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        } else {
                                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                                        }
                                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zBooleanValue), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized2 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda17
                                                private static int IAuthTabCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj2) {
                                                    int i33 = 2 % 2;
                                                    int i34 = IAuthTabCallback + 47;
                                                    onWarmupCompleted = i34 % 128;
                                                    int i35 = i34 % 2;
                                                    Unit unitOnNavigationEvent = LottieDrawableExternalSyntheticLambda2.onNavigationEvent(getsupportedhighspeedresolutionsfor3, (Futures3) obj2);
                                                    int i36 = IAuthTabCallback + 87;
                                                    onWarmupCompleted = i36 % 128;
                                                    if (i36 % 2 == 0) {
                                                        int i37 = 21 / 0;
                                                    }
                                                    return unitOnNavigationEvent;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized2);
                                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                                        lottieDrawableExternalSyntheticLambda32 = lottieDrawableExternalSyntheticLambda33;
                                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() != null) {
                                            int i33 = onNavigationEvent + 83;
                                            z9 = z11;
                                            onWarmupCompleted = i33 % 128;
                                            int i34 = i33 % 2;
                                            getAwbState.onExtraCallback();
                                        } else {
                                            z9 = z11;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = LottieDrawableExternalSyntheticLambda6.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), lottieDrawableExternalSyntheticLambda17OnNavigationEvent, z6);
                                        z10 = (i4 & 896) != 256;
                                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17OnNavigationEvent);
                                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!(z10 | zOnExtraCallback) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized3 = new asBinder(z6, lottieDrawableExternalSyntheticLambda17OnNavigationEvent);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, Boolean.valueOf(z6), (PointerInputEventHandler) objOnMinimized3);
                                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17OnNavigationEvent);
                                        objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!zOnExtraCallback2 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized4 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda18
                                                private static int onExtraCallback = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj2) {
                                                    int i35 = 2 % 2;
                                                    int i36 = onExtraCallback + 119;
                                                    onWarmupCompleted = i36 % 128;
                                                    int i37 = i36 % 2;
                                                    Unit unitOnWarmupCompleted = LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda17OnNavigationEvent, (flipHorizontally) obj2);
                                                    int i38 = onWarmupCompleted + 7;
                                                    onExtraCallback = i38 % 128;
                                                    if (i38 % 2 == 0) {
                                                        int i39 = 3 / 0;
                                                    }
                                                    return unitOnWarmupCompleted;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized4).onExtraCallback(quirksExternalSyntheticBackport02);
                                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                            getAwbState.onExtraCallback();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 24) & 14));
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                        int i35 = (i4 >> 3) & 7168;
                                        float f4 = fIAuthTabCallback;
                                        onExtraCallbackWithResult(submit.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.IAuthTabCallback_Parcel()), 10.0f), lottieDrawableExternalSyntheticLambda17OnNavigationEvent, ((Boolean) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, PushInfo.Companion.onExtraCallback(), -852525281, PushInfo.Companion.onExtraCallback(), 852525287)).booleanValue(), f4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i35, 0);
                                        onWarmupCompleted(submit.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.IAuthTabCallback_Parcel()), 10.0f), i27, lottieDrawableExternalSyntheticLambda17OnNavigationEvent, f4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 12) & 112) | i35, 0);
                                        onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{Boolean.valueOf(z9), Boolean.valueOf(((Boolean) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, PushInfo.Companion.onExtraCallback(), -852525281, PushInfo.Companion.onExtraCallback(), 852525287)).booleanValue()), Boolean.valueOf(!IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3)), Float.valueOf(fIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i35 | ((i4 >> 9) & 14))}, PushInfo.Companion.onExtraCallback(), -1756790757, PushInfo.Companion.onExtraCallback(), 1756790765);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i36 = onWarmupCompleted + 23;
                                            onNavigationEvent = i36 % 128;
                                            if (i36 % 2 == 0) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                int i37 = 8 / 0;
                                            } else {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                        }
                                        z7 = z9;
                                        f3 = fIAuthTabCallback;
                                        i12 = i27;
                                    } else {
                                        int i38 = onNavigationEvent + 75;
                                        onWarmupCompleted = i38 % 128;
                                        if (i38 % 2 != 0) {
                                            onwarmupcompleted.onExtraCallback();
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                                        }
                                        isZslDisabledByByUserCaseConfig.onExtraCallback(lottieDrawableExternalSyntheticLambda33, (Function1) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i32);
                                        boolean zBooleanValue2 = ((Boolean) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor2}, PushInfo.Companion.onExtraCallback(), -852525281, PushInfo.Companion.onExtraCallback(), 852525287)).booleanValue();
                                        if ((i4 & 7168) != 2048) {
                                        }
                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (z8) {
                                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                                            objOnMinimized = new onTransact(z11, getsupportedhighspeedresolutionsfor, null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zBooleanValue2), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                            }
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent22 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent3, (Function1) objOnMinimized2);
                                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                                            component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                                            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent22);
                                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                                            lottieDrawableExternalSyntheticLambda32 = lottieDrawableExternalSyntheticLambda33;
                                            Function0 function0IAuthTabCallback3 = onextracallbackwithresult22.IAuthTabCallback();
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() != null) {
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                            }
                                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted3, onextracallbackwithresult22.asBinder());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult22.asInterface());
                                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult22.onWarmupCompleted());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult22.onNavigationEvent());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult22.onTransact());
                                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = LottieDrawableExternalSyntheticLambda6.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null), lottieDrawableExternalSyntheticLambda17OnNavigationEvent, z6);
                                            if ((i4 & 896) != 256) {
                                            }
                                            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17OnNavigationEvent);
                                            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!(z10 | zOnExtraCallback)) {
                                                objOnMinimized3 = new asBinder(z6, lottieDrawableExternalSyntheticLambda17OnNavigationEvent);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback3, Boolean.valueOf(z6), (PointerInputEventHandler) objOnMinimized3);
                                                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17OnNavigationEvent);
                                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!zOnExtraCallback2) {
                                                    objOnMinimized4 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda18
                                                        private static int onExtraCallback = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke(Object obj22) {
                                                            int i352 = 2 % 2;
                                                            int i362 = onExtraCallback + 119;
                                                            onWarmupCompleted = i362 % 128;
                                                            int i372 = i362 % 2;
                                                            Unit unitOnWarmupCompleted = LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda17OnNavigationEvent, (flipHorizontally) obj22);
                                                            int i382 = onWarmupCompleted + 7;
                                                            onExtraCallback = i382 % 128;
                                                            if (i382 % 2 == 0) {
                                                                int i39 = 3 / 0;
                                                            }
                                                            return unitOnWarmupCompleted;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized4).onExtraCallback(quirksExternalSyntheticBackport02);
                                                    component5 component5VarOnWarmupCompleted22 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                                                    int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback22);
                                                    Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                                    }
                                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnWarmupCompleted22, onextracallbackwithresult22.asBinder());
                                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult22.asInterface());
                                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult22.onWarmupCompleted());
                                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult22.onNavigationEvent());
                                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                                                    function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 24) & 14));
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                                    int i352 = (i4 >> 3) & 7168;
                                                    float f42 = fIAuthTabCallback;
                                                    onExtraCallbackWithResult(submit.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda12.onWarmupCompleted(onextracallback2, onextracallbackwithresult3.IAuthTabCallback_Parcel()), 10.0f), lottieDrawableExternalSyntheticLambda17OnNavigationEvent, ((Boolean) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, PushInfo.Companion.onExtraCallback(), -852525281, PushInfo.Companion.onExtraCallback(), 852525287)).booleanValue(), f42, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i352, 0);
                                                    onWarmupCompleted(submit.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda12.onWarmupCompleted(onextracallback2, onextracallbackwithresult3.IAuthTabCallback_Parcel()), 10.0f), i27, lottieDrawableExternalSyntheticLambda17OnNavigationEvent, f42, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 12) & 112) | i352, 0);
                                                    onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{Boolean.valueOf(z9), Boolean.valueOf(((Boolean) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, PushInfo.Companion.onExtraCallback(), -852525281, PushInfo.Companion.onExtraCallback(), 852525287)).booleanValue()), Boolean.valueOf(!IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3)), Float.valueOf(fIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i352 | ((i4 >> 9) & 14))}, PushInfo.Companion.onExtraCallback(), -1756790757, PushInfo.Companion.onExtraCallback(), 1756790765);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    z7 = z9;
                                                    f3 = fIAuthTabCallback;
                                                    i12 = i27;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            i12 = i;
                            lottieDrawableExternalSyntheticLambda32 = lottieDrawableExternalSyntheticLambda3;
                            z6 = z4;
                            z7 = z5;
                            f3 = f2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            final LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda34 = lottieDrawableExternalSyntheticLambda32;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda19
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj3, Object obj4) {
                                    int i39 = 2 % 2;
                                    int i40 = onExtraCallbackWithResult + 53;
                                    onExtraCallback = i40 % 128;
                                    int i41 = i40 % 2;
                                    Unit unitOnExtraCallbackWithResult = LottieDrawableExternalSyntheticLambda2.onExtraCallbackWithResult(z, quirksExternalSyntheticBackport03, z6, z7, f3, i12, lottieDrawableExternalSyntheticLambda34, function0, function2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i42 = onExtraCallback + 15;
                                    onExtraCallbackWithResult = i42 % 128;
                                    if (i42 % 2 != 0) {
                                        return unitOnExtraCallbackWithResult;
                                    }
                                    throw null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    f2 = f;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    if ((12582912 & i2) == 0) {
                    }
                    if ((100663296 & i2) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                z5 = z3;
                i7 = i3 & 16;
                if (i7 != 0) {
                }
                f2 = f;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                if ((12582912 & i2) == 0) {
                }
                if ((100663296 & i2) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            z4 = z2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z5 = z3;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            f2 = f;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z5 = z3;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        f2 = f;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(float f, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        fliphorizontally.access000(fliphorizontally.onExtraCallback(((Float) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda62}, iOnExtraCallback2, -912299624, iOnExtraCallback3, 912299634)).floatValue()) + fliphorizontally.onExtraCallback(LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.onExtraCallback()) + fliphorizontally.onExtraCallback(f));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final int i, final LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, final float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1117996568);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i2 & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i8 = onNavigationEvent + 11;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17) ? 256 : 128;
            int i10 = onWarmupCompleted + 11;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }
        if ((i2 & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 2048 : 1024;
        }
        int i12 = i4;
        if ((i12 & 1171) != 1170) {
            int i13 = onWarmupCompleted + 115;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        } else {
            int i15 = onNavigationEvent + 113;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1117996568, i12, -1, "im.toss.compose.widget.ptr.TdsLoadingIndicator (TdsPullToRefreshContainer.kt:289)");
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(Boolean.valueOf(((Boolean) LottieDrawableExternalSyntheticLambda17.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1787313507, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{lottieDrawableExternalSyntheticLambda17}, 1787313511)).booleanValue() && !lottieDrawableExternalSyntheticLambda17.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            float f2 = onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? 1.0f : 0.0f;
            getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = isSubmitButtonEnabled.IAuthTabCallback(f2, onQueryRefine.onExtraCallback(geticoncontentview.onTransact().onExtraCallback(), onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? i : 0, geticoncontentview.onTransact()), 0.0f, "loadingOpacity", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 20);
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = isSubmitButtonEnabled.onExtraCallbackWithResult(onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.onExtraCallback()) - f), onQueryRefine.onExtraCallback(geticoncontentview.onTransact().onExtraCallback(), onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) ? i : 0, geticoncontentview.onTransact()), "loadingTranslation", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 8);
            if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback) || onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2) > 0.0f) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1236692198);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport04, LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.IAuthTabCallback());
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                if ((i12 & 7168) == 2048) {
                    int i17 = onWarmupCompleted + 39;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2 | z2)) {
                    int i19 = onWarmupCompleted + 119;
                    onNavigationEvent = i19 % 128;
                    if (i19 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda10
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2) {
                                int i20 = 2 % 2;
                                int i21 = onWarmupCompleted + 87;
                                IAuthTabCallback = i21 % 128;
                                int i22 = i21 % 2;
                                Unit unitIAuthTabCallback = LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(f, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult, (flipHorizontally) obj2);
                                int i23 = onWarmupCompleted + 105;
                                IAuthTabCallback = i23 % 128;
                                if (i23 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized);
                    Object[] objArr = new Object[1];
                    a(new char[]{24, 19, '\n', '\t', 20, 15, 13766, 13766, 19, '\n', 14, 19, 23, 6, 4, '\r', '\n', 18, 18, 0, 1, 11, 1, 17, 14, '\n', 11, 24, 5, 20, 23, 5, 11, '\b', '\b', 11, '\f', 1, 18, 11, 7, 14, 1, 16, 0, 24, 20, '\n', 14, '\n', '\b', 23, 18, '\n', 13829}, (byte) (18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54, objArr);
                    i5 = 1;
                    AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallback, false, false, Integer.MAX_VALUE, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24582, 0, 8172);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1237147898);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                i5 = 1;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i20 = onNavigationEvent + i5;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i22 = 2 % 2;
                    int i23 = onWarmupCompleted + 59;
                    onExtraCallback = i23 % 128;
                    int i24 = i23 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                    int i25 = i;
                    LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda172 = lottieDrawableExternalSyntheticLambda17;
                    float f3 = f;
                    int i26 = i2;
                    int i27 = i3;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr2 = {quirksExternalSyntheticBackport05, Integer.valueOf(i25), lottieDrawableExternalSyntheticLambda172, Float.valueOf(f3), Integer.valueOf(i26), Integer.valueOf(i27), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr2, PushInfo.Companion.onExtraCallback(), 1466604454, PushInfo.Companion.onExtraCallback(), -1466604454);
                    int i28 = onWarmupCompleted + 37;
                    onExtraCallback = i28 % 128;
                    if (i28 % 2 != 0) {
                        int i29 = 58 / 0;
                    }
                    return unit;
                }
            });
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ boolean $endAnimation;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $indicatorEndAnimation$delegate;
        final /* synthetic */ findResAndMsg $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$endAnimation = z;
            this.$scope = findresandmsg;
            this.$indicatorEndAnimation$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$endAnimation, this.$scope, this.$indicatorEndAnimation$delegate, access13800Var);
            int i2 = onExtraCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            onExtraCallbackWithResult = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(this.$indicatorEndAnimation$delegate, this.$endAnimation);
            if (this.$endAnimation) {
                maybeUpdateAnimatable.onNavigationEvent(this.$scope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$indicatorEndAnimation$delegate, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.LottieDrawableExternalSyntheticLambda2$onExtraCallbackWithResult$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $indicatorEndAnimation$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$indicatorEndAnimation$delegate = getsupportedhighspeedresolutionsfor;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$indicatorEndAnimation$delegate, access13800Var);
                int i2 = onWarmupCompleted + 33;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 125;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onWarmupCompleted + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    access14300.onWarmupCompleted();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(500L, this) == objOnWarmupCompleted) {
                        int i4 = onExtraCallback + 23;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                LottieDrawableExternalSyntheticLambda2.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.$indicatorEndAnimation$delegate, false);
                return Unit.INSTANCE;
            }
        }
    }

    private static final Unit IAuthTabCallback(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        float fOnNavigationEvent = lottieDrawableExternalSyntheticLambda17.onNavigationEvent();
        Float fValueOf2 = Float.valueOf(0.0f);
        fliphorizontally.access000((fliphorizontally.onExtraCallback(f) + (Math.min(RangesKt.coerceAtLeast(fOnNavigationEvent, 0.0f), lottieDrawableExternalSyntheticLambda17.onExtraCallbackWithResult()) / 2.0f)) - (fliphorizontally.onExtraCallback(LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.onWarmupCompleted()) / 2.0f));
        if (onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
            int i4 = onNavigationEvent + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                fliphorizontally.IAuthTabCallbackStub(onTransact((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
                fliphorizontally.IAuthTabCallbackStubProxy(asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
                fliphorizontally.getInterfaceDescriptor(asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fliphorizontally.IAuthTabCallbackStub(onTransact((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
            fliphorizontally.IAuthTabCallbackStubProxy(asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
            fliphorizontally.getInterfaceDescriptor(asBinder((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
        } else {
            fliphorizontally.IAuthTabCallbackStub(deprecated_immutable.onWarmupCompleted(Float.valueOf(((Float) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda63}, PushInfo.Companion.onExtraCallback(), 153285418, PushInfo.Companion.onExtraCallback(), -153285411)).floatValue()), new Number[]{0, 1}, new Number[]{fValueOf2, fValueOf}).floatValue());
            fliphorizontally.IAuthTabCallbackStubProxy(deprecated_immutable.onWarmupCompleted(Float.valueOf(((Float) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda63}, PushInfo.Companion.onExtraCallback(), 153285418, PushInfo.Companion.onExtraCallback(), -153285411)).floatValue()), new Number[]{0, 1}, new Number[]{fValueOf2, fValueOf}).floatValue());
            fliphorizontally.getInterfaceDescriptor(deprecated_immutable.onWarmupCompleted(Float.valueOf(((Float) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda63}, PushInfo.Companion.onExtraCallback(), 153285418, PushInfo.Companion.onExtraCallback(), -153285411)).floatValue()), new Number[]{0, 1}, new Number[]{fValueOf2, fValueOf}).floatValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, final boolean z, final float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String strIntern;
        boolean z2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean z3;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1002323339);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17)) {
                int i7 = onNavigationEvent + 5;
                onWarmupCompleted = i7 % 128;
                i4 = i7 % 2 != 0 ? 90 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            if (i6 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1002323339, i3, -1, "im.toss.compose.widget.ptr.TdsPullRefreshIndicator (TdsPullToRefreshContainer.kt:333)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i8 = onWarmupCompleted + 17;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            if (!addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                Object[] objArr = new Object[1];
                a(new char[]{24, 19, '\n', '\t', 20, 15, 13830, 13830, 19, '\n', 14, 19, 23, 6, 4, '\r', '\n', 18, 18, 0, 1, 11, 1, 17, 14, '\n', 11, 24, 5, 20, 4, '\f', 23, 22, 19, '\n', 23, 5, 11, 23, '\n', 21, 18, 11, 7, 14, 1, 16, 0, 24, 18, 11, '\n', '\b', 21, 0, 5, 2, 14, 4, 21, 5, 14, '\f', '\n', 23, 21, 1, '\t', 24, '\r', 4, 19, 16, 14, '\f'}, (byte) (Color.rgb(0, 0, 0) + 16777297), 76 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{24, 19, '\n', '\t', 20, 15, 13859, 13859, 19, '\n', 14, 19, 23, 6, 4, '\r', '\n', 18, 18, 0, 1, 11, 1, 17, 14, '\n', 11, 24, 5, 20, 4, '\f', 23, 22, 19, '\n', 23, 5, 11, 23, '\n', 21, 18, 11, 7, 14, 1, 16, 0, 24, 18, 11, '\n', '\b', 21, 0, 5, 2, 14, 4, 21, 5, 14, '\f', '\n', 23, 14, 7, '\t', 22, '\b', 23, 18, '\n', 13922}, (byte) (110 - (KeyEvent.getMaxKeyCode() >> 16)), 75 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                strIntern = ((String) objArr2[0]).intern();
            }
            String str = strIntern;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda17);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda3
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i10 = 2 % 2;
                            int i11 = onNavigationEvent + 13;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            float fOnExtraCallbackWithResult = LottieDrawableExternalSyntheticLambda2.onExtraCallbackWithResult(lottieDrawableExternalSyntheticLambda17);
                            if (i12 == 0) {
                                return Float.valueOf(fOnExtraCallbackWithResult);
                            }
                            Float.valueOf(fOnExtraCallbackWithResult);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    });
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                    obj = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                }
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) obj;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                float f2 = !onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2) ? 1.0f : 0.0f;
                int iOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2) ? getIconContentView.onWarmupCompleted.onExtraCallbackWithResult().onExtraCallback() : 0;
                getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f2, onQueryRefine.onExtraCallbackWithResult(iOnExtraCallback, 0, geticoncontentview.onExtraCallbackWithResult(), 2, (Object) null), 0.0f, "indicatorOpacity", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 20);
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = isSubmitButtonEnabled.IAuthTabCallback(onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2) ? 1.3f : 1.0f, onQueryRefine.onExtraCallbackWithResult(onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2) ? geticoncontentview.onExtraCallbackWithResult().onExtraCallback() : 0, 0, geticoncontentview.onExtraCallbackWithResult(), 2, (Object) null), 0.0f, "indicatorScale", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 20);
                if ((i3 & 896) == 256) {
                    int i10 = onNavigationEvent + 99;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback || z2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                    objOnMinimized4 = new onExtraCallbackWithResult(z, findresandmsg, getsupportedhighspeedresolutionsfor, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                } else {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 6) & 14);
                if (((Float) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda62}, PushInfo.Companion.onExtraCallback(), 153285418, PushInfo.Companion.onExtraCallback(), -153285411)).floatValue() > 0.0f || onExtraCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1600451412);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport02, LottieDrawableExternalSyntheticLambda15.IAuthTabCallback.onWarmupCompleted());
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieDrawableExternalSyntheticLambda17);
                    if ((i3 & 7168) == 2048) {
                        cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                        z3 = true;
                    } else {
                        z3 = false;
                        cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                    }
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback2 | z3 | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4)) {
                        int i12 = onNavigationEvent + 101;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 65 / 0;
                            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor;
                                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda6;
                                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                objOnMinimized5 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda4
                                    private static int onExtraCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj2) {
                                        int i14 = 2 % 2;
                                        int i15 = onWarmupCompleted + 1;
                                        onExtraCallback = i15 % 128;
                                        int i16 = i15 % 2;
                                        Object[] objArr3 = {lottieDrawableExternalSyntheticLambda17, Float.valueOf(f), getsupportedhighspeedresolutionsfor3, cameraPresenceProviderExternalSyntheticLambda63, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda62, (flipHorizontally) obj2};
                                        Unit unit = (Unit) LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr3, PushInfo.Companion.onExtraCallback(), 1180762990, PushInfo.Companion.onExtraCallback(), -1180762987);
                                        int i17 = onWarmupCompleted + 17;
                                        onExtraCallback = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            int i18 = 48 / 0;
                                        }
                                        return unit;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized5);
                            } else {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            }
                        } else if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                        AppLovinStarRatingView.IAuthTabCallback(str, attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized5), false, false, Integer.MAX_VALUE, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 0, 8172);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1599275923);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = onWarmupCompleted + 77;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda5
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    Unit unit;
                    int i16 = 2 % 2;
                    int i17 = onNavigationEvent + 97;
                    onExtraCallback = i17 % 128;
                    if (i17 % 2 == 0) {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda172 = lottieDrawableExternalSyntheticLambda17;
                        boolean z4 = z;
                        float f3 = f;
                        int i18 = i;
                        int i19 = i2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr3 = {quirksExternalSyntheticBackport04, lottieDrawableExternalSyntheticLambda172, Boolean.valueOf(z4), Float.valueOf(f3), Integer.valueOf(i18), Integer.valueOf(i19), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        unit = (Unit) LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr3, PushInfo.Companion.onExtraCallback(), -1650582363, PushInfo.Companion.onExtraCallback(), 1650582374);
                        int i20 = 53 / 0;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                        LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda173 = lottieDrawableExternalSyntheticLambda17;
                        boolean z5 = z;
                        float f4 = f;
                        int i21 = i;
                        int i22 = i2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        Object[] objArr4 = {quirksExternalSyntheticBackport05, lottieDrawableExternalSyntheticLambda173, Boolean.valueOf(z5), Float.valueOf(f4), Integer.valueOf(i21), Integer.valueOf(i22), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                        unit = (Unit) LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr4, PushInfo.Companion.onExtraCallback(), -1650582363, PushInfo.Companion.onExtraCallback(), 1650582374);
                    }
                    int i23 = onExtraCallback + 41;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    return unit;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(float f, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 3) == 5) {
            z2 = false;
        } else {
            int i5 = i3 + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                z2 = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i6 = onWarmupCompleted + 15;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1628050649, i, -1, "im.toss.compose.widget.ptr.TdsPullToRefreshRipple.<anonymous>.<anonymous>.<anonymous> (TdsPullToRefreshContainer.kt:416)");
            }
            IAuthTabCallback(f, z, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComposeView $composeView;
        final /* synthetic */ ViewGroup $decorView;
        final /* synthetic */ boolean $isRippleVisible;
        final /* synthetic */ boolean $isScreenOnForeground;
        final /* synthetic */ boolean $showRipple;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(boolean z, boolean z2, boolean z3, ViewGroup viewGroup, ComposeView composeView, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$showRipple = z;
            this.$isScreenOnForeground = z2;
            this.$isRippleVisible = z3;
            this.$decorView = viewGroup;
            this.$composeView = composeView;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$showRipple, this.$isScreenOnForeground, this.$isRippleVisible, this.$decorView, this.$composeView, access13800Var);
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return asinterface;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$showRipple) {
                int i3 = onExtraCallback + 45;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (!this.$isScreenOnForeground || !this.$isRippleVisible) {
                    ViewGroup viewGroup = this.$decorView;
                    if (viewGroup != null) {
                        int i4 = onWarmupCompleted + 95;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            viewGroup.removeView(this.$composeView);
                            throw null;
                        }
                        viewGroup.removeView(this.$composeView);
                    }
                } else if (this.$composeView.getParent() == null) {
                    int i5 = onWarmupCompleted + 83;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    ViewGroup viewGroup2 = this.$decorView;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(this.$composeView);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean z;
        int i2;
        ViewGroup viewGroup;
        ComposeView composeView;
        Object obj;
        Window window;
        final boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
        final float fFloatValue = ((Number) objArr[3]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-935155514);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i4 = onWarmupCompleted + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue3);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue3) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 2048 : 1024;
        }
        int i5 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 1171) != 1170, i5 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-935155514, i5, -1, "im.toss.compose.widget.ptr.TdsPullToRefreshRipple (TdsPullToRefreshContainer.kt:405)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            Object obj2 = objOnMinimized;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                ComposeView composeView2 = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                composeView2.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1628050649, true, new Function2() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3, Object obj4) throws Throwable {
                        int i6 = 2 % 2;
                        int i7 = onWarmupCompleted + 13;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnWarmupCompleted = LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(fFloatValue, zBooleanValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i9 = IAuthTabCallback + 87;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 13 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                })));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(composeView2);
                obj2 = composeView2;
            }
            ComposeView composeView3 = (ComposeView) obj2;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                FragmentActivity fragmentActivityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
                objOnMinimized2 = fragmentActivityIAuthTabCallback instanceof FragmentActivity ? fragmentActivityIAuthTabCallback : null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            FragmentActivity fragmentActivity = (FragmentActivity) objOnMinimized2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                View decorView = (fragmentActivity == null || (window = fragmentActivity.getWindow()) == null) ? null : window.getDecorView();
                objOnMinimized3 = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            ViewGroup viewGroup2 = (ViewGroup) objOnMinimized3;
            if (fragmentActivity != null) {
                if (viewGroup2 != null) {
                    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.IAuthTabCallback(viewGroup2, fragmentActivity);
                }
                if (viewGroup2 != null) {
                    int i6 = onWarmupCompleted + 5;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    NavigationDrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult(viewGroup2, fragmentActivity);
                }
            }
            int i8 = i5 & 14;
            if (i8 == 4) {
                int i9 = onWarmupCompleted + 7;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = (i5 & 896) == 256;
            boolean z3 = (i5 & 112) == 32;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(viewGroup2);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(composeView3);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (((z2 | z | z3 | zOnExtraCallback) || zOnExtraCallback2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                i2 = i8;
                viewGroup = viewGroup2;
                composeView = composeView3;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                asInterface asinterface = new asInterface(zBooleanValue, zBooleanValue3, zBooleanValue2, viewGroup2, composeView3, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(asinterface);
                obj = asinterface;
            } else {
                int i11 = onNavigationEvent + 61;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                i2 = i8;
                viewGroup = viewGroup2;
                composeView = composeView3;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                obj = objOnMinimized4;
            }
            isZslDisabledByByUserCaseConfig.IAuthTabCallback(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue3), Boolean.valueOf(zBooleanValue2), (Function2) obj, cameraCaptureResultEmptyCameraCaptureResult, ((i5 >> 3) & 112) | i2 | ((i5 << 3) & 896));
            Unit unit = Unit.INSTANCE;
            final ViewGroup viewGroup3 = viewGroup;
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(viewGroup3);
            final ComposeView composeView4 = composeView;
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(composeView4);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback3 | zOnExtraCallback4)) {
                int i13 = onNavigationEvent + 97;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 92 / 0;
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda1
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj3) {
                                int i15 = 2 % 2;
                                int i16 = onWarmupCompleted + 119;
                                onNavigationEvent = i16 % 128;
                                int i17 = i16 % 2;
                                ViewGroup viewGroup4 = viewGroup3;
                                if (i17 != 0) {
                                    return LottieDrawableExternalSyntheticLambda2.onExtraCallback(viewGroup4, composeView4, (isInVideoUsage) obj3);
                                }
                                decrementVideoUsage decrementvideousageOnExtraCallback = LottieDrawableExternalSyntheticLambda2.onExtraCallback(viewGroup4, composeView4, (isInVideoUsage) obj3);
                                int i18 = 71 / 0;
                                return decrementvideousageOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(unit, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(unit, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj3, Object obj4) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallbackWithResult + 21;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        return LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(zBooleanValue, zBooleanValue2, zBooleanValue3, fFloatValue, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    Unit unitIAuthTabCallback = LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(zBooleanValue, zBooleanValue2, zBooleanValue3, fFloatValue, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i17 = 47 / 0;
                    return unitIAuthTabCallback;
                }
            });
        }
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isScreenOnForeground;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, Context context, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$isScreenOnForeground = z;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$isScreenOnForeground, this.$context, access13800Var);
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$isScreenOnForeground) {
                minFresh.onNavigationEvent(this.$context, noStore.Companion.asInterface());
                int i3 = onExtraCallback + 93;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallbackWithResult + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ boolean $isScreenOnForeground;
        final /* synthetic */ getTimebase $rippleAlphaStep$delegate;
        final /* synthetic */ getTimebase $rippleBgStep$delegate;
        final /* synthetic */ getTimebase $rippleScaleStep$delegate;
        final /* synthetic */ findResAndMsg $scope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, findResAndMsg findresandmsg, getTimebase gettimebase, getTimebase gettimebase2, getTimebase gettimebase3, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$isScreenOnForeground = z;
            this.$scope = findresandmsg;
            this.$rippleBgStep$delegate = gettimebase;
            this.$rippleAlphaStep$delegate = gettimebase2;
            this.$rippleScaleStep$delegate = gettimebase3;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 87 / 0;
            }
            int i5 = onExtraCallback + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$isScreenOnForeground, this.$scope, this.$rippleBgStep$delegate, this.$rippleAlphaStep$delegate, this.$rippleScaleStep$delegate, access13800Var);
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onExtraCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                throw null;
            }
            if (this.$isScreenOnForeground) {
                maybeUpdateAnimatable.onNavigationEvent(this.$scope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(this.$rippleBgStep$delegate, this.$rippleAlphaStep$delegate, this.$rippleScaleStep$delegate, null), 3, (Object) null);
            } else {
                maybeUpdateAnimatable.onNavigationEvent(this.$scope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$rippleAlphaStep$delegate, this.$rippleScaleStep$delegate, this.$rippleBgStep$delegate, null), 3, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
            return unit;
        }

        /* renamed from: o.LottieDrawableExternalSyntheticLambda2$onNavigationEvent$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ getTimebase $rippleAlphaStep$delegate;
            final /* synthetic */ getTimebase $rippleBgStep$delegate;
            final /* synthetic */ getTimebase $rippleScaleStep$delegate;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(getTimebase gettimebase, getTimebase gettimebase2, getTimebase gettimebase3, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$rippleBgStep$delegate = gettimebase;
                this.$rippleAlphaStep$delegate = gettimebase2;
                this.$rippleScaleStep$delegate = gettimebase3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rippleBgStep$delegate, this.$rippleAlphaStep$delegate, this.$rippleScaleStep$delegate, access13800Var);
                anonymousClass1.L$0 = obj;
                int i2 = onExtraCallback + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 95;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 27;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass1Create.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass1Create.invokeSuspend(unit);
                int i4 = onExtraCallback + 15;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.$rippleBgStep$delegate, this.$rippleAlphaStep$delegate, null), 3, (Object) null);
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C00171(this.$rippleScaleStep$delegate, null), 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i3 = onNavigationEvent + 43;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }

            /* renamed from: o.LottieDrawableExternalSyntheticLambda2$onNavigationEvent$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;
                final /* synthetic */ getTimebase $rippleAlphaStep$delegate;
                final /* synthetic */ getTimebase $rippleBgStep$delegate;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(getTimebase gettimebase, getTimebase gettimebase2, access13800<? super AnonymousClass4> access13800Var) {
                    super(2, access13800Var);
                    this.$rippleBgStep$delegate = gettimebase;
                    this.$rippleAlphaStep$delegate = gettimebase2;
                }

                public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 51;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        return anonymousClass4Create.invokeSuspend(unit);
                    }
                    anonymousClass4Create.invokeSuspend(unit);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$rippleBgStep$delegate, this.$rippleAlphaStep$delegate, access13800Var);
                    int i2 = onWarmupCompleted + 115;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass4;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 107;
                    IAuthTabCallback = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 == 0) {
                        return IAuthTabCallback(findresandmsg, access13800Var);
                    }
                    IAuthTabCallback(findresandmsg, access13800Var);
                    throw null;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this.$rippleBgStep$delegate, 1}, PushInfo.Companion.onExtraCallback(), -2036925726, PushInfo.Companion.onExtraCallback(), 2036925741);
                        LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(this.$rippleAlphaStep$delegate, 1);
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                            int i3 = IAuthTabCallback + 57;
                            onWarmupCompleted = i3 % 128;
                            int i4 = i3 % 2;
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this.$rippleBgStep$delegate, 2}, PushInfo.Companion.onExtraCallback(), -2036925726, PushInfo.Companion.onExtraCallback(), 2036925741);
                    LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(this.$rippleAlphaStep$delegate, 2);
                    Unit unit = Unit.INSTANCE;
                    int i5 = onWarmupCompleted + 45;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unit;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }

            /* renamed from: o.LottieDrawableExternalSyntheticLambda2$onNavigationEvent$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00171 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                final /* synthetic */ getTimebase $rippleScaleStep$delegate;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00171(getTimebase gettimebase, access13800<? super C00171> access13800Var) {
                    super(2, access13800Var);
                    this.$rippleScaleStep$delegate = gettimebase;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C00171 c00171 = new C00171(this.$rippleScaleStep$delegate, access13800Var);
                    int i2 = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return c00171;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 19;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                    int i4 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnExtraCallbackWithResult;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 81;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    C00171 c00171Create = create(findresandmsg, access13800Var);
                    if (i3 == 0) {
                        c00171Create.invokeSuspend(Unit.INSTANCE);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object objInvokeSuspend = c00171Create.invokeSuspend(Unit.INSTANCE);
                    int i4 = onExtraCallbackWithResult + 83;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 81 / 0;
                    }
                    return objInvokeSuspend;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 103;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    int i4 = i2 % 2;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = i3 + 47;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.onNavigationEvent(obj);
                    if (i6 == 0) {
                        LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this.$rippleScaleStep$delegate, 1}, PushInfo.Companion.onExtraCallback(), -496630172, PushInfo.Companion.onExtraCallback(), 496630176);
                    } else {
                        LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{this.$rippleScaleStep$delegate, 1}, PushInfo.Companion.onExtraCallback(), -496630172, PushInfo.Companion.onExtraCallback(), 496630176);
                    }
                    Unit unit = Unit.INSTANCE;
                    int i7 = onExtraCallbackWithResult + 41;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 25 / 0;
                    }
                    return unit;
                }
            }
        }

        /* renamed from: o.LottieDrawableExternalSyntheticLambda2$onNavigationEvent$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ getTimebase $rippleAlphaStep$delegate;
            final /* synthetic */ getTimebase $rippleBgStep$delegate;
            final /* synthetic */ getTimebase $rippleScaleStep$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(getTimebase gettimebase, getTimebase gettimebase2, getTimebase gettimebase3, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$rippleAlphaStep$delegate = gettimebase;
                this.$rippleScaleStep$delegate = gettimebase2;
                this.$rippleBgStep$delegate = gettimebase3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$rippleAlphaStep$delegate, this.$rippleScaleStep$delegate, this.$rippleBgStep$delegate, access13800Var);
                int i2 = onWarmupCompleted + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 95;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 91;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
            
                if ((r1 % 2) == 0) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
            
                r0 = 64 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
            
                return r11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
            
                if (r10.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            
                if (r10.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r11);
                o.LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(r10.$rippleAlphaStep$delegate, 0);
                r5 = new java.lang.Object[]{r10.$rippleScaleStep$delegate, 0};
                o.LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), r5, im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), -496630172, im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), 496630176);
                r5 = new java.lang.Object[]{r10.$rippleBgStep$delegate, 0};
                o.LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), r5, im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), -2036925726, im.toss.rn.appsintoss.api.model.contacts_common.PushInfo.Companion.onExtraCallback(), 2036925741);
                r11 = kotlin.Unit.INSTANCE;
                r1 = o.LottieDrawableExternalSyntheticLambda2.onNavigationEvent.AnonymousClass5.IAuthTabCallback + 115;
                o.LottieDrawableExternalSyntheticLambda2.onNavigationEvent.AnonymousClass5.onWarmupCompleted = r1 % 128;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 30 / 0;
                }
            }
        }
    }

    private static final Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
        fliphorizontally.IAuthTabCallbackStubProxy(2.5f);
        fliphorizontally.getInterfaceDescriptor(2.5f);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(List list, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) setorientationdegrees.onTransact()) / 2.0f;
        setOrientationDegrees.IAuthTabCallback(setorientationdegrees, readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, list, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2))), setorientationdegrees.onExtraCallback(f) / 2.0f, 0, 8, (Object) null), 0.0f, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
        fliphorizontally.IAuthTabCallbackStubProxy(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
        fliphorizontally.getInterfaceDescriptor(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[PHI: r1
      0x003f: PHI (r1v44 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v45 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1
      0x002a: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v45 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(final float f, final boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        long jNewSession;
        float f2;
        boolean z2;
        float f3;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        boolean z3;
        boolean zOnExtraCallback;
        Object objOnMinimized;
        int i4;
        float f4;
        float f5;
        float f6;
        List list;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        Object objOnMinimized2;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 111;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1341191823);
            if ((i & 50) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                    int i7 = onWarmupCompleted + 119;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1341191823);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i9 = onWarmupCompleted + 113;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1341191823, i3, -1, "im.toss.compose.widget.ptr.RippleContent (TdsPullToRefreshContainer.kt:451)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                int i10 = onWarmupCompleted + 19;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                objOnMinimized3 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(M_.onExtraCallback.asBinder()));
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
            }
            float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized3).IAuthTabCallback();
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(M_.onExtraCallback.asBinder()));
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
            }
            float fIAuthTabCallback2 = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized4).IAuthTabCallback();
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                int i12 = onNavigationEvent + 49;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                LottieDrawableExternalSyntheticLambda15 lottieDrawableExternalSyntheticLambda15 = LottieDrawableExternalSyntheticLambda15.IAuthTabCallback;
                objOnMinimized5 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(lottieDrawableExternalSyntheticLambda15.onNavigationEvent() / 2.0f) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback - lottieDrawableExternalSyntheticLambda15.onWarmupCompleted()) / 2.0f)));
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
            }
            float fIAuthTabCallback3 = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized5).IAuthTabCallback();
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized6 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult2);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized6);
            }
            findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized6;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-395136737);
                jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newSessionWithExtras();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-395135553);
                jNewSession = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).newSession();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            List listListOf = CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(jNewSession), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())});
            float f7 = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0) ? 0.06f : 0.8f;
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized7 = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
            }
            getTimebase gettimebase = (getTimebase) objOnMinimized7;
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                int i14 = onNavigationEvent + 119;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                objOnMinimized8 = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized8);
            }
            getTimebase gettimebase2 = (getTimebase) objOnMinimized8;
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized9 = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized9);
            }
            getTimebase gettimebase3 = (getTimebase) objOnMinimized9;
            int i16 = i3 & 112;
            boolean z4 = i16 == 32;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context);
            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if ((z4 | zOnExtraCallback2) || objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized10 = new onWarmupCompleted(z, context, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized10);
            }
            int i17 = (i3 >> 3) & 14;
            isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized10, cameraCaptureResultEmptyCameraCaptureResult2, i17);
            float f8 = (z && onWarmupCompleted(gettimebase3) == 1) ? 0.6f : 0.0f;
            int i18 = z ? 300 : 0;
            getCallToActionButton getcalltoactionbutton = getCallToActionButton.onExtraCallback;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = isSubmitButtonEnabled.IAuthTabCallback(f8, onQueryRefine.onExtraCallbackWithResult(i18, 0, getcalltoactionbutton.IAuthTabCallback(), 2, (Object) null), 0.0f, "bgOpacity", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 20);
            if (z) {
                int i19 = onNavigationEvent + 29;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                if (((Integer) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), new Object[]{gettimebase2}, PushInfo.Companion.onExtraCallback(), 145357155, PushInfo.Companion.onExtraCallback(), -145357146)).intValue() == 1) {
                    int i21 = onNavigationEvent + 93;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    f2 = 5.0f;
                } else {
                    f2 = 1.0f;
                }
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = isSubmitButtonEnabled.IAuthTabCallback(f2, onQueryRefine.onExtraCallbackWithResult(z ? 1000 : 0, 0, getcalltoactionbutton.onTransact(), 2, (Object) null), 0.0f, "rippleScale", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 20);
                if (z) {
                    z2 = true;
                    if (onNavigationEvent(gettimebase) == 1) {
                        f3 = f7;
                    }
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(!z ? 300 : 0, 0, getcalltoactionbutton.IAuthTabCallback(), 2, (Object) null);
                    boolean z5 = z2;
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f3, getthumbpositionOnExtraCallbackWithResult, 0.0f, "rippleOpacity", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 20);
                    z3 = i16 != 32 ? z5 : false;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(findresandmsg);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if ((!zOnExtraCallback && !z3) || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        i4 = i17;
                        f4 = fIAuthTabCallback;
                        f5 = fIAuthTabCallback2;
                        f6 = 0.0f;
                        list = listListOf;
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                        objOnMinimized = new onNavigationEvent(z, findresandmsg, gettimebase3, gettimebase, gettimebase2, null);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
                    } else {
                        i4 = i17;
                        f4 = fIAuthTabCallback;
                        f5 = fIAuthTabCallback2;
                        list = listListOf;
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                        f6 = 0.0f;
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult3, i4);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, f6, 1, (Object) null), 1.0f);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                        int i23 = onWarmupCompleted + 63;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0)) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-327562302);
                        final float f9 = f4;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, f9), f6, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback3 + f), 1, (Object) null);
                        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (zOnNavigationEvent3 || objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized11 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj) {
                                    int i25 = 2 % 2;
                                    int i26 = onNavigationEvent + 93;
                                    onExtraCallbackWithResult = i26 % 128;
                                    if (i26 % 2 != 0) {
                                        LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, (flipHorizontally) obj);
                                        throw null;
                                    }
                                    Unit unitIAuthTabCallback = LottieDrawableExternalSyntheticLambda2.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, (flipHorizontally) obj);
                                    int i27 = onExtraCallbackWithResult + 31;
                                    onNavigationEvent = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        int i28 = 66 / 0;
                                    }
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized11);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2, (Function1) objOnMinimized11);
                        final List list2 = list;
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(list2);
                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (zOnNavigationEvent4 || objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized12 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda7
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj) {
                                    int i25 = 2 % 2;
                                    int i26 = onExtraCallback + 33;
                                    onExtraCallbackWithResult = i26 % 128;
                                    int i27 = i26 % 2;
                                    Unit unitOnExtraCallback = LottieDrawableExternalSyntheticLambda2.onExtraCallback(list2, f9, (setOrientationDegrees) obj);
                                    int i28 = onExtraCallback + 83;
                                    onExtraCallbackWithResult = i28 % 128;
                                    if (i28 % 2 == 0) {
                                        int i29 = 94 / 0;
                                    }
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized12);
                        }
                        isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResult3, 0);
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-326804073);
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(onextracallback, f5, f5), f6, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback3 + f), 1, (Object) null);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (!(zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda8
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj) {
                                int i25 = 2 % 2;
                                int i26 = onNavigationEvent + 17;
                                onExtraCallback = i26 % 128;
                                int i27 = i26 % 2;
                                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                                if (i27 != 0) {
                                    return LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (flipHorizontally) obj);
                                }
                                Unit unitOnWarmupCompleted = LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (flipHorizontally) obj);
                                int i28 = 37 / 0;
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted3, (Function1) objOnMinimized2);
                    Object[] objArr = new Object[1];
                    a(new char[]{24, 19, '\n', '\t', 20, 15, 13841, 13841, 19, '\n', 14, 19, 23, 6, 4, '\r', '\n', 18, 18, 0, 1, 11, 1, 22, 13906, 13906, 20, 18, '\n', 19, 23, 5, 11, '\b', '\b', 11, '\f', 1, 6, 22, 13894, 13894, 15, 1, 21, 22, 7, 5, 0, 1, 0, '\b', 14, 1}, (byte) ((TypedValue.complexToFraction(0, f6, f6) > f6 ? 1 : (TypedValue.complexToFraction(0, f6, f6) == f6 ? 0 : -1)) + 92), 54 - View.resolveSizeAndState(0, 0, 0), objArr);
                    AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallback2, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult3, 6, 508);
                    cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i25 = onWarmupCompleted + 21;
                        onNavigationEvent = i25 % 128;
                        int i26 = i25 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    z2 = true;
                }
                f3 = 0.0f;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult2 = onQueryRefine.onExtraCallbackWithResult(!z ? 300 : 0, 0, getcalltoactionbutton.IAuthTabCallback(), 2, (Object) null);
                boolean z52 = z2;
                cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f3, getthumbpositionOnExtraCallbackWithResult2, 0.0f, "rippleOpacity", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 20);
                if (i16 != 32) {
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(findresandmsg);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnExtraCallback | z3)) {
                    i4 = i17;
                    f4 = fIAuthTabCallback;
                    f5 = fIAuthTabCallback2;
                    f6 = 0.0f;
                    list = listListOf;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    objOnMinimized = new onNavigationEvent(z, findresandmsg, gettimebase3, gettimebase, gettimebase2, null);
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(z), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult3, i4);
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = submit.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, f6, 1, (Object) null), 1.0f);
                    component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0)) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(onextracallback2, f5, f5), f6, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback3 + f), 1, (Object) null);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda8
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj) {
                                int i252 = 2 % 2;
                                int i262 = onNavigationEvent + 17;
                                onExtraCallback = i262 % 128;
                                int i27 = i262 % 2;
                                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
                                if (i27 != 0) {
                                    return LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (flipHorizontally) obj);
                                }
                                Unit unitOnWarmupCompleted = LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (flipHorizontally) obj);
                                int i28 = 37 / 0;
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback22 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted32, (Function1) objOnMinimized2);
                        Object[] objArr2 = new Object[1];
                        a(new char[]{24, 19, '\n', '\t', 20, 15, 13841, 13841, 19, '\n', 14, 19, 23, 6, 4, '\r', '\n', 18, 18, 0, 1, 11, 1, 22, 13906, 13906, 20, 18, '\n', 19, 23, 5, 11, '\b', '\b', 11, '\f', 1, 6, 22, 13894, 13894, 15, 1, 21, 22, 7, 5, 0, 1, 0, '\b', 14, 1}, (byte) ((TypedValue.complexToFraction(0, f6, f6) > f6 ? 1 : (TypedValue.complexToFraction(0, f6, f6) == f6 ? 0 : -1)) + 92), 54 - View.resolveSizeAndState(0, 0, 0), objArr2);
                        AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr2[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallback22, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult3, 6, 508);
                        cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda9
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    int i27 = 2 % 2;
                    int i28 = onExtraCallback + 33;
                    onWarmupCompleted = i28 % 128;
                    int i29 = i28 % 2;
                    Unit unitOnExtraCallback = LottieDrawableExternalSyntheticLambda2.onExtraCallback(f, z, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i30 = onExtraCallback + 49;
                    onWarmupCompleted = i30 % 128;
                    if (i30 % 2 != 0) {
                        int i31 = 43 / 0;
                    }
                    return unitOnExtraCallback;
                }
            });
        }
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: im.toss.compose.widget.ptr.TdsPullToRefreshContainerKt$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 57;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                LottieDrawableExternalSyntheticLambda2.onWarmupCompleted(getsupportedhighspeedresolutionsfor, textFieldScrollKtExternalSyntheticLambda02, onextracallbackwithresult);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(textFieldScrollKtExternalSyntheticLambda0, lifecycleEventObserver);
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return iAuthTabCallbackStub;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3 = (LottieDrawableExternalSyntheticLambda3) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[1], "");
        IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(lottieDrawableExternalSyntheticLambda3);
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = onNavigationEvent + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static final boolean onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return number.floatValue();
        }
        number.floatValue();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(fIAuthTabCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return Float.valueOf(fFloatValue);
        }
        int i5 = 52 / 0;
        return Float.valueOf(fFloatValue);
    }

    private static final boolean onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static final float onTransact(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return number.floatValue();
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float asBinder(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return number.floatValue();
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(ViewGroup viewGroup, ComposeView composeView, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        access000 access000Var = new access000(viewGroup, composeView);
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return access000Var;
    }

    private static final int onNavigationEvent(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            gettimebase.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        int i5 = onNavigationEvent + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void asInterface(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        int i5 = onWarmupCompleted + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final int onWarmupCompleted(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            gettimebase.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i3 = onWarmupCompleted + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iOnWarmupCompleted;
    }

    private static final void onNavigationEvent(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        int i5 = onWarmupCompleted + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            number.floatValue();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        throw null;
    }

    private static final float onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = onWarmupCompleted + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return (Unit) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, 1278164123, iOnExtraCallback3, -1278164111);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, flipHorizontally fliphorizontally) {
        Object[] objArr = {lottieDrawableExternalSyntheticLambda17, Float.valueOf(f), getsupportedhighspeedresolutionsfor, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, fliphorizontally};
        return (Unit) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), 1180762990, PushInfo.Companion.onExtraCallback(), -1180762987);
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, boolean z, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, lottieDrawableExternalSyntheticLambda17, Boolean.valueOf(z), Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), -1650582363, PushInfo.Companion.onExtraCallback(), 1650582374);
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17, float f, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Integer.valueOf(i), lottieDrawableExternalSyntheticLambda17, Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), 1466604454, PushInfo.Companion.onExtraCallback(), -1466604454);
    }

    private static final int IAuthTabCallback(getTimebase gettimebase) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return ((Integer) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{gettimebase}, iOnExtraCallback2, 145357155, iOnExtraCallback3, -145357146)).intValue();
    }

    private static final float IAuthTabCallbackStub(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return ((Float) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnExtraCallback2, -912299624, iOnExtraCallback3, 912299634)).floatValue();
    }

    private static final float onWarmupCompleted(LottieDrawableExternalSyntheticLambda17 lottieDrawableExternalSyntheticLambda17) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return ((Float) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{lottieDrawableExternalSyntheticLambda17}, iOnExtraCallback2, 1327390014, iOnExtraCallback3, -1327390001)).floatValue();
    }

    private static final float asInterface(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return ((Float) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnExtraCallback2, 153285418, iOnExtraCallback3, -153285411)).floatValue();
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), 734369894, PushInfo.Companion.onExtraCallback(), -734369893);
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return ((Boolean) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor}, iOnExtraCallback2, -852525281, iOnExtraCallback3, 852525287)).booleanValue();
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, isInVideoUsage isinvideousage) {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return (decrementVideoUsage) onWarmupCompleted(iOnExtraCallback, PushInfo.Companion.onExtraCallback(), new Object[]{lottieDrawableExternalSyntheticLambda3, isinvideousage}, iOnExtraCallback2, 1284990508, iOnExtraCallback3, -1284990494);
    }

    private static final Unit onExtraCallback(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, float f, int i, LottieDrawableExternalSyntheticLambda3 lottieDrawableExternalSyntheticLambda3, Function0 function0, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {Boolean.valueOf(z), quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Boolean.valueOf(z3), Float.valueOf(f), Integer.valueOf(i), lottieDrawableExternalSyntheticLambda3, function0, function2, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), -731811785, PushInfo.Companion.onExtraCallback(), 731811790);
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), 1018312685, PushInfo.Companion.onExtraCallback(), -1018312683);
    }

    private static final void onExtraCallbackWithResult(boolean z, boolean z2, boolean z3, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), -1756790757, PushInfo.Companion.onExtraCallback(), 1756790765);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getTimebase gettimebase, int i) {
        Object[] objArr = {gettimebase, Integer.valueOf(i)};
        onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), -2036925726, PushInfo.Companion.onExtraCallback(), 2036925741);
    }

    public static final /* synthetic */ void onExtraCallback(getTimebase gettimebase, int i) {
        Object[] objArr = {gettimebase, Integer.valueOf(i)};
        onWarmupCompleted(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), -496630172, PushInfo.Companion.onExtraCallback(), 496630176);
    }
}
