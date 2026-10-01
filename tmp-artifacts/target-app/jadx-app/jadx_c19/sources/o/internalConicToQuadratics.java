package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class internalConicToQuadratics {
    private static final internalConicToQuadratics onExtraCallbackWithResult;

    public abstract Boolean onExtraCallback(internalPathIteratorPeek internalpathiteratorpeek);

    public abstract FragmentKtExternalSyntheticLambda0 onExtraCallbackWithResult(nDupFenceFd ndupfencefd);

    public abstract Boolean onWarmupCompleted(internalPathIteratorPeek internalpathiteratorpeek);

    static {
        internalConicToQuadratics internalconictoquadratics;
        try {
            internalconictoquadratics = (internalConicToQuadratics) SavedStateHandleImplExternalSyntheticLambda0.onExtraCallbackWithResult(GLThreadExternalSyntheticLambda7.class, false);
        } catch (IllegalAccessError unused) {
            internalconictoquadratics = null;
            onExtraCallbackWithResult = internalconictoquadratics;
        } catch (Throwable th) {
            SavedStateHandleSaverKtExternalSyntheticLambda0.onWarmupCompleted(th);
            internalconictoquadratics = null;
            onExtraCallbackWithResult = internalconictoquadratics;
        }
        onExtraCallbackWithResult = internalconictoquadratics;
    }

    public static internalConicToQuadratics IAuthTabCallback() {
        return onExtraCallbackWithResult;
    }
}
