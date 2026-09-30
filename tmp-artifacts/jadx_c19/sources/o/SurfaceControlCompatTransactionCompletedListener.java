package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class SurfaceControlCompatTransactionCompletedListener implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract onExtraCallback IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType);

    public abstract onExtraCallback onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, String str) throws JsonMappingException;

    public abstract onExtraCallback onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, JavaType javaType2) throws JsonMappingException;

    public static abstract class IAuthTabCallback extends SurfaceControlCompatTransactionCompletedListener implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // o.SurfaceControlCompatTransactionCompletedListener
        public onExtraCallback IAuthTabCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType) {
            return onExtraCallback.INDETERMINATE;
        }

        @Override // o.SurfaceControlCompatTransactionCompletedListener
        public onExtraCallback onExtraCallback(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, String str) throws JsonMappingException {
            return onExtraCallback.INDETERMINATE;
        }

        @Override // o.SurfaceControlCompatTransactionCompletedListener
        public onExtraCallback onWarmupCompleted(RadioButtonKtRadioButtonElement27<?> radioButtonKtRadioButtonElement27, JavaType javaType, JavaType javaType2) throws JsonMappingException {
            return onExtraCallback.INDETERMINATE;
        }
    }
}
