package viva.republica.toss.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SnappingLinearLayoutManager extends LinearLayoutManager {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = onWarmupCompleted + 73;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnappingLinearLayoutManager(@NotNull Context context, int i, boolean z) {
        super(context, i, z);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @Nullable RecyclerView.State state, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(recyclerView, BuildConfig.FLAVOR);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        onNavigationEvent onnavigationevent = new onNavigationEvent(this, context);
        onnavigationevent.setTargetPosition(i);
        startSmoothScroll(onnavigationevent);
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    final class onNavigationEvent extends LinearSmoothScroller {
        private static int IAuthTabCallbackDefault = 1;
        private static int IAuthTabCallbackStub;
        final /* synthetic */ SnappingLinearLayoutManager asBinder;

        public int getVerticalSnapPreference() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 59;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 115;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
            }
            return -1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull SnappingLinearLayoutManager snappingLinearLayoutManager, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
            this.asBinder = snappingLinearLayoutManager;
        }

        public PointF computeScrollVectorForPosition(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 23;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            PointF pointFComputeScrollVectorForPosition = this.asBinder.computeScrollVectorForPosition(i);
            int i5 = IAuthTabCallbackStub + 45;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 85 / 0;
            }
            return pointFComputeScrollVectorForPosition;
        }

        public float calculateSpeedPerPixel(@Nullable DisplayMetrics displayMetrics) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 89;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            float fCalculateSpeedPerPixel = super.calculateSpeedPerPixel(displayMetrics) * 5.0f;
            int i4 = IAuthTabCallbackStub + 95;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return fCalculateSpeedPerPixel;
            }
            throw null;
        }
    }
}
