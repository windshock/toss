package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class startOperationBatch implements Parcelable {
    public static final Parcelable.Creator<startOperationBatch> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("href")
    private final String href;

    @SerializedName("options")
    private final stopAnimation options;

    @SerializedName("title")
    private final String title;

    @SerializedName("type")
    private final NativeAppStateSpec type;

    public static final class onExtraCallback implements Parcelable.Creator<startOperationBatch> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final startOperationBatch[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 109;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            startOperationBatch[] startoperationbatchArr = new startOperationBatch[i];
            int i6 = i4 + 59;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return startoperationbatchArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ startOperationBatch createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            startOperationBatch startoperationbatchOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onExtraCallbackWithResult + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return startoperationbatchOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ startOperationBatch[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 121;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            throw null;
        }

        public final startOperationBatch onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            startOperationBatch startoperationbatch = new startOperationBatch(NativeAppStateSpec.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), stopAnimation.CREATOR.createFromParcel(parcel));
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return startoperationbatch;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 109;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public startOperationBatch() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 67;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof startOperationBatch)) {
            return false;
        }
        startOperationBatch startoperationbatch = (startOperationBatch) obj;
        if (this.type != startoperationbatch.type) {
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, startoperationbatch.title)) {
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.href, startoperationbatch.href)) {
            return false;
        }
        if (Intrinsics.areEqual(this.options, startoperationbatch.options)) {
            return true;
        }
        int i5 = onWarmupCompleted + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.href.hashCode()) * 31) + this.options.hashCode();
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DashboardLink(type=" + this.type + ", title=" + this.title + ", href=" + this.href + ", options=" + this.options + ")";
        int i2 = onNavigationEvent + 23;
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
        int i3 = onWarmupCompleted + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type.name());
        parcel.writeString(this.title);
        parcel.writeString(this.href);
        this.options.writeToParcel(parcel, i);
        int i5 = onNavigationEvent + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public startOperationBatch(@NotNull NativeAppStateSpec nativeAppStateSpec, @NotNull String str, @NotNull String str2, @NotNull stopAnimation stopanimation) {
        Intrinsics.checkNotNullParameter(nativeAppStateSpec, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(stopanimation, "");
        this.type = nativeAppStateSpec;
        this.title = str;
        this.href = str2;
        this.options = stopanimation;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ startOperationBatch(NativeAppStateSpec nativeAppStateSpec, String str, String str2, stopAnimation stopanimation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            nativeAppStateSpec = NativeAppStateSpec.DEFAULT;
            int i2 = onNavigationEvent + 113;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 125;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            } else {
                int i6 = 2 % 2;
            }
            str = "";
        }
        this(nativeAppStateSpec, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? new stopAnimation(false, null, 3, null) : stopanimation);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.href;
        int i4 = i3 + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
