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
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueDraftFragment;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class KeyDerivationFunc extends getEncryptedData {
    public static final Parcelable.Creator<KeyDerivationFunc> CREATOR = new onWarmupCompleted();
    private final CardRecommendCardImage IAuthTabCallback;
    private final Map<String, Object> IAuthTabCallbackDefault;
    private final DynamicLoader IAuthTabCallbackStub;
    private final String asBinder;
    private final String asInterface;
    private final List<createNativeAdRatingApi> onExtraCallback;
    private final reportDexLoadingIssue onExtraCallbackWithResult;
    private final Boolean onNavigationEvent;
    private final getEncryptedData onTransact;
    private final String onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<KeyDerivationFunc> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final KeyDerivationFunc[] newArray(int i) {
            return new KeyDerivationFunc[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final KeyDerivationFunc createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(KeyDerivationFunc.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(KeyDerivationFunc.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            CardRecommendCardImage cardRecommendCardImage = (CardRecommendCardImage) parcel.readParcelable(KeyDerivationFunc.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(KeyDerivationFunc.class.getClassLoader()));
            }
            return new KeyDerivationFunc(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, cardRecommendCardImage, arrayList, (reportDexLoadingIssue) parcel.readParcelable(KeyDerivationFunc.class.getClassLoader()));
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
        if (!(obj instanceof KeyDerivationFunc)) {
            return false;
        }
        KeyDerivationFunc keyDerivationFunc = (KeyDerivationFunc) obj;
        return Intrinsics.areEqual(this.asBinder, keyDerivationFunc.asBinder) && Intrinsics.areEqual(this.onWarmupCompleted, keyDerivationFunc.onWarmupCompleted) && Intrinsics.areEqual(this.onTransact, keyDerivationFunc.onTransact) && Intrinsics.areEqual(this.onNavigationEvent, keyDerivationFunc.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallbackStub, keyDerivationFunc.IAuthTabCallbackStub) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, keyDerivationFunc.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.asInterface, keyDerivationFunc.asInterface) && Intrinsics.areEqual(this.IAuthTabCallback, keyDerivationFunc.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, keyDerivationFunc.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, keyDerivationFunc.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.asBinder.hashCode();
        int iHashCode2 = this.onWarmupCompleted.hashCode();
        getEncryptedData getencrypteddata = this.onTransact;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.onNavigationEvent;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.IAuthTabCallbackStub;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.IAuthTabCallbackDefault;
        int iHashCode6 = map == null ? 0 : map.hashCode();
        int iHashCode7 = this.asInterface.hashCode();
        int iHashCode8 = this.IAuthTabCallback.hashCode();
        int iHashCode9 = this.onExtraCallback.hashCode();
        reportDexLoadingIssue reportdexloadingissue = this.onExtraCallbackWithResult;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (reportdexloadingissue != null ? reportdexloadingissue.hashCode() : 0);
    }

    public String toString() {
        return "DraftLayout(type=" + this.asBinder + ", key=" + this.onWarmupCompleted + ", onBack=" + this.onTransact + ", clearPreviousLayouts=" + this.onNavigationEvent + ", navigationRightButton=" + this.IAuthTabCallbackStub + ", logParam=" + this.IAuthTabCallbackDefault + ", title=" + this.asInterface + ", image=" + this.IAuthTabCallback + ", fields=" + this.onExtraCallback + ", cta=" + this.onExtraCallbackWithResult + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.onNavigationEvent;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, parcel, i);
        parcel.writeString(this.asInterface);
        parcel.writeParcelable(this.IAuthTabCallback, i);
        List<createNativeAdRatingApi> list = this.onExtraCallback;
        parcel.writeInt(list.size());
        Iterator<createNativeAdRatingApi> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyDerivationFunc(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @NotNull CardRecommendCardImage cardRecommendCardImage, @NotNull List<? extends createNativeAdRatingApi> list, @Nullable reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(cardRecommendCardImage, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.asBinder = str;
        this.onWarmupCompleted = str2;
        this.onTransact = getencrypteddata;
        this.onNavigationEvent = bool;
        this.IAuthTabCallbackStub = dynamicLoader;
        this.IAuthTabCallbackDefault = map;
        this.asInterface = str3;
        this.IAuthTabCallback = cardRecommendCardImage;
        this.onExtraCallback = list;
        this.onExtraCallbackWithResult = reportdexloadingissue;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onTransact;
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
        return this.IAuthTabCallbackDefault;
    }

    public final String asInterface() {
        return this.asInterface;
    }

    public final CardRecommendCardImage IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }

    public final List<createNativeAdRatingApi> onWarmupCompleted() {
        return this.onExtraCallback;
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
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueDraftFragment.class));
        onNavigationEvent(rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, true);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
