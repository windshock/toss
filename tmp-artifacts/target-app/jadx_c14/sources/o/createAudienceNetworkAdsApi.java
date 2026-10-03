package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createAudienceNetworkAdsApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createAudienceNetworkAdsApi> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String description;
    private final List<NativeAdBaseApi> descriptions;
    private final boolean disabled;
    private final createAdSizeApi disabledAction;
    private final createNativeBannerAdViewApi helpArea;
    private final boolean isBold;
    private final boolean isChecked;
    private final boolean isOpen;
    private final String key;
    private final String link;
    private final String size;
    private final String title;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<createAudienceNetworkAdsApi> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkAdsApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            createAudienceNetworkAdsApi createaudiencenetworkadsapiOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            int i5 = onExtraCallback + 105;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return createaudiencenetworkadsapiOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkAdsApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            createAudienceNetworkAdsApi[] createaudiencenetworkadsapiArrOnWarmupCompleted = onWarmupCompleted(i);
            if (i4 != 0) {
                int i5 = 36 / 0;
            }
            return createaudiencenetworkadsapiArrOnWarmupCompleted;
        }

        public final createAudienceNetworkAdsApi onNavigationEvent(Parcel parcel) {
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel;
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ArrayList arrayList = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = IAuthTabCallback + 81;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 2;
                }
                createnativebanneradviewapiCreateFromParcel = null;
            } else {
                createnativebanneradviewapiCreateFromParcel = createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
            }
            createNativeBannerAdViewApi createnativebanneradviewapi = createnativebanneradviewapiCreateFromParcel;
            String string4 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(createAudienceNetworkAdsApi.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i6 = onExtraCallback + 113;
                int i7 = i6 % 128;
                IAuthTabCallback = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 71;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(NativeAdBaseApi.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList2 = arrayList;
            boolean z3 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i13 = IAuthTabCallback + 29;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                z = true;
            } else {
                z = false;
            }
            createAudienceNetworkAdsApi createaudiencenetworkadsapi = new createAudienceNetworkAdsApi(string, string2, string3, createnativebanneradviewapi, string4, z2, createadsizeapi, arrayList2, z3, string5, string6, z4, z);
            int i15 = IAuthTabCallback + 71;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            return createaudiencenetworkadsapi;
        }

        public final createAudienceNetworkAdsApi[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 105;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            createAudienceNetworkAdsApi[] createaudiencenetworkadsapiArr = new createAudienceNetworkAdsApi[i];
            if (i3 % 2 == 0) {
                int i5 = 56 / 0;
            }
            int i6 = i4 + 73;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 86 / 0;
            }
            return createaudiencenetworkadsapiArr;
        }
    }

    static {
        int i = IAuthTabCallback + 117;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i2 | i5)) | (~(i4 | i5));
        int i10 = ~i4;
        int i11 = (~(i10 | i5)) | i2;
        int i12 = (~(i5 | i2 | i4)) | (~(i8 | i10));
        int i13 = i2 + i4 + i6 + ((-373584967) * i) + ((-1711780345) * i3);
        int i14 = i13 * i13;
        int i15 = (i2 * 1075882953) + 1902575616 + (1075882953 * i4) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i6) + ((-375259136) * i) + ((-1109524480) * i3) + (585564160 * i14);
        int i16 = ((i2 * 235012993) - 778813113) + (i4 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i6 * 235013625) + (i * 915899377) + (i3 * (-1709701169)) + (i14 * 1974403072);
        return i15 + ((i16 * i16) * (-848756736)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createAudienceNetworkAdsApi)) {
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        createAudienceNetworkAdsApi createaudiencenetworkadsapi = (createAudienceNetworkAdsApi) obj;
        if (!Intrinsics.areEqual(this.key, createaudiencenetworkadsapi.key)) {
            int i3 = onNavigationEvent + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.type, createaudiencenetworkadsapi.type)) || !Intrinsics.areEqual(this.title, createaudiencenetworkadsapi.title) || !Intrinsics.areEqual(this.helpArea, createaudiencenetworkadsapi.helpArea) || (!Intrinsics.areEqual(this.description, createaudiencenetworkadsapi.description))) {
            return false;
        }
        if (this.disabled != createaudiencenetworkadsapi.disabled) {
            int i5 = onExtraCallback + 81;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.disabledAction, createaudiencenetworkadsapi.disabledAction) || !Intrinsics.areEqual(this.descriptions, createaudiencenetworkadsapi.descriptions) || this.isBold != createaudiencenetworkadsapi.isBold) {
            return false;
        }
        if (!Intrinsics.areEqual(this.size, createaudiencenetworkadsapi.size)) {
            int i6 = onNavigationEvent + 109;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.link, createaudiencenetworkadsapi.link)) {
            return false;
        }
        if (this.isOpen == createaudiencenetworkadsapi.isOpen) {
            if (this.isChecked == createaudiencenetworkadsapi.isChecked) {
                return true;
            }
            int i8 = onNavigationEvent + 33;
            onExtraCallback = i8 % 128;
            return i8 % 2 == 0;
        }
        int i9 = onNavigationEvent + 27;
        int i10 = i9 % 128;
        onExtraCallback = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 95;
        onNavigationEvent = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 36 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.key.hashCode();
        int iHashCode4 = this.type.hashCode();
        int iHashCode5 = this.title.hashCode();
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = createnativebanneradviewapi.hashCode();
            int i4 = onExtraCallback + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 2;
            }
        }
        String str = this.description;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Boolean.hashCode(this.disabled);
        createAdSizeApi createadsizeapi = this.disabledAction;
        if (createadsizeapi == null) {
            int i6 = onNavigationEvent + 15;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = createadsizeapi.hashCode();
            int i8 = onNavigationEvent + 13;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        List<NativeAdBaseApi> list = this.descriptions;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isBold);
        int iHashCode10 = this.size.hashCode();
        String str2 = this.link;
        return (((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOpen)) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AgreementField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ", helpArea=" + this.helpArea + ", description=" + this.description + ", disabled=" + this.disabled + ", disabledAction=" + this.disabledAction + ", descriptions=" + this.descriptions + ", isBold=" + this.isBold + ", size=" + this.size + ", link=" + this.link + ", isOpen=" + this.isOpen + ", isChecked=" + this.isChecked + ")";
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.key);
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            throw null;
        }
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i5 = onNavigationEvent + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeParcelable(this.disabledAction, i);
        List<NativeAdBaseApi> list = this.descriptions;
        if (list == null) {
            int i7 = onExtraCallback + 13;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NativeAdBaseApi> it = list.iterator();
            int i8 = onExtraCallback + 63;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isBold ? 1 : 0);
        parcel.writeString(this.size);
        parcel.writeString(this.link);
        parcel.writeInt(this.isOpen ? 1 : 0);
        parcel.writeInt(this.isChecked ? 1 : 0);
    }

    public createAudienceNetworkAdsApi(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @Nullable String str4, boolean z, @Nullable createAdSizeApi createadsizeapi, @Nullable List<NativeAdBaseApi> list, boolean z2, @NotNull String str5, @Nullable String str6, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.helpArea = createnativebanneradviewapi;
        this.description = str4;
        this.disabled = z;
        this.disabledAction = createadsizeapi;
        this.descriptions = list;
        this.isBold = z2;
        this.size = str5;
        this.link = str6;
        this.isOpen = z3;
        this.isChecked = z4;
    }

    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 71;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final createNativeBannerAdViewApi onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return createnativebanneradviewapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.disabled;
        int i5 = i2 + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return z;
    }

    public final createAdSizeApi onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        createAdSizeApi createadsizeapi = this.disabledAction;
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return createadsizeapi;
    }

    public final List<NativeAdBaseApi> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<NativeAdBaseApi> list = this.descriptions;
        int i5 = i3 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean asBinder() {
        boolean z;
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            z = this.isBold;
            int i4 = 77 / 0;
        } else {
            z = this.isBold;
        }
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        createAudienceNetworkAdsApi createaudiencenetworkadsapi = (createAudienceNetworkAdsApi) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = createaudiencenetworkadsapi.size;
        int i5 = i2 + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        createAudienceNetworkAdsApi createaudiencenetworkadsapi = (createAudienceNetworkAdsApi) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = createaudiencenetworkadsapi.link;
        int i5 = i2 + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.isOpen;
        int i5 = i3 + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isChecked;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return z;
    }

    public final String IAuthTabCallbackStub() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (String) onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1363808036, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1363808036, new Object[]{this}, iOnExtraCallback, iOnExtraCallback2);
    }

    public final String IAuthTabCallbackDefault() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (String) onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1419239673, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1419239674, new Object[]{this}, iOnExtraCallback, iOnExtraCallback2);
    }
}
