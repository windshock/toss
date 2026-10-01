package com.samsung.android.ssiframework.sdk.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BindingVcInfo implements Parcelable {
    public static final Parcelable.Creator<BindingVcInfo> CREATOR = new Creator();
    private final String vcId;
    private final String vcTypeNumber;

    public BindingVcInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.vcTypeNumber = str;
        this.vcId = str2;
    }

    public static /* synthetic */ BindingVcInfo copy$default(BindingVcInfo bindingVcInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindingVcInfo.vcTypeNumber;
        }
        if ((i & 2) != 0) {
            str2 = bindingVcInfo.vcId;
        }
        return bindingVcInfo.copy(str, str2);
    }

    public final String component1() {
        return this.vcTypeNumber;
    }

    public final String component2() {
        return this.vcId;
    }

    public final BindingVcInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BindingVcInfo(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindingVcInfo)) {
            return false;
        }
        BindingVcInfo bindingVcInfo = (BindingVcInfo) obj;
        return Intrinsics.areEqual(this.vcTypeNumber, bindingVcInfo.vcTypeNumber) && Intrinsics.areEqual(this.vcId, bindingVcInfo.vcId);
    }

    public final String getVcId() {
        return this.vcId;
    }

    public final String getVcTypeNumber() {
        return this.vcTypeNumber;
    }

    public int hashCode() {
        return this.vcId.hashCode() + (this.vcTypeNumber.hashCode() * 31);
    }

    public String toString() {
        return "BindingVcInfo(vcTypeNumber=" + this.vcTypeNumber + ", vcId=" + this.vcId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.vcTypeNumber);
        parcel.writeString(this.vcId);
    }
}
