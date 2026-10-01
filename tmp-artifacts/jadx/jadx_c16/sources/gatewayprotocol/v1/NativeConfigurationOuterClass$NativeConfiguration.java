package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeConfigurationOuterClass$NativeConfiguration extends GeneratedMessageLite<NativeConfigurationOuterClass$NativeConfiguration, Builder> implements NativeConfigurationOuterClass$NativeConfigurationOrBuilder {
    public static final int ADDITIONAL_STORE_PACKAGES_FIELD_NUMBER = 10;
    public static final int AD_OPERATIONS_FIELD_NUMBER = 6;
    public static final int AD_POLICY_FIELD_NUMBER = 3;
    public static final int CACHED_ASSETS_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int CACHED_WEBVIEW_FILES_CONFIGURATION_FIELD_NUMBER = 13;
    public static final int DEBUG_SETTINGS_FIELD_NUMBER = 16;
    private static final NativeConfigurationOuterClass$NativeConfiguration DEFAULT_INSTANCE;
    public static final int DEFAULT_SHOW_COMPLETION_STATE_FIELD_NUMBER = 14;
    public static final int DIAGNOSTIC_EVENTS_FIELD_NUMBER = 1;
    public static final int DOWNLOAD_POLICY_FIELD_NUMBER = 15;
    public static final int ENABLE_IAP_EVENT_FIELD_NUMBER = 8;
    public static final int ENABLE_OM_FIELD_NUMBER = 9;
    public static final int FEATURE_FLAGS_FIELD_NUMBER = 7;
    public static final int INIT_POLICY_FIELD_NUMBER = 2;
    public static final int LEVEL_PLAY_APP_KEY_FIELD_NUMBER = 22;
    public static final int MAX_EXTRAS_SIZE_KB_FIELD_NUMBER = 17;
    public static final int MAX_RECEIPT_SIZE_MB_FIELD_NUMBER = 18;
    public static final int MONITORING_IDS_FIELD_NUMBER = 21;
    public static final int OBSERVABLE_ANDROID_ACTIVITIES_FIELD_NUMBER = 12;
    public static final int OBSERVABLE_VIEW_CONTROLLERS_FIELD_NUMBER = 20;
    public static final int OPERATIVE_EVENT_POLICY_FIELD_NUMBER = 4;
    public static final int OTHER_POLICY_FIELD_NUMBER = 5;
    public static final int OVERWRITE_INTENT_FLAG_ACTIVITY_FIELD_NUMBER = 19;
    private static volatile Parser<NativeConfigurationOuterClass$NativeConfiguration> PARSER;
    private NativeConfigurationOuterClass$AdOperationsConfiguration adOperations_;
    private NativeConfigurationOuterClass.RequestPolicy adPolicy_;
    private int bitField0_;
    private NativeConfigurationOuterClass$CachedAssetsConfiguration cachedAssetsConfiguration_;
    private NativeConfigurationOuterClass$CachedAssetsConfiguration cachedWebviewFilesConfiguration_;
    private NativeConfigurationOuterClass$DebugSettings debugSettings_;
    private int defaultShowCompletionState_;
    private NativeConfigurationOuterClass$DiagnosticEventsConfiguration diagnosticEvents_;
    private NativeConfigurationOuterClass.RequestPolicy downloadPolicy_;
    private boolean enableIapEvent_;
    private boolean enableOm_;
    private NativeConfigurationOuterClass$FeatureFlags featureFlags_;
    private NativeConfigurationOuterClass.RequestPolicy initPolicy_;
    private int maxExtrasSizeKb_;
    private int maxReceiptSizeMb_;
    private NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy_;
    private NativeConfigurationOuterClass.RequestPolicy otherPolicy_;
    private int overwriteIntentFlagActivity_;
    private int monitoringIdsMemoizedSerializedSize = -1;
    private Internal.ProtobufList<String> additionalStorePackages_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ByteString> observableAndroidActivities_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ByteString> observableViewControllers_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.IntList monitoringIds_ = GeneratedMessageLite.emptyIntList();
    private String levelPlayAppKey_ = "";

    private NativeConfigurationOuterClass$NativeConfiguration() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasDiagnosticEvents() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass$DiagnosticEventsConfiguration getDiagnosticEvents() {
        NativeConfigurationOuterClass$DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration = this.diagnosticEvents_;
        return nativeConfigurationOuterClass$DiagnosticEventsConfiguration == null ? NativeConfigurationOuterClass$DiagnosticEventsConfiguration.getDefaultInstance() : nativeConfigurationOuterClass$DiagnosticEventsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiagnosticEvents(NativeConfigurationOuterClass$DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration) {
        this.diagnosticEvents_ = nativeConfigurationOuterClass$DiagnosticEventsConfiguration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDiagnosticEvents(NativeConfigurationOuterClass$DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration) {
        NativeConfigurationOuterClass$DiagnosticEventsConfiguration nativeConfigurationOuterClass$DiagnosticEventsConfiguration2 = this.diagnosticEvents_;
        if (nativeConfigurationOuterClass$DiagnosticEventsConfiguration2 != null && nativeConfigurationOuterClass$DiagnosticEventsConfiguration2 != NativeConfigurationOuterClass$DiagnosticEventsConfiguration.getDefaultInstance()) {
            this.diagnosticEvents_ = (NativeConfigurationOuterClass$DiagnosticEventsConfiguration) NativeConfigurationOuterClass$DiagnosticEventsConfiguration.newBuilder(this.diagnosticEvents_).mergeFrom(nativeConfigurationOuterClass$DiagnosticEventsConfiguration).buildPartial();
        } else {
            this.diagnosticEvents_ = nativeConfigurationOuterClass$DiagnosticEventsConfiguration;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiagnosticEvents() {
        this.diagnosticEvents_ = null;
        this.bitField0_ &= -2;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasInitPolicy() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.initPolicy_;
        return requestPolicy == null ? NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        this.initPolicy_ = requestPolicy;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInitPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.initPolicy_;
        if (requestPolicy2 != null && requestPolicy2 != NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
            this.initPolicy_ = NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.initPolicy_).mergeFrom(requestPolicy).buildPartial();
        } else {
            this.initPolicy_ = requestPolicy;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitPolicy() {
        this.initPolicy_ = null;
        this.bitField0_ &= -3;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasAdPolicy() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.adPolicy_;
        return requestPolicy == null ? NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        this.adPolicy_ = requestPolicy;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.adPolicy_;
        if (requestPolicy2 != null && requestPolicy2 != NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
            this.adPolicy_ = NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.adPolicy_).mergeFrom(requestPolicy).buildPartial();
        } else {
            this.adPolicy_ = requestPolicy;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdPolicy() {
        this.adPolicy_ = null;
        this.bitField0_ &= -5;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasOperativeEventPolicy() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.operativeEventPolicy_;
        return requestPolicy == null ? NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        this.operativeEventPolicy_ = requestPolicy;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.operativeEventPolicy_;
        if (requestPolicy2 != null && requestPolicy2 != NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
            this.operativeEventPolicy_ = NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.operativeEventPolicy_).mergeFrom(requestPolicy).buildPartial();
        } else {
            this.operativeEventPolicy_ = requestPolicy;
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperativeEventPolicy() {
        this.operativeEventPolicy_ = null;
        this.bitField0_ &= -9;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasOtherPolicy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.otherPolicy_;
        return requestPolicy == null ? NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        this.otherPolicy_ = requestPolicy;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOtherPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.otherPolicy_;
        if (requestPolicy2 != null && requestPolicy2 != NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
            this.otherPolicy_ = NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.otherPolicy_).mergeFrom(requestPolicy).buildPartial();
        } else {
            this.otherPolicy_ = requestPolicy;
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherPolicy() {
        this.otherPolicy_ = null;
        this.bitField0_ &= -17;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasAdOperations() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass$AdOperationsConfiguration getAdOperations() {
        NativeConfigurationOuterClass$AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration = this.adOperations_;
        return nativeConfigurationOuterClass$AdOperationsConfiguration == null ? NativeConfigurationOuterClass$AdOperationsConfiguration.getDefaultInstance() : nativeConfigurationOuterClass$AdOperationsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdOperations(NativeConfigurationOuterClass$AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration) {
        this.adOperations_ = nativeConfigurationOuterClass$AdOperationsConfiguration;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdOperations(NativeConfigurationOuterClass$AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration) {
        NativeConfigurationOuterClass$AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration2 = this.adOperations_;
        if (nativeConfigurationOuterClass$AdOperationsConfiguration2 != null && nativeConfigurationOuterClass$AdOperationsConfiguration2 != NativeConfigurationOuterClass$AdOperationsConfiguration.getDefaultInstance()) {
            this.adOperations_ = (NativeConfigurationOuterClass$AdOperationsConfiguration) NativeConfigurationOuterClass$AdOperationsConfiguration.newBuilder(this.adOperations_).mergeFrom(nativeConfigurationOuterClass$AdOperationsConfiguration).buildPartial();
        } else {
            this.adOperations_ = nativeConfigurationOuterClass$AdOperationsConfiguration;
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdOperations() {
        this.adOperations_ = null;
        this.bitField0_ &= -33;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasFeatureFlags() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass$FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass$FeatureFlags nativeConfigurationOuterClass$FeatureFlags = this.featureFlags_;
        return nativeConfigurationOuterClass$FeatureFlags == null ? NativeConfigurationOuterClass$FeatureFlags.getDefaultInstance() : nativeConfigurationOuterClass$FeatureFlags;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureFlags(NativeConfigurationOuterClass$FeatureFlags nativeConfigurationOuterClass$FeatureFlags) {
        this.featureFlags_ = nativeConfigurationOuterClass$FeatureFlags;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureFlags(NativeConfigurationOuterClass$FeatureFlags nativeConfigurationOuterClass$FeatureFlags) {
        NativeConfigurationOuterClass$FeatureFlags nativeConfigurationOuterClass$FeatureFlags2 = this.featureFlags_;
        if (nativeConfigurationOuterClass$FeatureFlags2 != null && nativeConfigurationOuterClass$FeatureFlags2 != NativeConfigurationOuterClass$FeatureFlags.getDefaultInstance()) {
            this.featureFlags_ = (NativeConfigurationOuterClass$FeatureFlags) NativeConfigurationOuterClass$FeatureFlags.newBuilder(this.featureFlags_).mergeFrom(nativeConfigurationOuterClass$FeatureFlags).buildPartial();
        } else {
            this.featureFlags_ = nativeConfigurationOuterClass$FeatureFlags;
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureFlags() {
        this.featureFlags_ = null;
        this.bitField0_ &= -65;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean getEnableIapEvent() {
        return this.enableIapEvent_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableIapEvent(boolean z) {
        this.enableIapEvent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableIapEvent() {
        this.enableIapEvent_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean getEnableOm() {
        return this.enableOm_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableOm(boolean z) {
        this.enableOm_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableOm() {
        this.enableOm_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public List<String> getAdditionalStorePackagesList() {
        return this.additionalStorePackages_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getAdditionalStorePackagesCount() {
        return this.additionalStorePackages_.size();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public String getAdditionalStorePackages(int i) {
        return (String) this.additionalStorePackages_.get(i);
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public ByteString getAdditionalStorePackagesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.additionalStorePackages_.get(i));
    }

    private void ensureAdditionalStorePackagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.additionalStorePackages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.additionalStorePackages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalStorePackages(int i, String str) {
        ensureAdditionalStorePackagesIsMutable();
        this.additionalStorePackages_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalStorePackages(String str) {
        ensureAdditionalStorePackagesIsMutable();
        this.additionalStorePackages_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdditionalStorePackages(Iterable<String> iterable) {
        ensureAdditionalStorePackagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.additionalStorePackages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalStorePackages() {
        this.additionalStorePackages_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalStorePackagesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAdditionalStorePackagesIsMutable();
        this.additionalStorePackages_.add(byteString.toStringUtf8());
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasCachedAssetsConfiguration() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass$CachedAssetsConfiguration getCachedAssetsConfiguration() {
        NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration = this.cachedAssetsConfiguration_;
        return nativeConfigurationOuterClass$CachedAssetsConfiguration == null ? NativeConfigurationOuterClass$CachedAssetsConfiguration.getDefaultInstance() : nativeConfigurationOuterClass$CachedAssetsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCachedAssetsConfiguration(NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration) {
        this.cachedAssetsConfiguration_ = nativeConfigurationOuterClass$CachedAssetsConfiguration;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCachedAssetsConfiguration(NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration) {
        NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration2 = this.cachedAssetsConfiguration_;
        if (nativeConfigurationOuterClass$CachedAssetsConfiguration2 != null && nativeConfigurationOuterClass$CachedAssetsConfiguration2 != NativeConfigurationOuterClass$CachedAssetsConfiguration.getDefaultInstance()) {
            this.cachedAssetsConfiguration_ = (NativeConfigurationOuterClass$CachedAssetsConfiguration) NativeConfigurationOuterClass$CachedAssetsConfiguration.newBuilder(this.cachedAssetsConfiguration_).mergeFrom(nativeConfigurationOuterClass$CachedAssetsConfiguration).buildPartial();
        } else {
            this.cachedAssetsConfiguration_ = nativeConfigurationOuterClass$CachedAssetsConfiguration;
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCachedAssetsConfiguration() {
        this.cachedAssetsConfiguration_ = null;
        this.bitField0_ &= -129;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public List<ByteString> getObservableAndroidActivitiesList() {
        return this.observableAndroidActivities_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getObservableAndroidActivitiesCount() {
        return this.observableAndroidActivities_.size();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public ByteString getObservableAndroidActivities(int i) {
        return (ByteString) this.observableAndroidActivities_.get(i);
    }

    private void ensureObservableAndroidActivitiesIsMutable() {
        Internal.ProtobufList<ByteString> protobufList = this.observableAndroidActivities_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.observableAndroidActivities_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObservableAndroidActivities(int i, ByteString byteString) {
        ensureObservableAndroidActivitiesIsMutable();
        this.observableAndroidActivities_.set(i, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObservableAndroidActivities(ByteString byteString) {
        ensureObservableAndroidActivitiesIsMutable();
        this.observableAndroidActivities_.add(byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllObservableAndroidActivities(Iterable<? extends ByteString> iterable) {
        ensureObservableAndroidActivitiesIsMutable();
        AbstractMessageLite.addAll(iterable, this.observableAndroidActivities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObservableAndroidActivities() {
        this.observableAndroidActivities_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasCachedWebviewFilesConfiguration() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass$CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
        NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration = this.cachedWebviewFilesConfiguration_;
        return nativeConfigurationOuterClass$CachedAssetsConfiguration == null ? NativeConfigurationOuterClass$CachedAssetsConfiguration.getDefaultInstance() : nativeConfigurationOuterClass$CachedAssetsConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration) {
        this.cachedWebviewFilesConfiguration_ = nativeConfigurationOuterClass$CachedAssetsConfiguration;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCachedWebviewFilesConfiguration(NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration) {
        NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration2 = this.cachedWebviewFilesConfiguration_;
        if (nativeConfigurationOuterClass$CachedAssetsConfiguration2 != null && nativeConfigurationOuterClass$CachedAssetsConfiguration2 != NativeConfigurationOuterClass$CachedAssetsConfiguration.getDefaultInstance()) {
            this.cachedWebviewFilesConfiguration_ = (NativeConfigurationOuterClass$CachedAssetsConfiguration) NativeConfigurationOuterClass$CachedAssetsConfiguration.newBuilder(this.cachedWebviewFilesConfiguration_).mergeFrom(nativeConfigurationOuterClass$CachedAssetsConfiguration).buildPartial();
        } else {
            this.cachedWebviewFilesConfiguration_ = nativeConfigurationOuterClass$CachedAssetsConfiguration;
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCachedWebviewFilesConfiguration() {
        this.cachedWebviewFilesConfiguration_ = null;
        this.bitField0_ &= -257;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getDefaultShowCompletionStateValue() {
        return this.defaultShowCompletionState_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass$ShowCompletionState getDefaultShowCompletionState() {
        NativeConfigurationOuterClass$ShowCompletionState nativeConfigurationOuterClass$ShowCompletionStateForNumber = NativeConfigurationOuterClass$ShowCompletionState.forNumber(this.defaultShowCompletionState_);
        return nativeConfigurationOuterClass$ShowCompletionStateForNumber == null ? NativeConfigurationOuterClass$ShowCompletionState.UNRECOGNIZED : nativeConfigurationOuterClass$ShowCompletionStateForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultShowCompletionStateValue(int i) {
        this.defaultShowCompletionState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultShowCompletionState(NativeConfigurationOuterClass$ShowCompletionState nativeConfigurationOuterClass$ShowCompletionState) {
        this.defaultShowCompletionState_ = nativeConfigurationOuterClass$ShowCompletionState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultShowCompletionState() {
        this.defaultShowCompletionState_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasDownloadPolicy() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy = this.downloadPolicy_;
        return requestPolicy == null ? NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance() : requestPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        this.downloadPolicy_ = requestPolicy;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        NativeConfigurationOuterClass.RequestPolicy requestPolicy2 = this.downloadPolicy_;
        if (requestPolicy2 != null && requestPolicy2 != NativeConfigurationOuterClass.RequestPolicy.getDefaultInstance()) {
            this.downloadPolicy_ = NativeConfigurationOuterClass.RequestPolicy.newBuilder(this.downloadPolicy_).mergeFrom(requestPolicy).buildPartial();
        } else {
            this.downloadPolicy_ = requestPolicy;
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadPolicy() {
        this.downloadPolicy_ = null;
        this.bitField0_ &= -513;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasDebugSettings() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public NativeConfigurationOuterClass$DebugSettings getDebugSettings() {
        NativeConfigurationOuterClass$DebugSettings nativeConfigurationOuterClass$DebugSettings = this.debugSettings_;
        return nativeConfigurationOuterClass$DebugSettings == null ? NativeConfigurationOuterClass$DebugSettings.getDefaultInstance() : nativeConfigurationOuterClass$DebugSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugSettings(NativeConfigurationOuterClass$DebugSettings nativeConfigurationOuterClass$DebugSettings) {
        this.debugSettings_ = nativeConfigurationOuterClass$DebugSettings;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDebugSettings(NativeConfigurationOuterClass$DebugSettings nativeConfigurationOuterClass$DebugSettings) {
        NativeConfigurationOuterClass$DebugSettings nativeConfigurationOuterClass$DebugSettings2 = this.debugSettings_;
        if (nativeConfigurationOuterClass$DebugSettings2 != null && nativeConfigurationOuterClass$DebugSettings2 != NativeConfigurationOuterClass$DebugSettings.getDefaultInstance()) {
            this.debugSettings_ = (NativeConfigurationOuterClass$DebugSettings) NativeConfigurationOuterClass$DebugSettings.newBuilder(this.debugSettings_).mergeFrom(nativeConfigurationOuterClass$DebugSettings).buildPartial();
        } else {
            this.debugSettings_ = nativeConfigurationOuterClass$DebugSettings;
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugSettings() {
        this.debugSettings_ = null;
        this.bitField0_ &= -1025;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getMaxExtrasSizeKb() {
        return this.maxExtrasSizeKb_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxExtrasSizeKb(int i) {
        this.maxExtrasSizeKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxExtrasSizeKb() {
        this.maxExtrasSizeKb_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getMaxReceiptSizeMb() {
        return this.maxReceiptSizeMb_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxReceiptSizeMb(int i) {
        this.maxReceiptSizeMb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxReceiptSizeMb() {
        this.maxReceiptSizeMb_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getOverwriteIntentFlagActivity() {
        return this.overwriteIntentFlagActivity_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverwriteIntentFlagActivity(int i) {
        this.overwriteIntentFlagActivity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverwriteIntentFlagActivity() {
        this.overwriteIntentFlagActivity_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public List<ByteString> getObservableViewControllersList() {
        return this.observableViewControllers_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getObservableViewControllersCount() {
        return this.observableViewControllers_.size();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public ByteString getObservableViewControllers(int i) {
        return (ByteString) this.observableViewControllers_.get(i);
    }

    private void ensureObservableViewControllersIsMutable() {
        Internal.ProtobufList<ByteString> protobufList = this.observableViewControllers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.observableViewControllers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObservableViewControllers(int i, ByteString byteString) {
        ensureObservableViewControllersIsMutable();
        this.observableViewControllers_.set(i, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addObservableViewControllers(ByteString byteString) {
        ensureObservableViewControllersIsMutable();
        this.observableViewControllers_.add(byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllObservableViewControllers(Iterable<? extends ByteString> iterable) {
        ensureObservableViewControllersIsMutable();
        AbstractMessageLite.addAll(iterable, this.observableViewControllers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObservableViewControllers() {
        this.observableViewControllers_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public List<Integer> getMonitoringIdsList() {
        return this.monitoringIds_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getMonitoringIdsCount() {
        return this.monitoringIds_.size();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public int getMonitoringIds(int i) {
        return this.monitoringIds_.getInt(i);
    }

    private void ensureMonitoringIdsIsMutable() {
        Internal.IntList intList = this.monitoringIds_;
        if (intList.isModifiable()) {
            return;
        }
        this.monitoringIds_ = GeneratedMessageLite.mutableCopy(intList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoringIds(int i, int i2) {
        ensureMonitoringIdsIsMutable();
        this.monitoringIds_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoringIds(int i) {
        ensureMonitoringIdsIsMutable();
        this.monitoringIds_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoringIds(Iterable<? extends Integer> iterable) {
        ensureMonitoringIdsIsMutable();
        AbstractMessageLite.addAll(iterable, this.monitoringIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoringIds() {
        this.monitoringIds_ = GeneratedMessageLite.emptyIntList();
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public boolean hasLevelPlayAppKey() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public String getLevelPlayAppKey() {
        return this.levelPlayAppKey_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfigurationOrBuilder
    public ByteString getLevelPlayAppKeyBytes() {
        return ByteString.copyFromUtf8(this.levelPlayAppKey_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelPlayAppKey(String str) {
        this.bitField0_ |= 2048;
        this.levelPlayAppKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevelPlayAppKey() {
        this.bitField0_ &= -2049;
        this.levelPlayAppKey_ = getDefaultInstance().getLevelPlayAppKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelPlayAppKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.levelPlayAppKey_ = byteString.toStringUtf8();
        this.bitField0_ |= 2048;
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$NativeConfiguration);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$NativeConfiguration();
            case 2:
                return new Builder((NativeConfigurationOuterClass.2) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0004\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\u0007\t\u0007\nȚ\u000bဉ\u0007\f\u001c\rဉ\b\u000e\f\u000fဉ\t\u0010ဉ\n\u0011\u0004\u0012\u0004\u0013\u0004\u0014\u001c\u0015'\u0016ለ\u000b", new Object[]{"bitField0_", "diagnosticEvents_", "initPolicy_", "adPolicy_", "operativeEventPolicy_", "otherPolicy_", "adOperations_", "featureFlags_", "enableIapEvent_", "enableOm_", "additionalStorePackages_", "cachedAssetsConfiguration_", "observableAndroidActivities_", "cachedWebviewFilesConfiguration_", "defaultShowCompletionState_", "downloadPolicy_", "debugSettings_", "maxExtrasSizeKb_", "maxReceiptSizeMb_", "overwriteIntentFlagActivity_", "observableViewControllers_", "monitoringIds_", "levelPlayAppKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$NativeConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$NativeConfiguration.class) {
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
        NativeConfigurationOuterClass$NativeConfiguration nativeConfigurationOuterClass$NativeConfiguration = new NativeConfigurationOuterClass$NativeConfiguration();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$NativeConfiguration;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$NativeConfiguration.class, nativeConfigurationOuterClass$NativeConfiguration);
    }

    public static NativeConfigurationOuterClass$NativeConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$NativeConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
