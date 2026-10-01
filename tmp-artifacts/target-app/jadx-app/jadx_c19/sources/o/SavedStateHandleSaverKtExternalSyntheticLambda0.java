package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SavedStateHandleSaverKtExternalSyntheticLambda0 {
    public static void onWarmupCompleted(Throwable th) throws Error, RuntimeException {
        if (onNavigationEvent(th)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException(th);
        }
    }

    private static boolean onNavigationEvent(Throwable th) {
        return (th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof ClassCircularityError) || (th instanceof ClassFormatError) || (th instanceof IncompatibleClassChangeError) || provideDelegate.onExtraCallback(th) || (th instanceof VerifyError);
    }
}
