package o;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class requestMultiplePermissions {
    public static final int $stable = 0;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String background;
    private final String description;
    private final String highlight;
    private final String subValue;
    private final String title;
    private final String value;

    static {
        int i = onWarmupCompleted + 51;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public requestMultiplePermissions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof requestMultiplePermissions)) {
            return false;
        }
        requestMultiplePermissions requestmultiplepermissions = (requestMultiplePermissions) obj;
        if (!Intrinsics.areEqual(this.title, requestmultiplepermissions.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.description, requestmultiplepermissions.description)) {
            int i2 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.background, requestmultiplepermissions.background)) {
            int i3 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.highlight, requestmultiplepermissions.highlight) || !Intrinsics.areEqual(this.value, requestmultiplepermissions.value)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subValue, requestmultiplepermissions.subValue)) {
            int i5 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.background.hashCode()) * 31) + this.highlight.hashCode()) * 31) + this.value.hashCode()) * 31) + this.subValue.hashCode();
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Color(title=" + this.title + ", description=" + this.description + ", background=" + this.background + ", highlight=" + this.highlight + ", value=" + this.value + ", subValue=" + this.subValue + ")";
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public requestMultiplePermissions(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.title = str;
        this.description = str2;
        this.background = str3;
        this.highlight = str4;
        this.value = str5;
        this.subValue = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ requestMultiplePermissions(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11 = (i & 1) != 0 ? "" : str;
        String str12 = (i & 2) != 0 ? "" : str2;
        Object obj = null;
        if ((i & 4) != 0) {
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i3 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str9 = "";
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            str10 = "";
        } else {
            str10 = str6;
        }
        this(str11, str12, str7, str8, str9, str10);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.highlight;
        int i5 = i3 + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subValue;
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public static final class onExtraCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final int onExtraCallback(@Nullable requestMultiplePermissions requestmultiplepermissions, @NotNull Context context, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 99;
            onNavigationEvent = i3 % 128;
            String strOnExtraCallback = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                setDoubleTapZoomDpi setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            setDoubleTapZoomDpi setdoubletapzoomdpi2 = setDoubleTapZoomDpi.IAuthTabCallback;
            if (requestmultiplepermissions != null) {
                int i4 = onWarmupCompleted + 63;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                strOnExtraCallback = requestmultiplepermissions.onExtraCallback();
            }
            return setdoubletapzoomdpi2.onExtraCallback(context, strOnExtraCallback, i);
        }

        public final int IAuthTabCallback(@Nullable requestMultiplePermissions requestmultiplepermissions, @NotNull Context context, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 69;
            onNavigationEvent = i3 % 128;
            String strOnNavigationEvent = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                setDoubleTapZoomDpi setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
                strOnNavigationEvent.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            setDoubleTapZoomDpi setdoubletapzoomdpi2 = setDoubleTapZoomDpi.IAuthTabCallback;
            if (requestmultiplepermissions != null) {
                int i4 = onWarmupCompleted + 67;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    requestmultiplepermissions.onNavigationEvent();
                    throw null;
                }
                strOnNavigationEvent = requestmultiplepermissions.onNavigationEvent();
            }
            int iOnExtraCallback = setdoubletapzoomdpi2.onExtraCallback(context, strOnNavigationEvent, i);
            int i5 = onWarmupCompleted + 35;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 19 / 0;
            }
            return iOnExtraCallback;
        }

        public final int onExtraCallbackWithResult(@Nullable requestMultiplePermissions requestmultiplepermissions, @NotNull Context context, int i) {
            String strIAuthTabCallback;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            setDoubleTapZoomDpi setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
            if (requestmultiplepermissions != null) {
                int i5 = onWarmupCompleted + 85;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                strIAuthTabCallback = requestmultiplepermissions.IAuthTabCallback();
                if (i6 != 0) {
                    int i7 = 24 / 0;
                }
            } else {
                int i8 = onWarmupCompleted + 5;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                strIAuthTabCallback = null;
            }
            return setdoubletapzoomdpi.onExtraCallback(context, strIAuthTabCallback, i);
        }

        public final int onWarmupCompleted(@Nullable requestMultiplePermissions requestmultiplepermissions, @NotNull Context context, int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Object obj = null;
            int iOnExtraCallback = setDoubleTapZoomDpi.IAuthTabCallback.onExtraCallback(context, requestmultiplepermissions != null ? requestmultiplepermissions.onExtraCallbackWithResult() : null, i);
            int i5 = onWarmupCompleted + 5;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return iOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        public final int onNavigationEvent(@Nullable requestMultiplePermissions requestmultiplepermissions, @NotNull Context context, int i) {
            String strOnWarmupCompleted;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            setDoubleTapZoomDpi setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
            if (requestmultiplepermissions != null) {
                int i3 = onNavigationEvent + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                strOnWarmupCompleted = requestmultiplepermissions.onWarmupCompleted();
                int i5 = onNavigationEvent + 111;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                strOnWarmupCompleted = null;
            }
            return setdoubletapzoomdpi.onExtraCallback(context, strOnWarmupCompleted, i);
        }
    }
}
