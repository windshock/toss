package o;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setHasFixedSize extends setEdgeEffectFactory {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);

    @Deprecated
    private static final float[] onExtraCallback = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private FloatBuffer onExtraCallbackWithResult;

    public setHasFixedSize() {
        float[] fArr = onExtraCallback;
        FloatBuffer floatBufferOnNavigationEvent = swapAdapter.onNavigationEvent(fArr.length);
        floatBufferOnNavigationEvent.put(fArr);
        floatBufferOnNavigationEvent.clear();
        Unit unit = Unit.INSTANCE;
        this.onExtraCallbackWithResult = floatBufferOnNavigationEvent;
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    @Override // o.setChildImportantForAccessibilityInternal
    public FloatBuffer onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.setChildImportantForAccessibilityInternal
    public void onExtraCallbackWithResult() {
        scrollByInternal.IAuthTabCallback("glDrawArrays start");
        GLES20.glDrawArrays(setScrollingTouchSlop.readTypedObject(), 0, onTransact());
        scrollByInternal.IAuthTabCallback("glDrawArrays end");
    }
}
