package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzho {
    int[] zza;
    private final int zzb;

    abstract int zza();

    final ByteBuffer zza(byte[] bArr, int i2) {
        int[] iArrZza = zza(zzhk.zza(bArr), i2);
        int[] iArr = (int[]) iArrZza.clone();
        zzhk.zza(iArr);
        for (int i3 = 0; i3 < iArrZza.length; i3++) {
            iArrZza[i3] = iArrZza[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    abstract int[] zza(int[] iArr, int i2);

    public zzho(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhk.zza(bArr);
        this.zzb = i2;
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer2.remaining();
        int i2 = iRemaining / 64;
        for (int i3 = 0; i3 < i2 + 1; i3++) {
            ByteBuffer byteBufferZza = zza(bArr, this.zzb + i3);
            if (i3 == i2) {
                zzwi.zza(byteBuffer, byteBuffer2, byteBufferZza, iRemaining % 64);
            } else {
                zzwi.zza(byteBuffer, byteBuffer2, byteBufferZza, 64);
            }
        }
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
