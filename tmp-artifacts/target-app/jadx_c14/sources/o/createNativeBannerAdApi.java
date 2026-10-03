package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeBannerAdApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createNativeBannerAdApi> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String defaultValue;
    private final String description;
    private final createAdSizeApi descriptionAction;
    private final createNativeAdBaseApi dialog;
    private final boolean disabled;
    private final createAdSizeApi disabledAction;
    private final createNativeBannerAdViewApi helpArea;
    private final boolean isStatic;
    private final String key;
    private final List<DynamicLoaderFactory> options;
    private final String placeholder;
    private final String selectorSubTitle;
    private final String selectorTitle;
    private final String subTitle;
    private final String title;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<createNativeBannerAdApi> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeBannerAdApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            createNativeBannerAdApi createnativebanneradapiOnExtraCallback = onExtraCallback(parcel);
            if (i3 == 0) {
                int i4 = 88 / 0;
            }
            return createnativebanneradapiOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeBannerAdApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createNativeBannerAdApi[] createnativebanneradapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = IAuthTabCallback + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return createnativebanneradapiArrOnExtraCallbackWithResult;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r2 r4 r6 r7
          0x0049: PHI (r2v23 java.lang.String) = (r2v4 java.lang.String), (r2v24 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0049: PHI (r4v7 java.lang.String) = (r4v1 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0049: PHI (r6v8 java.lang.String) = (r6v0 java.lang.String), (r6v9 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0049: PHI (r7v10 java.lang.String) = (r7v0 java.lang.String), (r7v11 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[PHI: r2 r4 r6 r7
          0x0046: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v24 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0046: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v8 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0046: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v9 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
          0x0046: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v11 java.lang.String) binds: [B:8:0x0044, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.createNativeBannerAdApi onExtraCallback(android.os.Parcel r27) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.createNativeBannerAdApi.onNavigationEvent.onExtraCallback(android.os.Parcel):o.createNativeBannerAdApi");
        }

        public final createNativeBannerAdApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 103;
            IAuthTabCallback = i3 % 128;
            createNativeBannerAdApi[] createnativebanneradapiArr = new createNativeBannerAdApi[i];
            if (i3 % 2 != 0) {
                return createnativebanneradapiArr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 105;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i3 | i);
        int i11 = i9 | i10 | (~(i3 | i6));
        int i12 = i8 | i3;
        int i13 = (~((~i6) | i3)) | i10;
        int i14 = i3 + i + i2 + (111814883 * i4) + (1975835455 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i3) - 1583611904) + (47848387 * i) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i2) + ((-648806400) * i4) + (1432616960 * i5) + (442957824 * i15);
        int i17 = ((i3 * 961080817) - 60187382) + (i * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i2 * 961079685) + (i4 * 1618335983) + (i5 * 193609403) + (i15 * 1988296704);
        int i18 = i16 + (i17 * i17 * 176226304);
        return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
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
        if (!(obj instanceof createNativeBannerAdApi)) {
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        createNativeBannerAdApi createnativebanneradapi = (createNativeBannerAdApi) obj;
        if (!Intrinsics.areEqual(this.key, createnativebanneradapi.key)) {
            int i3 = onExtraCallback + 119;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.type, createnativebanneradapi.type) || !Intrinsics.areEqual(this.title, createnativebanneradapi.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, createnativebanneradapi.subTitle)) {
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.helpArea, createnativebanneradapi.helpArea)) {
            int i6 = IAuthTabCallback + 37;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 103;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.placeholder, createnativebanneradapi.placeholder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.description, createnativebanneradapi.description)) {
            int i10 = IAuthTabCallback + 117;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.descriptionAction, createnativebanneradapi.descriptionAction)) || !Intrinsics.areEqual(this.dialog, createnativebanneradapi.dialog)) {
            return false;
        }
        if (this.disabled != createnativebanneradapi.disabled) {
            int i12 = onExtraCallback + 33;
            IAuthTabCallback = i12 % 128;
            return i12 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.disabledAction, createnativebanneradapi.disabledAction)) {
            int i13 = IAuthTabCallback + 13;
            onExtraCallback = i13 % 128;
            return i13 % 2 != 0;
        }
        if (!(!Intrinsics.areEqual(this.selectorTitle, createnativebanneradapi.selectorTitle)) && Intrinsics.areEqual(this.selectorSubTitle, createnativebanneradapi.selectorSubTitle)) {
            if (Intrinsics.areEqual(this.options, createnativebanneradapi.options)) {
                return Intrinsics.areEqual(this.defaultValue, createnativebanneradapi.defaultValue) && this.isStatic == createnativebanneradapi.isStatic;
            }
            int i14 = onExtraCallback + 25;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int iHashCode5;
        int i2 = 2 % 2;
        int iHashCode6 = this.key.hashCode();
        int iHashCode7 = this.type.hashCode();
        String str = this.title;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i3 = onExtraCallback + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        String str2 = this.subTitle;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        int iHashCode9 = createnativebanneradviewapi == null ? 0 : createnativebanneradviewapi.hashCode();
        String str3 = this.placeholder;
        if (str3 == null) {
            int i5 = onExtraCallback + 15;
            IAuthTabCallback = i5 % 128;
            iHashCode2 = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.description;
        if (str4 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
            int i6 = onExtraCallback + 63;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 2;
            }
        }
        createAdSizeApi createadsizeapi = this.descriptionAction;
        int iHashCode10 = createadsizeapi == null ? 0 : createadsizeapi.hashCode();
        createNativeAdBaseApi createnativeadbaseapi = this.dialog;
        if (createnativeadbaseapi == null) {
            int i8 = onExtraCallback + 11;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = createnativeadbaseapi.hashCode();
        }
        int iHashCode11 = Boolean.hashCode(this.disabled);
        createAdSizeApi createadsizeapi2 = this.disabledAction;
        int iHashCode12 = createadsizeapi2 == null ? 0 : createadsizeapi2.hashCode();
        int iHashCode13 = this.selectorTitle.hashCode();
        String str5 = this.selectorSubTitle;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        int iHashCode15 = this.options.hashCode();
        String str6 = this.defaultValue;
        if (str6 != null) {
            int i10 = onExtraCallback + 63;
            i = iHashCode15;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = str6.hashCode();
        } else {
            i = iHashCode15;
            iHashCode5 = 0;
        }
        return (((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode4) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode5) * 31) + Boolean.hashCode(this.isStatic);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ", subTitle=" + this.subTitle + ", helpArea=" + this.helpArea + ", placeholder=" + this.placeholder + ", description=" + this.description + ", descriptionAction=" + this.descriptionAction + ", dialog=" + this.dialog + ", disabled=" + this.disabled + ", disabledAction=" + this.disabledAction + ", selectorTitle=" + this.selectorTitle + ", selectorSubTitle=" + this.selectorSubTitle + ", options=" + this.options + ", defaultValue=" + this.defaultValue + ", isStatic=" + this.isStatic + ")";
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            parcel.writeInt(0);
            i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
            i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
        }
        int i4 = i2 % 2;
        parcel.writeString(this.placeholder);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.descriptionAction, i);
        createNativeAdBaseApi createnativeadbaseapi = this.dialog;
        if (createnativeadbaseapi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativeadbaseapi.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.disabled ? 1 : 0);
        parcel.writeParcelable(this.disabledAction, i);
        parcel.writeString(this.selectorTitle);
        parcel.writeString(this.selectorSubTitle);
        List<DynamicLoaderFactory> list = this.options;
        parcel.writeInt(list.size());
        Iterator<DynamicLoaderFactory> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
            int i5 = onExtraCallback + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        parcel.writeString(this.defaultValue);
        parcel.writeInt(this.isStatic ? 1 : 0);
    }

    public createNativeBannerAdApi(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @Nullable String str5, @Nullable String str6, @Nullable createAdSizeApi createadsizeapi, @Nullable createNativeAdBaseApi createnativeadbaseapi, boolean z, @Nullable createAdSizeApi createadsizeapi2, @NotNull String str7, @Nullable String str8, @NotNull List<DynamicLoaderFactory> list, @Nullable String str9, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.subTitle = str4;
        this.helpArea = createnativebanneradviewapi;
        this.placeholder = str5;
        this.description = str6;
        this.descriptionAction = createadsizeapi;
        this.dialog = createnativeadbaseapi;
        this.disabled = z;
        this.disabledAction = createadsizeapi2;
        this.selectorTitle = str7;
        this.selectorSubTitle = str8;
        this.options = list;
        this.defaultValue = str9;
        this.isStatic = z2;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        createNativeBannerAdApi createnativebanneradapi = (createNativeBannerAdApi) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = createnativebanneradapi.title;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final createNativeBannerAdViewApi IAuthTabCallbackStub() {
        createNativeBannerAdViewApi createnativebanneradviewapi;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            createnativebanneradviewapi = this.helpArea;
            int i4 = 27 / 0;
        } else {
            createnativebanneradviewapi = this.helpArea;
        }
        int i5 = i3 + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return createnativebanneradviewapi;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.placeholder;
        int i5 = i2 + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        createNativeBannerAdApi createnativebanneradapi = (createNativeBannerAdApi) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = createnativebanneradapi.description;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final createAdSizeApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.descriptionAction;
        int i5 = i3 + 31;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return createadsizeapi;
        }
        throw null;
    }

    public final createNativeAdBaseApi onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        createNativeAdBaseApi createnativeadbaseapi = this.dialog;
        int i5 = i2 + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return createnativeadbaseapi;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        createNativeBannerAdApi createnativebanneradapi = (createNativeBannerAdApi) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = createnativebanneradapi.disabled;
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = i2 + 61;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z);
    }

    public final createAdSizeApi onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.disabledAction;
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return createadsizeapi;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.selectorTitle;
        int i4 = i2 + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.selectorSubTitle;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return str;
    }

    public final List<DynamicLoaderFactory> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<DynamicLoaderFactory> list = this.options;
        int i5 = i2 + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.defaultValue;
        int i5 = i2 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isStatic;
        int i5 = i2 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        return (String) onExtraCallback(1330119547, new Object[]{this}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1330119545, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    public final boolean IAuthTabCallback() {
        return ((Boolean) onExtraCallback(1524197547, new Object[]{this}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1524197547, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue();
    }

    public final String IAuthTabCallback_Parcel() {
        return (String) onExtraCallback(-1184539992, new Object[]{this}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1184539993, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }
}
