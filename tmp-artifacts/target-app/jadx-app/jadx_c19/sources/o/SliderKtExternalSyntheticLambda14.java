package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda14 implements RadioButtonKt {
    private final long[] IAuthTabCallback;
    private final List<SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0> onNavigationEvent;
    private final long[] onWarmupCompleted;

    public SliderKtExternalSyntheticLambda14(List<SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0> list) {
        this.onNavigationEvent = Collections.unmodifiableList(new ArrayList(list));
        this.IAuthTabCallback = new long[list.size() << 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0 secureTextFieldKtSecureTextField1ExternalSyntheticLambda0 = list.get(i2);
            int i3 = i2 << 1;
            long[] jArr = this.IAuthTabCallback;
            jArr[i3] = secureTextFieldKtSecureTextField1ExternalSyntheticLambda0.onNavigationEvent;
            jArr[i3 + 1] = secureTextFieldKtSecureTextField1ExternalSyntheticLambda0.onExtraCallbackWithResult;
        }
        long[] jArr2 = this.IAuthTabCallback;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.onWarmupCompleted = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // o.RadioButtonKt
    public int onWarmupCompleted(long j) {
        Object[] objArr = {this.onWarmupCompleted, Long.valueOf(j), false, false};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        int iIntValue = ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1100701149, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1100701127)).intValue();
        if (iIntValue < this.onWarmupCompleted.length) {
            return iIntValue;
        }
        return -1;
    }

    @Override // o.RadioButtonKt
    public int onExtraCallbackWithResult() {
        return this.onWarmupCompleted.length;
    }

    @Override // o.RadioButtonKt
    public long IAuthTabCallback(int i2) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0);
        RecordingInputConnection_androidKt.onNavigationEvent(i2 < this.onWarmupCompleted.length);
        return this.onWarmupCompleted[i2];
    }

    @Override // o.RadioButtonKt
    public List<ImeEditCommand_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.onNavigationEvent.size(); i2++) {
            long[] jArr = this.IAuthTabCallback;
            int i3 = i2 << 1;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0 secureTextFieldKtSecureTextField1ExternalSyntheticLambda0 = this.onNavigationEvent.get(i2);
                ImeEditCommand_androidKtExternalSyntheticLambda1 imeEditCommand_androidKtExternalSyntheticLambda1 = secureTextFieldKtSecureTextField1ExternalSyntheticLambda0.onWarmupCompleted;
                if (imeEditCommand_androidKtExternalSyntheticLambda1.onNavigationEvent == -3.4028235E38f) {
                    arrayList2.add(secureTextFieldKtSecureTextField1ExternalSyntheticLambda0);
                } else {
                    arrayList.add(imeEditCommand_androidKtExternalSyntheticLambda1);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: androidx.media3.extractor.text.webvtt.WebvttSubtitle$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0) obj).onNavigationEvent, ((SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0) obj2).onNavigationEvent);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            arrayList.add(((SecureTextFieldKtSecureTextField1ExternalSyntheticLambda0) arrayList2.get(i4)).onWarmupCompleted.onNavigationEvent().onExtraCallback((-1) - i4, 1).IAuthTabCallback());
        }
        return arrayList;
    }
}
