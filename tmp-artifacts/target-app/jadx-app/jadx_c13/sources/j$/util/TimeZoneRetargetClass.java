package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class TimeZoneRetargetClass {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneId toZoneId(TimeZone timeZone) {
        return timeZone instanceof TimeZoneRetargetInterface ? ((TimeZoneRetargetInterface) timeZone).toZoneId() : DesugarTimeZone.toZoneId(timeZone);
    }
}
