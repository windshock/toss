package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getCurrentColorScheme {
    private static int extraCallbackWithResult = 0;
    private static int writeTypedObject = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final String IAuthTabCallback_Parcel;
    private final String access000;
    private final String access100;
    private final boolean asBinder;
    private final long asInterface;
    private final String getInterfaceDescriptor;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;
    private final String readTypedObject;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentColorScheme)) {
            int i2 = extraCallbackWithResult + 17;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getCurrentColorScheme getcurrentcolorscheme = (getCurrentColorScheme) obj;
        if (!Intrinsics.areEqual(this.readTypedObject, getcurrentcolorscheme.readTypedObject)) {
            int i4 = writeTypedObject + 51;
            extraCallbackWithResult = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, getcurrentcolorscheme.IAuthTabCallbackDefault)) {
            int i5 = writeTypedObject + 99;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, getcurrentcolorscheme.onTransact)) {
            int i7 = extraCallbackWithResult + 47;
            writeTypedObject = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, getcurrentcolorscheme.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.getInterfaceDescriptor, getcurrentcolorscheme.getInterfaceDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, getcurrentcolorscheme.onWarmupCompleted)) {
            int i8 = extraCallbackWithResult;
            int i9 = i8 + 15;
            writeTypedObject = i9 % 128;
            boolean z = i9 % 2 == 0;
            int i10 = i8 + 21;
            writeTypedObject = i10 % 128;
            if (i10 % 2 != 0) {
                return z;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, getcurrentcolorscheme.onExtraCallback) || !Intrinsics.areEqual(this.access100, getcurrentcolorscheme.access100) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, getcurrentcolorscheme.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.access000, getcurrentcolorscheme.access000) || (!Intrinsics.areEqual(this.IAuthTabCallback, getcurrentcolorscheme.IAuthTabCallback)) || this.onNavigationEvent != getcurrentcolorscheme.onNavigationEvent || this.IAuthTabCallbackStubProxy != getcurrentcolorscheme.IAuthTabCallbackStubProxy) {
            return false;
        }
        if (this.IAuthTabCallbackStub != getcurrentcolorscheme.IAuthTabCallbackStub) {
            int i11 = extraCallbackWithResult + 71;
            writeTypedObject = i11 % 128;
            return i11 % 2 == 0;
        }
        if (this.asInterface == getcurrentcolorscheme.asInterface) {
            return this.asBinder == getcurrentcolorscheme.asBinder;
        }
        int i12 = writeTypedObject + 69;
        extraCallbackWithResult = i12 % 128;
        return i12 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.readTypedObject;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode7 = this.onTransact.hashCode();
        int iHashCode8 = this.onExtraCallbackWithResult.hashCode();
        String str2 = this.getInterfaceDescriptor;
        if (str2 == null) {
            int i2 = writeTypedObject + 71;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int iHashCode9 = this.onWarmupCompleted.hashCode();
        String str3 = this.onExtraCallback;
        if (str3 == null) {
            int i4 = extraCallbackWithResult + 65;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int iHashCode10 = this.access100.hashCode();
        String str4 = this.IAuthTabCallback_Parcel;
        if (str4 == null) {
            int i6 = extraCallbackWithResult + 47;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.access000;
        if (str5 != null) {
            int i8 = extraCallbackWithResult + 5;
            writeTypedObject = i8 % 128;
            if (i8 % 2 == 0) {
                int iHashCode11 = str5.hashCode();
                int i9 = 59 / 0;
                iHashCode4 = iHashCode11;
            } else {
                iHashCode4 = str5.hashCode();
            }
        }
        return (((((((((((((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + this.IAuthTabCallback.hashCode()) * 31) + Long.hashCode(this.onNavigationEvent)) * 31) + Long.hashCode(this.IAuthTabCallbackStubProxy)) * 31) + Long.hashCode(this.IAuthTabCallbackStub)) * 31) + Long.hashCode(this.asInterface)) * 31) + Boolean.hashCode(this.asBinder);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTransferResult(tossAccountId=" + this.readTypedObject + ", bankCode=" + this.IAuthTabCallbackDefault + ", orgCode=" + this.onTransact + ", accountNumber=" + this.onExtraCallbackWithResult + ", sequenceNo=" + this.getInterfaceDescriptor + ", accountName=" + this.onWarmupCompleted + ", assetImgUrl=" + this.onExtraCallback + ", terminateResultCode=" + this.access100 + ", recipientResultCode=" + this.IAuthTabCallback_Parcel + ", terminationId=" + this.access000 + ", accountType=" + this.IAuthTabCallback + ", accountBalance=" + this.onNavigationEvent + ", paymentAmount=" + this.IAuthTabCallbackStubProxy + ", interest=" + this.IAuthTabCallbackStub + ", minusAmount=" + this.asInterface + ", isOnlyTerminate=" + this.asBinder + ")";
        int i2 = writeTypedObject + 37;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return str;
    }

    public getCurrentColorScheme(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @Nullable String str7, @NotNull String str8, @Nullable String str9, @Nullable String str10, @NotNull String str11, long j, long j2, long j3, long j4, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.readTypedObject = str;
        this.IAuthTabCallbackDefault = str2;
        this.onTransact = str3;
        this.onExtraCallbackWithResult = str4;
        this.getInterfaceDescriptor = str5;
        this.onWarmupCompleted = str6;
        this.onExtraCallback = str7;
        this.access100 = str8;
        this.IAuthTabCallback_Parcel = str9;
        this.access000 = str10;
        this.IAuthTabCallback = str11;
        this.onNavigationEvent = j;
        this.IAuthTabCallbackStubProxy = j2;
        this.IAuthTabCallbackStub = j3;
        this.asInterface = j4;
        this.asBinder = z;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 123;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onTransact;
        int i5 = i2 + 95;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 9;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getInterfaceDescriptor;
        int i5 = i2 + 13;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 71;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i3 + 39;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 109;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.access100;
        int i5 = i2 + 3;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 107;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.IAuthTabCallback_Parcel;
            int i4 = 59 / 0;
        } else {
            str = this.IAuthTabCallback_Parcel;
        }
        int i5 = i2 + 111;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 65;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onNavigationEvent;
        int i5 = i2 + 43;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 53;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return j;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 35;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.readTypedObject;
        if (str != null) {
            return str;
        }
        int i5 = i2 + 45;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return "0000000";
    }
}
