package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AUTextView;
import o.EndMotionInteraction;
import o.adInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EndMotionInteraction {
    private static wie2 IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.core.serialization.JsonKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = EndMotionInteraction.IAuthTabCallback((adInfo) obj);
            if (i3 == 0) {
                int i4 = 17 / 0;
            }
            int i5 = onNavigationEvent + 23;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }
    }, 1, (Object) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(adinfo);
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 41;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final wie2 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        wie2 wie2Var = IAuthTabCallback;
        int i4 = i3 + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return wie2Var;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(adInfo adinfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        adinfo.onNavigationEvent(false);
        hfzb hfzbVar = new hfzb();
        hfzbVar.IAuthTabCallback(tnycx.onWarmupCompleted(Reflection.getOrCreateKotlinClass(Object.class), GetMotionInteractionState.onExtraCallback));
        adinfo.onNavigationEvent(hfzbVar.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return unit;
    }

    public static final void onWarmupCompleted(@NotNull wie2 wie2Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(wie2Var, "");
            IAuthTabCallback = wie2Var;
        } else {
            Intrinsics.checkNotNullParameter(wie2Var, "");
            IAuthTabCallback = wie2Var;
            throw null;
        }
    }
}
