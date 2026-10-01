package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExtractorUtil {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    @Pure
    public static void checkContainerInput(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedContainer(str, (Throwable) null);
        }
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int iPeek = extractorInput.peek(bArr, i2 + i4, i3 - i4);
            if (iPeek == -1) {
                break;
            }
            i4 += iPeek;
        }
        return i4;
    }

    public static boolean readFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i2, int i3) throws IOException {
        try {
            extractorInput.readFully(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput extractorInput, int i2) throws IOException {
        try {
            extractorInput.skipFully(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean peekFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i2, int i3, boolean z) throws IOException {
        try {
            return extractorInput.peekFully(bArr, i2, i3, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    private ExtractorUtil() {
    }
}
