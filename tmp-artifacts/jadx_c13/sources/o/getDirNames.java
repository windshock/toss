package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import kotlin.Unit;
import okhttp3.ResponseBody;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDirNames {
    static final Type[] onExtraCallbackWithResult = new Type[0];
    private static boolean onNavigationEvent = true;

    public static RuntimeException IAuthTabCallback(Method method, String str, Object... objArr) {
        return onWarmupCompleted(method, (Throwable) null, str, objArr);
    }

    public static RuntimeException onWarmupCompleted(Method method, @Nullable Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    public static RuntimeException onExtraCallback(Method method, Throwable th, int i, String str, Object... objArr) {
        return onWarmupCompleted(method, th, str + " (" + getSubjectDN.onNavigationEvent.onNavigationEvent(method, i) + ")", objArr);
    }

    public static RuntimeException onWarmupCompleted(Method method, int i, String str, Object... objArr) {
        return IAuthTabCallback(method, str + " (" + getSubjectDN.onNavigationEvent.onNavigationEvent(method, i) + ")", objArr);
    }

    public static Class<?> onWarmupCompleted(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (!(rawType instanceof Class)) {
                throw new IllegalArgumentException();
            }
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(onWarmupCompleted(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return onWarmupCompleted(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    static boolean onExtraCallback(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return onExtraCallback(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static Type onExtraCallback(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return onExtraCallback(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return onExtraCallback(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static int IAuthTabCallback(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    static String IAuthTabCallback(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type onNavigationEvent(Type type, Class<?> cls, Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return onNavigationEvent(type, cls, onExtraCallback(type, cls, cls2));
    }

    static Type onNavigationEvent(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeOnNavigationEvent = onNavigationEvent(type, cls, (TypeVariable<?>) typeVariable);
            if (typeOnNavigationEvent == typeVariable) {
                return typeOnNavigationEvent;
            }
            type3 = typeOnNavigationEvent;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeOnNavigationEvent2 = onNavigationEvent(type, cls, (Type) componentType);
                return componentType == typeOnNavigationEvent2 ? cls2 : new IAuthTabCallback(typeOnNavigationEvent2);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeOnNavigationEvent3 = onNavigationEvent(type, cls, genericComponentType);
            return genericComponentType == typeOnNavigationEvent3 ? genericArrayType : new IAuthTabCallback(typeOnNavigationEvent3);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeOnNavigationEvent4 = onNavigationEvent(type, cls, ownerType);
            boolean z = typeOnNavigationEvent4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeOnNavigationEvent5 = onNavigationEvent(type, cls, actualTypeArguments[i]);
                if (typeOnNavigationEvent5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeOnNavigationEvent5;
                }
            }
            return z ? new onNavigationEvent(typeOnNavigationEvent4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeOnNavigationEvent6 = onNavigationEvent(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeOnNavigationEvent6 != lowerBounds[0]) {
                    return new onExtraCallback(new Type[]{Object.class}, new Type[]{typeOnNavigationEvent6});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeOnNavigationEvent7 = onNavigationEvent(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeOnNavigationEvent7 != upperBounds[0]) {
                        return new onExtraCallback(new Type[]{typeOnNavigationEvent7}, onExtraCallbackWithResult);
                    }
                }
            }
        }
        return type4;
    }

    private static Type onNavigationEvent(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsOnExtraCallbackWithResult = onExtraCallbackWithResult(typeVariable);
        if (clsOnExtraCallbackWithResult != null) {
            Type typeOnExtraCallback = onExtraCallback(type, cls, clsOnExtraCallbackWithResult);
            if (typeOnExtraCallback instanceof ParameterizedType) {
                return ((ParameterizedType) typeOnExtraCallback).getActualTypeArguments()[IAuthTabCallback(clsOnExtraCallbackWithResult.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    @Nullable
    private static Class<?> onExtraCallbackWithResult(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static void onNavigationEvent(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean onWarmupCompleted(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static ResponseBody onNavigationEvent(ResponseBody responseBody) throws IOException {
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        responseBody.source().IAuthTabCallback(tTBaseActivity);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), tTBaseActivity);
    }

    public static Type onExtraCallbackWithResult(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    static Type onNavigationEvent(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static boolean onExtraCallbackWithResult(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (onExtraCallbackWithResult(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return onExtraCallbackWithResult(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static final class onNavigationEvent implements ParameterizedType {

        @Nullable
        private final Type IAuthTabCallback;
        private final Type[] onNavigationEvent;
        private final Type onWarmupCompleted;

        onNavigationEvent(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                getDirNames.onNavigationEvent(type3);
            }
            this.IAuthTabCallback = type;
            this.onWarmupCompleted = type2;
            this.onNavigationEvent = (Type[]) typeArr.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.onNavigationEvent.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.onWarmupCompleted;
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.IAuthTabCallback;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && getDirNames.onExtraCallback(this, (ParameterizedType) obj);
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.onNavigationEvent);
            int iHashCode2 = this.onWarmupCompleted.hashCode();
            Type type = this.IAuthTabCallback;
            return (iHashCode ^ iHashCode2) ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.onNavigationEvent;
            if (typeArr.length == 0) {
                return getDirNames.IAuthTabCallback(this.onWarmupCompleted);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(getDirNames.IAuthTabCallback(this.onWarmupCompleted));
            sb.append("<");
            sb.append(getDirNames.IAuthTabCallback(this.onNavigationEvent[0]));
            for (int i = 1; i < this.onNavigationEvent.length; i++) {
                sb.append(", ");
                sb.append(getDirNames.IAuthTabCallback(this.onNavigationEvent[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    static final class IAuthTabCallback implements GenericArrayType {
        private final Type IAuthTabCallback;

        IAuthTabCallback(Type type) {
            this.IAuthTabCallback = type;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.IAuthTabCallback;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && getDirNames.onExtraCallback(this, (GenericArrayType) obj);
        }

        public int hashCode() {
            return this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return getDirNames.IAuthTabCallback(this.IAuthTabCallback) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    static final class onExtraCallback implements WildcardType {

        @Nullable
        private final Type IAuthTabCallback;
        private final Type onWarmupCompleted;

        onExtraCallback(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                getDirNames.onNavigationEvent(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.IAuthTabCallback = typeArr2[0];
                this.onWarmupCompleted = Object.class;
                return;
            }
            getDirNames.onNavigationEvent(typeArr[0]);
            this.IAuthTabCallback = null;
            this.onWarmupCompleted = typeArr[0];
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.onWarmupCompleted};
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.IAuthTabCallback;
            return type != null ? new Type[]{type} : getDirNames.onExtraCallbackWithResult;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && getDirNames.onExtraCallback(this, (WildcardType) obj);
        }

        public int hashCode() {
            Type type = this.IAuthTabCallback;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.onWarmupCompleted.hashCode() + 31);
        }

        public String toString() {
            if (this.IAuthTabCallback != null) {
                return "? super " + getDirNames.IAuthTabCallback(this.IAuthTabCallback);
            }
            if (this.onWarmupCompleted == Object.class) {
                return "?";
            }
            return "? extends " + getDirNames.IAuthTabCallback(this.onWarmupCompleted);
        }
    }

    static void IAuthTabCallback(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static boolean onExtraCallback(Type type) {
        return onNavigationEvent && type == Unit.class;
    }
}
