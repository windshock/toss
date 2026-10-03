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
public final class getInitApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<getInitApi> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Float contentRatio;
    private final List<createNativeAdViewTypeApi> contents;
    private final createNativeBannerAdViewApi helpArea;
    private final String key;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<getInitApi> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final getInitApi IAuthTabCallback(Parcel parcel) {
            createNativeBannerAdViewApi createnativebanneradviewapiCreateFromParcel;
            Float fValueOf;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = onWarmupCompleted + 55;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 37 / 0;
                }
                createnativebanneradviewapiCreateFromParcel = null;
            } else {
                createnativebanneradviewapiCreateFromParcel = createNativeBannerAdViewApi.CREATOR.createFromParcel(parcel);
            }
            createNativeBannerAdViewApi createnativebanneradviewapi = createnativebanneradviewapiCreateFromParcel;
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(createNativeAdViewTypeApi.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                int i8 = IAuthTabCallback + 41;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new getInitApi(string, string2, createnativebanneradviewapi, arrayList, fValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getInitApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                IAuthTabCallback(parcel);
                throw null;
            }
            getInitApi getinitapiIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = IAuthTabCallback + 123;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return getinitapiIAuthTabCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getInitApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 31;
            onWarmupCompleted = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            getInitApi[] getinitapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return getinitapiArrOnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        public final getInitApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getInitApi[] getinitapiArr = new getInitApi[i];
            int i6 = i3 + 57;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return getinitapiArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 67;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInitApi)) {
            return false;
        }
        getInitApi getinitapi = (getInitApi) obj;
        if (!Intrinsics.areEqual(this.type, getinitapi.type)) {
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.key, getinitapi.key)) {
            int i4 = onNavigationEvent + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.helpArea, getinitapi.helpArea) || !Intrinsics.areEqual(this.contents, getinitapi.contents)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contentRatio, getinitapi.contentRatio)) {
            int i6 = onWarmupCompleted + 51;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = onNavigationEvent + 35;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        createNativeBannerAdViewApi createnativebanneradviewapi;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int iHashCode4 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.type.hashCode();
            iHashCode2 = this.key.hashCode();
            createnativebanneradviewapi = this.helpArea;
            iHashCode3 = 1;
            if (createnativebanneradviewapi != null) {
                iHashCode4 = 1;
                iHashCode3 = iHashCode4;
                iHashCode4 = createnativebanneradviewapi.hashCode();
            }
        } else {
            iHashCode = this.type.hashCode();
            iHashCode2 = this.key.hashCode();
            createnativebanneradviewapi = this.helpArea;
            if (createnativebanneradviewapi == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = iHashCode4;
                iHashCode4 = createnativebanneradviewapi.hashCode();
            }
        }
        int iHashCode5 = this.contents.hashCode();
        Float f = this.contentRatio;
        if (f != null) {
            int i3 = onWarmupCompleted + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode3 = f.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TableField(type=" + this.type + ", key=" + this.key + ", helpArea=" + this.helpArea + ", contents=" + this.contents + ", contentRatio=" + this.contentRatio + ")";
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        createNativeBannerAdViewApi createnativebanneradviewapi = this.helpArea;
        if (createnativebanneradviewapi == null) {
            int i3 = onWarmupCompleted + 57;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createnativebanneradviewapi.writeToParcel(parcel, i);
        }
        List<createNativeAdViewTypeApi> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<createNativeAdViewTypeApi> it = list.iterator();
        while (it.hasNext()) {
            int i5 = onNavigationEvent + 23;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                it.next().writeToParcel(parcel, i);
                throw null;
            }
            it.next().writeToParcel(parcel, i);
        }
        Float f = this.contentRatio;
        if (f != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
            return;
        }
        int i6 = onNavigationEvent + 19;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public getInitApi(@NotNull String str, @NotNull String str2, @Nullable createNativeBannerAdViewApi createnativebanneradviewapi, @NotNull List<createNativeAdViewTypeApi> list, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.helpArea = createnativebanneradviewapi;
        this.contents = list;
        this.contentRatio = f;
    }

    public final createNativeBannerAdViewApi onExtraCallbackWithResult() {
        createNativeBannerAdViewApi createnativebanneradviewapi;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            createnativebanneradviewapi = this.helpArea;
            int i4 = 13 / 0;
        } else {
            createnativebanneradviewapi = this.helpArea;
        }
        int i5 = i3 + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return createnativebanneradviewapi;
    }

    public final List<createNativeAdViewTypeApi> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<createNativeAdViewTypeApi> list = this.contents;
        int i5 = i3 + 59;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.contentRatio;
        }
        throw null;
    }
}
