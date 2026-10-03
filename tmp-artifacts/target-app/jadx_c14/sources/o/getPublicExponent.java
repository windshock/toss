package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPublicExponent extends getEncryptedData {
    public static final Parcelable.Creator<getPublicExponent> CREATOR = new onNavigationEvent();
    private final Boolean IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackStub;
    private final DynamicLoader onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<getPublicExponent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getPublicExponent[] newArray(int i) {
            return new getPublicExponent[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getPublicExponent createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getPublicExponent.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getPublicExponent(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getPublicExponent.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString());
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
        parcel.writeString(this.onTransact);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onExtraCallback, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallbackWithResult, parcel, i);
        parcel.writeString(this.onNavigationEvent);
    }

    public getPublicExponent(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onTransact = str;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallbackStub = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.onExtraCallback = dynamicLoader;
        this.onExtraCallbackWithResult = map;
        this.onNavigationEvent = str3;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onWarmupCompleted() {
        return this.onNavigationEvent;
    }
}
