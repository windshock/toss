package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SnapshotModel$onExtraCallback implements SnapshotModel {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final List<setPreRenderSnapshotHtml> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SnapshotModel$onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((SnapshotModel$onExtraCallback) obj).onNavigationEvent)) {
            return true;
        }
        int i4 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<setPreRenderSnapshotHtml> list = this.onNavigationEvent;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickCtaButton(remainingList=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public SnapshotModel$onExtraCallback(@NotNull List<setPreRenderSnapshotHtml> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<setPreRenderSnapshotHtml> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<setPreRenderSnapshotHtml> list = this.onNavigationEvent;
        int i4 = i2 + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
