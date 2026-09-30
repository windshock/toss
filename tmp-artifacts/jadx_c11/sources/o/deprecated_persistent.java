package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_persistent {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private deprecated_path onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[PHI: r1
      0x0043: PHI (r1v10 o.deprecated_path) = (r1v9 o.deprecated_path), (r1v12 o.deprecated_path) binds: [B:15:0x0041, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull deprecated_path deprecated_pathVar) {
        deprecated_path deprecated_pathVar2;
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deprecated_pathVar, "");
            int i3 = 95 / 0;
            if (Intrinsics.areEqual(deprecated_pathVar, this.onExtraCallbackWithResult)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(deprecated_pathVar, "");
            if (Intrinsics.areEqual(deprecated_pathVar, this.onExtraCallbackWithResult)) {
                return;
            }
        }
        int i4 = onExtraCallback + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            deprecated_pathVar2 = this.onExtraCallbackWithResult;
            int i5 = 67 / 0;
            if (deprecated_pathVar2 != null) {
                deprecated_pathVar2.onExtraCallback();
            }
        } else {
            deprecated_pathVar2 = this.onExtraCallbackWithResult;
            if (deprecated_pathVar2 != null) {
            }
        }
        deprecated_pathVar.onNavigationEvent();
        this.onExtraCallbackWithResult = deprecated_pathVar;
        int i6 = onExtraCallback + 53;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }
}
