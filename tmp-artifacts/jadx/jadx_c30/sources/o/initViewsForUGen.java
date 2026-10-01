package o;

import net.sf.scuba.smartcards.ISOFileInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum initViewsForUGen {
    BINARY((byte) 0),
    FUNCTION((byte) 1),
    OLD_BINARY((byte) 2),
    UUID_LEGACY((byte) 3),
    UUID_STANDARD((byte) 4),
    MD5((byte) 5),
    USER_DEFINED(ISOFileInfo.DATA_BYTES1);

    private final byte value;

    public static boolean isUuid(byte b) {
        return b == UUID_LEGACY.getValue() || b == UUID_STANDARD.getValue();
    }

    initViewsForUGen(byte b) {
        this.value = b;
    }

    public byte getValue() {
        return this.value;
    }
}
