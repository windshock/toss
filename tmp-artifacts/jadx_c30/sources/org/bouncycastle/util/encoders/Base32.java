package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class Base32 {
    private static final Encoder encoder = new Base32Encoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.encoders.DecoderException */
    public static int decode(byte[] bArr, int i, int i2, OutputStream outputStream) throws DecoderException {
        try {
            return encoder.decode(bArr, i, i2, outputStream);
        } catch (Exception e) {
            throw new DecoderException("unable to decode base32 data: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.encoders.DecoderException */
    public static byte[] decode(String str) throws DecoderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 8) * 5);
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("unable to decode base32 string: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.encoders.DecoderException */
    public static byte[] decode(byte[] bArr) throws DecoderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 8) * 5);
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("unable to decode base32 data: " + e.getMessage(), e);
        }
    }

    public static int encode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, i, i2, outputStream);
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.encoders.EncoderException */
    public static byte[] encode(byte[] bArr, int i, int i2) throws EncoderException {
        Encoder encoder2 = encoder;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(encoder2.getEncodedLength(i2));
        try {
            encoder2.encode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding base32 string: " + e.getMessage(), e);
        }
    }

    public static String toBase32String(byte[] bArr) {
        return toBase32String(bArr, 0, bArr.length);
    }

    public static String toBase32String(byte[] bArr, int i, int i2) {
        return Strings.fromByteArray(encode(bArr, i, i2));
    }
}
