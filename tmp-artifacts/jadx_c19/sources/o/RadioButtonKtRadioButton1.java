package o;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.nTransactionSetOnCommit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RadioButtonKtRadioButton1 implements Serializable {
    private static final long serialVersionUID = 1;
    protected dump$onWarmupCompleted _defaultInclusion;
    protected Boolean _defaultLeniency;
    protected Boolean _defaultMergeable;
    protected getEnterTransitionCallback$onExtraCallbackWithResult _defaultSetterInfo;
    protected Map<Class<?>, RadioButtonKtRadioButtonElement3> _overrides;
    protected nTransactionSetOnCommit<?> _visibilityChecker;

    public RadioButtonKtRadioButton1() {
        this(null, dump$onWarmupCompleted.onNavigationEvent(), getEnterTransitionCallback$onExtraCallbackWithResult.onExtraCallbackWithResult(), nTransactionSetOnCommit.onWarmupCompleted.onNavigationEvent(), null, null);
    }

    protected RadioButtonKtRadioButton1(Map<Class<?>, RadioButtonKtRadioButtonElement3> map, dump$onWarmupCompleted dump_onwarmupcompleted, getEnterTransitionCallback$onExtraCallbackWithResult getentertransitioncallback_onextracallbackwithresult, nTransactionSetOnCommit<?> ntransactionsetoncommit, Boolean bool, Boolean bool2) {
        this._overrides = map;
        this._defaultInclusion = dump_onwarmupcompleted;
        this._defaultSetterInfo = getentertransitioncallback_onextracallbackwithresult;
        this._visibilityChecker = ntransactionsetoncommit;
        this._defaultMergeable = bool;
        this._defaultLeniency = bool2;
    }

    public RadioButtonKtRadioButton2 onExtraCallbackWithResult(Class<?> cls) {
        Map<Class<?>, RadioButtonKtRadioButtonElement3> map = this._overrides;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public RadioButtonKtRadioButtonElement3 onNavigationEvent(Class<?> cls) {
        if (this._overrides == null) {
            this._overrides = onExtraCallbackWithResult();
        }
        RadioButtonKtRadioButtonElement3 radioButtonKtRadioButtonElement3 = this._overrides.get(cls);
        if (radioButtonKtRadioButtonElement3 != null) {
            return radioButtonKtRadioButtonElement3;
        }
        RadioButtonKtRadioButtonElement3 radioButtonKtRadioButtonElement32 = new RadioButtonKtRadioButtonElement3();
        this._overrides.put(cls, radioButtonKtRadioButtonElement32);
        return radioButtonKtRadioButtonElement32;
    }

    public registerOnPreAttachListener$onExtraCallback onWarmupCompleted(Class<?> cls) {
        RadioButtonKtRadioButtonElement3 radioButtonKtRadioButtonElement3;
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnExtraCallback;
        Map<Class<?>, RadioButtonKtRadioButtonElement3> map = this._overrides;
        if (map != null && (radioButtonKtRadioButtonElement3 = map.get(cls)) != null && (registeronpreattachlistener_onextracallbackOnExtraCallback = radioButtonKtRadioButtonElement3.onExtraCallback()) != null) {
            return !registeronpreattachlistener_onextracallbackOnExtraCallback.asInterface() ? registeronpreattachlistener_onextracallbackOnExtraCallback.onExtraCallback(this._defaultLeniency) : registeronpreattachlistener_onextracallbackOnExtraCallback;
        }
        Boolean bool = this._defaultLeniency;
        if (bool == null) {
            return registerOnPreAttachListener$onExtraCallback.onNavigationEvent();
        }
        return registerOnPreAttachListener$onExtraCallback.onExtraCallbackWithResult(bool.booleanValue());
    }

    public dump$onWarmupCompleted IAuthTabCallback() {
        return this._defaultInclusion;
    }

    public getEnterTransitionCallback$onExtraCallbackWithResult onWarmupCompleted() {
        return this._defaultSetterInfo;
    }

    public Boolean onExtraCallback() {
        return this._defaultMergeable;
    }

    public nTransactionSetOnCommit<?> onNavigationEvent() {
        return this._visibilityChecker;
    }

    public void onWarmupCompleted(getEnterTransitionCallback$onExtraCallbackWithResult getentertransitioncallback_onextracallbackwithresult) {
        this._defaultSetterInfo = getentertransitioncallback_onextracallbackwithresult;
    }

    protected Map<Class<?>, RadioButtonKtRadioButtonElement3> onExtraCallbackWithResult() {
        return new HashMap();
    }
}
