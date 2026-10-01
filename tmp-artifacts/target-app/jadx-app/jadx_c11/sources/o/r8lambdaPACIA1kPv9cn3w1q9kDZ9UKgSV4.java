package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4 {
    private static int asBinder = 1;
    public static int onExtraCallback;
    public static int onNavigationEvent;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 91;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4)) {
            return false;
        }
        r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4 r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4 = (r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4) obj;
        if ((!Intrinsics.areEqual(this.IAuthTabCallback, r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4.IAuthTabCallback)) || !Intrinsics.areEqual(this.onWarmupCompleted, r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambdapacia1kpv9cn3w1q9kdz9ukgsv4.onExtraCallbackWithResult)) {
            return true;
        }
        int i3 = onTransact + 25;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onTransact + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnBundleRequestContext(region=" + this.IAuthTabCallback + ", company=" + this.onWarmupCompleted + ", distributionGroup=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambdaPACIA1kPv9cn3w1q9kDZ9UKgSV4(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallbackWithResult = str3;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("region must not be blank");
        }
        if (!StringsKt.isBlank(str2)) {
            int i = asBinder + 59;
            onTransact = i % 128;
            if (i % 2 != 0) {
                StringsKt.isBlank(str3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (StringsKt.isBlank(str3)) {
                throw new IllegalArgumentException("distributionGroup must not be blank");
            }
            int i2 = asBinder + 89;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("company must not be blank");
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 87;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 47;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i3 + 29;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static int onExtraCallback() {
        int i = onExtraCallback;
        int i2 = i % 6857104;
        onExtraCallback = i + 1;
        if (i2 != 0) {
            return onNavigationEvent;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        onNavigationEvent = i3;
        return i3;
    }
}
