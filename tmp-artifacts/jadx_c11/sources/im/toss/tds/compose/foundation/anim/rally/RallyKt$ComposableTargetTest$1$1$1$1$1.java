package im.toss.tds.compose.foundation.anim.rally;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.MaxInterstitialAd;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.formatMsgs;
import o.runOnUiThreadDelayed;
import o.setByteOrder;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RallyKt$ComposableTargetTest$1$1$1$1$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ MaxInterstitialAd $target;
    final /* synthetic */ runOnUiThreadDelayed $timeline;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RallyKt$ComposableTargetTest$1$1$1$1$1(runOnUiThreadDelayed runonuithreaddelayed, MaxInterstitialAd maxInterstitialAd, access13800<? super RallyKt$ComposableTargetTest$1$1$1$1$1> access13800Var) {
        super(2, access13800Var);
        this.$timeline = runonuithreaddelayed;
        this.$target = maxInterstitialAd;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MaxInterstitialAd maxInterstitialAd) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(maxInterstitialAd);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitIAuthTabCallback;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RallyKt$ComposableTargetTest$1$1$1$1$1 rallyKt$ComposableTargetTest$1$1$1$1$1 = new RallyKt$ComposableTargetTest$1$1$1$1$1(this.$timeline, this.$target, access13800Var);
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return rallyKt$ComposableTargetTest$1$1$1$1$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return objInvokeSuspend;
    }

    private static final Unit IAuthTabCallback(MaxInterstitialAd maxInterstitialAd) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        maxInterstitialAd.onExtraCallback(Float.valueOf(0.5f));
        Float fValueOf = Float.valueOf(2.0f);
        maxInterstitialAd.asBinder(fValueOf);
        maxInterstitialAd.IAuthTabCallbackStub(fValueOf);
        maxInterstitialAd.onExtraCallback(setByteOrder.Companion.asInterface());
        return Unit.INSTANCE;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            this.$timeline.receiveFile();
            this.label = 1;
            if (formatMsgs.onWarmupCompleted(1500L, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        this.$target.onNavigationEvent(new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.RallyKt$ComposableTargetTest$1$1$1$1$1$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnWarmupCompleted = RallyKt$ComposableTargetTest$1$1$1$1$1.onWarmupCompleted((MaxInterstitialAd) obj2);
                int i7 = onNavigationEvent + 105;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 45 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
