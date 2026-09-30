package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1 {
    public final int onExtraCallback;

    private TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1(int i2) {
        this.onExtraCallback = i2;
    }

    public String toString() {
        return onExtraCallback(this.onExtraCallback);
    }

    public static final class onExtraCallbackWithResult extends TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1 {
        public final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onNavigationEvent;

        public onExtraCallbackWithResult(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            super(i2);
            this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        }
    }

    public static final class onExtraCallback extends TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1 {
        public final long IAuthTabCallback;
        public final List<onExtraCallback> onExtraCallbackWithResult;
        public final List<onExtraCallbackWithResult> onNavigationEvent;

        public onExtraCallback(int i2, long j) {
            super(i2);
            this.IAuthTabCallback = j;
            this.onNavigationEvent = new ArrayList();
            this.onExtraCallbackWithResult = new ArrayList();
        }

        public void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
            this.onNavigationEvent.add(onextracallbackwithresult);
        }

        public void onExtraCallback(onExtraCallback onextracallback) {
            this.onExtraCallbackWithResult.add(onextracallback);
        }

        public onExtraCallbackWithResult onNavigationEvent(int i2) {
            int size = this.onNavigationEvent.size();
            for (int i3 = 0; i3 < size; i3++) {
                onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent.get(i3);
                if (onextracallbackwithresult.onExtraCallback == i2) {
                    return onextracallbackwithresult;
                }
            }
            return null;
        }

        public onExtraCallback IAuthTabCallback(int i2) {
            int size = this.onExtraCallbackWithResult.size();
            for (int i3 = 0; i3 < size; i3++) {
                onExtraCallback onextracallback = this.onExtraCallbackWithResult.get(i3);
                if (onextracallback.onExtraCallback == i2) {
                    return onextracallback;
                }
            }
            return null;
        }

        @Override // o.TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1
        public String toString() {
            return TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(this.onExtraCallback) + " leaves: " + Arrays.toString(this.onNavigationEvent.toArray()) + " containers: " + Arrays.toString(this.onExtraCallbackWithResult.toArray());
        }
    }

    public static String onExtraCallback(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) (i2 >>> 24));
        sb.append((char) ((i2 >> 16) & OggPageHeader.MAX_SEGMENT_COUNT));
        sb.append((char) ((i2 >> 8) & OggPageHeader.MAX_SEGMENT_COUNT));
        sb.append((char) (i2 & OggPageHeader.MAX_SEGMENT_COUNT));
        return sb.toString();
    }
}
