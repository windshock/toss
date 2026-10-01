package im.toss.rn.toss.core.remoteprocess;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnSchemeAndroidOnlyQueryParamsKt {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri onExtraCallback(@NotNull Uri uri) {
        Object next;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return uri;
        }
        List listSplit$default = StringsKt.split$default(encodedQuery, new char[]{'&'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i3 = onNavigationEvent + 97;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                next = it.next();
                if (!RnSchemeAndroidOnlyQueryParams.onExtraCallbackWithResult.IAuthTabCallback().contains(Uri.decode(StringsKt.substringBefore$default((String) next, '\f', (String) null, 5, (Object) null)))) {
                    i = onExtraCallback + 17;
                    onNavigationEvent = i % 128;
                    if (i % 2 != 0) {
                        arrayList.add(next);
                        int i4 = 44 / 0;
                    } else {
                        arrayList.add(next);
                    }
                }
            } else {
                next = it.next();
                if (!RnSchemeAndroidOnlyQueryParams.onExtraCallbackWithResult.IAuthTabCallback().contains(Uri.decode(StringsKt.substringBefore$default((String) next, '=', (String) null, 2, (Object) null)))) {
                    i = onExtraCallback + 17;
                    onNavigationEvent = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            }
        }
        if (arrayList.size() == listSplit$default.size()) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        Uri uriBuild = builderBuildUpon.encodedQuery(strJoinToString$default.length() > 0 ? strJoinToString$default : null).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        return uriBuild;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.toBooleanStrictOrNull(r5), java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r1 = im.toss.rn.toss.core.remoteprocess.RnSchemeAndroidOnlyQueryParamsKt.onExtraCallback + 47;
        im.toss.rn.toss.core.remoteprocess.RnSchemeAndroidOnlyQueryParamsKt.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onWarmupCompleted(@NotNull Uri uri) {
        String queryParameter;
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            queryParameter = uri.getQueryParameter("rn_rp");
            int i3 = 46 / 0;
        } else {
            Intrinsics.checkNotNullParameter(uri, "");
            queryParameter = uri.getQueryParameter("rn_rp");
        }
    }
}
