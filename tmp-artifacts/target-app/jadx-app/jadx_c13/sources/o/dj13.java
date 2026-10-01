package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.function.Predicate;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class dj13 {
    static final TTWebsiteActivity7 onExtraCallback = onExtraCallback("UTF8");

    public static TTWebsiteActivity7 onExtraCallback(String str) {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        if (str != null) {
            try {
                charsetDefaultCharset = Charset.forName(str);
            } catch (UnsupportedCharsetException unused) {
            }
        }
        return new TTVideoLandingPageLink2Activity11(charsetDefaultCharset, IAuthTabCallback(charsetDefaultCharset.name()));
    }

    static ByteBuffer IAuthTabCallback(ByteBuffer byteBuffer, int i) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity() + i);
        byteBufferAllocate.put(byteBuffer);
        return byteBufferAllocate;
    }

    static boolean IAuthTabCallback(final String str) {
        if (str == null) {
            str = Charset.defaultCharset().name();
        }
        Charset charset = StandardCharsets.UTF_8;
        if (charset.name().equalsIgnoreCase(str)) {
            return true;
        }
        return charset.aliases().stream().anyMatch(new Predicate() { // from class: org.apache.commons.compress.archivers.zip.ZipEncodingHelper$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).equalsIgnoreCase(str);
            }
        });
    }
}
