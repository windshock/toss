package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isFallbackMode implements doCallInitialize {
    public static final Parcelable.Creator<isFallbackMode> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final int height;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<isFallbackMode> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isFallbackMode createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            isFallbackMode isfallbackmodeOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onExtraCallback + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return isfallbackmodeOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ isFallbackMode[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 107;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onExtraCallback(i);
            }
            onExtraCallback(i);
            throw null;
        }

        public final isFallbackMode[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 43;
            onExtraCallback = i3 % 128;
            isFallbackMode[] isfallbackmodeArr = new isFallbackMode[i];
            if (i3 % 2 != 0) {
                return isfallbackmodeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final isFallbackMode onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            isFallbackMode isfallbackmode = new isFallbackMode(parcel.readString(), parcel.readInt());
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return isfallbackmode;
        }
    }

    static {
        int i = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i % 128;
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
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isFallbackMode)) {
            return false;
        }
        isFallbackMode isfallbackmode = (isFallbackMode) obj;
        if (Intrinsics.areEqual(this.type, isfallbackmode.type)) {
            return this.height == isfallbackmode.height;
        }
        int i4 = onWarmupCompleted + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.type.hashCode() << 65) >> Integer.hashCode(this.height) : (this.type.hashCode() * 31) + Integer.hashCode(this.height);
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FaqSpaceContent(type=" + this.type + ", height=" + this.height + ")";
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeInt(this.height);
        int i5 = onExtraCallback + 121;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public isFallbackMode(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.height = i;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.height;
        int i6 = i2 + 83;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
