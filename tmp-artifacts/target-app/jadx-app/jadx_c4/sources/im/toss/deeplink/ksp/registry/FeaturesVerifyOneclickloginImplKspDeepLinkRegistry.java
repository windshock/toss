package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.verify.oneclicklogin.impl.test.OneClickLoginTestActivity;
import im.toss.features.verify.oneclicklogin.impl.view.LoginTokenConsentActivity;
import im.toss.features.verify.oneclicklogin.impl.view.LoginTokenConsentShortcutActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesVerifyOneclickloginImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    /* renamed from: $r8$lambda$2nmimAeKnaDj8cWRKCMpMaX-HzA, reason: not valid java name */
    public static /* synthetic */ Class m253$r8$lambda$2nmimAeKnaDj8cWRKCMpMaXHzA() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    /* renamed from: $r8$lambda$9MJwmHGWZvDHQvUp-6_qMK9tgMw, reason: not valid java name */
    public static /* synthetic */ Class m254$r8$lambda$9MJwmHGWZvDHQvUp6_qMK9tgMw() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onTransact + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$oq4KmYG0YgOH7a2W2h5rOxSCifY() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onWarmupCompleted + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$2;
        }
        throw null;
    }

    static {
        onNavigationEvent();
        int i = asInterface + 13;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public FeaturesVerifyOneclickloginImplKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyOneclickloginImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 17;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM253$r8$lambda$2nmimAeKnaDj8cWRKCMpMaXHzA = FeaturesVerifyOneclickloginImplKspDeepLinkRegistry.m253$r8$lambda$2nmimAeKnaDj8cWRKCMpMaXHzA();
                if (i3 == 0) {
                    int i4 = 25 / 0;
                }
                return clsM253$r8$lambda$2nmimAeKnaDj8cWRKCMpMaXHzA;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{53302, 37940, 6379, 50516, 3673, 43421, 51927, 54786, 5938, 52045, 51541, 43647, 60882, 22628, 13386, 24365, 21371, 50360, 65324, 33456, 12825, 23168, 19357, 46873, 42053, 5552, 50545, 12396, 22215, 47807}, TextUtils.lastIndexOf("", '0', 0) + 31, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{53302, 37940, 6379, 50516, 3673, 43421, 51927, 54786, 5938, 52045, 51541, 43647, 12825, 23168, 19357, 46873, 12034, 63351, 60120, 42902, 57008, 38529, 42053, 5552, 29659, 43508, 50775, 33982, 56226, 7510, 63785, 27288}, ((Process.getThreadPriority(0) + 20) >> 6) + 31, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyOneclickloginImplKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM254$r8$lambda$9MJwmHGWZvDHQvUp6_qMK9tgMw = FeaturesVerifyOneclickloginImplKspDeepLinkRegistry.m254$r8$lambda$9MJwmHGWZvDHQvUp6_qMK9tgMw();
                int i4 = onExtraCallbackWithResult + 91;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM254$r8$lambda$9MJwmHGWZvDHQvUp6_qMK9tgMw;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{53302, 37940, 6379, 50516, 3673, 43421, 51927, 54786, 5938, 52045, 51541, 43647, 12825, 23168, 19357, 46873, 12034, 63351, 60120, 42902, 57008, 38529, 42053, 5552, 29659, 43508, 50775, 33982, 56226, 7510, 62641, 11062, 41364, 39174, 55673, 2792, 47288, 29392, 11972, 50715}, TextUtils.getOffsetAfter("", 0) + 40, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyOneclickloginImplKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 73;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesVerifyOneclickloginImplKspDeepLinkRegistry.$r8$lambda$oq4KmYG0YgOH7a2W2h5rOxSCifY();
                    throw null;
                }
                Class cls$r8$lambda$oq4KmYG0YgOH7a2W2h5rOxSCifY = FeaturesVerifyOneclickloginImplKspDeepLinkRegistry.$r8$lambda$oq4KmYG0YgOH7a2W2h5rOxSCifY();
                int i3 = IAuthTabCallback + 105;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 63 / 0;
                }
                return cls$r8$lambda$oq4KmYG0YgOH7a2W2h5rOxSCifY;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        Class<OneClickLoginTestActivity> cls;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            cls = OneClickLoginTestActivity.class;
            int i4 = 71 / 0;
        } else {
            cls = OneClickLoginTestActivity.class;
        }
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return LoginTokenConsentActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 97;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return LoginTokenConsentShortcutActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 107;
            $10 = i5 % 128;
            int i6 = 58224;
            char c = 1;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 105;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i11 = 12434 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), pressedStateDuration, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12433 - MotionEvent.axisFromString(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i12 = $10 + 61;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 4 / 2;
                    }
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.blue(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, TextUtils.indexOf("", "") + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 50536;
        onExtraCallback = (char) 32470;
        onNavigationEvent = (char) 13853;
        onExtraCallbackWithResult = (char) 39153;
    }
}
