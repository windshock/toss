package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCoefficient extends getEncryptedData {
    public static final Parcelable.Creator<getCoefficient> CREATOR = new onExtraCallbackWithResult();
    private final Boolean IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final getEncryptedData onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final DynamicLoader onNavigationEvent;
    private final Map<String, Object> onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getCoefficient> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getCoefficient createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getCoefficient.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getCoefficient(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getCoefficient.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getCoefficient[] newArray(int i) {
            return new getCoefficient[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeParcelable(this.onExtraCallback, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onNavigationEvent, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onWarmupCompleted, parcel, i);
    }

    public getCoefficient(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallbackStub = str2;
        this.onExtraCallback = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.onNavigationEvent = dynamicLoader;
        this.onWarmupCompleted = map;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onWarmupCompleted;
    }
}
