package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.home.core.ui.model.dst.element.ResultModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DefaultTinyAppPerfMonitorImpl extends RecyclerView.ItemDecoration {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Paint IAuthTabCallback = new Paint();

    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        IIpcChannelStubProxy iIpcChannelStubProxyFindViewHolderForAdapterPosition;
        int iIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || (iIpcChannelStubProxyFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(adapter.getItemCount() - 1)) == null) {
            return;
        }
        View view = ((RecyclerView.ViewHolder) iIpcChannelStubProxyFindViewHolderForAdapterPosition).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        if (view.getBottom() < recyclerView.getBottom()) {
            IIpcChannelStubProxy iIpcChannelStubProxy = iIpcChannelStubProxyFindViewHolderForAdapterPosition instanceof IIpcChannelStubProxy ? iIpcChannelStubProxyFindViewHolderForAdapterPosition : null;
            if (iIpcChannelStubProxy != null) {
                int i2 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = iIpcChannelStubProxy.onNavigationEvent();
                if (objOnNavigationEvent != null) {
                    if (!(!(objOnNavigationEvent instanceof EventCost))) {
                        int i4 = onWarmupCompleted + 87;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            Context context = recyclerView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            iIAuthTabCallback = ValueStore.IAuthTabCallback(context, ((EventCost) objOnNavigationEvent).IAuthTabCallbackStub(), 1, 2, (Object) null);
                        } else {
                            Context context2 = recyclerView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "");
                            iIAuthTabCallback = ValueStore.IAuthTabCallback(context2, ((EventCost) objOnNavigationEvent).IAuthTabCallbackStub(), 0, 2, (Object) null);
                        }
                    } else {
                        if (true ^ (objOnNavigationEvent instanceof ResultModel)) {
                            return;
                        }
                        Context context3 = recyclerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        iIAuthTabCallback = ValueStore.IAuthTabCallback(context3, ((ResultModel) objOnNavigationEvent).IAuthTabCallbackStub(), 0, 2, (Object) null);
                        int i5 = onExtraCallbackWithResult + 67;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    this.IAuthTabCallback.setColor(iIAuthTabCallback);
                    canvas.drawRect(new Rect(recyclerView.getLeft(), view.getBottom(), recyclerView.getRight(), recyclerView.getBottom()), this.IAuthTabCallback);
                }
            }
        }
    }
}
