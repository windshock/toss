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
public final class createNativeAdViewApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createNativeAdViewApi> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String defaultValue;
    private final String key;
    private final List<createNativeAdViewAttributesApi> tabPanes;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<createNativeAdViewApi> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdViewApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            createNativeAdViewApi createnativeadviewapiOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 == 0) {
                int i4 = 61 / 0;
            }
            int i5 = onNavigationEvent + 39;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return createnativeadviewapiOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdViewApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 33;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createNativeAdViewApi[] createnativeadviewapiArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 69;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return createnativeadviewapiArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final createNativeAdViewApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 3;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            createNativeAdViewApi[] createnativeadviewapiArr = new createNativeAdViewApi[i];
            int i6 = i4 + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return createnativeadviewapiArr;
        }

        public final createNativeAdViewApi onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = onNavigationEvent + 107;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = IAuthTabCallback + 1;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList.add(createNativeAdViewAttributesApi.CREATOR.createFromParcel(parcel));
                    i5 += 85;
                } else {
                    arrayList.add(createNativeAdViewAttributesApi.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new createNativeAdViewApi(string, string2, arrayList, parcel.readString());
        }
    }

    static {
        int i = onWarmupCompleted + 69;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof createNativeAdViewApi))) {
            createNativeAdViewApi createnativeadviewapi = (createNativeAdViewApi) obj;
            if (!Intrinsics.areEqual(this.key, createnativeadviewapi.key)) {
                int i3 = IAuthTabCallback + 31;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.type, createnativeadviewapi.type)) {
                int i5 = IAuthTabCallback + 37;
                onNavigationEvent = i5 % 128;
                return i5 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.tabPanes, createnativeadviewapi.tabPanes) && Intrinsics.areEqual(this.defaultValue, createnativeadviewapi.defaultValue)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.key.hashCode() * 31) + this.type.hashCode()) * 31) + this.tabPanes.hashCode()) * 31) + this.defaultValue.hashCode();
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TabField(key=" + this.key + ", type=" + this.type + ", tabPanes=" + this.tabPanes + ", defaultValue=" + this.defaultValue + ")";
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Iterator<createNativeAdViewAttributesApi> it;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.key);
            parcel.writeString(this.type);
            List<createNativeAdViewAttributesApi> list = this.tabPanes;
            parcel.writeInt(list.size());
            it = list.iterator();
            int i5 = 53 / 0;
        } else {
            parcel.writeString(this.key);
            parcel.writeString(this.type);
            List<createNativeAdViewAttributesApi> list2 = this.tabPanes;
            parcel.writeInt(list2.size());
            it = list2.iterator();
        }
        while (!(!it.hasNext())) {
            it.next().writeToParcel(parcel, i);
            int i6 = IAuthTabCallback + 25;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        parcel.writeString(this.defaultValue);
    }

    public createNativeAdViewApi(@NotNull String str, @NotNull String str2, @NotNull List<createNativeAdViewAttributesApi> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.key = str;
        this.type = str2;
        this.tabPanes = list;
        this.defaultValue = str3;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        throw null;
    }

    public final List<createNativeAdViewAttributesApi> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<createNativeAdViewAttributesApi> list = this.tabPanes;
        int i4 = i2 + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.defaultValue;
        }
        throw null;
    }
}
