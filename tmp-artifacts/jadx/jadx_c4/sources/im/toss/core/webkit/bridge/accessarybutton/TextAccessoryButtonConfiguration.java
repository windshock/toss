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

@nc(IAuthTabCallback = "text")
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TextAccessoryButtonConfiguration extends AccessoryButtonConfiguration {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String alt;
    private final String color;
    private final String schemeUrl;
    private final boolean showRedDot;
    private final String title;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TextAccessoryButtonConfiguration> CREATOR = new onNavigationEvent();

    public static final class onNavigationEvent implements Parcelable.Creator<TextAccessoryButtonConfiguration> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TextAccessoryButtonConfiguration createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TextAccessoryButtonConfiguration[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            TextAccessoryButtonConfiguration[] textAccessoryButtonConfigurationArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = IAuthTabCallback + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return textAccessoryButtonConfigurationArrOnExtraCallbackWithResult;
        }

        public final TextAccessoryButtonConfiguration onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i4 = onWarmupCompleted + 113;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new TextAccessoryButtonConfiguration(string, string2, string3, string4, z, parcel.readString());
        }

        public final TextAccessoryButtonConfiguration[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 65;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            Object obj = null;
            TextAccessoryButtonConfiguration[] textAccessoryButtonConfigurationArr = new TextAccessoryButtonConfiguration[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return textAccessoryButtonConfigurationArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TextAccessoryButtonConfiguration)) {
            return false;
        }
        TextAccessoryButtonConfiguration textAccessoryButtonConfiguration = (TextAccessoryButtonConfiguration) obj;
        if (!Intrinsics.areEqual(this.type, textAccessoryButtonConfiguration.type)) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 27;
            onNavigationEvent = i5 % 128;
            boolean z = i5 % 2 != 0;
            int i6 = i4 + 125;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }
        if (!Intrinsics.areEqual(this.title, textAccessoryButtonConfiguration.title)) {
            int i8 = onWarmupCompleted + 71;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.schemeUrl, textAccessoryButtonConfiguration.schemeUrl)) || !Intrinsics.areEqual(this.color, textAccessoryButtonConfiguration.color)) {
            return false;
        }
        if (this.showRedDot == textAccessoryButtonConfiguration.showRedDot) {
            return Intrinsics.areEqual(this.alt, textAccessoryButtonConfiguration.alt);
        }
        int i10 = onNavigationEvent + 31;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.type.hashCode();
            iHashCode2 = this.title.hashCode();
            str = this.schemeUrl;
            iHashCode3 = 1;
            if (str != null) {
                i3 = 1;
                int iHashCode4 = str.hashCode();
                int i4 = onNavigationEvent + 125;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode3 = i3;
                i3 = iHashCode4;
            }
        } else {
            iHashCode = this.type.hashCode();
            iHashCode2 = this.title.hashCode();
            str = this.schemeUrl;
            if (str == null) {
                iHashCode3 = 0;
            } else {
                int iHashCode42 = str.hashCode();
                int i42 = onNavigationEvent + 125;
                onWarmupCompleted = i42 % 128;
                int i52 = i42 % 2;
                iHashCode3 = i3;
                i3 = iHashCode42;
            }
        }
        String str2 = this.color;
        if (str2 != null) {
            iHashCode3 = str2.hashCode();
        }
        int iHashCode5 = (((((((((iHashCode * 31) + iHashCode2) * 31) + i3) * 31) + iHashCode3) * 31) + Boolean.hashCode(this.showRedDot)) * 31) + this.alt.hashCode();
        int i6 = onWarmupCompleted + 51;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TextAccessoryButtonConfiguration(type=" + this.type + ", title=" + this.title + ", schemeUrl=" + this.schemeUrl + ", color=" + this.color + ", showRedDot=" + this.showRedDot + ", alt=" + this.alt + ")";
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.schemeUrl);
        parcel.writeString(this.color);
        parcel.writeInt(this.showRedDot ? 1 : 0);
        parcel.writeString(this.alt);
        int i5 = onNavigationEvent + 3;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TextAccessoryButtonConfiguration> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TextAccessoryButtonConfiguration$$serializer textAccessoryButtonConfiguration$$serializer = TextAccessoryButtonConfiguration$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            return textAccessoryButtonConfiguration$$serializer;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextAccessoryButtonConfiguration(int i, String str, String str2, String str3, String str4, boolean z, String str5, okycx okycxVar) {
        super(i, okycxVar);
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, TextAccessoryButtonConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.schemeUrl = null;
        } else {
            this.schemeUrl = str3;
        }
        int i2 = 2 % 2;
        if ((i & 8) == 0) {
            int i3 = onWarmupCompleted + 19;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.color = null;
            if (i4 != 0) {
                int i5 = 65 / 0;
            }
        } else {
            this.color = str4;
            int i6 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.showRedDot = false;
        } else {
            this.showRedDot = z;
            int i7 = 2 % 2;
        }
        if ((i & 32) != 0) {
            this.alt = str5;
            return;
        }
        int i8 = onNavigationEvent + 37;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        this.alt = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAccessoryButtonConfiguration(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, boolean z, @NotNull String str5) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.type = str;
        this.title = str2;
        this.schemeUrl = str3;
        this.color = str4;
        this.showRedDot = z;
        this.alt = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(TextAccessoryButtonConfiguration textAccessoryButtonConfiguration, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, textAccessoryButtonConfiguration.asBinder());
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || (!Intrinsics.areEqual(textAccessoryButtonConfiguration.title, ""))) {
            vylVar.onExtraCallback(serialDescriptor, 1, textAccessoryButtonConfiguration.title);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, textAccessoryButtonConfiguration.schemeUrl);
        } else {
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                String str = textAccessoryButtonConfiguration.schemeUrl;
                throw null;
            }
            if (textAccessoryButtonConfiguration.schemeUrl != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || textAccessoryButtonConfiguration.color != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, textAccessoryButtonConfiguration.color);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i3 = onNavigationEvent + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (textAccessoryButtonConfiguration.showRedDot) {
                vylVar.onNavigationEvent(serialDescriptor, 4, textAccessoryButtonConfiguration.showRedDot);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i5 = onNavigationEvent + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.areEqual(textAccessoryButtonConfiguration.alt, "");
                throw null;
            }
            if (Intrinsics.areEqual(textAccessoryButtonConfiguration.alt, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 5, textAccessoryButtonConfiguration.alt);
    }

    public String asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 39;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.type;
            int i4 = 76 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.schemeUrl;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.color;
        int i4 = i3 + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return str;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.showRedDot;
        int i5 = i2 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.alt;
        int i5 = i3 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
