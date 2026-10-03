package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueTermsWebFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RSAESOAEPparams extends getEncryptedData {
    public static final Parcelable.Creator<RSAESOAEPparams> CREATOR = new IAuthTabCallback();
    private final Boolean IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final String asInterface;
    private final String onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final DynamicLoader onNavigationEvent;
    private final getEncryptedData onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<RSAESOAEPparams> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final RSAESOAEPparams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(RSAESOAEPparams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RSAESOAEPparams(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(RSAESOAEPparams.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final RSAESOAEPparams[] newArray(int i) {
            return new RSAESOAEPparams[i];
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
        parcel.writeString(this.asInterface);
        parcel.writeString(this.onExtraCallback);
        parcel.writeParcelable(this.onWarmupCompleted, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onNavigationEvent, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallbackWithResult, parcel, i);
        parcel.writeString(this.IAuthTabCallbackStub);
    }

    public RSAESOAEPparams(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.asInterface = str;
        this.onExtraCallback = str2;
        this.onWarmupCompleted = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.onNavigationEvent = dynamicLoader;
        this.onExtraCallbackWithResult = map;
        this.IAuthTabCallbackStub = str3;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallback;
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
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CreditCardIssueTermsWebFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
