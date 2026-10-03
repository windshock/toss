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
import viva.republica.toss.cardrecommend.issuev2.ui.select.CardIssueSelectOptionStepFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PrivateKeyInfo extends getEncryptedData {
    public static final Parcelable.Creator<PrivateKeyInfo> CREATOR = new onExtraCallbackWithResult();
    private final DynamicLoader IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackStub;
    private final String asInterface;
    private final Map<String, Object> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final DynamicLoader onNavigationEvent;
    private final List<Benchmark> onTransact;
    private final Boolean onWarmupCompleted;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<PrivateKeyInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final PrivateKeyInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(PrivateKeyInfo.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(PrivateKeyInfo.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            DynamicLoader dynamicLoader2 = (DynamicLoader) parcel.readParcelable(PrivateKeyInfo.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(PrivateKeyInfo.class.getClassLoader()));
            }
            return new PrivateKeyInfo(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, dynamicLoader2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final PrivateKeyInfo[] newArray(int i) {
            return new PrivateKeyInfo[i];
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
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.asInterface);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Boolean bool = this.onWarmupCompleted;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallback, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallback, parcel, i);
        parcel.writeParcelable(this.onNavigationEvent, i);
        List<Benchmark> list = this.onTransact;
        parcel.writeInt(list.size());
        Iterator<Benchmark> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public PrivateKeyInfo(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull DynamicLoader dynamicLoader2, @NotNull List<Benchmark> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dynamicLoader2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = str;
        this.asInterface = str2;
        this.IAuthTabCallbackStub = getencrypteddata;
        this.onWarmupCompleted = bool;
        this.IAuthTabCallback = dynamicLoader;
        this.onExtraCallback = map;
        this.onNavigationEvent = dynamicLoader2;
        this.onTransact = list;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final DynamicLoader onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final List<Benchmark> onExtraCallbackWithResult() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueSelectOptionStepFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
