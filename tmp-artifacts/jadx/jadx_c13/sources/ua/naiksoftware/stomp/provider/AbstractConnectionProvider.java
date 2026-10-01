package ua.naiksoftware.stomp.provider;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import o.deserializeDecimalCollection;
import o.getByteBuffer;
import o.getTimestampBytes;
import o.setTid;
import o.wasLastName;
import ua.naiksoftware.stomp.dto.LifecycleEvent;
import ua.naiksoftware.stomp.exception.StompSocketBrokenException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AbstractConnectionProvider implements ConnectionProvider {
    private static final String TAG = "AbstractConnectionProvider";
    private final setTid<LifecycleEvent> lifecycleStream = setTid.onNavigationEvent();
    private final getTimestampBytes<String> messagesStream = getTimestampBytes.IAuthTabCallback();

    @Override // ua.naiksoftware.stomp.provider.ConnectionProvider
    public void cancel() {
    }

    protected abstract void createWebSocketConnection();

    protected abstract Object getSocket();

    protected abstract void rawDisconnect();

    protected abstract void rawSend(String str);

    @Override // ua.naiksoftware.stomp.provider.ConnectionProvider
    public getByteBuffer<String> messages() {
        return this.messagesStream.IAuthTabCallbackDefault(initSocket().IAuthTabCallbackDefault());
    }

    @Override // ua.naiksoftware.stomp.provider.ConnectionProvider
    public wasLastName disconnect() {
        return wasLastName.onExtraCallbackWithResult(new deserializeDecimalCollection() { // from class: ua.naiksoftware.stomp.provider.AbstractConnectionProvider$$ExternalSyntheticLambda2
            @Override // o.deserializeDecimalCollection
            public final void run() {
                this.f$0.rawDisconnect();
            }
        });
    }

    private wasLastName initSocket() {
        return wasLastName.onExtraCallbackWithResult(new deserializeDecimalCollection() { // from class: ua.naiksoftware.stomp.provider.AbstractConnectionProvider$$ExternalSyntheticLambda1
            @Override // o.deserializeDecimalCollection
            public final void run() {
                this.f$0.createWebSocketConnection();
            }
        });
    }

    @Override // ua.naiksoftware.stomp.provider.ConnectionProvider
    public wasLastName send(final String str) {
        return wasLastName.onNavigationEvent((Callable<?>) new Callable() { // from class: ua.naiksoftware.stomp.provider.AbstractConnectionProvider$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.lambda$send$0(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$send$0(String str) throws Exception {
        if (getSocket() == null) {
            throw new StompSocketBrokenException("Not connected");
        }
        rawSend(str);
        return null;
    }

    protected void emitLifecycleEvent(@NonNull LifecycleEvent lifecycleEvent) {
        this.lifecycleStream.onExtraCallback((setTid<LifecycleEvent>) lifecycleEvent);
    }

    protected void emitMessage(String str) {
        this.messagesStream.onExtraCallback((getTimestampBytes<String>) str);
    }

    @Override // ua.naiksoftware.stomp.provider.ConnectionProvider
    public getByteBuffer<LifecycleEvent> lifecycle() {
        return this.lifecycleStream;
    }
}
