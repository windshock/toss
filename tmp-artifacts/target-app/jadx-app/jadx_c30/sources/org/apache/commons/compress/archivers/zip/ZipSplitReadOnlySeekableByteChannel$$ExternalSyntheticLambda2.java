package org.apache.commons.compress.archivers.zip;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.function.Predicate;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ZipSplitReadOnlySeekableByteChannel$$ExternalSyntheticLambda2 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Files.isRegularFile((Path) obj, new LinkOption[0]);
    }
}
