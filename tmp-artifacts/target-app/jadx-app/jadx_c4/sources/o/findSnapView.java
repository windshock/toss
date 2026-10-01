package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class findSnapView<STATE, EVENT, SIDE_EFFECT> {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final AtomicReference<STATE> IAuthTabCallback;
    private final onExtraCallback<STATE, EVENT, SIDE_EFFECT> onExtraCallback;

    private findSnapView(onExtraCallback<STATE, EVENT, SIDE_EFFECT> onextracallback) {
        this.onExtraCallback = onextracallback;
        this.IAuthTabCallback = new AtomicReference<>(onextracallback.onWarmupCompleted());
    }

    public /* synthetic */ findSnapView(onExtraCallback onextracallback, DefaultConstructorMarker defaultConstructorMarker) {
        this(onextracallback);
    }

    public final STATE onWarmupCompleted() {
        STATE state = this.IAuthTabCallback.get();
        Intrinsics.checkExpressionValueIsNotNull(state, "");
        return state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IAuthTabCallback<STATE, EVENT, SIDE_EFFECT> onExtraCallback(@NotNull EVENT event) {
        IAuthTabCallback<STATE, EVENT, SIDE_EFFECT> IAuthTabCallback2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(event, "");
        synchronized (this) {
            STATE state = this.IAuthTabCallback.get();
            Intrinsics.checkExpressionValueIsNotNull(state, "");
            IAuthTabCallback2 = IAuthTabCallback(state, event);
            z = IAuthTabCallback2 instanceof IAuthTabCallback.onExtraCallback;
            if (z) {
                this.IAuthTabCallback.set(((IAuthTabCallback.onExtraCallback) IAuthTabCallback2).IAuthTabCallback());
            }
        }
        onWarmupCompleted(IAuthTabCallback2);
        if (z) {
            IAuthTabCallback.onExtraCallback onextracallback = (IAuthTabCallback.onExtraCallback) IAuthTabCallback2;
            onExtraCallback(onextracallback.onWarmupCompleted(), event);
            onNavigationEvent(onextracallback.IAuthTabCallback(), event);
        }
        return IAuthTabCallback2;
    }

    private final IAuthTabCallback<STATE, EVENT, SIDE_EFFECT> IAuthTabCallback(@NotNull STATE state, EVENT event) {
        for (Map.Entry<onWarmupCompleted<EVENT, EVENT>, Function2<STATE, EVENT, onExtraCallback.onExtraCallbackWithResult.onNavigationEvent<STATE, SIDE_EFFECT>>> entry : IAuthTabCallback(state).onNavigationEvent().entrySet()) {
            onWarmupCompleted<EVENT, EVENT> key = entry.getKey();
            Function2<STATE, EVENT, onExtraCallback.onExtraCallbackWithResult.onNavigationEvent<STATE, SIDE_EFFECT>> value = entry.getValue();
            if (key.onWarmupCompleted(event)) {
                onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) value.invoke(state, event);
                return new IAuthTabCallback.onExtraCallback(state, event, onnavigationevent.onExtraCallbackWithResult(), onnavigationevent.IAuthTabCallback());
            }
        }
        return new IAuthTabCallback.onExtraCallbackWithResult(state, event);
    }

    private final onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT> IAuthTabCallback(@NotNull STATE state) {
        Map<onWarmupCompleted<STATE, STATE>, onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> mapOnExtraCallback = this.onExtraCallback.onExtraCallback();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<onWarmupCompleted<STATE, STATE>, onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> entry : mapOnExtraCallback.entrySet()) {
            if (entry.getKey().onWarmupCompleted(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((onExtraCallback.onExtraCallbackWithResult) ((Map.Entry) it.next()).getValue());
        }
        onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT> onextracallbackwithresult = (onExtraCallback.onExtraCallbackWithResult) CollectionsKt.firstOrNull(arrayList);
        if (onextracallbackwithresult != null) {
            return onextracallbackwithresult;
        }
        throw new IllegalStateException(("Missing definition for state " + state.getClass().getSimpleName() + '!').toString());
    }

    private final void onNavigationEvent(@NotNull STATE state, EVENT event) {
        Iterator<T> it = IAuthTabCallback(state).onWarmupCompleted().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    private final void onExtraCallback(@NotNull STATE state, EVENT event) {
        Iterator<T> it = IAuthTabCallback(state).onExtraCallbackWithResult().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    private final void onWarmupCompleted(@NotNull IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> iAuthTabCallback) {
        Iterator<T> it = this.onExtraCallback.onNavigationEvent().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(iAuthTabCallback);
        }
    }

    public static abstract class IAuthTabCallback<STATE, EVENT, SIDE_EFFECT> {
        public abstract EVENT onExtraCallbackWithResult();

        public abstract STATE onWarmupCompleted();

        private IAuthTabCallback() {
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class onExtraCallback<STATE, EVENT, SIDE_EFFECT> extends IAuthTabCallback<STATE, EVENT, SIDE_EFFECT> {
            private final EVENT IAuthTabCallback;
            private final STATE onExtraCallback;
            private final SIDE_EFFECT onExtraCallbackWithResult;
            private final STATE onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallback)) {
                    return false;
                }
                onExtraCallback onextracallback = (onExtraCallback) obj;
                return Intrinsics.areEqual(onWarmupCompleted(), onextracallback.onWarmupCompleted()) && Intrinsics.areEqual(onExtraCallbackWithResult(), onextracallback.onExtraCallbackWithResult()) && Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult);
            }

            public int hashCode() {
                STATE stateOnWarmupCompleted = onWarmupCompleted();
                int iHashCode = stateOnWarmupCompleted != null ? stateOnWarmupCompleted.hashCode() : 0;
                EVENT eventOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int iHashCode2 = eventOnExtraCallbackWithResult != null ? eventOnExtraCallbackWithResult.hashCode() : 0;
                STATE state = this.onNavigationEvent;
                int iHashCode3 = state != null ? state.hashCode() : 0;
                SIDE_EFFECT side_effect = this.onExtraCallbackWithResult;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (side_effect != null ? side_effect.hashCode() : 0);
            }

            public String toString() {
                return "Valid(fromState=" + onWarmupCompleted() + ", event=" + onExtraCallbackWithResult() + ", toState=" + this.onNavigationEvent + ", sideEffect=" + this.onExtraCallbackWithResult + ")";
            }

            @Override // o.findSnapView.IAuthTabCallback
            public STATE onWarmupCompleted() {
                return this.onExtraCallback;
            }

            @Override // o.findSnapView.IAuthTabCallback
            public EVENT onExtraCallbackWithResult() {
                return this.IAuthTabCallback;
            }

            public final STATE IAuthTabCallback() {
                return this.onNavigationEvent;
            }

            public final SIDE_EFFECT onExtraCallback() {
                return this.onExtraCallbackWithResult;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(@NotNull STATE state, @NotNull EVENT event, @NotNull STATE state2, @Nullable SIDE_EFFECT side_effect) {
                super(null);
                Intrinsics.checkParameterIsNotNull(state, "");
                Intrinsics.checkParameterIsNotNull(event, "");
                Intrinsics.checkParameterIsNotNull(state2, "");
                this.onExtraCallback = state;
                this.IAuthTabCallback = event;
                this.onNavigationEvent = state2;
                this.onExtraCallbackWithResult = side_effect;
            }
        }

        public static final class onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT> extends IAuthTabCallback<STATE, EVENT, SIDE_EFFECT> {
            private final STATE onNavigationEvent;
            private final EVENT onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
                return Intrinsics.areEqual(onWarmupCompleted(), onextracallbackwithresult.onWarmupCompleted()) && Intrinsics.areEqual(onExtraCallbackWithResult(), onextracallbackwithresult.onExtraCallbackWithResult());
            }

            public int hashCode() {
                STATE stateOnWarmupCompleted = onWarmupCompleted();
                int iHashCode = stateOnWarmupCompleted != null ? stateOnWarmupCompleted.hashCode() : 0;
                EVENT eventOnExtraCallbackWithResult = onExtraCallbackWithResult();
                return (iHashCode * 31) + (eventOnExtraCallbackWithResult != null ? eventOnExtraCallbackWithResult.hashCode() : 0);
            }

            public String toString() {
                return "Invalid(fromState=" + onWarmupCompleted() + ", event=" + onExtraCallbackWithResult() + ")";
            }

            @Override // o.findSnapView.IAuthTabCallback
            public STATE onWarmupCompleted() {
                return this.onNavigationEvent;
            }

            @Override // o.findSnapView.IAuthTabCallback
            public EVENT onExtraCallbackWithResult() {
                return this.onWarmupCompleted;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(@NotNull STATE state, @NotNull EVENT event) {
                super(null);
                Intrinsics.checkParameterIsNotNull(state, "");
                Intrinsics.checkParameterIsNotNull(event, "");
                this.onNavigationEvent = state;
                this.onWarmupCompleted = event;
            }
        }
    }

    public static final class onExtraCallback<STATE, EVENT, SIDE_EFFECT> {
        private final List<Function1<IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> IAuthTabCallback;
        private final STATE onExtraCallbackWithResult;
        private final Map<onWarmupCompleted<STATE, STATE>, onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent) && Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback);
        }

        public int hashCode() {
            STATE state = this.onExtraCallbackWithResult;
            int iHashCode = state != null ? state.hashCode() : 0;
            Map<onWarmupCompleted<STATE, STATE>, onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> map = this.onNavigationEvent;
            int iHashCode2 = map != null ? map.hashCode() : 0;
            List<Function1<IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> list = this.IAuthTabCallback;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Graph(initialState=" + this.onExtraCallbackWithResult + ", stateDefinitions=" + this.onNavigationEvent + ", onTransitionListeners=" + this.IAuthTabCallback + ")";
        }

        public onExtraCallback(@NotNull STATE state, @NotNull Map<onWarmupCompleted<STATE, STATE>, onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> map, @NotNull List<? extends Function1<? super IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> list) {
            Intrinsics.checkParameterIsNotNull(state, "");
            Intrinsics.checkParameterIsNotNull(map, "");
            Intrinsics.checkParameterIsNotNull(list, "");
            this.onExtraCallbackWithResult = state;
            this.onNavigationEvent = map;
            this.IAuthTabCallback = list;
        }

        public final STATE onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        public final Map<onWarmupCompleted<STATE, STATE>, onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> onExtraCallback() {
            return this.onNavigationEvent;
        }

        public final List<Function1<IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public static final class onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT> {
            private final List<Function2<STATE, EVENT, Unit>> onNavigationEvent = new ArrayList();
            private final List<Function2<STATE, EVENT, Unit>> onWarmupCompleted = new ArrayList();
            private final LinkedHashMap<onWarmupCompleted<EVENT, EVENT>, Function2<STATE, EVENT, onNavigationEvent<STATE, SIDE_EFFECT>>> onExtraCallbackWithResult = new LinkedHashMap<>();

            public final List<Function2<STATE, EVENT, Unit>> onWarmupCompleted() {
                return this.onNavigationEvent;
            }

            public final List<Function2<STATE, EVENT, Unit>> onExtraCallbackWithResult() {
                return this.onWarmupCompleted;
            }

            public final LinkedHashMap<onWarmupCompleted<EVENT, EVENT>, Function2<STATE, EVENT, onNavigationEvent<STATE, SIDE_EFFECT>>> onNavigationEvent() {
                return this.onExtraCallbackWithResult;
            }

            public static final class onNavigationEvent<STATE, SIDE_EFFECT> {
                private final STATE IAuthTabCallback;
                private final SIDE_EFFECT onExtraCallback;

                public final SIDE_EFFECT IAuthTabCallback() {
                    return this.onExtraCallback;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof onNavigationEvent)) {
                        return false;
                    }
                    onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                    return Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback);
                }

                public int hashCode() {
                    STATE state = this.IAuthTabCallback;
                    int iHashCode = state != null ? state.hashCode() : 0;
                    SIDE_EFFECT side_effect = this.onExtraCallback;
                    return (iHashCode * 31) + (side_effect != null ? side_effect.hashCode() : 0);
                }

                public final STATE onExtraCallbackWithResult() {
                    return this.IAuthTabCallback;
                }

                public String toString() {
                    return "TransitionTo(toState=" + this.IAuthTabCallback + ", sideEffect=" + this.onExtraCallback + ")";
                }

                public onNavigationEvent(@NotNull STATE state, @Nullable SIDE_EFFECT side_effect) {
                    Intrinsics.checkParameterIsNotNull(state, "");
                    this.IAuthTabCallback = state;
                    this.onExtraCallback = side_effect;
                }
            }
        }
    }

    public static final class onWarmupCompleted<T, R extends T> {
        public static final onNavigationEvent Companion = new onNavigationEvent(null);
        private final List<Function1<T, Boolean>> onExtraCallback;
        private final Class<R> onExtraCallbackWithResult;

        static final class onExtraCallback extends Lambda implements Function1<T, Boolean> {
            onExtraCallback() {
                super(1);
            }

            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(onExtraCallback(obj));
            }

            public final boolean onExtraCallback(@NotNull T t) {
                Intrinsics.checkParameterIsNotNull(t, "");
                return onWarmupCompleted.this.onExtraCallbackWithResult.isInstance(t);
            }
        }

        private onWarmupCompleted(Class<R> cls) {
            this.onExtraCallbackWithResult = cls;
            this.onExtraCallback = CollectionsKt.mutableListOf(new Function1[]{new onExtraCallback()});
        }

        public /* synthetic */ onWarmupCompleted(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
            this(cls);
        }

        public final boolean onWarmupCompleted(@NotNull T t) {
            Intrinsics.checkParameterIsNotNull(t, "");
            List<Function1<T, Boolean>> list = this.onExtraCallback;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Function1) it.next()).invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public static final class onNavigationEvent {
            private onNavigationEvent() {
            }

            public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T, R extends T> onWarmupCompleted<T, R> onWarmupCompleted(@NotNull Class<R> cls) {
                Intrinsics.checkParameterIsNotNull(cls, "");
                return new onWarmupCompleted<>(cls, null);
            }
        }
    }

    public static final class onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT> {
        private final LinkedHashMap<onWarmupCompleted<STATE, STATE>, onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> IAuthTabCallback;
        private STATE onExtraCallbackWithResult;
        private final ArrayList<Function1<IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onNavigationEvent;

        /* JADX WARN: Illegal instructions before constructor call */
        public onExtraCallbackWithResult() {
            onExtraCallback onextracallback = null;
            this(onextracallback, 1, onextracallback);
        }

        public onExtraCallbackWithResult(@Nullable onExtraCallback<STATE, EVENT, SIDE_EFFECT> onextracallback) {
            List<Function1<IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> listOnNavigationEvent;
            Map<onWarmupCompleted<STATE, STATE>, onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> mapOnExtraCallback;
            this.onExtraCallbackWithResult = onextracallback != null ? onextracallback.onWarmupCompleted() : null;
            this.IAuthTabCallback = new LinkedHashMap<>((onextracallback == null || (mapOnExtraCallback = onextracallback.onExtraCallback()) == null) ? access8100.onNavigationEvent() : mapOnExtraCallback);
            this.onNavigationEvent = new ArrayList<>((onextracallback == null || (listOnNavigationEvent = onextracallback.onNavigationEvent()) == null) ? CollectionsKt.emptyList() : listOnNavigationEvent);
        }

        public /* synthetic */ onExtraCallbackWithResult(onExtraCallback onextracallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : onextracallback);
        }

        public final void onNavigationEvent(@NotNull STATE state) {
            Intrinsics.checkParameterIsNotNull(state, "");
            this.onExtraCallbackWithResult = state;
        }

        public final <S extends STATE> void onExtraCallbackWithResult(@NotNull onWarmupCompleted<STATE, ? extends S> onwarmupcompleted, @NotNull Function1<? super onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>.onExtraCallback<S>, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(onwarmupcompleted, "");
            Intrinsics.checkParameterIsNotNull(function1, "");
            LinkedHashMap<onWarmupCompleted<STATE, STATE>, onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.IAuthTabCallback;
            onExtraCallback onextracallback = new onExtraCallback();
            function1.invoke(onextracallback);
            linkedHashMap.put(onwarmupcompleted, onextracallback.onNavigationEvent());
        }

        public final void IAuthTabCallback(@NotNull Function1<? super IAuthTabCallback<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "");
            this.onNavigationEvent.add(function1);
        }

        public final onExtraCallback<STATE, EVENT, SIDE_EFFECT> onWarmupCompleted() {
            STATE state = this.onExtraCallbackWithResult;
            if (state != null) {
                return new onExtraCallback<>(state, access8100.IAuthTabCallback(this.IAuthTabCallback), CollectionsKt.toList(this.onNavigationEvent));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public final class onExtraCallback<S extends STATE> {
            private final onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT> onNavigationEvent = new onExtraCallback.onExtraCallbackWithResult<>();

            static final class IAuthTabCallback extends Lambda implements Function2<STATE, EVENT, Unit> {
                final /* synthetic */ Function2 $listener$inlined;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IAuthTabCallback(Function2 function2) {
                    super(2);
                    this.$listener$inlined = function2;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    onExtraCallbackWithResult(obj, obj2);
                    return Unit.INSTANCE;
                }

                public final void onExtraCallbackWithResult(@NotNull STATE state, @NotNull EVENT event) {
                    Intrinsics.checkParameterIsNotNull(state, "");
                    Intrinsics.checkParameterIsNotNull(event, "");
                    this.$listener$inlined.invoke(state, event);
                }
            }

            /* renamed from: o.findSnapView$onExtraCallbackWithResult$onExtraCallback$onExtraCallbackWithResult, reason: collision with other inner class name */
            static final class C0025onExtraCallbackWithResult extends Lambda implements Function2<STATE, EVENT, Unit> {
                final /* synthetic */ Function2 $listener$inlined;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0025onExtraCallbackWithResult(Function2 function2) {
                    super(2);
                    this.$listener$inlined = function2;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    IAuthTabCallback(obj, obj2);
                    return Unit.INSTANCE;
                }

                public final void IAuthTabCallback(@NotNull STATE state, @NotNull EVENT event) {
                    Intrinsics.checkParameterIsNotNull(state, "");
                    Intrinsics.checkParameterIsNotNull(event, "");
                    this.$listener$inlined.invoke(state, event);
                }
            }

            public onExtraCallback() {
            }

            public final <E extends EVENT> void onWarmupCompleted(@NotNull onWarmupCompleted<EVENT, ? extends E> onwarmupcompleted, @NotNull Function2<? super S, ? super E, ? extends onExtraCallback.onExtraCallbackWithResult.onNavigationEvent<? extends STATE, ? extends SIDE_EFFECT>> function2) {
                Intrinsics.checkParameterIsNotNull(onwarmupcompleted, "");
                Intrinsics.checkParameterIsNotNull(function2, "");
                this.onNavigationEvent.onNavigationEvent().put(onwarmupcompleted, new onWarmupCompleted(function2));
            }

            static final class onWarmupCompleted extends Lambda implements Function2<STATE, EVENT, onExtraCallback.onExtraCallbackWithResult.onNavigationEvent<? extends STATE, ? extends SIDE_EFFECT>> {
                final /* synthetic */ Function2 $createTransitionTo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                onWarmupCompleted(Function2 function2) {
                    super(2);
                    this.$createTransitionTo = function2;
                }

                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final onExtraCallback.onExtraCallbackWithResult.onNavigationEvent<STATE, SIDE_EFFECT> invoke(@NotNull STATE state, @NotNull EVENT event) {
                    Intrinsics.checkParameterIsNotNull(state, "");
                    Intrinsics.checkParameterIsNotNull(event, "");
                    return (onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) this.$createTransitionTo.invoke(state, event);
                }
            }

            public final boolean onNavigationEvent(@NotNull Function2<? super S, ? super EVENT, Unit> function2) {
                Intrinsics.checkParameterIsNotNull(function2, "");
                return this.onNavigationEvent.onWarmupCompleted().add(new IAuthTabCallback(function2));
            }

            public final boolean onExtraCallbackWithResult(@NotNull Function2<? super S, ? super EVENT, Unit> function2) {
                Intrinsics.checkParameterIsNotNull(function2, "");
                return this.onNavigationEvent.onExtraCallbackWithResult().add(new C0025onExtraCallbackWithResult(function2));
            }

            public final onExtraCallback.onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT> onNavigationEvent() {
                return this.onNavigationEvent;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(onExtraCallback onextracallback, Object obj, Object obj2, Object obj3, int i, Object obj4) {
                if ((i & 2) != 0) {
                    obj3 = null;
                }
                return onextracallback.onWarmupCompleted(obj, obj2, obj3);
            }

            public final onExtraCallback.onExtraCallbackWithResult.onNavigationEvent<STATE, SIDE_EFFECT> onWarmupCompleted(@NotNull S s, @NotNull STATE state, @Nullable SIDE_EFFECT side_effect) {
                Intrinsics.checkParameterIsNotNull(s, "");
                Intrinsics.checkParameterIsNotNull(state, "");
                return new onExtraCallback.onExtraCallbackWithResult.onNavigationEvent<>(state, side_effect);
            }
        }
    }

    public static final class onNavigationEvent {
        private onNavigationEvent() {
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <STATE, EVENT, SIDE_EFFECT> findSnapView<STATE, EVENT, SIDE_EFFECT> onNavigationEvent(@NotNull Function1<? super onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "");
            return onExtraCallbackWithResult(null, function1);
        }

        private final <STATE, EVENT, SIDE_EFFECT> findSnapView<STATE, EVENT, SIDE_EFFECT> onExtraCallbackWithResult(onExtraCallback<STATE, EVENT, SIDE_EFFECT> onextracallback, Function1<? super onExtraCallbackWithResult<STATE, EVENT, SIDE_EFFECT>, Unit> function1) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(onextracallback);
            function1.invoke(onextracallbackwithresult);
            return new findSnapView<>(onextracallbackwithresult.onWarmupCompleted(), null);
        }
    }
}
