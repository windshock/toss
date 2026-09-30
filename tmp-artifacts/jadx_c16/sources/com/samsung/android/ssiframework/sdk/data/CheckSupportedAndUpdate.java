package com.samsung.android.ssiframework.sdk.data;

import com.samsung.android.ssiframework.sdk.commonsdk.data.request.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CheckSupportedAndUpdate {
    private final int fwAppSupportApiLevel;
    private final FwAppUpdateInfo fwAppUpdateInfo;
    private final boolean isSupportedDevice;
    private final boolean shouldUpdateDeviceBinary;
    private final boolean shouldUpdateFwApp;

    public CheckSupportedAndUpdate(boolean z, boolean z2, boolean z3, int i, @Nullable FwAppUpdateInfo fwAppUpdateInfo) {
        this.isSupportedDevice = z;
        this.shouldUpdateDeviceBinary = z2;
        this.shouldUpdateFwApp = z3;
        this.fwAppSupportApiLevel = i;
        this.fwAppUpdateInfo = fwAppUpdateInfo;
    }

    public static /* synthetic */ CheckSupportedAndUpdate copy$default(CheckSupportedAndUpdate checkSupportedAndUpdate, boolean z, boolean z2, boolean z3, int i, FwAppUpdateInfo fwAppUpdateInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = checkSupportedAndUpdate.isSupportedDevice;
        }
        if ((i2 & 2) != 0) {
            z2 = checkSupportedAndUpdate.shouldUpdateDeviceBinary;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            z3 = checkSupportedAndUpdate.shouldUpdateFwApp;
        }
        boolean z5 = z3;
        if ((i2 & 8) != 0) {
            i = checkSupportedAndUpdate.fwAppSupportApiLevel;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            fwAppUpdateInfo = checkSupportedAndUpdate.fwAppUpdateInfo;
        }
        return checkSupportedAndUpdate.copy(z, z4, z5, i3, fwAppUpdateInfo);
    }

    public final boolean checkDeviceAndBinarySupported() {
        return this.isSupportedDevice && !this.shouldUpdateDeviceBinary;
    }

    public final boolean component1() {
        return this.isSupportedDevice;
    }

    public final boolean component2() {
        return this.shouldUpdateDeviceBinary;
    }

    public final boolean component3() {
        return this.shouldUpdateFwApp;
    }

    public final int component4() {
        return this.fwAppSupportApiLevel;
    }

    public final FwAppUpdateInfo component5() {
        return this.fwAppUpdateInfo;
    }

    public final CheckSupportedAndUpdate copy(boolean z, boolean z2, boolean z3, int i, @Nullable FwAppUpdateInfo fwAppUpdateInfo) {
        return new CheckSupportedAndUpdate(z, z2, z3, i, fwAppUpdateInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckSupportedAndUpdate)) {
            return false;
        }
        CheckSupportedAndUpdate checkSupportedAndUpdate = (CheckSupportedAndUpdate) obj;
        return this.isSupportedDevice == checkSupportedAndUpdate.isSupportedDevice && this.shouldUpdateDeviceBinary == checkSupportedAndUpdate.shouldUpdateDeviceBinary && this.shouldUpdateFwApp == checkSupportedAndUpdate.shouldUpdateFwApp && this.fwAppSupportApiLevel == checkSupportedAndUpdate.fwAppSupportApiLevel && Intrinsics.areEqual(this.fwAppUpdateInfo, checkSupportedAndUpdate.fwAppUpdateInfo);
    }

    public final int getFwAppSupportApiLevel() {
        return this.fwAppSupportApiLevel;
    }

    public final FwAppUpdateInfo getFwAppUpdateInfo() {
        return this.fwAppUpdateInfo;
    }

    public final boolean getShouldUpdateDeviceBinary() {
        return this.shouldUpdateDeviceBinary;
    }

    public final boolean getShouldUpdateFwApp() {
        return this.shouldUpdateFwApp;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSupportedDevice);
        int iA = b.a(this.fwAppSupportApiLevel, (Boolean.hashCode(this.shouldUpdateFwApp) + ((Boolean.hashCode(this.shouldUpdateDeviceBinary) + (iHashCode * 31)) * 31)) * 31, 31);
        FwAppUpdateInfo fwAppUpdateInfo = this.fwAppUpdateInfo;
        return iA + (fwAppUpdateInfo == null ? 0 : fwAppUpdateInfo.hashCode());
    }

    public final boolean isSupportedDevice() {
        return this.isSupportedDevice;
    }

    public String toString() {
        return "CheckSupportedAndUpdate(isSupportedDevice=" + this.isSupportedDevice + ", shouldUpdateDeviceBinary=" + this.shouldUpdateDeviceBinary + ", shouldUpdateFwApp=" + this.shouldUpdateFwApp + ", fwAppSupportApiLevel=" + this.fwAppSupportApiLevel + ", fwAppUpdateInfo=" + this.fwAppUpdateInfo + ")";
    }

    public /* synthetic */ CheckSupportedAndUpdate(boolean z, boolean z2, boolean z3, int i, FwAppUpdateInfo fwAppUpdateInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : fwAppUpdateInfo);
    }
}
