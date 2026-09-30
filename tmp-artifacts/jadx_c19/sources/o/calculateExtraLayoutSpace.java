package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class calculateExtraLayoutSpace implements updateLayoutState {
    private final SharedPreferences onExtraCallbackWithResult;
    private final SharedPreferences.Editor onWarmupCompleted;

    public calculateExtraLayoutSpace(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.onExtraCallbackWithResult = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        this.onWarmupCompleted = editorEdit;
    }

    @Override // o.updateLayoutState
    public updateLayoutState IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted.remove(str);
        return this;
    }

    @Override // o.updateLayoutState
    public String onExtraCallback(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.onExtraCallbackWithResult.getString(str, str2);
    }

    @Override // o.updateLayoutState
    public updateLayoutState onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted.putString(str, str2);
        return this;
    }

    @Override // o.updateLayoutState
    public updateLayoutState onWarmupCompleted() {
        this.onWarmupCompleted.commit();
        return this;
    }
}
