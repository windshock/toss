package im.toss.deeplink.ksp.registry;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.alltab.feature.navigation_mission.NavigationMissionStartActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesAlltabFeatureNavigationMissionKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onNavigationEvent = -8440550679619855318L;

    public static /* synthetic */ Class $r8$lambda$YjVEunnZXjbGRhZ1k6pJL_OH6v0() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$0;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesAlltabFeatureNavigationMissionKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{63536, 63555, 36719, 26684, 22233, 39141, 53752, 25839, 25818, 60406, 15442, 33665, 49523, 18512, 20874, 16245, 11660, 54461, 62137, 23203, 35388, 12695, 5638, 63055, 63162, 40532, 35828, 5617, 21445, 64249, 12074, 45204, 45177, 18180, 16580, 11269, 7313, 41902, 58812, 19365, 30982, 'o', 6416, 59227, 58803, 27993, 47756, 757, 17110}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAlltabFeatureNavigationMissionKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$YjVEunnZXjbGRhZ1k6pJL_OH6v0 = FeaturesAlltabFeatureNavigationMissionKspDeepLinkRegistry.$r8$lambda$YjVEunnZXjbGRhZ1k6pJL_OH6v0();
                int i4 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$YjVEunnZXjbGRhZ1k6pJL_OH6v0;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        Class<NavigationMissionStartActivity> cls;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            cls = NavigationMissionStartActivity.class;
            int i4 = 32 / 0;
        } else {
            cls = NavigationMissionStartActivity.class;
        }
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 17;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 45813), 85 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 19, 8808 - TextUtils.getCapsMode("", 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
