package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class processTransParentParam {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final boolean onExtraCallbackWithResult(@NotNull RecyclerView.ViewHolder viewHolder, float f) {
        View view;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        int width = viewHolder.onNavigationEvent.getWidth() * viewHolder.onNavigationEvent.getHeight();
        Rect rect = new Rect();
        viewHolder.onNavigationEvent.getGlobalVisibleRect(rect);
        Object parent = viewHolder.onNavigationEvent.getParent();
        if (!(!(parent instanceof View))) {
            view = (View) parent;
        } else {
            int i2 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            view = null;
        }
        if (view == null) {
            return ((float) (rect.width() * rect.height())) >= ((float) width) * f;
        }
        view.getGlobalVisibleRect(new Rect());
        if (rect.width() * (RangesKt.coerceAtMost(rect.bottom, r5.bottom) - RangesKt.coerceAtLeast(rect.top, r5.top)) >= width * f) {
            int i4 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static final boolean onNavigationEvent(@NotNull RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(viewHolder, 1.0f);
        int i4 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }
}
