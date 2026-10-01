package o;

import im.toss.features.home.core.local.model.dst.element.DividerLocal;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InterceptorChain extends onReceiveCdp<DividerLocal> {
    private static int IAuthTabCallback = 1;
    public static final InterceptorChain onExtraCallback = new InterceptorChain();
    private static int onExtraCallbackWithResult;

    static {
        int i = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private InterceptorChain() {
        super(Reflection.getOrCreateKotlinClass(DividerLocal.class), "lineType", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("SOLID", Reflection.getOrCreateKotlinClass(DividerLocal.Solid.class)), getWrite.IAuthTabCallback("LINEAR_GRADIENT", Reflection.getOrCreateKotlinClass(DividerLocal.LinearGradient.class)), getWrite.IAuthTabCallback("TEXT_LINEAR_GRADIENT", Reflection.getOrCreateKotlinClass(DividerLocal.TextLinearGradient.class))}), (String) null, 8, (DefaultConstructorMarker) null);
    }
}
