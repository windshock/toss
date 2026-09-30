package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class d implements e {
    public final e[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        this((e[]) arrayList.toArray(new e[arrayList.size()]), z);
    }

    public d(e[] eVarArr, boolean z) {
        this.a = eVarArr;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r9.setLength(r0);
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(w wVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            wVar.c++;
        }
        try {
            e[] eVarArr = this.a;
            int length2 = eVarArr.length;
            int i = 0;
            while (true) {
                if (i < length2) {
                    if (!eVarArr[i].o(wVar, sb)) {
                        break;
                    }
                    i++;
                }
            }
            return true;
        } finally {
            if (z) {
                wVar.c--;
            }
        }
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        e[] eVarArr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = uVar.d;
            a0 a0VarC = uVar.c();
            a0VarC.getClass();
            a0 a0Var = new a0();
            ((HashMap) a0Var.a).putAll(a0VarC.a);
            a0Var.b = a0VarC.b;
            a0Var.c = a0VarC.c;
            a0Var.d = a0VarC.d;
            arrayList.add(a0Var);
            int length = eVarArr.length;
            int iW = i;
            while (i2 < length) {
                iW = eVarArr[i2].w(uVar, charSequence, iW);
                if (iW < 0) {
                    uVar.d.remove(r8.size() - 1);
                    return i;
                }
                i2++;
            }
            uVar.d.remove(r8.size() - 2);
            return iW;
        }
        int length2 = eVarArr.length;
        while (i2 < length2) {
            i = eVarArr[i2].w(uVar, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e[] eVarArr = this.a;
        if (eVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
