package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RemoteRenderingApi implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<RemoteRenderingApi> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final createRewardedVideoAd account;

    public static final class onWarmupCompleted implements Parcelable.Creator<RemoteRenderingApi> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteRenderingApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RemoteRenderingApi remoteRenderingApiOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallback + 81;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return remoteRenderingApiOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteRenderingApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 65;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RemoteRenderingApi onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RemoteRenderingApi remoteRenderingApi = new RemoteRenderingApi(createRewardedVideoAd.CREATOR.createFromParcel(parcel));
            int i2 = onExtraCallbackWithResult + 103;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 56 / 0;
            }
            return remoteRenderingApi;
        }

        public final RemoteRenderingApi[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 15;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            RemoteRenderingApi[] remoteRenderingApiArr = new RemoteRenderingApi[i];
            if (i3 % 2 != 0) {
                int i5 = 5 / 0;
            }
            int i6 = i4 + 21;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 46 / 0;
            }
            return remoteRenderingApiArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteRenderingApi) {
            if (Intrinsics.areEqual(this.account, ((RemoteRenderingApi) obj).account)) {
                return true;
            }
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallback;
        int i5 = i4 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 35;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.account.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.account.hashCode();
        int i3 = onNavigationEvent + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountFormValue(account=" + this.account + ")";
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        this.account.writeToParcel(parcel, i);
        int i5 = onNavigationEvent + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public RemoteRenderingApi(@NotNull createRewardedVideoAd createrewardedvideoad) {
        Intrinsics.checkNotNullParameter(createrewardedvideoad, "");
        this.account = createrewardedvideoad;
    }
}
