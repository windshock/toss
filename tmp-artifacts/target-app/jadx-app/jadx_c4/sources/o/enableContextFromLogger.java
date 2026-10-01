package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableContextFromLogger implements Parcelable {
    public static final Parcelable.Creator<enableContextFromLogger> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final String IAuthTabCallback;
    private final long onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public static final class IAuthTabCallback implements Parcelable.Creator<enableContextFromLogger> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final enableContextFromLogger[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            enableContextFromLogger[] enablecontextfromloggerArr = new enableContextFromLogger[i];
            int i6 = i3 + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return enablecontextfromloggerArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableContextFromLogger createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            enableContextFromLogger enablecontextfromloggerOnExtraCallback = onExtraCallback(parcel);
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return enablecontextfromloggerOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ enableContextFromLogger[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            enableContextFromLogger[] enablecontextfromloggerArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 70 / 0;
            }
            return enablecontextfromloggerArrIAuthTabCallback;
        }

        public final enableContextFromLogger onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            enableContextFromLogger enablecontextfromlogger = new enableContextFromLogger(parcel.readLong(), parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return enablecontextfromlogger;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 15;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof o.enableContextFromLogger) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 77;
        o.enableContextFromLogger.IAuthTabCallbackStub = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r10 = (o.enableContextFromLogger) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r9.onExtraCallbackWithResult == r10.onExtraCallbackWithResult) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r2 = r2 + 59;
        o.enableContextFromLogger.IAuthTabCallbackStub = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.onWarmupCompleted, r10.onWarmupCompleted) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.IAuthTabCallback, r10.IAuthTabCallback) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            int i4 = 47 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asBinder = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((Long.hashCode(this.onExtraCallbackWithResult) - 60) / this.onWarmupCompleted.hashCode()) * 3) / this.IAuthTabCallback.hashCode() : (((Long.hashCode(this.onExtraCallbackWithResult) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i3 = IAuthTabCallbackStub + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditQuiz(creditQuizId=" + this.onExtraCallbackWithResult + ", title=" + this.onWarmupCompleted + ", description=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackStub + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 53;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeLong(this.onExtraCallbackWithResult);
            parcel.writeString(this.onWarmupCompleted);
            parcel.writeString(this.IAuthTabCallback);
        } else {
            parcel.writeLong(this.onExtraCallbackWithResult);
            parcel.writeString(this.onWarmupCompleted);
            parcel.writeString(this.IAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public enableContextFromLogger(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = str2;
    }

    public final long onWarmupCompleted() {
        long j;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 97;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.onExtraCallbackWithResult;
            int i4 = 14 / 0;
        } else {
            j = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 1;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i2 + 121;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 81;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
