package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import o.FragmentStrictModeExternalSyntheticLambda1;
import o.RadioButtonKtRadioButtonElement23;
import o.callStartTransitionListener;
import o.nTransactionSetOnCommit;
import o.restoreViewState;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RadioButtonKtRadioButtonElement23<CFG extends FragmentStrictModeExternalSyntheticLambda1, T extends RadioButtonKtRadioButtonElement23<CFG, T>> extends RadioButtonKtRadioButtonElement27<T> implements Serializable {
    private static final long onWarmupCompleted;
    protected final RetainInstanceUsageViolation _attributes;
    protected final RadioButtonKtRadioButton1 _configOverrides;
    public final RadioButtonKtRadioButtonElementinlinedGlanceNode1 _datatypeFeatures;
    protected final SurfaceControlCompatTransactionCommittedListener _mixIns;
    public final FragmentKtExternalSyntheticLambda0 _rootName;
    protected final RootNameLookup _rootNames;
    protected final SurfaceControlV33TransactionExternalSyntheticLambda2 _subtypeResolver;
    protected final Class<?> _view;
    protected static final RadioButtonKtRadioButton2 onNavigationEvent = RadioButtonKtRadioButton2.onNavigationEvent();
    private static final long onExtraCallbackWithResult = setLayoutTransition.collectLongDefaults();

    protected abstract T onExtraCallbackWithResult(long j);

    static {
        long longMask = setLayoutTransition.AUTO_DETECT_FIELDS.getLongMask();
        long longMask2 = setLayoutTransition.AUTO_DETECT_GETTERS.getLongMask();
        onWarmupCompleted = longMask | longMask2 | setLayoutTransition.AUTO_DETECT_IS_GETTERS.getLongMask() | setLayoutTransition.AUTO_DETECT_SETTERS.getLongMask() | setLayoutTransition.AUTO_DETECT_CREATORS.getLongMask();
    }

    public RadioButtonKtRadioButtonElement23(isViewFromObject isviewfromobject, SurfaceControlV33TransactionExternalSyntheticLambda2 surfaceControlV33TransactionExternalSyntheticLambda2, SurfaceControlCompatTransactionCommittedListener surfaceControlCompatTransactionCommittedListener, RootNameLookup rootNameLookup, RadioButtonKtRadioButton1 radioButtonKtRadioButton1, RadioButtonKtRadioButtonElementinlinedGlanceNode1 radioButtonKtRadioButtonElementinlinedGlanceNode1) {
        super(isviewfromobject, onExtraCallbackWithResult);
        this._mixIns = surfaceControlCompatTransactionCommittedListener;
        this._subtypeResolver = surfaceControlV33TransactionExternalSyntheticLambda2;
        this._rootNames = rootNameLookup;
        this._rootName = null;
        this._view = null;
        this._attributes = RetainInstanceUsageViolation.onWarmupCompleted();
        this._configOverrides = radioButtonKtRadioButton1;
        this._datatypeFeatures = radioButtonKtRadioButtonElementinlinedGlanceNode1;
    }

    public RadioButtonKtRadioButtonElement23(RadioButtonKtRadioButtonElement23<CFG, T> radioButtonKtRadioButtonElement23, long j) {
        super(radioButtonKtRadioButtonElement23, j);
        this._mixIns = radioButtonKtRadioButtonElement23._mixIns;
        this._subtypeResolver = radioButtonKtRadioButtonElement23._subtypeResolver;
        this._rootNames = radioButtonKtRadioButtonElement23._rootNames;
        this._rootName = radioButtonKtRadioButtonElement23._rootName;
        this._view = radioButtonKtRadioButtonElement23._view;
        this._attributes = radioButtonKtRadioButtonElement23._attributes;
        this._configOverrides = radioButtonKtRadioButtonElement23._configOverrides;
        this._datatypeFeatures = radioButtonKtRadioButtonElement23._datatypeFeatures;
    }

    public final T onExtraCallbackWithResult(setLayoutTransition... setlayouttransitionArr) {
        long longMask = this._mapperFeatures;
        for (setLayoutTransition setlayouttransition : setlayouttransitionArr) {
            longMask |= setlayouttransition.getLongMask();
        }
        return longMask == this._mapperFeatures ? this : (T) onExtraCallbackWithResult(longMask);
    }

    public final T onNavigationEvent(setLayoutTransition... setlayouttransitionArr) {
        long j = this._mapperFeatures;
        for (setLayoutTransition setlayouttransition : setlayouttransitionArr) {
            j &= ~setlayouttransition.getLongMask();
        }
        return j == this._mapperFeatures ? this : (T) onExtraCallbackWithResult(j);
    }

    public final RadioButtonKtRadioButtonElementinlinedGlanceNode1 onActivityResized() {
        return this._datatypeFeatures;
    }

    public final SurfaceControlV33TransactionExternalSyntheticLambda2 ICustomTabsCallbackStub() {
        return this._subtypeResolver;
    }

    public final FragmentKtExternalSyntheticLambda0 ICustomTabsCallbackStubProxy() {
        return this._rootName;
    }

    public final Class<?> onMinimized() {
        return this._view;
    }

    public final RetainInstanceUsageViolation onPostMessage() {
        return this._attributes;
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final RadioButtonKtRadioButton2 onExtraCallbackWithResult(Class<?> cls) {
        RadioButtonKtRadioButton2 radioButtonKtRadioButton2OnExtraCallbackWithResult = this._configOverrides.onExtraCallbackWithResult(cls);
        return radioButtonKtRadioButton2OnExtraCallbackWithResult == null ? onNavigationEvent : radioButtonKtRadioButton2OnExtraCallbackWithResult;
    }

    public final dump$onWarmupCompleted onMessageChannelReady() {
        return this._configOverrides.IAuthTabCallback();
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final dump$onWarmupCompleted onExtraCallback(Class<?> cls) {
        dump$onWarmupCompleted dump_onwarmupcompletedOnWarmupCompleted = onExtraCallbackWithResult(cls).onWarmupCompleted();
        dump$onWarmupCompleted dump_onwarmupcompletedOnMessageChannelReady = onMessageChannelReady();
        return dump_onwarmupcompletedOnMessageChannelReady == null ? dump_onwarmupcompletedOnWarmupCompleted : dump_onwarmupcompletedOnMessageChannelReady.onExtraCallback(dump_onwarmupcompletedOnWarmupCompleted);
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final dump$onWarmupCompleted onWarmupCompleted(Class<?> cls, Class<?> cls2) {
        dump$onWarmupCompleted dump_onwarmupcompletedIAuthTabCallback = onExtraCallbackWithResult(cls2).IAuthTabCallback();
        dump$onWarmupCompleted dump_onwarmupcompletedOnExtraCallback = onExtraCallback(cls);
        return dump_onwarmupcompletedOnExtraCallback == null ? dump_onwarmupcompletedIAuthTabCallback : dump_onwarmupcompletedOnExtraCallback.onExtraCallback(dump_onwarmupcompletedIAuthTabCallback);
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final registerOnPreAttachListener$onExtraCallback onNavigationEvent(Class<?> cls) {
        return this._configOverrides.onWarmupCompleted(cls);
    }

    public final restoreViewState.onExtraCallbackWithResult asInterface(Class<?> cls) {
        restoreViewState.onExtraCallbackWithResult onExtraCallbackWithResult2;
        RadioButtonKtRadioButton2 radioButtonKtRadioButton2OnExtraCallbackWithResult = this._configOverrides.onExtraCallbackWithResult(cls);
        if (radioButtonKtRadioButton2OnExtraCallbackWithResult == null || (onExtraCallbackWithResult2 = radioButtonKtRadioButton2OnExtraCallbackWithResult.onExtraCallbackWithResult()) == null) {
            return null;
        }
        return onExtraCallbackWithResult2;
    }

    public final restoreViewState.onExtraCallbackWithResult onExtraCallbackWithResult(Class<?> cls, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        startActivityFromFragment startactivityfromfragmentAsBinder = asBinder();
        return restoreViewState.onExtraCallbackWithResult.onNavigationEvent(startactivityfromfragmentAsBinder == null ? null : startactivityfromfragmentAsBinder.onNavigationEvent((RadioButtonKtRadioButtonElement27<?>) this, (internalPathIteratorPeek) angleMeasurerExternalSyntheticLambda0), asInterface(cls));
    }

    public final callStartTransitionListener.onNavigationEvent onNavigationEvent(Class<?> cls, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        startActivityFromFragment startactivityfromfragmentAsBinder = asBinder();
        if (startactivityfromfragmentAsBinder == null) {
            return null;
        }
        return startactivityfromfragmentAsBinder.onExtraCallback(this, angleMeasurerExternalSyntheticLambda0);
    }

    public final nTransactionSetOnCommit<?> onRelationshipValidationResult() {
        nTransactionSetOnCommit<?> ntransactionsetoncommitOnNavigationEvent = this._configOverrides.onNavigationEvent();
        long j = this._mapperFeatures;
        long j2 = onWarmupCompleted;
        if ((j & j2) == j2) {
            return ntransactionsetoncommitOnNavigationEvent;
        }
        if (!onExtraCallback(setLayoutTransition.AUTO_DETECT_FIELDS)) {
            ntransactionsetoncommitOnNavigationEvent = ntransactionsetoncommitOnNavigationEvent.onExtraCallback(getMinimumMaxLifecycleState$onExtraCallbackWithResult.NONE);
        }
        if (!onExtraCallback(setLayoutTransition.AUTO_DETECT_GETTERS)) {
            ntransactionsetoncommitOnNavigationEvent = ntransactionsetoncommitOnNavigationEvent.onExtraCallbackWithResult(getMinimumMaxLifecycleState$onExtraCallbackWithResult.NONE);
        }
        if (!onExtraCallback(setLayoutTransition.AUTO_DETECT_IS_GETTERS)) {
            ntransactionsetoncommitOnNavigationEvent = ntransactionsetoncommitOnNavigationEvent.IAuthTabCallback(getMinimumMaxLifecycleState$onExtraCallbackWithResult.NONE);
        }
        if (!onExtraCallback(setLayoutTransition.AUTO_DETECT_SETTERS)) {
            ntransactionsetoncommitOnNavigationEvent = ntransactionsetoncommitOnNavigationEvent.onNavigationEvent(getMinimumMaxLifecycleState$onExtraCallbackWithResult.NONE);
        }
        return !onExtraCallback(setLayoutTransition.AUTO_DETECT_CREATORS) ? ntransactionsetoncommitOnNavigationEvent.onWarmupCompleted(getMinimumMaxLifecycleState$onExtraCallbackWithResult.NONE) : ntransactionsetoncommitOnNavigationEvent;
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final nTransactionSetOnCommit<?> onWarmupCompleted(Class<?> cls, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        nTransactionSetOnCommit<?> ntransactionsetoncommitOnRelationshipValidationResult;
        if (SavedStateHandleImplExternalSyntheticLambda0.ICustomTabsCallback(cls)) {
            ntransactionsetoncommitOnRelationshipValidationResult = nTransactionSetOnCommit.onWarmupCompleted.onWarmupCompleted();
        } else {
            ntransactionsetoncommitOnRelationshipValidationResult = onRelationshipValidationResult();
            if (SavedStateHandleImplExternalSyntheticLambda0.onMinimized(cls) && onExtraCallback(setLayoutTransition.AUTO_DETECT_CREATORS)) {
                ntransactionsetoncommitOnRelationshipValidationResult = ntransactionsetoncommitOnRelationshipValidationResult.onWarmupCompleted(getMinimumMaxLifecycleState$onExtraCallbackWithResult.DEFAULT);
            }
        }
        startActivityFromFragment startactivityfromfragmentAsBinder = asBinder();
        if (startactivityfromfragmentAsBinder != null) {
            ntransactionsetoncommitOnRelationshipValidationResult = startactivityfromfragmentAsBinder.IAuthTabCallback(angleMeasurerExternalSyntheticLambda0, ntransactionsetoncommitOnRelationshipValidationResult);
        }
        RadioButtonKtRadioButton2 radioButtonKtRadioButton2OnExtraCallbackWithResult = this._configOverrides.onExtraCallbackWithResult(cls);
        return radioButtonKtRadioButton2OnExtraCallbackWithResult != null ? ntransactionsetoncommitOnRelationshipValidationResult.onExtraCallback(radioButtonKtRadioButton2OnExtraCallbackWithResult.asBinder()) : ntransactionsetoncommitOnRelationshipValidationResult;
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final getEnterTransitionCallback$onExtraCallbackWithResult IAuthTabCallback_Parcel() {
        return this._configOverrides.onWarmupCompleted();
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public Boolean IAuthTabCallbackStubProxy() {
        return this._configOverrides.onExtraCallback();
    }

    public Boolean IAuthTabCallbackStub(Class<?> cls) {
        Boolean boolOnTransact;
        RadioButtonKtRadioButton2 radioButtonKtRadioButton2OnExtraCallbackWithResult = this._configOverrides.onExtraCallbackWithResult(cls);
        return (radioButtonKtRadioButton2OnExtraCallbackWithResult == null || (boolOnTransact = radioButtonKtRadioButton2OnExtraCallbackWithResult.onTransact()) == null) ? this._configOverrides.onExtraCallback() : boolOnTransact;
    }

    public FragmentKtExternalSyntheticLambda0 IAuthTabCallbackStub(JavaType javaType) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0 = this._rootName;
        return fragmentKtExternalSyntheticLambda0 != null ? fragmentKtExternalSyntheticLambda0 : this._rootNames.onWarmupCompleted(javaType, this);
    }

    public FragmentKtExternalSyntheticLambda0 IAuthTabCallbackDefault(Class<?> cls) {
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0 = this._rootName;
        return fragmentKtExternalSyntheticLambda0 != null ? fragmentKtExternalSyntheticLambda0 : this._rootNames.onWarmupCompleted(cls, this);
    }

    @Override // o.nSetCrop.onWarmupCompleted
    public final Class<?> onTransact(Class<?> cls) {
        return this._mixIns.onTransact(cls);
    }
}
