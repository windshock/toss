package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.RendererCapabilities;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.setApTextSize;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldKtExternalSyntheticLambda12 extends TextAnnotatedStringNodeExternalSyntheticLambda4 implements Handler.Callback {
    private final BackdropScaffoldKtExternalSyntheticLambda11 IAuthTabCallback;
    private final Handler IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private long access000;
    private boolean asBinder;
    private HandwritingHandlerNodeExternalSyntheticLambda0 asInterface;
    private final BackdropScaffoldKtExternalSyntheticLambda13 onExtraCallback;
    private final MenuKtExternalSyntheticLambda5 onExtraCallbackWithResult;
    private MaterialThemeKtExternalSyntheticLambda2 onNavigationEvent;
    private long onTransact;
    private boolean onWarmupCompleted;

    @Override // androidx.media3.exoplayer.Renderer
    public boolean newAuthTabSession() {
        return true;
    }

    public BackdropScaffoldKtExternalSyntheticLambda12(BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11, @Nullable Looper looper) {
        this(backdropScaffoldKtExternalSyntheticLambda11, looper, BackdropScaffoldKtExternalSyntheticLambda13.IAuthTabCallback);
    }

    public BackdropScaffoldKtExternalSyntheticLambda12(BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11, @Nullable Looper looper, BackdropScaffoldKtExternalSyntheticLambda13 backdropScaffoldKtExternalSyntheticLambda13) {
        this(backdropScaffoldKtExternalSyntheticLambda11, looper, backdropScaffoldKtExternalSyntheticLambda13, false);
    }

    public BackdropScaffoldKtExternalSyntheticLambda12(BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11, @Nullable Looper looper, BackdropScaffoldKtExternalSyntheticLambda13 backdropScaffoldKtExternalSyntheticLambda13, boolean z) {
        super(5);
        this.IAuthTabCallback = (BackdropScaffoldKtExternalSyntheticLambda11) RecordingInputConnection_androidKt.onExtraCallbackWithResult(backdropScaffoldKtExternalSyntheticLambda11);
        this.IAuthTabCallbackDefault = looper == null ? null : TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(looper, this);
        this.onExtraCallback = (BackdropScaffoldKtExternalSyntheticLambda13) RecordingInputConnection_androidKt.onExtraCallbackWithResult(backdropScaffoldKtExternalSyntheticLambda13);
        this.IAuthTabCallbackStub = z;
        this.onExtraCallbackWithResult = new MenuKtExternalSyntheticLambda5();
        this.onTransact = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public String extraCommand() {
        return "MetadataRenderer";
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if (this.onExtraCallback.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4)) {
            return RendererCapabilities.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.asBinder == 0 ? 4 : 2);
        }
        return RendererCapabilities.IAuthTabCallback(0);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr, long j, long j2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        this.onNavigationEvent = this.onExtraCallback.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[0]);
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = this.asInterface;
        if (handwritingHandlerNodeExternalSyntheticLambda0 != null) {
            this.asInterface = handwritingHandlerNodeExternalSyntheticLambda0.onWarmupCompleted((handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallbackWithResult + this.onTransact) - j2);
        }
        this.onTransact = j2;
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onExtraCallbackWithResult(long j, boolean z) {
        this.asInterface = null;
        this.onWarmupCompleted = false;
        this.asBinder = false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void onExtraCallbackWithResult(long j, long j2) {
        boolean zOnExtraCallbackWithResult = true;
        while (zOnExtraCallbackWithResult) {
            newSession();
            zOnExtraCallbackWithResult = onExtraCallbackWithResult(j);
        }
    }

    private void onWarmupCompleted(HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0, List<HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback> list) {
        for (int i2 = 0; i2 < handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback(); i2++) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnWarmupCompleted = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2).onWarmupCompleted();
            if (basicTextContextMenuProviderKtExternalSyntheticLambda4OnWarmupCompleted != null && this.onExtraCallback.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnWarmupCompleted)) {
                MaterialThemeKtExternalSyntheticLambda2 materialThemeKtExternalSyntheticLambda2IAuthTabCallback = this.onExtraCallback.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4OnWarmupCompleted);
                byte[] bArr = (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2).onExtraCallback());
                this.onExtraCallbackWithResult.onNavigationEvent();
                this.onExtraCallbackWithResult.IAuthTabCallback(bArr.length);
                Object[] objArr = {this.onExtraCallbackWithResult.onExtraCallback};
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                ((ByteBuffer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).put(bArr);
                this.onExtraCallbackWithResult.IAuthTabCallbackDefault();
                HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnExtraCallback = materialThemeKtExternalSyntheticLambda2IAuthTabCallback.onExtraCallback(this.onExtraCallbackWithResult);
                if (handwritingHandlerNodeExternalSyntheticLambda0OnExtraCallback != null) {
                    onWarmupCompleted(handwritingHandlerNodeExternalSyntheticLambda0OnExtraCallback, list);
                }
            } else {
                list.add(handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2));
            }
        }
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda4
    public void onMinimized() {
        this.asInterface = null;
        this.onNavigationEvent = null;
        this.onTransact = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean prefetch() {
        return this.asBinder;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            onExtraCallback((HandwritingHandlerNodeExternalSyntheticLambda0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void newSession() {
        if (this.onWarmupCompleted || this.asInterface != null) {
            return;
        }
        this.onExtraCallbackWithResult.onNavigationEvent();
        AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact = onTransact();
        int iOnExtraCallback = onExtraCallback(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact, this.onExtraCallbackWithResult, 0);
        if (iOnExtraCallback != -4) {
            if (iOnExtraCallback == -5) {
                this.access000 = ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7OnTransact.onWarmupCompleted)).newSession;
                return;
            }
            return;
        }
        if (this.onExtraCallbackWithResult.IAuthTabCallback()) {
            this.onWarmupCompleted = true;
            return;
        }
        if (((SelectionControllerExternalSyntheticLambda2) this.onExtraCallbackWithResult).onWarmupCompleted >= IAuthTabCallbackStub()) {
            MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5 = this.onExtraCallbackWithResult;
            menuKtExternalSyntheticLambda5.onTransact = this.access000;
            menuKtExternalSyntheticLambda5.IAuthTabCallbackDefault();
            Object[] objArr = {this.onNavigationEvent};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnExtraCallback = ((MaterialThemeKtExternalSyntheticLambda2) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallback(this.onExtraCallbackWithResult);
            if (handwritingHandlerNodeExternalSyntheticLambda0OnExtraCallback != null) {
                ArrayList arrayList = new ArrayList(handwritingHandlerNodeExternalSyntheticLambda0OnExtraCallback.onExtraCallback());
                onWarmupCompleted(handwritingHandlerNodeExternalSyntheticLambda0OnExtraCallback, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.asInterface = new HandwritingHandlerNodeExternalSyntheticLambda0(onNavigationEvent(((SelectionControllerExternalSyntheticLambda2) this.onExtraCallbackWithResult).onWarmupCompleted), arrayList);
            }
        }
    }

    private boolean onExtraCallbackWithResult(long j) {
        boolean z;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = this.asInterface;
        if (handwritingHandlerNodeExternalSyntheticLambda0 == null || (!this.IAuthTabCallbackStub && handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallbackWithResult > onNavigationEvent(j))) {
            z = false;
        } else {
            onNavigationEvent(this.asInterface);
            this.asInterface = null;
            z = true;
        }
        if (this.onWarmupCompleted && this.asInterface == null) {
            this.asBinder = true;
        }
        return z;
    }

    private void onNavigationEvent(HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        Handler handler = this.IAuthTabCallbackDefault;
        if (handler != null) {
            handler.obtainMessage(1, handwritingHandlerNodeExternalSyntheticLambda0).sendToTarget();
        } else {
            onExtraCallback(handwritingHandlerNodeExternalSyntheticLambda0);
        }
    }

    private void onExtraCallback(HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        this.IAuthTabCallback.onMetadata(handwritingHandlerNodeExternalSyntheticLambda0);
    }

    @SideEffectFree
    private long onNavigationEvent(long j) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(j != -9223372036854775807L);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onTransact != -9223372036854775807L);
        return j - this.onTransact;
    }
}
