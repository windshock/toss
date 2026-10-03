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
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueProductDescriptionDownloadFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PBES2Parameters extends getEncryptedData {
    public static final Parcelable.Creator<PBES2Parameters> CREATOR = new onExtraCallback();
    private final String IAuthTabCallback;
    private final Map<String, Object> IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallback_Parcel;
    private final String access000;
    private final boolean access100;
    private final String asBinder;
    private final DynamicLoader asInterface;
    private final List<getProcessNameViaReflection> onExtraCallback;
    private final Boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final getEncryptedData onTransact;
    private final reportDexLoadingIssue onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<PBES2Parameters> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final PBES2Parameters[] newArray(int i) {
            return new PBES2Parameters[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final PBES2Parameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(PBES2Parameters.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(PBES2Parameters.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(PBES2Parameters.class.getClassLoader()));
            }
            return new PBES2Parameters(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, arrayList, parcel.readString(), (reportDexLoadingIssue) parcel.readParcelable(PBES2Parameters.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
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
        parcel.writeString(this.IAuthTabCallback_Parcel);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.onExtraCallbackWithResult;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asInterface, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, parcel, i);
        parcel.writeString(this.access000);
        List<getProcessNameViaReflection> list = this.onExtraCallback;
        parcel.writeInt(list.size());
        Iterator<getProcessNameViaReflection> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.asBinder);
        parcel.writeParcelable(this.onWarmupCompleted, i);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeInt(this.access100 ? 1 : 0);
        parcel.writeString(this.IAuthTabCallback);
    }

    public PBES2Parameters(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull List<getProcessNameViaReflection> list, @NotNull String str4, @NotNull reportDexLoadingIssue reportdexloadingissue, @Nullable String str5, boolean z, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallback_Parcel = str2;
        this.onTransact = getencrypteddata;
        this.onExtraCallbackWithResult = bool;
        this.asInterface = dynamicLoader;
        this.IAuthTabCallbackDefault = map;
        this.access000 = str3;
        this.onExtraCallback = list;
        this.asBinder = str4;
        this.onWarmupCompleted = reportdexloadingissue;
        this.onNavigationEvent = str5;
        this.access100 = z;
        this.IAuthTabCallback = str6;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    public final String writeTypedObject() {
        return this.access000;
    }

    public final List<getProcessNameViaReflection> onTransact() {
        return this.onExtraCallback;
    }

    public final String IAuthTabCallbackStub() {
        return this.asBinder;
    }

    public final reportDexLoadingIssue onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final String asInterface() {
        return this.onNavigationEvent;
    }

    public final boolean access000() {
        return this.access100;
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CreditCardIssueProductDescriptionDownloadFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
