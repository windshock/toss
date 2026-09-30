package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getSharedPreferences {
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSharedPreferences)) {
            int i2 = asInterface + 25;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        getSharedPreferences getsharedpreferences = (getSharedPreferences) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, getsharedpreferences.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, getsharedpreferences.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onWarmupCompleted, getsharedpreferences.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getsharedpreferences.onExtraCallbackWithResult);
        }
        int i3 = onNavigationEvent + 35;
        asInterface = i3 % 128;
        return i3 % 2 == 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode4 = str.hashCode();
            int i5 = asInterface + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuizMissionBannerData(title=" + this.onExtraCallback + ", logType=" + this.IAuthTabCallback + ", linkUrl=" + this.onWarmupCompleted + ", subtitle=" + this.onExtraCallbackWithResult + ")";
        int i2 = asInterface + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public getSharedPreferences(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onExtraCallback = str;
        this.IAuthTabCallback = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = str4;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 37;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i3 + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i3 + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
