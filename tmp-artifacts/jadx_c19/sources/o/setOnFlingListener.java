package o;

import android.opengl.EGLDisplay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setOnFlingListener {
    private final EGLDisplay onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setOnFlingListener) && Intrinsics.areEqual(this.onWarmupCompleted, ((setOnFlingListener) obj).onWarmupCompleted);
    }

    public int hashCode() {
        EGLDisplay eGLDisplay = this.onWarmupCompleted;
        if (eGLDisplay == null) {
            return 0;
        }
        return eGLDisplay.hashCode();
    }

    public String toString() {
        return "EglDisplay(native=" + this.onWarmupCompleted + ')';
    }

    public setOnFlingListener(@Nullable EGLDisplay eGLDisplay) {
        this.onWarmupCompleted = eGLDisplay;
    }

    public final EGLDisplay onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }
}
