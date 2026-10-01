package o;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface HorizontalCenterOpticallyKtExternalSyntheticLambda0 {

    public interface onWarmupCompleted {
        int IAuthTabCallback(int i2);

        int onWarmupCompleted(int i2);
    }

    FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 onExtraCallbackWithResult(int i2);

    onWarmupCompleted onWarmupCompleted(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);

    public static class onExtraCallbackWithResult implements HorizontalCenterOpticallyKtExternalSyntheticLambda0 {
        SparseArray<List<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1>> onWarmupCompleted = new SparseArray<>();

        @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0
        public FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 onExtraCallbackWithResult(int i2) {
            List<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> list = this.onWarmupCompleted.get(i2);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i2);
            }
            return list.get(0);
        }

        @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0
        public onWarmupCompleted onWarmupCompleted(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
            return new onNavigationEvent(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);
        }

        class onNavigationEvent implements onWarmupCompleted {
            final FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 onNavigationEvent;

            @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0.onWarmupCompleted
            public int onWarmupCompleted(int i2) {
                return i2;
            }

            onNavigationEvent(FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
                this.onNavigationEvent = floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1;
            }

            @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0.onWarmupCompleted
            public int IAuthTabCallback(int i2) {
                List<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> arrayList = onExtraCallbackWithResult.this.onWarmupCompleted.get(i2);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    onExtraCallbackWithResult.this.onWarmupCompleted.put(i2, arrayList);
                }
                if (!arrayList.contains(this.onNavigationEvent)) {
                    arrayList.add(this.onNavigationEvent);
                }
                return i2;
            }
        }
    }

    public static class onExtraCallback implements HorizontalCenterOpticallyKtExternalSyntheticLambda0 {
        SparseArray<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> onNavigationEvent = new SparseArray<>();
        int onExtraCallback = 0;

        int onExtraCallbackWithResult(FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
            int i2 = this.onExtraCallback;
            this.onExtraCallback = i2 + 1;
            this.onNavigationEvent.put(i2, floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);
            return i2;
        }

        @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0
        public FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 onExtraCallbackWithResult(int i2) {
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = this.onNavigationEvent.get(i2);
            if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 != null) {
                return floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i2);
        }

        @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0
        public onWarmupCompleted onWarmupCompleted(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
            return new onExtraCallbackWithResult(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);
        }

        class onExtraCallbackWithResult implements onWarmupCompleted {
            final FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 IAuthTabCallback;
            private SparseIntArray onExtraCallback = new SparseIntArray(1);
            private SparseIntArray onExtraCallbackWithResult = new SparseIntArray(1);

            onExtraCallbackWithResult(FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
                this.IAuthTabCallback = floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1;
            }

            @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0.onWarmupCompleted
            public int IAuthTabCallback(int i2) {
                int iIndexOfKey = this.onExtraCallback.indexOfKey(i2);
                if (iIndexOfKey >= 0) {
                    return this.onExtraCallback.valueAt(iIndexOfKey);
                }
                int iOnExtraCallbackWithResult = onExtraCallback.this.onExtraCallbackWithResult(this.IAuthTabCallback);
                this.onExtraCallback.put(i2, iOnExtraCallbackWithResult);
                this.onExtraCallbackWithResult.put(iOnExtraCallbackWithResult, i2);
                return iOnExtraCallbackWithResult;
            }

            @Override // o.HorizontalCenterOpticallyKtExternalSyntheticLambda0.onWarmupCompleted
            public int onWarmupCompleted(int i2) {
                int iIndexOfKey = this.onExtraCallbackWithResult.indexOfKey(i2);
                if (iIndexOfKey < 0) {
                    throw new IllegalStateException("requested global type " + i2 + " does not belong to the adapter:" + this.IAuthTabCallback.IAuthTabCallback);
                }
                return this.onExtraCallbackWithResult.valueAt(iIndexOfKey);
            }
        }
    }
}
