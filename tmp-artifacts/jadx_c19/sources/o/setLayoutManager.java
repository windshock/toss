package o;

import android.opengl.EGLConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setLayoutManager {
    private final EGLConfig onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setLayoutManager) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((setLayoutManager) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "EglConfig(native=" + this.onExtraCallbackWithResult + ')';
    }

    public setLayoutManager(@NotNull EGLConfig eGLConfig) {
        Intrinsics.checkNotNullParameter(eGLConfig, "");
        this.onExtraCallbackWithResult = eGLConfig;
    }

    public final EGLConfig onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }
}
