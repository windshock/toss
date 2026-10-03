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
import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueProductDescriptionFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAuthSafe extends getEncryptedData {
    public static final Parcelable.Creator<getAuthSafe> CREATOR = new onWarmupCompleted();
    private final reportDexLoadingIssue IAuthTabCallback;
    private final getEncryptedData IAuthTabCallbackDefault;
    private final DynamicLoader IAuthTabCallbackStub;
    private final String IAuthTabCallbackStubProxy;
    private final createDefaultMediaViewVideoRendererApi access000;
    private final String asBinder;
    private final boolean asInterface;
    private final String getInterfaceDescriptor;
    private final Boolean onExtraCallback;
    private final List<doCallInitialize> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Map<String, Object> onTransact;
    private final String onWarmupCompleted;

    public static final class onWarmupCompleted implements Parcelable.Creator<getAuthSafe> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final getAuthSafe createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            getEncryptedData getencrypteddata = (getEncryptedData) parcel.readParcelable(getAuthSafe.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicLoader dynamicLoader = (DynamicLoader) parcel.readParcelable(getAuthSafe.class.getClassLoader());
            Map<String, Object> mapOnNavigationEvent = Preconditions.INSTANCE.onNavigationEvent(parcel);
            String string3 = parcel.readString();
            createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = (createDefaultMediaViewVideoRendererApi) parcel.readParcelable(getAuthSafe.class.getClassLoader());
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(getAuthSafe.class.getClassLoader()));
            }
            return new getAuthSafe(string, string2, getencrypteddata, boolValueOf, dynamicLoader, mapOnNavigationEvent, string3, createdefaultmediaviewvideorendererapi, string4, arrayList, (reportDexLoadingIssue) parcel.readParcelable(getAuthSafe.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final getAuthSafe[] newArray(int i) {
            return new getAuthSafe[i];
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
        if (!(obj instanceof getAuthSafe)) {
            return false;
        }
        getAuthSafe getauthsafe = (getAuthSafe) obj;
        return Intrinsics.areEqual(this.getInterfaceDescriptor, getauthsafe.getInterfaceDescriptor) && Intrinsics.areEqual(this.onNavigationEvent, getauthsafe.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, getauthsafe.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onExtraCallback, getauthsafe.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallbackStub, getauthsafe.IAuthTabCallbackStub) && Intrinsics.areEqual(this.onTransact, getauthsafe.onTransact) && Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, getauthsafe.IAuthTabCallbackStubProxy) && Intrinsics.areEqual(this.access000, getauthsafe.access000) && Intrinsics.areEqual(this.asBinder, getauthsafe.asBinder) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getauthsafe.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, getauthsafe.IAuthTabCallback) && this.asInterface == getauthsafe.asInterface && Intrinsics.areEqual(this.onWarmupCompleted, getauthsafe.onWarmupCompleted);
    }

    public int hashCode() {
        int iHashCode = this.getInterfaceDescriptor.hashCode();
        int iHashCode2 = this.onNavigationEvent.hashCode();
        getEncryptedData getencrypteddata = this.IAuthTabCallbackDefault;
        int iHashCode3 = getencrypteddata == null ? 0 : getencrypteddata.hashCode();
        Boolean bool = this.onExtraCallback;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        DynamicLoader dynamicLoader = this.IAuthTabCallbackStub;
        int iHashCode5 = dynamicLoader == null ? 0 : dynamicLoader.hashCode();
        Map<String, Object> map = this.onTransact;
        int iHashCode6 = map == null ? 0 : map.hashCode();
        int iHashCode7 = this.IAuthTabCallbackStubProxy.hashCode();
        createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi = this.access000;
        int iHashCode8 = createdefaultmediaviewvideorendererapi == null ? 0 : createdefaultmediaviewvideorendererapi.hashCode();
        int iHashCode9 = this.asBinder.hashCode();
        int iHashCode10 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode11 = this.IAuthTabCallback.hashCode();
        int iHashCode12 = Boolean.hashCode(this.asInterface);
        String str = this.onWarmupCompleted;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ProductDescriptionLayout(type=" + this.getInterfaceDescriptor + ", key=" + this.onNavigationEvent + ", onBack=" + this.IAuthTabCallbackDefault + ", clearPreviousLayouts=" + this.onExtraCallback + ", navigationRightButton=" + this.IAuthTabCallbackStub + ", logParam=" + this.onTransact + ", title=" + this.IAuthTabCallbackStubProxy + ", topButton=" + this.access000 + ", subtitle=" + this.asBinder + ", contents=" + this.onExtraCallbackWithResult + ", cta=" + this.IAuthTabCallback + ", requiresScrollToBottom=" + this.asInterface + ", ctaTextRemainingScroll=" + this.onWarmupCompleted + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.getInterfaceDescriptor);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeParcelable(this.IAuthTabCallbackDefault, i);
        Boolean bool = this.onExtraCallback;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeParcelable(this.IAuthTabCallbackStub, i);
        Preconditions.INSTANCE.onExtraCallbackWithResult(this.onTransact, parcel, i);
        parcel.writeString(this.IAuthTabCallbackStubProxy);
        parcel.writeParcelable(this.access000, i);
        parcel.writeString(this.asBinder);
        List<doCallInitialize> list = this.onExtraCallbackWithResult;
        parcel.writeInt(list.size());
        Iterator<doCallInitialize> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeParcelable(this.IAuthTabCallback, i);
        parcel.writeInt(this.asInterface ? 1 : 0);
        parcel.writeString(this.onWarmupCompleted);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getAuthSafe(@NotNull String str, @NotNull String str2, @Nullable getEncryptedData getencrypteddata, @Nullable Boolean bool, @Nullable DynamicLoader dynamicLoader, @Nullable Map<String, ? extends Object> map, @NotNull String str3, @Nullable createDefaultMediaViewVideoRendererApi createdefaultmediaviewvideorendererapi, @NotNull String str4, @NotNull List<? extends doCallInitialize> list, @NotNull reportDexLoadingIssue reportdexloadingissue, boolean z, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(reportdexloadingissue, "");
        this.getInterfaceDescriptor = str;
        this.onNavigationEvent = str2;
        this.IAuthTabCallbackDefault = getencrypteddata;
        this.onExtraCallback = bool;
        this.IAuthTabCallbackStub = dynamicLoader;
        this.onTransact = map;
        this.IAuthTabCallbackStubProxy = str3;
        this.access000 = createdefaultmediaviewvideorendererapi;
        this.asBinder = str4;
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = reportdexloadingissue;
        this.asInterface = z;
        this.onWarmupCompleted = str5;
    }

    @Override // o.getEncryptedData
    public String onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getEncryptedData
    public getEncryptedData IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.getEncryptedData
    public Boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    @Override // o.getEncryptedData
    public DynamicLoader asBinder() {
        return this.IAuthTabCallbackStub;
    }

    @Override // o.getEncryptedData
    public Map<String, Object> onNavigationEvent() {
        return this.onTransact;
    }

    public final String access000() {
        return this.IAuthTabCallbackStubProxy;
    }

    public final createDefaultMediaViewVideoRendererApi extraCallbackWithResult() {
        return this.access000;
    }

    public final String IAuthTabCallbackStub() {
        return this.asBinder;
    }

    public final List<doCallInitialize> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public final reportDexLoadingIssue onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final boolean asInterface() {
        return this.asInterface;
    }

    public final String onTransact() {
        return this.onWarmupCompleted;
    }

    @Override // o.getEncryptedData
    public void onExtraCallbackWithResult(@NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull getDigestAlgorithms<? extends getEncryptedData> getdigestalgorithms, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        RippleIndicationInstanceExternalSyntheticLambda0 rippleIndicationInstanceExternalSyntheticLambda0 = new RippleIndicationInstanceExternalSyntheticLambda0(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.IAuthTabCallback().IAuthTabCallback(RippleNodeonAttach1.class), access100(), Reflection.getOrCreateKotlinClass(CardIssueProductDescriptionFragment.class));
        getEncryptedData.onWarmupCompleted(this, rippleIndicationInstanceExternalSyntheticLambda0, getdigestalgorithms, false, 4, null);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8.onWarmupCompleted(rippleIndicationInstanceExternalSyntheticLambda0);
    }
}
