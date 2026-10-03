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
public final class BottomInformation implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    @SerializedName("htmlText")
    private final String htmlText;

    @SerializedName("iconUrl")
    private final String iconUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BottomInformation> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<BottomInformation> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BottomInformation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(parcel);
                throw null;
            }
            BottomInformation bottomInformationOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return bottomInformationOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BottomInformation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            BottomInformation[] bottomInformationArrOnExtraCallback = onExtraCallback(i);
            int i5 = onNavigationEvent + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return bottomInformationArrOnExtraCallback;
        }

        public final BottomInformation[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            BottomInformation[] bottomInformationArr = new BottomInformation[i];
            int i6 = i3 + 107;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return bottomInformationArr;
        }

        public final BottomInformation onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BottomInformation bottomInformation = new BottomInformation(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 55 / 0;
            }
            return bottomInformation;
        }
    }

    static {
        int i = IAuthTabCallback + 91;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomInformation() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 7;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return true;
        }
        if (!(obj instanceof BottomInformation)) {
            int i7 = i2 + 41;
            onWarmupCompleted = i7 % 128;
            return i7 % 2 == 0;
        }
        BottomInformation bottomInformation = (BottomInformation) obj;
        if (Intrinsics.areEqual(this.iconUrl, bottomInformation.iconUrl)) {
            if (Intrinsics.areEqual(this.htmlText, bottomInformation.htmlText)) {
                return true;
            }
            int i8 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = onExtraCallbackWithResult + 107;
        int i11 = i10 % 128;
        onWarmupCompleted = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 41;
        onExtraCallbackWithResult = i13 % 128;
        if (i13 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.iconUrl.hashCode() - 26) >> this.htmlText.hashCode() : (this.iconUrl.hashCode() * 31) + this.htmlText.hashCode();
        int i3 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BottomInformation(iconUrl=" + this.iconUrl + ", htmlText=" + this.htmlText + ")";
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.htmlText);
            int i5 = 81 / 0;
        } else {
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.htmlText);
        }
        int i6 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BottomInformation> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BottomInformation$$serializer bottomInformation$$serializer = BottomInformation$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return bottomInformation$$serializer;
        }
    }

    public /* synthetic */ BottomInformation(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str;
            int i2 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.htmlText = "";
            return;
        }
        this.htmlText = str2;
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public BottomInformation(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.iconUrl = str;
        this.htmlText = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.BottomInformation r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.BottomInformation.onExtraCallbackWithResult
            int r1 = r1 + 15
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.BottomInformation.onWarmupCompleted = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L19
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 != 0) goto L27
            goto L1f
        L19:
            boolean r1 = r7.onWarmupCompleted(r8, r4)
            if (r1 != 0) goto L27
        L1f:
            java.lang.String r1 = r6.iconUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L2c
        L27:
            java.lang.String r1 = r6.iconUrl
            r7.onExtraCallback(r8, r4, r1)
        L2c:
            boolean r1 = r7.onWarmupCompleted(r8, r3)
            if (r1 != 0) goto L51
            int r1 = viva.republica.toss.network.model.loan.BottomInformation.onExtraCallbackWithResult
            int r1 = r1 + 105
            int r5 = r1 % 128
            viva.republica.toss.network.model.loan.BottomInformation.onWarmupCompleted = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L49
            java.lang.String r1 = r6.htmlText
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r2 = 78
            int r2 = r2 / r4
            if (r1 != 0) goto L5f
            goto L51
        L49:
            java.lang.String r1 = r6.htmlText
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L5f
        L51:
            java.lang.String r6 = r6.htmlText
            r7.onExtraCallback(r8, r3, r6)
            int r6 = viva.republica.toss.network.model.loan.BottomInformation.onWarmupCompleted
            int r6 = r6 + 117
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.BottomInformation.onExtraCallbackWithResult = r7
            int r6 = r6 % r0
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.BottomInformation.IAuthTabCallback(viva.republica.toss.network.model.loan.BottomInformation, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BottomInformation(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUrl;
        int i5 = i2 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.htmlText;
        int i5 = i3 + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
