package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetPublicKeyAlgorithm implements certGetSerial {
    private final onExtraCallbackWithResult onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof certGetPublicKeyAlgorithm) && Intrinsics.areEqual(this.onWarmupCompleted, ((certGetPublicKeyAlgorithm) obj).onWarmupCompleted);
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        return "SerializableGeneratedEvent(eventType=" + this.onWarmupCompleted + ")";
    }

    public interface onExtraCallbackWithResult {

        public static final class onWarmupCompleted implements onExtraCallbackWithResult {
            public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

            private onWarmupCompleted() {
            }
        }

        public static final class IAuthTabCallback implements onExtraCallbackWithResult {
            public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

            private IAuthTabCallback() {
            }
        }

        /* renamed from: o.certGetPublicKeyAlgorithm$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0025onExtraCallbackWithResult implements onExtraCallbackWithResult {
            private final boolean onNavigationEvent;

            public C0025onExtraCallbackWithResult(boolean z) {
                this.onNavigationEvent = z;
            }

            public final boolean onExtraCallback() {
                return this.onNavigationEvent;
            }
        }
    }

    public certGetPublicKeyAlgorithm(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onWarmupCompleted = onextracallbackwithresult;
    }

    public final onExtraCallbackWithResult onExtraCallback() {
        return this.onWarmupCompleted;
    }
}
