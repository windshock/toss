package o;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class AppMsgReceiver2<T> extends RecyclerView.ViewHolder {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int ICustomTabsCallback = 8;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 0;
    private static int onMessageChannelReady = 1;
    private static int onMinimized = 1;
    private final SparseArray<View> extraCallback;
    private WeakReference<T> writeTypedObject;

    static {
        int i = onActivityResized + 45;
        onMinimized = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AppMsgReceiver2(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.extraCallback = new SparseArray<>();
    }

    public final SparseArray<View> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 69;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SparseArray<View> sparseArray = this.extraCallback;
        int i4 = i2 + 121;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return sparseArray;
    }

    public final void onExtraCallbackWithResult(@Nullable T t) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 31;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        if (t != null) {
            this.writeTypedObject = new WeakReference<>(t);
            return;
        }
        Object obj = null;
        this.writeTypedObject = null;
        int i5 = i3 + 97;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final <I> AppMsgReceiver2<I> onExtraCallbackWithResult(@NotNull ViewGroup viewGroup, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(viewGroup, "");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
            Intrinsics.checkNotNull(viewInflate);
            AppMsgReceiver2<I> appMsgReceiver2 = new AppMsgReceiver2<>(viewInflate);
            int i3 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return appMsgReceiver2;
        }

        public final <I> AppMsgReceiver2<I> onExtraCallback(@NotNull View view) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            AppMsgReceiver2<I> appMsgReceiver2 = new AppMsgReceiver2<>(view);
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return appMsgReceiver2;
        }
    }
}
