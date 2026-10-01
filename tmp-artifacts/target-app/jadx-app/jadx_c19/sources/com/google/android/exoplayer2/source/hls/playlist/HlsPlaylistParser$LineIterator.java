package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.util.Assertions;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class HlsPlaylistParser$LineIterator {
    private final Queue<String> extraLines;
    private String next;
    private final BufferedReader reader;

    public HlsPlaylistParser$LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
        this.extraLines = queue;
        this.reader = bufferedReader;
    }

    @EnsuresNonNullIf
    public boolean hasNext() throws IOException {
        String strTrim;
        if (this.next != null) {
            return true;
        }
        if (!this.extraLines.isEmpty()) {
            this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
            return true;
        }
        do {
            String line = this.reader.readLine();
            this.next = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.next = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public String next() throws IOException {
        if (hasNext()) {
            String str = this.next;
            this.next = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
