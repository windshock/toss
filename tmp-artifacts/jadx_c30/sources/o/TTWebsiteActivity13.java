package o;

import java.util.zip.ZipException;
import o.onPostExecute;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTWebsiteActivity13 extends onPostExecute {
    private int IAuthTabCallback;
    private onPostExecute.onNavigationEvent onWarmupCompleted;

    public TTWebsiteActivity13() {
        super(new dj4(21));
    }

    @Override // o.onPostExecute, o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        onNavigationEvent(4, i2);
        super.onExtraCallback(bArr, i, i2);
        this.IAuthTabCallback = dj4.IAuthTabCallback(bArr, i);
        this.onWarmupCompleted = onPostExecute.onNavigationEvent.getAlgorithmByCode(dj4.IAuthTabCallback(bArr, i + 2));
    }
}
