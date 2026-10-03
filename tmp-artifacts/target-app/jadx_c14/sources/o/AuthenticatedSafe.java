package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AuthenticatedSafe extends getEncryptedData {
    public static final Parcelable.Creator<AuthenticatedSafe> CREATOR = new onExtraCallbackWithResult();
    private final DynamicLoader IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final getEncryptedData asBinder;
    private final String onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final createAdSizeApi onNavigationEvent;
    private final Boolean onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<AuthenticatedSafe> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AuthenticatedSafe[] newArray(int i) {
            return new AuthenticatedSafe[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AuthenticatedSafe createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(AuthenticatedSafe.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthenticatedSafe(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(AuthenticatedSafe.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), (createAdSizeApi) parcel.readParcelable(AuthenticatedSafe.class.getClassLoader()));
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
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeString(this.onExtraCallback);
        parcel.writeParcelable(this.asBinder, i);
        Boolean bool = this.onWarmupCompleted;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallback, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallbackWithResult, parcel, i);
        parcel.writeParcelable(this.onNavigationEvent, i);
    }

    public AuthenticatedSafe(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createadsizeapi, "");
        this.IAuthTabCallbackDefault = str;
        this.onExtraCallback = str2;
        this.asBinder = getencrypteddata;
        this.onWarmupCompleted = bool;
        this.IAuthTabCallback = dynamicLoader;
        this.onExtraCallbackWithResult = map;
        this.onNavigationEvent = createadsizeapi;
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
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final createAdSizeApi onWarmupCompleted() {
        return this.onNavigationEvent;
    }
}
