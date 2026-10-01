package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycx19 {
    private static boolean onExtraCallback = false;
    private static onExtraCallbackWithResult onWarmupCompleted;

    private ycx19() {
    }

    public static String onExtraCallbackWithResult(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean onWarmupCompleted(String str) {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (strOnExtraCallbackWithResult == null) {
            return false;
        }
        return strOnExtraCallbackWithResult.equalsIgnoreCase("true");
    }

    static final class onExtraCallbackWithResult extends SecurityManager {
        private onExtraCallbackWithResult() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private static onExtraCallbackWithResult onNavigationEvent() {
        onExtraCallbackWithResult onextracallbackwithresult = onWarmupCompleted;
        if (onextracallbackwithresult != null) {
            return onextracallbackwithresult;
        }
        if (onExtraCallback) {
            return null;
        }
        onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = IAuthTabCallback();
        onWarmupCompleted = onextracallbackwithresultIAuthTabCallback;
        onExtraCallback = true;
        return onextracallbackwithresultIAuthTabCallback;
    }

    private static onExtraCallbackWithResult IAuthTabCallback() {
        try {
            return new onExtraCallbackWithResult();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static Class<?> onWarmupCompleted() {
        int i;
        onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onNavigationEvent();
        if (onextracallbackwithresultOnNavigationEvent == null) {
            return null;
        }
        Class<?>[] classContext = onextracallbackwithresultOnNavigationEvent.getClassContext();
        String name = ycx19.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static final void onWarmupCompleted(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
    }

    public static final void IAuthTabCallback(String str) {
        System.err.println("SLF4J: " + str);
    }
}
