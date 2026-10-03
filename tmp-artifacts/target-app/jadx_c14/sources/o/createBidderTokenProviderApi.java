package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createBidderTokenProviderApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createBidderTokenProviderApi> CREATOR = new onExtraCallbackWithResult();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createRewardedVideoAd defaultValue;
    private final String description;
    private final createNativeAdBaseApi dialog;
    private final boolean disabled;
    private final createAdSizeApi disabledAction;
    private final List<Integer> excludedBankCodes;
    private final createNativeBannerAdViewApi helpArea;
    private final String key;
    private final boolean manualInput;
    private final String manualInputHeaderTitle;
    private final String title;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<createBidderTokenProviderApi> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createBidderTokenProviderApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            createBidderTokenProviderApi createbiddertokenproviderapiOnExtraCallback = onExtraCallback(parcel);
            int i4 = onNavigationEvent + 67;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
            return createbiddertokenproviderapiOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createBidderTokenProviderApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createBidderTokenProviderApi[] createbiddertokenproviderapiArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = IAuthTabCallback + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return createbiddertokenproviderapiArrOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final createBidderTokenProviderApi onExtraCallback(Parcel parcel) {
            boolean z;
            createNativeAdBaseApi createnativeadbaseapiCreateFromParcel;
            int i;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            createRewardedVideoAd createrewardedvideoadCreateFromParcel = null;
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel = parcel.readInt() == 0 ? null : createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
            boolean z2 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i3 = IAuthTabCallback + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            } else {
                z = true;
            }
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(createBidderTokenProviderApi.class.getClassLoader());
            if (parcel.readInt() == 0) {
                int i5 = IAuthTabCallback + 11;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                createnativeadbaseapiCreateFromParcel = null;
            } else {
                createnativeadbaseapiCreateFromParcel = createNativeAdBaseApi.CREATOR.createFromParcel(parcel);
            }
            createNativeAdBaseApi createnativeadbaseapi = createnativeadbaseapiCreateFromParcel;
            if (parcel.readInt() == 0) {
                i = onNavigationEvent + 115;
            } else {
                createrewardedvideoadCreateFromParcel = createRewardedVideoAd.CREATOR.createFromParcel(parcel);
                i = onNavigationEvent + 111;
            }
            IAuthTabCallback = i % 128;
            int i7 = i % 2;
            createRewardedVideoAd createrewardedvideoad = createrewardedvideoadCreateFromParcel;
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                int i10 = IAuthTabCallback + 23;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            createBidderTokenProviderApi createbiddertokenproviderapi = new createBidderTokenProviderApi(string, string2, string3, string4, createnativebanneradviewapiCreateFromParcel, z2, string5, z, createadsizeapi, createnativeadbaseapi, createrewardedvideoad, arrayList);
            int i12 = IAuthTabCallback + 85;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            return createbiddertokenproviderapi;
        }

        public final createBidderTokenProviderApi[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 115;
            IAuthTabCallback = i3 % 128;
            createBidderTokenProviderApi[] createbiddertokenproviderapiArr = new createBidderTokenProviderApi[i];
            if (i3 % 2 != 0) {
                return createbiddertokenproviderapiArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 85;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = (~(i7 | i8 | i)) | (~(i2 | i3 | i));
        int i10 = ~i;
        int i11 = (~(i8 | i2)) | (~(i8 | i10));
        int i12 = (~(i | i3)) | (~(i7 | i10));
        int i13 = i2 + i3 + i4 + ((-564018846) * i6) + (483938512 * i5);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i2) + 752877568 + ((-1516524009) * i3) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i4) + (1390411776 * i6) + (452984832 * i5) + ((-1135738880) * i14);
        int i16 = ((i2 * 1456092922) - 824780772) + (i3 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i4 * 1456093799) + (i6 * 578355822) + (i5 * 1098359728) + (i14 * 1868693504);
        return i15 + ((i16 * i16) * 2110914560) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        onExtraCallback = i5 % 128;
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
        if (!(obj instanceof createBidderTokenProviderApi)) {
            return false;
        }
        createBidderTokenProviderApi createbiddertokenproviderapi = (createBidderTokenProviderApi) obj;
        if (!Intrinsics.areEqual(this.key, createbiddertokenproviderapi.key)) {
            int i2 = onExtraCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.type, createbiddertokenproviderapi.type) || !Intrinsics.areEqual(this.title, createbiddertokenproviderapi.title) || !Intrinsics.areEqual(this.description, createbiddertokenproviderapi.description)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.helpArea, createbiddertokenproviderapi.helpArea)) {
            int i3 = onExtraCallback + 97;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 == 0;
        }
        if (this.manualInput != createbiddertokenproviderapi.manualInput) {
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.manualInputHeaderTitle, createbiddertokenproviderapi.manualInputHeaderTitle)) {
            return this.disabled == createbiddertokenproviderapi.disabled && Intrinsics.areEqual(this.disabledAction, createbiddertokenproviderapi.disabledAction) && Intrinsics.areEqual(this.dialog, createbiddertokenproviderapi.dialog) && Intrinsics.areEqual(this.defaultValue, createbiddertokenproviderapi.defaultValue) && Intrinsics.areEqual(this.excludedBankCodes, createbiddertokenproviderapi.excludedBankCodes);
        }
        int i6 = onExtraCallback + 51;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.key.hashCode();
        int iHashCode6 = this.type.hashCode();
        String str = this.title;
        if (str == null) {
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onExtraCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.description;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i6 = onExtraCallbackWithResult + 37;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = createnativebanneradviewapi.hashCode();
        }
        int iHashCode8 = Boolean.hashCode(this.manualInput);
        String str3 = this.manualInputHeaderTitle;
        if (str3 == null) {
            int i8 = onExtraCallback + 73;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        int iHashCode9 = Boolean.hashCode(this.disabled);
        createAdSizeApi createadsizeapi = this.disabledAction;
        int iHashCode10 = createadsizeapi == null ? 0 : createadsizeapi.hashCode();
        createNativeAdBaseApi createnativeadbaseapi = this.dialog;
        if (createnativeadbaseapi == null) {
            int i10 = onExtraCallback + 5;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = createnativeadbaseapi.hashCode();
        }
        createRewardedVideoAd createrewardedvideoad = this.defaultValue;
        int iHashCode11 = (((((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode4) * 31) + (createrewardedvideoad != null ? createrewardedvideoad.hashCode() : 0)) * 31) + this.excludedBankCodes.hashCode();
        int i12 = onExtraCallback + 93;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return iHashCode11;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountSelectField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", helpArea=" + this.helpArea + ", manualInput=" + this.manualInput + ", manualInputHeaderTitle=" + this.manualInputHeaderTitle + ", disabled=" + this.disabled + ", disabledAction=" + this.disabledAction + ", dialog=" + this.dialog + ", defaultValue=" + this.defaultValue + ", excludedBankCodes=" + this.excludedBankCodes + ")";
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i3 = onExtraCallback + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.manualInput ? 1 : 0);
        parcel.writeString(this.manualInputHeaderTitle);
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeParcelable(this.disabledAction, i);
        createNativeAdBaseApi createnativeadbaseapi = this.dialog;
        if (createnativeadbaseapi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativeadbaseapi.writeToParcel(parcel, i);
        }
        createRewardedVideoAd createrewardedvideoad = this.defaultValue;
        if (createrewardedvideoad == null) {
            int i5 = onExtraCallback + 81;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createrewardedvideoad.writeToParcel(parcel, i);
        }
        List<Integer> list = this.excludedBankCodes;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (!(!it.hasNext())) {
            int i7 = onExtraCallback + 113;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(it.next().intValue());
        }
    }

    public createBidderTokenProviderApi(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, boolean z, @Nullable String str5, boolean z2, @Nullable createAdSizeApi createadsizeapi, @Nullable createNativeAdBaseApi createnativeadbaseapi, @Nullable createRewardedVideoAd createrewardedvideoad, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.description = str4;
        this.helpArea = createnativebanneradviewapi;
        this.manualInput = z;
        this.manualInputHeaderTitle = str5;
        this.disabled = z2;
        this.disabledAction = createadsizeapi;
        this.dialog = createnativeadbaseapi;
        this.defaultValue = createrewardedvideoad;
        this.excludedBankCodes = list;
    }

    public String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        createBidderTokenProviderApi createbiddertokenproviderapi = (createBidderTokenProviderApi) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = createbiddertokenproviderapi.title;
        int i5 = i2 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.description;
        int i4 = i2 + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final createNativeBannerAdViewApi IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        int i4 = i2 + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return createnativebanneradviewapi;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        createBidderTokenProviderApi createbiddertokenproviderapi = (createBidderTokenProviderApi) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = createbiddertokenproviderapi.manualInput;
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = i2 + 83;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z);
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.manualInputHeaderTitle;
        int i5 = i3 + 65;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return str;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.disabled;
        int i5 = i3 + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final createAdSizeApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        createAdSizeApi createadsizeapi = this.disabledAction;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return createadsizeapi;
    }

    public final createNativeAdBaseApi onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        createNativeAdBaseApi createnativeadbaseapi = this.dialog;
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return createnativeadbaseapi;
    }

    public final createRewardedVideoAd IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        createRewardedVideoAd createrewardedvideoad = this.defaultValue;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return createrewardedvideoad;
    }

    public final List<Integer> asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<Integer> list = this.excludedBankCodes;
        int i5 = i2 + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        return ((Boolean) onWarmupCompleted(setCurrentIndex.onNavigationEvent(), 1144621486, -1144621485, new Object[]{this}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).booleanValue();
    }

    public final String IAuthTabCallbackStubProxy() {
        return (String) onWarmupCompleted(setCurrentIndex.onNavigationEvent(), -1325372330, 1325372330, new Object[]{this}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }
}
