package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

@FragmentManagerExternalSyntheticLambda0
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class registerIn extends LifecycleEffectKtExternalSyntheticLambda1<Object> implements assertMainThread {
    private static final long serialVersionUID = 1;
    protected final boolean _forPrimitive;

    public registerIn(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this._forPrimitive = z;
    }

    @Override // o.assertMainThread
    public FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, validaterequestpermissionsrequestcode, onWarmupCompleted());
        if (registeronpreattachlistener_onextracallbackOnWarmupCompleted != null) {
            registerOnPreAttachListener$onWarmupCompleted registeronpreattachlistener_onwarmupcompletedOnExtraCallback = registeronpreattachlistener_onextracallbackOnWarmupCompleted.onExtraCallback();
            if (registeronpreattachlistener_onwarmupcompletedOnExtraCallback.isNumeric()) {
                return new onWarmupCompleted(this._forPrimitive);
            }
            if (registeronpreattachlistener_onwarmupcompletedOnExtraCallback == registerOnPreAttachListener$onWarmupCompleted.STRING) {
                return new LifecycleEffectKtExternalSyntheticLambda13(this._handledType);
            }
        }
        return this;
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        getview.onWarmupCompleted(Boolean.TRUE.equals(obj));
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda1, o.FragmentFactory
    public final void onExtraCallbackWithResult(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException {
        getview.onWarmupCompleted(Boolean.TRUE.equals(obj));
    }
}
