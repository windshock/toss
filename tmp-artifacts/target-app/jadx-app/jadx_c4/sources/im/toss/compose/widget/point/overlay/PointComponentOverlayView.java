package im.toss.compose.widget.point.overlay;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.internal.ads.zzgc;
import com.skt.usp.UCPApiConstants;
import im.toss.compose.widget.point.overlay.PointComponentOverlayView;
import im.toss.tds.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LottieCompositionFactoryExternalSyntheticLambda3;
import o.LottieCompositionFactoryExternalSyntheticLambda5;
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
import o.clearRevision;
import o.failAllPendingSnapshots;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.setAdVideoPlaybackListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PointComponentOverlayView extends LinearLayout {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private long onExtraCallbackWithResult;
    private ViewGroup onNavigationEvent;

    static {
        int i = asBinder + 73;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws getBacktraceNote {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~(i5 | i7);
        int i11 = i | i10 | (~(i8 | i6));
        int i12 = i + i6 + i4 + (1997535707 * i2) + (1930545336 * i3);
        int i13 = i12 * i12;
        int i14 = ((-2054695253) * i) + 138751921 + (i6 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + ((-2054694363) * i4) + (1502648999 * i2) + (931574424 * i3) + (i13 * (-2139684864));
        if (((-1352905585) * i) + 1468203008 + ((-417352845) * i6) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i4) + ((-1408630784) * i2) + ((-2070937600) * i3) + (392888320 * i13) + (i14 * i14 * (-174260224)) != 1) {
            return onNavigationEvent(objArr);
        }
        PointComponentOverlayView pointComponentOverlayView = (PointComponentOverlayView) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        long jLongValue = ((Number) objArr[2]).longValue();
        LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted = (LottieDrawableExternalSyntheticLambda1.onWarmupCompleted) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int iIntValue3 = ((Number) objArr[7]).intValue();
        String str = (String) objArr[8];
        String str2 = (String) objArr[9];
        String str3 = (String) objArr[10];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue4 = ((Number) objArr[12]).intValue();
        int i15 = 2 % 2;
        int i16 = onWarmupCompleted + 33;
        onTransact = i16 % 128;
        int i17 = i16 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pointComponentOverlayView, zBooleanValue, jLongValue, onwarmupcompleted, fFloatValue, iIntValue, iIntValue2, iIntValue3, str, str2, str3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i18 = onWarmupCompleted + 43;
        onTransact = i18 % 128;
        int i19 = i18 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, long j, LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda14, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, j, lottieDrawableExternalSyntheticLambda14, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 91;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PointComponentOverlayView pointComponentOverlayView, long j, boolean z) throws getBacktraceNote {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {pointComponentOverlayView, Long.valueOf(j), Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onExtraCallback(1531003865, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1531003865, objArr);
        int i4 = onTransact + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, int i, int i2, int i3, String str, String str2, LottieCompositionFactoryExternalSyntheticLambda3 lottieCompositionFactoryExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onTransact + 31;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return onWarmupCompleted(f, i, i2, i3, str, str2, lottieCompositionFactoryExternalSyntheticLambda3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onWarmupCompleted(f, i, i2, i3, str, str2, lottieCompositionFactoryExternalSyntheticLambda3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointComponentOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onExtraCallbackWithResult = -1L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PointComponentOverlayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onTransact;
            int i3 = i2 + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private final void onNavigationEvent(Context context, final String str, final String str2, final int i, final int i2, final int i3, final LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, final long j, final float f, final boolean z, final String str3) {
        int i4 = 2 % 2;
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-356662468, true, new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayView$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                PointComponentOverlayView pointComponentOverlayView = this.f$0;
                boolean z2 = z;
                long j2 = j;
                LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
                float f2 = f;
                int i8 = i;
                int i9 = i2;
                int i10 = i3;
                int iIntValue = ((Integer) obj2).intValue();
                Object[] objArr = {pointComponentOverlayView, Boolean.valueOf(z2), Long.valueOf(j2), onwarmupcompleted2, Float.valueOf(f2), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), str, str2, str3, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                Unit unit = (Unit) PointComponentOverlayView.onExtraCallback(-167304677, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 167304678, objArr);
                int i11 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    return unit;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        })));
        addView(composeView);
        int i5 = onWarmupCompleted + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, long j, LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda14, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onTransact + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(lottieDrawableExternalSyntheticLambda14, "");
            if ((i & 28) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieDrawableExternalSyntheticLambda14)) {
                    int i6 = onWarmupCompleted + 5;
                    int i7 = i6 % 128;
                    onTransact = i7;
                    i2 = i6 % 2 != 0 ? 4 : 5;
                    int i8 = i7 + 11;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(lottieDrawableExternalSyntheticLambda14, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1630844208, i3, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayView.kt:60)");
            }
            lottieDrawableExternalSyntheticLambda14.IAuthTabCallback(str, j, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), 0L, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 432, UCPApiConstants.ARAM_TIME_OUT);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = onTransact + 25;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
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

    private static final Unit onWarmupCompleted(float f, int i, int i2, int i3, String str, String str2, LottieCompositionFactoryExternalSyntheticLambda3 lottieCompositionFactoryExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda3, "");
        if ((i4 & 6) == 0) {
            i5 = i4 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda3) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i5 & 19) != 18, i5 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onWarmupCompleted + 59;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        } else {
            int i9 = onTransact + 41;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2065022710, i5, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayView.setOverlayView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PointComponentOverlayView.kt:67)");
            }
            lottieCompositionFactoryExternalSyntheticLambda3.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 7, (Object) null), str, failAllPendingSnapshots.IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, 0), failAllPendingSnapshots.IAuthTabCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, 0), str2, failAllPendingSnapshots.IAuthTabCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0), false, cameraCaptureResultEmptyCameraCaptureResult, (i5 << 21) & 29360128, 64);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 63;
                onTransact = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 92 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(PointComponentOverlayView pointComponentOverlayView, boolean z, long j, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, final float f, final int i, final int i2, final int i3, final String str, final String str2, final String str3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws getBacktraceNote {
        int i5 = 2 % 2;
        int i6 = onTransact + 5;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i4 & 3) != 2, i4 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 27;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-356662468, i4, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayView.setOverlayView.<anonymous>.<anonymous> (PointComponentOverlayView.kt:51)");
                int i10 = onTransact + 117;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            }
            LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnExtraCallback = LottieCompositionFactoryExternalSyntheticLambda9.onExtraCallback(LottieCompositionFactoryExternalSyntheticLambda7.onWarmupCompleted.onExtraCallback, 0, z, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 10);
            lottieDrawableExternalSyntheticLambda1OnExtraCallback.onNavigationEvent(j);
            final long jOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f));
            LottieCompositionFactoryExternalSyntheticLambda5.onExtraCallback(ForwardingCameraControl.onExtraCallback(2065022710, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayView$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + 107;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnNavigationEvent = PointComponentOverlayView.onNavigationEvent(f, i, i2, i3, str, str2, (LottieCompositionFactoryExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onWarmupCompleted + 53;
                    IAuthTabCallback = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), lottieDrawableExternalSyntheticLambda1OnExtraCallback, ForwardingCameraControl.onExtraCallback(-1630844208, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayView$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unitOnExtraCallback;
                    int i12 = 2 % 2;
                    int i13 = onExtraCallbackWithResult + 67;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        unitOnExtraCallback = PointComponentOverlayView.onExtraCallback(str3, jOnNavigationEvent, (LottieDrawableExternalSyntheticLambda14) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i14 = 36 / 0;
                    } else {
                        unitOnExtraCallback = PointComponentOverlayView.onExtraCallback(str3, jOnNavigationEvent, (LottieDrawableExternalSyntheticLambda14) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i15 = onNavigationEvent + 55;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), onwarmupcompleted, null, cameraCaptureResultEmptyCameraCaptureResult, 390, 16);
            pointComponentOverlayView.onExtraCallbackWithResult(lottieDrawableExternalSyntheticLambda1OnExtraCallback);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PointComponentOverlayView pointComponentOverlayView = (PointComponentOverlayView) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        if (!pointComponentOverlayView.isAttachedToWindow()) {
            return null;
        }
        int i2 = onWarmupCompleted + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        pointComponentOverlayView.setVisibility(0);
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnExtraCallbackWithResult = pointComponentOverlayView.onExtraCallbackWithResult();
        if (lottieDrawableExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
            return null;
        }
        lottieDrawableExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallback(jLongValue, 0, zBooleanValue);
        int i4 = onWarmupCompleted + 49;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        int i5 = 2 % 5;
        return null;
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable String str2, int i, int i2, int i3, final long j, @NotNull LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, long j2, float f, final boolean z, boolean z2, @NotNull String str3, @NotNull ViewGroup viewGroup) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.onNavigationEvent = viewGroup;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        onNavigationEvent(context, str, str2, i, i2, i3, onwarmupcompleted, j2, f, z2, str3);
        post(new Runnable() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.lang.Runnable
            public final void run() throws getBacktraceNote {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 47;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                PointComponentOverlayView.onExtraCallbackWithResult(this.f$0, j, z);
                int i8 = IAuthTabCallback + 125;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }
        });
        this.onExtraCallbackWithResult = System.currentTimeMillis();
        int i5 = onWarmupCompleted + 115;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted = {27195, 27301, 27296, 27301, 27271, 27264, 27296, 27298, 27296, 27267, 27267, 27296, 27302, 27303, 27298, 27266, 27269, 27301, 27301, 27300, 27301, 27304, 27275, 27275, 27270, 27360, 27269, 27302, 27270, 27267, 27326, 27296, 27296, 27264, 27275, 27309, 27301, 27305, 27305, 27326, 27264, 27362, 27391, 27293, 27296, 27297, 27327, 27301};

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void onNavigationEvent(ComponentActivity componentActivity, Function1 function1, PointComponentOverlayView pointComponentOverlayView, String str, String str2, int i, int i2, int i3, long j, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, long j2, float f, boolean z, boolean z2, String str3, ViewGroup viewGroup) {
            int i4 = 2 % 2;
            int i5 = onNavigationEvent + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            onWarmupCompleted(componentActivity, function1, pointComponentOverlayView, str, str2, i, i2, i3, j, onwarmupcompleted, j2, f, z, z2, str3, viewGroup);
            if (i6 != 0) {
                throw null;
            }
            int i7 = onNavigationEvent + 13;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ boolean onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, ComponentActivity componentActivity, String str, String str2, int i, int i2, int i3, long j, float f, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, long j2, boolean z, boolean z2, String str3, Function1 function1, int i4, Object obj) throws Throwable {
            int i5;
            int i6;
            float f2;
            LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted2;
            boolean z3;
            boolean z4;
            String strIntern;
            Function1 function12;
            int i7;
            int i8 = 2 % 2;
            String str4 = (i4 & 4) != 0 ? null : str2;
            if ((i4 & 8) != 0) {
                int i9 = onNavigationEvent + 85;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    i7 = R.color.grey_opacity_800;
                    int i10 = 1 / 0;
                } else {
                    i7 = R.color.grey_opacity_800;
                }
                i5 = i7;
            } else {
                i5 = i;
            }
            int i11 = (i4 & 16) != 0 ? R.color.blue_600 : i2;
            if ((i4 & 32) != 0) {
                int i12 = onNavigationEvent + 49;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                i6 = R.color.grey_opacity_600;
            } else {
                i6 = i3;
            }
            long j3 = (i4 & 64) != 0 ? 1000L : j;
            if ((i4 & 128) != 0) {
                int i14 = IAuthTabCallback + 53;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                f2 = 0.0f;
            } else {
                f2 = f;
            }
            if ((i4 & 256) != 0) {
                int i16 = onNavigationEvent + 59;
                IAuthTabCallback = i16 % 128;
                if (i16 % 2 != 0) {
                    LottieDrawableExternalSyntheticLambda1.onWarmupCompleted.C0016onWarmupCompleted c0016onWarmupCompleted = LottieDrawableExternalSyntheticLambda1.onWarmupCompleted.C0016onWarmupCompleted.onExtraCallback;
                    throw null;
                }
                onwarmupcompleted2 = LottieDrawableExternalSyntheticLambda1.onWarmupCompleted.C0016onWarmupCompleted.onExtraCallback;
            } else {
                onwarmupcompleted2 = onwarmupcompleted;
            }
            long j4 = (i4 & 512) != 0 ? 3000L : j2;
            if ((i4 & 1024) != 0) {
                int i17 = IAuthTabCallback + 11;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                z3 = false;
            } else {
                z3 = z;
            }
            if ((i4 & 2048) != 0) {
                int i19 = IAuthTabCallback + 81;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            if ((i4 & 4096) != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 48, 125, 0}, true, new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                strIntern = str3;
            }
            if ((i4 & 8192) != 0) {
                int i21 = onNavigationEvent + 103;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                function12 = null;
            } else {
                function12 = function1;
            }
            return onextracallbackwithresult.onExtraCallbackWithResult(componentActivity, str, str4, i5, i11, i6, j3, f2, onwarmupcompleted2, j4, z3, z4, strIntern, function12);
        }

        public final boolean onExtraCallbackWithResult(@NotNull ComponentActivity componentActivity, @NotNull String str, @Nullable String str2, int i, int i2, int i3, long j, float f, @NotNull LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, long j2, boolean z, boolean z2, @NotNull String str3, @Nullable Function1<? super Boolean, Unit> function1) {
            ViewGroup viewGroup;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(componentActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(str3, "");
            View viewFindViewById = componentActivity.findViewById(android.R.id.content);
            if (viewFindViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewFindViewById;
            } else {
                int i5 = onNavigationEvent + 23;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                viewGroup = null;
            }
            if (viewGroup != null) {
                onNavigationEvent(viewGroup, componentActivity, str, str2, i, i2, i3, onwarmupcompleted, j, f, j2, z, z2, str3, function1);
                return true;
            }
            int i7 = onNavigationEvent + 77;
            IAuthTabCallback = i7 % 128;
            return i7 % 2 != 0;
        }

        private final void onNavigationEvent(final ViewGroup viewGroup, final ComponentActivity componentActivity, final String str, final String str2, final int i, final int i2, final int i3, final LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, final long j, final float f, final long j2, final boolean z, final boolean z2, final String str3, final Function1<? super Boolean, Unit> function1) {
            int i4 = 2;
            int i5 = 2 % 2;
            int i6 = IAuthTabCallback + 97;
            onNavigationEvent = i6 % 128;
            AttributeSet attributeSet = null;
            if (i6 % 2 != 0) {
                Iterator itIAuthTabCallback = clearRevision.onExtraCallbackWithResult(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup), PointComponentOverlayView.class).IAuthTabCallback();
                while (itIAuthTabCallback.hasNext()) {
                    int i7 = IAuthTabCallback + 83;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    viewGroup.removeView((PointComponentOverlayView) itIAuthTabCallback.next());
                }
                AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.IAuthTabCallback(viewGroup, componentActivity);
                NavigationDrawerKtExternalSyntheticLambda1.onExtraCallbackWithResult(viewGroup, componentActivity);
                final PointComponentOverlayView pointComponentOverlayView = new PointComponentOverlayView(componentActivity, attributeSet, i4, attributeSet);
                pointComponentOverlayView.post(new Runnable() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayView$Companion$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 57;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        PointComponentOverlayView.onExtraCallbackWithResult.onNavigationEvent(componentActivity, function1, pointComponentOverlayView, str, str2, i, i2, i3, j2, onwarmupcompleted, j, f, z, z2, str3, viewGroup);
                        int i12 = onWarmupCompleted + 81;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                    }
                });
                viewGroup.addView(pointComponentOverlayView);
                return;
            }
            clearRevision.onExtraCallbackWithResult(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup), PointComponentOverlayView.class).IAuthTabCallback();
            attributeSet.hashCode();
            throw null;
        }

        private static final void onWarmupCompleted(ComponentActivity componentActivity, Function1 function1, PointComponentOverlayView pointComponentOverlayView, String str, String str2, int i, int i2, int i3, long j, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, long j2, float f, boolean z, boolean z2, String str3, ViewGroup viewGroup) {
            int i4 = 2 % 2;
            if (componentActivity.isFinishing()) {
                int i5 = onNavigationEvent;
                int i6 = i5 + 85;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (function1 != null) {
                    int i8 = i5 + 45;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
            pointComponentOverlayView.IAuthTabCallback(str, str2, i, i2, i3, j, onwarmupcompleted, j2, f, z, z2, str3, viewGroup);
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onWarmupCompleted;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35283), Color.green(0) + 35, 14239 - View.MeasureSpec.makeMeasureSpec(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                char[] cArr5 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 10935), 65 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 29, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i8] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i9 = $11 + 33;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), View.getDefaultSize(0, 0) + 70, Process.getGidForName("") + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i5 > 0) {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i11 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr4, i11, i5);
                System.arraycopy(cArr6, i5, cArr4, 0, i11);
            }
            if (z) {
                int i12 = $11 + 109;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i13 = $11 + 25;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr;
            }
            if (i4 > 0) {
                int i15 = $10 + 29;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    int i17 = $10 + 125;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }

    private final LottieDrawableExternalSyntheticLambda1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) this.onExtraCallback.onExtraCallbackWithResult();
            int i3 = onWarmupCompleted + 81;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 93 / 0;
            }
            return lottieDrawableExternalSyntheticLambda1;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1);
        int i4 = onWarmupCompleted + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PointComponentOverlayView pointComponentOverlayView, boolean z, long j, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, float f, int i, int i2, int i3, String str, String str2, String str3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {pointComponentOverlayView, Boolean.valueOf(z), Long.valueOf(j), onwarmupcompleted, Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2, str3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-167304677, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 167304678, objArr);
    }

    private static final void onExtraCallback(PointComponentOverlayView pointComponentOverlayView, long j, boolean z) throws getBacktraceNote {
        Object[] objArr = {pointComponentOverlayView, Long.valueOf(j), Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        onExtraCallback(1531003865, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1531003865, objArr);
    }
}
