package o;

import im.toss.features.leave.ui.pendingtask.PendingTasksUiModel$PendingTaskUiModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class putNavigationBarParams$onWarmupCompleted extends putNavigationBarParams {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final List<PendingTasksUiModel$PendingTaskUiModel> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof putNavigationBarParams$onWarmupCompleted)) {
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((putNavigationBarParams$onWarmupCompleted) obj).onExtraCallbackWithResult)) {
            return true;
        }
        int i5 = onExtraCallback + 97;
        IAuthTabCallback = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<PendingTasksUiModel$PendingTaskUiModel> list = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Success(model=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public putNavigationBarParams$onWarmupCompleted(@NotNull List<PendingTasksUiModel$PendingTaskUiModel> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
    }

    public final List<PendingTasksUiModel$PendingTaskUiModel> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
