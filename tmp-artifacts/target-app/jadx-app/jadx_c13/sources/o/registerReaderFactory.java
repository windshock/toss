package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
enum registerReaderFactory implements registerBinderFactory {
    INSTANCE;

    public String shortDebugString() {
        return "unknown source";
    }

    @Override // o.registerBinderFactory
    public String multiLineDebugString() {
        return "\tat unknown source\n\t\t" + registerWriter.onWarmupCompleted();
    }
}
