package o;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class nSetBufferTransform extends nCreate {
    private static final long serialVersionUID = 1;
    protected final nIsHwuiUsingVulkanRenderer[] _paramAnnotations;

    public abstract int access100();

    public abstract Object asInterface() throws Exception;

    public abstract Class<?> onExtraCallbackWithResult(int i2);

    public abstract Object onExtraCallbackWithResult(Object obj) throws Exception;

    public abstract JavaType onNavigationEvent(int i2);

    public abstract Object onWarmupCompleted(Object[] objArr) throws Exception;

    protected nSetBufferTransform(onTransactionCommitted ontransactioncommitted, nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer, nIsHwuiUsingVulkanRenderer[] nishwuiusingvulkanrendererArr) {
        super(ontransactioncommitted, nishwuiusingvulkanrenderer);
        this._paramAnnotations = nishwuiusingvulkanrendererArr;
    }

    protected nDupFenceFd IAuthTabCallback(int i2, nIsHwuiUsingVulkanRenderer nishwuiusingvulkanrenderer) {
        this._paramAnnotations[i2] = nishwuiusingvulkanrenderer;
        return onExtraCallback(i2);
    }

    public final nIsHwuiUsingVulkanRenderer onWarmupCompleted(int i2) {
        nIsHwuiUsingVulkanRenderer[] nishwuiusingvulkanrendererArr = this._paramAnnotations;
        if (nishwuiusingvulkanrendererArr == null || i2 < 0 || i2 >= nishwuiusingvulkanrendererArr.length) {
            return null;
        }
        return nishwuiusingvulkanrendererArr[i2];
    }

    public final nDupFenceFd onExtraCallback(int i2) {
        return new nDupFenceFd(this, onNavigationEvent(i2), this.onWarmupCompleted, onWarmupCompleted(i2), i2);
    }
}
