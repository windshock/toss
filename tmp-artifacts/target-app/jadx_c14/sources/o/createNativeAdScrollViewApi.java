package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdScrollViewApi implements createNativeAdRatingApi {
    public static final Parcelable.Creator<createNativeAdScrollViewApi> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<String> contents;
    private final boolean hasIndent;
    private final boolean isBold;
    private final boolean isBullet;
    private final boolean isGrouping;
    private final String key;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<createNativeAdScrollViewApi> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdScrollViewApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            createNativeAdScrollViewApi createnativeadscrollviewapiOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return createnativeadscrollviewapiOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdScrollViewApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createNativeAdScrollViewApi[] createnativeadscrollviewapiArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return createnativeadscrollviewapiArrOnWarmupCompleted;
        }

        public final createNativeAdScrollViewApi onWarmupCompleted(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int i4 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                int i6 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z2 = false;
            } else {
                z2 = true;
            }
            if (parcel.readInt() == 0) {
                int i8 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                z3 = false;
            } else {
                z3 = true;
            }
            return new createNativeAdScrollViewApi(string, string2, arrayListCreateStringArrayList, z, z4, z2, z3);
        }

        public final createNativeAdScrollViewApi[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 63;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            createNativeAdScrollViewApi[] createnativeadscrollviewapiArr = new createNativeAdScrollViewApi[i];
            int i6 = i4 + 21;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return createnativeadscrollviewapiArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof createNativeAdScrollViewApi)) {
            return false;
        }
        createNativeAdScrollViewApi createnativeadscrollviewapi = (createNativeAdScrollViewApi) obj;
        if (!Intrinsics.areEqual(this.type, createnativeadscrollviewapi.type) || !Intrinsics.areEqual(this.key, createnativeadscrollviewapi.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contents, createnativeadscrollviewapi.contents)) {
            int i4 = onNavigationEvent + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.isBullet != createnativeadscrollviewapi.isBullet) {
            return false;
        }
        if (this.isGrouping != createnativeadscrollviewapi.isGrouping) {
            int i6 = onWarmupCompleted + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.hasIndent == createnativeadscrollviewapi.hasIndent) {
            return this.isBold == createnativeadscrollviewapi.isBold;
        }
        int i8 = onNavigationEvent;
        int i9 = i8 + 73;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 3;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.type.hashCode() * 31) + this.key.hashCode()) * 31) + this.contents.hashCode()) * 31) + Boolean.hashCode(this.isBullet)) * 31) + Boolean.hashCode(this.isGrouping)) * 31) + Boolean.hashCode(this.hasIndent)) * 31) + Boolean.hashCode(this.isBold);
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LabelField(type=" + this.type + ", key=" + this.key + ", contents=" + this.contents + ", isBullet=" + this.isBullet + ", isGrouping=" + this.isGrouping + ", hasIndent=" + this.hasIndent + ", isBold=" + this.isBold + ")";
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.key);
        parcel.writeStringList(this.contents);
        parcel.writeInt(this.isBullet ? 1 : 0);
        parcel.writeInt(this.isGrouping ? 1 : 0);
        parcel.writeInt(this.hasIndent ? 1 : 0);
        parcel.writeInt(this.isBold ? 1 : 0);
        int i5 = onNavigationEvent + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public createNativeAdScrollViewApi(@NotNull String str, @NotNull String str2, @NotNull List<String> list, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.key = str2;
        this.contents = list;
        this.isBullet = z;
        this.isGrouping = z2;
        this.hasIndent = z3;
        this.isBold = z4;
    }

    public final List<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<String> list = this.contents;
        int i5 = i3 + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isBullet;
        int i5 = i2 + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallback() {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.isGrouping;
            int i4 = 47 / 0;
        } else {
            z = this.isGrouping;
        }
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onWarmupCompleted() {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.hasIndent;
            int i4 = 50 / 0;
        } else {
            z = this.hasIndent;
        }
        int i5 = i2 + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isBold;
        int i4 = i2 + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
