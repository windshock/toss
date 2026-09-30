package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class getMtopInstance {
    public /* synthetic */ getMtopInstance(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onExtraCallbackWithResult extends getMtopInstance {
        private final boolean onWarmupCompleted;
        private static final byte[] $$a = {52, -58, -85, 74};
        private static final int $$b = 88;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int IAuthTabCallback = 478309006;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v7, types: [int] */
        /* JADX WARN: Type inference failed for: r6v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v2, types: [int] */
        private static String $$c(int i, byte b, short s) {
            byte[] bArr = $$a;
            int i2 = i * 3;
            ?? r7 = 105 - (s * 4);
            int i3 = 4 - (b * 4);
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            byte b2 = r7;
            if (bArr == null) {
                b2 = i3 + r7;
                i3++;
            }
            while (true) {
                i4++;
                bArr2[i4] = b2;
                if (i4 == i2) {
                    return new String(bArr2, 0);
                }
                byte b3 = b2;
                b2 = b3 + bArr[i3];
                i3++;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                if (this.onWarmupCompleted == ((onExtraCallbackWithResult) obj).onWarmupCompleted) {
                    return true;
                }
                int i4 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i4 % 128;
                return i4 % 2 == 0;
            }
            int i5 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 27 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.onWarmupCompleted);
            int i4 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            boolean z = this.onWarmupCompleted;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(25 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 6, new char[]{65509, 17, 0, '\f', 4, 65500, 65522, 20, 2, 2, 4, 18, 18, 65479, '\b', 18, 65506, 0, '\r', 3, '\b', 3, 0, 19, 4}, false, KeyEvent.getDeadChar(0, 0) + 264, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(z);
            Object[] objArr2 = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1 - Color.alpha(0), new char[]{0}, false, 208 - View.getDefaultSize(0, 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        public onExtraCallbackWithResult(boolean z) {
            super(null);
            this.onWarmupCompleted = z;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            boolean z = this.onWarmupCompleted;
            int i4 = i3 + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0166  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            char c;
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                c = '0';
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $11 + 119;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.resolveSizeAndState(0, 0, 0)), 22 - ImageFormat.getBitsPerPixel(0), 10277 - TextUtils.lastIndexOf("", '0', 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12842), (ViewConfiguration.getWindowTouchSlop() >> 8) + 55, 2167 - (ViewConfiguration.getTouchSlop() >> 8), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
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
                int i9 = $11 + 17;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char touchSlop = (char) (12843 - (ViewConfiguration.getTouchSlop() >> 8));
                        int gidForName = 54 - Process.getGidForName("");
                        int iIndexOf = TextUtils.indexOf("", c, 0) + 2168;
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, gidForName, iIndexOf, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    c = '0';
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    private getMtopInstance() {
    }

    public static final class onWarmupCompleted extends getMtopInstance {
        private static int onExtraCallback;
        private static long onExtraCallbackWithResult;
        public static final onWarmupCompleted onNavigationEvent;
        private static char[] onWarmupCompleted;
        private static final byte[] $$a = {15, -57, -42, 5};
        private static final int $$b = 215;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private static int IAuthTabCallback = 0;

        private static String $$c(byte b, byte b2, int i) {
            int i2 = 97 - (i * 3);
            byte[] bArr = $$a;
            int i3 = 3 - (b2 * 3);
            int i4 = b * 2;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i2 = i3 + i2;
                i3 = i3;
            }
            while (true) {
                int i6 = i5 + 1;
                int i7 = i3 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                i5 = i6;
                i2 = bArr[i7] + i2;
                i3 = i7;
            }
        }

        static {
            onExtraCallback = 1;
            onExtraCallback();
            onNavigationEvent = new onWarmupCompleted();
            int i = IAuthTabCallback + 17;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 91;
            int i4 = i3 % 128;
            asInterface = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i5 = i4 + 87;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i7 = i2 + 85;
                asInterface = i7 % 128;
                return i7 % 2 == 0;
            }
            int i8 = i4 + 23;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asInterface + 43;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return 421277162;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = asInterface + 53;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(ViewConfiguration.getMaximumFlingVelocity() - 63, 100 - (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)), (char) Drawable.resolveOpacity(1, 1), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(ViewConfiguration.getMaximumFlingVelocity() >> 16, 8 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        private onWarmupCompleted() {
            super(null);
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $10 + 29;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.makeMeasureSpec(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 17, 10974 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46133), 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 49123), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $11 + 121;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 / 5;
            }
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i9 = $10 + 7;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 49123), (ViewConfiguration.getScrollBarSize() >> 8) + 44, KeyEvent.keyCodeFromString("") + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i10 = 36 / 0;
                } else {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    try {
                        Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.blue(0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            objArr[0] = new String(cArr);
        }

        static void onExtraCallback() {
            onWarmupCompleted = new char[]{60800, 16496, 46627, 58582, 23183, 34976, 65390};
            onExtraCallbackWithResult = 5834429703024033817L;
        }
    }

    public static final class onNavigationEvent extends getMtopInstance {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static char[] onExtraCallbackWithResult = {27180, 27305, 27464, 27463, 27486, 27465, 27471, 27469, 27296, 27280, 27318, 27457, 27459, 27459, 27283};
        private static int onWarmupCompleted;
        private final String IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                return (obj instanceof onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, ((onNavigationEvent) obj).IAuthTabCallback);
            }
            int i2 = onWarmupCompleted;
            int i3 = i2 + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.IAuthTabCallback.hashCode();
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{0, 14, 157, 9}, false, new byte[]{1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new int[]{14, 1, 180, 1}, true, null, objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i3 + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            char[] cArr;
            char c;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = onExtraCallbackWithResult;
            char c2 = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c2) + 35284), 35 - KeyEvent.getDeadChar(0, 0), (Process.myPid() >> 22) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        c2 = '0';
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
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr2, i3, cArr4, 0, i4);
            if (bArr != null) {
                int i8 = $10 + 95;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 1;
                } else {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.getOffsetBefore("", 0)), 65 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 29 - (KeyEvent.getMaxKeyCode() >> 16), View.resolveSizeAndState(0, 0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i11 = $10 + 35;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.getOffsetBefore("", 0)), View.resolveSize(0, 0) + 70, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr4, 0, cArr5, 0, i4);
                int i13 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr4, i13, i6);
                System.arraycopy(cArr5, i6, cArr4, 0, i13);
                int i14 = $11 + 101;
                $10 = i14 % 128;
                i = 2;
                int i15 = i14 % 2;
            } else {
                i = 2;
            }
            if (z) {
                int i16 = $10 + 17;
                $11 = i16 % 128;
                int i17 = i16 % i;
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr6;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i18 = $11 + 43;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }

    public static final class onExtraCallback extends getMtopInstance {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 5806;
        private static int IAuthTabCallbackStub = 0;
        private static char onExtraCallback = 9046;
        private static char onExtraCallbackWithResult = 12087;
        private static int onTransact = 1;
        private static char onWarmupCompleted = 21586;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 89;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i5 = i3 + 11;
                IAuthTabCallbackStub = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallback) obj).onNavigationEvent)) {
                return false;
            }
            int i6 = onTransact + 79;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 75;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onTransact + 47;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() throws Throwable {
            int i = 2 % 2;
            String str = this.onNavigationEvent;
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{51723, 24618, 7520, 39897, 64286, 27454, 26907, 58507, 47960, 53443, 50323, 23689, 41329, 30416}, (KeyEvent.getMaxKeyCode() >> 16) + 14, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            Object[] objArr2 = new Object[1];
            a(new char[]{2378, 24826}, -TextUtils.lastIndexOf("", '0', 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onTransact + 95;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 37;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 89;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $10 + 93;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i9 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i9);
                        objArr2[1] = Integer.valueOf(i8);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char absoluteGravity = (char) Gravity.getAbsoluteGravity(i3, i3);
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, i3) + 10;
                            int i10 = 12435 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, absoluteGravity2, i10, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 10 - View.combineMeasuredStates(0, 0), 12434 - View.MeasureSpec.makeMeasureSpec(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        int i11 = $11 + 95;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 16014), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 19902, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i13 = $11 + 47;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            objArr[0] = str;
        }
    }
}
