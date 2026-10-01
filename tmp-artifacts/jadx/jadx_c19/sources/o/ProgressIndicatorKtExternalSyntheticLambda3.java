package o;

import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda6;
import o.ProgressIndicatorKtExternalSyntheticLambda6;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressIndicatorKtExternalSyntheticLambda3 extends ProgressIndicatorKtExternalSyntheticLambda6 {
    private boolean IAuthTabCallback;
    private int onExtraCallback;
    private onWarmupCompleted onExtraCallbackWithResult;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onWarmupCompleted onNavigationEvent;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onExtraCallbackWithResult onWarmupCompleted;

    static int onWarmupCompleted(byte b, int i2, int i3) {
        return (b >> i3) & (OggPageHeader.MAX_SEGMENT_COUNT >>> (8 - i2));
    }

    ProgressIndicatorKtExternalSyntheticLambda3() {
    }

    public static boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        try {
            return ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onWarmupCompleted(1, textFieldDecoratorModifierNodeExternalSyntheticLambda20, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    protected void onExtraCallbackWithResult(boolean z) {
        super.onExtraCallbackWithResult(z);
        if (z) {
            this.onExtraCallbackWithResult = null;
            this.onWarmupCompleted = null;
            this.onNavigationEvent = null;
        }
        this.onExtraCallback = 0;
        this.IAuthTabCallback = false;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    protected void onNavigationEvent(long j) {
        super.onNavigationEvent(j);
        this.IAuthTabCallback = j != 0;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        this.onExtraCallback = onextracallbackwithresult != null ? onextracallbackwithresult.onWarmupCompleted : 0;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    protected long onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if ((textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[0] & 1) == 1) {
            return -1L;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[0], (onWarmupCompleted) RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallbackWithResult));
        long j = this.IAuthTabCallback ? (this.onExtraCallback + iOnExtraCallbackWithResult) / 4 : 0;
        IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, j);
        this.IAuthTabCallback = true;
        this.onExtraCallback = iOnExtraCallbackWithResult;
        return j;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    @EnsuresNonNullIf
    protected boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, ProgressIndicatorKtExternalSyntheticLambda6.onExtraCallbackWithResult onextracallbackwithresult) throws ParserException, IOException {
        if (this.onExtraCallbackWithResult != null) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = onextracallbackwithresult.onNavigationEvent;
            return false;
        }
        onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        this.onExtraCallbackWithResult = onwarmupcompletedIAuthTabCallback;
        if (onwarmupcompletedIAuthTabCallback == null) {
            return true;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onExtraCallbackWithResult onextracallbackwithresult2 = onwarmupcompletedIAuthTabCallback.onNavigationEvent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(onextracallbackwithresult2.asBinder);
        arrayList.add(onwarmupcompletedIAuthTabCallback.onWarmupCompleted);
        onextracallbackwithresult.onNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("audio/ogg").IAuthTabCallbackDefault("audio/vorbis").onNavigationEvent(onextracallbackwithresult2.IAuthTabCallback).extraCallback(onextracallbackwithresult2.onExtraCallbackWithResult).onExtraCallback(onextracallbackwithresult2.IAuthTabCallbackDefault).extraCallbackWithResult(onextracallbackwithresult2.IAuthTabCallbackStub).IAuthTabCallback(arrayList).onExtraCallbackWithResult(ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent((List<String>) ImmutableList.copyOf(onwarmupcompletedIAuthTabCallback.IAuthTabCallback.onWarmupCompleted))).onNavigationEvent();
        return true;
    }

    onWarmupCompleted IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException, IOException {
        ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        if (onextracallbackwithresult == null) {
            this.onWarmupCompleted = ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            return null;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
        if (onwarmupcompleted == null) {
            this.onNavigationEvent = ExposedDropdownMenu_androidKtExternalSyntheticLambda6.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            return null;
        }
        byte[] bArr = new byte[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult()];
        System.arraycopy(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, bArr, 0, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult());
        return new onWarmupCompleted(onextracallbackwithresult, onwarmupcompleted, bArr, ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, onextracallbackwithresult.IAuthTabCallbackDefault), ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent(r4.length - 1));
    }

    static void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback() < textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() + 4) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(Arrays.copyOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() + 4));
        } else {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() + 4);
        }
        byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
        bArrOnExtraCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() - 4] = (byte) (j & 255);
        bArrOnExtraCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() - 3] = (byte) ((j >>> 8) & 255);
        bArrOnExtraCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() - 2] = (byte) ((j >>> 16) & 255);
        bArrOnExtraCallback[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int onExtraCallbackWithResult(byte b, onWarmupCompleted onwarmupcompleted) {
        if (!onwarmupcompleted.onExtraCallback[onWarmupCompleted(b, onwarmupcompleted.onExtraCallbackWithResult, 1)].onWarmupCompleted) {
            return onwarmupcompleted.onNavigationEvent.onWarmupCompleted;
        }
        return onwarmupcompleted.onNavigationEvent.onNavigationEvent;
    }

    static final class onWarmupCompleted {
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onWarmupCompleted IAuthTabCallback;
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent[] onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onExtraCallbackWithResult onNavigationEvent;
        public final byte[] onWarmupCompleted;

        public onWarmupCompleted(ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onExtraCallbackWithResult onextracallbackwithresult, ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onWarmupCompleted onwarmupcompleted, byte[] bArr, ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent[] onnavigationeventArr, int i2) {
            this.onNavigationEvent = onextracallbackwithresult;
            this.IAuthTabCallback = onwarmupcompleted;
            this.onWarmupCompleted = bArr;
            this.onExtraCallback = onnavigationeventArr;
            this.onExtraCallbackWithResult = i2;
        }
    }
}
