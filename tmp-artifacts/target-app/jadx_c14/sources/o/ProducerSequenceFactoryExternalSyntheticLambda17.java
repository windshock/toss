package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanProductBadge;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda17 implements Parcelable {
    public static final Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda17> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("htmlText")
    private final String htmlText;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("interestRate")
    private final float interestRate;

    @SerializedName("prevInterestRate")
    private final float prevInterestRate;

    @SerializedName("productBadge")
    private final LoanProductBadge productBadge;

    @SerializedName("productBadgeWithPrimeRate")
    private final LoanProductBadge productBadgeWithPrimeRate;

    @SerializedName("text")
    private final String text;

    public static final class onNavigationEvent implements Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda17> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final ProducerSequenceFactoryExternalSyntheticLambda17 IAuthTabCallback(Parcel parcel) {
            LoanProductBadge loanProductBadgeCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LoanProductBadge loanProductBadgeCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                int i2 = onWarmupCompleted + 91;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    loanProductBadgeCreateFromParcel2.hashCode();
                    throw null;
                }
                loanProductBadgeCreateFromParcel = null;
            } else {
                loanProductBadgeCreateFromParcel = LoanProductBadge.CREATOR.createFromParcel(parcel);
            }
            LoanProductBadge loanProductBadge = loanProductBadgeCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i3 = onNavigationEvent + 79;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                if (i3 % 2 == 0) {
                    loanProductBadgeCreateFromParcel2.hashCode();
                    throw null;
                }
                int i5 = i4 + 79;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                loanProductBadgeCreateFromParcel2 = LoanProductBadge.CREATOR.createFromParcel(parcel);
            }
            return new ProducerSequenceFactoryExternalSyntheticLambda17(string, f, f2, string2, string3, loanProductBadge, loanProductBadgeCreateFromParcel2);
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda17[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda17[] producerSequenceFactoryExternalSyntheticLambda17Arr = new ProducerSequenceFactoryExternalSyntheticLambda17[i];
            int i6 = i3 + 61;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return producerSequenceFactoryExternalSyntheticLambda17Arr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda17 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17IAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onNavigationEvent + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return producerSequenceFactoryExternalSyntheticLambda17IAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda17[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda17[] producerSequenceFactoryExternalSyntheticLambda17ArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onNavigationEvent + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
            }
            return producerSequenceFactoryExternalSyntheticLambda17ArrIAuthTabCallback;
        }
    }

    static {
        int i = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public ProducerSequenceFactoryExternalSyntheticLambda17() {
        this(null, 0.0f, 0.0f, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ProducerSequenceFactoryExternalSyntheticLambda17)) {
            int i4 = onWarmupCompleted + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ProducerSequenceFactoryExternalSyntheticLambda17 producerSequenceFactoryExternalSyntheticLambda17 = (ProducerSequenceFactoryExternalSyntheticLambda17) obj;
        if (!Intrinsics.areEqual(this.iconUrl, producerSequenceFactoryExternalSyntheticLambda17.iconUrl) || Float.compare(this.prevInterestRate, producerSequenceFactoryExternalSyntheticLambda17.prevInterestRate) != 0 || Float.compare(this.interestRate, producerSequenceFactoryExternalSyntheticLambda17.interestRate) != 0 || !Intrinsics.areEqual(this.text, producerSequenceFactoryExternalSyntheticLambda17.text)) {
            return false;
        }
        if (Intrinsics.areEqual(this.htmlText, producerSequenceFactoryExternalSyntheticLambda17.htmlText)) {
            return Intrinsics.areEqual(this.productBadge, producerSequenceFactoryExternalSyntheticLambda17.productBadge) && Intrinsics.areEqual(this.productBadgeWithPrimeRate, producerSequenceFactoryExternalSyntheticLambda17.productBadgeWithPrimeRate);
        }
        int i6 = onNavigationEvent + 11;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.iconUrl.hashCode();
        int iHashCode3 = Float.hashCode(this.prevInterestRate);
        int iHashCode4 = Float.hashCode(this.interestRate);
        int iHashCode5 = this.text.hashCode();
        int iHashCode6 = this.htmlText.hashCode();
        LoanProductBadge loanProductBadge = this.productBadge;
        int iHashCode7 = 0;
        if (loanProductBadge == null) {
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = loanProductBadge.hashCode();
            int i4 = onWarmupCompleted + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        LoanProductBadge loanProductBadge2 = this.productBadgeWithPrimeRate;
        if (loanProductBadge2 != null) {
            int i6 = onNavigationEvent + 87;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                loanProductBadge2.hashCode();
                throw null;
            }
            iHashCode7 = loanProductBadge2.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrimeRateInformation(iconUrl=" + this.iconUrl + ", prevInterestRate=" + this.prevInterestRate + ", interestRate=" + this.interestRate + ", text=" + this.text + ", htmlText=" + this.htmlText + ", productBadge=" + this.productBadge + ", productBadgeWithPrimeRate=" + this.productBadgeWithPrimeRate + ")";
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeFloat(this.prevInterestRate);
        parcel.writeFloat(this.interestRate);
        parcel.writeString(this.text);
        parcel.writeString(this.htmlText);
        LoanProductBadge loanProductBadge = this.productBadge;
        if (loanProductBadge == null) {
            int i3 = onWarmupCompleted + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            loanProductBadge.writeToParcel(parcel, i);
        }
        LoanProductBadge loanProductBadge2 = this.productBadgeWithPrimeRate;
        if (loanProductBadge2 != null) {
            parcel.writeInt(1);
            loanProductBadge2.writeToParcel(parcel, i);
            return;
        }
        parcel.writeInt(0);
        int i4 = onNavigationEvent + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }

    public ProducerSequenceFactoryExternalSyntheticLambda17(@NotNull String str, float f, float f2, @NotNull String str2, @NotNull String str3, @Nullable LoanProductBadge loanProductBadge, @Nullable LoanProductBadge loanProductBadge2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.iconUrl = str;
        this.prevInterestRate = f;
        this.interestRate = f2;
        this.text = str2;
        this.htmlText = str3;
        this.productBadge = loanProductBadge;
        this.productBadgeWithPrimeRate = loanProductBadge2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda17(String str, float f, float f2, String str2, String str3, LoanProductBadge loanProductBadge, LoanProductBadge loanProductBadge2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        float f3;
        String str4;
        LoanProductBadge loanProductBadge3;
        String str5 = "";
        String str6 = (i & 1) != 0 ? "" : str;
        float f4 = 0.0f;
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
        } else {
            f4 = f2;
        }
        if ((i & 8) != 0) {
            int i6 = onNavigationEvent + 103;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str4 = "";
        } else {
            str4 = str2;
        }
        Object obj = null;
        if ((i & 16) != 0) {
            int i8 = onNavigationEvent + 37;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            int i9 = onNavigationEvent + 43;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            loanProductBadge3 = null;
        } else {
            loanProductBadge3 = loanProductBadge;
        }
        this(str6, f3, f4, str4, str5, loanProductBadge3, (i & 64) != 0 ? null : loanProductBadge2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        String str = new DecimalFormat("#.####", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(Float.valueOf(this.prevInterestRate)) + "%";
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
