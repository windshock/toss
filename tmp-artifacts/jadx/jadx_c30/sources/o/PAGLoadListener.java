package o;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGLoadListener extends PAGConstant {
    private final PAGBannerAd IAuthTabCallbackStub;
    private final Map<String, PAGConstantPAGPAConsentType> asBinder;
    private final Map<String, onRenderSuccess> asInterface;
    private final Set<PAGErrorCode> onExtraCallback;
    private final Set<onRenderSuccess> onNavigationEvent;
    private final Map<String, PAGErrorCode> onTransact;
    private final Set<PAGConstantPAGPAConsentType> onWarmupCompleted;

    public static /* synthetic */ void onNavigationEvent(Map map, onAdShow onadshow) {
        PAGConstantPAGPAConsentType pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult = onadshow.onExtraCallbackWithResult();
        Integer num = (Integer) map.get(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult);
        if (num == null) {
            map.put(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult, 1);
            onadshow.onExtraCallbackWithResult(0);
        } else {
            int iIntValue = num.intValue();
            onadshow.onExtraCallbackWithResult(iIntValue);
            map.put(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult, Integer.valueOf(iIntValue + 1));
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Map map, Map map2, onAdShow onadshow) {
        PAGConstantPAGPAConsentType pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult = onadshow.onExtraCallbackWithResult();
        Integer num = (Integer) map.get(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult);
        if (num == null) {
            map.put(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult, 1);
            onadshow.onExtraCallbackWithResult(0);
        } else {
            int iIntValue = num.intValue();
            onadshow.onExtraCallbackWithResult(iIntValue);
            map.put(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult, Integer.valueOf(iIntValue + 1));
        }
        if (onadshow.IAuthTabCallback().IAuthTabCallback().equals("<init>")) {
            Integer num2 = (Integer) map2.get(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult);
            if (num2 == null) {
                map2.put(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult, 1);
                onadshow.onNavigationEvent(0);
            } else {
                int iIntValue2 = num2.intValue();
                onadshow.onNavigationEvent(iIntValue2);
                map2.put(pAGConstantPAGPAConsentTypeOnExtraCallbackWithResult, Integer.valueOf(iIntValue2 + 1));
            }
        }
    }

    public PAGConstantPAGPAConsentType onWarmupCompleted(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('.', '/');
        PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType = this.asBinder.get(strReplace);
        if (pAGConstantPAGPAConsentType == null) {
            PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType2 = new PAGConstantPAGPAConsentType(IAuthTabCallback(strReplace));
            this.onWarmupCompleted.add(pAGConstantPAGPAConsentType2);
            this.asBinder.put(strReplace, pAGConstantPAGPAConsentType2);
            pAGConstantPAGPAConsentType = pAGConstantPAGPAConsentType2;
        }
        if (pAGConstantPAGPAConsentType.onWarmupCompleted()) {
            this.IAuthTabCallbackStub.onWarmupCompleted().IAuthTabCallback(pAGConstantPAGPAConsentType);
        }
        return pAGConstantPAGPAConsentType;
    }

    public PAGErrorCode onExtraCallback(String str) {
        onRenderSuccess onrendersuccessIAuthTabCallback;
        PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType;
        if (str == null) {
            return null;
        }
        PAGErrorCode pAGErrorCode = this.onTransact.get(str);
        if (pAGErrorCode != null) {
            return pAGErrorCode;
        }
        ArrayList arrayList = new ArrayList();
        if (str.length() > 1 && str.indexOf(76) != -1) {
            ArrayList<String> arrayList2 = new ArrayList();
            char[] charArray = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < charArray.length) {
                sb.append(charArray[i]);
                if (charArray[i] == 'L') {
                    StringBuilder sb2 = new StringBuilder();
                    int i2 = i + 1;
                    while (true) {
                        if (i2 < charArray.length) {
                            char c = charArray[i2];
                            if (!Character.isLetter(c) && !Character.isDigit(c) && c != '/' && c != '$' && c != '_') {
                                arrayList2.add(sb2.toString());
                                i = i2 - 1;
                                break;
                            }
                            sb2.append(c);
                            i2++;
                        }
                    }
                }
                i++;
            }
            onExtraCallbackWithResult(str);
            for (String str2 : arrayList2) {
                if (str2 != null) {
                    String strReplace = str2.replace('.', '/');
                    pAGConstantPAGPAConsentType = this.asBinder.get(strReplace);
                    if (pAGConstantPAGPAConsentType == null) {
                        PAGConstantPAGPAConsentType pAGConstantPAGPAConsentType2 = new PAGConstantPAGPAConsentType(IAuthTabCallback(strReplace));
                        this.onWarmupCompleted.add(pAGConstantPAGPAConsentType2);
                        this.asBinder.put(strReplace, pAGConstantPAGPAConsentType2);
                        pAGConstantPAGPAConsentType = pAGConstantPAGPAConsentType2;
                    }
                } else {
                    pAGConstantPAGPAConsentType = null;
                }
                arrayList.add(pAGConstantPAGPAConsentType);
            }
            onrendersuccessIAuthTabCallback = IAuthTabCallback(sb.toString());
        } else {
            onrendersuccessIAuthTabCallback = IAuthTabCallback(str);
        }
        PAGErrorCode pAGErrorCode2 = new PAGErrorCode(str, onrendersuccessIAuthTabCallback, arrayList);
        this.onExtraCallback.add(pAGErrorCode2);
        this.onTransact.put(str, pAGErrorCode2);
        return pAGErrorCode2;
    }

    public onRenderSuccess IAuthTabCallback(String str) {
        if (str == null) {
            return null;
        }
        onRenderSuccess onrendersuccess = this.asInterface.get(str);
        if (onrendersuccess != null) {
            return onrendersuccess;
        }
        onRenderSuccess onrendersuccess2 = new onRenderSuccess(str);
        this.onNavigationEvent.add(onrendersuccess2);
        this.asInterface.put(str, onrendersuccess2);
        return onrendersuccess2;
    }

    private void onExtraCallbackWithResult(String str) {
        onRenderSuccess onrendersuccess = this.asInterface.get(str);
        if (onrendersuccess == null || this.asBinder.get(str) != null) {
            return;
        }
        this.asInterface.remove(str);
        this.onNavigationEvent.remove(onrendersuccess);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PAGLoadListener pAGLoadListener, PAGErrorCode pAGErrorCode) {
        String strIAuthTabCallback = pAGErrorCode.IAuthTabCallback();
        if (strIAuthTabCallback.equals(pAGErrorCode.onNavigationEvent().IAuthTabCallback())) {
            return;
        }
        pAGLoadListener.onExtraCallbackWithResult(strIAuthTabCallback);
    }
}
