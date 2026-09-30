package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import o.TTHistoryActivity2;
import o.access16400;
import o.clearSelinuxLabel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TextStreamsKt {
    static /* synthetic */ BufferedReader buffered$default(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TTHistoryActivity2.SIZE;
        }
        Intrinsics.checkNotNullParameter(reader, "");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    private static final BufferedReader buffered(Reader reader, int i) {
        Intrinsics.checkNotNullParameter(reader, "");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    static /* synthetic */ BufferedWriter buffered$default(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TTHistoryActivity2.SIZE;
        }
        Intrinsics.checkNotNullParameter(writer, "");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    private static final BufferedWriter buffered(Writer writer, int i) {
        Intrinsics.checkNotNullParameter(writer, "");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static final List<String> readLines(@NotNull Reader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "");
        final ArrayList arrayList = new ArrayList();
        forEachLine(reader, new Function1() { // from class: kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextStreamsKt.readLines$lambda$0(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readLines$lambda$0(ArrayList arrayList, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        arrayList.add(str);
        return Unit.INSTANCE;
    }

    public static final <T> T useLines(@NotNull Reader reader, @NotNull Function1<? super Sequence<String>, ? extends T> function1) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, TTHistoryActivity2.SIZE);
        try {
            T tInvoke = function1.invoke(lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedReader, null);
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } finally {
        }
    }

    private static final StringReader reader(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StringReader(str);
    }

    public static final Sequence<String> lineSequence(@NotNull BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "");
        return clearSelinuxLabel.IAuthTabCallback_Parcel(new access16400(bufferedReader));
    }

    public static final String readText(@NotNull Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "");
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = TTHistoryActivity2.SIZE;
        }
        return copyTo(reader, writer, i);
    }

    public static final long copyTo(@NotNull Reader reader, @NotNull Writer writer, int i) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "");
        Intrinsics.checkNotNullParameter(writer, "");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    private static final String readText(URL url, Charset charset) {
        Intrinsics.checkNotNullParameter(url, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new String(readBytes(url), charset);
    }

    static /* synthetic */ String readText$default(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(url, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new String(readBytes(url), charset);
    }

    public static final byte[] readBytes(@NotNull URL url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            Intrinsics.checkNotNull(inputStreamOpenStream);
            byte[] bytes = ByteStreamsKt.readBytes(inputStreamOpenStream);
            CloseableKt.closeFinally(inputStreamOpenStream, null);
            return bytes;
        } finally {
        }
    }

    public static final void forEachLine(@NotNull Reader reader, @NotNull Function1<? super String, Unit> function1) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, TTHistoryActivity2.SIZE);
        try {
            Iterator<String> itIAuthTabCallback = lineSequence(bufferedReader).IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
                function1.invoke(itIAuthTabCallback.next());
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedReader, null);
        } finally {
        }
    }
}
