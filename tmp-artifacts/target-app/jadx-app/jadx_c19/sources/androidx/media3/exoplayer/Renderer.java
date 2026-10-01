package androidx.media3.exoplayer;

import java.io.IOException;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda5;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0;
import o.SelectionContainerKtExternalSyntheticLambda0;
import o.SelectionManagerExternalSyntheticLambda12;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface Renderer extends SelectionContainerKtExternalSyntheticLambda0.onWarmupCompleted {

    public interface WakeupListener {
        void IAuthTabCallback();

        void onExtraCallbackWithResult();
    }

    void IAuthTabCallback(long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 IAuthTabCallbackDefault();

    BottomNavigationKtExternalSyntheticLambda5 IAuthTabCallback_Parcel();

    int ICustomTabsCallback();

    void ICustomTabsCallbackStub();

    default void ICustomTabsCallbackStubProxy() {
    }

    default void ICustomTabsCallback_Parcel() {
    }

    void ICustomTabsService();

    RendererCapabilities Z_();

    long access000();

    boolean extraCallback();

    String extraCommand();

    int getInterfaceDescriptor();

    void mayLaunchUrl() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    boolean newAuthTabSession();

    default void onExtraCallback(float f, float f2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    void onExtraCallback(int i2, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0);

    void onExtraCallbackWithResult(long j, long j2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    void onExtraCallbackWithResult(RendererConfiguration rendererConfiguration, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, long j, boolean z, boolean z2, long j2, long j3, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    void onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);

    void onPostMessage() throws IOException;

    void onRelationshipValidationResult();

    void onWarmupCompleted();

    void onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    boolean prefetch();

    boolean writeTypedObject();

    default long onWarmupCompleted(long j, long j2) {
        if (getInterfaceDescriptor() == 1) {
            return (newAuthTabSession() || prefetch()) ? 1000000L : 10000L;
        }
        return 10000L;
    }
}
