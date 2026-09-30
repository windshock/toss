package o;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class addNetworkExtrasBundle extends PAGConstant {
    private final PAGLoadListener onExtraCallback;
    private final PAGConstantPAGPAConsentType[] onNavigationEvent;
    private int onTransact;
    private final Map<PAGConstantPAGPAConsentType, Set<PAGConstantPAGPAConsentType>> onWarmupCompleted;

    public void IAuthTabCallback(PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType) {
        PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType2;
        int i = this.onTransact;
        PAGConstantPAGPAConsentType[] pAGConstantPAGPAConsentTypeArr = this.onNavigationEvent;
        if (i >= pAGConstantPAGPAConsentTypeArr.length || (pAGConstantPAGPAConsentType2 = pAGConstantPAGPAConsentTypeArr[i]) == null || pAGConstantPAGPAConsentType2.equals(pAGConstantPAGPAConsentType) || IAuthTabCallback(pAGConstantPAGPAConsentType2.toString(), pAGConstantPAGPAConsentType)) {
            return;
        }
        Set<PAGConstantPAGPAConsentType> hashSet = this.onWarmupCompleted.get(pAGConstantPAGPAConsentType2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.onWarmupCompleted.put(pAGConstantPAGPAConsentType2, hashSet);
        }
        hashSet.add(pAGConstantPAGPAConsentType);
    }

    public static /* synthetic */ int onWarmupCompleted(getAdString getadstring, getAdString getadstring2) {
        return getadstring.onExtraCallbackWithResult() - getadstring2.onExtraCallbackWithResult();
    }

    private boolean IAuthTabCallback(String str) {
        return str.indexOf(36) != -1;
    }

    private boolean IAuthTabCallback(String str, PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType) {
        if (!IAuthTabCallback(str)) {
            return false;
        }
        String strSubstring = str.substring(0, str.lastIndexOf(36));
        if (strSubstring.equals(pAGConstantPAGPAConsentType.toString())) {
            return true;
        }
        return IAuthTabCallback(strSubstring, pAGConstantPAGPAConsentType);
    }
}
