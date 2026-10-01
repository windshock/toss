package o;

import android.opengl.EGLContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setOnScrollListener {
    private final EGLContext IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setOnScrollListener) && Intrinsics.areEqual(this.IAuthTabCallback, ((setOnScrollListener) obj).IAuthTabCallback);
    }

    public int hashCode() {
        EGLContext eGLContext = this.IAuthTabCallback;
        if (eGLContext == null) {
            return 0;
        }
        return eGLContext.hashCode();
    }

    public String toString() {
        return "EglContext(native=" + this.IAuthTabCallback + ')';
    }

    public setOnScrollListener(@Nullable EGLContext eGLContext) {
        this.IAuthTabCallback = eGLContext;
    }

    public final EGLContext IAuthTabCallback() {
        return this.IAuthTabCallback;
    }
}
