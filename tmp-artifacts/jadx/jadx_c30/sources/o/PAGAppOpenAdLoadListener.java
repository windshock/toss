package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGAppOpenAdLoadListener {
    private static volatile BackupConstant onExtraCallbackWithResult = BackupConstant.onExtraCallback;
    private final Object IAuthTabCallback;
    private final StringBuffer onExtraCallback;
    private final BackupConstant onNavigationEvent;

    public static BackupConstant onExtraCallback() {
        return onExtraCallbackWithResult;
    }

    public PAGAppOpenAdLoadListener(Object obj, BackupConstant backupConstant, StringBuffer stringBuffer) {
        backupConstant = backupConstant == null ? onExtraCallback() : backupConstant;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.onExtraCallback = stringBuffer;
        this.onNavigationEvent = backupConstant;
        this.IAuthTabCallback = obj;
        backupConstant.onNavigationEvent(stringBuffer, obj);
    }

    public PAGAppOpenAdLoadListener onExtraCallback(String str, Object obj, boolean z) {
        this.onNavigationEvent.onNavigationEvent(this.onExtraCallback, str, obj, Boolean.valueOf(z));
        return this;
    }

    public Object IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public StringBuffer onTransact() {
        return this.onExtraCallback;
    }

    public BackupConstant asBinder() {
        return this.onNavigationEvent;
    }

    public String toString() {
        if (IAuthTabCallback() == null) {
            onTransact().append(asBinder().onTransact());
        } else {
            this.onNavigationEvent.onExtraCallback(onTransact(), IAuthTabCallback());
        }
        return onTransact().toString();
    }
}
