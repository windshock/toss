package im.toss.deeplink.ksp.registry;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.home.feature.to_do.HomeToDoActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesHomeV2FeatureTo_doKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 1025675634326423452L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$DTDnT7BDtSupfDc9oBwRIogEdnI() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesHomeV2FeatureTo_doKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{9013, 23059, 13836, 56896, 9030, 59126, 20316, 60309, 53511, 62647, 23811, 63939, 51142, 64313, 27523, 50271, 62877, 51500, 31105, 53845, 59930, 57335, 29763, 8413, 38929, 11692}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesHomeV2FeatureTo_doKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$DTDnT7BDtSupfDc9oBwRIogEdnI = FeaturesHomeV2FeatureTo_doKspDeepLinkRegistry.$r8$lambda$DTDnT7BDtSupfDc9oBwRIogEdnI();
                if (i3 != 0) {
                    int i4 = 57 / 0;
                }
                return cls$r8$lambda$DTDnT7BDtSupfDc9oBwRIogEdnI;
            }
        }, CollectionsKt.listOf(TargetRegion.ALL)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return HomeToDoActivity.class;
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
        int i3 = $10 + 119;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45812), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 85, 21233 - View.MeasureSpec.getSize(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 14185), TextUtils.indexOf("", "", 0) + 19, TextUtils.lastIndexOf("", '0') + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
}
