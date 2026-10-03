package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueRrnInputFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIterations extends getEncryptedData {
    public static final Parcelable.Creator<getIterations> CREATOR = new IAuthTabCallback();
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final DynamicLoader asBinder;
    private final getEncryptedData asInterface;
    private final String onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final String onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<getIterations> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getIterations[] newArray(int i) {
            return new getIterations[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getIterations createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getIterations.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getIterations(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getIterations.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString());
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
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeParcelable(this.asInterface, i);
        Boolean bool = this.onNavigationEvent;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asBinder, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallbackWithResult, parcel, i);
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.onWarmupCompleted);
    }

    public getIterations(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.IAuthTabCallbackDefault = str2;
        this.asInterface = getencrypteddata;
        this.onNavigationEvent = bool;
        this.asBinder = dynamicLoader;
        this.onExtraCallbackWithResult = map;
        this.onExtraCallback = str3;
        this.onWarmupCompleted = str4;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CreditCardIssueRrnInputFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
