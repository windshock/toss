package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OIWObjectIdentifiers extends getEncryptedData {
    public static final Parcelable.Creator<OIWObjectIdentifiers> CREATOR = new onExtraCallbackWithResult();
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final DynamicLoader IAuthTabCallbackStub;
    private final getEncryptedData asInterface;
    private final Map<String, Object> onExtraCallback;
    private final List<Integer> onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final String onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<OIWObjectIdentifiers> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final OIWObjectIdentifiers createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(OIWObjectIdentifiers.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(OIWObjectIdentifiers.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new OIWObjectIdentifiers(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final OIWObjectIdentifiers[] newArray(int i) {
            return new OIWObjectIdentifiers[i];
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
        if (!(obj instanceof OIWObjectIdentifiers)) {
            return false;
        }
        OIWObjectIdentifiers oIWObjectIdentifiers = (OIWObjectIdentifiers) obj;
        return Intrinsics.areEqual(this.IAuthTabCallbackDefault, oIWObjectIdentifiers.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.IAuthTabCallback, oIWObjectIdentifiers.IAuthTabCallback) && Intrinsics.areEqual(this.asInterface, oIWObjectIdentifiers.asInterface) && Intrinsics.areEqual(this.onNavigationEvent, oIWObjectIdentifiers.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallbackStub, oIWObjectIdentifiers.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onExtraCallback, oIWObjectIdentifiers.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, oIWObjectIdentifiers.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, oIWObjectIdentifiers.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        getEncryptedData getencrypteddata = this.asInterface;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.onNavigationEvent;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.IAuthTabCallbackStub;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.onExtraCallback;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "AccountManualInputLayout(type=" + this.IAuthTabCallbackDefault + ", key=" + this.IAuthTabCallback + ", onBack=" + this.asInterface + ", clearPreviousLayouts=" + this.onNavigationEvent + ", navigationRightButton=" + this.IAuthTabCallbackStub + ", logParam=" + this.onExtraCallback + ", headerTitle=" + this.onWarmupCompleted + ", excludedBankCodes=" + this.onExtraCallbackWithResult + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeParcelable(this.asInterface, i);
        Boolean bool = this.onNavigationEvent;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallback, parcel, i);
        parcel.writeString(this.onWarmupCompleted);
        List<Integer> list = this.onExtraCallbackWithResult;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public OIWObjectIdentifiers(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallbackDefault = str;
        this.IAuthTabCallback = str2;
        this.asInterface = getencrypteddata;
        this.onNavigationEvent = bool;
        this.IAuthTabCallbackStub = dynamicLoader;
        this.onExtraCallback = map;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = list;
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
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public /* synthetic */ OIWObjectIdentifiers(String str, String str2, getEncryptedData getencrypteddata, Boolean bool, DynamicLoader dynamicLoader, Map map, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, getencrypteddata, bool, (i & 16) != 0 ? null : dynamicLoader, (i & 32) != 0 ? null : map, str3, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Integer> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueInputAccountFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
