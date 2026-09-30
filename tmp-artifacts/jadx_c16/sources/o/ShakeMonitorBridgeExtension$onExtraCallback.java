package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ShakeMonitorBridgeExtension$onExtraCallback {
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asBinder;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final int onTransact;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShakeMonitorBridgeExtension$onExtraCallback)) {
            return false;
        }
        ShakeMonitorBridgeExtension$onExtraCallback shakeMonitorBridgeExtension$onExtraCallback = (ShakeMonitorBridgeExtension$onExtraCallback) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, shakeMonitorBridgeExtension$onExtraCallback.IAuthTabCallbackDefault)) {
            int i4 = asInterface + 77;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.asBinder, shakeMonitorBridgeExtension$onExtraCallback.asBinder)) {
            if (Intrinsics.areEqual(this.onWarmupCompleted, shakeMonitorBridgeExtension$onExtraCallback.onWarmupCompleted)) {
                return this.onTransact == shakeMonitorBridgeExtension$onExtraCallback.onTransact && Intrinsics.areEqual(this.IAuthTabCallback, shakeMonitorBridgeExtension$onExtraCallback.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, shakeMonitorBridgeExtension$onExtraCallback.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallbackStub, shakeMonitorBridgeExtension$onExtraCallback.IAuthTabCallbackStub) && this.onExtraCallback == shakeMonitorBridgeExtension$onExtraCallback.onExtraCallback;
            }
            int i6 = getInterfaceDescriptor + 97;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = getInterfaceDescriptor + 17;
        int i9 = i8 % 128;
        asInterface = i9;
        boolean z = i8 % 2 != 0;
        int i10 = i9 + 9;
        getInterfaceDescriptor = i10 % 128;
        if (i10 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asInterface + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode3 = this.asBinder.hashCode();
        String str = this.onWarmupCompleted;
        int iHashCode4 = 1;
        int iHashCode5 = 0;
        if (str == null) {
            int i4 = getInterfaceDescriptor + 1;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode6 = Integer.hashCode(this.onTransact);
        String str2 = this.IAuthTabCallback;
        if (str2 == null) {
            int i6 = asInterface + 59;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                iHashCode4 = 0;
            }
        } else {
            iHashCode4 = str2.hashCode();
        }
        String str3 = this.onNavigationEvent;
        if (str3 != null) {
            int i7 = getInterfaceDescriptor + 11;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                str3.hashCode();
                throw null;
            }
            iHashCode5 = str3.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RewardLogParams(transactionId=" + this.IAuthTabCallbackDefault + ", rewardType=" + this.asBinder + ", cluster=" + this.onWarmupCompleted + ", sectionOrder=" + this.onTransact + ", clusterV2=" + this.IAuthTabCallback + ", logType=" + this.onNavigationEvent + ", sectionStatus=" + this.IAuthTabCallbackStub + ", isNau=" + this.onExtraCallback + ")";
        int i2 = asInterface + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return str;
    }

    public ShakeMonitorBridgeExtension$onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @Nullable String str4, @Nullable String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.IAuthTabCallbackDefault = str;
        this.asBinder = str2;
        this.onWarmupCompleted = str3;
        this.onTransact = i;
        this.IAuthTabCallback = str4;
        this.onNavigationEvent = str5;
        this.IAuthTabCallbackStub = str6;
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = StringsKt.startsWith$default(str2, "FAKE", false, 2, (Object) null);
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallbackDefault;
        int i4 = i3 + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 45;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 119;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 1;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 9;
        int i4 = i3 % 128;
        getInterfaceDescriptor = i4;
        if (i3 % 2 == 0) {
            i = this.onTransact;
            int i5 = 7 / 0;
        } else {
            i = this.onTransact;
        }
        int i6 = i4 + 59;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 55;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 17;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 89;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
