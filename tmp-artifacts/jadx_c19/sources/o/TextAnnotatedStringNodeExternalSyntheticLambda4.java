package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import java.io.IOException;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TextAnnotatedStringNodeExternalSyntheticLambda4 implements Renderer, RendererCapabilities {
    private int IAuthTabCallback;
    private SelectionManagerExternalSyntheticLambda12 IAuthTabCallbackDefault;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4[] IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private boolean access000;
    private BottomNavigationKtExternalSyntheticLambda5 access100;
    private RendererCapabilities.Listener asBinder;
    private int getInterfaceDescriptor;
    private long onExtraCallbackWithResult;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onNavigationEvent;
    private BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onTransact;
    private RendererConfiguration onWarmupCompleted;
    private final int writeTypedObject;
    private final Object IAuthTabCallbackStub = new Object();
    private final AndroidSelectionHandles_androidKtExternalSyntheticLambda7 onExtraCallback = new AndroidSelectionHandles_androidKtExternalSyntheticLambda7();
    private long asInterface = Long.MIN_VALUE;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 extraCallbackWithResult = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted;

    @Override // androidx.media3.exoplayer.Renderer
    public PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 IAuthTabCallbackDefault() {
        return null;
    }

    protected void ICustomTabsCallbackDefault() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities Z_() {
        return this;
    }

    public void handleMessage(int i2, @Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    public int isEngagementSignalsApiAvailable() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        return 0;
    }

    protected void onActivityResized() {
    }

    protected void onExtraCallbackWithResult(long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    public void onMessageChannelReady() {
    }

    protected void onMinimized() {
    }

    public void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    protected void onUnminimized() {
    }

    protected void onWarmupCompleted(boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
    }

    public TextAnnotatedStringNodeExternalSyntheticLambda4(int i2) {
        this.writeTypedObject = i2;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int ICustomTabsCallback() {
        return this.writeTypedObject;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void onExtraCallback(int i2, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.IAuthTabCallback = i2;
        this.IAuthTabCallbackDefault = selectionManagerExternalSyntheticLambda12;
        this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getInterfaceDescriptor() {
        return this.getInterfaceDescriptor;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void onExtraCallbackWithResult(RendererConfiguration rendererConfiguration, BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, long j, boolean z, boolean z2, long j2, long j3, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor == 0);
        this.onWarmupCompleted = rendererConfiguration;
        this.onTransact = onextracallbackwithresult;
        this.getInterfaceDescriptor = 1;
        onWarmupCompleted(z, z2);
        onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, bottomNavigationKtExternalSyntheticLambda5, j2, j3, onextracallbackwithresult);
        onNavigationEvent(j2, z);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void mayLaunchUrl() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor == 1);
        this.getInterfaceDescriptor = 2;
        ICustomTabsCallbackDefault();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.access000);
        this.access100 = bottomNavigationKtExternalSyntheticLambda5;
        this.onTransact = onextracallbackwithresult;
        if (this.asInterface == Long.MIN_VALUE) {
            this.asInterface = j;
        }
        this.IAuthTabCallbackStubProxy = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr;
        this.IAuthTabCallback_Parcel = j2;
        onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, j, j2, onextracallbackwithresult);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final BottomNavigationKtExternalSyntheticLambda5 IAuthTabCallback_Parcel() {
        return this.access100;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean extraCallback() {
        return this.asInterface == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long access000() {
        return this.asInterface;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void onRelationshipValidationResult() {
        this.access000 = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean writeTypedObject() {
        return this.access000;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void onPostMessage() throws IOException {
        ((BottomNavigationKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100)).onExtraCallbackWithResult();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        if (Objects.equals(this.extraCallbackWithResult, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10)) {
            return;
        }
        this.extraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void IAuthTabCallback(long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        onNavigationEvent(j, false);
    }

    private void onNavigationEvent(long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.access000 = false;
        this.onExtraCallbackWithResult = j;
        this.asInterface = j;
        onExtraCallbackWithResult(j, z);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void ICustomTabsService() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor == 2);
        this.getInterfaceDescriptor = 1;
        onUnminimized();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void onWarmupCompleted() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor == 1);
        this.onExtraCallback.onWarmupCompleted();
        this.getInterfaceDescriptor = 0;
        this.access100 = null;
        this.IAuthTabCallbackStubProxy = null;
        this.access000 = false;
        onMinimized();
        this.onTransact = null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void ICustomTabsCallbackStub() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor == 0);
        this.onExtraCallback.onWarmupCompleted();
        onActivityResized();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void ICustomTabsCallbackStubProxy() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor == 0);
        onMessageChannelReady();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void onNavigationEvent(RendererCapabilities.Listener listener) {
        synchronized (this.IAuthTabCallbackStub) {
            this.asBinder = listener;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void Y_() {
        synchronized (this.IAuthTabCallbackStub) {
            this.asBinder = null;
        }
    }

    public final long IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult;
    }

    public final long IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallback_Parcel;
    }

    public final AndroidSelectionHandles_androidKtExternalSyntheticLambda7 onTransact() {
        this.onExtraCallback.onWarmupCompleted();
        return this.onExtraCallback;
    }

    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4[] access100() {
        return (BasicTextContextMenuProviderKtExternalSyntheticLambda4[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy);
    }

    public final RendererConfiguration aa_() {
        return (RendererConfiguration) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted);
    }

    protected final int asInterface() {
        return this.IAuthTabCallback;
    }

    public final SelectionManagerExternalSyntheticLambda12 asBinder() {
        return (SelectionManagerExternalSyntheticLambda12) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
    }

    public final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onExtraCallback() {
        return (TextFieldDecoratorModifierNodeExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent);
    }

    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 extraCallbackWithResult() {
        return this.extraCallbackWithResult;
    }

    public final AndroidSelectionHandles_androidKtExternalSyntheticLambda4 onExtraCallbackWithResult(Throwable th, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2) {
        return onExtraCallback(th, basicTextContextMenuProviderKtExternalSyntheticLambda4, false, i2);
    }

    public final AndroidSelectionHandles_androidKtExternalSyntheticLambda4 onExtraCallback(Throwable th, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, int i2) {
        int iOnExtraCallbackWithResult;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null || this.ICustomTabsCallback) {
            iOnExtraCallbackWithResult = 4;
        } else {
            this.ICustomTabsCallback = true;
            try {
                iOnExtraCallbackWithResult = RendererCapabilities.onExtraCallbackWithResult(onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4));
            } catch (AndroidSelectionHandles_androidKtExternalSyntheticLambda4 unused) {
            } finally {
                this.ICustomTabsCallback = false;
            }
        }
        return AndroidSelectionHandles_androidKtExternalSyntheticLambda4.IAuthTabCallback(th, extraCommand(), asInterface(), basicTextContextMenuProviderKtExternalSyntheticLambda4, iOnExtraCallbackWithResult, this.onTransact, z, i2);
    }

    public final int onExtraCallback(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2) {
        int iOnNavigationEvent = ((BottomNavigationKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100)).onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, i2);
        if (iOnNavigationEvent != -4) {
            if (iOnNavigationEvent == -5) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted);
                if (basicTextContextMenuProviderKtExternalSyntheticLambda4.newSession != Long.MAX_VALUE) {
                    androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.newSession + this.IAuthTabCallback_Parcel).onNavigationEvent();
                }
            }
            return iOnNavigationEvent;
        }
        if (selectionControllerExternalSyntheticLambda2.IAuthTabCallback()) {
            this.asInterface = Long.MIN_VALUE;
            return this.access000 ? -4 : -3;
        }
        long j = selectionControllerExternalSyntheticLambda2.onWarmupCompleted + this.IAuthTabCallback_Parcel;
        selectionControllerExternalSyntheticLambda2.onWarmupCompleted = j;
        this.asInterface = Math.max(this.asInterface, j);
        return iOnNavigationEvent;
    }

    public int onExtraCallback(long j) {
        return ((BottomNavigationKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100)).onExtraCallbackWithResult(j - this.IAuthTabCallback_Parcel);
    }

    public final boolean readTypedObject() {
        return extraCallback() ? this.access000 : ((BottomNavigationKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100)).onWarmupCompleted();
    }

    public final void onActivityLayout() {
        RendererCapabilities.Listener listener;
        synchronized (this.IAuthTabCallbackStub) {
            listener = this.asBinder;
        }
        if (listener != null) {
            listener.onExtraCallback(this);
        }
    }
}
