package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import o.sg;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class sg {
    public static final KSerializer<Object> onNavigationEvent(@NotNull access5900 access5900Var) {
        Intrinsics.checkNotNullParameter(access5900Var, "");
        return nzi.onExtraCallbackWithResult(tnycx.onNavigationEvent(), access5900Var);
    }

    public static final KSerializer<Object> onWarmupCompleted(@NotNull hfycx hfycxVar, @NotNull access5900 access5900Var) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(access5900Var, "");
        KSerializer<Object> kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult(hfycxVar, access5900Var, true);
        if (kSerializerOnExtraCallbackWithResult != null) {
            return kSerializerOnExtraCallbackWithResult;
        }
        htf2.onExtraCallback((KClass<?>) setImageLottieTosPath.onNavigationEvent(access5900Var));
        throw new setWrite();
    }

    public static final KSerializer<Object> onExtraCallback(@NotNull hfycx hfycxVar, @NotNull access5900 access5900Var) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(access5900Var, "");
        return onExtraCallbackWithResult(hfycxVar, access5900Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final KSerializer<Object> onExtraCallbackWithResult(hfycx hfycxVar, access5900 access5900Var, boolean z) {
        KSerializer<Object> kSerializerOnExtraCallbackWithResult;
        KSerializer<? extends Object> kSerializerOnExtraCallbackWithResult2;
        giw giwVar;
        KClass<Object> kClassOnNavigationEvent = setImageLottieTosPath.onNavigationEvent(access5900Var);
        boolean zIsMarkedNullable = access5900Var.isMarkedNullable();
        List<KTypeProjection> arguments = access5900Var.getArguments();
        final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(setImageLottieTosPath.onWarmupCompleted((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            kSerializerOnExtraCallbackWithResult = (!htf2.IAuthTabCallback(kClassOnNavigationEvent) || hfycx.onExtraCallbackWithResult(hfycxVar, kClassOnNavigationEvent, null, 2, null) == null) ? pyn.onExtraCallbackWithResult(kClassOnNavigationEvent, zIsMarkedNullable) : null;
        } else if (!hfycxVar.onExtraCallbackWithResult()) {
            Object objIAuthTabCallback = pyn.IAuthTabCallback(kClassOnNavigationEvent, arrayList, zIsMarkedNullable);
            if (Result.onExtraCallback(objIAuthTabCallback)) {
                objIAuthTabCallback = null;
            }
            kSerializerOnExtraCallbackWithResult = (KSerializer) objIAuthTabCallback;
        }
        if (kSerializerOnExtraCallbackWithResult != null) {
            return kSerializerOnExtraCallbackWithResult;
        }
        if (arrayList.isEmpty()) {
            kSerializerOnExtraCallbackWithResult2 = nzi.onExtraCallback(kClassOnNavigationEvent);
            if (kSerializerOnExtraCallbackWithResult2 == null && (kSerializerOnExtraCallbackWithResult2 = hfycx.onExtraCallbackWithResult(hfycxVar, kClassOnNavigationEvent, null, 2, null)) == null) {
                if (htf2.IAuthTabCallback(kClassOnNavigationEvent)) {
                    giwVar = new giw(kClassOnNavigationEvent);
                    kSerializerOnExtraCallbackWithResult2 = giwVar;
                }
                kSerializerOnExtraCallbackWithResult2 = null;
            }
        } else {
            List<KSerializer<Object>> listOnWarmupCompleted = nzi.onWarmupCompleted(hfycxVar, arrayList, z);
            if (listOnWarmupCompleted == null) {
                return null;
            }
            KSerializer<? extends Object> kSerializerOnWarmupCompleted = nzi.onWarmupCompleted(kClassOnNavigationEvent, listOnWarmupCompleted, (Function0<? extends access5200>) new Function0() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return sg.IAuthTabCallback(arrayList);
                }
            });
            if (kSerializerOnWarmupCompleted == null) {
                kSerializerOnExtraCallbackWithResult2 = hfycxVar.onExtraCallbackWithResult(kClassOnNavigationEvent, listOnWarmupCompleted);
                if (kSerializerOnExtraCallbackWithResult2 == null) {
                    if (htf2.IAuthTabCallback(kClassOnNavigationEvent)) {
                        giwVar = new giw(kClassOnNavigationEvent);
                        kSerializerOnExtraCallbackWithResult2 = giwVar;
                    }
                    kSerializerOnExtraCallbackWithResult2 = null;
                }
            } else {
                kSerializerOnExtraCallbackWithResult2 = kSerializerOnWarmupCompleted;
            }
        }
        if (kSerializerOnExtraCallbackWithResult2 != null) {
            return onExtraCallback(kSerializerOnExtraCallbackWithResult2, zIsMarkedNullable);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final access5200 IAuthTabCallback(List list) {
        return ((access5900) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final access5200 onExtraCallback() {
        throw new qn("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    public static final List<KSerializer<Object>> onExtraCallbackWithResult(@NotNull hfycx hfycxVar, @NotNull List<? extends access5900> list, boolean z) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (z) {
            List<? extends access5900> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(nzi.IAuthTabCallback(hfycxVar, (access5900) it.next()));
            }
            return arrayList;
        }
        List<? extends access5900> list3 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            KSerializer<Object> kSerializerOnExtraCallbackWithResult = nzi.onExtraCallbackWithResult(hfycxVar, (access5900) it2.next());
            if (kSerializerOnExtraCallbackWithResult == null) {
                return null;
            }
            arrayList2.add(kSerializerOnExtraCallbackWithResult);
        }
        return arrayList2;
    }

    public static final <T> KSerializer<T> onExtraCallback(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        KSerializer<T> kSerializerOnExtraCallback = nzi.onExtraCallback(kClass);
        if (kSerializerOnExtraCallback != null) {
            return kSerializerOnExtraCallback;
        }
        setImageLottieTosPath.onWarmupCompleted((KClass<?>) kClass);
        throw new setWrite();
    }

    public static final <T> KSerializer<T> IAuthTabCallback(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        KSerializer<T> kSerializerOnNavigationEvent = htf2.onNavigationEvent(kClass);
        return kSerializerOnNavigationEvent == null ? setShakeText.onWarmupCompleted(kClass) : kSerializerOnNavigationEvent;
    }

    public static final KSerializer<? extends Object> onExtraCallbackWithResult(@NotNull KClass<Object> kClass, @NotNull List<? extends KSerializer<Object>> list, @NotNull Function0<? extends access5200> function0) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        KSerializer<? extends Object> kSerializerIAuthTabCallback = IAuthTabCallback(kClass, list, function0);
        return kSerializerIAuthTabCallback == null ? IAuthTabCallback(kClass, list) : kSerializerIAuthTabCallback;
    }

    private static final KSerializer<? extends Object> IAuthTabCallback(KClass<Object> kClass, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return htf2.onWarmupCompleted(kClass, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final KSerializer<? extends Object> IAuthTabCallback(KClass<Object> kClass, List<? extends KSerializer<Object>> list, Function0<? extends access5200> function0) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new checkCanOpenLandingPage(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new getImageKey(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new ul1(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new getWidgetLayoutParams(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new getMutilBackgroundDrawable(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return sp.IAuthTabCallback(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return sp.onNavigationEvent(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return sp.onExtraCallback(list.get(0), list.get(1), list.get(2));
        }
        if (!htf2.onExtraCallbackWithResult(kClass)) {
            return null;
        }
        access5200 access5200VarInvoke = function0.invoke();
        Intrinsics.checkNotNull(access5200VarInvoke, "");
        return sp.IAuthTabCallback((KClass) access5200VarInvoke, list.get(0));
    }

    private static final <T> KSerializer<T> onExtraCallback(KSerializer<T> kSerializer, boolean z) {
        if (z) {
            return sp.IAuthTabCallback(kSerializer);
        }
        Intrinsics.checkNotNull(kSerializer, "");
        return kSerializer;
    }

    public static final KSerializer<?> onExtraCallback(@NotNull hfycx hfycxVar, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        KSerializer<?> kSerializerOnExtraCallbackWithResult = hfycx.onExtraCallbackWithResult(hfycxVar, kClass, null, 2, null);
        if (kSerializerOnExtraCallbackWithResult != null) {
            return kSerializerOnExtraCallbackWithResult;
        }
        setImageLottieTosPath.onWarmupCompleted(kClass);
        throw new setWrite();
    }
}
