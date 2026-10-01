package o;

import org.jmrtd.lds.iso19794.IrisImageInfo;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class lt59 extends onChildViewAdded {
    private void onWarmupCompleted(Record record) {
        onNavigationEvent(record, 2);
    }

    public void onExtraCallback(Record record) {
        onWarmupCompleted(record);
    }

    public void onNavigationEvent(Record record) {
        onWarmupCompleted(record.onWarmupCompleted(IrisImageInfo.IMAGE_QUAL_UNDEF, 0L));
    }
}
