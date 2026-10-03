package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueEventApplyStatusFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PBES2Algorithms extends getEncryptedData {
    public static final Parcelable.Creator<PBES2Algorithms> CREATOR = new onExtraCallbackWithResult();
    private final String IAuthTabCallback;
    private final DynamicLoader IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asBinder;
    private final getEncryptedData asInterface;
    private final Boolean onExtraCallback;
    private final setCTATextColor onExtraCallbackWithResult;
    private final DynamicLoader onNavigationEvent;
    private final String onTransact;
    private final Map<String, Object> onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<PBES2Algorithms> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final PBES2Algorithms createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(PBES2Algorithms.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PBES2Algorithms(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(PBES2Algorithms.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), (DynamicLoader) parcel.readParcelable(PBES2Algorithms.class.getClassLoader()), (setCTATextColor) parcel.readParcelable(PBES2Algorithms.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final PBES2Algorithms[] newArray(int i) {
            return new PBES2Algorithms[i];
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
        parcel.writeString(this.IAuthTabCallback);
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
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onWarmupCompleted, parcel, i);
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onTransact);
        parcel.writeParcelable(this.onNavigationEvent, i);
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
    }

    public PBES2Algorithms(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @NotNull DynamicLoader dynamicLoader2, @Nullable setCTATextColor setctatextcolor) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallback = str2;
        this.asInterface = getencrypteddata;
        this.onExtraCallback = bool;
        this.IAuthTabCallbackDefault = dynamicLoader;
        this.onWarmupCompleted = map;
        this.asBinder = str3;
        this.onTransact = str4;
        this.onNavigationEvent = dynamicLoader2;
        this.onExtraCallbackWithResult = setctatextcolor;
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
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final String onTransact() {
        return this.asBinder;
    }

    public final String IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public final DynamicLoader onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final setCTATextColor onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueEventApplyStatusFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
