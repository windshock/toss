package im.toss.deeplink.ksp.registry;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkBaseRegistry;
import im.toss.deeplink.DeeplinkEntry;
import im.toss.deeplink.TargetRegion;
import im.toss.deeplink.annotation.DeepLinkRegistry;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.confirmCheckedPositionsById;
import o.getWrite;

@DeepLinkRegistry
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FeaturesVerifyTeensmanualselfieImplKspDeepLinkRegistry extends DeepLinkBaseRegistry {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    /* renamed from: $r8$lambda$TZ4-5xdcDHUn7MCUwSoO-cx3Tic, reason: not valid java name */
    public static /* synthetic */ Class m255$r8$lambda$TZ45xdcDHUn7MCUwSoOcx3Tic() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            _init_$lambda$0();
            throw null;
        }
        Class cls_init_$lambda$0 = _init_$lambda$0();
        int i3 = IAuthTabCallback + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return cls_init_$lambda$0;
    }

    static {
        onNavigationEvent();
        int i = onNavigationEvent + 97;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeaturesVerifyTeensmanualselfieImplKspDeepLinkRegistry() throws Throwable {
        Object[] objArr = new Object[1];
        a(new char[]{46073, 45962, 56175, 22624, 62796, 55091, 48739, 62408, 19065, 59259, 23864, 50461, 43098, 17439, 53539, 64297, 39462, 30248, 49921, 59757, 33837, 24666, 52529, 40791, 63007, 4632, 49109, 37538, 57508, 3574, 43465, 32906, 53959, 16340, 39905}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
        super(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), new DeeplinkEntry(new Function0() { // from class: im.toss.deeplink.ksp.registry.FeaturesVerifyTeensmanualselfieImplKspDeepLinkRegistry$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Class clsM255$r8$lambda$TZ45xdcDHUn7MCUwSoOcx3Tic = FeaturesVerifyTeensmanualselfieImplKspDeepLinkRegistry.m255$r8$lambda$TZ45xdcDHUn7MCUwSoOcx3Tic();
                int i4 = IAuthTabCallback + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return clsM255$r8$lambda$TZ45xdcDHUn7MCUwSoOcx3Tic;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, CollectionsKt.listOf(TargetRegion.KR)))));
    }

    private static final Class _init_$lambda$0() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return confirmCheckedPositionsById.class;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 1;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 57;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45811), 84 - ((Process.getThreadPriority(0) + 20) >> 6), 21233 - Drawable.resolveOpacity(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 14185), 19 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0, 0) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static void onNavigationEvent() {
        onExtraCallback = -3805527329448331146L;
    }
}
