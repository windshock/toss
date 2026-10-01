package o;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SecureTextFieldKtExternalSyntheticLambda0 implements RadioButtonKt {
    private final long[] IAuthTabCallback;
    private final ScaffoldKtExternalSyntheticLambda8 onExtraCallback;
    private final Map<String, String> onExtraCallbackWithResult;
    private final Map<String, SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1> onNavigationEvent;
    private final Map<String, SecureTextFieldKtExternalSyntheticLambda1> onWarmupCompleted;

    public SecureTextFieldKtExternalSyntheticLambda0(ScaffoldKtExternalSyntheticLambda8 scaffoldKtExternalSyntheticLambda8, Map<String, SecureTextFieldKtExternalSyntheticLambda1> map, Map<String, SecureTextFieldKtOutlinedSecureTextField3ExternalSyntheticLambda1> map2, Map<String, String> map3) {
        this.onExtraCallback = scaffoldKtExternalSyntheticLambda8;
        this.onNavigationEvent = map2;
        this.onExtraCallbackWithResult = map3;
        this.onWarmupCompleted = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.IAuthTabCallback = scaffoldKtExternalSyntheticLambda8.onExtraCallbackWithResult();
    }

    @Override // o.RadioButtonKt
    public int onWarmupCompleted(long j) {
        Object[] objArr = {this.IAuthTabCallback, Long.valueOf(j), false, false};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iIntValue = ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1100701149, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1100701127)).intValue();
        if (iIntValue < this.IAuthTabCallback.length) {
            return iIntValue;
        }
        return -1;
    }

    @Override // o.RadioButtonKt
    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallback.length;
    }

    @Override // o.RadioButtonKt
    public long IAuthTabCallback(int i2) {
        return this.IAuthTabCallback[i2];
    }

    @Override // o.RadioButtonKt
    public List<ImeEditCommand_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult(long j) {
        return this.onExtraCallback.onNavigationEvent(j, this.onWarmupCompleted, this.onNavigationEvent, this.onExtraCallbackWithResult);
    }
}
