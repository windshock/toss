package o;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getAdSizeApi;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAdSizeApi {
    public static final getAdSizeApi IAuthTabCallback = new getAdSizeApi();
    private static final ExecutorService onNavigationEvent = Executors.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat("OkHttpClientReferencesHolder").setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: viva.republica.toss.network.OkHttpClientReferencesHolder$$ExternalSyntheticLambda2
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            getAdSizeApi.onNavigationEvent(thread, th);
        }
    }).build());
    private static final Set<WeakReference<OkHttpClient>> onExtraCallbackWithResult = new LinkedHashSet();
    public static final int onExtraCallback = 8;

    private getAdSizeApi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Thread thread, Throwable th) {
        th.getMessage();
    }

    public final void onNavigationEvent(@NotNull final OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        onNavigationEvent.submit(new Runnable() { // from class: viva.republica.toss.network.OkHttpClientReferencesHolder$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                getAdSizeApi.IAuthTabCallback(okHttpClient);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(OkHttpClient okHttpClient) {
        getAdSizeApi getadsizeapi = IAuthTabCallback;
        Set<WeakReference<OkHttpClient>> set = onExtraCallbackWithResult;
        getadsizeapi.onExtraCallbackWithResult(set);
        set.add(new WeakReference<>(okHttpClient));
    }

    public final void IAuthTabCallback() {
        onNavigationEvent.submit(new Runnable() { // from class: viva.republica.toss.network.OkHttpClientReferencesHolder$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                getAdSizeApi.IAuthTabCallbackStub();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub() {
        ConnectionPool connectionPool;
        getAdSizeApi getadsizeapi = IAuthTabCallback;
        Set<WeakReference<OkHttpClient>> set = onExtraCallbackWithResult;
        getadsizeapi.onExtraCallbackWithResult(set);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            OkHttpClient okHttpClient = (OkHttpClient) ((WeakReference) it.next()).get();
            if (okHttpClient != null && (connectionPool = okHttpClient.connectionPool()) != null) {
                connectionPool.evictAll();
            }
        }
    }

    public final void onNavigationEvent() {
        onNavigationEvent.submit(new Runnable() { // from class: viva.republica.toss.network.OkHttpClientReferencesHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                getAdSizeApi.onExtraCallback();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback() {
        Dispatcher dispatcher;
        getAdSizeApi getadsizeapi = IAuthTabCallback;
        Set<WeakReference<OkHttpClient>> set = onExtraCallbackWithResult;
        getadsizeapi.onExtraCallbackWithResult(set);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            OkHttpClient okHttpClient = (OkHttpClient) ((WeakReference) it.next()).get();
            if (okHttpClient != null && (dispatcher = okHttpClient.dispatcher()) != null) {
                dispatcher.cancelAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return weakReference.get() == null;
    }

    private final <T> boolean onExtraCallbackWithResult(Collection<WeakReference<T>> collection) {
        return CollectionsKt.removeAll(collection, new Function1() { // from class: viva.republica.toss.network.OkHttpClientReferencesHolder$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getAdSizeApi.IAuthTabCallback((WeakReference) obj));
            }
        });
    }
}
