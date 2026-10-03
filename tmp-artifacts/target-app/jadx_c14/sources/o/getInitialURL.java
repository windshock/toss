package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getInitialURL {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final long henemBoxId;
    private final List<Long> inviteeUserNos;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getInitialURL)) {
            int i4 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getInitialURL getinitialurl = (getInitialURL) obj;
        if (this.henemBoxId != getinitialurl.henemBoxId) {
            int i6 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.inviteeUserNos, getinitialurl.inviteeUserNos)) {
            return true;
        }
        int i7 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.henemBoxId) * 31) + this.inviteeUserNos.hashCode();
        int i4 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SavingTogetherInvitationRequest(henemBoxId=" + this.henemBoxId + ", inviteeUserNos=" + this.inviteeUserNos + ")";
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getInitialURL(long j, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.henemBoxId = j;
        this.inviteeUserNos = list;
    }
}
