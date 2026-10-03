package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class unregisterActivityCallbacks extends FbValidationUtils {
    public static final Parcelable.Creator<unregisterActivityCallbacks> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String jobId;
    private final String targetJobId;
    private final long timeoutInSeconds;
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<unregisterActivityCallbacks> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ unregisterActivityCallbacks createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            unregisterActivityCallbacks unregisteractivitycallbacksOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onWarmupCompleted + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unregisteractivitycallbacksOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ unregisterActivityCallbacks[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            unregisterActivityCallbacks[] unregisteractivitycallbacksArrOnExtraCallback = onExtraCallback(i);
            if (i4 == 0) {
                int i5 = 46 / 0;
            }
            int i6 = onNavigationEvent + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unregisteractivitycallbacksArrOnExtraCallback;
        }

        public final unregisterActivityCallbacks[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 15;
            onWarmupCompleted = i3 % 128;
            unregisterActivityCallbacks[] unregisteractivitycallbacksArr = new unregisterActivityCallbacks[i];
            if (i3 % 2 != 0) {
                return unregisteractivitycallbacksArr;
            }
            throw null;
        }

        public final unregisterActivityCallbacks onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            unregisterActivityCallbacks unregisteractivitycallbacks = new unregisterActivityCallbacks(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return unregisteractivitycallbacks;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 65;
        onExtraCallback = i % 128;
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
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        if (i4 == 0) {
            parcel.writeLong(this.timeoutInSeconds);
            parcel.writeString(this.jobId);
            parcel.writeString(this.targetJobId);
        } else {
            parcel.writeLong(this.timeoutInSeconds);
            parcel.writeString(this.jobId);
            parcel.writeString(this.targetJobId);
            int i5 = 33 / 0;
        }
    }

    public unregisterActivityCallbacks(@NotNull String str, long j, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.timeoutInSeconds = j;
        this.jobId = str2;
        this.targetJobId = str3;
    }

    @Override // o.FbValidationUtils
    public long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.timeoutInSeconds;
        }
        int i3 = 32 / 0;
        return this.timeoutInSeconds;
    }

    @Override // o.FbValidationUtils
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.jobId;
        int i5 = i3 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            str = this.targetJobId;
            int i4 = 50 / 0;
        } else {
            str = this.targetJobId;
        }
        int i5 = i3 + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
