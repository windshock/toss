package im.toss.deeplink.ksp.registry;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.setting.ContactSettingActivity;
import im.toss.features.setting.ContactSettingTestActivity;
import im.toss.features.setting.TossAppSettingActivity;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesSettingKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    /* renamed from: $r8$lambda$-fdvDAyZCyotYHxPmp7ct6cY1P0, reason: not valid java name */
    public static /* synthetic */ Class m214$r8$lambda$fdvDAyZCyotYHxPmp7ct6cY1P0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$FUydS5jBXPJU_MOVPpefWZAg1Fw() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$ZO8Vday840Mp5u3p1TOvHrbb5sU() {
        Class cls_init_$lambda$1;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$1 = _init_$lambda$1();
            int i3 = 3 / 0;
        } else {
            cls_init_$lambda$1 = _init_$lambda$1();
        }
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        int i = onNavigationEvent + 41;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FeaturesSettingKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesSettingKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$FUydS5jBXPJU_MOVPpefWZAg1Fw = FeaturesSettingKspDeepLinkRegistry.$r8$lambda$FUydS5jBXPJU_MOVPpefWZAg1Fw();
                int i4 = onExtraCallbackWithResult + 99;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$FUydS5jBXPJU_MOVPpefWZAg1Fw;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{40307, 63043, 52887, 40192, 2670, 32914, 13911, 30207, 27745, 7055, 9448, 26249, 32704, 10593, 5576, 22389, 18737, 9815, 552, 18905, 22680, 14262, 28883, 14952, 11250, 17685, 24948, 11036, 13654, 21161, 28232, 7608, 1215, 25556, 23716, 3665, 5654, 29055, 19722, 246, 57722, 36488, 48115}, View.MeasureSpec.getSize(0), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{44053, 32132, 26578, 44134, 33193, 44872, 40722, 23077, 23815, 36936, 36269, 18771, 20134, 41638, 48269, 30895, 30785, 44441, 43889, 26132, 27066, 48191, 55693, 5550, 6785, 52957, 51233, 1236, 1144, 55663, 51015, 12916, 13761, 59413, 62956, 8583}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesSettingKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 111;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesSettingKspDeepLinkRegistry.$r8$lambda$ZO8Vday840Mp5u3p1TOvHrbb5sU();
                    throw null;
                }
                Class cls$r8$lambda$ZO8Vday840Mp5u3p1TOvHrbb5sU = FeaturesSettingKspDeepLinkRegistry.$r8$lambda$ZO8Vday840Mp5u3p1TOvHrbb5sU();
                int i3 = onNavigationEvent + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$ZO8Vday840Mp5u3p1TOvHrbb5sU;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{3446, 37468, 395, 3333, 28273, 44535, 63819, 22682, 64612, 32656, 60404, 19436, 61381, 19838, 56020, 31248, 55589, 16961, 52527, 25771, 51359, 21482, 49116, 5900}, TextUtils.indexOf("", "", 0), objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesSettingKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                Class clsM214$r8$lambda$fdvDAyZCyotYHxPmp7ct6cY1P0;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM214$r8$lambda$fdvDAyZCyotYHxPmp7ct6cY1P0 = FeaturesSettingKspDeepLinkRegistry.m214$r8$lambda$fdvDAyZCyotYHxPmp7ct6cY1P0();
                    int i3 = 31 / 0;
                } else {
                    clsM214$r8$lambda$fdvDAyZCyotYHxPmp7ct6cY1P0 = FeaturesSettingKspDeepLinkRegistry.m214$r8$lambda$fdvDAyZCyotYHxPmp7ct6cY1P0();
                }
                int i4 = onNavigationEvent + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 30 / 0;
                }
                return clsM214$r8$lambda$fdvDAyZCyotYHxPmp7ct6cY1P0;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return ContactSettingActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return ContactSettingTestActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return TossAppSettingActivity.class;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 17;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 113;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 45812), 84 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - TextUtils.getCapsMode("", 0, 0)), TextUtils.indexOf("", "", 0) + 19, 8807 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = -6498964888425167020L;
    }
}
