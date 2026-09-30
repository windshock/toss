package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class toDate {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof toDate)) {
            return false;
        }
        toDate todate = (toDate) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, todate.onNavigationEvent)) {
            int i4 = onExtraCallback;
            int i5 = i4 + 47;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 49;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, todate.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, todate.IAuthTabCallback)) {
            int i8 = IAuthTabCallbackDefault + 53;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, todate.onExtraCallbackWithResult)) {
            return true;
        }
        int i10 = onExtraCallback + 13;
        IAuthTabCallbackDefault = i10 % 128;
        return !(i10 % 2 != 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? ((((this.onNavigationEvent.hashCode() / 64) % this.onWarmupCompleted.hashCode()) - this.IAuthTabCallback.hashCode()) + 50) / this.onExtraCallbackWithResult.hashCode() : (((((this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i3 = IAuthTabCallbackDefault + 113;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossWebSocketSessionMetaData(url=" + this.onNavigationEvent + ", loginToken=" + this.onWarmupCompleted + ", userToken=" + this.IAuthTabCallback + ", decodeKey=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return str;
    }

    public toDate(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallback = str3;
        this.onExtraCallbackWithResult = str4;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return str;
    }
}
