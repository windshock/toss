package o;

import com.tmoney.LiveCheckConstants;
import im.toss.core.tuba.Node;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setSDKInstallCallBack {
    private static final boolean IAuthTabCallback = false;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[extractEmotion.values().length];
            try {
                iArr[extractEmotion.IS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[extractEmotion.IS_NOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[extractEmotion.IS_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[extractEmotion.IS_NOT_SET.ordinal()] = 4;
                int i = IAuthTabCallback + 77;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[extractEmotion.IS_GREATER_THAN.ordinal()] = 5;
                int i4 = IAuthTabCallback + 5;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[extractEmotion.IS_LOWER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[extractEmotion.IS_AT_LEAST.ordinal()] = 7;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[extractEmotion.IS_AT_MOST.ordinal()] = 8;
                int i7 = IAuthTabCallback + 9;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 4;
                } else {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[extractEmotion.CONTAINS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[extractEmotion.NOT_CONTAINS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[extractEmotion.IS_IN_LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[extractEmotion.IS_NOT_IN_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[extractFaceLandmark.values().length];
            try {
                iArr2[extractFaceLandmark.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[extractFaceLandmark.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[extractFaceLandmark.COMPARISON.ordinal()] = 3;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    public static final /* synthetic */ boolean onExtraCallback(Node node, downloadZip downloadzip) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(node, downloadzip);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = onNavigationEvent + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return zOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int onExtraCallback(@Nullable Object obj, @Nullable Object obj2) {
        String string;
        int i = 2 % 2;
        String str = "";
        if (obj != null) {
            int i2 = onExtraCallback + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            string = obj.toString();
            if (string == null) {
                string = "";
            }
        }
        if (obj2 != null) {
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            String string2 = obj2.toString();
            if (string2 != null) {
                str = string2;
            }
        }
        try {
            return new BigDecimal(string).compareTo(new BigDecimal(str));
        } catch (NumberFormatException unused) {
            return string.compareTo(str);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean onWarmupCompleted(Node node, downloadZip downloadzip) throws NoWhenBranchMatchedException {
        boolean z;
        String strOnWarmupCompleted;
        String string;
        JsonArray jsonArray;
        int i = 2 % 2;
        boolean z2 = IAuthTabCallback;
        if (z2) {
            Objects.toString(node);
            Objects.toString(downloadzip);
        }
        extractFaceLandmark extractfacelandmarkAsInterface = node.asInterface();
        int i2 = extractfacelandmarkAsInterface == null ? -1 : IAuthTabCallback.onWarmupCompleted[extractfacelandmarkAsInterface.ordinal()];
        if (i2 != -1) {
            if (i2 != 1) {
                int i3 = onExtraCallback + 113;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                if (i2 == 2) {
                    return onWarmupCompleted(node.onNavigationEvent().get(0), downloadzip) || onWarmupCompleted(node.onNavigationEvent().get(1), downloadzip);
                }
                int i6 = i4 + 89;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0 ? i2 != 3 : i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj = downloadzip.onNavigationEvent().get(node.asBinder());
                extractEmotion extractemotionIAuthTabCallbackDefault = node.IAuthTabCallbackDefault();
                switch (extractemotionIAuthTabCallbackDefault != null ? IAuthTabCallback.onExtraCallbackWithResult[extractemotionIAuthTabCallbackDefault.ordinal()] : -1) {
                    case 1:
                        JsonElement jsonElementIAuthTabCallbackStub = node.IAuthTabCallbackStub();
                        z = onExtraCallback(obj, jsonElementIAuthTabCallbackStub != null ? onWarmupCompleted(jsonElementIAuthTabCallbackStub) : null) == 0;
                        if (z2) {
                            extractEmotion extractemotionIAuthTabCallbackDefault2 = node.IAuthTabCallbackDefault();
                            JsonElement jsonElementIAuthTabCallbackStub2 = node.IAuthTabCallbackStub();
                            Objects.toString(extractemotionIAuthTabCallbackDefault2);
                            Objects.toString(obj);
                            Objects.toString(jsonElementIAuthTabCallbackStub2);
                        }
                        return z;
                    case 2:
                        JsonElement jsonElementIAuthTabCallbackStub3 = node.IAuthTabCallbackStub();
                        z = onExtraCallback(obj, jsonElementIAuthTabCallbackStub3 != null ? onWarmupCompleted(jsonElementIAuthTabCallbackStub3) : null) != 0;
                        if (z2) {
                            extractEmotion extractemotionIAuthTabCallbackDefault3 = node.IAuthTabCallbackDefault();
                            JsonElement jsonElementIAuthTabCallbackStub4 = node.IAuthTabCallbackStub();
                            Objects.toString(extractemotionIAuthTabCallbackDefault3);
                            Objects.toString(obj);
                            Objects.toString(jsonElementIAuthTabCallbackStub4);
                        }
                        return z;
                    case 3:
                        return obj != null;
                    case 4:
                        return obj == null;
                    case 5:
                        JsonElement jsonElementIAuthTabCallbackStub5 = node.IAuthTabCallbackStub();
                        z = onExtraCallback(obj, jsonElementIAuthTabCallbackStub5 != null ? onWarmupCompleted(jsonElementIAuthTabCallbackStub5) : null) > 0;
                        if (z2) {
                            extractEmotion extractemotionIAuthTabCallbackDefault4 = node.IAuthTabCallbackDefault();
                            JsonElement jsonElementIAuthTabCallbackStub6 = node.IAuthTabCallbackStub();
                            Objects.toString(extractemotionIAuthTabCallbackDefault4);
                            Objects.toString(obj);
                            Objects.toString(jsonElementIAuthTabCallbackStub6);
                        }
                        return z;
                    case 6:
                        JsonElement jsonElementIAuthTabCallbackStub7 = node.IAuthTabCallbackStub();
                        z = onExtraCallback(obj, jsonElementIAuthTabCallbackStub7 != null ? onWarmupCompleted(jsonElementIAuthTabCallbackStub7) : null) < 0;
                        if (z2) {
                            extractEmotion extractemotionIAuthTabCallbackDefault5 = node.IAuthTabCallbackDefault();
                            JsonElement jsonElementIAuthTabCallbackStub8 = node.IAuthTabCallbackStub();
                            Objects.toString(extractemotionIAuthTabCallbackDefault5);
                            Objects.toString(obj);
                            Objects.toString(jsonElementIAuthTabCallbackStub8);
                        }
                        return z;
                    case 7:
                        JsonElement jsonElementIAuthTabCallbackStub9 = node.IAuthTabCallbackStub();
                        z = onExtraCallback(obj, jsonElementIAuthTabCallbackStub9 != null ? onWarmupCompleted(jsonElementIAuthTabCallbackStub9) : null) >= 0;
                        if (z2) {
                            extractEmotion extractemotionIAuthTabCallbackDefault6 = node.IAuthTabCallbackDefault();
                            JsonElement jsonElementIAuthTabCallbackStub10 = node.IAuthTabCallbackStub();
                            Objects.toString(extractemotionIAuthTabCallbackDefault6);
                            Objects.toString(obj);
                            Objects.toString(jsonElementIAuthTabCallbackStub10);
                        }
                        return z;
                    case 8:
                        JsonElement jsonElementIAuthTabCallbackStub11 = node.IAuthTabCallbackStub();
                        if (jsonElementIAuthTabCallbackStub11 != null) {
                            int i7 = onNavigationEvent + 75;
                            onExtraCallback = i7 % 128;
                            int i8 = i7 % 2;
                            strOnWarmupCompleted = onWarmupCompleted(jsonElementIAuthTabCallbackStub11);
                        }
                        z = onExtraCallback(obj, strOnWarmupCompleted) <= 0;
                        if (z2) {
                            extractEmotion extractemotionIAuthTabCallbackDefault7 = node.IAuthTabCallbackDefault();
                            JsonElement jsonElementIAuthTabCallbackStub12 = node.IAuthTabCallbackStub();
                            Objects.toString(extractemotionIAuthTabCallbackDefault7);
                            Objects.toString(obj);
                            Objects.toString(jsonElementIAuthTabCallbackStub12);
                        }
                        return z;
                    case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                        JsonElement jsonElementIAuthTabCallbackStub13 = node.IAuthTabCallbackStub();
                        if (jsonElementIAuthTabCallbackStub13 != null && (strOnWarmupCompleted = onWarmupCompleted(jsonElementIAuthTabCallbackStub13)) != null && obj != null) {
                            int i9 = onNavigationEvent + 91;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                obj.toString();
                                throw null;
                            }
                            String string2 = obj.toString();
                            if (string2 != null) {
                                boolean zContains$default = StringsKt.contains$default(string2, strOnWarmupCompleted, false, 2, (Object) null);
                                if (z2) {
                                    extractEmotion extractemotionIAuthTabCallbackDefault8 = node.IAuthTabCallbackDefault();
                                    JsonElement jsonElementIAuthTabCallbackStub14 = node.IAuthTabCallbackStub();
                                    Objects.toString(extractemotionIAuthTabCallbackDefault8);
                                    Objects.toString(obj);
                                    Objects.toString(jsonElementIAuthTabCallbackStub14);
                                }
                                return zContains$default;
                            }
                        }
                        return false;
                    case 10:
                        JsonElement jsonElementIAuthTabCallbackStub15 = node.IAuthTabCallbackStub();
                        if (jsonElementIAuthTabCallbackStub15 != null) {
                            int i10 = onNavigationEvent + 119;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            String strOnWarmupCompleted2 = onWarmupCompleted(jsonElementIAuthTabCallbackStub15);
                            if (strOnWarmupCompleted2 != null && obj != null && (string = obj.toString()) != null) {
                                boolean zContains$default2 = StringsKt.contains$default(string, strOnWarmupCompleted2, false, 2, (Object) null);
                                if (z2) {
                                    extractEmotion extractemotionIAuthTabCallbackDefault9 = node.IAuthTabCallbackDefault();
                                    JsonElement jsonElementIAuthTabCallbackStub16 = node.IAuthTabCallbackStub();
                                    Objects.toString(extractemotionIAuthTabCallbackDefault9);
                                    Objects.toString(obj);
                                    Objects.toString(jsonElementIAuthTabCallbackStub16);
                                }
                                if (!zContains$default2) {
                                    int i12 = onExtraCallback + 113;
                                    onNavigationEvent = i12 % 128;
                                    int i13 = i12 % 2;
                                    return true;
                                }
                            }
                        }
                        return false;
                    case 11:
                        JsonArray jsonArrayIAuthTabCallbackStub = node.IAuthTabCallbackStub();
                        JsonArray jsonArray2 = jsonArrayIAuthTabCallbackStub instanceof JsonArray ? jsonArrayIAuthTabCallbackStub : null;
                        if (jsonArray2 == null) {
                            return false;
                        }
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray2, 10));
                        Iterator it = jsonArray2.iterator();
                        while (it.hasNext()) {
                            int i14 = onNavigationEvent + 55;
                            onExtraCallback = i14 % 128;
                            if (i14 % 2 != 0) {
                                arrayList.add(onWarmupCompleted((JsonElement) it.next()));
                                strOnWarmupCompleted.hashCode();
                                throw null;
                            }
                            arrayList.add(onWarmupCompleted((JsonElement) it.next()));
                        }
                        if (obj != null) {
                            int i15 = onExtraCallback + 23;
                            onNavigationEvent = i15 % 128;
                            if (i15 % 2 == 0) {
                                strOnWarmupCompleted = obj.toString();
                                int i16 = 78 / 0;
                            } else {
                                strOnWarmupCompleted = obj.toString();
                            }
                        }
                        boolean zContains = arrayList.contains(strOnWarmupCompleted);
                        if (IAuthTabCallback) {
                            extractEmotion extractemotionIAuthTabCallbackDefault10 = node.IAuthTabCallbackDefault();
                            JsonElement jsonElementIAuthTabCallbackStub17 = node.IAuthTabCallbackStub();
                            Objects.toString(extractemotionIAuthTabCallbackDefault10);
                            Objects.toString(obj);
                            Objects.toString(jsonElementIAuthTabCallbackStub17);
                        }
                        return zContains;
                    case LiveCheckConstants.SVC_U1 /* 12 */:
                        JsonArray jsonArrayIAuthTabCallbackStub2 = node.IAuthTabCallbackStub();
                        if (jsonArrayIAuthTabCallbackStub2 instanceof JsonArray) {
                            jsonArray = jsonArrayIAuthTabCallbackStub2;
                            int i17 = onExtraCallback + 31;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            jsonArray = null;
                        }
                        if (jsonArray != null) {
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray, 10));
                            Iterator it2 = jsonArray.iterator();
                            while (it2.hasNext()) {
                                int i19 = onExtraCallback + 99;
                                onNavigationEvent = i19 % 128;
                                int i20 = i19 % 2;
                                arrayList2.add(onWarmupCompleted((JsonElement) it2.next()));
                            }
                            boolean zContains2 = arrayList2.contains(obj != null ? obj.toString() : null);
                            if (IAuthTabCallback) {
                                extractEmotion extractemotionIAuthTabCallbackDefault11 = node.IAuthTabCallbackDefault();
                                JsonElement jsonElementIAuthTabCallbackStub18 = node.IAuthTabCallbackStub();
                                Objects.toString(extractemotionIAuthTabCallbackDefault11);
                                Objects.toString(obj);
                                Objects.toString(jsonElementIAuthTabCallbackStub18);
                            }
                            if (!zContains2) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            }
            if (onWarmupCompleted(node.onNavigationEvent().get(0), downloadzip) && onWarmupCompleted(node.onNavigationEvent().get(1), downloadzip)) {
                return true;
            }
        }
        return false;
    }

    private static final String onWarmupCompleted(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (!(jsonElement instanceof JsonPrimitive)) {
            int i5 = i3 + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            jsonPrimitive = null;
        } else {
            jsonPrimitive = (JsonPrimitive) jsonElement;
        }
        if (jsonPrimitive == null) {
            return null;
        }
        int i7 = i3 + 29;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return initRenderFinish.onNavigationEvent(jsonPrimitive);
        }
        initRenderFinish.onNavigationEvent(jsonPrimitive);
        obj.hashCode();
        throw null;
    }
}
