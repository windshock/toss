package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.PopupLayoutExternalSyntheticLambda1;
import o.TextKtExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RC2CBCParameter extends getEncryptedData {
    public static final Parcelable.Creator<RC2CBCParameter> CREATOR = new onNavigationEvent();
    private final DynamicLoader IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final createNativeComponentTagApi asInterface;
    private final String onExtraCallback;
    private final getEncryptedData onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final String onTransact;
    private final Boolean onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<RC2CBCParameter> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final RC2CBCParameter[] newArray(int i) {
            return new RC2CBCParameter[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final RC2CBCParameter createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(RC2CBCParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RC2CBCParameter(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(RC2CBCParameter.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), (createNativeComponentTagApi) parcel.readParcelable(RC2CBCParameter.class.getClassLoader()), parcel.readString());
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
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeString(this.onExtraCallback);
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
        Boolean bool = this.onWarmupCompleted;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallback, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onNavigationEvent, parcel, i);
        parcel.writeParcelable(this.asInterface, i);
        parcel.writeString(this.onTransact);
    }

    public RC2CBCParameter(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createNativeComponentTagApi createnativecomponenttagapi, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createnativecomponenttagapi, "");
        this.IAuthTabCallbackStub = str;
        this.onExtraCallback = str2;
        this.onExtraCallbackWithResult = getencrypteddata;
        this.onWarmupCompleted = bool;
        this.IAuthTabCallback = dynamicLoader;
        this.onNavigationEvent = map;
        this.asInterface = createnativecomponenttagapi;
        this.onTransact = str3;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        if (this.onTransact != null) {
            cardIssueOverviewViewModel.onExtraCallback(new BaseRoundCornerProgressBar1(StringsKt.replace$default(this.onTransact, "-", "", false, 4, (Object) null)));
            cardIssueOverviewViewModel.onWarmupCompleted(new BaseRoundCornerProgressBar1((CharSequence) StringsKt.split$default(this.onTransact, new String[]{"-"}, false, 0, 6, (Object) null).get(1)));
        }
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = typographyKtExternalSyntheticLambda0.IAuthTabCallbackDefault().onExtraCallback(R.navigation.nav_credit_card_issue_sms);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onNavigationEvent(access100());
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.IAuthTabCallback("navigator", new TextKtExternalSyntheticLambda6.onExtraCallback().onNavigationEvent(new PopupLayoutExternalSyntheticLambda1.onWarmupCompleted(getDigestAlgorithms.class)).onExtraCallbackWithResult(getDigestAlgorithms.onExtraCallback((getDigestAlgorithms) getdigestalgorithms, (getEncryptedData) null, 0, 0, (getEncryptedData) null, true, (getDigestAlgorithms) null, 47, (Object) null)).onWarmupCompleted());
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
    }
}
