package o;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaKQljdHbnTh3WKvdWuw6pSds3WQ {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final WritableNativeMap onWarmupCompleted(@NotNull Map<?, ?> map) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(String.valueOf(entry.getKey()), entry.getValue());
            String str = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
            Object objIAuthTabCallback = pairIAuthTabCallback.IAuthTabCallback();
            if (objIAuthTabCallback instanceof Boolean) {
                writableNativeMap.putBoolean(str, ((Boolean) objIAuthTabCallback).booleanValue());
            } else {
                if (objIAuthTabCallback instanceof Integer) {
                    writableNativeMap.putInt(str, ((Number) objIAuthTabCallback).intValue());
                    i = onExtraCallback + 31;
                    onNavigationEvent = i % 128;
                } else if (objIAuthTabCallback instanceof Float) {
                    writableNativeMap.putDouble(str, ((Number) objIAuthTabCallback).floatValue());
                    int i3 = onNavigationEvent + 93;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                } else if (!(!(objIAuthTabCallback instanceof Double))) {
                    writableNativeMap.putDouble(str, ((Number) objIAuthTabCallback).doubleValue());
                } else if (objIAuthTabCallback instanceof String) {
                    writableNativeMap.putString(str, (String) objIAuthTabCallback);
                } else if (objIAuthTabCallback instanceof JsonArray) {
                    int i5 = onExtraCallback + 87;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    writableNativeMap.putArray(str, IAuthTabCallback((List<?>) CollectionsKt.toList((Iterable) objIAuthTabCallback)));
                } else if (objIAuthTabCallback instanceof JsonObject) {
                    int i7 = onExtraCallback + 49;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        writableNativeMap.putMap(str, onWarmupCompleted(IAuthTabCallback(objIAuthTabCallback)));
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    writableNativeMap.putMap(str, onWarmupCompleted(IAuthTabCallback(objIAuthTabCallback)));
                } else if (objIAuthTabCallback instanceof List) {
                    int i8 = onExtraCallback + 13;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    writableNativeMap.putArray(str, IAuthTabCallback((List<?>) objIAuthTabCallback));
                } else if (objIAuthTabCallback instanceof Map) {
                    int i10 = onNavigationEvent + 5;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    writableNativeMap.putMap(str, onWarmupCompleted((Map<?, ?>) objIAuthTabCallback));
                } else if (objIAuthTabCallback instanceof ReadableArray) {
                    writableNativeMap.putArray(str, (ReadableArray) objIAuthTabCallback);
                } else if (objIAuthTabCallback instanceof ReadableMap) {
                    writableNativeMap.putMap(str, (ReadableMap) objIAuthTabCallback);
                } else if (objIAuthTabCallback == null) {
                    writableNativeMap.putNull(str);
                } else {
                    writableNativeMap.putString(str, objIAuthTabCallback.toString());
                    i = onNavigationEvent + 99;
                    onExtraCallback = i % 128;
                }
                int i12 = i % 2;
            }
        }
        return writableNativeMap;
    }

    public static final WritableArray IAuthTabCallback(@NotNull List<?> list) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : list) {
            if (obj instanceof Boolean) {
                int i3 = onExtraCallback + 49;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Float) {
                writableNativeArray.pushDouble(((Number) obj).floatValue());
                int i5 = onExtraCallback + 23;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 2;
                }
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else if (obj instanceof JsonArray) {
                int i7 = onNavigationEvent + 97;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    writableNativeArray.pushArray(IAuthTabCallback((List<?>) CollectionsKt.toList((Iterable) obj)));
                    i = 62;
                    int i8 = i / 0;
                } else {
                    writableNativeArray.pushArray(IAuthTabCallback((List<?>) CollectionsKt.toList((Iterable) obj)));
                }
            } else if (obj instanceof JsonObject) {
                writableNativeArray.pushMap(onWarmupCompleted(IAuthTabCallback(obj)));
            } else if (obj instanceof List) {
                int i9 = onExtraCallback + 45;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    writableNativeArray.pushArray(IAuthTabCallback((List<?>) obj));
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                writableNativeArray.pushArray(IAuthTabCallback((List<?>) obj));
            } else if (obj instanceof Map) {
                writableNativeArray.pushMap(onWarmupCompleted((Map<?, ?>) obj));
            } else if (obj instanceof ReadableArray) {
                int i10 = onExtraCallback + 57;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    writableNativeArray.pushArray((ReadableArray) obj);
                    i = 88;
                    int i82 = i / 0;
                } else {
                    writableNativeArray.pushArray((ReadableArray) obj);
                }
            } else if (obj instanceof ReadableMap) {
                writableNativeArray.pushMap((ReadableMap) obj);
            } else if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                writableNativeArray.pushString(obj.toString());
            }
        }
        return writableNativeArray;
    }

    private static final Map<String, Object> IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        Object objFromJson = ALCEyeBlink.onExtraCallback().fromJson(ALCEyeBlink.onExtraCallback().toJson(obj), new TypeToken<Map<String, ? extends Object>>() { // from class: im.toss.rn.toss.core.common.util.TossReactCollectionExtKt$toMap$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        Map<String, Object> map = (Map) objFromJson;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final HashMap<String, Object> onExtraCallbackWithResult(@NotNull ReadableMap readableMap) throws NoWhenBranchMatchedException {
        ArrayList<Object> arrayListOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(readableMap, "");
        HashMap<String, Object> map = new HashMap<>();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Object objValueOf = null;
            switch (onWarmupCompleted.onExtraCallbackWithResult[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    break;
                case 2:
                    objValueOf = Boolean.valueOf(readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    objValueOf = onExtraCallbackWithResult(readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    objValueOf = readableMap.getString(strNextKey);
                    break;
                case 5:
                    ReadableMap map2 = readableMap.getMap(strNextKey);
                    if (map2 != null) {
                        int i2 = onExtraCallback + 91;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 != 0) {
                            onExtraCallbackWithResult(map2);
                            objValueOf.hashCode();
                            throw null;
                        }
                        objValueOf = onExtraCallbackWithResult(map2);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    ReadableArray array = readableMap.getArray(strNextKey);
                    if (array == null) {
                        break;
                    } else {
                        int i3 = onNavigationEvent + 11;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 == 0) {
                            arrayListOnWarmupCompleted = onWarmupCompleted(array);
                            int i4 = 34 / 0;
                        } else {
                            arrayListOnWarmupCompleted = onWarmupCompleted(array);
                        }
                        objValueOf = arrayListOnWarmupCompleted;
                        int i5 = onNavigationEvent + 87;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            map.put(strNextKey, objValueOf);
        }
        return map;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final ArrayList<Object> onWarmupCompleted(@NotNull ReadableArray readableArray) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(readableArray, "");
        ArrayList<Object> arrayList = new ArrayList<>(readableArray.size());
        int size = readableArray.size();
        int i2 = 0;
        while (true) {
            Object objValueOf = null;
            if (i2 >= size) {
                int i3 = onExtraCallback + 77;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return arrayList;
                }
                objValueOf.hashCode();
                throw null;
            }
            switch (onWarmupCompleted.onExtraCallbackWithResult[readableArray.getType(i2).ordinal()]) {
                case 1:
                    break;
                case 2:
                    objValueOf = Boolean.valueOf(readableArray.getBoolean(i2));
                    break;
                case 3:
                    objValueOf = onExtraCallbackWithResult(readableArray.getDouble(i2));
                    break;
                case 4:
                    objValueOf = readableArray.getString(i2);
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i2);
                    if (map != null) {
                        int i4 = onExtraCallback + 115;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 != 0) {
                            onExtraCallbackWithResult(map);
                            throw null;
                        }
                        objValueOf = onExtraCallbackWithResult(map);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    ReadableArray array = readableArray.getArray(i2);
                    if (array == null) {
                        break;
                    } else {
                        objValueOf = onWarmupCompleted(array);
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(objValueOf);
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if ((!r4) != true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r4 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r7 = java.lang.Long.valueOf((long) r7);
        r8 = o.r8lambdaKQljdHbnTh3WKvdWuw6pSds3WQ.onNavigationEvent + 67;
        o.r8lambdaKQljdHbnTh3WKvdWuw6pSds3WQ.onExtraCallback = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if ((r8 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Object onExtraCallbackWithResult(double d) {
        int i = 2 % 2;
        boolean z = d % 1.0d == 0.0d;
        if (-9.223372036854776E18d <= d) {
            int i2 = onNavigationEvent + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 47 / 0;
                boolean z2 = d <= 9.223372036854776E18d;
            } else if (d > 9.223372036854776E18d) {
            }
        }
        if (z) {
            int i4 = onNavigationEvent + 115;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
        }
        Double dValueOf = Double.valueOf(d);
        int i6 = onNavigationEvent + 93;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return dValueOf;
    }
}
