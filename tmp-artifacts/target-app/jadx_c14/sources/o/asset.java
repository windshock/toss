package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.SignInResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class asset {
    public /* synthetic */ asset(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onNavigationEvent extends asset {
        private final String IAuthTabCallback;
        private final String onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final SignInResponse onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult && Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback);
        }

        public int hashCode() {
            return (((((Long.hashCode(this.onExtraCallbackWithResult) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            return "RequestPostProcess(guestSessionId=" + this.onExtraCallbackWithResult + ", signInResponse=" + this.onWarmupCompleted + ", loginPasswordHash=" + this.IAuthTabCallback + ", authPasswordHash=" + this.onExtraCallback + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(long j, @NotNull SignInResponse signInResponse, @NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(signInResponse, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult = j;
            this.onWarmupCompleted = signInResponse;
            this.IAuthTabCallback = str;
            this.onExtraCallback = str2;
        }

        public final long onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final SignInResponse onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.IAuthTabCallback;
        }

        public final String onWarmupCompleted() {
            return this.onExtraCallback;
        }
    }

    private asset() {
    }

    public static final class onExtraCallbackWithResult extends asset {
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        private onExtraCallbackWithResult() {
            super(null);
        }
    }

    public static final class onWarmupCompleted extends asset {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();

        private onWarmupCompleted() {
            super(null);
        }
    }
}
