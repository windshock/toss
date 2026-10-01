package com.alibaba.ariver.kernel.api.invoke;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtensionInvoker$InvokeResult<T> {
    private boolean isPending;
    private T result;

    public static ExtensionInvoker$InvokeResult proceed() {
        return null;
    }

    public static ExtensionInvoker$InvokeResult decide(Object obj) {
        return new ExtensionInvoker$InvokeResult(false, obj);
    }

    public static ExtensionInvoker$InvokeResult pending() {
        return new ExtensionInvoker$InvokeResult(true, null);
    }

    private ExtensionInvoker$InvokeResult(boolean z, T t) {
        this.isPending = z;
        this.result = t;
    }
}
