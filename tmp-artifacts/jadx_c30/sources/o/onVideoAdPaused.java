package o;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Objects;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onVideoAdPaused {

    @FunctionalInterface
    @Deprecated
    public interface IAuthTabCallback<O1, O2, R, T extends Throwable> {
        R onWarmupCompleted(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface IAuthTabCallbackDefault<T extends Throwable> {
        void run() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface IAuthTabCallbackStub<I, T extends Throwable> {
        boolean onWarmupCompleted(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface asBinder<I, R, T extends Throwable> {
        R IAuthTabCallback(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface asInterface<R, T extends Throwable> {
        R get() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface onExtraCallback<R, T extends Throwable> {
        R onNavigationEvent() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface onExtraCallbackWithResult<O1, O2, T extends Throwable> {
        boolean onNavigationEvent(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface onNavigationEvent<O, T extends Throwable> {
        void accept(O o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface onWarmupCompleted<O1, O2, T extends Throwable> {
    }

    public static <O1, O2, T extends Throwable> void onWarmupCompleted(final onWarmupCompleted<O1, O2, T> onwarmupcompleted, final O1 o1, final O2 o2) {
        onExtraCallbackWithResult(new IAuthTabCallbackDefault() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda7
            @Override // o.onVideoAdPaused.IAuthTabCallbackDefault
            public final void run() {
            }
        });
    }

    public static <O, T extends Throwable> void onNavigationEvent(final onNavigationEvent<O, T> onnavigationevent, final O o2) {
        onExtraCallbackWithResult(new IAuthTabCallbackDefault() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda4
            @Override // o.onVideoAdPaused.IAuthTabCallbackDefault
            public final void run() throws Throwable {
                onnavigationevent.accept(o2);
            }
        });
    }

    public static <O1, O2, O, T extends Throwable> O onWarmupCompleted(final IAuthTabCallback<O1, O2, O, T> iAuthTabCallback, final O1 o1, final O2 o2) {
        return (O) onNavigationEvent(new asInterface() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda8
            @Override // o.onVideoAdPaused.asInterface
            public final Object get() {
                return iAuthTabCallback.onWarmupCompleted(o1, o2);
            }
        });
    }

    public static <I, O, T extends Throwable> O onExtraCallbackWithResult(final asBinder<I, O, T> asbinder, final I i) {
        return (O) onNavigationEvent(new asInterface() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda1
            @Override // o.onVideoAdPaused.asInterface
            public final Object get() {
                return asbinder.IAuthTabCallback(i);
            }
        });
    }

    public static <O, T extends Throwable> O onExtraCallback(final onExtraCallback<O, T> onextracallback) {
        return (O) onNavigationEvent(new asInterface() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda15
            @Override // o.onVideoAdPaused.asInterface
            public final Object get() {
                return onextracallback.onNavigationEvent();
            }
        });
    }

    public static <O, T extends Throwable> O onNavigationEvent(asInterface<O, T> asinterface) {
        try {
            return asinterface.get();
        } catch (Throwable th) {
            throw onWarmupCompleted(th);
        }
    }

    private static <T extends Throwable> boolean onExtraCallbackWithResult(PAGRewardedAdLoadCallback<T> pAGRewardedAdLoadCallback) {
        try {
            return pAGRewardedAdLoadCallback.getAsBoolean();
        } catch (Throwable th) {
            throw onWarmupCompleted(th);
        }
    }

    public static RuntimeException onWarmupCompleted(Throwable th) {
        Objects.requireNonNull(th, "throwable");
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof IOException) {
            throw new UncheckedIOException((IOException) th);
        }
        throw new UndeclaredThrowableException(th);
    }

    public static <T extends Throwable> void onExtraCallbackWithResult(IAuthTabCallbackDefault<T> iAuthTabCallbackDefault) {
        try {
            iAuthTabCallbackDefault.run();
        } catch (Throwable th) {
            throw onWarmupCompleted(th);
        }
    }

    public static <O1, O2, T extends Throwable> boolean onExtraCallback(final onExtraCallbackWithResult<O1, O2, T> onextracallbackwithresult, final O1 o1, final O2 o2) {
        return onExtraCallbackWithResult(new PAGRewardedAdLoadCallback() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11
            @Override // o.PAGRewardedAdLoadCallback
            public final boolean getAsBoolean() {
                return onextracallbackwithresult.onNavigationEvent(o1, o2);
            }
        });
    }

    public static <O, T extends Throwable> boolean onWarmupCompleted(final IAuthTabCallbackStub<O, T> iAuthTabCallbackStub, final O o2) {
        return onExtraCallbackWithResult(new PAGRewardedAdLoadCallback() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda13
            @Override // o.PAGRewardedAdLoadCallback
            public final boolean getAsBoolean() {
                return iAuthTabCallbackStub.onWarmupCompleted(o2);
            }
        });
    }
}
