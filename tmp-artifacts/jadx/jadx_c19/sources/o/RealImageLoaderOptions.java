package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RealImageLoaderOptions;
import o.setCacheComposition;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RealImageLoaderOptions {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    private static final Unit IAuthTabCallback(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str2, String str3, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 31;
        onExtraCallback = i6 % 128;
        IAuthTabCallback(str, quirksExternalSyntheticBackport0, str2, str3, function0, cameraCaptureResultEmptyCameraCaptureResult, i6 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 49;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = i8 | i9;
        int i11 = ~(i10 | i2);
        int i12 = ~i2;
        int i13 = (~(i8 | i4)) | (~(i9 | i12)) | (~(i9 | i3));
        int i14 = ~(i12 | i10);
        int i15 = i3 + i4 + i6 + (1938118820 * i5) + ((-1869228383) * i7);
        int i16 = i15 * i15;
        int i17 = (i3 * (-1046486968)) + 2037645312 + ((-1046486968) * i4) + (1604861810 * i11) + (i13 * (-1345052743)) + ((-1345052743) * i14) + (1903427584 * i6) + ((-1907359744) * i5) + (1374945280 * i7) + (1516044288 * i16);
        int i18 = ((i3 * 647972376) - 1941852458) + (i4 * 647972376) + (i11 * 1702) + (i13 * 851) + (i14 * 851) + (i6 * 647973227) + (i5 * (-1260466036)) + (i7 * 1557372491) + (i16 * 1239351296);
        return i17 + ((i18 * i18) * 490405888) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i5 = onExtraCallback + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(str);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str2, String str3, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 49;
        onExtraCallback = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            IAuthTabCallback(str, quirksExternalSyntheticBackport0, str2, str3, function0, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, quirksExternalSyntheticBackport0, str2, str3, function0, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onExtraCallback + 49;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = new Object[0];
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted, 1842564748, objArr, -1842564748, iOnWarmupCompleted3, iOnWarmupCompleted2, iOnWarmupCompleted4);
        int i5 = onExtraCallback + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 74 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i2 & 97) != 90;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 43;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1793480473, i2, -1, "im.toss.components.compose.extensions.TextFieldLineSelectButton.<anonymous>.<anonymous> (TextFieldLineSelectButton.kt:29)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onWarmupCompleted + 47;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult implements setCacheComposition.IAuthTabCallbackDefault {
        private static final byte[] $$a = {20, 103, 109, 52};
        private static final int $$b = 121;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onWarmupCompleted = {18942, 60630, 906, 42618, 56629, 29608, 38529, 52693, 24645, 34614, 15871, 20702, 63375, 10833, 16736, 59374, 6841, 45457, 54349, 2916, 41455, 50367, 31681, 40531, 13589, 27629, 36528, 9625, 22537, 65282, 5600, 18621, 61241, 534, 47366, 57253, 29359, 43377, 52288, 25431, 39383, 15536, 21356, 63045, 11537, 17311, 59050, 7541, 45089, 55052, 3529, 41131, 51060, 31286, 37149, 14228, 27270, 33132, 9273};
        private static long onExtraCallbackWithResult = 4359001721278056672L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i2, short s2) {
            int i3;
            byte[] bArr = $$a;
            int i4 = s + 4;
            int i5 = i2 * 3;
            int i6 = 97 - (s2 * 2);
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i7 = i6;
                int i8 = 0;
                int i9 = i4;
                int i10 = (-i4) + i7;
                i3 = i8;
                int i11 = i9;
                i6 = i10;
                i4 = i11;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                    return new String(bArr2, 0);
                }
                int i12 = i4 + 1;
                int i13 = i6;
                i9 = i12;
                i4 = bArr[i12];
                i8 = i3 + 1;
                i7 = i13;
                int i102 = (-i4) + i7;
                i3 = i8;
                int i112 = i9;
                i6 = i102;
                i4 = i112;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                }
            }
        }

        onExtraCallbackWithResult() {
        }

        public void IAuthTabCallback(RowScope rowScope, String str, boolean z, boolean z2, boolean z3, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, SearchView searchView, Function1<? super String, Unit> function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(rowScope, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(resourceManagerInternalResourceManagerHooks, "");
            Intrinsics.checkNotNullParameter(searchView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1857147453);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 81;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1857147453, i2, -1, "im.toss.components.compose.extensions.TextFieldLineSelectButton.<anonymous>.<no name provided>.Content (TextFieldLineSelectButton.kt:42)");
                int i6 = IAuthTabCallback + 101;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f) * ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent()));
            Object[] objArr = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0), 58 - ExpandableListView.getPackedPositionChild(0L), (char) (Color.rgb(0, 0, 0) + 16819266), objArr);
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 49;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }

        private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i3];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
                int i5 = $11 + 23;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i2 / i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 18, 10973 - TextUtils.getOffsetAfter("", 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46134), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b + 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0')), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(onWarmupCompleted[i2 + i7])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 59697), TextUtils.getCapsMode("", 0, 0) + 17, 10973 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 46135), 31 - Drawable.resolveOpacity(0, 0), 20220 - (ViewConfiguration.getEdgeSlop() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - MotionEvent.axisFromString("")), 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getOffsetAfter("", 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i3];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
                int i8 = $10 + 123;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    try {
                        Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback7 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 44, 1494 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        Object obj = null;
                        ((Method) objOnExtraCallback7).invoke(null, objArr8);
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback8 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 49123), 44 - View.getDefaultSize(0, 0), 1494 - (KeyEvent.getMaxKeyCode() >> 16), -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback8).invoke(null, objArr9);
            }
            objArr[0] = new String(cArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i2 & 113) != 127;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i2 & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i5 = onExtraCallback + 87;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1199991802, i2, -1, "im.toss.components.compose.extensions.TextFieldLineSelectButton.<anonymous>.<anonymous> (TextFieldLineSelectButton.kt:30)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str2, @Nullable String str3, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        String str4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final String str5;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final String str6;
        final Function0<Unit> function02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function0<Unit> function03;
        int i11 = 2 % 2;
        final String str7 = "";
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-212943537);
        if ((i2 & 6) == 0) {
            int i12 = onExtraCallback + 5;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    str4 = str2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4)) {
                        int i15 = onExtraCallback + 7;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                        if ((i2 & 24576) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                                int i17 = onExtraCallback + 41;
                                onWarmupCompleted = i17 % 128;
                                i9 = i17 % 2 != 0 ? 13751 : 16384;
                            } else {
                                i9 = 8192;
                            }
                            i4 |= i9;
                        }
                        i10 = i4;
                        if ((i10 & 9363) != 9362) {
                            int i18 = onExtraCallback + 15;
                            onWarmupCompleted = i18 % 128;
                            int i19 = i18 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
                            int i20 = onExtraCallback + 65;
                            onWarmupCompleted = i20 % 128;
                            Object obj = null;
                            if (i20 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (i14 != 0) {
                                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            final String str8 = i5 != 0 ? "" : str4;
                            if (i7 != 0) {
                                int i21 = onWarmupCompleted + 49;
                                onExtraCallback = i21 % 128;
                                int i22 = i21 % 2;
                            } else {
                                str7 = str3;
                            }
                            if (i8 != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new Function0() { // from class: im.toss.components.compose.extensions.TextFieldLineSelectButtonKt$$ExternalSyntheticLambda0
                                        private static int onNavigationEvent = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke() {
                                            int i23 = 2 % 2;
                                            int i24 = onNavigationEvent + 87;
                                            onWarmupCompleted = i24 % 128;
                                            if (i24 % 2 == 0) {
                                                RealImageLoaderOptions.onWarmupCompleted();
                                                Object obj2 = null;
                                                obj2.hashCode();
                                                throw null;
                                            }
                                            Unit unitOnWarmupCompleted = RealImageLoaderOptions.onWarmupCompleted();
                                            int i25 = onNavigationEvent + 47;
                                            onWarmupCompleted = i25 % 128;
                                            int i26 = i25 % 2;
                                            return unitOnWarmupCompleted;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    int i23 = onWarmupCompleted + 51;
                                    onExtraCallback = i23 % 128;
                                    int i24 = i23 % 2;
                                }
                                function03 = (Function0) objOnMinimized;
                            } else {
                                function03 = function0;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i25 = onExtraCallback + 23;
                                onWarmupCompleted = i25 % 128;
                                if (i25 % 2 != 0) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-212943537, i10, -1, "im.toss.components.compose.extensions.TextFieldLineSelectButton (TextFieldLineSelectButton.kt:23)");
                                    obj.hashCode();
                                    throw null;
                                }
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-212943537, i10, -1, "im.toss.components.compose.extensions.TextFieldLineSelectButton (TextFieldLineSelectButton.kt:23)");
                            }
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                int i26 = onWarmupCompleted + 119;
                                onExtraCallback = i26 % 128;
                                if (i26 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                    throw null;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            onExtraCallbackWithResult onextracallbackwithresult2 = new onExtraCallbackWithResult();
                            setCacheComposition.IAuthTabCallbackStub.onWarmupCompleted onwarmupcompleted = new setCacheComposition.IAuthTabCallbackStub.onWarmupCompleted((setCacheComposition.onTransact) null, (setCacheComposition.onNavigationEvent) null, 3, (DefaultConstructorMarker) null);
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new Function1() { // from class: im.toss.components.compose.extensions.TextFieldLineSelectButtonKt$$ExternalSyntheticLambda1
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj2) {
                                        int i27 = 2 % 2;
                                        int i28 = onExtraCallbackWithResult + 35;
                                        onExtraCallback = i28 % 128;
                                        String str9 = (String) obj2;
                                        if (i28 % 2 == 0) {
                                            return RealImageLoaderOptions.onNavigationEvent(str9);
                                        }
                                        RealImageLoaderOptions.onNavigationEvent(str9);
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            String str9 = str8;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                            String str10 = str7;
                            setDefaultFontFileExtension.onWarmupCompleted(str, (Function1) objOnMinimized2, onwarmupcompleted, (QuirksExternalSyntheticBackport0) null, (setCacheComposition.onExtraCallback) null, (Function0) null, ForwardingCameraControl.onExtraCallback(-1793480473, true, new getBacktraceNote() { // from class: im.toss.components.compose.extensions.TextFieldLineSelectButtonKt$$ExternalSyntheticLambda2
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i27 = 2 % 2;
                                    int i28 = onNavigationEvent + 39;
                                    onWarmupCompleted = i28 % 128;
                                    int i29 = i28 % 2;
                                    Unit unitOnWarmupCompleted = RealImageLoaderOptions.onWarmupCompleted(str7, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i30 = onNavigationEvent + 41;
                                    onWarmupCompleted = i30 % 128;
                                    int i31 = i30 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(-1199991802, true, new getBacktraceNote() { // from class: im.toss.components.compose.extensions.TextFieldLineSelectButtonKt$$ExternalSyntheticLambda3
                                private static int IAuthTabCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    Unit unit;
                                    int i27 = 2 % 2;
                                    int i28 = IAuthTabCallback + 81;
                                    onWarmupCompleted = i28 % 128;
                                    if (i28 % 2 == 0) {
                                        Object[] objArr = {str8, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                                        unit = (Unit) RealImageLoaderOptions.onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -2018892893, objArr, 2018892894, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
                                        int i29 = 18 / 0;
                                    } else {
                                        Object[] objArr2 = {str8, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                                        unit = (Unit) RealImageLoaderOptions.onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -2018892893, objArr2, 2018892894, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
                                    }
                                    int i30 = IAuthTabCallback + 99;
                                    onWarmupCompleted = i30 % 128;
                                    int i31 = i30 % 2;
                                    return unit;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, onextracallbackwithresult2, (getMergedResolutions) null, (setCacheComposition.onWarmupCompleted) null, (setCacheComposition.onExtraCallbackWithResult) null, (CameraUnavailableException) null, (CameraState) null, false, false, false, 0, 0, (setCacheComposition.IAuthTabCallback) null, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i10 & 14) | 14156208, 805306368, 0, 133685048);
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(measureChildConstrained.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion), false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function03, 15, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                int i27 = onWarmupCompleted + 25;
                                onExtraCallback = i27 % 128;
                                int i28 = i27 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            function02 = function03;
                            str6 = str9;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            str5 = str10;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            str5 = str3;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            str6 = str4;
                            function02 = function0;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.TextFieldLineSelectButtonKt$$ExternalSyntheticLambda4
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i29 = 2 % 2;
                                    int i30 = onWarmupCompleted + 17;
                                    onExtraCallback = i30 % 128;
                                    if (i30 % 2 == 0) {
                                        RealImageLoaderOptions.onNavigationEvent(str, quirksExternalSyntheticBackport03, str6, str5, function02, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        throw null;
                                    }
                                    Unit unitOnNavigationEvent = RealImageLoaderOptions.onNavigationEvent(str, quirksExternalSyntheticBackport03, str6, str5, function02, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i31 = onWarmupCompleted + 53;
                                    onExtraCallback = i31 % 128;
                                    int i32 = i31 % 2;
                                    return unitOnNavigationEvent;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    i10 = i4;
                    if ((i10 & 9363) != 9362) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                i10 = i4;
                if ((i10 & 9363) != 9362) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            str4 = str2;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            i10 = i4;
            if ((i10 & 9363) != 9362) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str4 = str2;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        i10 = i4;
        if ((i10 & 9363) != 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -2018892893, objArr, 2018892894, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }

    private static final Unit onExtraCallback() {
        return (Unit) onExtraCallbackWithResult(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 1842564748, new Object[0], -1842564748, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
    }
}
