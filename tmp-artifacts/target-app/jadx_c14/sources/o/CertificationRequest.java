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
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBottomSheetFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertificationRequest extends getEncryptedData {
    public static final Parcelable.Creator<CertificationRequest> CREATOR = new onNavigationEvent();
    private final Boolean IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final DynamicLoader asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final List<createNativeAdRatingApi> onNavigationEvent;
    private final String onTransact;
    private final reportDexLoadingIssue onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<CertificationRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CertificationRequest[] newArray(int i) {
            return new CertificationRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CertificationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(CertificationRequest.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(CertificationRequest.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(CertificationRequest.class.getClassLoader()));
            }
            return new CertificationRequest(string, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string2, string3, arrayList, (reportDexLoadingIssue) parcel.readParcelable(CertificationRequest.class.getClassLoader()), parcel.readString());
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
        parcel.writeString(this.onExtraCallback);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asBinder, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallbackWithResult, parcel, i);
        parcel.writeString(this.onTransact);
        parcel.writeString(this.asInterface);
        List<createNativeAdRatingApi> list = this.onNavigationEvent;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeParcelable(this.onWarmupCompleted, i);
        parcel.writeString(this.IAuthTabCallbackStub);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CertificationRequest(@NotNull String str, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str2, @Nullable String str3, @NotNull List<? extends createNativeAdRatingApi> list, @NotNull reportDexLoadingIssue reportdexloadingissue, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallback = str;
        this.IAuthTabCallbackDefault = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.asBinder = dynamicLoader;
        this.onExtraCallbackWithResult = map;
        this.onTransact = str2;
        this.asInterface = str3;
        this.onNavigationEvent = list;
        this.onWarmupCompleted = reportdexloadingissue;
        this.IAuthTabCallbackStub = str4;
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
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String asInterface() {
        return this.onTransact;
    }

    public final String IAuthTabCallbackStub() {
        return this.asInterface;
    }

    public final List<createNativeAdRatingApi> onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleNodeonAttach11 rippleNodeonAttach11 = new RippleNodeonAttach11(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleIndicationInstance.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueBottomSheetFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleNodeonAttach11, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleNodeonAttach11);
    }
}
