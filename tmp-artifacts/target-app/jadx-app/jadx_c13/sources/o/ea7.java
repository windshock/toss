package o;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ea7 implements AppSetIdAndScope1, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;
    protected String name;

    @Override // o.AppSetIdAndScope1
    public String onExtraCallbackWithResult() {
        return this.name;
    }

    protected Object readResolve() throws ObjectStreamException {
        return ea10.onExtraCallbackWithResult(onExtraCallbackWithResult());
    }
}
