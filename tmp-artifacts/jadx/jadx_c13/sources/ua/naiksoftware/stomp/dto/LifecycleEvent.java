package ua.naiksoftware.stomp.dto;

import java.util.TreeMap;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class LifecycleEvent {
    private Integer closeCode;
    private String closeReason;
    private TreeMap<String, String> handshakeResponseHeaders = new TreeMap<>();
    private String mMessage;
    private Throwable mThrowable;
    private final Type mType;

    public enum Type {
        OPENED,
        CLOSING,
        CLOSED,
        ERROR,
        FAILED_SERVER_HEARTBEAT
    }

    public LifecycleEvent(Type type) {
        this.mType = type;
    }

    public LifecycleEvent(Type type, Throwable th) {
        this.mType = type;
        this.mThrowable = th;
    }

    public LifecycleEvent(Type type, String str) {
        this.mType = type;
        this.mMessage = str;
    }

    public Type getType() {
        return this.mType;
    }

    public Throwable getThrowable() {
        return this.mThrowable;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public void setHandshakeResponseHeaders(TreeMap<String, String> treeMap) {
        this.handshakeResponseHeaders = treeMap;
    }

    public TreeMap<String, String> getHandshakeResponseHeaders() {
        return this.handshakeResponseHeaders;
    }

    public void setCloseInfo(int i, String str) {
        this.closeCode = Integer.valueOf(i);
        this.closeReason = str;
    }

    public Integer getCloseCode() {
        return this.closeCode;
    }

    public String getCloseReason() {
        return this.closeReason;
    }
}
