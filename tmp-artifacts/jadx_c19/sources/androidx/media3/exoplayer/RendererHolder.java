package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda1;
import o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4;
import o.BackdropScaffoldKtExternalSyntheticLambda12;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomNavigationKtExternalSyntheticLambda5;
import o.ChipKtExternalSyntheticLambda1;
import o.ColorsKtExternalSyntheticLambda0;
import o.ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.DrawerKtExternalSyntheticLambda0;
import o.RecordingInputConnection_androidKt;
import o.SelectionAdjustmentKtExternalSyntheticLambda1;
import o.SelectionContainerKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RendererHolder {
    private final int onExtraCallback;
    private final Renderer onNavigationEvent;
    private final Renderer onWarmupCompleted;
    private int onExtraCallbackWithResult = 0;
    private boolean IAuthTabCallback = false;
    private boolean asBinder = false;

    public RendererHolder(Renderer renderer, @Nullable Renderer renderer2, int i2) {
        this.onNavigationEvent = renderer;
        this.onExtraCallback = i2;
        this.onWarmupCompleted = renderer2;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted != null;
    }

    public void access100() {
        int i2;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!asBinder());
        if (onWarmupCompleted(this.onNavigationEvent)) {
            i2 = 3;
        } else {
            Renderer renderer = this.onWarmupCompleted;
            i2 = (renderer == null || !onWarmupCompleted(renderer)) ? 2 : 4;
        }
        this.onExtraCallbackWithResult = i2;
    }

    public boolean asBinder() {
        return getInterfaceDescriptor() || IAuthTabCallbackStubProxy();
    }

    private boolean getInterfaceDescriptor() {
        int i2 = this.onExtraCallbackWithResult;
        return i2 == 2 || i2 == 4;
    }

    private boolean IAuthTabCallbackStubProxy() {
        return this.onExtraCallbackWithResult == 3;
    }

    public int onExtraCallback() {
        boolean zOnWarmupCompleted = onWarmupCompleted(this.onNavigationEvent);
        Renderer renderer = this.onWarmupCompleted;
        return (zOnWarmupCompleted ? 1 : 0) + ((renderer == null || !onWarmupCompleted(renderer)) ? 0 : 1);
    }

    public int onWarmupCompleted() {
        return this.onNavigationEvent.ICustomTabsCallback();
    }

    public long onExtraCallbackWithResult(@Nullable SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        Renderer rendererOnTransact = onTransact(selectionAdjustmentKtExternalSyntheticLambda1);
        Objects.requireNonNull(rendererOnTransact);
        return rendererOnTransact.access000();
    }

    public boolean onExtraCallback(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        return ((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onTransact(selectionAdjustmentKtExternalSyntheticLambda1))).extraCallback();
    }

    public void IAuthTabCallback(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, long j) {
        IAuthTabCallback((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onTransact(selectionAdjustmentKtExternalSyntheticLambda1)), j);
    }

    public void onExtraCallback(ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02, long j) {
        int i2;
        boolean zOnNavigationEvent = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent(this.onExtraCallback);
        boolean zOnNavigationEvent2 = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02.onNavigationEvent(this.onExtraCallback);
        Renderer renderer = (this.onWarmupCompleted == null || (i2 = this.onExtraCallbackWithResult) == 3 || (i2 == 0 && onWarmupCompleted(this.onNavigationEvent))) ? this.onNavigationEvent : (Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted);
        if (!zOnNavigationEvent || renderer.writeTypedObject()) {
            return;
        }
        boolean z = onWarmupCompleted() == -2;
        RendererConfiguration[] rendererConfigurationArr = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onWarmupCompleted;
        int i3 = this.onExtraCallback;
        RendererConfiguration rendererConfiguration = rendererConfigurationArr[i3];
        RendererConfiguration rendererConfiguration2 = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda02.onWarmupCompleted[i3];
        if (!zOnNavigationEvent2 || !Objects.equals(rendererConfiguration2, rendererConfiguration) || z || asBinder()) {
            IAuthTabCallback(renderer, j);
        }
    }

    public void onExtraCallback(long j) {
        int i2;
        if (onWarmupCompleted(this.onNavigationEvent) && (i2 = this.onExtraCallbackWithResult) != 4 && i2 != 2) {
            IAuthTabCallback(this.onNavigationEvent, j);
        }
        Renderer renderer = this.onWarmupCompleted;
        if (renderer == null || !onWarmupCompleted(renderer) || this.onExtraCallbackWithResult == 3) {
            return;
        }
        IAuthTabCallback(this.onWarmupCompleted, j);
    }

    private void IAuthTabCallback(Renderer renderer, long j) {
        renderer.onRelationshipValidationResult();
        if (renderer instanceof ChipKtExternalSyntheticLambda1) {
            ((ChipKtExternalSyntheticLambda1) renderer).onWarmupCompleted(j);
        }
    }

    public long IAuthTabCallback(long j, long j2) {
        long jOnWarmupCompleted = onWarmupCompleted(this.onNavigationEvent) ? this.onNavigationEvent.onWarmupCompleted(j, j2) : Long.MAX_VALUE;
        Renderer renderer = this.onWarmupCompleted;
        return (renderer == null || !onWarmupCompleted(renderer)) ? jOnWarmupCompleted : Math.min(jOnWarmupCompleted, this.onWarmupCompleted.onWarmupCompleted(j, j2));
    }

    public void IAuthTabCallback() {
        if (onWarmupCompleted(this.onNavigationEvent)) {
            this.onNavigationEvent.ICustomTabsCallback_Parcel();
            return;
        }
        Renderer renderer = this.onWarmupCompleted;
        if (renderer == null || !onWarmupCompleted(renderer)) {
            return;
        }
        this.onWarmupCompleted.ICustomTabsCallback_Parcel();
    }

    public void onExtraCallback(float f, float f2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.onNavigationEvent.onExtraCallback(f, f2);
        Renderer renderer = this.onWarmupCompleted;
        if (renderer != null) {
            renderer.onExtraCallback(f, f2);
        }
    }

    public void onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        this.onNavigationEvent.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        Renderer renderer = this.onWarmupCompleted;
        if (renderer != null) {
            renderer.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        }
    }

    public boolean onNavigationEvent() {
        boolean zPrefetch = onWarmupCompleted(this.onNavigationEvent) ? this.onNavigationEvent.prefetch() : true;
        Renderer renderer = this.onWarmupCompleted;
        return (renderer == null || !onWarmupCompleted(renderer)) ? zPrefetch : zPrefetch & this.onWarmupCompleted.prefetch();
    }

    public boolean asInterface(@Nullable SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        return onTransact(selectionAdjustmentKtExternalSyntheticLambda1) != null;
    }

    public boolean IAuthTabCallback(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        return (getInterfaceDescriptor() && onTransact(selectionAdjustmentKtExternalSyntheticLambda1) == this.onNavigationEvent) || (IAuthTabCallbackStubProxy() && onTransact(selectionAdjustmentKtExternalSyntheticLambda1) == this.onWarmupCompleted);
    }

    public boolean onWarmupCompleted(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        return onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1, this.onNavigationEvent) && onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1, this.onWarmupCompleted);
    }

    private boolean onExtraCallbackWithResult(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, @Nullable Renderer renderer) {
        if (renderer == null) {
            return true;
        }
        BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 = selectionAdjustmentKtExternalSyntheticLambda1.asBinder[this.onExtraCallback];
        if (renderer.IAuthTabCallback_Parcel() == null || (renderer.IAuthTabCallback_Parcel() == bottomNavigationKtExternalSyntheticLambda5 && (bottomNavigationKtExternalSyntheticLambda5 == null || renderer.extraCallback() || IAuthTabCallback(renderer, selectionAdjustmentKtExternalSyntheticLambda1)))) {
            return true;
        }
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallbackWithResult();
        return selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asBinder[this.onExtraCallback] == renderer.IAuthTabCallback_Parcel();
    }

    private boolean IAuthTabCallback(Renderer renderer, SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult = selectionAdjustmentKtExternalSyntheticLambda1.onExtraCallbackWithResult();
        if (selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult != null && selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.asInterface) {
            return (renderer instanceof ChipKtExternalSyntheticLambda1) || (renderer instanceof BackdropScaffoldKtExternalSyntheticLambda12) || renderer.access000() >= selectionAdjustmentKtExternalSyntheticLambda1OnExtraCallbackWithResult.onNavigationEvent();
        }
        return false;
    }

    public void onExtraCallbackWithResult(long j, long j2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (onWarmupCompleted(this.onNavigationEvent)) {
            this.onNavigationEvent.onExtraCallbackWithResult(j, j2);
        }
        Renderer renderer = this.onWarmupCompleted;
        if (renderer == null || !onWarmupCompleted(renderer)) {
            return;
        }
        this.onWarmupCompleted.onExtraCallbackWithResult(j, j2);
    }

    public boolean onNavigationEvent(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        Renderer rendererOnTransact = onTransact(selectionAdjustmentKtExternalSyntheticLambda1);
        return rendererOnTransact == null || rendererOnTransact.extraCallback() || rendererOnTransact.newAuthTabSession() || rendererOnTransact.prefetch();
    }

    public void IAuthTabCallbackStub(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) throws IOException {
        ((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onTransact(selectionAdjustmentKtExternalSyntheticLambda1))).onPostMessage();
    }

    public void access000() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.onNavigationEvent.getInterfaceDescriptor() == 1 && this.onExtraCallbackWithResult != 4) {
            this.onNavigationEvent.mayLaunchUrl();
            return;
        }
        Renderer renderer = this.onWarmupCompleted;
        if (renderer == null || renderer.getInterfaceDescriptor() != 1 || this.onExtraCallbackWithResult == 3) {
            return;
        }
        this.onWarmupCompleted.mayLaunchUrl();
    }

    public void IAuthTabCallback_Parcel() {
        if (onWarmupCompleted(this.onNavigationEvent)) {
            onExtraCallbackWithResult(this.onNavigationEvent);
        }
        Renderer renderer = this.onWarmupCompleted;
        if (renderer == null || !onWarmupCompleted(renderer)) {
            return;
        }
        onExtraCallbackWithResult(this.onWarmupCompleted);
    }

    private void onExtraCallbackWithResult(Renderer renderer) {
        if (renderer.getInterfaceDescriptor() == 2) {
            renderer.ICustomTabsService();
        }
    }

    public void onNavigationEvent(RendererConfiguration rendererConfiguration, ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0, BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, long j, boolean z, boolean z2, long j2, long j3, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4ArrOnExtraCallback = onExtraCallback(colorsKtExternalSyntheticLambda0);
        int i2 = this.onExtraCallbackWithResult;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.IAuthTabCallback = true;
            this.onNavigationEvent.onExtraCallbackWithResult(rendererConfiguration, basicTextContextMenuProviderKtExternalSyntheticLambda4ArrOnExtraCallback, bottomNavigationKtExternalSyntheticLambda5, j, z, z2, j2, j3, onextracallbackwithresult);
            androidSelectionHandles_androidKtExternalSyntheticLambda1.onExtraCallback(this.onNavigationEvent);
        } else {
            this.asBinder = true;
            ((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).onExtraCallbackWithResult(rendererConfiguration, basicTextContextMenuProviderKtExternalSyntheticLambda4ArrOnExtraCallback, bottomNavigationKtExternalSyntheticLambda5, j, z, z2, j2, j3, onextracallbackwithresult);
            androidSelectionHandles_androidKtExternalSyntheticLambda1.onExtraCallback(this.onWarmupCompleted);
        }
    }

    public void onWarmupCompleted(int i2, @Nullable Object obj, SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        ((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onTransact(selectionAdjustmentKtExternalSyntheticLambda1))).handleMessage(i2, obj);
    }

    public void IAuthTabCallback(@Nullable SelectionContainerKtExternalSyntheticLambda3 selectionContainerKtExternalSyntheticLambda3) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.onNavigationEvent.handleMessage(18, selectionContainerKtExternalSyntheticLambda3);
        Renderer renderer = this.onWarmupCompleted;
        if (renderer != null) {
            renderer.handleMessage(18, selectionContainerKtExternalSyntheticLambda3);
        }
    }

    public void IAuthTabCallback(AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        IAuthTabCallback(this.onNavigationEvent, androidSelectionHandles_androidKtExternalSyntheticLambda1);
        Renderer renderer = this.onWarmupCompleted;
        if (renderer != null) {
            boolean z = onWarmupCompleted(renderer) && this.onExtraCallbackWithResult != 3;
            IAuthTabCallback(this.onWarmupCompleted, androidSelectionHandles_androidKtExternalSyntheticLambda1);
            IAuthTabCallback(false);
            if (z) {
                onExtraCallback(true);
            }
        }
        this.onExtraCallbackWithResult = 0;
    }

    public void asInterface() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int i2 = this.onExtraCallbackWithResult;
        if (i2 == 3 || i2 == 4) {
            onExtraCallback(i2 == 4);
            this.onExtraCallbackWithResult = this.onExtraCallbackWithResult != 4 ? 1 : 0;
        } else if (i2 == 2) {
            this.onExtraCallbackWithResult = 0;
        }
    }

    private void onExtraCallback(boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (z) {
            ((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).handleMessage(17, this.onNavigationEvent);
        } else {
            this.onNavigationEvent.handleMessage(17, RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted));
        }
    }

    public void onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1) {
        if (asBinder()) {
            int i2 = this.onExtraCallbackWithResult;
            boolean z = i2 == 4 || i2 == 2;
            int i3 = i2 == 4 ? 1 : 0;
            IAuthTabCallback(z ? this.onNavigationEvent : (Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted), androidSelectionHandles_androidKtExternalSyntheticLambda1);
            IAuthTabCallback(z);
            this.onExtraCallbackWithResult = i3;
        }
    }

    public void IAuthTabCallback(BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1, long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        IAuthTabCallback(this.onNavigationEvent, bottomNavigationKtExternalSyntheticLambda5, androidSelectionHandles_androidKtExternalSyntheticLambda1, j, z);
        Renderer renderer = this.onWarmupCompleted;
        if (renderer != null) {
            IAuthTabCallback(renderer, bottomNavigationKtExternalSyntheticLambda5, androidSelectionHandles_androidKtExternalSyntheticLambda1, j, z);
        }
    }

    private void IAuthTabCallback(Renderer renderer, BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1, long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (onWarmupCompleted(renderer)) {
            if (bottomNavigationKtExternalSyntheticLambda5 != renderer.IAuthTabCallback_Parcel()) {
                IAuthTabCallback(renderer, androidSelectionHandles_androidKtExternalSyntheticLambda1);
            } else if (z) {
                renderer.IAuthTabCallback(j);
            }
        }
    }

    private void IAuthTabCallback(Renderer renderer, AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent == renderer || this.onWarmupCompleted == renderer);
        if (onWarmupCompleted(renderer)) {
            androidSelectionHandles_androidKtExternalSyntheticLambda1.IAuthTabCallback(renderer);
            onExtraCallbackWithResult(renderer);
            renderer.onWarmupCompleted();
        }
    }

    public void onExtraCallback(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, long j) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        Renderer rendererOnTransact = onTransact(selectionAdjustmentKtExternalSyntheticLambda1);
        if (rendererOnTransact != null) {
            rendererOnTransact.IAuthTabCallback(j);
        }
    }

    public void onTransact() {
        if (!onWarmupCompleted(this.onNavigationEvent)) {
            IAuthTabCallback(true);
        }
        Renderer renderer = this.onWarmupCompleted;
        if (renderer == null || onWarmupCompleted(renderer)) {
            return;
        }
        IAuthTabCallback(false);
    }

    private void IAuthTabCallback(boolean z) {
        if (z) {
            if (this.IAuthTabCallback) {
                this.onNavigationEvent.ICustomTabsCallbackStub();
                this.IAuthTabCallback = false;
                return;
            }
            return;
        }
        if (this.asBinder) {
            ((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).ICustomTabsCallbackStub();
            this.asBinder = false;
        }
    }

    public int onNavigationEvent(SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        int iOnExtraCallback = onExtraCallback(this.onNavigationEvent, selectionAdjustmentKtExternalSyntheticLambda1, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, androidSelectionHandles_androidKtExternalSyntheticLambda1);
        return iOnExtraCallback == 1 ? onExtraCallback(this.onWarmupCompleted, selectionAdjustmentKtExternalSyntheticLambda1, composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, androidSelectionHandles_androidKtExternalSyntheticLambda1) : iOnExtraCallback;
    }

    private int onExtraCallback(@Nullable Renderer renderer, SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1, ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, AndroidSelectionHandles_androidKtExternalSyntheticLambda1 androidSelectionHandles_androidKtExternalSyntheticLambda1) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (renderer == null || !onWarmupCompleted(renderer) || ((renderer == this.onNavigationEvent && getInterfaceDescriptor()) || (renderer == this.onWarmupCompleted && IAuthTabCallbackStubProxy()))) {
            return 1;
        }
        BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5IAuthTabCallback_Parcel = renderer.IAuthTabCallback_Parcel();
        BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr = selectionAdjustmentKtExternalSyntheticLambda1.asBinder;
        int i2 = this.onExtraCallback;
        boolean z = bottomNavigationKtExternalSyntheticLambda5IAuthTabCallback_Parcel != bottomNavigationKtExternalSyntheticLambda5Arr[i2];
        boolean zOnNavigationEvent = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent(i2);
        if (zOnNavigationEvent && !z) {
            return 1;
        }
        if (!renderer.writeTypedObject()) {
            renderer.onWarmupCompleted(onExtraCallback(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult[this.onExtraCallback]), (BottomNavigationKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionAdjustmentKtExternalSyntheticLambda1.asBinder[this.onExtraCallback]), selectionAdjustmentKtExternalSyntheticLambda1.onNavigationEvent(), selectionAdjustmentKtExternalSyntheticLambda1.IAuthTabCallback(), selectionAdjustmentKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback);
            return 3;
        }
        if (!renderer.prefetch()) {
            return 0;
        }
        IAuthTabCallback(renderer, androidSelectionHandles_androidKtExternalSyntheticLambda1);
        if (!zOnNavigationEvent || asBinder()) {
            IAuthTabCallback(renderer == this.onNavigationEvent);
        }
        return 1;
    }

    private static BasicTextContextMenuProviderKtExternalSyntheticLambda4[] onExtraCallback(@Nullable ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0) {
        int iAccess100 = colorsKtExternalSyntheticLambda0 != null ? colorsKtExternalSyntheticLambda0.access100() : 0;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[iAccess100];
        for (int i2 = 0; i2 < iAccess100; i2++) {
            basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i2] = ((ColorsKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(colorsKtExternalSyntheticLambda0)).onNavigationEvent(i2);
        }
        return basicTextContextMenuProviderKtExternalSyntheticLambda4Arr;
    }

    public void IAuthTabCallbackStub() {
        this.onNavigationEvent.ICustomTabsCallbackStubProxy();
        this.IAuthTabCallback = false;
        Renderer renderer = this.onWarmupCompleted;
        if (renderer != null) {
            renderer.ICustomTabsCallbackStubProxy();
            this.asBinder = false;
        }
    }

    public void onNavigationEvent(@Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (onWarmupCompleted() != 2) {
            return;
        }
        int i2 = this.onExtraCallbackWithResult;
        if (i2 == 4 || i2 == 1) {
            ((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted)).handleMessage(1, obj);
        } else {
            this.onNavigationEvent.handleMessage(1, obj);
        }
    }

    public void onWarmupCompleted(DrawerKtExternalSyntheticLambda0 drawerKtExternalSyntheticLambda0) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (onWarmupCompleted() == 2) {
            this.onNavigationEvent.handleMessage(7, drawerKtExternalSyntheticLambda0);
            Renderer renderer = this.onWarmupCompleted;
            if (renderer != null) {
                renderer.handleMessage(7, drawerKtExternalSyntheticLambda0);
            }
        }
    }

    public void onWarmupCompleted(float f) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (onWarmupCompleted() == 1) {
            this.onNavigationEvent.handleMessage(2, Float.valueOf(f));
            Renderer renderer = this.onWarmupCompleted;
            if (renderer != null) {
                renderer.handleMessage(2, Float.valueOf(f));
            }
        }
    }

    public boolean IAuthTabCallbackDefault() {
        int i2 = this.onExtraCallbackWithResult;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            return onWarmupCompleted(this.onNavigationEvent);
        }
        return onWarmupCompleted((Renderer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted));
    }

    private static boolean onWarmupCompleted(Renderer renderer) {
        return renderer.getInterfaceDescriptor() != 0;
    }

    private Renderer onTransact(@Nullable SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        if (selectionAdjustmentKtExternalSyntheticLambda1 == null || selectionAdjustmentKtExternalSyntheticLambda1.asBinder[this.onExtraCallback] == null) {
            return null;
        }
        if (this.onNavigationEvent.IAuthTabCallback_Parcel() == selectionAdjustmentKtExternalSyntheticLambda1.asBinder[this.onExtraCallback]) {
            return this.onNavigationEvent;
        }
        Renderer renderer = this.onWarmupCompleted;
        if (renderer == null || renderer.IAuthTabCallback_Parcel() != selectionAdjustmentKtExternalSyntheticLambda1.asBinder[this.onExtraCallback]) {
            return null;
        }
        return this.onWarmupCompleted;
    }
}
