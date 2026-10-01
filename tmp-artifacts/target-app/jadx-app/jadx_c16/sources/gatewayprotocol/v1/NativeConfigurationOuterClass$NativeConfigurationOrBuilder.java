package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface NativeConfigurationOuterClass$NativeConfigurationOrBuilder extends MessageLiteOrBuilder {
    NativeConfigurationOuterClass$AdOperationsConfiguration getAdOperations();

    NativeConfigurationOuterClass.RequestPolicy getAdPolicy();

    String getAdditionalStorePackages(int i);

    ByteString getAdditionalStorePackagesBytes(int i);

    int getAdditionalStorePackagesCount();

    List<String> getAdditionalStorePackagesList();

    NativeConfigurationOuterClass$CachedAssetsConfiguration getCachedAssetsConfiguration();

    NativeConfigurationOuterClass$CachedAssetsConfiguration getCachedWebviewFilesConfiguration();

    NativeConfigurationOuterClass$DebugSettings getDebugSettings();

    NativeConfigurationOuterClass$ShowCompletionState getDefaultShowCompletionState();

    int getDefaultShowCompletionStateValue();

    NativeConfigurationOuterClass$DiagnosticEventsConfiguration getDiagnosticEvents();

    NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy();

    boolean getEnableIapEvent();

    boolean getEnableOm();

    NativeConfigurationOuterClass$FeatureFlags getFeatureFlags();

    NativeConfigurationOuterClass.RequestPolicy getInitPolicy();

    String getLevelPlayAppKey();

    ByteString getLevelPlayAppKeyBytes();

    int getMaxExtrasSizeKb();

    int getMaxReceiptSizeMb();

    int getMonitoringIds(int i);

    int getMonitoringIdsCount();

    List<Integer> getMonitoringIdsList();

    ByteString getObservableAndroidActivities(int i);

    int getObservableAndroidActivitiesCount();

    List<ByteString> getObservableAndroidActivitiesList();

    ByteString getObservableViewControllers(int i);

    int getObservableViewControllersCount();

    List<ByteString> getObservableViewControllersList();

    NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy();

    NativeConfigurationOuterClass.RequestPolicy getOtherPolicy();

    int getOverwriteIntentFlagActivity();

    boolean hasAdOperations();

    boolean hasAdPolicy();

    boolean hasCachedAssetsConfiguration();

    boolean hasCachedWebviewFilesConfiguration();

    boolean hasDebugSettings();

    boolean hasDiagnosticEvents();

    boolean hasDownloadPolicy();

    boolean hasFeatureFlags();

    boolean hasInitPolicy();

    boolean hasLevelPlayAppKey();

    boolean hasOperativeEventPolicy();

    boolean hasOtherPolicy();
}
