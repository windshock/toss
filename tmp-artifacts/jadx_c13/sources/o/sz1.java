package o;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class sz1 {
    private final String IAuthTabCallback;
    private String onExtraCallback;
    private boolean onNavigationEvent;
    private final int onTransact;
    private final HashMap<String, Integer> onWarmupCompleted = new HashMap<>();
    private final HashMap<Integer, String> IAuthTabCallbackStub = new HashMap<>();
    private int onExtraCallbackWithResult = IntCompanionObject.MAX_VALUE;

    public sz1(String str, int i) {
        this.IAuthTabCallback = str;
        this.onTransact = i;
    }

    public void onNavigationEvent(int i) {
        this.onExtraCallbackWithResult = i;
    }

    public void onWarmupCompleted(String str) {
        this.onExtraCallback = onExtraCallbackWithResult(str);
    }

    public void onWarmupCompleted(boolean z) {
        this.onNavigationEvent = z;
    }

    public void onExtraCallbackWithResult(int i) {
        if (i < 0 || i > this.onExtraCallbackWithResult) {
            throw new IllegalArgumentException(this.IAuthTabCallback + " " + i + " is out of range");
        }
    }

    private String onExtraCallbackWithResult(String str) {
        int i = this.onTransact;
        if (i == 2) {
            return str.toUpperCase();
        }
        return i == 3 ? str.toLowerCase() : str;
    }

    public void IAuthTabCallback(int i, String str) {
        onExtraCallbackWithResult(i);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        this.onWarmupCompleted.put(strOnExtraCallbackWithResult, Integer.valueOf(i));
        this.IAuthTabCallbackStub.put(Integer.valueOf(i), strOnExtraCallbackWithResult);
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(int i, Map.Entry entry) {
        return ((Integer) entry.getValue()).intValue() == i;
    }

    public void onExtraCallback(int i, String str) {
        onExtraCallbackWithResult(i);
        this.onWarmupCompleted.put(onExtraCallbackWithResult(str), Integer.valueOf(i));
    }

    public String IAuthTabCallback(int i) {
        onExtraCallbackWithResult(i);
        String str = this.IAuthTabCallbackStub.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        String string = Integer.toString(i);
        if (this.onExtraCallback == null) {
            return string;
        }
        return this.onExtraCallback + string;
    }
}
