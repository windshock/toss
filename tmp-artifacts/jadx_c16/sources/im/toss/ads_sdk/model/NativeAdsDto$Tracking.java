package im.toss.ads_sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeAdsDto$Tracking implements Parcelable {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String click;
    private final String error;
    private final String onePixelImpression;
    private final String payload;
    private final String viewableImpression;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Parcelable.Creator<NativeAdsDto$Tracking> CREATOR = new onExtraCallbackWithResult();

    static {
        int i = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public NativeAdsDto$Tracking() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 69;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof NativeAdsDto$Tracking)) {
            int i8 = i4 + 53;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        NativeAdsDto$Tracking nativeAdsDto$Tracking = (NativeAdsDto$Tracking) obj;
        if (!Intrinsics.areEqual(this.payload, nativeAdsDto$Tracking.payload)) {
            int i10 = onExtraCallback + 121;
            onNavigationEvent = i10 % 128;
            return i10 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.error, nativeAdsDto$Tracking.error)) {
            int i11 = onNavigationEvent + 81;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onePixelImpression, nativeAdsDto$Tracking.onePixelImpression)) {
            return Intrinsics.areEqual(this.viewableImpression, nativeAdsDto$Tracking.viewableImpression) && !(Intrinsics.areEqual(this.click, nativeAdsDto$Tracking.click) ^ true);
        }
        int i13 = onExtraCallback + 71;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.payload.hashCode() * 31) + this.error.hashCode()) * 31) + this.onePixelImpression.hashCode()) * 31) + this.viewableImpression.hashCode()) * 31) + this.click.hashCode();
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Tracking(payload=" + this.payload + ", error=" + this.error + ", onePixelImpression=" + this.onePixelImpression + ", viewableImpression=" + this.viewableImpression + ", click=" + this.click + ")";
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.payload;
        if (i4 == 0) {
            parcel.writeString(str);
            parcel.writeString(this.error);
            parcel.writeString(this.onePixelImpression);
            parcel.writeString(this.viewableImpression);
            parcel.writeString(this.click);
            return;
        }
        parcel.writeString(str);
        parcel.writeString(this.error);
        parcel.writeString(this.onePixelImpression);
        parcel.writeString(this.viewableImpression);
        parcel.writeString(this.click);
        int i5 = 32 / 0;
    }

    public /* synthetic */ NativeAdsDto$Tracking(int i, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.payload = "";
        } else {
            this.payload = str;
        }
        if ((i & 2) == 0) {
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.error = "";
            if (i3 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
        } else {
            this.error = str2;
        }
        if ((i & 4) == 0) {
            this.onePixelImpression = "";
        } else {
            this.onePixelImpression = str3;
        }
        if ((i & 8) == 0) {
            int i5 = onNavigationEvent + 83;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.viewableImpression = "";
            if (i6 == 0) {
                int i7 = 49 / 0;
            }
        } else {
            this.viewableImpression = str4;
            int i8 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.click = "";
            return;
        }
        this.click = str5;
        int i9 = onNavigationEvent + 3;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    public NativeAdsDto$Tracking(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.payload = str;
        this.error = str2;
        this.onePixelImpression = str3;
        this.viewableImpression = str4;
        this.click = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(NativeAdsDto$Tracking nativeAdsDto$Tracking, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallback(serialDescriptor, 0, nativeAdsDto$Tracking.payload);
        } else {
            int i3 = onNavigationEvent + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual(nativeAdsDto$Tracking.payload, "")) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(nativeAdsDto$Tracking.error, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, nativeAdsDto$Tracking.error);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || (!Intrinsics.areEqual(nativeAdsDto$Tracking.onePixelImpression, ""))) {
            vylVar.onExtraCallback(serialDescriptor, 2, nativeAdsDto$Tracking.onePixelImpression);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(nativeAdsDto$Tracking.viewableImpression, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, nativeAdsDto$Tracking.viewableImpression);
            int i5 = onNavigationEvent + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 3;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(nativeAdsDto$Tracking.click, "")) {
            vylVar.onExtraCallback(serialDescriptor, 4, nativeAdsDto$Tracking.click);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsDto$Tracking(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        String str9 = "";
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = onNavigationEvent + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i8 = onNavigationEvent + 49;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i10 = onNavigationEvent + 73;
            onExtraCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        } else {
            str9 = str5;
        }
        this(str, str6, str7, str8, str9);
    }
}
