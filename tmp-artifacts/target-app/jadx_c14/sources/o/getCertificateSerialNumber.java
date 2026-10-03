package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCertificateSerialNumber extends getEncryptedData {
    public static final Parcelable.Creator<getCertificateSerialNumber> CREATOR = new IAuthTabCallback();
    private final Boolean IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final DynamicLoader onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final getEncryptedData onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<getCertificateSerialNumber> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getCertificateSerialNumber createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getCertificateSerialNumber.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getCertificateSerialNumber(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getCertificateSerialNumber.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getCertificateSerialNumber[] newArray(int i) {
            return new getCertificateSerialNumber[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCertificateSerialNumber)) {
            return false;
        }
        getCertificateSerialNumber getcertificateserialnumber = (getCertificateSerialNumber) obj;
        return Intrinsics.areEqual(this.IAuthTabCallbackStub, getcertificateserialnumber.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getcertificateserialnumber.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onWarmupCompleted, getcertificateserialnumber.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, getcertificateserialnumber.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, getcertificateserialnumber.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, getcertificateserialnumber.onNavigationEvent);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallbackStub.hashCode();
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        getEncryptedData getencrypteddata = this.onWarmupCompleted;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.IAuthTabCallback;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.onExtraCallback;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.onNavigationEvent;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0);
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
    }

    public String toString() {
        return "DccGuideLayout(type=" + this.IAuthTabCallbackStub + ", key=" + this.onExtraCallbackWithResult + ", onBack=" + this.onWarmupCompleted + ", clearPreviousLayouts=" + this.IAuthTabCallback + ", navigationRightButton=" + this.onExtraCallback + ", logParam=" + this.onNavigationEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeParcelable(this.onWarmupCompleted, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onExtraCallback, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onNavigationEvent, parcel, i);
    }

    public getCertificateSerialNumber(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallbackStub = str;
        this.onExtraCallbackWithResult = str2;
        this.onWarmupCompleted = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.onExtraCallback = dynamicLoader;
        this.onNavigationEvent = map;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onNavigationEvent;
    }
}
