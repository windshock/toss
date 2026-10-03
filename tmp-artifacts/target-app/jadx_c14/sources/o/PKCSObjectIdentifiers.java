package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueLoadingFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PKCSObjectIdentifiers extends getEncryptedData {
    public static final Parcelable.Creator<PKCSObjectIdentifiers> CREATOR = new onExtraCallback();
    private final DynamicLoader IAuthTabCallback;
    private final List<String> IAuthTabCallbackDefault;
    private final String asInterface;
    private final Boolean onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final FbValidationUtils onNavigationEvent;
    private final getEncryptedData onTransact;
    private final String onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<PKCSObjectIdentifiers> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final PKCSObjectIdentifiers[] newArray(int i) {
            return new PKCSObjectIdentifiers[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final PKCSObjectIdentifiers createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(PKCSObjectIdentifiers.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PKCSObjectIdentifiers(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(PKCSObjectIdentifiers.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), (FbValidationUtils) parcel.readParcelable(PKCSObjectIdentifiers.class.getClassLoader()), parcel.createStringArrayList());
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
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallback, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallbackWithResult, parcel, i);
        parcel.writeParcelable(this.onNavigationEvent, i);
        parcel.writeStringList(this.IAuthTabCallbackDefault);
    }

    public PKCSObjectIdentifiers(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull FbValidationUtils fbValidationUtils, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fbValidationUtils, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.asInterface = str;
        this.onWarmupCompleted = str2;
        this.onTransact = getencrypteddata;
        this.onExtraCallback = bool;
        this.IAuthTabCallback = dynamicLoader;
        this.onExtraCallbackWithResult = map;
        this.onNavigationEvent = fbValidationUtils;
        this.IAuthTabCallbackDefault = list;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onWarmupCompleted;
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
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final FbValidationUtils onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final List<String> onExtraCallbackWithResult() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueLoadingFragment.class));
        onNavigationEvent(rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, true);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
