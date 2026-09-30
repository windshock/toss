package o;

import o.TextFieldSelectionStateExternalSyntheticLambda12;
import o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0 {
    public static final TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0 onNavigationEvent = new TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0() { // from class: androidx.media3.datasource.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0
        public final String buildCacheKey(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) {
            return TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda0.IAuthTabCallback(textFieldSelectionStateExternalSyntheticLambda12);
        }
    };

    String buildCacheKey(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12);

    static /* synthetic */ String IAuthTabCallback(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) {
        String str = textFieldSelectionStateExternalSyntheticLambda12.IAuthTabCallbackStub;
        return str != null ? str : textFieldSelectionStateExternalSyntheticLambda12.asInterface.toString();
    }
}
