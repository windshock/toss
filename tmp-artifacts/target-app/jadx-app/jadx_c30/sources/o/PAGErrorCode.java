package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGErrorCode extends PAGLoadCallback implements Comparable {
    private final List<PAGConstantPAGPAConsentType> IAuthTabCallback;
    private final String onExtraCallback;
    private final onRenderSuccess onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    public PAGErrorCode(String str, onRenderSuccess onrendersuccess, List<PAGConstantPAGPAConsentType> list) {
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = onrendersuccess;
        this.IAuthTabCallback = list;
        this.onNavigationEvent = onrendersuccess.toString().startsWith("(");
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        PAGErrorCode pAGErrorCode = (PAGErrorCode) obj;
        if (this.onExtraCallback.equals(pAGErrorCode.onExtraCallback)) {
            return 0;
        }
        boolean z = this.onNavigationEvent;
        if (z && !pAGErrorCode.onNavigationEvent) {
            return 1;
        }
        if (pAGErrorCode.onNavigationEvent && !z) {
            return -1;
        }
        if (this.IAuthTabCallback.size() - pAGErrorCode.IAuthTabCallback.size() != 0) {
            return this.IAuthTabCallback.size() - pAGErrorCode.IAuthTabCallback.size();
        }
        if (this.IAuthTabCallback.size() > 0) {
            for (int size = this.IAuthTabCallback.size() - 1; size >= 0; size--) {
                int iCompareTo = this.IAuthTabCallback.get(size).compareTo(pAGErrorCode.IAuthTabCallback.get(size));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
        }
        return this.onExtraCallback.compareTo(pAGErrorCode.onExtraCallback);
    }

    public onRenderSuccess onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public String toString() {
        return this.onExtraCallback;
    }
}
