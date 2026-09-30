package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import o.ryzb;
import o.yzp2;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class unregisterContentObserver extends Record {
    private byte[] hit;
    private int pkAlgorithm;
    private byte[] publicKey;
    private final List<yzp2> rvServers;

    public unregisterContentObserver() {
        this.rvServers = new ArrayList();
    }

    public unregisterContentObserver(yzp2 yzp2Var, int i, long j, byte[] bArr, int i2, byte[] bArr2, List<yzp2> list) {
        super(yzp2Var, 55, i, j);
        ArrayList arrayList = new ArrayList();
        this.rvServers = arrayList;
        this.hit = bArr;
        this.pkAlgorithm = i2;
        this.publicKey = bArr2;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        if (lt17.IAuthTabCallback()) {
            sb.append("( ");
        }
        String str = lt17.IAuthTabCallback() ? "\n\t" : " ";
        sb.append(this.pkAlgorithm);
        sb.append(" ");
        sb.append(TRANS_V2_SendReceiverInfo.onExtraCallback(this.hit));
        sb.append(str);
        sb.append(UST_TRANS_ImportCert.onNavigationEvent(this.publicKey));
        if (!this.rvServers.isEmpty()) {
            sb.append(str);
        }
        sb.append((String) this.rvServers.stream().map(new Function() { // from class: org.xbill.DNS.HIPRecord$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((yzp2) obj).toString();
            }
        }).collect(Collectors.joining(str)));
        if (lt17.IAuthTabCallback()) {
            sb.append(" )");
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(final deactivate deactivateVar, ryzb ryzbVar, final boolean z) {
        deactivateVar.onNavigationEvent(this.hit.length);
        deactivateVar.onNavigationEvent(this.pkAlgorithm);
        deactivateVar.IAuthTabCallback(this.publicKey.length);
        deactivateVar.onNavigationEvent(this.hit);
        deactivateVar.onNavigationEvent(this.publicKey);
        this.rvServers.forEach(new Consumer() { // from class: org.xbill.DNS.HIPRecord$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((yzp2) obj).onNavigationEvent(deactivateVar, (ryzb) null, z);
            }
        });
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        int iAsInterface = getblob.asInterface();
        this.pkAlgorithm = getblob.asInterface();
        int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
        this.hit = getblob.IAuthTabCallback(iAsInterface);
        this.publicKey = getblob.IAuthTabCallback(iOnExtraCallbackWithResult);
        while (getblob.IAuthTabCallbackDefault() > 0) {
            this.rvServers.add(new yzp2(getblob));
        }
    }
}
