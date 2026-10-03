package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdvertisingIdInfoDirectly implements Parcelable {
    public static final Parcelable.Creator<getAdvertisingIdInfoDirectly> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final boolean isRequired;
    private final boolean uploadOnVerificationFailure;

    public static final class IAuthTabCallback implements Parcelable.Creator<getAdvertisingIdInfoDirectly> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getAdvertisingIdInfoDirectly createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getAdvertisingIdInfoDirectly getadvertisingidinfodirectlyOnExtraCallback = onExtraCallback(parcel);
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            return getadvertisingidinfodirectlyOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ getAdvertisingIdInfoDirectly[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 11;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            getAdvertisingIdInfoDirectly[] getadvertisingidinfodirectlyArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = IAuthTabCallback + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return getadvertisingidinfodirectlyArrOnWarmupCompleted;
        }

        public final getAdvertisingIdInfoDirectly onExtraCallback(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                int i4 = IAuthTabCallback + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                int i6 = onWarmupCompleted + 57;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                z2 = false;
            }
            return new getAdvertisingIdInfoDirectly(z, z2);
        }

        public final getAdvertisingIdInfoDirectly[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 97;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            getAdvertisingIdInfoDirectly[] getadvertisingidinfodirectlyArr = new getAdvertisingIdInfoDirectly[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 15;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return getadvertisingidinfodirectlyArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 109;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getAdvertisingIdInfoDirectly() {
        boolean z = false;
        this(z, z, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof getAdvertisingIdInfoDirectly) {
            getAdvertisingIdInfoDirectly getadvertisingidinfodirectly = (getAdvertisingIdInfoDirectly) obj;
            return this.isRequired == getadvertisingidinfodirectly.isRequired && this.uploadOnVerificationFailure == getadvertisingidinfodirectly.uploadOnVerificationFailure;
        }
        int i4 = i3 + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Boolean.hashCode(this.isRequired) / 6) >>> Boolean.hashCode(this.uploadOnVerificationFailure) : (Boolean.hashCode(this.isRequired) * 31) + Boolean.hashCode(this.uploadOnVerificationFailure);
        int i3 = onWarmupCompleted + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IdVerificationImageUploadConfig(isRequired=" + this.isRequired + ", uploadOnVerificationFailure=" + this.uploadOnVerificationFailure + ")";
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeInt(this.uploadOnVerificationFailure ? 1 : 0);
        int i5 = onWarmupCompleted + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public getAdvertisingIdInfoDirectly(boolean z, boolean z2) {
        this.isRequired = z;
        this.uploadOnVerificationFailure = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getAdvertisingIdInfoDirectly(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            z = i2 % 2 == 0;
            int i4 = i3 + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(z, (i & 2) != 0 ? false : z2);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.isRequired;
        int i4 = i3 + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.uploadOnVerificationFailure;
        }
        throw null;
    }
}
