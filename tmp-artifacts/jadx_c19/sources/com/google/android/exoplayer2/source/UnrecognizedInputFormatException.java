package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str, (Throwable) null, false, 1);
        this.uri = uri;
    }
}
