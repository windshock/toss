package im.toss.deeplink.ksp.registry;

import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.allservices.SchemeSupportActivity;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesAllservicesKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Class $r8$lambda$172Usf5n9LgGE8VNTzfFKZRTSAw() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return _init_$lambda$0();
        }
        _init_$lambda$0();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        int i = IAuthTabCallback + 61;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesAllservicesKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{27777, 58954, 24548, 411, 27890, 25952, 22826, 35811, 24975, 30437, 19377, 38513, 30218, 30759, 32381, 42145, 17542, 19948, 28838, 45946, 22814, 24439, 25406, 49593, 12174, 8430, 5536, 52326, 15368, 12910, 2102}, -TextUtils.lastIndexOf("", '0'), objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesAllservicesKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 109;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    FeaturesAllservicesKspDeepLinkRegistry.$r8$lambda$172Usf5n9LgGE8VNTzfFKZRTSAw();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Class cls$r8$lambda$172Usf5n9LgGE8VNTzfFKZRTSAw = FeaturesAllservicesKspDeepLinkRegistry.$r8$lambda$172Usf5n9LgGE8VNTzfFKZRTSAw();
                int i3 = onNavigationEvent + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return cls$r8$lambda$172Usf5n9LgGE8VNTzfFKZRTSAw;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return SchemeSupportActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 121;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.getMode(0)), 84 - (Process.myPid() >> 22), MotionEvent.axisFromString("") + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14185), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18, 8808 - ExpandableListView.getPackedPositionGroup(0L), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 101;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 87 / 0;
            objArr[0] = str;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = -5241120612143335341L;
    }
}
