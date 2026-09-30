package o;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AFi1tSDKAFa1uSDK;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1tSDK {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(str);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return strOnExtraCallback;
    }

    private static final String onExtraCallback(String str) {
        List listSplit$default;
        String strJoinToString$default;
        int i = 2 % 2;
        if (str == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null)) == null) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
                int i2 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 4;
                }
            }
        }
        List listSorted = CollectionsKt___CollectionsKt.sorted(arrayList);
        if (listSorted == null) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int i4 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listSorted, ",", null, null, 1, null, null, 83, null);
            if (strJoinToString$default == null) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
        } else {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listSorted, ",", null, null, 0, null, null, 62, null);
            if (strJoinToString$default == null) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        return strJoinToString$default;
    }

    public static final AFi1tSDKAFa1uSDK onNavigationEvent(@NotNull List<WidgetWatchlists.WatchList> list, @Nullable Long l) {
        Object next;
        Object next2;
        Object next3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            list.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        List<WidgetWatchlists.WatchList> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            long jLongValue = ((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{(WidgetWatchlists.WatchList) next}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue();
            if (l != null && jLongValue == l.longValue()) {
                break;
            }
        }
        WidgetWatchlists.WatchList watchList = (WidgetWatchlists.WatchList) next;
        if (watchList != null) {
            return new AFi1tSDKAFa1uSDK(watchList, AFi1tSDKAFa1uSDK.onExtraCallback.SELECTED);
        }
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((WidgetWatchlists.WatchList) next2).asInterface() == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH) {
                break;
            }
        }
        WidgetWatchlists.WatchList watchList2 = (WidgetWatchlists.WatchList) next2;
        if (watchList2 != null) {
            return new AFi1tSDKAFa1uSDK(watchList2, AFi1tSDKAFa1uSDK.onExtraCallback.RECENT_WATCH);
        }
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            List listOnExtraCallbackWithResult = ((WidgetWatchlists.WatchList) next3).onExtraCallbackWithResult();
            if (listOnExtraCallbackWithResult != null) {
                int i3 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                if (!listOnExtraCallbackWithResult.isEmpty()) {
                    int i5 = onExtraCallbackWithResult + 59;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    break;
                }
            }
            int i7 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        WidgetWatchlists.WatchList watchList3 = (WidgetWatchlists.WatchList) next3;
        if (watchList3 == null) {
            watchList3 = (WidgetWatchlists.WatchList) CollectionsKt___CollectionsKt.firstOrNull((List) list);
        }
        if (watchList3 == null) {
            return null;
        }
        AFi1tSDKAFa1uSDK aFi1tSDKAFa1uSDK = new AFi1tSDKAFa1uSDK(watchList3, AFi1tSDKAFa1uSDK.onExtraCallback.FIRST_GROUP);
        int i9 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return aFi1tSDKAFa1uSDK;
    }
}
