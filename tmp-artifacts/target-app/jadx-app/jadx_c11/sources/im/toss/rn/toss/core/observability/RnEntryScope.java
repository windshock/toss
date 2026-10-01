package im.toss.rn.toss.core.observability;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnEntryScope extends AbstractCoroutineContextElement {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    public static final Key onExtraCallbackWithResult = new Key(null);
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Object IAuthTabCallback;

    static {
        int i = onWarmupCompleted + 43;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnEntryScope(@NotNull Object obj) {
        super(onExtraCallbackWithResult);
        Intrinsics.checkNotNullParameter(obj, "");
        this.IAuthTabCallback = obj;
    }

    public final Object IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.IAuthTabCallback;
        int i5 = i2 + 23;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return obj;
    }

    public static final class Key implements CoroutineContext.onExtraCallback<RnEntryScope> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }
}
