package o;

import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1 {
    public static Object[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 1;
    private static char asBinder = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 0;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final Map<String, List<Method>> onWarmupCompleted;

    static {
        onNavigationEvent();
        onWarmupCompleted();
        onWarmupCompleted = new ConcurrentHashMap();
        IAuthTabCallback = null;
        int i = IAuthTabCallbackDefault + 7;
        access100 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException();
        }
    }

    public static void IAuthTabCallback(String str, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(str, objArr, (Object) null);
        } else {
            onNavigationEvent(str, objArr, (Object) null);
            throw new NullPointerException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void onNavigationEvent(java.lang.String r5, java.lang.Object[] r6, java.lang.Object r7) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.onTransact
            int r1 = r1 + 31
            int r2 = r1 % 128
            o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.asInterface = r2
            int r1 = r1 % r0
            if (r1 != 0) goto Lb8
            o.DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 r5 = o.DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda5.onExtraCallbackWithResult(r5)
            if (r5 != 0) goto L15
            return
        L15:
            java.lang.String r1 = r5.IAuthTabCallback
            java.lang.Class r1 = java.lang.Class.forName(r1)
            java.lang.String r2 = r5.onNavigationEvent
            java.lang.reflect.Method r1 = onNavigationEvent(r1, r6, r2)
            java.lang.Object r6 = onNavigationEvent(r1, r6, r7)
            java.lang.Class r7 = r6.getClass()
            java.lang.String r1 = r5.onWarmupCompleted
            java.lang.reflect.Field r7 = r7.getDeclaredField(r1)
            r1 = 1
            r7.setAccessible(r1)
            java.lang.Object r6 = r7.get(r6)
            java.lang.Class r7 = r6.getClass()
            java.lang.String r2 = r7.getName()
            java.lang.String r3 = r5.onExtraCallbackWithResult
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L54
            int r2 = o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.onTransact
            int r2 = r2 + 47
            int r3 = r2 % 128
            o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.asInterface = r3
            int r2 = r2 % r0
            boolean r6 = r6 instanceof java.lang.reflect.Proxy
            if (r6 == 0) goto Lae
        L54:
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int[] r2 = new int[r1]
            r3 = 0
            r6[r3] = r2
            int[] r2 = new int[r1]
            r6[r1] = r2
            int[] r2 = new int[r1]
            r4 = 3
            r6[r4] = r2
            java.lang.String r5 = r5.onExtraCallbackWithResult
            java.lang.String r7 = r7.getName()
            java.lang.String[] r5 = new java.lang.String[]{r5, r7}
            r7 = r6[r1]
            int[] r7 = (int[]) r7
            r7[r3] = r3
            r7 = r6[r3]
            int[] r7 = (int[]) r7
            r1 = 22
            r7[r3] = r1
            r6[r0] = r5
            int r5 = android.os.Process.myUid()
            int r5 = ~r5
            r7 = -983616231(0xffffffffc55f3519, float:-3571.3186)
            r7 = r7 | r5
            int r7 = ~r7
            r1 = -241351028(0xfffffffff19d468c, float:-1.5575818E30)
            r7 = r7 | r1
            int r7 = r7 * (-983)
            r2 = -1312620634(0xffffffffb1c2ffa6, float:-5.675207E-9)
            int r2 = r2 + r7
            r5 = r5 | r1
            int r5 = ~r5
            r7 = 71446801(0x4423111, float:2.282712E-36)
            r5 = r5 | r7
            int r5 = r5 * 983
            int r2 = r2 + r5
            int r5 = r2 << 13
            r5 = r5 ^ r2
            int r7 = r5 >>> 17
            r5 = r5 ^ r7
            int r7 = r5 << 5
            r5 = r5 ^ r7
            r7 = r6[r4]
            int[] r7 = (int[]) r7
            r7[r3] = r5
            IAuthTabCallback(r6)
        Lae:
            int r5 = o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.asInterface
            int r5 = r5 + 85
            int r6 = r5 % 128
            o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.onTransact = r6
            int r5 = r5 % r0
            return
        Lb8:
            o.DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda5.onExtraCallbackWithResult(r5)
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.onNavigationEvent(java.lang.String, java.lang.Object[], java.lang.Object):void");
    }

    private static Object onNavigationEvent(Method method, Object[] objArr, Object obj) throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr2 = new Object[1];
            onNavigationEvent("\u0017\u0007\r\u0005\u000e\u0004\u0007\r\u0004\b\u0015\u0003\u0004\u0016\u0006\u000b\u0018\u0006\u0000\u0002\u0014\u0006\u000e\n", (byte) (110 - MotionEvent.axisFromString("")), TextUtils.getOffsetAfter("", 0) + 24, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            onNavigationEvent("\u0004\u0002\u0018\u0001\u000e\n\u0016\u0007\u0010\u0002\u0016\b", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 8), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
            if ((((Integer) cls.getMethod((String) objArr3[0], null).invoke(method, null)).intValue() & 8) != 0) {
                int i2 = onTransact + 31;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return method.invoke(null, objArr);
            }
            Object objInvoke = method.invoke(obj, objArr);
            int i4 = asInterface + 41;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void onExtraCallbackWithResult(String str, char c, String str2, int i, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        int i2 = 2 % 2;
        if (str3 != null) {
            charArray = str3.toCharArray();
            int i3 = getInterfaceDescriptor + 67;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 == null ? str2 : str2.toCharArray();
        if (str == null) {
            charArray2 = str;
        } else {
            charArray2 = str.toCharArray();
            int i5 = getInterfaceDescriptor + 85;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
        }
        NetworkTypeObserverReceiverExternalSyntheticLambda0 networkTypeObserverReceiverExternalSyntheticLambda0 = new NetworkTypeObserverReceiverExternalSyntheticLambda0();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent = 0;
        while (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent < length3) {
            int i7 = IAuthTabCallback_Parcel + 87;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            int i9 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 2) % 4;
            int i10 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 3) % 4;
            networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted = (char) (((cArr2[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent % 4] * 32718) + cArr3[i9]) % 65535);
            cArr3[i10] = (char) (((cArr2[i10] * 32718) + cArr3[i9]) / 65535);
            cArr2[i10] = networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted;
            cArr4[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent] = (char) ((((cArr2[i10] ^ r3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent]) ^ (onExtraCallback ^ 5161337353776785399L)) ^ ((int) (onExtraCallbackWithResult ^ 5161337353776785399L))) ^ ((char) (onNavigationEvent ^ 5161337353776785399L)));
            networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArr4);
    }

    private static Method onNavigationEvent(Class<?> cls, Object[] objArr, String str) throws NoSuchMethodException, SecurityException {
        Class<?> cls2;
        int i = 2 % 2;
        if (objArr.length <= 0) {
            return cls.getDeclaredMethod(str, new Class[0]);
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                int i3 = asInterface + 95;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    throw new ArithmeticException();
                }
                cls2 = Object.class;
            } else {
                cls2 = obj.getClass();
            }
            clsArr[i2] = cls2;
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        int i4 = asInterface + 87;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return declaredMethod;
        }
        throw new NullPointerException();
    }

    private static void onNavigationEvent(String str, byte b, int i, Object[] objArr) {
        int i2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue();
        char[] cArr2 = IAuthTabCallbackStub;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (cArr2[i3] ^ 6292690160322140727L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (6292690160322140727L ^ asBinder);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            reorderingBufferQueue.onNavigationEvent = 0;
            while (reorderingBufferQueue.onNavigationEvent < i2) {
                reorderingBufferQueue.onExtraCallbackWithResult = cArr[reorderingBufferQueue.onNavigationEvent];
                reorderingBufferQueue.IAuthTabCallback = cArr[reorderingBufferQueue.onNavigationEvent + 1];
                if (reorderingBufferQueue.onExtraCallbackWithResult == reorderingBufferQueue.IAuthTabCallback) {
                    cArr4[reorderingBufferQueue.onNavigationEvent] = (char) (reorderingBufferQueue.onExtraCallbackWithResult - b);
                    cArr4[reorderingBufferQueue.onNavigationEvent + 1] = (char) (reorderingBufferQueue.IAuthTabCallback - b);
                } else {
                    reorderingBufferQueue.onWarmupCompleted = reorderingBufferQueue.onExtraCallbackWithResult / c;
                    reorderingBufferQueue.asBinder = reorderingBufferQueue.onExtraCallbackWithResult % c;
                    reorderingBufferQueue.onExtraCallback = reorderingBufferQueue.IAuthTabCallback / c;
                    reorderingBufferQueue.onTransact = reorderingBufferQueue.IAuthTabCallback % c;
                    if (reorderingBufferQueue.asBinder == reorderingBufferQueue.onTransact) {
                        reorderingBufferQueue.onWarmupCompleted = ((reorderingBufferQueue.onWarmupCompleted + c) - 1) % c;
                        reorderingBufferQueue.onExtraCallback = ((reorderingBufferQueue.onExtraCallback + c) - 1) % c;
                        int i4 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i5 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i4];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i5];
                    } else if (reorderingBufferQueue.onWarmupCompleted == reorderingBufferQueue.onExtraCallback) {
                        reorderingBufferQueue.asBinder = ((reorderingBufferQueue.asBinder + c) - 1) % c;
                        reorderingBufferQueue.onTransact = ((reorderingBufferQueue.onTransact + c) - 1) % c;
                        int i6 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.asBinder;
                        int i7 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.onTransact;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i6];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i7];
                    } else {
                        int i8 = (reorderingBufferQueue.onWarmupCompleted * c) + reorderingBufferQueue.onTransact;
                        int i9 = (reorderingBufferQueue.onExtraCallback * c) + reorderingBufferQueue.asBinder;
                        cArr4[reorderingBufferQueue.onNavigationEvent] = cArr2[i8];
                        cArr4[reorderingBufferQueue.onNavigationEvent + 1] = cArr2[i9];
                    }
                }
                reorderingBufferQueue.onNavigationEvent += 2;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static Object onExtraCallbackWithResult(String str, String str2, Object[] objArr, Object obj, Object[] objArr2, List<Method> list) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(str, str2, objArr, obj, objArr2, null, list);
        }
        onWarmupCompleted(str, str2, objArr, obj, objArr2, null, list);
        throw new NullPointerException();
    }

    public static Object onWarmupCompleted(String str, String str2, Object[] objArr, Object obj, Object[] objArr2, Object obj2, List<Method> list) throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(str, objArr2, obj2);
        DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1 defaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1OnExtraCallbackWithResult = DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda5.onExtraCallbackWithResult(str);
        if (defaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1OnExtraCallbackWithResult == null) {
            int i2 = onTransact + 113;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw new NullPointerException();
        }
        DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6 defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6OnExtraCallbackWithResult = defaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult(str2);
        Class<?> cls = obj.getClass();
        Object objInvoke = cls.getDeclaredMethod(defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6OnExtraCallbackWithResult.IAuthTabCallback, defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6OnExtraCallbackWithResult.onExtraCallbackWithResult).invoke(obj, objArr);
        if (objInvoke instanceof Parcelable) {
            int i3 = asInterface + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult((Parcelable) objInvoke);
        } else if (objInvoke instanceof List) {
            int i5 = asInterface + 83;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            for (Object obj3 : (List) objInvoke) {
                if (obj3 instanceof Parcelable) {
                    onExtraCallback(obj3.getClass());
                }
            }
        } else if (defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6OnExtraCallbackWithResult.onNavigationEvent != null && (!defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6OnExtraCallbackWithResult.onNavigationEvent.isEmpty())) {
            Iterator<Class<?>> it = defaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda6OnExtraCallbackWithResult.onNavigationEvent.iterator();
            while (it.hasNext()) {
                onExtraCallback(it.next());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        Map<String, List<Method>> map = onWarmupCompleted;
        if (map.containsKey(str)) {
            arrayList.addAll(map.get(str));
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(Arrays.asList(cls.getDeclaredMethods()));
            if (objInvoke != null) {
                int i7 = onTransact + 9;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                arrayList2.addAll(Arrays.asList(objInvoke.getClass().getDeclaredMethods()));
            }
            map.put(str, arrayList2);
            arrayList.addAll(arrayList2);
        }
        onExtraCallback(arrayList);
        return objInvoke;
    }

    public static Object[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = IAuthTabCallback;
        int i5 = i2 + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return objArr;
    }

    public static void IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 29;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback = objArr;
        int i5 = i2 + 43;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 81;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback = null;
        int i5 = i2 + 15;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw new ArithmeticException();
        }
    }

    public static void onExtraCallbackWithResult(Parcelable parcelable) throws IllegalAccessException, NoSuchFieldException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        int i = 2 % 2;
        if (parcelable == null) {
            return;
        }
        onExtraCallback(parcelable.getClass());
        Field[] declaredFields = parcelable.getClass().getDeclaredFields();
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(parcelable);
            if (obj instanceof Parcelable) {
                onExtraCallbackWithResult((Parcelable) obj);
            } else if (!(!(obj instanceof List))) {
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof Parcelable) {
                        onExtraCallbackWithResult((Parcelable) obj2);
                    }
                }
            } else if (obj != null) {
                int i4 = onTransact + 79;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                if (obj.getClass().isArray()) {
                    int i6 = asInterface + 63;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                    Class<?> componentType = obj.getClass().getComponentType();
                    if (componentType == null || !Parcelable.class.isAssignableFrom(componentType)) {
                        return;
                    }
                    int length = Array.getLength(obj);
                    for (int i8 = 0; i8 < length; i8++) {
                        int i9 = onTransact + 47;
                        asInterface = i9 % 128;
                        if (i9 % 2 != 0) {
                            Array.get(obj, i8);
                            throw new ArithmeticException();
                        }
                        Object obj3 = Array.get(obj, i8);
                        if (!(!(obj3 instanceof Parcelable))) {
                            onExtraCallbackWithResult((Parcelable) obj3);
                        }
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }

    private static void onExtraCallback(Class<?> cls) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            onExtraCallbackWithResult("藋\uf787鏇ꦜ\ue38f캸乄", (char) View.combineMeasuredStates(1, 0), "༺\udbe3鿭ࠄ", (-304356593) >>> (ViewConfiguration.getTouchSlop() % 36), "ࢥ\uf027鯘큮", objArr);
            Field declaredField = cls.getDeclaredField((String) objArr[0]);
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
            if (obj == null) {
                return;
            }
        } else {
            Object[] objArr2 = new Object[1];
            onExtraCallbackWithResult("藋\uf787鏇ꦜ\ue38f캸乄", (char) View.combineMeasuredStates(0, 0), "༺\udbe3鿭ࠄ", (ViewConfiguration.getTouchSlop() >> 8) - 304356593, "ࢥ\uf027鯘큮", objArr2);
            Field declaredField2 = cls.getDeclaredField((String) objArr2[0]);
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
            if (obj == null) {
                return;
            }
        }
        if (!(!(obj instanceof Parcelable.Creator))) {
            int i3 = onTransact + 59;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                throw new ArithmeticException();
            }
            if (!(obj instanceof Proxy)) {
                String name = obj.getClass().getName();
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                Object[] objArr3 = new Object[1];
                onExtraCallbackWithResult("ฬ", (char) (20219 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "撞䌝ﮟ驎", (-1622991516) - TextUtils.indexOf("", ""), "ࢥ\uf027鯘큮", objArr3);
                sb.append((String) objArr3[0]);
                if (name.startsWith(sb.toString())) {
                    return;
                }
            }
        }
        Object[] objArr4 = {new int[1], new int[1], strArr, new int[1]};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.getName());
        Object[] objArr5 = new Object[1];
        onExtraCallbackWithResult("\ueaaf鲦", (char) (((Process.getThreadPriority(0) + 20) >> 6) + 7548), "痥阧粒㨝", TextUtils.indexOf("", "", 0, 0), "ࢥ\uf027鯘큮", objArr5);
        sb2.append((String) objArr5[0]);
        String[] strArr = {sb2.toString(), obj.getClass().getName()};
        ((int[]) objArr4[1])[0] = 0;
        ((int[]) objArr4[0])[0] = 21;
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i4 = 480291412 + (((-80360273) | startElapsedRealtime) * (-627)) + (((~((-1127532682) | startElapsedRealtime)) | 97434576) * (-627)) + (((~(startElapsedRealtime | 97434576)) | (~((~startElapsedRealtime) | 1127532681))) * 627);
        int i5 = (i4 << 13) ^ i4;
        int i6 = i5 ^ (i5 >>> 17);
        ((int[]) objArr4[3])[0] = i6 ^ (i6 << 5);
        IAuthTabCallback(objArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x021b A[PHI: r0 r1 r3 r18
      0x021b: PHI (r0v41 int) = (r0v16 int), (r0v50 int) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r1v35 int) = (r1v11 int), (r1v41 int) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r3v24 java.lang.reflect.Method[]) = (r3v11 java.lang.reflect.Method[]), (r3v37 java.lang.reflect.Method[]) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r18v3 java.util.ArrayList) = (r18v0 java.util.ArrayList), (r18v4 java.util.ArrayList) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0219 A[PHI: r0 r1 r3 r18
      0x0219: PHI (r0v17 int) = (r0v16 int), (r0v50 int) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r1v12 int) = (r1v11 int), (r1v41 int) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r3v12 java.lang.reflect.Method[]) = (r3v11 java.lang.reflect.Method[]), (r3v37 java.lang.reflect.Method[]) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r18v1 java.util.ArrayList) = (r18v0 java.util.ArrayList), (r18v4 java.util.ArrayList) binds: [B:8:0x0217, B:5:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void onExtraCallback(java.util.List<java.lang.reflect.Method> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultRendererCapabilitiesListFactoryExternalSyntheticLambda1.onExtraCallback(java.util.List):void");
    }

    static void onWarmupCompleted() {
        onExtraCallback = -7507963323938836654L;
        onExtraCallbackWithResult = 835839991;
        onNavigationEvent = (char) 59383;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = new char[]{55856, 61384, 61387, 61386, 61408, 61381, 61390, 61406, 61388, 61315, 61403, 55860, 61379, 61378, 61385, 55861, 55862, 61380, 55859, 55857, 55858, 61401, 61383, 61407, 61377};
        asBinder = (char) 55858;
    }
}
