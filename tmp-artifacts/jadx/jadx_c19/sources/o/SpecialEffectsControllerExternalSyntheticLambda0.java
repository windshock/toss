package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SpecialEffectsControllerExternalSyntheticLambda0 implements Serializable {
    private static final int onExtraCallback = FragmentStrictModeExternalSyntheticLambda0.values().length;
    private static final long serialVersionUID = 1;
    protected final FragmentTransitionImpl[] _coercionsByShape = new FragmentTransitionImpl[onExtraCallback];
    protected Boolean _acceptBlankAsEmpty = null;

    public FragmentTransitionImpl onNavigationEvent(FragmentStrictModeExternalSyntheticLambda0 fragmentStrictModeExternalSyntheticLambda0) {
        return this._coercionsByShape[fragmentStrictModeExternalSyntheticLambda0.ordinal()];
    }

    public Boolean onExtraCallback() {
        return this._acceptBlankAsEmpty;
    }
}
