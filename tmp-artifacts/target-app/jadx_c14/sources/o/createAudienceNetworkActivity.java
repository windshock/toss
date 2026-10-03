package o;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.TossApplication;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createAudienceNetworkActivity implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createAudienceNetworkActivity> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createNativeAdApi checked;
    private final boolean defaultValue;
    private final boolean disabled;
    private final createAdSizeApi disabledAction;
    private final createNativeBannerAdViewApi helpArea;
    private final String key;
    private final createAdSizeApi questionBox;
    private final String title;
    private final String type;
    private final createNativeAdApi unchecked;

    public static final class IAuthTabCallback implements Parcelable.Creator<createAudienceNetworkActivity> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final createAudienceNetworkActivity IAuthTabCallback(Parcel parcel) {
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                createnativebanneradviewapiCreateFromParcel = null;
            } else {
                createnativebanneradviewapiCreateFromParcel = createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
                int i2 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
            createNativeBannerAdViewApi createnativebanneradviewapi = createnativebanneradviewapiCreateFromParcel;
            boolean z2 = parcel.readInt() != 0;
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(createAudienceNetworkActivity.class.getClassLoader());
            createAdSizeApi createadsizeapi2 = (createAdSizeApi) parcel.readParcelable(createAudienceNetworkActivity.class.getClassLoader());
            Parcelable.Creator<createNativeAdApi> creator = createNativeAdApi.CREATOR;
            createNativeAdApi createnativeadapiCreateFromParcel = creator.createFromParcel(parcel);
            createNativeAdApi createnativeadapiCreateFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            createAudienceNetworkActivity createaudiencenetworkactivity = new createAudienceNetworkActivity(string, string2, string3, createnativebanneradviewapi, z2, createadsizeapi, createadsizeapi2, createnativeadapiCreateFromParcel, createnativeadapiCreateFromParcel2, z);
            int i6 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return createaudiencenetworkactivity;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkActivity createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            createAudienceNetworkActivity createaudiencenetworkactivityIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 71 / 0;
            }
            return createaudiencenetworkactivityIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createAudienceNetworkActivity[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            createAudienceNetworkActivity[] createaudiencenetworkactivityArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return createaudiencenetworkactivityArrOnExtraCallback;
            }
            throw null;
        }

        public final createAudienceNetworkActivity[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i3 % 128;
            createAudienceNetworkActivity[] createaudiencenetworkactivityArr = new createAudienceNetworkActivity[i];
            if (i3 % 2 == 0) {
                return createaudiencenetworkactivityArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 73;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i5 | i2);
        int i12 = (~(i2 | i5)) | (~(i7 | i9)) | i8;
        int i13 = i + i5 + i4 + (62936680 * i3) + ((-2032430997) * i6);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i) + 797966336 + (1756943451 * i5) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i4) + ((-264241152) * i3) + ((-222822400) * i6) + (2040594432 * i14);
        int i16 = ((i * 1175661207) - 43826732) + (i5 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i4 * 1175660433) + (i3 * 1188219112) + (i6 * (-816965221)) + (i14 * 1798373376);
        if (i15 + (i16 * i16 * 914292736) == 1) {
            return IAuthTabCallback(objArr);
        }
        int i17 = 2 % 2;
        int i18 = onWarmupCompleted + 15;
        int i19 = i18 % 128;
        onNavigationEvent = i19;
        int i20 = i18 % 2;
        int i21 = i19 + 33;
        onWarmupCompleted = i21 % 128;
        int i22 = i21 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof createAudienceNetworkActivity)) {
            return false;
        }
        createAudienceNetworkActivity createaudiencenetworkactivity = (createAudienceNetworkActivity) obj;
        if (!Intrinsics.areEqual(this.key, createaudiencenetworkactivity.key) || !Intrinsics.areEqual(this.type, createaudiencenetworkactivity.type) || !Intrinsics.areEqual(this.title, createaudiencenetworkactivity.title) || (!Intrinsics.areEqual(this.helpArea, createaudiencenetworkactivity.helpArea))) {
            return false;
        }
        if (this.disabled != createaudiencenetworkactivity.disabled) {
            int i6 = onNavigationEvent + 39;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.disabledAction, createaudiencenetworkactivity.disabledAction)) {
            int i7 = onNavigationEvent + 123;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.questionBox, createaudiencenetworkactivity.questionBox)) {
            return Intrinsics.areEqual(this.checked, createaudiencenetworkactivity.checked) && Intrinsics.areEqual(this.unchecked, createaudiencenetworkactivity.unchecked) && this.defaultValue == createaudiencenetworkactivity.defaultValue;
        }
        int i9 = onWarmupCompleted + 81;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.key.hashCode();
        int iHashCode3 = this.type.hashCode();
        String str = this.title;
        int iHashCode4 = 0;
        if (str == null) {
            int i4 = onNavigationEvent + 75;
            onWarmupCompleted = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i5 = onNavigationEvent + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            }
        }
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        int iHashCode5 = createnativebanneradviewapi == null ? 0 : createnativebanneradviewapi.hashCode();
        int iHashCode6 = Boolean.hashCode(this.disabled);
        createAdSizeApi createadsizeapi = this.disabledAction;
        int iHashCode7 = createadsizeapi == null ? 0 : createadsizeapi.hashCode();
        createAdSizeApi createadsizeapi2 = this.questionBox;
        if (createadsizeapi2 != null) {
            int i7 = onNavigationEvent + 57;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                createadsizeapi2.hashCode();
                throw null;
            }
            iHashCode4 = createadsizeapi2.hashCode();
        }
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + this.checked.hashCode()) * 31) + this.unchecked.hashCode()) * 31) + Boolean.hashCode(this.defaultValue);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckboxField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ", helpArea=" + this.helpArea + ", disabled=" + this.disabled + ", disabledAction=" + this.disabledAction + ", questionBox=" + this.questionBox + ", checked=" + this.checked + ", unchecked=" + this.unchecked + ", defaultValue=" + this.defaultValue + ")";
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
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
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i3 = onWarmupCompleted + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeParcelable(this.disabledAction, i);
        parcel.writeParcelable(this.questionBox, i);
        this.checked.writeToParcel(parcel, i);
        this.unchecked.writeToParcel(parcel, i);
        parcel.writeInt(this.defaultValue ? 1 : 0);
        int i5 = onNavigationEvent + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public createAudienceNetworkActivity(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, boolean z, @Nullable createAdSizeApi createadsizeapi, @Nullable createAdSizeApi createadsizeapi2, @NotNull createNativeAdApi createnativeadapi, @NotNull createNativeAdApi createnativeadapi2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createnativeadapi, "");
        Intrinsics.checkNotNullParameter(createnativeadapi2, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.helpArea = createnativebanneradviewapi;
        this.disabled = z;
        this.disabledAction = createadsizeapi;
        this.questionBox = createadsizeapi2;
        this.checked = createnativeadapi;
        this.unchecked = createnativeadapi2;
        this.defaultValue = z2;
    }

    public String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final createNativeBannerAdViewApi onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.helpArea;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.disabled;
        int i5 = i3 + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        createAudienceNetworkActivity createaudiencenetworkactivity = (createAudienceNetworkActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        createAdSizeApi createadsizeapi = createaudiencenetworkactivity.disabledAction;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return createadsizeapi;
    }

    public final createAdSizeApi IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.questionBox;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final createNativeAdApi onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.checked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final createNativeAdApi asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.unchecked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.defaultValue;
        int i4 = i2 + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        return ((Integer) onExtraCallbackWithResult(875437780, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, -875437780, TossApplication.onSessionEnded.onExtraCallback())).intValue();
    }

    public final createAdSizeApi onWarmupCompleted() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        return (createAdSizeApi) onExtraCallbackWithResult(1551567192, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, new Object[]{this}, -1551567191, TossApplication.onSessionEnded.onExtraCallback());
    }
}
