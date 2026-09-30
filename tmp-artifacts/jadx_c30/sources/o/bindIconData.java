package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class bindIconData {
    int IAuthTabCallbackDefault;
    int IAuthTabCallbackStubProxy;
    byte[] IAuthTabCallback_Parcel;
    int ICustomTabsCallbackDefault;
    boolean ICustomTabsCallbackStub;
    int ICustomTabsCallback_Parcel;
    boolean ICustomTabsService;
    byte[] ICustomTabsServiceStub;
    int ICustomTabsServiceStubProxy;
    int access000;
    byte[] access100;
    int asBinder;
    int asInterface;
    byte[] extraCallback;
    int extraCallbackWithResult;
    boolean extraCommand;
    int getInterfaceDescriptor;
    int mayLaunchUrl;
    int newAuthTabSession;
    int newSession;
    int onActivityResized;
    int onMessageChannelReady;
    int onMinimized;
    int onPostMessage;
    int onTransact;
    int postMessage;
    int prefetch;
    int prefetchWithMultipleUrls;
    int receiveFile;
    int requestPostMessageChannelWithExtras;
    byte[] setEngagementSignalsCallback;
    int warmup;
    int updateVisuals = 0;
    final TopLayoutDislike23 onExtraCallback = new TopLayoutDislike23();
    final int[] onNavigationEvent = new int[3240];
    final int[] onWarmupCompleted = new int[3240];
    final getITopLayout onUnminimized = new getITopLayout();
    final getITopLayout ICustomTabsCallbackStubProxy = new getITopLayout();
    final getITopLayout onRelationshipValidationResult = new getITopLayout();
    final int[] onExtraCallbackWithResult = new int[3];
    final int[] requestPostMessageChannel = new int[3];
    final int[] IAuthTabCallback = new int[6];
    final int[] writeTypedObject = {16, 15, 11, 4};
    int ICustomTabsServiceDefault = 0;
    int newSessionWithExtras = 0;
    int ICustomTabsCallback = 0;
    boolean ICustomTabsService_Parcel = false;
    int isEngagementSignalsApiAvailable = 0;
    int validateRelationship = 0;
    long onActivityLayout = 0;
    byte[] readTypedObject = new byte[0];
    int IAuthTabCallbackStub = 0;

    bindIconData() {
    }

    private static int onNavigationEvent(TopLayoutDislike23 topLayoutDislike23) {
        if (TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 1) == 0) {
            return 16;
        }
        int iIAuthTabCallback = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 3);
        if (iIAuthTabCallback != 0) {
            return iIAuthTabCallback + 17;
        }
        int iIAuthTabCallback2 = TopLayoutDislike23.IAuthTabCallback(topLayoutDislike23, 3);
        if (iIAuthTabCallback2 != 0) {
            return iIAuthTabCallback2 + 8;
        }
        return 17;
    }

    static void onNavigationEvent(bindIconData bindicondata, InputStream inputStream) throws IOException {
        if (bindicondata.updateVisuals != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        TopLayoutDislike23.onWarmupCompleted(bindicondata.onExtraCallback, inputStream);
        int iOnNavigationEvent = onNavigationEvent(bindicondata.onExtraCallback);
        if (iOnNavigationEvent == 9) {
            throw new TopLayoutDislike26("Invalid 'windowBits' code");
        }
        int i = 1 << iOnNavigationEvent;
        bindicondata.newAuthTabSession = i;
        bindicondata.prefetch = i - 16;
        bindicondata.updateVisuals = 1;
    }

    static void onExtraCallbackWithResult(bindIconData bindicondata) throws IOException {
        int i = bindicondata.updateVisuals;
        if (i == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i == 11) {
            return;
        }
        bindicondata.updateVisuals = 11;
        TopLayoutDislike23.IAuthTabCallback(bindicondata.onExtraCallback);
    }
}
