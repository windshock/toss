package o;

import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDatagroupHash {
    private final onWarmupCompleted IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onWarmupCompleted;

    public static /* synthetic */ getDatagroupHash onNavigationEvent(getDatagroupHash getdatagrouphash, String str, String str2, String str3, String str4, boolean z, onWarmupCompleted onwarmupcompleted, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getdatagrouphash.onExtraCallbackWithResult;
        }
        if ((i & 2) != 0) {
            str2 = getdatagrouphash.onWarmupCompleted;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = getdatagrouphash.onExtraCallback;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = getdatagrouphash.IAuthTabCallbackDefault;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = getdatagrouphash.onNavigationEvent;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            onwarmupcompleted = getdatagrouphash.IAuthTabCallback;
        }
        return getdatagrouphash.onWarmupCompleted(str, str5, str6, str7, z2, onwarmupcompleted);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDatagroupHash)) {
            return false;
        }
        getDatagroupHash getdatagrouphash = (getDatagroupHash) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, getdatagrouphash.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onWarmupCompleted, getdatagrouphash.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, getdatagrouphash.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, getdatagrouphash.IAuthTabCallbackDefault) && this.onNavigationEvent == getdatagrouphash.onNavigationEvent && Intrinsics.areEqual(this.IAuthTabCallback, getdatagrouphash.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        String str = this.onExtraCallback;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode5 = Boolean.hashCode(this.onNavigationEvent);
        onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (onwarmupcompleted != null ? onwarmupcompleted.hashCode() : 0);
    }

    public final getDatagroupHash onWarmupCompleted(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, boolean z, @Nullable onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new getDatagroupHash(str, str2, str3, str4, z, onwarmupcompleted);
    }

    public String toString() {
        return "SelectOption(imageUrl=" + this.onExtraCallbackWithResult + ", title=" + this.onWarmupCompleted + ", subtitle=" + this.onExtraCallback + ", type=" + this.IAuthTabCallbackDefault + ", isSelected=" + this.onNavigationEvent + ", badgeOption=" + this.IAuthTabCallback + ")";
    }

    public getDatagroupHash(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, boolean z, @Nullable onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallback = str3;
        this.IAuthTabCallbackDefault = str4;
        this.onNavigationEvent = z;
        this.IAuthTabCallback = onwarmupcompleted;
    }

    public /* synthetic */ getDatagroupHash(String str, String str2, String str3, String str4, boolean z, onWarmupCompleted onwarmupcompleted, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : onwarmupcompleted);
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallbackDefault;
    }

    public final boolean IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    public final onWarmupCompleted onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public static final class onWarmupCompleted {
        private final String onExtraCallbackWithResult;
        private final TdsBadgeV1View.onExtraCallbackWithResult onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted);
        }

        public int hashCode() {
            return (this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            return "BadgeOption(title=" + this.onExtraCallbackWithResult + ", badgeColor=" + this.onWarmupCompleted + ")";
        }

        public onWarmupCompleted(@NotNull String str, @NotNull TdsBadgeV1View.onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = onextracallbackwithresult;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        public final TdsBadgeV1View.onExtraCallbackWithResult onExtraCallback() {
            return this.onWarmupCompleted;
        }
    }
}
