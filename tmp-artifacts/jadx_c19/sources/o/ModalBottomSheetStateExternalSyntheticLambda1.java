package o;

import androidx.annotation.Nullable;
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.ModalBottomSheetStateExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetStateExternalSyntheticLambda1 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final List<onWarmupCompleted> onExtraCallbackWithResult;

    public static final class onWarmupCompleted {
        public static final Comparator<onWarmupCompleted> IAuthTabCallback = new Comparator() { // from class: androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                ModalBottomSheetStateExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted = (ModalBottomSheetStateExternalSyntheticLambda1.onWarmupCompleted) obj;
                ModalBottomSheetStateExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted2 = (ModalBottomSheetStateExternalSyntheticLambda1.onWarmupCompleted) obj2;
                return ComparisonChain.start().compare(onwarmupcompleted.onNavigationEvent, onwarmupcompleted2.onNavigationEvent).compare(onwarmupcompleted.onExtraCallback, onwarmupcompleted2.onExtraCallback).compare(onwarmupcompleted.onWarmupCompleted, onwarmupcompleted2.onWarmupCompleted).result();
            }
        };
        public final long onExtraCallback;
        public final long onNavigationEvent;
        public final int onWarmupCompleted;

        public onWarmupCompleted(long j, long j2, int i2) {
            RecordingInputConnection_androidKt.onNavigationEvent(j < j2);
            this.onNavigationEvent = j;
            this.onExtraCallback = j2;
            this.onWarmupCompleted = i2;
        }

        public String toString() {
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", new Object[]{Long.valueOf(this.onNavigationEvent), Long.valueOf(this.onExtraCallback), Integer.valueOf(this.onWarmupCompleted)});
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || onWarmupCompleted.class != obj.getClass()) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return this.onNavigationEvent == onwarmupcompleted.onNavigationEvent && this.onExtraCallback == onwarmupcompleted.onExtraCallback && this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.onNavigationEvent), Long.valueOf(this.onExtraCallback), Integer.valueOf(this.onWarmupCompleted));
        }
    }

    public ModalBottomSheetStateExternalSyntheticLambda1(List<onWarmupCompleted> list) {
        this.onExtraCallbackWithResult = list;
        RecordingInputConnection_androidKt.onNavigationEvent(!onWarmupCompleted(list));
    }

    public String toString() {
        return "SlowMotion: segments=" + this.onExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetStateExternalSyntheticLambda1.class != obj.getClass()) {
            return false;
        }
        return this.onExtraCallbackWithResult.equals(((ModalBottomSheetStateExternalSyntheticLambda1) obj).onExtraCallbackWithResult);
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult.hashCode();
    }

    private static boolean onWarmupCompleted(List<onWarmupCompleted> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).onExtraCallback;
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (list.get(i2).onNavigationEvent < j) {
                return true;
            }
            j = list.get(i2).onExtraCallback;
        }
        return false;
    }
}
