package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageActivity;
import im.toss.feature.credit.ui.quiz.qna.CreditQuizActivity;
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
public final class FeaturesCreditUiQuizKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;

    /* renamed from: $r8$lambda$627jbLpeYZEAmtRoRoB-Fv3B868, reason: not valid java name */
    public static /* synthetic */ Class m131$r8$lambda$627jbLpeYZEAmtRoRoBFv3B868() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$0;
    }

    /* renamed from: $r8$lambda$gqABM9BMJqxt-Ys0BZHO-A9YY9I, reason: not valid java name */
    public static /* synthetic */ Class m132$r8$lambda$gqABM9BMJqxtYs0BZHOA9YY9I() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return _init_$lambda$1();
        }
        _init_$lambda$1();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        int i = onNavigationEvent + 43;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public FeaturesCreditUiQuizKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiQuizKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM131$r8$lambda$627jbLpeYZEAmtRoRoBFv3B868 = FeaturesCreditUiQuizKspDeepLinkRegistry.m131$r8$lambda$627jbLpeYZEAmtRoRoBFv3B868();
                int i4 = IAuthTabCallback + 49;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return clsM131$r8$lambda$627jbLpeYZEAmtRoRoBFv3B868;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{63151, 10044, 45941, 5643, 63196, 14006, 37115, 9107, 45345, 32435, 55520, 27521, 31012, 34545, 172, 54225, 8504, 52925, 18658, 7070, 59702, 5799, 61620, 17303, 37174, 24254, 14565, 35789, 22826, 59042, 24803, 62351, 300, 11962}, TextUtils.getTrimmedLength("") + 1, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{4311, 46235, 46653, 16825, 4260, 42257, 38323, 29729, 22361, 60692, 56744, 15411, 40796, 5462, 1508, 33891, 51008, 23834, 19882, 19500, 3918, 34048, 62972, 5157, 30542, 52505, 15789}, 1 - Drawable.resolveOpacity(0, 0), objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesCreditUiQuizKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    FeaturesCreditUiQuizKspDeepLinkRegistry.m132$r8$lambda$gqABM9BMJqxtYs0BZHOA9YY9I();
                    throw null;
                }
                Class clsM132$r8$lambda$gqABM9BMJqxtYs0BZHOA9YY9I = FeaturesCreditUiQuizKspDeepLinkRegistry.m132$r8$lambda$gqABM9BMJqxtYs0BZHOA9YY9I();
                int i3 = onNavigationEvent + 117;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return clsM132$r8$lambda$gqABM9BMJqxtYs0BZHOA9YY9I;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return CreditQuizMyPageActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return CreditQuizActivity.class;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 17;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getPressedStateDuration() >> 16)), View.resolveSize(0, 0) + 84, (ViewConfiguration.getPressedStateDuration() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 14186), TextUtils.indexOf("", "") + 19, 8808 - Color.argb(0, 0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 25;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onWarmupCompleted = 5806855186350369523L;
    }
}
