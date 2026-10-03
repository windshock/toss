package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class hasSubDirFile {
    private final onExtraCallbackWithResult IAuthTabCallback;
    private final long onNavigationEvent;
    private final onWarmupCompleted onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasSubDirFile)) {
            return false;
        }
        hasSubDirFile hassubdirfile = (hasSubDirFile) obj;
        return this.onNavigationEvent == hassubdirfile.onNavigationEvent && Intrinsics.areEqual(this.onWarmupCompleted, hassubdirfile.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, hassubdirfile.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.onNavigationEvent);
        onWarmupCompleted onwarmupcompleted = this.onWarmupCompleted;
        int iHashCode2 = onwarmupcompleted == null ? 0 : onwarmupcompleted.hashCode();
        onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
        return (((iHashCode * 31) + iHashCode2) * 31) + (onextracallbackwithresult != null ? onextracallbackwithresult.hashCode() : 0);
    }

    public String toString() {
        return "TossMoneyHeaderRow(amount=" + this.onNavigationEvent + ", virtualAccountRow=" + this.onWarmupCompleted + ", cardRow=" + this.IAuthTabCallback + ")";
    }

    public hasSubDirFile(long j, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        this.onNavigationEvent = j;
        this.onWarmupCompleted = onwarmupcompleted;
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    public /* synthetic */ hasSubDirFile(long j, onWarmupCompleted onwarmupcompleted, onExtraCallbackWithResult onextracallbackwithresult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : onwarmupcompleted, (i & 4) != 0 ? null : onextracallbackwithresult);
    }

    public final long onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final onWarmupCompleted onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final onExtraCallbackWithResult onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public static final class onWarmupCompleted {
        private final String IAuthTabCallback;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent);
        }

        public int hashCode() {
            return (this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "TossMoneyVirtualAccountRow(virtualAccountNumber=" + this.IAuthTabCallback + ", bankName=" + this.onNavigationEvent + ")";
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback = str;
            this.onNavigationEvent = str2;
        }

        public final String onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public final String onExtraCallback() {
            return this.onNavigationEvent;
        }
    }

    public static final class onExtraCallbackWithResult {
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent);
        }

        public int hashCode() {
            return (this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            return "TossMoneyCardRow(cardDesign=" + this.onWarmupCompleted + ", cardScheme=" + this.onNavigationEvent + ")";
        }

        public onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.onNavigationEvent = str2;
        }

        public final String onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }
    }
}
