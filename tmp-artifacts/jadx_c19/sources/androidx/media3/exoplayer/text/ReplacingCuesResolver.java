package androidx.media3.exoplayer.text;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import o.CheckboxKtExternalSyntheticLambda3;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RadioButtonDefaults;
import o.RecordingInputConnection_androidKt;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReplacingCuesResolver implements CheckboxKtExternalSyntheticLambda3 {
    private final ArrayList<RadioButtonDefaults> onExtraCallbackWithResult = new ArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // o.CheckboxKtExternalSyntheticLambda3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(RadioButtonDefaults radioButtonDefaults, long j) {
        boolean z;
        RecordingInputConnection_androidKt.onNavigationEvent(radioButtonDefaults.onExtraCallback != -9223372036854775807L);
        if (radioButtonDefaults.onExtraCallback <= j) {
            long j2 = radioButtonDefaults.IAuthTabCallback;
            z = j2 == -9223372036854775807L || j < j2;
        }
        for (int size = this.onExtraCallbackWithResult.size() - 1; size >= 0; size--) {
            if (radioButtonDefaults.onExtraCallback >= this.onExtraCallbackWithResult.get(size).onExtraCallback) {
                this.onExtraCallbackWithResult.add(size + 1, radioButtonDefaults);
                return z;
            }
            if (this.onExtraCallbackWithResult.get(size).onExtraCallback <= j) {
                z = false;
            }
        }
        this.onExtraCallbackWithResult.add(0, radioButtonDefaults);
        return z;
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public ImmutableList<ImeEditCommand_androidKtExternalSyntheticLambda1> onWarmupCompleted(long j) {
        int iOnNavigationEvent = onNavigationEvent(j);
        if (iOnNavigationEvent == 0) {
            return ImmutableList.of();
        }
        RadioButtonDefaults radioButtonDefaults = this.onExtraCallbackWithResult.get(iOnNavigationEvent - 1);
        long j2 = radioButtonDefaults.IAuthTabCallback;
        if (j2 == -9223372036854775807L || j < j2) {
            return radioButtonDefaults.onNavigationEvent;
        }
        return ImmutableList.of();
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public void IAuthTabCallback(long j) {
        int iOnNavigationEvent = onNavigationEvent(j);
        if (iOnNavigationEvent == 0) {
            return;
        }
        int i2 = iOnNavigationEvent - 1;
        long j2 = this.onExtraCallbackWithResult.get(i2).IAuthTabCallback;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iOnNavigationEvent = i2;
        }
        this.onExtraCallbackWithResult.subList(0, iOnNavigationEvent).clear();
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public long onExtraCallbackWithResult(long j) {
        if (this.onExtraCallbackWithResult.isEmpty() || j < this.onExtraCallbackWithResult.get(0).onExtraCallback) {
            return -9223372036854775807L;
        }
        for (int i2 = 1; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            long j2 = this.onExtraCallbackWithResult.get(i2).onExtraCallback;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                RadioButtonDefaults radioButtonDefaults = this.onExtraCallbackWithResult.get(i2 - 1);
                long j3 = radioButtonDefaults.IAuthTabCallback;
                return (j3 == -9223372036854775807L || j3 > j) ? radioButtonDefaults.onExtraCallback : j3;
            }
        }
        RadioButtonDefaults radioButtonDefaults2 = (RadioButtonDefaults) Iterables.getLast(this.onExtraCallbackWithResult);
        long j4 = radioButtonDefaults2.IAuthTabCallback;
        return (j4 == -9223372036854775807L || j < j4) ? radioButtonDefaults2.onExtraCallback : j4;
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public long onExtraCallback(long j) {
        if (this.onExtraCallbackWithResult.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.onExtraCallbackWithResult.get(0).onExtraCallback) {
            return this.onExtraCallbackWithResult.get(0).onExtraCallback;
        }
        for (int i2 = 1; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            RadioButtonDefaults radioButtonDefaults = this.onExtraCallbackWithResult.get(i2);
            if (j < radioButtonDefaults.onExtraCallback) {
                long j2 = this.onExtraCallbackWithResult.get(i2 - 1).IAuthTabCallback;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= radioButtonDefaults.onExtraCallback) ? radioButtonDefaults.onExtraCallback : j2;
            }
        }
        long j3 = ((RadioButtonDefaults) Iterables.getLast(this.onExtraCallbackWithResult)).IAuthTabCallback;
        if (j3 == -9223372036854775807L || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public void IAuthTabCallback() {
        this.onExtraCallbackWithResult.clear();
    }

    private int onNavigationEvent(long j) {
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
            if (j < this.onExtraCallbackWithResult.get(i2).onExtraCallback) {
                return i2;
            }
        }
        return this.onExtraCallbackWithResult.size();
    }
}
