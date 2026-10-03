package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedBannerFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSubject extends getEncryptedData {
    public static final Parcelable.Creator<getSubject> CREATOR = new onNavigationEvent();
    private final Map<String, Object> IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final Boolean onExtraCallbackWithResult;
    private final createAdOptionsView onNavigationEvent;
    private final DynamicLoader onTransact;
    private final DynamicLoader onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<getSubject> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getSubject createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getSubject.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getSubject(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getSubject.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), (DynamicLoader) parcel.readParcelable(getSubject.class.getClassLoader()), (createAdOptionsView) parcel.readParcelable(getSubject.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getSubject[] newArray(int i) {
            return new getSubject[i];
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
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onExtraCallback);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Boolean bool = this.onExtraCallbackWithResult;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onTransact, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallback, parcel, i);
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeString(this.asInterface);
        parcel.writeParcelable(this.onWarmupCompleted, i);
        parcel.writeParcelable(this.onNavigationEvent, i);
    }

    public getSubject(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @Nullable DynamicLoader dynamicLoader2, @NotNull createAdOptionsView createadoptionsview) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(createadoptionsview, "");
        this.asBinder = str;
        this.onExtraCallback = str2;
        this.IAuthTabCallbackDefault = getencrypteddata;
        this.onExtraCallbackWithResult = bool;
        this.onTransact = dynamicLoader;
        this.IAuthTabCallback = map;
        this.IAuthTabCallbackStub = str3;
        this.asInterface = str4;
        this.onWarmupCompleted = dynamicLoader2;
        this.onNavigationEvent = createadoptionsview;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final String asInterface() {
        return this.IAuthTabCallbackStub;
    }

    public final String IAuthTabCallbackStub() {
        return this.asInterface;
    }

    public final DynamicLoader onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final createAdOptionsView onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueFailedBannerFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
