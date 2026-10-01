package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onActive extends LifecycleEffectKtExternalSyntheticLambda14<Object> {
    protected final String _msg;

    public onActive(String str) {
        super(Object.class);
        this._msg = str;
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Object obj, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException, JsonMappingException {
        fragmentManagerExternalSyntheticLambda1.IAuthTabCallback(this._msg, new Object[0]);
    }
}
