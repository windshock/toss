package o;

import java.io.IOException;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BottomSheetScaffoldKtExternalSyntheticLambda1 implements BottomDrawerStateCompanionExternalSyntheticLambda1, BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted {
    private final BottomDrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallback;
    private BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted onExtraCallback;
    private final long onExtraCallbackWithResult;

    public BottomSheetScaffoldKtExternalSyntheticLambda1(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1, long j) {
        this.IAuthTabCallback = bottomDrawerStateCompanionExternalSyntheticLambda1;
        this.onExtraCallbackWithResult = j;
    }

    public BottomDrawerStateCompanionExternalSyntheticLambda1 asInterface() {
        return this.IAuthTabCallback;
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        this.onExtraCallback = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
        this.IAuthTabCallback.onExtraCallback(this, j - this.onExtraCallbackWithResult);
    }

    public void onNavigationEvent() throws IOException {
        this.IAuthTabCallback.onNavigationEvent();
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        return this.IAuthTabCallback.ab_();
    }

    public List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> onExtraCallbackWithResult(List<ColorsKtExternalSyntheticLambda0> list) {
        return this.IAuthTabCallback.onExtraCallbackWithResult(list);
    }

    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr2 = new BottomNavigationKtExternalSyntheticLambda5[bottomNavigationKtExternalSyntheticLambda5Arr.length];
        int i2 = 0;
        while (true) {
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5OnExtraCallback = null;
            if (i2 >= bottomNavigationKtExternalSyntheticLambda5Arr.length) {
                break;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) bottomNavigationKtExternalSyntheticLambda5Arr[i2];
            if (onnavigationevent != null) {
                bottomNavigationKtExternalSyntheticLambda5OnExtraCallback = onnavigationevent.onExtraCallback();
            }
            bottomNavigationKtExternalSyntheticLambda5Arr2[i2] = bottomNavigationKtExternalSyntheticLambda5OnExtraCallback;
            i2++;
        }
        long jIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(colorsKtExternalSyntheticLambda0Arr, zArr, bottomNavigationKtExternalSyntheticLambda5Arr2, zArr2, j - this.onExtraCallbackWithResult);
        for (int i3 = 0; i3 < bottomNavigationKtExternalSyntheticLambda5Arr.length; i3++) {
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 = bottomNavigationKtExternalSyntheticLambda5Arr2[i3];
            if (bottomNavigationKtExternalSyntheticLambda5 == null) {
                bottomNavigationKtExternalSyntheticLambda5Arr[i3] = null;
            } else {
                BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda52 = bottomNavigationKtExternalSyntheticLambda5Arr[i3];
                if (bottomNavigationKtExternalSyntheticLambda52 == null || ((onNavigationEvent) bottomNavigationKtExternalSyntheticLambda52).onExtraCallback() != bottomNavigationKtExternalSyntheticLambda5) {
                    bottomNavigationKtExternalSyntheticLambda5Arr[i3] = new onNavigationEvent(bottomNavigationKtExternalSyntheticLambda5, this.onExtraCallbackWithResult);
                }
            }
        }
        return jIAuthTabCallback + this.onExtraCallbackWithResult;
    }

    public void onExtraCallback(long j, boolean z) {
        this.IAuthTabCallback.onExtraCallback(j - this.onExtraCallbackWithResult, z);
    }

    public long IAuthTabCallbackStub() {
        long jIAuthTabCallbackStub = this.IAuthTabCallback.IAuthTabCallbackStub();
        if (jIAuthTabCallbackStub == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jIAuthTabCallbackStub + this.onExtraCallbackWithResult;
    }

    public long onExtraCallbackWithResult(long j) {
        return this.IAuthTabCallback.onExtraCallbackWithResult(j - this.onExtraCallbackWithResult) + this.onExtraCallbackWithResult;
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        return this.IAuthTabCallback.onExtraCallback(j - this.onExtraCallbackWithResult, selectionContainerKtExternalSyntheticLambda2) + this.onExtraCallbackWithResult;
    }

    public long onWarmupCompleted() {
        long jOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        if (jOnWarmupCompleted == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jOnWarmupCompleted + this.onExtraCallbackWithResult;
    }

    public long onExtraCallback() {
        long jOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
        if (jOnExtraCallback == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jOnExtraCallback + this.onExtraCallbackWithResult;
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        return this.IAuthTabCallback.IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onWarmupCompleted().onExtraCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1.onWarmupCompleted - this.onExtraCallbackWithResult).onExtraCallbackWithResult());
    }

    public boolean IAuthTabCallback() {
        return this.IAuthTabCallback.IAuthTabCallback();
    }

    public void IAuthTabCallback(long j) {
        this.IAuthTabCallback.IAuthTabCallback(j - this.onExtraCallbackWithResult);
    }

    @Override // o.BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted
    public void IAuthTabCallback(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).IAuthTabCallback(this);
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda8$onExtraCallback
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onWarmupCompleted(this);
    }

    static final class onNavigationEvent implements BottomNavigationKtExternalSyntheticLambda5 {
        private final BottomNavigationKtExternalSyntheticLambda5 onExtraCallback;
        private final long onWarmupCompleted;

        public onNavigationEvent(BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5, long j) {
            this.onExtraCallback = bottomNavigationKtExternalSyntheticLambda5;
            this.onWarmupCompleted = j;
        }

        public BottomNavigationKtExternalSyntheticLambda5 onExtraCallback() {
            return this.onExtraCallback;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public boolean onWarmupCompleted() {
            return this.onExtraCallback.onWarmupCompleted();
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public void onExtraCallbackWithResult() throws IOException {
            this.onExtraCallback.onExtraCallbackWithResult();
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2) {
            int iOnNavigationEvent = this.onExtraCallback.onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, i2);
            if (iOnNavigationEvent == -4) {
                selectionControllerExternalSyntheticLambda2.onWarmupCompleted += this.onWarmupCompleted;
            }
            return iOnNavigationEvent;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onExtraCallbackWithResult(long j) {
            return this.onExtraCallback.onExtraCallbackWithResult(j - this.onWarmupCompleted);
        }
    }
}
