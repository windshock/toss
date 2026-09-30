package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class startIntentSenderFromFragment extends RadioButtonKtRadioButtonElement23<supportPostponeEnterTransition, startIntentSenderFromFragment> implements Serializable {
    private static final int onExtraCallbackWithResult = RadioButtonKtRadioButtonElement27.onWarmupCompleted(supportPostponeEnterTransition.class);
    private static final long serialVersionUID = 2;
    protected final SpecialEffectsControllerExternalSyntheticLambda1 _coercionConfigs;
    protected final GlanceAppWidgetReceiver _ctorDetector;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final onActivityStarted _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final cancelLoadInBackground<RunCallbackActionCompanion> _problemHandlers;

    public startIntentSenderFromFragment(isViewFromObject isviewfromobject, SurfaceControlV33TransactionExternalSyntheticLambda2 surfaceControlV33TransactionExternalSyntheticLambda2, SurfaceControlCompatTransactionCommittedListener surfaceControlCompatTransactionCommittedListener, RootNameLookup rootNameLookup, RadioButtonKtRadioButton1 radioButtonKtRadioButton1, SpecialEffectsControllerExternalSyntheticLambda1 specialEffectsControllerExternalSyntheticLambda1, RadioButtonKtRadioButtonElementinlinedGlanceNode1 radioButtonKtRadioButtonElementinlinedGlanceNode1) {
        super(isviewfromobject, surfaceControlV33TransactionExternalSyntheticLambda2, surfaceControlCompatTransactionCommittedListener, rootNameLookup, radioButtonKtRadioButton1, radioButtonKtRadioButtonElementinlinedGlanceNode1);
        this._deserFeatures = onExtraCallbackWithResult;
        this._problemHandlers = null;
        this._nodeFactory = onActivityStarted.onNavigationEvent;
        this._ctorDetector = null;
        this._coercionConfigs = specialEffectsControllerExternalSyntheticLambda1;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    private startIntentSenderFromFragment(startIntentSenderFromFragment startintentsenderfromfragment, long j, int i2, int i3, int i4, int i5, int i6) {
        super(startintentsenderfromfragment, j);
        this._deserFeatures = i2;
        this._problemHandlers = startintentsenderfromfragment._problemHandlers;
        this._nodeFactory = startintentsenderfromfragment._nodeFactory;
        this._coercionConfigs = startintentsenderfromfragment._coercionConfigs;
        this._ctorDetector = startintentsenderfromfragment._ctorDetector;
        this._parserFeatures = i3;
        this._parserFeaturesToChange = i4;
        this._formatReadFeatures = i5;
        this._formatReadFeaturesToChange = i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.RadioButtonKtRadioButtonElement23
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public final startIntentSenderFromFragment onExtraCallbackWithResult(long j) {
        return new startIntentSenderFromFragment(this, j, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public getViewLifecycleOwner IAuthTabCallback(getViewLifecycleOwner getviewlifecycleowner) {
        int i2 = this._parserFeaturesToChange;
        if (i2 != 0) {
            getviewlifecycleowner.onExtraCallbackWithResult(this._parserFeatures, i2);
        }
        int i3 = this._formatReadFeaturesToChange;
        if (i3 != 0) {
            getviewlifecycleowner.IAuthTabCallback(this._formatReadFeatures, i3);
        }
        return getviewlifecycleowner;
    }

    public getViewLifecycleOwner onExtraCallbackWithResult(getViewLifecycleOwner getviewlifecycleowner, getRetainInstance getretaininstance) {
        int i2 = this._parserFeaturesToChange;
        if (i2 != 0) {
            getviewlifecycleowner.onExtraCallbackWithResult(this._parserFeatures, i2);
        }
        int i3 = this._formatReadFeaturesToChange;
        if (i3 != 0) {
            getviewlifecycleowner.IAuthTabCallback(this._formatReadFeatures, i3);
        }
        if (getretaininstance != null) {
            getviewlifecycleowner.onNavigationEvent(getretaininstance);
        }
        return getviewlifecycleowner;
    }

    public boolean onNavigationEvent() {
        if (this._rootName != null) {
            return !r0.onExtraCallback();
        }
        return onNavigationEvent(supportPostponeEnterTransition.UNWRAP_ROOT_VALUE);
    }

    public final boolean onNavigationEvent(supportPostponeEnterTransition supportpostponeentertransition) {
        return (supportpostponeentertransition.getMask() & this._deserFeatures) != 0;
    }

    public final int onExtraCallback() {
        return this._deserFeatures;
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final boolean onExtraCallbackWithResult(RadioButtonKtRadioButton3 radioButtonKtRadioButton3) {
        return this._datatypeFeatures.onWarmupCompleted(radioButtonKtRadioButton3);
    }

    public cancelLoadInBackground<RunCallbackActionCompanion> IAuthTabCallback() {
        return this._problemHandlers;
    }

    public final onActivityStarted onExtraCallbackWithResult() {
        return this._nodeFactory;
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public GlanceAppWidgetReceiver onWarmupCompleted() {
        GlanceAppWidgetReceiver glanceAppWidgetReceiver = this._ctorDetector;
        return glanceAppWidgetReceiver == null ? GlanceAppWidgetReceiver.onExtraCallback : glanceAppWidgetReceiver;
    }

    public onStateNotSaved onNavigationEvent(JavaType javaType) {
        return IAuthTabCallbackDefault().onWarmupCompleted(this, javaType, this);
    }

    public onStateNotSaved IAuthTabCallback(JavaType javaType) {
        return IAuthTabCallbackDefault().onExtraCallback(this, javaType, this);
    }

    public onStateNotSaved onExtraCallback(JavaType javaType, onStateNotSaved onstatenotsaved) {
        return IAuthTabCallbackDefault().IAuthTabCallback(this, javaType, this, onstatenotsaved);
    }

    public setColumnCount onExtraCallback(JavaType javaType) throws JsonMappingException {
        Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> collectionOnNavigationEvent;
        AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0ICustomTabsCallback = asBinder(javaType.asBinder()).ICustomTabsCallback();
        setPrinter<?> setprinterOnExtraCallbackWithResult = asBinder().onExtraCallbackWithResult(this, angleMeasurerExternalSyntheticLambda0ICustomTabsCallback, javaType);
        if (setprinterOnExtraCallbackWithResult == null) {
            setprinterOnExtraCallbackWithResult = onExtraCallbackWithResult(javaType);
            collectionOnNavigationEvent = null;
            if (setprinterOnExtraCallbackWithResult == null) {
                return null;
            }
        } else {
            collectionOnNavigationEvent = ICustomTabsCallbackStub().onNavigationEvent(this, angleMeasurerExternalSyntheticLambda0ICustomTabsCallback);
        }
        return setprinterOnExtraCallbackWithResult.onWarmupCompleted(this, javaType, collectionOnNavigationEvent);
    }

    public FragmentTransitionImpl onExtraCallback(LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8, Class<?> cls, FragmentStrictModeExternalSyntheticLambda0 fragmentStrictModeExternalSyntheticLambda0) {
        return this._coercionConfigs.onWarmupCompleted(this, lifecycleEffectKtExternalSyntheticLambda8, cls, fragmentStrictModeExternalSyntheticLambda0);
    }

    public FragmentTransitionImpl onWarmupCompleted(LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8, Class<?> cls, FragmentTransitionImpl fragmentTransitionImpl) {
        return this._coercionConfigs.onWarmupCompleted(this, lifecycleEffectKtExternalSyntheticLambda8, cls, fragmentTransitionImpl);
    }
}
