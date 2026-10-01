package im.toss.core.webkit.bridge.accessarybutton;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nc;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@nc(IAuthTabCallback = "icon")
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IconAccessoryButtonConfiguration extends AccessoryButtonConfiguration {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String alt;
    private final String color;
    private final String name;
    private final String schemeUrl;
    private final boolean showRedDot;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IconAccessoryButtonConfiguration> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<IconAccessoryButtonConfiguration> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final IconAccessoryButtonConfiguration[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 43;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            IconAccessoryButtonConfiguration[] iconAccessoryButtonConfigurationArr = new IconAccessoryButtonConfiguration[i];
            if (i3 % 2 != 0) {
                int i5 = 67 / 0;
            }
            int i6 = i4 + 39;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 83 / 0;
            }
            return iconAccessoryButtonConfigurationArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IconAccessoryButtonConfiguration createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IconAccessoryButtonConfiguration[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            throw null;
        }

        public final IconAccessoryButtonConfiguration onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = IAuthTabCallback + 5;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = onWarmupCompleted + 45;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 3;
                }
                z = false;
            }
            return new IconAccessoryButtonConfiguration(string, string2, string3, string4, z, parcel.readString());
        }
    }

    static {
        int i = onExtraCallback + 39;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconAccessoryButtonConfiguration)) {
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        IconAccessoryButtonConfiguration iconAccessoryButtonConfiguration = (IconAccessoryButtonConfiguration) obj;
        if (!Intrinsics.areEqual(this.type, iconAccessoryButtonConfiguration.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, iconAccessoryButtonConfiguration.name)) {
            int i4 = onWarmupCompleted + 113;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.color, iconAccessoryButtonConfiguration.color)) {
            return Intrinsics.areEqual(this.schemeUrl, iconAccessoryButtonConfiguration.schemeUrl) && this.showRedDot == iconAccessoryButtonConfiguration.showRedDot && Intrinsics.areEqual(this.alt, iconAccessoryButtonConfiguration.alt);
        }
        int i6 = onWarmupCompleted + 15;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.name.hashCode();
        String str = this.color;
        if (str == null) {
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onWarmupCompleted + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.schemeUrl;
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showRedDot)) * 31) + this.alt.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IconAccessoryButtonConfiguration(type=" + this.type + ", name=" + this.name + ", color=" + this.color + ", schemeUrl=" + this.schemeUrl + ", showRedDot=" + this.showRedDot + ", alt=" + this.alt + ")";
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.color);
        parcel.writeString(this.schemeUrl);
        parcel.writeInt(this.showRedDot ? 1 : 0);
        parcel.writeString(this.alt);
        int i5 = onWarmupCompleted + 55;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IconAccessoryButtonConfiguration> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IconAccessoryButtonConfiguration$$serializer iconAccessoryButtonConfiguration$$serializer = IconAccessoryButtonConfiguration$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return iconAccessoryButtonConfiguration$$serializer;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconAccessoryButtonConfiguration(int i, String str, String str2, String str3, String str4, boolean z, String str5, okycx okycxVar) {
        super(i, okycxVar);
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 0, IconAccessoryButtonConfiguration$$serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 1, IconAccessoryButtonConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            this.color = null;
        } else {
            this.color = str3;
        }
        if ((i & 8) == 0) {
            int i6 = onNavigationEvent + 103;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            this.schemeUrl = null;
            int i9 = i7 + 31;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            this.schemeUrl = str4;
        }
        if ((i & 16) == 0) {
            this.showRedDot = false;
            int i12 = onNavigationEvent + 107;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            this.showRedDot = z;
        }
        if ((i & 32) == 0) {
            this.alt = "";
        } else {
            this.alt = str5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconAccessoryButtonConfiguration(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z, @NotNull String str5) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.name = str2;
        this.color = str3;
        this.schemeUrl = str4;
        this.showRedDot = z;
        this.alt = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(IconAccessoryButtonConfiguration iconAccessoryButtonConfiguration, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, iconAccessoryButtonConfiguration.IAuthTabCallbackStub());
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(iconAccessoryButtonConfiguration.name, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, iconAccessoryButtonConfiguration.name);
                int i4 = onNavigationEvent + 117;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || iconAccessoryButtonConfiguration.color != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, iconAccessoryButtonConfiguration.color);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || iconAccessoryButtonConfiguration.schemeUrl != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, iconAccessoryButtonConfiguration.schemeUrl);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onNavigationEvent + 113;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            boolean z = iconAccessoryButtonConfiguration.showRedDot;
            if (i7 == 0) {
                int i8 = 23 / 0;
                if (z) {
                    vylVar.onNavigationEvent(serialDescriptor, 4, iconAccessoryButtonConfiguration.showRedDot);
                }
            } else if (z) {
            }
        }
        if ((!vylVar.onWarmupCompleted(serialDescriptor, 5)) && Intrinsics.areEqual(iconAccessoryButtonConfiguration.alt, "")) {
            return;
        }
        vylVar.onExtraCallback(serialDescriptor, 5, iconAccessoryButtonConfiguration.alt);
    }

    public String IAuthTabCallbackStub() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.type;
            int i4 = 14 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.color;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.schemeUrl;
        int i5 = i3 + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean asBinder() {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            z = this.showRedDot;
            int i4 = 48 / 0;
        } else {
            z = this.showRedDot;
        }
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return z;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.alt;
        int i5 = i2 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
