package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.setFlexDirection;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setFlexDirection {
    private static final int IAuthTabCallback = onExtraCallbackWithResult((Class<?>) Throwable.class, -1);
    private static final setDividerDrawableVertical onNavigationEvent;

    static final class onWarmupCompleted implements Function1 {
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

        onWarmupCompleted() {
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    static {
        setDividerDrawableVertical setdividerdrawablevertical;
        try {
            setdividerdrawablevertical = setJustifyContent.onExtraCallbackWithResult() ? setIndicatorWidth.IAuthTabCallback : getMaxLine.onNavigationEvent;
        } catch (Throwable unused) {
            setdividerdrawablevertical = setIndicatorWidth.IAuthTabCallback;
        }
        onNavigationEvent = setdividerdrawablevertical;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable IAuthTabCallback(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage(), th);
        Intrinsics.checkNotNull(objNewInstance, BuildConfig.FLAVOR);
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable onTransact(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage());
        Intrinsics.checkNotNull(objNewInstance, BuildConfig.FLAVOR);
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable IAuthTabCallbackStub(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th);
        Intrinsics.checkNotNull(objNewInstance, BuildConfig.FLAVOR);
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable asInterface(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        Intrinsics.checkNotNull(objNewInstance, BuildConfig.FLAVOR);
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> Function1<Throwable, Throwable> onNavigationEvent(Class<E> cls) throws SecurityException {
        Object next;
        Function1<Throwable, Throwable> function1;
        Pair pairIAuthTabCallback;
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onExtraCallbackWithResult;
        if (IAuthTabCallback == onExtraCallbackWithResult((Class<?>) cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(onExtraCallbackWithResult((Function1<? super Throwable, ? extends Throwable>) new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda4
                        public final Object invoke(Object obj) {
                            return setFlexDirection.asInterface(constructor, (Throwable) obj);
                        }
                    }), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (Intrinsics.areEqual(cls2, String.class)) {
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(onExtraCallbackWithResult((Function1<? super Throwable, ? extends Throwable>) new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda2
                            public final Object invoke(Object obj) {
                                return setFlexDirection.onTransact(constructor, (Throwable) obj);
                            }
                        }), 2);
                    } else if (Intrinsics.areEqual(cls2, Throwable.class)) {
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(onExtraCallbackWithResult((Function1<? super Throwable, ? extends Throwable>) new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda3
                            public final Object invoke(Object obj) {
                                return setFlexDirection.IAuthTabCallbackStub(constructor, (Throwable) obj);
                            }
                        }), 1);
                    } else {
                        pairIAuthTabCallback = getWrite.IAuthTabCallback((Object) null, -1);
                    }
                } else if (length2 == 2) {
                    if (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(onExtraCallbackWithResult((Function1<? super Throwable, ? extends Throwable>) new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda1
                            public final Object invoke(Object obj) {
                                return setFlexDirection.IAuthTabCallback(constructor, (Throwable) obj);
                            }
                        }), 3);
                    } else {
                        pairIAuthTabCallback = getWrite.IAuthTabCallback((Object) null, -1);
                    }
                } else {
                    pairIAuthTabCallback = getWrite.IAuthTabCallback((Object) null, -1);
                }
                arrayList.add(pairIAuthTabCallback);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).getSecond()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).getSecond()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair = (Pair) next;
            if (pair != null && (function1 = (Function1) pair.getFirst()) != null) {
                return function1;
            }
        }
        return onwarmupcompleted;
    }

    private static final Function1<Throwable, Throwable> onExtraCallbackWithResult(final Function1<? super Throwable, ? extends Throwable> function1) {
        return new Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return setFlexDirection.onNavigationEvent(function1, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable onNavigationEvent(Function1 function1, Throwable th) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            Throwable th2 = (Throwable) function1.invoke(th);
            if (!Intrinsics.areEqual(th.getMessage(), th2.getMessage()) && !Intrinsics.areEqual(th2.getMessage(), th.toString())) {
                th2 = null;
            }
            obj = Result.constructor-impl(th2);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        return (Throwable) (Result.onExtraCallback(obj) ? null : obj);
    }

    private static final int onExtraCallbackWithResult(Class<?> cls, int i) {
        Object objValueOf;
        clearRegisters.IAuthTabCallback(cls);
        try {
            Result.Companion companion = Result.Companion;
            objValueOf = Result.constructor-impl(Integer.valueOf(onWarmupCompleted(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objValueOf = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(objValueOf)) {
            objValueOf = Integer.valueOf(i);
        }
        return ((Number) objValueOf).intValue();
    }

    static /* synthetic */ int onWarmupCompleted(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return IAuthTabCallback((Class<?>) cls, i);
    }

    private static final int IAuthTabCallback(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
