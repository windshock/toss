package im.toss.tds.compose.foundation.anim.rally;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final /* synthetic */ class RallyGraphicsLayerModifier$updateTarget$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    RallyGraphicsLayerModifier$updateTarget$1$1(Object obj) {
        super(0, obj, RallyGraphicsLayerModifier.class, "invalidateLayerBlock", "invalidateLayerBlock()V", 0);
    }

    public /* synthetic */ Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return unit;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ((RallyGraphicsLayerModifier) ((CallableReference) this).receiver).IAuthTabCallbackDefault();
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
