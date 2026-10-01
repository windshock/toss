package viva.republica.toss.main.more.notification.adapter.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.HSFJSONUtils;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class RecentNotificationSectionItem {
    public /* synthetic */ RecentNotificationSectionItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RecentNotificationSectionItem() {
    }

    public static final class NotificationEnableSettingHeader extends RecentNotificationSectionItem {
        public static final NotificationEnableSettingHeader IAuthTabCallback = new NotificationEnableSettingHeader();

        private NotificationEnableSettingHeader() {
            super(null);
        }
    }

    public static final class NotificationHeader extends RecentNotificationSectionItem {
        private final String onExtraCallback;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationHeader)) {
                return false;
            }
            NotificationHeader notificationHeader = (NotificationHeader) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, notificationHeader.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, notificationHeader.onExtraCallback);
        }

        public int hashCode() {
            int iHashCode = this.onWarmupCompleted.hashCode();
            String str = this.onExtraCallback;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NotificationHeader(title=" + this.onWarmupCompleted + ", description=" + this.onExtraCallback + ")";
        }

        public final String onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public final String onWarmupCompleted() {
            return this.onExtraCallback;
        }
    }

    public static final class NotificationHeaderV2 extends RecentNotificationSectionItem {
        public static final NotificationHeaderV2 onNavigationEvent = new NotificationHeaderV2();

        private NotificationHeaderV2() {
            super(null);
        }
    }

    public static final class RecentNotificationEmpty extends RecentNotificationSectionItem {
        public static final RecentNotificationEmpty onExtraCallback = new RecentNotificationEmpty();

        private RecentNotificationEmpty() {
            super(null);
        }
    }

    public static final class RecentNotificationTitle extends RecentNotificationSectionItem {
        private final String IAuthTabCallback;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentNotificationTitle)) {
                return false;
            }
            RecentNotificationTitle recentNotificationTitle = (RecentNotificationTitle) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, recentNotificationTitle.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, recentNotificationTitle.IAuthTabCallback);
        }

        public int hashCode() {
            return (this.onExtraCallbackWithResult.hashCode() * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return "RecentNotificationTitle(title=" + this.onExtraCallbackWithResult + ", description=" + this.IAuthTabCallback + ")";
        }

        public final String onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final String onNavigationEvent() {
            return this.IAuthTabCallback;
        }
    }

    public static final class RecentNotificationMore extends RecentNotificationSectionItem {
        private final String IAuthTabCallback;
        private final Function0<Unit> onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentNotificationMore)) {
                return false;
            }
            RecentNotificationMore recentNotificationMore = (RecentNotificationMore) obj;
            return Intrinsics.areEqual(this.IAuthTabCallback, recentNotificationMore.IAuthTabCallback) && Intrinsics.areEqual(this.onWarmupCompleted, recentNotificationMore.onWarmupCompleted);
        }

        public int hashCode() {
            return (this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            return "RecentNotificationMore(title=" + this.IAuthTabCallback + ", onClickHook=" + this.onWarmupCompleted + ")";
        }

        public final String onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public final Function0<Unit> onExtraCallback() {
            return this.onWarmupCompleted;
        }
    }

    public static final class NotificationContent extends RecentNotificationSectionItem {
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationContent)) {
                return false;
            }
            NotificationContent notificationContent = (NotificationContent) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, notificationContent.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, notificationContent.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, notificationContent.onNavigationEvent);
        }

        public int hashCode() {
            return (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "NotificationContent(iconUrl=" + this.onExtraCallbackWithResult + ", title=" + this.onExtraCallback + ", description=" + this.onNavigationEvent + ")";
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final String onExtraCallback() {
            return this.onExtraCallback;
        }

        public final String onNavigationEvent() {
            return this.onNavigationEvent;
        }
    }

    public static final class PushRequirementFooter extends RecentNotificationSectionItem {
        public static final int onExtraCallbackWithResult = HSFJSONUtils.onWarmupCompleted;
        private final HSFJSONUtils onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PushRequirementFooter) && Intrinsics.areEqual(this.onNavigationEvent, ((PushRequirementFooter) obj).onNavigationEvent);
        }

        public int hashCode() {
            return this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "PushRequirementFooter(notificationRequirements=" + this.onNavigationEvent + ")";
        }

        public final HSFJSONUtils IAuthTabCallback() {
            return this.onNavigationEvent;
        }
    }
}
