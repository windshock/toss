package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TombstoneProtosSignalOrBuilder;
import o.access13600;
import o.access13700;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface CoroutineContext {

    public interface onExtraCallback<E extends Element> {
    }

    <R> R fold(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    <E extends Element> E get(@NotNull onExtraCallback<E> onextracallback);

    CoroutineContext minusKey(@NotNull onExtraCallback<?> onextracallback);

    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);

    public static final class onNavigationEvent {
        public static CoroutineContext onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
            Intrinsics.checkNotNullParameter(coroutineContext2, "");
            return coroutineContext2 == access13600.IAuthTabCallback ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, new Function2() { // from class: kotlin.coroutines.CoroutineContext$DefaultImpls$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.onNavigationEvent.onExtraCallback((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static CoroutineContext onExtraCallback(CoroutineContext coroutineContext, Element element) {
            Intrinsics.checkNotNullParameter(coroutineContext, "");
            Intrinsics.checkNotNullParameter(element, "");
            CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element.getKey());
            access13600 access13600Var = access13600.IAuthTabCallback;
            if (coroutineContextMinusKey == access13600Var) {
                return element;
            }
            access13700.onWarmupCompleted onwarmupcompleted = access13700.onWarmupCompleted;
            access13700 access13700Var = (access13700) coroutineContextMinusKey.get(onwarmupcompleted);
            if (access13700Var == null) {
                return new TombstoneProtosSignalOrBuilder(coroutineContextMinusKey, element);
            }
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(onwarmupcompleted);
            if (coroutineContextMinusKey2 == access13600Var) {
                return new TombstoneProtosSignalOrBuilder(element, access13700Var);
            }
            return new TombstoneProtosSignalOrBuilder(new TombstoneProtosSignalOrBuilder(coroutineContextMinusKey2, element), access13700Var);
        }
    }

    public interface Element extends CoroutineContext {
        @Override // kotlin.coroutines.CoroutineContext
        <E extends Element> E get(@NotNull onExtraCallback<E> onextracallback);

        onExtraCallback<?> getKey();

        public static final class onNavigationEvent {
            public static CoroutineContext onExtraCallbackWithResult(@NotNull Element element, @NotNull CoroutineContext coroutineContext) {
                Intrinsics.checkNotNullParameter(coroutineContext, "");
                return onNavigationEvent.onExtraCallback(element, coroutineContext);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends Element> E onExtraCallback(@NotNull Element element, @NotNull onExtraCallback<E> onextracallback) {
                Intrinsics.checkNotNullParameter(onextracallback, "");
                if (!Intrinsics.areEqual(element.getKey(), onextracallback)) {
                    return null;
                }
                Intrinsics.checkNotNull(element, "");
                return element;
            }

            public static <R> R onExtraCallback(@NotNull Element element, R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2) {
                Intrinsics.checkNotNullParameter(function2, "");
                return function2.invoke(r, element);
            }

            public static CoroutineContext onNavigationEvent(@NotNull Element element, @NotNull onExtraCallback<?> onextracallback) {
                Intrinsics.checkNotNullParameter(onextracallback, "");
                return Intrinsics.areEqual(element.getKey(), onextracallback) ? access13600.IAuthTabCallback : element;
            }
        }
    }
}
