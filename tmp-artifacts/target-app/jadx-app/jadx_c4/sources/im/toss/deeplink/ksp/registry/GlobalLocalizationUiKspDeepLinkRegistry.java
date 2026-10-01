package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.global.localization.ui.activity.ChangeRegionActivity;
import im.toss.global.localization.ui.activity.LanguageSettingActivity;
import im.toss.global.localization.ui.activity.RegionSettingActivity;
import im.toss.global.localization.ui.activity.TranslationFeedbackActivity;
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
public final class GlobalLocalizationUiKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static long IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$Dv2CK9P4ampEniO4KT6xE9lK6o8() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i4 = onNavigationEvent + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$2;
    }

    public static /* synthetic */ Class $r8$lambda$IkbvVoShqtaTOsjb2rH31VDFuXA() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 13 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$kcMswFzV0VbKnrU6jVcpQWFFiWc() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = onWarmupCompleted + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$1;
    }

    public static /* synthetic */ Class $r8$lambda$tUx7xSegCrWDkLgbOxFV6_qnYow() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$3 = _init_$lambda$3();
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return cls_init_$lambda$3;
    }

    static {
        onExtraCallback();
        int i = onExtraCallback + 81;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }

    public GlobalLocalizationUiKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalLocalizationUiKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    GlobalLocalizationUiKspDeepLinkRegistry.$r8$lambda$IkbvVoShqtaTOsjb2rH31VDFuXA();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$IkbvVoShqtaTOsjb2rH31VDFuXA = GlobalLocalizationUiKspDeepLinkRegistry.$r8$lambda$IkbvVoShqtaTOsjb2rH31VDFuXA();
                int i3 = IAuthTabCallback + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$IkbvVoShqtaTOsjb2rH31VDFuXA;
            }
        };
        TargetRegion targetRegion = TargetRegion.ALL;
        Object[] objArr = new Object[1];
        a(new char[]{26266, 25796, 10900, 51046, 26345, 28110, 14362, 56190, 17172, 19403, 4609, 34156, 11537, 12681, 29773, 44860, 5901, 8159, 44551, 18809, 61709, 50638, 32855, 29561, 56083, 41928, 64023, 7520, 34076}, View.MeasureSpec.getSize(0) + 1, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Function0 function02 = new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalLocalizationUiKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$kcMswFzV0VbKnrU6jVcpQWFFiWc = GlobalLocalizationUiKspDeepLinkRegistry.$r8$lambda$kcMswFzV0VbKnrU6jVcpQWFFiWc();
                int i4 = onNavigationEvent + 75;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$kcMswFzV0VbKnrU6jVcpQWFFiWc;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        TargetRegion targetRegion2 = TargetRegion.KR;
        TargetRegion[] targetRegionArr = {targetRegion2, TargetRegion.EU};
        Object[] objArr2 = new Object[1];
        a(new char[]{64483, 19662, 59116, 56123, 64400, 17860, 62562, 50979, 56941, 25537, 56953, 39217, 45160, 6531, 47157, 45921, 35428, 14296, 25194, 21822, 27770, 60879, 19557, 28453, 17952, 35785, 13927, 316, 6252, 41436, 4203, 56121, 62050}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(function02, CollectionsKt.listOf(targetRegionArr)));
        Object[] objArr3 = new Object[1];
        a(new char[]{64016, 7482, 29332, 34463, 64099, 5168, 24602, 39559, 57246, 12853, 18945, 50325, 45467, 18551, 11341, 61125, 35735, 26156, 62994, 2202, 28041, 48187, 55325, 12929, 18387, 55843, 41499, 23697, 6545, 61490, 33820}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalLocalizationUiKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 33;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$Dv2CK9P4ampEniO4KT6xE9lK6o8 = GlobalLocalizationUiKspDeepLinkRegistry.$r8$lambda$Dv2CK9P4ampEniO4KT6xE9lK6o8();
                int i4 = onExtraCallback + 43;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$Dv2CK9P4ampEniO4KT6xE9lK6o8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{46339, 64742, 51187, 1935, 46448, 62956, 54653, 7063, 37005, 54249, 65382, 17797, 65160, 43435, 39210, 28629, 50330, 34784, 17261, 35210, 8858, 24037, 28020, 45964, 2184, 15352, 6008, 56714, 22212, 4597, 12647, 1931, 48265, 61430, 56189, 8591, 39575, 50640, 34114, 19388, 57584, 41947, 44876, 30131, 52927, 31187, 18756, 40889, 5308}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.GlobalLocalizationUiKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return GlobalLocalizationUiKspDeepLinkRegistry.$r8$lambda$tUx7xSegCrWDkLgbOxFV6_qnYow();
                }
                GlobalLocalizationUiKspDeepLinkRegistry.$r8$lambda$tUx7xSegCrWDkLgbOxFV6_qnYow();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion2)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return ChangeRegionActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return LanguageSettingActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return RegionSettingActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return TranslationFeedbackActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 107;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0', 0) + 85, 21233 - Color.blue(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 14185), 19 - View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 55;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        IAuthTabCallback = -1922073167454440845L;
    }
}
