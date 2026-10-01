package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class q implements e {
    public final TemporalField a;
    public final TextStyle b;
    public final z c;
    public volatile i d;

    public q(TemporalField temporalField, TextStyle textStyle, z zVar) {
        this.a = temporalField;
        this.b = textStyle;
        this.c = zVar;
    }

    @Override // j$.time.format.e
    public final boolean o(w wVar, StringBuilder sb) {
        String strC;
        Long lA = wVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = wVar.b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) wVar.a.d(j$.time.temporal.l.b);
        if (chronology == null || chronology == j$.time.chrono.p.d) {
            strC = this.c.c(this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        } else {
            strC = this.c.b(chronology, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        }
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, SignStyle.NORMAL);
        }
        return this.d.o(wVar, sb);
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        Iterator itE;
        z zVar = this.c;
        TemporalField temporalField = this.a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = uVar.c;
            DateTimeFormatter dateTimeFormatter = uVar.a;
            TextStyle textStyle = z ? this.b : null;
            Chronology chronology = uVar.c().c;
            if (chronology == null && (chronology = uVar.a.e) == null) {
                chronology = j$.time.chrono.p.d;
            }
            Chronology chronology2 = chronology;
            if (chronology2 == null || chronology2 == j$.time.chrono.p.d) {
                itE = zVar.e(temporalField, textStyle, dateTimeFormatter.b);
            } else {
                itE = zVar.d(chronology2, temporalField, textStyle, dateTimeFormatter.b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (uVar.g(str, 0, charSequence, i, str.length())) {
                        return uVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (temporalField == ChronoField.ERA && !uVar.c) {
                    Iterator it2 = chronology2.v().iterator();
                    while (it2.hasNext()) {
                        String string = ((j$.time.chrono.j) it2.next()).toString();
                        if (uVar.g(string, 0, charSequence, i, string.length())) {
                            return uVar.f(this.a, r10.getValue(), i, string.length() + i);
                        }
                    }
                }
                if (uVar.c) {
                    return ~i;
                }
            }
            if (this.d == null) {
                this.d = new i(this.a, 1, 19, SignStyle.NORMAL);
            }
            return this.d.w(uVar, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.a;
        TextStyle textStyle2 = this.b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
