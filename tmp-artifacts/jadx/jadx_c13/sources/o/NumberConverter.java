package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter {
    public static RuntimeException onExtraCallbackWithResult(Throwable th) {
        throw access26100.onExtraCallback(th);
    }

    public static void onWarmupCompleted(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
