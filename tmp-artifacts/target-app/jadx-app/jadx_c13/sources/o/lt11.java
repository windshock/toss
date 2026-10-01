package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.lt11;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt11<T> implements lt1<T> {
    private final List<onNavigationEvent<T, ? extends Object>> IAuthTabCallback;
    private final getPlayDelayedELExpressTimeS<T> onExtraCallback;
    private final String onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public lt11(@NotNull String str, @NotNull getPlayDelayedELExpressTimeS<? super T> getplaydelayedelexpresstimes) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
        this.onNavigationEvent = str;
        this.onExtraCallback = getplaydelayedelexpresstimes;
        List listIAuthTabCallback = lt21.IAuthTabCallback(getplaydelayedelexpresstimes);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
        Iterator<T> it = listIAuthTabCallback.iterator();
        while (it.hasNext()) {
            arrayList.add(((setLottieClicklistener) it.next()).onExtraCallbackWithResult());
        }
        List listDistinct = CollectionsKt___CollectionsKt.distinct(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator<T> it2 = listDistinct.iterator();
        while (it2.hasNext()) {
            arrayList2.add(onNavigationEvent.Companion.onWarmupCompleted((setLottieAnimListener) it2.next()));
        }
        this.IAuthTabCallback = arrayList2;
    }

    public final getPlayDelayedELExpressTimeS<T> IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public String toString() {
        return "Optional(" + this.onNavigationEvent + ", " + this.onExtraCallback + ')';
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof lt11)) {
            return false;
        }
        lt11 lt11Var = (lt11) obj;
        return Intrinsics.areEqual(this.onNavigationEvent, lt11Var.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, lt11Var.onExtraCallback);
    }

    public int hashCode() {
        return (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode();
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ulsya<T> onExtraCallback() {
        List listListOf;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        ulsya<T> ulsyaVarOnExtraCallback = this.onExtraCallback.onExtraCallback();
        ulsya<T> ulsyaVarOnExtraCallback2 = new jw8(this.onNavigationEvent).onExtraCallback();
        if (this.IAuthTabCallback.isEmpty()) {
            listListOf = CollectionsKt__CollectionsKt.emptyList();
        } else {
            listListOf = CollectionsKt__CollectionsJVMKt.listOf(new ycxlud(new Function1() { // from class: kotlinx.datetime.internal.format.OptionalFormatStructure$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return lt11.IAuthTabCallback(this.f$0, obj);
                }
            }));
        }
        return new ulsya<>(listEmptyList, CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{ulsyaVarOnExtraCallback, ycxdj.onExtraCallback(CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{ulsyaVarOnExtraCallback2, new ulsya(listListOf, CollectionsKt__CollectionsKt.emptyList())}))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(lt11 lt11Var, Object obj) {
        for (onNavigationEvent<T, ? extends Object> onnavigationevent : lt11Var.IAuthTabCallback) {
            ((onNavigationEvent) onnavigationevent).onExtraCallback.onWarmupCompleted(obj, ((onNavigationEvent) onnavigationevent).onExtraCallbackWithResult);
        }
        return Unit.INSTANCE;
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ltlud<T> onExtraCallbackWithResult() {
        ltlud<T> ltludVarOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        List<onNavigationEvent<T, ? extends Object>> list = this.IAuthTabCallback;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) it.next();
            arrayList.add(new jw7(onnavigationevent.onExtraCallbackWithResult, new onNavigationEvent.onExtraCallback(onnavigationevent.onExtraCallback)));
        }
        lt5 lt5VarOnExtraCallback = lt3.onExtraCallback(arrayList);
        if (lt5VarOnExtraCallback instanceof lt8) {
            return new ltsya(this.onNavigationEvent);
        }
        return new lt71(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{getWrite.IAuthTabCallback(new onExtraCallback(lt5VarOnExtraCallback), new ltsya(this.onNavigationEvent)), getWrite.IAuthTabCallback(new onWarmupCompleted(lt8.IAuthTabCallback), ltludVarOnExtraCallbackWithResult)}));
    }

    final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<T, Boolean> {
        onExtraCallback(Object obj) {
            super(1, obj, lt5.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t) {
            return Boolean.valueOf(((lt5) this.receiver).onExtraCallbackWithResult(t));
        }
    }

    final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<Object, Boolean> {
        onWarmupCompleted(Object obj) {
            super(1, obj, lt8.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((lt8) this.receiver).onExtraCallbackWithResult(obj));
        }
    }

    static final class onNavigationEvent<T, E> {
        public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
        private final jw4<T, E> onExtraCallback;
        private final E onExtraCallbackWithResult;

        public /* synthetic */ onNavigationEvent(jw4 jw4Var, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(jw4Var, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private onNavigationEvent(jw4<? super T, E> jw4Var, E e) {
            this.onExtraCallback = jw4Var;
            this.onExtraCallbackWithResult = e;
        }

        public static final class onExtraCallbackWithResult {
            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }

            public final <T, E> onNavigationEvent<T, E> onWarmupCompleted(@NotNull setLottieAnimListener<? super T, E> setlottieanimlistener) {
                Intrinsics.checkNotNullParameter(setlottieanimlistener, "");
                E eOnExtraCallbackWithResult = setlottieanimlistener.onExtraCallbackWithResult();
                if (eOnExtraCallbackWithResult == null) {
                    throw new IllegalArgumentException(("The field '" + setlottieanimlistener.IAuthTabCallback() + "' does not define a default value").toString());
                }
                return new onNavigationEvent<>(setlottieanimlistener.onExtraCallback(), eOnExtraCallbackWithResult, null);
            }
        }

        public final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<T, E> {
            public onExtraCallback(Object obj) {
                super(1, obj, jw4.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final E invoke(T t) {
                return (E) ((jw4) this.receiver).onNavigationEvent(t);
            }
        }
    }
}
