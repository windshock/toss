package im.toss.ads_sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AppInfo> CREATOR = new onNavigationEvent();
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String appStoreUrl;
    private final String playStoreUrl;

    public static final class onNavigationEvent implements Parcelable.Creator<AppInfo> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AppInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ AppInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 61;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onNavigationEvent(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AppInfo[] appInfoArrOnNavigationEvent = onNavigationEvent(i);
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return appInfoArrOnNavigationEvent;
        }

        public final AppInfo onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AppInfo appInfo = new AppInfo(parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return appInfo;
        }

        public final AppInfo[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 97;
            onExtraCallback = i4 % 128;
            Object obj = null;
            AppInfo[] appInfoArr = new AppInfo[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return appInfoArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 103;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppInfo() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof AppInfo) {
            AppInfo appInfo = (AppInfo) obj;
            return Intrinsics.areEqual(this.appStoreUrl, appInfo.appStoreUrl) && Intrinsics.areEqual(this.playStoreUrl, appInfo.playStoreUrl);
        }
        int i4 = onExtraCallback + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            str = this.appStoreUrl;
            iHashCode = 1;
            if (str != null) {
                i3 = 1;
                int iHashCode2 = str.hashCode();
                int i4 = onExtraCallback + 37;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = i3;
                i3 = iHashCode2;
            }
        } else {
            str = this.appStoreUrl;
            if (str == null) {
                iHashCode = 0;
            } else {
                int iHashCode22 = str.hashCode();
                int i42 = onExtraCallback + 37;
                IAuthTabCallback = i42 % 128;
                int i52 = i42 % 2;
                iHashCode = i3;
                i3 = iHashCode22;
            }
        }
        String str2 = this.playStoreUrl;
        if (str2 != null) {
            int i6 = onExtraCallback + 15;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode = str2.hashCode();
        }
        return (i3 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppInfo(appStoreUrl=" + this.appStoreUrl + ", playStoreUrl=" + this.playStoreUrl + ")";
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.appStoreUrl);
        parcel.writeString(this.playStoreUrl);
        int i5 = IAuthTabCallback + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppInfo> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AppInfo$$serializer appInfo$$serializer = AppInfo$$serializer.INSTANCE;
            if (i3 != 0) {
                return appInfo$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ AppInfo(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.appStoreUrl = null;
        } else {
            this.appStoreUrl = str;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            this.playStoreUrl = str2;
            int i5 = IAuthTabCallback + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        int i7 = onExtraCallback + 55;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        this.playStoreUrl = null;
        if (i8 != 0) {
            throw null;
        }
    }

    public AppInfo(@Nullable String str, @Nullable String str2) {
        this.appStoreUrl = str;
        this.playStoreUrl = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AppInfo appInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || appInfo.appStoreUrl != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, appInfo.appStoreUrl);
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, appInfo.playStoreUrl);
        } else {
            int i4 = IAuthTabCallback + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (appInfo.playStoreUrl != null) {
            }
        }
        int i6 = IAuthTabCallback + 77;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }
}
