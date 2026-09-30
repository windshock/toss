package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class wwx8 {
    public static final WildcardType onExtraCallbackWithResult = onExtraCallback().onExtraCallbackWithResult(Object.class).onNavigationEvent();

    public static /* synthetic */ Type onWarmupCompleted(Type type) {
        return type;
    }

    public static class IAuthTabCallback {
        private Type[] onExtraCallback;
        private Type[] onExtraCallbackWithResult;

        private IAuthTabCallback() {
        }

        public WildcardType onNavigationEvent() {
            return new onExtraCallback(this.onExtraCallbackWithResult, this.onExtraCallback);
        }

        public IAuthTabCallback onExtraCallbackWithResult(Type... typeArr) {
            this.onExtraCallbackWithResult = typeArr;
            return this;
        }
    }

    static final class onExtraCallback implements WildcardType {
        private final Type[] onNavigationEvent;
        private final Type[] onWarmupCompleted;

        private onExtraCallback(Type[] typeArr, Type[] typeArr2) {
            Type[] typeArr3 = getVideoProgress.onPostMessage;
            this.onNavigationEvent = (Type[]) PAGAppOpenAd1.onExtraCallback(typeArr, typeArr3);
            this.onWarmupCompleted = (Type[]) PAGAppOpenAd1.onExtraCallback(typeArr2, typeArr3);
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                return (obj instanceof WildcardType) && wwx8.onNavigationEvent(this, (WildcardType) obj);
            }
            return true;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return (Type[]) this.onWarmupCompleted.clone();
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return (Type[]) this.onNavigationEvent.clone();
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.onNavigationEvent) | 18688) << 8) | Arrays.hashCode(this.onWarmupCompleted);
        }

        public String toString() {
            return wwx8.IAuthTabCallback((Type) this);
        }
    }

    private static <T> StringBuilder IAuthTabCallback(StringBuilder sb, String str, T... tArr) {
        PAGVideoMediaView1.onNavigationEvent(PAGVideoMediaView1.IAuthTabCallback(tArr));
        if (tArr.length > 0) {
            sb.append(onNavigationEvent(tArr[0]));
            for (int i = 1; i < tArr.length; i++) {
                sb.append(str);
                sb.append(onNavigationEvent(tArr[i]));
            }
        }
        return sb;
    }

    private static void onWarmupCompleted(StringBuilder sb, int[] iArr, Type[] typeArr) {
        for (int i = 0; i < iArr.length; i++) {
            sb.append('<');
            IAuthTabCallback(sb, ", ", typeArr[i].toString()).append('>');
        }
        Type[] typeArr2 = (Type[]) getVideoProgress.onExtraCallback(typeArr, iArr);
        if (typeArr2.length > 0) {
            sb.append('<');
            IAuthTabCallback(sb, ", ", typeArr2).append('>');
        }
    }

    private static String IAuthTabCallback(Class<?> cls) {
        if (cls.isArray()) {
            return IAuthTabCallback((Type) cls.getComponentType()) + "[]";
        }
        StringBuilder sb = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb.append(IAuthTabCallback(cls.getEnclosingClass()));
            sb.append('.');
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            sb.append('<');
            IAuthTabCallback(sb, ", ", cls.getTypeParameters());
            sb.append('>');
        }
        return sb.toString();
    }

    private static boolean IAuthTabCallback(TypeVariable<?> typeVariable, ParameterizedType parameterizedType) {
        return getVideoProgress.onExtraCallback(typeVariable.getBounds(), parameterizedType);
    }

    private static boolean IAuthTabCallback(GenericArrayType genericArrayType, Type type) {
        return (type instanceof GenericArrayType) && IAuthTabCallback(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType());
    }

    private static boolean onExtraCallbackWithResult(ParameterizedType parameterizedType, Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type;
        if (IAuthTabCallback(parameterizedType.getRawType(), parameterizedType2.getRawType()) && IAuthTabCallback(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType())) {
            return onExtraCallbackWithResult(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        return false;
    }

    public static boolean IAuthTabCallback(Type type, Type type2) {
        if (Objects.equals(type, type2)) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            return onExtraCallbackWithResult((ParameterizedType) type, type2);
        }
        if (type instanceof GenericArrayType) {
            return IAuthTabCallback((GenericArrayType) type, type2);
        }
        if (type instanceof WildcardType) {
            return onNavigationEvent((WildcardType) type, type2);
        }
        return false;
    }

    private static boolean onExtraCallbackWithResult(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        for (int i = 0; i < typeArr.length; i++) {
            if (!IAuthTabCallback(typeArr[i], typeArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean onNavigationEvent(WildcardType wildcardType, Type type) {
        if (!(type instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        return onExtraCallbackWithResult(onNavigationEvent(wildcardType), onNavigationEvent(wildcardType2)) && onExtraCallbackWithResult(onExtraCallbackWithResult(wildcardType), onExtraCallbackWithResult(wildcardType2));
    }

    private static int[] onExtraCallback(ParameterizedType parameterizedType) {
        Type[] typeArr = (Type[]) Arrays.copyOf(parameterizedType.getActualTypeArguments(), parameterizedType.getActualTypeArguments().length);
        int[] iArrOnExtraCallback = new int[0];
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if ((type instanceof TypeVariable) && IAuthTabCallback((TypeVariable<?>) type, parameterizedType)) {
                iArrOnExtraCallback = getVideoProgress.onExtraCallback(iArrOnExtraCallback, i);
            }
        }
        return iArrOnExtraCallback;
    }

    private static String onExtraCallback(GenericArrayType genericArrayType) {
        return String.format("%s[]", IAuthTabCallback(genericArrayType.getGenericComponentType()));
    }

    private static Type onExtraCallbackWithResult(Class<?> cls, Class<?> cls2) {
        Class<?> clsOnNavigationEvent;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    clsOnNavigationEvent = onNavigationEvent((ParameterizedType) type2);
                } else {
                    if (!(type2 instanceof Class)) {
                        throw new IllegalStateException("Unexpected generic interface type found: " + type2);
                    }
                    clsOnNavigationEvent = (Class) type2;
                }
                if (onNavigationEvent(clsOnNavigationEvent, cls2) && onExtraCallback(type, clsOnNavigationEvent)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    public static Type[] onExtraCallbackWithResult(TypeVariable<?> typeVariable) {
        PAGVideoMediaView1.IAuthTabCallback(typeVariable, "typeVariable", new Object[0]);
        Type[] bounds = typeVariable.getBounds();
        return bounds.length == 0 ? new Type[]{Object.class} : onWarmupCompleted(bounds);
    }

    public static Type[] onNavigationEvent(WildcardType wildcardType) {
        PAGVideoMediaView1.IAuthTabCallback(wildcardType, "wildcardType", new Object[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    public static Type[] onExtraCallbackWithResult(WildcardType wildcardType) {
        PAGVideoMediaView1.IAuthTabCallback(wildcardType, "wildcardType", new Object[0]);
        Type[] upperBounds = wildcardType.getUpperBounds();
        return upperBounds.length == 0 ? new Type[]{Object.class} : onWarmupCompleted(upperBounds);
    }

    private static Class<?> onNavigationEvent(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            throw new IllegalStateException("Wait... What!? Type of rawType: " + rawType);
        }
        return (Class) rawType;
    }

    private static Map<TypeVariable<?>, Type> IAuthTabCallback(Class<?> cls, Class<?> cls2, Map<TypeVariable<?>, Type> map) {
        if (!onNavigationEvent(cls, cls2)) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                return new HashMap();
            }
            cls = onVideoError.onNavigationEvent(cls);
        }
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        return cls2.equals(cls) ? map2 : IAuthTabCallback(onExtraCallbackWithResult(cls, cls2), cls2, (Map<TypeVariable<?>, Type>) map2);
    }

    private static Map<TypeVariable<?>, Type> IAuthTabCallback(ParameterizedType parameterizedType, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        Map<TypeVariable<?>, Type> map2;
        Class<?> clsOnNavigationEvent = onNavigationEvent(parameterizedType);
        if (!onNavigationEvent(clsOnNavigationEvent, cls)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            map2 = IAuthTabCallback(parameterizedType2, onNavigationEvent(parameterizedType2), map);
        } else {
            map2 = map == null ? new HashMap<>() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = clsOnNavigationEvent.getTypeParameters();
        for (int i = 0; i < typeParameters.length; i++) {
            Type type = actualTypeArguments[i];
            map2.put(typeParameters[i], map2.getOrDefault(type, type));
        }
        return cls.equals(clsOnNavigationEvent) ? map2 : IAuthTabCallback(onExtraCallbackWithResult(clsOnNavigationEvent, cls), cls, map2);
    }

    private static Map<TypeVariable<?>, Type> IAuthTabCallback(Type type, Class<?> cls, Map<TypeVariable<?>, Type> map) {
        if (type instanceof Class) {
            return IAuthTabCallback((Class<?>) type, cls, map);
        }
        if (type instanceof ParameterizedType) {
            return IAuthTabCallback((ParameterizedType) type, cls, map);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            return IAuthTabCallback(genericComponentType, cls, map);
        }
        int i = 0;
        if (type instanceof WildcardType) {
            Type[] typeArrOnExtraCallbackWithResult = onExtraCallbackWithResult((WildcardType) type);
            int length = typeArrOnExtraCallbackWithResult.length;
            while (i < length) {
                Type type2 = typeArrOnExtraCallbackWithResult[i];
                if (onNavigationEvent(type2, cls)) {
                    return IAuthTabCallback(type2, cls, map);
                }
                i++;
            }
            return null;
        }
        if (type instanceof TypeVariable) {
            Type[] typeArrOnExtraCallbackWithResult2 = onExtraCallbackWithResult((TypeVariable<?>) type);
            int length2 = typeArrOnExtraCallbackWithResult2.length;
            while (i < length2) {
                Type type3 = typeArrOnExtraCallbackWithResult2[i];
                if (onNavigationEvent(type3, cls)) {
                    return IAuthTabCallback(type3, cls, map);
                }
                i++;
            }
            return null;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean onNavigationEvent(Type type, Class<?> cls) {
        if (type == null) {
            return cls == null || !cls.isPrimitive();
        }
        if (cls == null) {
            return false;
        }
        if (cls.equals(type)) {
            return true;
        }
        if (type instanceof Class) {
            return onVideoError.onNavigationEvent((Class) type, cls);
        }
        if (type instanceof ParameterizedType) {
            return onNavigationEvent(onNavigationEvent((ParameterizedType) type), cls);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (onNavigationEvent(type2, cls)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return cls.equals(Object.class) || (cls.isArray() && onNavigationEvent(((GenericArrayType) type).getGenericComponentType(), cls.getComponentType()));
        }
        if (type instanceof WildcardType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean onExtraCallbackWithResult(Type type, GenericArrayType genericArrayType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (genericArrayType == null) {
            return false;
        }
        if (genericArrayType.equals(type)) {
            return true;
        }
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() && IAuthTabCallback(cls.getComponentType(), genericComponentType, map);
        }
        if (type instanceof GenericArrayType) {
            return IAuthTabCallback(((GenericArrayType) type).getGenericComponentType(), genericComponentType, map);
        }
        if (type instanceof WildcardType) {
            for (Type type2 : onExtraCallbackWithResult((WildcardType) type)) {
                if (onExtraCallback(type2, genericArrayType)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof TypeVariable) {
            for (Type type3 : onExtraCallbackWithResult((TypeVariable<?>) type)) {
                if (onExtraCallback(type3, genericArrayType)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof ParameterizedType) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean onExtraCallbackWithResult(Type type, ParameterizedType parameterizedType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (parameterizedType == null || (type instanceof GenericArrayType)) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsOnNavigationEvent = onNavigationEvent(parameterizedType);
        Map<TypeVariable<?>, Type> mapIAuthTabCallback = IAuthTabCallback(type, clsOnNavigationEvent, (Map<TypeVariable<?>, Type>) null);
        if (mapIAuthTabCallback == null) {
            return false;
        }
        if (mapIAuthTabCallback.isEmpty()) {
            return true;
        }
        Map<TypeVariable<?>, Type> mapIAuthTabCallback2 = IAuthTabCallback(parameterizedType, clsOnNavigationEvent, map);
        for (TypeVariable<?> typeVariable : mapIAuthTabCallback2.keySet()) {
            Type typeIAuthTabCallback = IAuthTabCallback(typeVariable, mapIAuthTabCallback2);
            Type typeIAuthTabCallback2 = IAuthTabCallback(typeVariable, mapIAuthTabCallback);
            if (typeIAuthTabCallback != null || !(typeIAuthTabCallback2 instanceof Class)) {
                if (typeIAuthTabCallback2 != null && typeIAuthTabCallback != null && !typeIAuthTabCallback.equals(typeIAuthTabCallback2) && (!(typeIAuthTabCallback instanceof WildcardType) || !IAuthTabCallback(typeIAuthTabCallback2, typeIAuthTabCallback, map))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean onExtraCallback(Type type, Type type2) {
        return IAuthTabCallback(type, type2, (Map<TypeVariable<?>, Type>) null);
    }

    private static boolean IAuthTabCallback(Type type, Type type2, Map<TypeVariable<?>, Type> map) {
        if (type2 == null || (type2 instanceof Class)) {
            return onNavigationEvent(type, (Class<?>) type2);
        }
        if (type2 instanceof ParameterizedType) {
            return onExtraCallbackWithResult(type, (ParameterizedType) type2, map);
        }
        if (type2 instanceof GenericArrayType) {
            return onExtraCallbackWithResult(type, (GenericArrayType) type2, map);
        }
        if (type2 instanceof WildcardType) {
            return IAuthTabCallback(type, (WildcardType) type2, map);
        }
        if (type2 instanceof TypeVariable) {
            return onNavigationEvent(type, (TypeVariable) type2, map);
        }
        throw new IllegalStateException("found an unhandled type: " + type2);
    }

    private static boolean onNavigationEvent(Type type, TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (typeVariable == null) {
            return false;
        }
        if (typeVariable.equals(type)) {
            return true;
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : onExtraCallbackWithResult((TypeVariable<?>) type)) {
                if (onNavigationEvent(type2, typeVariable, map)) {
                    return true;
                }
            }
        }
        if ((type instanceof Class) || (type instanceof ParameterizedType) || (type instanceof GenericArrayType) || (type instanceof WildcardType)) {
            return false;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
    }

    private static boolean IAuthTabCallback(Type type, WildcardType wildcardType, Map<TypeVariable<?>, Type> map) {
        if (type == null) {
            return true;
        }
        if (wildcardType == null) {
            return false;
        }
        if (wildcardType.equals(type)) {
            return true;
        }
        Type[] typeArrOnExtraCallbackWithResult = onExtraCallbackWithResult(wildcardType);
        Type[] typeArrOnNavigationEvent = onNavigationEvent(wildcardType);
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] typeArrOnExtraCallbackWithResult2 = onExtraCallbackWithResult(wildcardType2);
            Type[] typeArrOnNavigationEvent2 = onNavigationEvent(wildcardType2);
            for (Type type2 : typeArrOnExtraCallbackWithResult) {
                Type typeIAuthTabCallback = IAuthTabCallback(type2, map);
                for (Type type3 : typeArrOnExtraCallbackWithResult2) {
                    if (!IAuthTabCallback(type3, typeIAuthTabCallback, map)) {
                        return false;
                    }
                }
            }
            for (Type type4 : typeArrOnNavigationEvent) {
                Type typeIAuthTabCallback2 = IAuthTabCallback(type4, map);
                for (Type type5 : typeArrOnNavigationEvent2) {
                    if (!IAuthTabCallback(typeIAuthTabCallback2, type5, map)) {
                        return false;
                    }
                }
            }
            return true;
        }
        for (Type type6 : typeArrOnExtraCallbackWithResult) {
            if (!IAuthTabCallback(type, IAuthTabCallback(type6, map), map)) {
                return false;
            }
        }
        for (Type type7 : typeArrOnNavigationEvent) {
            if (!IAuthTabCallback(IAuthTabCallback(type7, map), type, map)) {
                return false;
            }
        }
        return true;
    }

    public static Type[] onWarmupCompleted(Type[] typeArr) {
        int i;
        PAGVideoMediaView1.IAuthTabCallback(typeArr, "bounds", new Object[0]);
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            while (true) {
                if (i < length) {
                    Type type2 = typeArr[i];
                    i = (type == type2 || !IAuthTabCallback(type2, type, (Map<TypeVariable<?>, Type>) null)) ? i + 1 : 0;
                } else {
                    hashSet.add(type);
                    break;
                }
            }
        }
        return (Type[]) hashSet.toArray(getVideoProgress.onPostMessage);
    }

    private static String onExtraCallbackWithResult(ParameterizedType parameterizedType) {
        StringBuilder sb = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        if (ownerType == null) {
            sb.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb.append(((Class) ownerType).getName());
            } else {
                sb.append(ownerType.toString());
            }
            sb.append('.');
            sb.append(cls.getSimpleName());
        }
        int[] iArrOnExtraCallback = onExtraCallback(parameterizedType);
        if (iArrOnExtraCallback.length > 0) {
            onWarmupCompleted(sb, iArrOnExtraCallback, parameterizedType.getActualTypeArguments());
        } else {
            sb.append('<');
            IAuthTabCallback(sb, ", ", parameterizedType.getActualTypeArguments()).append('>');
        }
        return sb.toString();
    }

    private static Type IAuthTabCallback(Type type, Map<TypeVariable<?>, Type> map) {
        if (!(type instanceof TypeVariable) || map == null) {
            return type;
        }
        Type type2 = map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalArgumentException("missing assignment type for type variable " + type);
    }

    private static <T> String onNavigationEvent(T t) {
        return t instanceof Type ? IAuthTabCallback((Type) t) : t.toString();
    }

    public static String IAuthTabCallback(Type type) {
        PAGVideoMediaView1.onExtraCallback(type);
        if (type instanceof Class) {
            return IAuthTabCallback((Class<?>) type);
        }
        if (type instanceof ParameterizedType) {
            return onExtraCallbackWithResult((ParameterizedType) type);
        }
        if (type instanceof WildcardType) {
            return IAuthTabCallback((WildcardType) type);
        }
        if (type instanceof TypeVariable) {
            return onWarmupCompleted((TypeVariable<?>) type);
        }
        if (type instanceof GenericArrayType) {
            return onExtraCallback((GenericArrayType) type);
        }
        throw new IllegalArgumentException(PAGAppOpenAd1.onExtraCallbackWithResult(type));
    }

    private static String onWarmupCompleted(TypeVariable<?> typeVariable) {
        StringBuilder sb = new StringBuilder(typeVariable.getName());
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
            sb.append(" extends ");
            IAuthTabCallback(sb, " & ", typeVariable.getBounds());
        }
        return sb.toString();
    }

    private static Type IAuthTabCallback(TypeVariable<?> typeVariable, Map<TypeVariable<?>, Type> map) {
        Type type;
        while (true) {
            type = map.get(typeVariable);
            if (!(type instanceof TypeVariable) || type.equals(typeVariable)) {
                break;
            }
            typeVariable = (TypeVariable) type;
        }
        return type;
    }

    public static IAuthTabCallback onExtraCallback() {
        return new IAuthTabCallback();
    }

    private static String IAuthTabCallback(WildcardType wildcardType) {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length > 1 || (lowerBounds.length == 1 && lowerBounds[0] != null)) {
            sb.append(" super ");
            IAuthTabCallback(sb, " & ", lowerBounds);
        } else if (upperBounds.length > 1 || (upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))) {
            sb.append(" extends ");
            IAuthTabCallback(sb, " & ", upperBounds);
        }
        return sb.toString();
    }
}
