package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setDescriptionTextColor {
    public static final int $stable = 0;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("accountGroupName")
    private final String accountGroupName;

    @SerializedName("account")
    private final String accountNo;

    @SerializedName("bankCode")
    private final int bankCode;

    @SerializedName("id")
    private final long id;

    @SerializedName("method")
    private final String method;

    static {
        int i = onNavigationEvent + 107;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public setDescriptionTextColor() {
        this(0L, 0, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 43;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof setDescriptionTextColor)) {
            return false;
        }
        setDescriptionTextColor setdescriptiontextcolor = (setDescriptionTextColor) obj;
        if (this.id != setdescriptiontextcolor.id || this.bankCode != setdescriptiontextcolor.bankCode || !Intrinsics.areEqual(this.accountNo, setdescriptiontextcolor.accountNo) || !Intrinsics.areEqual(this.accountGroupName, setdescriptiontextcolor.accountGroupName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.method, setdescriptiontextcolor.method)) {
            return true;
        }
        int i6 = IAuthTabCallback + 109;
        onExtraCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String str;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode5 = 0;
        long j = this.id;
        if (i3 != 0) {
            iHashCode = Long.hashCode(j);
            iHashCode2 = Integer.hashCode(this.bankCode);
            iHashCode3 = this.accountNo.hashCode();
            str = this.accountGroupName;
            iHashCode4 = 1;
            if (str != null) {
                iHashCode5 = 1;
                iHashCode4 = iHashCode5;
                iHashCode5 = str.hashCode();
            }
        } else {
            iHashCode = Long.hashCode(j);
            iHashCode2 = Integer.hashCode(this.bankCode);
            iHashCode3 = this.accountNo.hashCode();
            str = this.accountGroupName;
            if (str == null) {
                iHashCode4 = 0;
            } else {
                iHashCode4 = iHashCode5;
                iHashCode5 = str.hashCode();
            }
        }
        String str2 = this.method;
        if (str2 != null) {
            int i4 = onExtraCallback + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                str2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode4 = str2.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareRegisterBankAccount(id=" + this.id + ", bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ", accountGroupName=" + this.accountGroupName + ", method=" + this.method + ")";
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return str;
    }

    public setDescriptionTextColor(long j, int i, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = j;
        this.bankCode = i;
        this.accountNo = str;
        this.accountGroupName = str2;
        this.method = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setDescriptionTextColor(long j, int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        int i3;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallback + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i2 & 2) != 0) {
            int i6 = onExtraCallback + 5;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        String str4 = (i2 & 4) != 0 ? "" : str;
        String str5 = null;
        String str6 = (i2 & 8) != 0 ? null : str2;
        if ((i2 & 16) != 0) {
            int i9 = onExtraCallback + 9;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 20 / 0;
            }
            int i11 = 2 % 2;
        } else {
            str5 = str3;
        }
        this(j2, i3, str4, str6, str5);
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.id;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.bankCode;
        int i5 = i2 + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.accountNo;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountGroupName;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult IAuthTabCallback() {
        Enum r5;
        int i = 2 % 2;
        Enum[] enumArrValues = TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.values();
        int length = enumArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                r5 = null;
                break;
            }
            int i3 = IAuthTabCallback + 45;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                r5 = enumArrValues[i2];
                int i4 = 23 / 0;
                if (Intrinsics.areEqual(r5.name(), this.method)) {
                    break;
                }
                i2++;
            } else {
                r5 = enumArrValues[i2];
                if (Intrinsics.areEqual(r5.name(), this.method)) {
                    break;
                }
                i2++;
            }
        }
        int i5 = onExtraCallback;
        if (r5 != null) {
            int i6 = i5 + 21;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 55 / 0;
            }
            return r5;
        }
        int i8 = i5 + 121;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.UNDEFINED;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final setDescriptionTextColor onWarmupCompleted(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            setDescriptionTextColor setdescriptiontextcolor = new setDescriptionTextColor(tabBarInfoQueryPointOnTabBarInfoQueryListener.newSessionWithExtras(), Integer.parseInt(tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface()), tabBarInfoQueryPointOnTabBarInfoQueryListener.bP_(), null, null, 24, null);
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return setdescriptiontextcolor;
        }
    }
}
