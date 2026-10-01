package o;

import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum t_ {
    END_OF_DOCUMENT(0),
    DOUBLE(1),
    STRING(2),
    DOCUMENT(3),
    ARRAY(4),
    BINARY(5),
    UNDEFINED(6),
    OBJECT_ID(7),
    BOOLEAN(8),
    DATE_TIME(9),
    NULL(10),
    REGULAR_EXPRESSION(11),
    DB_POINTER(12),
    JAVASCRIPT(13),
    SYMBOL(14),
    JAVASCRIPT_WITH_SCOPE(15),
    INT32(16),
    TIMESTAMP(17),
    INT64(18),
    DECIMAL128(19),
    MIN_KEY(GF2Field.MASK),
    MAX_KEY(CertificateBody.profileType);

    private final int value;
    private static final t_[] LOOKUP_TABLE = new t_[MIN_KEY.getValue() + 1];

    static {
        for (t_ t_Var : values()) {
            LOOKUP_TABLE[t_Var.getValue()] = t_Var;
        }
    }

    t_(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static t_ findByValue(int i) {
        return LOOKUP_TABLE[i & GF2Field.MASK];
    }

    public boolean isContainer() {
        return this == DOCUMENT || this == ARRAY;
    }
}
