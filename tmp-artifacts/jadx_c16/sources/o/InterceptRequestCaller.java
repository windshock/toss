package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.ConsumptionAmountTopLocal;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InterceptRequestCaller extends onReceiveCdp<ConsumptionAmountTopLocal.Title> {
    public static final InterceptRequestCaller IAuthTabCallback;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {66, -42, -1, 80};
    private static final int $$b = 205;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;

    private static String $$c(short s, byte b, byte b2) {
        int i = b2 * 3;
        byte[] bArr = $$a;
        int i2 = 97 - (s * 4);
        int i3 = b + 4;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i3 + i4;
            i3 = i3;
            i2 = i6;
        }
        while (true) {
            i5++;
            int i7 = i3 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 = i7;
            i2 += bArr[i7];
        }
    }

    static {
        onExtraCallbackWithResult = 1;
        onNavigationEvent();
        IAuthTabCallback = new InterceptRequestCaller();
        int i = onNavigationEvent + 69;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private InterceptRequestCaller() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConsumptionAmountTopLocal.Title.class);
        Pair[] pairArr = {getWrite.IAuthTabCallback("TEXT", Reflection.getOrCreateKotlinClass(ConsumptionAmountTopLocal.Title.Text.class)), getWrite.IAuthTabCallback("NUMERIC", Reflection.getOrCreateKotlinClass(ConsumptionAmountTopLocal.Title.Numeric.class))};
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTouchSlop() >> 8, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, (char) (1694 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), access8100.onWarmupCompleted(pairArr), (String) null, 8, (DefaultConstructorMarker) null);
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 37;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 17 - (ViewConfiguration.getLongPressTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 20219 - ((byte) KeyEvent.getModifierMetaStateMask()), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16826339);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 44;
                            int fadingEdgeLength = 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte b = $$a[2];
                            byte b2 = (byte) (b + 1);
                            byte b3 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, offsetAfter, fadingEdgeLength, -1657859959, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
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
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char c2 = (char) (49123 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)));
                    int gidForName = 43 - Process.getGidForName("");
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1495;
                    byte b4 = $$a[2];
                    byte b5 = (byte) (b4 + 1);
                    byte b6 = b4;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, gidForName, iLastIndexOf, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                j = 0;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{60222, 6816, 2076, 16278};
        onExtraCallback = -3477852663870645177L;
    }
}
