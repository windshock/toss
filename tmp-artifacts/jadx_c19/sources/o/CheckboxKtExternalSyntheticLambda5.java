package o;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.List;
import o.RadioButtonDefaults;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CheckboxKtExternalSyntheticLambda5 implements CheckboxKtExternalSyntheticLambda3 {
    private static final Ordering<RadioButtonDefaults> onExtraCallback = Ordering.natural().onResultOf(new Function() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda0
        public final Object apply(Object obj) {
            return Long.valueOf(((RadioButtonDefaults) obj).onExtraCallback);
        }
    }).compound(Ordering.natural().reverse().onResultOf(new Function() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda1
        public final Object apply(Object obj) {
            return Long.valueOf(((RadioButtonDefaults) obj).onExtraCallbackWithResult);
        }
    }));
    private final List<RadioButtonDefaults> onNavigationEvent = new ArrayList();

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public boolean onExtraCallback(RadioButtonDefaults radioButtonDefaults, long j) {
        RecordingInputConnection_androidKt.onNavigationEvent(radioButtonDefaults.onExtraCallback != -9223372036854775807L);
        RecordingInputConnection_androidKt.onNavigationEvent(radioButtonDefaults.onExtraCallbackWithResult != -9223372036854775807L);
        boolean z = radioButtonDefaults.onExtraCallback <= j && j < radioButtonDefaults.IAuthTabCallback;
        for (int size = this.onNavigationEvent.size() - 1; size >= 0; size--) {
            if (radioButtonDefaults.onExtraCallback >= this.onNavigationEvent.get(size).onExtraCallback) {
                this.onNavigationEvent.add(size + 1, radioButtonDefaults);
                return z;
            }
        }
        this.onNavigationEvent.add(0, radioButtonDefaults);
        return z;
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public ImmutableList<ImeEditCommand_androidKtExternalSyntheticLambda1> onWarmupCompleted(long j) {
        if (!this.onNavigationEvent.isEmpty()) {
            if (j >= this.onNavigationEvent.get(0).onExtraCallback) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.onNavigationEvent.size(); i2++) {
                    RadioButtonDefaults radioButtonDefaults = this.onNavigationEvent.get(i2);
                    if (j >= radioButtonDefaults.onExtraCallback && j < radioButtonDefaults.IAuthTabCallback) {
                        arrayList.add(radioButtonDefaults);
                    }
                    if (j < radioButtonDefaults.onExtraCallback) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(onExtraCallback, arrayList);
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i3 = 0; i3 < immutableListSortedCopyOf.size(); i3++) {
                    builder.addAll(((RadioButtonDefaults) immutableListSortedCopyOf.get(i3)).onNavigationEvent);
                }
                return builder.build();
            }
        }
        return ImmutableList.of();
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public void IAuthTabCallback(long j) {
        int i2 = 0;
        while (i2 < this.onNavigationEvent.size()) {
            long j2 = this.onNavigationEvent.get(i2).onExtraCallback;
            if (j > j2 && j > this.onNavigationEvent.get(i2).IAuthTabCallback) {
                this.onNavigationEvent.remove(i2);
                i2--;
            } else if (j < j2) {
                return;
            }
            i2++;
        }
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public long onExtraCallbackWithResult(long j) {
        if (this.onNavigationEvent.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < this.onNavigationEvent.get(0).onExtraCallback) {
            return -9223372036854775807L;
        }
        long jMax = this.onNavigationEvent.get(0).onExtraCallback;
        for (int i2 = 0; i2 < this.onNavigationEvent.size(); i2++) {
            long j2 = this.onNavigationEvent.get(i2).onExtraCallback;
            long j3 = this.onNavigationEvent.get(i2).IAuthTabCallback;
            if (j3 <= j) {
                jMax = Math.max(jMax, j3);
            } else {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            }
        }
        return jMax;
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public long onExtraCallback(long j) {
        int i2 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i2 >= this.onNavigationEvent.size()) {
                break;
            }
            long j2 = this.onNavigationEvent.get(i2).onExtraCallback;
            long j3 = this.onNavigationEvent.get(i2).IAuthTabCallback;
            if (j < j2) {
                jMin = jMin != -9223372036854775807L ? Math.min(jMin, j2) : j2;
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i2++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // o.CheckboxKtExternalSyntheticLambda3
    public void IAuthTabCallback() {
        this.onNavigationEvent.clear();
    }
}
