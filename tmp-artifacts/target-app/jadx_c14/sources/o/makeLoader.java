package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class makeLoader implements Parcelable {
    public static final Parcelable.Creator<makeLoader> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String content;
    private final int indentLevel;

    public static final class onNavigationEvent implements Parcelable.Creator<makeLoader> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final makeLoader[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            makeLoader[] makeloaderArr = new makeLoader[i];
            int i6 = i3 + 23;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return makeloaderArr;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ makeLoader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            makeLoader makeloaderOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return makeloaderOnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ makeLoader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            makeLoader[] makeloaderArrIAuthTabCallback = IAuthTabCallback(i);
            if (i4 == 0) {
                int i5 = 11 / 0;
            }
            return makeloaderArrIAuthTabCallback;
        }

        public final makeLoader onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            makeLoader makeloader = new makeLoader(parcel.readInt(), parcel.readString());
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return makeloader;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 91;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof makeLoader)) {
            return false;
        }
        makeLoader makeloader = (makeLoader) obj;
        if (this.indentLevel != makeloader.indentLevel || !Intrinsics.areEqual(this.content, makeloader.content)) {
            return false;
        }
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.indentLevel) * 31) + this.content.hashCode();
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OrderContent(indentLevel=" + this.indentLevel + ", content=" + this.content + ")";
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.indentLevel);
        parcel.writeString(this.content);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public makeLoader(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.indentLevel = i;
        this.content = str;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.indentLevel;
        int i6 = i3 + 79;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.content;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return str;
    }
}
