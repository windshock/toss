package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreateInputImageFromJPEGBinary {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Map<String, Object> IAuthTabCallback;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateInputImageFromJPEGBinary)) {
            int i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CreateInputImageFromJPEGBinary createInputImageFromJPEGBinary = (CreateInputImageFromJPEGBinary) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, createInputImageFromJPEGBinary.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, createInputImageFromJPEGBinary.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, createInputImageFromJPEGBinary.IAuthTabCallback)) {
            int i4 = onExtraCallbackWithResult + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onExtraCallback + 85;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EventLogForwardOptions(logNameKey=" + this.onNavigationEvent + ", defaultService=" + this.onWarmupCompleted + ", extraParams=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public CreateInputImageFromJPEGBinary(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallback = map;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 103;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onNavigationEvent;
            int i4 = 47 / 0;
        } else {
            str = this.onNavigationEvent;
        }
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return str;
    }

    public final Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Map<String, Object> map = this.IAuthTabCallback;
        int i4 = i3 + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }
}
