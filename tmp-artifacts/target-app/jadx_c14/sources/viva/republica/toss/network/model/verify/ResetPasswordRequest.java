package viva.republica.toss.network.model.verify;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import o.nativeReadByte;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResetPasswordRequest {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("password")
    private final String password;

    @SerializedName("passwordFormat")
    private final nativeReadByte passwordFormat;

    @SerializedName("sessionId")
    private final long sessionId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetPasswordRequest)) {
            int i6 = i2 + 49;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) obj;
        if (this.sessionId != resetPasswordRequest.sessionId) {
            int i8 = i4 + 71;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.password, resetPasswordRequest.password)) {
            return this.passwordFormat == resetPasswordRequest.passwordFormat;
        }
        int i10 = IAuthTabCallback + 97;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.sessionId) * 31) + this.password.hashCode()) * 31) + this.passwordFormat.hashCode();
        int i4 = onWarmupCompleted + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResetPasswordRequest(sessionId=" + this.sessionId + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ")";
        int i2 = IAuthTabCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ResetPasswordRequest(long j, @NotNull String str, @NotNull nativeReadByte nativereadbyte) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.sessionId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
    }
}
