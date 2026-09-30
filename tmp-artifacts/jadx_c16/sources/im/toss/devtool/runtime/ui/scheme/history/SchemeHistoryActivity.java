package im.toss.devtool.runtime.ui.scheme.history;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryActivity$;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.DERTaggedObject;
import o.ForwardingCameraControl;
import o.QuirksExternalSyntheticBackport0;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.SessionTrackerb;
import o.onJsBridgeReady;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

@DERTaggedObject
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SchemeHistoryActivity extends Hilt_SchemeHistoryActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallbackDefault = 9047627749574886414L;
    private static int asBinder = 0;
    private static int asInterface = 1;

    @Inject
    public SessionTrackerb tossRouter;

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeHistoryActivity schemeHistoryActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(schemeHistoryActivity, str);
        int i4 = asInterface + 11;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SchemeHistoryActivity schemeHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 97;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(schemeHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(schemeHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asBinder + 7;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SchemeHistoryActivity schemeHistoryActivity, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(schemeHistoryActivity, str);
        int i4 = asBinder + 67;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SchemeHistoryActivity schemeHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(schemeHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = asBinder + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    @Override // im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(301847399, true, new SchemeHistoryActivity$.ExternalSyntheticLambda0(this))), 1, (Object) null);
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(SchemeHistoryActivity schemeHistoryActivity, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            SessionTrackerb.IAuthTabCallback(schemeHistoryActivity.onExtraCallback(), schemeHistoryActivity, str, false, (Function1) null, (Bundle) null, true, 11, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            SessionTrackerb.IAuthTabCallback(schemeHistoryActivity.onExtraCallback(), schemeHistoryActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 99;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(SchemeHistoryActivity schemeHistoryActivity, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(schemeHistoryActivity, str);
        Object[] objArr = new Object[1];
        a(new char[]{64972, 44630, 52023, 3012, 14497, 45016}, 12228 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        onJsBridgeReady.onNavigationEvent(schemeHistoryActivity, ((String) objArr[0]).intern(), 0, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 113;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(SchemeHistoryActivity schemeHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 25;
        asBinder = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 3) == 5) {
            z = false;
        } else {
            int i5 = i3 + 67;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = asInterface + 61;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a(new char[]{16720, 40327, 63665, 55092, 12826, 4437, 28088, 18642, 42949, 33335, 57713, 15452, 6322, 30689, 21215, 45386, 35963, 60239, 51073, 8932, 300, 23579, 47998, 38882, 62084, 53707, 11385, 2827, 26190, 17078, 41446, 64729, 56124, 13860, 5463, 29065, 19686, 43826, 34308, 58734, 49592, 7388, 31732, 22059, 46357, 36939, 60606, 52193, 9953, 1331, 24700, 48964, 39818, 63204, 54722, 12333, 3954, 27574, 18078, 42478, 32804, 57098, 14938, 5882, 30102, 20676, 44828, 35442, 59728, 50567, 8447, 32729, 23119, 47406, 38310, 61574, 53234, 10784, 2314, 25673, 16550, 40847, 64220, 55662, 13355, 4874, 28602, 19170, 43486, 33804, 58222, 15957, 6786, 31211, 21552, 45898, 36409, 60130, 51628, 9411, 829, 24163, 48454, 39353, 62665, 54235, 11796, 3452, 26706, 17564, 41962, 65029, 56586, 14446, 5286, 29574, 20172, 44322, 34818, 59138, 50106, 7926, 32141, 22634, 46901, 37399}, Process.getGidForName("") + 56532, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1363502833, i, -1, ((String) objArr[0]).intern());
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(schemeHistoryActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = null;
            if (!zOnExtraCallback) {
                int i8 = asInterface + 71;
                asBinder = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new SchemeHistoryActivity$.ExternalSyntheticLambda2(schemeHistoryActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                Function1 function1 = (Function1) objOnMinimized;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(schemeHistoryActivity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new SchemeHistoryActivity$.ExternalSyntheticLambda3(schemeHistoryActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                try {
                    Object[] objArr2 = {function1, (Function1) objOnMinimized2, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1568428052);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (54493 - View.resolveSizeAndState(0, 0, 0)), 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-16764024) - Color.rgb(0, 0, 0), -1815916164, false, "onWarmupCompleted", new Class[]{Function1.class, Function1.class, QuirksExternalSyntheticBackport0.class, SchemeHistoryViewModel.class, CameraCaptureResultEmptyCameraCaptureResult.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback).invoke(null, objArr2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(SchemeHistoryActivity schemeHistoryActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 75;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = asInterface + 73;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                Object[] objArr = new Object[1];
                a(new char[]{16720, 28595, 7385, 52728, 64202, 43977, 22560, 2374, 13925, 59203, 37961, 17056, 29570, 8429, 53751, 65182, 44859, 23579, 3433, 14952, 60252, 39335, 18054, 30678, 9444, 54751, 33377, 45847, 24606, 4474, 15950, 60589, 40380, 19152, 31743, 10437, 55606, 34350, 46876, 25722, 5464, 50152, 61580, 41367, 20197, 32711, 11478, 56629, 35361, 47975, 26708, 6472, 51130, 62616, 42490, 21209, 978, 12322, 57606, 36466, 49012, 27718, 6834, 52174, 63638, 43504, 22260, 1854, 13312, 58651, 37479, 17229, 29167, 7898, 53150, 64762, 44482, 23084, 2850, 14365, 59750, 38491, 17588, 30178, 8917, 54178, 33008, 45531, 24121, 3859, 15458, 60737, 39541, 18619, 31128, 9972, 55286, 33996, 46382, 25133, 4966, 49262, 61786, 40894, 19592, 32242, 10982, 56218, 34854, 47382, 26177, 5922, 50206, 62183}, (KeyEvent.getMaxKeyCode() >> 16) + 12007, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(301847399, i, -1, ((String) objArr[0]).intern());
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1363502833, true, new SchemeHistoryActivity$.ExternalSyntheticLambda1(schemeHistoryActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = asInterface + 119;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 61;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (IAuthTabCallbackDefault | 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, 19627 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallbackDefault ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Gravity.getAbsoluteGravity(0, 0) + 59, 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), TextUtils.indexOf("", "", 0) + 59, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i6 = $10 + 103;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    @Override // im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
    }

    @Override // im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onResume();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asInterface + 3;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
