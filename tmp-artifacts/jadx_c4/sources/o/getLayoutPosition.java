package o;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface getLayoutPosition {
    <T extends addChangePayload> void onNavigationEvent(@NotNull T t);

    <T extends addChangePayload> void onNavigationEvent(@NotNull T t, int i, int i2);

    <T extends addChangePayload> void onWarmupCompleted(@NotNull T t, @NotNull MotionEvent motionEvent);
}
