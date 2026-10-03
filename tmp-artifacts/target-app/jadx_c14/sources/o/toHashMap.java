package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.AccountBalanceInfo;
import viva.republica.toss.network.model.transfer.MyAccountInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toHashMap {
    private final MyAccountInfo IAuthTabCallback;
    private AccountBalanceInfo onWarmupCompleted;

    public static /* synthetic */ toHashMap onNavigationEvent(toHashMap tohashmap, AccountBalanceInfo accountBalanceInfo, MyAccountInfo myAccountInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            accountBalanceInfo = tohashmap.onWarmupCompleted;
        }
        if ((i & 2) != 0) {
            myAccountInfo = tohashmap.IAuthTabCallback;
        }
        return tohashmap.onExtraCallbackWithResult(accountBalanceInfo, myAccountInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toHashMap)) {
            return false;
        }
        toHashMap tohashmap = (toHashMap) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, tohashmap.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, tohashmap.IAuthTabCallback);
    }

    public int hashCode() {
        return (this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode();
    }

    public final toHashMap onExtraCallbackWithResult(@NotNull AccountBalanceInfo accountBalanceInfo, @NotNull MyAccountInfo myAccountInfo) {
        Intrinsics.checkNotNullParameter(accountBalanceInfo, "");
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        return new toHashMap(accountBalanceInfo, myAccountInfo);
    }

    public String toString() {
        return "WithdrawAccountModel(accountBalanceInfo=" + this.onWarmupCompleted + ", account=" + this.IAuthTabCallback + ")";
    }

    public toHashMap(@NotNull AccountBalanceInfo accountBalanceInfo, @NotNull MyAccountInfo myAccountInfo) {
        Intrinsics.checkNotNullParameter(accountBalanceInfo, "");
        Intrinsics.checkNotNullParameter(myAccountInfo, "");
        this.onWarmupCompleted = accountBalanceInfo;
        this.IAuthTabCallback = myAccountInfo;
    }

    public final void IAuthTabCallback(@NotNull AccountBalanceInfo accountBalanceInfo) {
        Intrinsics.checkNotNullParameter(accountBalanceInfo, "");
        this.onWarmupCompleted = accountBalanceInfo;
    }

    public final AccountBalanceInfo onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final MyAccountInfo IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final String onExtraCallback() {
        return this.IAuthTabCallback.onExtraCallback();
    }

    public final int onWarmupCompleted() {
        return this.IAuthTabCallback.IAuthTabCallbackStub();
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback.onWarmupCompleted();
    }

    public final String IAuthTabCallbackStub() {
        return this.IAuthTabCallback.onTransact();
    }
}
