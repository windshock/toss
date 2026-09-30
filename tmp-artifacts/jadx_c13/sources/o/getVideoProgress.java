package o;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getVideoProgress {
    public static final boolean[] onExtraCallback = new boolean[0];
    public static final Boolean[] onWarmupCompleted = new Boolean[0];
    public static final byte[] onExtraCallbackWithResult = new byte[0];
    public static final Byte[] onNavigationEvent = new Byte[0];
    public static final char[] asInterface = new char[0];
    public static final Character[] IAuthTabCallback = new Character[0];
    public static final Class<?>[] asBinder = new Class[0];
    public static final double[] onTransact = new double[0];
    public static final Double[] IAuthTabCallbackDefault = new Double[0];
    public static final Field[] IAuthTabCallbackStub = new Field[0];
    public static final float[] access000 = new float[0];
    public static final Float[] getInterfaceDescriptor = new Float[0];
    public static final int[] IAuthTabCallback_Parcel = new int[0];
    public static final Integer[] access100 = new Integer[0];
    public static final long[] IAuthTabCallbackStubProxy = new long[0];
    public static final Long[] extraCallback = new Long[0];
    public static final Method[] writeTypedObject = new Method[0];
    public static final Object[] readTypedObject = new Object[0];
    public static final short[] ICustomTabsCallback = new short[0];
    public static final Short[] extraCallbackWithResult = new Short[0];
    public static final String[] onActivityLayout = new String[0];
    public static final Throwable[] onActivityResized = new Throwable[0];
    public static final Type[] onPostMessage = new Type[0];

    public static int[] onExtraCallback(int[] iArr, int i) {
        int[] iArr2 = (int[]) onWarmupCompleted(iArr, (Class<?>) Integer.TYPE);
        iArr2[iArr2.length - 1] = i;
        return iArr2;
    }

    public static <T> T[] onNavigationEvent(T[] tArr, T t) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (t != null) {
            componentType = t.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        T[] tArr2 = (T[]) ((Object[]) onWarmupCompleted(tArr, componentType));
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    public static int[] onExtraCallbackWithResult(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static <T> T[] onNavigationEvent(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static boolean onExtraCallback(Object[] objArr, Object obj) {
        return onExtraCallbackWithResult(objArr, obj) != -1;
    }

    private static Object onWarmupCompleted(Object obj, Class<?> cls) throws NegativeArraySizeException {
        if (obj != null) {
            int length = Array.getLength(obj);
            Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            return objNewInstance;
        }
        return Array.newInstance(cls, 1);
    }

    public static int onExtraCallbackWithResult(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int onExtraCallbackWithResult(Object[] objArr, Object obj) {
        return onExtraCallbackWithResult(objArr, obj, 0);
    }

    public static int onExtraCallbackWithResult(Object[] objArr, Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static boolean IAuthTabCallback(char[] cArr) {
        return onExtraCallbackWithResult((Object) cArr) == 0;
    }

    public static boolean IAuthTabCallback(int[] iArr) {
        return onExtraCallbackWithResult((Object) iArr) == 0;
    }

    public static boolean onExtraCallbackWithResult(Object[] objArr) {
        return onExtraCallbackWithResult((Object) objArr) == 0;
    }

    public static boolean onWarmupCompleted(int[] iArr) {
        return !IAuthTabCallback(iArr);
    }

    public static boolean IAuthTabCallback(Object[] objArr, Object[] objArr2) {
        return onExtraCallbackWithResult((Object) objArr) == onExtraCallbackWithResult((Object) objArr2);
    }

    static Object onWarmupCompleted(Object obj, int... iArr) throws NegativeArraySizeException {
        int i;
        int i2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int[] iArrOnNavigationEvent = onVideoAdPlay.onNavigationEvent(onExtraCallbackWithResult(iArr));
        if (onWarmupCompleted(iArrOnNavigationEvent)) {
            int length = iArrOnNavigationEvent.length;
            int i3 = iOnExtraCallbackWithResult;
            i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = iArrOnNavigationEvent[length];
                if (i2 < 0 || i2 >= iOnExtraCallbackWithResult) {
                    break;
                }
                if (i2 < i3) {
                    i++;
                    i3 = i2;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + iOnExtraCallbackWithResult);
        }
        i = 0;
        int i4 = iOnExtraCallbackWithResult - i;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i4);
        if (i < iOnExtraCallbackWithResult) {
            int length2 = iArrOnNavigationEvent.length - 1;
            while (length2 >= 0) {
                int i5 = iArrOnNavigationEvent[length2];
                int i6 = iOnExtraCallbackWithResult - i5;
                if (i6 > 1) {
                    int i7 = i6 - 1;
                    i4 -= i7;
                    System.arraycopy(obj, i5 + 1, objNewInstance, i4, i7);
                }
                length2--;
                iOnExtraCallbackWithResult = i5;
            }
            if (iOnExtraCallbackWithResult > 0) {
                System.arraycopy(obj, 0, objNewInstance, 0, iOnExtraCallbackWithResult);
            }
        }
        return objNewInstance;
    }

    public static <T> T[] onExtraCallback(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) onWarmupCompleted(tArr, iArr));
    }
}
