package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class eo {
    private static final Pattern a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    static List a(File file, File file2) throws IOException, NumberFormatException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.en
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return eo.a.matcher(str).matches();
            }
        });
        if (fileArrListFiles != null) {
            File[] fileArr2 = new File[fileArrListFiles.length];
            int i2 = 0;
            while (true) {
                int length = fileArrListFiles.length;
                if (i2 >= length) {
                    fileArr = fileArr2;
                    break;
                }
                File file3 = fileArrListFiles[i2];
                int i3 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i3 > length || fileArr2[i3] != null) {
                    break;
                }
                fileArr2[i3] = file3;
                i2++;
            }
            throw new ck("Metadata folder ordering corrupt.");
        }
        fileArr = new File[0];
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    es esVarB = new bw(fileInputStream).b();
                    if (esVarB.c() == null) {
                        throw new ck("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, esVarB.c());
                    if (!file5.exists()) {
                        throw new ck(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
