package o;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class repositionShadowingViews extends scrollTo {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);

    /* JADX WARN: Illegal instructions before constructor call */
    public repositionShadowingViews() {
        EGLContext eGLContext = null;
        this(eGLContext, 0, 3, eGLContext);
    }

    public repositionShadowingViews(@Nullable EGLContext eGLContext) {
        this(eGLContext, 0, 2, null);
    }

    public /* synthetic */ repositionShadowingViews(EGLContext eGLContext, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? EGL14.EGL_NO_CONTEXT : eGLContext, (i3 & 2) != 0 ? 0 : i2);
    }

    public repositionShadowingViews(@Nullable EGLContext eGLContext, int i2) {
        super(new setOnScrollListener(eGLContext), i2);
    }

    @Override // o.scrollTo
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback() {
        super.onExtraCallback();
    }

    protected final void finalize() {
        onExtraCallback();
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
