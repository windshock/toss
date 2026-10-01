package com.google.android.recaptcha.internal;

import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzjc {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzhc zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzhc.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzb(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
