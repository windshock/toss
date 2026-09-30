package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class getConfiguration<T> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final T onExtraCallbackWithResult;
    private final T onNavigationEvent;

    public getConfiguration(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        this.onNavigationEvent = t;
        this.onExtraCallbackWithResult = t2;
    }

    public final T onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        T t = this.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return t;
    }

    public final T onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        T t = this.onExtraCallbackWithResult;
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return t;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof getConfiguration) {
            getConfiguration getconfiguration = (getConfiguration) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, getconfiguration.onNavigationEvent)) {
                int i4 = IAuthTabCallback + 83;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, getconfiguration.onExtraCallbackWithResult)) {
                return true;
            }
            int i6 = IAuthTabCallback + 41;
            onExtraCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = i2 + 49;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onExtraCallback + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Tween(begin=" + this.onNavigationEvent + ", end=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
