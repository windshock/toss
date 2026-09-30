package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbill.DNS.Record;
import org.xbill.DNS.TextParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class lt50 extends Record {
    protected List<byte[]> strings;

    protected lt50() {
    }

    protected lt50(yzp2 yzp2Var, int i, int i2, long j, List<String> list) {
        super(yzp2Var, i, i2, j);
        if (list == null) {
            throw new IllegalArgumentException("strings must not be null");
        }
        this.strings = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                this.strings.add(Record.IAuthTabCallback(it.next()));
            } catch (TextParseException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        this.strings = new ArrayList(2);
        while (getblob.IAuthTabCallbackDefault() > 0) {
            this.strings.add(getblob.IAuthTabCallback());
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        if (this.strings.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<byte[]> it = this.strings.iterator();
        while (it.hasNext()) {
            sb.append(Record.onExtraCallbackWithResult(it.next(), true));
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        Iterator<byte[]> it = this.strings.iterator();
        while (it.hasNext()) {
            deactivateVar.onExtraCallback(it.next());
        }
    }
}
