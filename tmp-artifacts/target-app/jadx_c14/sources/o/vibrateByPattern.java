package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class vibrateByPattern implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<vibrateByPattern> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private NativePermissionsAndroidSpec button;

    public static final class IAuthTabCallback implements Parcelable.Creator<vibrateByPattern> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final vibrateByPattern[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            vibrateByPattern[] vibratebypatternArr = new vibrateByPattern[i];
            int i6 = i3 + 89;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return vibratebypatternArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ vibrateByPattern createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            vibrateByPattern vibratebypatternOnExtraCallback = onExtraCallback(parcel);
            int i4 = onWarmupCompleted + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return vibratebypatternOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ vibrateByPattern[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            vibrateByPattern[] vibratebypatternArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return vibratebypatternArrIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final vibrateByPattern onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            NativePermissionsAndroidSpec nativePermissionsAndroidSpecValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() != 0) {
                nativePermissionsAndroidSpecValueOf = NativePermissionsAndroidSpec.valueOf(parcel.readString());
                int i4 = onWarmupCompleted + 21;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
            return new vibrateByPattern(nativePermissionsAndroidSpecValueOf);
        }
    }

    static {
        int i = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vibrateByPattern() {
        NativePermissionsAndroidSpec nativePermissionsAndroidSpec = null;
        this(nativePermissionsAndroidSpec, 1, nativePermissionsAndroidSpec);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vibrateByPattern)) {
            int i2 = onNavigationEvent + 51;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (this.button == ((vibrateByPattern) obj).button) {
            return true;
        }
        int i3 = onNavigationEvent + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NativePermissionsAndroidSpec nativePermissionsAndroidSpec = this.button;
        if (nativePermissionsAndroidSpec == null) {
            return 0;
        }
        int iHashCode = nativePermissionsAndroidSpec.hashCode();
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LinkStyle(button=" + this.button + ")";
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        NativePermissionsAndroidSpec nativePermissionsAndroidSpec = this.button;
        if (nativePermissionsAndroidSpec != null) {
            parcel.writeInt(1);
            parcel.writeString(nativePermissionsAndroidSpec.name());
            int i3 = onNavigationEvent + 1;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = IAuthTabCallback + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public vibrateByPattern(@Nullable NativePermissionsAndroidSpec nativePermissionsAndroidSpec) {
        this.button = nativePermissionsAndroidSpec;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vibrateByPattern(NativePermissionsAndroidSpec nativePermissionsAndroidSpec, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            nativePermissionsAndroidSpec = NativePermissionsAndroidSpec.NONE;
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(nativePermissionsAndroidSpec);
    }

    public final NativePermissionsAndroidSpec onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativePermissionsAndroidSpec nativePermissionsAndroidSpec = this.button;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return nativePermissionsAndroidSpec;
    }
}
