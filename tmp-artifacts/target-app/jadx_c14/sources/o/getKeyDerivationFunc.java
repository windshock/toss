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
public final class getKeyDerivationFunc extends getEncryptedData {
    public static final Parcelable.Creator<getKeyDerivationFunc> CREATOR = new onWarmupCompleted();
    private final String IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackDefault;
    private getDigestAlgorithms<getKeyDerivationFunc> IAuthTabCallbackStub;
    private final String access000;
    private final String access100;
    private final DynamicLoader asBinder;
    private final Map<String, Object> asInterface;
    private final RetryPolicy getInterfaceDescriptor;
    private final Boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final createAdSizeApi onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<getKeyDerivationFunc> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getKeyDerivationFunc[] newArray(int i) {
            return new getKeyDerivationFunc[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getKeyDerivationFunc createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getKeyDerivationFunc.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getKeyDerivationFunc(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getKeyDerivationFunc.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (RetryPolicy) parcel.readParcelable(getKeyDerivationFunc.class.getClassLoader()), (createAdSizeApi) parcel.readParcelable(getKeyDerivationFunc.class.getClassLoader()));
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
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.access100);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asBinder, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.asInterface, parcel, i);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.onTransact);
        parcel.writeString(this.access000);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeParcelable(this.getInterfaceDescriptor, i);
        parcel.writeParcelable(this.onWarmupCompleted, i);
    }

    public getKeyDerivationFunc(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable RetryPolicy retryPolicy, @Nullable createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.IAuthTabCallback = str;
        this.access100 = str2;
        this.IAuthTabCallbackDefault = getencrypteddata;
        this.onExtraCallback = bool;
        this.asBinder = dynamicLoader;
        this.asInterface = map;
        this.onNavigationEvent = str3;
        this.onTransact = str4;
        this.access000 = str5;
        this.onExtraCallbackWithResult = str6;
        this.getInterfaceDescriptor = retryPolicy;
        this.onWarmupCompleted = createadsizeapi;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.asInterface;
    }

    public final String onExtraCallbackWithResult() {
        return this.onTransact;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.IAuthTabCallbackStub = getdigestalgorithms;
    }
}
