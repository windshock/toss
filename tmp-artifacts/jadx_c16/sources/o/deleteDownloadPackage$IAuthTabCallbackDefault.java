package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class deleteDownloadPackage$IAuthTabCallbackDefault implements deleteDownloadPackage {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final deleteDownloadPackage$IAuthTabCallbackDefault onWarmupCompleted = new deleteDownloadPackage$IAuthTabCallbackDefault();

    static {
        int i = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj || (obj instanceof deleteDownloadPackage$IAuthTabCallbackDefault)) {
            return true;
        }
        int i4 = i3 + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 2120904477;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return "PopupCancellationBottomSheet";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private deleteDownloadPackage$IAuthTabCallbackDefault() {
    }
}
