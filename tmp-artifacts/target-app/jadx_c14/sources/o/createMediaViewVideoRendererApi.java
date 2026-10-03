package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createMediaViewVideoRendererApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createMediaViewVideoRendererApi> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String approveDescription;
    private final List<createMediaViewApi> constraints;
    private final String defaultValue;
    private final String description;
    private final boolean disabled;
    private final createAdSizeApi disabledAction;
    private final onWarmupCompleted displayFormat;
    private final createNativeBannerAdViewApi helpArea;
    private final createNativeAdLayoutApi inputType;
    private final String key;
    private final String placeholder;
    private final IAuthTabCallback style;
    private final String suffix;
    private final String title;
    private final String type;

    public static final class onExtraCallback implements Parcelable.Creator<createMediaViewVideoRendererApi> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createMediaViewVideoRendererApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createMediaViewVideoRendererApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            createMediaViewVideoRendererApi[] createmediaviewvideorendererapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallback + 63;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return createmediaviewvideorendererapiArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final createMediaViewVideoRendererApi onExtraCallbackWithResult(Parcel parcel) {
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 11;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                createnativebanneradviewapiCreateFromParcel = null;
            } else {
                createnativebanneradviewapiCreateFromParcel = createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
            }
            createNativeBannerAdViewApi createnativebanneradviewapi = createnativebanneradviewapiCreateFromParcel;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            createAdSizeApi createadsizeapi = (createAdSizeApi) parcel.readParcelable(createMediaViewVideoRendererApi.class.getClassLoader());
            String string6 = parcel.readString();
            IAuthTabCallback iAuthTabCallbackValueOf = IAuthTabCallback.valueOf(parcel.readString());
            createNativeAdLayoutApi createnativeadlayoutapiValueOf = createNativeAdLayoutApi.valueOf(parcel.readString());
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList.add(parcel.readParcelable(createMediaViewVideoRendererApi.class.getClassLoader()));
            }
            return new createMediaViewVideoRendererApi(string, string2, string3, createnativebanneradviewapi, string4, string5, z, createadsizeapi, string6, iAuthTabCallbackValueOf, createnativeadlayoutapiValueOf, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : onWarmupCompleted.valueOf(parcel.readString()), parcel.readString());
        }

        public final createMediaViewVideoRendererApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 85;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            createMediaViewVideoRendererApi[] createmediaviewvideorendererapiArr = new createMediaViewVideoRendererApi[i];
            int i6 = i4 + 79;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 29 / 0;
            }
            return createmediaviewvideorendererapiArr;
        }
    }

    static {
        int i = IAuthTabCallback + 63;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~((~i6) | i7);
        int i9 = ~(i3 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i6;
        int i12 = ~(i7 | i6);
        int i13 = i + i6 + i4 + (1577873432 * i2) + (977123338 * i5);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i) - 865599488) + ((-647756440) * i6) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i4) + ((-767557632) * i2) + (1290797056 * i5) + ((-539361280) * i14);
        int i16 = (i * (-1177406726)) + 1326046462 + (i6 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i4 * (-1177406223)) + (i2 * 1546282648) + (i5 * (-1884272278)) + (i14 * 70909952);
        return i15 + ((i16 * i16) * 451280896) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof createMediaViewVideoRendererApi)) {
            return false;
        }
        createMediaViewVideoRendererApi createmediaviewvideorendererapi = (createMediaViewVideoRendererApi) obj;
        if (Intrinsics.areEqual(this.key, createmediaviewvideorendererapi.key) && Intrinsics.areEqual(this.type, createmediaviewvideorendererapi.type) && Intrinsics.areEqual(this.title, createmediaviewvideorendererapi.title) && !(!Intrinsics.areEqual(this.helpArea, createmediaviewvideorendererapi.helpArea))) {
            if (!Intrinsics.areEqual(this.description, createmediaviewvideorendererapi.description)) {
                int i4 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.placeholder, createmediaviewvideorendererapi.placeholder)) {
                int i6 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.disabled != createmediaviewvideorendererapi.disabled) {
                int i8 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i8 % 128;
                return i8 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.disabledAction, createmediaviewvideorendererapi.disabledAction) || !Intrinsics.areEqual(this.suffix, createmediaviewvideorendererapi.suffix)) {
                return false;
            }
            if (this.style != createmediaviewvideorendererapi.style) {
                int i9 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (this.inputType == createmediaviewvideorendererapi.inputType) {
                return Intrinsics.areEqual(this.constraints, createmediaviewvideorendererapi.constraints) && Intrinsics.areEqual(this.defaultValue, createmediaviewvideorendererapi.defaultValue) && this.displayFormat == createmediaviewvideorendererapi.displayFormat && Intrinsics.areEqual(this.approveDescription, createmediaviewvideorendererapi.approveDescription);
            }
            int i11 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int iHashCode3;
        int i2 = 2 % 2;
        int iHashCode4 = this.key.hashCode();
        int iHashCode5 = this.type.hashCode();
        String str = this.title;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i3 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = createnativebanneradviewapi.hashCode();
        }
        String str2 = this.description;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.placeholder;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode8 = Boolean.hashCode(this.disabled);
        createAdSizeApi createadsizeapi = this.disabledAction;
        int iHashCode9 = createadsizeapi == null ? 0 : createadsizeapi.hashCode();
        int iHashCode10 = this.suffix.hashCode();
        int iHashCode11 = this.style.hashCode();
        int iHashCode12 = this.inputType.hashCode();
        int iHashCode13 = this.constraints.hashCode();
        String str4 = this.defaultValue;
        int iHashCode14 = str4 == null ? 0 : str4.hashCode();
        onWarmupCompleted onwarmupcompleted = this.displayFormat;
        int iHashCode15 = onwarmupcompleted == null ? 0 : onwarmupcompleted.hashCode();
        String str5 = this.approveDescription;
        if (str5 != null) {
            int i6 = onNavigationEvent + 87;
            i = iHashCode15;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = str5.hashCode();
        } else {
            i = iHashCode15;
            iHashCode3 = 0;
        }
        return (((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InputField(key=" + this.key + ", type=" + this.type + ", title=" + this.title + ", helpArea=" + this.helpArea + ", description=" + this.description + ", placeholder=" + this.placeholder + ", disabled=" + this.disabled + ", disabledAction=" + this.disabledAction + ", suffix=" + this.suffix + ", style=" + this.style + ", inputType=" + this.inputType + ", constraints=" + this.constraints + ", defaultValue=" + this.defaultValue + ", displayFormat=" + this.displayFormat + ", approveDescription=" + this.approveDescription + ")";
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[PHI: r1
      0x0043: PHI (r1v21 o.createNativeBannerAdViewApi) = (r1v7 o.createNativeBannerAdViewApi), (r1v25 o.createNativeBannerAdViewApi) binds: [B:8:0x003d, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.createMediaViewVideoRendererApi.onNavigationEvent
            int r1 = r1 + 57
            int r2 = r1 % 128
            o.createMediaViewVideoRendererApi.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            if (r1 != 0) goto L2c
            java.lang.String r1 = r5.key
            r6.writeString(r1)
            java.lang.String r1 = r5.type
            r6.writeString(r1)
            java.lang.String r1 = r5.title
            r6.writeString(r1)
            o.createNativeBannerAdViewApi r1 = r5.helpArea
            r3 = 48
            int r3 = r3 / r4
            if (r1 != 0) goto L43
            goto L3f
        L2c:
            java.lang.String r1 = r5.key
            r6.writeString(r1)
            java.lang.String r1 = r5.type
            r6.writeString(r1)
            java.lang.String r1 = r5.title
            r6.writeString(r1)
            o.createNativeBannerAdViewApi r1 = r5.helpArea
            if (r1 != 0) goto L43
        L3f:
            r6.writeInt(r4)
            goto L49
        L43:
            r6.writeInt(r2)
            r1.writeToParcel(r6, r7)
        L49:
            java.lang.String r1 = r5.description
            r6.writeString(r1)
            java.lang.String r1 = r5.placeholder
            r6.writeString(r1)
            boolean r1 = r5.disabled
            r6.writeInt(r1)
            o.createAdSizeApi r1 = r5.disabledAction
            r6.writeParcelable(r1, r7)
            java.lang.String r1 = r5.suffix
            r6.writeString(r1)
            o.createMediaViewVideoRendererApi$IAuthTabCallback r1 = r5.style
            java.lang.String r1 = r1.name()
            r6.writeString(r1)
            o.createNativeAdLayoutApi r1 = r5.inputType
            java.lang.String r1 = r1.name()
            r6.writeString(r1)
            java.util.List<o.createMediaViewApi> r1 = r5.constraints
            int r3 = r1.size()
            r6.writeInt(r3)
            java.util.Iterator r1 = r1.iterator()
        L81:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r1.next()
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r6.writeParcelable(r3, r7)
            goto L81
        L91:
            java.lang.String r7 = r5.defaultValue
            r6.writeString(r7)
            o.createMediaViewVideoRendererApi$onWarmupCompleted r7 = r5.displayFormat
            if (r7 != 0) goto Lb0
            int r7 = o.createMediaViewVideoRendererApi.onNavigationEvent
            int r7 = r7 + 39
            int r1 = r7 % 128
            o.createMediaViewVideoRendererApi.onExtraCallbackWithResult = r1
            int r7 = r7 % r0
            r6.writeInt(r4)
            int r7 = o.createMediaViewVideoRendererApi.onExtraCallbackWithResult
            int r7 = r7 + 85
            int r1 = r7 % 128
            o.createMediaViewVideoRendererApi.onNavigationEvent = r1
            int r7 = r7 % r0
            goto Lba
        Lb0:
            r6.writeInt(r2)
            java.lang.String r7 = r7.name()
            r6.writeString(r7)
        Lba:
            java.lang.String r7 = r5.approveDescription
            r6.writeString(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createMediaViewVideoRendererApi.writeToParcel(android.os.Parcel, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public createMediaViewVideoRendererApi(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @Nullable String str4, @Nullable String str5, boolean z, @Nullable createAdSizeApi createadsizeapi, @NotNull String str6, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull createNativeAdLayoutApi createnativeadlayoutapi, @NotNull List<? extends createMediaViewApi> list, @Nullable String str7, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(createnativeadlayoutapi, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.helpArea = createnativebanneradviewapi;
        this.description = str4;
        this.placeholder = str5;
        this.disabled = z;
        this.disabledAction = createadsizeapi;
        this.suffix = str6;
        this.style = iAuthTabCallback;
        this.inputType = createnativeadlayoutapi;
        this.constraints = list;
        this.defaultValue = str7;
        this.displayFormat = onwarmupcompleted;
        this.approveDescription = str8;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        createMediaViewVideoRendererApi createmediaviewvideorendererapi = (createMediaViewVideoRendererApi) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        createNativeBannerAdViewApi createnativebanneradviewapi = createmediaviewvideorendererapi.helpArea;
        if (i3 != 0) {
            return createnativebanneradviewapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        createMediaViewVideoRendererApi createmediaviewvideorendererapi = (createMediaViewVideoRendererApi) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = createmediaviewvideorendererapi.description;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.placeholder;
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final createAdSizeApi IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        createAdSizeApi createadsizeapi = this.disabledAction;
        int i4 = i2 + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return createadsizeapi;
        }
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.suffix;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return str;
    }

    public final IAuthTabCallback access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.style;
        int i5 = i3 + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public final createNativeAdLayoutApi asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        createNativeAdLayoutApi createnativeadlayoutapi = this.inputType;
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return createnativeadlayoutapi;
    }

    public final List<createMediaViewApi> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<createMediaViewApi> list = this.constraints;
        int i5 = i2 + 95;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.defaultValue;
        int i4 = i2 + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final onWarmupCompleted onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.displayFormat;
        int i5 = i2 + 69;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.approveDescription;
        int i5 = i3 + 101;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (String) onWarmupCompleted(-662920368, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, 662920368);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final IAuthTabCallback SOLID = new IAuthTabCallback("SOLID", 0);
        public static final IAuthTabCallback LINE = new IAuthTabCallback("LINE", 1);
        public static final IAuthTabCallback BIG = new IAuthTabCallback("BIG", 2);
        public static final IAuthTabCallback BIG_NUMBER = new IAuthTabCallback("BIG_NUMBER", 3);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                IAuthTabCallback iAuthTabCallback = SOLID;
                IAuthTabCallback iAuthTabCallback2 = LINE;
                IAuthTabCallback iAuthTabCallback3 = BIG;
                IAuthTabCallback iAuthTabCallback4 = BIG_NUMBER;
                iAuthTabCallbackArr = new IAuthTabCallback[]{iAuthTabCallback2, iAuthTabCallback};
                iAuthTabCallbackArr[2] = iAuthTabCallback3;
                iAuthTabCallbackArr[4] = iAuthTabCallback4;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{SOLID, LINE, BIG, BIG_NUMBER};
            }
            int i4 = i3 + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 92 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallback + 85;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final createNativeBannerAdViewApi IAuthTabCallbackStub() {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (createNativeBannerAdViewApi) onWarmupCompleted(-546415036, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, 546415037);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted CURRENCY = new onWarmupCompleted("CURRENCY", 0);
        public static final onWarmupCompleted PHONE = new onWarmupCompleted("PHONE", 1);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 103;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = CURRENCY;
                onWarmupCompleted onwarmupcompleted2 = PHONE;
                onwarmupcompletedArr = new onWarmupCompleted[3];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[0] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{CURRENCY, PHONE};
            }
            int i4 = i2 + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i3 + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 40 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onWarmupCompleted + 89;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 92 / 0;
            }
        }
    }
}
