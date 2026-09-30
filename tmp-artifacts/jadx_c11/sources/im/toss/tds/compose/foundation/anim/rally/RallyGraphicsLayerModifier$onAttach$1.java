package im.toss.tds.compose.foundation.anim.rally;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final /* synthetic */ class RallyGraphicsLayerModifier$onAttach$1 extends FunctionReferenceImpl implements Function0<Unit> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    RallyGraphicsLayerModifier$onAttach$1(Object obj) {
        super(0, obj, RallyGraphicsLayerModifier.class, "invalidateLayerBlock", "invalidateLayerBlock()V", 0);
    }

    public /* synthetic */ Object invoke() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent();
        if (i3 == 0) {
            unit = Unit.INSTANCE;
            int i4 = 44 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i5 = onExtraCallbackWithResult + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ((RallyGraphicsLayerModifier) ((CallableReference) this).receiver).IAuthTabCallbackDefault();
        int i4 = onExtraCallback + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
