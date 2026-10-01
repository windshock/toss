package j$.util;

import j$.time.Instant;
import java.util.Date;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}
