package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class C_ {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Bitmap IAuthTabCallback(View view, Bitmap.Config config, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 95;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            config = Bitmap.Config.ARGB_8888;
        }
        return onExtraCallback(view, config);
    }

    public static final Bitmap onExtraCallback(@NotNull View view, @NotNull Bitmap.Config config) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(config, "");
            view.getWidth();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(config, "");
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        view.draw(new Canvas(bitmapCreateBitmap));
        int i3 = onExtraCallback + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return bitmapCreateBitmap;
        }
        obj.hashCode();
        throw null;
    }
}
