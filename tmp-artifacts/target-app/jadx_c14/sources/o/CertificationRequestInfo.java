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
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFailedFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CertificationRequestInfo extends getEncryptedData {
    public static final Parcelable.Creator<CertificationRequestInfo> CREATOR = new onExtraCallbackWithResult();
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final DynamicLoader IAuthTabCallbackStub;
    private final String IAuthTabCallback_Parcel;
    private final String asBinder;
    private final getEncryptedData asInterface;
    private final reportDexLoadingIssue onExtraCallback;
    private final Boolean onExtraCallbackWithResult;
    private final List<DexLoadErrorReporter> onNavigationEvent;
    private final String onTransact;
    private final Map<String, Object> onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<CertificationRequestInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CertificationRequestInfo[] newArray(int i) {
            return new CertificationRequestInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CertificationRequestInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(CertificationRequestInfo.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(CertificationRequestInfo.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            reportDexLoadingIssue reportdexloadingissue = (reportDexLoadingIssue) parcel.readParcelable(CertificationRequestInfo.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(CertificationRequestInfo.class.getClassLoader()));
                }
            }
            return new CertificationRequestInfo(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, reportdexloadingissue, string5, arrayList);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallback_Parcel);
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeParcelable(this.asInterface, i);
        Boolean bool = this.onExtraCallbackWithResult;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onWarmupCompleted, parcel, i);
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onTransact);
        parcel.writeParcelable(this.onExtraCallback, i);
        parcel.writeString(this.IAuthTabCallbackDefault);
        List<DexLoadErrorReporter> list = this.onNavigationEvent;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DexLoadErrorReporter> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public CertificationRequestInfo(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull String str4, @NotNull reportDexLoadingIssue reportdexloadingissue, @NotNull String str5, @Nullable List<DexLoadErrorReporter> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.IAuthTabCallback_Parcel = str;
        this.IAuthTabCallback = str2;
        this.asInterface = getencrypteddata;
        this.onExtraCallbackWithResult = bool;
        this.IAuthTabCallbackStub = dynamicLoader;
        this.onWarmupCompleted = map;
        this.asBinder = str3;
        this.onTransact = str4;
        this.onExtraCallback = reportdexloadingissue;
        this.IAuthTabCallbackDefault = str5;
        this.onNavigationEvent = list;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final String IAuthTabCallbackStub() {
        return this.asBinder;
    }

    public final String onTransact() {
        return this.onTransact;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final String asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    public final List<DexLoadErrorReporter> onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueFailedFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
