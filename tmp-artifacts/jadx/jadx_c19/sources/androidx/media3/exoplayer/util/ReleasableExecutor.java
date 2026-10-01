package androidx.media3.exoplayer.util;

import java.util.concurrent.Executor;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ReleasableExecutor extends Executor {
    void onExtraCallback();

    static <T extends Executor> ReleasableExecutor onNavigationEvent(final T t, final TextFieldDecoratorModifierNodeExternalSyntheticLambda10<T> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        return new ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                t.execute(runnable);
            }

            @Override // androidx.media3.exoplayer.util.ReleasableExecutor
            public void onExtraCallback() {
                textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(t);
            }
        };
    }
}
