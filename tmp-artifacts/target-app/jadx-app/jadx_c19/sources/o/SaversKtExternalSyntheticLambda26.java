package o;

import androidx.annotation.NonNull;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SaversKtExternalSyntheticLambda26 {
    public static final Charset IAuthTabCallback = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(@NonNull MessageDigest messageDigest);
}
