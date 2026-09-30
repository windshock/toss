package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getPackageType extends CoroutineContext.Element {
    public static final onNavigationEvent onNavigationEvent = onNavigationEvent.onWarmupCompleted;

    jni_YGNodeStyleGetAlignContentJNI IAuthTabCallbackDefault();

    boolean IAuthTabCallbackStubProxy();

    boolean IAuthTabCallback_Parcel();

    boolean access000();

    CancellationException asBinder();

    Sequence<getPackageType> cm_();

    setDeployments onExtraCallback(@NotNull Function1<? super Throwable, Unit> function1);

    boolean onExtraCallback();

    resumeMyRequest onExtraCallbackWithResult(@NotNull removeCallback removecallback);

    Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);

    void onNavigationEvent(@Nullable CancellationException cancellationException);

    setDeployments onWarmupCompleted(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1);

    public static final class onWarmupCompleted {
        public static CoroutineContext onExtraCallback(@NotNull getPackageType getpackagetype, @NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
            return CoroutineContext.Element.onNavigationEvent.onNavigationEvent(getpackagetype, onextracallback);
        }

        public static CoroutineContext onExtraCallback(@NotNull getPackageType getpackagetype, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.onNavigationEvent.onExtraCallbackWithResult(getpackagetype, coroutineContext);
        }

        public static <E extends CoroutineContext.Element> E onNavigationEvent(@NotNull getPackageType getpackagetype, @NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
            return (E) CoroutineContext.Element.onNavigationEvent.onExtraCallback(getpackagetype, onextracallback);
        }

        public static <R> R onWarmupCompleted(@NotNull getPackageType getpackagetype, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.onNavigationEvent.onExtraCallback(getpackagetype, r, function2);
        }

        public static /* synthetic */ void onWarmupCompleted(getPackageType getpackagetype, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            getpackagetype.onNavigationEvent(cancellationException);
        }
    }

    public static final class onNavigationEvent implements CoroutineContext.onExtraCallback<getPackageType> {
        static final /* synthetic */ onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        private onNavigationEvent() {
        }
    }
}
