package o;

import java.util.Collection;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum LifecycleEffectKtExternalSyntheticLambda8 {
    Array,
    Collection,
    Map,
    POJO,
    Untyped,
    Integer,
    Float,
    Boolean,
    Enum,
    Textual,
    Binary,
    DateTime,
    OtherScalar;

    public static LifecycleEffectKtExternalSyntheticLambda8 fromClass(Class<?> cls, LifecycleEffectKtExternalSyntheticLambda8 lifecycleEffectKtExternalSyntheticLambda8) {
        if (cls.isEnum()) {
            return Enum;
        }
        if (cls.isArray()) {
            if (cls == byte[].class) {
                return Binary;
            }
            return Array;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            return Collection;
        }
        if (Map.class.isAssignableFrom(cls)) {
            return Map;
        }
        return cls == String.class ? Textual : lifecycleEffectKtExternalSyntheticLambda8;
    }
}
