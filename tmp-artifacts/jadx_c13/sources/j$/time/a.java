package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class a extends Clock implements Serializable {
    public static final a b;
    private static final long serialVersionUID = 6740630888130243051L;
    public final ZoneId a;

    public a(ZoneId zoneId) {
        this.a = zoneId;
    }

    static {
        System.currentTimeMillis();
        b = new a(ZoneOffset.UTC);
    }

    @Override // j$.time.Clock
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
