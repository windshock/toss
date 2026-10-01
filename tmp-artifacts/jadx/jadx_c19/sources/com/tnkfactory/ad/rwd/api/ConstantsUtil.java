package com.tnkfactory.ad.rwd.api;

import com.tnkfactory.framework.crypto.EncryptUtils;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ConstantsUtil {
    public static final ConstantsUtil INSTANCE = new ConstantsUtil();
    public static final HashMap a = new HashMap();

    public final String def(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        HashMap map = a;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        String strDecryptRC4 = EncryptUtils.decryptRC4(str);
        map.put(str, strDecryptRC4);
        Intrinsics.checkNotNull(strDecryptRC4);
        return strDecryptRC4;
    }
}
