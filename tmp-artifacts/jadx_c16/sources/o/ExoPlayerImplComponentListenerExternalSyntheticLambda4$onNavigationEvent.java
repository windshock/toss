package o;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");

    private static final Map<String, ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent> alignmentToEnum = new HashMap();
    private final String alignment;

    static {
        for (ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent : values()) {
            alignmentToEnum.put(exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.alignment, exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent);
        }
    }

    ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent(String str) {
        this.alignment = str;
    }

    public static ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent getEnum(String str) {
        Map<String, ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent> map = alignmentToEnum;
        if (!map.containsKey(str)) {
            throw new IllegalArgumentException("Unknown String Value: " + str);
        }
        return map.get(str);
    }

    @Override // java.lang.Enum
    @Nonnull
    public String toString() {
        return this.alignment;
    }
}
