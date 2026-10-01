package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.DrmSession;
import java.io.IOException;
import java.util.Objects;
import o.BottomNavigationKtExternalSyntheticLambda3;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;
import o.SelectionRegistrarImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class BottomNavigationKtExternalSyntheticLambda3 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda5 {
    private DrmSession IAuthTabCallback;
    private final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted IAuthTabCallbackDefault;
    private final BottomNavigationKtExternalSyntheticLambda2 ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 ICustomTabsCallbackStub;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 ICustomTabsCallbackStubProxy;
    private long ICustomTabsCallback_Parcel;
    private boolean access000;
    private boolean access100;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 asBinder;
    private final SelectionRegistrarImplExternalSyntheticLambda0 asInterface;
    private int extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private int onExtraCallbackWithResult;
    private long onMessageChannelReady;
    private onWarmupCompleted onRelationshipValidationResult;
    private int readTypedObject;
    private boolean writeTypedObject;
    private final IAuthTabCallback IAuthTabCallbackStub = new IAuthTabCallback();
    private int onExtraCallback = 1000;
    private long[] onActivityLayout = new long[1000];
    private long[] extraCallback = new long[1000];
    private long[] onUnminimized = new long[1000];
    private int[] onTransact = new int[1000];
    private int[] onMinimized = new int[1000];
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback[] onNavigationEvent = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback[1000];
    private final BottomSheetScaffoldKtExternalSyntheticLambda12<onExtraCallbackWithResult> onPostMessage = new BottomSheetScaffoldKtExternalSyntheticLambda12<>(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.SampleQueue$$ExternalSyntheticLambda0
        public final void accept(Object obj) {
            ((BottomNavigationKtExternalSyntheticLambda3.onExtraCallbackWithResult) obj).onNavigationEvent.release();
        }
    });
    private long onActivityResized = Long.MIN_VALUE;
    private long IAuthTabCallbackStubProxy = Long.MIN_VALUE;
    private long IAuthTabCallback_Parcel = Long.MIN_VALUE;
    private boolean ICustomTabsService = true;
    private boolean mayLaunchUrl = true;
    private boolean onWarmupCompleted = true;

    public interface onWarmupCompleted {
        void IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4);
    }

    public static BottomNavigationKtExternalSyntheticLambda3 onNavigationEvent(ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
        return new BottomNavigationKtExternalSyntheticLambda3(composableSingletonsScaffoldKtExternalSyntheticLambda3, (SelectionRegistrarImplExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionRegistrarImplExternalSyntheticLambda0), (SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted));
    }

    public BottomNavigationKtExternalSyntheticLambda3(ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, @Nullable SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, @Nullable SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted) {
        this.asInterface = selectionRegistrarImplExternalSyntheticLambda0;
        this.IAuthTabCallbackDefault = selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
        this.ICustomTabsCallback = new BottomNavigationKtExternalSyntheticLambda2(composableSingletonsScaffoldKtExternalSyntheticLambda3);
    }

    public void getInterfaceDescriptor() {
        onWarmupCompleted(true);
        ICustomTabsCallback();
    }

    public final void access000() {
        onWarmupCompleted(false);
    }

    public void onWarmupCompleted(boolean z) {
        this.ICustomTabsCallback.onWarmupCompleted();
        this.getInterfaceDescriptor = 0;
        this.onExtraCallbackWithResult = 0;
        this.readTypedObject = 0;
        this.extraCallbackWithResult = 0;
        this.mayLaunchUrl = true;
        this.onActivityResized = Long.MIN_VALUE;
        this.IAuthTabCallbackStubProxy = Long.MIN_VALUE;
        this.IAuthTabCallback_Parcel = Long.MIN_VALUE;
        this.access000 = false;
        this.onPostMessage.onExtraCallback();
        if (z) {
            this.ICustomTabsCallbackStubProxy = null;
            this.ICustomTabsCallbackStub = null;
            this.ICustomTabsService = true;
            this.onWarmupCompleted = true;
        }
    }

    public final void onExtraCallbackWithResult(long j) {
        this.onActivityResized = j;
    }

    public final void onExtraCallback(long j) {
        this.ICustomTabsCallback_Parcel = j;
    }

    public final void IAuthTabCallbackStubProxy() {
        this.writeTypedObject = true;
    }

    public final int asBinder() {
        return this.onExtraCallbackWithResult + this.getInterfaceDescriptor;
    }

    public final void onExtraCallback(int i2) {
        this.ICustomTabsCallback.onExtraCallbackWithResult(onNavigationEvent(i2));
    }

    public void IAuthTabCallback_Parcel() {
        onExtraCallback();
        ICustomTabsCallback();
    }

    public void asInterface() throws IOException {
        DrmSession drmSession = this.IAuthTabCallback;
        if (drmSession != null && drmSession.onNavigationEvent() == 1) {
            throw ((DrmSession.DrmSessionException) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.IAuthTabCallback()));
        }
    }

    public final int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final int onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult + this.extraCallbackWithResult;
    }

    public final long access100() {
        long j;
        synchronized (this) {
            j = readTypedObject() ? this.onActivityLayout[IAuthTabCallbackStub(this.extraCallbackWithResult)] : this.ICustomTabsCallback_Parcel;
        }
        return j;
    }

    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackStub() {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4;
        synchronized (this) {
            basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.ICustomTabsService ? null : this.ICustomTabsCallbackStub;
        }
        return basicTextContextMenuProviderKtExternalSyntheticLambda4;
    }

    public final long onWarmupCompleted() {
        long j;
        synchronized (this) {
            j = this.IAuthTabCallback_Parcel;
        }
        return j;
    }

    public final long onNavigationEvent() {
        long jMax;
        synchronized (this) {
            jMax = Math.max(this.IAuthTabCallbackStubProxy, asInterface(this.extraCallbackWithResult));
        }
        return jMax;
    }

    public final boolean IAuthTabCallbackDefault() {
        boolean z;
        synchronized (this) {
            z = this.access000;
        }
        return z;
    }

    public boolean onExtraCallback(boolean z) {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4;
        synchronized (this) {
            boolean z2 = true;
            if (!readTypedObject()) {
                if (!z && !this.access000 && ((basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.ICustomTabsCallbackStub) == null || basicTextContextMenuProviderKtExternalSyntheticLambda4 == this.asBinder)) {
                    z2 = false;
                }
                return z2;
            }
            if (this.onPostMessage.onExtraCallbackWithResult(onExtraCallbackWithResult()).IAuthTabCallback != this.asBinder) {
                return true;
            }
            return onTransact(IAuthTabCallbackStub(this.extraCallbackWithResult));
        }
    }

    public int onWarmupCompleted(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2, boolean z) {
        int iOnNavigationEvent = onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, (i2 & 2) != 0, z, this.IAuthTabCallbackStub);
        if (iOnNavigationEvent == -4 && !selectionControllerExternalSyntheticLambda2.IAuthTabCallback()) {
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 4) == 0) {
                if (z2) {
                    this.ICustomTabsCallback.onWarmupCompleted(selectionControllerExternalSyntheticLambda2, this.IAuthTabCallbackStub);
                } else {
                    this.ICustomTabsCallback.IAuthTabCallback(selectionControllerExternalSyntheticLambda2, this.IAuthTabCallbackStub);
                }
            }
            if (!z2) {
                this.extraCallbackWithResult++;
            }
        }
        return iOnNavigationEvent;
    }

    public final boolean onExtraCallbackWithResult(int i2) {
        synchronized (this) {
            writeTypedObject();
            int i3 = this.onExtraCallbackWithResult;
            if (i2 >= i3 && i2 <= this.getInterfaceDescriptor + i3) {
                this.onActivityResized = Long.MIN_VALUE;
                this.extraCallbackWithResult = i2 - i3;
                return true;
            }
            return false;
        }
    }

    public final boolean onExtraCallbackWithResult(long j, boolean z) {
        int iOnExtraCallbackWithResult;
        synchronized (this) {
            writeTypedObject();
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.extraCallbackWithResult);
            if (readTypedObject() && j >= this.onUnminimized[iIAuthTabCallbackStub] && (j <= this.IAuthTabCallback_Parcel || z)) {
                if (this.onWarmupCompleted) {
                    iOnExtraCallbackWithResult = onWarmupCompleted(iIAuthTabCallbackStub, this.getInterfaceDescriptor - this.extraCallbackWithResult, j, z);
                } else {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(iIAuthTabCallbackStub, this.getInterfaceDescriptor - this.extraCallbackWithResult, j, true);
                }
                if (iOnExtraCallbackWithResult == -1) {
                    return false;
                }
                this.onActivityResized = j;
                this.extraCallbackWithResult += iOnExtraCallbackWithResult;
                return true;
            }
            return false;
        }
    }

    public final int onExtraCallback(long j, boolean z) {
        synchronized (this) {
            int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.extraCallbackWithResult);
            if (readTypedObject() && j >= this.onUnminimized[iIAuthTabCallbackStub]) {
                if (j > this.IAuthTabCallback_Parcel && z) {
                    return this.getInterfaceDescriptor - this.extraCallbackWithResult;
                }
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iIAuthTabCallbackStub, this.getInterfaceDescriptor - this.extraCallbackWithResult, j, true);
                if (iOnExtraCallbackWithResult == -1) {
                    return 0;
                }
                return iOnExtraCallbackWithResult;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(int i2) {
        boolean z;
        synchronized (this) {
            if (i2 >= 0) {
                try {
                    z = this.extraCallbackWithResult + i2 <= this.getInterfaceDescriptor;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RecordingInputConnection_androidKt.onNavigationEvent(z);
            this.extraCallbackWithResult += i2;
        }
    }

    public final void IAuthTabCallback(long j, boolean z, boolean z2) {
        this.ICustomTabsCallback.onNavigationEvent(onWarmupCompleted(j, z, z2));
    }

    public final void onExtraCallback() {
        this.ICustomTabsCallback.onNavigationEvent(extraCallbackWithResult());
    }

    public final void IAuthTabCallback(long j) {
        if (this.onMessageChannelReady != j) {
            this.onMessageChannelReady = j;
            onTransact();
        }
    }

    public final void onNavigationEvent(@Nullable onWarmupCompleted onwarmupcompleted) {
        this.onRelationshipValidationResult = onwarmupcompleted;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public final void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        this.ICustomTabsCallbackDefault = false;
        this.ICustomTabsCallbackStubProxy = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        boolean zOnWarmupCompleted = onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback);
        onWarmupCompleted onwarmupcompleted = this.onRelationshipValidationResult;
        if (onwarmupcompleted == null || !zOnWarmupCompleted) {
            return;
        }
        onwarmupcompleted.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback);
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public final int IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, int i2, boolean z, int i3) throws IOException {
        return this.ICustomTabsCallback.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda0, i2, z);
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public final void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) {
        this.ICustomTabsCallback.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(long j, int i2, int i3, int i4, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
        int i5;
        if (this.ICustomTabsCallbackDefault) {
            onExtraCallbackWithResult((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.ICustomTabsCallbackStubProxy));
        }
        int i6 = i2 & 1;
        boolean z = i6 != 0;
        if (this.mayLaunchUrl) {
            if (!z) {
                return;
            } else {
                this.mayLaunchUrl = false;
            }
        }
        long j2 = this.onMessageChannelReady + j;
        if (!this.onWarmupCompleted) {
            i5 = i2;
        } else {
            if (j2 < this.onActivityResized) {
                return;
            }
            if (i6 == 0) {
                if (!this.access100) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.ICustomTabsCallbackStub);
                    this.access100 = true;
                }
                i5 = i2 | 1;
            }
        }
        if (this.writeTypedObject) {
            if (!z || !onNavigationEvent(j2)) {
                return;
            } else {
                this.writeTypedObject = false;
            }
        }
        onWarmupCompleted(j2, i5, (this.ICustomTabsCallback.onExtraCallbackWithResult() - i3) - i4, i3, iAuthTabCallback);
    }

    public final void onTransact() {
        this.ICustomTabsCallbackDefault = true;
    }

    public BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return (this.onMessageChannelReady == 0 || basicTextContextMenuProviderKtExternalSyntheticLambda4.newSession == Long.MAX_VALUE) ? basicTextContextMenuProviderKtExternalSyntheticLambda4 : basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.newSession + this.onMessageChannelReady).onNavigationEvent();
    }

    private void writeTypedObject() {
        synchronized (this) {
            this.extraCallbackWithResult = 0;
            this.ICustomTabsCallback.IAuthTabCallback();
        }
    }

    private int onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, boolean z, boolean z2, IAuthTabCallback iAuthTabCallback) {
        synchronized (this) {
            selectionControllerExternalSyntheticLambda2.IAuthTabCallbackDefault = false;
            if (!readTypedObject()) {
                if (!z2 && !this.access000) {
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.ICustomTabsCallbackStub;
                    if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null || (!z && basicTextContextMenuProviderKtExternalSyntheticLambda4 == this.asBinder)) {
                        return -3;
                    }
                    onNavigationEvent((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4), androidSelectionHandles_androidKtExternalSyntheticLambda7);
                    return -5;
                }
                selectionControllerExternalSyntheticLambda2.onNavigationEvent(4);
                selectionControllerExternalSyntheticLambda2.onWarmupCompleted = Long.MIN_VALUE;
                return -4;
            }
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.onPostMessage.onExtraCallbackWithResult(onExtraCallbackWithResult()).IAuthTabCallback;
            if (!z && basicTextContextMenuProviderKtExternalSyntheticLambda42 == this.asBinder) {
                int iIAuthTabCallbackStub = IAuthTabCallbackStub(this.extraCallbackWithResult);
                if (!onTransact(iIAuthTabCallbackStub)) {
                    selectionControllerExternalSyntheticLambda2.IAuthTabCallbackDefault = true;
                    return -3;
                }
                selectionControllerExternalSyntheticLambda2.onNavigationEvent(this.onTransact[iIAuthTabCallbackStub]);
                if (this.extraCallbackWithResult == this.getInterfaceDescriptor - 1 && (z2 || this.access000)) {
                    selectionControllerExternalSyntheticLambda2.onWarmupCompleted(536870912);
                }
                selectionControllerExternalSyntheticLambda2.onWarmupCompleted = this.onUnminimized[iIAuthTabCallbackStub];
                iAuthTabCallback.onNavigationEvent = this.onMinimized[iIAuthTabCallbackStub];
                iAuthTabCallback.onExtraCallbackWithResult = this.extraCallback[iIAuthTabCallbackStub];
                iAuthTabCallback.onExtraCallback = this.onNavigationEvent[iIAuthTabCallbackStub];
                return -4;
            }
            onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda42, androidSelectionHandles_androidKtExternalSyntheticLambda7);
            return -5;
        }
    }

    private boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        synchronized (this) {
            this.ICustomTabsService = false;
            if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4, this.ICustomTabsCallbackStub)) {
                return false;
            }
            if (!this.onPostMessage.IAuthTabCallback() && this.onPostMessage.onExtraCallbackWithResult().IAuthTabCallback.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
                this.ICustomTabsCallbackStub = this.onPostMessage.onExtraCallbackWithResult().IAuthTabCallback;
            } else {
                this.ICustomTabsCallbackStub = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            }
            boolean z = this.onWarmupCompleted;
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.ICustomTabsCallbackStub;
            this.onWarmupCompleted = z & AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable, basicTextContextMenuProviderKtExternalSyntheticLambda42.IAuthTabCallbackStub);
            this.access100 = false;
            return true;
        }
    }

    private long onWarmupCompleted(long j, boolean z, boolean z2) {
        int i2;
        synchronized (this) {
            try {
                int i3 = this.getInterfaceDescriptor;
                if (i3 != 0) {
                    long[] jArr = this.onUnminimized;
                    int i4 = this.readTypedObject;
                    if (j >= jArr[i4]) {
                        if (z2 && (i2 = this.extraCallbackWithResult) != i3) {
                            i3 = i2 + 1;
                        }
                        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i4, i3, j, z);
                        if (iOnExtraCallbackWithResult == -1) {
                            return -1L;
                        }
                        return onWarmupCompleted(iOnExtraCallbackWithResult);
                    }
                }
                return -1L;
            } finally {
            }
        }
    }

    private long extraCallbackWithResult() {
        synchronized (this) {
            int i2 = this.getInterfaceDescriptor;
            if (i2 == 0) {
                return -1L;
            }
            return onWarmupCompleted(i2);
        }
    }

    private void ICustomTabsCallback() {
        DrmSession drmSession = this.IAuthTabCallback;
        if (drmSession != null) {
            drmSession.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
            this.IAuthTabCallback = null;
            this.asBinder = null;
        }
    }

    private void onWarmupCompleted(long j, int i2, long j2, int i3, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
        SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedOnNavigationEvent;
        synchronized (this) {
            int i4 = this.getInterfaceDescriptor;
            if (i4 > 0) {
                int iIAuthTabCallbackStub = IAuthTabCallbackStub(i4 - 1);
                RecordingInputConnection_androidKt.onNavigationEvent(this.extraCallback[iIAuthTabCallbackStub] + ((long) this.onMinimized[iIAuthTabCallbackStub]) <= j2);
            }
            this.access000 = (536870912 & i2) != 0;
            this.IAuthTabCallback_Parcel = Math.max(this.IAuthTabCallback_Parcel, j);
            int iIAuthTabCallbackStub2 = IAuthTabCallbackStub(this.getInterfaceDescriptor);
            this.onUnminimized[iIAuthTabCallbackStub2] = j;
            this.extraCallback[iIAuthTabCallbackStub2] = j2;
            this.onMinimized[iIAuthTabCallbackStub2] = i3;
            this.onTransact[iIAuthTabCallbackStub2] = i2;
            this.onNavigationEvent[iIAuthTabCallbackStub2] = iAuthTabCallback;
            this.onActivityLayout[iIAuthTabCallbackStub2] = this.ICustomTabsCallback_Parcel;
            if (this.onPostMessage.IAuthTabCallback() || !this.onPostMessage.onExtraCallbackWithResult().IAuthTabCallback.equals(this.ICustomTabsCallbackStub)) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsCallbackStub);
                SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0 = this.asInterface;
                if (selectionRegistrarImplExternalSyntheticLambda0 != null) {
                    onwarmupcompletedOnNavigationEvent = selectionRegistrarImplExternalSyntheticLambda0.onNavigationEvent(this.IAuthTabCallbackDefault, basicTextContextMenuProviderKtExternalSyntheticLambda4);
                } else {
                    onwarmupcompletedOnNavigationEvent = SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted.IAuthTabCallback;
                }
                this.onPostMessage.IAuthTabCallback(asBinder(), new onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4, onwarmupcompletedOnNavigationEvent));
            }
            int i5 = this.getInterfaceDescriptor + 1;
            this.getInterfaceDescriptor = i5;
            int i6 = this.onExtraCallback;
            if (i5 == i6) {
                int i7 = i6 + 1000;
                long[] jArr = new long[i7];
                long[] jArr2 = new long[i7];
                long[] jArr3 = new long[i7];
                int[] iArr = new int[i7];
                int[] iArr2 = new int[i7];
                ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback[] iAuthTabCallbackArr = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback[i7];
                int i8 = this.readTypedObject;
                int i9 = i6 - i8;
                System.arraycopy(this.extraCallback, i8, jArr2, 0, i9);
                System.arraycopy(this.onUnminimized, this.readTypedObject, jArr3, 0, i9);
                System.arraycopy(this.onTransact, this.readTypedObject, iArr, 0, i9);
                System.arraycopy(this.onMinimized, this.readTypedObject, iArr2, 0, i9);
                System.arraycopy(this.onNavigationEvent, this.readTypedObject, iAuthTabCallbackArr, 0, i9);
                System.arraycopy(this.onActivityLayout, this.readTypedObject, jArr, 0, i9);
                int i10 = this.readTypedObject;
                System.arraycopy(this.extraCallback, 0, jArr2, i9, i10);
                System.arraycopy(this.onUnminimized, 0, jArr3, i9, i10);
                System.arraycopy(this.onTransact, 0, iArr, i9, i10);
                System.arraycopy(this.onMinimized, 0, iArr2, i9, i10);
                System.arraycopy(this.onNavigationEvent, 0, iAuthTabCallbackArr, i9, i10);
                System.arraycopy(this.onActivityLayout, 0, jArr, i9, i10);
                this.extraCallback = jArr2;
                this.onUnminimized = jArr3;
                this.onTransact = iArr;
                this.onMinimized = iArr2;
                this.onNavigationEvent = iAuthTabCallbackArr;
                this.onActivityLayout = jArr;
                this.readTypedObject = 0;
                this.onExtraCallback = i7;
            }
        }
    }

    private boolean onNavigationEvent(long j) {
        synchronized (this) {
            if (this.getInterfaceDescriptor == 0) {
                return j > this.IAuthTabCallbackStubProxy;
            }
            if (onNavigationEvent() >= j) {
                return false;
            }
            onNavigationEvent(this.onExtraCallbackWithResult + onWarmupCompleted(j));
            return true;
        }
    }

    private long onNavigationEvent(int i2) {
        int iAsBinder = asBinder() - i2;
        boolean z = false;
        RecordingInputConnection_androidKt.onNavigationEvent(iAsBinder >= 0 && iAsBinder <= this.getInterfaceDescriptor - this.extraCallbackWithResult);
        int i3 = this.getInterfaceDescriptor - iAsBinder;
        this.getInterfaceDescriptor = i3;
        this.IAuthTabCallback_Parcel = Math.max(this.IAuthTabCallbackStubProxy, asInterface(i3));
        if (iAsBinder == 0 && this.access000) {
            z = true;
        }
        this.access000 = z;
        this.onPostMessage.IAuthTabCallback(i2);
        int i4 = this.getInterfaceDescriptor;
        if (i4 == 0) {
            return 0L;
        }
        return this.extraCallback[IAuthTabCallbackStub(i4 - 1)] + this.onMinimized[r9];
    }

    private boolean readTypedObject() {
        return this.extraCallbackWithResult != this.getInterfaceDescriptor;
    }

    private void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7) {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.asBinder;
        boolean z = basicTextContextMenuProviderKtExternalSyntheticLambda42 == null;
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0 = basicTextContextMenuProviderKtExternalSyntheticLambda42 == null ? null : basicTextContextMenuProviderKtExternalSyntheticLambda42.IAuthTabCallback_Parcel;
        this.asBinder = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda02 = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel;
        SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0 = this.asInterface;
        androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted = selectionRegistrarImplExternalSyntheticLambda0 != null ? basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback(selectionRegistrarImplExternalSyntheticLambda0.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) : basicTextContextMenuProviderKtExternalSyntheticLambda4;
        androidSelectionHandles_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult = this.IAuthTabCallback;
        if (this.asInterface != null) {
            if (z || !Objects.equals(basicTextContextMenuProviderExternalSyntheticLambda0, basicTextContextMenuProviderExternalSyntheticLambda02)) {
                DrmSession drmSession = this.IAuthTabCallback;
                DrmSession drmSessionOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(this.IAuthTabCallbackDefault, basicTextContextMenuProviderKtExternalSyntheticLambda4);
                this.IAuthTabCallback = drmSessionOnExtraCallbackWithResult;
                androidSelectionHandles_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult = drmSessionOnExtraCallbackWithResult;
                if (drmSession != null) {
                    drmSession.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
                }
            }
        }
    }

    private boolean onTransact(int i2) {
        DrmSession drmSession = this.IAuthTabCallback;
        if (drmSession == null || drmSession.onNavigationEvent() == 4) {
            return true;
        }
        return (this.onTransact[i2] & 1073741824) == 0 && this.IAuthTabCallback.onTransact();
    }

    private int onExtraCallbackWithResult(int i2, int i3, long j, boolean z) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = this.onUnminimized[i2];
            if (j2 > j) {
                break;
            }
            if (!z || (this.onTransact[i2] & 1) != 0) {
                if (j2 == j) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.onExtraCallback) {
                i2 = 0;
            }
        }
        return i4;
    }

    private int onWarmupCompleted(int i2, int i3, long j, boolean z) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.onUnminimized[i2] >= j) {
                return i4;
            }
            i2++;
            if (i2 == this.onExtraCallback) {
                i2 = 0;
            }
        }
        if (z) {
            return i3;
        }
        return -1;
    }

    private int onWarmupCompleted(long j) {
        int i2 = this.getInterfaceDescriptor;
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(i2 - 1);
        while (i2 > this.extraCallbackWithResult && this.onUnminimized[iIAuthTabCallbackStub] >= j) {
            i2--;
            iIAuthTabCallbackStub--;
            if (iIAuthTabCallbackStub == -1) {
                iIAuthTabCallbackStub = this.onExtraCallback - 1;
            }
        }
        return i2;
    }

    private long onWarmupCompleted(int i2) {
        this.IAuthTabCallbackStubProxy = Math.max(this.IAuthTabCallbackStubProxy, asInterface(i2));
        this.getInterfaceDescriptor -= i2;
        int i3 = this.onExtraCallbackWithResult + i2;
        this.onExtraCallbackWithResult = i3;
        int i4 = this.readTypedObject + i2;
        this.readTypedObject = i4;
        int i5 = this.onExtraCallback;
        if (i4 >= i5) {
            this.readTypedObject = i4 - i5;
        }
        int i6 = this.extraCallbackWithResult - i2;
        this.extraCallbackWithResult = i6;
        if (i6 < 0) {
            this.extraCallbackWithResult = 0;
        }
        this.onPostMessage.onWarmupCompleted(i3);
        if (this.getInterfaceDescriptor == 0) {
            int i7 = this.readTypedObject;
            if (i7 == 0) {
                i7 = this.onExtraCallback;
            }
            return this.extraCallback[i7 - 1] + this.onMinimized[r6];
        }
        return this.extraCallback[this.readTypedObject];
    }

    private long asInterface(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.onUnminimized[iIAuthTabCallbackStub]);
            if ((this.onTransact[iIAuthTabCallbackStub] & 1) != 0) {
                return jMax;
            }
            iIAuthTabCallbackStub--;
            if (iIAuthTabCallbackStub == -1) {
                iIAuthTabCallbackStub = this.onExtraCallback - 1;
            }
        }
        return jMax;
    }

    private int IAuthTabCallbackStub(int i2) {
        int i3 = this.readTypedObject + i2;
        int i4 = this.onExtraCallback;
        return i3 < i4 ? i3 : i3 - i4;
    }

    static final class IAuthTabCallback {
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback onExtraCallback;
        public long onExtraCallbackWithResult;
        public int onNavigationEvent;

        IAuthTabCallback() {
        }
    }

    public static final class onExtraCallbackWithResult {
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback;
        public final SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted onNavigationEvent;

        private onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, SelectionRegistrarImplExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted) {
            this.IAuthTabCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.onNavigationEvent = onwarmupcompleted;
        }
    }
}
