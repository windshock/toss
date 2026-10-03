package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueConformityFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getIterationCount extends getEncryptedData {
    public static final Parcelable.Creator<getIterationCount> CREATOR = new onWarmupCompleted();
    private final List<String> IAuthTabCallback;
    private final Map<String, Object> IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String access100;
    private final getEncryptedData asBinder;
    private final DynamicLoader asInterface;
    private final String getInterfaceDescriptor;
    private final String onExtraCallback;
    private final reportDexLoadingIssue onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<getIterationCount> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getIterationCount createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getIterationCount.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getIterationCount(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getIterationCount.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (reportDexLoadingIssue) parcel.readParcelable(getIterationCount.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getIterationCount[] newArray(int i) {
            return new getIterationCount[i];
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
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.access100);
        parcel.writeParcelable(this.asBinder, i);
        Boolean bool = this.onNavigationEvent;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asInterface, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, parcel, i);
        parcel.writeString(this.onTransact);
        parcel.writeString(this.getInterfaceDescriptor);
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeString(this.onExtraCallback);
        parcel.writeStringList(this.IAuthTabCallback);
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
    }

    public getIterationCount(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull List<String> list, @NotNull reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.onWarmupCompleted = str;
        this.access100 = str2;
        this.asBinder = getencrypteddata;
        this.onNavigationEvent = bool;
        this.asInterface = dynamicLoader;
        this.IAuthTabCallbackDefault = map;
        this.onTransact = str3;
        this.getInterfaceDescriptor = str4;
        this.IAuthTabCallbackStub = str5;
        this.onExtraCallback = str6;
        this.IAuthTabCallback = list;
        this.onExtraCallbackWithResult = reportdexloadingissue;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    public final String asInterface() {
        return this.onTransact;
    }

    public final String access000() {
        return this.getInterfaceDescriptor;
    }

    public final String IAuthTabCallbackStub() {
        return this.IAuthTabCallbackStub;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final List<String> onTransact() {
        return this.IAuthTabCallback;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CreditCardIssueConformityFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
