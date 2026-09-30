package o;

import android.opengl.GLES20;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class markKnownViewsInvalid {
    private static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback(markKnownViewsInvalid.class.getSimpleName());
    private getEdgeEffectFactory IAuthTabCallback;
    private float[] IAuthTabCallbackStub;
    private final stopNestedScroll onExtraCallback;
    private int onNavigationEvent;
    private getEdgeEffectFactory onWarmupCompleted;

    public markKnownViewsInvalid() {
        this(new stopNestedScroll(33984, 36197));
    }

    public markKnownViewsInvalid(int i2) {
        this(new stopNestedScroll(33984, 36197, Integer.valueOf(i2)));
    }

    public markKnownViewsInvalid(@NonNull stopNestedScroll stopnestedscroll) {
        this.IAuthTabCallbackStub = (float[]) scrollByInternal.onExtraCallbackWithResult.clone();
        this.onWarmupCompleted = new getMaxFlingVelocity();
        this.IAuthTabCallback = null;
        this.onNavigationEvent = -1;
        this.onExtraCallback = stopnestedscroll;
    }

    public void IAuthTabCallback(@NonNull getEdgeEffectFactory getedgeeffectfactory) {
        this.IAuthTabCallback = getedgeeffectfactory;
    }

    public stopNestedScroll onExtraCallback() {
        return this.onExtraCallback;
    }

    public float[] onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public void onWarmupCompleted(long j) {
        if (this.IAuthTabCallback != null) {
            onNavigationEvent();
            this.onWarmupCompleted = this.IAuthTabCallback;
            this.IAuthTabCallback = null;
        }
        if (this.onNavigationEvent == -1) {
            int iIAuthTabCallback = setPreserveFocusAfterLayout.IAuthTabCallback(this.onWarmupCompleted.onNavigationEvent(), this.onWarmupCompleted.IAuthTabCallbackStub());
            this.onNavigationEvent = iIAuthTabCallback;
            this.onWarmupCompleted.onExtraCallbackWithResult(iIAuthTabCallback);
            scrollByInternal.IAuthTabCallback("program creation");
        }
        GLES20.glUseProgram(this.onNavigationEvent);
        scrollByInternal.IAuthTabCallback("glUseProgram(handle)");
        this.onExtraCallback.onExtraCallback();
        this.onWarmupCompleted.onNavigationEvent(j, this.IAuthTabCallbackStub);
        this.onExtraCallback.onWarmupCompleted();
        GLES20.glUseProgram(0);
        scrollByInternal.IAuthTabCallback("glUseProgram(0)");
    }

    public void onNavigationEvent() {
        if (this.onNavigationEvent == -1) {
            return;
        }
        this.onWarmupCompleted.asInterface();
        GLES20.glDeleteProgram(this.onNavigationEvent);
        this.onNavigationEvent = -1;
    }
}
