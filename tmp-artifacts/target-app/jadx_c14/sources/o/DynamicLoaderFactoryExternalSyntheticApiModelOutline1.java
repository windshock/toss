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
public final class DynamicLoaderFactoryExternalSyntheticApiModelOutline1 implements makeLoaderUnsafe, Parcelable {
    public static final Parcelable.Creator<DynamicLoaderFactoryExternalSyntheticApiModelOutline1> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final List<makeLoader> contents;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<DynamicLoaderFactoryExternalSyntheticApiModelOutline1> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactoryExternalSyntheticApiModelOutline1 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoaderFactoryExternalSyntheticApiModelOutline1 dynamicLoaderFactoryExternalSyntheticApiModelOutline1OnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return dynamicLoaderFactoryExternalSyntheticApiModelOutline1OnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactoryExternalSyntheticApiModelOutline1[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            DynamicLoaderFactoryExternalSyntheticApiModelOutline1[] dynamicLoaderFactoryExternalSyntheticApiModelOutline1ArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return dynamicLoaderFactoryExternalSyntheticApiModelOutline1ArrOnWarmupCompleted;
        }

        public final DynamicLoaderFactoryExternalSyntheticApiModelOutline1 onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                arrayList.add(makeLoader.CREATOR.createFromParcel(parcel));
                i5++;
                int i6 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            return new DynamicLoaderFactoryExternalSyntheticApiModelOutline1(string, arrayList);
        }

        public final DynamicLoaderFactoryExternalSyntheticApiModelOutline1[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            DynamicLoaderFactoryExternalSyntheticApiModelOutline1[] dynamicLoaderFactoryExternalSyntheticApiModelOutline1Arr = new DynamicLoaderFactoryExternalSyntheticApiModelOutline1[i];
            int i6 = i3 + 25;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return dynamicLoaderFactoryExternalSyntheticApiModelOutline1Arr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof DynamicLoaderFactoryExternalSyntheticApiModelOutline1))) {
            DynamicLoaderFactoryExternalSyntheticApiModelOutline1 dynamicLoaderFactoryExternalSyntheticApiModelOutline1 = (DynamicLoaderFactoryExternalSyntheticApiModelOutline1) obj;
            if (Intrinsics.areEqual(this.type, dynamicLoaderFactoryExternalSyntheticApiModelOutline1.type)) {
                return Intrinsics.areEqual(this.contents, dynamicLoaderFactoryExternalSyntheticApiModelOutline1.contents);
            }
            int i5 = onExtraCallback + 21;
            onNavigationEvent = i5 % 128;
            return i5 % 2 == 0;
        }
        int i6 = i2 + 123;
        int i7 = i6 % 128;
        onNavigationEvent = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 41;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 41 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.type.hashCode() * 31) + this.contents.hashCode();
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OrderTypeModel(type=" + this.type + ", contents=" + this.contents + ")";
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        List<makeLoader> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<makeLoader> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
            int i5 = onNavigationEvent + 107;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 3;
            }
        }
    }

    public DynamicLoaderFactoryExternalSyntheticApiModelOutline1(@NotNull String str, @NotNull List<makeLoader> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.contents = list;
    }

    public final List<makeLoader> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<makeLoader> list = this.contents;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return list;
    }
}
