package com.google.android.gms.internal.p000firebaseauthapi;

import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzajc {
    public static final byte[] zzb;
    private static final ByteBuffer zze;
    private static final zzaib zzf;
    private static final Charset zzc = Charset.forName("US-ASCII");
    static final Charset zza = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);
    private static final Charset zzd = Charset.forName("ISO-8859-1");

    public static int zza(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static boolean zza(zzakk zzakkVar) {
        return false;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int iZza = zza(length, bArr, 0, length);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static int zza(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    static <T> T zza(T t) {
        t.getClass();
        return t;
    }

    static <T> T zza(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzaib.zza(bArr, 0, 0, false);
    }

    public static boolean zzc(byte[] bArr) {
        return zzaml.zza(bArr);
    }
}
