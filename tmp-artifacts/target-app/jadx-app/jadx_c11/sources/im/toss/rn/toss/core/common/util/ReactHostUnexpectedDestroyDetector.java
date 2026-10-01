package im.toss.rn.toss.core.common.util;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.ReactHost;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactHostUnexpectedDestroyDetector {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact;
    private ReactHost IAuthTabCallback;
    private final Function0<Unit> IAuthTabCallbackDefault;
    private final AtomicBoolean onExtraCallback;
    private final Handler onExtraCallbackWithResult;
    private final Function0<Unit> onNavigationEvent;
    private volatile boolean onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStub + 9;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void onExtraCallback(ReactHostUnexpectedDestroyDetector reactHostUnexpectedDestroyDetector) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(reactHostUnexpectedDestroyDetector);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 15;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ReactHostUnexpectedDestroyDetector reactHostUnexpectedDestroyDetector) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(reactHostUnexpectedDestroyDetector);
        int i4 = asBinder + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public ReactHostUnexpectedDestroyDetector(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallbackDefault = function0;
        this.onExtraCallbackWithResult = new Handler(Looper.getMainLooper());
        this.onExtraCallback = new AtomicBoolean(false);
        this.onNavigationEvent = new Function0() { // from class: im.toss.rn.toss.core.common.util.ReactHostUnexpectedDestroyDetector$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                ReactHostUnexpectedDestroyDetector reactHostUnexpectedDestroyDetector = this.f$0;
                if (i3 != 0) {
                    return ReactHostUnexpectedDestroyDetector.onWarmupCompleted(reactHostUnexpectedDestroyDetector);
                }
                ReactHostUnexpectedDestroyDetector.onWarmupCompleted(reactHostUnexpectedDestroyDetector);
                throw null;
            }
        };
    }

    private static final void onNavigationEvent(ReactHostUnexpectedDestroyDetector reactHostUnexpectedDestroyDetector) {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Result.Companion companion = Result.Companion;
                reactHostUnexpectedDestroyDetector.IAuthTabCallbackDefault.invoke();
                obj = Result.constructor-impl(Unit.INSTANCE);
                int i3 = 37 / 0;
            } else {
                Result.Companion companion2 = Result.Companion;
                reactHostUnexpectedDestroyDetector.IAuthTabCallbackDefault.invoke();
                obj = Result.constructor-impl(Unit.INSTANCE);
            }
            int i4 = asBinder + 83;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Result.exceptionOrNull-impl(obj);
    }

    private static final Unit IAuthTabCallback(final ReactHostUnexpectedDestroyDetector reactHostUnexpectedDestroyDetector) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!reactHostUnexpectedDestroyDetector.onWarmupCompleted) {
                int i4 = asInterface + 59;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    if (reactHostUnexpectedDestroyDetector.onExtraCallback.compareAndSet(false, true)) {
                        reactHostUnexpectedDestroyDetector.onExtraCallbackWithResult.post(new Runnable() { // from class: im.toss.rn.toss.core.common.util.ReactHostUnexpectedDestroyDetector$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = 2 % 2;
                                int i6 = onNavigationEvent + 39;
                                IAuthTabCallback = i6 % 128;
                                Object obj = null;
                                if (i6 % 2 != 0) {
                                    ReactHostUnexpectedDestroyDetector.onExtraCallback(this.f$0);
                                    obj.hashCode();
                                    throw null;
                                }
                                ReactHostUnexpectedDestroyDetector.onExtraCallback(this.f$0);
                                int i7 = onNavigationEvent + 93;
                                IAuthTabCallback = i7 % 128;
                                if (i7 % 2 != 0) {
                                    throw null;
                                }
                            }
                        });
                        int i5 = asInterface + 49;
                        asBinder = i5 % 128;
                        int i6 = i5 % 2;
                    }
                } else if (reactHostUnexpectedDestroyDetector.onExtraCallback.compareAndSet(false, true)) {
                    reactHostUnexpectedDestroyDetector.onExtraCallbackWithResult.post(new Runnable() { // from class: im.toss.rn.toss.core.common.util.ReactHostUnexpectedDestroyDetector$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i52 = 2 % 2;
                            int i62 = onNavigationEvent + 39;
                            IAuthTabCallback = i62 % 128;
                            Object obj = null;
                            if (i62 % 2 != 0) {
                                ReactHostUnexpectedDestroyDetector.onExtraCallback(this.f$0);
                                obj.hashCode();
                                throw null;
                            }
                            ReactHostUnexpectedDestroyDetector.onExtraCallback(this.f$0);
                            int i7 = onNavigationEvent + 93;
                            IAuthTabCallback = i7 % 128;
                            if (i7 % 2 != 0) {
                                throw null;
                            }
                        }
                    });
                    int i52 = asInterface + 49;
                    asBinder = i52 % 128;
                    int i62 = i52 % 2;
                }
            }
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@NotNull ReactHost reactHost) {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(reactHost, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(reactHost, "");
        ReactHost reactHost2 = this.IAuthTabCallback;
        if (reactHost2 == reactHost) {
            return;
        }
        if (reactHost2 != null) {
            int i3 = asInterface + 113;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            reactHost2.IAuthTabCallback(this.onNavigationEvent);
            int i5 = asInterface + 39;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        this.onWarmupCompleted = false;
        this.onExtraCallback.set(false);
        this.IAuthTabCallback = reactHost;
        reactHost.onWarmupCompleted(this.onNavigationEvent);
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted = true;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        ReactHost reactHost = this.IAuthTabCallback;
        if (reactHost != null) {
            int i2 = asInterface + 1;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                reactHost.IAuthTabCallback(this.onNavigationEvent);
                throw null;
            }
            reactHost.IAuthTabCallback(this.onNavigationEvent);
            int i3 = asBinder + 37;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        this.IAuthTabCallback = null;
        int i5 = asInterface + 75;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
