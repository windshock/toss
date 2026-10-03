package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.PopupLayoutExternalSyntheticLambda1;
import o.TextKtExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getG extends getEncryptedData {
    public static final Parcelable.Creator<getG> CREATOR = new onExtraCallbackWithResult();
    private final NativeAdImageApi IAuthTabCallback;
    private final DynamicLoader IAuthTabCallbackDefault;
    private final getEncryptedData IAuthTabCallbackStub;
    private final Map<String, Object> asBinder;
    private final String asInterface;
    private final Boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onTransact;
    private final boolean onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getG> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getG[] newArray(int i) {
            return new getG[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getG createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getG.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new getG(string, string2, getencrypteddata, boolValueOf, (DynamicLoader) parcel.readParcelable(getG.class.getClassLoader()), Preconditions.INSTANCE.onNavigationEvent(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (NativeAdImageApi) parcel.readParcelable(getG.class.getClassLoader()));
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
        parcel.writeString(this.onTransact);
        parcel.writeString(this.asInterface);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.asBinder, parcel, i);
        parcel.writeInt(this.onExtraCallbackWithResult ? 1 : 0);
        parcel.writeInt(this.onNavigationEvent ? 1 : 0);
        parcel.writeInt(this.onWarmupCompleted ? 1 : 0);
        parcel.writeParcelable(this.IAuthTabCallback, i);
    }

    public getG(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, @Nullable NativeAdImageApi nativeAdImageApi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onTransact = str;
        this.asInterface = str2;
        this.IAuthTabCallbackStub = getencrypteddata;
        this.onExtraCallback = bool;
        this.IAuthTabCallbackDefault = dynamicLoader;
        this.asBinder = map;
        this.onExtraCallbackWithResult = z;
        this.onNavigationEvent = z2;
        this.onWarmupCompleted = z3;
        this.IAuthTabCallback = nativeAdImageApi;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.asBinder;
    }

    public final boolean onTransact() {
        return this.onExtraCallbackWithResult;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final boolean onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = typographyKtExternalSyntheticLambda0.IAuthTabCallbackDefault().onExtraCallback(R.navigation.nav_credit_card_issue_addr);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onNavigationEvent(access100());
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.IAuthTabCallback("navigator", new TextKtExternalSyntheticLambda6.onExtraCallback().onNavigationEvent(new PopupLayoutExternalSyntheticLambda1.onWarmupCompleted(getDigestAlgorithms.class)).onExtraCallbackWithResult(getdigestalgorithms).onWarmupCompleted());
        if (this.onExtraCallbackWithResult) {
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onExtraCallback(R.id.creditCardIssueCompanyAddressFragment);
        } else {
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onExtraCallback(R.id.creditCardIssueHomeAddressFragment);
        }
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
    }

    public final boolean onExtraCallbackWithResult(@NotNull setCTABorderColor setctabordercolor) {
        List<String> listOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(setctabordercolor, "");
        NativeAdImageApi nativeAdImageApi = this.IAuthTabCallback;
        Object obj = null;
        if (nativeAdImageApi != null && (listOnExtraCallbackWithResult = nativeAdImageApi.onExtraCallbackWithResult()) != null) {
            Iterator<T> it = listOnExtraCallbackWithResult.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual((String) next, setctabordercolor.name())) {
                    obj = next;
                    break;
                }
            }
            obj = (String) obj;
        }
        return obj != null;
    }

    private final boolean onExtraCallback(setCTABorderColor setctabordercolor) {
        Map<String, List<NativeAdScrollViewApi>> mapOnNavigationEvent;
        List<NativeAdScrollViewApi> list;
        NativeAdImageApi nativeAdImageApi = this.IAuthTabCallback;
        return (nativeAdImageApi == null || (mapOnNavigationEvent = nativeAdImageApi.onNavigationEvent()) == null || (list = mapOnNavigationEvent.get(setctabordercolor.name())) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public final List<NativeAdViewApi> asInterface() {
        List<NativeAdScrollViewApi> listEmptyList;
        Map<String, List<NativeAdScrollViewApi>> mapOnNavigationEvent;
        EnumEntries<setCTABorderColor> entries = setCTABorderColor.getEntries();
        ArrayList<setCTABorderColor> arrayList = new ArrayList();
        for (Object obj : entries) {
            setCTABorderColor setctabordercolor = (setCTABorderColor) obj;
            if (onExtraCallback(setctabordercolor) || onExtraCallbackWithResult(setctabordercolor)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (setCTABorderColor setctabordercolor2 : arrayList) {
            NativeAdImageApi nativeAdImageApi = this.IAuthTabCallback;
            if (nativeAdImageApi == null || (mapOnNavigationEvent = nativeAdImageApi.onNavigationEvent()) == null || (listEmptyList = mapOnNavigationEvent.get(setctabordercolor2.name())) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            arrayList2.add(new NativeAdViewApi(setctabordercolor2, listEmptyList, onExtraCallbackWithResult(setctabordercolor2)));
        }
        return arrayList2;
    }

    public final List<NativeAdScrollViewApi> onNavigationEvent(@NotNull setCTABorderColor setctabordercolor) {
        Map<String, List<NativeAdScrollViewApi>> mapOnNavigationEvent;
        List<NativeAdScrollViewApi> list;
        Intrinsics.checkNotNullParameter(setctabordercolor, "");
        NativeAdImageApi nativeAdImageApi = this.IAuthTabCallback;
        return (nativeAdImageApi == null || (mapOnNavigationEvent = nativeAdImageApi.onNavigationEvent()) == null || (list = mapOnNavigationEvent.get(setctabordercolor.name())) == null) ? CollectionsKt.emptyList() : list;
    }

    public final String onNavigationEvent(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_credit_card_issue_company_input_no_home_address_detail);
        }
        return onWarmupCompleted(str, onNavigationEvent(setCTABorderColor.HOME_DETAIL_ADDRESS));
    }

    public final String onWarmupCompleted(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_credit_card_issue_company_input_no_company_name);
        }
        return onWarmupCompleted(str, onNavigationEvent(setCTABorderColor.OFFICE_NAME));
    }

    public final String onExtraCallback(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_credit_card_issue_company_input_no_company_address_detail);
        }
        return onWarmupCompleted(str, onNavigationEvent(setCTABorderColor.OFFICE_DETAIL_ADDRESS));
    }

    public final String IAuthTabCallback(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_credit_card_issue_company_input_no_company_phone);
        }
        if (NetscapeCertType.Companion.onWarmupCompleted(str) == null) {
            return AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_cardrecommend_issuev2_ui_addressinfo___2bab60407f);
        }
        return onWarmupCompleted(str, onNavigationEvent(setCTABorderColor.OFFICE_PHONE));
    }

    public final String onExtraCallbackWithResult(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.app_credit_card_issue_company_input_no_company_department);
        }
        return null;
    }

    private final String onWarmupCompleted(String str, List<NativeAdScrollViewApi> list) {
        if (str == null || StringsKt.isBlank(str) || list.isEmpty()) {
            return null;
        }
        for (NativeAdScrollViewApi nativeAdScrollViewApi : list) {
            if (!new Regex(nativeAdScrollViewApi.onNavigationEvent()).onExtraCallbackWithResult(str)) {
                return nativeAdScrollViewApi.IAuthTabCallback();
            }
        }
        return null;
    }
}
