package o;

import io.opentelemetry.api.internal.ReadOnlyArrayMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ErrorType<K, V> {
    private final Object[] IAuthTabCallback;
    private int onNavigationEvent;

    public ErrorType(Object[] objArr) {
        this.IAuthTabCallback = objArr;
    }

    public ErrorType(Object[] objArr, Comparator<?> comparator) {
        this(onNavigationEvent(objArr, comparator));
    }

    public final List<Object> IAuthTabCallback() {
        return Arrays.asList(this.IAuthTabCallback);
    }

    public final int size() {
        return this.IAuthTabCallback.length / 2;
    }

    public final boolean isEmpty() {
        return this.IAuthTabCallback.length == 0;
    }

    public final Map<K, V> onNavigationEvent() {
        return ReadOnlyArrayMap.onNavigationEvent(IAuthTabCallback());
    }

    @Nullable
    public final V onExtraCallbackWithResult(K k) {
        if (k == null) {
            return null;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.IAuthTabCallback;
            if (i >= objArr.length) {
                return null;
            }
            if (k.equals(objArr[i])) {
                return (V) this.IAuthTabCallback[i + 1];
            }
            i += 2;
        }
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.IAuthTabCallback;
            if (i >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i], objArr[i + 1]);
            i += 2;
        }
    }

    private static Object[] onNavigationEvent(Object[] objArr, Comparator<?> comparator) {
        getUnhandledExceptions.onExtraCallbackWithResult(objArr.length % 2 == 0, "You must provide an even number of key/value pair arguments.");
        if (objArr.length == 0) {
            return objArr;
        }
        onExtraCallback(objArr, comparator);
        return onExtraCallbackWithResult(objArr, comparator);
    }

    private static void onExtraCallback(Object[] objArr, Comparator<?> comparator) {
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        onExtraCallbackWithResult(objArr2, 0, objArr.length, objArr, comparator);
    }

    private static void onExtraCallbackWithResult(Object[] objArr, int i, int i2, Object[] objArr2, Comparator<?> comparator) {
        if (i2 - i <= 2) {
            return;
        }
        int i3 = ((i2 + i) / 4) << 1;
        onExtraCallbackWithResult(objArr2, i, i3, objArr, comparator);
        onExtraCallbackWithResult(objArr2, i3, i2, objArr, comparator);
        onExtraCallbackWithResult(objArr, i, i3, i2, objArr2, comparator);
    }

    private static <K> void onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, Object[] objArr2, Comparator<K> comparator) {
        int i4 = i;
        int i5 = i2;
        while (i < i3) {
            if (i4 < i2 - 1 && (i5 >= i3 - 1 || onExtraCallbackWithResult(objArr[i4], objArr[i5], comparator) <= 0)) {
                objArr2[i] = objArr[i4];
                objArr2[i + 1] = objArr[i4 + 1];
                i4 += 2;
            } else {
                objArr2[i] = objArr[i5];
                objArr2[i + 1] = objArr[i5 + 1];
                i5 += 2;
            }
            i += 2;
        }
    }

    private static <K> int onExtraCallbackWithResult(@Nullable K k, @Nullable K k2, Comparator<K> comparator) {
        if (k == null) {
            return k2 == null ? 0 : -1;
        }
        if (k2 == null) {
            return 1;
        }
        return comparator.compare(k, k2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K> Object[] onExtraCallbackWithResult(Object[] objArr, Comparator<K> comparator) {
        Object obj = null;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2 += 2) {
            Object obj2 = objArr[i2];
            Object obj3 = objArr[i2 + 1];
            if (obj2 != null) {
                if (obj != null && comparator.compare(obj2, obj) == 0) {
                    i -= 2;
                }
                if (obj3 == null) {
                    obj = null;
                } else {
                    objArr[i] = obj2;
                    objArr[i + 1] = obj3;
                    i += 2;
                    obj = obj2;
                }
            }
        }
        if (objArr.length == i) {
            return objArr;
        }
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorType) {
            return Arrays.equals(this.IAuthTabCallback, ((ErrorType) obj).IAuthTabCallback);
        }
        return false;
    }

    public int hashCode() {
        int i = this.onNavigationEvent;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.IAuthTabCallback) ^ 1000003;
        this.onNavigationEvent = iHashCode;
        return iHashCode;
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.IAuthTabCallback;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i + 1];
            if (obj instanceof String) {
                string = '\"' + ((String) obj) + '\"';
            } else {
                string = obj.toString();
            }
            sb.append(this.IAuthTabCallback[i]);
            sb.append("=");
            sb.append(string);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    public Object[] onExtraCallback() {
        return this.IAuthTabCallback;
    }
}
