package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@FragmentManagerExternalSyntheticLambda0
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TransformationsswitchMap2ExternalSyntheticLambda0 extends LifecycleEffectKtExternalSyntheticLambda1<Number> implements assertMainThread {
    public static final TransformationsswitchMap2ExternalSyntheticLambda0 onExtraCallbackWithResult = new TransformationsswitchMap2ExternalSyntheticLambda0(Number.class);
    protected final boolean _isInt;

    public TransformationsswitchMap2ExternalSyntheticLambda0(Class<? extends Number> cls) {
        super(cls, false);
        this._isInt = cls == BigInteger.class;
    }

    @Override // o.assertMainThread
    public FragmentFactory<?> onExtraCallbackWithResult(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, validateRequestPermissionsRequestCode validaterequestpermissionsrequestcode) throws JsonMappingException {
        registerOnPreAttachListener$onExtraCallback registeronpreattachlistener_onextracallbackOnWarmupCompleted = onWarmupCompleted(fragmentManagerExternalSyntheticLambda1, validaterequestpermissionsrequestcode, onWarmupCompleted());
        if (registeronpreattachlistener_onextracallbackOnWarmupCompleted == null || AnonymousClass5.onNavigationEvent[registeronpreattachlistener_onextracallbackOnWarmupCompleted.onExtraCallback().ordinal()] != 1) {
            return this;
        }
        if (onWarmupCompleted() == BigDecimal.class) {
            return onNavigationEvent();
        }
        return LifecycleEffectKtExternalSyntheticLambda13.onNavigationEvent;
    }

    /* renamed from: o.TransformationsswitchMap2ExternalSyntheticLambda0$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[registerOnPreAttachListener$onWarmupCompleted.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[registerOnPreAttachListener$onWarmupCompleted.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    public void onExtraCallback(Number number, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        if (number instanceof BigDecimal) {
            getview.IAuthTabCallback((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            getview.onExtraCallbackWithResult((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            getview.onExtraCallback(number.longValue());
            return;
        }
        if (number instanceof Double) {
            getview.onExtraCallbackWithResult(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            getview.onNavigationEvent(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            getview.onExtraCallbackWithResult(number.intValue());
        } else {
            getview.asInterface(number.toString());
        }
    }

    public static FragmentFactory<?> onNavigationEvent() {
        return onNavigationEvent.onNavigationEvent;
    }
}
