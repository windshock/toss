package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public interface Factory {
        EventListener create(@NotNull Call call);
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
    }

    public void cacheMiss(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void callEnd(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
    }

    public void callStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void canceled(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        Intrinsics.checkNotNullParameter(iOException, "");
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        Intrinsics.checkNotNullParameter(proxy, "");
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(connection, "");
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(connection, "");
    }

    public void dispatcherQueueEnd(@NotNull Call call, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(dispatcher, "");
    }

    public void dispatcherQueueStart(@NotNull Call call, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(dispatcher, "");
    }

    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    public void dnsStart(@NotNull Call call, @NotNull String str) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void followUpDecision(@NotNull Call call, @NotNull Response response, @Nullable Request request) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl httpUrl, @NotNull List<Proxy> list) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
    }

    public void requestBodyEnd(@NotNull Call call, long j) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(request, "");
    }

    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void responseBodyEnd(@NotNull Call call, long j) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
    }

    public void responseHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void retryDecision(@NotNull Call call, @NotNull IOException iOException, boolean z) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(iOException, "");
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, "");
        Intrinsics.checkNotNullParameter(response, "");
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, "");
    }

    public final EventListener plus(@NotNull EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "");
        EventListener eventListener2 = NONE;
        if (this == eventListener2) {
            return eventListener;
        }
        EventListener[] eventListeners = this instanceof AggregateEventListener ? ((AggregateEventListener) this).getEventListeners() : new EventListener[]{this};
        if (eventListener == eventListener2) {
            return this;
        }
        return new AggregateEventListener((EventListener[]) ArraysKt___ArraysJvmKt.plus((Object[]) eventListeners, (Object[]) (eventListener instanceof AggregateEventListener ? ((AggregateEventListener) eventListener).getEventListeners() : new EventListener[]{eventListener})));
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static final class AggregateEventListener extends EventListener {
        private final EventListener[] eventListeners;

        public AggregateEventListener(@NotNull EventListener[] eventListenerArr) {
            Intrinsics.checkNotNullParameter(eventListenerArr, "");
            this.eventListeners = eventListenerArr;
        }

        public final EventListener[] getEventListeners() {
            return this.eventListeners;
        }

        @Override // okhttp3.EventListener
        public void callStart(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.callStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void dispatcherQueueStart(@NotNull Call call, @NotNull Dispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(dispatcher, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dispatcherQueueStart(call, dispatcher);
            }
        }

        @Override // okhttp3.EventListener
        public void dispatcherQueueEnd(@NotNull Call call, @NotNull Dispatcher dispatcher) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(dispatcher, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dispatcherQueueEnd(call, dispatcher);
            }
        }

        @Override // okhttp3.EventListener
        public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl httpUrl) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(httpUrl, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.proxySelectStart(call, httpUrl);
            }
        }

        @Override // okhttp3.EventListener
        public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl httpUrl, @NotNull List<Proxy> list) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(httpUrl, "");
            Intrinsics.checkNotNullParameter(list, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.proxySelectEnd(call, httpUrl, list);
            }
        }

        @Override // okhttp3.EventListener
        public void dnsStart(@NotNull Call call, @NotNull String str) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(str, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dnsStart(call, str);
            }
        }

        @Override // okhttp3.EventListener
        public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<InetAddress> list) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dnsEnd(call, str, list);
            }
        }

        @Override // okhttp3.EventListener
        public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "");
            Intrinsics.checkNotNullParameter(proxy, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectStart(call, inetSocketAddress, proxy);
            }
        }

        @Override // okhttp3.EventListener
        public void secureConnectStart(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.secureConnectStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.secureConnectEnd(call, handshake);
            }
        }

        @Override // okhttp3.EventListener
        public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "");
            Intrinsics.checkNotNullParameter(proxy, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
            }
        }

        @Override // okhttp3.EventListener
        public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "");
            Intrinsics.checkNotNullParameter(proxy, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
            }
        }

        @Override // okhttp3.EventListener
        public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(connection, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectionAcquired(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(connection, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectionReleased(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public void requestHeadersStart(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestHeadersStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(request, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestHeadersEnd(call, request);
            }
        }

        @Override // okhttp3.EventListener
        public void requestBodyStart(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestBodyStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void requestBodyEnd(@NotNull Call call, long j) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestBodyEnd(call, j);
            }
        }

        @Override // okhttp3.EventListener
        public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestFailed(call, iOException);
            }
        }

        @Override // okhttp3.EventListener
        public void responseHeadersStart(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseHeadersStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseHeadersEnd(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void responseBodyStart(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseBodyStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void responseBodyEnd(@NotNull Call call, long j) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseBodyEnd(call, j);
            }
        }

        @Override // okhttp3.EventListener
        public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseFailed(call, iOException);
            }
        }

        @Override // okhttp3.EventListener
        public void callEnd(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.callEnd(call);
            }
        }

        @Override // okhttp3.EventListener
        public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.callFailed(call, iOException);
            }
        }

        @Override // okhttp3.EventListener
        public void canceled(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.canceled(call);
            }
        }

        @Override // okhttp3.EventListener
        public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.satisfactionFailure(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void cacheHit(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.cacheHit(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void cacheMiss(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.cacheMiss(call);
            }
        }

        @Override // okhttp3.EventListener
        public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.cacheConditionalHit(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void retryDecision(@NotNull Call call, @NotNull IOException iOException, boolean z) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.retryDecision(call, iOException, z);
            }
        }

        @Override // okhttp3.EventListener
        public void followUpDecision(@NotNull Call call, @NotNull Response response, @Nullable Request request) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            for (EventListener eventListener : this.eventListeners) {
                eventListener.followUpDecision(call, response, request);
            }
        }
    }
}
