package androidx.media3.container;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import o.RecordingInputConnection_androidKt;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda20;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReorderingBufferQueue {
    private final OutputConsumer IAuthTabCallback;
    private BuffersWithTimestamp onExtraCallbackWithResult;
    private final ArrayDeque<TextFieldDecoratorModifierNodeExternalSyntheticLambda20> asInterface = new ArrayDeque<>();
    private final ArrayDeque<BuffersWithTimestamp> onWarmupCompleted = new ArrayDeque<>();
    private final PriorityQueue<BuffersWithTimestamp> onNavigationEvent = new PriorityQueue<>();
    private int onExtraCallback = -1;

    public interface OutputConsumer {
        void consume(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }

    public ReorderingBufferQueue(OutputConsumer outputConsumer) {
        this.IAuthTabCallback = outputConsumer;
    }

    public void onExtraCallbackWithResult(int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(i2 >= 0);
        this.onExtraCallback = i2;
        IAuthTabCallback(i2);
    }

    public int onWarmupCompleted() {
        return this.onExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r10 >= ((androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, o.setApTextSize.onNavigationEvent.4.onNavigationEvent(), o.setApTextSize.onNavigationEvent.4.onNavigationEvent(), o.setApTextSize.onNavigationEvent.4.onNavigationEvent(), r6, r7, -1084655742)).IAuthTabCallback) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        BuffersWithTimestamp buffersWithTimestampPop;
        int i2 = this.onExtraCallback;
        if (i2 != 0) {
            if (i2 != -1 && this.onNavigationEvent.size() >= this.onExtraCallback) {
                Object[] objArr = {this.onNavigationEvent.peek()};
                int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            BuffersWithTimestamp buffersWithTimestamp = this.onExtraCallbackWithResult;
            if (buffersWithTimestamp != null && j == buffersWithTimestamp.IAuthTabCallback) {
                buffersWithTimestamp.onExtraCallback.add(textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback);
                return;
            }
            if (this.onWarmupCompleted.isEmpty()) {
                buffersWithTimestampPop = new BuffersWithTimestamp();
            } else {
                buffersWithTimestampPop = this.onWarmupCompleted.pop();
            }
            buffersWithTimestampPop.onExtraCallback(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback);
            this.onNavigationEvent.add(buffersWithTimestampPop);
            this.onExtraCallbackWithResult = buffersWithTimestampPop;
            int i3 = this.onExtraCallback;
            if (i3 != -1) {
                IAuthTabCallback(i3);
                return;
            }
            return;
        }
        this.IAuthTabCallback.consume(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }

    private TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20Pop;
        if (this.asInterface.isEmpty()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20Pop = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        } else {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20Pop = this.asInterface.pop();
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20Pop.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
        System.arraycopy(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(), textFieldDecoratorModifierNodeExternalSyntheticLambda20Pop.onExtraCallback(), 0, textFieldDecoratorModifierNodeExternalSyntheticLambda20Pop.onNavigationEvent());
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20Pop;
    }

    public void onNavigationEvent() {
        this.onNavigationEvent.clear();
    }

    public void onExtraCallback() {
        IAuthTabCallback(0);
    }

    private void IAuthTabCallback(int i2) {
        while (this.onNavigationEvent.size() > i2) {
            Object[] objArr = {this.onNavigationEvent.poll()};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            BuffersWithTimestamp buffersWithTimestamp = (BuffersWithTimestamp) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
            for (int i3 = 0; i3 < buffersWithTimestamp.onExtraCallback.size(); i3++) {
                this.IAuthTabCallback.consume(buffersWithTimestamp.IAuthTabCallback, buffersWithTimestamp.onExtraCallback.get(i3));
                this.asInterface.push(buffersWithTimestamp.onExtraCallback.get(i3));
            }
            buffersWithTimestamp.onExtraCallback.clear();
            BuffersWithTimestamp buffersWithTimestamp2 = this.onExtraCallbackWithResult;
            if (buffersWithTimestamp2 != null && buffersWithTimestamp2.IAuthTabCallback == buffersWithTimestamp.IAuthTabCallback) {
                this.onExtraCallbackWithResult = null;
            }
            this.onWarmupCompleted.push(buffersWithTimestamp);
        }
    }

    static final class BuffersWithTimestamp implements Comparable<BuffersWithTimestamp> {
        public long IAuthTabCallback = -9223372036854775807L;
        public final List<TextFieldDecoratorModifierNodeExternalSyntheticLambda20> onExtraCallback = new ArrayList();

        public void onExtraCallback(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            RecordingInputConnection_androidKt.onNavigationEvent(j != -9223372036854775807L);
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback.isEmpty());
            this.IAuthTabCallback = j;
            this.onExtraCallback.add(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        }

        @Override // java.lang.Comparable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public int compareTo(BuffersWithTimestamp buffersWithTimestamp) {
            return Long.compare(this.IAuthTabCallback, buffersWithTimestamp.IAuthTabCallback);
        }
    }
}
