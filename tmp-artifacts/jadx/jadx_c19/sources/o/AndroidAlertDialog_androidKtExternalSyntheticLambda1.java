package o;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import o.AnchoredDraggableStateExternalSyntheticLambda4;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidAlertDialog_androidKtExternalSyntheticLambda1 extends TextAnnotatedStringNodeExternalSyntheticLambda4 {
    private final AnchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback IAuthTabCallback;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackDefault;
    private SelectionControllerExternalSyntheticLambda2 IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private onWarmupCompleted IAuthTabCallback_Parcel;
    private final ArrayDeque<IAuthTabCallback> ICustomTabsCallback;
    private boolean access000;
    private long access100;
    private AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0 asBinder;
    private int asInterface;
    private IAuthTabCallback extraCallback;
    private boolean extraCallbackWithResult;
    private Bitmap getInterfaceDescriptor;
    private boolean onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final SelectionControllerExternalSyntheticLambda2 onTransact;
    private AnchoredDraggableStateExternalSyntheticLambda4 onWarmupCompleted;
    private onWarmupCompleted readTypedObject;
    private boolean writeTypedObject;

    protected boolean postMessage() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        return true;
    }

    public AndroidAlertDialog_androidKtExternalSyntheticLambda1(AnchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback, @Nullable AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0 alertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0) {
        super(4);
        this.IAuthTabCallback = iAuthTabCallback;
        this.asBinder = IAuthTabCallback(alertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0);
        this.onTransact = SelectionControllerExternalSyntheticLambda2.asInterface();
        this.extraCallback = IAuthTabCallback.onExtraCallbackWithResult;
        this.ICustomTabsCallback = new ArrayDeque<>();
        this.access100 = -9223372036854775807L;
        this.IAuthTabCallbackStubProxy = -9223372036854775807L;
        this.onNavigationEvent = 0;
        this.asInterface = 1;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String extraCommand() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return this.IAuthTabCallback.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    @Override // androidx.media3.exoplayer.Renderer
    public void onExtraCallbackWithResult(long j, long j2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (this.writeTypedObject) {
            return;
        }
        if (this.IAuthTabCallbackDefault == null) {
            AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact = onTransact();
            this.onTransact.onNavigationEvent();
            int iOnExtraCallback = onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact, this.onTransact, 2);
            if (iOnExtraCallback != -5) {
                if (iOnExtraCallback == -4) {
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onTransact.IAuthTabCallback());
                    this.access000 = true;
                    this.writeTypedObject = true;
                    return;
                }
                return;
            }
            this.IAuthTabCallbackDefault = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact.onWarmupCompleted);
            this.onExtraCallback = true;
        }
        if (this.onWarmupCompleted != null || newSessionWithExtras()) {
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("drainAndFeedDecoder");
                while (onNavigationEvent(j, j2)) {
                }
                while (onNavigationEvent(j)) {
                }
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            } catch (AnchoredDraggableStateExternalSyntheticLambda5 e) {
                throw onExtraCallbackWithResult(e, null, WearableStatusCodes.DATA_ITEM_TOO_LARGE);
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean newAuthTabSession() {
        int i2 = this.asInterface;
        if (i2 != 3) {
            return i2 == 0 && this.extraCallbackWithResult;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean prefetch() {
        return this.writeTypedObject;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onWarmupCompleted(boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        this.asInterface = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        super.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, j, j2, onextracallbackwithresult);
        if (this.extraCallback.IAuthTabCallback != -9223372036854775807L) {
            if (this.ICustomTabsCallback.isEmpty()) {
                long j3 = this.access100;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.IAuthTabCallbackStubProxy;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            this.ICustomTabsCallback.add(new IAuthTabCallback(this.access100, j2));
            return;
        }
        this.extraCallback = new IAuthTabCallback(-9223372036854775807L, j2);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onExtraCallbackWithResult(long j, boolean z) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        asInterface(1);
        this.writeTypedObject = false;
        this.access000 = false;
        this.getInterfaceDescriptor = null;
        this.readTypedObject = null;
        this.IAuthTabCallback_Parcel = null;
        this.extraCallbackWithResult = false;
        this.IAuthTabCallbackStub = null;
        AnchoredDraggableStateExternalSyntheticLambda4 anchoredDraggableStateExternalSyntheticLambda4 = this.onWarmupCompleted;
        if (anchoredDraggableStateExternalSyntheticLambda4 != null) {
            anchoredDraggableStateExternalSyntheticLambda4.onExtraCallback();
        }
        this.ICustomTabsCallback.clear();
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMinimized() {
        this.IAuthTabCallbackDefault = null;
        this.extraCallback = IAuthTabCallback.onExtraCallbackWithResult;
        this.ICustomTabsCallback.clear();
        newSession();
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onActivityResized() {
        newSession();
        asInterface(1);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMessageChannelReady() {
        newSession();
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void handleMessage(int i2, @Nullable Object obj) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (i2 == 15) {
            onWarmupCompleted(obj instanceof AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0 ? (AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0) obj : null);
        } else {
            super.handleMessage(i2, obj);
        }
    }

    private boolean onNavigationEvent(long j, long j2) throws AnchoredDraggableStateExternalSyntheticLambda5, AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        Bitmap bitmapOnTransact;
        if (this.getInterfaceDescriptor != null && this.readTypedObject == null) {
            return false;
        }
        if (this.asInterface == 0 && getInterfaceDescriptor() != 2) {
            return false;
        }
        if (this.getInterfaceDescriptor == null) {
            RecordingInputConnection_androidKt.onWarmupCompleted(this.onWarmupCompleted);
            AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0 anchoredDraggableKtanimateTo2ExternalSyntheticLambda0OnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
            if (anchoredDraggableKtanimateTo2ExternalSyntheticLambda0OnWarmupCompleted == null) {
                return false;
            }
            if (((AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onWarmupCompleted(anchoredDraggableKtanimateTo2ExternalSyntheticLambda0OnWarmupCompleted)).IAuthTabCallback()) {
                if (this.onNavigationEvent == 3) {
                    newSession();
                    RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault);
                    newSessionWithExtras();
                } else {
                    ((AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onWarmupCompleted(anchoredDraggableKtanimateTo2ExternalSyntheticLambda0OnWarmupCompleted)).asInterface();
                    if (this.ICustomTabsCallback.isEmpty()) {
                        this.writeTypedObject = true;
                    }
                }
                return false;
            }
            RecordingInputConnection_androidKt.onWarmupCompleted(anchoredDraggableKtanimateTo2ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback, "Non-EOS buffer came back from the decoder without bitmap.");
            this.getInterfaceDescriptor = anchoredDraggableKtanimateTo2ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback;
            ((AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onWarmupCompleted(anchoredDraggableKtanimateTo2ExternalSyntheticLambda0OnWarmupCompleted)).asInterface();
        }
        if (!this.extraCallbackWithResult || this.getInterfaceDescriptor == null || this.readTypedObject == null) {
            return false;
        }
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault);
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.IAuthTabCallbackDefault;
        int i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.newSessionWithExtras;
        boolean z = ((i2 == 1 && basicTextContextMenuProviderKtExternalSyntheticLambda4.requestPostMessageChannelWithExtras == 1) || i2 == -1 || basicTextContextMenuProviderKtExternalSyntheticLambda4.requestPostMessageChannelWithExtras == -1) ? false : true;
        if (!this.readTypedObject.onExtraCallback()) {
            onWarmupCompleted onwarmupcompleted = this.readTypedObject;
            if (z) {
                bitmapOnTransact = onTransact(onwarmupcompleted.onNavigationEvent());
            } else {
                bitmapOnTransact = (Bitmap) RecordingInputConnection_androidKt.onWarmupCompleted(this.getInterfaceDescriptor);
            }
            onwarmupcompleted.onExtraCallbackWithResult(bitmapOnTransact);
        }
        if (!onExtraCallback(j, j2, (Bitmap) RecordingInputConnection_androidKt.onWarmupCompleted(this.readTypedObject.IAuthTabCallback()), this.readTypedObject.onExtraCallbackWithResult())) {
            return false;
        }
        onWarmupCompleted(((onWarmupCompleted) RecordingInputConnection_androidKt.onWarmupCompleted(this.readTypedObject)).onExtraCallbackWithResult());
        this.asInterface = 3;
        if (!z || ((onWarmupCompleted) RecordingInputConnection_androidKt.onWarmupCompleted(this.readTypedObject)).onNavigationEvent() == (((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault)).requestPostMessageChannelWithExtras * ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault)).newSessionWithExtras) - 1) {
            this.getInterfaceDescriptor = null;
        }
        this.readTypedObject = this.IAuthTabCallback_Parcel;
        this.IAuthTabCallback_Parcel = null;
        return true;
    }

    private boolean prefetchWithMultipleUrls() {
        boolean z = getInterfaceDescriptor() == 2;
        int i2 = this.asInterface;
        if (i2 == 0) {
            return z;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    protected boolean onExtraCallback(long j, long j2, Bitmap bitmap, long j3) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (!prefetchWithMultipleUrls() && j3 - j >= 30000) {
            return false;
        }
        long j4 = this.extraCallback.IAuthTabCallback;
        return true;
    }

    private void onWarmupCompleted(long j) {
        this.IAuthTabCallbackStubProxy = j;
        while (!this.ICustomTabsCallback.isEmpty() && j >= this.ICustomTabsCallback.peek().onNavigationEvent) {
            this.extraCallback = this.ICustomTabsCallback.removeFirst();
        }
    }

    private boolean onNavigationEvent(long j) throws TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
        if (this.extraCallbackWithResult && this.readTypedObject != null) {
            return false;
        }
        AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact = onTransact();
        AnchoredDraggableStateExternalSyntheticLambda4 anchoredDraggableStateExternalSyntheticLambda4 = this.onWarmupCompleted;
        if (anchoredDraggableStateExternalSyntheticLambda4 == null || this.onNavigationEvent == 3 || this.access000) {
            return false;
        }
        if (this.IAuthTabCallbackStub == null) {
            SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2OnExtraCallbackWithResult = anchoredDraggableStateExternalSyntheticLambda4.onExtraCallbackWithResult();
            this.IAuthTabCallbackStub = selectionControllerExternalSyntheticLambda2OnExtraCallbackWithResult;
            if (selectionControllerExternalSyntheticLambda2OnExtraCallbackWithResult == null) {
                return false;
            }
        }
        if (this.onNavigationEvent == 2) {
            RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub);
            this.IAuthTabCallbackStub.onNavigationEvent(4);
            ((AnchoredDraggableStateExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.onWarmupCompleted)).IAuthTabCallback(this.IAuthTabCallbackStub);
            this.IAuthTabCallbackStub = null;
            this.onNavigationEvent = 3;
            return false;
        }
        int iOnExtraCallback = onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact, this.IAuthTabCallbackStub, 0);
        if (iOnExtraCallback == -5) {
            this.IAuthTabCallbackDefault = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact.onWarmupCompleted);
            this.onExtraCallback = true;
            this.onNavigationEvent = 2;
            return true;
        }
        if (iOnExtraCallback != -4) {
            if (iOnExtraCallback == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.IAuthTabCallbackStub.IAuthTabCallbackDefault();
        ByteBuffer byteBuffer = this.IAuthTabCallbackStub.onExtraCallback;
        boolean z = (byteBuffer != null && byteBuffer.remaining() > 0) || ((SelectionControllerExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub)).IAuthTabCallback();
        if (z) {
            ((SelectionControllerExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub)).onExtraCallbackWithResult = this.IAuthTabCallbackDefault;
            ((AnchoredDraggableStateExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.onWarmupCompleted)).IAuthTabCallback((SelectionControllerExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub));
            this.onExtraCallbackWithResult = 0;
        }
        onNavigationEvent(j, (SelectionControllerExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub));
        if (((SelectionControllerExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub)).IAuthTabCallback()) {
            this.access000 = true;
            this.IAuthTabCallbackStub = null;
            return false;
        }
        this.access100 = Math.max(this.access100, ((SelectionControllerExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub)).onWarmupCompleted);
        if (z) {
            this.IAuthTabCallbackStub = null;
        } else {
            ((SelectionControllerExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStub)).onNavigationEvent();
        }
        return !this.extraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    private boolean newSessionWithExtras() throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (!postMessage()) {
            return false;
        }
        if (!this.onExtraCallback) {
            return true;
        }
        if (IAuthTabCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault))) {
            AnchoredDraggableStateExternalSyntheticLambda4 anchoredDraggableStateExternalSyntheticLambda4 = this.onWarmupCompleted;
            if (anchoredDraggableStateExternalSyntheticLambda4 != null) {
                anchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback();
            }
            this.onWarmupCompleted = this.IAuthTabCallback.IAuthTabCallback();
            this.onExtraCallback = false;
            return true;
        }
        throw onExtraCallbackWithResult(new AnchoredDraggableStateExternalSyntheticLambda5("Provided decoder factory can't create decoder for format."), this.IAuthTabCallbackDefault, WearableStatusCodes.ASSET_UNAVAILABLE);
    }

    private boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        int iOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        return iOnExtraCallbackWithResult == RendererCapabilities.IAuthTabCallback(4) || iOnExtraCallbackWithResult == RendererCapabilities.IAuthTabCallback(3);
    }

    private void asInterface(int i2) {
        this.asInterface = Math.min(this.asInterface, i2);
    }

    private void newSession() {
        this.IAuthTabCallbackStub = null;
        this.onNavigationEvent = 0;
        this.access100 = -9223372036854775807L;
        AnchoredDraggableStateExternalSyntheticLambda4 anchoredDraggableStateExternalSyntheticLambda4 = this.onWarmupCompleted;
        if (anchoredDraggableStateExternalSyntheticLambda4 != null) {
            anchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback();
            this.onWarmupCompleted = null;
        }
    }

    private void onWarmupCompleted(@Nullable AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0 alertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0) {
        this.asBinder = IAuthTabCallback(alertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0);
    }

    private void onNavigationEvent(long j, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2) {
        boolean z = true;
        if (selectionControllerExternalSyntheticLambda2.IAuthTabCallback()) {
            this.extraCallbackWithResult = true;
            return;
        }
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.onExtraCallbackWithResult, selectionControllerExternalSyntheticLambda2.onWarmupCompleted);
        this.IAuthTabCallback_Parcel = onwarmupcompleted;
        this.onExtraCallbackWithResult++;
        if (!this.extraCallbackWithResult) {
            long jOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
            boolean z2 = jOnExtraCallbackWithResult - 30000 <= j && j <= 30000 + jOnExtraCallbackWithResult;
            onWarmupCompleted onwarmupcompleted2 = this.readTypedObject;
            boolean z3 = onwarmupcompleted2 != null && onwarmupcompleted2.onExtraCallbackWithResult() <= j && j < jOnExtraCallbackWithResult;
            boolean zOnExtraCallback = onExtraCallback((onWarmupCompleted) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallback_Parcel));
            if (!z2 && !z3 && !zOnExtraCallback) {
                z = false;
            }
            this.extraCallbackWithResult = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.readTypedObject = this.IAuthTabCallback_Parcel;
        this.IAuthTabCallback_Parcel = null;
    }

    private boolean onExtraCallback(onWarmupCompleted onwarmupcompleted) {
        return ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault)).newSessionWithExtras == -1 || this.IAuthTabCallbackDefault.requestPostMessageChannelWithExtras == -1 || onwarmupcompleted.onNavigationEvent() == (((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault)).requestPostMessageChannelWithExtras * this.IAuthTabCallbackDefault.newSessionWithExtras) - 1;
    }

    private Bitmap onTransact(int i2) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.getInterfaceDescriptor);
        int width = this.getInterfaceDescriptor.getWidth() / ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault)).newSessionWithExtras;
        int height = this.getInterfaceDescriptor.getHeight() / ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault)).requestPostMessageChannelWithExtras;
        int i3 = this.IAuthTabCallbackDefault.newSessionWithExtras;
        return Bitmap.createBitmap(this.getInterfaceDescriptor, (i2 % i3) * width, (i2 / i3) * height, width, height);
    }

    private static AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0 IAuthTabCallback(@Nullable AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0 alertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0) {
        return alertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0 == null ? AlertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0.onExtraCallback : alertDialogKtAlertDialogBaselineLayout21ExternalSyntheticLambda0;
    }

    static class onWarmupCompleted {
        private final int onExtraCallback;
        private Bitmap onExtraCallbackWithResult;
        private final long onNavigationEvent;

        public onWarmupCompleted(int i2, long j) {
            this.onExtraCallback = i2;
            this.onNavigationEvent = j;
        }

        public int onNavigationEvent() {
            return this.onExtraCallback;
        }

        public long onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        public Bitmap IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public void onExtraCallbackWithResult(Bitmap bitmap) {
            this.onExtraCallbackWithResult = bitmap;
        }

        public boolean onExtraCallback() {
            return this.onExtraCallbackWithResult != null;
        }
    }

    static final class IAuthTabCallback {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback(-9223372036854775807L, -9223372036854775807L);
        public final long IAuthTabCallback;
        public final long onNavigationEvent;

        public IAuthTabCallback(long j, long j2) {
            this.onNavigationEvent = j;
            this.IAuthTabCallback = j2;
        }
    }
}
