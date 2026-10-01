package j$.time.format;

import j$.time.temporal.WeekFields;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r extends i {
    public final char g;
    public final int h;

    @Override // j$.time.format.i, j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        return f(uVar.a.b).w(uVar, charSequence, i);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean o(w wVar, StringBuilder sb) {
        return f(wVar.b.b).o(wVar, sb);
    }

    public r(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, SignStyle.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new r(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new r(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final i f(Locale locale) {
        j$.time.temporal.o oVar;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c = this.g;
        if (c == 'W') {
            oVar = weekFieldsOf.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.o oVar2 = weekFieldsOf.f;
                int i = this.h;
                if (i == 2) {
                    return new o(oVar2, 2, 2, o.h, this.e);
                }
                return new i(oVar2, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                oVar = weekFieldsOf.c;
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                oVar = weekFieldsOf.e;
            }
        }
        return new i(oVar, this.b, this.c, SignStyle.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.i
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
