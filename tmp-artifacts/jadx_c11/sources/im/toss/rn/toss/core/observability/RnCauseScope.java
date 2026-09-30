package im.toss.rn.toss.core.observability;

import im.toss.observability.instrumentation.rn.RnCause;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnCauseScope extends AbstractCoroutineContextElement {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    public static final Key onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final RnCause onNavigationEvent;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        onExtraCallbackWithResult = new Key(defaultConstructorMarker);
        int i = IAuthTabCallback + 77;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class Key implements CoroutineContext.onExtraCallback<RnCauseScope> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnCauseScope(@NotNull RnCause rnCause) {
        super(onExtraCallbackWithResult);
        Intrinsics.checkNotNullParameter(rnCause, "");
        this.onNavigationEvent = rnCause;
    }

    public final RnCause onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        RnCause rnCause = this.onNavigationEvent;
        int i4 = i3 + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return rnCause;
        }
        throw null;
    }
}
