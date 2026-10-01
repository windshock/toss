package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.findFirstVisibleChildClosestToStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class findOneVisibleChild {
    public static final findFirstVisibleChildClosestToStart.onExtraCallbackWithResult IAuthTabCallback(@NotNull findFirstVisibleChildClosestToStart.onExtraCallbackWithResult onextracallbackwithresult, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return onextracallbackwithresult.onExtraCallback(new String(bArr, Charsets.UTF_8));
    }

    public static final <T> List<T> onNavigationEvent(@Nullable JSONArray jSONArray, @NotNull Function1<? super JSONObject, ? extends T> function1) throws JSONException {
        Intrinsics.checkNotNullParameter(function1, "");
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            Object objInvoke = function1.invoke(jSONObject);
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> IAuthTabCallback(@Nullable JSONArray jSONArray, @NotNull Function1<? super String, ? extends T> function1) throws JSONException {
        Intrinsics.checkNotNullParameter(function1, "");
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(function1.invoke(string));
        }
        return arrayList;
    }

    public static final <T> List<T> onNavigationEvent(@Nullable JSONObject jSONObject, @NotNull Function2<? super JSONObject, ? super String, ? extends T> function2) throws JSONException {
        Intrinsics.checkNotNullParameter(function2, "");
        if (jSONObject == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            Intrinsics.checkNotNull(next);
            arrayList.add(function2.invoke(jSONObject2, next));
        }
        return arrayList;
    }
}
