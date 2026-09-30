package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class UrlBase64 {
    private static final Encoder encoder = new UrlBase64Encoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }

    public static int decode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.decode(bArr, 0, bArr.length, outputStream);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.encoders.DecoderException */
    public static byte[] decode(String str) throws DecoderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding URL safe base64 string: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.encoders.DecoderException */
    public static byte[] decode(byte[] bArr) throws DecoderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding URL safe base64 string: " + e.getMessage(), e);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.encoders.EncoderException */
    public static byte[] encode(byte[] bArr) throws EncoderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding URL safe base64 data: " + e.getMessage(), e);
        }
    }
}
