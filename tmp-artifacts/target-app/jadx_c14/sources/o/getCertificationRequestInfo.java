package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueArsVerifyFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCertificationRequestInfo extends getEncryptedData {
    public static final Parcelable.Creator<getCertificationRequestInfo> CREATOR = new onExtraCallback();
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final getEncryptedData IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private final String access000;
    private final createRewardedVideoAd asBinder;
    private final DynamicLoader asInterface;
    private final String onExtraCallback;
    private final Boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Map<String, Object> onTransact;
    private final String onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<getCertificationRequestInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getCertificationRequestInfo[] newArray(int i) {
            return new getCertificationRequestInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getCertificationRequestInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getCertificationRequestInfo(string, string2, boolValueOf, (getEncryptedData) parcel.readParcelable(getCertificationRequestInfo.class.getClassLoader()), (DynamicLoader) parcel.readParcelable(getCertificationRequestInfo.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), (createRewardedVideoAd) parcel.readParcelable(getCertificationRequestInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeString(this.access000);
        Boolean bool = this.onExtraCallbackWithResult;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        parcel.writeParcelable(this.asInterface, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onTransact, parcel, i);
        parcel.writeParcelable(this.asBinder, i);
        parcel.writeString(this.IAuthTabCallbackStubProxy);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.onNavigationEvent);
    }

    public getCertificationRequestInfo(@NotNull String str, @NotNull String str2, @Nullable Boolean bool, @Nullable getEncryptedData getencrypteddata, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createRewardedVideoAd createrewardedvideoad, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createrewardedvideoad, "");
        this.IAuthTabCallbackDefault = str;
        this.access000 = str2;
        this.onExtraCallbackWithResult = bool;
        this.IAuthTabCallbackStub = getencrypteddata;
        this.asInterface = dynamicLoader;
        this.onTransact = map;
        this.asBinder = createrewardedvideoad;
        this.IAuthTabCallbackStubProxy = str3;
        this.onWarmupCompleted = str4;
        this.onExtraCallback = str5;
        this.IAuthTabCallback = str6;
        this.onNavigationEvent = str7;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onTransact;
    }

    public final createRewardedVideoAd asInterface() {
        return this.asBinder;
    }

    public final String access000() {
        return this.IAuthTabCallbackStubProxy;
    }

    public final String IAuthTabCallbackStub() {
        return this.onWarmupCompleted;
    }

    public final String onTransact() {
        return this.onExtraCallback;
    }

    public final String onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueArsVerifyFragment.class));
        onNavigationEvent(rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, true);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
