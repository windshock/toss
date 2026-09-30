package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;
import o.TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2;
import o.TextFieldSelectionState_androidKtExternalSyntheticLambda1;
import o.TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface Cache {

    public interface onNavigationEvent {
        void onExtraCallback(Cache cache, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);

        void onExtraCallbackWithResult(Cache cache, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);

        void onWarmupCompleted(Cache cache, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda02);
    }

    File IAuthTabCallback(String str, long j, long j2) throws CacheException;

    void IAuthTabCallback(String str);

    void IAuthTabCallback(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);

    TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 onExtraCallback(String str, long j, long j2) throws InterruptedException, CacheException;

    long onExtraCallbackWithResult(String str, long j, long j2);

    void onExtraCallbackWithResult(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);

    long onNavigationEvent();

    TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 onNavigationEvent(String str);

    TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 onNavigationEvent(String str, long j, long j2) throws CacheException;

    void onNavigationEvent(File file, long j) throws CacheException;

    long onWarmupCompleted(String str, long j, long j2);

    void onWarmupCompleted(String str, TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1) throws CacheException;

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }
    }
}
