package im.toss.compose.widget.point.overlay;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.skt.usp.UCPApiConstants;
import im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.tds.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.EncoderProfilesProxyVideoProfileProxy;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LottieCompositionFactoryExternalSyntheticLambda13;
import o.LottieCompositionFactoryExternalSyntheticLambda15;
import o.LottieCompositionFactoryExternalSyntheticLambda19;
import o.LottieCompositionFactoryExternalSyntheticLambda3;
import o.LottieCompositionFactoryExternalSyntheticLambda7;
import o.LottieCompositionFactoryExternalSyntheticLambda9;
import o.LottieDrawableExternalSyntheticLambda1;
import o.LottieDrawableExternalSyntheticLambda14;
import o.NavigationDrawerKtExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.TrackGroupExternalSyntheticLambda0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda2;
import o.ZslRingBuffer;
import o.failAllPendingSnapshots;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.u4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PointComponentOverlayCtaView extends LinearLayout {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static long asBinder = 0;
    private static int asInterface = 1;
    public static final int onExtraCallback;
    private static int onTransact;
    private ViewGroup IAuthTabCallback;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private long onWarmupCompleted;

    static {
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallback = 8;
        int i = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{str, function0, pointComponentOverlayCtaView, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -168855694, 168855697);
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(FragmentActivity fragmentActivity, Function1 function1, PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(fragmentActivity, function1, pointComponentOverlayCtaView);
        int i4 = onTransact + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(pointComponentOverlayCtaView);
        int i4 = onTransact + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(PointComponentOverlayCtaView pointComponentOverlayCtaView, boolean z, Function0 function0, long j, float f, float f2, int i, int i2, int i3, String str, String str2, boolean z2, String str3, String str4, String str5, Function0 function02, Function0 function03, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = asInterface + 123;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(pointComponentOverlayCtaView, z, function0, j, f, f2, i, i2, i3, str, str2, z2, str3, str4, str5, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = asInterface + 89;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, function0, pointComponentOverlayCtaView, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 82 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, int i, int i2, int i3, String str, String str2, boolean z, LottieCompositionFactoryExternalSyntheticLambda3 lottieCompositionFactoryExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 113;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(f, i, i2, i3, str, str2, z, lottieCompositionFactoryExternalSyntheticLambda3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = asInterface + 79;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, long j, LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda14, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {str, Long.valueOf(j), lottieDrawableExternalSyntheticLambda14, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        if (i4 != 0) {
            return (Unit) onWarmupCompleted(iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback, -1658032398, 1658032400);
        }
        int i5 = 11 / 0;
        return (Unit) onWarmupCompleted(iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback, -1658032398, 1658032400);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        PointComponentOverlayCtaView pointComponentOverlayCtaView = (PointComponentOverlayCtaView) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, pointComponentOverlayCtaView);
        int i4 = asInterface + 111;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView, Function0 function02, LottieCompositionFactoryExternalSyntheticLambda15 lottieCompositionFactoryExternalSyntheticLambda15, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws getBacktraceNote {
        int i2 = 2 % 2;
        int i3 = asInterface + 113;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(str, str2, function0, pointComponentOverlayCtaView, function02, lottieCompositionFactoryExternalSyntheticLambda15, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(str, str2, function0, pointComponentOverlayCtaView, function02, lottieCompositionFactoryExternalSyntheticLambda15, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, pointComponentOverlayCtaView);
        int i4 = asInterface + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i5 | i7 | (~i4);
        int i9 = ~i5;
        int i10 = (~(i4 | i7)) | (~(i7 | i9));
        int i11 = i6 + i5 + i + ((-92689393) * i2) + (1942122663 * i3);
        int i12 = i11 * i11;
        int i13 = (i6 * 1048061654) + 1366922925 + (i5 * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (1048061961 * i) + (439444615 * i2) + ((-1279783457) * i3) + (i12 * 173867008);
        int i14 = (((-665130586) * i6) - 357761024) + ((-674687396) * i5) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i) + ((-1056047104) * i2) + ((-742522880) * i3) + ((-592117760) * i12) + (i13 * i13 * (-1898250240));
        if (i14 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i14 == 2) {
            return onWarmupCompleted(objArr);
        }
        boolean z = false;
        if (i14 != 3) {
            if (i14 == 4) {
                return onExtraCallbackWithResult(objArr);
            }
            final PointComponentOverlayCtaView pointComponentOverlayCtaView = (PointComponentOverlayCtaView) objArr[0];
            Context context = (Context) objArr[1];
            final String str = (String) objArr[2];
            final String str2 = (String) objArr[3];
            final String str3 = (String) objArr[4];
            final String str4 = (String) objArr[5];
            final int iIntValue = ((Number) objArr[6]).intValue();
            final int iIntValue2 = ((Number) objArr[7]).intValue();
            final int iIntValue3 = ((Number) objArr[8]).intValue();
            final Function0 function0 = (Function0) objArr[9];
            final Function0 function02 = (Function0) objArr[10];
            final long jLongValue = ((Number) objArr[11]).longValue();
            final boolean zBooleanValue = ((Boolean) objArr[12]).booleanValue();
            final float fFloatValue = ((Number) objArr[13]).floatValue();
            final float fFloatValue2 = ((Number) objArr[14]).floatValue();
            final boolean zBooleanValue2 = ((Boolean) objArr[15]).booleanValue();
            final String str5 = (String) objArr[16];
            final Function0 function03 = (Function0) objArr[17];
            int i15 = 2 % 2;
            ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
            composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-612055569, true, new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = onNavigationEvent + 23;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnExtraCallback = PointComponentOverlayCtaView.onExtraCallback(this.f$0, zBooleanValue2, function03, jLongValue, fFloatValue2, fFloatValue, iIntValue, iIntValue2, iIntValue3, str, str2, zBooleanValue, str5, str3, str4, function0, function02, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i19 = onNavigationEvent + 69;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return unitOnExtraCallback;
                }
            })));
            pointComponentOverlayCtaView.addView(composeView);
            int i16 = onTransact + 13;
            asInterface = i16 % 128;
            int i17 = i16 % 2;
            return null;
        }
        String str6 = (String) objArr[0];
        final Function0 function04 = (Function0) objArr[1];
        final PointComponentOverlayCtaView pointComponentOverlayCtaView2 = (PointComponentOverlayCtaView) objArr[2];
        u4 u4Var = (u4) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int i18 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue4 & 6) == 0) {
            iIntValue4 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
        }
        if ((iIntValue4 & 19) != 18) {
            int i19 = onTransact + 33;
            asInterface = i19 % 128;
            int i20 = i19 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue4 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i21 = asInterface + 77;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-674421962, iIntValue4, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:102)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function04);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pointComponentOverlayCtaView2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (true ^ (zOnNavigationEvent | zOnExtraCallback)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function05 = new Function0() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda3
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i23 = 2 % 2;
                            int i24 = onExtraCallbackWithResult + 97;
                            onWarmupCompleted = i24 % 128;
                            int i25 = i24 % 2;
                            Unit unitOnNavigationEvent = PointComponentOverlayCtaView.onNavigationEvent(function04, pointComponentOverlayCtaView2);
                            int i26 = onExtraCallbackWithResult + 29;
                            onWarmupCompleted = i26 % 128;
                            if (i26 % 2 != 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function05);
                    obj = function05;
                }
                u4Var.onNavigationEvent(str6, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, iIntValue4 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointComponentOverlayCtaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onWarmupCompleted = -1L;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PointComponentOverlayCtaView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onTransact + 39;
            int i3 = i2 % 128;
            asInterface = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 71;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public final void setBlockBackgroundClick(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setClickable(z);
        setFocusable(z);
        this.onNavigationEvent = z;
        int i4 = asInterface + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 33;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, TextUtils.getTrimmedLength("") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (asBinder / 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), Process.getGidForName("") + 60, ExpandableListView.getPackedPositionGroup(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetAfter("", 0) + 24, 19627 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (asBinder ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 59 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionGroup(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i6 = $11 + 21;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 91;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 58, 6383 - (Process.myPid() >> 22), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i10 = $10 + 93;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda14 = (LottieDrawableExternalSyntheticLambda14) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(lottieDrawableExternalSyntheticLambda14, "");
        if ((iIntValue & 6) == 0) {
            int i4 = asInterface + 23;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieDrawableExternalSyntheticLambda14);
                throw null;
            }
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieDrawableExternalSyntheticLambda14) ? 4 : 2;
            int i5 = asInterface + 49;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1131401289, iIntValue, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:80)");
            }
            lottieDrawableExternalSyntheticLambda14.IAuthTabCallback(str, jLongValue, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 432, UCPApiConstants.ARAM_TIME_OUT);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(float f, int i, int i2, int i3, String str, String str2, boolean z, LottieCompositionFactoryExternalSyntheticLambda3 lottieCompositionFactoryExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5;
        int i6 = 2 % 2;
        int i7 = asInterface + 53;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda3, "");
        if ((i4 & 6) == 0) {
            int i9 = asInterface + 73;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda3);
                throw null;
            }
            i5 = i4 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda3) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i5 & 19) != 18, i5 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(593470350, i5, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:87)");
            }
            lottieCompositionFactoryExternalSyntheticLambda3.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 7, (Object) null), str, failAllPendingSnapshots.IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, 0), failAllPendingSnapshots.IAuthTabCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, 0), str2, failAllPendingSnapshots.IAuthTabCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0), z, cameraCaptureResultEmptyCameraCaptureResult, (i5 << 21) & 29360128, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 63;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onTransact + 19;
        asInterface = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (function0 != null) {
            function0.invoke();
        }
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnWarmupCompleted = pointComponentOverlayCtaView.onWarmupCompleted();
        if (lottieDrawableExternalSyntheticLambda1OnWarmupCompleted != null) {
            int i4 = onTransact + 113;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            LottieCompositionFactoryExternalSyntheticLambda13.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1OnWarmupCompleted, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (function0 != null) {
            function0.invoke();
        }
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnWarmupCompleted = pointComponentOverlayCtaView.onWarmupCompleted();
        if (lottieDrawableExternalSyntheticLambda1OnWarmupCompleted != null) {
            int i3 = asInterface + 13;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                LottieCompositionFactoryExternalSyntheticLambda13.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1OnWarmupCompleted, false, 1, null);
            } else {
                LottieCompositionFactoryExternalSyntheticLambda13.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1OnWarmupCompleted, false, 1, null);
            }
            int i4 = asInterface + 83;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, final Function0 function0, final PointComponentOverlayCtaView pointComponentOverlayCtaView, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i4 = asInterface + 25;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var);
                throw null;
            }
            i2 = i | (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1788479122, i2, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:112)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(pointComponentOverlayCtaView);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda9
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            Unit unit;
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 113;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                unit = (Unit) PointComponentOverlayCtaView.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function0, pointComponentOverlayCtaView}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1331111797, -1331111796);
                                int i7 = 44 / 0;
                            } else {
                                unit = (Unit) PointComponentOverlayCtaView.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function0, pointComponentOverlayCtaView}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1331111797, -1331111796);
                            }
                            int i8 = onWarmupCompleted + 109;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    obj = function02;
                }
                u4Var.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = asInterface + 83;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final String str, final String str2, final Function0 function0, final PointComponentOverlayCtaView pointComponentOverlayCtaView, final Function0 function02, LottieCompositionFactoryExternalSyntheticLambda15 lottieCompositionFactoryExternalSyntheticLambda15, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws getBacktraceNote {
        int i2;
        boolean z;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda15, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda15) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i4 = onTransact + 117;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asInterface + 3;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(41301814, i2, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:99)");
                    int i7 = 79 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(41301814, i2, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:99)");
                }
            }
            if (str == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2061774633);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2061774634);
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-674421962, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallback + 55;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Object obj4 = null;
                        String str3 = str;
                        Function0 function03 = function0;
                        PointComponentOverlayCtaView pointComponentOverlayCtaView2 = pointComponentOverlayCtaView;
                        u4 u4Var = (u4) obj;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (i10 != 0) {
                            PointComponentOverlayCtaView.IAuthTabCallback(str3, function03, pointComponentOverlayCtaView2, u4Var, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                            obj4.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = PointComponentOverlayCtaView.IAuthTabCallback(str3, function03, pointComponentOverlayCtaView2, u4Var, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                        int i11 = IAuthTabCallback + 39;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                if (str2 != null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(995435456);
                    encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1788479122, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallback + 95;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 == 0) {
                                PointComponentOverlayCtaView.onExtraCallback(str2, function02, pointComponentOverlayCtaView, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                throw null;
                            }
                            Unit unitOnExtraCallback = PointComponentOverlayCtaView.onExtraCallback(str2, function02, pointComponentOverlayCtaView, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i10 = onExtraCallback + 7;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(995976406);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
                }
                lottieCompositionFactoryExternalSyntheticLambda15.IAuthTabCallback(null, null, encoderProfilesProxyVideoProfileProxyOnExtraCallback2, encoderProfilesProxyVideoProfileProxyOnExtraCallback, null, null, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 384, 243);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final PointComponentOverlayCtaView pointComponentOverlayCtaView, boolean z, Function0 function0, long j, float f, final float f2, final int i, final int i2, final int i3, final String str, final String str2, final boolean z2, final String str3, final String str4, final String str5, final Function0 function02, final Function0 function03, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        boolean z3;
        int i5 = 2 % 2;
        if ((i4 & 3) != 2) {
            int i6 = onTransact + 3;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            z3 = true;
        } else {
            int i8 = asInterface + 11;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i4 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = asInterface + 119;
                onTransact = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-612055569, i4, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:69)");
                    int i11 = 17 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-612055569, i4, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView.setOverlayView.<anonymous>.<anonymous> (PointComponentOverlayCtaView.kt:69)");
                }
            }
            LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnExtraCallback = LottieCompositionFactoryExternalSyntheticLambda9.onExtraCallback(LottieCompositionFactoryExternalSyntheticLambda7.onExtraCallback.onExtraCallback, 0, z, function0, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
            lottieDrawableExternalSyntheticLambda1OnExtraCallback.onNavigationEvent(j);
            final long jOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f));
            LottieCompositionFactoryExternalSyntheticLambda19.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 7, (Object) null), ForwardingCameraControl.onExtraCallback(593470350, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 11;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallbackWithResult = PointComponentOverlayCtaView.onExtraCallbackWithResult(f2, i, i2, i3, str, str2, z2, (LottieCompositionFactoryExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onExtraCallback + 97;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(1131401289, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda6
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallback + 49;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 == 0) {
                        PointComponentOverlayCtaView.onExtraCallbackWithResult(str3, jOnNavigationEvent, (LottieDrawableExternalSyntheticLambda14) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = PointComponentOverlayCtaView.onExtraCallbackWithResult(str3, jOnNavigationEvent, (LottieDrawableExternalSyntheticLambda14) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i14 = onExtraCallbackWithResult + 15;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 17 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(41301814, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws getBacktraceNote {
                    int i12 = 2 % 2;
                    int i13 = onWarmupCompleted + 91;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnNavigationEvent = PointComponentOverlayCtaView.onNavigationEvent(str4, str5, function02, pointComponentOverlayCtaView, function03, (LottieCompositionFactoryExternalSyntheticLambda15) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onWarmupCompleted + 15;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), lottieDrawableExternalSyntheticLambda1OnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 3504, 0);
            pointComponentOverlayCtaView.onExtraCallback(lottieDrawableExternalSyntheticLambda1OnExtraCallback);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = asInterface + 59;
                onTransact = i12 % 128;
                if (i12 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i13 = 34 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(FragmentActivity fragmentActivity, Function1 function1, PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int i = 2 % 2;
        if (fragmentActivity.isFinishing()) {
            if (function1 != null) {
                int i2 = asInterface + 23;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    function1.invoke(Boolean.FALSE);
                    return;
                } else {
                    function1.invoke(Boolean.FALSE);
                    int i3 = 58 / 0;
                    return;
                }
            }
            return;
        }
        pointComponentOverlayCtaView.setVisibility(0);
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnWarmupCompleted = pointComponentOverlayCtaView.onWarmupCompleted();
        if (lottieDrawableExternalSyntheticLambda1OnWarmupCompleted != null) {
            int i4 = asInterface + 83;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                lottieDrawableExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback();
            } else {
                lottieDrawableExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback();
                int i5 = 89 / 0;
            }
        }
    }

    static /* synthetic */ void onWarmupCompleted(PointComponentOverlayCtaView pointComponentOverlayCtaView, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, ViewGroup viewGroup, int i, int i2, int i3, long j, float f, float f2, boolean z, boolean z2, String str5, Function0 function03, int i4, Object obj) throws Throwable {
        int i5;
        boolean z3;
        String strIntern;
        int i6 = 2 % 2;
        int i7 = (i4 & 128) != 0 ? R.color.grey_opacity_800 : i;
        int i8 = (i4 & 256) != 0 ? R.color.blue_600 : i2;
        if ((i4 & 512) != 0) {
            i5 = R.color.grey_opacity_600;
            int i9 = asInterface + 37;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i5 = i3;
        }
        long j2 = (i4 & 1024) != 0 ? 1000L : j;
        float f3 = (i4 & 2048) != 0 ? 0.0f : f;
        float f4 = (i4 & 4096) == 0 ? f2 : 0.0f;
        boolean z4 = (i4 & 8192) != 0 ? false : z;
        if ((i4 & 16384) != 0) {
            int i11 = onTransact + 17;
            asInterface = i11 % 128;
            z3 = i11 % 2 == 0;
        } else {
            z3 = z2;
        }
        if ((32768 & i4) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{9450, 33637, 27600, 53835, 47805, 24935, 51679, 45480, 6249, 49373, 44893, 6055, 65039, 42646, 3750, 62827, 24029, 1074, 60583, 19269, 13207, 39904, 16911, 10884, 37166, 31220, 8207, 34924, 28923, 57160, 34775, 28193, 54989, 48385, 25963, 52722, 46144, 7369, 64381, 41876, 2570, 62054, 23272, 285, 59820, 20518, 14471, 59153}, 42899 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            strIntern = str5;
        }
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{pointComponentOverlayCtaView, str, str2, str3, str4, function0, function02, viewGroup, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i5), Long.valueOf(j2), Float.valueOf(f3), Float.valueOf(f4), Boolean.valueOf(z4), Boolean.valueOf(z3), strIntern, (i4 & 65536) != 0 ? null : function03}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -393275602, 393275606);
    }

    private static final void onExtraCallbackWithResult(PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int i = 2 % 2;
        if (pointComponentOverlayCtaView.isAttachedToWindow()) {
            pointComponentOverlayCtaView.setVisibility(0);
            LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnWarmupCompleted = pointComponentOverlayCtaView.onWarmupCompleted();
            if (lottieDrawableExternalSyntheticLambda1OnWarmupCompleted != null) {
                lottieDrawableExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback();
                int i2 = onTransact + 125;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        int i4 = asInterface + 101;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final PointComponentOverlayCtaView pointComponentOverlayCtaView = (PointComponentOverlayCtaView) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        Function0 function0 = (Function0) objArr[5];
        Function0 function02 = (Function0) objArr[6];
        ViewGroup viewGroup = (ViewGroup) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int iIntValue3 = ((Number) objArr[10]).intValue();
        long jLongValue = ((Number) objArr[11]).longValue();
        float fFloatValue = ((Number) objArr[12]).floatValue();
        float fFloatValue2 = ((Number) objArr[13]).floatValue();
        boolean zBooleanValue = ((Boolean) objArr[14]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[15]).booleanValue();
        String str5 = (String) objArr[16];
        Function0 function03 = (Function0) objArr[17];
        int i = 2 % 2;
        pointComponentOverlayCtaView.IAuthTabCallback = viewGroup;
        Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup).IAuthTabCallback();
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        while (!(!itIAuthTabCallback.hasNext())) {
            View view = (View) itIAuthTabCallback.next();
            if (!(!(view instanceof PointComponentOverlayView))) {
                viewGroup.removeView(view);
                int i4 = asInterface + 123;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Context context = pointComponentOverlayCtaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{pointComponentOverlayCtaView, context, str, str2, str3, str4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), function0, function02, Long.valueOf(jLongValue), Boolean.valueOf(zBooleanValue), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), Boolean.valueOf(zBooleanValue2), str5, function03}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 759464028, -759464028);
        pointComponentOverlayCtaView.post(new Runnable() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 13;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                PointComponentOverlayCtaView.IAuthTabCallback(this.f$0);
                int i9 = IAuthTabCallback + 57;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        });
        pointComponentOverlayCtaView.onWarmupCompleted = System.currentTimeMillis();
        return null;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27306, 27297, 27282, 27297, 27296, 27364, 27364, 27387, 27296, 27301, 27297, 27297, 27309, 27303, 27300, 27296, 27307, 27367, 27297, 27300, 27301, 27296, 27366, 27297, 27303, 27306, 27300, 27301, 27364, 27303, 27300, 27302, 27302, 27300, 27280, 27366, 27281, 27360, 27364, 27302, 27306, 27367, 27296, 27296, 27300, 27297, 27367, 27280};
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void onNavigationEvent(FragmentActivity fragmentActivity, Function1 function1, PointComponentOverlayCtaView pointComponentOverlayCtaView, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, ViewGroup viewGroup, long j, float f, float f2, boolean z, boolean z2, String str5, Function0 function03) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(fragmentActivity, function1, pointComponentOverlayCtaView, str, str2, str3, str4, function0, function02, viewGroup, j, f, f2, z, z2, str5, function03);
            int i4 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        private onExtraCallbackWithResult() {
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            char c;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - ExpandableListView.getPackedPositionType(j)), 36 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr2, i2, cArr4, 0, i3);
            if (bArr != null) {
                int i7 = $10 + 61;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                    c = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10935), 65 - (ViewConfiguration.getEdgeSlop() >> 16), 16718 - ExpandableListView.getPackedPositionGroup(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29, MotionEvent.axisFromString("") + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49468), TextUtils.lastIndexOf("", '0', 0, 0) + 71, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr4, 0, cArr5, 0, i3);
                int i10 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr4, i10, i5);
                System.arraycopy(cArr5, i5, cArr4, 0, i10);
            }
            if (!(!z)) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i11 = $10 + 45;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr6;
            }
            if (i4 > 0) {
                int i13 = $11 + 83;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i15 = $10 + 83;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i17 = $10 + 9;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public static /* synthetic */ boolean onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, long j, float f, float f2, boolean z, boolean z2, String str5, Function1 function1, int i, Object obj) throws Throwable {
            String str6;
            Function0 function03;
            long j2;
            float f3;
            float f4;
            Function1 function12;
            String strIntern;
            Function1 function13;
            int i2 = 2 % 2;
            Object obj2 = null;
            String str7 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                int i3 = onWarmupCompleted;
                int i4 = i3 + 119;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 115;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 2;
                }
                str6 = null;
            } else {
                str6 = str3;
            }
            String str8 = (i & 16) != 0 ? null : str4;
            Function0 function04 = (i & 32) != 0 ? null : function0;
            if ((i & 64) != 0) {
                int i8 = onWarmupCompleted + 85;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                function03 = null;
            } else {
                function03 = function02;
            }
            if ((i & 128) != 0) {
                int i9 = onWarmupCompleted + 35;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                j2 = 1000;
            } else {
                j2 = j;
            }
            if ((i & 256) != 0) {
                int i11 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i & 512) != 0) {
                int i13 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            boolean z3 = (i & 1024) != 0 ? false : z;
            boolean z4 = (i & 2048) != 0 ? false : z2;
            if ((i & 4096) != 0) {
                int i15 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i15 % 128;
                if (i15 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 48, 123, 13}, false, null, objArr);
                    strIntern = ((String) objArr[0]).intern();
                    function12 = null;
                } else {
                    function12 = null;
                    Object[] objArr2 = new Object[1];
                    a(new int[]{0, 48, 123, 13}, true, null, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                }
            } else {
                function12 = null;
                strIntern = str5;
            }
            if ((i & 8192) != 0) {
                int i16 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                function13 = function12;
            } else {
                function13 = function1;
            }
            return onextracallbackwithresult.onExtraCallback(fragmentActivity, str, str7, str6, str8, function04, function03, j2, f3, f4, z3, z4, strIntern, function13);
        }

        public final boolean onExtraCallback(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, long j, float f, float f2, boolean z, boolean z2, @NotNull String str5, @Nullable Function1<? super Boolean, Unit> function1) {
            ViewGroup viewGroup;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str5, "");
            View viewFindViewById = fragmentActivity.findViewById(android.R.id.content);
            if (viewFindViewById instanceof ViewGroup) {
                int i2 = onWarmupCompleted + 109;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                viewGroup = (ViewGroup) viewFindViewById;
                int i4 = i3 + 71;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                return false;
            }
            onWarmupCompleted(this, viewGroup, fragmentActivity, str, str2, str3, str4, function0, function02, j, f, f2, z, z2, str5, function1, null, 32768, null);
            return true;
        }

        static /* synthetic */ PointComponentOverlayCtaView onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, ViewGroup viewGroup, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, long j, float f, float f2, boolean z, boolean z2, String str5, Function1 function1, Function0 function03, int i, Object obj) {
            Function0 function04;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 57;
            onExtraCallbackWithResult = i4 % 128;
            Function1 function12 = (i4 % 2 == 0 ? (i & 16384) == 0 : (i & 28855) == 0) ? function1 : null;
            if ((i & 32768) != 0) {
                int i5 = i3 + 107;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                function04 = null;
            } else {
                function04 = function03;
            }
            return onextracallbackwithresult.onExtraCallbackWithResult(viewGroup, fragmentActivity, str, str2, str3, str4, function0, function02, j, f, f2, z, z2, str5, function12, function04);
        }

        private final PointComponentOverlayCtaView onExtraCallbackWithResult(final ViewGroup viewGroup, final FragmentActivity fragmentActivity, final String str, final String str2, final String str3, final String str4, final Function0<Unit> function0, final Function0<Unit> function02, final long j, final float f, final float f2, final boolean z, final boolean z2, final String str5, final Function1<? super Boolean, Unit> function1, final Function0<Unit> function03) {
            int i = 2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.IAuthTabCallback(viewGroup, fragmentActivity);
            NavigationDrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult(viewGroup, fragmentActivity);
            AttributeSet attributeSet = null;
            final PointComponentOverlayCtaView pointComponentOverlayCtaView = new PointComponentOverlayCtaView(fragmentActivity, attributeSet, 2, attributeSet);
            viewGroup.addView(pointComponentOverlayCtaView);
            pointComponentOverlayCtaView.post(new Runnable() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayCtaView$Companion$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 63;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    PointComponentOverlayCtaView.onExtraCallbackWithResult.onNavigationEvent(fragmentActivity, function1, pointComponentOverlayCtaView, str, str2, str3, str4, function0, function02, viewGroup, j, f, f2, z, z2, str5, function03);
                    int i5 = onWarmupCompleted + 33;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return pointComponentOverlayCtaView;
        }

        private static final void onWarmupCompleted(FragmentActivity fragmentActivity, Function1 function1, PointComponentOverlayCtaView pointComponentOverlayCtaView, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, ViewGroup viewGroup, long j, float f, float f2, boolean z, boolean z2, String str5, Function0 function03) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!fragmentActivity.isFinishing()) {
                PointComponentOverlayCtaView.onWarmupCompleted(pointComponentOverlayCtaView, str, str2, str3, str4, function0, function02, viewGroup, 0, 0, 0, j, f, f2, z, z2, str5, function03, 896, null);
                int i4 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (function1 != null) {
                int i5 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                function1.invoke(Boolean.FALSE);
            }
            int i7 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final LottieDrawableExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
            return (LottieDrawableExternalSyntheticLambda1) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        return (LottieDrawableExternalSyntheticLambda1) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    private final void onExtraCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1);
        int i4 = onTransact + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{function0, pointComponentOverlayCtaView}, iOnExtraCallback, 1331111797, -1331111796);
    }

    private final void onExtraCallbackWithResult(Context context, String str, String str2, String str3, String str4, int i, int i2, int i3, Function0<Unit> function0, Function0<Unit> function02, long j, boolean z, float f, float f2, boolean z2, String str5, Function0<Unit> function03) {
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, context, str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), function0, function02, Long.valueOf(j), Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z2), str5, function03}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 759464028, -759464028);
    }

    private static final Unit onNavigationEvent(String str, long j, LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda14, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{str, Long.valueOf(j), lottieDrawableExternalSyntheticLambda14, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1658032398, 1658032400);
    }

    private static final Unit onWarmupCompleted(String str, Function0 function0, PointComponentOverlayCtaView pointComponentOverlayCtaView, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{str, function0, pointComponentOverlayCtaView, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -168855694, 168855697);
    }

    private final void onNavigationEvent(String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, ViewGroup viewGroup, int i, int i2, int i3, long j, float f, float f2, boolean z, boolean z2, String str5, Function0<Unit> function03) {
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, str, str2, str3, str4, function0, function02, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z), Boolean.valueOf(z2), str5, function03}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -393275602, 393275606);
    }

    static void onNavigationEvent() {
        asBinder = -7889558097255685707L;
    }
}
