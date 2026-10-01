package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeRearDisplayStatusListener implements Parcelable {
    public static final Parcelable.Creator<removeRearDisplayStatusListener> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String deviceToken;
    private final long expiryDateMillis;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<removeRearDisplayStatusListener> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ removeRearDisplayStatusListener createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            removeRearDisplayStatusListener removereardisplaystatuslistenerOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onExtraCallback + 45;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 32 / 0;
            }
            return removereardisplaystatuslistenerOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ removeRearDisplayStatusListener[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            removeRearDisplayStatusListener[] removereardisplaystatuslistenerArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 != 0) {
                int i5 = 40 / 0;
            }
            int i6 = onExtraCallbackWithResult + 109;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return removereardisplaystatuslistenerArrOnNavigationEvent;
        }

        public final removeRearDisplayStatusListener onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            removeRearDisplayStatusListener removereardisplaystatuslistener = new removeRearDisplayStatusListener(parcel.readString(), parcel.readLong());
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return removereardisplaystatuslistener;
        }

        public final removeRearDisplayStatusListener[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 107;
            onExtraCallbackWithResult = i3 % 128;
            removeRearDisplayStatusListener[] removereardisplaystatuslistenerArr = new removeRearDisplayStatusListener[i];
            if (i3 % 2 == 0) {
                return removereardisplaystatuslistenerArr;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 53;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public removeRearDisplayStatusListener() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ removeRearDisplayStatusListener copy$default(removeRearDisplayStatusListener removereardisplaystatuslistener, String str, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = removereardisplaystatuslistener.deviceToken;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i6 = i4 + 11;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                long j2 = removereardisplaystatuslistener.expiryDateMillis;
                obj2.hashCode();
                throw null;
            }
            j = removereardisplaystatuslistener.expiryDateMillis;
        }
        removeRearDisplayStatusListener removereardisplaystatuslistenerCopy = removereardisplaystatuslistener.copy(str, j);
        int i7 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return removereardisplaystatuslistenerCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deviceToken;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long component2() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.expiryDateMillis;
        int i4 = i2 + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final removeRearDisplayStatusListener copy(@NotNull String str, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        removeRearDisplayStatusListener removereardisplaystatuslistener = new removeRearDisplayStatusListener(str, j);
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return removereardisplaystatuslistener;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r9 instanceof o.removeRearDisplayStatusListener)) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r9 = (o.removeRearDisplayStatusListener) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8.deviceToken, r9.deviceToken) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r8.expiryDateMillis == r9.expiryDateMillis) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r9 = o.removeRearDisplayStatusListener.onNavigationEvent + 121;
        o.removeRearDisplayStatusListener.onExtraCallbackWithResult = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if ((r9 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r9 = o.removeRearDisplayStatusListener.onExtraCallbackWithResult + 75;
        o.removeRearDisplayStatusListener.onNavigationEvent = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.deviceToken.hashCode();
        return i3 != 0 ? (iHashCode - 111) - Long.hashCode(this.expiryDateMillis) : (iHashCode * 31) + Long.hashCode(this.expiryDateMillis);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeviceSessionTokenInfo(deviceToken=" + this.deviceToken + ", expiryDateMillis=" + this.expiryDateMillis + ")";
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.deviceToken);
        parcel.writeLong(this.expiryDateMillis);
        int i5 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public removeRearDisplayStatusListener(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceToken = str;
        this.expiryDateMillis = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ removeRearDisplayStatusListener(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            j = 0;
        }
        this(str, j);
    }

    public final String getDeviceToken() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.deviceToken;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    public final long getExpiryDateMillis() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.expiryDateMillis;
        int i4 = i2 + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final boolean isTokenValid() {
        int i = 2 % 2;
        if (this.deviceToken.length() <= 0) {
            return false;
        }
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (Calendar.getInstance().getTimeInMillis() >= this.expiryDateMillis) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }
}
