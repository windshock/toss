package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class getInterceptorsokhttp<T, VH extends RecyclerView.ViewHolder> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Function2<VH, T, Unit> IAuthTabCallback;
    private final Class<T> onNavigationEvent;
    private final Function1<ViewGroup, VH> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public getInterceptorsokhttp(@NotNull Class<T> cls, @NotNull Function1<? super ViewGroup, ? extends VH> function1, @NotNull Function2<? super VH, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onNavigationEvent = cls;
        this.onWarmupCompleted = function1;
        this.IAuthTabCallback = function2;
    }

    public final Class<T> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Class<T> cls = this.onNavigationEvent;
        int i5 = i2 + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return cls;
    }

    public final VH onExtraCallbackWithResult(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        VH vh = (VH) this.onWarmupCompleted.invoke(viewGroup);
        int i4 = onExtraCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return vh;
    }

    public final void onWarmupCompleted(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(obj, "");
            this.IAuthTabCallback.invoke(viewHolder, obj);
        } else {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(obj, "");
            this.IAuthTabCallback.invoke(viewHolder, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }
}
