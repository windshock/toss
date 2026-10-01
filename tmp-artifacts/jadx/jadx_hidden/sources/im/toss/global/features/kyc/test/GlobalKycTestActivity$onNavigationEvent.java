package im.toss.global.features.kyc.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: classes.dex */
final /* synthetic */ class GlobalKycTestActivity$onNavigationEvent extends FunctionReferenceImpl implements Function0<Unit> {
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(GlobalKycTestActivity$onNavigationEvent.class);

    public GlobalKycTestActivity$onNavigationEvent(Object obj) {
        super(0, obj, GlobalKycTestActivity.class, "finish", "finish()V", 0);
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 23) & 1;
        onWarmupCompleted();
        if (i5 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i6 = onExtraCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5226);
        int i7 = (~iOnWarmupCompleted2) & i6;
        int i8 = (~i6) & iOnWarmupCompleted2;
        if (((((i8 & i7) | (i7 ^ i8)) >> 31) & 1) != 0) {
            int i9 = 58 / 0;
        }
        return unit2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3887);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 26) & 1) == 0) {
            ((GlobalKycTestActivity) ((CallableReference) this).receiver).finish();
            throw null;
        }
        ((GlobalKycTestActivity) ((CallableReference) this).receiver).finish();
        int i4 = onExtraCallback;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
        if ((((((~i4) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i4)) >> 1) & 1) != 0) {
            int i5 = 54 / 0;
        }
    }
}
