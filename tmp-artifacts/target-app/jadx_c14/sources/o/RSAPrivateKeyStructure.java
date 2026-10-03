package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueTossHanaCompleteFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RSAPrivateKeyStructure extends getEncryptedData {
    public static final Parcelable.Creator<RSAPrivateKeyStructure> CREATOR = new IAuthTabCallback();
    private final Boolean IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final DynamicLoader IAuthTabCallbackStub;
    private final getEncryptedData asBinder;
    private final boolean asInterface;
    private final String onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Map<String, Object> onTransact;
    private final boolean onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<RSAPrivateKeyStructure> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final RSAPrivateKeyStructure createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(RSAPrivateKeyStructure.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RSAPrivateKeyStructure(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(RSAPrivateKeyStructure.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final RSAPrivateKeyStructure[] newArray(int i) {
            return new RSAPrivateKeyStructure[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSAPrivateKeyStructure)) {
            return false;
        }
        RSAPrivateKeyStructure rSAPrivateKeyStructure = (RSAPrivateKeyStructure) obj;
        return Intrinsics.areEqual(this.IAuthTabCallbackDefault, rSAPrivateKeyStructure.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onExtraCallback, rSAPrivateKeyStructure.onExtraCallback) && Intrinsics.areEqual(this.asBinder, rSAPrivateKeyStructure.asBinder) && Intrinsics.areEqual(this.IAuthTabCallback, rSAPrivateKeyStructure.IAuthTabCallback) && Intrinsics.areEqual(this.IAuthTabCallbackStub, rSAPrivateKeyStructure.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onTransact, rSAPrivateKeyStructure.onTransact) && this.onWarmupCompleted == rSAPrivateKeyStructure.onWarmupCompleted && Intrinsics.areEqual(this.onNavigationEvent, rSAPrivateKeyStructure.onNavigationEvent) && this.asInterface == rSAPrivateKeyStructure.asInterface && this.onExtraCallbackWithResult == rSAPrivateKeyStructure.onExtraCallbackWithResult;
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode2 = this.onExtraCallback.hashCode();
        getEncryptedData getencrypteddata = this.asBinder;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.IAuthTabCallback;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.IAuthTabCallbackStub;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.onTransact;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.asInterface)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return "TossHanaPlccCompleteLayout(type=" + this.IAuthTabCallbackDefault + ", key=" + this.onExtraCallback + ", onBack=" + this.asBinder + ", clearPreviousLayouts=" + this.IAuthTabCallback + ", navigationRightButton=" + this.IAuthTabCallbackStub + ", logParam=" + this.onTransact + ", directIssueCard=" + this.onWarmupCompleted + ", color=" + this.onNavigationEvent + ", traffic=" + this.asInterface + ", isPayAccountHana=" + this.onExtraCallbackWithResult + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeString(this.onExtraCallback);
        parcel.writeParcelable(this.asBinder, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onTransact, parcel, i);
        parcel.writeInt(this.onWarmupCompleted ? 1 : 0);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeInt(this.asInterface ? 1 : 0);
        parcel.writeInt(this.onExtraCallbackWithResult ? 1 : 0);
    }

    public RSAPrivateKeyStructure(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, boolean z, @NotNull String str3, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallbackDefault = str;
        this.onExtraCallback = str2;
        this.asBinder = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.IAuthTabCallbackStub = dynamicLoader;
        this.onTransact = map;
        this.onWarmupCompleted = z;
        this.onNavigationEvent = str3;
        this.asInterface = z2;
        this.onExtraCallbackWithResult = z3;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onTransact;
    }

    public final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.asInterface;
    }

    public final boolean IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CreditCardIssueTossHanaCompleteFragment.class));
        onNavigationEvent(rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, true);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
