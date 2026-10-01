package o;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import o.getVideoContainer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getVideoContainer {
    private final int onExtraCallback;
    private final Map<Integer, String> onExtraCallbackWithResult;
    private final Map<String, String> onNavigationEvent;

    private static String onWarmupCompleted(int i) {
        if (Character.charCount(i) == 1) {
            return String.valueOf((char) i);
        }
        return new String(Character.toChars(i));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getVideoContainer)) {
            return false;
        }
        getVideoContainer getvideocontainer = (getVideoContainer) obj;
        return this.onExtraCallbackWithResult.equals(getvideocontainer.onExtraCallbackWithResult) && this.onNavigationEvent.equals(getvideocontainer.onNavigationEvent) && this.onExtraCallback == getvideocontainer.onExtraCallback;
    }

    public int hashCode() {
        return Objects.hash(this.onExtraCallbackWithResult, this.onNavigationEvent, Integer.valueOf(this.onExtraCallback));
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        this.onExtraCallbackWithResult.forEach(new BiConsumer() { // from class: org.apache.commons.text.AlphabetConverter$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                getVideoContainer.onWarmupCompleted(sb, (Integer) obj, (String) obj2);
            }
        });
        return sb.toString();
    }

    public static /* synthetic */ void onWarmupCompleted(StringBuilder sb, Integer num, String str) {
        sb.append(onWarmupCompleted(num.intValue()));
        sb.append(" -> ");
        sb.append(num);
        sb.append(System.lineSeparator());
    }
}
