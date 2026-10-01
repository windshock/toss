package im.toss.core.webkit.bridge.accessarybutton;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
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

@nc(IAuthTabCallback = "icon-double")
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IconDoubleAccessoryButtonConfiguration extends AccessoryButtonConfiguration {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String color;
    private final String leftIconAlt;
    private final String leftIconName;
    private final String leftIconUrl;
    private final String leftSchemeUrl;
    private final String rightIconAlt;
    private final String rightIconName;
    private final String rightIconUrl;
    private final String rightSchemeUrl;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IconDoubleAccessoryButtonConfiguration> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<IconDoubleAccessoryButtonConfiguration> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IconDoubleAccessoryButtonConfiguration createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ IconDoubleAccessoryButtonConfiguration[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 109;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted(i);
                throw null;
            }
            IconDoubleAccessoryButtonConfiguration[] iconDoubleAccessoryButtonConfigurationArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = onNavigationEvent + 85;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iconDoubleAccessoryButtonConfigurationArrOnWarmupCompleted;
        }

        public final IconDoubleAccessoryButtonConfiguration onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IconDoubleAccessoryButtonConfiguration iconDoubleAccessoryButtonConfiguration = new IconDoubleAccessoryButtonConfiguration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iconDoubleAccessoryButtonConfiguration;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IconDoubleAccessoryButtonConfiguration[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 119;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            IconDoubleAccessoryButtonConfiguration[] iconDoubleAccessoryButtonConfigurationArr = new IconDoubleAccessoryButtonConfiguration[i];
            int i6 = i4 + 15;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 46 / 0;
            }
            return iconDoubleAccessoryButtonConfigurationArr;
        }
    }

    static {
        int i = IAuthTabCallback + 41;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i);
        int i11 = ~i4;
        int i12 = (~(i8 | i11 | i3)) | i10;
        int i13 = (~(i | i11)) | (~(i7 | i11));
        int i14 = i3 + i4 + i6 + (1941422536 * i2) + ((-555707305) * i5);
        int i15 = i14 * i14;
        int i16 = (i3 * (-2131549542)) + 177471488 + ((-2131549542) * i4) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i6) + ((-1363148800) * i2) + (2141716480 * i5) + ((-573308928) * i15);
        int i17 = ((i3 * 487360618) - 1291405921) + (i4 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i6 * 487361161) + (i2 * (-1188264952)) + (i5 * 624576655) + (i15 * (-25952256));
        if (i16 + (i17 * i17 * 74186752) != 1) {
            return onExtraCallback(objArr);
        }
        IconDoubleAccessoryButtonConfiguration iconDoubleAccessoryButtonConfiguration = (IconDoubleAccessoryButtonConfiguration) objArr[0];
        int i18 = 2 % 2;
        int i19 = onNavigationEvent;
        int i20 = i19 + 3;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        String str = iconDoubleAccessoryButtonConfiguration.leftSchemeUrl;
        int i22 = i19 + 49;
        onExtraCallbackWithResult = i22 % 128;
        int i23 = i22 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconDoubleAccessoryButtonConfiguration)) {
            int i2 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        IconDoubleAccessoryButtonConfiguration iconDoubleAccessoryButtonConfiguration = (IconDoubleAccessoryButtonConfiguration) obj;
        if (!Intrinsics.areEqual(this.type, iconDoubleAccessoryButtonConfiguration.type)) {
            int i4 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.leftIconName, iconDoubleAccessoryButtonConfiguration.leftIconName) || !Intrinsics.areEqual(this.rightIconName, iconDoubleAccessoryButtonConfiguration.rightIconName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.leftIconAlt, iconDoubleAccessoryButtonConfiguration.leftIconAlt)) {
            int i6 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.rightIconAlt, iconDoubleAccessoryButtonConfiguration.rightIconAlt)) {
            int i7 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.color, iconDoubleAccessoryButtonConfiguration.color)) {
            int i8 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.leftIconUrl, iconDoubleAccessoryButtonConfiguration.leftIconUrl)) {
            return false;
        }
        if (Intrinsics.areEqual(this.rightIconUrl, iconDoubleAccessoryButtonConfiguration.rightIconUrl)) {
            return Intrinsics.areEqual(this.leftSchemeUrl, iconDoubleAccessoryButtonConfiguration.leftSchemeUrl) && Intrinsics.areEqual(this.rightSchemeUrl, iconDoubleAccessoryButtonConfiguration.rightSchemeUrl);
        }
        int i10 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.leftIconName.hashCode();
        int iHashCode4 = this.rightIconName.hashCode();
        int iHashCode5 = this.leftIconAlt.hashCode();
        int iHashCode6 = this.rightIconAlt.hashCode();
        String str = this.color;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.leftIconUrl;
        if (str2 == null) {
            int i5 = onExtraCallbackWithResult;
            int i6 = i5 + 75;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 107;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.rightIconUrl;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.leftSchemeUrl;
        if (str4 == null) {
            int i10 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i10 % 128;
            i = i10 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode9 = str4.hashCode();
            int i11 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            i = iHashCode9;
        }
        String str5 = this.rightSchemeUrl;
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + i) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IconDoubleAccessoryButtonConfiguration(type=" + this.type + ", leftIconName=" + this.leftIconName + ", rightIconName=" + this.rightIconName + ", leftIconAlt=" + this.leftIconAlt + ", rightIconAlt=" + this.rightIconAlt + ", color=" + this.color + ", leftIconUrl=" + this.leftIconUrl + ", rightIconUrl=" + this.rightIconUrl + ", leftSchemeUrl=" + this.leftSchemeUrl + ", rightSchemeUrl=" + this.rightSchemeUrl + ")";
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.leftIconName);
        parcel.writeString(this.rightIconName);
        parcel.writeString(this.leftIconAlt);
        parcel.writeString(this.rightIconAlt);
        parcel.writeString(this.color);
        parcel.writeString(this.leftIconUrl);
        parcel.writeString(this.rightIconUrl);
        parcel.writeString(this.leftSchemeUrl);
        parcel.writeString(this.rightSchemeUrl);
        int i5 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        public static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IconDoubleAccessoryButtonConfiguration> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IconDoubleAccessoryButtonConfiguration$$serializer iconDoubleAccessoryButtonConfiguration$$serializer = IconDoubleAccessoryButtonConfiguration$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iconDoubleAccessoryButtonConfiguration$$serializer;
        }

        public static int onNavigationEvent() {
            int i = onNavigationEvent;
            int i2 = i % 9283504;
            onNavigationEvent = i + 1;
            if (i2 != 0) {
                return onExtraCallback;
            }
            int iMyPid = Process.myPid();
            onExtraCallback = iMyPid;
            return iMyPid;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IconDoubleAccessoryButtonConfiguration(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, okycx okycxVar) {
        super(i, okycxVar);
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, IconDoubleAccessoryButtonConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.leftIconName = "";
        } else {
            this.leftIconName = str2;
        }
        if ((i & 4) == 0) {
            this.rightIconName = "";
        } else {
            this.rightIconName = str3;
        }
        if ((i & 8) == 0) {
            this.leftIconAlt = "";
            int i4 = 2 % 2;
        } else {
            this.leftIconAlt = str4;
        }
        if ((i & 16) == 0) {
            this.rightIconAlt = "";
        } else {
            this.rightIconAlt = str5;
        }
        if ((i & 32) == 0) {
            int i5 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.color = null;
            int i7 = 2 % 2;
        } else {
            this.color = str6;
        }
        if ((i & 64) == 0) {
            int i8 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            this.leftIconUrl = null;
        } else {
            this.leftIconUrl = str7;
        }
        if ((i & 128) == 0) {
            this.rightIconUrl = null;
        } else {
            this.rightIconUrl = str8;
            int i10 = 2 % 2;
        }
        if ((i & 256) == 0) {
            this.leftSchemeUrl = null;
            int i11 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 / 5;
            } else {
                int i13 = 2 % 2;
            }
        } else {
            this.leftSchemeUrl = str9;
        }
        if ((i & 512) == 0) {
            this.rightSchemeUrl = null;
            return;
        }
        this.rightSchemeUrl = str10;
        int i14 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconDoubleAccessoryButtonConfiguration(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.leftIconName = str2;
        this.rightIconName = str3;
        this.leftIconAlt = str4;
        this.rightIconAlt = str5;
        this.color = str6;
        this.leftIconUrl = str7;
        this.rightIconUrl = str8;
        this.leftSchemeUrl = str9;
        this.rightSchemeUrl = str10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(IconDoubleAccessoryButtonConfiguration iconDoubleAccessoryButtonConfiguration, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, iconDoubleAccessoryButtonConfiguration.IAuthTabCallbackStubProxy());
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(iconDoubleAccessoryButtonConfiguration.leftIconName, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, iconDoubleAccessoryButtonConfiguration.leftIconName);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(iconDoubleAccessoryButtonConfiguration.rightIconName, "")) {
            vylVar.onExtraCallback(serialDescriptor, 2, iconDoubleAccessoryButtonConfiguration.rightIconName);
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(iconDoubleAccessoryButtonConfiguration.leftIconAlt, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, iconDoubleAccessoryButtonConfiguration.leftIconAlt);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(iconDoubleAccessoryButtonConfiguration.rightIconAlt, "")) {
                vylVar.onExtraCallback(serialDescriptor, 4, iconDoubleAccessoryButtonConfiguration.rightIconAlt);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || iconDoubleAccessoryButtonConfiguration.color != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, iconDoubleAccessoryButtonConfiguration.color);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || iconDoubleAccessoryButtonConfiguration.leftIconUrl != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, iconDoubleAccessoryButtonConfiguration.leftIconUrl);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 7)) || iconDoubleAccessoryButtonConfiguration.rightIconUrl != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, iconDoubleAccessoryButtonConfiguration.rightIconUrl);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i8 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                String str = iconDoubleAccessoryButtonConfiguration.leftSchemeUrl;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iconDoubleAccessoryButtonConfiguration.leftSchemeUrl != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, iconDoubleAccessoryButtonConfiguration.leftSchemeUrl);
            }
        }
        if ((true ^ vylVar.onWarmupCompleted(serialDescriptor, 9)) && iconDoubleAccessoryButtonConfiguration.rightSchemeUrl == null) {
            return;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, iconDoubleAccessoryButtonConfiguration.rightSchemeUrl);
        int i9 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
    }

    public String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        IconDoubleAccessoryButtonConfiguration iconDoubleAccessoryButtonConfiguration = (IconDoubleAccessoryButtonConfiguration) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = iconDoubleAccessoryButtonConfiguration.leftIconName;
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rightIconName;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.leftIconAlt;
        int i5 = i3 + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.rightIconAlt;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.color;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rightSchemeUrl;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        return (String) onExtraCallbackWithResult(new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 533640707, -533640707, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }

    public final String asInterface() {
        return (String) onExtraCallbackWithResult(new Object[]{this}, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -888014839, 888014840, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult());
    }
}
