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

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingBadge implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("color")
    private final String color;

    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanRefinancingBadge> CREATOR = new onExtraCallback();

    public static final class onExtraCallback implements Parcelable.Creator<LoanRefinancingBadge> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingBadge createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingBadge loanRefinancingBadgeOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallback + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return loanRefinancingBadgeOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanRefinancingBadge[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 29;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return onWarmupCompleted(i);
            }
            onWarmupCompleted(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LoanRefinancingBadge onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanRefinancingBadge loanRefinancingBadge = new LoanRefinancingBadge(parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
            return loanRefinancingBadge;
        }

        public final LoanRefinancingBadge[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 117;
            onWarmupCompleted = i3 % 128;
            LoanRefinancingBadge[] loanRefinancingBadgeArr = new LoanRefinancingBadge[i];
            if (i3 % 2 != 0) {
                return loanRefinancingBadgeArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 97;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoanRefinancingBadge() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LoanRefinancingBadge)) {
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 != 0;
        }
        LoanRefinancingBadge loanRefinancingBadge = (LoanRefinancingBadge) obj;
        if (!Intrinsics.areEqual(this.title, loanRefinancingBadge.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.color, loanRefinancingBadge.color)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.title.hashCode() >>> 4) % this.color.hashCode() : (this.title.hashCode() * 31) + this.color.hashCode();
        int i3 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingBadge(title=" + this.title + ", color=" + this.color + ")";
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
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
        int i3 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.title);
            parcel.writeString(this.color);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.color);
        int i5 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanRefinancingBadge> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingBadge$$serializer loanRefinancingBadge$$serializer = LoanRefinancingBadge$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return loanRefinancingBadge$$serializer;
        }
    }

    public /* synthetic */ LoanRefinancingBadge(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            this.color = str2;
            return;
        }
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        this.color = "";
    }

    public LoanRefinancingBadge(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.color = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanRefinancingBadge r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanRefinancingBadge.onExtraCallbackWithResult
            int r1 = r1 + 35
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBadge.IAuthTabCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L18
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 != 0) goto L26
            goto L1e
        L18:
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 != 0) goto L26
        L1e:
            java.lang.String r1 = r6.title
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L2b
        L26:
            java.lang.String r1 = r6.title
            r7.onExtraCallback(r8, r3, r1)
        L2b:
            r1 = 1
            boolean r4 = r7.onWarmupCompleted(r8, r1)
            r4 = r4 ^ r1
            if (r4 == 0) goto L52
            int r4 = viva.republica.toss.network.model.loan.LoanRefinancingBadge.IAuthTabCallback
            int r4 = r4 + 37
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBadge.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L4a
            java.lang.String r4 = r6.color
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            r4 = 35
            int r4 = r4 / r3
            if (r2 != 0) goto L57
            goto L52
        L4a:
            java.lang.String r4 = r6.color
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
            if (r2 != 0) goto L57
        L52:
            java.lang.String r6 = r6.color
            r7.onExtraCallback(r8, r1, r6)
        L57:
            int r6 = viva.republica.toss.network.model.loan.LoanRefinancingBadge.onExtraCallbackWithResult
            int r6 = r6 + 77
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingBadge.IAuthTabCallback = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L65
            r6 = 21
            int r6 = r6 / r3
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingBadge.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanRefinancingBadge, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanRefinancingBadge(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 1;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.color;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
