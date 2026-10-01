package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setBgMaterialCenterCalcColor<T> implements ea12<T> {
    private final ConcurrentHashMap<Class<?>, getAlphaColor<T>> IAuthTabCallback;
    private final Function2<KClass<Object>, List<? extends access5900>, KSerializer<T>> onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public setBgMaterialCenterCalcColor(@NotNull Function2<? super KClass<Object>, ? super List<? extends access5900>, ? extends KSerializer<T>> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.onExtraCallback = function2;
        this.IAuthTabCallback = new ConcurrentHashMap<>();
    }

    @Override // o.ea12
    public Object onWarmupCompleted(@NotNull KClass<Object> kClass, @NotNull List<? extends access5900> list) {
        Object objM31constructorimpl;
        getAlphaColor<T> getalphacolorPutIfAbsent;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        ConcurrentHashMap<Class<?>, getAlphaColor<T>> concurrentHashMap = this.IAuthTabCallback;
        Class<?> clsOnNavigationEvent = clearRegisters.onNavigationEvent(kClass);
        getAlphaColor<T> getalphacolor = concurrentHashMap.get(clsOnNavigationEvent);
        if (getalphacolor == null && (getalphacolorPutIfAbsent = concurrentHashMap.putIfAbsent(clsOnNavigationEvent, (getalphacolor = new getAlphaColor<>()))) != null) {
            getalphacolor = getalphacolorPutIfAbsent;
        }
        getAlphaColor<T> getalphacolor2 = getalphacolor;
        List<? extends access5900> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new lud5((access5900) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = ((getAlphaColor) getalphacolor2).onWarmupCompleted;
        Object objIAuthTabCallback = concurrentHashMap2.get(arrayList);
        if (objIAuthTabCallback == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(this.onExtraCallback.invoke(kClass, list));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            objIAuthTabCallback = Result.IAuthTabCallback(objM31constructorimpl);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, objIAuthTabCallback);
            if (objPutIfAbsent != null) {
                objIAuthTabCallback = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objIAuthTabCallback, "");
        return ((Result) objIAuthTabCallback).onNavigationEvent();
    }
}
