package viva.republica.toss.account.agreement.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegisterAccountDto {
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterAccountDto)) {
            return false;
        }
        RegisterAccountDto registerAccountDto = (RegisterAccountDto) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, registerAccountDto.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, registerAccountDto.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, registerAccountDto.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (((this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "RegisterAccountDto(refId=" + this.onWarmupCompleted + ", accountNo=" + this.IAuthTabCallback + ", bankCode=" + this.onExtraCallbackWithResult + ")";
    }

    public RegisterAccountDto(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallbackWithResult = str3;
    }

    public final String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public final String onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }
}
