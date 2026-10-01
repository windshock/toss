package com.fasterxml.jackson.databind.util;

import com.alibaba.ariver.kernel.RVParams;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import o.FragmentKtExternalSyntheticLambda0;
import o.LifecycleEffectKtExternalSyntheticLambda16;
import o.RadioButtonKtRadioButtonElement27;
import o.SavedStateHandleSaverKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RootNameLookup implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient SavedStateHandleSaverKtExternalSyntheticLambda5<LifecycleEffectKtExternalSyntheticLambda16, FragmentKtExternalSyntheticLambda0> onExtraCallbackWithResult = new SavedStateHandleSaverKtExternalSyntheticLambda5<>(20, RVParams.WEBVIEW_FONT_SIZE_LARGEST);

    public FragmentKtExternalSyntheticLambda0 onWarmupCompleted(JavaType javaType, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27) {
        return onWarmupCompleted(javaType.asBinder(), radioButtonKtRadioButtonElement27);
    }

    public FragmentKtExternalSyntheticLambda0 onWarmupCompleted(Class<?> cls, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27) {
        LifecycleEffectKtExternalSyntheticLambda16 lifecycleEffectKtExternalSyntheticLambda16 = new LifecycleEffectKtExternalSyntheticLambda16(cls);
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(lifecycleEffectKtExternalSyntheticLambda16);
        if (fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            return fragmentKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        }
        FragmentKtExternalSyntheticLambda0 fragmentKtExternalSyntheticLambda0OnExtraCallback = radioButtonKtRadioButtonElement27.asBinder().onExtraCallback(radioButtonKtRadioButtonElement27.asBinder(cls).ICustomTabsCallback());
        if (fragmentKtExternalSyntheticLambda0OnExtraCallback == null || !fragmentKtExternalSyntheticLambda0OnExtraCallback.IAuthTabCallback()) {
            fragmentKtExternalSyntheticLambda0OnExtraCallback = FragmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(cls.getSimpleName());
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(lifecycleEffectKtExternalSyntheticLambda16, fragmentKtExternalSyntheticLambda0OnExtraCallback);
        return fragmentKtExternalSyntheticLambda0OnExtraCallback;
    }

    protected Object readResolve() {
        return new RootNameLookup();
    }
}
