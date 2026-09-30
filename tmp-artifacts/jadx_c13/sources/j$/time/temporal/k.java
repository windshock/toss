package j$.time.temporal;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class k implements TemporalAdjuster {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ k(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        if (this.a == 0) {
            int iG = temporal.g(ChronoField.DAY_OF_WEEK);
            int i = this.b;
            if (iG == i) {
                return temporal;
            }
            return temporal.b(iG - i >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
        }
        int iG2 = temporal.g(ChronoField.DAY_OF_WEEK);
        int i2 = this.b;
        if (iG2 == i2) {
            return temporal;
        }
        return temporal.c(i2 - iG2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
    }
}
