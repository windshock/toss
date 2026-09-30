package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class vbt {
    public /* synthetic */ vbt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private vbt() {
    }

    public static final class onExtraCallbackWithResult extends vbt {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        private onExtraCallbackWithResult() {
            super(null);
        }
    }

    public static final class onNavigationEvent extends vbt {
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

        private onNavigationEvent() {
            super(null);
        }
    }

    public String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
