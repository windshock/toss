package o;

import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 implements Comparable<TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0> {
    public final boolean IAuthTabCallback;
    public final long IAuthTabCallbackDefault;
    public final long onExtraCallback;
    public final File onExtraCallbackWithResult;
    public final long onNavigationEvent;
    public final String onWarmupCompleted;

    public TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0(String str, long j, long j2, long j3, @Nullable File file) {
        this.onWarmupCompleted = str;
        this.IAuthTabCallbackDefault = j;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = file != null;
        this.onExtraCallbackWithResult = file;
        this.onNavigationEvent = j3;
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback == -1;
    }

    public boolean onExtraCallback() {
        return !this.IAuthTabCallback;
    }

    @Override // java.lang.Comparable
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        if (!this.onWarmupCompleted.equals(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onWarmupCompleted)) {
            return this.onWarmupCompleted.compareTo(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onWarmupCompleted);
        }
        long j = this.IAuthTabCallbackDefault - textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.IAuthTabCallbackDefault;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public String toString() {
        return "[" + this.IAuthTabCallbackDefault + ", " + this.onExtraCallback + "]";
    }
}
