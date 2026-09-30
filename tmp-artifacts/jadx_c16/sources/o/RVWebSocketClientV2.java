package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.postTimeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVWebSocketClientV2 extends RecyclerView.ItemDecoration {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createTimer IAuthTabCallback;
    private final Drawable onNavigationEvent;

    public RVWebSocketClientV2(@NotNull createTimer createtimer, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(createtimer, "");
        this.IAuthTabCallback = createtimer;
        this.onNavigationEvent = drawable;
    }

    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int childAdapterPosition;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (state.onWarmupCompleted() != 0) {
            Object obj = null;
            Pair pair = new Pair((Object) null, (Object) null);
            Integer numValueOf = (Integer) pair.onExtraCallbackWithResult();
            Integer numValueOf2 = (Integer) pair.IAuthTabCallback();
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) != -1) {
                    List listOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(listOnExtraCallbackWithResult, "");
                    Object orNull = CollectionsKt.getOrNull(listOnExtraCallbackWithResult, childAdapterPosition);
                    if (!(!(orNull instanceof postTimeout.onWarmupCompleted))) {
                        numValueOf = Integer.valueOf(childAt.getTop());
                    } else if (orNull instanceof postTimeout.onNavigationEvent) {
                        int i3 = onExtraCallback + 23;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 == 0) {
                            Integer.valueOf(childAt.getBottom());
                            obj.hashCode();
                            throw null;
                        }
                        numValueOf2 = Integer.valueOf(childAt.getBottom());
                    } else {
                        continue;
                    }
                }
            }
            Drawable drawable = this.onNavigationEvent;
            if (drawable != null) {
                int i4 = onExtraCallback + 93;
                int i5 = i4 % 128;
                onExtraCallbackWithResult = i5;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (numValueOf != null) {
                    int i6 = i5 + 65;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 16 / 0;
                        if (numValueOf2 == null) {
                            return;
                        }
                    } else if (numValueOf2 == null) {
                        return;
                    }
                    int paddingLeft = recyclerView.getPaddingLeft();
                    Context context = recyclerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    int iIAuthTabCallback = varyMatches.IAuthTabCallback(16, context);
                    int iIntValue = numValueOf.intValue();
                    int width = recyclerView.getWidth();
                    int paddingRight = recyclerView.getPaddingRight();
                    Context context2 = recyclerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    drawable.setBounds(paddingLeft + iIAuthTabCallback, iIntValue, (width - paddingRight) - varyMatches.IAuthTabCallback(16, context2), numValueOf2.intValue());
                    this.onNavigationEvent.draw(canvas);
                }
            }
        }
    }
}
