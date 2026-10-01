package im.toss.features.loan.home;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanAllAppliedListActivity$IAuthTabCallbackDefault {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanAllAppliedListActivity$IAuthTabCallbackDefault() {
        String str = null;
        this(str, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof LoanAllAppliedListActivity$IAuthTabCallbackDefault)) {
            int i3 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        LoanAllAppliedListActivity$IAuthTabCallbackDefault loanAllAppliedListActivity$IAuthTabCallbackDefault = (LoanAllAppliedListActivity$IAuthTabCallbackDefault) obj;
        if (Intrinsics.areEqual(this.onNavigationEvent, loanAllAppliedListActivity$IAuthTabCallbackDefault.onNavigationEvent)) {
            return Intrinsics.areEqual(this.onWarmupCompleted, loanAllAppliedListActivity$IAuthTabCallbackDefault.onWarmupCompleted);
        }
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        String str = this.onWarmupCompleted;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GroupedAppliedLoanHeader(groupName=" + this.onNavigationEvent + ", remainDateText=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public LoanAllAppliedListActivity$IAuthTabCallbackDefault(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanAllAppliedListActivity$IAuthTabCallbackDefault(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 45;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 1;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            str2 = null;
        }
        this(str, str2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i3 + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
