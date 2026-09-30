package o;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class nIsHwuiUsingVulkanRenderer implements RememberLifecycleOwnerKtExternalSyntheticLambda0 {
    protected HashMap<Class<?>, Annotation> onExtraCallbackWithResult;

    public nIsHwuiUsingVulkanRenderer() {
    }

    public static nIsHwuiUsingVulkanRenderer onExtraCallbackWithResult(Class<?> cls, Annotation annotation) {
        HashMap map = new HashMap(4);
        map.put(cls, annotation);
        return new nIsHwuiUsingVulkanRenderer(map);
    }

    nIsHwuiUsingVulkanRenderer(HashMap<Class<?>, Annotation> map) {
        this.onExtraCallbackWithResult = map;
    }

    @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
    public <A extends Annotation> A onExtraCallbackWithResult(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this.onExtraCallbackWithResult;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
    public boolean IAuthTabCallback(Class<?> cls) {
        HashMap<Class<?>, Annotation> map = this.onExtraCallbackWithResult;
        if (map == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
    public boolean onWarmupCompleted(Class<? extends Annotation>[] clsArr) {
        if (this.onExtraCallbackWithResult != null) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (this.onExtraCallbackWithResult.containsKey(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static nIsHwuiUsingVulkanRenderer onNavigationEvent(nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer, nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (nishwuiusingvulkanrenderer == null || (map = nishwuiusingvulkanrenderer.onExtraCallbackWithResult) == null || map.isEmpty()) {
            return nishwuiusingvulkanrenderer2;
        }
        if (nishwuiusingvulkanrenderer2 == null || (map2 = nishwuiusingvulkanrenderer2.onExtraCallbackWithResult) == null || map2.isEmpty()) {
            return nishwuiusingvulkanrenderer;
        }
        HashMap map3 = new HashMap();
        for (Annotation annotation : nishwuiusingvulkanrenderer2.onExtraCallbackWithResult.values()) {
            map3.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : nishwuiusingvulkanrenderer.onExtraCallbackWithResult.values()) {
            map3.put(annotation2.annotationType(), annotation2);
        }
        return new nIsHwuiUsingVulkanRenderer(map3);
    }

    @Override // o.RememberLifecycleOwnerKtExternalSyntheticLambda0
    public int onWarmupCompleted() {
        HashMap<Class<?>, Annotation> map = this.onExtraCallbackWithResult;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public boolean onExtraCallbackWithResult(Annotation annotation) {
        return onNavigationEvent(annotation);
    }

    public String toString() {
        HashMap<Class<?>, Annotation> map = this.onExtraCallbackWithResult;
        if (map == null) {
            return "[null]";
        }
        return map.toString();
    }

    protected final boolean onNavigationEvent(Annotation annotation) {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = new HashMap<>();
        }
        Annotation annotationPut = this.onExtraCallbackWithResult.put(annotation.annotationType(), annotation);
        return annotationPut == null || !annotationPut.equals(annotation);
    }
}
