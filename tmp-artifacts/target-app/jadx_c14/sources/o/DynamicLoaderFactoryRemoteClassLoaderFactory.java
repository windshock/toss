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
public final class DynamicLoaderFactoryRemoteClassLoaderFactory implements makeLoaderUnsafe, Parcelable {
    public static final Parcelable.Creator<DynamicLoaderFactoryRemoteClassLoaderFactory> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final double contentRatio;
    private final List<onExtraCallback> contents;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<DynamicLoaderFactoryRemoteClassLoaderFactory> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactoryRemoteClassLoaderFactory createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            DynamicLoaderFactoryRemoteClassLoaderFactory dynamicLoaderFactoryRemoteClassLoaderFactoryOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 96 / 0;
            }
            return dynamicLoaderFactoryRemoteClassLoaderFactoryOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DynamicLoaderFactoryRemoteClassLoaderFactory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 3;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onWarmupCompleted(i);
                throw null;
            }
            DynamicLoaderFactoryRemoteClassLoaderFactory[] dynamicLoaderFactoryRemoteClassLoaderFactoryArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = onExtraCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return dynamicLoaderFactoryRemoteClassLoaderFactoryArrOnWarmupCompleted;
            }
            obj.hashCode();
            throw null;
        }

        public final DynamicLoaderFactoryRemoteClassLoaderFactory onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = onExtraCallbackWithResult + 43;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(onExtraCallback.CREATOR.createFromParcel(parcel));
                    i3 += 12;
                } else {
                    arrayList.add(onExtraCallback.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            DynamicLoaderFactoryRemoteClassLoaderFactory dynamicLoaderFactoryRemoteClassLoaderFactory = new DynamicLoaderFactoryRemoteClassLoaderFactory(string, arrayList, parcel.readDouble());
            int i5 = onExtraCallback + 77;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return dynamicLoaderFactoryRemoteClassLoaderFactory;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final DynamicLoaderFactoryRemoteClassLoaderFactory[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 7;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            Object obj = null;
            DynamicLoaderFactoryRemoteClassLoaderFactory[] dynamicLoaderFactoryRemoteClassLoaderFactoryArr = new DynamicLoaderFactoryRemoteClassLoaderFactory[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 1;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return dynamicLoaderFactoryRemoteClassLoaderFactoryArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 39;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DynamicLoaderFactoryRemoteClassLoaderFactory)) {
            int i4 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DynamicLoaderFactoryRemoteClassLoaderFactory dynamicLoaderFactoryRemoteClassLoaderFactory = (DynamicLoaderFactoryRemoteClassLoaderFactory) obj;
        if (!Intrinsics.areEqual(this.type, dynamicLoaderFactoryRemoteClassLoaderFactory.type) || !Intrinsics.areEqual(this.contents, dynamicLoaderFactoryRemoteClassLoaderFactory.contents)) {
            return false;
        }
        if (Double.compare(this.contentRatio, dynamicLoaderFactoryRemoteClassLoaderFactory.contentRatio) == 0) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.type.hashCode() >>> 72) - this.contents.hashCode()) << 106) % Double.hashCode(this.contentRatio) : (((this.type.hashCode() * 31) + this.contents.hashCode()) * 31) + Double.hashCode(this.contentRatio);
        int i3 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TableRowTypeModel(type=" + this.type + ", contents=" + this.contents + ", contentRatio=" + this.contentRatio + ")";
        int i2 = onExtraCallbackWithResult + 85;
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
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        List<onExtraCallback> list = this.contents;
        parcel.writeInt(list.size());
        Iterator<onExtraCallback> it = list.iterator();
        int i3 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        while (!(!it.hasNext())) {
            int i5 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.contentRatio);
    }

    public DynamicLoaderFactoryRemoteClassLoaderFactory(@NotNull String str, @NotNull List<onExtraCallback> list, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.type = str;
        this.contents = list;
        this.contentRatio = d;
    }

    public final List<onExtraCallback> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<onExtraCallback> list = this.contents;
        int i4 = i2 + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return list;
    }

    public final double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        double d = this.contentRatio;
        int i5 = i3 + 99;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return d;
    }

    public static final class onExtraCallback implements Parcelable {
        public static final Parcelable.Creator<onExtraCallback> CREATOR = new onNavigationEvent();
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String rowContent;
        private final String rowLabel;

        public static final class onNavigationEvent implements Parcelable.Creator<onExtraCallback> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackOnWarmupCompleted = onWarmupCompleted(parcel);
                int i4 = onExtraCallback + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return onextracallbackOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ onExtraCallback[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 77;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallback[] onextracallbackArrOnNavigationEvent = onNavigationEvent(i);
                int i5 = onExtraCallbackWithResult + 99;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return onextracallbackArrOnNavigationEvent;
            }

            public final onExtraCallback[] onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback;
                int i4 = i3 + 63;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onExtraCallback[] onextracallbackArr = new onExtraCallback[i];
                int i6 = i3 + 107;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return onextracallbackArr;
            }

            public final onExtraCallback onWarmupCompleted(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                onExtraCallback onextracallback = new onExtraCallback(parcel.readString(), parcel.readString());
                int i2 = onExtraCallbackWithResult + 117;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }
        }

        static {
            int i = onNavigationEvent + 61;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0 ? 1 : 0;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 125;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!(!Intrinsics.areEqual(this.rowLabel, onextracallback.rowLabel))) {
                return Intrinsics.areEqual(this.rowContent, onextracallback.rowContent);
            }
            int i3 = onExtraCallback + 27;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.rowLabel.hashCode();
            return i3 == 0 ? (iHashCode >> 64) >> this.rowContent.hashCode() : (iHashCode * 31) + this.rowContent.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TableRowContent(rowLabel=" + this.rowLabel + ", rowContent=" + this.rowContent + ")";
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.rowLabel);
            parcel.writeString(this.rowContent);
            int i5 = onExtraCallback + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.rowLabel = str;
            this.rowContent = str2;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.rowLabel;
            if (i3 == 0) {
                int i4 = 46 / 0;
            }
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.rowContent;
            int i5 = i3 + 15;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
