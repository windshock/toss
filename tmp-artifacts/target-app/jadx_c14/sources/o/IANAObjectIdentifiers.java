package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class IANAObjectIdentifiers extends ByteArrayOutputStream {
    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(bArr, "");
        ArraysKt.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
        reset();
        super.close();
    }
}
