package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getExponent2 extends getEncryptedData {
    public static final Parcelable.Creator<getExponent2> CREATOR = new onWarmupCompleted();
    private final String IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackDefault;
    private final String asBinder;
    private final Map<String, Object> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final String onTransact;
    private final DynamicLoader onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<getExponent2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getExponent2[] newArray(int i) {
            return new getExponent2[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getExponent2 createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getExponent2.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getExponent2(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getExponent2.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString());
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
        if (!(obj instanceof getExponent2)) {
            return false;
        }
        getExponent2 getexponent2 = (getExponent2) obj;
        return Intrinsics.areEqual(this.onTransact, getexponent2.onTransact) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getexponent2.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, getexponent2.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onNavigationEvent, getexponent2.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, getexponent2.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, getexponent2.onExtraCallback) && Intrinsics.areEqual(this.asBinder, getexponent2.asBinder) && Intrinsics.areEqual(this.IAuthTabCallback, getexponent2.IAuthTabCallback);
    }

    public int hashCode() {
        int iHashCode = this.onTransact.hashCode();
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        getEncryptedData getencrypteddata = this.IAuthTabCallbackDefault;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.onNavigationEvent;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.onWarmupCompleted;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.onExtraCallback;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.asBinder.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
    }

    public String toString() {
        return "ToastLayout(type=" + this.onTransact + ", key=" + this.onExtraCallbackWithResult + ", onBack=" + this.IAuthTabCallbackDefault + ", clearPreviousLayouts=" + this.onNavigationEvent + ", navigationRightButton=" + this.onWarmupCompleted + ", logParam=" + this.onExtraCallback + ", tdsIconName=" + this.asBinder + ", message=" + this.IAuthTabCallback + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onTransact);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Boolean bool = this.onNavigationEvent;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onWarmupCompleted, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallback, parcel, i);
        parcel.writeString(this.asBinder);
        parcel.writeString(this.IAuthTabCallback);
    }

    public getExponent2(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onTransact = str;
        this.onExtraCallbackWithResult = str2;
        this.IAuthTabCallbackDefault = getencrypteddata;
        this.onNavigationEvent = bool;
        this.onWarmupCompleted = dynamicLoader;
        this.onExtraCallback = map;
        this.asBinder = str3;
        this.IAuthTabCallback = str4;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final String onWarmupCompleted() {
        return this.asBinder;
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }
}
