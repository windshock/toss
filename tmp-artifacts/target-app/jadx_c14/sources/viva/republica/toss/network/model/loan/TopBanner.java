package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.TopBanner$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TopBanner implements Parcelable {
    public static final Parcelable.Creator<TopBanner> CREATOR = new onExtraCallbackWithResult();
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String iconUrl;
    private final String landingUrl;
    private final String lowerText;
    private final String upperText;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<TopBanner> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final TopBanner[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 117;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            TopBanner[] topBannerArr = new TopBanner[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 25;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
            return topBannerArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TopBanner createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TopBanner topBannerOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return topBannerOnExtraCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ TopBanner[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                IAuthTabCallback(i);
                obj.hashCode();
                throw null;
            }
            TopBanner[] topBannerArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return topBannerArrIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public final TopBanner onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TopBanner topBanner = new TopBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return topBanner;
            }
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 59;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopBanner)) {
            return false;
        }
        TopBanner topBanner = (TopBanner) obj;
        if (!Intrinsics.areEqual(this.iconUrl, topBanner.iconUrl)) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 55;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.upperText, topBanner.upperText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lowerText, topBanner.lowerText)) {
            int i8 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.landingUrl, topBanner.landingUrl)) {
            return true;
        }
        int i10 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.iconUrl.hashCode() * 31) + this.upperText.hashCode()) * 31) + this.lowerText.hashCode()) * 31) + this.landingUrl.hashCode();
        int i4 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TopBanner(iconUrl=" + this.iconUrl + ", upperText=" + this.upperText + ", lowerText=" + this.lowerText + ", landingUrl=" + this.landingUrl + ")";
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.upperText);
        parcel.writeString(this.lowerText);
        parcel.writeString(this.landingUrl);
        int i5 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TopBanner> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                TopBanner$.serializer serializerVar = TopBanner$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TopBanner$.serializer serializerVar2 = TopBanner$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
            }
            return serializerVar2;
        }
    }

    public /* synthetic */ TopBanner(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = TopBanner$.serializer.INSTANCE.getDescriptor();
                i2 = 74;
            } else {
                descriptor = TopBanner$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.iconUrl = str;
        this.upperText = str2;
        this.lowerText = str3;
        this.landingUrl = str4;
    }

    public TopBanner(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.iconUrl = str;
        this.upperText = str2;
        this.lowerText = str3;
        this.landingUrl = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(TopBanner topBanner, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, topBanner.iconUrl);
        vylVar.onExtraCallback(serialDescriptor, 1, topBanner.upperText);
        vylVar.onExtraCallback(serialDescriptor, 2, topBanner.lowerText);
        vylVar.onExtraCallback(serialDescriptor, 3, topBanner.landingUrl);
        int i4 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUrl;
        int i5 = i2 + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.upperText;
        int i4 = i2 + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.lowerText;
        int i5 = i3 + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.landingUrl;
        int i4 = i3 + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return str;
    }
}
