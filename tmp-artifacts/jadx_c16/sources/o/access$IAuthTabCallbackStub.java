package o;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class access$IAuthTabCallbackStub extends DiffUtil.Callback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final List<Object> onExtraCallback;
    final /* synthetic */ access onNavigationEvent;
    private final List<Object> onWarmupCompleted;

    public access$IAuthTabCallbackStub(@NotNull access accessVar, @NotNull List<? extends Object> list, List<? extends Object> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.onNavigationEvent = accessVar;
        this.onExtraCallback = list;
        this.onWarmupCompleted = list2;
    }

    public int getOldListSize() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onExtraCallback.size();
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        throw null;
    }

    public int getNewListSize() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int size = this.onWarmupCompleted.size();
        int i3 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    public boolean areItemsTheSame(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.onExtraCallback.get(i), this.onWarmupCompleted.get(i2));
        int i6 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 34 / 0;
        }
        return zAreEqual;
    }

    public boolean areContentsTheSame(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.areEqual(this.onExtraCallback.get(i), this.onWarmupCompleted.get(i2));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.onExtraCallback.get(i), this.onWarmupCompleted.get(i2));
        int i5 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return zAreEqual;
    }
}
