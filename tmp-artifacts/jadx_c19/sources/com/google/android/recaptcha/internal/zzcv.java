package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcv implements zzdd {
    public static final zzcv zza = new zzcv();

    private zzcv() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        String strJoinToString$default;
        String str;
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        if (objZza instanceof int[]) {
            strJoinToString$default = ArraysKt.joinToString$default((int[]) objZza, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, Charsets.UTF_8);
            } else if (objZza instanceof long[]) {
                strJoinToString$default = ArraysKt.joinToString$default((long[]) objZza, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (objZza instanceof short[]) {
                strJoinToString$default = ArraysKt.joinToString$default((short[]) objZza, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (objZza instanceof float[]) {
                strJoinToString$default = ArraysKt.joinToString$default((float[]) objZza, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (objZza instanceof double[]) {
                strJoinToString$default = ArraysKt.joinToString$default((double[]) objZza, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strJoinToString$default = ArraysKt.joinToString$default((Object[]) objZza, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzae(4, 5, (Throwable) null);
                }
                strJoinToString$default = CollectionsKt.joinToString$default((Iterable) objZza, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            }
            strJoinToString$default = str;
        }
        zzcjVar.zzc().zzf(i2, strJoinToString$default);
    }
}
