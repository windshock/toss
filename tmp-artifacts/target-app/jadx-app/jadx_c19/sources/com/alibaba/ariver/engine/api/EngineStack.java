package com.alibaba.ariver.engine.api;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class EngineStack {
    private static String TAG = "AriverEngine:EngineStack";
    private static EngineStack instance;
    private Map<String, Stack<WeakReference<RVEngine>>> stackMap = new HashMap();

    private EngineStack() {
    }

    public static EngineStack getInstance() {
        if (instance == null) {
            instance = new EngineStack();
        }
        return instance;
    }

    private Stack<WeakReference<RVEngine>> getTargetStack(String str) {
        Stack<WeakReference<RVEngine>> stack;
        synchronized (this) {
            stack = this.stackMap.get(str);
            if (stack == null) {
                stack = new Stack<>();
                this.stackMap.put(str, stack);
            }
        }
        return stack;
    }

    public void pushEnginePorxy(RVEngine rVEngine) {
        if (rVEngine == null) {
            RVLogger.d(TAG, "push  empty engineProxy");
            return;
        }
        RVLogger.d(TAG, "push proxy appId=" + rVEngine.getAppId() + " ,appinstanceid =" + rVEngine.getInstanceId() + " , obj=" + rVEngine.hashCode() + " targetType=" + rVEngine.getClass());
        synchronized (this) {
            getTargetStack(rVEngine.getEngineType()).push(new WeakReference<>(rVEngine));
        }
    }

    public void removeProxy(RVEngine rVEngine) {
        if (rVEngine == null) {
            RVLogger.d(TAG, "reomve  empty engineProxy");
            return;
        }
        RVLogger.d(TAG, "remove proxy appId=" + rVEngine.getAppId() + " , obj=" + rVEngine.hashCode() + " targetType=" + rVEngine.getClass());
        synchronized (this) {
            Stack<WeakReference<RVEngine>> targetStack = getTargetStack(rVEngine.getEngineType());
            if (targetStack.isEmpty()) {
                return;
            }
            Iterator<WeakReference<RVEngine>> it = targetStack.iterator();
            WeakReference<RVEngine> weakReference = null;
            while (it.hasNext()) {
                WeakReference<RVEngine> next = it.next();
                if (next != null && next.get() == rVEngine) {
                    weakReference = next;
                }
            }
            if (weakReference != null) {
                targetStack.remove(weakReference);
            }
        }
    }

    public RVEngine getByInstanceId(String str, String str2) {
        synchronized (this) {
            Stack<WeakReference<RVEngine>> targetStack = getTargetStack(str);
            if (targetStack.isEmpty()) {
                return null;
            }
            Iterator<WeakReference<RVEngine>> it = targetStack.iterator();
            while (it.hasNext()) {
                WeakReference<RVEngine> next = it.next();
                if (next != null && next.get() != null && TextUtils.equals(next.get().getInstanceId(), str2)) {
                    return next.get();
                }
            }
            return null;
        }
    }

    public RVEngine getTopProxy(String str) {
        synchronized (this) {
            Stack<WeakReference<RVEngine>> targetStack = getTargetStack(str);
            while (!targetStack.isEmpty()) {
                WeakReference<RVEngine> weakReferencePeek = targetStack.peek();
                if (weakReferencePeek != null && weakReferencePeek.get() != null) {
                    return weakReferencePeek.get();
                }
                targetStack.pop();
            }
            return null;
        }
    }
}
