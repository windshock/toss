package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeConfigurationOuterClass$FeatureFlags extends GeneratedMessageLite<NativeConfigurationOuterClass$FeatureFlags, Builder> implements NativeConfigurationOuterClass$FeatureFlagsOrBuilder {
    public static final int APP_SHEET_BUG_CHECK_ENABLED_FIELD_NUMBER = 4;
    public static final int BOLD_SDK_NEXT_SESSION_ENABLED_FIELD_NUMBER = 3;
    public static final int COLLECT_GOOGLE_APP_ID_FIELD_NUMBER = 18;
    public static final int COLLECT_ILR_DATA_FIELD_NUMBER = 8;
    public static final int COLLECT_LIFECYCLE_EVENTS_FIELD_NUMBER = 15;
    private static final NativeConfigurationOuterClass$FeatureFlags DEFAULT_INSTANCE;
    public static final int DISABLE_CUSTOM_SCHEME_FIELD_NUMBER = 10;
    public static final int DISABLE_GRID_COLLECTION_FIELD_NUMBER = 9;
    public static final int ENABLE_COHERENCE_LIBRARY_FIELD_NUMBER = 19;
    public static final int ENSURE_CACHE_FOLDER_EXISTENCES_FIELD_NUMBER = 13;
    public static final int FULLSCREEN_NAV_BAR_MODE_FIELD_NUMBER = 20;
    public static final int NATIVE_START_MODE_FIELD_NUMBER = 16;
    public static final int OPENGL_GPU_ENABLED_FIELD_NUMBER = 1;
    public static final int OPPORTUNITY_ID_PLACEMENT_VALIDATION_FIELD_NUMBER = 2;
    private static volatile Parser<NativeConfigurationOuterClass$FeatureFlags> PARSER = null;
    public static final int RECOVER_TERMINATED_WEBVIEWS_FIELD_NUMBER = 5;
    public static final int SHOULD_HANDLE_WEBVIEW_CACHING_FIELD_NUMBER = 6;
    public static final int SHOULD_INIT_ADQ_WITH_GAME_ID_FIELD_NUMBER = 21;
    public static final int SHOULD_SEND_IAP_HISTORY_FIELD_NUMBER = 7;
    public static final int USE_FILES_DIR_FIELD_NUMBER = 11;
    public static final int USE_OPTIMISTIC_WEBVIEW_CACHE_FIELD_NUMBER = 17;
    public static final int USE_TRY_CATCH_IN_DOWNLOAD_QUEUE_FIELD_NUMBER = 12;
    public static final int WEBVIEW_LESS_LOAD_PARALLEL_ACTIVITY_LAUNCH_FIELD_NUMBER = 14;
    private boolean appSheetBugCheckEnabled_;
    private boolean boldSdkNextSessionEnabled_;
    private boolean collectGoogleAppId_;
    private boolean collectIlrData_;
    private boolean collectLifecycleEvents_;
    private boolean disableCustomScheme_;
    private boolean disableGridCollection_;
    private boolean enableCoherenceLibrary_;
    private boolean ensureCacheFolderExistences_;
    private int fullscreenNavBarMode_;
    private int nativeStartMode_;
    private boolean openglGpuEnabled_;
    private boolean opportunityIdPlacementValidation_;
    private boolean recoverTerminatedWebviews_;
    private boolean shouldHandleWebviewCaching_;
    private boolean shouldInitAdqWithGameId_;
    private boolean shouldSendIapHistory_;
    private boolean useFilesDir_;
    private boolean useOptimisticWebviewCache_;
    private boolean useTryCatchInDownloadQueue_;
    private boolean webviewLessLoadParallelActivityLaunch_;

    private NativeConfigurationOuterClass$FeatureFlags() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getOpenglGpuEnabled() {
        return this.openglGpuEnabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenglGpuEnabled(boolean z) {
        this.openglGpuEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenglGpuEnabled() {
        this.openglGpuEnabled_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getOpportunityIdPlacementValidation() {
        return this.opportunityIdPlacementValidation_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpportunityIdPlacementValidation(boolean z) {
        this.opportunityIdPlacementValidation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpportunityIdPlacementValidation() {
        this.opportunityIdPlacementValidation_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getBoldSdkNextSessionEnabled() {
        return this.boldSdkNextSessionEnabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoldSdkNextSessionEnabled(boolean z) {
        this.boldSdkNextSessionEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoldSdkNextSessionEnabled() {
        this.boldSdkNextSessionEnabled_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getAppSheetBugCheckEnabled() {
        return this.appSheetBugCheckEnabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppSheetBugCheckEnabled(boolean z) {
        this.appSheetBugCheckEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppSheetBugCheckEnabled() {
        this.appSheetBugCheckEnabled_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getRecoverTerminatedWebviews() {
        return this.recoverTerminatedWebviews_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecoverTerminatedWebviews(boolean z) {
        this.recoverTerminatedWebviews_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecoverTerminatedWebviews() {
        this.recoverTerminatedWebviews_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getShouldHandleWebviewCaching() {
        return this.shouldHandleWebviewCaching_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldHandleWebviewCaching(boolean z) {
        this.shouldHandleWebviewCaching_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldHandleWebviewCaching() {
        this.shouldHandleWebviewCaching_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getShouldSendIapHistory() {
        return this.shouldSendIapHistory_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldSendIapHistory(boolean z) {
        this.shouldSendIapHistory_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldSendIapHistory() {
        this.shouldSendIapHistory_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getCollectIlrData() {
        return this.collectIlrData_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectIlrData(boolean z) {
        this.collectIlrData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectIlrData() {
        this.collectIlrData_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getDisableGridCollection() {
        return this.disableGridCollection_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableGridCollection(boolean z) {
        this.disableGridCollection_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableGridCollection() {
        this.disableGridCollection_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getDisableCustomScheme() {
        return this.disableCustomScheme_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCustomScheme(boolean z) {
        this.disableCustomScheme_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableCustomScheme() {
        this.disableCustomScheme_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getUseFilesDir() {
        return this.useFilesDir_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseFilesDir(boolean z) {
        this.useFilesDir_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseFilesDir() {
        this.useFilesDir_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getUseTryCatchInDownloadQueue() {
        return this.useTryCatchInDownloadQueue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseTryCatchInDownloadQueue(boolean z) {
        this.useTryCatchInDownloadQueue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseTryCatchInDownloadQueue() {
        this.useTryCatchInDownloadQueue_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getEnsureCacheFolderExistences() {
        return this.ensureCacheFolderExistences_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnsureCacheFolderExistences(boolean z) {
        this.ensureCacheFolderExistences_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnsureCacheFolderExistences() {
        this.ensureCacheFolderExistences_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getWebviewLessLoadParallelActivityLaunch() {
        return this.webviewLessLoadParallelActivityLaunch_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewLessLoadParallelActivityLaunch(boolean z) {
        this.webviewLessLoadParallelActivityLaunch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewLessLoadParallelActivityLaunch() {
        this.webviewLessLoadParallelActivityLaunch_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getCollectLifecycleEvents() {
        return this.collectLifecycleEvents_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectLifecycleEvents(boolean z) {
        this.collectLifecycleEvents_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectLifecycleEvents() {
        this.collectLifecycleEvents_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public int getNativeStartModeValue() {
        return this.nativeStartMode_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public NativeConfigurationOuterClass$NativeStartMode getNativeStartMode() {
        NativeConfigurationOuterClass$NativeStartMode nativeConfigurationOuterClass$NativeStartModeForNumber = NativeConfigurationOuterClass$NativeStartMode.forNumber(this.nativeStartMode_);
        return nativeConfigurationOuterClass$NativeStartModeForNumber == null ? NativeConfigurationOuterClass$NativeStartMode.UNRECOGNIZED : nativeConfigurationOuterClass$NativeStartModeForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeStartModeValue(int i) {
        this.nativeStartMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeStartMode(NativeConfigurationOuterClass$NativeStartMode nativeConfigurationOuterClass$NativeStartMode) {
        this.nativeStartMode_ = nativeConfigurationOuterClass$NativeStartMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNativeStartMode() {
        this.nativeStartMode_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getUseOptimisticWebviewCache() {
        return this.useOptimisticWebviewCache_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseOptimisticWebviewCache(boolean z) {
        this.useOptimisticWebviewCache_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseOptimisticWebviewCache() {
        this.useOptimisticWebviewCache_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getCollectGoogleAppId() {
        return this.collectGoogleAppId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectGoogleAppId(boolean z) {
        this.collectGoogleAppId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectGoogleAppId() {
        this.collectGoogleAppId_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getEnableCoherenceLibrary() {
        return this.enableCoherenceLibrary_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableCoherenceLibrary(boolean z) {
        this.enableCoherenceLibrary_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableCoherenceLibrary() {
        this.enableCoherenceLibrary_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public int getFullscreenNavBarModeValue() {
        return this.fullscreenNavBarMode_;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public NativeConfigurationOuterClass$FullscreenNavBarMode getFullscreenNavBarMode() {
        NativeConfigurationOuterClass$FullscreenNavBarMode nativeConfigurationOuterClass$FullscreenNavBarModeForNumber = NativeConfigurationOuterClass$FullscreenNavBarMode.forNumber(this.fullscreenNavBarMode_);
        return nativeConfigurationOuterClass$FullscreenNavBarModeForNumber == null ? NativeConfigurationOuterClass$FullscreenNavBarMode.UNRECOGNIZED : nativeConfigurationOuterClass$FullscreenNavBarModeForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullscreenNavBarModeValue(int i) {
        this.fullscreenNavBarMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullscreenNavBarMode(NativeConfigurationOuterClass$FullscreenNavBarMode nativeConfigurationOuterClass$FullscreenNavBarMode) {
        this.fullscreenNavBarMode_ = nativeConfigurationOuterClass$FullscreenNavBarMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullscreenNavBarMode() {
        this.fullscreenNavBarMode_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlagsOrBuilder
    public boolean getShouldInitAdqWithGameId() {
        return this.shouldInitAdqWithGameId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldInitAdqWithGameId(boolean z) {
        this.shouldInitAdqWithGameId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldInitAdqWithGameId() {
        this.shouldInitAdqWithGameId_ = false;
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$FeatureFlags parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$FeatureFlags nativeConfigurationOuterClass$FeatureFlags) {
        return DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$FeatureFlags);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$FeatureFlags();
            case 2:
                return new Builder((NativeConfigurationOuterClass.2) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\f\u0011\u0007\u0012\u0007\u0013\u0007\u0014\f\u0015\u0007", new Object[]{"openglGpuEnabled_", "opportunityIdPlacementValidation_", "boldSdkNextSessionEnabled_", "appSheetBugCheckEnabled_", "recoverTerminatedWebviews_", "shouldHandleWebviewCaching_", "shouldSendIapHistory_", "collectIlrData_", "disableGridCollection_", "disableCustomScheme_", "useFilesDir_", "useTryCatchInDownloadQueue_", "ensureCacheFolderExistences_", "webviewLessLoadParallelActivityLaunch_", "collectLifecycleEvents_", "nativeStartMode_", "useOptimisticWebviewCache_", "collectGoogleAppId_", "enableCoherenceLibrary_", "fullscreenNavBarMode_", "shouldInitAdqWithGameId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$FeatureFlags> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$FeatureFlags.class) {
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
        NativeConfigurationOuterClass$FeatureFlags nativeConfigurationOuterClass$FeatureFlags = new NativeConfigurationOuterClass$FeatureFlags();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$FeatureFlags;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$FeatureFlags.class, nativeConfigurationOuterClass$FeatureFlags);
    }

    public static NativeConfigurationOuterClass$FeatureFlags getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$FeatureFlags> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
