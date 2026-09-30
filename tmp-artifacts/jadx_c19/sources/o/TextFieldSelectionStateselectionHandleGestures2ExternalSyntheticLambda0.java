package o;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 {
    private final TreeSet<TextFieldSelectionStateKtExternalSyntheticLambda2> IAuthTabCallback;
    private final ArrayList<IAuthTabCallback> onExtraCallback;
    public final String onExtraCallbackWithResult;
    public final int onNavigationEvent;
    private TextFieldSelectionStateKtExternalSyntheticLambda0 onWarmupCompleted;

    public TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0(int i2, String str) {
        this(i2, str, TextFieldSelectionStateKtExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    public TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0(int i2, String str, TextFieldSelectionStateKtExternalSyntheticLambda0 textFieldSelectionStateKtExternalSyntheticLambda0) {
        this.onNavigationEvent = i2;
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = textFieldSelectionStateKtExternalSyntheticLambda0;
        this.IAuthTabCallback = new TreeSet<>();
        this.onExtraCallback = new ArrayList<>();
    }

    public TextFieldSelectionStateKtExternalSyntheticLambda0 IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public boolean onExtraCallbackWithResult(TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1) {
        this.onWarmupCompleted = this.onWarmupCompleted.onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda1);
        return !r2.equals(r0);
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback.isEmpty();
    }

    public boolean onNavigationEvent(long j, long j2) {
        for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
            if (this.onExtraCallback.get(i2).onExtraCallbackWithResult(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public boolean onExtraCallback(long j, long j2) {
        for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
            if (this.onExtraCallback.get(i2).onNavigationEvent(j, j2)) {
                return false;
            }
        }
        this.onExtraCallback.add(new IAuthTabCallback(j, j2));
        return true;
    }

    public void onWarmupCompleted(long j) {
        for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
            if (this.onExtraCallback.get(i2).onExtraCallback == j) {
                this.onExtraCallback.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public void IAuthTabCallback(TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2) {
        this.IAuthTabCallback.add(textFieldSelectionStateKtExternalSyntheticLambda2);
    }

    public TreeSet<TextFieldSelectionStateKtExternalSyntheticLambda2> onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public TextFieldSelectionStateKtExternalSyntheticLambda2 onExtraCallbackWithResult(long j, long j2) {
        TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2OnNavigationEvent = TextFieldSelectionStateKtExternalSyntheticLambda2.onNavigationEvent(this.onExtraCallbackWithResult, j);
        TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2Floor = this.IAuthTabCallback.floor(textFieldSelectionStateKtExternalSyntheticLambda2OnNavigationEvent);
        if (textFieldSelectionStateKtExternalSyntheticLambda2Floor != null && textFieldSelectionStateKtExternalSyntheticLambda2Floor.IAuthTabCallbackDefault + textFieldSelectionStateKtExternalSyntheticLambda2Floor.onExtraCallback > j) {
            return textFieldSelectionStateKtExternalSyntheticLambda2Floor;
        }
        TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2Ceiling = this.IAuthTabCallback.ceiling(textFieldSelectionStateKtExternalSyntheticLambda2OnNavigationEvent);
        if (textFieldSelectionStateKtExternalSyntheticLambda2Ceiling != null) {
            long j3 = textFieldSelectionStateKtExternalSyntheticLambda2Ceiling.IAuthTabCallbackDefault - j;
            j2 = j2 != -1 ? Math.min(j3, j2) : j3;
        }
        return TextFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallbackWithResult, j, j2);
    }

    public long onWarmupCompleted(long j, long j2) {
        RecordingInputConnection_androidKt.onNavigationEvent(j >= 0);
        RecordingInputConnection_androidKt.onNavigationEvent(j2 >= 0);
        TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult = onExtraCallbackWithResult(j, j2);
        if (textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.onExtraCallback()) {
            return -Math.min(textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.onWarmupCompleted() ? Long.MAX_VALUE : textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.onExtraCallback, j2);
        }
        long j3 = j + j2;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        long jMax = textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.IAuthTabCallbackDefault + textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.onExtraCallback;
        if (jMax < j4) {
            for (TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2 : this.IAuthTabCallback.tailSet(textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult, false)) {
                long j5 = textFieldSelectionStateKtExternalSyntheticLambda2.IAuthTabCallbackDefault;
                if (j5 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j5 + textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallback);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public TextFieldSelectionStateKtExternalSyntheticLambda2 onWarmupCompleted(TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2, long j, boolean z) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.remove(textFieldSelectionStateKtExternalSyntheticLambda2));
        File file = (File) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallbackWithResult);
        if (z) {
            File fileOnExtraCallbackWithResult = TextFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallbackWithResult((File) RecordingInputConnection_androidKt.onExtraCallbackWithResult(file.getParentFile()), this.onNavigationEvent, textFieldSelectionStateKtExternalSyntheticLambda2.IAuthTabCallbackDefault, j);
            if (file.renameTo(fileOnExtraCallbackWithResult)) {
                file = fileOnExtraCallbackWithResult;
            } else {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CachedContent", "Failed to rename " + file + " to " + fileOnExtraCallbackWithResult);
            }
        }
        TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallback = textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallback(file, j);
        this.IAuthTabCallback.add(textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallback);
        return textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallback;
    }

    public boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback.isEmpty();
    }

    public boolean onExtraCallbackWithResult(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        if (!this.IAuthTabCallback.remove(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0)) {
            return false;
        }
        File file = textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onExtraCallbackWithResult;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public int hashCode() {
        return (((this.onNavigationEvent * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = (TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0) obj;
        return this.onNavigationEvent == textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent && this.onExtraCallbackWithResult.equals(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult) && this.IAuthTabCallback.equals(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.IAuthTabCallback) && this.onWarmupCompleted.equals(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onWarmupCompleted);
    }

    static final class IAuthTabCallback {
        public final long onExtraCallback;
        public final long onExtraCallbackWithResult;

        public IAuthTabCallback(long j, long j2) {
            this.onExtraCallback = j;
            this.onExtraCallbackWithResult = j2;
        }

        public boolean onExtraCallbackWithResult(long j, long j2) {
            long j3 = this.onExtraCallbackWithResult;
            if (j3 == -1) {
                return j >= this.onExtraCallback;
            }
            if (j2 == -1) {
                return false;
            }
            long j4 = this.onExtraCallback;
            return j4 <= j && j + j2 <= j4 + j3;
        }

        public boolean onNavigationEvent(long j, long j2) {
            long j3 = this.onExtraCallback;
            if (j3 > j) {
                return j2 == -1 || j + j2 > j3;
            }
            long j4 = this.onExtraCallbackWithResult;
            return j4 == -1 || j3 + j4 > j;
        }
    }
}
