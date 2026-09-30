package o;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setInstallResult {
    public static final setInstallResult IAuthTabCallback = new setInstallResult();
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static Bitmap onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 93;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private setInstallResult() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull Function1<? super Bitmap, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Bitmap bitmap = onNavigationEvent;
        if (bitmap != null) {
            int i2 = asInterface + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 28 / 0;
                if (bitmap.isRecycled()) {
                    bitmap = null;
                }
            } else if (!(!bitmap.isRecycled())) {
            }
        }
        function1.invoke(bitmap);
        onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent = null;
        int i5 = i2 + 25;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onWarmupCompleted(@Nullable Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent = bitmap;
        if (i3 != 0) {
            throw null;
        }
    }
}
