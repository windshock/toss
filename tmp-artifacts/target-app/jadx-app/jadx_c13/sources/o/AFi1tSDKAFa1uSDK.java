package o;

import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1tSDKAFa1uSDK {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final WidgetWatchlists.WatchList onExtraCallback;
    private final onExtraCallback onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1tSDKAFa1uSDK)) {
            return false;
        }
        AFi1tSDKAFa1uSDK aFi1tSDKAFa1uSDK = (AFi1tSDKAFa1uSDK) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, aFi1tSDKAFa1uSDK.onExtraCallback)) {
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult == aFi1tSDKAFa1uSDK.onExtraCallbackWithResult) {
            return true;
        }
        int i4 = IAuthTabCallback + 75;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 25;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.onExtraCallback.hashCode() - 1) << this.onExtraCallbackWithResult.hashCode() : (this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i3 = onWarmupCompleted + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WatchlistSelection(watchlist=" + this.onExtraCallback + ", reason=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public AFi1tSDKAFa1uSDK(@NotNull WidgetWatchlists.WatchList watchList, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(watchList, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onExtraCallback = watchList;
        this.onExtraCallbackWithResult = onextracallback;
    }

    public final WidgetWatchlists.WatchList onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        WidgetWatchlists.WatchList watchList = this.onExtraCallback;
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return watchList;
    }

    public final onExtraCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final onExtraCallback SELECTED = new onExtraCallback("SELECTED", 0);
        public static final onExtraCallback RECENT_WATCH = new onExtraCallback("RECENT_WATCH", 1);
        public static final onExtraCallback FIRST_GROUP = new onExtraCallback("FIRST_GROUP", 2);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {SELECTED, RECENT_WATCH, FIRST_GROUP};
            int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 83;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i2 + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallback + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onWarmupCompleted + 5;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallback(String str, int i) {
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback onextracallback = onExtraCallback.SELECTED;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.onExtraCallbackWithResult != onExtraCallback.SELECTED) {
            return true;
        }
        int i3 = IAuthTabCallback + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }
}
