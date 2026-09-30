package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzej implements zzen {
    private static final boolean zzb(int i2) throws IOException {
        try {
            new Socket("localhost", i2).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(@NotNull Object... objArr) throws zzae {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num == null) {
                throw new zzae(4, 5, (Throwable) null);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (zzb(iIntValue)) {
                arrayList2.add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList2;
    }
}
