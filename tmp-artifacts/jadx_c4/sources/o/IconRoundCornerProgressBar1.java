package o;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface IconRoundCornerProgressBar1 {
    public static final onWarmupCompleted Companion;
    public static final String IAuthTabCallback;
    public static final String IAuthTabCallbackStub;
    public static final String onExtraCallback;
    public static final String onExtraCallbackWithResult;
    public static final String onNavigationEvent;
    public static final String onWarmupCompleted;
    public static final byte[] $$a = {78, -86, Byte.MIN_VALUE, Byte.MIN_VALUE};
    public static final int $$b = 29;
    public static final int onTransact = 478308869;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 105 - (b * 2);
        int i5 = (s * 2) + 1;
        ?? r7 = (b2 * 3) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte b3 = r7;
            i3 = 0;
            int i6 = r7;
            i4 += b3;
            i = i3;
            i2 = i6 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            b3 = bArr[i2];
            i6 = i2;
            i4 += b3;
            i = i3;
            i2 = i6 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i2 = r7;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static {
        Object[] objArr = new Object[1];
        a(7 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 3, new char[]{65529, 11, 11, 65529, 65533, '\n', 65526}, true, 152 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        IAuthTabCallbackStub = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(10 - Drawable.resolveOpacity(0, 0), 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{65535, '\t', '\n', 65535, '\b', 65500, '\f', 3, 65534, 1}, false, KeyEvent.normalizeMetaState(0) + 146, objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, 7 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{'\n', 65527, 3, 5, '\n', 11, 65527, 14, 65535, 65500, 4, 5, 65535}, true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 150, objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((Process.myTid() >> 22) + 12, TextUtils.indexOf((CharSequence) "", '0') + 4, new char[]{65534, 0, 5, 65526, '\t', 6, '\f', 11, 65532, 65510, '\t', 0}, false, 149 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        onExtraCallbackWithResult = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 8 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{5, 65530, 7, 2, 0, 2, 11, '\b', 65528, 65534, 6, 65534, 1, 65532, 65516}, true, 147 - Color.argb(0, 0, 0, 0), objArr5);
        IAuthTabCallback = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(Color.green(0) + 15, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, new char[]{65521, 65535, 65532, 65520, 3, 65535, 17, 65519, '\f', 6, 65529, 0, '\f', '\t', 7}, false, 145 - MotionEvent.axisFromString(""), objArr6);
        onExtraCallback = ((String) objArr6[0]).intern();
        Companion = onWarmupCompleted.onWarmupCompleted;
    }

    boolean onExtraCallback(@NotNull String str);

    boolean onExtraCallbackWithResult(@NotNull Activity activity, @Nullable String str, @Nullable Bundle bundle);

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final String IAuthTabCallback;
        private static long IAuthTabCallbackDefault = 0;
        public static final String IAuthTabCallbackStub;
        private static int asBinder = 1;
        public static final String asInterface;
        public static final String onExtraCallback;
        public static final String onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        private static int onTransact;
        static final /* synthetic */ onWarmupCompleted onWarmupCompleted;

        static {
            onNavigationEvent();
            Object[] objArr = new Object[1];
            a(new char[]{12800, 24281, 60291, 29792, 33074, 11749, 48834}, (ViewConfiguration.getTouchSlop() >> 8) + 27851, objArr);
            asInterface = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{12824, 14108, 14372, 15688, 9817, 11138, 11452, 4526, 6856, 8161}, ExpandableListView.getPackedPositionChild(0L) + 1308, objArr2);
            IAuthTabCallbackStub = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new char[]{12822, 9483, 7185, 30467, 28222, 16699, 47157, 37665, 35408, 64840, 54379, 53117, 9827}, 5897 - View.getDefaultSize(0, 0), objArr3);
            onExtraCallbackWithResult = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new char[]{12840, 52786, 51830, 50855, 49887, 57089, 56178, 55172, 54182, 61439, 59448, 58436}, 64567 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
            onExtraCallback = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a(new char[]{12840, 64215, 41883, 26739, 4396, 56853, 34499, 20415, 29795, 15715, 59906, 37626, 23462, 153, 51520}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51408, objArr5);
            IAuthTabCallback = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a(new char[]{12840, 6852, 25519, 18535, 37198, 65033, 50924, 12230, 29833, 23907, 43584, 62247, 56286, 8404, 2493}, 10452 - ExpandableListView.getPackedPositionChild(0L), objArr6);
            onNavigationEvent = ((String) objArr6[0]).intern();
            onWarmupCompleted = new onWarmupCompleted();
            int i = asBinder + 13;
            onTransact = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 95;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 19626 - TextUtils.indexOf((CharSequence) "", '0', 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackDefault ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 59, (Process.myPid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $10 + 3;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 59 - (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i10 = $11 + 25;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 % 4;
                }
            }
            objArr[0] = new String(cArr2);
        }

        static void onNavigationEvent() {
            IAuthTabCallbackDefault = -6128407837422143680L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.resolveSizeAndState(0, 0, 0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22, (KeyEvent.getMaxKeyCode() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 55, 2167 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
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
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 12843), (Process.myPid() >> 22) + 55, 2167 - TextUtils.indexOf("", ""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
