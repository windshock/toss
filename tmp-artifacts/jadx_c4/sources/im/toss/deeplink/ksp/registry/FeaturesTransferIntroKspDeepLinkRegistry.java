package im.toss.deeplink.ksp.registry;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.transfer.intro.ui.mydata.TransferIntroMydataOnboardingActivity;
import im.toss.features.transfer.intro.ui.mydata.TransferIntroMydataRedirectActivity;
import im.toss.features.transfer.intro.ui.mydata.TransferIntroMydataRegisteredActivity;
import im.toss.features.transfer.intro.ui.suggestion.TransferIntroActivity;
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
public final class FeaturesTransferIntroKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = 4905138277010538903L;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Class $r8$lambda$c4cPRaO3n6tZwu63D7PcWa8mIIk() {
        Class cls_init_$lambda$0;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            cls_init_$lambda$0 = _init_$lambda$0();
            int i3 = 0 / 0;
        } else {
            cls_init_$lambda$0 = _init_$lambda$0();
        }
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$pDJruoKYfjJGiLJCw0PX_vhXipY() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$2();
        }
        _init_$lambda$2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: $r8$lambda$xG1-3BL95dM1GzGGhKekmXx-OdU, reason: not valid java name */
    public static /* synthetic */ Class m246$r8$lambda$xG13BL95dM1GzGGhKekmXxOdU() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$3();
            throw null;
        }
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i3 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$3;
    }

    public static /* synthetic */ Class $r8$lambda$xv91eNTkHFrfp0Dioxlj1F0TzpQ() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return cls_init_$lambda$1;
    }

    public FeaturesTransferIntroKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferIntroKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$c4cPRaO3n6tZwu63D7PcWa8mIIk = FeaturesTransferIntroKspDeepLinkRegistry.$r8$lambda$c4cPRaO3n6tZwu63D7PcWa8mIIk();
                int i4 = onWarmupCompleted + 75;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$c4cPRaO3n6tZwu63D7PcWa8mIIk;
                }
                throw null;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{25028, 7941, 25015, 62365, 42322, 58859, 1755, 19174, 35802, 64118, 11344, 32540, 46447, 53324, 14780, 25044, 57076, 42664, 18310, 2601, 51207, 47912, 27934, 15521, 62967, 37343, 31414, 9947, 7981, 26194, 32834, 52004, 2399, 31972, 44501, 65016, 12997, 21132, 47983, 58890, 23654, 9989, 49328, 34982, 18834, 15778, 61057, 48436}, -TextUtils.indexOf((CharSequence) "", '0'), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{44695, 53093, 44772, 1794, 549, 13707, 62020, 60817, 17545, 10774, 55503, 55403, 31292, ',', 52515, 50851, 4542, 30403, 45852, 44369, 1875, 27471, 39371, 39888, 15097, 16819, 36414, 33211, 53369, 46627, 29902, 27731, 50705, 44175, 22863, 23177, 64900, 33514, 20465, 16742}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferIntroKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesTransferIntroKspDeepLinkRegistry.$r8$lambda$xv91eNTkHFrfp0Dioxlj1F0TzpQ();
                    throw null;
                }
                Class cls$r8$lambda$xv91eNTkHFrfp0Dioxlj1F0TzpQ = FeaturesTransferIntroKspDeepLinkRegistry.$r8$lambda$xv91eNTkHFrfp0Dioxlj1F0TzpQ();
                int i3 = onWarmupCompleted + 43;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$xv91eNTkHFrfp0Dioxlj1F0TzpQ;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{12092, 8469, 12111, 39460, 35059, 56315, 28514, 26439, 50466, 50278, 17897, 21181, 64407, 61020, 20485, 19573, 36876, 39096, 11839, 10120, 34559, 34104, 1191, 4352, 47887, 45007, 4879, 2938, 20949, 22594, 59899, 59013, 18362, 17151, 50281, 53343, 31791, 27802, 53975, 52144, 4757, 6422, 43273, 42247, 1898, 946, 34616, 37013}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferIntroKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 23;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$pDJruoKYfjJGiLJCw0PX_vhXipY = FeaturesTransferIntroKspDeepLinkRegistry.$r8$lambda$pDJruoKYfjJGiLJCw0PX_vhXipY();
                int i4 = onExtraCallback + 43;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$pDJruoKYfjJGiLJCw0PX_vhXipY;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{3549, 23294, 3502, 34641, 6979, 40976, 29207, 62711, 59331, 49037, 22684, 49421, 55670, 38327, 19824, 57285, 45805, 58195, 13130, 46136, 42014, 65235, 6610, 33456, 39406, 54304, 3693, 39130, 29479, 9138}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr4);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferIntroKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                Class clsM246$r8$lambda$xG13BL95dM1GzGGhKekmXxOdU;
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    clsM246$r8$lambda$xG13BL95dM1GzGGhKekmXxOdU = FeaturesTransferIntroKspDeepLinkRegistry.m246$r8$lambda$xG13BL95dM1GzGGhKekmXxOdU();
                    int i3 = 76 / 0;
                } else {
                    clsM246$r8$lambda$xG13BL95dM1GzGGhKekmXxOdU = FeaturesTransferIntroKspDeepLinkRegistry.m246$r8$lambda$xG13BL95dM1GzGGhKekmXxOdU();
                }
                int i4 = onNavigationEvent + 73;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 90 / 0;
                }
                return clsM246$r8$lambda$xG13BL95dM1GzGGhKekmXxOdU;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return TransferIntroMydataOnboardingActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return TransferIntroMydataRedirectActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return TransferIntroMydataRegisteredActivity.class;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return TransferIntroActivity.class;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 35;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 45813), 84 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "", 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 14185), 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 119;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 38 / 0;
            objArr[0] = str;
        }
    }
}
