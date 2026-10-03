package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MacData extends getEncryptedData {
    public static final Parcelable.Creator<MacData> CREATOR = new onExtraCallbackWithResult();
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final DynamicLoader IAuthTabCallbackStub;
    private final String asBinder;
    private final String asInterface;
    private final Boolean onExtraCallback;
    private final DynamicLoader onExtraCallbackWithResult;
    private final DynamicLoader onNavigationEvent;
    private final getEncryptedData onTransact;
    private final Map<String, Object> onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<MacData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final MacData[] newArray(int i) {
            return new MacData[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final MacData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(MacData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MacData(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(MacData.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), (DynamicLoader) parcel.readParcelable(MacData.class.getClassLoader()), (DynamicLoader) parcel.readParcelable(MacData.class.getClassLoader()));
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
        if (!(obj instanceof MacData)) {
            return false;
        }
        MacData macData = (MacData) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, macData.IAuthTabCallback) && Intrinsics.areEqual(this.asBinder, macData.asBinder) && Intrinsics.areEqual(this.onTransact, macData.onTransact) && Intrinsics.areEqual(this.onExtraCallback, macData.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, macData.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, macData.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, macData.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.asInterface, macData.asInterface) && Intrinsics.areEqual(this.onExtraCallbackWithResult, macData.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallbackStub, macData.IAuthTabCallbackStub);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        int iHashCode2 = this.asBinder.hashCode();
        getEncryptedData getencrypteddata = this.onTransact;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.onExtraCallback;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.onNavigationEvent;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.onWarmupCompleted;
        int iHashCode6 = map == null ? 0 : map.hashCode();
        int iHashCode7 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode8 = this.asInterface.hashCode();
        int iHashCode9 = this.onExtraCallbackWithResult.hashCode();
        DynamicLoader dynamicLoader2 = this.IAuthTabCallbackStub;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (dynamicLoader2 != null ? dynamicLoader2.hashCode() : 0);
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
    }

    public String toString() {
        return "DialogLayout(key=" + this.IAuthTabCallback + ", type=" + this.asBinder + ", onBack=" + this.onTransact + ", clearPreviousLayouts=" + this.onExtraCallback + ", navigationRightButton=" + this.onNavigationEvent + ", logParam=" + this.onWarmupCompleted + ", title=" + this.IAuthTabCallbackDefault + ", subTitle=" + this.asInterface + ", cta=" + this.onExtraCallbackWithResult + ", secondary=" + this.IAuthTabCallbackStub + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.asBinder);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onNavigationEvent, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onWarmupCompleted, parcel, i);
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeString(this.asInterface);
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
    }

    public MacData(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @NotNull DynamicLoader dynamicLoader2, @Nullable DynamicLoader dynamicLoader3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        this.IAuthTabCallback = str;
        this.asBinder = str2;
        this.onTransact = getencrypteddata;
        this.onExtraCallback = bool;
        this.onNavigationEvent = dynamicLoader;
        this.onWarmupCompleted = map;
        this.IAuthTabCallbackDefault = str3;
        this.asInterface = str4;
        this.onExtraCallbackWithResult = dynamicLoader2;
        this.IAuthTabCallbackStub = dynamicLoader3;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final String onTransact() {
        return this.IAuthTabCallbackDefault;
    }

    public final String IAuthTabCallbackStub() {
        return this.asInterface;
    }

    public final DynamicLoader onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final DynamicLoader onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }
}
