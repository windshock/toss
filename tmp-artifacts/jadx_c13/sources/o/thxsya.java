package o;

import java.util.HashMap;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class thxsya {
    private HashMap IAuthTabCallback = new HashMap();
    private HashMap onWarmupCompleted = new HashMap();
    private String onExtraCallback = _UrlKt.FRAGMENT_ENCODE_SET;
    private String onNavigationEvent = _UrlKt.FRAGMENT_ENCODE_SET;
    private setVastVideoHelper onExtraCallbackWithResult = null;

    public void onNavigationEvent(String str, int i, int i2, int i3) {
        setVastVideoHelper setvastvideohelper = new setVastVideoHelper(str, i, i2, i3, this);
        this.onWarmupCompleted.put(str.toLowerCase(), setvastvideohelper);
        if (i2 == Integer.MIN_VALUE) {
            this.onExtraCallbackWithResult = setvastvideohelper;
        }
    }

    public setVastVideoHelper onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public void onWarmupCompleted(String str, String str2, String str3, String str4) throws ArrayIndexOutOfBoundsException {
        setVastVideoHelper setvastvideohelperIAuthTabCallback = IAuthTabCallback(str);
        if (setvastvideohelperIAuthTabCallback == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attribute ");
            stringBuffer.append(str2);
            stringBuffer.append(" specified for unknown element type ");
            stringBuffer.append(str);
            throw new Error(stringBuffer.toString());
        }
        setvastvideohelperIAuthTabCallback.onWarmupCompleted(str2, str3, str4);
    }

    public void onNavigationEvent(String str, String str2) {
        setVastVideoHelper setvastvideohelperIAuthTabCallback = IAuthTabCallback(str);
        setVastVideoHelper setvastvideohelperIAuthTabCallback2 = IAuthTabCallback(str2);
        if (setvastvideohelperIAuthTabCallback == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No child ");
            stringBuffer.append(str);
            stringBuffer.append(" for parent ");
            stringBuffer.append(str2);
            throw new Error(stringBuffer.toString());
        }
        if (setvastvideohelperIAuthTabCallback2 == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("No parent ");
            stringBuffer2.append(str2);
            stringBuffer2.append(" for child ");
            stringBuffer2.append(str);
            throw new Error(stringBuffer2.toString());
        }
        setvastvideohelperIAuthTabCallback.IAuthTabCallback(setvastvideohelperIAuthTabCallback2);
    }

    public void onWarmupCompleted(String str, int i) {
        this.IAuthTabCallback.put(str, Integer.valueOf(i));
    }

    public setVastVideoHelper IAuthTabCallback(String str) {
        return (setVastVideoHelper) this.onWarmupCompleted.get(str.toLowerCase());
    }

    public int onWarmupCompleted(String str) {
        Integer num = (Integer) this.IAuthTabCallback.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public String IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public void onExtraCallbackWithResult(String str) {
        this.onExtraCallback = str;
    }

    public void onNavigationEvent(String str) {
        this.onNavigationEvent = str;
    }
}
