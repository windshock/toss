package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.getAdExperienceType;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanProductBadge implements Parcelable {
    public static final Parcelable.Creator<LoanProductBadge> CREATOR = new onExtraCallback();
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName(getAdExperienceType.QUERY_KEY)
    private final String size;

    @SerializedName("style")
    private final String style;

    @SerializedName("text")
    private final String text;

    @SerializedName("type")
    private final String type;

    public static final class onExtraCallback implements Parcelable.Creator<LoanProductBadge> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final LoanProductBadge[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            LoanProductBadge[] loanProductBadgeArr = new LoanProductBadge[i];
            int i6 = i3 + 5;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return loanProductBadgeArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanProductBadge createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanProductBadge loanProductBadgeOnExtraCallback = onExtraCallback(parcel);
            if (i3 == 0) {
                int i4 = 41 / 0;
            }
            int i5 = onExtraCallback + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return loanProductBadgeOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanProductBadge[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            LoanProductBadge[] loanProductBadgeArrIAuthTabCallback = IAuthTabCallback(i);
            if (i4 != 0) {
                int i5 = 42 / 0;
            }
            int i6 = onExtraCallback + 29;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return loanProductBadgeArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanProductBadge onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanProductBadge loanProductBadge = new LoanProductBadge(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return loanProductBadge;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 63;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public LoanProductBadge() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanProductBadge)) {
            int i5 = i2 + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        LoanProductBadge loanProductBadge = (LoanProductBadge) obj;
        if (!Intrinsics.areEqual(this.text, loanProductBadge.text)) {
            int i7 = onWarmupCompleted + 31;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.style, loanProductBadge.style)) {
            int i9 = onNavigationEvent + 113;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(!Intrinsics.areEqual(this.type, loanProductBadge.type))) {
            return Intrinsics.areEqual(this.size, loanProductBadge.size);
        }
        int i10 = onNavigationEvent;
        int i11 = i10 + 117;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 97;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 45 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.type.hashCode()) * 31) + this.size.hashCode();
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanProductBadge(text=" + this.text + ", style=" + this.style + ", type=" + this.type + ", size=" + this.size + ")";
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.text);
            parcel.writeString(this.style);
            parcel.writeString(this.type);
            parcel.writeString(this.size);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.text);
        parcel.writeString(this.style);
        parcel.writeString(this.type);
        parcel.writeString(this.size);
        int i5 = onNavigationEvent + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanProductBadge> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanProductBadge$$serializer loanProductBadge$$serializer = LoanProductBadge$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return loanProductBadge$$serializer;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanProductBadge(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, o.okycx r7) {
        /*
            r1 = this;
            r1.<init>()
            r7 = r2 & 1
            java.lang.String r0 = ""
            if (r7 != 0) goto Lc
            r1.text = r0
            goto Le
        Lc:
            r1.text = r3
        Le:
            r3 = r2 & 2
            r7 = 2
            if (r3 != 0) goto L21
            r1.style = r0
            int r3 = viva.republica.toss.network.model.loan.LoanProductBadge.onWarmupCompleted
            int r3 = r3 + 33
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge.onNavigationEvent = r4
            int r3 = r3 % r7
        L1e:
            int r3 = r7 % r7
            goto L2e
        L21:
            r1.style = r4
            int r3 = viva.republica.toss.network.model.loan.LoanProductBadge.onNavigationEvent
            int r3 = r3 + 31
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge.onWarmupCompleted = r4
            int r3 = r3 % r7
            if (r3 == 0) goto L1e
        L2e:
            r3 = r2 & 4
            if (r3 != 0) goto L3f
            r1.type = r0
            int r3 = viva.republica.toss.network.model.loan.LoanProductBadge.onWarmupCompleted
            int r3 = r3 + 31
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge.onNavigationEvent = r4
            int r3 = r3 % r7
            int r7 = r7 % r7
            goto L41
        L3f:
            r1.type = r5
        L41:
            r2 = r2 & 8
            if (r2 != 0) goto L48
            r1.size = r0
            return
        L48:
            r1.size = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanProductBadge.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.okycx):void");
    }

    public LoanProductBadge(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.text = str;
        this.style = str2;
        this.type = str3;
        this.size = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.LoanProductBadge r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            r3 = 1
            java.lang.String r4 = ""
            if (r2 != 0) goto L17
            java.lang.String r2 = r6.text
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            r2 = r2 ^ r3
            if (r2 == r3) goto L17
            goto L1c
        L17:
            java.lang.String r2 = r6.text
            r7.onExtraCallback(r8, r1, r2)
        L1c:
            boolean r2 = r7.onWarmupCompleted(r8, r3)
            if (r2 != 0) goto L40
            int r2 = viva.republica.toss.network.model.loan.LoanProductBadge.onNavigationEvent
            int r2 = r2 + 65
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge.onWarmupCompleted = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L36
            java.lang.String r2 = r6.style
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L45
            goto L40
        L36:
            java.lang.String r6 = r6.style
            kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            r6 = 0
            r6.hashCode()
            throw r6
        L40:
            java.lang.String r2 = r6.style
            r7.onExtraCallback(r8, r3, r2)
        L45:
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L6a
            int r2 = viva.republica.toss.network.model.loan.LoanProductBadge.onNavigationEvent
            int r2 = r2 + 117
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge.onWarmupCompleted = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L62
            java.lang.String r2 = r6.type
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            r3 = 19
            int r3 = r3 / r1
            if (r2 != 0) goto L78
            goto L6a
        L62:
            java.lang.String r1 = r6.type
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L78
        L6a:
            java.lang.String r1 = r6.type
            r7.onExtraCallback(r8, r0, r1)
            int r1 = viva.republica.toss.network.model.loan.LoanProductBadge.onNavigationEvent
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge.onWarmupCompleted = r2
            int r1 = r1 % r0
        L78:
            r1 = 3
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L90
            int r2 = viva.republica.toss.network.model.loan.LoanProductBadge.onWarmupCompleted
            int r2 = r2 + 105
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanProductBadge.onNavigationEvent = r3
            int r2 = r2 % r0
            java.lang.String r0 = r6.size
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r0 != 0) goto L95
        L90:
            java.lang.String r6 = r6.size
            r7.onExtraCallback(r8, r1, r6)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanProductBadge.onExtraCallback(viva.republica.toss.network.model.loan.LoanProductBadge, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanProductBadge(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i7 = onWarmupCompleted + 29;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            str3 = "";
        }
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.text;
        int i4 = i2 + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.style;
        int i5 = i3 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.size;
        int i5 = i2 + 83;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
