package o;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;
import o.RadioButtonDefaults;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ScaffoldKtExternalSyntheticLambda1 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda5 {
    private RippleKtExternalSyntheticLambda0 IAuthTabCallback;
    private boolean asBinder;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback asInterface;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallback;
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onNavigationEvent;
    private final ProgressIndicatorKtExternalSyntheticLambda8 onExtraCallbackWithResult = new ProgressIndicatorKtExternalSyntheticLambda8();
    private int IAuthTabCallbackStub = 0;
    private int IAuthTabCallbackDefault = 0;
    private byte[] onTransact = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onWarmupCompleted = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    public ScaffoldKtExternalSyntheticLambda1(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this.onNavigationEvent = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
        this.asInterface = onextracallback;
    }

    public void IAuthTabCallback(boolean z) {
        this.asBinder = z;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        RecordingInputConnection_androidKt.onNavigationEvent(AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) == 3);
        if (!basicTextContextMenuProviderKtExternalSyntheticLambda4.equals(this.onExtraCallback)) {
            this.onExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.IAuthTabCallback = this.asInterface.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4) ? this.asInterface.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) : null;
        }
        if (this.IAuthTabCallback == null) {
            this.onNavigationEvent.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        } else {
            this.onNavigationEvent.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().IAuthTabCallbackDefault("application/x-media3-cues").onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable).onExtraCallback(Long.MAX_VALUE).IAuthTabCallbackStub(this.asInterface.onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4)).onNavigationEvent());
        }
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public int IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, int i2, boolean z, int i3) throws IOException {
        if (this.IAuthTabCallback == null) {
            return this.onNavigationEvent.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda0, i2, z, i3);
        }
        onExtraCallback(i2);
        int iOnWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda0.onWarmupCompleted(this.onTransact, this.IAuthTabCallbackDefault, i2);
        if (iOnWarmupCompleted != -1) {
            this.IAuthTabCallbackDefault += iOnWarmupCompleted;
            return iOnWarmupCompleted;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) {
        if (this.IAuthTabCallback == null) {
            this.onNavigationEvent.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2, i3);
            return;
        }
        onExtraCallback(i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onTransact, this.IAuthTabCallbackDefault, i2);
        this.IAuthTabCallbackDefault += i2;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public void onExtraCallback(final long j, final int i2, int i3, int i4, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
        if (this.IAuthTabCallback == null) {
            this.onNavigationEvent.onExtraCallback(j, i2, i3, i4, iAuthTabCallback);
            return;
        }
        RecordingInputConnection_androidKt.onExtraCallback(iAuthTabCallback == null, "DRM on subtitles is not supported");
        int i5 = (this.IAuthTabCallbackDefault - i4) - i3;
        try {
            this.IAuthTabCallback.IAuthTabCallback(this.onTransact, i5, i3, RippleKtExternalSyntheticLambda0.onNavigationEvent.onWarmupCompleted(), new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.extractor.text.SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0
                public final void accept(Object obj) {
                    this.f$0.onExtraCallbackWithResult((RadioButtonDefaults) obj, j, i2);
                }
            });
        } catch (RuntimeException e) {
            if (this.asBinder) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i6 = i5 + i3;
        this.IAuthTabCallbackStub = i6;
        if (i6 == this.IAuthTabCallbackDefault) {
            this.IAuthTabCallbackStub = 0;
            this.IAuthTabCallbackDefault = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(RadioButtonDefaults radioButtonDefaults, long j, int i2) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallback);
        byte[] bArrOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(radioButtonDefaults.onNavigationEvent, radioButtonDefaults.onExtraCallbackWithResult);
        this.onWarmupCompleted.onWarmupCompleted(bArrOnWarmupCompleted);
        this.onNavigationEvent.onNavigationEvent(this.onWarmupCompleted, bArrOnWarmupCompleted.length);
        long j2 = radioButtonDefaults.onExtraCallback;
        if (j2 == -9223372036854775807L) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback.newSession == Long.MAX_VALUE);
        } else {
            long j3 = this.onExtraCallback.newSession;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        this.onNavigationEvent.onExtraCallback(j, i2 | 1, bArrOnWarmupCompleted.length, 0, null);
    }

    private void onExtraCallback(int i2) {
        int length = this.onTransact.length;
        int i3 = this.IAuthTabCallbackDefault;
        if (length - i3 >= i2) {
            return;
        }
        int i4 = i3 - this.IAuthTabCallbackStub;
        int iMax = Math.max(i4 << 1, i2 + i4);
        byte[] bArr = this.onTransact;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.IAuthTabCallbackStub, bArr2, 0, i4);
        this.IAuthTabCallbackStub = 0;
        this.IAuthTabCallbackDefault = i4;
        this.onTransact = bArr2;
    }
}
