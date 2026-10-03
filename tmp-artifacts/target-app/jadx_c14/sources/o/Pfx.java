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
import viva.republica.toss.cardrecommend.issuev2.ui.shinhan.CardIssueShinhanProductDescriptionFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Pfx extends getEncryptedData {
    public static final Parcelable.Creator<Pfx> CREATOR = new onNavigationEvent();
    private final reportDexLoadingIssue IAuthTabCallback;
    private final onNewResult IAuthTabCallbackDefault;
    private final DynamicLoader IAuthTabCallbackStub;
    private final String IAuthTabCallback_Parcel;
    private final String asBinder;
    private final String asInterface;
    private final List<makeFallbackLoader> onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final getEncryptedData onTransact;
    private final Boolean onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<Pfx> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Pfx[] newArray(int i) {
            return new Pfx[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Pfx createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(Pfx.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(Pfx.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            onNewResult onnewresult = (onNewResult) parcel.readParcelable(Pfx.class.getClassLoader());
            String string4 = parcel.readString();
            reportDexLoadingIssue reportdexloadingissue = (reportDexLoadingIssue) parcel.readParcelable(Pfx.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(Pfx.class.getClassLoader()));
            }
            return new Pfx(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, onnewresult, string4, reportdexloadingissue, arrayList);
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
        parcel.writeString(this.IAuthTabCallback_Parcel);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeParcelable(this.onTransact, i);
        Boolean bool = this.onWarmupCompleted;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onExtraCallbackWithResult, parcel, i);
        parcel.writeString(this.asBinder);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        parcel.writeString(this.asInterface);
        parcel.writeParcelable(this.IAuthTabCallback, i);
        List<makeFallbackLoader> list = this.onExtraCallback;
        parcel.writeInt(list.size());
        Iterator<makeFallbackLoader> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pfx(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @Nullable onNewResult onnewresult, @Nullable String str4, @Nullable reportDexLoadingIssue reportdexloadingissue, @NotNull List<? extends makeFallbackLoader> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback_Parcel = str;
        this.onNavigationEvent = str2;
        this.onTransact = getencrypteddata;
        this.onWarmupCompleted = bool;
        this.IAuthTabCallbackStub = dynamicLoader;
        this.onExtraCallbackWithResult = map;
        this.asBinder = str3;
        this.IAuthTabCallbackDefault = onnewresult;
        this.asInterface = str4;
        this.IAuthTabCallback = reportdexloadingissue;
        this.onExtraCallback = list;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final String onTransact() {
        return this.asBinder;
    }

    public final onNewResult asInterface() {
        return this.IAuthTabCallbackDefault;
    }

    public final String IAuthTabCallbackStub() {
        return this.asInterface;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final List<makeFallbackLoader> onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueShinhanProductDescriptionFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
