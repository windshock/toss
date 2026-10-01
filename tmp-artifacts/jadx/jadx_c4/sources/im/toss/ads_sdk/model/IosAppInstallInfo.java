package im.toss.ads_sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IosAppInstallInfo implements Parcelable {
    public static final int $stable = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final Integer delaySeconds;
    private final Boolean isEnabled;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IosAppInstallInfo> CREATOR = new onNavigationEvent();

    public static final class onNavigationEvent implements Parcelable.Creator<IosAppInstallInfo> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IosAppInstallInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IosAppInstallInfo iosAppInstallInfoOnExtraCallback = onExtraCallback(parcel);
            int i4 = onNavigationEvent + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
            return iosAppInstallInfoOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IosAppInstallInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 29;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            IosAppInstallInfo[] iosAppInstallInfoArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onNavigationEvent + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return iosAppInstallInfoArrOnExtraCallbackWithResult;
        }

        public final IosAppInstallInfo onExtraCallback(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 95;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i5 = IAuthTabCallback + 51;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (parcel.readInt() != 0) {
                    int i7 = onNavigationEvent + 29;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new IosAppInstallInfo(numValueOf, boolValueOf, parcel.readString());
        }

        public final IosAppInstallInfo[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            IosAppInstallInfo[] iosAppInstallInfoArr = new IosAppInstallInfo[i];
            int i6 = i3 + 85;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 84 / 0;
            }
            return iosAppInstallInfoArr;
        }
    }

    static {
        int i = onExtraCallback + 19;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 85 / 0;
        }
    }

    public IosAppInstallInfo() {
        this((Integer) null, (Boolean) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IosAppInstallInfo)) {
            return false;
        }
        IosAppInstallInfo iosAppInstallInfo = (IosAppInstallInfo) obj;
        if (Intrinsics.areEqual(this.delaySeconds, iosAppInstallInfo.delaySeconds)) {
            return Intrinsics.areEqual(this.isEnabled, iosAppInstallInfo.isEnabled) && Intrinsics.areEqual(this.type, iosAppInstallInfo.type);
        }
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        Integer num = this.delaySeconds;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Boolean bool = this.isEnabled;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.type;
        if (str != null) {
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
                iHashCode = str.hashCode();
            } else {
                iHashCode = str.hashCode();
            }
        }
        int i4 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i5 = onNavigationEvent + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IosAppInstallInfo(delaySeconds=" + this.delaySeconds + ", isEnabled=" + this.isEnabled + ", type=" + this.type + ")";
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.delaySeconds;
        if (num == null) {
            int i5 = onNavigationEvent + 43;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            int i7 = onNavigationEvent + 101;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.type);
        int i9 = onNavigationEvent + 117;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 20 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IosAppInstallInfo> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IosAppInstallInfo$$serializer iosAppInstallInfo$$serializer = IosAppInstallInfo$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iosAppInstallInfo$$serializer;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IosAppInstallInfo(int i, Integer num, Boolean bool, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.delaySeconds = num;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
            }
            if ((i & 2) != 0) {
                int i3 = onWarmupCompleted + 11;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                this.isEnabled = null;
                int i5 = 2 % 2;
            } else {
                this.isEnabled = bool;
            }
            if ((i & 4) == 0) {
                this.type = str;
                return;
            }
            this.type = null;
            int i6 = onWarmupCompleted + 77;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.delaySeconds = null;
        int i7 = 2 % 2;
        if ((i & 2) != 0) {
        }
        if ((i & 4) == 0) {
        }
    }

    public IosAppInstallInfo(@Nullable Integer num, @Nullable Boolean bool, @Nullable String str) {
        this.delaySeconds = num;
        this.isEnabled = bool;
        this.type = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(IosAppInstallInfo iosAppInstallInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, iosAppInstallInfo.delaySeconds);
        } else if (iosAppInstallInfo.delaySeconds != null) {
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onNavigationEvent + 73;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 92 / 0;
                if (iosAppInstallInfo.isEnabled != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, iosAppInstallInfo.isEnabled);
                }
            } else if (iosAppInstallInfo.isEnabled != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i5 = onWarmupCompleted + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (iosAppInstallInfo.type == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, iosAppInstallInfo.type);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IosAppInstallInfo(Integer num, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        num = (i & 1) != 0 ? null : num;
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
            int i4 = 2 % 2;
            bool = null;
        }
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 37;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(num, bool, str);
    }
}
