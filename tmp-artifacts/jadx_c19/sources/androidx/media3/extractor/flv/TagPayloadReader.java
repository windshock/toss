package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda20;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TagPayloadReader {
    public final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallback;

    protected abstract boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException;

    protected abstract boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) throws ParserException;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    public TagPayloadReader(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
        this.onExtraCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
    }

    public final boolean onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) throws ParserException {
        return onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20) && onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, j);
    }
}
