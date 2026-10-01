package o;

import androidx.media3.exoplayer.source.ClippingMediaSource;
import java.io.IOException;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldKtExternalSyntheticLambda25 implements BottomDrawerStateCompanionExternalSyntheticLambda1, BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted {
    long IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private onNavigationEvent[] asInterface = new onNavigationEvent[0];
    private ClippingMediaSource.IllegalClippingException onExtraCallback;
    private BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted onExtraCallbackWithResult;
    long onNavigationEvent;
    public final BottomDrawerStateCompanionExternalSyntheticLambda1 onWarmupCompleted;

    public BackdropScaffoldKtExternalSyntheticLambda25(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1, boolean z, long j, long j2) {
        this.onWarmupCompleted = bottomDrawerStateCompanionExternalSyntheticLambda1;
        this.IAuthTabCallbackDefault = z ? j : -9223372036854775807L;
        this.IAuthTabCallback = j;
        this.onNavigationEvent = j2;
    }

    public void onExtraCallbackWithResult(long j, long j2) {
        this.IAuthTabCallback = j;
        this.onNavigationEvent = j2;
    }

    public void onExtraCallbackWithResult(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.onExtraCallback = illegalClippingException;
    }

    public void onExtraCallback(BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted, long j) {
        this.onExtraCallbackWithResult = bottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted;
        this.onWarmupCompleted.onExtraCallback(this, j);
    }

    public void onNavigationEvent() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.onExtraCallback;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.onWarmupCompleted.onNavigationEvent();
    }

    public List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> onExtraCallbackWithResult(List<ColorsKtExternalSyntheticLambda0> list) {
        return this.onWarmupCompleted.onExtraCallbackWithResult(list);
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 ab_() {
        return this.onWarmupCompleted.ab_();
    }

    public long IAuthTabCallback(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j) {
        this.asInterface = new onNavigationEvent[bottomNavigationKtExternalSyntheticLambda5Arr.length];
        BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr2 = new BottomNavigationKtExternalSyntheticLambda5[bottomNavigationKtExternalSyntheticLambda5Arr.length];
        int i2 = 0;
        while (true) {
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 = null;
            if (i2 >= bottomNavigationKtExternalSyntheticLambda5Arr.length) {
                break;
            }
            onNavigationEvent[] onnavigationeventArr = this.asInterface;
            onNavigationEvent onnavigationevent = (onNavigationEvent) bottomNavigationKtExternalSyntheticLambda5Arr[i2];
            onnavigationeventArr[i2] = onnavigationevent;
            if (onnavigationevent != null) {
                bottomNavigationKtExternalSyntheticLambda5 = onnavigationevent.onWarmupCompleted;
            }
            bottomNavigationKtExternalSyntheticLambda5Arr2[i2] = bottomNavigationKtExternalSyntheticLambda5;
            i2++;
        }
        long jIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(colorsKtExternalSyntheticLambda0Arr, zArr, bottomNavigationKtExternalSyntheticLambda5Arr2, zArr2, j);
        long jOnExtraCallback = onExtraCallback(jIAuthTabCallback, j, this.onNavigationEvent);
        this.IAuthTabCallbackDefault = (onTransact() && IAuthTabCallback(jIAuthTabCallback, j, colorsKtExternalSyntheticLambda0Arr)) ? jOnExtraCallback : -9223372036854775807L;
        for (int i3 = 0; i3 < bottomNavigationKtExternalSyntheticLambda5Arr.length; i3++) {
            BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda52 = bottomNavigationKtExternalSyntheticLambda5Arr2[i3];
            if (bottomNavigationKtExternalSyntheticLambda52 == null) {
                this.asInterface[i3] = null;
            } else {
                onNavigationEvent[] onnavigationeventArr2 = this.asInterface;
                onNavigationEvent onnavigationevent2 = onnavigationeventArr2[i3];
                if (onnavigationevent2 == null || onnavigationevent2.onWarmupCompleted != bottomNavigationKtExternalSyntheticLambda52) {
                    onnavigationeventArr2[i3] = new onNavigationEvent(bottomNavigationKtExternalSyntheticLambda52);
                }
            }
            bottomNavigationKtExternalSyntheticLambda5Arr[i3] = this.asInterface[i3];
        }
        return jOnExtraCallback;
    }

    public void onExtraCallback(long j, boolean z) {
        this.onWarmupCompleted.onExtraCallback(j, z);
    }

    public void IAuthTabCallback(long j) {
        this.onWarmupCompleted.IAuthTabCallback(j);
    }

    public long IAuthTabCallbackStub() {
        if (onTransact()) {
            long j = this.IAuthTabCallbackDefault;
            this.IAuthTabCallbackDefault = -9223372036854775807L;
            long jIAuthTabCallbackStub = IAuthTabCallbackStub();
            return jIAuthTabCallbackStub != -9223372036854775807L ? jIAuthTabCallbackStub : j;
        }
        long jIAuthTabCallbackStub2 = this.onWarmupCompleted.IAuthTabCallbackStub();
        if (jIAuthTabCallbackStub2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return onExtraCallback(jIAuthTabCallbackStub2, this.IAuthTabCallback, this.onNavigationEvent);
    }

    public long onWarmupCompleted() {
        long jOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        if (jOnWarmupCompleted != Long.MIN_VALUE) {
            long j = this.onNavigationEvent;
            if (j == Long.MIN_VALUE || jOnWarmupCompleted < j) {
                return jOnWarmupCompleted;
            }
        }
        return Long.MIN_VALUE;
    }

    public long onExtraCallbackWithResult(long j) {
        this.IAuthTabCallbackDefault = -9223372036854775807L;
        for (onNavigationEvent onnavigationevent : this.asInterface) {
            if (onnavigationevent != null) {
                onnavigationevent.IAuthTabCallback();
            }
        }
        return onExtraCallback(this.onWarmupCompleted.onExtraCallbackWithResult(j), this.IAuthTabCallback, this.onNavigationEvent);
    }

    public long onExtraCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        long j2 = this.IAuthTabCallback;
        if (j == j2) {
            return j2;
        }
        return this.onWarmupCompleted.onExtraCallback(j, onWarmupCompleted(j, selectionContainerKtExternalSyntheticLambda2));
    }

    public long onExtraCallback() {
        long jOnExtraCallback = this.onWarmupCompleted.onExtraCallback();
        if (jOnExtraCallback != Long.MIN_VALUE) {
            long j = this.onNavigationEvent;
            if (j == Long.MIN_VALUE || jOnExtraCallback < j) {
                return jOnExtraCallback;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        return this.onWarmupCompleted.IAuthTabCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1);
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted.IAuthTabCallback();
    }

    @Override // o.BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted
    public void IAuthTabCallback(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        if (this.onExtraCallback != null) {
            return;
        }
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).IAuthTabCallback(this);
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda8$onExtraCallback
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        ((BottomDrawerStateCompanionExternalSyntheticLambda1$onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult)).onWarmupCompleted(this);
    }

    boolean onTransact() {
        return this.IAuthTabCallbackDefault != -9223372036854775807L;
    }

    private SelectionContainerKtExternalSyntheticLambda2 onWarmupCompleted(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        long jOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda2.IAuthTabCallbackDefault, 0L, j - this.IAuthTabCallback);
        long j2 = selectionContainerKtExternalSyntheticLambda2.asInterface;
        long j3 = this.onNavigationEvent;
        long jOnWarmupCompleted2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jOnWarmupCompleted == selectionContainerKtExternalSyntheticLambda2.IAuthTabCallbackDefault && jOnWarmupCompleted2 == selectionContainerKtExternalSyntheticLambda2.asInterface) ? selectionContainerKtExternalSyntheticLambda2 : new SelectionContainerKtExternalSyntheticLambda2(jOnWarmupCompleted, jOnWarmupCompleted2);
    }

    private static boolean IAuthTabCallback(long j, long j2, ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr) {
        if (j < j2) {
            return true;
        }
        if (j != 0) {
            for (ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 : colorsKtExternalSyntheticLambda0Arr) {
                if (colorsKtExternalSyntheticLambda0 != null) {
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = colorsKtExternalSyntheticLambda0.IAuthTabCallback();
                    if (!AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.isEngagementSignalsApiAvailable, basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.IAuthTabCallbackStub)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static long onExtraCallback(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    final class onNavigationEvent implements BottomNavigationKtExternalSyntheticLambda5 {
        private boolean onExtraCallbackWithResult;
        public final BottomNavigationKtExternalSyntheticLambda5 onWarmupCompleted;

        public onNavigationEvent(BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5) {
            this.onWarmupCompleted = bottomNavigationKtExternalSyntheticLambda5;
        }

        public void IAuthTabCallback() {
            this.onExtraCallbackWithResult = false;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public boolean onWarmupCompleted() {
            return !BackdropScaffoldKtExternalSyntheticLambda25.this.onTransact() && this.onWarmupCompleted.onWarmupCompleted();
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public void onExtraCallbackWithResult() throws IOException {
            this.onWarmupCompleted.onExtraCallbackWithResult();
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2) {
            if (BackdropScaffoldKtExternalSyntheticLambda25.this.onTransact()) {
                return -3;
            }
            if (this.onExtraCallbackWithResult) {
                selectionControllerExternalSyntheticLambda2.onNavigationEvent(4);
                return -4;
            }
            long jOnWarmupCompleted = BackdropScaffoldKtExternalSyntheticLambda25.this.onWarmupCompleted();
            int iOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, i2);
            if (iOnNavigationEvent == -5) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted);
                int i3 = basicTextContextMenuProviderKtExternalSyntheticLambda4.access100;
                if (i3 != 0 || basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult != 0) {
                    BackdropScaffoldKtExternalSyntheticLambda25 backdropScaffoldKtExternalSyntheticLambda25 = BackdropScaffoldKtExternalSyntheticLambda25.this;
                    if (backdropScaffoldKtExternalSyntheticLambda25.IAuthTabCallback != 0) {
                        i3 = 0;
                    }
                    androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onTransact(i3).asBinder(backdropScaffoldKtExternalSyntheticLambda25.onNavigationEvent == Long.MIN_VALUE ? basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult : 0).onNavigationEvent();
                }
                return -5;
            }
            long j = BackdropScaffoldKtExternalSyntheticLambda25.this.onNavigationEvent;
            if (j == Long.MIN_VALUE || ((iOnNavigationEvent != -4 || selectionControllerExternalSyntheticLambda2.onWarmupCompleted < j) && !(iOnNavigationEvent == -3 && jOnWarmupCompleted == Long.MIN_VALUE && !selectionControllerExternalSyntheticLambda2.IAuthTabCallbackDefault))) {
                return iOnNavigationEvent;
            }
            selectionControllerExternalSyntheticLambda2.onNavigationEvent();
            selectionControllerExternalSyntheticLambda2.onNavigationEvent(4);
            this.onExtraCallbackWithResult = true;
            return -4;
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda5
        public int onExtraCallbackWithResult(long j) {
            if (BackdropScaffoldKtExternalSyntheticLambda25.this.onTransact()) {
                return -3;
            }
            return this.onWarmupCompleted.onExtraCallbackWithResult(j);
        }
    }
}
