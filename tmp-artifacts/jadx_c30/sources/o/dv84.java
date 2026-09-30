package o;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv84 {
    private static final onWarmupCompleted onExtraCallback;

    interface onWarmupCompleted {
        String onExtraCallback(long j);
    }

    static {
        onWarmupCompleted onWarmupCompleted2;
        try {
            onWarmupCompleted2 = onWarmupCompleted("org.bson.json.DateTimeFormatter$Java8DateTimeFormatter");
        } catch (LinkageError unused) {
            onWarmupCompleted2 = onWarmupCompleted("org.bson.json.DateTimeFormatter$JaxbDateTimeFormatter");
        }
        onExtraCallback = onWarmupCompleted2;
    }

    private static onWarmupCompleted onWarmupCompleted(String str) {
        try {
            return (onWarmupCompleted) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        } catch (IllegalAccessException e2) {
            throw new ExceptionInInitializerError(e2);
        } catch (InstantiationException e3) {
            throw new ExceptionInInitializerError(e3);
        } catch (NoSuchMethodException e4) {
            throw new ExceptionInInitializerError(e4);
        } catch (InvocationTargetException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static String onExtraCallbackWithResult(long j) {
        return onExtraCallback.onExtraCallback(j);
    }
}
