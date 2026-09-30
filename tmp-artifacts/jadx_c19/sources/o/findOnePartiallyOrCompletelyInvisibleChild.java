package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mikepenz.aboutlibraries.util.Result;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.fill;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findOnePartiallyOrCompletelyInvisibleChild {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27257, 27177, 27177, 27175, 27154, 27384, 27388, 27260, 27170, 27173, 27172, 27171, 27170, 27196, 27168, 27170, 27168, 27175};
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ findFirstVisibleChildClosestToEnd onExtraCallback(Map map, String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoendOnWarmupCompleted = onWarmupCompleted(map, str);
        int i5 = onExtraCallback + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return findfirstvisiblechildclosesttoendOnWarmupCompleted;
    }

    public static /* synthetic */ findFirstVisibleChildClosestToEnd onExtraCallback(JSONObject jSONObject, String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend = (findFirstVisibleChildClosestToEnd) onExtraCallbackWithResult(new Object[]{jSONObject, str}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1544631780, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1544631780);
        int i5 = onWarmupCompleted + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return findfirstvisiblechildclosesttoend;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i4;
        int i9 = ~((~i7) | i8 | i3);
        int i10 = ~i3;
        int i11 = (~(i8 | i7)) | (~(i8 | i10)) | (~(i10 | i7));
        int i12 = (~(i10 | i4)) | i7;
        int i13 = i4 + i7 + i6 + ((-946781377) * i2) + ((-59450693) * i5);
        int i14 = i13 * i13;
        int i15 = (((-143250568) * i4) - 346488832) + (357422218 * i7) + (i9 * (-1897147255)) + ((-1897147255) * i11) + (1897147255 * i12) + ((-2040397824) * i6) + ((-1205993472) * i2) + ((-1651113984) * i5) + ((-884408320) * i14);
        int i16 = ((i4 * 358501064) - 1042343473) + (i7 * 358500518) + (i9 * (-273)) + (i11 * (-273)) + (i12 * 273) + (i6 * 358500791) + (i2 * (-249165559)) + (i5 * 1905372845) + (i14 * 573505536);
        if (i15 + (i16 * i16 * (-553189376)) == 1) {
            return onWarmupCompleted(objArr);
        }
        JSONObject jSONObject = (JSONObject) objArr[0];
        String str = (String) objArr[1];
        int i17 = 2 % 2;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr2 = new Object[1];
        a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 0, 0}, objArr2);
        String string = jSONObject.getString(((String) objArr2[0]).intern());
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr3 = new Object[1];
        a(new int[]{4, 3, 67, 0}, false, new byte[]{0, 1, 0}, objArr3);
        findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend = new findFirstVisibleChildClosestToEnd(string, jSONObject.optString(((String) objArr3[0]).intern()), jSONObject.optString("year"), jSONObject.optString("spdxId"), jSONObject.optString("content"), str);
        int i18 = onExtraCallback + 61;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        return findfirstvisiblechildclosesttoend;
    }

    public static /* synthetic */ ensureLayoutState onExtraCallbackWithResult(Map map, JSONObject jSONObject) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(map, jSONObject);
        }
        onNavigationEvent(map, jSONObject);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findFirstCompletelyVisibleItemPosition onExtraCallbackWithResult(JSONObject jSONObject) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        findFirstCompletelyVisibleItemPosition findfirstcompletelyvisibleitempositionOnWarmupCompleted = onWarmupCompleted(jSONObject);
        int i5 = onWarmupCompleted + 3;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return findfirstcompletelyvisibleitempositionOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        JSONObject jSONObject = (JSONObject) objArr[0];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(jSONObject);
        }
        onNavigationEvent(jSONObject);
        throw null;
    }

    private static final findFirstVisibleChildClosestToEnd onWarmupCompleted(Map map, String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return (findFirstVisibleChildClosestToEnd) map.get(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend = (findFirstVisibleChildClosestToEnd) map.get(str);
        int i4 = 82 / 0;
        return findfirstvisiblechildclosesttoend;
    }

    private static final fill onNavigationEvent(JSONObject jSONObject) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 0, 0}, objArr);
        fill fillVar = new fill(jSONObject.optString(((String) objArr[0]).intern()), jSONObject.optString("organisationUrl"));
        int i3 = onExtraCallback + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return fillVar;
    }

    private static final findFirstCompletelyVisibleItemPosition onWarmupCompleted(JSONObject jSONObject) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        String string = jSONObject.getString("platform");
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = new Object[1];
        a(new int[]{4, 3, 67, 0}, false, new byte[]{0, 1, 0}, objArr);
        String string2 = jSONObject.getString(((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(string2, "");
        findFirstCompletelyVisibleItemPosition findfirstcompletelyvisibleitemposition = new findFirstCompletelyVisibleItemPosition(string, string2);
        int i3 = onExtraCallback + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return findfirstcompletelyvisibleitemposition;
        }
        throw null;
    }

    private static final ensureLayoutState onNavigationEvent(final Map map, JSONObject jSONObject) throws Throwable {
        List listEmptyList;
        findLastVisibleItemPosition findlastvisibleitemposition;
        findLastCompletelyVisibleItemPosition findlastcompletelyvisibleitemposition;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        List<findFirstVisibleChildClosestToEnd> listIAuthTabCallback = findOneVisibleChild.IAuthTabCallback(jSONObject.optJSONArray("licenses"), new Function1() { // from class: com.mikepenz.aboutlibraries.util.AndroidParserKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return findOnePartiallyOrCompletelyInvisibleChild.onExtraCallback(map, (String) obj);
            }
        });
        ArrayList arrayList = new ArrayList();
        for (findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend : listIAuthTabCallback) {
            if (findfirstvisiblechildclosesttoend != null) {
                arrayList.add(findfirstvisiblechildclosesttoend);
            }
        }
        HashSet hashSet = CollectionsKt.toHashSet(arrayList);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("developers");
        if (jSONArrayOptJSONArray == null || (listEmptyList = findOneVisibleChild.onNavigationEvent(jSONArrayOptJSONArray, new Function1() { // from class: com.mikepenz.aboutlibraries.util.AndroidParserKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return (fill) findOnePartiallyOrCompletelyInvisibleChild.onExtraCallbackWithResult(new Object[]{(JSONObject) obj}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1850844180, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1850844181);
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("organization");
        if (jSONObjectOptJSONObject != null) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 0, 0}, objArr);
            String string = jSONObjectOptJSONObject.getString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(string, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{4, 3, 67, 0}, false, new byte[]{0, 1, 0}, objArr2);
            findLastVisibleItemPosition findlastvisibleitemposition2 = new findLastVisibleItemPosition(string, jSONObjectOptJSONObject.optString(((String) objArr2[0]).intern()));
            int i3 = onWarmupCompleted + 87;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            findlastvisibleitemposition = findlastvisibleitemposition2;
        } else {
            int i5 = onExtraCallback + 49;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            findlastvisibleitemposition = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("scm");
        if (jSONObjectOptJSONObject2 != null) {
            String strOptString = jSONObjectOptJSONObject2.optString("connection");
            String strOptString2 = jSONObjectOptJSONObject2.optString("developerConnection");
            Object[] objArr3 = new Object[1];
            a(new int[]{4, 3, 67, 0}, false, new byte[]{0, 1, 0}, objArr3);
            findlastcompletelyvisibleitemposition = new findLastCompletelyVisibleItemPosition(strOptString, strOptString2, jSONObjectOptJSONObject2.optString(((String) objArr3[0]).intern()));
        } else {
            findlastcompletelyvisibleitemposition = null;
        }
        Set set = CollectionsKt.toSet(findOneVisibleChild.onNavigationEvent(jSONObject.optJSONArray("funding"), new Function1() { // from class: com.mikepenz.aboutlibraries.util.AndroidParserKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return findOnePartiallyOrCompletelyInvisibleChild.onExtraCallbackWithResult((JSONObject) obj);
            }
        }));
        String string2 = jSONObject.getString("uniqueId");
        Intrinsics.checkNotNull(string2);
        String strOptString3 = jSONObject.optString("artifactVersion");
        Object[] objArr4 = new Object[1];
        a(new int[]{0, 4, 0, 0}, false, new byte[]{0, 1, 0, 0}, objArr4);
        String strOptString4 = jSONObject.optString(((String) objArr4[0]).intern(), string2);
        Intrinsics.checkNotNullExpressionValue(strOptString4, "");
        Object[] objArr5 = new Object[1];
        a(new int[]{7, 11, 0, 10}, false, new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0}, objArr5);
        return new ensureLayoutState(string2, strOptString3, strOptString4, jSONObject.optString(((String) objArr5[0]).intern()), jSONObject.optString("website"), getOpenFdsCount.onWarmupCompleted(listEmptyList), findlastvisibleitemposition, findlastcompletelyvisibleitemposition, getOpenFdsCount.onExtraCallback(hashSet), getOpenFdsCount.onExtraCallback(set), jSONObject.optString("tag"));
    }

    public static final Result onExtraCallback(@NotNull String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            JSONObject jSONObject = new JSONObject(str);
            List listOnNavigationEvent = findOneVisibleChild.onNavigationEvent(jSONObject.getJSONObject("licenses"), new Function2() { // from class: com.mikepenz.aboutlibraries.util.AndroidParserKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return findOnePartiallyOrCompletelyInvisibleChild.onExtraCallback((JSONObject) obj, (String) obj2);
                }
            });
            List list = listOnNavigationEvent;
            final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            Iterator it = list.iterator();
            int i3 = onWarmupCompleted + 87;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                int i5 = onWarmupCompleted + 63;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    Object next = it.next();
                    linkedHashMap.put(((findFirstVisibleChildClosestToEnd) next).onWarmupCompleted(), next);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object next2 = it.next();
                linkedHashMap.put(((findFirstVisibleChildClosestToEnd) next2).onWarmupCompleted(), next2);
            }
            return new Result(findOneVisibleChild.onNavigationEvent(jSONObject.getJSONArray("libraries"), new Function1() { // from class: com.mikepenz.aboutlibraries.util.AndroidParserKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2) {
                    return findOnePartiallyOrCompletelyInvisibleChild.onExtraCallbackWithResult(linkedHashMap, (JSONObject) obj2);
                }
            }), listOnNavigationEvent);
        } catch (Throwable th) {
            th.toString();
            return new Result(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35283), 35 - TextUtils.getCapsMode("", 0, 0), 14239 - (ViewConfiguration.getTouchSlop() >> 8), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.MeasureSpec.makeMeasureSpec(0, 0)), 66 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 16719 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, 17656 - TextUtils.indexOf((CharSequence) "", '0'), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49468), 69 - TextUtils.indexOf((CharSequence) "", '0', 0), 12486 - View.resolveSize(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i10, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i10);
            int i11 = $10 + 1;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i13 = $10 + 85;
            $11 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $10 + 73;
                $11 = i16 % 128;
                int i17 = i16 % i14;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                i14 = 2;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i18 = $11 + 35;
        $10 = i18 % 128;
        if (i18 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i19 = 88 / 0;
            objArr[0] = str;
        }
    }

    public static /* synthetic */ fill IAuthTabCallback(JSONObject jSONObject) {
        return (fill) onExtraCallbackWithResult(new Object[]{jSONObject}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1850844180, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1850844181);
    }

    private static final findFirstVisibleChildClosestToEnd onWarmupCompleted(JSONObject jSONObject, String str) {
        return (findFirstVisibleChildClosestToEnd) onExtraCallbackWithResult(new Object[]{jSONObject, str}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1544631780, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1544631780);
    }
}
