package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class reportDexLoadingIssue implements Parcelable {
    public static final Parcelable.Creator<reportDexLoadingIssue> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final DynamicLoader bottom;
    private final String description;
    private final DynamicLoader first;
    private final String key;
    private final DynamicLoader second;

    public static final class onWarmupCompleted implements Parcelable.Creator<reportDexLoadingIssue> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ reportDexLoadingIssue createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            reportDexLoadingIssue reportdexloadingissueOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 67 / 0;
            }
            int i5 = onExtraCallback + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return reportdexloadingissueOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ reportDexLoadingIssue[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            reportDexLoadingIssue[] reportdexloadingissueArrOnExtraCallback = onExtraCallback(i);
            if (i4 == 0) {
                int i5 = 47 / 0;
            }
            return reportdexloadingissueArrOnExtraCallback;
        }

        public final reportDexLoadingIssue[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            reportDexLoadingIssue[] reportdexloadingissueArr = new reportDexLoadingIssue[i];
            int i6 = i3 + 85;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return reportdexloadingissueArr;
        }

        public final reportDexLoadingIssue onNavigationEvent(Parcel parcel) {
            DynamicLoader dynamicLoaderCreateFromParcel;
            DynamicLoader dynamicLoaderCreateFromParcel2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<DynamicLoader> creator = DynamicLoader.CREATOR;
            DynamicLoader dynamicLoaderCreateFromParcel3 = creator.createFromParcel(parcel);
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                dynamicLoaderCreateFromParcel = null;
            } else {
                dynamicLoaderCreateFromParcel = creator.createFromParcel(parcel);
            }
            DynamicLoader dynamicLoader = dynamicLoaderCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 5;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                dynamicLoaderCreateFromParcel2 = null;
            } else {
                dynamicLoaderCreateFromParcel2 = creator.createFromParcel(parcel);
            }
            reportDexLoadingIssue reportdexloadingissue = new reportDexLoadingIssue(dynamicLoaderCreateFromParcel3, dynamicLoader, dynamicLoaderCreateFromParcel2, parcel.readString(), parcel.readString());
            int i5 = onExtraCallback + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return reportdexloadingissue;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 97;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        this.first.writeToParcel(parcel, i);
        DynamicLoader dynamicLoader = this.second;
        if (dynamicLoader == null) {
            int i3 = onWarmupCompleted + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicLoader.writeToParcel(parcel, i);
        }
        DynamicLoader dynamicLoader2 = this.bottom;
        if (dynamicLoader2 == null) {
            int i5 = onWarmupCompleted + 75;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            dynamicLoader2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.key);
    }

    public reportDexLoadingIssue(@NotNull DynamicLoader dynamicLoader, @Nullable DynamicLoader dynamicLoader2, @Nullable DynamicLoader dynamicLoader3, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(dynamicLoader, "");
        this.first = dynamicLoader;
        this.second = dynamicLoader2;
        this.bottom = dynamicLoader3;
        this.description = str;
        this.key = str2;
    }

    public final DynamicLoader onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        DynamicLoader dynamicLoader = this.first;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public final DynamicLoader onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.second;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicLoader IAuthTabCallback() {
        DynamicLoader dynamicLoader;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            dynamicLoader = this.bottom;
            int i4 = 2 / 0;
        } else {
            dynamicLoader = this.bottom;
        }
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return dynamicLoader;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 121;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.description;
            int i4 = 35 / 0;
        } else {
            str = this.description;
        }
        int i5 = i2 + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
