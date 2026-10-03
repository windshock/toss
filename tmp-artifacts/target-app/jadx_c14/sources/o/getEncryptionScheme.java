package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.PopupLayoutExternalSyntheticLambda1;
import o.TextKtExternalSyntheticLambda6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getEncryptionScheme extends getEncryptedData {
    public static final Parcelable.Creator<getEncryptionScheme> CREATOR = new onExtraCallbackWithResult();
    private final List<doCallInitialize> IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final getEncryptedData asBinder;
    private final Map<String, Object> asInterface;
    private final DynamicLoader onExtraCallback;
    private final Boolean onExtraCallbackWithResult;
    private final List<doCallInitialize> onNavigationEvent;
    private final DynamicLoader onTransact;
    private final String onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getEncryptionScheme> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getEncryptionScheme createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getEncryptionScheme.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(getEncryptionScheme.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(getEncryptionScheme.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(getEncryptionScheme.class.getClassLoader()));
            }
            return new getEncryptionScheme(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, arrayList, arrayList2, (DynamicLoader) parcel.readParcelable(getEncryptionScheme.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final getEncryptionScheme[] newArray(int i) {
            return new getEncryptionScheme[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEncryptionScheme)) {
            return false;
        }
        getEncryptionScheme getencryptionscheme = (getEncryptionScheme) obj;
        return Intrinsics.areEqual(this.IAuthTabCallbackStub, getencryptionscheme.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onWarmupCompleted, getencryptionscheme.onWarmupCompleted) && Intrinsics.areEqual(this.asBinder, getencryptionscheme.asBinder) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getencryptionscheme.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onTransact, getencryptionscheme.onTransact) && Intrinsics.areEqual(this.asInterface, getencryptionscheme.asInterface) && Intrinsics.areEqual(this.onNavigationEvent, getencryptionscheme.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, getencryptionscheme.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, getencryptionscheme.onExtraCallback);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallbackStub.hashCode();
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        getEncryptedData getencrypteddata = this.asBinder;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.onExtraCallbackWithResult;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.onTransact;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.asInterface;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        return "FaqLayout(type=" + this.IAuthTabCallbackStub + ", key=" + this.onWarmupCompleted + ", onBack=" + this.asBinder + ", clearPreviousLayouts=" + this.onExtraCallbackWithResult + ", navigationRightButton=" + this.onTransact + ", logParam=" + this.asInterface + ", faqList=" + this.onNavigationEvent + ", cardDescriptionList=" + this.IAuthTabCallback + ", cta=" + this.onExtraCallback + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeParcelable(this.asBinder, i);
        Boolean bool = this.onExtraCallbackWithResult;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.onTransact, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.asInterface, parcel, i);
        List<doCallInitialize> list = this.onNavigationEvent;
        parcel.writeInt(list.size());
        Iterator<doCallInitialize> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        List<doCallInitialize> list2 = this.IAuthTabCallback;
        parcel.writeInt(list2.size());
        Iterator<doCallInitialize> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
        parcel.writeParcelable(this.onExtraCallback, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getEncryptionScheme(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull List<? extends doCallInitialize> list, @NotNull List<? extends doCallInitialize> list2, @NotNull DynamicLoader dynamicLoader2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        this.IAuthTabCallbackStub = str;
        this.onWarmupCompleted = str2;
        this.asBinder = getencrypteddata;
        this.onExtraCallbackWithResult = bool;
        this.onTransact = dynamicLoader;
        this.asInterface = map;
        this.onNavigationEvent = list;
        this.IAuthTabCallback = list2;
        this.onExtraCallback = dynamicLoader2;
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
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.asInterface;
    }

    public final List<doCallInitialize> IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    public final List<doCallInitialize> onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final DynamicLoader onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = typographyKtExternalSyntheticLambda0.IAuthTabCallbackDefault().onExtraCallback(R.navigation.nav_credit_card_issue_faq);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onNavigationEvent(access100());
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.IAuthTabCallback("navigator", new TextKtExternalSyntheticLambda6.onExtraCallback().onNavigationEvent(new PopupLayoutExternalSyntheticLambda1.onWarmupCompleted(getDigestAlgorithms.class)).onExtraCallbackWithResult(getdigestalgorithms).onWarmupCompleted());
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
    }
}
