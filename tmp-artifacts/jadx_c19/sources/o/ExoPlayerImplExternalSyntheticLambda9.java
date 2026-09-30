package o;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExoPlayerImplExternalSyntheticLambda9 {
    ExoPlayerImplExternalSyntheticLambda9() {
    }

    public enum onExtraCallbackWithResult {
        OBJECT_BOUNDING_BOX("objectBoundingBox"),
        USER_SPACE_ON_USE("userSpaceOnUse");

        private static final Map<String, onExtraCallbackWithResult> unitsToEnum = new HashMap();
        private final String units;

        static {
            for (onExtraCallbackWithResult onextracallbackwithresult : values()) {
                unitsToEnum.put(onextracallbackwithresult.units, onextracallbackwithresult);
            }
        }

        onExtraCallbackWithResult(String str) {
            this.units = str;
        }

        public static onExtraCallbackWithResult getEnum(String str) {
            Map<String, onExtraCallbackWithResult> map = unitsToEnum;
            if (!map.containsKey(str)) {
                throw new IllegalArgumentException("Unknown 'Unit' Value: " + str);
            }
            return map.get(str);
        }

        @Override // java.lang.Enum
        @Nonnull
        public String toString() {
            return this.units;
        }
    }
}
