package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DynamicLoaderFactoryExternalSyntheticApiModelOutline0 implements makeFallbackLoader {
    public static final Parcelable.Creator<DynamicLoaderFactoryExternalSyntheticApiModelOutline0> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<String> items;
    private final String title;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<DynamicLoaderFactoryExternalSyntheticApiModelOutline0> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactoryExternalSyntheticApiModelOutline0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoaderFactoryExternalSyntheticApiModelOutline0 dynamicLoaderFactoryExternalSyntheticApiModelOutline0OnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return dynamicLoaderFactoryExternalSyntheticApiModelOutline0OnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactoryExternalSyntheticApiModelOutline0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            DynamicLoaderFactoryExternalSyntheticApiModelOutline0[] dynamicLoaderFactoryExternalSyntheticApiModelOutline0ArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return dynamicLoaderFactoryExternalSyntheticApiModelOutline0ArrOnExtraCallbackWithResult;
        }

        public final DynamicLoaderFactoryExternalSyntheticApiModelOutline0 onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DynamicLoaderFactoryExternalSyntheticApiModelOutline0 dynamicLoaderFactoryExternalSyntheticApiModelOutline0 = new DynamicLoaderFactoryExternalSyntheticApiModelOutline0(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return dynamicLoaderFactoryExternalSyntheticApiModelOutline0;
            }
            throw null;
        }

        public final DynamicLoaderFactoryExternalSyntheticApiModelOutline0[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 29;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            DynamicLoaderFactoryExternalSyntheticApiModelOutline0[] dynamicLoaderFactoryExternalSyntheticApiModelOutline0Arr = new DynamicLoaderFactoryExternalSyntheticApiModelOutline0[i];
            int i6 = i4 + 53;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return dynamicLoaderFactoryExternalSyntheticApiModelOutline0Arr;
        }
    }

    static {
        int i = onExtraCallback + 41;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicLoaderFactoryExternalSyntheticApiModelOutline0)) {
            return false;
        }
        DynamicLoaderFactoryExternalSyntheticApiModelOutline0 dynamicLoaderFactoryExternalSyntheticApiModelOutline0 = (DynamicLoaderFactoryExternalSyntheticApiModelOutline0) obj;
        if (Intrinsics.areEqual(this.type, dynamicLoaderFactoryExternalSyntheticApiModelOutline0.type)) {
            return Intrinsics.areEqual(this.title, dynamicLoaderFactoryExternalSyntheticApiModelOutline0.title) && Intrinsics.areEqual(this.items, dynamicLoaderFactoryExternalSyntheticApiModelOutline0.items);
        }
        int i3 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.type.hashCode();
        String str = this.title;
        if (str == null) {
            int i3 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (((iHashCode * 31) + i) * 31) + this.items.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ListDescriptionField(type=" + this.type + ", title=" + this.title + ", items=" + this.items + ")";
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.type;
        if (i4 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.title);
            parcel.writeStringList(this.items);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.title);
            parcel.writeStringList(this.items);
            int i5 = 88 / 0;
        }
    }

    public DynamicLoaderFactoryExternalSyntheticApiModelOutline0(@NotNull String str, @Nullable String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.title = str2;
        this.items = list;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.items;
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
