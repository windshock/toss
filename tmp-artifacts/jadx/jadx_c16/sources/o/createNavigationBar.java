package o;

import com.google.gson.annotations.SerializedName;
import im.toss.features.account.impl.model.TossAccount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class createNavigationBar implements TitleBarDisclaimerClickPoint {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("withdrawAccount")
    private TossAccount withdrawAccount;

    /* JADX WARN: Illegal instructions before constructor call */
    public createNavigationBar() {
        TossAccount tossAccount = null;
        this(tossAccount, 1, tossAccount);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof createNavigationBar) {
            return Intrinsics.areEqual(this.withdrawAccount, ((createNavigationBar) obj).withdrawAccount);
        }
        int i4 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        TossAccount tossAccount = this.withdrawAccount;
        if (tossAccount == null) {
            return 0;
        }
        int iHashCode = tossAccount.hashCode();
        int i3 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawInfoDataDto(withdrawAccount=" + this.withdrawAccount + ")";
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public createNavigationBar(@Nullable TossAccount tossAccount) {
        this.withdrawAccount = tossAccount;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ createNavigationBar(TossAccount tossAccount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            tossAccount = null;
        }
        this(tossAccount);
    }

    public TossAccount onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.withdrawAccount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
