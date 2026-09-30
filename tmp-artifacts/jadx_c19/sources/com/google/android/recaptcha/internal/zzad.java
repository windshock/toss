package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.io.FilesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzad {
    private final Context zza;

    public zzad(@NotNull Context context) {
        this.zza = context;
    }

    public static final byte[] zza(@NotNull File file) throws GeneralSecurityException, IOException {
        return FilesKt.readBytes(file);
    }

    public static final void zzb(@NotNull File file, @NotNull byte[] bArr) throws GeneralSecurityException, IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        FilesKt.writeBytes(file, bArr);
    }
}
