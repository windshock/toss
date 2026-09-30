package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class vd extends ArrayList<qgr> {
    public vd() {
    }

    public vd(int i) {
        super(i);
    }

    public vd(List<qgr> list) {
        super(list);
    }

    @Override // java.util.ArrayList
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public vd clone() {
        vd vdVar = new vd(size());
        Iterator<qgr> it = iterator();
        while (it.hasNext()) {
            vdVar.add(it.next().clone());
        }
        return vdVar;
    }

    public String onWarmupCompleted() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        Iterator<qgr> it = iterator();
        while (it.hasNext()) {
            qgr next = it.next();
            if (sbIAuthTabCallback.length() != 0) {
                sbIAuthTabCallback.append("\n");
            }
            sbIAuthTabCallback.append(next.asInterface());
        }
        return nfe.onExtraCallback(sbIAuthTabCallback);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return onWarmupCompleted();
    }
}
