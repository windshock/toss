package o;

import androidx.annotation.Nullable;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BackdropScaffoldStateExternalSyntheticLambda2 extends CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 {
    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onExtraCallbackWithResult;

    public BackdropScaffoldStateExternalSyntheticLambda2(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        this.onExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
    }

    public int onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    public int onNavigationEvent(int i2, int i3, boolean z) {
        return this.onExtraCallbackWithResult.onNavigationEvent(i2, i3, z);
    }

    public int IAuthTabCallback(int i2, int i3, boolean z) {
        return this.onExtraCallbackWithResult.IAuthTabCallback(i2, i3, z);
    }

    public int onWarmupCompleted(boolean z) {
        return this.onExtraCallbackWithResult.onWarmupCompleted(z);
    }

    public int onNavigationEvent(boolean z) {
        return this.onExtraCallbackWithResult.onNavigationEvent(z);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
        return this.onExtraCallbackWithResult.onWarmupCompleted(i2, iAuthTabCallback, j);
    }

    public int onWarmupCompleted() {
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onExtraCallbackWithResult(Object obj, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
        return super.onExtraCallbackWithResult(obj, onextracallback);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
        return this.onExtraCallbackWithResult.IAuthTabCallback(i2, onextracallback, z);
    }

    public int IAuthTabCallback(Object obj) {
        return this.onExtraCallbackWithResult.IAuthTabCallback(obj);
    }

    public Object onNavigationEvent(int i2) {
        return this.onExtraCallbackWithResult.onNavigationEvent(i2);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
