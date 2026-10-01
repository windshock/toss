package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundAsCirclePostprocessor {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final IAuthTabCallback clientLoggerInfo;
    private final String iconUrl;
    private final String linkUrl;
    private final boolean plccActivation;
    private final String title;

    public RoundAsCirclePostprocessor() {
        this(null, null, false, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundAsCirclePostprocessor)) {
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RoundAsCirclePostprocessor roundAsCirclePostprocessor = (RoundAsCirclePostprocessor) obj;
        if (!Intrinsics.areEqual(this.iconUrl, roundAsCirclePostprocessor.iconUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.linkUrl, roundAsCirclePostprocessor.linkUrl)) {
            int i4 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.plccActivation != roundAsCirclePostprocessor.plccActivation || !Intrinsics.areEqual(this.title, roundAsCirclePostprocessor.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.clientLoggerInfo, roundAsCirclePostprocessor.clientLoggerInfo)) {
            return true;
        }
        int i6 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.iconUrl.hashCode();
        int iHashCode3 = this.linkUrl.hashCode();
        int iHashCode4 = Boolean.hashCode(this.plccActivation);
        int iHashCode5 = this.title.hashCode();
        IAuthTabCallback iAuthTabCallback = this.clientLoggerInfo;
        if (iAuthTabCallback == null) {
            iHashCode = 0;
        } else {
            iHashCode = iAuthTabCallback.hashCode();
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
        int i5 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccCardShowInfo(iconUrl=" + this.iconUrl + ", linkUrl=" + this.linkUrl + ", plccActivation=" + this.plccActivation + ", title=" + this.title + ", clientLoggerInfo=" + this.clientLoggerInfo + ")";
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return str;
    }

    public RoundAsCirclePostprocessor(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @Nullable IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.iconUrl = str;
        this.linkUrl = str2;
        this.plccActivation = z;
        this.title = str3;
        this.clientLoggerInfo = iAuthTabCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundAsCirclePostprocessor(String str, String str2, boolean z, String str3, IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        String str4 = BuildConfig.FLAVOR;
        if (i2 != 0) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 73;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        String str5 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        if ((i & 4) != 0) {
            int i9 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            int i11 = 2 % 2;
        } else {
            str4 = str3;
        }
        if ((i & 16) != 0) {
            int i12 = 2 % 2;
            iAuthTabCallback = null;
        }
        this(str, str5, z2, str4, iAuthTabCallback);
    }

    public static final class IAuthTabCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String actionType;
        private final String category;
        private final String objectName;
        private final String screenName;
        private final String test;
        private final String vendor;

        public IAuthTabCallback() {
            this(null, null, null, null, null, null, 63, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.actionType, iAuthTabCallback.actionType)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.category, iAuthTabCallback.category)) {
                int i4 = onNavigationEvent + 83;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 94 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.objectName, iAuthTabCallback.objectName)) {
                return false;
            }
            if (Intrinsics.areEqual(this.screenName, iAuthTabCallback.screenName)) {
                if (Intrinsics.areEqual(this.test, iAuthTabCallback.test)) {
                    return Intrinsics.areEqual(this.vendor, iAuthTabCallback.vendor);
                }
                int i6 = onWarmupCompleted + 107;
                onNavigationEvent = i6 % 128;
                return i6 % 2 != 0;
            }
            int i7 = onWarmupCompleted + 125;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 64 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((this.actionType.hashCode() * 31) + this.category.hashCode()) * 31) + this.objectName.hashCode()) * 31) + this.screenName.hashCode()) * 31) + this.test.hashCode()) * 31) + this.vendor.hashCode();
            int i4 = onWarmupCompleted + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ClientLoggerInfo(actionType=" + this.actionType + ", category=" + this.category + ", objectName=" + this.objectName + ", screenName=" + this.screenName + ", test=" + this.test + ", vendor=" + this.vendor + ")";
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str6, BuildConfig.FLAVOR);
            this.actionType = str;
            this.category = str2;
            this.objectName = str3;
            this.screenName = str4;
            this.test = str5;
            this.vendor = str6;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            String str9;
            String str10;
            String str11 = (i & 1) != 0 ? BuildConfig.FLAVOR : str;
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                str7 = BuildConfig.FLAVOR;
            } else {
                str7 = str2;
            }
            String str12 = (i & 4) != 0 ? BuildConfig.FLAVOR : str3;
            if ((i & 8) != 0) {
                int i4 = onWarmupCompleted + 17;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                str8 = BuildConfig.FLAVOR;
            } else {
                str8 = str4;
            }
            if ((i & 16) != 0) {
                int i6 = 2 % 2;
                str9 = BuildConfig.FLAVOR;
            } else {
                str9 = str5;
            }
            if ((i & 32) != 0) {
                int i7 = onWarmupCompleted + 85;
                int i8 = i7 % 128;
                onNavigationEvent = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 61;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
                str10 = BuildConfig.FLAVOR;
            } else {
                str10 = str6;
            }
            this(str11, str7, str12, str8, str9, str10);
        }
    }
}
