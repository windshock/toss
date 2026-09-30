package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getDistance {
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static long onNavigationEvent;
    public static final getDistance onWarmupCompleted;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, int i4) {
        int i5;
        byte[] bArr = $$a;
        int i6 = i3 * 4;
        int i7 = (i2 * 4) + 97;
        int i8 = (i4 * 3) + 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i9 = i6;
            i7 = i8;
            i5 = 0;
            i8++;
            i7 += -i9;
            bArr2[i5] = (byte) i7;
            if (i5 == i6) {
                return new String(bArr2, 0);
            }
            i5++;
            i9 = bArr[i8];
            i8++;
            i7 += -i9;
            bArr2[i5] = (byte) i7;
            if (i5 == i6) {
            }
        } else {
            i5 = 0;
            bArr2[i5] = (byte) i7;
            if (i5 == i6) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        onNavigationEvent();
        onWarmupCompleted = new getDistance();
        int i2 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private getDistance() {
    }

    public final boolean onExtraCallback(@NotNull String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a(KeyEvent.keyCodeFromString(""), 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) TextUtils.indexOf("", "", 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(4 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, (char) Color.green(0), objArr2);
        boolean zContains = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"email", "password", "search", "tel", strIntern, "textarea", ((String) objArr2[0]).intern()}).contains(str);
        int i5 = asBinder + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return zContains;
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i5 = $11 + 81;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i2 - i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 30 - TextUtils.lastIndexOf("", '0', 0, 0), 20220 - KeyEvent.getDeadChar(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.alpha(0)), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                Object[] objArr5 = {Integer.valueOf(onExtraCallback[i2 + i7])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 59698), Color.rgb(0, 0, 0) + 16777233, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 46134), 31 - (ViewConfiguration.getLongPressTimeout() >> 16), 20219 - ((byte) KeyEvent.getModifierMetaStateMask()), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.red(0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i8 = $10 + 19;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 49123), 43 - ExpandableListView.getPackedPositionChild(0L), 1494 - ExpandableListView.getPackedPositionGroup(0L), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                int i9 = 23 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback8 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 44 - Color.blue(0), 1494 - ((Process.getThreadPriority(0) + 20) >> 6), -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{60832, 36719, 10256, 50490, 60833, 36728, 10244};
        onNavigationEvent = 919541701289152266L;
    }
}
