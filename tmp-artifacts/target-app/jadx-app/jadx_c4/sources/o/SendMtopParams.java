package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.model.init.config.quality.StabilityConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.getBuildFingerprint;
import o.isTiny;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SendMtopParams {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final ConcurrentLinkedQueue<uploadPerfLog> onExtraCallback = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<setPerformanceStageReentrantWhiteList> IAuthTabCallback = new ConcurrentLinkedQueue<>();

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onTransact;
        private final getCausesCount<Double> IAuthTabCallback;
        private final getCausesCount<Double> onExtraCallback;
        private final RVPub onWarmupCompleted;
        private static char[] onNavigationEvent = {32717, 32746, 32744, 32750, 32760, 32543, 32745, 32738, 32743, 32530, 32716, 32740, 32742, 32537, 32761, 32536, 32542, 32675, 32712, 32751, 32726, 32679, 32683, 32539, 32741, 32529, 32674};
        private static int onExtraCallbackWithResult = -1184333941;
        private static boolean asBinder = true;
        private static boolean asInterface = true;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.onWarmupCompleted != onwarmupcompleted.onWarmupCompleted) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                int i2 = IAuthTabCallbackStub + 91;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                return true;
            }
            int i4 = IAuthTabCallbackStub + 67;
            onTransact = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 1;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            RVPub rVPub = this.onWarmupCompleted;
            if (rVPub == null) {
                int i5 = i2 + 27;
                IAuthTabCallbackStub = i5 % 128;
                iHashCode = i5 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = rVPub.hashCode();
            }
            return (((iHashCode * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            RVPub rVPub = this.onWarmupCompleted;
            getCausesCount<Double> getcausescount = this.IAuthTabCallback;
            getCausesCount<Double> getcausescount2 = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            Object obj = null;
            a(null, null, new byte[]{-107, -124, -108, -116, -109, -114, -116, -114, -114, -124, -110, -122, -119, -111, -112, -124, -113, -125, -120, -114, -122, -124, -115, -116, -124, -117, -118, -122, -120, -119, -120, -121, -126, -122, -123, -124, -125, -126, -127}, MotionEvent.axisFromString("") + 128, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(rVPub);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-107, -118, -122, -120, -119, -120, -121, -126, -122, -123, -103, -116, -120, -122, -120, -112, -116, -104, -105, -106}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(getcausescount);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-107, -118, -122, -120, -119, -120, -121, -126, -122, -123, -124, -102, -120, -112, -105, -106}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(getcausescount2);
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-101}, 126 - TextUtils.lastIndexOf("", '0'), objArr4);
            sb.append(((String) objArr4[0]).intern());
            String string = sb.toString();
            int i2 = onTransact + 97;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(@Nullable RVPub rVPub, @NotNull getCausesCount<Double> getcausescount, @NotNull getCausesCount<Double> getcausescount2) {
            Intrinsics.checkNotNullParameter(getcausescount, "");
            Intrinsics.checkNotNullParameter(getcausescount2, "");
            this.onWarmupCompleted = rVPub;
            this.IAuthTabCallback = getcausescount;
            this.onExtraCallback = getcausescount2;
        }

        public final RVPub onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 67;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public final getCausesCount<Double> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 65;
            int i3 = i2 % 128;
            onTransact = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            getCausesCount<Double> getcausescount = this.IAuthTabCallback;
            int i4 = i3 + 117;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return getcausescount;
            }
            obj.hashCode();
            throw null;
        }

        public final getCausesCount<Double> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 1;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            getCausesCount<Double> getcausescount = this.onExtraCallback;
            int i5 = i3 + 59;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
            return getcausescount;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int length;
            char[] cArr3;
            int i2 = 2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr4 = onNavigationEvent;
            if (cArr4 != null) {
                int i4 = $11;
                int i5 = i4 + 65;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    length = cArr4.length;
                    cArr3 = new char[length];
                } else {
                    length = cArr4.length;
                    cArr3 = new char[length];
                }
                int i6 = i4 + 109;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 63;
                    $11 = i9 % 128;
                    int i10 = i9 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr4[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 78 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i8++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i11 = $11 + 43;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.green(0) + 75, 16037 - TextUtils.indexOf("", ""), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i13 = 1052772399;
            if (asInterface) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i14 = $11 + 71;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i13);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), Process.getGidForName("") + 64, 12214 - View.getDefaultSize(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i13 = 1052772399;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!asBinder) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i16 = $11 + 27;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i17 = $11 + 39;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63, ((byte) KeyEvent.getModifierMetaStateMask()) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = {27170, 27287, 27287, 27290, 27294, 27287, 27292, 27269, 27293, 27295, 27276, 27390, 27278, 27293, 27286, 27270, 27271, 27281, 27281, 27311, 27284, 27387, 27379, 27281, 27281, 27309, 27285, 27268, 27271, 27291, 27282, 27308, 27285, 27286, 27283, 27310, 27310, 27284, 27269, 27293, 27307, 27292, 27307, 27274, 27288, 27306, 27310, 27311, 27359, 27347, 27360, 27300, 27307, 27284, 27283, 27284, 27293, 27226};
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final getCausesCount<Double> onExtraCallback;
        private final RVPub onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.onNavigationEvent != onextracallbackwithresult.onNavigationEvent) {
                int i4 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[PHI: r1
          0x0027: PHI (r1v6 o.RVPub) = (r1v4 o.RVPub), (r1v7 o.RVPub) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            RVPub rVPub;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int iHashCode = 0;
            if (i2 % 2 != 0) {
                rVPub = this.onNavigationEvent;
                int i4 = 5 / 0;
                if (rVPub == null) {
                    int i5 = i3 + 21;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 4 / 3;
                    }
                } else {
                    iHashCode = rVPub.hashCode();
                }
            } else {
                rVPub = this.onNavigationEvent;
                if (rVPub == null) {
                }
            }
            return (iHashCode * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            RVPub rVPub = this.onNavigationEvent;
            getCausesCount<Double> getcausescount = this.onExtraCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{0, 41, 111, 11}, true, new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(rVPub);
            Object[] objArr2 = new Object[1];
            a(new int[]{41, 16, 113, 9}, true, null, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(getcausescount);
            Object[] objArr3 = new Object[1];
            a(new int[]{57, 1, 0, 0}, false, new byte[]{1}, objArr3);
            sb.append(((String) objArr3[0]).intern());
            String string = sb.toString();
            int i2 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return string;
            }
            throw null;
        }

        public onExtraCallbackWithResult(@Nullable RVPub rVPub, @NotNull getCausesCount<Double> getcausescount) {
            Intrinsics.checkNotNullParameter(getcausescount, "");
            this.onNavigationEvent = rVPub;
            this.onExtraCallback = getcausescount;
        }

        public final RVPub onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            RVPub rVPub = this.onNavigationEvent;
            int i5 = i3 + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return rVPub;
            }
            throw null;
        }

        public final getCausesCount<Double> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 91;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getCausesCount<Double> getcausescount = this.onExtraCallback;
            int i4 = i2 + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getcausescount;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = IAuthTabCallback;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getLongPressTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 35, ImageFormat.getBitsPerPixel(0) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 65, (Process.myTid() >> 22) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i9 = $11 + 125;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 29 - View.MeasureSpec.getMode(0), 17658 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.indexOf("", "", 0, 0)), 70 - (ViewConfiguration.getTapTimeout() >> 16), 12486 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i12 = $11 + 59;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 1, i4);
                    int i13 = i4 >> i6;
                    System.arraycopy(cArr5, 0, cArr3, i13, i6);
                    System.arraycopy(cArr5, i6, cArr3, 1, i13);
                } else {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr6, 0, i4);
                    int i14 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr3, i14, i6);
                    System.arraycopy(cArr6, i6, cArr3, 0, i14);
                }
            }
            if (z) {
                char[] cArr7 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i15 = $10 + 39;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
                cArr3 = cArr7;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    public final onWarmupCompleted IAuthTabCallback(@NotNull uploadPerfLog uploadperflog, @Nullable StabilityConfig stabilityConfig) {
        int iOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uploadperflog, "");
        if (stabilityConfig != null) {
            iOnWarmupCompleted = stabilityConfig.onWarmupCompleted();
        } else {
            int i4 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iOnWarmupCompleted = 2;
        }
        double dOnExtraCallback = stabilityConfig != null ? stabilityConfig.onExtraCallback() : 2.0d;
        RVPub rVPub = null;
        Double dOnExtraCallbackWithResult = stabilityConfig != null ? stabilityConfig.onExtraCallbackWithResult() : null;
        Double dIAuthTabCallback = stabilityConfig != null ? stabilityConfig.IAuthTabCallback() : null;
        this.onExtraCallback.add(uploadperflog);
        while (this.onExtraCallback.size() > iOnWarmupCompleted) {
            this.onExtraCallback.poll();
        }
        getBuildFingerprint.onWarmupCompleted onwarmupcompleted = getBuildFingerprint.onWarmupCompleted.onNavigationEvent;
        getCausesCount getcausescount = new getCausesCount(Double.valueOf(onNavigationEvent(iOnWarmupCompleted, dOnExtraCallback)), getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(onwarmupcompleted.onExtraCallback()), (DefaultConstructorMarker) null);
        getCausesCount getcausescount2 = new getCausesCount(Double.valueOf(onWarmupCompleted(iOnWarmupCompleted, dOnExtraCallback)), getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(onwarmupcompleted.onExtraCallback()), (DefaultConstructorMarker) null);
        if (dOnExtraCallbackWithResult != null) {
            if (dOnExtraCallbackWithResult.doubleValue() <= 0.0d) {
                int i6 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            } else if (((Number) getcausescount.onExtraCallback()).doubleValue() < dOnExtraCallbackWithResult.doubleValue()) {
                int i8 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                rVPub = RVPub.FACE_POSITION_UNSTABLE;
            } else if (dIAuthTabCallback != null && dIAuthTabCallback.doubleValue() > 0.0d && ((Number) getcausescount2.onExtraCallback()).doubleValue() < dIAuthTabCallback.doubleValue()) {
                int i10 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    RVPub rVPub2 = RVPub.FACE_SIZE_UNSTABLE;
                    throw null;
                }
                rVPub = RVPub.FACE_SIZE_UNSTABLE;
            }
        }
        return new onWarmupCompleted(rVPub, getcausescount, getcausescount2);
    }

    public final onExtraCallbackWithResult IAuthTabCallback(@NotNull setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist, @Nullable StabilityConfig stabilityConfig) {
        double dOnExtraCallback;
        Double dOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setperformancestagereentrantwhitelist, "");
        int iOnWarmupCompleted = stabilityConfig != null ? stabilityConfig.onWarmupCompleted() : 2;
        if (stabilityConfig != null) {
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            dOnExtraCallback = stabilityConfig.onExtraCallback();
        } else {
            dOnExtraCallback = 2.0d;
        }
        RVPub rVPub = null;
        if (stabilityConfig != null) {
            int i4 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                stabilityConfig.onNavigationEvent();
                throw null;
            }
            dOnNavigationEvent = stabilityConfig.onNavigationEvent();
        } else {
            dOnNavigationEvent = null;
        }
        this.IAuthTabCallback.add(setperformancestagereentrantwhitelist);
        int i5 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        while (this.IAuthTabCallback.size() > iOnWarmupCompleted) {
            this.IAuthTabCallback.poll();
        }
        getCausesCount getcausescount = new getCausesCount(Double.valueOf(onWarmupCompleted(dOnExtraCallback)), getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(getBuildFingerprint.onWarmupCompleted.onNavigationEvent.onExtraCallback()), (DefaultConstructorMarker) null);
        if (dOnNavigationEvent != null) {
            int i7 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0 ? dOnNavigationEvent.doubleValue() <= 0.0d : dOnNavigationEvent.doubleValue() <= 1.0d) {
                int i8 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            } else if (((Number) getcausescount.onExtraCallback()).doubleValue() < dOnNavigationEvent.doubleValue()) {
                rVPub = RVPub.FACE_POSE_UNSTABLE;
            }
        }
        return new onExtraCallbackWithResult(rVPub, getcausescount);
    }

    private final double onNavigationEvent(int i, double d) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallback.size() < i) {
            return 0.0d;
        }
        ArrayList arrayList = new ArrayList();
        Size sizeOnWarmupCompleted = isH5.IAuthTabCallback.onWarmupCompleted();
        double dSqrt = Math.sqrt((sizeOnWarmupCompleted.getWidth() * sizeOnWarmupCompleted.getWidth()) + (sizeOnWarmupCompleted.getHeight() * sizeOnWarmupCompleted.getHeight()));
        List list = CollectionsKt.toList(this.onExtraCallback);
        int size = list.size();
        for (int i5 = 1; i5 < size; i5++) {
            uploadPerfLog uploadperflog = (uploadPerfLog) list.get(i5 - 1);
            uploadPerfLog uploadperflog2 = (uploadPerfLog) list.get(i5);
            isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback = uploadperflog.IAuthTabCallback();
            StartAction startActionOnWarmupCompleted = null;
            StartAction startActionOnWarmupCompleted2 = onwarmupcompletedIAuthTabCallback != null ? onwarmupcompletedIAuthTabCallback.onWarmupCompleted() : null;
            isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback2 = uploadperflog2.IAuthTabCallback();
            if (onwarmupcompletedIAuthTabCallback2 != null) {
                int i6 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    onwarmupcompletedIAuthTabCallback2.onWarmupCompleted();
                    startActionOnWarmupCompleted.hashCode();
                    throw null;
                }
                startActionOnWarmupCompleted = onwarmupcompletedIAuthTabCallback2.onWarmupCompleted();
            }
            if (startActionOnWarmupCompleted2 != null && startActionOnWarmupCompleted != null) {
                double dOnExtraCallbackWithResult = startActionOnWarmupCompleted.onExtraCallbackWithResult() - startActionOnWarmupCompleted2.onExtraCallbackWithResult();
                double dOnWarmupCompleted = startActionOnWarmupCompleted.onWarmupCompleted() - startActionOnWarmupCompleted2.onWarmupCompleted();
                arrayList.add(Double.valueOf(RangesKt.coerceIn(Math.exp((-d) * (Math.sqrt((dOnExtraCallbackWithResult * dOnExtraCallbackWithResult) + (dOnWarmupCompleted * dOnWarmupCompleted)) / dSqrt)), 0.0d, 1.0d)));
            }
        }
        if (!arrayList.isEmpty()) {
            return CollectionsKt.averageOfDouble(arrayList);
        }
        int i7 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i7 % 128;
        return i7 % 2 != 0 ? 1.0d : 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[PHI: r10 r12
      0x006d: PHI (r10v7 o.isTiny$onWarmupCompleted) = (r10v6 o.isTiny$onWarmupCompleted), (r10v23 o.isTiny$onWarmupCompleted) binds: [B:13:0x006b, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r12v2 o.uploadPerfLog) = (r12v1 o.uploadPerfLog), (r12v11 o.uploadPerfLog) binds: [B:13:0x006b, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[PHI: r12
      0x0072: PHI (r12v9 o.uploadPerfLog) = (r12v1 o.uploadPerfLog), (r12v11 o.uploadPerfLog) binds: [B:13:0x006b, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final double onWarmupCompleted(int i, double d) {
        uploadPerfLog uploadperflog;
        isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        StartAction startActionOnWarmupCompleted;
        int i2 = 2 % 2;
        if (this.onExtraCallback.size() < i) {
            return 0.0d;
        }
        ArrayList arrayList = new ArrayList();
        isH5 ish5 = isH5.IAuthTabCallback;
        double width = ish5.onWarmupCompleted().getWidth() * ish5.onWarmupCompleted().getHeight();
        List list = CollectionsKt.toList(this.onExtraCallback);
        int size = list.size();
        int i3 = 1;
        while (i3 < size) {
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                uploadPerfLog uploadperflog2 = (uploadPerfLog) list.get(i3 + 1);
                uploadperflog = (uploadPerfLog) list.get(i3);
                onwarmupcompletedIAuthTabCallback = uploadperflog2.IAuthTabCallback();
                startActionOnWarmupCompleted = onwarmupcompletedIAuthTabCallback != null ? onwarmupcompletedIAuthTabCallback.onWarmupCompleted() : null;
            } else {
                uploadPerfLog uploadperflog3 = (uploadPerfLog) list.get(i3 - 1);
                uploadperflog = (uploadPerfLog) list.get(i3);
                onwarmupcompletedIAuthTabCallback = uploadperflog3.IAuthTabCallback();
                if (onwarmupcompletedIAuthTabCallback != null) {
                }
            }
            isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback2 = uploadperflog.IAuthTabCallback();
            StartAction startActionOnWarmupCompleted2 = onwarmupcompletedIAuthTabCallback2 != null ? onwarmupcompletedIAuthTabCallback2.onWarmupCompleted() : null;
            if (startActionOnWarmupCompleted != null && startActionOnWarmupCompleted2 != null) {
                arrayList.add(Double.valueOf(RangesKt.coerceIn(Math.exp((-d) * (Math.abs((startActionOnWarmupCompleted2.asInterface() * startActionOnWarmupCompleted2.IAuthTabCallback()) - (startActionOnWarmupCompleted.asInterface() * startActionOnWarmupCompleted.IAuthTabCallback())) / width)), 0.0d, 1.0d)));
            }
            i3++;
            int i5 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!arrayList.isEmpty()) {
            return CollectionsKt.averageOfDouble(arrayList);
        }
        int i7 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i7 % 128;
        return i7 % 2 == 0 ? 1.0d : 0.0d;
    }

    private final double onWarmupCompleted(double d) {
        AnimUtils animUtils;
        double dIAuthTabCallback;
        double dIAuthTabCallback2;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        List list = CollectionsKt.toList(this.IAuthTabCallback);
        int size = list.size();
        for (int i2 = 1; i2 < size; i2++) {
            setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist = (setPerformanceStageReentrantWhiteList) list.get(i2 - 1);
            setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist2 = (setPerformanceStageReentrantWhiteList) list.get(i2);
            getCausesCount<AnimUtils> getcausescountIAuthTabCallbackDefault = setperformancestagereentrantwhitelist.IAuthTabCallbackDefault();
            AnimUtils animUtils2 = null;
            if (getcausescountIAuthTabCallbackDefault != null) {
                int i3 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                animUtils = (AnimUtils) getcausescountIAuthTabCallbackDefault.onExtraCallback();
            } else {
                animUtils = null;
            }
            getCausesCount<AnimUtils> getcausescountIAuthTabCallbackDefault2 = setperformancestagereentrantwhitelist2.IAuthTabCallbackDefault();
            if (getcausescountIAuthTabCallbackDefault2 != null) {
                int i4 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                animUtils2 = (AnimUtils) getcausescountIAuthTabCallbackDefault2.onExtraCallback();
            }
            if (animUtils != null) {
                int i6 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    dIAuthTabCallback = animUtils.IAuthTabCallback();
                    int i7 = 26 / 0;
                } else {
                    dIAuthTabCallback = animUtils.IAuthTabCallback();
                }
            } else {
                dIAuthTabCallback = 0.0d;
            }
            double dOnWarmupCompleted = animUtils != null ? animUtils.onWarmupCompleted() : 0.0d;
            double dOnExtraCallbackWithResult = animUtils != null ? animUtils.onExtraCallbackWithResult() : 0.0d;
            if (animUtils2 != null) {
                dIAuthTabCallback2 = animUtils2.IAuthTabCallback();
            } else {
                int i8 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                dIAuthTabCallback2 = 0.0d;
            }
            arrayList.add(Double.valueOf(RangesKt.coerceIn(Math.exp((-d) * ((Math.abs(dIAuthTabCallback2 - dIAuthTabCallback) / 180.0d) + (Math.abs((animUtils2 != null ? animUtils2.onWarmupCompleted() : 0.0d) - dOnWarmupCompleted) / 180.0d) + (Math.abs((animUtils2 != null ? animUtils2.onExtraCallbackWithResult() : 0.0d) - dOnExtraCallbackWithResult) / 180.0d))), 0.0d, 1.0d)));
        }
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        return CollectionsKt.averageOfDouble(arrayList);
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.clear();
        this.IAuthTabCallback.clear();
        int i4 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
