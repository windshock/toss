package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class G0 implements Parcelable {
    public static final Parcelable.Creator<G0> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 0;
    public static final int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private final long onExtraCallback;
    private final String onNavigationEvent;

    public static final class onWarmupCompleted implements Parcelable.Creator<G0> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ G0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            G0 g0OnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return g0OnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ G0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 97;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            G0[] g0ArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onExtraCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return g0ArrOnExtraCallbackWithResult;
        }

        public final G0[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            G0[] g0Arr = new G0[i];
            int i6 = i3 + 47;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return g0Arr;
            }
            throw null;
        }

        public final G0 onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            G0 g0 = new G0(parcel.readLong(), parcel.readString());
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return g0;
        }
    }

    static {
        int i = IAuthTabCallback + 59;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 109;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 87;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 33;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof G0)) {
            int i4 = IAuthTabCallbackDefault + 47;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        G0 g0 = (G0) obj;
        if (this.onExtraCallback != g0.onExtraCallback || !Intrinsics.areEqual(this.onNavigationEvent, g0.onNavigationEvent)) {
            return false;
        }
        int i6 = onTransact + 25;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 87 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackDefault = i2 % 128;
        return i2 % 2 != 0 ? (Long.hashCode(this.onExtraCallback) << 67) * this.onNavigationEvent.hashCode() : (Long.hashCode(this.onExtraCallback) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StandardTermsV2Document(signId=" + this.onExtraCallback + ", doc=" + this.onNavigationEvent + ")";
        int i2 = onTransact + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 91;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeLong(this.onExtraCallback);
            parcel.writeString(this.onNavigationEvent);
        } else {
            parcel.writeLong(this.onExtraCallback);
            parcel.writeString(this.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public G0(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = j;
        this.onNavigationEvent = str;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        int i3 = 98 / 0;
        return this.onExtraCallback;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 123;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
