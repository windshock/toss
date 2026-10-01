package j$.time.format;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class l extends m {
    @Override // j$.time.format.m
    public final m d(String str, String str2, m mVar) {
        return new l(str, str2, mVar);
    }

    @Override // j$.time.format.m
    public final boolean b(char c, char c2) {
        return u.b(c, c2);
    }

    @Override // j$.time.format.m
    public final boolean e(CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (length > 0) {
            if (!u.b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i++;
            length--;
            i3++;
        }
        return true;
    }

    public l(String str, String str2, m mVar) {
        super(str, str2, mVar);
    }
}
