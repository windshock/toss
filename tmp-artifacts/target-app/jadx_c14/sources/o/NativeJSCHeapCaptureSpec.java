package o;

import im.toss.TossApplication;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeJSCHeapCaptureSpec {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean arrow;
    private final requestMultiplePermissions color;
    private final requestMultiplePermissions darkColor;
    private final String description;
    private final deleteTimer icon;
    private final String id;
    private final boolean isTransfer;
    private final String linkUri;
    private final String subValue;
    private final String title;
    private final getFormatWidth transactionType;
    private final Intl transferStatus;
    private final String value;

    public NativeJSCHeapCaptureSpec() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, false, 8191, null);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i3 | i6);
        int i8 = (~i) | (~i6);
        int i9 = (~i8) | i3;
        int i10 = (~(i6 | i)) | (~((~i3) | i)) | (~(i8 | i3));
        int i11 = i + i3 + i5 + ((-101282902) * i4) + ((-829309908) * i2);
        int i12 = i11 * i11;
        int i13 = ((i * 42798203) - 224002048) + (42798203 * i3) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i5) + (1710751744 * i4) + ((-1643118592) * i2) + ((-1134166016) * i12);
        int i14 = (i * 1745018779) + 1790267665 + (i3 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i5 * 1745018721) + (i4 * (-1587019414)) + (i2 * (-1871011668)) + (i12 * 1017511936);
        return i13 + ((i14 * i14) * (-1139146752)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeJSCHeapCaptureSpec)) {
            return false;
        }
        NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec = (NativeJSCHeapCaptureSpec) obj;
        if (!Intrinsics.areEqual(this.id, nativeJSCHeapCaptureSpec.id)) {
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, nativeJSCHeapCaptureSpec.title) || !Intrinsics.areEqual(this.description, nativeJSCHeapCaptureSpec.description) || !Intrinsics.areEqual(this.value, nativeJSCHeapCaptureSpec.value) || this.transactionType != nativeJSCHeapCaptureSpec.transactionType) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subValue, nativeJSCHeapCaptureSpec.subValue)) {
            int i4 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.transferStatus != nativeJSCHeapCaptureSpec.transferStatus) {
            return false;
        }
        if (!Intrinsics.areEqual(this.linkUri, nativeJSCHeapCaptureSpec.linkUri)) {
            int i6 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.icon, nativeJSCHeapCaptureSpec.icon) || this.arrow != nativeJSCHeapCaptureSpec.arrow) {
            return false;
        }
        if (Intrinsics.areEqual(this.color, nativeJSCHeapCaptureSpec.color)) {
            return Intrinsics.areEqual(this.darkColor, nativeJSCHeapCaptureSpec.darkColor) && this.isTransfer == nativeJSCHeapCaptureSpec.isTransfer;
        }
        int i7 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.id.hashCode();
        int iHashCode4 = this.title.hashCode();
        int iHashCode5 = this.description.hashCode();
        int iHashCode6 = this.value.hashCode();
        getFormatWidth getformatwidth = this.transactionType;
        int iHashCode7 = 0;
        if (getformatwidth == null) {
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = getformatwidth.hashCode();
        }
        int iHashCode8 = this.subValue.hashCode();
        Intl intl = this.transferStatus;
        int iHashCode9 = intl == null ? 0 : intl.hashCode();
        int iHashCode10 = this.linkUri.hashCode();
        deleteTimer deletetimer = this.icon;
        int iHashCode11 = deletetimer == null ? 0 : deletetimer.hashCode();
        int iHashCode12 = Boolean.hashCode(this.arrow);
        requestMultiplePermissions requestmultiplepermissions = this.color;
        if (requestmultiplepermissions == null) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 113;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = requestmultiplepermissions.hashCode();
        }
        requestMultiplePermissions requestmultiplepermissions2 = this.darkColor;
        if (requestmultiplepermissions2 != null) {
            int i8 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                requestmultiplepermissions2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode7 = requestmultiplepermissions2.hashCode();
        }
        int iHashCode13 = (((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + Boolean.hashCode(this.isTransfer);
        int i9 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            return iHashCode13;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTransactionItem(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", value=" + this.value + ", transactionType=" + this.transactionType + ", subValue=" + this.subValue + ", transferStatus=" + this.transferStatus + ", linkUri=" + this.linkUri + ", icon=" + this.icon + ", arrow=" + this.arrow + ", color=" + this.color + ", darkColor=" + this.darkColor + ", isTransfer=" + this.isTransfer + ")";
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public NativeJSCHeapCaptureSpec(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable getFormatWidth getformatwidth, @NotNull String str5, @Nullable Intl intl, @NotNull String str6, @Nullable deleteTimer deletetimer, boolean z, @Nullable requestMultiplePermissions requestmultiplepermissions, @Nullable requestMultiplePermissions requestmultiplepermissions2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.value = str4;
        this.transactionType = getformatwidth;
        this.subValue = str5;
        this.transferStatus = intl;
        this.linkUri = str6;
        this.icon = deletetimer;
        this.arrow = z;
        this.color = requestmultiplepermissions;
        this.darkColor = requestmultiplepermissions2;
        this.isTransfer = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeJSCHeapCaptureSpec(String str, String str2, String str3, String str4, getFormatWidth getformatwidth, String str5, Intl intl, String str6, deleteTimer deletetimer, boolean z, requestMultiplePermissions requestmultiplepermissions, requestMultiplePermissions requestmultiplepermissions2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        boolean z3;
        requestMultiplePermissions requestmultiplepermissions3;
        String str9 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        String str10 = (i & 4) != 0 ? "" : str3;
        String str11 = (i & 8) != 0 ? "" : str4;
        getFormatWidth getformatwidth2 = (i & 16) != 0 ? getFormatWidth.NONE : getformatwidth;
        if ((i & 32) != 0) {
            int i5 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                requestmultiplepermissions.hashCode();
                throw null;
            }
            str8 = "";
        } else {
            str8 = str5;
        }
        Intl intl2 = (i & 64) != 0 ? Intl.NONE : intl;
        String str12 = (i & 128) == 0 ? str6 : "";
        deleteTimer deletetimer2 = (i & 256) != 0 ? null : deletetimer;
        boolean z4 = false;
        if ((i & 512) != 0) {
            int i6 = onExtraCallbackWithResult + 9;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 11;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 1024) != 0) {
            int i11 = 2 % 2;
            requestmultiplepermissions3 = null;
        } else {
            requestmultiplepermissions3 = requestmultiplepermissions;
        }
        requestmultiplepermissions = (i & 2048) == 0 ? requestmultiplepermissions2 : null;
        if ((i & 4096) != 0) {
            int i12 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        } else {
            z4 = z2;
        }
        this(str9, str7, str10, str11, getformatwidth2, str8, intl2, str12, deletetimer2, z3, requestmultiplepermissions3, requestmultiplepermissions, z4);
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 21;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec = (NativeJSCHeapCaptureSpec) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = nativeJSCHeapCaptureSpec.title;
        int i5 = i2 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec = (NativeJSCHeapCaptureSpec) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = nativeJSCHeapCaptureSpec.description;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 107;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final getFormatWidth asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionType;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subValue;
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.linkUri;
        int i5 = i2 + 97;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final deleteTimer IAuthTabCallback() {
        deleteTimer deletetimer;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            deletetimer = this.icon;
            int i4 = 25 / 0;
        } else {
            deletetimer = this.icon;
        }
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return deletetimer;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.arrow;
        int i5 = i2 + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final requestMultiplePermissions onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        requestMultiplePermissions requestmultiplepermissions = this.color;
        int i5 = i3 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return requestmultiplepermissions;
    }

    public final requestMultiplePermissions onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        requestMultiplePermissions requestmultiplepermissions = this.darkColor;
        int i5 = i2 + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return requestmultiplepermissions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (String) onExtraCallbackWithResult(1841901168, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this}, -1841901167, iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback);
    }

    public final String onTransact() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (String) onExtraCallbackWithResult(-1210258625, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this}, 1210258625, iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback);
    }
}
