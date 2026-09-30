package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class regexpCheck$asBinder implements NativeKeyboardObserverSpec {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final NativeReactDevToolsRuntimeSettingsModuleSpec onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof regexpCheck$asBinder)) {
            int i4 = onExtraCallbackWithResult + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, ((regexpCheck$asBinder) obj).onNavigationEvent)) {
            return false;
        }
        int i6 = onExtraCallbackWithResult + 41;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onExtraCallback + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Previous(previousConsumptionInfo=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public regexpCheck$asBinder(@NotNull NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec) {
        Intrinsics.checkNotNullParameter(nativeReactDevToolsRuntimeSettingsModuleSpec, "");
        this.onNavigationEvent = nativeReactDevToolsRuntimeSettingsModuleSpec;
    }

    public /* bridge */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = super.IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return jIAuthTabCallback;
    }

    public final NativeReactDevToolsRuntimeSettingsModuleSpec onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec = this.onNavigationEvent;
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return nativeReactDevToolsRuntimeSettingsModuleSpec;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return "Previous";
        }
        throw null;
    }
}
