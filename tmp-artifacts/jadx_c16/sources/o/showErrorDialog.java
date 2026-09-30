package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class showErrorDialog {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("constrainedWithdraw")
    private final boolean constrainedWithdraw;

    @SerializedName("tossAccountId")
    private final String tossAccountId;

    @SerializedName("tossAccountName")
    private final String tossAccountName;

    @SerializedName("type")
    private final String type;

    public showErrorDialog() {
        this(null, null, false, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof showErrorDialog)) {
            return false;
        }
        showErrorDialog showerrordialog = (showErrorDialog) obj;
        if (!Intrinsics.areEqual(this.tossAccountId, showerrordialog.tossAccountId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tossAccountName, showerrordialog.tossAccountName)) {
            return this.constrainedWithdraw == showerrordialog.constrainedWithdraw && Intrinsics.areEqual(this.type, showerrordialog.type);
        }
        int i3 = onExtraCallbackWithResult + 45;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        boolean z = i3 % 2 != 0;
        int i5 = i4 + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.tossAccountId;
        if (str == null) {
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode2 = this.tossAccountName.hashCode();
        int iHashCode3 = Boolean.hashCode(this.constrainedWithdraw);
        String str2 = this.type;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EditTossAccountReqDto(tossAccountId=" + this.tossAccountId + ", tossAccountName=" + this.tossAccountName + ", constrainedWithdraw=" + this.constrainedWithdraw + ", type=" + this.type + ")";
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public showErrorDialog(@Nullable String str, @NotNull String str2, boolean z, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.tossAccountId = str;
        this.tossAccountName = str2;
        this.constrainedWithdraw = z;
        this.type = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ showErrorDialog(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 5;
            } else {
                int i4 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i7 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i7 % 128;
            z = i7 % 2 == 0;
            int i8 = 2 % 2;
        }
        this(str, str2, z, (i & 8) != 0 ? null : str3);
    }
}
