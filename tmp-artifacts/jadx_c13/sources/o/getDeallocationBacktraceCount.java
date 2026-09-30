package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getDeallocationBacktraceCount implements Future<Object> {
    final deserializeUriNullableCollection IAuthTabCallback;

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    getDeallocationBacktraceCount(deserializeUriNullableCollection deserializeurinullablecollection) {
        this.IAuthTabCallback = deserializeurinullablecollection;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.IAuthTabCallback.dispose();
        return false;
    }
}
