package im.toss.deeplink.ksp.registry;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesMobileidImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int[] onExtraCallback = null;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$3zkB2OB0FjfgSk8S5moQVdFRKJs() throws ClassNotFoundException {
        Class cls_init_$lambda$7;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$7 = _init_$lambda$7();
            int i3 = 4 / 0;
        } else {
            cls_init_$lambda$7 = _init_$lambda$7();
        }
        int i4 = onNavigationEvent + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$7;
        }
        throw null;
    }

    /* renamed from: $r8$lambda$E3ann6u-uxczREbrNjuNmMs9des, reason: not valid java name */
    public static /* synthetic */ Class m189$r8$lambda$E3ann6uuxczREbrNjuNmMs9des() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$5();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$5 = _init_$lambda$5();
        int i3 = onWarmupCompleted + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$5;
    }

    public static /* synthetic */ Class $r8$lambda$JEsZjFCjS8nWYLAakPbzqZ0ldF8() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$6 = _init_$lambda$6();
        int i4 = onNavigationEvent + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return cls_init_$lambda$6;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$OHBlhgWD8x0T098pQJEuJuZYybw() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$0();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$S9PB4JshoPDMRm5H5-SqEMK4X4E, reason: not valid java name */
    public static /* synthetic */ Class m190$r8$lambda$S9PB4JshoPDMRm5H5SqEMK4X4E() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$2();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = onNavigationEvent + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$T9CuMfOI9mWvYenFzRhlOYFNa7w() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$8 = _init_$lambda$8();
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$8;
    }

    public static /* synthetic */ Class $r8$lambda$Tu7PyYbY7gCXLrzncGulhtq_3Jo() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$4();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i3 = onNavigationEvent + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$4;
    }

    /* renamed from: $r8$lambda$UPwmKpORSMjS-YfpUTDcikvZPEc, reason: not valid java name */
    public static /* synthetic */ Class m191$r8$lambda$UPwmKpORSMjSYfpUTDcikvZPEc() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onWarmupCompleted + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$cuG5YUkh2ZHUJWehMfVk96fGYwk() throws ClassNotFoundException {
        Class cls_init_$lambda$10;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            cls_init_$lambda$10 = _init_$lambda$10();
            int i3 = 72 / 0;
        } else {
            cls_init_$lambda$10 = _init_$lambda$10();
        }
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$10;
    }

    public static /* synthetic */ Class $r8$lambda$djfSz8EDX2HmC6Dib8KO2B5cFLs() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$3();
        }
        _init_$lambda$3();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$fcTdANAB6xMZgur_pAE8Tkp2Neo() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$9 = _init_$lambda$9();
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return cls_init_$lambda$9;
    }

    static {
        onNavigationEvent();
        int i = IAuthTabCallback + 49;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesMobileidImplKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onExtraCallback + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$OHBlhgWD8x0T098pQJEuJuZYybw = FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$OHBlhgWD8x0T098pQJEuJuZYybw();
                int i4 = onExtraCallback + 121;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$OHBlhgWD8x0T098pQJEuJuZYybw;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new int[]{-966054296, -1743212311, -310040767, 605324453, -832257698, 994637802, -629674493, 2035734861, -1362862037, -396381478, 63805613, -660446247, 629787158, 1804954866, 1662495780, -944790419, -746079167, 1064488337, -1146582735, -1522415430}, (ViewConfiguration.getTouchSlop() >> 8) + 39, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        b(new char[]{49892, 49815, 17754, 20333, 35677, 54265, 26864, 963, 64350, 19732, 39342, 42670, 45319, 1890, 24374, 56586, 28625, 16127, 1331, 6916, 9640, 61613, 52036, 20956, 57960, 43567, 62147, 36756, 38970, 27676, 47248, 50603, 22267}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws ClassNotFoundException {
                Class clsM191$r8$lambda$UPwmKpORSMjSYfpUTDcikvZPEc;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    clsM191$r8$lambda$UPwmKpORSMjSYfpUTDcikvZPEc = FeaturesMobileidImplKspDeepLinkRegistry.m191$r8$lambda$UPwmKpORSMjSYfpUTDcikvZPEc();
                    int i3 = 51 / 0;
                } else {
                    clsM191$r8$lambda$UPwmKpORSMjSYfpUTDcikvZPEc = FeaturesMobileidImplKspDeepLinkRegistry.m191$r8$lambda$UPwmKpORSMjSYfpUTDcikvZPEc();
                }
                int i4 = IAuthTabCallback + 73;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 78 / 0;
                }
                return clsM191$r8$lambda$UPwmKpORSMjSYfpUTDcikvZPEc;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new int[]{-966054296, -1743212311, -310040767, 605324453, -832257698, 994637802, -629674493, 2035734861, 584786508, -1031746466, 1620107402, 544065284, -932148000, -498373618}, 27 - Drawable.resolveOpacity(0, 0), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM190$r8$lambda$S9PB4JshoPDMRm5H5SqEMK4X4E = FeaturesMobileidImplKspDeepLinkRegistry.m190$r8$lambda$S9PB4JshoPDMRm5H5SqEMK4X4E();
                int i4 = onWarmupCompleted + 43;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return clsM190$r8$lambda$S9PB4JshoPDMRm5H5SqEMK4X4E;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new int[]{-966054296, -1743212311, -310040767, 605324453, -832257698, 994637802, -629674493, 2035734861, 584786508, -1031746466, 994154139, 454441031}, Gravity.getAbsoluteGravity(0, 0) + 21, objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$djfSz8EDX2HmC6Dib8KO2B5cFLs();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$djfSz8EDX2HmC6Dib8KO2B5cFLs = FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$djfSz8EDX2HmC6Dib8KO2B5cFLs();
                int i3 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$djfSz8EDX2HmC6Dib8KO2B5cFLs;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new int[]{-966054296, -1743212311, -310040767, 605324453, -832257698, 994637802, -629674493, 2035734861, 584786508, -1031746466, 1636303039, 1820563097, -1000429218, -764570077}, 27 - (Process.myPid() >> 22), objArr5);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$Tu7PyYbY7gCXLrzncGulhtq_3Jo = FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$Tu7PyYbY7gCXLrzncGulhtq_3Jo();
                int i4 = onWarmupCompleted + 61;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 40 / 0;
                }
                return cls$r8$lambda$Tu7PyYbY7gCXLrzncGulhtq_3Jo;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr6 = new Object[1];
        a(new int[]{-966054296, -1743212311, -310040767, 605324453, -832257698, 994637802, -629674493, 2035734861, 584786508, -1031746466, -681964315, 1848748950, 1184389276, 390153681, -1432762109, -1645912105}, 29 - View.resolveSizeAndState(0, 0, 0), objArr6);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda6
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onExtraCallback + 67;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class clsM189$r8$lambda$E3ann6uuxczREbrNjuNmMs9des = FeaturesMobileidImplKspDeepLinkRegistry.m189$r8$lambda$E3ann6uuxczREbrNjuNmMs9des();
                if (i3 != 0) {
                    int i4 = 26 / 0;
                }
                return clsM189$r8$lambda$E3ann6uuxczREbrNjuNmMs9des;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr7 = new Object[1];
        a(new int[]{-966054296, -1743212311, -310040767, 605324453, -832257698, 994637802, -629674493, 2035734861, 584786508, -1031746466, 1722087284, 370448328, -207738925, -1313227627}, 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr7);
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$JEsZjFCjS8nWYLAakPbzqZ0ldF8();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$JEsZjFCjS8nWYLAakPbzqZ0ldF8 = FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$JEsZjFCjS8nWYLAakPbzqZ0ldF8();
                int i3 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$JEsZjFCjS8nWYLAakPbzqZ0ldF8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr8 = new Object[1];
        a(new int[]{-966054296, -1743212311, -310040767, 605324453, -832257698, 994637802, -1708015491, 1006032898, -439567842, 1332102487, -215637400, 154854048}, KeyEvent.getDeadChar(0, 0) + 21, objArr8);
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$3zkB2OB0FjfgSk8S5moQVdFRKJs = FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$3zkB2OB0FjfgSk8S5moQVdFRKJs();
                int i4 = onWarmupCompleted + 37;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$3zkB2OB0FjfgSk8S5moQVdFRKJs;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr9 = new Object[1];
        b(new char[]{59842, 59825, 49642, 56253, 4077, 18217, 38854, 64757, 53368, 51620, 3454, 22936, 39457, 33746, 52198, 8764, 17655, 47695, 37347, 58418, 3726, 29725, 24468, 44778, 51534, 11935, 26141, 28834, 45825, 59580}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr9);
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$T9CuMfOI9mWvYenFzRhlOYFNa7w = FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$T9CuMfOI9mWvYenFzRhlOYFNa7w();
                int i4 = onWarmupCompleted + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$T9CuMfOI9mWvYenFzRhlOYFNa7w;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr10 = new Object[1];
        b(new char[]{21715, 21664, 40658, 20917, 20693, 52513, 41867, 51384, 28009, 38556, 34678, 28117, 10032, 56554, 16878, 5745, 63974, 58743, 7147, 53375, 45983, 11045, 54684, 39591, 29791, 29095, 60425, 17651, 3600, 47000, 42510, 3788, 49358, 64587, 24716, 14082}, Process.myPid() >> 22, objArr10);
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$fcTdANAB6xMZgur_pAE8Tkp2Neo = FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$fcTdANAB6xMZgur_pAE8Tkp2Neo();
                int i4 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$fcTdANAB6xMZgur_pAE8Tkp2Neo;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr11 = new Object[1];
        b(new char[]{39259, 39208, 23459, 28759, 38308, 60611, 58723, 36432, 41185, 21485, 42644, 11069, 60088, 6555, 24588, 20633, 13422, 8198, 14857, 38551, 32279, 61012, 62590, 56399, 47575, 46294, 52725, 513, 50079, 29416, 34720, 18483, 3340, 14654, 16746, 29170, 22391, 51060, 6919, 47083, 37175, 36284, 54487, 64875, 55551, 19332, 44679}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr11);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, getWrite.IAuthTabCallback(((String) objArr11[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesMobileidImplKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() throws ClassNotFoundException {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$cuG5YUkh2ZHUJWehMfVk96fGYwk();
                }
                FeaturesMobileidImplKspDeepLinkRegistry.$r8$lambda$cuG5YUkh2ZHUJWehMfVk96fGYwk();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.nudge.MobileIdIssueNudgeForMyDataActivity");
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$1() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.view.MobileIdBindingActivity");
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$2() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Class.forName("im.toss.features.mobileid.impl.view.MobileIdIssueActivity");
            obj.hashCode();
            throw null;
        }
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.view.MobileIdIssueActivity");
        int i3 = onWarmupCompleted + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return cls;
        }
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.view.MobileIdIssueRouteActivity");
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$4() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.view.MobileIdKeyExpiredActivity");
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    private static final Class _init_$lambda$5() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.view.MobileIdSettingActivity");
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$6() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.vp.MobileIdVpActivity");
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls;
    }

    private static final Class _init_$lambda$7() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.MyWalletActivity");
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls;
    }

    private static final Class _init_$lambda$8() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.MyWalletActivity");
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return cls;
    }

    private static final Class _init_$lambda$9() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Class.forName("im.toss.features.mobileid.impl.view.MobileIdPushResetActivity");
            obj.hashCode();
            throw null;
        }
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.view.MobileIdPushResetActivity");
        int i3 = onWarmupCompleted + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return cls;
        }
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$10() throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class<?> cls = Class.forName("im.toss.features.mobileid.impl.view.MobileIdPushResetActivity");
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 75;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 84, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 14185), 19 - ((Process.getThreadPriority(0) + 20) >> 6), 8808 - (ViewConfiguration.getTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 101;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallback;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr3 != null) {
            int i5 = $10 + 115;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getCapsMode("", 0, 0) + 72, 8848 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $11 + 67;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr3 = new Object[1];
                objArr3[i4] = Integer.valueOf(iArr5[i7]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", i4, i4) + 72, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i7++;
                int i10 = $11 + 89;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i4;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        int i13 = $11 + 27;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i15 = $11 + 75;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 22252), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 38, (KeyEvent.getMaxKeyCode() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i17++;
                int i19 = $11 + 101;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i21;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i23 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - ExpandableListView.getPackedPositionGroup(0L)), 77 - TextUtils.lastIndexOf("", '0', 0), TextUtils.lastIndexOf("", '0', 0) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        onExtraCallback = new int[]{-2128053258, 584733306, 556865403, 694169077, -778715231, -380859002, -1258746066, 897395544, 809927136, -1700126782, 1231864909, -1306996838, -1933487503, -1862774868, -2036673035, 1510986950, 1582665022, -810069548};
        onExtraCallbackWithResult = -8720356032612223618L;
    }
}
