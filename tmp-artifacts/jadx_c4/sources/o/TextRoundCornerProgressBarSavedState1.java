package o;

import android.content.SharedPreferences;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface TextRoundCornerProgressBarSavedState1 extends zzw {
    @Deprecated
    <T> void IAuthTabCallback(@NotNull String str, @NotNull T t);

    @Deprecated
    SharedPreferences onExtraCallback();

    @Deprecated
    <T> T onExtraCallback(@NotNull String str, @NotNull T t);

    @Deprecated
    <T> T onNavigationEvent(@NotNull String str, @NotNull Class<T> cls, @Nullable T t);

    @Deprecated
    <T> T onWarmupCompleted(@NotNull String str, @NotNull drawPadding<T> drawpadding, @Nullable T t);

    @Deprecated
    <T> getByteBuffer<getSecondaryProgressColor<T>> onWarmupCompleted(@NotNull String str, @NotNull Class<T> cls, boolean z);

    @Deprecated
    <T> void onWarmupCompleted(@NotNull String str, @NotNull T t, boolean z);

    static /* synthetic */ getByteBuffer onNavigationEvent(TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, String str, Class cls, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observe");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return textRoundCornerProgressBarSavedState1.onWarmupCompleted(str, cls, z);
    }

    static /* synthetic */ Object onWarmupCompleted(TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, String str, Class cls, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return textRoundCornerProgressBarSavedState1.onNavigationEvent(str, cls, obj);
    }
}
