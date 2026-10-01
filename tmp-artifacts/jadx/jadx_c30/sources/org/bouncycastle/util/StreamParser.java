package org.bouncycastle.util;

import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface StreamParser {
    Object read() throws StreamParsingException;

    Collection readAll() throws StreamParsingException;
}
