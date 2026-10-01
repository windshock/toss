package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import o.getView;
import o.nSetCrop;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findFragmentByTag extends RadioButtonKtRadioButtonElement23<FragmentManagerExternalSyntheticLambda2, findFragmentByTag> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final GlanceAppWidgetReceiver _ctorDetector;
    protected final initState _defaultPrettyPrinter;
    protected final LifecycleKteventFlow1ExternalSyntheticLambda1 _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;
    protected static final initState onWarmupCompleted = new setUserVisibleHint();
    private static final int onExtraCallbackWithResult = RadioButtonKtRadioButtonElement27.onWarmupCompleted(FragmentManagerExternalSyntheticLambda2.class);

    public findFragmentByTag(isViewFromObject isviewfromobject, SurfaceControlV33TransactionExternalSyntheticLambda2 surfaceControlV33TransactionExternalSyntheticLambda2, SurfaceControlCompatTransactionCommittedListener surfaceControlCompatTransactionCommittedListener, RootNameLookup rootNameLookup, RadioButtonKtRadioButton1 radioButtonKtRadioButton1, RadioButtonKtRadioButtonElementinlinedGlanceNode1 radioButtonKtRadioButtonElementinlinedGlanceNode1) {
        super(isviewfromobject, surfaceControlV33TransactionExternalSyntheticLambda2, surfaceControlCompatTransactionCommittedListener, rootNameLookup, radioButtonKtRadioButton1, radioButtonKtRadioButtonElementinlinedGlanceNode1);
        this._serFeatures = onExtraCallbackWithResult;
        this._filterProvider = null;
        this._defaultPrettyPrinter = onWarmupCompleted;
        this._ctorDetector = null;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    private findFragmentByTag(findFragmentByTag findfragmentbytag, long j, int i2, int i3, int i4, int i5, int i6) {
        super(findfragmentbytag, j);
        this._serFeatures = i2;
        this._filterProvider = findfragmentbytag._filterProvider;
        this._defaultPrettyPrinter = findfragmentbytag._defaultPrettyPrinter;
        this._ctorDetector = findfragmentbytag._ctorDetector;
        this._generatorFeatures = i3;
        this._generatorFeaturesToChange = i4;
        this._formatWriteFeatures = i5;
        this._formatWriteFeaturesToChange = i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.RadioButtonKtRadioButtonElement23
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final findFragmentByTag onExtraCallbackWithResult(long j) {
        return new findFragmentByTag(this, j, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public findFragmentByTag onWarmupCompleted(FragmentManagerExternalSyntheticLambda2 fragmentManagerExternalSyntheticLambda2) {
        int i2 = this._serFeatures & (~fragmentManagerExternalSyntheticLambda2.getMask());
        return i2 == this._serFeatures ? this : new findFragmentByTag(this, this._mapperFeatures, i2, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public initState onExtraCallbackWithResult() {
        initState initstate = this._defaultPrettyPrinter;
        return initstate instanceof shouldShowRequestPermissionRationale ? (initState) ((shouldShowRequestPermissionRationale) initstate).onExtraCallback() : initstate;
    }

    public void IAuthTabCallback(getView getview) {
        initState initstateOnExtraCallbackWithResult;
        if (FragmentManagerExternalSyntheticLambda2.INDENT_OUTPUT.enabledIn(this._serFeatures) && getview.IAuthTabCallbackStub() == null && (initstateOnExtraCallbackWithResult = onExtraCallbackWithResult()) != null) {
            getview.onNavigationEvent(initstateOnExtraCallbackWithResult);
        }
        boolean zEnabledIn = FragmentManagerExternalSyntheticLambda2.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i2 = this._generatorFeaturesToChange;
        if (i2 != 0 || zEnabledIn) {
            int i3 = this._generatorFeatures;
            if (zEnabledIn) {
                int mask = getView.IAuthTabCallback.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i3 |= mask;
                i2 |= mask;
            }
            getview.onExtraCallbackWithResult(i3, i2);
        }
        int i4 = this._formatWriteFeaturesToChange;
        if (i4 != 0) {
            getview.IAuthTabCallback(this._formatWriteFeatures, i4);
        }
    }

    public final boolean onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda2 fragmentManagerExternalSyntheticLambda2) {
        return (fragmentManagerExternalSyntheticLambda2.getMask() & this._serFeatures) != 0;
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public final boolean onExtraCallbackWithResult(RadioButtonKtRadioButton3 radioButtonKtRadioButton3) {
        return this._datatypeFeatures.onWarmupCompleted(radioButtonKtRadioButton3);
    }

    public LifecycleKteventFlow1ExternalSyntheticLambda1 IAuthTabCallback() {
        return this._filterProvider;
    }

    public initState onExtraCallback() {
        return this._defaultPrettyPrinter;
    }

    @Override // o.RadioButtonKtRadioButtonElement27
    public GlanceAppWidgetReceiver onWarmupCompleted() {
        GlanceAppWidgetReceiver glanceAppWidgetReceiver = this._ctorDetector;
        return glanceAppWidgetReceiver == null ? GlanceAppWidgetReceiver.onExtraCallback : glanceAppWidgetReceiver;
    }

    public onStateNotSaved onNavigationEvent(JavaType javaType) {
        return IAuthTabCallbackDefault().onNavigationEvent(this, javaType, (nSetCrop.onWarmupCompleted) this);
    }
}
