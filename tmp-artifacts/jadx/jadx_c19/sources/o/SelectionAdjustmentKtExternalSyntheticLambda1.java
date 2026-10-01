package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import java.io.IOException;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionAdjustmentKtExternalSyntheticLambda1 {
    public boolean IAuthTabCallback;
    public final long IAuthTabCallbackDefault;
    public final Object IAuthTabCallbackStub;
    private final RendererCapabilities[] IAuthTabCallbackStubProxy;
    private SelectionAdjustmentKtExternalSyntheticLambda1 IAuthTabCallback_Parcel;
    private final ComposableSingletonsAppBarKtExternalSyntheticLambda0 ICustomTabsCallback;
    private BottomSheetScaffoldKtExternalSyntheticLambda11 access000;
    private final SelectionContainerKtExternalSyntheticLambda10 access100;
    public final BottomNavigationKtExternalSyntheticLambda5[] asBinder;
    public boolean asInterface;
    private ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 extraCallback;
    private long getInterfaceDescriptor;
    public boolean onExtraCallback;
    public boolean onExtraCallbackWithResult;
    public final BottomDrawerStateCompanionExternalSyntheticLambda1 onNavigationEvent;
    private final boolean[] onTransact;
    public SelectionAdjustmentCompanionExternalSyntheticLambda4 onWarmupCompleted;

    public interface IAuthTabCallback {
        SelectionAdjustmentKtExternalSyntheticLambda1 create(SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4, long j);
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1(RendererCapabilities[] rendererCapabilitiesArr, long j, ComposableSingletonsAppBarKtExternalSyntheticLambda0 composableSingletonsAppBarKtExternalSyntheticLambda0, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, SelectionContainerKtExternalSyntheticLambda10 selectionContainerKtExternalSyntheticLambda10, SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4, ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, long j2) {
        this.IAuthTabCallbackStubProxy = rendererCapabilitiesArr;
        this.getInterfaceDescriptor = j;
        this.ICustomTabsCallback = composableSingletonsAppBarKtExternalSyntheticLambda0;
        this.access100 = selectionContainerKtExternalSyntheticLambda10;
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback;
        this.IAuthTabCallbackStub = onextracallbackwithresult.onExtraCallback;
        this.onWarmupCompleted = selectionAdjustmentCompanionExternalSyntheticLambda4;
        this.IAuthTabCallbackDefault = j2;
        this.access000 = BottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback;
        this.extraCallback = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0;
        this.asBinder = new BottomNavigationKtExternalSyntheticLambda5[rendererCapabilitiesArr.length];
        this.onTransact = new boolean[rendererCapabilitiesArr.length];
        this.onNavigationEvent = IAuthTabCallback(onextracallbackwithresult, selectionContainerKtExternalSyntheticLambda10, composableSingletonsScaffoldKtExternalSyntheticLambda3, selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact, selectionAdjustmentCompanionExternalSyntheticLambda4.onWarmupCompleted, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackDefault);
    }

    public long onExtraCallback(long j) {
        return j + IAuthTabCallback();
    }

    public long onWarmupCompleted(long j) {
        return j - IAuthTabCallback();
    }

    public long IAuthTabCallback() {
        return this.getInterfaceDescriptor;
    }

    public void onNavigationEvent(long j) {
        this.getInterfaceDescriptor = j;
    }

    public long onNavigationEvent() {
        return this.onWarmupCompleted.onTransact + this.getInterfaceDescriptor;
    }

    public boolean asInterface() {
        if (this.asInterface) {
            return !this.onExtraCallbackWithResult || this.onNavigationEvent.onWarmupCompleted() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean IAuthTabCallbackDefault() {
        if (this.asInterface) {
            return asInterface() || onExtraCallback() - this.onWarmupCompleted.onTransact >= this.IAuthTabCallbackDefault;
        }
        return false;
    }

    public long onExtraCallback() {
        if (!this.asInterface) {
            return this.onWarmupCompleted.onTransact;
        }
        long jOnWarmupCompleted = this.onExtraCallbackWithResult ? this.onNavigationEvent.onWarmupCompleted() : Long.MIN_VALUE;
        return jOnWarmupCompleted == Long.MIN_VALUE ? this.onWarmupCompleted.IAuthTabCallback : jOnWarmupCompleted;
    }

    public long onWarmupCompleted() {
        if (this.asInterface) {
            return this.onNavigationEvent.onExtraCallback();
        }
        return 0L;
    }

    public void IAuthTabCallback(float f, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.asInterface = true;
        this.access000 = this.onNavigationEvent.ab_();
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnExtraCallback = onExtraCallback(f, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, z);
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = this.onWarmupCompleted;
        long jMax = selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact;
        long j = selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jIAuthTabCallback = IAuthTabCallback(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnExtraCallback, jMax, false);
        long j2 = this.getInterfaceDescriptor;
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda42 = this.onWarmupCompleted;
        this.getInterfaceDescriptor = j2 + (selectionAdjustmentCompanionExternalSyntheticLambda42.onTransact - jIAuthTabCallback);
        this.onWarmupCompleted = selectionAdjustmentCompanionExternalSyntheticLambda42.onExtraCallbackWithResult(jIAuthTabCallback);
    }

    public void onExtraCallbackWithResult(long j) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(access100());
        if (this.asInterface) {
            this.onNavigationEvent.IAuthTabCallback(onWarmupCompleted(j));
        }
    }

    public void onExtraCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(access100());
        this.onNavigationEvent.IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1);
    }

    public ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 onExtraCallback(float f, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnNavigationEvent = this.ICustomTabsCallback.onNavigationEvent(this.IAuthTabCallbackStubProxy, asBinder(), this.onWarmupCompleted.onExtraCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        for (int i2 = 0; i2 < composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent; i2++) {
            if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent(i2)) {
                if (composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult[i2] == null && this.IAuthTabCallbackStubProxy[i2].ICustomTabsCallback() != -2) {
                    z = false;
                }
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(z);
            } else {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult[i2] == null);
            }
        }
        for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult) {
            if (colorsKtExternalSyntheticLambda0 != null) {
                colorsKtExternalSyntheticLambda0.onExtraCallback(f);
                colorsKtExternalSyntheticLambda0.onWarmupCompleted(z);
            }
        }
        return composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0OnNavigationEvent;
    }

    public long IAuthTabCallback(ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, long j, boolean z) {
        return onNavigationEvent(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, j, z, new boolean[this.IAuthTabCallbackStubProxy.length]);
    }

    public long onNavigationEvent(ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0, long j, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent) {
                break;
            }
            boolean[] zArr2 = this.onTransact;
            if (z || !composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onWarmupCompleted(this.extraCallback, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        IAuthTabCallback(this.asBinder);
        IAuthTabCallback_Parcel();
        this.extraCallback = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0;
        getInterfaceDescriptor();
        long jIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult, this.onTransact, this.asBinder, zArr, j);
        onNavigationEvent(this.asBinder);
        this.onExtraCallbackWithResult = false;
        int i3 = 0;
        while (true) {
            BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr = this.asBinder;
            if (i3 >= bottomNavigationKtExternalSyntheticLambda5Arr.length) {
                return jIAuthTabCallback;
            }
            if (bottomNavigationKtExternalSyntheticLambda5Arr[i3] != null) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent(i3));
                if (this.IAuthTabCallbackStubProxy[i3].ICustomTabsCallback() != -2) {
                    this.onExtraCallbackWithResult = true;
                }
            } else {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult[i3] == null);
            }
            i3++;
        }
    }

    public void access000() {
        IAuthTabCallback_Parcel();
        IAuthTabCallback(this.access100, this.onNavigationEvent);
    }

    public void onExtraCallback(@Nullable SelectionAdjustmentKtExternalSyntheticLambda1 selectionAdjustmentKtExternalSyntheticLambda1) {
        if (selectionAdjustmentKtExternalSyntheticLambda1 == this.IAuthTabCallback_Parcel) {
            return;
        }
        IAuthTabCallback_Parcel();
        this.IAuthTabCallback_Parcel = selectionAdjustmentKtExternalSyntheticLambda1;
        getInterfaceDescriptor();
    }

    public SelectionAdjustmentKtExternalSyntheticLambda1 onExtraCallbackWithResult() {
        return this.IAuthTabCallback_Parcel;
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 asBinder() {
        return this.access000;
    }

    public ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 onTransact() {
        return this.extraCallback;
    }

    public void IAuthTabCallbackStubProxy() {
        BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1 = this.onNavigationEvent;
        if (bottomDrawerStateCompanionExternalSyntheticLambda1 instanceof BackdropScaffoldKtExternalSyntheticLambda25) {
            long j = this.onWarmupCompleted.onWarmupCompleted;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((BackdropScaffoldKtExternalSyntheticLambda25) bottomDrawerStateCompanionExternalSyntheticLambda1).onExtraCallbackWithResult(0L, j);
        }
    }

    public boolean IAuthTabCallbackStub() {
        try {
            if (!this.asInterface) {
                this.onNavigationEvent.onNavigationEvent();
            } else {
                for (BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 : this.asBinder) {
                    if (bottomNavigationKtExternalSyntheticLambda5 != null) {
                        bottomNavigationKtExternalSyntheticLambda5.onExtraCallbackWithResult();
                    }
                }
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    private void getInterfaceDescriptor() {
        if (!access100()) {
            return;
        }
        int i2 = 0;
        while (true) {
            ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = this.extraCallback;
            if (i2 >= composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent) {
                return;
            }
            boolean zOnNavigationEvent = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent(i2);
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = this.extraCallback.onExtraCallbackWithResult[i2];
            if (zOnNavigationEvent && colorsKtExternalSyntheticLambda0 != null) {
                colorsKtExternalSyntheticLambda0.onTransact();
            }
            i2++;
        }
    }

    private void IAuthTabCallback_Parcel() {
        if (!access100()) {
            return;
        }
        int i2 = 0;
        while (true) {
            ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 = this.extraCallback;
            if (i2 >= composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent) {
                return;
            }
            boolean zOnNavigationEvent = composableSingletonsBackdropScaffoldKtExternalSyntheticLambda0.onNavigationEvent(i2);
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = this.extraCallback.onExtraCallbackWithResult[i2];
            if (zOnNavigationEvent && colorsKtExternalSyntheticLambda0 != null) {
                colorsKtExternalSyntheticLambda0.asInterface();
            }
            i2++;
        }
    }

    private void IAuthTabCallback(BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr) {
        int i2 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.IAuthTabCallbackStubProxy;
            if (i2 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i2].ICustomTabsCallback() == -2) {
                bottomNavigationKtExternalSyntheticLambda5Arr[i2] = null;
            }
            i2++;
        }
    }

    private void onNavigationEvent(BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr) {
        int i2 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.IAuthTabCallbackStubProxy;
            if (i2 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i2].ICustomTabsCallback() == -2 && this.extraCallback.onNavigationEvent(i2)) {
                bottomNavigationKtExternalSyntheticLambda5Arr[i2] = new BackdropScaffoldKtScrimdismissModifier11ExternalSyntheticLambda0();
            }
            i2++;
        }
    }

    private boolean access100() {
        return this.IAuthTabCallback_Parcel == null;
    }

    private static BottomDrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, SelectionContainerKtExternalSyntheticLambda10 selectionContainerKtExternalSyntheticLambda10, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j, long j2, boolean z) {
        BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1OnNavigationEvent = selectionContainerKtExternalSyntheticLambda10.onNavigationEvent(onextracallbackwithresult, composableSingletonsScaffoldKtExternalSyntheticLambda3, j);
        return j2 != -9223372036854775807L ? new BackdropScaffoldKtExternalSyntheticLambda25(bottomDrawerStateCompanionExternalSyntheticLambda1OnNavigationEvent, !z, 0L, j2) : bottomDrawerStateCompanionExternalSyntheticLambda1OnNavigationEvent;
    }

    private static void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda10 selectionContainerKtExternalSyntheticLambda10, BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        try {
            if (bottomDrawerStateCompanionExternalSyntheticLambda1 instanceof BackdropScaffoldKtExternalSyntheticLambda25) {
                selectionContainerKtExternalSyntheticLambda10.onExtraCallbackWithResult(((BackdropScaffoldKtExternalSyntheticLambda25) bottomDrawerStateCompanionExternalSyntheticLambda1).onWarmupCompleted);
            } else {
                selectionContainerKtExternalSyntheticLambda10.onExtraCallbackWithResult(bottomDrawerStateCompanionExternalSyntheticLambda1);
            }
        } catch (RuntimeException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public boolean onNavigationEvent(SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4) {
        if (!SelectionAdjustmentCompanionExternalSyntheticLambda3.onWarmupCompleted(this.onWarmupCompleted.IAuthTabCallback, selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback)) {
            return false;
        }
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda42 = this.onWarmupCompleted;
        return selectionAdjustmentCompanionExternalSyntheticLambda42.onTransact == selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact && selectionAdjustmentCompanionExternalSyntheticLambda42.onExtraCallback.equals(selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback);
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        this.onExtraCallback = true;
        this.onNavigationEvent.onExtraCallback(bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, j);
    }
}
