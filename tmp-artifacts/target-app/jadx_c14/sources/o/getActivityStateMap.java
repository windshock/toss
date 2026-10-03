package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getActivityStateMap extends FbValidationUtils {
    public static final Parcelable.Creator<getActivityStateMap> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String jobId;
    private final long pollingDelayMs;
    private final String targetJobId;
    private final long timeoutInSeconds;
    private final String type;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<getActivityStateMap> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getActivityStateMap createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getActivityStateMap getactivitystatemapOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = onWarmupCompleted + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return getactivitystatemapOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getActivityStateMap[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 17;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            getActivityStateMap[] getactivitystatemapArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = IAuthTabCallback + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return getactivitystatemapArrOnExtraCallbackWithResult;
        }

        public final getActivityStateMap onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            getActivityStateMap getactivitystatemap = new getActivityStateMap(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong());
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return getactivitystatemap;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getActivityStateMap[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 35;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            getActivityStateMap[] getactivitystatemapArr = new getActivityStateMap[i];
            int i6 = i4 + 97;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return getactivitystatemapArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 123;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.type);
            parcel.writeLong(this.timeoutInSeconds);
            parcel.writeString(this.jobId);
            parcel.writeString(this.targetJobId);
            parcel.writeLong(this.pollingDelayMs);
            int i5 = 62 / 0;
        } else {
            parcel.writeString(this.type);
            parcel.writeLong(this.timeoutInSeconds);
            parcel.writeString(this.jobId);
            parcel.writeString(this.targetJobId);
            parcel.writeLong(this.pollingDelayMs);
        }
        int i6 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getActivityStateMap(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.timeoutInSeconds = j;
        this.jobId = str2;
        this.targetJobId = str3;
        this.pollingDelayMs = j2;
    }

    @Override // o.FbValidationUtils
    public long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.timeoutInSeconds;
        int i5 = i3 + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    @Override // o.FbValidationUtils
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jobId;
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.targetJobId;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pollingDelayMs;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
