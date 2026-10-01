package o;

import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.ProgressIndicatorKtExternalSyntheticLambda6;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressIndicatorKtExternalSyntheticLambda4 extends ProgressIndicatorKtExternalSyntheticLambda6 {
    private boolean onNavigationEvent;
    private static final byte[] onExtraCallback = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] IAuthTabCallback = {79, 112, 117, 115, 84, 97, 103, 115};

    ProgressIndicatorKtExternalSyntheticLambda4() {
    }

    public static boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, onExtraCallback);
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    protected void onExtraCallbackWithResult(boolean z) {
        super.onExtraCallbackWithResult(z);
        if (z) {
            this.onNavigationEvent = false;
        }
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    protected long onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return IAuthTabCallback(ExposedDropdownMenu_androidExternalSyntheticLambda0.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()));
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda6
    @EnsuresNonNullIf
    protected boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j, ProgressIndicatorKtExternalSyntheticLambda6.onExtraCallbackWithResult onextracallbackwithresult) throws ParserException {
        if (onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, onExtraCallback)) {
            byte[] bArrCopyOf = Arrays.copyOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult());
            int iOnNavigationEvent = ExposedDropdownMenu_androidExternalSyntheticLambda0.onNavigationEvent(bArrCopyOf);
            List<byte[]> listOnExtraCallbackWithResult = ExposedDropdownMenu_androidExternalSyntheticLambda0.onExtraCallbackWithResult(bArrCopyOf);
            if (onextracallbackwithresult.onNavigationEvent != null) {
                return true;
            }
            onextracallbackwithresult.onNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("audio/ogg").IAuthTabCallbackDefault("audio/opus").onExtraCallback(iOnNavigationEvent).extraCallbackWithResult(OpusUtil.SAMPLE_RATE).IAuthTabCallback(listOnExtraCallbackWithResult).onNavigationEvent();
            return true;
        }
        byte[] bArr = IAuthTabCallback;
        if (onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, bArr)) {
            RecordingInputConnection_androidKt.onWarmupCompleted(onextracallbackwithresult.onNavigationEvent);
            if (this.onNavigationEvent) {
                return true;
            }
            this.onNavigationEvent = true;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(bArr.length);
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent((List<String>) ImmutableList.copyOf(ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, false, false).onWarmupCompleted));
            if (handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent == null) {
                return true;
            }
            onextracallbackwithresult.onNavigationEvent = onextracallbackwithresult.onNavigationEvent.onExtraCallback().onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent(onextracallbackwithresult.onNavigationEvent.ICustomTabsCallbackDefault)).onNavigationEvent();
            return true;
        }
        RecordingInputConnection_androidKt.onWarmupCompleted(onextracallbackwithresult.onNavigationEvent);
        return false;
    }

    private static boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, byte[] bArr) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < bArr.length) {
            return false;
        }
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        byte[] bArr2 = new byte[bArr.length];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr2, 0, bArr.length);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        return Arrays.equals(bArr2, bArr);
    }
}
