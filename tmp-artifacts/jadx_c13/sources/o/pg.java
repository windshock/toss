package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class pg {
    public static final KSerializer<Object> onExtraCallbackWithResult(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        return nzi.IAuthTabCallback(tnycx.onNavigationEvent(), type);
    }

    public static final KSerializer<Object> onExtraCallbackWithResult(@NotNull hfycx hfycxVar, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(type, "");
        KSerializer<Object> kSerializerOnWarmupCompleted = onWarmupCompleted(hfycxVar, type, true);
        if (kSerializerOnWarmupCompleted != null) {
            return kSerializerOnWarmupCompleted;
        }
        htf2.onNavigationEvent(onNavigationEvent(type));
        throw new setWrite();
    }

    public static final KSerializer<Object> IAuthTabCallback(@NotNull hfycx hfycxVar, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(type, "");
        return onWarmupCompleted(hfycxVar, type, false);
    }

    static /* synthetic */ KSerializer onExtraCallbackWithResult(hfycx hfycxVar, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return onWarmupCompleted(hfycxVar, type, z);
    }

    private static final KSerializer<Object> onWarmupCompleted(hfycx hfycxVar, Type type, boolean z) {
        ArrayList<KSerializer> arrayList;
        if (type instanceof GenericArrayType) {
            return onNavigationEvent(hfycxVar, (GenericArrayType) type, z);
        }
        if (type instanceof Class) {
            return onNavigationEvent(hfycxVar, (Class<?>) type, z);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Intrinsics.checkNotNull(rawType, "");
            Class cls = (Class) rawType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Intrinsics.checkNotNull(actualTypeArguments);
            if (z) {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    Intrinsics.checkNotNull(type2);
                    arrayList.add(nzi.IAuthTabCallback(hfycxVar, type2));
                }
            } else {
                arrayList = new ArrayList(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    Intrinsics.checkNotNull(type3);
                    KSerializer<Object> kSerializerOnExtraCallbackWithResult = nzi.onExtraCallbackWithResult(hfycxVar, type3);
                    if (kSerializerOnExtraCallbackWithResult == null) {
                        return null;
                    }
                    arrayList.add(kSerializerOnExtraCallbackWithResult);
                }
            }
            if (Set.class.isAssignableFrom(cls)) {
                KSerializer<Object> kSerializerOnWarmupCompleted = sp.onWarmupCompleted((KSerializer) arrayList.get(0));
                Intrinsics.checkNotNull(kSerializerOnWarmupCompleted, "");
                return kSerializerOnWarmupCompleted;
            }
            if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                KSerializer<Object> kSerializerOnExtraCallback = sp.onExtraCallback((KSerializer) arrayList.get(0));
                Intrinsics.checkNotNull(kSerializerOnExtraCallback, "");
                return kSerializerOnExtraCallback;
            }
            if (Map.class.isAssignableFrom(cls)) {
                KSerializer<Object> kSerializerOnExtraCallback2 = sp.onExtraCallback((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                Intrinsics.checkNotNull(kSerializerOnExtraCallback2, "");
                return kSerializerOnExtraCallback2;
            }
            if (Map.Entry.class.isAssignableFrom(cls)) {
                KSerializer<Object> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                Intrinsics.checkNotNull(kSerializerIAuthTabCallback, "");
                return kSerializerIAuthTabCallback;
            }
            if (Pair.class.isAssignableFrom(cls)) {
                KSerializer<Object> kSerializerOnNavigationEvent = sp.onNavigationEvent((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                Intrinsics.checkNotNull(kSerializerOnNavigationEvent, "");
                return kSerializerOnNavigationEvent;
            }
            if (Triple.class.isAssignableFrom(cls)) {
                KSerializer<Object> kSerializerOnExtraCallback3 = sp.onExtraCallback((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
                Intrinsics.checkNotNull(kSerializerOnExtraCallback3, "");
                return kSerializerOnExtraCallback3;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (KSerializer kSerializer : arrayList) {
                Intrinsics.checkNotNull(kSerializer, "");
                arrayList2.add(kSerializer);
            }
            return onExtraCallbackWithResult(hfycxVar, cls, arrayList2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            Object objFirst = ArraysKt___ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "");
            return onExtraCallbackWithResult(hfycxVar, (Type) objFirst, false, 2, null);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
    }

    private static final KSerializer<Object> onNavigationEvent(hfycx hfycxVar, Class<?> cls, boolean z) {
        KSerializer<Object> kSerializerOnExtraCallbackWithResult;
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            Class<?> componentType = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "");
            if (z) {
                kSerializerOnExtraCallbackWithResult = nzi.IAuthTabCallback(hfycxVar, componentType);
            } else {
                kSerializerOnExtraCallbackWithResult = nzi.onExtraCallbackWithResult(hfycxVar, componentType);
                if (kSerializerOnExtraCallbackWithResult == null) {
                    return null;
                }
            }
            KClass kClassIAuthTabCallback = clearRegisters.IAuthTabCallback(componentType);
            Intrinsics.checkNotNull(kClassIAuthTabCallback, "");
            KSerializer<Object> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kClassIAuthTabCallback, kSerializerOnExtraCallbackWithResult);
            Intrinsics.checkNotNull(kSerializerIAuthTabCallback, "");
            return kSerializerIAuthTabCallback;
        }
        Intrinsics.checkNotNull(cls, "");
        return onExtraCallbackWithResult(hfycxVar, cls, CollectionsKt__CollectionsKt.emptyList());
    }

    private static final <T> KSerializer<T> onExtraCallbackWithResult(hfycx hfycxVar, Class<T> cls, List<? extends KSerializer<Object>> list) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerOnWarmupCompleted = htf2.onWarmupCompleted(cls, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerOnWarmupCompleted != null) {
            return kSerializerOnWarmupCompleted;
        }
        KClass<T> kClassIAuthTabCallback = clearRegisters.IAuthTabCallback(cls);
        KSerializer<T> kSerializerOnWarmupCompleted2 = setShakeText.onWarmupCompleted(kClassIAuthTabCallback);
        if (kSerializerOnWarmupCompleted2 != null) {
            return kSerializerOnWarmupCompleted2;
        }
        KSerializer<T> kSerializerOnExtraCallbackWithResult = hfycxVar.onExtraCallbackWithResult(kClassIAuthTabCallback, (List<? extends KSerializer<?>>) list);
        if (kSerializerOnExtraCallbackWithResult != null) {
            return kSerializerOnExtraCallbackWithResult;
        }
        if (cls.isInterface()) {
            return new giw(clearRegisters.IAuthTabCallback(cls));
        }
        return null;
    }

    private static final KSerializer<Object> onNavigationEvent(hfycx hfycxVar, GenericArrayType genericArrayType, boolean z) {
        KSerializer<Object> kSerializerOnExtraCallbackWithResult;
        KClass kClassIAuthTabCallback;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            genericComponentType = (Type) ArraysKt___ArraysKt.first(upperBounds);
        }
        Intrinsics.checkNotNull(genericComponentType);
        if (z) {
            kSerializerOnExtraCallbackWithResult = nzi.IAuthTabCallback(hfycxVar, genericComponentType);
        } else {
            kSerializerOnExtraCallbackWithResult = nzi.onExtraCallbackWithResult(hfycxVar, genericComponentType);
            if (kSerializerOnExtraCallbackWithResult == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            Intrinsics.checkNotNull(rawType, "");
            kClassIAuthTabCallback = clearRegisters.IAuthTabCallback((Class) rawType);
        } else {
            if (!(genericComponentType instanceof KClass)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(genericComponentType.getClass()));
            }
            kClassIAuthTabCallback = (KClass) genericComponentType;
        }
        Intrinsics.checkNotNull(kClassIAuthTabCallback, "");
        KSerializer<Object> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kClassIAuthTabCallback, kSerializerOnExtraCallbackWithResult);
        Intrinsics.checkNotNull(kSerializerIAuthTabCallback, "");
        return kSerializerIAuthTabCallback;
    }

    private static final Class<?> onNavigationEvent(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "");
            return onNavigationEvent(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            Object objFirst = ArraysKt___ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "");
            return onNavigationEvent((Type) objFirst);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "");
            return onNavigationEvent(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
    }
}
