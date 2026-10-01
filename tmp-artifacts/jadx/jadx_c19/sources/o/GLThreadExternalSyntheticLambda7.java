package o;

import java.beans.ConstructorProperties;
import java.beans.Transient;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GLThreadExternalSyntheticLambda7 extends internalConicToQuadratics {
    private final Class<?> onWarmupCompleted = ConstructorProperties.class;

    @Override // o.internalConicToQuadratics
    public Boolean onExtraCallback(internalPathIteratorPeek internalpathiteratorpeek) {
        Transient transientOnWarmupCompleted = internalpathiteratorpeek.onWarmupCompleted(Transient.class);
        if (transientOnWarmupCompleted != null) {
            return Boolean.valueOf(transientOnWarmupCompleted.value());
        }
        return null;
    }

    @Override // o.internalConicToQuadratics
    public Boolean onWarmupCompleted(internalPathIteratorPeek internalpathiteratorpeek) {
        if (internalpathiteratorpeek.onWarmupCompleted(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // o.internalConicToQuadratics
    public FragmentKtExternalSyntheticLambda0 onExtraCallbackWithResult(nDupFenceFd ndupfencefd) {
        ConstructorProperties constructorPropertiesOnWarmupCompleted;
        nSetBufferTransform nsetbuffertransformIAuthTabCallbackDefault = ndupfencefd.IAuthTabCallbackDefault();
        if (nsetbuffertransformIAuthTabCallbackDefault == null || (constructorPropertiesOnWarmupCompleted = nsetbuffertransformIAuthTabCallbackDefault.onWarmupCompleted((Class<ConstructorProperties>) ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = constructorPropertiesOnWarmupCompleted.value();
        int iAsInterface = ndupfencefd.asInterface();
        if (iAsInterface < strArrValue.length) {
            return FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(strArrValue[iAsInterface]);
        }
        return null;
    }
}
