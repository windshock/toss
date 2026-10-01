package org.xbill.DNS;

import j$.time.Duration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;
import o.lt54;
import o.onChildViewAdded;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Resolver {
    void IAuthTabCallback(Duration duration);

    default Duration onExtraCallbackWithResult() {
        return Duration.ofSeconds(10L);
    }

    default onChildViewAdded onWarmupCompleted(onChildViewAdded onchildviewadded) throws IOException {
        try {
            return onExtraCallbackWithResult(onchildviewadded).toCompletableFuture().get(onExtraCallbackWithResult().toMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            if (e2.getCause() != null) {
                throw new IOException(e2.getCause());
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            throw new IOException("Timed out while trying to resolve " + onchildviewadded.onNavigationEvent().access000() + "/" + lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().type) + ", id=" + onchildviewadded.IAuthTabCallback().onNavigationEvent(), e3);
        }
    }

    default CompletionStage<onChildViewAdded> onExtraCallbackWithResult(onChildViewAdded onchildviewadded) {
        return onExtraCallback(onchildviewadded, ForkJoinPool.commonPool());
    }

    default CompletionStage<onChildViewAdded> onExtraCallback(onChildViewAdded onchildviewadded, Executor executor) {
        final CompletableFuture completableFuture = new CompletableFuture();
        onExtraCallbackWithResult(onchildviewadded, new ResolverListener(this) { // from class: org.xbill.DNS.Resolver.1
            final /* synthetic */ Resolver onWarmupCompleted;

            {
                this.onWarmupCompleted = this;
            }

            @Override // org.xbill.DNS.ResolverListener
            public void onExtraCallback(Object obj, onChildViewAdded onchildviewadded2) {
                completableFuture.complete(onchildviewadded2);
            }

            @Override // org.xbill.DNS.ResolverListener
            public void onExtraCallbackWithResult(Object obj, Exception exc) {
                completableFuture.completeExceptionally(exc);
            }
        });
        return completableFuture;
    }

    @Deprecated
    default Object onExtraCallbackWithResult(onChildViewAdded onchildviewadded, final ResolverListener resolverListener) {
        final Object obj = new Object();
        onExtraCallbackWithResult(onchildviewadded).handleAsync(new BiFunction() { // from class: org.xbill.DNS.Resolver$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return Resolver.IAuthTabCallback(resolverListener, obj, (onChildViewAdded) obj2, (Throwable) obj3);
            }
        });
        return obj;
    }

    static /* synthetic */ Object IAuthTabCallback(ResolverListener resolverListener, Object obj, onChildViewAdded onchildviewadded, Throwable th) {
        Exception exc;
        if (th != null) {
            if ((th instanceof CompletionException) && th.getCause() != null) {
                th = th.getCause();
            }
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = new Exception(th);
            }
            resolverListener.onExtraCallbackWithResult(obj, exc);
            return null;
        }
        resolverListener.onExtraCallback(obj, onchildviewadded);
        return null;
    }
}
