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
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueCompleteFragment;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EncryptionScheme extends getEncryptedData {
    public static final Parcelable.Creator<EncryptionScheme> CREATOR = new onWarmupCompleted();
    private final String IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackDefault;
    private final Map<String, Object> IAuthTabCallbackStub;
    private final String access000;
    private final String asBinder;
    private final DynamicLoader asInterface;
    private final CardRecommendCardImage onExtraCallback;
    private final reportDexLoadingIssue onExtraCallbackWithResult;
    private final List<FileUtilsParentDirNotFoundException> onNavigationEvent;
    private final String onTransact;
    private final Boolean onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<EncryptionScheme> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final EncryptionScheme[] newArray(int i) {
            return new EncryptionScheme[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final EncryptionScheme createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(EncryptionScheme.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(EncryptionScheme.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            CardRecommendCardImage cardRecommendCardImage = (CardRecommendCardImage) parcel.readParcelable(EncryptionScheme.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EncryptionScheme.class.getClassLoader()));
            }
            return new EncryptionScheme(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, string4, cardRecommendCardImage, arrayList, (reportDexLoadingIssue) parcel.readParcelable(EncryptionScheme.class.getClassLoader()));
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
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.access000);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Boolean bool = this.onWarmupCompleted;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.asInterface, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.IAuthTabCallbackStub, parcel, i);
        parcel.writeString(this.asBinder);
        parcel.writeString(this.onTransact);
        parcel.writeParcelable(this.onExtraCallback, i);
        List<FileUtilsParentDirNotFoundException> list = this.onNavigationEvent;
        parcel.writeInt(list.size());
        Iterator<FileUtilsParentDirNotFoundException> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeParcelable(this.onExtraCallbackWithResult, i);
    }

    public EncryptionScheme(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable String str4, @NotNull CardRecommendCardImage cardRecommendCardImage, @NotNull List<FileUtilsParentDirNotFoundException> list, @NotNull reportDexLoadingIssue reportdexloadingissue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(cardRecommendCardImage, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.IAuthTabCallback = str;
        this.access000 = str2;
        this.IAuthTabCallbackDefault = getencrypteddata;
        this.onWarmupCompleted = bool;
        this.asInterface = dynamicLoader;
        this.IAuthTabCallbackStub = map;
        this.asBinder = str3;
        this.onTransact = str4;
        this.onExtraCallback = cardRecommendCardImage;
        this.onNavigationEvent = list;
        this.onExtraCallbackWithResult = reportdexloadingissue;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.asInterface;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.IAuthTabCallbackStub;
    }

    public final String onTransact() {
        return this.asBinder;
    }

    public final String asInterface() {
        return this.onTransact;
    }

    public final CardRecommendCardImage onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public final List<FileUtilsParentDirNotFoundException> IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    public final reportDexLoadingIssue onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueCompleteFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
