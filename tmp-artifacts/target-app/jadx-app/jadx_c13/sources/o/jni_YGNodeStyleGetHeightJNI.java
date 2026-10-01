package o;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGNodeStyleGetHeightJNI implements Executor {
    public static final jni_YGNodeStyleGetHeightJNI onNavigationEvent = new jni_YGNodeStyleGetHeightJNI();

    private jni_YGNodeStyleGetHeightJNI() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}
