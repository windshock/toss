package im.toss.deeplink.ksp.registry;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.leave.ui.LeaveActivity;
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
public final class FeaturesLeaveKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    /* renamed from: $r8$lambda$eZByMSBY0dSI3R9bvgTm58Du-M4, reason: not valid java name */
    public static /* synthetic */ Class m179$r8$lambda$eZByMSBY0dSI3R9bvgTm58DuM4() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$1();
            throw null;
        }
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i3 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$l2s0sM__2purvpnMRwHcLqOzVfo() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$0();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$0;
    }

    static {
        onExtraCallback();
        int i = onNavigationEvent + 89;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public FeaturesLeaveKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLeaveKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$l2s0sM__2purvpnMRwHcLqOzVfo = FeaturesLeaveKspDeepLinkRegistry.$r8$lambda$l2s0sM__2purvpnMRwHcLqOzVfo();
                int i4 = onExtraCallback + 71;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                }
                return cls$r8$lambda$l2s0sM__2purvpnMRwHcLqOzVfo;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{34542, 13479, 2873, 10537, 34461, 24226, 57257, 5660, 12124, 8419, 30198, 49226, 54557, 35181, 9078, 48086, 31682, 21362, 55672, 5583, 8587}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{22431, 44615, 57333, 47239, 22508, 50242, 2917, 34738, 65069, 47619, 41274, 20964, 1132, 5005, 63418, 10872, 43699, 51602, 3508, 33889, 61690, 48920, 42086, 24226, 1837, 5377, 64048, 10478}, (Process.getThreadPriority(0) + 20) >> 6, objArr2);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesLeaveKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Class clsM179$r8$lambda$eZByMSBY0dSI3R9bvgTm58DuM4 = FeaturesLeaveKspDeepLinkRegistry.m179$r8$lambda$eZByMSBY0dSI3R9bvgTm58DuM4();
                int i4 = onExtraCallback + 27;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return clsM179$r8$lambda$eZByMSBY0dSI3R9bvgTm58DuM4;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return LeaveActivity.class;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return LeaveActivity.class;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 117;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 7;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.resolveSize(0, 0) + 84, 21233 - TextUtils.indexOf("", "", 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, TextUtils.lastIndexOf("", '0', 0, 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static void onExtraCallback() {
        onExtraCallback = 3414914942417375612L;
    }
}
