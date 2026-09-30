package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.WebviewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WebviewConfiguration$WebViewConfiguration extends GeneratedMessageLite<WebviewConfiguration$WebViewConfiguration, Builder> implements WebviewConfiguration$WebViewConfigurationOrBuilder {
    public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
    private static final WebviewConfiguration$WebViewConfiguration DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_FIELD_NUMBER = 2;
    private static volatile Parser<WebviewConfiguration$WebViewConfiguration> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    private String entryPoint_ = "";
    private Internal.ProtobufList<String> additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
    private String type_ = "";

    private WebviewConfiguration$WebViewConfiguration() {
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public int getVersion() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public String getEntryPoint() {
        return this.entryPoint_;
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public ByteString getEntryPointBytes() {
        return ByteString.copyFromUtf8(this.entryPoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPoint(String str) {
        this.entryPoint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPoint() {
        this.entryPoint_ = getDefaultInstance().getEntryPoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.entryPoint_ = byteString.toStringUtf8();
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public List<String> getAdditionalFilesList() {
        return this.additionalFiles_;
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public int getAdditionalFilesCount() {
        return this.additionalFiles_.size();
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public String getAdditionalFiles(int i) {
        return (String) this.additionalFiles_.get(i);
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public ByteString getAdditionalFilesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.additionalFiles_.get(i));
    }

    private void ensureAdditionalFilesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.additionalFiles_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.additionalFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalFiles(int i, String str) {
        ensureAdditionalFilesIsMutable();
        this.additionalFiles_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalFiles(String str) {
        ensureAdditionalFilesIsMutable();
        this.additionalFiles_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdditionalFiles(Iterable<String> iterable) {
        ensureAdditionalFilesIsMutable();
        AbstractMessageLite.addAll(iterable, this.additionalFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalFiles() {
        this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalFilesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAdditionalFilesIsMutable();
        this.additionalFiles_.add(byteString.toStringUtf8());
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // gatewayprotocol.v1.WebviewConfiguration$WebViewConfigurationOrBuilder
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WebviewConfiguration$WebViewConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WebviewConfiguration$WebViewConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WebviewConfiguration$WebViewConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WebviewConfiguration$WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(webviewConfiguration$WebViewConfiguration);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (WebviewConfiguration.5.onWarmupCompleted[methodToInvoke.ordinal()]) {
            case 1:
                return new WebviewConfiguration$WebViewConfiguration();
            case 2:
                return new Builder((WebviewConfiguration.5) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"version_", "entryPoint_", "additionalFiles_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WebviewConfiguration$WebViewConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (WebviewConfiguration$WebViewConfiguration.class) {
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
        WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration = new WebviewConfiguration$WebViewConfiguration();
        DEFAULT_INSTANCE = webviewConfiguration$WebViewConfiguration;
        GeneratedMessageLite.registerDefaultInstance(WebviewConfiguration$WebViewConfiguration.class, webviewConfiguration$WebViewConfiguration);
    }

    public static WebviewConfiguration$WebViewConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<WebviewConfiguration$WebViewConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
