package o;

import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import java.util.Collections;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda23;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ListItemKtExternalSyntheticLambda3 extends TagPayloadReader {
    private static final int[] onWarmupCompleted = {5512, 11025, 22050, 44100};
    private boolean IAuthTabCallback;
    private boolean onExtraCallbackWithResult;
    private int onNavigationEvent;

    public ListItemKtExternalSyntheticLambda3(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
        super(exposedDropdownMenu_androidKtExternalSyntheticLambda5);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException] */
    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        if (!this.onExtraCallbackWithResult) {
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int i2 = (iOnMinimized >> 4) & 15;
            this.onNavigationEvent = i2;
            if (i2 == 2) {
                this.onExtraCallback.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("video/x-flv").IAuthTabCallbackDefault("audio/mpeg").onExtraCallback(1).extraCallbackWithResult(onWarmupCompleted[(iOnMinimized >> 2) & 3]).onNavigationEvent());
                this.IAuthTabCallback = true;
            } else if (i2 == 7 || i2 == 8) {
                this.onExtraCallback.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("video/x-flv").IAuthTabCallbackDefault(i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").onExtraCallback(1).extraCallbackWithResult(8000).onNavigationEvent());
                this.IAuthTabCallback = true;
            } else if (i2 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.onNavigationEvent);
            }
            this.onExtraCallbackWithResult = true;
        } else {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) throws ParserException {
        if (this.onNavigationEvent == 2) {
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
            this.onExtraCallback.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnNavigationEvent);
            this.onExtraCallback.onExtraCallback(j, 1, iOnNavigationEvent, 0, null);
            return true;
        }
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        if (iOnMinimized == 0 && !this.IAuthTabCallback) {
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
            byte[] bArr = new byte[iOnNavigationEvent2];
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, iOnNavigationEvent2);
            DrawerKtExternalSyntheticLambda23.onWarmupCompleted onwarmupcompletedIAuthTabCallback = DrawerKtExternalSyntheticLambda23.IAuthTabCallback(bArr);
            this.onExtraCallback.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("video/x-flv").IAuthTabCallbackDefault("audio/mp4a-latm").onExtraCallback(onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult).onExtraCallback(onwarmupcompletedIAuthTabCallback.onExtraCallback).extraCallbackWithResult(onwarmupcompletedIAuthTabCallback.IAuthTabCallback).IAuthTabCallback(Collections.singletonList(bArr)).onNavigationEvent());
            this.IAuthTabCallback = true;
            return false;
        }
        if (this.onNavigationEvent == 10 && iOnMinimized != 1) {
            return false;
        }
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
        this.onExtraCallback.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnNavigationEvent3);
        this.onExtraCallback.onExtraCallback(j, 1, iOnNavigationEvent3, 0, null);
        return true;
    }
}
