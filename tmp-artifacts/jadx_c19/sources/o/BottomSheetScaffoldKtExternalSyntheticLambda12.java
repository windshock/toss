package o;

import android.util.SparseArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BottomSheetScaffoldKtExternalSyntheticLambda12<V> {
    private int onExtraCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda10<V> onExtraCallbackWithResult;
    private final SparseArray<V> onWarmupCompleted;

    public BottomSheetScaffoldKtExternalSyntheticLambda12() {
        this(new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.exoplayer.source.SpannedData$$ExternalSyntheticLambda0
            public final void accept(Object obj) {
            }
        });
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda12(TextFieldDecoratorModifierNodeExternalSyntheticLambda10<V> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        this.onWarmupCompleted = new SparseArray<>();
        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda10;
        this.onExtraCallback = -1;
    }

    public V onExtraCallbackWithResult(int i2) {
        if (this.onExtraCallback == -1) {
            this.onExtraCallback = 0;
        }
        while (true) {
            int i3 = this.onExtraCallback;
            if (i3 <= 0 || i2 >= this.onWarmupCompleted.keyAt(i3)) {
                break;
            }
            this.onExtraCallback--;
        }
        while (this.onExtraCallback < this.onWarmupCompleted.size() - 1 && i2 >= this.onWarmupCompleted.keyAt(this.onExtraCallback + 1)) {
            this.onExtraCallback++;
        }
        return this.onWarmupCompleted.valueAt(this.onExtraCallback);
    }

    public void IAuthTabCallback(int i2, V v) {
        if (this.onExtraCallback == -1) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted.size() == 0);
            this.onExtraCallback = 0;
        }
        if (this.onWarmupCompleted.size() > 0) {
            SparseArray<V> sparseArray = this.onWarmupCompleted;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            RecordingInputConnection_androidKt.onNavigationEvent(i2 >= iKeyAt);
            if (iKeyAt == i2) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda10<V> textFieldDecoratorModifierNodeExternalSyntheticLambda10 = this.onExtraCallbackWithResult;
                SparseArray<V> sparseArray2 = this.onWarmupCompleted;
                textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.onWarmupCompleted.append(i2, v);
    }

    public V onExtraCallbackWithResult() {
        return this.onWarmupCompleted.valueAt(r0.size() - 1);
    }

    public void onWarmupCompleted(int i2) {
        int i3 = 0;
        while (i3 < this.onWarmupCompleted.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.onWarmupCompleted.keyAt(i4)) {
                return;
            }
            this.onExtraCallbackWithResult.accept(this.onWarmupCompleted.valueAt(i3));
            this.onWarmupCompleted.removeAt(i3);
            int i5 = this.onExtraCallback;
            if (i5 > 0) {
                this.onExtraCallback = i5 - 1;
            }
            i3 = i4;
        }
    }

    public void IAuthTabCallback(int i2) {
        for (int size = this.onWarmupCompleted.size() - 1; size >= 0 && i2 < this.onWarmupCompleted.keyAt(size); size--) {
            this.onExtraCallbackWithResult.accept(this.onWarmupCompleted.valueAt(size));
            this.onWarmupCompleted.removeAt(size);
        }
        this.onExtraCallback = this.onWarmupCompleted.size() > 0 ? Math.min(this.onExtraCallback, this.onWarmupCompleted.size() - 1) : -1;
    }

    public void onExtraCallback() {
        for (int i2 = 0; i2 < this.onWarmupCompleted.size(); i2++) {
            this.onExtraCallbackWithResult.accept(this.onWarmupCompleted.valueAt(i2));
        }
        this.onExtraCallback = -1;
        this.onWarmupCompleted.clear();
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted.size() == 0;
    }
}
