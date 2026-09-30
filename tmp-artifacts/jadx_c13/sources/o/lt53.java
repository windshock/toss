package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class lt53 implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;
    private final TreeSet<Integer> types;

    private lt53() {
        this.types = new TreeSet<>();
    }

    public lt53(getBlob getblob) throws WireParseException {
        this();
        while (getblob.IAuthTabCallbackDefault() > 0) {
            if (getblob.IAuthTabCallbackDefault() < 2) {
                throw new WireParseException("invalid bitmap descriptor");
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(getblob, -1);
            int iOnWarmupCompleted = onWarmupCompleted(getblob);
            for (int i = 0; i < iOnWarmupCompleted; i++) {
                int iAsInterface = getblob.asInterface();
                for (int i2 = 0; i2 < 8 && iAsInterface > 0; i2++) {
                    if (((1 << (7 - i2)) & iAsInterface) != 0) {
                        this.types.add(Integer.valueOf((iOnExtraCallbackWithResult << 8) + (i << 3) + i2));
                    }
                }
            }
        }
    }

    private static int onExtraCallbackWithResult(getBlob getblob, int i) throws WireParseException {
        int iAsInterface = getblob.asInterface();
        if (iAsInterface >= i) {
            return iAsInterface;
        }
        throw new WireParseException("invalid ordering");
    }

    private static int onWarmupCompleted(getBlob getblob) throws WireParseException {
        int iAsInterface = getblob.asInterface();
        if (iAsInterface <= getblob.IAuthTabCallbackDefault()) {
            return iAsInterface;
        }
        throw new WireParseException("invalid bitmap");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = this.types.iterator();
        while (it.hasNext()) {
            sb.append(lt54.onNavigationEvent(it.next().intValue()));
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    private static void onNavigationEvent(deactivate deactivateVar, TreeSet<Integer> treeSet, int i) {
        int iIntValue = ((treeSet.last().intValue() & 255) / 8) + 1;
        int[] iArr = new int[iIntValue];
        deactivateVar.onNavigationEvent(i);
        deactivateVar.onNavigationEvent(iIntValue);
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            int i2 = (iIntValue2 & 255) / 8;
            iArr[i2] = (1 << (7 - (iIntValue2 % 8))) | iArr[i2];
        }
        for (int i3 = 0; i3 < iIntValue; i3++) {
            deactivateVar.onNavigationEvent(iArr[i3]);
        }
    }

    public void onExtraCallback(deactivate deactivateVar) {
        if (this.types.isEmpty()) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        Iterator<Integer> it = this.types.iterator();
        int i = -1;
        while (it.hasNext()) {
            Integer next = it.next();
            int iIntValue = next.intValue() >> 8;
            if (iIntValue != i) {
                if (!treeSet.isEmpty()) {
                    onNavigationEvent(deactivateVar, treeSet, i);
                    treeSet.clear();
                }
                i = iIntValue;
            }
            treeSet.add(next);
        }
        onNavigationEvent(deactivateVar, treeSet, i);
    }

    public boolean IAuthTabCallback() {
        return this.types.isEmpty();
    }

    public boolean IAuthTabCallback(int i) {
        return this.types.contains(Integer.valueOf(i));
    }
}
