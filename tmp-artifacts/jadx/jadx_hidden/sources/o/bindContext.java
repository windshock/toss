package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import im.toss.devtool.action.quickaction.QuickActionBottomSheetScreenKt$;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.internalStart;
import o.readFully;
import o.s3;
import o.s3c;
import o.s5a;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: classes.dex */
public final class bindContext {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Set<String> IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final String onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    private static final String onWarmupCompleted;

    public static final /* synthetic */ class onActivityResized {
        public static final /* synthetic */ int[] onNavigationEvent;
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onActivityResized.class);

        static {
            int[] iArr = new int[backPressed.values().length];
            try {
                iArr[backPressed.PINNED.ordinal()] = 1;
                int i = onWarmupCompleted;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5226);
                int i2 = (~iOnWarmupCompleted) & i;
                int i3 = (~i) & iOnWarmupCompleted;
                if (((((i3 & i2) | (i2 ^ i3)) >> 7) & 1) != 0) {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[backPressed.ALL.ordinal()] = 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4878);
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int i6 = onWarmupCompleted;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434);
            int i7 = (~iOnWarmupCompleted2) & i6;
            int i8 = (~i6) & iOnWarmupCompleted2;
            if (((((i8 & i7) | (i7 ^ i8)) >> 17) & 1) == 0) {
                throw null;
            }
        }
    }

    public static /* synthetic */ int IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 13;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(i, i2);
        }
        onExtraCallbackWithResult(i, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 15;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            onWarmupCompleted(i, str, str2, quirksExternalSyntheticBackport0, function1, function12, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, str, str2, quirksExternalSyntheticBackport0, function1, function12, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = asBinder + 101;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 66 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 111;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 67;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(function1, function0, str);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function1, function0, str);
        int i3 = asBinder + 25;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1, trytriggeronstart);
        int i4 = asBinder + 117;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, tryTriggerOnStart trytriggeronstart, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(function1, trytriggeronstart, z);
        }
        onExtraCallback(function1, trytriggeronstart, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onEngineInitSuccess onengineinitsuccess, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 7;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(onengineinitsuccess, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(onengineinitsuccess, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(tryTriggerOnStart trytriggeronstart, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(trytriggeronstart, quirksExternalSyntheticBackport0, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        int i6 = onTransact + 31;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        tryTriggerOnStart trytriggeronstart = (tryTriggerOnStart) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(trytriggeronstart, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 71;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, getsupportedhighspeedresolutionsfor, str);
        int i4 = onTransact + 5;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, str, fFloatValue, fFloatValue2);
            throw null;
        }
        float fOnNavigationEvent = onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, str, fFloatValue, fFloatValue2);
        int i3 = asBinder + 87;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return Float.valueOf(fOnNavigationEvent);
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i4 = asBinder + 73;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zAsBinder);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
        int i4 = onTransact + 121;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback(getextensionmanager);
        int i4 = asBinder + 69;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        x2ExternalSyntheticLambda21 x2externalsyntheticlambda21 = (x2ExternalSyntheticLambda21) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        internalStart.onExtraCallback onextracallback = (internalStart.onExtraCallback) objArr[0];
        Map map = (Map) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        Function1 function13 = (Function1) objArr[4];
        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[5];
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(onextracallback, map, function1, function12, function13, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        onExtraCallback(onextracallback, map, function1, function12, function13, audioRestrictionControllerImplExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ResourceManagerInternalAsldcInflateDelegate resourceManagerInternalAsldcInflateDelegateOnNavigationEvent = onNavigationEvent(setdividerpadding);
        int i4 = onTransact + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return resourceManagerInternalAsldcInflateDelegateOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) objArr[1];
        String str = (String) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        Function1 function1 = (Function1) objArr[4];
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, (LiveDataObservableExternalSyntheticLambda1<String>) liveDataObservableExternalSyntheticLambda1, str, fFloatValue, (Function1<? super Float, Unit>) function1);
        int i4 = onTransact + 97;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ int onExtraCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return onWarmupCompleted(i, i2);
        }
        onWarmupCompleted(i, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(onEngineInitSuccess onengineinitsuccess, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(onengineinitsuccess, trytriggeronstart);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return objIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1, trytriggeronstart);
        int i4 = asBinder + 121;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(internalStart.onExtraCallback onextracallback, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, Function1 function1, Function1 function12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str, Map map, Function1 function13, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function1 function14, Function1 function15, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallback, liveDataObservableExternalSyntheticLambda1, function1, function12, getsupportedhighspeedresolutionsfor, str, map, function13, camera2CameraMetadataExternalSyntheticLambda1, function14, function15, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = onTransact + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(tryTriggerOnStart trytriggeronstart, Function1 function1, boolean z, Function1 function12, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 51;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(trytriggeronstart, function1, z, function12, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 33;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(tryTriggerOnStart trytriggeronstart, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(trytriggeronstart, quirksExternalSyntheticBackport0, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onTransact + 5;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 50 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(tryTriggerOnStart trytriggeronstart, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(trytriggeronstart, z, quirksExternalSyntheticBackport0, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = asBinder + 1;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutions, f);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(tryTriggerOnStart trytriggeronstart, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(trytriggeronstart, z, quirksExternalSyntheticBackport0, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setIso setiso) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(j, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setiso);
        int i4 = asBinder + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, Function1 function1, Function1 function12, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, function1, function12, function13, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = onTransact + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 75;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function1, trytriggeronstart);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, long j, internalStart.onExtraCallback onextracallback, Function1 function1, Function1 function12, String str, Map map, Function1 function13, Function1 function14, Function1 function15, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12, List list, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, setDividerDrawable setdividerdrawable, backPressed backpressed, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, j, onextracallback, function1, function12, str, map, function13, function14, function15, camera2CameraMetadataExternalSyntheticLambda12, list, liveDataObservableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, setdividerdrawable, backpressed, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, j, onextracallback, function1, function12, str, map, function13, function14, function15, camera2CameraMetadataExternalSyntheticLambda12, list, liveDataObservableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, setdividerdrawable, backpressed, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(setRubIn setrubin, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function0 function02, backPressed backpressed, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 33;
        onTransact = i5 % 128;
        onExtraCallback(setrubin, function0, function1, function12, function13, function14, function15, function16, function02, backpressed, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 75;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(tryTriggerOnStart trytriggeronstart, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 31;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(trytriggeronstart, quirksExternalSyntheticBackport0, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asBinder + 123;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(tryTriggerOnStart trytriggeronstart, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(trytriggeronstart, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(trytriggeronstart, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(int i, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 19;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(i, str, str2, quirksExternalSyntheticBackport0, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, i2, i3);
        int i7 = asBinder + 37;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(getsupportedhighspeedresolutions, f);
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        v1 v1Var = (v1) objArr[0];
        internalStart.onExtraCallback onextracallback = (internalStart.onExtraCallback) objArr[1];
        Map map = (Map) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        Function1 function12 = (Function1) objArr[4];
        Function1 function13 = (Function1) objArr[5];
        Function1 function14 = (Function1) objArr[6];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[7];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[8];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[9];
        Function1 function15 = (Function1) objArr[10];
        String str = (String) objArr[11];
        Function1 function16 = (Function1) objArr[12];
        List list = (List) objArr[13];
        LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1 = (LiveDataObservableExternalSyntheticLambda1) objArr[14];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[15];
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[16];
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objArr[17];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[18];
        int iIntValue = ((Number) objArr[19]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(v1Var, onextracallback, map, function1, function12, function13, function14, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, camera2CameraMetadataExternalSyntheticLambda1, function15, str, function16, list, liveDataObservableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallback(v1Var, onextracallback, map, function1, function12, function13, function14, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, camera2CameraMetadataExternalSyntheticLambda1, function15, str, function16, list, liveDataObservableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutions);
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ String onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
        }
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 6 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 23 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(function1, str);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, str);
        int i3 = onTransact + 23;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function1, trytriggeronstart);
        int i4 = asBinder + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(backPressed backpressed, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(backpressed, getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(backpressed, getsupportedhighspeedresolutionsfor);
        int i3 = onTransact + 55;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(findresandmsg, v1Var);
        int i4 = asBinder + 11;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setRubIn setrubin, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function0 function02, backPressed backpressed, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 63;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setrubin, function0, function1, function12, function13, function14, function15, function16, function02, backpressed, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asBinder + 89;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(tryTriggerOnStart trytriggeronstart, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 87;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(trytriggeronstart, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 115;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(tryTriggerOnStart trytriggeronstart, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 75;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(trytriggeronstart, z, quirksExternalSyntheticBackport0, function1, function12, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asBinder + 37;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        int i4 = asBinder + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ float onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(getsupportedhighspeedresolutions);
            throw null;
        }
        float fIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutions);
        int i3 = onTransact + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return fIAuthTabCallback;
    }

    private static final int onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 109;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        int i7 = (-i2) * i;
        int i8 = i5 + 13;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object onWarmupCompleted(int r15, int r16, java.lang.Object[] r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onWarmupCompleted(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, getExtensionManager getextensionmanager) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(i, getextensionmanager);
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(i, getextensionmanager);
        int i4 = onTransact + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(trytriggeronstart);
            obj.hashCode();
            throw null;
        }
        Object objOnNavigationEvent = onNavigationEvent(trytriggeronstart);
        int i3 = onTransact + 69;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = iIntValue2 * iIntValue;
        int i6 = i3 + 29;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(i5);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = asBinder + 43;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            onNavigationEvent(i, str, str2, quirksExternalSyntheticBackport0, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            onNavigationEvent(i, str, str2, quirksExternalSyntheticBackport0, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 5;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 75 / 0;
        }
        int i6 = asBinder + 85;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, getsupportedhighspeedresolutionsfor);
        int i4 = onTransact + 61;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function1, trytriggeronstart);
        int i4 = onTransact + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(internalStart.onExtraCallback onextracallback, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function1 function15, String str, Function1 function16, List list, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 75;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallback, map, function1, function12, function13, function14, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, camera2CameraMetadataExternalSyntheticLambda1, function15, str, function16, list, liveDataObservableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 14 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(tryTriggerOnStart trytriggeronstart, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 109;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(trytriggeronstart, quirksExternalSyntheticBackport0, function1, function12, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asBinder + 61;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(tryTriggerOnStart trytriggeronstart, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 23;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            asInterface(trytriggeronstart, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(trytriggeronstart, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static final /* synthetic */ void onWarmupCompleted(tryTriggerOnStart trytriggeronstart, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 53;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(trytriggeronstart, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        int i6 = onTransact + 81;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        tryTriggerOnStart trytriggeronstart = (tryTriggerOnStart) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        RightPreset rightPreset = (RightPreset) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(trytriggeronstart, function1, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 11;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class ICustomTabsCallback implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static long onExtraCallbackWithResult = 1478272578759851364L;
        private static int onNavigationEvent;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onExtraCallback;
        final /* synthetic */ Function1 onWarmupCompleted;

        public ICustomTabsCallback(List list, Function1 function1, Function1 function12) {
            this.IAuthTabCallback = list;
            this.onWarmupCompleted = function1;
            this.onExtraCallback = function12;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                int i3 = $10 + 43;
                $11 = i3 % 128;
                int i4 = i3 % 2;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i5 = $11 + 87;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void IAuthTabCallback(o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 r16, int r17, o.CameraCaptureResultEmptyCameraCaptureResult r18, int r19) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindContext.ICustomTabsCallback.IAuthTabCallback(o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, int, o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 51;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return unit;
        }
    }

    public static final class access100 implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static long asBinder = 8833972760776350914L;
        private static int onTransact = 1;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onExtraCallback;
        final /* synthetic */ Map onExtraCallbackWithResult;
        final /* synthetic */ Function1 onNavigationEvent;
        final /* synthetic */ Function1 onWarmupCompleted;

        public access100(List list, Map map, Function1 function1, Function1 function12, Function1 function13) {
            this.IAuthTabCallback = list;
            this.onExtraCallbackWithResult = map;
            this.onWarmupCompleted = function1;
            this.onExtraCallback = function12;
            this.onNavigationEvent = function13;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $11 + 19;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = $11 + 125;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0) & (asBinder * 5407414049857832247L);
                } else {
                    jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (5407414049857832247L ^ asBinder) ^ s3.onWarmupCompleted.AnonymousClass2.u(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback], audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
                }
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 29;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                SafeWindowLayoutComponentProviderExternalSyntheticLambda1.D(audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0);
            }
            objArr[0] = new String(cArr2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onTransact + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 105;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            boolean z;
            int i4;
            int i5 = 2 % 2;
            if ((i2 & 6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                    int i6 = IAuthTabCallbackStub + 51;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i3 = i4 | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                int i8 = onTransact + 5;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 4;
                }
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a(new char[]{39316, 47838, 57115, 61512, 5262, 10693, 18959, 28526, 33779, 42235, 63784, 6767, 16057, 21275, 29760, 34971, 44427, 52742, 58176, 1951, 22783, 32056, 40570, 45746, 55268, 59431, 3225, 8604, 16917, 26437, 48025, 56535, 61819, 4729, 13995, 19455, 27692, 33151, 42469, 50762, 7004, 16278, 20680, 29964, 38480, 43705, 53244, 57387, 1398, 23038, 31407, 40802, 46013, 54493, 59649, 2655, 11945, 17371, 25659, 47420, 56754, 65264, 4985, 13375, 18562, 27976, 36374}, (ViewConfiguration.getTapTimeout() >> 16) + 9029, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, ((String) objArr[0]).intern());
            }
            getExtensionManager getextensionmanager = (getExtensionManager) this.IAuthTabCallback.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1488935204);
            tryTriggerOnStart trytriggeronstart = (tryTriggerOnStart) this.onExtraCallbackWithResult.get(getextensionmanager.onWarmupCompleted());
            if (trytriggeronstart != null) {
                if (trytriggeronstart.onNavigationEvent() != null) {
                    int i10 = onTransact + 43;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1488858201);
                    bindContext.onExtraCallback(trytriggeronstart, true, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null), this.onWarmupCompleted, this.onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1488509482);
                    bindContext.IAuthTabCallback(trytriggeronstart, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null), this.onNavigationEvent, this.onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = IAuthTabCallbackStub + 95;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = IAuthTabCallbackStub + 75;
            onTransact = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 12, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16642), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(12 - Drawable.resolveOpacity(0, 0), 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42855), objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 12 - Color.blue(0), (char) (16642 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(33 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, (char) KeyEvent.keyCodeFromString(""), objArr4);
        IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{strIntern, ((String) objArr4[0]).intern()});
        int i = asInterface + 111;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 81;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i6] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onNavigationEvent[i + i6]), i6, onExtraCallbackWithResult, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 61;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        String str = new String(cArr);
        int i8 = $10 + 25;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 10927;
        private static int IAuthTabCallbackStub = 1;
        private static char onExtraCallback = 3893;
        private static char onExtraCallbackWithResult = 54210;
        private static char onNavigationEvent = 39791;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> $draggingKey$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> $query$delegate;
        final /* synthetic */ LiveDataObservableExternalSyntheticLambda1<String> $quickOrder;
        final /* synthetic */ internalStart.onExtraCallback $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(internalStart.onExtraCallback onextracallback, LiveDataObservableExternalSyntheticLambda1<String> liveDataObservableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$success = onextracallback;
            this.$quickOrder = liveDataObservableExternalSyntheticLambda1;
            this.$draggingKey$delegate = getsupportedhighspeedresolutionsfor;
            this.$query$delegate = getsupportedhighspeedresolutionsfor2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$success, this.$quickOrder, this.$draggingKey$delegate, this.$query$delegate, access13800Var);
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallbackStub = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            onWarmupCompleted(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i3 = $11 + 87;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i5 = 58224;
                for (int i6 = 0; i6 < 16; i6++) {
                    int i7 = $10 + 119;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), c2 >>> 5, onNavigationEvent);
                    cArr3[1] = C;
                    cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (onExtraCallback ^ 1094535280733222934L))), C >>> 5, onExtraCallbackWithResult);
                    i5 -= 40503;
                }
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            if (o.bindContext.IAuthTabCallback(r4.$draggingKey$delegate) != null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (o.bindContext.onNavigationEvent(r4.$query$delegate).length() != 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            r5 = o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub + 123;
            o.bindContext.onExtraCallbackWithResult.onWarmupCompleted = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if ((r5 % 2) == 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            r5 = r4.$success;
            r1 = 43 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            if (r5 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        
            r5 = r4.$success;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            if (r5 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            r5 = r5.IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            if (r5 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        
            r5 = r5;
            r1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, 10));
            r5 = r5.iterator();
            r2 = o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub + 119;
            o.bindContext.onExtraCallbackWithResult.onWarmupCompleted = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
        
            if (r5.hasNext() == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        
            r1.add(((o.getExtensionManager) r5.next()).onWarmupCompleted());
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        
            r5 = o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub + 63;
            o.bindContext.onExtraCallbackWithResult.onWarmupCompleted = r5 % 128;
            r5 = r5 % 2;
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
        
            if (r1 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            r1 = kotlin.collections.CollectionsKt.emptyList();
            r5 = o.bindContext.onExtraCallbackWithResult.onWarmupCompleted + 105;
            o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4.$quickOrder.onWarmupCompleted(), r1) != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
        
            r4.$quickOrder.clear();
            r4.$quickOrder.addAll(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        
            if (o.bindContext.IAuthTabCallback(r4.$draggingKey$delegate) != null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = r4.label
                r2 = 0
                if (r1 != 0) goto Lb8
                int r1 = o.bindContext.onExtraCallbackWithResult.onWarmupCompleted
                int r1 = r1 + 33
                int r3 = r1 % 128
                o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub = r3
                int r1 = r1 % r0
                kotlin.ResultKt.onNavigationEvent(r5)
                if (r1 != 0) goto L22
                o.getSupportedHighSpeedResolutionsFor<java.lang.String> r5 = r4.$draggingKey$delegate
                java.lang.String r5 = o.bindContext.IAuthTabCallback(r5)
                r1 = 17
                int r1 = r1 / r2
                if (r5 == 0) goto L2d
                goto L2a
            L22:
                o.getSupportedHighSpeedResolutionsFor<java.lang.String> r5 = r4.$draggingKey$delegate
                java.lang.String r5 = o.bindContext.IAuthTabCallback(r5)
                if (r5 == 0) goto L2d
            L2a:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L2d:
                o.getSupportedHighSpeedResolutionsFor<java.lang.String> r5 = r4.$query$delegate
                java.lang.String r5 = o.bindContext.onNavigationEvent(r5)
                int r5 = r5.length()
                if (r5 != 0) goto L90
                int r5 = o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub
                int r5 = r5 + 123
                int r1 = r5 % 128
                o.bindContext.onExtraCallbackWithResult.onWarmupCompleted = r1
                int r5 = r5 % r0
                if (r5 == 0) goto L4c
                o.internalStart$onExtraCallback r5 = r4.$success
                r1 = 43
                int r1 = r1 / r2
                if (r5 == 0) goto L84
                goto L50
            L4c:
                o.internalStart$onExtraCallback r5 = r4.$success
                if (r5 == 0) goto L84
            L50:
                java.util.List r5 = r5.IAuthTabCallback()
                if (r5 == 0) goto L84
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r2)
                r1.<init>(r2)
                java.util.Iterator r5 = r5.iterator()
                int r2 = o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub
                int r2 = r2 + 119
                int r3 = r2 % 128
                o.bindContext.onExtraCallbackWithResult.onWarmupCompleted = r3
                int r2 = r2 % r0
            L70:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L8e
                java.lang.Object r2 = r5.next()
                o.getExtensionManager r2 = (o.getExtensionManager) r2
                java.lang.String r2 = r2.onWarmupCompleted()
                r1.add(r2)
                goto L70
            L84:
                int r5 = o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub
                int r5 = r5 + 63
                int r1 = r5 % 128
                o.bindContext.onExtraCallbackWithResult.onWarmupCompleted = r1
                int r5 = r5 % r0
                r1 = 0
            L8e:
                if (r1 != 0) goto L9d
            L90:
                java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
                int r5 = o.bindContext.onExtraCallbackWithResult.onWarmupCompleted
                int r5 = r5 + 105
                int r2 = r5 % 128
                o.bindContext.onExtraCallbackWithResult.IAuthTabCallbackStub = r2
                int r5 = r5 % r0
            L9d:
                o.LiveDataObservableExternalSyntheticLambda1<java.lang.String> r5 = r4.$quickOrder
                java.util.List r5 = r5.onWarmupCompleted()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
                if (r5 != 0) goto Lb5
                o.LiveDataObservableExternalSyntheticLambda1<java.lang.String> r5 = r4.$quickOrder
                r5.clear()
                o.LiveDataObservableExternalSyntheticLambda1<java.lang.String> r5 = r4.$quickOrder
                java.util.Collection r1 = (java.util.Collection) r1
                r5.addAll(r1)
            Lb5:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            Lb8:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r0 = 48
                char[] r0 = new char[r0]
                r0 = {x00dc: FILL_ARRAY_DATA , data: [28460, 18172, 5207, 19054, 2500, 18853, -10425, -13725, -30382, 6131, 25447, -25298, -7584, -19174, 25991, -6774, 5352, -15587, -28483, -30583, -7051, -27604, -10099, 10263, -14555, 30444, 9472, -22787, 8682, 21553, 25991, -6774, 22510, -21504, -22503, -2883, -17691, 24632, -24581, -8758, -10987, 10759, 16122, -584, 475, 10460, 5076, 22664} // fill-array
                int r1 = android.view.KeyEvent.getMaxKeyCode()
                int r1 = r1 >> 16
                int r1 = r1 + 47
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                a(r0, r1, r3)
                r0 = r3[r2]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 15601;
        private static int asInterface = 1;
        private static char onExtraCallback = 63854;
        private static char onExtraCallbackWithResult = 42332;
        private static int onNavigationEvent = 0;
        private static char onWarmupCompleted = 51127;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(v1 v1Var, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$sheetState, access13800Var);
            int i2 = onNavigationEvent + 39;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = asInterface + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 31;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i3 = $10 + 121;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i5 = 58224;
                for (int i6 = 0; i6 < 16; i6++) {
                    int i7 = $10 + 117;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L))), c2 >>> 5, onExtraCallback);
                    cArr3[1] = C;
                    cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), C >>> 5, onExtraCallbackWithResult);
                    i5 -= 40503;
                }
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[PHI: r1
          0x005e: PHI (r1v11 java.lang.Object) = (r1v4 java.lang.Object), (r1v12 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.bindContext.onTransact.onNavigationEvent
                int r1 = r1 + 69
                int r2 = r1 % 128
                o.bindContext.onTransact.asInterface = r2
                int r1 = r1 % r0
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L1c
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r4 = r8.label
                r5 = 68
                int r5 = r5 / r2
                if (r4 == 0) goto L5e
                goto L24
            L1c:
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r4 = r8.label
                if (r4 == 0) goto L5e
            L24:
                int r1 = o.bindContext.onTransact.onNavigationEvent
                int r1 = r1 + 37
                int r5 = r1 % 128
                o.bindContext.onTransact.asInterface = r5
                int r1 = r1 % r0
                if (r4 != r3) goto L3a
                int r5 = r5 + 5
                int r1 = r5 % 128
                o.bindContext.onTransact.onNavigationEvent = r1
                int r5 = r5 % r0
                kotlin.ResultKt.onNavigationEvent(r9)
                goto L76
            L3a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r0 = 48
                char[] r0 = new char[r0]
                r0 = {x007a: FILL_ARRAY_DATA , data: [-24842, -18695, -4939, -11558, -494, 31282, 6651, 30877, -23000, -29516, 27358, 11493, 19141, 7829, 9944, -1147, -15426, -6248, 6693, -26125, -28777, 21567, -13112, 21475, -32247, -23241, 32456, 9495, 19801, -14197, 9944, -1147, -12684, 23489, 11139, -5710, -12026, -22609, 10519, -14301, -17305, -18928, 32059, 28992, -30250, 2286, -6937, 19691} // fill-array
                long r4 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                int r1 = r1 + 46
                java.lang.Object[] r3 = new java.lang.Object[r3]
                a(r0, r1, r3)
                r0 = r3[r2]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r9.<init>(r0)
                throw r9
            L5e:
                kotlin.ResultKt.onNavigationEvent(r9)
                o.v1 r9 = r8.$sheetState
                r8.label = r3
                r2 = 0
                java.lang.Object r9 = o.v1.onExtraCallback(r9, r2, r8, r3, r2)
                if (r9 != r1) goto L76
                int r9 = o.bindContext.onTransact.asInterface
                int r9 = r9 + 91
                int r2 = r9 % 128
                o.bindContext.onTransact.onNavigationEvent = r2
                int r9 = r9 % r0
                return r1
            L76:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class getInterfaceDescriptor implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback_Parcel = 0;
        private static int access000 = 478308870;
        private static int access100 = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor IAuthTabCallback;
        final /* synthetic */ Function1 IAuthTabCallbackDefault;
        final /* synthetic */ Function1 IAuthTabCallbackStub;
        final /* synthetic */ Function1 asBinder;
        final /* synthetic */ LiveDataObservableExternalSyntheticLambda1 asInterface;
        final /* synthetic */ getSupportedHighSpeedResolutions onExtraCallback;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutions onNavigationEvent;
        final /* synthetic */ Function1 onTransact;
        final /* synthetic */ List onWarmupCompleted;

        public getInterfaceDescriptor(List list, Function1 function1, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function1 function12, Function1 function13, Function1 function14, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1) {
            this.onWarmupCompleted = list;
            this.IAuthTabCallbackDefault = function1;
            this.onExtraCallbackWithResult = camera2CameraMetadataExternalSyntheticLambda1;
            this.asBinder = function12;
            this.onTransact = function13;
            this.IAuthTabCallbackStub = function14;
            this.IAuthTabCallback = getsupportedhighspeedresolutionsfor;
            this.onNavigationEvent = getsupportedhighspeedresolutions;
            this.onExtraCallback = getsupportedhighspeedresolutions2;
            this.asInterface = liveDataObservableExternalSyntheticLambda1;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i5] = access000.g(cArr2[i5], access000);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            if (i2 > 0) {
                int i6 = $11 + 3;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                int i8 = $10 + 45;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i10 = $11 + 77;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 109;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 83 / 0;
            }
            int i5 = IAuthTabCallback_Parcel + 17;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onExtraCallbackWithResult(o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 r25, int r26, o.CameraCaptureResultEmptyCameraCaptureResult r27, int r28) {
            /*
                Method dump skipped, instructions count: 503
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindContext.getInterfaceDescriptor.onExtraCallbackWithResult(o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, int, o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 478309054;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutions $autoScrollSpeed$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutions $dragOffsetY$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> $draggingKey$delegate;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $lazyListState;
        final /* synthetic */ LiveDataObservableExternalSyntheticLambda1<String> $quickOrder;
        float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, LiveDataObservableExternalSyntheticLambda1<String> liveDataObservableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$lazyListState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$quickOrder = liveDataObservableExternalSyntheticLambda1;
            this.$draggingKey$delegate = getsupportedhighspeedresolutionsfor;
            this.$autoScrollSpeed$delegate = getsupportedhighspeedresolutions;
            this.$dragOffsetY$delegate = getsupportedhighspeedresolutions2;
        }

        public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(getsupportedhighspeedresolutions, f);
            }
            onWarmupCompleted(getsupportedhighspeedresolutions, f);
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(j);
            int i4 = onExtraCallback + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 33 / 0;
            }
            return unitOnExtraCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$lazyListState, this.$quickOrder, this.$draggingKey$delegate, this.$autoScrollSpeed$delegate, this.$dragOffsetY$delegate, access13800Var);
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i5 = $11 + 107;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                cArr2[i7] = access000.g(cArr2[i7], IAuthTabCallback);
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                int i8 = $10 + 37;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            bindContext.onExtraCallbackWithResult(getsupportedhighspeedresolutions, bindContext.onWarmupCompleted(getsupportedhighspeedresolutions) + f);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit onExtraCallback(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        
            if (r12 != r1) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ae A[PHI: r2
          0x00ae: PHI (r2v1 float) = (r2v2 float), (r2v3 float) binds: [B:19:0x0084, B:16:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00bb -> B:15:0x006e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r2 = r11.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L57
                int r5 = o.bindContext.onExtraCallback.onExtraCallback
                int r5 = r5 + 97
                int r6 = r5 % 128
                o.bindContext.onExtraCallback.onWarmupCompleted = r6
                int r5 = r5 % r0
                if (r2 == r4) goto L51
                if (r2 != r0) goto L1e
                kotlin.ResultKt.onNavigationEvent(r12)
                goto L6e
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                int r0 = android.os.Process.myTid()
                int r0 = r0 >> 22
                r1 = 47
                int r5 = r0 + 47
                float r0 = android.media.AudioTrack.getMaxVolume()
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                int r6 = r0 + 37
                char[] r7 = new char[r1]
                r7 = {x00be: FILL_ARRAY_DATA , data: [22, 9, 23, 25, 17, 9, -53, -60, 6, 9, 10, 19, 22, 9, -60, -53, 13, 18, 26, 19, 15, 9, -53, -60, 27, 13, 24, 12, -60, 7, 19, 22, 19, 25, 24, 13, 18, 9, 7, 5, 16, 16, -60, 24, 19, -60, -53} // fill-array
                r8 = 0
                r0 = 0
                int r1 = android.view.KeyEvent.normalizeMetaState(r0)
                int r9 = r1 + 243
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r10 = r1
                a(r5, r6, r7, r8, r9, r10)
                r0 = r1[r0]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r12.<init>(r0)
                throw r12
            L51:
                float r2 = r11.F$0
                kotlin.ResultKt.onNavigationEvent(r12)
                goto L84
            L57:
                kotlin.ResultKt.onNavigationEvent(r12)
                o.getSupportedHighSpeedResolutionsFor<java.lang.String> r12 = r11.$draggingKey$delegate
                java.lang.String r12 = o.bindContext.IAuthTabCallback(r12)
                if (r12 != 0) goto L6e
                int r12 = o.bindContext.onExtraCallback.onWarmupCompleted
                int r12 = r12 + 125
                int r1 = r12 % 128
                o.bindContext.onExtraCallback.onExtraCallback = r1
                int r12 = r12 % r0
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            L6e:
                o.getSupportedHighSpeedResolutions r12 = r11.$autoScrollSpeed$delegate
                float r2 = o.bindContext.onNavigationEvent(r12)
                int r12 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r12 == 0) goto Lae
                o.Camera2CameraMetadataExternalSyntheticLambda1 r12 = r11.$lazyListState
                r11.F$0 = r2
                r11.label = r4
                java.lang.Object r12 = o.Camera2CameraImplExternalSyntheticLambda14.onExtraCallbackWithResult(r12, r2, r11)
                if (r12 == r1) goto Lbd
            L84:
                java.lang.Number r12 = (java.lang.Number) r12
                float r12 = r12.floatValue()
                o.getSupportedHighSpeedResolutions r5 = r11.$dragOffsetY$delegate
                float r6 = o.bindContext.onWarmupCompleted(r5)
                float r6 = r6 + r12
                o.bindContext.onExtraCallbackWithResult(r5, r6)
                o.Camera2CameraMetadataExternalSyntheticLambda1 r12 = r11.$lazyListState
                o.LiveDataObservableExternalSyntheticLambda1<java.lang.String> r5 = r11.$quickOrder
                o.getSupportedHighSpeedResolutionsFor<java.lang.String> r6 = r11.$draggingKey$delegate
                java.lang.String r6 = o.bindContext.IAuthTabCallback(r6)
                o.getSupportedHighSpeedResolutions r7 = r11.$dragOffsetY$delegate
                float r7 = o.bindContext.onWarmupCompleted(r7)
                im.toss.devtool.action.quickaction.QuickActionBottomSheetScreenKt$QuickActionBottomSheetScreen$2$1$$ExternalSyntheticLambda0 r8 = new im.toss.devtool.action.quickaction.QuickActionBottomSheetScreenKt$QuickActionBottomSheetScreen$2$1$$ExternalSyntheticLambda0
                o.getSupportedHighSpeedResolutions r9 = r11.$dragOffsetY$delegate
                r8.<init>(r9)
                o.bindContext.onExtraCallbackWithResult(r12, r5, r6, r7, r8)
            Lae:
                im.toss.devtool.action.quickaction.QuickActionBottomSheetScreenKt$QuickActionBottomSheetScreen$2$1$$ExternalSyntheticLambda1 r12 = new im.toss.devtool.action.quickaction.QuickActionBottomSheetScreenKt$QuickActionBottomSheetScreen$2$1$$ExternalSyntheticLambda1
                r12.<init>()
                r11.F$0 = r2
                r11.label = r0
                java.lang.Object r12 = o.addSessionCaptureCallback.IAuthTabCallback(r12, r11)
                if (r12 != r1) goto L6e
            Lbd:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent;
        final /* synthetic */ v1 $sheetState;
        int label;
        private static char[] onWarmupCompleted = {32517, 32519, 32572, 32704, 32564, 32561, 32761, 32566, 32571, 32565, 32555, 32563, 32518, 32570, 32575, 32562, 32554, 32573, 32553, 32568};
        private static int onExtraCallback = -1184333920;
        private static boolean IAuthTabCallback = true;
        private static boolean onExtraCallbackWithResult = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(v1 v1Var, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$sheetState, access13800Var);
            int i2 = IAuthTabCallbackDefault + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallbackDefault + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 115;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$sheetState;
                this.label = 1;
                if (v1.IAuthTabCallback(v1Var, (u5b) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallbackDefault + 31;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 39 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallbackDefault + 125;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onWarmupCompleted;
            if (cArr2 != null) {
                int i3 = $11 + 95;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = $11 + 7;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr3[i5] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i5]);
                }
                cArr2 = cArr3;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onExtraCallback);
            if (onExtraCallbackWithResult) {
                int i8 = $10 + 43;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                String str = new String(cArr4);
                int i10 = $11 + 61;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str;
                return;
            }
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $10 + 7;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static short[] IAuthTabCallback = null;
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private static int onExtraCallback = -1538795475;
        private static byte[] onExtraCallbackWithResult = {-75, 71, -73, -51, 70, -49, 89, 80, 25, 4, -56, 81, -54, 21, -61, -102, -62, -64, -61, 84, 71, 26, 69, 1, -55, 89, 83, 91, 89, 26, -61, -102, -60, -60, 90, 94, -55, 17, 69, 11, -63, 40, 8, 92, 81, -50, 8};
        private static int onNavigationEvent = -1758721211;
        private static int onWarmupCompleted = -1732852781;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $appeared$delegate;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(v1 v1Var, Function0<Unit> function0, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
            this.$onDismiss = function0;
            this.$appeared$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$sheetState, this.$onDismiss, this.$appeared$delegate, access13800Var);
            int i2 = asInterface + 113;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 51;
            asInterface = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = asInterface + 15;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                Object[] objArr = new Object[1];
                a((short) ((-13) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) (71 - View.MeasureSpec.getSize(0)), (-862704461) - ((Process.getThreadPriority(0) + 20) >> 6), (-1022434168) - (Process.myPid() >> 22), (Process.myPid() >> 22) + 10, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i2 = IAuthTabCallbackStub + 77;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (this.$sheetState.IAuthTabCallback_Parcel()) {
                int i4 = asInterface + 23;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                bindContext.onNavigationEvent((getSupportedHighSpeedResolutionsFor) this.$appeared$delegate, true);
            } else if (!(!bindContext.onExtraCallbackWithResult(this.$appeared$delegate))) {
                int i6 = asInterface + 13;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                this.$onDismiss.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[PHI: r0
          0x0098: PHI (r0v5 int) = (r0v4 int), (r0v21 int) binds: [B:27:0x0096, B:24:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[PHI: r0
          0x00a1: PHI (r0v18 int) = (r0v4 int), (r0v21 int) binds: [B:27:0x0096, B:24:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r15, byte r16, int r17, int r18, int r19, java.lang.Object[] r20) {
            /*
                Method dump skipped, instructions count: 352
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onWarmupCompleted.a(short, byte, int, int, int, java.lang.Object[]):void");
        }
    }

    public static final class IAuthTabCallbackStub implements Function1 {
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallbackStub.class);
        public static final IAuthTabCallbackStub onNavigationEvent = new IAuthTabCallbackStub();

        static {
            int i = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3684);
            int i2 = (~iOnWarmupCompleted) & i;
            int i3 = (~i) & iOnWarmupCompleted;
            if (((((i3 & i2) | (i2 ^ i3)) >> 27) & 1) == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Void onExtraCallbackWithResult(getExtensionManager getextensionmanager) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2462);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
            return null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
            Void voidOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4267);
            return voidOnExtraCallbackWithResult;
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function1 {
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallback_Parcel.class);
        public static final IAuthTabCallback_Parcel onNavigationEvent = new IAuthTabCallback_Parcel();

        static {
            int i = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792);
            int i2 = i & iOnWarmupCompleted;
            if ((((((i ^ iOnWarmupCompleted) | i2) & (~i2)) >> 19) & 1) != 0) {
                int i3 = 12 / 0;
            }
        }

        public final Void onWarmupCompleted(tryTriggerOnStart trytriggeronstart) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
            int i2 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
            if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 28) & 1) == 0) {
                return null;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
            int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 17) & 1;
            Void voidOnWarmupCompleted = onWarmupCompleted(obj);
            if (i3 != 0) {
                int i4 = 38 / 0;
            }
            return voidOnWarmupCompleted;
        }
    }

    public static final class extraCallbackWithResult implements Function1 {
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(extraCallbackWithResult.class);
        public static final extraCallbackWithResult onExtraCallback = new extraCallbackWithResult();

        static {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1851);
        }

        public final Void onWarmupCompleted(tryTriggerOnStart trytriggeronstart) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4290);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            if (((((i4 & i3) | (i3 ^ i4)) >> 14) & 1) == 0) {
                return null;
            }
            int i5 = 85 / 0;
            return null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int iOnWarmupCompleted = ((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624)) >> 19) & 1;
            Void voidOnWarmupCompleted = onWarmupCompleted(obj);
            if (iOnWarmupCompleted != 0) {
                int i2 = 27 / 0;
            }
            return voidOnWarmupCompleted;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent((findResAndMsg) objArr[0], (CoroutineContext) null, (setRandomHost) null, new onTransact((v1) objArr[1], null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 87;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class onPostMessage implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        final /* synthetic */ Function1 onExtraCallback;
        final /* synthetic */ Function1 onExtraCallbackWithResult;
        final /* synthetic */ List onNavigationEvent;
        final /* synthetic */ Function1 onWarmupCompleted;
        private static char[] IAuthTabCallback = {32517, 32560, 32570, 32564, 32567, 32573, 32558, 32752, 32571, 32561, 32566, 32555, 32569, 32568, 32553, 32554, 32562, 32556, 32557, 32738, 32736, 32710, 32766, 32530, 32538, 32563, 32748, 32757, 32751, 32750, 32765};
        private static int onTransact = -1184333914;
        private static boolean asBinder = true;
        private static boolean IAuthTabCallbackStub = true;

        public onPostMessage(List list, Function1 function1, Function1 function12, Function1 function13) {
            this.onNavigationEvent = list;
            this.onExtraCallback = function1;
            this.onExtraCallbackWithResult = function12;
            this.onWarmupCompleted = function13;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = IAuthTabCallback;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    int i4 = $10 + 27;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        cArr4[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i3]);
                        i3 %= 0;
                    } else {
                        cArr4[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i3]);
                        i3++;
                    }
                }
                cArr3 = cArr4;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onTransact);
            if (IAuthTabCallbackStub) {
                int i5 = $11 + 13;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 113;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                    int i9 = $10 + 115;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!asBinder) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i11 = $11 + 39;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 61;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            int i4 = 2 % 2;
            Object obj = null;
            if ((i2 & 6) == 0) {
                int i5 = IAuthTabCallbackDefault + 79;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0);
                    obj.hashCode();
                    throw null;
                }
                i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                int i6 = IAuthTabCallbackDefault + 19;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                    throw null;
                }
                i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asInterface + 93;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-97, -98, -99, -100, -101, -112, -102, -120, -111, -116, -103, -109, -110, -127, -104, -105, -106, -107, -116, -113, -123, -118, -109, -126, -123, -126, -127, -108, -120, -116, -118, -115, -112, -122, -120, -109, -110, -127, -111, -120, -126, -123, -122, -112, -127, -125, -126, -113, -123, -114, -120, -115, -116, -123, -117, -118, -123, -119, -120, -121, -125, -122, -123, -124, -125, -126, -127}, 127 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, ((String) objArr[0]).intern());
            }
            tryTriggerOnStart trytriggeronstart = (tryTriggerOnStart) this.onNavigationEvent.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1980861116);
            onLoadResult.onNavigationEvent(trytriggeronstart, false, this.onExtraCallback, this.onExtraCallbackWithResult, this.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 48);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallbackDefault + 45;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            int i11 = asInterface + 79;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    public static final class IAuthTabCallbackDefault implements Function1<Integer, Object> {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallbackDefault.class);
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onExtraCallback;

        public IAuthTabCallbackDefault(Function1 function1, List list) {
            this.onExtraCallback = function1;
            this.IAuthTabCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5320);
            int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 11) & 1;
            int iIntValue = ((Number) obj).intValue();
            if (i3 == 0) {
                objOnExtraCallback = onExtraCallback(iIntValue);
                int i4 = 94 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(iIntValue);
            }
            int i5 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
            if ((((((~i5) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i5)) >> 1) & 1) == 0) {
                int i6 = 1 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
            int i4 = (~iOnWarmupCompleted) & i3;
            int i5 = (~i3) & iOnWarmupCompleted;
            if (((((i5 & i4) | (i4 ^ i5)) >> 3) & 1) != 0) {
                this.IAuthTabCallback.get(i);
                throw null;
            }
            Object objInvoke = this.onExtraCallback.invoke(this.IAuthTabCallback.get(i));
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
            return objInvoke;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Function1<Integer, Object> {
        private static final byte[] $$a;
        final /* synthetic */ Function1 IAuthTabCallback;
        final /* synthetic */ List onNavigationEvent;
        static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallbackStubProxy.class);
        private static final int $$b = 166;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, int r7, int r8) {
            /*
                int r8 = r8 * 4
                int r8 = 3 - r8
                int r7 = r7 * 4
                int r7 = 102 - r7
                byte[] r0 = o.bindContext.IAuthTabCallbackStubProxy.$$a
                int r6 = r6 * 2
                int r1 = r6 + 11
                byte[] r1 = new byte[r1]
                int r6 = r6 + 10
                r2 = 0
                if (r0 != 0) goto L19
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2f
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                int r8 = r8 + 1
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2f:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + 2
                r8 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bindContext.IAuthTabCallbackStubProxy.$$c(short, int, int):java.lang.String");
        }

        static {
            byte[] bArr = {35, -11, -97, -73, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
            $$a = bArr;
            ClassLoader parent = IAuthTabCallbackStubProxy.class.getClassLoader().getParent();
            try {
                byte b = (byte) (bArr[4] + 1);
                byte b2 = b;
                Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                declaredMethod.setAccessible(true);
                System.load((String) declaredMethod.invoke(parent, "ea56"));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public IAuthTabCallbackStubProxy(Function1 function1, List list) {
            this.IAuthTabCallback = function1;
            this.onNavigationEvent = list;
        }

        public static native int j(Object obj, int i, Object obj2, Object obj3);

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 4) & 1;
            int iIntValue = ((Number) obj).intValue();
            if (i4 != 0) {
                return onExtraCallbackWithResult(iIntValue);
            }
            onExtraCallbackWithResult(iIntValue);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
            Object objInvoke = this.IAuthTabCallback.invoke(this.onNavigationEvent.get(i));
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(624);
            return objInvoke;
        }
    }

    public static final class access000 implements Function1<Integer, Object> {
        private static final byte[] $$a;
        final /* synthetic */ Function1 onExtraCallbackWithResult;
        final /* synthetic */ List onWarmupCompleted;
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(access000.class);
        private static final int $$b = 204;

        private static String $$c(short s, byte b, int i) {
            int i2 = (i * 2) + 102;
            int i3 = 4 - (s * 3);
            byte[] bArr = $$a;
            int i4 = b * 4;
            byte[] bArr2 = new byte[11 - i4];
            int i5 = 10 - i4;
            int i6 = -1;
            if (bArr == null) {
                int i7 = i5 + i3;
                i3++;
                i2 = i7 + 2;
                i6 = -1;
            }
            while (true) {
                int i8 = i6 + 1;
                bArr2[i8] = (byte) i2;
                if (i8 == i5) {
                    return new String(bArr2, 0);
                }
                i3++;
                i2 = i2 + bArr[i3] + 2;
                i6 = i8;
            }
        }

        static {
            byte[] bArr = {5, -4, -80, 1, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
            $$a = bArr;
            ClassLoader parent = access000.class.getClassLoader().getParent();
            try {
                byte b = (byte) (bArr[3] - 1);
                byte b2 = b;
                Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
                declaredMethod.setAccessible(true);
                System.load((String) declaredMethod.invoke(parent, "ea56"));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public access000(Function1 function1, List list) {
            this.onExtraCallbackWithResult = function1;
            this.onWarmupCompleted = list;
        }

        public static native char g(int i, int i2);

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4169);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 15) & 1;
            int iIntValue = ((Number) obj).intValue();
            if (i4 != 0) {
                return onExtraCallback(iIntValue);
            }
            int i5 = 65 / 0;
            return onExtraCallback(iIntValue);
        }

        public final Object onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
            int i4 = (~iOnWarmupCompleted) & i3;
            int i5 = (~i3) & iOnWarmupCompleted;
            if (((((i5 & i4) | (i4 ^ i5)) >> 30) & 1) == 0) {
                this.onWarmupCompleted.get(i);
                throw null;
            }
            Function1 function1 = this.onExtraCallbackWithResult;
            Object obj = this.onWarmupCompleted.get(i);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
            Object objInvoke = function1.invoke(obj);
            int i6 = IAuthTabCallback;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
            int i7 = (~iOnWarmupCompleted2) & i6;
            int i8 = (~i6) & iOnWarmupCompleted2;
            if (((((i8 & i7) | (i7 ^ i8)) >> 19) & 1) == 0) {
                return objInvoke;
            }
            throw null;
        }
    }

    public static final class asBinder implements Function1<Integer, Object> {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(asBinder.class);
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onExtraCallbackWithResult;

        public asBinder(Function1 function1, List list) {
            this.onExtraCallbackWithResult = function1;
            this.IAuthTabCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 7) & 1;
            int iIntValue = ((Number) obj).intValue();
            if (i4 == 0) {
                return onWarmupCompleted(iIntValue);
            }
            onWarmupCompleted(iIntValue);
            throw null;
        }

        public final Object onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            if ((((onNavigationEvent ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727)) >> 6) & 1) != 0) {
                return this.onExtraCallbackWithResult.invoke(this.IAuthTabCallback.get(i));
            }
            int i3 = 37 / 0;
            return this.onExtraCallbackWithResult.invoke(this.IAuthTabCallback.get(i));
        }
    }

    public static final class onMessageChannelReady implements Function1<Integer, Object> {
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onMessageChannelReady.class);
        final /* synthetic */ Function1 IAuthTabCallback;
        final /* synthetic */ List onExtraCallback;

        public onMessageChannelReady(Function1 function1, List list) {
            this.IAuthTabCallback = function1;
            this.onExtraCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3939);
            Object objOnWarmupCompleted = onWarmupCompleted(((Number) obj).intValue());
            if ((((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295)) >> 25) & 1) == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
            Object objInvoke = this.IAuthTabCallback.invoke(this.onExtraCallback.get(i));
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
            return objInvoke;
        }
    }

    public static final class readTypedObject implements Function1<Integer, Object> {
        static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(readTypedObject.class);
        final /* synthetic */ List onExtraCallbackWithResult;
        final /* synthetic */ Function1 onNavigationEvent;

        public readTypedObject(Function1 function1, List list) {
            this.onNavigationEvent = function1;
            this.onExtraCallbackWithResult = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1495);
            Object objOnWarmupCompleted = onWarmupCompleted(((Number) obj).intValue());
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4901);
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
            Function1 function1 = this.onNavigationEvent;
            Object obj = this.onExtraCallbackWithResult.get(i);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
            Object objInvoke = function1.invoke(obj);
            int i3 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4169);
            int i4 = i3 & iOnWarmupCompleted;
            if ((((((i3 ^ iOnWarmupCompleted) | i4) & (~i4)) >> 15) & 1) == 0) {
                return objInvoke;
            }
            throw null;
        }
    }

    private static final Unit onNavigationEvent(Function1 function1, Function0 function0, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            function1.invoke(str);
            function0.invoke();
            unit = Unit.INSTANCE;
            int i3 = 99 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            function1.invoke(str);
            function0.invoke();
            unit = Unit.INSTANCE;
        }
        int i4 = asBinder + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Object onExtraCallback(getExtensionManager getextensionmanager) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getextensionmanager, "");
        String strOnWarmupCompleted = getextensionmanager.onWarmupCompleted();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(824 - Process.getGidForName(""), (ViewConfiguration.getTapTimeout() >> 16) + 7, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnWarmupCompleted);
        String string = sb.toString();
        int i2 = asBinder + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class extraCallback implements Function1<Integer, Object> {
        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(extraCallback.class);
        final /* synthetic */ Function2 onExtraCallbackWithResult;
        final /* synthetic */ List onNavigationEvent;

        public extraCallback(Function2 function2, List list) {
            this.onExtraCallbackWithResult = function2;
            this.onNavigationEvent = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
            Object objIAuthTabCallback = IAuthTabCallback(((Number) obj).intValue());
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
            return objIAuthTabCallback;
        }

        public final Object IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6002);
            Function2 function2 = this.onExtraCallbackWithResult;
            Integer numValueOf = Integer.valueOf(i);
            Object obj = this.onNavigationEvent.get(i);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
            Object objInvoke = function2.invoke(numValueOf, obj);
            int i3 = onWarmupCompleted;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4295);
            int i4 = (~iOnWarmupCompleted) & i3;
            int i5 = (~i3) & iOnWarmupCompleted;
            if (((((i5 & i4) | (i4 ^ i5)) >> 24) & 1) == 0) {
                return objInvoke;
            }
            throw null;
        }
    }

    public static final class writeTypedObject implements Function1<Integer, Object> {
        static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(writeTypedObject.class);
        final /* synthetic */ List onNavigationEvent;

        public writeTypedObject(List list) {
            this.onNavigationEvent = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
            int i3 = i2 & iOnWarmupCompleted;
            int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 14) & 1;
            int iIntValue = ((Number) obj).intValue();
            if (i4 != 0) {
                objOnExtraCallback = onExtraCallback(iIntValue);
                int i5 = 23 / 0;
            } else {
                objOnExtraCallback = onExtraCallback(iIntValue);
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2570);
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1725);
            int i4 = (~iOnWarmupCompleted) & i3;
            int i5 = (~i3) & iOnWarmupCompleted;
            if (((((i5 & i4) | (i4 ^ i5)) >> 21) & 1) == 0) {
                this.onNavigationEvent.get(i);
                int i6 = 68 / 0;
            } else {
                this.onNavigationEvent.get(i);
            }
            if ((((onExtraCallback ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126)) >> 9) & 1) != 0) {
                int i7 = 28 / 0;
            }
            return null;
        }
    }

    private static final Unit onExtraCallback(internalStart.onExtraCallback onextracallback, Map map, Function1 function1, Function1 function12, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        if (onextracallback == null) {
            int i4 = asBinder + 49;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Unit unit = Unit.INSTANCE;
            int i6 = asBinder + 83;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
        List<getExtensionManager> listOnNavigationEvent = onextracallback.onNavigationEvent();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnNavigationEvent) {
            if (!IAuthTabCallback.contains(((getExtensionManager) obj).onWarmupCompleted())) {
                int i8 = onTransact + 5;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    arrayList.add(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(arrayList.size(), new IAuthTabCallbackDefault(new QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda9(), arrayList), new asBinder(IAuthTabCallbackStub.onNavigationEvent, arrayList), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new access100(arrayList, map, function1, function12, function13)));
        return Unit.INSTANCE;
    }

    private static final ResourceManagerInternalAsldcInflateDelegate onNavigationEvent(setDividerPadding setdividerpadding) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerpadding, "");
        if (((backPressed) setdividerpadding.onExtraCallback()).ordinal() > ((backPressed) setdividerpadding.onNavigationEvent()).ordinal()) {
            int i3 = asBinder + 31;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            i = 1;
        } else {
            int i5 = asBinder + 11;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            i = -1;
        }
        return setBaselineAlignedChildIndex.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onExtraCallbackWithResult((updateFocusedState) null, new QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda31(i), 1, (Object) null), ResourceManagerInternalVdcInflateDelegate.onNavigationEvent((updateFocusedState) null, new QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda32(i), 1, (Object) null));
    }

    private static final Object onExtraCallbackWithResult(int i, getExtensionManager getextensionmanager) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(getextensionmanager, "");
        String strOnWarmupCompleted = getextensionmanager.onWarmupCompleted();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(978 - (Process.myPid() >> 22), AndroidCharacter.getMirror('0') - ')', (char) View.MeasureSpec.getSize(0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i);
        Object[] objArr2 = new Object[1];
        a((Process.myTid() >> 22) + 985, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, (char) (6257 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(strOnWarmupCompleted);
        String string = sb.toString();
        int i3 = asBinder + 25;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<backPressed>) getsupportedhighspeedresolutionsfor, backPressed.ALL);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i5 = onTransact + 107;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                i3 = 4;
            } else {
                int i7 = asBinder + 79;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = asBinder + 67;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onTransact + 61;
                asBinder = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(8972 >> (ViewConfiguration.getMinimumFlingVelocity() << 94), (ViewConfiguration.getJumpTapTimeout() >> 99) + 674, (char) (16821326 - Color.rgb(1, 0, 0)), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1097849230, i2, -1, ((String) objArr[0]).intern());
                } else {
                    Object[] objArr2 = new Object[1];
                    a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 986, 173 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (Color.rgb(0, 0, 0) + 16821326), objArr2);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1097849230, i2, -1, ((String) objArr2[0]).intern());
                }
            }
            Object[] objArr3 = new Object[1];
            a(ViewConfiguration.getMaximumFlingVelocity() >> 16, 12 - Color.alpha(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16641), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(Color.red(0) + 1159, Color.red(0) + 20, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1179, 1 - View.resolveSizeAndState(0, 0, 0), (char) View.resolveSizeAndState(0, 0, 0), objArr5);
            tryTriggerOnStart trytriggeronstart = new tryTriggerOnStart(strIntern, strIntern2, null, ((String) objArr5[0]).intern(), false, null);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = RequestMonitorRequestCompleteListenerExternalSyntheticLambda0.onWarmupCompleted(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, (updateFocusedState) null, (updateFocusedState) null, (updateFocusedState) null, 7, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda11(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            IAuthTabCallback(trytriggeronstart, quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 390, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = asBinder + 87;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Object onNavigationEvent(tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(trytriggeronstart, "");
        String strIAuthTabCallback = trytriggeronstart.IAuthTabCallback();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(1180 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, (char) View.combineMeasuredStates(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strIAuthTabCallback);
        String string = sb.toString();
        int i2 = asBinder + 113;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static final class onNavigationEvent implements Function1<flipHorizontally, Unit> {
        static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent.class);
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutions onWarmupCompleted;

        onNavigationEvent(boolean z, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
            this.onExtraCallback = z;
            this.onWarmupCompleted = getsupportedhighspeedresolutions;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2336);
            int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 25) & 1;
            onExtraCallbackWithResult((flipHorizontally) obj);
            if (i3 == 0) {
                Unit unit = Unit.INSTANCE;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3338);
                return unit;
            }
            Unit unit2 = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(flipHorizontally fliphorizontally) {
            float fOnWarmupCompleted;
            int i = 2 % 2;
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            if (this.onExtraCallback) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
                fOnWarmupCompleted = bindContext.onWarmupCompleted(this.onWarmupCompleted);
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
            } else {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2171);
                fOnWarmupCompleted = 0.0f;
            }
            fliphorizontally.access000(fOnWarmupCompleted);
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(338);
        }
    }

    static final class asInterface implements PointerInputEventHandler {
        static int asInterface = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(asInterface.class);
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 IAuthTabCallback;
        final /* synthetic */ tryTriggerOnStart IAuthTabCallbackDefault;
        final /* synthetic */ LiveDataObservableExternalSyntheticLambda1<String> asBinder;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutions onExtraCallbackWithResult;
        final /* synthetic */ Function1<List<String>, Unit> onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutions onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        asInterface(tryTriggerOnStart trytriggeronstart, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, Function1<? super List<String>, Unit> function1, LiveDataObservableExternalSyntheticLambda1<String> liveDataObservableExternalSyntheticLambda1, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
            this.IAuthTabCallbackDefault = trytriggeronstart;
            this.onExtraCallback = getsupportedhighspeedresolutionsfor;
            this.onExtraCallbackWithResult = getsupportedhighspeedresolutions;
            int i = asInterface;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
            int i2 = i & iOnWarmupCompleted;
            int i3 = ((((i ^ iOnWarmupCompleted) | i2) & (~i2)) >> 5) & 1;
            this.onWarmupCompleted = getsupportedhighspeedresolutions2;
            this.onNavigationEvent = function1;
            if (i3 == 0) {
                this.asBinder = liveDataObservableExternalSyntheticLambda1;
                throw null;
            }
            this.asBinder = liveDataObservableExternalSyntheticLambda1;
            this.IAuthTabCallback = camera2CameraMetadataExternalSyntheticLambda1;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            float fOnExtraCallback = highPriorityExecutor.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(72.0f));
            final tryTriggerOnStart trytriggeronstart = this.IAuthTabCallbackDefault;
            final getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor = this.onExtraCallback;
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = this.onExtraCallbackWithResult;
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = this.onWarmupCompleted;
            Function1<setUseCaseAttached, Unit> function1 = new Function1<setUseCaseAttached, Unit>() { // from class: o.bindContext.asInterface.2
                static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass2.class);

                public /* synthetic */ Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
                    int i4 = i3 & iOnWarmupCompleted;
                    setUseCaseAttached setusecaseattached = (setUseCaseAttached) obj;
                    if ((((((i3 ^ iOnWarmupCompleted) | i4) & (~i4)) >> 21) & 1) != 0) {
                        onExtraCallbackWithResult(setusecaseattached.onExtraCallback());
                        return Unit.INSTANCE;
                    }
                    onExtraCallbackWithResult(setusecaseattached.onExtraCallback());
                    int i5 = 38 / 0;
                    return Unit.INSTANCE;
                }

                public final void onExtraCallbackWithResult(long j) {
                    getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor2;
                    String strIAuthTabCallback;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
                    int i4 = (~iOnWarmupCompleted) & i3;
                    int i5 = (~i3) & iOnWarmupCompleted;
                    if (((((i5 & i4) | (i4 ^ i5)) >> 23) & 1) == 0) {
                        getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                        strIAuthTabCallback = trytriggeronstart.IAuthTabCallback();
                        int i6 = 61 / 0;
                    } else {
                        getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                        strIAuthTabCallback = trytriggeronstart.IAuthTabCallback();
                    }
                    int i7 = onExtraCallbackWithResult;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
                    if ((((((~i7) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i7)) >> 5) & 1) != 0) {
                        bindContext.onNavigationEvent(getsupportedhighspeedresolutionsfor2, strIAuthTabCallback);
                    } else {
                        bindContext.onNavigationEvent(getsupportedhighspeedresolutionsfor2, strIAuthTabCallback);
                    }
                    bindContext.onExtraCallbackWithResult(getsupportedhighspeedresolutions, 0.0f);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
                    bindContext.onExtraCallback(getsupportedhighspeedresolutions2, 0.0f);
                    int i8 = onExtraCallbackWithResult;
                    int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
                    int i9 = i8 & iOnWarmupCompleted3;
                    if ((((((i8 ^ iOnWarmupCompleted3) | i9) & (~i9)) >> 29) & 1) == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
            final Function1<List<String>, Unit> function12 = this.onNavigationEvent;
            final LiveDataObservableExternalSyntheticLambda1<String> liveDataObservableExternalSyntheticLambda1 = this.asBinder;
            final getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor2 = this.onExtraCallback;
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3 = this.onExtraCallbackWithResult;
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4 = this.onWarmupCompleted;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.bindContext.asInterface.3
                static int IAuthTabCallbackDefault = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass3.class);

                /* JADX WARN: Multi-variable type inference failed */
                {
                    int i2 = IAuthTabCallbackDefault;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
                    if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 5) & 1) == 0) {
                        throw null;
                    }
                }

                public /* synthetic */ Object invoke() {
                    int i2 = 2 % 2;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
                    onNavigationEvent();
                    Unit unit = Unit.INSTANCE;
                    int i3 = IAuthTabCallbackDefault;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3656);
                    if ((((((~i3) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i3)) >> 2) & 1) != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final void onNavigationEvent() {
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions5;
                    int i2 = 2 % 2;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
                    function12.invoke(liveDataObservableExternalSyntheticLambda1.onWarmupCompleted());
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737);
                    bindContext.onNavigationEvent(getsupportedhighspeedresolutionsfor2, (String) null);
                    float f = 0.0f;
                    bindContext.onExtraCallbackWithResult(getsupportedhighspeedresolutions3, 0.0f);
                    int i3 = IAuthTabCallbackDefault;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
                    int i4 = i3 & iOnWarmupCompleted;
                    if ((((((i3 ^ iOnWarmupCompleted) | i4) & (~i4)) >> 12) & 1) != 0) {
                        getsupportedhighspeedresolutions5 = getsupportedhighspeedresolutions4;
                        f = 1.0f;
                    } else {
                        getsupportedhighspeedresolutions5 = getsupportedhighspeedresolutions4;
                    }
                    bindContext.onExtraCallback(getsupportedhighspeedresolutions5, f);
                    int i5 = IAuthTabCallbackDefault;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
                    int i6 = (~iOnWarmupCompleted2) & i5;
                    int i7 = (~i5) & iOnWarmupCompleted2;
                    if (((((i7 & i6) | (i6 ^ i7)) >> 22) & 1) != 0) {
                        throw null;
                    }
                }
            };
            final getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor3 = this.onExtraCallback;
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions5 = this.onExtraCallbackWithResult;
            final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions6 = this.onWarmupCompleted;
            Function0<Unit> function02 = new Function0<Unit>() { // from class: o.bindContext.asInterface.1
                static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass1.class);

                public /* synthetic */ Object invoke() {
                    int i2 = 2 % 2;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2336);
                    onExtraCallbackWithResult();
                    Unit unit = Unit.INSTANCE;
                    int i3 = onExtraCallback;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
                    int i4 = i3 & iOnWarmupCompleted;
                    if ((((((i3 ^ iOnWarmupCompleted) | i4) & (~i4)) >> 23) & 1) != 0) {
                        int i5 = 26 / 0;
                    }
                    return unit;
                }

                public final void onExtraCallbackWithResult() {
                    int i2 = 2 % 2;
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
                    bindContext.onNavigationEvent(getsupportedhighspeedresolutionsfor3, (String) null);
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions7 = getsupportedhighspeedresolutions5;
                    int i3 = onExtraCallback;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
                    int i4 = (~iOnWarmupCompleted) & i3;
                    int i5 = (~i3) & iOnWarmupCompleted;
                    if (((((i5 & i4) | (i4 ^ i5)) >> 1) & 1) == 0) {
                        bindContext.onExtraCallbackWithResult(getsupportedhighspeedresolutions7, 2.0f);
                    } else {
                        bindContext.onExtraCallbackWithResult(getsupportedhighspeedresolutions7, 0.0f);
                    }
                    bindContext.onExtraCallback(getsupportedhighspeedresolutions6, 0.0f);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
                }
            };
            Function2<HandlerScheduledExecutorService2, setUseCaseAttached, Unit> function2 = new Function2<HandlerScheduledExecutorService2, setUseCaseAttached, Unit>(this.IAuthTabCallback, this.asBinder, fOnExtraCallback, this.onExtraCallbackWithResult, this.onExtraCallback, this.onWarmupCompleted) { // from class: o.bindContext.asInterface.5
                static int asInterface = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass5.class);
                final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 IAuthTabCallback;
                final /* synthetic */ LiveDataObservableExternalSyntheticLambda1<String> asBinder;
                final /* synthetic */ float onExtraCallback;
                final /* synthetic */ getSupportedHighSpeedResolutions onExtraCallbackWithResult;
                final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> onNavigationEvent;
                final /* synthetic */ getSupportedHighSpeedResolutions onWarmupCompleted;

                {
                    int i2 = asInterface;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
                    if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 22) & 1) == 0) {
                        this.onExtraCallbackWithResult = getsupportedhighspeedresolutions;
                        return;
                    }
                    this.onExtraCallbackWithResult = getsupportedhighspeedresolutions;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = asInterface;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1212);
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) obj;
                    setUseCaseAttached setusecaseattached = (setUseCaseAttached) obj2;
                    if ((((((~i3) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i3)) >> 2) & 1) == 0) {
                        IAuthTabCallback(handlerScheduledExecutorService2, setusecaseattached.onExtraCallback());
                        return Unit.INSTANCE;
                    }
                    IAuthTabCallback(handlerScheduledExecutorService2, setusecaseattached.onExtraCallback());
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }

                public final void IAuthTabCallback(HandlerScheduledExecutorService2 handlerScheduledExecutorService2, long j) {
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions7;
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1;
                    getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor4;
                    int i2 = 2 % 2;
                    int i3 = asInterface;
                    int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1348);
                    int i4 = i3 & iOnWarmupCompleted;
                    if ((((((i3 ^ iOnWarmupCompleted) | i4) & (~i4)) >> 17) & 1) != 0) {
                        Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
                        handlerScheduledExecutorService2.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
                    handlerScheduledExecutorService2.onExtraCallback();
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions8 = this.onWarmupCompleted;
                    float fOnWarmupCompleted = bindContext.onWarmupCompleted(getsupportedhighspeedresolutions8);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) j);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
                    bindContext.onExtraCallbackWithResult(getsupportedhighspeedresolutions8, fOnWarmupCompleted + fIntBitsToFloat);
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = this.IAuthTabCallback;
                    LiveDataObservableExternalSyntheticLambda1<String> liveDataObservableExternalSyntheticLambda12 = this.asBinder;
                    String strIAuthTabCallback = bindContext.IAuthTabCallback(this.onNavigationEvent);
                    float fOnWarmupCompleted2 = bindContext.onWarmupCompleted(this.onWarmupCompleted);
                    final getSupportedHighSpeedResolutions getsupportedhighspeedresolutions9 = this.onWarmupCompleted;
                    Function1<Float, Unit> function13 = new Function1<Float, Unit>() { // from class: o.bindContext.asInterface.5.5
                        static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(C00015.class);

                        public /* synthetic */ Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
                            onNavigationEvent(((Number) obj2).floatValue());
                            Unit unit = Unit.INSTANCE;
                            int i6 = onWarmupCompleted;
                            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5625);
                            int i7 = (~iOnWarmupCompleted2) & i6;
                            int i8 = (~i6) & iOnWarmupCompleted2;
                            if (((((i8 & i7) | (i7 ^ i8)) >> 4) & 1) != 0) {
                                return unit;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        public final void onNavigationEvent(float f) {
                            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions10;
                            float fOnWarmupCompleted3;
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted;
                            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3393);
                            int i7 = (~iOnWarmupCompleted2) & i6;
                            int i8 = (~i6) & iOnWarmupCompleted2;
                            if ((((i8 & i7) | (i7 ^ i8)) & 1) == 0) {
                                getsupportedhighspeedresolutions10 = getsupportedhighspeedresolutions9;
                                fOnWarmupCompleted3 = bindContext.onWarmupCompleted(getsupportedhighspeedresolutions10) - f;
                            } else {
                                getsupportedhighspeedresolutions10 = getsupportedhighspeedresolutions9;
                                fOnWarmupCompleted3 = bindContext.onWarmupCompleted(getsupportedhighspeedresolutions10) + f;
                            }
                            bindContext.onExtraCallbackWithResult(getsupportedhighspeedresolutions10, fOnWarmupCompleted3);
                        }
                    };
                    int i5 = asInterface;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3792);
                    int i6 = (~iOnWarmupCompleted2) & i5;
                    int i7 = (~i5) & iOnWarmupCompleted2;
                    if (((((i7 & i6) | (i6 ^ i7)) >> 9) & 1) != 0) {
                        bindContext.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda12, liveDataObservableExternalSyntheticLambda12, strIAuthTabCallback, fOnWarmupCompleted2, function13);
                        getsupportedhighspeedresolutions7 = this.onExtraCallbackWithResult;
                        camera2CameraMetadataExternalSyntheticLambda1 = this.IAuthTabCallback;
                        getsupportedhighspeedresolutionsfor4 = this.onNavigationEvent;
                        int i8 = 59 / 0;
                    } else {
                        bindContext.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda12, liveDataObservableExternalSyntheticLambda12, strIAuthTabCallback, fOnWarmupCompleted2, function13);
                        getsupportedhighspeedresolutions7 = this.onExtraCallbackWithResult;
                        camera2CameraMetadataExternalSyntheticLambda1 = this.IAuthTabCallback;
                        getsupportedhighspeedresolutionsfor4 = this.onNavigationEvent;
                    }
                    String strIAuthTabCallback2 = bindContext.IAuthTabCallback(getsupportedhighspeedresolutionsfor4);
                    float fOnWarmupCompleted3 = bindContext.onWarmupCompleted(this.onWarmupCompleted);
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
                    bindContext.onExtraCallback(getsupportedhighspeedresolutions7, bindContext.onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, strIAuthTabCallback2, fOnWarmupCompleted3, this.onExtraCallback));
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(884);
                }
            };
            int i2 = asInterface;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2876);
            int i3 = (~iOnWarmupCompleted) & i2;
            int i4 = (~i2) & iOnWarmupCompleted;
            Object obj = null;
            if (((((i4 & i3) | (i3 ^ i4)) >> 18) & 1) != 0) {
                FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallbackWithResult(highPriorityExecutor, function1, function0, function02, function2, access13800Var);
                access14300.onWarmupCompleted();
                obj.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallbackWithResult(highPriorityExecutor, function1, function0, function02, function2, access13800Var);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                Unit unit = Unit.INSTANCE;
                int i5 = asInterface;
                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
                int i6 = (~iOnWarmupCompleted2) & i5;
                int i7 = (~i5) & iOnWarmupCompleted2;
                if (((((i7 & i6) | (i6 ^ i7)) >> 20) & 1) != 0) {
                    return unit;
                }
                throw null;
            }
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1560);
            int i8 = asInterface;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1235);
            int i9 = (~iOnWarmupCompleted3) & i8;
            int i10 = (~i8) & iOnWarmupCompleted3;
            if (((((i10 & i9) | (i9 ^ i10)) >> 1) & 1) == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(o.internalStart.onExtraCallback r18, o.LiveDataObservableExternalSyntheticLambda1 r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function1 r21, o.getSupportedHighSpeedResolutionsFor r22, java.lang.String r23, java.util.Map r24, kotlin.jvm.functions.Function1 r25, o.Camera2CameraMetadataExternalSyntheticLambda1 r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, o.getSupportedHighSpeedResolutionsFor r29, o.getSupportedHighSpeedResolutions r30, o.getSupportedHighSpeedResolutions r31, o.AudioRestrictionControllerImplExternalSyntheticLambda0 r32) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onWarmupCompleted(o.internalStart$onExtraCallback, o.LiveDataObservableExternalSyntheticLambda1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.getSupportedHighSpeedResolutionsFor, java.lang.String, java.util.Map, kotlin.jvm.functions.Function1, o.Camera2CameraMetadataExternalSyntheticLambda1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.getSupportedHighSpeedResolutionsFor, o.getSupportedHighSpeedResolutions, o.getSupportedHighSpeedResolutions, o.AudioRestrictionControllerImplExternalSyntheticLambda0):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(o.onEngineInitSuccess r32, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 r33, o.CameraCaptureResultEmptyCameraCaptureResult r34, int r35) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallback(o.onEngineInitSuccess, o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Object IAuthTabCallback(onEngineInitSuccess onengineinitsuccess, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(trytriggeronstart, "");
        String strIAuthTabCallback = onengineinitsuccess.IAuthTabCallback();
        String strIAuthTabCallback2 = trytriggeronstart.IAuthTabCallback();
        StringBuilder sb = new StringBuilder();
        sb.append(strIAuthTabCallback);
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 985, -MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6258), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strIAuthTabCallback2);
        String string = sb.toString();
        int i2 = onTransact + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return string;
    }

    private static final Unit onWarmupCompleted(List list, Function1 function1, Function1 function12, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Iterator it;
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            it = list.iterator();
            int i3 = 52 / 0;
        } else {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            it = list.iterator();
        }
        Iterator it2 = it;
        while (it2.hasNext()) {
            onEngineInitSuccess onengineinitsuccess = (onEngineInitSuccess) it2.next();
            String strIAuthTabCallback = onengineinitsuccess.IAuthTabCallback();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(1187 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strIAuthTabCallback);
            AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, sb.toString(), (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-1210975858, true, new QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda7(onengineinitsuccess)), 2, (Object) null);
            List<tryTriggerOnStart> listOnNavigationEvent = onengineinitsuccess.onNavigationEvent();
            audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(listOnNavigationEvent.size(), new readTypedObject(new QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda8(onengineinitsuccess), listOnNavigationEvent), new onMessageChannelReady(extraCallbackWithResult.onExtraCallback, listOnNavigationEvent), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new onPostMessage(listOnNavigationEvent, function1, function12, function13)));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 39;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(o.Camera2CameraMetadataExternalSyntheticLambda1 r22, long r23, o.internalStart.onExtraCallback r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function1 r27, java.lang.String r28, java.util.Map r29, kotlin.jvm.functions.Function1 r30, kotlin.jvm.functions.Function1 r31, kotlin.jvm.functions.Function1 r32, o.Camera2CameraMetadataExternalSyntheticLambda1 r33, java.util.List r34, o.LiveDataObservableExternalSyntheticLambda1 r35, o.getSupportedHighSpeedResolutionsFor r36, o.getSupportedHighSpeedResolutionsFor r37, o.getSupportedHighSpeedResolutions r38, o.getSupportedHighSpeedResolutions r39, o.setDividerDrawable r40, o.backPressed r41, o.CameraCaptureResultEmptyCameraCaptureResult r42, int r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallback(o.Camera2CameraMetadataExternalSyntheticLambda1, long, o.internalStart$onExtraCallback, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.Camera2CameraMetadataExternalSyntheticLambda1, java.util.List, o.LiveDataObservableExternalSyntheticLambda1, o.getSupportedHighSpeedResolutionsFor, o.getSupportedHighSpeedResolutionsFor, o.getSupportedHighSpeedResolutions, o.getSupportedHighSpeedResolutions, o.setDividerDrawable, o.backPressed, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit IAuthTabCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
            function1.invoke(StringsKt.trim(str).toString());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        function1.invoke(StringsKt.trim(str).toString());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, "");
        function1.invoke("");
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 95;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        backPressed backpressed = (backPressed) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<backPressed>) getsupportedhighspeedresolutionsfor, backpressed);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 89;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [im.toss.devtool.action.quickaction.QuickActionBottomSheetScreenKt$$ExternalSyntheticLambda33, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(o.getSupportedHighSpeedResolutionsFor r25, o.x2ExternalSyntheticLambda21 r26, o.CameraCaptureResultEmptyCameraCaptureResult r27, int r28) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallbackWithResult(o.getSupportedHighSpeedResolutionsFor, o.x2ExternalSyntheticLambda21, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(o.internalStart.onExtraCallback r38, java.util.Map r39, kotlin.jvm.functions.Function1 r40, kotlin.jvm.functions.Function1 r41, kotlin.jvm.functions.Function1 r42, kotlin.jvm.functions.Function1 r43, o.getSupportedHighSpeedResolutionsFor r44, o.getSupportedHighSpeedResolutionsFor r45, o.Camera2CameraMetadataExternalSyntheticLambda1 r46, kotlin.jvm.functions.Function1 r47, java.lang.String r48, kotlin.jvm.functions.Function1 r49, java.util.List r50, o.LiveDataObservableExternalSyntheticLambda1 r51, o.getSupportedHighSpeedResolutionsFor r52, o.getSupportedHighSpeedResolutions r53, o.getSupportedHighSpeedResolutions r54, o.MeteringRepeatingSessionExternalSyntheticLambda0 r55, o.CameraCaptureResultEmptyCameraCaptureResult r56, int r57) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.IAuthTabCallback(o.internalStart$onExtraCallback, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.getSupportedHighSpeedResolutionsFor, o.getSupportedHighSpeedResolutionsFor, o.Camera2CameraMetadataExternalSyntheticLambda1, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, java.util.List, o.LiveDataObservableExternalSyntheticLambda1, o.getSupportedHighSpeedResolutionsFor, o.getSupportedHighSpeedResolutions, o.getSupportedHighSpeedResolutions, o.MeteringRepeatingSessionExternalSyntheticLambda0, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit onExtraCallback(v1 v1Var, internalStart.onExtraCallback onextracallback, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function1 function15, String str, Function1 function16, List list, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 87;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onTransact + 87;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asBinder + 57;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr = new Object[1];
                a(577 - TextUtils.getOffsetAfter("", 0), 113 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-506319816, i, -1, ((String) objArr[0]).intern());
            }
            u5cExternalSyntheticLambda0.onExtraCallback(v1Var, 0L, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (Function2) null, 0L, (String) null, (Function1) null, ForwardingCameraControl.onExtraCallback(-1617503183, true, new QuickActionBottomSheetScreenKt$.ExternalSyntheticLambda10(onextracallback, map, function1, function12, function13, function14, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, camera2CameraMetadataExternalSyntheticLambda1, function15, str, function16, list, liveDataObservableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 122);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x056f A[PHI: r4
      0x056f: PHI (r4v51 java.util.List<o.onEngineInitSuccess>) = (r4v50 java.util.List<o.onEngineInitSuccess>), (r4v61 java.util.List<o.onEngineInitSuccess>) binds: [B:232:0x056d, B:229:0x0566] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onExtraCallback(@org.jetbrains.annotations.NotNull o.setRubIn<? extends o.internalStart> r53, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.String> r54, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r55, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r56, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r57, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r58, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> r59, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r60, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r61, @org.jetbrains.annotations.Nullable o.backPressed r62, @org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallback(o.setRubIn, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, o.backPressed, o.CameraCaptureResultEmptyCameraCaptureResult, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final o.QuirksExternalSyntheticBackport0 IAuthTabCallback(o.QuirksExternalSyntheticBackport0 r19, o.Camera2CameraMetadataExternalSyntheticLambda1 r20, long r21, o.CameraCaptureResultEmptyCameraCaptureResult r23, int r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.IAuthTabCallback(o.QuirksExternalSyntheticBackport0, o.Camera2CameraMetadataExternalSyntheticLambda1, long, o.CameraCaptureResultEmptyCameraCaptureResult, int):o.QuirksExternalSyntheticBackport0");
    }

    private static final Unit onNavigationEvent(long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setIso setiso) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        float fOnExtraCallback = setiso.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
        if (onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6) > 0.0f) {
            int i4 = onTransact + 19;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()), setByteOrder.onNavigationEvent(j)}), Float.intBitsToFloat((int) setiso.onTransact()) - fOnExtraCallback, Float.intBitsToFloat((int) setiso.onTransact()), 0, 8, (Object) null), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) setiso.onTransact()) - fOnExtraCallback) & 4294967295L)), setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setiso.onTransact() >> 32))) << 32) | (Float.floatToRawIntBits(fOnExtraCallback) & 4294967295L)), onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6), (hasMoreElements) null, (seek) null, 0, 112, (Object) null);
        }
        if (onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62) > 0.0f) {
            int i6 = asBinder + 37;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(j), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())}), 0.0f, fOnExtraCallback, 0, 8, (Object) null), setUseCaseAttached.Companion.IAuthTabCallback(), setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setiso.onTransact() >> 32))) << 32) | (Float.floatToRawIntBits(fOnExtraCallback) & 4294967295L)), onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62), (hasMoreElements) null, (seek) null, 0, 112, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba A[PHI: r8 r13 r15
      0x00ba: PHI (r8v8 java.lang.Object) = (r8v7 java.lang.Object), (r8v15 java.lang.Object) binds: [B:20:0x00b8, B:17:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r13v15 java.lang.Object) = (r13v27 java.lang.Object), (r13v28 java.lang.Object) binds: [B:20:0x00b8, B:17:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r15v3 o.Camera2CameraControlExternalSyntheticLambda7) = (r15v2 o.Camera2CameraControlExternalSyntheticLambda7), (r15v9 o.Camera2CameraControlExternalSyntheticLambda7) binds: [B:20:0x00b8, B:17:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[PHI: r13 r15
      0x00bd: PHI (r13v17 java.lang.Object) = (r13v23 java.lang.Object), (r13v24 java.lang.Object) binds: [B:20:0x00b8, B:17:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r15v7 o.Camera2CameraControlExternalSyntheticLambda7) = (r15v2 o.Camera2CameraControlExternalSyntheticLambda7), (r15v9 o.Camera2CameraControlExternalSyntheticLambda7) binds: [B:20:0x00b8, B:17:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onWarmupCompleted(o.Camera2CameraMetadataExternalSyntheticLambda1 r20, o.LiveDataObservableExternalSyntheticLambda1<java.lang.String> r21, java.lang.String r22, float r23, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r24) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onWarmupCompleted(o.Camera2CameraMetadataExternalSyntheticLambda1, o.LiveDataObservableExternalSyntheticLambda1, java.lang.String, float, kotlin.jvm.functions.Function1):void");
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Object obj;
        Object next;
        float fCoerceIn;
        float f;
        float f2;
        float f3;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        float fFloatValue2 = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        Iterator it = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Object objOnExtraCallback = ((Camera2CameraControlExternalSyntheticLambda7) next).onExtraCallback();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1180, 6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            if (Intrinsics.areEqual(objOnExtraCallback, sb.toString())) {
                int i2 = asBinder + 29;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        }
        if (((Camera2CameraControlExternalSyntheticLambda7) next) == null) {
            return Float.valueOf(0.0f);
        }
        float fOnWarmupCompleted = r8.onWarmupCompleted() + fFloatValue + (r8.onNavigationEvent() / 2.0f);
        float fIAuthTabCallbackDefault = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().IAuthTabCallbackDefault() + fFloatValue2;
        float fAsInterface = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().asInterface() - fFloatValue2;
        if (fOnWarmupCompleted < fIAuthTabCallbackDefault) {
            int i3 = asBinder + 7;
            onTransact = i3 % 128;
            f = -24.0f;
            if (i3 % 2 != 0) {
                f3 = (fIAuthTabCallbackDefault * fOnWarmupCompleted) - fFloatValue2;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
                f3 = (fIAuthTabCallbackDefault - fOnWarmupCompleted) / fFloatValue2;
            }
            fCoerceIn = RangesKt.coerceIn(f3, f2, 1.0f);
        } else {
            if (fOnWarmupCompleted <= fAsInterface) {
                int i4 = onTransact + 59;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    return Float.valueOf(0.0f);
                }
                obj.hashCode();
                throw null;
            }
            fCoerceIn = RangesKt.coerceIn((fOnWarmupCompleted - fAsInterface) / fFloatValue2, 0.0f, 1.0f);
            f = 24.0f;
        }
        return Float.valueOf(fCoerceIn * f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(int r14, o.w3b r15, o.CameraCaptureResultEmptyCameraCaptureResult r16, int r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallback(int, o.w3b, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback_Parcel(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r1 = 1
            r2 = r9[r1]
            o.w5a r2 = (o.w5a) r2
            r4 = 2
            r5 = r9[r4]
            o.CameraCaptureResultEmptyCameraCaptureResult r5 = (o.CameraCaptureResultEmptyCameraCaptureResult) r5
            r6 = 3
            r9 = r9[r6]
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r6 = r4 % r4
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            r7 = r9 & 6
            if (r7 != 0) goto L43
            int r7 = o.bindContext.asBinder
            int r7 = r7 + 9
            int r8 = r7 % 128
            o.bindContext.onTransact = r8
            int r7 = r7 % r4
            if (r7 == 0) goto L39
            boolean r7 = r5.onNavigationEvent(r2)
            r8 = 35
            int r8 = r8 / r0
            if (r7 == 0) goto L41
            goto L3f
        L39:
            boolean r7 = r5.onNavigationEvent(r2)
            if (r7 == 0) goto L41
        L3f:
            r7 = 4
            goto L42
        L41:
            r7 = r4
        L42:
            r9 = r9 | r7
        L43:
            r7 = r9 & 19
            r8 = 18
            if (r7 == r8) goto L4b
            r7 = r1
            goto L4c
        L4b:
            r7 = r0
        L4c:
            r8 = r9 & 1
            boolean r7 = r5.onWarmupCompleted(r7, r8)
            if (r7 == 0) goto La5
            boolean r7 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r7 == 0) goto L92
            int r7 = o.bindContext.onTransact
            int r7 = r7 + 91
            int r8 = r7 % 128
            o.bindContext.asBinder = r8
            int r7 = r7 % r4
            int r4 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r4 = r4 >> 24
            int r4 = 1900 - r4
            r7 = 48
            int r6 = android.text.TextUtils.lastIndexOf(r6, r7, r0, r0)
            int r6 = r6 + 101
            int r7 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r7 = r7 >> 8
            r8 = 59969(0xea41, float:8.4034E-41)
            int r8 = r8 - r7
            char r7 = (char) r8
            java.lang.Object[] r1 = new java.lang.Object[r1]
            a(r4, r6, r7, r1)
            r0 = r1[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r1 = 2072953512(0x7b8ec2a8, float:1.4825085E36)
            r4 = -1
            o.CameraConfigExternalSyntheticLambda0.IAuthTabCallback(r1, r9, r4, r0)
        L92:
            r4 = 0
            int r9 = r9 << 6
            r6 = r9 & 896(0x380, float:1.256E-42)
            r7 = 2
            r2.onExtraCallbackWithResult(r3, r4, r5, r6, r7)
            boolean r9 = o.CameraConfigExternalSyntheticLambda0.asBinder()
            if (r9 == 0) goto La8
            o.CameraConfigExternalSyntheticLambda0.onTransact()
            goto La8
        La5:
            r5.ICustomTabsCallbackStubProxy()
        La8:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.IAuthTabCallback_Parcel(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 71;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(kotlin.jvm.functions.Function1 r20, java.lang.String r21, im.toss.tds.compose.component.compound.listrow.v1.RightPreset r22, o.CameraCaptureResultEmptyCameraCaptureResult r23, int r24) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onNavigationEvent(kotlin.jvm.functions.Function1, java.lang.String, im.toss.tds.compose.component.compound.listrow.v1.RightPreset, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit IAuthTabCallback(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onNavigationEvent(int r31, java.lang.String r32, java.lang.String r33, o.QuirksExternalSyntheticBackport0 r34, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r35, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r36, o.CameraCaptureResultEmptyCameraCaptureResult r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onNavigationEvent(int, java.lang.String, java.lang.String, o.QuirksExternalSyntheticBackport0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.CameraCaptureResultEmptyCameraCaptureResult, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        tryTriggerOnStart trytriggeronstart = (tryTriggerOnStart) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(trytriggeronstart.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(o.tryTriggerOnStart r29, o.QuirksExternalSyntheticBackport0 r30, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r31, o.CameraCaptureResultEmptyCameraCaptureResult r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.IAuthTabCallback(o.tryTriggerOnStart, o.QuirksExternalSyntheticBackport0, kotlin.jvm.functions.Function1, o.CameraCaptureResultEmptyCameraCaptureResult, int, int):void");
    }

    private static final Unit onExtraCallbackWithResult(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            int i4 = asBinder + 11;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = onTransact + 23;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asBinder + 43;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = new Object[1];
                a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 143, 119 - Gravity.getAbsoluteGravity(0, 0), (char) (26991 - (ViewConfiguration.getTouchSlop() >> 8)), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-867516306, i2, -1, ((String) objArr[0]).intern());
            }
            w3bVar.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(tryTriggerOnStart trytriggeronstart, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i3 = 2;
            } else {
                int i5 = onTransact + 121;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = asBinder + 99;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onTransact + 55;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                Object[] objArr = new Object[1];
                a(263 - (KeyEvent.getMaxKeyCode() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 107, (char) (View.resolveSize(0, 0) + 64269), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1374405448, i2, -1, ((String) objArr[0]).intern());
            }
            String strOnWarmupCompleted = trytriggeronstart.onWarmupCompleted();
            if (strOnWarmupCompleted == null || strOnWarmupCompleted.length() == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-989419246);
                w5aVar.onExtraCallbackWithResult(trytriggeronstart.onExtraCallback(), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 6) & 896, 2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i11 = onTransact + 109;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-989349124);
                w5aVar.onNavigationEvent(trytriggeronstart.onExtraCallback(), trytriggeronstart.onWarmupCompleted(), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).RatingCompat(), 0L, isRepeatingEnabled.onExtraCallback.onTransact(), 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 24576, 232);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Function1 function1, tryTriggerOnStart trytriggeronstart, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(trytriggeronstart.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(trytriggeronstart.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 113;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(o.tryTriggerOnStart r24, kotlin.jvm.functions.Function1 r25, boolean r26, kotlin.jvm.functions.Function1 r27, im.toss.tds.compose.component.compound.listrow.v1.RightPreset r28, o.CameraCaptureResultEmptyCameraCaptureResult r29, int r30) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onWarmupCompleted(o.tryTriggerOnStart, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, im.toss.tds.compose.component.compound.listrow.v1.RightPreset, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(trytriggeronstart.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(o.tryTriggerOnStart r31, boolean r32, o.QuirksExternalSyntheticBackport0 r33, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r34, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r35, o.CameraCaptureResultEmptyCameraCaptureResult r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.IAuthTabCallback(o.tryTriggerOnStart, boolean, o.QuirksExternalSyntheticBackport0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.CameraCaptureResultEmptyCameraCaptureResult, int, int):void");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        String str = (String) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = asBinder + 79;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                i = 4;
            } else {
                int i5 = asBinder + 17;
                onTransact = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 2;
                }
                i = 2;
            }
            iIntValue |= i;
            int i7 = onTransact + 117;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr2 = new Object[1];
                a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2296, 111 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), objArr2);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(733504492, iIntValue, -1, ((String) objArr2[0]).intern());
            }
            w3bVar.IAuthTabCallback(str, (QuirksExternalSyntheticBackport0) null, 0L, 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 15) & 458752, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onTransact + 17;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i10 == 0) {
                    int i11 = 28 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = asBinder + 7;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit asInterface(o.tryTriggerOnStart r9, o.w5a r10, o.CameraCaptureResultEmptyCameraCaptureResult r11, int r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.asInterface(o.tryTriggerOnStart, o.w5a, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        tryTriggerOnStart trytriggeronstart = (tryTriggerOnStart) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(trytriggeronstart.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 67;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(o.tryTriggerOnStart r21, kotlin.jvm.functions.Function1 r22, im.toss.tds.compose.component.compound.listrow.v1.RightPreset r23, o.CameraCaptureResultEmptyCameraCaptureResult r24, int r25) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onNavigationEvent(o.tryTriggerOnStart, kotlin.jvm.functions.Function1, im.toss.tds.compose.component.compound.listrow.v1.RightPreset, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(trytriggeronstart.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void onExtraCallbackWithResult(o.tryTriggerOnStart r28, o.QuirksExternalSyntheticBackport0 r29, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r30, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r31, o.CameraCaptureResultEmptyCameraCaptureResult r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindContext.onExtraCallbackWithResult(o.tryTriggerOnStart, o.QuirksExternalSyntheticBackport0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, o.CameraCaptureResultEmptyCameraCaptureResult, int, int):void");
    }

    private static final internalStart onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<? extends internalStart> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        internalStart internalstart = (internalStart) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onTransact + 111;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return internalstart;
    }

    private static final String onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = asBinder + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = asBinder + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
    }

    private static final backPressed IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<backPressed> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        backPressed backpressed = (backPressed) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return backpressed;
        }
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<backPressed> getsupportedhighspeedresolutionsfor, backPressed backpressed) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(backpressed);
        int i4 = asBinder + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onWarmupCompleted(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = asBinder + 45;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getsupportedhighspeedresolutions.onNavigationEvent();
        }
        getsupportedhighspeedresolutions.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i4 = asBinder + 37;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return fFloatValue;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return Float.valueOf(number.floatValue());
        }
        number.floatValue();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(tryTriggerOnStart trytriggeronstart, Function1 function1, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-940961383, 940961403, new Object[]{trytriggeronstart, function1, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static /* synthetic */ ResourceManagerInternalAsldcInflateDelegate onWarmupCompleted(setDividerPadding setdividerpadding) {
        return (ResourceManagerInternalAsldcInflateDelegate) onWarmupCompleted(-1609628990, 1609629014, new Object[]{setdividerpadding}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(v1 v1Var, internalStart.onExtraCallback onextracallback, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function1 function15, String str, Function1 function16, List list, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-522309672, 522309697, new Object[]{v1Var, onextracallback, map, function1, function12, function13, function14, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, camera2CameraMetadataExternalSyntheticLambda1, function15, str, function16, list, liveDataObservableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        return (Unit) onWarmupCompleted(1885031473, -1885031465, new Object[]{getsupportedhighspeedresolutionsfor, str}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(internalStart.onExtraCallback onextracallback, Map map, Function1 function1, Function1 function12, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        return (Unit) onWarmupCompleted(1583747379, -1583747364, new Object[]{onextracallback, map, function1, function12, function13, audioRestrictionControllerImplExternalSyntheticLambda0}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        return (Unit) onWarmupCompleted(1803152858, -1803152852, new Object[]{function1, getsupportedhighspeedresolutionsfor, str}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-465805838, 465805856, new Object[]{getsupportedhighspeedresolutionsfor, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, String str) {
        return (Unit) onWarmupCompleted(-1078037207, 1078037210, new Object[]{function1, str}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(findResAndMsg findresandmsg, v1 v1Var) {
        return (Unit) onWarmupCompleted(64340694, -64340690, new Object[]{findresandmsg, v1Var}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final int onExtraCallbackWithResult(int i, int i2) {
        return ((Integer) onWarmupCompleted(196891370, -196891365, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).intValue();
    }

    private static final Unit IAuthTabCallback(backPressed backpressed, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (Unit) onWarmupCompleted(-1912872926, 1912872937, new Object[]{backpressed, getsupportedhighspeedresolutionsfor}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit onExtraCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-1017553529, 1017553536, new Object[]{str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit IAuthTabCallback(tryTriggerOnStart trytriggeronstart, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-364755895, 364755895, new Object[]{trytriggeronstart, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit asBinder(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        return (Unit) onWarmupCompleted(918430165, -918430144, new Object[]{function1, trytriggeronstart}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit onExtraCallback(tryTriggerOnStart trytriggeronstart, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onWarmupCompleted(-615933551, 615933563, new Object[]{trytriggeronstart, quirksExternalSyntheticBackport0, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(1025798151, -1025798138, new Object[]{str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit onExtraCallback(Function1 function1, String str) {
        return (Unit) onWarmupCompleted(2108775112, -2108775110, new Object[]{function1, str}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit asInterface(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(1346726438, -1346726437, new Object[]{str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit onTransact(Function1 function1, tryTriggerOnStart trytriggeronstart) {
        return (Unit) onWarmupCompleted(1379402938, -1379402929, new Object[]{function1, trytriggeronstart}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static final /* synthetic */ String IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (String) onWarmupCompleted(-2064721382, 2064721398, new Object[]{getsupportedhighspeedresolutionsfor}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return ((Boolean) onWarmupCompleted(1130551626, -1130551612, new Object[]{getsupportedhighspeedresolutionsfor}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).booleanValue();
    }

    public static final /* synthetic */ float onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, String str, float f, float f2) {
        return ((Float) onWarmupCompleted(1823671606, -1823671589, new Object[]{camera2CameraMetadataExternalSyntheticLambda1, str, Float.valueOf(f), Float.valueOf(f2)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).floatValue();
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1, String str, float f, Function1 function1) {
        onWarmupCompleted(1641695455, -1641695432, new Object[]{camera2CameraMetadataExternalSyntheticLambda1, liveDataObservableExternalSyntheticLambda1, str, Float.valueOf(f), function1}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final float onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, String str, float f, float f2) {
        return ((Float) onWarmupCompleted(-182474611, 182474633, new Object[]{camera2CameraMetadataExternalSyntheticLambda1, str, Float.valueOf(f), Float.valueOf(f2)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).floatValue();
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        return ((Float) onWarmupCompleted(-556746759, 556746778, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).floatValue();
    }

    static void IAuthTabCallback() {
        char[] cArr = new char[2719];
        ByteBuffer.wrap("¬\u0085A&wée©\u001ai\b\u000f>Å,\u008aÁ_÷áå¨\u009amJþ§K\u0091\u0091\u0083Îü\rîyØ¡Êò'7\u0011\u0087\u0003Ç|\u0005nWX²Jç§9\u0091g\u0083Þü\rîHí\u0087\u0000$6ë$«[kI\u001d\u007fÑm\u0095\u0080W¶ç¤»Û}É7ÿØí\u008d\u0000S6\u001aí½\u0000\u00016\u008a$\u0088[[I?\u007f÷mò\u0080p¶É¤\u0092ÛHÉ\u001bÿãí¨\u0000265$\u008f[PI\u0015\u007fÛm¢\u0080*¶-¤áÛEÉ\u0007ÿ×í\u0095\u0000o60$õZ»I\u0002\u007f\u008am¸\u0080Q¶:¤ÐÚ³É{ÿÀí°\u0000S6\u0013$ëZ¨Iy\u007f\u0007m\u009b\u0080M¶\b¤×Ú¤ÉVÿ3íã\u0000\f6L$íZ\u0081Ie\u007f'm÷\u0083\u0095¶\u000f¤ÐÚ\u0095É[ÿ\"íÆ\u0003³6`$ØZ\u008bIQ\u007f'mä\u0083¡¶y¤ Ú¿ÉGÿ\u000eíÑ\u0003©6j$rZÿIX\u007f^m\u0089\u0083Â¶<¤m\u0084Òin_åMç24 P\u0016\u0098\u0004\u009dé\u001fß¦Íý²' t\u0096\u008c\u0084Çi]_ZMà2? z\u0016´\u0004ÍéEßBÍ\u008e²* h\u0096¸\u0084úi\u0000__M\u009a3Ô m\u0016å\u0004×é>ßUÍ¿³Ü \u0014\u0096¯\u0084ßi<_|M\u00843Ç \u0016\u0016h\u0004ôé\"ßgÍ¸³Ë 9\u0096\\\u0084\u008cim_7M²3õ \f\u0016E\u0004\u008aêÖßlÍ¾³à e\u0096\r\u0084×jÒ_\u0015M¬3å *\u0016v\u0004\u008cêÞß\u0000Í\u0005³£ c\u0096B\u0084®jÊ_\bMX3º  \u0016\u007f\u0004ºêôß\rÍi³\u009c¡Ï\u0096w\u0084¤jþ_\bMK3\u008e!Ö\u0016\u000f\u0004\u0090êèß!Í~³\u0086¡Å\u0096]\u0084Pj÷_qM&3í!\u0092\u0016B\u0016°û\fÍ\u0087ß\u0085 V²2\u0084ú\u0096ÿ{}MÄ_\u009f E2\u0016\u0004î\u0016¥û?Í8ß\u0082 ]²\u0018\u0084Ö\u0096¯{'M _ì H2\n\u0004Ú\u0016\u0098ûbÍ=ßø¡¶²\u000f\u0084\u0087\u0096µ{\\M7_Ý!¾2v\u0004Í\u0016½û^Í\u001eßæ¡¥²t\u0084\n\u0096\u0096{@M\u0005_Ú!©2[\u0004>\u0016îû\u000fÍUßÐ¡\u0097²n\u0084'\u0096èx´M\u000e_Ü!\u00822\u0007\u0004a\u0016¡ø\u0080ÍlßÈ¡\u008a²Z\u00848\u0096âx½Mx_6!\u008f2k\u0004\u001e\u0016ÍøµÍfß<¡Ê²I\u0084\f\u0096Ôx\u008dMR_*!ã3¼\u0004\u0004\u0016ÇøßÍRß5¡³³ä\u0084/\u0096\u0097xÀí½\u0000\u00016\u008a$\u0088[[I?\u007f÷mò\u0080p¶É¤\u0092ÛHÉ\u001bÿãí¨\u0000265$\u008f[PI\u0015\u007fÛm¢\u0080*¶-¤áÛEÉ\u0007ÿ×í\u0095\u0000o60$õZ»I\u0002\u007f\u008am¸\u0080Q¶:¤ÐÚ³É{ÿÀí°\u0000S6\u0013$ëZ¨Iy\u007f\u0007m\u009b\u0080M¶\b¤×Ú¤ÉVÿ3íã\u0000\u00026X$ÝZ\u009aIc\u007f*må\u0083¹¶\u0003¤ÑÚ\u008fÉ\nÿlí¬\u0003\u008d6a$ÅZ\u0087IW\u007f5mï\u0083°¶u¤;Ú\u0082Éfÿ\u0013íÀ\u0003¸6k$1ZÇID\u007f\u0001mÙ\u0083\u0080¶_¤'ÚîÈ±ÿ\tíÊ\u0003Ò6_$8Z¾Hé\u007f#m\u0095\u0083Íí½\u0000\u00016\u008a$\u0088[[I?\u007f÷mò\u0080p¶É¤\u0092ÛHÉ\u001bÿãí¨\u0000265$\u008f[PI\u0015\u007fÛm¢\u0080*¶-¤áÛEÉ\u0007ÿ×í\u0095\u0000o60$õZ»I\u0002\u007f\u008am\u00ad\u0080A¶%¤çÚ·ÉUÿÏí\u0090\u0000U6\u001b$âZ\u0086Is\u007f m\u0098\u0080K¶\u0011¤çÚ¤Éaÿ9íà\u0000\u007f6\u0007$ÎZ\u0091Ii\u007f*m¼\u0083ü¶=¤ÑÚ\u0095ÉWÿ'íÅ\u0003¿6`$ÅZ\u008bIR\u007f6mã\u0083°¶h¤;Ú\u0081Éwÿ\u0014íÑ\u0003©6p$\u000fZ÷I^\u007f\u0001mÙ\u0083\u009a¶\"¤/ÚèÈîÿUí\u009d\u0003Õí½\u0000\u00016\u008a$\u0088[[I?\u007f÷mò\u0080p¶É¤\u0092ÛHÉ\u001bÿãí¨\u0000265$\u008f[PI\u0015\u007fÛm¢\u0080*¶-¤áÛEÉ\u0007ÿ×í\u0095\u0000o60$õZ»I\u0002\u007f\u008am\u00ad\u0080A¶%¤çÚ·ÉUÿÏí\u0090\u0000U6\u001b$âZ\u0086Is\u007f m\u0098\u0080K¶\u0011¤çÚ¤Éaÿ9íà\u0000\u007f6\u0007$ÎZ\u0091Ii\u007f*m²\u0083è¶\r¤ÊÚ\u0093ÉZÿ5íé\u0003³6a$ßZÚI\u001c\u007f\\mÝ\u0083±¶u¤7Ú\u0087Éeÿ\u001fíÀ\u0003¥6k$2ZÖIC\u007f\u0010mÈ\u0083\u009b¶a¤\u0017ÚôÈ±ÿ\tíÐ\u0003¯6W$>ZáH¹\u007fzm\u0082\u0083\u008f¶H¤NÚ½Èüÿ)í}í½\u0000\u00016\u008a$\u0088[[I?\u007f÷mò\u0080p¶É¤\u0092ÛHÉ\u001bÿãí¨\u0000265$\u008f[PI\u0015\u007fÛm¢\u0080*¶-¤áÛEÉ\u0007ÿ×í\u0095\u0000o60$õZ»I\u0002\u007f\u008am\u00ad\u0080A¶%¤çÚ·ÉUÿÏí\u0090\u0000U6\u001b$âZ\u0086Is\u007f m\u0098\u0080K¶\u0011¤çÚ¤Éaÿ9íà\u0000\u007f6\u0007$ÎZ\u0091Ii\u007f*m²\u0083è¶\r¤ÊÚ\u0093ÉZÿ5íé\u0003³6a$ßZÚI\u0012\u007fHmí\u0083ª¶s¤:Ú\u0095ÉIÿ\u0013íÁ\u0003¿6:$|Z¼I}\u007f\u0011mÕ\u0083\u0097¶g¤\u0005ÚÿÈ ÿ\u0005íË\u0003\u00926v$#ZðH¨\u007f{mÁ\u0083·¶T¤\u0011ÚéÈ°ÿOí7\u0003\u009e6A$\u0019ZÚHâ\u007fom(\u0083®¶\u001d¤\\Ú\u0085ÈÝÝÐ0}\u0006¶\u0014Ïk+yRO\u0080]É°\n\u0086¨í§\u0000\t6Å$\u008e[WI$\u007fÛtC\u0099ÿ¯t½vÂ¥ÐÁæ\tô\f\u0019\u008e/7=lB¶Påf\u001dtV\u0099Ì¯Ë½qÂ®Ðëæ%ô\\\u0019Ô/Ó=\u001fB»Pùf)tk\u0099\u0091¯Î½\u000bÃEÐüætôS\u0019¿/Û=\u0019CIP«f1tn\u0099«¯å½\u001cÃxÐ\u008dæÞôf\u0019µ/ï=\u0019CZP\u009ffÇt\u001e\u0099\u0081¯ù½0ÃoÐ\u0097æÔôL\u001a\u0016/ó=4CmP¤fËt\u0017\u009aM¯\u009f½!Ã$Ðìæ¶ô\u0013\u001aT/\u008d=ÄCkP·fít?\u009aA¯Ä½\u008cÃVÐ³æôô-\u001ad/\u008b=×C\rQ_fátd\u009a\"¯â½ãÃ\u000fÑKæ\u0089ô9\u001a[/¡=þC\u001bQUf\u008ctè\u009a}¯®½öÃ%Ñ_æ©ôÊ\u001a\u000f/·=îC\u0011Qif\u0080tß\u009a\u0007¨D½¼Ã1Ñvæðô\u0080\u001aI(\u0014=Ãñ5\u001c\u0089*]8\u000fGÏU\u0083cuq(\u009càí¦\u0000\t6Ç$\u0099[ZI8\u007fÛõùAó¬O\u009aÄ\u0088Æ÷\u0015åqÓ¹Á¼,>\u001a\u0087\bÜw\u0006eUS\u00adAæ¬|\u009a{\u0088Á÷\u001eå[Ó\u0095Áì,d\u001ac\b¯w\u000beIS\u0099AÛ¬!\u009a~\u0088»öõåLÓÄÁã,\u000f\u001ak\b©vùe\u001bS\u0081AÞ¬\u001b\u009aU\u0088¬öÈå=ÓnÁÖ,\u0005\u001a_\b©vêe/SwA®¬1\u009aI\u0088\u0080ößå'ÓdÁü/¦\u001aC\b\u0084vÝe\u0014S{A§¯ý\u009a/\u0088\u0091ö\u0094å\\Ó\u0006Á£/ä\u001a=\btvÛe\u0007S]A\u008f¯ñ\u009at\u0088<öæå\u0003ÓDÁ\u009d/Ô\u001a;\bgv½dïSQAÔ¯\u009c\u009aF\u0088cö¤äýÓ4Á\u009b/Ç\u001a\u001d\bOv±d´S|A&¯Ã\u009a\u0004\u0088]ö\u0094äûÓ'Á}/¯\u001a\u0011\b\u0014vÜd\u0086S#Ad¯½\u009dô\u0088[ö\u0087äÝÓ\u000fÁq/ô\u001d²\brv³dßS\u001bAY¯©\u009dË\u00881önäËÓ\u0005Á\\/¸\u001dí\b>vfdµS\u000fAy¯\u009a\u009dß\u0088'ö~ä\u0081ÒùÁP/\u008f\u001d×\b\u0014v,d¡RæA`¯Ð\u009d\u009f\u0088Kö\u0013%ÐÌØ6\u0084ô\u0011\u009eä\u0088P\u007f¤¸\u009cGP¶\u008c\u0016èlÐÉT6\u001cAlÌ\"\u0098d$Ì\u0096°å|Êüí¥\u0000\u00196Í$\u009f[_I\u0013í¼\u0000\t6Å$\u0098[QI>\u007fÛæØ\u000bd=ï/íP>BZt\u0092f\u0097\u008b\u0015½¬¯÷Ð-Â~ô\u0086æÍ\u000bW=P/êP5Bpt¾fÇ\u008bO½H¯\u0084Ð Âbô²æð\u000b\n=U/\u0090QÞBgtïfÈ\u008b$½@¯\u0082ÑÒÂ0ôªæõ\u000b0=~/\u0087QãB\u0016tEfý\u008b.½t¯\u0082ÑÁÂ\u0004ô\\æ\u0085\u000b\u001a=b/«QôB\ftOf×\u0088\u008d½h¯¯ÑöÂ?ôPæ\u008c\bÖ=\u0004/ºQ¿Bwt-f\u0088\u0088Ï½\u0016¯_ÑðÂ,ôvæ¤\bÚ=_/\u0017QÍB(tof¶\u0088ÿ½\u0010¯LÑ\u0096ÃÄôzæÿ\b·=m/HQ\u008fCÖt\u001ff°\u0088ì½6¯dÑ\u009aÃ\u009fôWæ\r\bè=//vQ¿CÐt\ffV\u0088\u0084½:¯?Ñ÷Ã\u00adô\bæO\b\u0096:ß/pQ¬Cöt$fZ\u0088ßº\u0097¯MÑ¨Ãïô6æ\u007f\b\u0090:Ì/\u0016QDCút\u007ff9\u0088ùºø¯\u0014ÑPÃ\u0092ô\"æ@\bº:å/\u0000QNC\u0097uóff\u0088µºí¯>ÑDÃ²õÑæ\u0014\b¬:õ/\nQrC\u009buÄf\u001c\u0088_º§¯*ÑmÃëõ\u009aæU\b\u0000:Øç¸\n\u0004<\u008f.\u008dQ^C:uòg÷\u008au¼Ì®\u0097ÑMÃ\u001eõæç\u00ad\n7<0.\u008aQUC\u0010uÞg§\u008a/¼(®äÑ@Ã\u0002õÒç\u0090\nj<5.ðP¾C\u0007u\u008fg¨\u008aD¼ ®âÐ²ÃPõÊç\u0095\nP<\u001e.çP\u0083Cvu%g\u009d\u008aN¼\u0014®âÐ¡Ãdõ<çå\nz<\u0002.ËP\u0094Clu/g·\u0089í¼\b®ÏÐ\u0096Ã_õ0çì\t¶<d.ÚPßC\u0017uMgè\u0089¯¼v®?Ð\u0090ÃLõ\u0016çÄ\tº<?.wP\u00adCHu\u000fgÖ\u0089\u009f¼p®,ÐöÂ¤õ\u001aç\u009f\tÙ<\u0019.\u0018PôB°urgÂ\u0089 ¼Z®\u0005ÐàÂ®õwç\u0013\t\u0086<U.\rPÞB¤uRg1\u0089ô¼L®\u0015ÐêÂ\u0092õ{ç$\tü;¿.GPÊB\u008du\u000bgz\u0089¹»ï®8í½\u0000\u00016\u008a$\u0088[[I?\u007f÷mò\u0080p¶É¤\u0092ÛHÉ\u001bÿãí¨\u0000265$\u008f[PI\u0015\u007fÛm¢\u0080*¶-¤áÛEÉ\u0007ÿ×í\u0095\u0000o60$õZ»I\u0002\u007f\u008am\u00ad\u0080A¶%¤çÚ·ÉUÿÏí\u0090\u0000U6\u001b$âZ\u0096Is\u007f#mÌ\u0080\f¶-¤ÁÚ¥Égÿ7íÕ\u0000O6\u0010$ÕZ\u009bIb\u007f\u0006mó\u0083 ¶\u0018¤ËÚ\u0091Égÿ$íá\u0003¹6`$ÿZ\u0087IN\u007f\u0011mé\u0083ª¶2¤?Ú\u0098É\u001eÿIí\u0087\u0003ý6-Îs#Ï\u0015D\u0007Fx\u0095jñ\\9N<£¾\u0095\u0007\u0087\\ø\u0086êÕÜ-Îf#ü\u0015û\u0007Ax\u009ejÛ\\\u0015Nl£ä\u0095ã\u0087/ø\u008bêÉÜ\u0019Î[#¡\u0015þ\u0007;yujÌ\\DNc£\u008f\u0095ë\u0087)ùyê\u009bÜ\u0001Î^#\u009b\u0015Õ\u0007,yXj½\\íN\f£Ö\u0095Ó\u0087\u0014ùmê¤ÜëÎ7#\u008d\u0015ß\u0007\u0001y\u0004jì\\¶N3 t\u0095Í\u0087\u0004ùKê\u0097ÜíÎ? a\u0015ä\u0007By\u0002j£\\ÏN+ i\u0095¹\u0087ÛùAê\u009eÜÛÎ\u0015 l\u0015\u0088\u0007ýy.j\u0096\\ÅN\u001f i\u0095ª\u0087ïù7ënÜñÎ\t @\u0015\u009f\u0007çy$k<\\±N\u0016 \u0010\u0095Ç\u0087\u0089ùpë#Ùû4G\u0002Ì\u0010Îo\u001d}yK±Y´´6\u0082\u008f\u0090Ôï\u000eý]Ë¥Ùî4t\u0002s\u0010Éo\u0016}SK\u009dYä´l\u0082k\u0090§ï\u0003ýAË\u0091ÙÓ4)\u0002v\u0010³ný}DKÌYë´\u0007\u0082c\u0090¡îñý\u0013Ë\u0089ÙÖ4\u0013\u0002]\u0010¤nÐ}5KeY\u0084´^\u0082[\u0090\u009cîåý,ËcÙ¿4\u0005\u0002W\u0010\u0089n\u008c}jK*Y\u008b·ç\u0082C\u0090\u0081îÑý3ËiÙ¶7ó\u0002=\u0010\u0084nà}\u0015KFY¾·í\u00827\u0090AîÂý\u0007Ë_Ù\u00867Ù\u0002!\u0010hn·}\u000fKLYÔ·Ù\u0082>\u00908îïü¡Ë\u001dÙË¹4T\u0088b\u0003p\u0001\u000fÒ\u001d¶+~9{Ôùâ@ð\u001b\u008fÁ\u009d\u0092«j¹!T»b¼p\u0006\u000fÙ\u001d\u009c+R9+Ô£â¤ðh\u008fÌ\u009d\u008e«^¹\u001cTæb¹p|\u000e2\u001d\u008b+\u00039'ÔØâ¦ðh\u008e;\u009dé«d¹\u000eTÁb\u0094pj\u000e#\u001dÇ+²9\u0012Ô\u008dâÝðl\u008e0\u009dä«¶¹vTäb\u008epA\u000e\u0014\u001dê+£9W×2â\u0091ðY\u008e\u001a\u009dÐ«\u0096¹eW0bøpQ\u000e>\u001dÖ+\u008f9`×(âûðó\u008e\u000e\u009dÙ«Ï¹\bWubµpü\u0007üê@ÜËÎÉ±\u001a£~\u0095¶\u0087³j1\\\u0088NÓ1\t#Z\u0015¢\u0007éêsÜtÎÎ±\u0011£T\u0095\u009a\u0087ãjk\\lN 1\u0004#F\u0015\u0096\u0007Ôê.ÜqÎ´°ú£C\u0095Ë\u0087ïj\u0010\\nN 0ó#!\u0015¬\u0007Æê\tÜ\\Î¢°ë£\u000f\u0095z\u0087ÚjK\\\u0001N\u00940ã#*\u0015s\u0007¬ê\u0000ÜJÎ\u0088°Æ£s\u0095%\u0087õiÄ\\XN\u008c0Þ#\u001e\u0015L\u0007¦ééÜ<Î\u0082°Ë£?\u0095Z\u0087¹iñ\\2Nx0þ#\r\u0015X\u0007\u0090éùÜ\u0016Î~°§£\b\u0095@\u0087\u0093i\u009b\\&Nq0ç\" \u0015\u001c\u0007×é\u0094 iMÕ{^i\\\u0016\u008f\u0004ë2# &Í¤û\u001déF\u0096\u009c\u0084Ï²7 |Mæ{ái[\u0016\u0084\u0004Á2\u000f vÍþûùé5\u0096\u0091\u0084Ó²\u0003 AM»{äi!\u0017o\u0004Ö2^ zÍ\u0085ûûé5\u0097f\u0084´²9 SM\u009c{Éi7\u0017~\u0004\u009a2ï OÍÞû\u0094é\u0001\u0097v\u0084¿²æ 9M\u0095{ßi\u001d\u0017S\u0004æ2° `ÎQûÍé\u0019\u0097K\u0084\u008b²Ù 3N|{©i\u0017\u0017^\u0004ª2Ï ,Îdû§éí\u0097k\u0084\u0098²Í \u0005Nl{\u0083ië\u00172\u0004\u009d2Õ \u0006Î\u000eû³éä\u0097r\u00855²\u0089 AN\u0001 \u0088\u00ad\u00906\u0084æ\u0018\u008e½Il\u0006ñëMÝÆÏÄ°\u0017¢s\u0094»\u0086¾k<]\u0085OÞ0\u0004\"W\u0014¯\u0006äë~ÝyÏÃ°\u001c¢Y\u0094\u0097\u0086îkf]aO\u00ad0\t\"K\u0014\u009b\u0006Ùë#Ý|Ï¹±÷¢N\u0094Æ\u0086âk\u001d]cO\u00ad1þ\",\u0014¡\u0006Ëë\u0004ÝQÏ¯±æ¢\u0002\u0094w\u0086×kF]\fO\u00991î\"'\u0014~\u0006¡ë\rÝGÏ\u0085±Ë¢~\u0094(\u0086øhÉ]UO\u00811Ó\"\u0013\u0014A\u0006«èäÝ1Ï\u008f±Æ¢2\u0094W\u0086´hü]?Ou1ó\"\u0000\u0014U\u0006\u009dèôÝ\u001bÏs±ª¢\u0005\u0094M\u0086\u009eh\u0096]+O|1ê#\u00ad\u0014\u0011\u0006Üè\u0099%È¬\u001cñ]\u001cá*j8hG»Ußc\u0017q\u0012\u009c\u0090ª)¸rÇ¨Õûã\u0003ñH\u001cÒ*Õ8oG°Uõc;qB\u009cÊªÍ¸\u0001Ç¥Õçã7ñu\u001c\u008f*Ð8\u0015F[UâcjqO\u009c±ªÍ¸\u0016Æ_Õ\u009cã\u001eña\u001c¯*á8\u0000FPU®cÛq{\u009cäª´¸\u0005ÆYÕ\u008dãßñ\u001f\u001c\u008d*ç8(F}U\u0083cÊq>\u009f[ªø¸0ÆsÕ¹ãÿñ\f\u001fY*\u009188FWU¿cæq\t\u009fAª\u0092¸\u009aÆgÕ°ã¦ñb\u001f\u001c*Õ8\u0095í½\u0000\u00016\u008a$\u0088[[I?\u007f÷mò\u0080p¶É¤\u0092ÛHÉ\u001bÿãí¨\u0000265$\u008f[PI\u0015\u007fÛm¢\u0080*¶-¤áÛEÉ\u0007ÿ×í\u0095\u0000o60$õZ»I\u0002\u007f\u008am¯\u0080Q¶-¤öÚ¿É|ÿþí\u0081\u0000O6\u0001$àZ°IN\u007f;m\u009b\u0080\n¶@¤ÕÚ¢Ékÿ2íí\u0000A6\u000b$ÉZ\u0087I2\u007fjm \u0083µ¶\u0002¤ËÚ\u0092ÉMÿ!íë\u0003©6g$\u0092ZÄI\u0014\u007f%mù\u0083\u00ad¶\u007f¤?Ú\u00adÉGÿ\bíÝ\u0003£6j$\u001eZûIX\u007f\u0010mÓ\u0083\u0099¶_¤,ÚùÈ±ÿ\u0018í÷\u0003\u009f6F$)ZáH²\u007f:mÇ\u0083\u0090¶\u0006¤BÚ¼Èöÿ5×á:]\fÖ\u001eÔa\u0007scE«W®º,\u008c\u0095\u009eÎá\u0014óGÅ¿×ô:n\fi\u001eÓa\fsIE\u0087Wþºv\u008cq\u009e½á\u0019ó[Å\u008b×É:3\fl\u001e©`çs^EÖWóº\r\u008cq\u009eªàãó Å¢×Ý:\u0013\f]\u001e¼`ìs\u0012EgWÇºV\u008c\u001c\u009e\u0089àþó7Ån×±:\u001d\fW\u001e\u0095`ÛsnE8Wè¹Ù\u008cE\u009e\u0091àÃó\u0003ÅQ×»9ô\f!\u001e\u009f`Ös\"EGW¤¹ì\u008c/\u009eeàãó\u0010ÅE×\u008d9ä\f\u000b\u001ec`ºs\u0015E]W\u008e¹\u0086\u008c;\u009elàúò¾Å\u0000×Î9\u0089Ä»)\u0007\u001f\u008c\r\u008er]`9VñDô©v\u009fÏ\u008d\u0094òNà\u001dÖåÄ®)4\u001f3\r\u0089rV`\u0013VÝD¤©,\u009f+\u008dçòCà\u0001ÖÑÄ\u0093)i\u001f6\rós½`\u0004V\u008cD©©W\u009f+\u008dðó¹àzÖøÄ\u0087)I\u001f\u0007\ræs¶`HV=D\u009d©\f\u009fF\u008dÓó¤àmÖ4Äë)G\u001f\r\rÏs\u0081`4VbD²ª\u0083\u009f\u001f\u008dËó\u0099àYÖ\u000bÄá*®\u001f{\rÅs\u008c`xV\u001dDþª¶\u009fu\u008d?ó¹àJÖ\u001fÄ×*¾\u001fQ\r9sà`OV\u0007DÔªÜ\u009fa\u008d6ó áäÖZÄ\u009a*Ó\u008cóaOWÄEÆ:\u0015(q\u001e¹\f¼á>×\u0087ÅÜº\u0006¨U\u009e\u00ad\u008cæa|W{EÁ:\u001e([\u001e\u0095\fìád×cÅ¯º\u000b¨I\u009e\u0099\u008cÛa!W~E»;õ(L\u001eÄ\fÞá\u0013×qÅ¾»×¨>\u009e\u0085\u008cÏa4W[E¦;ï(!\u001e:\f\u008aá;×GÅ\u0093»á¨!\u009eS\u008c¹a\u0016WCE\u009d;Ô(\u0000\u001ee\f¦âî×MÅ\u0087»á¨\u0012\u009eg\u008c¯bæW\tE\u0081;Ø(\u0017\u001e_\f¬â¤×9Ån»\u0098¨^\u009e\u0002\u008cÃb«í¸\u0000\u00056×$\u0088[vI#\u007fðm¨\u0080{¶Á¤¢Û]É\u0010ÿéí¸\u0000\u00056×$\u0088[`I#\u007fôm\u009a\u0080u¶È¤\u0081".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2719);
        onNavigationEvent = cArr;
        onExtraCallbackWithResult = 6307262591187419244L;
    }
}
