package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCoinVerifyFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getMaskGenAlgorithm extends getEncryptedData {
    public static final Parcelable.Creator<getMaskGenAlgorithm> CREATOR = new onExtraCallbackWithResult();
    private final Boolean IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackDefault;
    private final String asBinder;
    private final createRewardedVideoAd asInterface;
    private final Map<String, Object> onExtraCallback;
    private final Boolean onExtraCallbackWithResult;
    private final DynamicLoader onNavigationEvent;
    private final String onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getMaskGenAlgorithm> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getMaskGenAlgorithm[] newArray(int i) {
            return new getMaskGenAlgorithm[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getMaskGenAlgorithm createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getMaskGenAlgorithm.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(getMaskGenAlgorithm.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            createRewardedVideoAd createrewardedvideoad = (createRewardedVideoAd) parcel.readParcelable(getMaskGenAlgorithm.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getMaskGenAlgorithm(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, createrewardedvideoad, boolValueOf2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.asBinder);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Boolean bool = this.onExtraCallbackWithResult;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.onNavigationEvent, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallback, parcel, i);
        parcel.writeParcelable(this.asInterface, i);
        Boolean bool2 = this.IAuthTabCallback;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public getMaskGenAlgorithm(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createRewardedVideoAd createrewardedvideoad, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createrewardedvideoad, "");
        this.onWarmupCompleted = str;
        this.asBinder = str2;
        this.IAuthTabCallbackDefault = getencrypteddata;
        this.onExtraCallbackWithResult = bool;
        this.onNavigationEvent = dynamicLoader;
        this.onExtraCallback = map;
        this.asInterface = createrewardedvideoad;
        this.IAuthTabCallback = bool2;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final createRewardedVideoAd onExtraCallbackWithResult() {
        return this.asInterface;
    }

    public final Boolean onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueCoinVerifyFragment.class));
        onNavigationEvent(rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, true);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
