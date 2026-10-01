package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ea {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PackMetadataManager");
    private final bh b;
    private final ec c;

    ea(bh bhVar, ec ecVar) {
        this.b = bhVar;
        this.c = ecVar;
    }

    final String a(String str) throws IOException {
        if (!this.b.G(str)) {
            return "";
        }
        ec ecVar = this.c;
        bh bhVar = this.b;
        int iA = ecVar.a();
        File fileK = bhVar.k(str, iA, bhVar.c(str));
        try {
            if (!fileK.exists()) {
                return String.valueOf(iA);
            }
            FileInputStream fileInputStream = new FileInputStream(fileK);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(iA) : property;
            } finally {
            }
        } catch (IOException unused) {
            a.b("Failed to read pack version tag for pack %s", str);
            return "";
        }
    }

    final void b(String str, int i2, long j, @Nullable String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i2);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File fileK = this.b.k(str, i2, j);
        fileK.getParentFile().mkdirs();
        fileK.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileK);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
