package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.plcc.PlccIssueColorFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PKCS12PBEParams extends getEncryptedData {
    public static final Parcelable.Creator<PKCS12PBEParams> CREATOR = new onExtraCallbackWithResult();
    private final Boolean IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final DynamicLoader asBinder;
    private final isDebuggerOn onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final getEncryptedData onTransact;
    private final String onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<PKCS12PBEParams> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final PKCS12PBEParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(PKCS12PBEParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PKCS12PBEParams(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(PKCS12PBEParams.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), (isDebuggerOn) parcel.readParcelable(PKCS12PBEParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final PKCS12PBEParams[] newArray(int i) {
            return new PKCS12PBEParams[i];
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
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asBinder, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onNavigationEvent, parcel, i);
        parcel.writeParcelable(this.onExtraCallback, i);
        parcel.writeInt(this.onExtraCallbackWithResult ? 1 : 0);
    }

    public PKCS12PBEParams(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull isDebuggerOn isdebuggeron, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(isdebuggeron, "");
        this.IAuthTabCallbackDefault = str;
        this.onWarmupCompleted = str2;
        this.onTransact = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.asBinder = dynamicLoader;
        this.onNavigationEvent = map;
        this.onExtraCallback = isdebuggeron;
        this.onExtraCallbackWithResult = z;
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
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final isDebuggerOn onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(PlccIssueColorFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
