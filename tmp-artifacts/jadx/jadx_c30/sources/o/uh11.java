package o;

import java.util.Objects;
import java.util.Optional;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh11 extends uh12 {
    public uh11(String str, Optional<sya8> optional, String str2, Optional<sya8> optional2) {
        super(str, optional, str2, optional2);
        Objects.requireNonNull(str);
    }

    public uh11(String str, Optional<sya8> optional) {
        super(BuildConfig.FLAVOR, Optional.empty(), str, optional);
    }
}
