package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPSourceAlgorithm extends getEncryptedData {
    public static final Parcelable.Creator<getPSourceAlgorithm> CREATOR = new IAuthTabCallback();
    private getDigestAlgorithms<getPSourceAlgorithm> IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final getEncryptedData IAuthTabCallbackStub;
    private final String asBinder;
    private final Boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final DynamicLoader onNavigationEvent;
    private final Map<String, Object> onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<getPSourceAlgorithm> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getPSourceAlgorithm[] newArray(int i) {
            return new getPSourceAlgorithm[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getPSourceAlgorithm createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getPSourceAlgorithm.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getPSourceAlgorithm(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getPSourceAlgorithm.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString());
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
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onNavigationEvent, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onWarmupCompleted, parcel, i);
        parcel.writeString(this.asBinder);
    }

    public getPSourceAlgorithm(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallbackDefault = str;
        this.onExtraCallbackWithResult = str2;
        this.IAuthTabCallbackStub = getencrypteddata;
        this.onExtraCallback = bool;
        this.onNavigationEvent = dynamicLoader;
        this.onWarmupCompleted = map;
        this.asBinder = str3;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final String onWarmupCompleted() {
        return this.asBinder;
    }

    public final getDigestAlgorithms<getPSourceAlgorithm> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.IAuthTabCallback = getdigestalgorithms;
    }
}
