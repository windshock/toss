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
public final class DynamicLoaderFallback implements makeFallbackLoader {
    public static final Parcelable.Creator<DynamicLoaderFallback> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<equalsMethods> items;
    private final String title;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<DynamicLoaderFallback> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final DynamicLoaderFallback IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onWarmupCompleted + 29;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(equalsMethods.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = onExtraCallback + 67;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            DynamicLoaderFallback dynamicLoaderFallback = new DynamicLoaderFallback(string, string2, arrayList);
            int i8 = onWarmupCompleted + 83;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return dynamicLoaderFallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFallback createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoaderFallback dynamicLoaderFallbackIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallback + 77;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return dynamicLoaderFallbackIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFallback[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            DynamicLoaderFallback[] dynamicLoaderFallbackArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onWarmupCompleted + 77;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return dynamicLoaderFallbackArrOnWarmupCompleted;
        }

        public final DynamicLoaderFallback[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 15;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            DynamicLoaderFallback[] dynamicLoaderFallbackArr = new DynamicLoaderFallback[i];
            int i6 = i4 + 63;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return dynamicLoaderFallbackArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = (i3 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i2 + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 55;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof DynamicLoaderFallback)) {
            int i8 = i2 + 83;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        DynamicLoaderFallback dynamicLoaderFallback = (DynamicLoaderFallback) obj;
        if (!Intrinsics.areEqual(this.type, dynamicLoaderFallback.type)) {
            return false;
        }
        if (Intrinsics.areEqual(this.title, dynamicLoaderFallback.title)) {
            return Intrinsics.areEqual(this.items, dynamicLoaderFallback.items);
        }
        int i10 = IAuthTabCallback + 41;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 47;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            this.type.hashCode();
            throw null;
        }
        int iHashCode = this.type.hashCode();
        String str = this.title;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i4 = IAuthTabCallback + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 2;
            }
            i = iHashCode2;
        }
        return (((iHashCode * 31) + i) * 31) + this.items.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TableDescriptionField(type=" + this.type + ", title=" + this.title + ", items=" + this.items + ")";
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            List<equalsMethods> list = this.items;
            parcel.writeInt(list.size());
            list.iterator();
            throw null;
        }
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        List<equalsMethods> list2 = this.items;
        parcel.writeInt(list2.size());
        Iterator<equalsMethods> it = list2.iterator();
        while (it.hasNext()) {
            int i5 = onNavigationEvent + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
    }

    public DynamicLoaderFallback(@NotNull String str, @Nullable String str2, @NotNull List<equalsMethods> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.title = str2;
        this.items = list;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            str = this.title;
            int i4 = 0 / 0;
        } else {
            str = this.title;
        }
        int i5 = i3 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<equalsMethods> onExtraCallback() {
        List<equalsMethods> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.items;
            int i4 = 10 / 0;
        } else {
            list = this.items;
        }
        int i5 = i2 + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
