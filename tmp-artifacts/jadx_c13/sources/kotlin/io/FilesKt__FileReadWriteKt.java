package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.FilesKt__FileReadWriteKt$;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import o.TTHistoryActivity2;
import o.access16300;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
    static /* synthetic */ InputStreamReader reader$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    private static final InputStreamReader reader(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = TTHistoryActivity2.SIZE;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    private static final BufferedReader bufferedReader(File file, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    static /* synthetic */ OutputStreamWriter writer$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    private static final OutputStreamWriter writer(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = TTHistoryActivity2.SIZE;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    private static final BufferedWriter bufferedWriter(File file, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    static /* synthetic */ PrintWriter printWriter$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), TTHistoryActivity2.SIZE));
    }

    private static final PrintWriter printWriter(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), TTHistoryActivity2.SIZE));
    }

    public static byte[] readBytes(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyInto = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyInto, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyInto = Arrays.copyOf(bArrCopyInto, i3);
                Intrinsics.checkNotNullExpressionValue(bArrCopyInto, "");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    access16300 access16300Var = new access16300(8193);
                    access16300Var.write(i5);
                    ByteStreamsKt.copyTo$default(fileInputStream, access16300Var, 0, 2, null);
                    int size = access16300Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrIAuthTabCallback = access16300Var.IAuthTabCallback();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrCopyInto, size);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                    bArrCopyInto = ArraysKt___ArraysJvmKt.copyInto(bArrIAuthTabCallback, bArrCopyOf, i, 0, access16300Var.size());
                }
            }
            CloseableKt.closeFinally(fileInputStream, null);
            return bArrCopyInto;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static void writeBytes(@NotNull File file, @NotNull byte[] bArr) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void appendBytes(@NotNull File file, @NotNull byte[] bArr) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static String readText(@NotNull File file, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String text = TextStreamsKt.readText(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            return text;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readText(file, charset);
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(file, str, charset);
    }

    public static void writeText(@NotNull File file, @NotNull String str, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeTextImpl(fileOutputStream, str, charset);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void appendText$default(File file, String str, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        appendText(file, str, charset);
    }

    public static final void appendText(@NotNull File file, @NotNull String str, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            writeTextImpl(fileOutputStream, str, charset);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static void writeTextImpl(@NotNull OutputStream outputStream, @NotNull String str, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewReplaceEncoder = newReplaceEncoder(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(TTHistoryActivity2.SIZE);
        Intrinsics.checkNotNull(charsetEncoderNewReplaceEncoder);
        ByteBuffer byteBufferByteBufferForEncoding = byteBufferForEncoding(TTHistoryActivity2.SIZE, charsetEncoderNewReplaceEncoder);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderNewReplaceEncoder.encode(charBufferAllocate, byteBufferByteBufferForEncoding, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferByteBufferForEncoding.array(), 0, byteBufferByteBufferForEncoding.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferByteBufferForEncoding.clear();
            i = i3;
        }
    }

    public static CharsetEncoder newReplaceEncoder(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static ByteBuffer byteBufferForEncoding(int i, @NotNull CharsetEncoder charsetEncoder) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "");
        return byteBufferAllocate;
    }

    public static final void forEachBlock(@NotNull File file, @NotNull Function2<? super byte[], ? super Integer, Unit> function2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(function2, "");
        forEachBlock(file, 4096, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void forEachBlock(@NotNull File file, int i, @NotNull Function2<? super byte[], ? super Integer, Unit> function2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ?? r2 = new byte[RangesKt___RangesKt.coerceAtLeast(i, Imgcodecs.IMWRITE_AVIF_QUALITY)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(r2);
                if (i2 > 0) {
                    function2.invoke(r2, Integer.valueOf(i2));
                } else {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return;
                }
            } finally {
            }
        }
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, Function1 function1, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        forEachLine(file, charset, function1);
    }

    public static final void forEachLine(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super String, Unit> function1) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), function1);
    }

    private static final FileInputStream inputStream(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return new FileInputStream(file);
    }

    private static final FileOutputStream outputStream(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return new FileOutputStream(file);
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readLines(file, charset);
    }

    public static final List<String> readLines(@NotNull File file, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new FilesKt__FileReadWriteKt$.ExternalSyntheticLambda0(arrayList));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readLines$lambda$0$FilesKt__FileReadWriteKt(ArrayList arrayList, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        arrayList.add(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object useLines$default(File file, Charset charset, Function1 function1, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), TTHistoryActivity2.SIZE);
        try {
            Object objInvoke = function1.invoke(TextStreamsKt.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedReader, null);
            InlineMarker.finallyEnd(1);
            return objInvoke;
        } finally {
        }
    }

    public static final <T> T useLines(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super Sequence<String>, ? extends T> function1) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(charset, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), TTHistoryActivity2.SIZE);
        try {
            T tInvoke = function1.invoke(TextStreamsKt.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedReader, null);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } finally {
        }
    }
}
