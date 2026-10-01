package o;

import android.opengl.EGLSurface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setItemViewCacheSize {
    private final EGLSurface onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setItemViewCacheSize) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((setItemViewCacheSize) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        EGLSurface eGLSurface = this.onExtraCallbackWithResult;
        if (eGLSurface == null) {
            return 0;
        }
        return eGLSurface.hashCode();
    }

    public String toString() {
        return "EglSurface(native=" + this.onExtraCallbackWithResult + ')';
    }

    public setItemViewCacheSize(@Nullable EGLSurface eGLSurface) {
        this.onExtraCallbackWithResult = eGLSurface;
    }

    public final EGLSurface onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }
}
