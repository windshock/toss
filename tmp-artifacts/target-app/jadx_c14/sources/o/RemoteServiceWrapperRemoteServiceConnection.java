package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RemoteServiceWrapperRemoteServiceConnection implements Parcelable {
    public static final Parcelable.Creator<RemoteServiceWrapperRemoteServiceConnection> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String link;
    private final String text;

    public static final class onExtraCallback implements Parcelable.Creator<RemoteServiceWrapperRemoteServiceConnection> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapperRemoteServiceConnection createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RemoteServiceWrapperRemoteServiceConnection[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 55;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            RemoteServiceWrapperRemoteServiceConnection[] remoteServiceWrapperRemoteServiceConnectionArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 25;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
            return remoteServiceWrapperRemoteServiceConnectionArrOnWarmupCompleted;
        }

        public final RemoteServiceWrapperRemoteServiceConnection onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnection = new RemoteServiceWrapperRemoteServiceConnection(parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 44 / 0;
            }
            return remoteServiceWrapperRemoteServiceConnection;
        }

        public final RemoteServiceWrapperRemoteServiceConnection[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 11;
            onExtraCallback = i3 % 128;
            RemoteServiceWrapperRemoteServiceConnection[] remoteServiceWrapperRemoteServiceConnectionArr = new RemoteServiceWrapperRemoteServiceConnection[i];
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
            }
            return remoteServiceWrapperRemoteServiceConnectionArr;
        }
    }

    static {
        int i = onWarmupCompleted + 31;
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
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RemoteServiceWrapperRemoteServiceConnection)) {
            int i4 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        RemoteServiceWrapperRemoteServiceConnection remoteServiceWrapperRemoteServiceConnection = (RemoteServiceWrapperRemoteServiceConnection) obj;
        if (!Intrinsics.areEqual(this.text, remoteServiceWrapperRemoteServiceConnection.text)) {
            int i6 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.link, remoteServiceWrapperRemoteServiceConnection.link)) {
            return true;
        }
        int i8 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.text;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.link;
        if (str2 != null) {
            int i4 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CompleteLayoutListItemCTA(text=" + this.text + ", link=" + this.link + ")";
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.text;
        if (i4 == 0) {
            parcel.writeString(str);
            parcel.writeString(this.link);
        } else {
            parcel.writeString(str);
            parcel.writeString(this.link);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RemoteServiceWrapperRemoteServiceConnection(@Nullable String str, @Nullable String str2) {
        this.text = str;
        this.link = str2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.link;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 101;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return str;
    }
}
