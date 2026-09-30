package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum access26200 {
    COMPLETE;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    static final class onExtraCallbackWithResult implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        onExtraCallbackWithResult(Throwable th) {
            this.e = th;
        }

        public String toString() {
            return "NotificationLite.Error[" + this.e + "]";
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof onExtraCallbackWithResult) {
                return floatExponent.onExtraCallbackWithResult(this.e, ((onExtraCallbackWithResult) obj).e);
            }
            return false;
        }
    }

    static final class onExtraCallback implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final ycxExternalSyntheticLambda1 upstream;

        onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
            this.upstream = ycxexternalsyntheticlambda1;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    static final class IAuthTabCallback implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final deserializeUriNullableCollection upstream;

        IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.upstream = deserializeurinullablecollection;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object error(Throwable th) {
        return new onExtraCallbackWithResult(th);
    }

    public static Object subscription(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        return new onExtraCallback(ycxexternalsyntheticlambda1);
    }

    public static Object disposable(deserializeUriNullableCollection deserializeurinullablecollection) {
        return new IAuthTabCallback(deserializeurinullablecollection);
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isError(Object obj) {
        return obj instanceof onExtraCallbackWithResult;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof onExtraCallback;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof IAuthTabCallback;
    }

    public static Throwable getError(Object obj) {
        return ((onExtraCallbackWithResult) obj).e;
    }

    public static ycxExternalSyntheticLambda1 getSubscription(Object obj) {
        return ((onExtraCallback) obj).upstream;
    }

    public static deserializeUriNullableCollection getDisposable(Object obj) {
        return ((IAuthTabCallback) obj).upstream;
    }

    public static <T> boolean accept(Object obj, ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (obj == COMPLETE) {
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            return true;
        }
        if (obj instanceof onExtraCallbackWithResult) {
            ycxexternalsyntheticlambda0.onWarmupCompleted(((onExtraCallbackWithResult) obj).e);
            return true;
        }
        ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) obj);
        return false;
    }

    public static <T> boolean accept(Object obj, writeQuoted<? super T> writequoted) {
        if (obj == COMPLETE) {
            writequoted.onExtraCallback();
            return true;
        }
        if (obj instanceof onExtraCallbackWithResult) {
            writequoted.onExtraCallbackWithResult(((onExtraCallbackWithResult) obj).e);
            return true;
        }
        writequoted.onExtraCallback(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (obj == COMPLETE) {
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            return true;
        }
        if (obj instanceof onExtraCallbackWithResult) {
            ycxexternalsyntheticlambda0.onWarmupCompleted(((onExtraCallbackWithResult) obj).e);
            return true;
        }
        if (obj instanceof onExtraCallback) {
            ycxexternalsyntheticlambda0.onExtraCallback(((onExtraCallback) obj).upstream);
            return false;
        }
        ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, writeQuoted<? super T> writequoted) {
        if (obj == COMPLETE) {
            writequoted.onExtraCallback();
            return true;
        }
        if (obj instanceof onExtraCallbackWithResult) {
            writequoted.onExtraCallbackWithResult(((onExtraCallbackWithResult) obj).e);
            return true;
        }
        if (obj instanceof IAuthTabCallback) {
            writequoted.IAuthTabCallback(((IAuthTabCallback) obj).upstream);
            return false;
        }
        writequoted.onExtraCallback(obj);
        return false;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
