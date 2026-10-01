package org.apache.commons.compress.archivers.zip;

import java.nio.file.Path;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda3 implements Predicate {
    public final /* synthetic */ Pattern f$0;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f$0.matcher(((Path) obj).getFileName().toString()).matches();
    }
}
