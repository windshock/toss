package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCertSignSelectFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DHParameter extends getEncryptedData {
    public static final Parcelable.Creator<DHParameter> CREATOR = new onWarmupCompleted();
    private final boolean IAuthTabCallback;
    private getDigestAlgorithms<DHParameter> IAuthTabCallbackDefault;
    private final getEncryptedData IAuthTabCallbackStub;
    private final getModulus access000;
    private final String access100;
    private final Map<String, Object> asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final getKeyDerivationFunc onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final DynamicLoader onTransact;
    private final String onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<DHParameter> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final DHParameter createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(DHParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DHParameter(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(DHParameter.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : getModulus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? getKeyDerivationFunc.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final DHParameter[] newArray(int i) {
            return new DHParameter[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.access100);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Boolean bool = this.onNavigationEvent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.onTransact, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.asBinder, parcel, i);
        parcel.writeString(this.asInterface);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeInt(this.IAuthTabCallback ? 1 : 0);
        getModulus getmodulus = this.access000;
        if (getmodulus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            getmodulus.writeToParcel(parcel, i);
        }
        getKeyDerivationFunc getkeyderivationfunc = this.onExtraCallbackWithResult;
        if (getkeyderivationfunc == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            getkeyderivationfunc.writeToParcel(parcel, i);
        }
    }

    public DHParameter(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, boolean z, @Nullable getModulus getmodulus, @Nullable getKeyDerivationFunc getkeyderivationfunc) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onExtraCallback = str;
        this.access100 = str2;
        this.IAuthTabCallbackStub = getencrypteddata;
        this.onNavigationEvent = bool;
        this.onTransact = dynamicLoader;
        this.asBinder = map;
        this.asInterface = str3;
        this.onWarmupCompleted = str4;
        this.IAuthTabCallback = z;
        this.access000 = getmodulus;
        this.onExtraCallbackWithResult = getkeyderivationfunc;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.asBinder;
    }

    public final String asInterface() {
        return this.asInterface;
    }

    public final boolean onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final getModulus IAuthTabCallbackStub() {
        return this.access000;
    }

    public final getKeyDerivationFunc onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.IAuthTabCallbackDefault = getdigestalgorithms;
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueCertSignSelectFragment.class));
        onNavigationEvent(rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, true);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
