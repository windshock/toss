package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isDebuggerOn implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<isDebuggerOn> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String color;
    private final boolean useTransport;

    public static final class onWarmupCompleted implements Parcelable.Creator<isDebuggerOn> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final isDebuggerOn[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 51;
            onExtraCallbackWithResult = i3 % 128;
            isDebuggerOn[] isdebuggeronArr = new isDebuggerOn[i];
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
            }
            return isdebuggeronArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isDebuggerOn createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            isDebuggerOn isdebuggeronOnExtraCallback = onExtraCallback(parcel);
            if (i3 != 0) {
                int i4 = 17 / 0;
            }
            int i5 = onExtraCallbackWithResult + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return isdebuggeronOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isDebuggerOn[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            isDebuggerOn[] isdebuggeronArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onExtraCallback + 13;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return isdebuggeronArrIAuthTabCallback;
        }

        public final isDebuggerOn onExtraCallback(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i2 = onExtraCallback + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                int i4 = onExtraCallbackWithResult + 115;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new isDebuggerOn(string, z);
        }
    }

    static {
        int i = IAuthTabCallback + 43;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isDebuggerOn)) {
            return false;
        }
        isDebuggerOn isdebuggeron = (isDebuggerOn) obj;
        if (!Intrinsics.areEqual(this.color, isdebuggeron.color)) {
            int i4 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.useTransport != isdebuggeron.useTransport) {
            int i6 = onExtraCallbackWithResult + 25;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            z = i6 % 2 == 0;
            int i8 = i7 + 29;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 9 / 0;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.color.hashCode() * 31) + Boolean.hashCode(this.useTransport);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccDesignFormValue(color=" + this.color + ", useTransport=" + this.useTransport + ")";
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeString(this.color);
            parcel.writeInt(this.useTransport ? 1 : 0);
            throw null;
        }
        parcel.writeString(this.color);
        parcel.writeInt(this.useTransport ? 1 : 0);
        int i5 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public isDebuggerOn(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.color = str;
        this.useTransport = z;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.color;
        int i5 = i3 + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
