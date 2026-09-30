package o;

import androidx.media3.datasource.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;
import o.TextFieldSelectionState_androidKtExternalSyntheticLambda0;
import o.TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionState_androidKtExternalSyntheticLambda0 implements TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2 {
    private long onExtraCallback;
    private final TreeSet<TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0> onNavigationEvent = new TreeSet<>(new Comparator() { // from class: androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return TextFieldSelectionState_androidKtExternalSyntheticLambda0.onNavigationEvent((TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) obj, (TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) obj2);
        }
    });
    private final long onWarmupCompleted;

    @Override // o.TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2
    public boolean IAuthTabCallback() {
        return true;
    }

    public TextFieldSelectionState_androidKtExternalSyntheticLambda0(long j) {
        this.onWarmupCompleted = j;
    }

    @Override // o.TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2
    public void IAuthTabCallback(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            onWarmupCompleted(cache, j2);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.onNavigationEvent
    public void onExtraCallback(Cache cache, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        this.onNavigationEvent.add(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
        this.onExtraCallback += textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onExtraCallback;
        onWarmupCompleted(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.onNavigationEvent
    public void onExtraCallbackWithResult(Cache cache, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        this.onNavigationEvent.remove(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
        this.onExtraCallback -= textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onExtraCallback;
    }

    @Override // androidx.media3.datasource.cache.Cache.onNavigationEvent
    public void onWarmupCompleted(Cache cache, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda02) {
        onExtraCallbackWithResult(cache, textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
        onExtraCallback(cache, textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda02);
    }

    private void onWarmupCompleted(Cache cache, long j) {
        while (this.onExtraCallback + j > this.onWarmupCompleted && !this.onNavigationEvent.isEmpty()) {
            cache.IAuthTabCallback(this.onNavigationEvent.first());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onNavigationEvent(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda02) {
        long j = textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onNavigationEvent;
        long j2 = textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda02.onNavigationEvent;
        if (j - j2 == 0) {
            return textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.compareTo(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda02);
        }
        return j < j2 ? -1 : 1;
    }
}
