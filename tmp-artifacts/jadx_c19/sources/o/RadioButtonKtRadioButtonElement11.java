package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RadioButtonKtRadioButtonElement11 implements Serializable {
    private static final long serialVersionUID = 1;
    protected final onResumeFragments[] _abstractTypeResolvers;
    protected final RunCallbackAction[] _additionalDeserializers;
    protected final internalGetValueMap[] _additionalKeyDeserializers;
    protected final RemoteViewsInfo[] _modifiers;
    protected final RowKtRow23[] _valueInstantiators;
    protected static final RunCallbackAction[] onWarmupCompleted = new RunCallbackAction[0];
    protected static final RemoteViewsInfo[] IAuthTabCallback = new RemoteViewsInfo[0];
    protected static final onResumeFragments[] onExtraCallbackWithResult = new onResumeFragments[0];
    protected static final RowKtRow23[] onExtraCallback = new RowKtRow23[0];
    protected static final internalGetValueMap[] onNavigationEvent = {new GLFrameBufferRendererSurfaceViewProvidercreateSurfaceControl1surfaceHolderCallback1ExternalSyntheticLambda0()};

    public RadioButtonKtRadioButtonElement11() {
        this(null, null, null, null, null);
    }

    protected RadioButtonKtRadioButtonElement11(RunCallbackAction[] runCallbackActionArr, internalGetValueMap[] internalgetvaluemapArr, RemoteViewsInfo[] remoteViewsInfoArr, onResumeFragments[] onresumefragmentsArr, RowKtRow23[] rowKtRow23Arr) {
        this._additionalDeserializers = runCallbackActionArr == null ? onWarmupCompleted : runCallbackActionArr;
        this._additionalKeyDeserializers = internalgetvaluemapArr == null ? onNavigationEvent : internalgetvaluemapArr;
        this._modifiers = remoteViewsInfoArr == null ? IAuthTabCallback : remoteViewsInfoArr;
        this._abstractTypeResolvers = onresumefragmentsArr == null ? onExtraCallbackWithResult : onresumefragmentsArr;
        this._valueInstantiators = rowKtRow23Arr == null ? onExtraCallback : rowKtRow23Arr;
    }

    public boolean IAuthTabCallbackStub() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public boolean onExtraCallbackWithResult() {
        return this._modifiers.length > 0;
    }

    public boolean onExtraCallback() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean asBinder() {
        return this._valueInstantiators.length > 0;
    }

    public Iterable<RunCallbackAction> onNavigationEvent() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._additionalDeserializers);
    }

    public Iterable<internalGetValueMap> IAuthTabCallbackDefault() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._additionalKeyDeserializers);
    }

    public Iterable<RemoteViewsInfo> onWarmupCompleted() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._modifiers);
    }

    public Iterable<onResumeFragments> IAuthTabCallback() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._abstractTypeResolvers);
    }

    public Iterable<RowKtRow23> asInterface() {
        return new LocalLifecycleOwnerKtExternalSyntheticLambda0(this._valueInstantiators);
    }
}
