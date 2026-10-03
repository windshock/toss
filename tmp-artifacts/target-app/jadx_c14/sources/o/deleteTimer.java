package o;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class deleteTimer {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private showWithGravity align;
    private final String darkUri;
    private sendBinary format;
    private int height;
    private final int repeatCount;
    private final String uri;
    private int width;

    public deleteTimer() {
        this(null, null, null, null, 0, 0, 0, 127, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof deleteTimer)) {
            int i4 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        deleteTimer deletetimer = (deleteTimer) obj;
        if (!Intrinsics.areEqual(this.uri, deletetimer.uri)) {
            int i6 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.darkUri, deletetimer.darkUri)) {
            int i8 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.align != deletetimer.align) {
            int i10 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.format != deletetimer.format) {
            int i12 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.repeatCount != deletetimer.repeatCount || this.width != deletetimer.width) {
            return false;
        }
        if (this.height == deletetimer.height) {
            return true;
        }
        int i14 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i14 % 128;
        return i14 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.uri.hashCode();
        int iHashCode3 = this.darkUri.hashCode();
        showWithGravity showwithgravity = this.align;
        int iHashCode4 = 0;
        if (showwithgravity == null) {
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = showwithgravity.hashCode();
        }
        sendBinary sendbinary = this.format;
        if (sendbinary != null) {
            int i6 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode4 = sendbinary.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + Integer.hashCode(this.repeatCount)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Icon(uri=" + this.uri + ", darkUri=" + this.darkUri + ", align=" + this.align + ", format=" + this.format + ", repeatCount=" + this.repeatCount + ", width=" + this.width + ", height=" + this.height + ")";
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public deleteTimer(@NotNull String str, @NotNull String str2, @Nullable showWithGravity showwithgravity, @Nullable sendBinary sendbinary, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.uri = str;
        this.darkUri = str2;
        this.align = showwithgravity;
        this.format = sendbinary;
        this.repeatCount = i;
        this.width = i2;
        this.height = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ deleteTimer(String str, String str2, showWithGravity showwithgravity, sendBinary sendbinary, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        int i5;
        int i6;
        int i7;
        if ((i4 & 1) != 0) {
            int i8 = 2 % 2;
            str = "";
        }
        String str3 = (i4 & 2) == 0 ? str2 : "";
        Object obj = null;
        if ((i4 & 4) != 0) {
            int i9 = onExtraCallbackWithResult + 57;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                showWithGravity showwithgravity2 = showWithGravity.NONE;
                obj.hashCode();
                throw null;
            }
            showwithgravity = showWithGravity.NONE;
            int i10 = 2 % 2;
        }
        showWithGravity showwithgravity3 = showwithgravity;
        if ((i4 & 8) != 0) {
            int i11 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                sendBinary sendbinary2 = sendBinary.NONE;
                obj.hashCode();
                throw null;
            }
            sendbinary = sendBinary.NONE;
            int i12 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        }
        sendBinary sendbinary3 = sendbinary;
        if ((i4 & 16) != 0) {
            int i15 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            int i17 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i17 % 128;
            int i18 = i17 % 2;
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 64) != 0) {
            int i19 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            i7 = 0;
        } else {
            i7 = i3;
        }
        this(str, str3, showwithgravity3, sendbinary3, i5, i6, i7);
    }

    public final showWithGravity IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.align;
        }
        throw null;
    }

    public final sendBinary onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        sendBinary sendbinary = this.format;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return sendbinary;
        }
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.repeatCount;
        int i6 = i2 + 29;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String onWarmupCompleted(@Nullable Context context) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        String str = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (context != null) {
            if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                String str2 = this.darkUri;
                if (str2.length() <= 0) {
                    int i3 = onNavigationEvent + 59;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    str = str2;
                }
                if (str != null) {
                    int i5 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }
            }
        }
        return this.uri;
    }
}
