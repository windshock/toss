package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class getAuthenticatedAttributes {
    public /* synthetic */ getAuthenticatedAttributes(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onNavigationEvent extends getAuthenticatedAttributes {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof onNavigationEvent);
        }

        public int hashCode() {
            return 922000381;
        }

        public String toString() {
            return "Idle";
        }

        private onNavigationEvent() {
            super(null);
        }
    }

    private getAuthenticatedAttributes() {
    }

    public static final class onWarmupCompleted extends getAuthenticatedAttributes {
        private final createAdSizeApi onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, ((onWarmupCompleted) obj).onNavigationEvent);
        }

        public int hashCode() {
            return this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "Success(nextLayout=" + this.onNavigationEvent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull createAdSizeApi createadsizeapi) {
            super(null);
            Intrinsics.checkNotNullParameter(createadsizeapi, "");
            this.onNavigationEvent = createadsizeapi;
        }

        public final createAdSizeApi onNavigationEvent() {
            return this.onNavigationEvent;
        }
    }

    public static final class onExtraCallbackWithResult extends getAuthenticatedAttributes {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof onExtraCallbackWithResult);
        }

        public int hashCode() {
            return -1753351999;
        }

        public String toString() {
            return "Failure";
        }

        private onExtraCallbackWithResult() {
            super(null);
        }
    }
}
