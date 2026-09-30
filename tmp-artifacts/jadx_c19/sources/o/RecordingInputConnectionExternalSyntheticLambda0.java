package o;

import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RecordingInputConnectionExternalSyntheticLambda0 {
    private static Executor onExtraCallbackWithResult;

    public static Executor IAuthTabCallback() {
        Executor executor;
        synchronized (RecordingInputConnectionExternalSyntheticLambda0.class) {
            if (onExtraCallbackWithResult == null) {
                onExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult("ExoPlayer:BackgroundExecutor");
            }
            executor = onExtraCallbackWithResult;
        }
        return executor;
    }

    private RecordingInputConnectionExternalSyntheticLambda0() {
    }
}
