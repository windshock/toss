package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ensureLogsIsMutable<T> {
    final int IAuthTabCallback;
    int onExtraCallback;
    final Object[] onExtraCallbackWithResult;
    Object[] onWarmupCompleted;

    public interface onExtraCallbackWithResult<T> extends deserializeLongCollection<T> {
        @Override // o.deserializeLongCollection
        boolean test(T t);
    }

    public ensureLogsIsMutable(int i) {
        this.IAuthTabCallback = i;
        Object[] objArr = new Object[i + 1];
        this.onExtraCallbackWithResult = objArr;
        this.onWarmupCompleted = objArr;
    }

    public void onNavigationEvent(T t) {
        int i = this.IAuthTabCallback;
        int i2 = this.onExtraCallback;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.onWarmupCompleted[i] = objArr;
            this.onWarmupCompleted = objArr;
            i2 = 0;
        }
        this.onWarmupCompleted[i2] = t;
        this.onExtraCallback = i2 + 1;
    }

    public void onExtraCallbackWithResult(T t) {
        this.onExtraCallbackWithResult[0] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0016, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(onExtraCallbackWithResult<? super T> onextracallbackwithresult) {
        int i = this.IAuthTabCallback;
        for (Object[] objArr = this.onExtraCallbackWithResult; objArr != null; objArr = (Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj != null) {
                    if (onextracallbackwithresult.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean IAuthTabCallback(ycxExternalSyntheticLambda0<? super U> ycxexternalsyntheticlambda0) {
        Object[] objArr = this.onExtraCallbackWithResult;
        int i = this.IAuthTabCallback;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 != null) {
                    if (access26200.acceptFull(objArr2, ycxexternalsyntheticlambda0)) {
                        return true;
                    }
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean onExtraCallback(writeQuoted<? super U> writequoted) {
        Object[] objArr = this.onExtraCallbackWithResult;
        int i = this.IAuthTabCallback;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 != null) {
                    if (access26200.acceptFull(objArr2, writequoted)) {
                        return true;
                    }
                }
            }
            objArr = objArr[i];
        }
    }
}
