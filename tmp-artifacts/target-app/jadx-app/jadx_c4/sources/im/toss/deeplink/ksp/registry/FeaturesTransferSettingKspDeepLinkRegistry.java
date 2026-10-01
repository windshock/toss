package im.toss.deeplink.ksp.registry;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.transfer.setting.TransferSettingActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesTransferSettingKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static final byte[] $$a = {15, -57, -42, 5};
    private static final int $$b = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallbackWithResult = {5426, 22930, 35965, 61654, 10155, 27147, 57034, 3512, 28674, 42157, 60178, 24140, 33530, 61770, 9249, 26767, 57160, 553, 30346, 42336, 59798, 23723, 33655, 63434, 15039, 26884, 56827, 166, 30491};
    private static long IAuthTabCallback = 3806186563002540402L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2 = 97 - (s * 4);
        int i3 = b * 3;
        byte[] bArr = $$a;
        int i4 = s2 + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i4;
            i2 = i5;
            int i7 = 0;
            i2 += -i4;
            i4 = i6;
            i = i7;
            int i8 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i9 = i + 1;
            i6 = i8;
            i4 = bArr[i8];
            i7 = i9;
            i2 += -i4;
            i4 = i6;
            i = i7;
            int i82 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i822 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    /* renamed from: $r8$lambda$KEs-DUylqn6u4FViBlXFISfXEBg, reason: not valid java name */
    public static /* synthetic */ Class m250$r8$lambda$KEsDUylqn6u4FViBlXFISfXEBg() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesTransferSettingKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMinimumFlingVelocity() >> 16, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, (char) (63636 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferSettingKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM250$r8$lambda$KEsDUylqn6u4FViBlXFISfXEBg = FeaturesTransferSettingKspDeepLinkRegistry.m250$r8$lambda$KEsDUylqn6u4FViBlXFISfXEBg();
                int i4 = onExtraCallbackWithResult + 19;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return clsM250$r8$lambda$KEsDUylqn6u4FViBlXFISfXEBg;
                }
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        Class<TransferSettingActivity> cls;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            cls = TransferSettingActivity.class;
            int i4 = 79 / 0;
        } else {
            cls = TransferSettingActivity.class;
        }
        int i5 = i3 + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        char c2;
        int i4;
        Object obj;
        Throwable cause;
        int i5 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = 49123;
            c2 = '0';
            i4 = -1401950695;
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = $10 + 11;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 59698), TextUtils.getOffsetBefore("", 0) + 17, 10973 - (ViewConfiguration.getEdgeSlop() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 31, (ViewConfiguration.getJumpTapTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49123), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $10 + 83;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", c2, 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 44, 1494 - ((Process.getThreadPriority(0) + 20) >> 6), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = (byte) (b5 - 1);
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (i3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 43 - ((byte) KeyEvent.getModifierMetaStateMask()), KeyEvent.normalizeMetaState(0) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i3 = 49123;
            c2 = '0';
            i4 = -1401950695;
        }
        objArr[0] = new String(cArr);
    }
}
