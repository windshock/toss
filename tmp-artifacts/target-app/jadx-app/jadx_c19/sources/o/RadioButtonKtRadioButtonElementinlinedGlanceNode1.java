package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RadioButtonKtRadioButtonElementinlinedGlanceNode1 implements Serializable {
    private static final long serialVersionUID = 1;
    private final int _enabledFor1;
    private final int _enabledFor2;
    private final int _explicitFor1;
    private final int _explicitFor2;

    protected RadioButtonKtRadioButtonElementinlinedGlanceNode1(int i2, int i3, int i4, int i5) {
        this._enabledFor1 = i2;
        this._explicitFor1 = i3;
        this._enabledFor2 = i4;
        this._explicitFor2 = i5;
    }

    public static RadioButtonKtRadioButtonElementinlinedGlanceNode1 onWarmupCompleted() {
        return IAuthTabCallback.IAuthTabCallback();
    }

    public boolean onWarmupCompleted(RadioButtonKtRadioButton3 radioButtonKtRadioButton3) {
        int iFeatureIndex = radioButtonKtRadioButton3.featureIndex();
        if (iFeatureIndex == 0) {
            return radioButtonKtRadioButton3.enabledIn(this._enabledFor1);
        }
        if (iFeatureIndex == 1) {
            return radioButtonKtRadioButton3.enabledIn(this._enabledFor2);
        }
        getSupportLoaderManager.onWarmupCompleted();
        return false;
    }

    public boolean onNavigationEvent(RadioButtonKtRadioButton3 radioButtonKtRadioButton3) {
        int iFeatureIndex = radioButtonKtRadioButton3.featureIndex();
        if (iFeatureIndex == 0) {
            return radioButtonKtRadioButton3.enabledIn(this._explicitFor1);
        }
        if (iFeatureIndex == 1) {
            return radioButtonKtRadioButton3.enabledIn(this._explicitFor2);
        }
        getSupportLoaderManager.onWarmupCompleted();
        return false;
    }

    static class IAuthTabCallback {
        private static final RadioButtonKtRadioButtonElementinlinedGlanceNode1 onExtraCallbackWithResult = new RadioButtonKtRadioButtonElementinlinedGlanceNode1(onExtraCallbackWithResult(RadioButtonKtRadioButtonElement22.values()), 0, onExtraCallbackWithResult(RadioButtonKtRadioButtonElement26.values()), 0);

        /* JADX WARN: Incorrect types in method signature: <F:Ljava/lang/Enum<TF;>;:Lo/r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo;>([TF;)I */
        /* JADX WARN: Multi-variable type inference failed */
        private static int onExtraCallbackWithResult(Enum[] enumArr) {
            int mask = 0;
            for (setNextTransition setnexttransition : enumArr) {
                if (setnexttransition.enabledByDefault()) {
                    mask |= setnexttransition.getMask();
                }
            }
            return mask;
        }

        public static RadioButtonKtRadioButtonElementinlinedGlanceNode1 IAuthTabCallback() {
            return onExtraCallbackWithResult;
        }
    }
}
