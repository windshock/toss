package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class secondaryName {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final deprecated_charset IAuthTabCallback;
    private final deprecated_realm onExtraCallback;
    private final float onExtraCallbackWithResult;

    public secondaryName(@NotNull deprecated_realm deprecated_realmVar, float f, @NotNull deprecated_charset deprecated_charsetVar) {
        Intrinsics.checkNotNullParameter(deprecated_realmVar, "");
        Intrinsics.checkNotNullParameter(deprecated_charsetVar, "");
        this.onExtraCallback = deprecated_realmVar;
        this.onExtraCallbackWithResult = f;
        this.IAuthTabCallback = deprecated_charsetVar;
    }

    public final deprecated_realm onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deprecated_charset IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        deprecated_charset deprecated_charsetVar = this.IAuthTabCallback;
        int i5 = i2 + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_charsetVar;
    }
}
