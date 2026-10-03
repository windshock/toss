package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BuildConfigApi implements Parcelable {
    public static final Parcelable.Creator<BuildConfigApi> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("message")
    private final String message;

    @SerializedName("subscriptions")
    private final List<getVersionOverride> subscriptions;

    @SerializedName("success")
    private final boolean success;

    public static final class onNavigationEvent implements Parcelable.Creator<BuildConfigApi> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final BuildConfigApi IAuthTabCallback(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = 0;
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i3 = onNavigationEvent + 37;
                onExtraCallback = i3 % 128;
                arrayList = null;
                if (i3 % 2 != 0) {
                    int i4 = 96 / 0;
                }
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                while (i2 != i5) {
                    arrayList2.add(getVersionOverride.CREATOR.createFromParcel(parcel));
                    i2++;
                    int i6 = onExtraCallback + 51;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
                arrayList = arrayList2;
            }
            return new BuildConfigApi(z, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BuildConfigApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BuildConfigApi buildConfigApiIAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 3 / 0;
            }
            return buildConfigApiIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BuildConfigApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            BuildConfigApi[] buildConfigApiArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onNavigationEvent + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return buildConfigApiArrOnNavigationEvent;
        }

        public final BuildConfigApi[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 107;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            BuildConfigApi[] buildConfigApiArr = new BuildConfigApi[i];
            int i6 = i4 + 17;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return buildConfigApiArr;
        }
    }

    static {
        int i = onNavigationEvent + 33;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public BuildConfigApi() {
        this(false, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof BuildConfigApi)) {
            return false;
        }
        BuildConfigApi buildConfigApi = (BuildConfigApi) obj;
        if (this.success != buildConfigApi.success) {
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.message, buildConfigApi.message)) {
            int i6 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subscriptions, buildConfigApi.subscriptions)) {
            return false;
        }
        int i8 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 81 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.success);
        String str = this.message;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<getVersionOverride> list = this.subscriptions;
        if (list != null) {
            int i3 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
                iHashCode3 = list.hashCode();
            } else {
                iHashCode3 = list.hashCode();
            }
        }
        int i5 = (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
        int i6 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationSetResp(success=" + this.success + ", message=" + this.message + ", subscriptions=" + this.subscriptions + ")";
        int i2 = onExtraCallbackWithResult + 123;
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
        int i3 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeString(this.message);
        List<getVersionOverride> list = this.subscriptions;
        if (list == null) {
            parcel.writeInt(0);
            int i5 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<getVersionOverride> it = list.iterator();
        while (it.hasNext()) {
            getVersionOverride.onWarmupCompleted(-944000829, zzmr.onExtraCallbackWithResult(), new Object[]{it.next(), parcel, Integer.valueOf(i)}, 944000830, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
            int i7 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public BuildConfigApi(boolean z, @Nullable String str, @Nullable List<getVersionOverride> list) {
        this.success = z;
        this.message = str;
        this.subscriptions = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BuildConfigApi(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = null;
        }
        if ((i & 4) != 0) {
            int i4 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
            list = null;
        }
        this(z, str, list);
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.success;
        int i5 = i3 + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<getVersionOverride> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<getVersionOverride> list = this.subscriptions;
        int i5 = i3 + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }
}
