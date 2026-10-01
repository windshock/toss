package im.toss.tds.compose.foundation.anim.rally;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final /* synthetic */ class RallyGraphicsLayerModifier$onReset$1 extends FunctionReferenceImpl implements Function0<Unit> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    RallyGraphicsLayerModifier$onReset$1(Object obj) {
        super(0, obj, RallyGraphicsLayerModifier.class, "invalidateLayerBlock", "invalidateLayerBlock()V", 0);
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ((RallyGraphicsLayerModifier) ((CallableReference) this).receiver).IAuthTabCallbackDefault();
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
