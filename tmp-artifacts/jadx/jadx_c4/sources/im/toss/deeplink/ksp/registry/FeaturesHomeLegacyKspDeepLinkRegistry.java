package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.legacy.view.consumption.analysis.AnalysisCategoryActivity;
import im.toss.features.home.legacy.view.consumption.analysis.list.AnalysisCategoryListActivity;
import im.toss.features.home.legacy.view.transaction.detail.TransactionDetailActivity;
import im.toss.features.home.legacy.view.transaction.manual.ManualTransactionAddActivity;
import im.toss.features.home.legacy.view.transaction.manual.ManualTransactionListActivity;
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
public final class FeaturesHomeLegacyKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 8660855297148994097L;
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    /* renamed from: $r8$lambda$-24wS-6bX9wTNxg7WA9xLq6WCl0, reason: not valid java name */
    public static /* synthetic */ Class m145$r8$lambda$24wS6bX9wTNxg7WA9xLq6WCl0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onWarmupCompleted + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$0;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$95mV_4EtOJd0BMVgCsS3wdupoX8() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$3();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$3 = _init_$lambda$3();
        int i3 = onExtraCallback + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$3;
    }

    public static /* synthetic */ Class $r8$lambda$F8KRK8wQR2dcj40lyWbWevaTXqE() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$4 = _init_$lambda$4();
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return cls_init_$lambda$4;
    }

    public static /* synthetic */ Class $r8$lambda$SFb4JjC30ymY2uYqS_OqK_7lRqM() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$1();
        }
        _init_$lambda$1();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$otS7s_uhIMgtPqECaYxjwP6cKjM() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$2();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = onWarmupCompleted + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 6 / 0;
        }
        return cls_init_$lambda$2;
    }

    public FeaturesHomeLegacyKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeLegacyKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesHomeLegacyKspDeepLinkRegistry.m145$r8$lambda$24wS6bX9wTNxg7WA9xLq6WCl0();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class clsM145$r8$lambda$24wS6bX9wTNxg7WA9xLq6WCl0 = FeaturesHomeLegacyKspDeepLinkRegistry.m145$r8$lambda$24wS6bX9wTNxg7WA9xLq6WCl0();
                int i3 = onExtraCallback + 49;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 46 / 0;
                }
                return clsM145$r8$lambda$24wS6bX9wTNxg7WA9xLq6WCl0;
            }
        };
        TargetRegion targetRegion = TargetRegion.ALL;
        Object[] objArr = new Object[1];
        a(new char[]{6485, 6438, 61927, 43060, 52082, 51375, 55870, 24736, 64979, 61346, 65333, 23466, 53454, 62200, 38009, 48834, 47073, 6545, 35087, 37252, 35498, 15497, 44561, 62619, 25058, 17299, 17255, 61305, 17561, 26491, 30825, 49779, 23510, 35439, 7548, 9584, 16025, 37187, 12893, 6220, 5554, 46105, 55129, 29528, 59561, 56135, 52305, 22050, 53083, 65063}, -TextUtils.indexOf((CharSequence) "", '0'), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{30025, 30010, 21783, 26779, 40237, 27743, 6801, 14079, 37327, 19282, 16282, 3573, 48338, 22024, 21718, 59549, 56317, 48481, 18848, 51163, 59062, 39033, 28350, 41668, 3582, 59235, 33736, 47398, 10373, 50059, 47302, 37932, 14282, 11935, 56787, 29487, 21125, 13747, 62194, 19987, 31150, 4329, 6134, 9479, 33973, 32695, 3326, '}', 41799, 23239, 8200, 8045}, -MotionEvent.axisFromString(""), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeLegacyKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$SFb4JjC30ymY2uYqS_OqK_7lRqM = FeaturesHomeLegacyKspDeepLinkRegistry.$r8$lambda$SFb4JjC30ymY2uYqS_OqK_7lRqM();
                int i4 = IAuthTabCallback + 53;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 63 / 0;
                }
                return cls$r8$lambda$SFb4JjC30ymY2uYqS_OqK_7lRqM;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{22866, 22817, 61266, 39711, 5166, 54810, 59669, 49148, 48596, 61719, 52254, 34038, 37065, 60493, 42834, 24990, 63462, 1828, 47652, 20184, 51885, 8764, 40250, 11207, 8677, 23846, 28748, 12325, 1182, 31182, 19266, 7471, 7121, 38095, 11851, 64044, 32412, 36860, 356, 50970, 21938, 43754, 58494, 44043, 43253, 50675, 65400, 35173, 36687, 57474, 54149}, 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeLegacyKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesHomeLegacyKspDeepLinkRegistry.$r8$lambda$otS7s_uhIMgtPqECaYxjwP6cKjM();
                    throw null;
                }
                Class cls$r8$lambda$otS7s_uhIMgtPqECaYxjwP6cKjM = FeaturesHomeLegacyKspDeepLinkRegistry.$r8$lambda$otS7s_uhIMgtPqECaYxjwP6cKjM();
                int i3 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    return cls$r8$lambda$otS7s_uhIMgtPqECaYxjwP6cKjM;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr4 = new Object[1];
        a(new char[]{48266, 48377, 36850, 48015, 11311, 46778, 51589, 34813, 22540, 37303, 60558, 48375, 29969, 36077, 34754, 22943, 4670, 26500, 39604, 30425, 12149, 17052, 48554, 5062, 50237, 15750, 20700, 2084, 57670, 6510, 27602, 9518, 65033, 62575, 3803, 49709, 39748, 61276, 8692, 65307, 45162, 51786, 50414, 37898, 19757, 42326, 57321, 45428}, 1 - TextUtils.getCapsMode("", 0, 0), objArr4);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeLegacyKspDeepLinkRegistry$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 91;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$95mV_4EtOJd0BMVgCsS3wdupoX8 = FeaturesHomeLegacyKspDeepLinkRegistry.$r8$lambda$95mV_4EtOJd0BMVgCsS3wdupoX8();
                int i4 = IAuthTabCallback + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$95mV_4EtOJd0BMVgCsS3wdupoX8;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr5 = new Object[1];
        a(new char[]{19588, 19703, 3520, 26172, 18943, 13448, 5174, 57901, 43010, 4997, 12605, 55591, 34079, 3807, 23153, 15439, 57904, 58806, 18183, 4873, 57211, 49326, 24601, 30230, 13363, 49076, 36207, 28148, 4424, 39772, 46689, 16638, 3591, 30282, 54139, 42991, 27468}, 1 - TextUtils.indexOf("", "", 0), objArr5);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeLegacyKspDeepLinkRegistry$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 117;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return FeaturesHomeLegacyKspDeepLinkRegistry.$r8$lambda$F8KRK8wQR2dcj40lyWbWevaTXqE();
                }
                FeaturesHomeLegacyKspDeepLinkRegistry.$r8$lambda$F8KRK8wQR2dcj40lyWbWevaTXqE();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return AnalysisCategoryActivity.class;
        }
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return AnalysisCategoryListActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return TransactionDetailActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$3() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return ManualTransactionAddActivity.class;
    }

    private static final Class _init_$lambda$4() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return ManualTransactionListActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 109;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45812), ImageFormat.getBitsPerPixel(0) + 85, 21233 - Gravity.getAbsoluteGravity(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 14185), Color.blue(0) + 19, 8808 - Color.argb(0, 0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 15;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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
}
