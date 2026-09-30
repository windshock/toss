package gatewayprotocol.v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface NativeConfigurationOuterClass$FeatureFlagsOrBuilder extends MessageLiteOrBuilder {
    boolean getAppSheetBugCheckEnabled();

    boolean getBoldSdkNextSessionEnabled();

    boolean getCollectGoogleAppId();

    boolean getCollectIlrData();

    boolean getCollectLifecycleEvents();

    boolean getDisableCustomScheme();

    boolean getDisableGridCollection();

    boolean getEnableCoherenceLibrary();

    boolean getEnsureCacheFolderExistences();

    NativeConfigurationOuterClass$FullscreenNavBarMode getFullscreenNavBarMode();

    int getFullscreenNavBarModeValue();

    NativeConfigurationOuterClass$NativeStartMode getNativeStartMode();

    int getNativeStartModeValue();

    boolean getOpenglGpuEnabled();

    boolean getOpportunityIdPlacementValidation();

    boolean getRecoverTerminatedWebviews();

    boolean getShouldHandleWebviewCaching();

    boolean getShouldInitAdqWithGameId();

    boolean getShouldSendIapHistory();

    boolean getUseFilesDir();

    boolean getUseOptimisticWebviewCache();

    boolean getUseTryCatchInDownloadQueue();

    boolean getWebviewLessLoadParallelActivityLaunch();
}
