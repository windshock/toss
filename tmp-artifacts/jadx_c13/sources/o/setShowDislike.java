package o;

import java.io.IOException;
import java.io.Writer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShowDislike {
    private static final String IAuthTabCallback = "\"";
    private static final String onWarmupCompleted = "\"\"";
    private static final char[] onExtraCallbackWithResult = {',', '\"', '\r', '\n'};

    public static class onWarmupCompleted extends setShowSound {
        @Override // o.setShowSound, o.hideCountDownText
        public /* bridge */ /* synthetic */ int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
            return super.IAuthTabCallback(charSequence, i, writer);
        }

        @Override // o.setShowSound
        void IAuthTabCallback(CharSequence charSequence, Writer writer) throws IOException {
            String string = charSequence.toString();
            if (PAGAppOpenAd.IAuthTabCallback(string, setShowDislike.onExtraCallbackWithResult)) {
                writer.write(string);
                return;
            }
            writer.write(34);
            writer.write(PAGAppOpenAd.onWarmupCompleted(string, setShowDislike.IAuthTabCallback, setShowDislike.onWarmupCompleted));
            writer.write(34);
        }
    }

    public static class onNavigationEvent extends setShowSound {
        @Override // o.setShowSound, o.hideCountDownText
        public /* bridge */ /* synthetic */ int IAuthTabCallback(CharSequence charSequence, int i, Writer writer) throws IOException {
            return super.IAuthTabCallback(charSequence, i, writer);
        }

        @Override // o.setShowSound
        void IAuthTabCallback(CharSequence charSequence, Writer writer) throws IOException {
            if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
                writer.write(charSequence.toString());
                return;
            }
            String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
            if (PAGAppOpenAd.onWarmupCompleted(string, setShowDislike.onExtraCallbackWithResult)) {
                writer.write(PAGAppOpenAd.onWarmupCompleted(string, setShowDislike.onWarmupCompleted, setShowDislike.IAuthTabCallback));
            } else {
                writer.write(string);
            }
        }
    }
}
