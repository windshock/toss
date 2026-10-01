package im.toss.features.leave.ui.pendingtask;

import im.toss.features.leave.domain.entity.PendingTaskButton;
import im.toss.features.leave.domain.entity.PendingTaskButton$;
import im.toss.features.leave.ui.pendingtask.PendingTasksUiModel$PendingTaskUiModel$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PendingTasksUiModel$PendingTaskUiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final PendingTaskButton button;
    private final String description;
    private final String iconUrl;
    private final String title;
    private final String type;

    static {
        Object obj = null;
        int i = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 13;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof PendingTasksUiModel$PendingTaskUiModel)) {
            return false;
        }
        PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel = (PendingTasksUiModel$PendingTaskUiModel) obj;
        if (!Intrinsics.areEqual(this.type, pendingTasksUiModel$PendingTaskUiModel.type) || !Intrinsics.areEqual(this.title, pendingTasksUiModel$PendingTaskUiModel.title) || !Intrinsics.areEqual(this.description, pendingTasksUiModel$PendingTaskUiModel.description)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.iconUrl, pendingTasksUiModel$PendingTaskUiModel.iconUrl))) {
            return Intrinsics.areEqual(this.button, pendingTasksUiModel$PendingTaskUiModel.button);
        }
        int i6 = onExtraCallback + 11;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.type.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.description;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.iconUrl;
        if (str2 != null) {
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = str2.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + this.button.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PendingTaskUiModel(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", button=" + this.button + ")";
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ PendingTasksUiModel$PendingTaskUiModel(int i, String str, String str2, String str3, String str4, PendingTaskButton pendingTaskButton, okycx okycxVar) {
        if (19 != (i & 19)) {
            htf31.onExtraCallbackWithResult(i, 19, PendingTasksUiModel$PendingTaskUiModel$.serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.title = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str4;
        }
        this.button = pendingTaskButton;
        int i5 = onExtraCallback + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public PendingTasksUiModel$PendingTaskUiModel(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull PendingTaskButton pendingTaskButton) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(pendingTaskButton, "");
        this.type = str;
        this.title = str2;
        this.description = str3;
        this.iconUrl = str4;
        this.button = pendingTaskButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(PendingTasksUiModel$PendingTaskUiModel pendingTasksUiModel$PendingTaskUiModel, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, pendingTasksUiModel$PendingTaskUiModel.type);
        vylVar.onExtraCallback(serialDescriptor, 1, pendingTasksUiModel$PendingTaskUiModel.title);
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 2))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, pendingTasksUiModel$PendingTaskUiModel.description);
            int i4 = onNavigationEvent + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = onNavigationEvent + 75;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 69 / 0;
                if (pendingTasksUiModel$PendingTaskUiModel.description != null) {
                }
            } else if (pendingTasksUiModel$PendingTaskUiModel.description != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || pendingTasksUiModel$PendingTaskUiModel.iconUrl != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, pendingTasksUiModel$PendingTaskUiModel.iconUrl);
        }
        vylVar.onNavigationEvent(serialDescriptor, 4, PendingTaskButton$.serializer.INSTANCE, pendingTasksUiModel$PendingTaskUiModel.button);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 43;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i2 + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i2 + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return str;
    }

    public final PendingTaskButton onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        PendingTaskButton pendingTaskButton = this.button;
        int i5 = i2 + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return pendingTaskButton;
        }
        throw null;
    }
}
