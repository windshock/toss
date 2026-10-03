package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueAgreementStepFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertBag extends getEncryptedData {
    public static final Parcelable.Creator<CertBag> CREATOR = new onNavigationEvent();
    private final List<createAudienceNetworkAdsApi> IAuthTabCallback;
    private final Map<String, Object> IAuthTabCallbackDefault;
    private final List<String> IAuthTabCallbackStub;
    private final String access000;
    private final String access100;
    private final getEncryptedData asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final reportDexLoadingIssue onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final DynamicLoader onTransact;
    private final String onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<CertBag> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CertBag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(CertBag.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(CertBag.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(CertBag.class.getClassLoader()));
            }
            return new CertBag(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, string5, arrayListCreateStringArrayList, arrayList, (reportDexLoadingIssue) parcel.readParcelable(CertBag.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CertBag[] newArray(int i) {
            return new CertBag[i];
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
        parcel.writeParcelable(this.onTransact, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, parcel, i);
        parcel.writeString(this.access000);
        parcel.writeString(this.asInterface);
        parcel.writeString(this.onExtraCallback);
        parcel.writeStringList(this.IAuthTabCallbackStub);
        List<createAudienceNetworkAdsApi> list = this.IAuthTabCallback;
        parcel.writeInt(list.size());
        Iterator<createAudienceNetworkAdsApi> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
    }

    public CertBag(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @NotNull String str5, @Nullable List<String> list, @NotNull List<createAudienceNetworkAdsApi> list2, @NotNull reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.onWarmupCompleted = str;
        this.access100 = str2;
        this.asBinder = getencrypteddata;
        this.onNavigationEvent = bool;
        this.onTransact = dynamicLoader;
        this.IAuthTabCallbackDefault = map;
        this.access000 = str3;
        this.asInterface = str4;
        this.onExtraCallback = str5;
        this.IAuthTabCallbackStub = list;
        this.IAuthTabCallback = list2;
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
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    public final String access000() {
        return this.access000;
    }

    public final String IAuthTabCallbackStub() {
        return this.asInterface;
    }

    public final String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final List<String> onTransact() {
        return this.IAuthTabCallbackStub;
    }

    public final List<createAudienceNetworkAdsApi> asInterface() {
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
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueAgreementStepFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
