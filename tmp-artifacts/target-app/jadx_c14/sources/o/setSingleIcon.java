package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface setSingleIcon {

    public static final class onNavigationEvent implements setSingleIcon {
        private final AdSDKNotificationListener IAuthTabCallback;
        private final getAdExperienceType onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return this.onExtraCallback == onnavigationevent.onExtraCallback && this.IAuthTabCallback == onnavigationevent.IAuthTabCallback;
        }

        public int hashCode() {
            return (this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return "PullUp(initialSize=" + this.onExtraCallback + ", target=" + this.IAuthTabCallback + ")";
        }

        public onNavigationEvent(@NotNull getAdExperienceType getadexperiencetype, @NotNull AdSDKNotificationListener adSDKNotificationListener) {
            Intrinsics.checkNotNullParameter(getadexperiencetype, "");
            Intrinsics.checkNotNullParameter(adSDKNotificationListener, "");
            this.onExtraCallback = getadexperiencetype;
            this.IAuthTabCallback = adSDKNotificationListener;
        }

        public final AdSDKNotificationListener onExtraCallback() {
            return this.IAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted implements setSingleIcon {
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onWarmupCompleted) && Intrinsics.areEqual(this.onWarmupCompleted, ((onWarmupCompleted) obj).onWarmupCompleted);
        }

        public int hashCode() {
            return this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            return "Fallback(reason=" + this.onWarmupCompleted + ")";
        }

        public onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onWarmupCompleted() {
            return this.onWarmupCompleted;
        }
    }
}
