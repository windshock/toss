package o;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class ycx16 implements AppSetIdAndScope1, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    ycx16() {
    }

    @Override // o.AppSetIdAndScope1
    public String onExtraCallbackWithResult() {
        return this.name;
    }

    protected Object readResolve() throws ObjectStreamException {
        return ea10.onExtraCallbackWithResult(onExtraCallbackWithResult());
    }
}
