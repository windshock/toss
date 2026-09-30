package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import im.toss.features.transfer.share.ui.list.TransferShareListActivity;
import im.toss.features.transfer.share.ui.receive.TransferShareReceiveActivity;
import im.toss.features.transfer.share.ui.status.TransferShareStatusActivity;
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
public final class FeaturesTransferShareKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Class $r8$lambda$09mSuef8UnsM7zdAAZK1aUrJxRY() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Class cls_init_$lambda$1 = _init_$lambda$1();
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return cls_init_$lambda$1;
        }
        throw null;
    }

    public static /* synthetic */ Class $r8$lambda$EgY8BebqVJEo2aY0SwIcoC79FEc() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            _init_$lambda$0();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$0;
    }

    public static /* synthetic */ Class $r8$lambda$GDD3kvzEocAm2hr6A6to9ezEsGE() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            _init_$lambda$2();
            obj.hashCode();
            throw null;
        }
        Class cls_init_$lambda$2 = _init_$lambda$2();
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return cls_init_$lambda$2;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        int i = IAuthTabCallback + 67;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
    }

    public FeaturesTransferShareKspDeepLinkRegistry() throws Throwable {
        Function0 function0 = new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferShareKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$EgY8BebqVJEo2aY0SwIcoC79FEc = FeaturesTransferShareKspDeepLinkRegistry.$r8$lambda$EgY8BebqVJEo2aY0SwIcoC79FEc();
                int i4 = onExtraCallback + 33;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return cls$r8$lambda$EgY8BebqVJEo2aY0SwIcoC79FEc;
            }
        };
        TargetRegion targetRegion = TargetRegion.KR;
        Object[] objArr = new Object[1];
        a(new char[]{50651, 50600, 3148, 50000, 50660, 23366, 53669, 49147, 63501, 52777, 34655, 31241, 48864, 35291, 16755, 14345, 32067, 19319, 3225, 63212, 13112, 1743, 52801, 46364, 61888, 49342, 34856, 29611, 46193, 33396, 19393, 12738, 27349, 48596, 5478, 52321, 10397, 32700, 53446, 35537, 61288, 14620, 37561, 18734, 44506, 62703, 23579, 1835, 25531, 46668, 8171, 50582}, ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(function0, CollectionsKt.listOf(targetRegion)));
        Object[] objArr2 = new Object[1];
        a(new char[]{44549, 44662, 22345, 38997, 63475, 26961, 61848, 40902, 37843, 38188, 46408, 23092, 54590, 53982, 29540, 6196, 5789, 4210, 16014, 54993, 22758, 24010, 64598, 38177, 39454, 39867, 47679, 21398, 57263, 55665, 31190, 4607, 267, 59089, 10097, 60508, 17219, 9401, 58065, 43756, 33971, 25117, 41124, 26882, 50692, 45042, 28174}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferShareKspDeepLinkRegistry$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$09mSuef8UnsM7zdAAZK1aUrJxRY = FeaturesTransferShareKspDeepLinkRegistry.$r8$lambda$09mSuef8UnsM7zdAAZK1aUrJxRY();
                int i4 = onNavigationEvent + 37;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return cls$r8$lambda$09mSuef8UnsM7zdAAZK1aUrJxRY;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)));
        Object[] objArr3 = new Object[1];
        a(new char[]{2249, 2234, 1803, 51223, 28922, 61016, 30542, 6416, 13599, 50542, 12865, 56546, 29682, 33436, 62573, 40674, 45137, 16432, 47495, 20487, 65066, 3464, 31583, 5111, 15570, 52217, 15670, 54592, 31075, 35123, 65247, 38697, 42951, 46739, 41080, 27274, 58767, 29947, 26072, 11322, 8830, 12878, 10159, 61381, 24788, 65461}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, objArr3);
        super(access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesTransferShareKspDeepLinkRegistry$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Class cls$r8$lambda$GDD3kvzEocAm2hr6A6to9ezEsGE = FeaturesTransferShareKspDeepLinkRegistry.$r8$lambda$GDD3kvzEocAm2hr6A6to9ezEsGE();
                int i4 = onNavigationEvent + 107;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return cls$r8$lambda$GDD3kvzEocAm2hr6A6to9ezEsGE;
                }
                throw null;
            }
        }, CollectionsKt.listOf(targetRegion)))}));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return TransferShareListActivity.class;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Class _init_$lambda$1() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
        return TransferShareReceiveActivity.class;
    }

    private static final Class _init_$lambda$2() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return TransferShareStatusActivity.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.makeMeasureSpec(0, 0)), (Process.myTid() >> 22) + 84, View.resolveSize(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, 8808 - Color.blue(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 41;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = -1031207712870058907L;
    }
}
