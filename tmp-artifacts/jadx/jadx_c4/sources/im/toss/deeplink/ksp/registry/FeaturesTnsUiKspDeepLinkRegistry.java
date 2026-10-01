package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.tns.ui.TnsDisclaimerActivity;
import im.toss.features.tns.ui.TnsFinishActivity;
import im.toss.features.tns.ui.TnsFunnelStartActivity;
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
public final class FeaturesTnsUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    /* renamed from: $r8$lambda$Oi1GiHYhybhkCgiPIzedTILwI-M, reason: not valid java name */
    public static /* synthetic */ Class m233$r8$lambda$Oi1GiHYhybhkCgiPIzedTILwIM() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return cls_init_$lambda$1;
    }

    /* renamed from: $r8$lambda$dTuRU1kZBN6L-FGxVSrZSiTbj8o, reason: not valid java name */
    public static /* synthetic */ Class m234$r8$lambda$dTuRU1kZBN6LFGxVSrZSiTbj8o() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$o982g6FYzVqCFAWBEy5KCn9Vb9M() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallback + 101;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        int i = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }

    public FeaturesTnsUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTnsUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class clsM234$r8$lambda$dTuRU1kZBN6LFGxVSrZSiTbj8o = FeaturesTnsUiKspDeepLinkRegistry.m234$r8$lambda$dTuRU1kZBN6LFGxVSrZSiTbj8o();
                if (i3 == 0) {
                    int i4 = 81 / 0;
                }
                return clsM234$r8$lambda$dTuRU1kZBN6LFGxVSrZSiTbj8o;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{21784, 42843, 5765, 9621, 15971, 28919, 31738, 25093, 54588, 33993, 50136, 18027, 11581, 47386, 1348, 39271, 45267, 7084, 58902, 45090, 54058, 26941, 3741, 27808, 52603, 4514}, TextUtils.indexOf("", "", 0) + 26, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{21784, 42843, 5765, 9621, 15971, 28919, 31738, 25093, 54588, 33993, 50136, 18027, 11581, 47386, 1348, 39271, 51881, 31334, 5045, 18362, 18260, 23277}, 22 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTnsUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 93;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM233$r8$lambda$Oi1GiHYhybhkCgiPIzedTILwIM = FeaturesTnsUiKspDeepLinkRegistry.m233$r8$lambda$Oi1GiHYhybhkCgiPIzedTILwIM();
                int i4 = IAuthTabCallback + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 74 / 0;
                }
                return clsM233$r8$lambda$Oi1GiHYhybhkCgiPIzedTILwIM;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{21784, 42843, 5765, 9621, 15971, 28919, 31738, 25093, 54588, 33993, 50136, 18027, 11581, 47386, 5164, 31492}, 15 - KeyEvent.keyCodeFromString(""), objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTnsUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Class cls$r8$lambda$o982g6FYzVqCFAWBEy5KCn9Vb9M;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    cls$r8$lambda$o982g6FYzVqCFAWBEy5KCn9Vb9M = FeaturesTnsUiKspDeepLinkRegistry.$r8$lambda$o982g6FYzVqCFAWBEy5KCn9Vb9M();
                    int i3 = 51 / 0;
                } else {
                    cls$r8$lambda$o982g6FYzVqCFAWBEy5KCn9Vb9M = FeaturesTnsUiKspDeepLinkRegistry.$r8$lambda$o982g6FYzVqCFAWBEy5KCn9Vb9M();
                }
                int i4 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$o982g6FYzVqCFAWBEy5KCn9Vb9M;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return TnsDisclaimerActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 1;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return TnsFinishActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return TnsFunnelStartActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 37;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        int maxKeyCode = 12434 - (KeyEvent.getMaxKeyCode() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, windowTouchSlop2, maxKeyCode, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 10 - KeyEvent.normalizeMetaState(0), 12434 - TextUtils.indexOf("", ""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $10 + 123;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 5 / 2;
                    }
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 16014), Color.argb(0, 0, 0, 0) + 14, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = (char) 38990;
        onExtraCallbackWithResult = (char) 35518;
        onNavigationEvent = (char) 57051;
        onWarmupCompleted = (char) 18183;
    }
}
