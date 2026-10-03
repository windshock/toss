package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.network.model.cardsales.funnel.RetryPolicy;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getModulus extends getEncryptedData {
    public static final Parcelable.Creator<getModulus> CREATOR = new onNavigationEvent();
    private final String IAuthTabCallback;
    private final Map<String, Object> IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallback_Parcel;
    private final RetryPolicy access100;
    private getDigestAlgorithms<getModulus> asBinder;
    private final getEncryptedData asInterface;
    private final String getInterfaceDescriptor;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final createAdSizeApi onNavigationEvent;
    private final DynamicLoader onTransact;
    private final Boolean onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<getModulus> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getModulus createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getModulus.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getModulus(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getModulus.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (RetryPolicy) parcel.readParcelable(getModulus.class.getClassLoader()), (createAdSizeApi) parcel.readParcelable(getModulus.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getModulus[] newArray(int i) {
            return new getModulus[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.IAuthTabCallback_Parcel);
        parcel.writeParcelable(this.asInterface, i);
        Boolean bool = this.onWarmupCompleted;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onTransact, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, parcel, i);
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeString(this.getInterfaceDescriptor);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeParcelable(this.access100, i);
        parcel.writeParcelable(this.onNavigationEvent, i);
    }

    public getModulus(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable RetryPolicy retryPolicy, @Nullable createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.onExtraCallback = str;
        this.IAuthTabCallback_Parcel = str2;
        this.asInterface = getencrypteddata;
        this.onWarmupCompleted = bool;
        this.onTransact = dynamicLoader;
        this.IAuthTabCallbackDefault = map;
        this.IAuthTabCallback = str3;
        this.IAuthTabCallbackStub = str4;
        this.getInterfaceDescriptor = str5;
        this.onExtraCallbackWithResult = str6;
        this.access100 = retryPolicy;
        this.onNavigationEvent = createadsizeapi;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    public final String asInterface() {
        return this.IAuthTabCallbackStub;
    }

    public final String access000() {
        return this.getInterfaceDescriptor;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final RetryPolicy onTransact() {
        return this.access100;
    }

    public final createAdSizeApi onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final getDigestAlgorithms<getModulus> IAuthTabCallbackStub() {
        return this.asBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.asBinder = getdigestalgorithms;
    }
}
