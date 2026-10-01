package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.xbill.DNS.RRset;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class SaveCertAndEncPrikey {
    private final short[] onExtraCallback = new short[GF2Field.MASK];
    private int onNavigationEvent;
    private final TRANS_Error onWarmupCompleted;

    public SaveCertAndEncPrikey(TRANS_Error tRANS_Error) {
        this.onWarmupCompleted = tRANS_Error;
    }

    public int onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    void onExtraCallbackWithResult(List<Integer> list) {
        this.onNavigationEvent = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            this.onExtraCallback[it.next().intValue()] = 1;
            this.onNavigationEvent++;
        }
    }

    List<Integer> onNavigationEvent(RRset rRset, int i) {
        ArrayList arrayList = new ArrayList();
        this.onNavigationEvent = 0;
        for (getColumnName getcolumnname : rRset.onWarmupCompleted(false)) {
            if (getcolumnname.onExtraCallback() == i) {
                int iOnExtraCallbackWithResult = getcolumnname.onExtraCallbackWithResult();
                if (this.onWarmupCompleted.onWarmupCompleted(iOnExtraCallbackWithResult)) {
                    short[] sArr = this.onExtraCallback;
                    if (sArr[iOnExtraCallbackWithResult] == 0) {
                        sArr[iOnExtraCallbackWithResult] = 1;
                        arrayList.add(Integer.valueOf(iOnExtraCallbackWithResult));
                        this.onNavigationEvent++;
                    }
                }
            }
        }
        return arrayList;
    }

    boolean onExtraCallback(int i) {
        short[] sArr = this.onExtraCallback;
        if (sArr[i] != 0) {
            sArr[i] = 0;
            int i2 = this.onNavigationEvent - 1;
            this.onNavigationEvent = i2;
            if (i2 == 0) {
                return true;
            }
        }
        return false;
    }

    void IAuthTabCallback(int i) {
        short[] sArr = this.onExtraCallback;
        if (sArr[i] != 0) {
            sArr[i] = 2;
        }
    }

    int onExtraCallback() {
        int i = -1;
        int i2 = 0;
        while (true) {
            short[] sArr = this.onExtraCallback;
            if (i2 >= sArr.length) {
                if (i != -1) {
                    return i;
                }
                return 0;
            }
            short s = sArr[i2];
            if (s == 2) {
                return 0;
            }
            if (s == 1 && i == -1) {
                i = i2;
            }
            i2++;
        }
    }
}
