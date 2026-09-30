package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getUnreadableElfFiles;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzy implements zzh {
    private final Context zza;
    private final String zzb = "rce_";
    private final zzad zzc;

    public zzy(@NotNull Context context) {
        this.zza = context;
        this.zzc = new zzad(context);
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final String zza(@NotNull String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzad.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (StringsKt.startsWith$default(file.getName(), this.zzb, false, 2, (Object) null)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final void zzc(@NotNull String str, @NotNull String str2) throws GeneralSecurityException, IOException {
        getUnreadableElfFiles getunreadableelffiles = new getUnreadableElfFiles('A', 'z');
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(getunreadableelffiles, 10));
        CharIterator it = getunreadableelffiles.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(it.nextChar()));
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.shuffled(arrayList).subList(0, 8), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strJoinToString$default)));
        zzad.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzh
    public final boolean zzd(@NotNull String str) {
        File file;
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i2];
                    if (Intrinsics.areEqual(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i2++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
