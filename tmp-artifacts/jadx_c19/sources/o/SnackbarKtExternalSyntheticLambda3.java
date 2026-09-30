package o;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SnackbarKtExternalSyntheticLambda3 {

    public interface onWarmupCompleted {
        SparseArray<SnackbarKtExternalSyntheticLambda3> onExtraCallback();

        SnackbarKtExternalSyntheticLambda3 onNavigationEvent(int i2, IAuthTabCallback iAuthTabCallback);
    }

    void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, onExtraCallbackWithResult onextracallbackwithresult);

    void onNavigationEvent();

    void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) throws ParserException;

    public static final class IAuthTabCallback {
        public final String IAuthTabCallback;
        public final List<onNavigationEvent> onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final byte[] onNavigationEvent;
        public final int onWarmupCompleted;

        public int onExtraCallback() {
            int i2 = this.onWarmupCompleted;
            if (i2 != 2) {
                return i2 != 3 ? 0 : 512;
            }
            return 2048;
        }

        public IAuthTabCallback(int i2, @Nullable String str, int i3, @Nullable List<onNavigationEvent> list, byte[] bArr) {
            List<onNavigationEvent> listUnmodifiableList;
            this.onExtraCallbackWithResult = i2;
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = i3;
            if (list == null) {
                listUnmodifiableList = Collections.EMPTY_LIST;
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.onExtraCallback = listUnmodifiableList;
            this.onNavigationEvent = bArr;
        }
    }

    public static final class onNavigationEvent {
        public final byte[] onExtraCallback;
        public final int onNavigationEvent;
        public final String onWarmupCompleted;

        public onNavigationEvent(String str, int i2, byte[] bArr) {
            this.onWarmupCompleted = str;
            this.onNavigationEvent = i2;
            this.onExtraCallback = bArr;
        }
    }

    public static final class onExtraCallbackWithResult {
        private final int IAuthTabCallback;
        private final int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private String onNavigationEvent;
        private int onWarmupCompleted;

        public onExtraCallbackWithResult(int i2, int i3) {
            this(Integer.MIN_VALUE, i2, i3);
        }

        public onExtraCallbackWithResult(int i2, int i3, int i4) {
            String str;
            if (i2 != Integer.MIN_VALUE) {
                str = i2 + "/";
            } else {
                str = "";
            }
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = i3;
            this.IAuthTabCallback = i4;
            this.onWarmupCompleted = Integer.MIN_VALUE;
            this.onNavigationEvent = "";
        }

        public void onExtraCallback() {
            int i2 = this.onWarmupCompleted;
            this.onWarmupCompleted = i2 == Integer.MIN_VALUE ? this.onExtraCallback : i2 + this.IAuthTabCallback;
            this.onNavigationEvent = this.onExtraCallbackWithResult + this.onWarmupCompleted;
        }

        public int onExtraCallbackWithResult() {
            onWarmupCompleted();
            return this.onWarmupCompleted;
        }

        public String IAuthTabCallback() {
            onWarmupCompleted();
            return this.onNavigationEvent;
        }

        private void onWarmupCompleted() {
            if (this.onWarmupCompleted == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
