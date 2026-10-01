package o;

import java.nio.ByteBuffer;
import java.util.List;
import o.TextFieldKeyEventHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsTabRowKtExternalSyntheticLambda1 {
    private TextFieldKeyEventHandlerExternalSyntheticLambda0.onNavigationEvent onExtraCallbackWithResult;

    public int onWarmupCompleted(ByteBuffer byteBuffer, boolean z) {
        List<TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallbackWithResult> listOnExtraCallbackWithResult = TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallbackWithResult(byteBuffer);
        onExtraCallback(listOnExtraCallbackWithResult);
        int size = listOnExtraCallbackWithResult.size() - 1;
        int i2 = 0;
        while (size >= 0 && onExtraCallback(listOnExtraCallbackWithResult.get(size), z)) {
            if (listOnExtraCallbackWithResult.get(size).onWarmupCompleted == 6 || listOnExtraCallbackWithResult.get(size).onWarmupCompleted == 3) {
                i2++;
            }
            size--;
        }
        if (i2 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        if (size >= 0) {
            return listOnExtraCallbackWithResult.get(size).IAuthTabCallback.limit();
        }
        return byteBuffer.position();
    }

    public void onWarmupCompleted(ByteBuffer byteBuffer) {
        onExtraCallback(TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallbackWithResult(byteBuffer));
    }

    public void onNavigationEvent() {
        this.onExtraCallbackWithResult = null;
    }

    private boolean onExtraCallback(TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, boolean z) {
        TextFieldKeyEventHandlerExternalSyntheticLambda0.onNavigationEvent onnavigationevent;
        TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallback onextracallbackOnWarmupCompleted;
        int i2 = onextracallbackwithresult.onWarmupCompleted;
        if (i2 == 2 || i2 == 15) {
            return true;
        }
        if (i2 != 3 || z) {
            return ((i2 != 6 && i2 != 3) || (onnavigationevent = this.onExtraCallbackWithResult) == null || (onextracallbackOnWarmupCompleted = TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallback.onWarmupCompleted(onnavigationevent, onextracallbackwithresult)) == null || onextracallbackOnWarmupCompleted.onWarmupCompleted()) ? false : true;
        }
        return false;
    }

    private void onExtraCallback(List<TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallbackWithResult> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).onWarmupCompleted == 1) {
                this.onExtraCallbackWithResult = TextFieldKeyEventHandlerExternalSyntheticLambda0.onNavigationEvent.onWarmupCompleted(list.get(i2));
            }
        }
    }
}
