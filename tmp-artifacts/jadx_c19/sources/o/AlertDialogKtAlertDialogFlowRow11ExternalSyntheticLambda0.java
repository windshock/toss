package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.RendererCapabilities;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.AnchoredDraggableStateExternalSyntheticLambda4;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0 extends SelectionControllerExternalSyntheticLambda0<SelectionControllerExternalSyntheticLambda2, AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0, AnchoredDraggableStateExternalSyntheticLambda5> implements AnchoredDraggableStateExternalSyntheticLambda4 {
    private final onNavigationEvent IAuthTabCallback;
    private final Context onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    @Deprecated
    public interface onNavigationEvent {
        Bitmap IAuthTabCallback(byte[] bArr, int i2) throws AnchoredDraggableStateExternalSyntheticLambda5;
    }

    @Override // o.AnchoredDraggableStateExternalSyntheticLambda4
    /* renamed from: asInterface */
    public /* synthetic */ AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0 onWarmupCompleted() throws AnchoredDraggableStateExternalSyntheticLambda5 {
        return (AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0) super.onWarmupCompleted();
    }

    public static final class onExtraCallbackWithResult implements AnchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback {
        private final Context IAuthTabCallback;
        private final onNavigationEvent onExtraCallback;
        private int onNavigationEvent;

        @Deprecated
        public onExtraCallbackWithResult() {
            this(null, null);
        }

        public onExtraCallbackWithResult(Context context) {
            this(context, null);
        }

        private onExtraCallbackWithResult(@Nullable Context context, @Nullable onNavigationEvent onnavigationevent) {
            this.IAuthTabCallback = context;
            this.onExtraCallback = onnavigationevent;
            this.onNavigationEvent = -1;
        }

        @Override // o.AnchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback
        public int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            if (str == null || !AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.IAuthTabCallbackStub(str)) {
                return RendererCapabilities.IAuthTabCallback(0);
            }
            if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
                return RendererCapabilities.IAuthTabCallback(4);
            }
            return RendererCapabilities.IAuthTabCallback(1);
        }

        @Override // o.AnchoredDraggableStateExternalSyntheticLambda4.IAuthTabCallback
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0 IAuthTabCallback() {
            return new AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0(this.IAuthTabCallback, this.onExtraCallback, this.onNavigationEvent);
        }
    }

    private AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0(@Nullable Context context, @Nullable onNavigationEvent onnavigationevent, int i2) {
        super(new SelectionControllerExternalSyntheticLambda2[1], new AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0[1]);
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallback = onnavigationevent;
        this.onWarmupCompleted = i2;
    }

    @Override // o.SelectionControllerExternalSyntheticLambda0
    public SelectionControllerExternalSyntheticLambda2 onNavigationEvent() {
        return new SelectionControllerExternalSyntheticLambda2(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SelectionControllerExternalSyntheticLambda0
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0 onTransact() {
        return new AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0() { // from class: o.AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0.5
            @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda0
            public void asInterface() {
                AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0.this.onWarmupCompleted((AlertDialogKtAlertDialogFlowRow11ExternalSyntheticLambda0) this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SelectionControllerExternalSyntheticLambda0
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public AnchoredDraggableStateExternalSyntheticLambda5 onWarmupCompleted(Throwable th) {
        return new AnchoredDraggableStateExternalSyntheticLambda5("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SelectionControllerExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public AnchoredDraggableStateExternalSyntheticLambda5 onNavigationEvent(SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, AnchoredDraggableKtanimateTo2ExternalSyntheticLambda0 anchoredDraggableKtanimateTo2ExternalSyntheticLambda0, boolean z) {
        ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(selectionControllerExternalSyntheticLambda2.onExtraCallback);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(byteBuffer.hasArray());
        RecordingInputConnection_androidKt.onNavigationEvent(byteBuffer.arrayOffset() == 0);
        onNavigationEvent onnavigationevent = this.IAuthTabCallback;
        if (onnavigationevent != null) {
            try {
                anchoredDraggableKtanimateTo2ExternalSyntheticLambda0.onExtraCallback = onnavigationevent.IAuthTabCallback(byteBuffer.array(), byteBuffer.remaining());
            } catch (AnchoredDraggableStateExternalSyntheticLambda5 e) {
                return e;
            }
        } else {
            try {
                int iMax = this.onWarmupCompleted;
                if (iMax == -1) {
                    Context context = this.onExtraCallbackWithResult;
                    if (context != null) {
                        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                        Point point = (Point) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1578219381, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{context}, 1578219386);
                        int i2 = point.x;
                        int i3 = point.y;
                        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = selectionControllerExternalSyntheticLambda2.onExtraCallbackWithResult;
                        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 != null) {
                            int i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.newSessionWithExtras;
                            if (i4 != -1) {
                                i2 *= i4;
                            }
                            int i5 = basicTextContextMenuProviderKtExternalSyntheticLambda4.requestPostMessageChannelWithExtras;
                            if (i5 != -1) {
                                i3 *= i5;
                            }
                        }
                        iMax = (Math.max(i2, i3) << 1) - 1;
                    } else {
                        iMax = 4096;
                    }
                }
                anchoredDraggableKtanimateTo2ExternalSyntheticLambda0.onExtraCallback = TransformedTextFieldStateExternalSyntheticLambda1.IAuthTabCallback(byteBuffer.array(), byteBuffer.remaining(), (BitmapFactory.Options) null, iMax);
            } catch (IOException e2) {
                return new AnchoredDraggableStateExternalSyntheticLambda5(e2);
            } catch (ParserException e3) {
                return new AnchoredDraggableStateExternalSyntheticLambda5("Could not decode image data with BitmapFactory.", e3);
            }
        }
        anchoredDraggableKtanimateTo2ExternalSyntheticLambda0.onNavigationEvent = selectionControllerExternalSyntheticLambda2.onWarmupCompleted;
        return null;
    }
}
