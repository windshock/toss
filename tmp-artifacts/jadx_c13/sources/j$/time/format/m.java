package j$.time.format;

import java.text.ParsePosition;
import kotlin.jvm.internal.CharCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class m {
    public String a;
    public String b;
    public final char c;
    public m d;
    public m e;

    public boolean b(char c, char c2) {
        return c == c2;
    }

    public m(String str, String str2, m mVar) {
        this.a = str;
        this.b = str2;
        this.d = mVar;
        if (str.isEmpty()) {
            this.c = CharCompanionObject.MAX_VALUE;
        } else {
            this.c = this.a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        m mVar = this.d;
        if (mVar != null && length2 != length) {
            while (true) {
                if (b(mVar.c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strC = mVar.c(charSequence, parsePosition);
                    if (strC != null) {
                        return strC;
                    }
                } else {
                    mVar = mVar.e;
                    if (mVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    public m d(String str, String str2, m mVar) {
        return new m(str, str2, mVar);
    }

    public boolean e(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (length > 0) {
            if (!b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i++;
            length--;
            i3++;
        }
        return true;
    }

    public final boolean a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && b(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i == this.a.length()) {
            if (i < str.length()) {
                String strSubstring = str.substring(i);
                for (m mVar = this.d; mVar != null; mVar = mVar.e) {
                    if (b(mVar.c, strSubstring.charAt(0))) {
                        return mVar.a(strSubstring, str2);
                    }
                }
                m mVarD = d(strSubstring, str2, null);
                mVarD.e = this.d;
                this.d = mVarD;
                return true;
            }
            this.b = str2;
            return true;
        }
        m mVarD2 = d(this.a.substring(i), this.b, this.d);
        this.a = str.substring(0, i);
        this.d = mVarD2;
        if (i < str.length()) {
            this.d.e = d(str.substring(i), str2, null);
            this.b = null;
            return true;
        }
        this.b = str2;
        return true;
    }
}
