package o;

import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setVastVideoHelper {
    private int IAuthTabCallback;
    private String IAuthTabCallbackDefault;
    private setVastVideoHelper IAuthTabCallbackStub;
    private thxsya asBinder;
    private String asInterface;
    private String onExtraCallback;
    private setDirectDestroyWebView onExtraCallbackWithResult = new setDirectDestroyWebView();
    private int onNavigationEvent;
    private int onWarmupCompleted;

    public setVastVideoHelper(String str, int i, int i2, int i3, thxsya thxsyaVar) {
        this.asInterface = str;
        this.onWarmupCompleted = i;
        this.IAuthTabCallback = i2;
        this.onNavigationEvent = i3;
        this.asBinder = thxsyaVar;
        this.IAuthTabCallbackDefault = onExtraCallback(str, false);
        this.onExtraCallback = onExtraCallbackWithResult(str);
    }

    public String onExtraCallback(String str, boolean z) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return z ? _UrlKt.FRAGMENT_ENCODE_SET : this.asBinder.onWarmupCompleted();
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (strSubstring.equals("xml")) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("urn:x-prefix:");
        stringBuffer.append(strSubstring);
        return stringBuffer.toString().intern();
    }

    public String onExtraCallbackWithResult(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1).intern();
    }

    public String IAuthTabCallback() {
        return this.asInterface;
    }

    public String IAuthTabCallbackStub() {
        return this.IAuthTabCallbackDefault;
    }

    public String onNavigationEvent() {
        return this.onExtraCallback;
    }

    public int onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public int onExtraCallback() {
        return this.onNavigationEvent;
    }

    public setDirectDestroyWebView onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public setVastVideoHelper asBinder() {
        return this.IAuthTabCallbackStub;
    }

    public boolean onExtraCallbackWithResult(setVastVideoHelper setvastvideohelper) {
        return (setvastvideohelper.IAuthTabCallback & this.onWarmupCompleted) != 0;
    }

    public void onWarmupCompleted(setDirectDestroyWebView setdirectdestroywebview, String str, String str2, String str3) throws ArrayIndexOutOfBoundsException {
        if (str.equals("xmlns") || str.startsWith("xmlns:")) {
            return;
        }
        String strOnExtraCallback = onExtraCallback(str, true);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int index = setdirectdestroywebview.getIndex(str);
        if (index == -1) {
            String strIntern = str.intern();
            String str4 = str2 == null ? "CDATA" : str2;
            if (!str4.equals("CDATA")) {
                str3 = IAuthTabCallback(str3);
            }
            setdirectdestroywebview.onWarmupCompleted(strOnExtraCallback, strOnExtraCallbackWithResult, strIntern, str4, str3);
            return;
        }
        if (str2 == null) {
            str2 = setdirectdestroywebview.getType(index);
        }
        String str5 = str2;
        if (!str5.equals("CDATA")) {
            str3 = IAuthTabCallback(str3);
        }
        setdirectdestroywebview.onNavigationEvent(index, strOnExtraCallback, strOnExtraCallbackWithResult, str, str5, str3);
    }

    public static String IAuthTabCallback(String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        if (strTrim.indexOf("  ") == -1) {
            return strTrim;
        }
        int length = strTrim.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt == ' ') {
                if (!z) {
                    stringBuffer.append(cCharAt);
                }
                z = true;
            } else {
                stringBuffer.append(cCharAt);
                z = false;
            }
        }
        return stringBuffer.toString();
    }

    public void onWarmupCompleted(String str, String str2, String str3) throws ArrayIndexOutOfBoundsException {
        onWarmupCompleted(this.onExtraCallbackWithResult, str, str2, str3);
    }

    public void IAuthTabCallback(setVastVideoHelper setvastvideohelper) {
        this.IAuthTabCallbackStub = setvastvideohelper;
    }
}
