package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGAppOpenAd1 {
    public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

    public static <T> T onExtraCallback(T t, T t2) {
        return t != null ? t : t2;
    }

    public static class onNavigationEvent implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        onNavigationEvent() {
        }

        private Object readResolve() {
            return PAGAppOpenAd1.onExtraCallbackWithResult;
        }
    }

    public static String onExtraCallbackWithResult(Object obj) {
        if (obj == null) {
            return null;
        }
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        StringBuilder sb = new StringBuilder(name.length() + 1 + hexString.length());
        sb.append(name);
        sb.append('@');
        sb.append(hexString);
        return sb.toString();
    }

    public static void onNavigationEvent(StringBuffer stringBuffer, Object obj) {
        PAGVideoMediaView1.IAuthTabCallback(obj, "object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(stringBuffer.length() + name.length() + 1 + hexString.length());
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
