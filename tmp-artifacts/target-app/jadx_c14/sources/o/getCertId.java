package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueActionableWebFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCertId extends getEncryptedData {
    public static final Parcelable.Creator<getCertId> CREATOR = new onExtraCallback();
    private final Map<String, Object> IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String asBinder;
    private final DynamicLoader asInterface;
    private final Boolean onExtraCallback;
    private final Map<String, createAdSizeApi> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final getEncryptedData onTransact;
    private final Boolean onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<getCertId> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getCertId[] newArray(int i) {
            return new getCertId[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getCertId createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getCertId.class.getClassLoader());
            LinkedHashMap linkedHashMap = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(getCertId.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(getCertId.class.getClassLoader()));
                }
            }
            return new getCertId(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, boolValueOf2, linkedHashMap);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.asInterface, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallback, parcel, i);
        parcel.writeString(this.asBinder);
        Boolean bool2 = this.onWarmupCompleted;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Map<String, createAdSizeApi> map = this.onExtraCallbackWithResult;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, createAdSizeApi> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCertId(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable Boolean bool2, @Nullable Map<String, ? extends createAdSizeApi> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallbackDefault = str;
        this.onNavigationEvent = str2;
        this.onTransact = getencrypteddata;
        this.onExtraCallback = bool;
        this.asInterface = dynamicLoader;
        this.IAuthTabCallback = map;
        this.asBinder = str3;
        this.onWarmupCompleted = bool2;
        this.onExtraCallbackWithResult = map2;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final String onTransact() {
        return this.asBinder;
    }

    public final Boolean onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final Map<String, createAdSizeApi> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CreditCardIssueActionableWebFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
