package o;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class htf2 {
    public static final <T> boolean IAuthTabCallback(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return clearRegisters.onNavigationEvent(kClass).isInterface();
    }

    public static final <T> KSerializer<T> onNavigationEvent(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return onWarmupCompleted(kClass, (KSerializer<Object>[]) new KSerializer[0]);
    }

    public static final <T, E extends T> E[] onWarmupCompleted(@NotNull ArrayList<E> arrayList, @NotNull KClass<T> kClass) throws NegativeArraySizeException {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Object objNewInstance = Array.newInstance((Class<?>) clearRegisters.onNavigationEvent(kClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(eArr, "");
        return eArr;
    }

    public static final Void onExtraCallback(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        setImageLottieTosPath.onWarmupCompleted(kClass);
        throw new setWrite();
    }

    public static final Void onNavigationEvent(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        throw new qn(setImageLottieTosPath.onExtraCallback((KClass<?>) clearRegisters.IAuthTabCallback(cls)));
    }

    public static final <T> KSerializer<T> onWarmupCompleted(@NotNull KClass<T> kClass, @NotNull KSerializer<Object>... kSerializerArr) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializerArr, "");
        return onWarmupCompleted(clearRegisters.onNavigationEvent(kClass), (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> KSerializer<T> onWarmupCompleted(@NotNull Class<T> cls, @NotNull KSerializer<Object>... kSerializerArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(kSerializerArr, "");
        if (cls.isEnum() && IAuthTabCallback(cls)) {
            return onWarmupCompleted(cls);
        }
        KSerializer<T> kSerializerOnExtraCallback = onExtraCallback(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerOnExtraCallback != null) {
            return kSerializerOnExtraCallback;
        }
        KSerializer<T> kSerializerOnExtraCallback2 = onExtraCallback(cls);
        if (kSerializerOnExtraCallback2 != null) {
            return kSerializerOnExtraCallback2;
        }
        KSerializer<T> kSerializerIAuthTabCallback = IAuthTabCallback(cls, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerIAuthTabCallback != null) {
            return kSerializerIAuthTabCallback;
        }
        if (onTransact(cls)) {
            return new giw(clearRegisters.IAuthTabCallback(cls));
        }
        return null;
    }

    private static final <T> KSerializer<T> IAuthTabCallback(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        Field field;
        KSerializer<T> kSerializerOnNavigationEvent;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(cls);
        if (objOnExtraCallbackWithResult != null && (kSerializerOnNavigationEvent = onNavigationEvent(objOnExtraCallbackWithResult, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return kSerializerOnNavigationEvent;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = declaredClasses[i];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                } else if (z) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final <T> Object onExtraCallbackWithResult(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (cls2.getAnnotation(setCoreRadius.class) != null) {
                break;
            }
            i++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return IAuthTabCallback((Class<?>) cls, simpleName);
    }

    private static final <T> boolean IAuthTabCallback(Class<T> cls) {
        return cls.getAnnotation(liq.class) == null && cls.getAnnotation(hfd.class) == null;
    }

    private static final <T> boolean onTransact(Class<T> cls) {
        if (cls.getAnnotation(hfd.class) != null) {
            return true;
        }
        liq liqVar = (liq) cls.getAnnotation(liq.class);
        return liqVar != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(liqVar.onNavigationEvent()), Reflection.getOrCreateKotlinClass(giw.class));
    }

    private static final <T> KSerializer<T> onExtraCallback(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object objIAuthTabCallback = IAuthTabCallback(cls, "Companion");
        if (objIAuthTabCallback == null) {
            return null;
        }
        return onNavigationEvent(objIAuthTabCallback, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final <T> KSerializer<T> onNavigationEvent(Object obj, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final Object IAuthTabCallback(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final <T> KSerializer<T> onWarmupCompleted(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "");
        Intrinsics.checkNotNull(enumConstants, "");
        return new setScoreCountWithIcon(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> KSerializer<T> onExtraCallback(Class<T> cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i = 0;
            if (!StringsKt__StringsJVMKt.startsWith$default(canonicalName, "java.", false, 2, null) && !StringsKt__StringsJVMKt.startsWith$default(canonicalName, "kotlin.", false, 2, null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "");
                int length = declaredFields.length;
                Field field = null;
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 >= length) {
                        if (!z) {
                            break;
                        }
                    } else {
                        Field field2 = declaredFields[i2];
                        if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                            if (z) {
                                break;
                            }
                            z = true;
                            field = field2;
                        }
                        i2++;
                    }
                }
                field = null;
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "");
                int length2 = methods.length;
                Method method = null;
                boolean z2 = false;
                while (true) {
                    if (i >= length2) {
                        if (!z2) {
                            break;
                        }
                    } else {
                        Method method2 = methods[i];
                        if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
                            if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), KSerializer.class)) {
                                if (z2) {
                                    break;
                                }
                                method = method2;
                                z2 = true;
                            }
                        }
                        i++;
                    }
                }
                if (method == null) {
                    return null;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof KSerializer) {
                    return (KSerializer) objInvoke;
                }
            }
        }
        return null;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull KClass<Object> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return clearRegisters.onNavigationEvent(kClass).isArray();
    }

    public static final Map<KClass<?>, KSerializer<?>> onExtraCallback() {
        Map mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(String.class), sp.onExtraCallbackWithResult(StringCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Character.TYPE), sp.onExtraCallbackWithResult(CharCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(char[].class), sp.onExtraCallback());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Double.TYPE), sp.onWarmupCompleted(DoubleCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(double[].class), sp.onWarmupCompleted());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Float.TYPE), sp.onWarmupCompleted(FloatCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(float[].class), sp.IAuthTabCallback());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Long.TYPE), sp.onNavigationEvent(LongCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(long[].class), sp.IAuthTabCallbackStub());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(access13000.class), sp.onExtraCallback(access13000.Companion));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), sp.IAuthTabCallback(IntCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(int[].class), sp.IAuthTabCallbackDefault());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(UInt.class), sp.onWarmupCompleted(UInt.Companion));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Short.TYPE), sp.onNavigationEvent(ShortCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(short[].class), sp.onTransact());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(getU64.class), sp.onExtraCallback(getU64.Companion));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), sp.onExtraCallback(ByteCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(byte[].class), sp.onNavigationEvent());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(UByte.class), sp.onNavigationEvent(UByte.Companion));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), sp.onExtraCallback(BooleanCompanionObject.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(boolean[].class), sp.onExtraCallbackWithResult());
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Unit.class), sp.onExtraCallback(Unit.INSTANCE));
        mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(Void.class), sp.asInterface());
        try {
            mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(setLogBuffers.class), sp.IAuthTabCallback(setLogBuffers.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(access13100.class), sp.access000());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(access13400.class), sp.IAuthTabCallback_Parcel());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(TombstoneProtosRegisterBuilder.class), sp.access100());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(access13200.class), sp.asBinder());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapOnExtraCallbackWithResult.put(Reflection.getOrCreateKotlinClass(getCommandLine.class), sp.onWarmupCompleted(getCommandLine.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return access8200.asBinder(mapOnExtraCallbackWithResult);
    }
}
