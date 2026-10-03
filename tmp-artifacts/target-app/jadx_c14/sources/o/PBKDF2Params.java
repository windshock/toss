package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.RefCountCloseableReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssuePasswordFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PBKDF2Params extends getEncryptedData {
    public static final Parcelable.Creator<PBKDF2Params> CREATOR = new onWarmupCompleted();
    private final Boolean IAuthTabCallback;
    private final DynamicLoader IAuthTabCallbackDefault;
    private final Map<String, Object> IAuthTabCallbackStub;
    private final boolean IAuthTabCallback_Parcel;
    private final String access000;
    private final String asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final NativeAdsManagerApi onExtraCallbackWithResult;
    private final setCTABackgroundColor onNavigationEvent;
    private final getEncryptedData onTransact;
    private final RefCountCloseableReference.onNavigationEvent onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<PBKDF2Params> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final PBKDF2Params createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(PBKDF2Params.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PBKDF2Params(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(PBKDF2Params.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), (setCTABackgroundColor) parcel.readParcelable(PBKDF2Params.class.getClassLoader()), (NativeAdsManagerApi) parcel.readParcelable(PBKDF2Params.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (RefCountCloseableReference.onNavigationEvent) parcel.readParcelable(PBKDF2Params.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final PBKDF2Params[] newArray(int i) {
            return new PBKDF2Params[i];
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
        parcel.writeString(this.asInterface);
        parcel.writeString(this.access000);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackStub, parcel, i);
        parcel.writeString(this.asBinder);
        parcel.writeParcelable(this.onNavigationEvent, i);
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
        parcel.writeInt(this.IAuthTabCallback_Parcel ? 1 : 0);
        parcel.writeString(this.onExtraCallback);
        parcel.writeParcelable(this.onWarmupCompleted, i);
    }

    public PBKDF2Params(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable setCTABackgroundColor setctabackgroundcolor, @Nullable NativeAdsManagerApi nativeAdsManagerApi, boolean z, @Nullable String str4, @Nullable RefCountCloseableReference.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.asInterface = str;
        this.access000 = str2;
        this.onTransact = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.IAuthTabCallbackDefault = dynamicLoader;
        this.IAuthTabCallbackStub = map;
        this.asBinder = str3;
        this.onNavigationEvent = setctabackgroundcolor;
        this.onExtraCallbackWithResult = nativeAdsManagerApi;
        this.IAuthTabCallback_Parcel = z;
        this.onExtraCallback = str4;
        this.onWarmupCompleted = onnavigationevent;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.asInterface;
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
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallbackStub;
    }

    public final String IAuthTabCallbackStub() {
        return this.asBinder;
    }

    public final setCTABackgroundColor onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final NativeAdsManagerApi onTransact() {
        return this.onExtraCallbackWithResult;
    }

    public final boolean access000() {
        return this.IAuthTabCallback_Parcel;
    }

    public final String asInterface() {
        return this.onExtraCallback;
    }

    public final RefCountCloseableReference.onNavigationEvent onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssuePasswordFragment.class));
        onNavigationEvent(rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, true);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
