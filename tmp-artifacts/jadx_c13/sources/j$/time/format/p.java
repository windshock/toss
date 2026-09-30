package j$.time.format;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum p implements e {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    @Override // j$.time.format.e
    public final boolean o(w wVar, StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            uVar.b = true;
            return i;
        }
        if (iOrdinal == 1) {
            uVar.b = false;
            return i;
        }
        if (iOrdinal == 2) {
            uVar.c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        uVar.c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
