package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.DetectFaceInSingleImage;
import o.dequeueAd;
import o.loadNextAdForAdToken;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class dequeueAd implements DetectFaceInSingleImage {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private String onExtraCallbackWithResult;
    private final getBidToken onWarmupCompleted;

    public static /* synthetic */ CharSequence IAuthTabCallback(loadNextAdForAdToken loadnextadforadtoken) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(loadnextadforadtoken);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(loadnextadforadtoken);
        int i3 = IAuthTabCallback + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return charSequenceOnWarmupCompleted;
    }

    public static /* synthetic */ CharSequence onExtraCallback(Map.Entry entry) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(entry);
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(dequeueAd dequeuead, DetectFaceInSingleImage.onNavigationEvent onnavigationevent, Map map, Map map2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(dequeuead, onnavigationevent, map, map2);
        int i4 = IAuthTabCallback + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Map map) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(new Object[]{map}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1235398007, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, -1235398006);
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~i5) | i8;
        int i10 = ~(i5 | i8);
        int i11 = i3 + i6 + i4 + ((-714989572) * i) + (1142003473 * i2);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i3) - 1983905792) + (1136689320 * i6) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i4) + ((-1891631104) * i) + ((-1355808768) * i2) + ((-1882259456) * i12);
        int i14 = (i3 * (-1158907614)) + 1427560840 + (i6 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i4 * (-1158906635)) + (i * 1387703340) + (i2 * 1202573125) + (i12 * (-451215360));
        if (i13 + (i14 * i14 * (-310837248)) != 1) {
            return IAuthTabCallback(objArr);
        }
        Map map = (Map) objArr[0];
        int i15 = 2 % 2;
        int i16 = onExtraCallback + 33;
        IAuthTabCallback = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Unit unit = Unit.INSTANCE;
        int i18 = IAuthTabCallback + 23;
        onExtraCallback = i18 % 128;
        int i19 = i18 % 2;
        return unit;
    }

    @Inject
    public dequeueAd(@NotNull getBidToken getbidtoken) {
        Intrinsics.checkNotNullParameter(getbidtoken, "");
        this.onWarmupCompleted = getbidtoken;
        this.onExtraCallbackWithResult = "";
    }

    private final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnPostMessage = this.onExtraCallbackWithResult;
        if (StringsKt.isBlank(strOnPostMessage)) {
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                strOnPostMessage = PlayerErrorCode.onPostMessage();
                this.onExtraCallbackWithResult = strOnPostMessage;
                int i5 = 50 / 0;
            } else {
                strOnPostMessage = PlayerErrorCode.onPostMessage();
                this.onExtraCallbackWithResult = strOnPostMessage;
            }
        }
        int i6 = onExtraCallback + 35;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return strOnPostMessage;
    }

    public Object onExtraCallbackWithResult(@NotNull final Map<String, ? extends Object> map, @NotNull final DetectFaceInSingleImage.onNavigationEvent onnavigationevent, @NotNull access13800<? super Map<String, ? extends Object>> access13800Var) {
        int i = 2 % 2;
        Map<String, Object> mapOnExtraCallbackWithResult = onExtraCallbackWithResult(map, DERSet.onExtraCallback._init_lambda3(), onExtraCallback(), new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.ParamMapBuilderImpl$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    dequeueAd.onExtraCallback(this.f$0, onnavigationevent, map, (Map) obj);
                    throw null;
                }
                Unit unitOnExtraCallback = dequeueAd.onExtraCallback(this.f$0, onnavigationevent, map, (Map) obj);
                int i4 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 24 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return mapOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(dequeueAd dequeuead, DetectFaceInSingleImage.onNavigationEvent onnavigationevent, Map map, Map map2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map2, "");
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(new Object[]{dequeuead, map2, onnavigationevent}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -404593231, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 404593231);
        r8lambdasB_LrbIgfHXljyqs4eATzyvOzGA.onWarmupCompleted.onExtraCallbackWithResult(map, map2, onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final Map<String, Object> onExtraCallbackWithResult(@NotNull Map<String, ? extends Object> map, boolean z, @NotNull String str, @NotNull Function1<? super Map<String, ? extends Set<? extends loadNextAdForAdToken>>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap2.put(entry.getKey(), onNavigationEvent(entry.getValue(), (String) entry.getKey(), linkedHashMap, z, str));
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!linkedHashMap.isEmpty()) {
            int i6 = onExtraCallback + 61;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            function1.invoke(linkedHashMap);
        }
        return linkedHashMap2;
    }

    private final String onWarmupCompleted(String str, String str2, Map<String, Set<loadNextAdForAdToken>> map, boolean z, String str3) {
        int i = 2 % 2;
        loadNextAdForZoneId loadnextadforzoneidOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(str, str3, z);
        if (!loadnextadforzoneidOnWarmupCompleted.onExtraCallback().isEmpty()) {
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Set<loadNextAdForAdToken> linkedHashSet = map.get(str2);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(str2, linkedHashSet);
            }
            linkedHashSet.addAll(loadnextadforzoneidOnWarmupCompleted.onExtraCallback());
        }
        String strOnExtraCallbackWithResult = loadnextadforzoneidOnWarmupCompleted.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Map map = (Map) objArr[1];
        DetectFaceInSingleImage.onNavigationEvent onnavigationevent = (DetectFaceInSingleImage.onNavigationEvent) objArr[2];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        mapOnExtraCallback.put("detected_params", CollectionsKt.joinToString$default(map.entrySet(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.ParamMapBuilderImpl$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CharSequence charSequenceOnExtraCallback = dequeueAd.onExtraCallback((Map.Entry) obj);
                int i5 = IAuthTabCallback + 5;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return charSequenceOnExtraCallback;
            }
        }, 30, (Object) null));
        Long lOnExtraCallback = onnavigationevent.onExtraCallback();
        if (lOnExtraCallback != null) {
            mapOnExtraCallback.put("detected_schema_id", Long.valueOf(lOnExtraCallback.longValue()));
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        String strOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
        Object obj = null;
        if (strOnWarmupCompleted != null) {
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                mapOnExtraCallback.put("detected_log_name", strOnWarmupCompleted);
                obj.hashCode();
                throw null;
            }
            mapOnExtraCallback.put("detected_log_name", strOnWarmupCompleted);
        }
        String strOnNavigationEvent = onnavigationevent.onNavigationEvent();
        if (strOnNavigationEvent != null) {
            int i5 = onExtraCallback + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            mapOnExtraCallback.put("detected_log_type", strOnNavigationEvent);
            int i7 = IAuthTabCallback + 9;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        Unit unit = Unit.INSTANCE;
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "log_masking", "PII detected in log parameter", access8100.onExtraCallbackWithResult(mapOnExtraCallback), (String) null, false, (String) null, 56, (Object) null);
        return null;
    }

    private static final CharSequence onExtraCallbackWithResult(Map.Entry entry) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        String str = ((String) entry.getKey()) + ":" + CollectionsKt.joinToString$default((Set) entry.getValue(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.splittarget.impl.analytics.toss.ParamMapBuilderImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                CharSequence charSequenceIAuthTabCallback = dequeueAd.IAuthTabCallback((loadNextAdForAdToken) obj);
                int i5 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return charSequenceIAuthTabCallback;
                }
                throw null;
            }
        }, 30, (Object) null);
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    private static final CharSequence onWarmupCompleted(loadNextAdForAdToken loadnextadforadtoken) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(loadnextadforadtoken, "");
            loadnextadforadtoken.getLabel();
            throw null;
        }
        Intrinsics.checkNotNullParameter(loadnextadforadtoken, "");
        String label = loadnextadforadtoken.getLabel();
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return label;
        }
        throw null;
    }

    private final Object onNavigationEvent(Object obj, String str, Map<String, Set<loadNextAdForAdToken>> map, boolean z, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (obj instanceof sendBroadcastWithAdObject) {
            return ((sendBroadcastWithAdObject) obj).getValue();
        }
        Object obj2 = null;
        if (obj instanceof String) {
            int i6 = i2 + 111;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return onWarmupCompleted((String) obj, str, map, z, str2);
            }
            onWarmupCompleted((String) obj, str, map, z, str2);
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(key, onNavigationEvent(entry.getValue(), str + "." + (key == null ? "(unknown)" : key), map, z, str2));
                linkedHashMap.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
            }
            return linkedHashMap;
        }
        if (!(obj instanceof List)) {
            int i7 = i4 + 113;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return obj;
            }
            obj2.hashCode();
            throw null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            int i8 = IAuthTabCallback + 71;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                arrayList.add(onNavigationEvent(it.next(), str, map, z, str2));
                obj2.hashCode();
                throw null;
            }
            arrayList.add(onNavigationEvent(it.next(), str, map, z, str2));
        }
        return arrayList;
    }

    private final void onNavigationEvent(Map<String, ? extends Set<? extends loadNextAdForAdToken>> map, DetectFaceInSingleImage.onNavigationEvent onnavigationevent) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onWarmupCompleted(new Object[]{this, map, onnavigationevent}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -404593231, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, 404593231);
    }

    private static final Unit IAuthTabCallback(Map map) {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Unit) onWarmupCompleted(new Object[]{map}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1235398007, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, -1235398006);
    }
}
