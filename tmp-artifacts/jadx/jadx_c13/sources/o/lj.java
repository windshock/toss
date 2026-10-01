package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class lj implements lbb {
    private TreeMap<String, String> onExtraCallback = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    private byte[] onExtraCallbackWithResult;

    @Override // o.kfb
    public Iterator<String> onExtraCallbackWithResult() {
        return Collections.unmodifiableSet(this.onExtraCallback.keySet()).iterator();
    }

    @Override // o.kfb
    public String onExtraCallback(String str) {
        String str2 = this.onExtraCallback.get(str);
        return str2 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
    }

    @Override // o.kfb
    public byte[] onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.lbb
    public void onExtraCallback(String str, String str2) {
        this.onExtraCallback.put(str, str2);
    }

    @Override // o.kfb
    public boolean onWarmupCompleted(String str) {
        return this.onExtraCallback.containsKey(str);
    }
}
