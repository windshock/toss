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
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getObjectId extends getEncryptedData {
    public static final Parcelable.Creator<getObjectId> CREATOR = new onWarmupCompleted();
    private final Boolean IAuthTabCallback;
    private final List<createNativeAdRatingApi> IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final DynamicLoader IAuthTabCallbackStubProxy;
    private final boolean IAuthTabCallback_Parcel;
    private final getEncryptedData access000;
    private final Map<String, Object> access100;
    private final List<BenchmarkLimitsMs> asBinder;
    private final String asInterface;
    private final String extraCallbackWithResult;
    private final String getInterfaceDescriptor;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final reportDexLoadingIssue onNavigationEvent;
    private final String onTransact;
    private final boolean onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<getObjectId> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getObjectId createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getObjectId.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(getObjectId.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(parcel.readParcelable(getObjectId.class.getClassLoader()));
            }
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            reportDexLoadingIssue reportdexloadingissue = (reportDexLoadingIssue) parcel.readParcelable(getObjectId.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int i4 = 0;
                while (i4 != i3) {
                    arrayList3.add(parcel.readParcelable(getObjectId.class.getClassLoader()));
                    i4++;
                    i3 = i3;
                }
                arrayList = arrayList3;
            }
            return new getObjectId(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, string5, arrayList2, z, z2, reportdexloadingissue, arrayList, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getObjectId[] newArray(int i) {
            return new getObjectId[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.getInterfaceDescriptor);
        parcel.writeString(this.extraCallbackWithResult);
        parcel.writeParcelable(this.access000, i);
        Boolean bool = this.IAuthTabCallback;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.IAuthTabCallbackStubProxy, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.access100, parcel, i);
        parcel.writeString(this.asInterface);
        parcel.writeString(this.onTransact);
        parcel.writeString(this.IAuthTabCallbackStub);
        List<createNativeAdRatingApi> list = this.IAuthTabCallbackDefault;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.onExtraCallback ? 1 : 0);
        parcel.writeInt(this.onWarmupCompleted ? 1 : 0);
        parcel.writeParcelable(this.onNavigationEvent, i);
        List<BenchmarkLimitsMs> list2 = this.asBinder;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<BenchmarkLimitsMs> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeInt(this.IAuthTabCallback_Parcel ? 1 : 0);
        parcel.writeString(this.onExtraCallbackWithResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getObjectId(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull List<? extends createNativeAdRatingApi> list, boolean z, boolean z2, @NotNull reportDexLoadingIssue reportdexloadingissue, @Nullable List<BenchmarkLimitsMs> list2, boolean z3, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.getInterfaceDescriptor = str;
        this.extraCallbackWithResult = str2;
        this.access000 = getencrypteddata;
        this.IAuthTabCallback = bool;
        this.IAuthTabCallbackStubProxy = dynamicLoader;
        this.access100 = map;
        this.asInterface = str3;
        this.onTransact = str4;
        this.IAuthTabCallbackStub = str5;
        this.IAuthTabCallbackDefault = list;
        this.onExtraCallback = z;
        this.onWarmupCompleted = z2;
        this.onNavigationEvent = reportdexloadingissue;
        this.asBinder = list2;
        this.IAuthTabCallback_Parcel = z3;
        this.onExtraCallbackWithResult = str6;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.getInterfaceDescriptor;
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
        return this.IAuthTabCallbackStubProxy;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.access100;
    }

    public final String extraCallbackWithResult() {
        return this.asInterface;
    }

    public final String access000() {
        return this.onTransact;
    }

    public final String ICustomTabsCallback() {
        return this.IAuthTabCallbackStub;
    }

    public final List<createNativeAdRatingApi> IAuthTabCallbackStub() {
        return this.IAuthTabCallbackDefault;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final reportDexLoadingIssue onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final List<BenchmarkLimitsMs> asInterface() {
        return this.asBinder;
    }

    public final boolean writeTypedObject() {
        return this.IAuthTabCallback_Parcel;
    }

    public final String onTransact() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueFreeformFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
