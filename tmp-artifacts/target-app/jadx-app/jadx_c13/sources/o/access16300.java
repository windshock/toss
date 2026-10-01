package o;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access16300 extends ByteArrayOutputStream {
    public access16300(int i) {
        super(i);
    }

    public final byte[] IAuthTabCallback() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(bArr, "");
        return bArr;
    }
}
