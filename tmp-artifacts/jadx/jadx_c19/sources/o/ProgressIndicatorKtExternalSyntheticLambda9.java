package o;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.ProgressIndicatorKtExternalSyntheticLambda9;
import o.RadioButtonDefaults;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda9 implements RadioButtonKt {
    private static final Ordering<RadioButtonDefaults> onNavigationEvent = Ordering.natural().onResultOf(new Function() { // from class: androidx.media3.extractor.text.CuesWithTimingSubtitle$$ExternalSyntheticLambda0
        public final Object apply(Object obj) {
            return Long.valueOf(ProgressIndicatorKtExternalSyntheticLambda9.onNavigationEvent(((RadioButtonDefaults) obj).onExtraCallback));
        }
    });
    private final ImmutableList<ImmutableList<ImeEditCommand_androidKtExternalSyntheticLambda1>> onExtraCallback;
    private final long[] onExtraCallbackWithResult;

    private static long onNavigationEvent(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProgressIndicatorKtExternalSyntheticLambda9(List<RadioButtonDefaults> list) {
        if (list.size() == 1) {
            RadioButtonDefaults radioButtonDefaults = (RadioButtonDefaults) Iterables.getOnlyElement(list);
            long jOnNavigationEvent = onNavigationEvent(radioButtonDefaults.onExtraCallback);
            if (radioButtonDefaults.onExtraCallbackWithResult == -9223372036854775807L) {
                this.onExtraCallback = ImmutableList.of(radioButtonDefaults.onNavigationEvent);
                this.onExtraCallbackWithResult = new long[]{jOnNavigationEvent};
                return;
            } else {
                this.onExtraCallback = ImmutableList.of(radioButtonDefaults.onNavigationEvent, ImmutableList.of());
                this.onExtraCallbackWithResult = new long[]{jOnNavigationEvent, radioButtonDefaults.onExtraCallbackWithResult + jOnNavigationEvent};
                return;
            }
        }
        long[] jArr = new long[list.size() << 1];
        this.onExtraCallbackWithResult = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(onNavigationEvent, list);
        int i2 = 0;
        for (int i3 = 0; i3 < immutableListSortedCopyOf.size(); i3++) {
            RadioButtonDefaults radioButtonDefaults2 = (RadioButtonDefaults) immutableListSortedCopyOf.get(i3);
            long jOnNavigationEvent2 = onNavigationEvent(radioButtonDefaults2.onExtraCallback);
            long j = radioButtonDefaults2.onExtraCallbackWithResult;
            if (i2 != 0) {
                int i4 = i2 - 1;
                long j2 = this.onExtraCallbackWithResult[i4];
                if (j2 < jOnNavigationEvent2) {
                    this.onExtraCallbackWithResult[i2] = jOnNavigationEvent2;
                    arrayList.add(radioButtonDefaults2.onNavigationEvent);
                    i2++;
                } else if (j2 == jOnNavigationEvent2 && ((ImmutableList) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, radioButtonDefaults2.onNavigationEvent);
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.onExtraCallbackWithResult[i4] = jOnNavigationEvent2;
                    arrayList.set(i4, radioButtonDefaults2.onNavigationEvent);
                }
            }
            if (radioButtonDefaults2.onExtraCallbackWithResult != -9223372036854775807L) {
                this.onExtraCallbackWithResult[i2] = j + jOnNavigationEvent2;
                arrayList.add(ImmutableList.of());
                i2++;
            }
        }
        this.onExtraCallback = ImmutableList.copyOf(arrayList);
    }

    @Override // o.RadioButtonKt
    public int onWarmupCompleted(long j) {
        Object[] objArr = {this.onExtraCallbackWithResult, Long.valueOf(j), false, false};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iIntValue = ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1100701149, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1100701127)).intValue();
        if (iIntValue < this.onExtraCallback.size()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // o.RadioButtonKt
    public int onExtraCallbackWithResult() {
        return this.onExtraCallback.size();
    }

    @Override // o.RadioButtonKt
    public long IAuthTabCallback(int i2) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 < this.onExtraCallback.size());
        return this.onExtraCallbackWithResult[i2];
    }

    @Override // o.RadioButtonKt
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ImmutableList<ImeEditCommand_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult(long j) {
        int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.onExtraCallbackWithResult, j, true, false);
        return iOnExtraCallback == -1 ? ImmutableList.of() : (ImmutableList) this.onExtraCallback.get(iOnExtraCallback);
    }
}
