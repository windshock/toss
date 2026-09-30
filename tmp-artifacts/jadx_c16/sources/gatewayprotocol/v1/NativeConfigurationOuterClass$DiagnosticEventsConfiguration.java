package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeConfigurationOuterClass$DiagnosticEventsConfiguration extends GeneratedMessageLite<NativeConfigurationOuterClass$DiagnosticEventsConfiguration, Builder> implements NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder {
    public static final int ALLOWED_EVENTS_FIELD_NUMBER = 6;
    public static final int BLOCKED_EVENTS_FIELD_NUMBER = 7;
    private static final NativeConfigurationOuterClass$DiagnosticEventsConfiguration DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int MAX_BATCH_INTERVAL_MS_FIELD_NUMBER = 3;
    public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 2;
    private static volatile Parser<NativeConfigurationOuterClass$DiagnosticEventsConfiguration> PARSER = null;
    public static final int SEVERITY_FIELD_NUMBER = 5;
    public static final int TTM_ENABLED_FIELD_NUMBER = 4;
    private static final Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents_converter_ = new Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfiguration.4
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public DiagnosticEventRequestOuterClass.DiagnosticEventType convert(Integer num) {
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
            return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }
    };
    private static final Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents_converter_ = new Internal.ListAdapter.Converter<Integer, DiagnosticEventRequestOuterClass.DiagnosticEventType>() { // from class: gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfiguration.1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public DiagnosticEventRequestOuterClass.DiagnosticEventType convert(Integer num) {
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
            return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
        }
    };
    private int allowedEventsMemoizedSerializedSize;
    private int blockedEventsMemoizedSerializedSize;
    private boolean enabled_;
    private int maxBatchIntervalMs_;
    private int maxBatchSize_;
    private int severity_;
    private boolean ttmEnabled_;
    private Internal.IntList allowedEvents_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList blockedEvents_ = GeneratedMessageLite.emptyIntList();

    private NativeConfigurationOuterClass$DiagnosticEventsConfiguration() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public boolean getEnabled() {
        return this.enabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(boolean z) {
        this.enabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabled() {
        this.enabled_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public int getMaxBatchSize() {
        return this.maxBatchSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxBatchSize(int i) {
        this.maxBatchSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxBatchSize() {
        this.maxBatchSize_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public int getMaxBatchIntervalMs() {
        return this.maxBatchIntervalMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxBatchIntervalMs(int i) {
        this.maxBatchIntervalMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxBatchIntervalMs() {
        this.maxBatchIntervalMs_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public boolean getTtmEnabled() {
        return this.ttmEnabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtmEnabled(boolean z) {
        this.ttmEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtmEnabled() {
        this.ttmEnabled_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public int getSeverityValue() {
        return this.severity_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
        DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverityForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(this.severity_);
        return diagnosticEventsSeverityForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.UNRECOGNIZED : diagnosticEventsSeverityForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeverityValue(int i) {
        this.severity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
        this.severity_ = diagnosticEventsSeverity.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeverity() {
        this.severity_ = 0;
    }

    static {
        NativeConfigurationOuterClass$DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration = new NativeConfigurationOuterClass$DiagnosticEventsConfiguration();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$DiagnosticEventsConfiguration;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$DiagnosticEventsConfiguration.class, nativeConfigurationOuterClass$DiagnosticEventsConfiguration);
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList() {
        return new Internal.ListAdapter(this.allowedEvents_, allowedEvents_converter_);
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public int getAllowedEventsCount() {
        return this.allowedEvents_.size();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.allowedEvents_.getInt(i));
        return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public List<Integer> getAllowedEventsValueList() {
        return this.allowedEvents_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public int getAllowedEventsValue(int i) {
        return this.allowedEvents_.getInt(i);
    }

    private void ensureAllowedEventsIsMutable() {
        Internal.IntList intList = this.allowedEvents_;
        if (intList.isModifiable()) {
            return;
        }
        this.allowedEvents_ = GeneratedMessageLite.mutableCopy(intList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
        ensureAllowedEventsIsMutable();
        this.allowedEvents_.setInt(i, diagnosticEventType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
        ensureAllowedEventsIsMutable();
        this.allowedEvents_.addInt(diagnosticEventType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedEvents(Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
        ensureAllowedEventsIsMutable();
        Iterator<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
        while (it.hasNext()) {
            this.allowedEvents_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedEvents() {
        this.allowedEvents_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedEventsValue(int i, int i2) {
        ensureAllowedEventsIsMutable();
        this.allowedEvents_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedEventsValue(int i) {
        ensureAllowedEventsIsMutable();
        this.allowedEvents_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedEventsValue(Iterable<Integer> iterable) {
        ensureAllowedEventsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.allowedEvents_.addInt(it.next().intValue());
        }
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList() {
        return new Internal.ListAdapter(this.blockedEvents_, blockedEvents_converter_);
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public int getBlockedEventsCount() {
        return this.blockedEvents_.size();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.blockedEvents_.getInt(i));
        return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public List<Integer> getBlockedEventsValueList() {
        return this.blockedEvents_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder
    public int getBlockedEventsValue(int i) {
        return this.blockedEvents_.getInt(i);
    }

    private void ensureBlockedEventsIsMutable() {
        Internal.IntList intList = this.blockedEvents_;
        if (intList.isModifiable()) {
            return;
        }
        this.blockedEvents_ = GeneratedMessageLite.mutableCopy(intList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
        ensureBlockedEventsIsMutable();
        this.blockedEvents_.setInt(i, diagnosticEventType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBlockedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
        ensureBlockedEventsIsMutable();
        this.blockedEvents_.addInt(diagnosticEventType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBlockedEvents(Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
        ensureBlockedEventsIsMutable();
        Iterator<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> it = iterable.iterator();
        while (it.hasNext()) {
            this.blockedEvents_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlockedEvents() {
        this.blockedEvents_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlockedEventsValue(int i, int i2) {
        ensureBlockedEventsIsMutable();
        this.blockedEvents_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBlockedEventsValue(int i) {
        ensureBlockedEventsIsMutable();
        this.blockedEvents_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBlockedEventsValue(Iterable<Integer> iterable) {
        ensureBlockedEventsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.blockedEvents_.addInt(it.next().intValue());
        }
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$DiagnosticEventsConfiguration);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$DiagnosticEventsConfiguration();
            case 2:
                return new Builder((NativeConfigurationOuterClass.2) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006,\u0007,", new Object[]{"enabled_", "maxBatchSize_", "maxBatchIntervalMs_", "ttmEnabled_", "severity_", "allowedEvents_", "blockedEvents_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$DiagnosticEventsConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$DiagnosticEventsConfiguration.class) {
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

    public static NativeConfigurationOuterClass$DiagnosticEventsConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$DiagnosticEventsConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
