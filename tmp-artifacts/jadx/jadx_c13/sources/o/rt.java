package o;

import java.io.IOException;
import java.util.Iterator;
import o.oq;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class rt extends qye {
    private final boolean onWarmupCompleted;

    @Override // o.qq
    void onWarmupCompleted(Appendable appendable, int i, oq.onExtraCallback onextracallback) {
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String IAuthTabCallback() {
        return super.IAuthTabCallback();
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ qq asBinder() {
        return super.asBinder();
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ int cz_() {
        return super.cz_();
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String onExtraCallback(String str) {
        return super.onExtraCallback(str);
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ boolean onExtraCallbackWithResult(String str) {
        return super.onExtraCallbackWithResult(str);
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ String onNavigationEvent(String str) {
        return super.onNavigationEvent(str);
    }

    @Override // o.qye, o.qq
    public /* bridge */ /* synthetic */ qq onNavigationEvent(String str, String str2) {
        return super.onNavigationEvent(str, str2);
    }

    @Override // o.qq
    public String onNavigationEvent() {
        return "#declaration";
    }

    private void IAuthTabCallback(Appendable appendable, oq.onExtraCallback onextracallback) throws IOException {
        Iterator<oi> it = access000().iterator();
        while (it.hasNext()) {
            oi next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            if (!key.equals(onNavigationEvent())) {
                appendable.append(' ');
                appendable.append(key);
                if (!value.isEmpty()) {
                    appendable.append("=\"");
                    pvm.onWarmupCompleted(appendable, value, onextracallback, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    @Override // o.qq
    void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        appendable.append("<").append(this.onWarmupCompleted ? "!" : "?").append(IAuthTabCallbackStub());
        IAuthTabCallback(appendable, onextracallback);
        appendable.append(this.onWarmupCompleted ? "!" : "?").append(">");
    }

    @Override // o.qq
    public String toString() {
        return asInterface();
    }

    @Override // o.qq
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public rt clone() {
        return (rt) super.clone();
    }
}
