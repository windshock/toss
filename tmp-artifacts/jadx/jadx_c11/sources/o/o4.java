package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o4 {
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final Integer IAuthTabCallbackStub;
    private final Long IAuthTabCallback_Parcel;
    private final n6b access100;
    private final n7 asBinder;
    private final Long asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i;
        int i10 = ~i5;
        int i11 = i8 | (~(i9 | i10 | i4));
        int i12 = (~(i5 | i9 | i4)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i + i4 + i6 + (762713021 * i3) + (1579510587 * i2);
        int i15 = i14 * i14;
        int i16 = ((i * (-1846875272)) - 1480523776) + ((-1846875272) * i4) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i6) + ((-750387200) * i3) + ((-523632640) * i2) + ((-1971257344) * i15);
        int i17 = ((i * (-1364308824)) - 1074288667) + (i4 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i6 * (-1364308165)) + (i3 * (-893132913)) + (i2 * 986770329) + (i15 * (-1162149888));
        if (i16 + (i17 * i17 * (-1529413632)) != 1) {
            o4 o4Var = (o4) objArr[0];
            int i18 = 2 % 2;
            int i19 = getInterfaceDescriptor + 81;
            int i20 = i19 % 128;
            access000 = i20;
            int i21 = i19 % 2;
            String str = o4Var.IAuthTabCallback;
            int i22 = i20 + 105;
            getInterfaceDescriptor = i22 % 128;
            int i23 = i22 % 2;
            return str;
        }
        o4 o4Var2 = (o4) objArr[0];
        int i24 = 2 % 2;
        int i25 = getInterfaceDescriptor;
        int i26 = i25 + 49;
        access000 = i26 % 128;
        int i27 = i26 % 2;
        String str2 = o4Var2.onExtraCallbackWithResult;
        int i28 = i25 + 13;
        access000 = i28 % 128;
        int i29 = i28 % 2;
        return str2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = getInterfaceDescriptor + 79;
            access000 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        if (!Intrinsics.areEqual(this.asBinder, o4Var.asBinder) || this.access100 != o4Var.access100) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, o4Var.onExtraCallbackWithResult)) {
            int i3 = getInterfaceDescriptor + 85;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, o4Var.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, o4Var.IAuthTabCallbackDefault)) {
            int i5 = access000 + 115;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, o4Var.IAuthTabCallback)) {
            int i7 = access000 + 45;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, o4Var.onTransact)) {
            int i9 = access000 + 15;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, o4Var.asInterface) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, o4Var.IAuthTabCallback_Parcel) || this.onNavigationEvent != o4Var.onNavigationEvent) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, o4Var.onExtraCallback)) {
            int i11 = getInterfaceDescriptor + 91;
            access000 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.IAuthTabCallbackStub, o4Var.IAuthTabCallbackStub))) {
            return true;
        }
        int i13 = getInterfaceDescriptor + 27;
        access000 = i13 % 128;
        return i13 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode6 = this.asBinder.hashCode();
        int iHashCode7 = this.access100.hashCode();
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            int i4 = getInterfaceDescriptor + 123;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.onWarmupCompleted;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        int iHashCode9 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode10 = this.IAuthTabCallback.hashCode();
        String str3 = this.onTransact;
        if (str3 == null) {
            int i6 = getInterfaceDescriptor + 61;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        Long l = this.asInterface;
        if (l == null) {
            int i8 = access000 + 81;
            getInterfaceDescriptor = i8 % 128;
            iHashCode3 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = l.hashCode();
        }
        Long l2 = this.IAuthTabCallback_Parcel;
        if (l2 == null) {
            int i9 = access000 + 7;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = l2.hashCode();
        }
        int iHashCode11 = Boolean.hashCode(this.onNavigationEvent);
        String str4 = this.onExtraCallback;
        if (str4 == null) {
            int i11 = getInterfaceDescriptor + 61;
            access000 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str4.hashCode();
        }
        Integer num = this.IAuthTabCallbackStub;
        return (((((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode11) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnLoadedBundle(request=" + this.asBinder + ", source=" + this.access100 + ", deploymentId=" + this.onExtraCallbackWithResult + ", filePath=" + this.onWarmupCompleted + ", signature=" + this.IAuthTabCallbackDefault + ", deployedAt=" + this.IAuthTabCallback + ", sharedMinDeployedAt=" + this.onTransact + ", savedAt=" + this.asInterface + ", updatedAt=" + this.IAuthTabCallback_Parcel + ", isFromCache=" + this.onNavigationEvent + ", metroHost=" + this.onExtraCallback + ", metroPort=" + this.IAuthTabCallbackStub + ")";
        int i2 = getInterfaceDescriptor + 25;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public o4(@NotNull n7 n7Var, @NotNull n6b n6bVar, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable Long l, @Nullable Long l2, boolean z, @Nullable String str6, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(n7Var, "");
        Intrinsics.checkNotNullParameter(n6bVar, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.asBinder = n7Var;
        this.access100 = n6bVar;
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallbackDefault = str3;
        this.IAuthTabCallback = str4;
        this.onTransact = str5;
        this.asInterface = l;
        this.IAuthTabCallback_Parcel = l2;
        this.onNavigationEvent = z;
        this.onExtraCallback = str6;
        this.IAuthTabCallbackStub = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o4(n7 n7Var, n6b n6bVar, String str, String str2, String str3, String str4, String str5, Long l, Long l2, boolean z, String str6, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        Long l3;
        Integer num2;
        Object obj = null;
        String str8 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            int i2 = getInterfaceDescriptor + 83;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        String str9 = (i & 32) != 0 ? "" : str4;
        String str10 = (i & 64) != 0 ? null : str5;
        Long l4 = (i & 128) != 0 ? null : l;
        if ((i & 256) != 0) {
            int i3 = access000 + 53;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            l3 = null;
        } else {
            l3 = l2;
        }
        boolean z2 = (i & 512) != 0 ? false : z;
        String str11 = (i & 1024) != 0 ? null : str6;
        if ((i & 2048) != 0) {
            int i4 = access000 + 95;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        this(n7Var, n6bVar, str, str8, str7, str9, str10, l4, l3, z2, str11, num2);
    }

    public final n7 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        n7 n7Var = this.asBinder;
        int i5 = i3 + 85;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return n7Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final n6b asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        n6b n6bVar = this.access100;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return n6bVar;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 123;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 13;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onTransact;
            int i4 = 6 / 0;
        } else {
            str = this.onTransact;
        }
        int i5 = i2 + 57;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long onTransact() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 109;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.asInterface;
        int i4 = i2 + 79;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return l;
    }

    public final Long access000() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 117;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Long l = this.IAuthTabCallback_Parcel;
        int i4 = i2 + 53;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return l;
        }
        throw null;
    }

    public final boolean access100() {
        int i = 2 % 2;
        int i2 = access000 + 117;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 23;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (String) onWarmupCompleted(1338810367, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback3, -1338810367, new Object[]{this}, iIAuthTabCallback, iIAuthTabCallback2);
    }

    public final String onExtraCallback() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (String) onWarmupCompleted(-1806201270, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback3, 1806201271, new Object[]{this}, iIAuthTabCallback, iIAuthTabCallback2);
    }
}
