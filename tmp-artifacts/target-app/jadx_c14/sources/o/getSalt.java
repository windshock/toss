package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AdvertisingId;
import o.PopupLayoutExternalSyntheticLambda1;
import o.TextKtExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSalt extends getEncryptedData {
    public static final Parcelable.Creator<getSalt> CREATOR = new onNavigationEvent();
    private final isLimitAdTracking IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private final DynamicLoader asBinder;
    private final getEncryptedData asInterface;
    private final AdvertisingId onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final Map<String, Object> onTransact;
    private boolean onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<getSalt> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getSalt[] newArray(int i) {
            return new getSalt[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getSalt createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getSalt.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getSalt(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getSalt.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readInt() != 0, parcel.readString(), (AdvertisingId) parcel.readParcelable(getSalt.class.getClassLoader()), (isLimitAdTracking) parcel.readParcelable(getSalt.class.getClassLoader()));
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[AdvertisingId.onWarmupCompleted.values().length];
            try {
                iArr[AdvertisingId.onWarmupCompleted.OCR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisingId.onWarmupCompleted.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
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
        parcel.writeString(this.IAuthTabCallbackStubProxy);
        parcel.writeParcelable(this.asInterface, i);
        Boolean bool = this.onNavigationEvent;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asBinder, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onTransact, parcel, i);
        parcel.writeInt(this.onExtraCallbackWithResult ? 1 : 0);
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeParcelable(this.onExtraCallback, i);
        parcel.writeParcelable(this.IAuthTabCallback, i);
    }

    public getSalt(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, boolean z, @Nullable String str3, @NotNull AdvertisingId advertisingId, @Nullable isLimitAdTracking islimitadtracking) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(advertisingId, "");
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallbackStubProxy = str2;
        this.asInterface = getencrypteddata;
        this.onNavigationEvent = bool;
        this.asBinder = dynamicLoader;
        this.onTransact = map;
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallbackDefault = str3;
        this.onExtraCallback = advertisingId;
        this.IAuthTabCallback = islimitadtracking;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onTransact;
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final AdvertisingId onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final isLimitAdTracking asInterface() {
        return this.IAuthTabCallback;
    }

    public final void onExtraCallback(boolean z) {
        this.onWarmupCompleted = z;
    }

    public final boolean onTransact() {
        return this.onWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        if (this.IAuthTabCallbackDefault != null) {
            cardIssueOverviewViewModel.onExtraCallback(new BaseRoundCornerProgressBar1(StringsKt.replace$default(this.IAuthTabCallbackDefault, "-", "", false, 4, (Object) null)));
            cardIssueOverviewViewModel.onWarmupCompleted(new BaseRoundCornerProgressBar1((CharSequence) StringsKt.split$default(this.IAuthTabCallbackDefault, new String[]{"-"}, false, 0, 6, (Object) null).get(1)));
        }
        int i = onWarmupCompleted.onWarmupCompleted[this.onExtraCallback.asInterface().ordinal()];
        if (i == 1) {
            ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = typographyKtExternalSyntheticLambda0.IAuthTabCallbackDefault().onExtraCallback(R.navigation.nav_credit_card_issue_ocr_verify);
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onNavigationEvent(access100());
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.IAuthTabCallback("navigator", new TextKtExternalSyntheticLambda6.onExtraCallback().onNavigationEvent(new PopupLayoutExternalSyntheticLambda1.onWarmupCompleted(getDigestAlgorithms.class)).onExtraCallbackWithResult(getdigestalgorithms).onWarmupCompleted());
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback2 = typographyKtExternalSyntheticLambda0.IAuthTabCallbackDefault().onExtraCallback(R.navigation.nav_credit_card_issue_id);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback2.onNavigationEvent(access100());
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback2.IAuthTabCallback("navigator", new TextKtExternalSyntheticLambda6.onExtraCallback().onNavigationEvent(new PopupLayoutExternalSyntheticLambda1.onWarmupCompleted(getDigestAlgorithms.class)).onExtraCallbackWithResult(getdigestalgorithms).onWarmupCompleted());
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback2);
    }
}
