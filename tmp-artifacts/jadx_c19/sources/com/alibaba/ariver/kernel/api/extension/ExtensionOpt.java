package com.alibaba.ariver.kernel.api.extension;

import com.alibaba.exthub.common.ExtHubLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtensionOpt {
    public static final String TAG = "AriverKernel:ExtensionOpt";
    private static ExceptionHandler exceptionHandler;
    private static Map<Class<? extends Extension>, MethodInvokeOptimizer> methodInvokeOptMap = new ConcurrentHashMap();
    private static Map<Class<? extends Extension>, MethodInvokeOptimizer> bridgeInvokeOptMap = new ConcurrentHashMap();

    public interface ExceptionHandler {
        void reportException(Throwable th, String str, String str2, String str3, Map<String, String> map);

        boolean shouldThrowOut(Throwable th, String str, String str2);
    }

    public interface MethodInvokeOptimizer {
        Object doMethodInvoke(String str, Extension extension, Object[] objArr) throws Throwable;
    }

    public static class MismatchMethodException extends Exception {
        public MismatchMethodException(String str) {
            super("mismatched method to invoke: " + str);
        }
    }

    public static void setupMethodInvokeOptimizer(Class<? extends Extension> cls, MethodInvokeOptimizer methodInvokeOptimizer) {
        if (cls == null || methodInvokeOptimizer == null) {
            return;
        }
        if (methodInvokeOptMap.put(cls, methodInvokeOptimizer) != null) {
            ExtHubLogger.d(TAG, "setupMethodInvokeOptimizer, duplicate: " + cls.getName());
            return;
        }
        ExtHubLogger.d(TAG, "setupMethodInvokeOptimizer: " + cls.getName());
    }

    public static void setupMethodInvokeOptimizerForBridge(Class<? extends Extension> cls, MethodInvokeOptimizer methodInvokeOptimizer) {
        if (cls == null || methodInvokeOptimizer == null) {
            return;
        }
        if (bridgeInvokeOptMap.put(cls, methodInvokeOptimizer) != null) {
            ExtHubLogger.d(TAG, "setupMethodInvokeOptimizerForBridge, duplicate: " + cls.getName());
            return;
        }
        ExtHubLogger.d(TAG, "setupMethodInvokeOptimizerForBridge: " + cls.getName());
    }

    public static void clearAllMethodInvokeOptimizer() {
        if (methodInvokeOptMap.size() > 0) {
            methodInvokeOptMap = new ConcurrentHashMap();
        }
        if (bridgeInvokeOptMap.size() > 0) {
            bridgeInvokeOptMap = new ConcurrentHashMap();
        }
        ExtHubLogger.d(TAG, "clearAllMethodInvokeOptimizer");
    }

    public static MethodInvokeOptimizer getMethodInvokeOptimizer(Class<? extends Extension> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        Map<Class<? extends Extension>, MethodInvokeOptimizer> map = z ? bridgeInvokeOptMap : methodInvokeOptMap;
        if (map.size() == 0) {
            return null;
        }
        return map.get(cls);
    }

    public static void setupExceptionHandler(ExceptionHandler exceptionHandler2) {
        ExtHubLogger.d(TAG, "setupExceptionHandler, old: " + exceptionHandler + ", new: " + exceptionHandler2);
        exceptionHandler = exceptionHandler2;
    }

    public static void reportException(Throwable th, String str, String str2, String str3, Map<String, String> map) {
        ExceptionHandler exceptionHandler2 = exceptionHandler;
        if (exceptionHandler2 == null) {
            return;
        }
        try {
            exceptionHandler2.reportException(th, str, str2, str3, map);
        } catch (Throwable th2) {
            ExtHubLogger.e(TAG, "reportException, occur error: " + th2);
        }
    }

    public static boolean shouldThrowOut(Throwable th, String str, String str2) {
        boolean z = "doMethodInvoke".equals(str) && "FinalCatch".equals(str2);
        ExtHubLogger.d(TAG, "shouldThrowOut, t: " + th + ", s: " + str + ", f: " + str2 + ", r: " + z);
        return z;
    }
}
