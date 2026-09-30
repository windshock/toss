package o;

import java.io.Serializable;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SpecialEffectsControllerExternalSyntheticLambda1 implements Serializable {
    private static final int IAuthTabCallback = LifecycleEffectKtExternalSyntheticLambda8.values().length;
    private static final long serialVersionUID = 1;
    protected FragmentTransitionImpl _defaultAction;
    protected final RadioButtonKtRadioButtonElement25 _defaultCoercions;
    protected Map<Class<?>, RadioButtonKtRadioButtonElement25> _perClassCoercions;
    protected RadioButtonKtRadioButtonElement25[] _perTypeCoercions;

    public SpecialEffectsControllerExternalSyntheticLambda1() {
        this(FragmentTransitionImpl.TryConvert, new RadioButtonKtRadioButtonElement25(), null, null);
    }

    protected SpecialEffectsControllerExternalSyntheticLambda1(FragmentTransitionImpl fragmentTransitionImpl, RadioButtonKtRadioButtonElement25 radioButtonKtRadioButtonElement25, RadioButtonKtRadioButtonElement25[] radioButtonKtRadioButtonElement25Arr, Map<Class<?>, RadioButtonKtRadioButtonElement25> map) {
        this._defaultCoercions = radioButtonKtRadioButtonElement25;
        this._defaultAction = fragmentTransitionImpl;
        this._perTypeCoercions = radioButtonKtRadioButtonElement25Arr;
        this._perClassCoercions = map;
    }

    public FragmentTransitionImpl onWarmupCompleted(startIntentSenderFromFragment startintentsenderfromfragment, LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8, Class<?> cls, FragmentStrictModeExternalSyntheticLambda0 fragmentStrictModeExternalSyntheticLambda0) {
        RadioButtonKtRadioButtonElement25 radioButtonKtRadioButtonElement25;
        FragmentTransitionImpl fragmentTransitionImplOnNavigationEvent;
        RadioButtonKtRadioButtonElement25 radioButtonKtRadioButtonElement252;
        FragmentTransitionImpl fragmentTransitionImplOnNavigationEvent2;
        Map<Class<?>, RadioButtonKtRadioButtonElement25> map = this._perClassCoercions;
        if (map != null && cls != null && (radioButtonKtRadioButtonElement252 = map.get(cls)) != null && (fragmentTransitionImplOnNavigationEvent2 = radioButtonKtRadioButtonElement252.onNavigationEvent(fragmentStrictModeExternalSyntheticLambda0)) != null) {
            return fragmentTransitionImplOnNavigationEvent2;
        }
        RadioButtonKtRadioButtonElement25[] radioButtonKtRadioButtonElement25Arr = this._perTypeCoercions;
        if (radioButtonKtRadioButtonElement25Arr != null && lifecycleEffectKtExternalSyntheticLambda8 != null && (radioButtonKtRadioButtonElement25 = radioButtonKtRadioButtonElement25Arr[lifecycleEffectKtExternalSyntheticLambda8.ordinal()]) != null && (fragmentTransitionImplOnNavigationEvent = radioButtonKtRadioButtonElement25.onNavigationEvent(fragmentStrictModeExternalSyntheticLambda0)) != null) {
            return fragmentTransitionImplOnNavigationEvent;
        }
        FragmentTransitionImpl fragmentTransitionImplOnNavigationEvent3 = this._defaultCoercions.onNavigationEvent(fragmentStrictModeExternalSyntheticLambda0);
        if (fragmentTransitionImplOnNavigationEvent3 != null) {
            return fragmentTransitionImplOnNavigationEvent3;
        }
        int i2 = AnonymousClass3.onExtraCallback[fragmentStrictModeExternalSyntheticLambda0.ordinal()];
        if (i2 == 1) {
            return startintentsenderfromfragment.onNavigationEvent(supportPostponeEnterTransition.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? FragmentTransitionImpl.AsNull : FragmentTransitionImpl.Fail;
        }
        if (i2 == 2) {
            if (lifecycleEffectKtExternalSyntheticLambda8 == LifecycleEffectKtExternalSyntheticLambda8.Integer) {
                return startintentsenderfromfragment.onNavigationEvent(supportPostponeEnterTransition.ACCEPT_FLOAT_AS_INT) ? FragmentTransitionImpl.TryConvert : FragmentTransitionImpl.Fail;
            }
        } else if (i2 == 3 && lifecycleEffectKtExternalSyntheticLambda8 == LifecycleEffectKtExternalSyntheticLambda8.Enum && startintentsenderfromfragment.onNavigationEvent(supportPostponeEnterTransition.FAIL_ON_NUMBERS_FOR_ENUMS)) {
            return FragmentTransitionImpl.Fail;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(lifecycleEffectKtExternalSyntheticLambda8);
        if (zOnExtraCallbackWithResult && !startintentsenderfromfragment.onExtraCallback(setLayoutTransition.ALLOW_COERCION_OF_SCALARS) && (lifecycleEffectKtExternalSyntheticLambda8 != LifecycleEffectKtExternalSyntheticLambda8.Float || fragmentStrictModeExternalSyntheticLambda0 != FragmentStrictModeExternalSyntheticLambda0.Integer)) {
            return FragmentTransitionImpl.Fail;
        }
        if (fragmentStrictModeExternalSyntheticLambda0 == FragmentStrictModeExternalSyntheticLambda0.EmptyString) {
            if (lifecycleEffectKtExternalSyntheticLambda8 == LifecycleEffectKtExternalSyntheticLambda8.OtherScalar) {
                return FragmentTransitionImpl.TryConvert;
            }
            if (zOnExtraCallbackWithResult || startintentsenderfromfragment.onNavigationEvent(supportPostponeEnterTransition.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return FragmentTransitionImpl.AsNull;
            }
            return FragmentTransitionImpl.Fail;
        }
        return this._defaultAction;
    }

    /* renamed from: o.SpecialEffectsControllerExternalSyntheticLambda1$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[FragmentStrictModeExternalSyntheticLambda0.values().length];
            onExtraCallback = iArr;
            try {
                iArr[FragmentStrictModeExternalSyntheticLambda0.EmptyArray.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[FragmentStrictModeExternalSyntheticLambda0.Float.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[FragmentStrictModeExternalSyntheticLambda0.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public FragmentTransitionImpl onWarmupCompleted(startIntentSenderFromFragment startintentsenderfromfragment, LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8, Class<?> cls, FragmentTransitionImpl fragmentTransitionImpl) {
        Boolean boolOnExtraCallback;
        FragmentTransitionImpl fragmentTransitionImplOnNavigationEvent;
        RadioButtonKtRadioButtonElement25 radioButtonKtRadioButtonElement25;
        RadioButtonKtRadioButtonElement25 radioButtonKtRadioButtonElement252;
        Map<Class<?>, RadioButtonKtRadioButtonElement25> map = this._perClassCoercions;
        if (map == null || cls == null || (radioButtonKtRadioButtonElement252 = map.get(cls)) == null) {
            boolOnExtraCallback = null;
            fragmentTransitionImplOnNavigationEvent = null;
        } else {
            boolOnExtraCallback = radioButtonKtRadioButtonElement252.onExtraCallback();
            fragmentTransitionImplOnNavigationEvent = radioButtonKtRadioButtonElement252.onNavigationEvent(FragmentStrictModeExternalSyntheticLambda0.EmptyString);
        }
        RadioButtonKtRadioButtonElement25[] radioButtonKtRadioButtonElement25Arr = this._perTypeCoercions;
        if (radioButtonKtRadioButtonElement25Arr != null && lifecycleEffectKtExternalSyntheticLambda8 != null && (radioButtonKtRadioButtonElement25 = radioButtonKtRadioButtonElement25Arr[lifecycleEffectKtExternalSyntheticLambda8.ordinal()]) != null) {
            if (boolOnExtraCallback == null) {
                boolOnExtraCallback = radioButtonKtRadioButtonElement25.onExtraCallback();
            }
            if (fragmentTransitionImplOnNavigationEvent == null) {
                fragmentTransitionImplOnNavigationEvent = radioButtonKtRadioButtonElement25.onNavigationEvent(FragmentStrictModeExternalSyntheticLambda0.EmptyString);
            }
        }
        if (boolOnExtraCallback == null) {
            boolOnExtraCallback = this._defaultCoercions.onExtraCallback();
        }
        if (fragmentTransitionImplOnNavigationEvent == null) {
            fragmentTransitionImplOnNavigationEvent = this._defaultCoercions.onNavigationEvent(FragmentStrictModeExternalSyntheticLambda0.EmptyString);
        }
        if (!Boolean.FALSE.equals(boolOnExtraCallback)) {
            if (fragmentTransitionImplOnNavigationEvent != null) {
                return fragmentTransitionImplOnNavigationEvent;
            }
            if (onExtraCallbackWithResult(lifecycleEffectKtExternalSyntheticLambda8)) {
                return FragmentTransitionImpl.AsNull;
            }
            if (startintentsenderfromfragment.onNavigationEvent(supportPostponeEnterTransition.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return FragmentTransitionImpl.AsNull;
            }
        }
        return fragmentTransitionImpl;
    }

    protected boolean onExtraCallbackWithResult(LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8) {
        return lifecycleEffectKtExternalSyntheticLambda8 == LifecycleEffectKtExternalSyntheticLambda8.Float || lifecycleEffectKtExternalSyntheticLambda8 == LifecycleEffectKtExternalSyntheticLambda8.Integer || lifecycleEffectKtExternalSyntheticLambda8 == LifecycleEffectKtExternalSyntheticLambda8.Boolean || lifecycleEffectKtExternalSyntheticLambda8 == LifecycleEffectKtExternalSyntheticLambda8.DateTime;
    }
}
