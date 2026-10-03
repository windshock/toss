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
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment;
import viva.republica.toss.network.model.cardsales.funnel.RetryPolicy;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRC2ParameterVersion extends getEncryptedData {
    public static final Parcelable.Creator<getRC2ParameterVersion> CREATOR = new onExtraCallback();
    private final Map<String, Object> IAuthTabCallback;
    private final DynamicLoader IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final getEncryptedData asInterface;
    private final Boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final List<String> onNavigationEvent;
    private final RetryPolicy onTransact;
    private final String onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<getRC2ParameterVersion> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getRC2ParameterVersion createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getRC2ParameterVersion.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getRC2ParameterVersion(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getRC2ParameterVersion.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.createStringArrayList(), parcel.readString(), (RetryPolicy) parcel.readParcelable(getRC2ParameterVersion.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getRC2ParameterVersion[] newArray(int i) {
            return new getRC2ParameterVersion[i];
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
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeParcelable(this.asInterface, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallback, parcel, i);
        parcel.writeStringList(this.onNavigationEvent);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeParcelable(this.onTransact, i);
    }

    public getRC2ParameterVersion(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull List<String> list, @Nullable String str3, @Nullable RetryPolicy retryPolicy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallbackStub = str2;
        this.asInterface = getencrypteddata;
        this.onExtraCallback = bool;
        this.IAuthTabCallbackDefault = dynamicLoader;
        this.IAuthTabCallback = map;
        this.onNavigationEvent = list;
        this.onWarmupCompleted = str3;
        this.onTransact = retryPolicy;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final List<String> onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final RetryPolicy asInterface() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueSubmitFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
