package com.samsung.android.ssiframework.sdk.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.ssiframework.sdk.commonsdk.data.request.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class UserIdentification implements Parcelable {
    public static final Parcelable.Creator<UserIdentification> CREATOR = new Creator();
    private final String CI;
    private final String hAuthToken;
    private final String hWalletToken;
    private final String hpNo;
    private final String sCI;
    private final String txId;

    public UserIdentification(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.hWalletToken = str;
        this.CI = str2;
        this.sCI = str3;
        this.hpNo = str4;
        this.hAuthToken = str5;
        this.txId = str6;
    }

    public static /* synthetic */ UserIdentification copy$default(UserIdentification userIdentification, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userIdentification.hWalletToken;
        }
        if ((i & 2) != 0) {
            str2 = userIdentification.CI;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = userIdentification.sCI;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = userIdentification.hpNo;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = userIdentification.hAuthToken;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = userIdentification.txId;
        }
        return userIdentification.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.hWalletToken;
    }

    public final String component2() {
        return this.CI;
    }

    public final String component3() {
        return this.sCI;
    }

    public final String component4() {
        return this.hpNo;
    }

    public final String component5() {
        return this.hAuthToken;
    }

    public final String component6() {
        return this.txId;
    }

    public final UserIdentification copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new UserIdentification(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserIdentification)) {
            return false;
        }
        UserIdentification userIdentification = (UserIdentification) obj;
        return Intrinsics.areEqual(this.hWalletToken, userIdentification.hWalletToken) && Intrinsics.areEqual(this.CI, userIdentification.CI) && Intrinsics.areEqual(this.sCI, userIdentification.sCI) && Intrinsics.areEqual(this.hpNo, userIdentification.hpNo) && Intrinsics.areEqual(this.hAuthToken, userIdentification.hAuthToken) && Intrinsics.areEqual(this.txId, userIdentification.txId);
    }

    public final String getCI() {
        return this.CI;
    }

    public final String getHAuthToken() {
        return this.hAuthToken;
    }

    public final String getHWalletToken() {
        return this.hWalletToken;
    }

    public final String getHpNo() {
        return this.hpNo;
    }

    public final String getSCI() {
        return this.sCI;
    }

    public final String getTxId() {
        return this.txId;
    }

    public int hashCode() {
        return this.txId.hashCode() + k.a(this.hAuthToken, k.a(this.hpNo, k.a(this.sCI, k.a(this.CI, this.hWalletToken.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        return "UserIdentification(hWalletToken=" + this.hWalletToken + ", CI=" + this.CI + ", sCI=" + this.sCI + ", hpNo=" + this.hpNo + ", hAuthToken=" + this.hAuthToken + ", txId=" + this.txId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.hWalletToken);
        parcel.writeString(this.CI);
        parcel.writeString(this.sCI);
        parcel.writeString(this.hpNo);
        parcel.writeString(this.hAuthToken);
        parcel.writeString(this.txId);
    }
}
