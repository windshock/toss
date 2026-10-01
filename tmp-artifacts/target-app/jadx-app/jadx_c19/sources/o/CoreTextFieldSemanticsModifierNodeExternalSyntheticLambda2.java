package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2 extends Exception {
    public final long presentationTimeUs;

    public static CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2 onExtraCallback(Exception exc) {
        return onWarmupCompleted(exc, -9223372036854775807L);
    }

    public static CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2 onWarmupCompleted(Exception exc, long j) {
        if (exc instanceof CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2) {
            return (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2) exc;
        }
        return new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2(exc, j);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda2(Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }
}
