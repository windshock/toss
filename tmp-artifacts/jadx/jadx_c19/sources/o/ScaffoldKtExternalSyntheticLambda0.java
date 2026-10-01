package o;

import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ScaffoldKtExternalSyntheticLambda0 implements RadioButtonKt {
    private final List<ImeEditCommand_androidKtExternalSyntheticLambda1> onNavigationEvent;

    @Override // o.RadioButtonKt
    public int onExtraCallbackWithResult() {
        return 1;
    }

    @Override // o.RadioButtonKt
    public int onWarmupCompleted(long j) {
        return j < 0 ? 0 : -1;
    }

    public ScaffoldKtExternalSyntheticLambda0(List<ImeEditCommand_androidKtExternalSyntheticLambda1> list) {
        this.onNavigationEvent = list;
    }

    @Override // o.RadioButtonKt
    public long IAuthTabCallback(int i2) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 == 0);
        return 0L;
    }

    @Override // o.RadioButtonKt
    public List<ImeEditCommand_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult(long j) {
        return j >= 0 ? this.onNavigationEvent : Collections.EMPTY_LIST;
    }
}
