package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1$;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class CxxInspectorPackagerConnection$DelegateImpl {
    private final Handler onExtraCallback;
    private final OkHttpClient onNavigationEvent;

    public CxxInspectorPackagerConnection$DelegateImpl() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.onNavigationEvent = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
        this.onExtraCallback = new Handler(Looper.getMainLooper());
    }

    public final CxxInspectorPackagerConnection.IWebSocket connectWebSocket(@Nullable String str, @NotNull CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        Intrinsics.checkNotNullParameter(webSocketDelegate, "");
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new CxxInspectorPackagerConnection.onNavigationEvent(this.onNavigationEvent.newWebSocket(new Request.Builder().url(str).build(), new onExtraCallbackWithResult(webSocketDelegate)), this.onExtraCallback);
    }

    public static final class onExtraCallbackWithResult extends WebSocketListener {
        final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate onExtraCallbackWithResult;

        onExtraCallbackWithResult(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
            this.onExtraCallbackWithResult = webSocketDelegate;
        }

        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            Intrinsics.checkNotNullParameter(webSocket, "");
            Intrinsics.checkNotNullParameter(th, "");
            CxxInspectorPackagerConnection$DelegateImpl.this.scheduleCallback(new CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1$.ExternalSyntheticLambda0(th, this.onExtraCallbackWithResult), 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallback(Throwable th, CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
            String message = th.getMessage();
            if (message == null) {
                message = "<Unknown error>";
            }
            webSocketDelegate.didFailWithError((Integer) null, message);
            webSocketDelegate.close();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallbackWithResult(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate, String str) {
            webSocketDelegate.didReceiveMessage(str);
        }

        public void onMessage(WebSocket webSocket, String str) {
            Intrinsics.checkNotNullParameter(webSocket, "");
            Intrinsics.checkNotNullParameter(str, "");
            CxxInspectorPackagerConnection$DelegateImpl.this.scheduleCallback(new CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1$.ExternalSyntheticLambda3(this.onExtraCallbackWithResult, str), 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onExtraCallbackWithResult(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
            webSocketDelegate.didOpen();
        }

        public void onOpen(WebSocket webSocket, Response response) {
            Intrinsics.checkNotNullParameter(webSocket, "");
            Intrinsics.checkNotNullParameter(response, "");
            CxxInspectorPackagerConnection$DelegateImpl.this.scheduleCallback(new CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1$.ExternalSyntheticLambda2(this.onExtraCallbackWithResult), 0L);
        }

        public void onClosed(WebSocket webSocket, int i2, String str) {
            Intrinsics.checkNotNullParameter(webSocket, "");
            Intrinsics.checkNotNullParameter(str, "");
            CxxInspectorPackagerConnection$DelegateImpl.this.scheduleCallback(new CxxInspectorPackagerConnection$DelegateImpl$connectWebSocket$webSocket$1$.ExternalSyntheticLambda1(this.onExtraCallbackWithResult), 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IAuthTabCallback(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
            webSocketDelegate.didClose();
            webSocketDelegate.close();
        }
    }

    public final void scheduleCallback(@NotNull Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "");
        this.onExtraCallback.postDelayed(runnable, j);
    }
}
