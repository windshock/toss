package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.lt7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt7<T> implements lt1<T> {
    private final getPlayDelayedELExpressTimeS<T> IAuthTabCallback;
    private final Set<getGlobalEvent<T>> onExtraCallback;
    private final boolean onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public lt7(@NotNull getPlayDelayedELExpressTimeS<? super T> getplaydelayedelexpresstimes, boolean z) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
        this.IAuthTabCallback = getplaydelayedelexpresstimes;
        this.onExtraCallbackWithResult = z;
        List listIAuthTabCallback = lt21.IAuthTabCallback(getplaydelayedelexpresstimes);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listIAuthTabCallback.iterator();
        while (it.hasNext()) {
            getGlobalEvent getglobaleventOnWarmupCompleted = ((setLottieClicklistener) it.next()).onExtraCallbackWithResult().onWarmupCompleted();
            if (getglobaleventOnWarmupCompleted != null) {
                arrayList.add(getglobaleventOnWarmupCompleted);
            }
        }
        Set<getGlobalEvent<T>> set = CollectionsKt___CollectionsKt.toSet(arrayList);
        this.onExtraCallback = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    public final getPlayDelayedELExpressTimeS<T> IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return "SignedFormatStructure(" + this.IAuthTabCallback + ')';
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof lt7)) {
            return false;
        }
        lt7 lt7Var = (lt7) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, lt7Var.IAuthTabCallback) && this.onExtraCallbackWithResult == lt7Var.onExtraCallbackWithResult;
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ulsya<T> onExtraCallback() {
        return ycxdj.onExtraCallback(CollectionsKt__CollectionsKt.listOf((Object[]) new ulsya[]{new ulsya(CollectionsKt__CollectionsJVMKt.listOf(new ycxExternalSyntheticApiModelOutline1(new Function2() { // from class: kotlinx.datetime.internal.format.SignedFormatStructure$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return lt7.onExtraCallbackWithResult(this.f$0, obj, ((Boolean) obj2).booleanValue());
            }
        }, this.onExtraCallbackWithResult, "sign for " + this.onExtraCallback)), CollectionsKt__CollectionsKt.emptyList()), this.IAuthTabCallback.onExtraCallback()}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(lt7 lt7Var, Object obj, boolean z) {
        for (getGlobalEvent<T> getglobalevent : lt7Var.onExtraCallback) {
            getglobalevent.onNavigationEvent().onWarmupCompleted(obj, Boolean.valueOf(z != Intrinsics.areEqual(getglobalevent.onNavigationEvent().onNavigationEvent(obj), Boolean.TRUE)));
        }
        return Unit.INSTANCE;
    }

    @Override // o.getPlayDelayedELExpressTimeS
    public ltlud<T> onExtraCallbackWithResult() {
        return new getAnimatedFraction(this.IAuthTabCallback.onExtraCallbackWithResult(), new onExtraCallback(this), this.onExtraCallbackWithResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean IAuthTabCallback(lt7<? super T> lt7Var, T t) {
        boolean z = false;
        for (getGlobalEvent<? super T> getglobalevent : ((lt7) lt7Var).onExtraCallback) {
            if (Intrinsics.areEqual(getglobalevent.onNavigationEvent().onNavigationEvent(t), Boolean.TRUE)) {
                z = true;
            } else if (!getglobalevent.IAuthTabCallback(t)) {
                return false;
            }
        }
        return z;
    }

    final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<T, Boolean> {
        final /* synthetic */ lt7<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(lt7<? super T> lt7Var) {
            super(1, Intrinsics.Kotlin.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.this$0 = lt7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t) {
            return Boolean.valueOf(lt7.IAuthTabCallback(this.this$0, t));
        }
    }
}
