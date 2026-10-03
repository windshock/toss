package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RotationOptionsRotation implements Parcelable {
    public static final Parcelable.Creator<RotationOptionsRotation> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Long clickLogId;
    private final String iconUrl;
    private final Long impressionLogId;
    private final String landingScheme;
    private final String lowerText;
    private final String upperText;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<RotationOptionsRotation> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RotationOptionsRotation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RotationOptionsRotation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            RotationOptionsRotation[] rotationOptionsRotationArrOnExtraCallback = onExtraCallback(i);
            if (i4 != 0) {
                int i5 = 34 / 0;
            }
            return rotationOptionsRotationArrOnExtraCallback;
        }

        public final RotationOptionsRotation[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 87;
            IAuthTabCallback = i3 % 128;
            RotationOptionsRotation[] rotationOptionsRotationArr = new RotationOptionsRotation[i];
            if (i3 % 2 == 0) {
                return rotationOptionsRotationArr;
            }
            throw null;
        }

        public final RotationOptionsRotation onWarmupCompleted(Parcel parcel) {
            Long lValueOf;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Long lValueOf2 = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i4 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i5 = IAuthTabCallback + 3;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                i = onExtraCallback + 29;
                IAuthTabCallback = i % 128;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
                i = IAuthTabCallback + 93;
                onExtraCallback = i % 128;
            }
            int i7 = i % 2;
            return new RotationOptionsRotation(string, string2, string3, string4, lValueOf, lValueOf2);
        }
    }

    static {
        int i = onNavigationEvent + 57;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RotationOptionsRotation)) {
            return false;
        }
        RotationOptionsRotation rotationOptionsRotation = (RotationOptionsRotation) obj;
        if ((!Intrinsics.areEqual(this.iconUrl, rotationOptionsRotation.iconUrl)) || !Intrinsics.areEqual(this.upperText, rotationOptionsRotation.upperText) || !Intrinsics.areEqual(this.lowerText, rotationOptionsRotation.lowerText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.landingScheme, rotationOptionsRotation.landingScheme)) {
            int i4 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.impressionLogId, rotationOptionsRotation.impressionLogId)) {
            int i6 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.clickLogId, rotationOptionsRotation.clickLogId)) {
            return false;
        }
        int i8 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.iconUrl;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode4 = this.upperText.hashCode();
        int iHashCode5 = this.lowerText.hashCode();
        String str2 = this.landingScheme;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        Long l = this.impressionLogId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        Long l2 = this.clickLogId;
        if (l2 != null) {
            int i6 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                l2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode3 = l2.hashCode();
        }
        return (((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GeneralBannerInfo(iconUrl=" + this.iconUrl + ", upperText=" + this.upperText + ", lowerText=" + this.lowerText + ", landingScheme=" + this.landingScheme + ", impressionLogId=" + this.impressionLogId + ", clickLogId=" + this.clickLogId + ")";
        int i2 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.upperText);
            parcel.writeString(this.lowerText);
            parcel.writeString(this.landingScheme);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.upperText);
        parcel.writeString(this.lowerText);
        parcel.writeString(this.landingScheme);
        Long l = this.impressionLogId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.clickLogId;
        if (l2 != null) {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
            return;
        }
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(0);
        }
    }

    public RotationOptionsRotation(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.iconUrl = str;
        this.upperText = str2;
        this.lowerText = str3;
        this.landingScheme = str4;
        this.impressionLogId = l;
        this.clickLogId = l2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconUrl;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.upperText;
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lowerText;
        int i5 = i2 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.landingScheme;
        int i4 = i2 + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.impressionLogId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.clickLogId;
        int i4 = i2 + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }
}
