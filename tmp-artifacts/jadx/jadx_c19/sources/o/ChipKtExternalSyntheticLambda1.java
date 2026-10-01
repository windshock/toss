package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.text.ReplacingCuesResolver;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ChipKtExternalSyntheticLambda1 extends TextAnnotatedStringNodeExternalSyntheticLambda4 implements Handler.Callback {
    private long IAuthTabCallback;
    private RippleKt IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private final Handler IAuthTabCallback_Parcel;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 ICustomTabsCallback;
    private final ChipKtExternalSyntheticLambda4 access000;
    private RippleConfiguration access100;
    private boolean asBinder;
    private long asInterface;
    private boolean extraCallback;
    private RadioButtonKtExternalSyntheticLambda0 extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private CheckboxKtExternalSyntheticLambda3 onExtraCallback;
    private int onExtraCallbackWithResult;
    private final RadioButtonColors onNavigationEvent;
    private final AndroidSelectionHandles_androidKtExternalSyntheticLambda7 onTransact;
    private final SelectionControllerExternalSyntheticLambda2 onWarmupCompleted;
    private final ChipKtExternalSyntheticLambda0 readTypedObject;
    private RippleKt writeTypedObject;

    public ChipKtExternalSyntheticLambda1(ChipKtExternalSyntheticLambda4 chipKtExternalSyntheticLambda4, @Nullable Looper looper) {
        this(chipKtExternalSyntheticLambda4, looper, ChipKtExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    public ChipKtExternalSyntheticLambda1(ChipKtExternalSyntheticLambda4 chipKtExternalSyntheticLambda4, @Nullable Looper looper, ChipKtExternalSyntheticLambda0 chipKtExternalSyntheticLambda0) {
        super(3);
        this.access000 = (ChipKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(chipKtExternalSyntheticLambda4);
        this.IAuthTabCallback_Parcel = looper == null ? null : TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(looper, this);
        this.readTypedObject = chipKtExternalSyntheticLambda0;
        this.onNavigationEvent = new RadioButtonColors();
        this.onWarmupCompleted = new SelectionControllerExternalSyntheticLambda2(1);
        this.onTransact = new AndroidSelectionHandles_androidKtExternalSyntheticLambda7();
        this.IAuthTabCallback = -9223372036854775807L;
        this.asInterface = -9223372036854775807L;
        this.asBinder = false;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String extraCommand() {
        return "TextRenderer";
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if (IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) || this.readTypedObject.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return RendererCapabilities.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.asBinder == 0 ? 4 : 2);
        }
        if (((Boolean) AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1680259949, -1680259949, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable})).booleanValue()) {
            return RendererCapabilities.IAuthTabCallback(1);
        }
        return RendererCapabilities.IAuthTabCallback(0);
    }

    public void onWarmupCompleted(long j) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(writeTypedObject());
        this.IAuthTabCallback = j;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        CheckboxKtExternalSyntheticLambda3 replacingCuesResolver;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[0];
        this.ICustomTabsCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        if (!IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            postMessage();
            if (this.extraCallbackWithResult != null) {
                this.onExtraCallbackWithResult = 1;
                return;
            } else {
                requestPostMessageChannel();
                return;
            }
        }
        if (this.ICustomTabsCallback.IAuthTabCallbackDefault == 1) {
            replacingCuesResolver = new CheckboxKtExternalSyntheticLambda5();
        } else {
            replacingCuesResolver = new ReplacingCuesResolver();
        }
        this.onExtraCallback = replacingCuesResolver;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onExtraCallbackWithResult(long j, boolean z) {
        this.asInterface = j;
        CheckboxKtExternalSyntheticLambda3 checkboxKtExternalSyntheticLambda3 = this.onExtraCallback;
        if (checkboxKtExternalSyntheticLambda3 != null) {
            checkboxKtExternalSyntheticLambda3.IAuthTabCallback();
        }
        newSessionWithExtras();
        this.IAuthTabCallbackStub = false;
        this.IAuthTabCallbackStubProxy = false;
        this.IAuthTabCallback = -9223372036854775807L;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.ICustomTabsCallback;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null || IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return;
        }
        if (this.onExtraCallbackWithResult != 0) {
            prefetchWithMultipleUrls();
            return;
        }
        requestPostMessageChannelWithExtras();
        RadioButtonKtExternalSyntheticLambda0 radioButtonKtExternalSyntheticLambda0 = (RadioButtonKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult);
        radioButtonKtExternalSyntheticLambda0.onExtraCallback();
        radioButtonKtExternalSyntheticLambda0.onExtraCallback(IAuthTabCallbackStub());
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void onExtraCallbackWithResult(long j, long j2) throws TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
        if (writeTypedObject()) {
            long j3 = this.IAuthTabCallback;
            if (j3 != -9223372036854775807L && j >= j3) {
                requestPostMessageChannelWithExtras();
                this.IAuthTabCallbackStubProxy = true;
            }
        }
        if (this.IAuthTabCallbackStubProxy) {
            return;
        }
        if (IAuthTabCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsCallback))) {
            asInterface(j);
        } else {
            postMessage();
            onTransact(j);
        }
    }

    @RequiresNonNull
    private void asInterface(long j) {
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(j);
        long jOnExtraCallback = this.onExtraCallback.onExtraCallback(this.asInterface);
        if (jOnExtraCallback == Long.MIN_VALUE && this.IAuthTabCallbackStub && !zIAuthTabCallbackDefault) {
            this.IAuthTabCallbackStubProxy = true;
        }
        if ((jOnExtraCallback != Long.MIN_VALUE && jOnExtraCallback <= j) || zIAuthTabCallbackDefault) {
            ImmutableList<ImeEditCommand_androidKtExternalSyntheticLambda1> immutableListOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(j);
            long jOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(j);
            onWarmupCompleted(new ImeEditCommand_androidKtExternalSyntheticLambda2(immutableListOnWarmupCompleted, onExtraCallbackWithResult(jOnExtraCallbackWithResult)));
            this.onExtraCallback.IAuthTabCallback(jOnExtraCallbackWithResult);
        }
        this.asInterface = j;
    }

    @RequiresNonNull
    private boolean IAuthTabCallbackDefault(long j) {
        if (this.IAuthTabCallbackStub || onExtraCallback(this.onTransact, this.onWarmupCompleted, 0) != -4) {
            return false;
        }
        if (this.onWarmupCompleted.IAuthTabCallback()) {
            this.IAuthTabCallbackStub = true;
            return false;
        }
        this.onWarmupCompleted.IAuthTabCallbackDefault();
        ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted.onExtraCallback);
        RadioButtonDefaults radioButtonDefaultsOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this.onWarmupCompleted.onWarmupCompleted, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.onWarmupCompleted.onNavigationEvent();
        return this.onExtraCallback.onExtraCallback(radioButtonDefaultsOnExtraCallbackWithResult, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onTransact(long j) throws TextFieldSelectionState_androidKtExternalSyntheticLambda3 {
        boolean z;
        this.asInterface = j;
        if (this.IAuthTabCallbackDefault == null) {
            ((RadioButtonKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult)).IAuthTabCallback(j);
            try {
                this.IAuthTabCallbackDefault = ((RadioButtonKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult)).onWarmupCompleted();
            } catch (RadioButtonKtExternalSyntheticLambda1 e) {
                onWarmupCompleted(e);
                return;
            }
        }
        if (getInterfaceDescriptor() == 2) {
            if (this.writeTypedObject != null) {
                long jNewSession = newSession();
                z = false;
                while (jNewSession <= j) {
                    this.getInterfaceDescriptor++;
                    jNewSession = newSession();
                    z = true;
                }
            } else {
                z = false;
            }
            RippleKt rippleKt = this.IAuthTabCallbackDefault;
            if (rippleKt != null) {
                if (!rippleKt.IAuthTabCallback()) {
                    if (rippleKt.onNavigationEvent <= j) {
                        RippleKt rippleKt2 = this.writeTypedObject;
                        if (rippleKt2 != null) {
                            rippleKt2.asInterface();
                        }
                        this.getInterfaceDescriptor = rippleKt.onWarmupCompleted(j);
                        this.writeTypedObject = rippleKt;
                        this.IAuthTabCallbackDefault = null;
                    }
                    onWarmupCompleted(new ImeEditCommand_androidKtExternalSyntheticLambda2(this.writeTypedObject.onExtraCallbackWithResult(j), onExtraCallbackWithResult(onNavigationEvent(j))));
                } else if (!z && newSession() == Long.MAX_VALUE) {
                    if (this.onExtraCallbackWithResult == 2) {
                        prefetchWithMultipleUrls();
                    } else {
                        requestPostMessageChannelWithExtras();
                        this.IAuthTabCallbackStubProxy = true;
                    }
                }
                if (z) {
                }
            } else if (z) {
                onWarmupCompleted(new ImeEditCommand_androidKtExternalSyntheticLambda2(this.writeTypedObject.onExtraCallbackWithResult(j), onExtraCallbackWithResult(onNavigationEvent(j))));
            }
            if (this.onExtraCallbackWithResult != 2) {
                while (!this.IAuthTabCallbackStub) {
                    try {
                        RippleConfiguration rippleConfigurationOnExtraCallbackWithResult = this.access100;
                        if (rippleConfigurationOnExtraCallbackWithResult == null) {
                            rippleConfigurationOnExtraCallbackWithResult = ((RadioButtonKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult)).onExtraCallbackWithResult();
                            if (rippleConfigurationOnExtraCallbackWithResult == null) {
                                return;
                            } else {
                                this.access100 = rippleConfigurationOnExtraCallbackWithResult;
                            }
                        }
                        if (this.onExtraCallbackWithResult == 1) {
                            rippleConfigurationOnExtraCallbackWithResult.onNavigationEvent(4);
                            ((RadioButtonKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult)).IAuthTabCallback((RadioButtonKtExternalSyntheticLambda0) rippleConfigurationOnExtraCallbackWithResult);
                            this.access100 = null;
                            this.onExtraCallbackWithResult = 2;
                            return;
                        }
                        int iOnExtraCallback = onExtraCallback(this.onTransact, rippleConfigurationOnExtraCallbackWithResult, 0);
                        if (iOnExtraCallback == -4) {
                            if (rippleConfigurationOnExtraCallbackWithResult.IAuthTabCallback()) {
                                this.IAuthTabCallbackStub = true;
                                this.extraCallback = false;
                            } else {
                                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onTransact.onWarmupCompleted;
                                if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null) {
                                    return;
                                }
                                rippleConfigurationOnExtraCallbackWithResult.asInterface = basicTextContextMenuProviderKtExternalSyntheticLambda4.newSession;
                                rippleConfigurationOnExtraCallbackWithResult.IAuthTabCallbackDefault();
                                this.extraCallback &= !rippleConfigurationOnExtraCallbackWithResult.ac_();
                            }
                            if (!this.extraCallback) {
                                ((RadioButtonKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult)).IAuthTabCallback((RadioButtonKtExternalSyntheticLambda0) rippleConfigurationOnExtraCallbackWithResult);
                                this.access100 = null;
                            }
                        } else if (iOnExtraCallback == -3) {
                            return;
                        }
                    } catch (RadioButtonKtExternalSyntheticLambda1 e2) {
                        onWarmupCompleted(e2);
                        return;
                    }
                }
            }
        }
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMinimized() {
        this.ICustomTabsCallback = null;
        this.IAuthTabCallback = -9223372036854775807L;
        newSessionWithExtras();
        this.asInterface = -9223372036854775807L;
        if (this.extraCallbackWithResult != null) {
            receiveFile();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean prefetch() {
        return this.IAuthTabCallbackStubProxy;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean newAuthTabSession() {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.ICustomTabsCallback;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null) {
            return true;
        }
        if (!IAuthTabCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4))) {
            return !this.IAuthTabCallbackStubProxy && (!this.IAuthTabCallbackStub || onWarmupCompleted(this.writeTypedObject, this.asInterface) || onWarmupCompleted(this.IAuthTabCallbackDefault, this.asInterface) || this.access100 == null);
        }
        if (((CheckboxKtExternalSyntheticLambda3) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onExtraCallback(this.asInterface) != Long.MIN_VALUE) {
            return true;
        }
        try {
            onPostMessage();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static boolean onWarmupCompleted(@Nullable RadioButtonKt radioButtonKt, long j) {
        return radioButtonKt != null && radioButtonKt.onExtraCallbackWithResult() > 0 && radioButtonKt.IAuthTabCallback(radioButtonKt.onExtraCallbackWithResult() - 1) > j;
    }

    private void requestPostMessageChannelWithExtras() {
        this.access100 = null;
        this.getInterfaceDescriptor = -1;
        RippleKt rippleKt = this.writeTypedObject;
        if (rippleKt != null) {
            rippleKt.asInterface();
            this.writeTypedObject = null;
        }
        RippleKt rippleKt2 = this.IAuthTabCallbackDefault;
        if (rippleKt2 != null) {
            rippleKt2.asInterface();
            this.IAuthTabCallbackDefault = null;
        }
    }

    private void receiveFile() {
        requestPostMessageChannelWithExtras();
        ((RadioButtonKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCallbackWithResult)).IAuthTabCallback();
        this.extraCallbackWithResult = null;
        this.onExtraCallbackWithResult = 0;
    }

    private void requestPostMessageChannel() {
        this.extraCallback = true;
        RadioButtonKtExternalSyntheticLambda0 radioButtonKtExternalSyntheticLambda0IAuthTabCallback = this.readTypedObject.IAuthTabCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsCallback));
        this.extraCallbackWithResult = radioButtonKtExternalSyntheticLambda0IAuthTabCallback;
        radioButtonKtExternalSyntheticLambda0IAuthTabCallback.onExtraCallback(IAuthTabCallbackStub());
    }

    private void prefetchWithMultipleUrls() {
        receiveFile();
        requestPostMessageChannel();
    }

    private long newSession() {
        int i2 = this.getInterfaceDescriptor;
        if (i2 != -1 && i2 < this.writeTypedObject.onExtraCallbackWithResult()) {
            return this.writeTypedObject.IAuthTabCallback(this.getInterfaceDescriptor);
        }
        return Long.MAX_VALUE;
    }

    private void onWarmupCompleted(ImeEditCommand_androidKtExternalSyntheticLambda2 imeEditCommand_androidKtExternalSyntheticLambda2) {
        Handler handler = this.IAuthTabCallback_Parcel;
        if (handler != null) {
            handler.obtainMessage(1, imeEditCommand_androidKtExternalSyntheticLambda2).sendToTarget();
        } else {
            onExtraCallbackWithResult(imeEditCommand_androidKtExternalSyntheticLambda2);
        }
    }

    private void newSessionWithExtras() {
        onWarmupCompleted(new ImeEditCommand_androidKtExternalSyntheticLambda2(ImmutableList.of(), onExtraCallbackWithResult(this.asInterface)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            onExtraCallbackWithResult((ImeEditCommand_androidKtExternalSyntheticLambda2) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void onExtraCallbackWithResult(ImeEditCommand_androidKtExternalSyntheticLambda2 imeEditCommand_androidKtExternalSyntheticLambda2) {
        this.access000.onExtraCallback(imeEditCommand_androidKtExternalSyntheticLambda2.onExtraCallbackWithResult);
        this.access000.onCues(imeEditCommand_androidKtExternalSyntheticLambda2);
    }

    private void onWarmupCompleted(RadioButtonKtExternalSyntheticLambda1 radioButtonKtExternalSyntheticLambda1) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.ICustomTabsCallback, radioButtonKtExternalSyntheticLambda1);
        newSessionWithExtras();
        prefetchWithMultipleUrls();
    }

    @RequiresNonNull
    @SideEffectFree
    private long onNavigationEvent(long j) {
        int iOnWarmupCompleted = this.writeTypedObject.onWarmupCompleted(j);
        if (iOnWarmupCompleted == 0 || this.writeTypedObject.onExtraCallbackWithResult() == 0) {
            return this.writeTypedObject.onNavigationEvent;
        }
        if (iOnWarmupCompleted == -1) {
            return this.writeTypedObject.IAuthTabCallback(r2.onExtraCallbackWithResult() - 1);
        }
        return this.writeTypedObject.IAuthTabCallback(iOnWarmupCompleted - 1);
    }

    @SideEffectFree
    private long onExtraCallbackWithResult(long j) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(j != -9223372036854775807L);
        return j - IAuthTabCallbackStubProxy();
    }

    @RequiresNonNull
    private void postMessage() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asBinder || Objects.equals(this.ICustomTabsCallback.isEngagementSignalsApiAvailable, "application/cea-608") || Objects.equals(this.ICustomTabsCallback.isEngagementSignalsApiAvailable, "application/x-mp4-cea-608") || Objects.equals(this.ICustomTabsCallback.isEngagementSignalsApiAvailable, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.ICustomTabsCallback.isEngagementSignalsApiAvailable + " samples (expected application/x-media3-cues).");
    }

    @SideEffectFree
    private static boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "application/x-media3-cues");
    }
}
