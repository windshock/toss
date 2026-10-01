package o;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.ChipKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ChipKtExternalSyntheticLambda3 implements ColorsKtExternalSyntheticLambda0 {
    private final long[] IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private boolean asBinder;
    public final int onExtraCallback;
    protected final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onExtraCallbackWithResult;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4[] onNavigationEvent;
    private int onTransact;
    protected final int[] onWarmupCompleted;

    @Override // o.ColorsKtExternalSyntheticLambda0
    public void asInterface() {
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public void onExtraCallback(float f) {
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public void onTransact() {
    }

    public ChipKtExternalSyntheticLambda3(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int... iArr) {
        this(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iArr, 0);
    }

    public ChipKtExternalSyntheticLambda3(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr, int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(iArr.length > 0);
        this.IAuthTabCallbackStub = i2;
        this.onExtraCallbackWithResult = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1);
        int length = iArr.length;
        this.onExtraCallback = length;
        this.onNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.onNavigationEvent[i3] = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(iArr[i3]);
        }
        Arrays.sort(this.onNavigationEvent, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ChipKtExternalSyntheticLambda3.onExtraCallback((BasicTextContextMenuProviderKtExternalSyntheticLambda4) obj, (BasicTextContextMenuProviderKtExternalSyntheticLambda4) obj2);
            }
        });
        this.onWarmupCompleted = new int[this.onExtraCallback];
        int i4 = 0;
        while (true) {
            int i5 = this.onExtraCallback;
            if (i4 < i5) {
                this.onWarmupCompleted[i4] = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent[i4]);
                i4++;
            } else {
                this.IAuthTabCallback = new long[i5];
                this.asBinder = false;
                return;
            }
        }
    }

    public static /* synthetic */ int onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42) {
        return basicTextContextMenuProviderKtExternalSyntheticLambda42.onExtraCallback - basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda1
    public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda1
    public final int access100() {
        return this.onWarmupCompleted.length;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda1
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent(int i2) {
        return this.onNavigationEvent[i2];
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda1
    public final int onWarmupCompleted(int i2) {
        return this.onWarmupCompleted[i2];
    }

    public final int onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        for (int i2 = 0; i2 < this.onExtraCallback; i2++) {
            if (this.onNavigationEvent[i2] == basicTextContextMenuProviderKtExternalSyntheticLambda4) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda1
    public final int onExtraCallbackWithResult(int i2) {
        for (int i3 = 0; i3 < this.onExtraCallback; i3++) {
            if (this.onWarmupCompleted[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback() {
        return this.onNavigationEvent[onWarmupCompleted()];
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public final int asBinder() {
        return this.onWarmupCompleted[onWarmupCompleted()];
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public int onExtraCallbackWithResult(long j, List<? extends BottomSheetScaffoldKtExternalSyntheticLambda7> list) {
        return list.size();
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public boolean onExtraCallback(int i2, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zOnWarmupCompleted = onWarmupCompleted(i2, jElapsedRealtime);
        int i3 = 0;
        while (i3 < this.onExtraCallback && !zOnWarmupCompleted) {
            zOnWarmupCompleted = (i3 == i2 || onWarmupCompleted(i3, jElapsedRealtime)) ? false : true;
            i3++;
        }
        if (!zOnWarmupCompleted) {
            return false;
        }
        long[] jArr = this.IAuthTabCallback;
        jArr[i2] = Math.max(jArr[i2], TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public boolean onWarmupCompleted(int i2, long j) {
        return this.IAuthTabCallback[i2] > j;
    }

    @Override // o.ColorsKtExternalSyntheticLambda0
    public void onWarmupCompleted(boolean z) {
        this.asBinder = z;
    }

    public int hashCode() {
        if (this.onTransact == 0) {
            this.onTransact = (System.identityHashCode(this.onExtraCallbackWithResult) * 31) + Arrays.hashCode(this.onWarmupCompleted);
        }
        return this.onTransact;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChipKtExternalSyntheticLambda3 chipKtExternalSyntheticLambda3 = (ChipKtExternalSyntheticLambda3) obj;
        return this.onExtraCallbackWithResult.equals(chipKtExternalSyntheticLambda3.onExtraCallbackWithResult) && Arrays.equals(this.onWarmupCompleted, chipKtExternalSyntheticLambda3.onWarmupCompleted);
    }
}
