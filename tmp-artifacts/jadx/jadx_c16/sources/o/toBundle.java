package o;

import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toBundle {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r1
      0x0033: PHI (r1v8 java.util.Set<java.lang.String>) = (r1v7 java.util.Set<java.lang.String>), (r1v11 java.util.Set<java.lang.String>) binds: [B:10:0x0031, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull Intent intent) {
        Set<String> queryParameterNames;
        String queryParameter;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        Uri data = intent.getData();
        if (data != null) {
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                queryParameterNames = data.getQueryParameterNames();
                int i5 = 79 / 0;
                if (queryParameterNames != null) {
                    Iterator<T> it = queryParameterNames.iterator();
                    while (!(!it.hasNext())) {
                        String str = (String) it.next();
                        if (!intent.hasExtra(str)) {
                            int i6 = IAuthTabCallback + 21;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            Uri data2 = intent.getData();
                            if (data2 != null) {
                                int i8 = onExtraCallbackWithResult + 115;
                                IAuthTabCallback = i8 % 128;
                                if (i8 % 2 == 0) {
                                    queryParameter = data2.getQueryParameter(str);
                                    int i9 = 78 / 0;
                                    if (queryParameter != null) {
                                        intent.putExtra(str, queryParameter);
                                    }
                                } else {
                                    queryParameter = data2.getQueryParameter(str);
                                    if (queryParameter != null) {
                                        intent.putExtra(str, queryParameter);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                queryParameterNames = data.getQueryParameterNames();
                if (queryParameterNames != null) {
                }
            }
        }
        int i10 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
