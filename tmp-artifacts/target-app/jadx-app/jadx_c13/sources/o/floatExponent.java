package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class floatExponent {
    static final deserializeFloatCollection<Object, Object> onExtraCallback = new IAuthTabCallback();

    public static int IAuthTabCallback(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static int onExtraCallback(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static <T> T onExtraCallbackWithResult(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean onExtraCallbackWithResult(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> deserializeFloatCollection<T, T> onWarmupCompleted() {
        return (deserializeFloatCollection<T, T>) onExtraCallback;
    }

    public static int onExtraCallbackWithResult(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    static final class IAuthTabCallback implements deserializeFloatCollection<Object, Object> {
        IAuthTabCallback() {
        }

        @Override // o.deserializeFloatCollection
        public boolean IAuthTabCallback(Object obj, Object obj2) {
            return floatExponent.onExtraCallbackWithResult(obj, obj2);
        }
    }
}
