package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface registerBinderFactory {
    String multiLineDebugString();

    static registerBinderFactory onWarmupCompleted() {
        return registerReaderFactory.INSTANCE;
    }

    static registerBinderFactory onExtraCallbackWithResult() {
        if (!registerWriter.onExtraCallback()) {
            return onWarmupCompleted();
        }
        return new registerWriterFactory(Thread.currentThread().getStackTrace());
    }
}
