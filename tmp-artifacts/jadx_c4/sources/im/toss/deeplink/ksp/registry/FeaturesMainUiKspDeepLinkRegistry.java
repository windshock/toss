package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.main.ui.MainActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import o.setIsolationId;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesMainUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onTransact;
    private static long onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$3G2hH9JIBby6SOUzTq6qlB0D_SI() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$6();
            throw null;
        }
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i3 = IAuthTabCallbackDefault + 75;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return cls_init_$lambda$6;
    }

    public static /* synthetic */ Class $r8$lambda$3l_DNfQNj36qbB3S3Kp_WWBUmJg() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$11 = _init_$lambda$11();
        int i4 = asInterface + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$QaeMfqT4XbcXvqCQZOrX0tvwNFw() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$5 = _init_$lambda$5();
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return cls_init_$lambda$5;
    }

    public static /* synthetic */ Class $r8$lambda$S8mwT0GGEsBbrSmALP_9bLFYR0g() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = IAuthTabCallbackDefault + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$WFj6IO5o9YMDWRVqgyL_SkPAFbs() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 60 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = asInterface + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$dmhCgpq9yWcRCXBZ5fSEvUC4o5w() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$7();
            throw null;
        }
        Class cls_init_$lambda$7 = _init_$lambda$7();
        int i3 = asInterface + 101;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return cls_init_$lambda$7;
    }

    public static /* synthetic */ Class $r8$lambda$kajzi5KYRbnYQjQRxJWyfDjGJ4k() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = IAuthTabCallbackDefault + 33;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$4;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$mXvdzjVMqhrhBBqkZd22MfJub30() {
        Class cls_init_$lambda$9;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$9 = _init_$lambda$9();
            int i3 = 40 / 0;
        } else {
            cls_init_$lambda$9 = _init_$lambda$9();
        }
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$9;
    }

    public static /* synthetic */ Class $r8$lambda$w9AZtyzzSzmP3dJGsOxQUzNkZ9k() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = asInterface + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$wYP-k2MHP36iGClEpvZhBM93NIo, reason: not valid java name */
    public static /* synthetic */ Class m187$r8$lambda$wYPk2MHP36iGClEpvZhBM93NIo() {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$12();
        }
        _init_$lambda$12();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$y4A1W6pkLipTgszF6646xDp3rlo() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = asInterface + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$ybg_f_vp7uwKbq8i83i8QmwgUpA() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$10();
        }
        _init_$lambda$10();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$zj1ki0IfenDkjL4QYidv5w30FyA() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i4 = asInterface + 77;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        int i = onTransact + 115;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public FeaturesMainUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$WFj6IO5o9YMDWRVqgyL_SkPAFbs = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$WFj6IO5o9YMDWRVqgyL_SkPAFbs();
                int i4 = IAuthTabCallback + 109;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$WFj6IO5o9YMDWRVqgyL_SkPAFbs;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.ALL;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-122, -127, -113, -121, -122, -114, -115, -116, -117, -125, -125, -121, -118, -127, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - Drawable.resolveOpacity(0, 0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        b(new char[]{3803, 3752, 4133, 20704, 45321, 58829, 48042, 20923, 55517, 56384, 37153, 1585, 41536, 45722, 51437, 15513, 36330, 26813, 15903, 54612}, View.MeasureSpec.getMode(0) + 1, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$S8mwT0GGEsBbrSmALP_9bLFYR0g = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$S8mwT0GGEsBbrSmALP_9bLFYR0g();
                int i4 = IAuthTabCallback + 19;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 63 / 0;
                }
                return cls$r8$lambda$S8mwT0GGEsBbrSmALP_9bLFYR0g;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-122, -121, -121, -123, -114, -125, -125, -113, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$y4A1W6pkLipTgszF6646xDp3rlo = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$y4A1W6pkLipTgszF6646xDp3rlo();
                int i4 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$y4A1W6pkLipTgszF6646xDp3rlo;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Function0 function02 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$zj1ki0IfenDkjL4QYidv5w30FyA = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$zj1ki0IfenDkjL4QYidv5w30FyA();
                int i4 = onNavigationEvent + 71;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$zj1ki0IfenDkjL4QYidv5w30FyA;
            }
        };
        TargetRegion targetRegion2 = TargetRegion.KR;
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-112, -123, -113, -121, -111, -118, -127, -113, -112, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - TextUtils.getTrimmedLength(""), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(function02, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-124, -110, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - Color.blue(0), objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$kajzi5KYRbnYQjQRxJWyfDjGJ4k = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$kajzi5KYRbnYQjQRxJWyfDjGJ4k();
                int i4 = onExtraCallback + 25;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$kajzi5KYRbnYQjQRxJWyfDjGJ4k;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-127, -124, -117, -122, -117, -123, -126, -109, -124, -127, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (KeyEvent.getMaxKeyCode() >> 16), objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$QaeMfqT4XbcXvqCQZOrX0tvwNFw = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$QaeMfqT4XbcXvqCQZOrX0tvwNFw();
                int i4 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$QaeMfqT4XbcXvqCQZOrX0tvwNFw;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-108, -116, -113, -111, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                Class cls$r8$lambda$3G2hH9JIBby6SOUzTq6qlB0D_SI;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 77;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    cls$r8$lambda$3G2hH9JIBby6SOUzTq6qlB0D_SI = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$3G2hH9JIBby6SOUzTq6qlB0D_SI();
                    int i3 = 15 / 0;
                } else {
                    cls$r8$lambda$3G2hH9JIBby6SOUzTq6qlB0D_SI = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$3G2hH9JIBby6SOUzTq6qlB0D_SI();
                }
                int i4 = IAuthTabCallback + 99;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$3G2hH9JIBby6SOUzTq6qlB0D_SI;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr8 = new Object[1];
        a(null, null, new byte[]{-122, -117, -107, -124, -116, -124, -111, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (KeyEvent.getMaxKeyCode() >> 16), objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 29;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$dmhCgpq9yWcRCXBZ5fSEvUC4o5w = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$dmhCgpq9yWcRCXBZ5fSEvUC4o5w();
                int i4 = onExtraCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$dmhCgpq9yWcRCXBZ5fSEvUC4o5w;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        b(new char[]{7307, 7416, 14509, 38793, 1466, 52549, 31939, 58632, 51853, 62664, 22088, 45698, 45072, 39442, 3972, 34858, 40867, 16443, 63851, 25064, 17719, 30701, 54000, 16248, 11453, 7482, 35998, 5314, 6742, 50315}, TextUtils.getOffsetAfter("", 0) + 1, objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda11
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$w9AZtyzzSzmP3dJGsOxQUzNkZ9k = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$w9AZtyzzSzmP3dJGsOxQUzNkZ9k();
                int i4 = onNavigationEvent + 119;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 0;
                }
                return cls$r8$lambda$w9AZtyzzSzmP3dJGsOxQUzNkZ9k;
            }
        }, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr10 = new Object[1];
        a(null, null, new byte[]{-115, -116, -117, -125, -125, -121, -118, -127, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, TextUtils.lastIndexOf("", '0', 0) + 128, objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$mXvdzjVMqhrhBBqkZd22MfJub30 = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$mXvdzjVMqhrhBBqkZd22MfJub30();
                int i4 = IAuthTabCallback + 61;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$mXvdzjVMqhrhBBqkZd22MfJub30;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr11 = new Object[1];
        a(null, null, new byte[]{-106, -113, -125, -127, -127, -121, -122, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr11);
        Pair pairIAuthTabCallback11 = getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$ybg_f_vp7uwKbq8i83i8QmwgUpA();
                }
                FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$ybg_f_vp7uwKbq8i83i8QmwgUpA();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr12 = new Object[1];
        b(new char[]{47410, 47425, 46616, 28893, 19721, 17392, 39831, 44475, 28468, 31357, 45340, 64049, 5545, 5287, 59600, 49305, 14877, 52878, 7720, 10579, 57475, 63769}, 1 - View.resolveSizeAndState(0, 0, 0), objArr12);
        Pair pairIAuthTabCallback12 = getWrite.IAuthTabCallback(((String) objArr12[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$3l_DNfQNj36qbB3S3Kp_WWBUmJg();
                    throw null;
                }
                Class cls$r8$lambda$3l_DNfQNj36qbB3S3Kp_WWBUmJg = FeaturesMainUiKspDeepLinkRegistry.$r8$lambda$3l_DNfQNj36qbB3S3Kp_WWBUmJg();
                int i3 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 60 / 0;
                }
                return cls$r8$lambda$3l_DNfQNj36qbB3S3Kp_WWBUmJg;
            }
        }, CollectionsKt.listOf(targetRegion2)));
        Object[] objArr13 = new Object[1];
        b(new char[]{55287, 55172, 51887, 2091, 36504, 16199, 58209, 28202, 497, 1738, 51690, 14752, 31596, 26640, 36902, 776, 21699, 45625, 26320, 60110, 36360, 34211, 19794, 46156, 59350, 61242, 4984, 40939, 53536, 13975, 63932}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr13);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, pairIAuthTabCallback11, pairIAuthTabCallback12, getWrite.IAuthTabCallback(((String) objArr13[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMainUiKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM187$r8$lambda$wYPk2MHP36iGClEpvZhBM93NIo = FeaturesMainUiKspDeepLinkRegistry.m187$r8$lambda$wYPk2MHP36iGClEpvZhBM93NIo();
                int i4 = onWarmupCompleted + 7;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM187$r8$lambda$wYPk2MHP36iGClEpvZhBM93NIo;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return setIsolationId.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return MainActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return MainActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return MainActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 37;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return MainActivity.class;
    }

    private static final Class _init_$lambda$5() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return MainActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$6() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return MainActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$7() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 15;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return MainActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$8() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return MainActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$9() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return MainActivity.class;
    }

    private static final Class _init_$lambda$10() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return MainActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$11() {
        Class<MainActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            cls = MainActivity.class;
            int i4 = 23 / 0;
        } else {
            cls = MainActivity.class;
        }
        int i5 = i3 + 49;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static final Class _init_$lambda$12() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return MainActivity.class;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 119;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - KeyEvent.normalizeMetaState(0)), KeyEvent.normalizeMetaState(0) + 84, 21233 - (ViewConfiguration.getTapTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 14185), View.MeasureSpec.makeMeasureSpec(0, 0) + 19, TextUtils.indexOf("", "", 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 51;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 7;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) - 1), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 76, 20953 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i7 = $11 + 59;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 2;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        float f = 0.0f;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 75 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 16037 - Gravity.getAbsoluteGravity(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 62, 16789430 + Color.rgb(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                f = 0.0f;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onNavigationEvent) {
            int i9 = $11 + 47;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 62, (ViewConfiguration.getTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            int i11 = $10 + 109;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        String str = new String(cArr6);
        int i13 = $11 + 109;
        $10 = i13 % 128;
        if (i13 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i14 = 75 / 0;
            objArr[0] = str;
        }
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{32500, 32490, 32503, 32506, 32501, 32491, 32496, 32429, 32432, 32511, 32510, 32497, 32504, 32434, 32454, 32507, 32453, 32498, 32452, 32508, 32505, 32494};
        onExtraCallbackWithResult = -1184333977;
        onNavigationEvent = true;
        IAuthTabCallback = true;
        onWarmupCompleted = 7699601556611436177L;
    }
}
