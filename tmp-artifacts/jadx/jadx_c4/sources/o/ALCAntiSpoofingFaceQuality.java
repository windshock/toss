package o;

import android.content.Context;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.TossApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.ALCAntiSpoofingFaceQuality;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCAntiSpoofingFaceQuality {
    private static final boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    public static final ALCAntiSpoofingFaceQuality onExtraCallback = new ALCAntiSpoofingFaceQuality();
    private static TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static Context onWarmupCompleted;

    static {
        int i = asInterface + 125;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i3;
        int i9 = (~i8) | (~(i7 | i6));
        int i10 = (~((~i6) | i7 | (~i3))) | (~(i4 | i3));
        int i11 = i4 + i3 + i2 + ((-540997959) * i5) + (162607451 * i);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i4) + 1723858944 + (1667710703 * i3) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i2) + ((-672137216) * i5) + (483393536 * i) + (377683968 * i12);
        int i14 = (i4 * 228155117) + 240245784 + (i3 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i2 * 228155391) + (i5 * (-329950905)) + (i * (-2026639707)) + (i12 * 159186944);
        if (i13 + (i14 * i14 * (-1451425792)) == 1) {
            return onWarmupCompleted(objArr);
        }
        Context context = (Context) objArr[1];
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) objArr[2];
        int i15 = 2 % 2;
        int i16 = asBinder + 53;
        onNavigationEvent = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        onWarmupCompleted = context;
        onExtraCallbackWithResult = textRoundCornerProgressBarSavedState1;
        int i18 = asBinder + 121;
        onNavigationEvent = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    public static /* synthetic */ void onNavigationEvent(JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        asBinder(jsonObject);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(jsonObject);
        int i4 = asBinder + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private ALCAntiSpoofingFaceQuality() {
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        JsonObject jsonObject;
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List<String> listSplit$default = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, (Object) null);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = onExtraCallbackWithResult;
        if (textRoundCornerProgressBarSavedState1 == null) {
            int i4 = onNavigationEvent + 39;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            textRoundCornerProgressBarSavedState1 = null;
        }
        JsonObject jsonObjectOnExtraCallback = wie2.Default.onExtraCallback(textRoundCornerProgressBarSavedState1.onExtraCallbackWithResult("__ORIGIN__", ""));
        if (jsonObjectOnExtraCallback instanceof JsonObject) {
            jsonObject = jsonObjectOnExtraCallback;
            int i6 = onNavigationEvent + 53;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = onNavigationEvent + 91;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            jsonObject = null;
        }
        if (jsonObject != null) {
            return onExtraCallback.onExtraCallbackWithResult(jsonObject, listSplit$default);
        }
        return null;
    }

    private final JsonElement onExtraCallbackWithResult(JsonObject jsonObject, List<String> list) {
        String str;
        int i = 2 % 2;
        String str2 = (String) CollectionsKt.firstOrNull(list);
        Object obj = null;
        if (list.size() > 1) {
            int i2 = asBinder + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            str = list.get(1);
        } else {
            int i4 = asBinder + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        if (str2 == null) {
            int i6 = onNavigationEvent + 105;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        if (!jsonObject.containsKey(str2)) {
            int i7 = asBinder + 15;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (str == null) {
            return (JsonElement) jsonObject.get(str2);
        }
        int i8 = asBinder + 41;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            boolean z = ((JsonElement) jsonObject.get(str2)) instanceof JsonObject;
            throw null;
        }
        JsonElement jsonElement = (JsonElement) jsonObject.get(str2);
        if (jsonElement instanceof JsonObject) {
            return onExtraCallbackWithResult((JsonObject) jsonElement, list.subList(1, list.size()));
        }
        return null;
    }

    public final JsonElement onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = onExtraCallbackWithResult;
        Object obj = null;
        if (textRoundCornerProgressBarSavedState1 == null) {
            int i2 = asBinder + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            textRoundCornerProgressBarSavedState1 = null;
        }
        if (!(!textRoundCornerProgressBarSavedState1.onNavigationEvent("__ORIGIN__"))) {
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            JsonElement jsonElement = (JsonElement) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1854786862, -1854786861, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this, str}, iOnExtraCallback);
            if (jsonElement != null) {
                return jsonElement;
            }
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = onExtraCallbackWithResult;
        if (textRoundCornerProgressBarSavedState12 == null) {
            int i3 = onNavigationEvent + 13;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 2 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textRoundCornerProgressBarSavedState12 = null;
        }
        String strIAuthTabCallback = textRoundCornerProgressBarSavedState12.IAuthTabCallback(str);
        if (strIAuthTabCallback == null) {
            return null;
        }
        JsonPrimitive jsonPrimitiveOnNavigationEvent = startSDK.onNavigationEvent(strIAuthTabCallback);
        if (IAuthTabCallback) {
            Objects.toString(jsonPrimitiveOnNavigationEvent);
        }
        int i5 = asBinder + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return jsonPrimitiveOnNavigationEvent;
    }

    private final void onNavigationEvent(String str, JsonElement jsonElement) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = null;
        if (jsonElement instanceof JsonNull) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = onExtraCallbackWithResult;
            if (textRoundCornerProgressBarSavedState12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = asBinder + 71;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                textRoundCornerProgressBarSavedState12 = null;
            }
            if (textRoundCornerProgressBarSavedState12.onNavigationEvent(str)) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaVarsV1OriginManager", "value is JsonNull. removing node for key=" + str, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState13 = onExtraCallbackWithResult;
                if (textRoundCornerProgressBarSavedState13 == null) {
                    int i6 = asBinder + 23;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    textRoundCornerProgressBarSavedState1 = textRoundCornerProgressBarSavedState13;
                }
                textRoundCornerProgressBarSavedState1.onTransact(str);
                return;
            }
            return;
        }
        if (!(!(jsonElement instanceof JsonPrimitive))) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState14 = onExtraCallbackWithResult;
            if (textRoundCornerProgressBarSavedState14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i8 = asBinder + 121;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                textRoundCornerProgressBarSavedState1 = textRoundCornerProgressBarSavedState14;
            }
            textRoundCornerProgressBarSavedState1.onNavigationEvent(str, initRenderFinish.onNavigationEvent(jsonElement).onWarmupCompleted());
            return;
        }
        if (jsonElement instanceof JsonObject) {
            if (initRenderFinish.onExtraCallbackWithResult(jsonElement).isEmpty()) {
                return;
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaVarsV1OriginManager", "value is JsonObject. " + str + "=" + jsonElement, (Throwable) null, (Map) null, 12, (Object) null);
            return;
        }
        if (jsonElement instanceof JsonArray) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaVarsV1OriginManager", "value is JsonArray. " + str + "=" + jsonElement, (Throwable) null, (Map) null, 12, (Object) null);
            return;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TubaVarsV1OriginManager", "value is unknown type. " + str + "=" + jsonElement, (Throwable) null, (Map) null, 12, (Object) null);
    }

    public final void onExtraCallback(@NotNull final JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonObject, "");
        if (IAuthTabCallback) {
            jsonObject.size();
            int i3 = asBinder + 39;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        clearTid.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.core.tuba.TubaVarsV1OriginManager$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 55;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                ALCAntiSpoofingFaceQuality.onWarmupCompleted(jsonObject);
                int i8 = IAuthTabCallback + 77;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    private static final void IAuthTabCallback(JsonObject jsonObject) {
        int i = 2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = onExtraCallbackWithResult;
        Object obj = null;
        if (textRoundCornerProgressBarSavedState1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textRoundCornerProgressBarSavedState1 = null;
        }
        Collection collectionOnWarmupCompleted = textRoundCornerProgressBarSavedState1.onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            int i2 = asBinder + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                jsonObject.keySet().contains((String) it.next());
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (!jsonObject.keySet().contains((String) next)) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            int i3 = asBinder + 41;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!(!(entry.getValue() instanceof JsonNull))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = onExtraCallbackWithResult;
        if (textRoundCornerProgressBarSavedState12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textRoundCornerProgressBarSavedState12 = null;
        }
        drawBackgroundProgress.IAuthTabCallback(textRoundCornerProgressBarSavedState12, CollectionsKt.plus(CollectionsKt.toList(linkedHashMap.keySet()), arrayList), false, 2, null);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : jsonObject.entrySet()) {
            if (entry2.getValue() instanceof JsonPrimitive) {
                int i5 = asBinder + 105;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    throw null;
                }
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                int i6 = onNavigationEvent + 97;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState13 = onExtraCallbackWithResult;
        if (textRoundCornerProgressBarSavedState13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textRoundCornerProgressBarSavedState13 = null;
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            int i8 = asBinder + 17;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                Map.Entry entry3 = (Map.Entry) it2.next();
                arrayList2.add(getWrite.IAuthTabCallback(entry3.getKey(), initRenderFinish.onNavigationEvent((JsonElement) entry3.getValue()).onWarmupCompleted()));
                obj.hashCode();
                throw null;
            }
            Map.Entry entry4 = (Map.Entry) it2.next();
            arrayList2.add(getWrite.IAuthTabCallback(entry4.getKey(), initRenderFinish.onNavigationEvent((JsonElement) entry4.getValue()).onWarmupCompleted()));
        }
        drawBackgroundProgress.onNavigationEvent(textRoundCornerProgressBarSavedState13, arrayList2, false, 2, null);
    }

    public final void onExtraCallbackWithResult(@NotNull final JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonObject, "");
        if (IAuthTabCallback) {
            jsonObject.size();
        }
        clearTid.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.core.tuba.TubaVarsV1OriginManager$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 25;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    ALCAntiSpoofingFaceQuality.onNavigationEvent(jsonObject);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                ALCAntiSpoofingFaceQuality.onNavigationEvent(jsonObject);
                int i5 = IAuthTabCallback + 95;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 84 / 0;
                }
            }
        });
        int i3 = onNavigationEvent + 45;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            jsonObject.entrySet().iterator();
            throw null;
        }
        for (Map.Entry entry : jsonObject.entrySet()) {
            int i3 = asBinder + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (IAuthTabCallback) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Objects.toString(key);
                Objects.toString(value);
            }
            onExtraCallback.onNavigationEvent((String) entry.getKey(), (JsonElement) entry.getValue());
            int i5 = asBinder + 47;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final JsonElement IAuthTabCallback(String str) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (JsonElement) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, 1854786862, -1854786861, iOnExtraCallback3, new Object[]{this, str}, iOnExtraCallback);
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, -1562967437, 1562967437, iOnExtraCallback3, new Object[]{this, context, textRoundCornerProgressBarSavedState1}, iOnExtraCallback);
    }
}
