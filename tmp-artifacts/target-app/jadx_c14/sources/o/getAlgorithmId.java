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
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAlgorithmId extends getEncryptedData {
    public static final Parcelable.Creator<getAlgorithmId> CREATOR = new onExtraCallbackWithResult();
    private final Boolean IAuthTabCallback;
    private final Map<String, Object> IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final List<DynamicLoaderFactory> IAuthTabCallbackStubProxy;
    private final DynamicLoader IAuthTabCallback_Parcel;
    private final getEncryptedData access000;
    private final int access100;
    private final String asBinder;
    private final String asInterface;
    private final String extraCallbackWithResult;
    private final int getInterfaceDescriptor;
    private final reportDexLoadingIssue onExtraCallback;
    private final createNativeBannerAdViewApi onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final createNativeBannerAdViewApi onTransact;
    private final List<String> onWarmupCompleted;
    private final boolean writeTypedObject;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getAlgorithmId> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getAlgorithmId createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getAlgorithmId.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(getAlgorithmId.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(getAlgorithmId.class.getClassLoader()));
            }
            return new getAlgorithmId(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, arrayList, parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), (reportDexLoadingIssue) parcel.readParcelable(getAlgorithmId.class.getClassLoader()), parcel.readString(), (createNativeBannerAdViewApi) parcel.readParcelable(getAlgorithmId.class.getClassLoader()), (createNativeBannerAdViewApi) parcel.readParcelable(getAlgorithmId.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getAlgorithmId[] newArray(int i) {
            return new getAlgorithmId[i];
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
        parcel.writeString(this.extraCallbackWithResult);
        parcel.writeParcelable(this.access000, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallback_Parcel, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, parcel, i);
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeString(this.asInterface);
        List<DynamicLoaderFactory> list = this.IAuthTabCallbackStubProxy;
        parcel.writeInt(list.size());
        Iterator<DynamicLoaderFactory> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeStringList(this.onWarmupCompleted);
        parcel.writeInt(this.access100);
        parcel.writeInt(this.getInterfaceDescriptor);
        parcel.writeParcelable(this.onExtraCallback, i);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeParcelable(this.onTransact, i);
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
        parcel.writeInt(this.writeTypedObject ? 1 : 0);
    }

    public getAlgorithmId(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @NotNull List<DynamicLoaderFactory> list, @Nullable List<String> list2, int i, int i2, @NotNull reportDexLoadingIssue reportdexloadingissue, @Nullable String str5, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.asBinder = str;
        this.extraCallbackWithResult = str2;
        this.access000 = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.IAuthTabCallback_Parcel = dynamicLoader;
        this.IAuthTabCallbackDefault = map;
        this.IAuthTabCallbackStub = str3;
        this.asInterface = str4;
        this.IAuthTabCallbackStubProxy = list;
        this.onWarmupCompleted = list2;
        this.access100 = i;
        this.getInterfaceDescriptor = i2;
        this.onExtraCallback = reportdexloadingissue;
        this.onNavigationEvent = str5;
        this.onTransact = createnativebanneradviewapi;
        this.onExtraCallbackWithResult = createnativebanneradviewapi2;
        this.writeTypedObject = z;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.asBinder;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.access000;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallback_Parcel;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    public final String access000() {
        return this.IAuthTabCallbackStub;
    }

    public final String asInterface() {
        return this.asInterface;
    }

    public final List<DynamicLoaderFactory> extraCallbackWithResult() {
        return this.IAuthTabCallbackStubProxy;
    }

    public final List<String> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final int writeTypedObject() {
        return this.access100;
    }

    public final int ICustomTabsCallback() {
        return this.getInterfaceDescriptor;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final String onTransact() {
        return this.onNavigationEvent;
    }

    public final createNativeBannerAdViewApi extraCallback() {
        return this.onTransact;
    }

    public final createNativeBannerAdViewApi IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CreditCardIssueSelectFormFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
