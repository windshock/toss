package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getScoreCountWithIcon<T> implements ea12<T> {
    private final Function2<KClass<Object>, List<? extends access5900>, KSerializer<T>> IAuthTabCallback;
    private final getTimedown<getAlphaColor<T>> onWarmupCompleted;

    public static final class onWarmupCompleted implements Function0<T> {
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new getAlphaColor();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getScoreCountWithIcon(@NotNull Function2<? super KClass<Object>, ? super List<? extends access5900>, ? extends KSerializer<T>> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback = function2;
        this.onWarmupCompleted = new getTimedown<>();
    }

    @Override // o.ea12
    public Object onWarmupCompleted(@NotNull KClass<Object> kClass, @NotNull List<? extends access5900> list) {
        Object objM31constructorimpl;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        getAlphaColor<T> getalphacolor = this.onWarmupCompleted.get(clearRegisters.onNavigationEvent(kClass));
        Intrinsics.checkNotNullExpressionValue(getalphacolor, "");
        setDiffuseWidth setdiffusewidth = (setDiffuseWidth) getalphacolor;
        T t = setdiffusewidth.onNavigationEvent.get();
        if (t == null) {
            t = (T) setdiffusewidth.onExtraCallbackWithResult(new onWarmupCompleted());
        }
        getAlphaColor getalphacolor2 = t;
        List<? extends access5900> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new lud5((access5900) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = getalphacolor2.onWarmupCompleted;
        Object objIAuthTabCallback = concurrentHashMap.get(arrayList);
        if (objIAuthTabCallback == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(this.IAuthTabCallback.invoke(kClass, list));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            objIAuthTabCallback = Result.IAuthTabCallback(objM31constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, objIAuthTabCallback);
            if (objPutIfAbsent != null) {
                objIAuthTabCallback = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objIAuthTabCallback, "");
        return ((Result) objIAuthTabCallback).onNavigationEvent();
    }
}
