package o;

import android.content.Context;
import android.content.res.Resources;
import im.toss.core.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RectangleShape {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof RectangleShape) {
            return this.onNavigationEvent == ((RectangleShape) obj).onNavigationEvent;
        }
        int i4 = IAuthTabCallback + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.onNavigationEvent);
        int i4 = IAuthTabCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BiometricAvailabilityResult(resultCode=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RectangleShape(int i) {
        boolean z;
        this.onNavigationEvent = i;
        boolean z2 = true;
        if (i == 0) {
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            z = true;
        } else {
            int i4 = 2 % 2;
            z = false;
        }
        this.onExtraCallbackWithResult = z;
        if (i != 11 && i != 14) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 53;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 65;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            z2 = z;
        }
        this.onExtraCallback = z2;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.onExtraCallbackWithResult;
        int i4 = i3 + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 37;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Pair<String, String> IAuthTabCallback(@NotNull Resources resources) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resources, "");
        int i2 = this.onNavigationEvent;
        if (i2 == 1) {
            return getWrite.IAuthTabCallback(resources.getString(R.string.biometric_sensor_error), resources.getString(R.string.biometric_hw_unavailable_message));
        }
        int i3 = onWarmupCompleted + 121;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (i2 == 14) {
            return getWrite.IAuthTabCallback("", resources.getString(R.string.biometric_no_device_credential_message));
        }
        if (i2 == 11) {
            return getWrite.IAuthTabCallback(resources.getString(R.string.biometric_need_enroll_title), resources.getString(R.string.biometric_need_enroll_message));
        }
        if (i2 == 12) {
            return getWrite.IAuthTabCallback(resources.getString(R.string.biometric_sensor_error), resources.getString(R.string.biometric_no_hardware_message));
        }
        int i6 = i4 + 89;
        onWarmupCompleted = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            getWrite.IAuthTabCallback(resources.getString(R.string.biometric_unknown_error_title), resources.getString(R.string.biometric_unknown_error_message));
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(resources.getString(R.string.biometric_unknown_error_title), resources.getString(R.string.biometric_unknown_error_message));
        int i7 = IAuthTabCallback + 43;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return pairIAuthTabCallback;
        }
        throw null;
    }

    public final Pair<String, String> IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Pair<String, String> pairIAuthTabCallback = IAuthTabCallback(resources);
        int i4 = IAuthTabCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return pairIAuthTabCallback;
    }
}
