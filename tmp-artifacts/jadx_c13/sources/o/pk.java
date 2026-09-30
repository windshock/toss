package o;

import java.io.IOException;
import o.oq;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pk extends qkm {
    public pk(String str) {
        super(str);
    }

    @Override // o.qkm, o.qq
    public String onNavigationEvent() {
        return "#cdata";
    }

    @Override // o.qkm, o.qq
    void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        appendable.append("<![CDATA[").append(IAuthTabCallbackDefault());
    }

    @Override // o.qkm, o.qq
    void onWarmupCompleted(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new mnf(e);
        }
    }

    @Override // o.qkm, o.qq
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public pk clone() {
        return (pk) super.clone();
    }
}
