package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import o.LazyStaggeredGridMeasureKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private LazyStaggeredGridMeasureKtExternalSyntheticLambda1 unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public InvalidProtocolBufferException IAuthTabCallback(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1) {
        this.unfinishedMessage = lazyStaggeredGridMeasureKtExternalSyntheticLambda1;
        return this;
    }

    public void IAuthTabCallback_Parcel() {
        this.wasThrownFromInputStream = true;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.wasThrownFromInputStream;
    }

    public static InvalidProtocolBufferException IAuthTabCallbackDefault() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static InvalidProtocolBufferException asBinder() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException onExtraCallback() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException onNavigationEvent() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public static InvalidProtocolBufferException onExtraCallbackWithResult() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public static InvalidWireTypeException IAuthTabCallback() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public static InvalidProtocolBufferException asInterface() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static InvalidProtocolBufferException IAuthTabCallbackStub() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static InvalidProtocolBufferException onTransact() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public static InvalidProtocolBufferException onWarmupCompleted() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
