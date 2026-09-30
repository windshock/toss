package im.toss.tds.compose.foundation.anim.rally;

import im.toss.tds.compose.foundation.anim.rally.RallyKeyframes;
import kotlin.jvm.internal.Intrinsics;
import o.constrain;
import o.getThumbTintList;
import o.getTrackTintList;
import o.jumpDrawablesToCurrentState;
import o.onEmojiCompatInitializedForSwitchText;
import o.onSubmitQuery;
import o.updateFocusedState;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RallyKeyframesSpec<T> implements updateFocusedState<T> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final RallyKeyframes.Entity<T> IAuthTabCallback;
    private final constrain<T> onExtraCallbackWithResult;

    public <V extends onSubmitQuery> getTrackTintList<V> onWarmupCompleted(@NotNull getThumbTintList<T, V> getthumbtintlist) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getthumbtintlist, "");
        onEmojiCompatInitializedForSwitchText onemojicompatinitializedforswitchtextOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(getthumbtintlist);
        int i4 = onNavigationEvent + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onemojicompatinitializedforswitchtextOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RallyKeyframesSpec(@NotNull constrain<T> constrainVar, @NotNull RallyKeyframes.Entity<T> entity) {
        Intrinsics.checkNotNullParameter(constrainVar, "");
        Intrinsics.checkNotNullParameter(entity, "");
        this.onExtraCallbackWithResult = constrainVar;
        this.IAuthTabCallback = entity;
    }

    public /* synthetic */ jumpDrawablesToCurrentState onNavigationEvent(getThumbTintList getthumbtintlist) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getthumbtintlist);
        }
        onWarmupCompleted(getthumbtintlist);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RallyKeyframes.Entity<T> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        RallyKeyframes.Entity<T> entity = this.IAuthTabCallback;
        int i5 = i2 + 47;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return entity;
        }
        throw null;
    }
}
