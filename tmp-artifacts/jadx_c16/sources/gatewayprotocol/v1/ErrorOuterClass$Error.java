package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ErrorOuterClass$Error extends GeneratedMessageLite<ErrorOuterClass$Error, Builder> implements ErrorOuterClass$ErrorOrBuilder {
    private static final ErrorOuterClass$Error DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int ERROR_TEXT_FIELD_NUMBER = 2;
    public static final int ERROR_TOKEN_FIELD_NUMBER = 4;
    private static volatile Parser<ErrorOuterClass$Error> PARSER;
    private int errorCode_;
    private String errorText_ = "";
    private ByteString errorToken_ = ByteString.EMPTY;

    private ErrorOuterClass$Error() {
    }

    @Override // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
    public String getErrorText() {
        return this.errorText_;
    }

    @Override // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
    public ByteString getErrorTextBytes() {
        return ByteString.copyFromUtf8(this.errorText_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorText(String str) {
        this.errorText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorText() {
        this.errorText_ = getDefaultInstance().getErrorText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errorText_ = byteString.toStringUtf8();
    }

    @Override // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
    public int getErrorCodeValue() {
        return this.errorCode_;
    }

    @Override // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
    public ErrorOuterClass.PublicErrorCode getErrorCode() {
        ErrorOuterClass.PublicErrorCode publicErrorCodeForNumber = ErrorOuterClass.PublicErrorCode.forNumber(this.errorCode_);
        return publicErrorCodeForNumber == null ? ErrorOuterClass.PublicErrorCode.UNRECOGNIZED : publicErrorCodeForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCodeValue(int i) {
        this.errorCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(ErrorOuterClass.PublicErrorCode publicErrorCode) {
        this.errorCode_ = publicErrorCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    @Override // gatewayprotocol.v1.ErrorOuterClass$ErrorOrBuilder
    public ByteString getErrorToken() {
        return this.errorToken_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorToken(ByteString byteString) {
        this.errorToken_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorToken() {
        this.errorToken_ = getDefaultInstance().getErrorToken();
    }

    public static ErrorOuterClass$Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ErrorOuterClass$Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ErrorOuterClass$Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ErrorOuterClass$Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ErrorOuterClass$Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ErrorOuterClass$Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ErrorOuterClass$Error parseFrom(InputStream inputStream) throws IOException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorOuterClass$Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ErrorOuterClass$Error parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorOuterClass$Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ErrorOuterClass$Error parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ErrorOuterClass$Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ErrorOuterClass$Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ErrorOuterClass$Error errorOuterClass$Error) {
        return DEFAULT_INSTANCE.createBuilder(errorOuterClass$Error);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (ErrorOuterClass.1.onNavigationEvent[methodToInvoke.ordinal()]) {
            case 1:
                return new ErrorOuterClass$Error();
            case 2:
                return new Builder((ErrorOuterClass.1) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\f\u0004\n", new Object[]{"errorText_", "errorCode_", "errorToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ErrorOuterClass$Error> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ErrorOuterClass$Error.class) {
                    defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = defaultInstanceBasedParser;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ErrorOuterClass$Error errorOuterClass$Error = new ErrorOuterClass$Error();
        DEFAULT_INSTANCE = errorOuterClass$Error;
        GeneratedMessageLite.registerDefaultInstance(ErrorOuterClass$Error.class, errorOuterClass$Error);
    }

    public static ErrorOuterClass$Error getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ErrorOuterClass$Error> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
