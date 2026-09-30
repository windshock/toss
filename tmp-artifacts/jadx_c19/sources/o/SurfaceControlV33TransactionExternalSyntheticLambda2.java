package o;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SurfaceControlV33TransactionExternalSyntheticLambda2 {
    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nCreate ncreate, JavaType javaType) {
        return onNavigationEvent(ncreate, radioButtonKtRadioButtonElement27, radioButtonKtRadioButtonElement27.asBinder(), javaType);
    }

    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        return onNavigationEvent(angleMeasurerExternalSyntheticLambda0, radioButtonKtRadioButtonElement27, radioButtonKtRadioButtonElement27.asBinder());
    }

    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, nCreate ncreate, JavaType javaType) {
        return onNavigationEvent(ncreate, radioButtonKtRadioButtonElement27, radioButtonKtRadioButtonElement27.asBinder(), javaType);
    }

    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onNavigationEvent(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0) {
        return onNavigationEvent(angleMeasurerExternalSyntheticLambda0, radioButtonKtRadioButtonElement27, radioButtonKtRadioButtonElement27.asBinder());
    }

    @Deprecated
    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onNavigationEvent(nCreate ncreate, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, startActivityFromFragment startactivityfromfragment, JavaType javaType) {
        return onExtraCallback(radioButtonKtRadioButtonElement27, ncreate, javaType);
    }

    @Deprecated
    public Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> onNavigationEvent(AngleMeasurerExternalSyntheticLambda0 angleMeasurerExternalSyntheticLambda0, RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, startActivityFromFragment startactivityfromfragment) {
        return onExtraCallback(radioButtonKtRadioButtonElement27, angleMeasurerExternalSyntheticLambda0);
    }
}
