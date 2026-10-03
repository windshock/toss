package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonAdditionalFieldOption implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("displayText")
    private final String displayText;

    @SerializedName("enable")
    private final Boolean enable;

    @SerializedName("value")
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanComparisonAdditionalFieldOption> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<LoanComparisonAdditionalFieldOption> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonAdditionalFieldOption createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonAdditionalFieldOption loanComparisonAdditionalFieldOptionOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 42 / 0;
            }
            return loanComparisonAdditionalFieldOptionOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanComparisonAdditionalFieldOption[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 21;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            LoanComparisonAdditionalFieldOption[] loanComparisonAdditionalFieldOptionArrOnExtraCallback = onExtraCallback(i);
            int i4 = IAuthTabCallback + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return loanComparisonAdditionalFieldOptionArrOnExtraCallback;
        }

        public final LoanComparisonAdditionalFieldOption[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 31;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            LoanComparisonAdditionalFieldOption[] loanComparisonAdditionalFieldOptionArr = new LoanComparisonAdditionalFieldOption[i];
            int i6 = i4 + 91;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return loanComparisonAdditionalFieldOptionArr;
        }

        public final LoanComparisonAdditionalFieldOption onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 119;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i4 = IAuthTabCallback + 29;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            LoanComparisonAdditionalFieldOption loanComparisonAdditionalFieldOption = new LoanComparisonAdditionalFieldOption(string, string2, boolValueOf);
            int i6 = IAuthTabCallback + 101;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return loanComparisonAdditionalFieldOption;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 97;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public LoanComparisonAdditionalFieldOption() {
        this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r1 = r1 + 67;
        viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r6 = (viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.displayText, r6.displayText)) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.value, r6.value) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.enable, r6.enable) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r6 = viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback + 35;
        viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.IAuthTabCallback
            int r2 = r1 + 45
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L15
            r2 = 3
            int r2 = r2 / r4
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r3
        L18:
            boolean r2 = r6 instanceof viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption
            if (r2 != 0) goto L24
            int r1 = r1 + 67
            int r6 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback = r6
            int r1 = r1 % r0
            return r4
        L24:
            viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption r6 = (viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption) r6
            java.lang.String r1 = r5.displayText
            java.lang.String r2 = r6.displayText
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == r3) goto L51
            java.lang.String r1 = r5.value
            java.lang.String r2 = r6.value
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3c
            return r4
        L3c:
            java.lang.Boolean r1 = r5.enable
            java.lang.Boolean r6 = r6.enable
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L47
            return r4
        L47:
            int r6 = viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback
            int r6 = r6 + 35
            int r1 = r6 % 128
            viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.IAuthTabCallback = r1
            int r6 = r6 % r0
            return r3
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.displayText.hashCode();
            this.value.hashCode();
            throw null;
        }
        int iHashCode = this.displayText.hashCode();
        int iHashCode2 = this.value.hashCode();
        Boolean bool = this.enable;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        int i3 = onExtraCallback + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonAdditionalFieldOption(displayText=" + this.displayText + ", value=" + this.value + ", enable=" + this.enable + ")";
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.displayText);
            parcel.writeString(this.value);
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.displayText);
        parcel.writeString(this.value);
        Boolean bool = this.enable;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonAdditionalFieldOption> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonAdditionalFieldOption$.serializer serializerVar = LoanComparisonAdditionalFieldOption$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ LoanComparisonAdditionalFieldOption(int i, String str, String str2, Boolean bool, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.displayText = "";
        } else {
            this.displayText = str;
            int i2 = IAuthTabCallback + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.enable = null;
            int i4 = onExtraCallback + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.enable = bool;
        int i6 = onExtraCallback + 43;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 30 / 0;
        }
    }

    public LoanComparisonAdditionalFieldOption(@NotNull String str, @NotNull String str2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.displayText = str;
        this.value = str2;
        this.enable = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            java.lang.String r3 = ""
            r4 = 1
            if (r2 != 0) goto L20
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.IAuthTabCallback
            int r2 = r2 + 15
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback = r5
            int r2 = r2 % r0
            java.lang.String r2 = r6.displayText
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r2 = r2 ^ r4
            if (r2 == r4) goto L20
            goto L25
        L20:
            java.lang.String r2 = r6.displayText
            r7.onExtraCallback(r8, r1, r2)
        L25:
            boolean r2 = r7.onWarmupCompleted(r8, r4)
            if (r2 == r4) goto L4a
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback
            int r2 = r2 + 49
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.IAuthTabCallback = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L42
            java.lang.String r2 = r6.value
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 12
            int r3 = r3 / r1
            if (r2 != 0) goto L4f
            goto L4a
        L42:
            java.lang.String r1 = r6.value
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L4f
        L4a:
            java.lang.String r1 = r6.value
            r7.onExtraCallback(r8, r4, r1)
        L4f:
            boolean r1 = r7.onWarmupCompleted(r8, r0)
            if (r1 != 0) goto L59
            java.lang.Boolean r1 = r6.enable
            if (r1 == 0) goto L60
        L59:
            o.getBgColor r1 = o.getBgColor.IAuthTabCallback
            java.lang.Boolean r6 = r6.enable
            r7.onExtraCallbackWithResult(r8, r0, r1, r6)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption.onExtraCallback(viva.republica.toss.network.model.loan.LoanComparisonAdditionalFieldOption, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonAdditionalFieldOption(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallback;
            int i6 = i5 + 121;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 63;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            bool = null;
        }
        this(str, str2, bool);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.displayText;
        int i5 = i2 + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return str;
    }
}
