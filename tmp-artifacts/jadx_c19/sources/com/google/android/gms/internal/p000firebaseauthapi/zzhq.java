package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class zzhq {
    private static final zzic.zza zza = zzic.zza.zza;
    private final zzho zzb;
    private final zzho zzc;

    abstract zzho zza(byte[] bArr, int i2) throws InvalidKeyException;

    public zzhq(byte[] bArr) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zzb = zza(bArr, 1);
        this.zzc = zza(bArr, 0);
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.zzb.zza(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArrZza = zzhv.zza(zza(bArr), zza(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrZza);
    }

    public byte[] zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            if (!MessageDigest.isEqual(zzhv.zza(zza(bArr), zza(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.zzb.zza(bArr, byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zza(ByteBuffer.wrap(bArr2), bArr, bArr3);
    }

    private final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.zzc.zza(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining % 16;
        int i3 = (i2 == 0 ? iRemaining : (iRemaining + 16) - i2) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i3);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }
}
