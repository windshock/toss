package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import o.clearSelinuxLabel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class clearSelinuxLabel extends clearUid {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallbackWithResult(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onNavigationEvent(Object obj) {
        return obj;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements Sequence<T> {
        final /* synthetic */ Object onWarmupCompleted;

        public IAuthTabCallback(Object obj) {
            this.onWarmupCompleted = obj;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            return new onExtraCallbackWithResult(this.onWarmupCompleted);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements Sequence<T> {
        final /* synthetic */ Iterator onExtraCallback;

        public onNavigationEvent(Iterator it) {
            this.onExtraCallback = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            return this.onExtraCallback;
        }
    }

    public static <T> Sequence<T> onExtraCallbackWithResult(@NotNull Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "");
        return IAuthTabCallback_Parcel(new onNavigationEvent(it));
    }

    public static <T> Sequence<T> onExtraCallback(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return ArraysKt___ArraysKt.asSequence(tArr);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements Iterator<T>, KMappedMarker {
        private boolean onExtraCallback = true;
        final /* synthetic */ T onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onExtraCallbackWithResult(T t) {
            this.onWarmupCompleted = t;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.onExtraCallback) {
                throw new NoSuchElementException();
            }
            this.onExtraCallback = false;
            return this.onWarmupCompleted;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallback;
        }
    }

    public static <T> Sequence<T> onExtraCallback(T t) {
        return new IAuthTabCallback(t);
    }

    public static <T> Sequence<T> onExtraCallback() {
        return clearBuildFingerprint.IAuthTabCallback;
    }

    public static final <T> Sequence<T> ICustomTabsCallback(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return IAuthTabCallback(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return clearSelinuxLabel.onExtraCallbackWithResult((Sequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator onExtraCallbackWithResult(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return sequence.IAuthTabCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator onExtraCallback(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable.iterator();
    }

    private static final <T, R> Sequence<R> IAuthTabCallback(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        if (sequence instanceof internalGetThreads) {
            return ((internalGetThreads) sequence).onNavigationEvent(function1);
        }
        return new clearCauses(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return clearSelinuxLabel.onNavigationEvent(obj);
            }
        }, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> IAuthTabCallback_Parcel(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return sequence instanceof addLogBuffers ? sequence : new addLogBuffers(sequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IAuthTabCallback(Function0 function0, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function0.invoke();
    }

    public static <T> Sequence<T> onExtraCallbackWithResult(@NotNull final Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return IAuthTabCallback_Parcel(new clearLogBuffers(function0, new Function1() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return clearSelinuxLabel.IAuthTabCallback(function0, obj);
            }
        }));
    }

    public static <T> Sequence<T> onExtraCallback(@Nullable final T t, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (t == null) {
            return clearBuildFingerprint.IAuthTabCallback;
        }
        return new clearLogBuffers(new Function0() { // from class: kotlin.sequences.SequencesKt__SequencesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clearSelinuxLabel.onExtraCallbackWithResult(t);
            }
        }, function1);
    }

    public static <T> Sequence<T> onNavigationEvent(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearLogBuffers(function0, function1);
    }
}
