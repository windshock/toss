package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Tasks;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bu {
    private final com.google.android.play.core.assetpacks.internal.aq a;

    bu(com.google.android.play.core.assetpacks.internal.aq aqVar) {
        this.a = aqVar;
    }

    final InputStream a(int i2, String str, String str2, int i3) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.await(((y) this.a.a()).a(i2, str, str2, i3));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new ck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i2), str, str2, Integer.valueOf(i3)), i2);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new ck("Extractor was interrupted while waiting for chunk file.", e, i2);
        } catch (ExecutionException e2) {
            throw new ck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i2), str, str2, Integer.valueOf(i3)), e2, i2);
        }
    }
}
