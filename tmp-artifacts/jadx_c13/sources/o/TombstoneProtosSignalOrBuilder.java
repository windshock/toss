package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CombinedContext$;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.TombstoneProtosSignalOrBuilder;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosSignalOrBuilder implements CoroutineContext, Serializable {
    private final CoroutineContext.Element element;
    private final CoroutineContext left;

    public TombstoneProtosSignalOrBuilder(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(element, "");
        this.left = coroutineContext;
        this.element = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.onNavigationEvent.onExtraCallback(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        TombstoneProtosSignalOrBuilder tombstoneProtosSignalOrBuilder = this;
        while (true) {
            E e = (E) tombstoneProtosSignalOrBuilder.element.get(onextracallback);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = tombstoneProtosSignalOrBuilder.left;
            if (coroutineContext instanceof TombstoneProtosSignalOrBuilder) {
                tombstoneProtosSignalOrBuilder = (TombstoneProtosSignalOrBuilder) coroutineContext;
            } else {
                return (E) coroutineContext.get(onextracallback);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return function2.invoke((Object) this.left.fold(r, function2), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if (this.element.get(onextracallback) != null) {
            return this.left;
        }
        CoroutineContext coroutineContextMinusKey = this.left.minusKey(onextracallback);
        return coroutineContextMinusKey == this.left ? this : coroutineContextMinusKey == access13600.IAuthTabCallback ? this.element : new TombstoneProtosSignalOrBuilder(coroutineContextMinusKey, this.element);
    }

    private final int onNavigationEvent() {
        int i = 2;
        TombstoneProtosSignalOrBuilder tombstoneProtosSignalOrBuilder = this;
        while (true) {
            CoroutineContext coroutineContext = tombstoneProtosSignalOrBuilder.left;
            tombstoneProtosSignalOrBuilder = coroutineContext instanceof TombstoneProtosSignalOrBuilder ? (TombstoneProtosSignalOrBuilder) coroutineContext : null;
            if (tombstoneProtosSignalOrBuilder == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean onExtraCallbackWithResult(CoroutineContext.Element element) {
        return Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean onExtraCallbackWithResult(TombstoneProtosSignalOrBuilder tombstoneProtosSignalOrBuilder) {
        while (onExtraCallbackWithResult(tombstoneProtosSignalOrBuilder.element)) {
            CoroutineContext coroutineContext = tombstoneProtosSignalOrBuilder.left;
            if (coroutineContext instanceof TombstoneProtosSignalOrBuilder) {
                tombstoneProtosSignalOrBuilder = (TombstoneProtosSignalOrBuilder) coroutineContext;
            } else {
                Intrinsics.checkNotNull(coroutineContext, "");
                return onExtraCallbackWithResult((CoroutineContext.Element) coroutineContext);
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TombstoneProtosSignalOrBuilder)) {
            return false;
        }
        TombstoneProtosSignalOrBuilder tombstoneProtosSignalOrBuilder = (TombstoneProtosSignalOrBuilder) obj;
        return tombstoneProtosSignalOrBuilder.onNavigationEvent() == onNavigationEvent() && tombstoneProtosSignalOrBuilder.onExtraCallbackWithResult(this);
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public String toString() {
        return '[' + ((String) fold(_UrlKt.FRAGMENT_ENCODE_SET, new Function2() { // from class: kotlin.coroutines.CombinedContext$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TombstoneProtosSignalOrBuilder.IAuthTabCallback((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IAuthTabCallback(String str, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(element, "");
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }

    private final Object writeReplace() {
        int iOnNavigationEvent = onNavigationEvent();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iOnNavigationEvent];
        Ref.IntRef intRef = new Ref.IntRef();
        fold(Unit.INSTANCE, new CombinedContext$.ExternalSyntheticLambda0(coroutineContextArr, intRef));
        if (intRef.element != iOnNavigationEvent) {
            throw new IllegalStateException("Check failed.");
        }
        return new onWarmupCompleted(coroutineContextArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef, Unit unit, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(element, "");
        int i = intRef.element;
        intRef.element = i + 1;
        coroutineContextArr[i] = element;
        return Unit.INSTANCE;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
