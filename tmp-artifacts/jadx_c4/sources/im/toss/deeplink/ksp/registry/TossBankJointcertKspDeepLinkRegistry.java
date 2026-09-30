package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.bank.jointcert.test.TossBankJointCertTestActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossBankJointcertKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    public static final int $stable = 8;
    private static int asBinder;
    private static char[] onExtraCallback;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2 = (s * 3) + 4;
        int i3 = b2 * 4;
        byte[] bArr = $$a;
        int i4 = (b * 4) + 97;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i2++;
            i4 += -i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i2];
            i++;
            i2++;
            i4 += -i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    /* renamed from: $r8$lambda$ITC03CgwYp_wKPyARGhfLEDr-jo, reason: not valid java name */
    public static /* synthetic */ Class m312$r8$lambda$ITC03CgwYp_wKPyARGhfLEDrjo() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            _init_$lambda$0();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$0;
        }
        obj.hashCode();
        throw null;
    }

    static {
        asBinder = 1;
        onWarmupCompleted();
        int i = onExtraCallbackWithResult + 21;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TossBankJointcertKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getScrollBarFadeDuration() >> 16, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27968), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.TossBankJointcertKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    TossBankJointcertKspDeepLinkRegistry.m312$r8$lambda$ITC03CgwYp_wKPyARGhfLEDrjo();
                    throw null;
                }
                Class clsM312$r8$lambda$ITC03CgwYp_wKPyARGhfLEDrjo = TossBankJointcertKspDeepLinkRegistry.m312$r8$lambda$ITC03CgwYp_wKPyARGhfLEDrjo();
                int i3 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return clsM312$r8$lambda$ITC03CgwYp_wKPyARGhfLEDrjo;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return TossBankJointCertTestActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 95;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59697), 16 - TextUtils.lastIndexOf("", '0', 0), 10973 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myPid() >> 22)), KeyEvent.getDeadChar(0, 0) + 31, 20220 - (ViewConfiguration.getTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49124), Color.green(0) + 44, 1495 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(onExtraCallback[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 59697), 17 - ExpandableListView.getPackedPositionType(0L), MotionEvent.axisFromString("") + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 46135), View.MeasureSpec.getSize(0) + 31, TextUtils.getOffsetBefore("", 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 44, 1495 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ExpandableListView.getPackedPositionChild(0L)), 44 - TextUtils.indexOf("", "", 0), 1494 - TextUtils.indexOf("", "", 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{32999, 6396, 45278, 18598, 57490, 30833, 4181, 43052, 16399, 55723, 29081, 2436, 41404, 14722, 53617, 26964, 294, 39192, 13040, 51928, 25343, 64129, 37519, 10876, 49752, 23150, 61964, 35828, 9169, 48051, 21382, 60276, 33617, 7003, 45882};
        onWarmupCompleted = -1334367495481887287L;
    }
}
