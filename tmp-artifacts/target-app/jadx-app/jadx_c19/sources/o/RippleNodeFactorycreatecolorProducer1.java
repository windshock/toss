package o;

import java.util.ArrayDeque;
import o.RippleKt;
import o.TextAnnotatedStringNodeExternalSyntheticLambda0;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RippleNodeFactorycreatecolorProducer1 implements RadioButtonKtExternalSyntheticLambda0 {
    private long IAuthTabCallback;
    private final ArrayDeque<onWarmupCompleted> IAuthTabCallbackStub;
    private long onExtraCallback;
    private onWarmupCompleted onExtraCallbackWithResult;
    private final ArrayDeque<onWarmupCompleted> onNavigationEvent = new ArrayDeque<>();
    private long onTransact;
    private final ArrayDeque<RippleKt> onWarmupCompleted;

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public void IAuthTabCallback() {
    }

    protected abstract boolean IAuthTabCallbackDefault();

    protected abstract void onNavigationEvent(RippleConfiguration rippleConfiguration);

    protected abstract RadioButtonKt onTransact();

    public RippleNodeFactorycreatecolorProducer1() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.onNavigationEvent.add(new onWarmupCompleted());
        }
        this.onWarmupCompleted = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.onWarmupCompleted.add(new onExtraCallback(new TextAnnotatedStringNodeExternalSyntheticLambda0.onExtraCallbackWithResult() { // from class: androidx.media3.extractor.text.cea.CeaDecoder$$ExternalSyntheticLambda0
                @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda0.onExtraCallbackWithResult
                public final void releaseOutputBuffer(TextAnnotatedStringNodeExternalSyntheticLambda0 textAnnotatedStringNodeExternalSyntheticLambda0) {
                    this.f$0.IAuthTabCallback((RippleKt) textAnnotatedStringNodeExternalSyntheticLambda0);
                }
            }));
        }
        this.IAuthTabCallbackStub = new ArrayDeque<>();
        this.IAuthTabCallback = -9223372036854775807L;
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public final void onExtraCallback(long j) {
        this.IAuthTabCallback = j;
    }

    @Override // o.RadioButtonKtExternalSyntheticLambda0
    public void IAuthTabCallback(long j) {
        this.onExtraCallback = j;
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public RippleConfiguration onExtraCallbackWithResult() throws RadioButtonKtExternalSyntheticLambda1 {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult == null);
        if (this.onNavigationEvent.isEmpty()) {
            return null;
        }
        onWarmupCompleted onwarmupcompletedPollFirst = this.onNavigationEvent.pollFirst();
        this.onExtraCallbackWithResult = onwarmupcompletedPollFirst;
        return onwarmupcompletedPollFirst;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(RippleConfiguration rippleConfiguration) throws RadioButtonKtExternalSyntheticLambda1 {
        RecordingInputConnection_androidKt.onNavigationEvent(rippleConfiguration == this.onExtraCallbackWithResult);
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) rippleConfiguration;
        if (!onwarmupcompleted.IAuthTabCallback()) {
            long j = ((SelectionControllerExternalSyntheticLambda2) onwarmupcompleted).onWarmupCompleted;
            if (j != Long.MIN_VALUE) {
                long j2 = this.IAuthTabCallback;
                if (j2 != -9223372036854775807L && j < j2) {
                    onWarmupCompleted(onwarmupcompleted);
                } else {
                    long j3 = this.onTransact;
                    this.onTransact = 1 + j3;
                    onwarmupcompleted.IAuthTabCallbackStub = j3;
                    this.IAuthTabCallbackStub.add(onwarmupcompleted);
                }
            }
        }
        this.onExtraCallbackWithResult = null;
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public RippleKt onWarmupCompleted() throws RadioButtonKtExternalSyntheticLambda1 {
        if (this.onWarmupCompleted.isEmpty()) {
            return null;
        }
        while (!this.IAuthTabCallbackStub.isEmpty()) {
            Object[] objArr = {this.IAuthTabCallbackStub.peek()};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            if (((SelectionControllerExternalSyntheticLambda2) ((onWarmupCompleted) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742))).onWarmupCompleted > this.onExtraCallback) {
                break;
            }
            Object[] objArr2 = {this.IAuthTabCallbackStub.poll()};
            int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, objArr2, -1084655742);
            if (onwarmupcompleted.IAuthTabCallback()) {
                Object[] objArr3 = {this.onWarmupCompleted.pollFirst()};
                int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                RippleKt rippleKt = (RippleKt) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent3, objArr3, -1084655742);
                rippleKt.onWarmupCompleted(4);
                onWarmupCompleted(onwarmupcompleted);
                return rippleKt;
            }
            onNavigationEvent(onwarmupcompleted);
            if (IAuthTabCallbackDefault()) {
                RadioButtonKt radioButtonKtOnTransact = onTransact();
                Object[] objArr4 = {this.onWarmupCompleted.pollFirst()};
                int iOnNavigationEvent4 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
                RippleKt rippleKt2 = (RippleKt) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent4, objArr4, -1084655742);
                rippleKt2.onExtraCallback(((SelectionControllerExternalSyntheticLambda2) onwarmupcompleted).onWarmupCompleted, radioButtonKtOnTransact, Long.MAX_VALUE);
                onWarmupCompleted(onwarmupcompleted);
                return rippleKt2;
            }
            onWarmupCompleted(onwarmupcompleted);
        }
        return null;
    }

    private void onWarmupCompleted(onWarmupCompleted onwarmupcompleted) {
        onwarmupcompleted.onNavigationEvent();
        this.onNavigationEvent.add(onwarmupcompleted);
    }

    public void IAuthTabCallback(RippleKt rippleKt) {
        rippleKt.onNavigationEvent();
        this.onWarmupCompleted.add(rippleKt);
    }

    @Override // o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public void onExtraCallback() {
        this.onTransact = 0L;
        this.onExtraCallback = 0L;
        while (!this.IAuthTabCallbackStub.isEmpty()) {
            Object[] objArr = {this.IAuthTabCallbackStub.poll()};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            onWarmupCompleted((onWarmupCompleted) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742));
        }
        onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        if (onwarmupcompleted != null) {
            onWarmupCompleted(onwarmupcompleted);
            this.onExtraCallbackWithResult = null;
        }
    }

    protected final RippleKt IAuthTabCallbackStub() {
        return this.onWarmupCompleted.pollFirst();
    }

    protected final long IAuthTabCallbackStubProxy() {
        return this.onExtraCallback;
    }

    static final class onWarmupCompleted extends RippleConfiguration implements Comparable<onWarmupCompleted> {
        private long IAuthTabCallbackStub;

        private onWarmupCompleted() {
        }

        @Override // java.lang.Comparable
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public int compareTo(onWarmupCompleted onwarmupcompleted) {
            if (IAuthTabCallback() != onwarmupcompleted.IAuthTabCallback()) {
                return IAuthTabCallback() ? 1 : -1;
            }
            long j = ((SelectionControllerExternalSyntheticLambda2) this).onWarmupCompleted - ((SelectionControllerExternalSyntheticLambda2) onwarmupcompleted).onWarmupCompleted;
            if (j == 0) {
                j = this.IAuthTabCallbackStub - onwarmupcompleted.IAuthTabCallbackStub;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class onExtraCallback extends RippleKt {
        private TextAnnotatedStringNodeExternalSyntheticLambda0.onExtraCallbackWithResult<onExtraCallback> onWarmupCompleted;

        public onExtraCallback(TextAnnotatedStringNodeExternalSyntheticLambda0.onExtraCallbackWithResult<onExtraCallback> onextracallbackwithresult) {
            this.onWarmupCompleted = onextracallbackwithresult;
        }

        @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda0
        public final void asInterface() {
            this.onWarmupCompleted.releaseOutputBuffer(this);
        }
    }
}
