package com.google.android.gms.internal.p000firebaseauthapi;

import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzand {
    private static final zzaly zza = (zzaly) ((zzaja) zzaly.zzc().zza(-62135596800L).zza(0).zzf());
    private static final zzaly zzb = (zzaly) ((zzaja) zzaly.zzc().zza(253402300799L).zza(999999999).zzf());
    private static final zzaly zzc = (zzaly) ((zzaja) zzaly.zzc().zza(0L).zza(0).zzf());
    private static final ThreadLocal<SimpleDateFormat> zzd = new zzanc();

    @Nullable
    private static final Method zze = zzc("now");

    @Nullable
    private static final Method zzf = zzc("getEpochSecond");

    @Nullable
    private static final Method zzg = zzc("getNano");

    private static long zzb(String str) throws NumberFormatException, ParseException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid offset value: " + str, 0);
        }
        try {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        } catch (NumberFormatException e) {
            ParseException parseException = new ParseException("Invalid offset value: " + str, 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static long zza(zzaly zzalyVar) {
        return zzb(zzalyVar).zzb();
    }

    private static zzaly zzb(zzaly zzalyVar) {
        long jZzb = zzalyVar.zzb();
        int iZza = zzalyVar.zza();
        if (jZzb < -62135596800L || jZzb > 253402300799L || iZza < 0 || iZza >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzb), Integer.valueOf(iZza)));
        }
        return zzalyVar;
    }

    public static zzaly zza(String str) throws NumberFormatException, ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        if (iIndexOf3 == -1) {
            strSubstring = "";
        } else {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        }
        long time = zzd.get().parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i2 = 0; i2 < 9; i2++) {
                iCharAt *= 10;
                if (i2 < strSubstring.length()) {
                    if (strSubstring.charAt(i2) < '0' || strSubstring.charAt(i2) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt += strSubstring.charAt(i2) - '0';
                }
            }
        }
        if (str.charAt(iIndexOf2) == 'Z') {
            if (str.length() != iIndexOf2 + 1) {
                throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(iIndexOf2) + "\"", 0);
            }
        } else {
            long jZzb = zzb(str.substring(iIndexOf2 + 1));
            time = str.charAt(iIndexOf2) == '+' ? time - jZzb : time + jZzb;
        }
        if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
            try {
                time = zzbf.zza(time, iCharAt / 1000000000);
                iCharAt %= 1000000000;
            } catch (IllegalArgumentException e) {
                ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
                parseException.initCause(e);
                throw parseException;
            }
        }
        if (iCharAt < 0) {
            iCharAt += 1000000000;
            time = zzbf.zzb(time, 1L);
        }
        return zzb((zzaly) ((zzaja) zzaly.zzc().zza(time).zza(iCharAt).zzf()));
    }

    @Nullable
    private static Method zzc(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
