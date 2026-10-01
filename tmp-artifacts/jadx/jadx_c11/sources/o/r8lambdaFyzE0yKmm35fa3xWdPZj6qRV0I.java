package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.common.JavascriptException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 24245;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 6833;
    private static char onExtraCallbackWithResult = 21042;
    private static char onNavigationEvent = 32401;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[Catch: all -> 0x01c9, PHI: r11
      0x00f8: PHI (r11v6 kotlinx.serialization.json.JsonPrimitive) = (r11v5 kotlinx.serialization.json.JsonPrimitive), (r11v8 kotlinx.serialization.json.JsonPrimitive) binds: [B:46:0x00f6, B:43:0x00ef] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01c9, blocks: (B:3:0x0013, B:10:0x0029, B:12:0x005b, B:15:0x006a, B:18:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x009b, B:26:0x00a1, B:30:0x00c0, B:32:0x00c6, B:37:0x00d3, B:41:0x00e8, B:47:0x00f8, B:49:0x00fe, B:53:0x0111, B:59:0x0121, B:61:0x0127, B:65:0x013a, B:71:0x014a, B:73:0x0150, B:69:0x0144, B:57:0x011b, B:45:0x00f2, B:33:0x00cb, B:76:0x017a, B:77:0x0187, B:79:0x018d, B:80:0x01a6), top: B:89:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121 A[Catch: all -> 0x01c9, PHI: r12
      0x0121: PHI (r12v5 kotlinx.serialization.json.JsonPrimitive) = (r12v4 kotlinx.serialization.json.JsonPrimitive), (r12v7 kotlinx.serialization.json.JsonPrimitive) binds: [B:58:0x011f, B:55:0x0118] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01c9, blocks: (B:3:0x0013, B:10:0x0029, B:12:0x005b, B:15:0x006a, B:18:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x009b, B:26:0x00a1, B:30:0x00c0, B:32:0x00c6, B:37:0x00d3, B:41:0x00e8, B:47:0x00f8, B:49:0x00fe, B:53:0x0111, B:59:0x0121, B:61:0x0127, B:65:0x013a, B:71:0x014a, B:73:0x0150, B:69:0x0144, B:57:0x011b, B:45:0x00f2, B:33:0x00cb, B:76:0x017a, B:77:0x0187, B:79:0x018d, B:80:0x01a6), top: B:89:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a A[Catch: all -> 0x01c9, PHI: r9
      0x014a: PHI (r9v11 kotlinx.serialization.json.JsonPrimitive) = (r9v10 kotlinx.serialization.json.JsonPrimitive), (r9v13 kotlinx.serialization.json.JsonPrimitive) binds: [B:70:0x0148, B:67:0x0141] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01c9, blocks: (B:3:0x0013, B:10:0x0029, B:12:0x005b, B:15:0x006a, B:18:0x007a, B:21:0x0088, B:23:0x008e, B:24:0x009b, B:26:0x00a1, B:30:0x00c0, B:32:0x00c6, B:37:0x00d3, B:41:0x00e8, B:47:0x00f8, B:49:0x00fe, B:53:0x0111, B:59:0x0121, B:61:0x0127, B:65:0x013a, B:71:0x014a, B:73:0x0150, B:69:0x0144, B:57:0x011b, B:45:0x00f2, B:33:0x00cb, B:76:0x017a, B:77:0x0187, B:79:0x018d, B:80:0x01a6), top: B:89:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String IAuthTabCallback(@NotNull JavascriptException javascriptException) {
        String strOnWarmupCompleted;
        ArrayList arrayList;
        JsonArray jsonArrayOnWarmupCompleted;
        String strOnWarmupCompleted2;
        String strOnWarmupCompleted3;
        String strOnWarmupCompleted4;
        String strOnWarmupCompleted5;
        JsonPrimitive jsonPrimitiveOnNavigationEvent;
        JsonPrimitive jsonPrimitiveOnNavigationEvent2;
        JsonPrimitive jsonPrimitiveOnNavigationEvent3;
        JsonPrimitive jsonPrimitiveOnNavigationEvent4;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(javascriptException, "");
        try {
            Result.Companion companion = Result.Companion;
            String strIAuthTabCallback = javascriptException.IAuthTabCallback();
            ArrayList arrayList2 = null;
            if (strIAuthTabCallback == null) {
                int i4 = IAuthTabCallbackDefault + 21;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return "";
                }
                throw null;
            }
            JsonObject jsonObjectOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(wie2.Default.onExtraCallback(strIAuthTabCallback));
            Object[] objArr = new Object[1];
            a(new char[]{6145, 36905, 22356, 23447, 59772, 49767, 47870, 53038}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, objArr);
            JsonElement jsonElement = (JsonElement) jsonObjectOnExtraCallbackWithResult.get(((String) objArr[0]).intern());
            if (jsonElement == null || (jsonPrimitiveOnNavigationEvent4 = initRenderFinish.onNavigationEvent(jsonElement)) == null) {
                int i5 = IAuthTabCallbackDefault + 45;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                strOnWarmupCompleted = "";
            } else {
                int i7 = onWarmupCompleted + 57;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                strOnWarmupCompleted = jsonPrimitiveOnNavigationEvent4.onWarmupCompleted();
                if (strOnWarmupCompleted == null) {
                }
            }
            JsonElement jsonElement2 = (JsonElement) jsonObjectOnExtraCallbackWithResult.get("stack");
            if (jsonElement2 == null || (jsonArrayOnWarmupCompleted = initRenderFinish.onWarmupCompleted(jsonElement2)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArrayOnWarmupCompleted, 10));
                Iterator it = jsonArrayOnWarmupCompleted.iterator();
                while (it.hasNext()) {
                    JsonObject jsonObjectOnExtraCallbackWithResult2 = initRenderFinish.onExtraCallbackWithResult((JsonElement) it.next());
                    JsonElement jsonElement3 = (JsonElement) jsonObjectOnExtraCallbackWithResult2.get("file");
                    if (jsonElement3 != null) {
                        int i9 = IAuthTabCallbackDefault + 77;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            initRenderFinish.onNavigationEvent(jsonElement3);
                            arrayList2.hashCode();
                            throw null;
                        }
                        JsonPrimitive jsonPrimitiveOnNavigationEvent5 = initRenderFinish.onNavigationEvent(jsonElement3);
                        strOnWarmupCompleted2 = jsonPrimitiveOnNavigationEvent5 != null ? jsonPrimitiveOnNavigationEvent5.onWarmupCompleted() : null;
                    }
                    JsonElement jsonElement4 = (JsonElement) jsonObjectOnExtraCallbackWithResult2.get("methodName");
                    if (jsonElement4 != null) {
                        int i10 = IAuthTabCallbackDefault + 45;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            jsonPrimitiveOnNavigationEvent3 = initRenderFinish.onNavigationEvent(jsonElement4);
                            int i11 = 24 / 0;
                            strOnWarmupCompleted3 = jsonPrimitiveOnNavigationEvent3 != null ? jsonPrimitiveOnNavigationEvent3.onWarmupCompleted() : null;
                        } else {
                            jsonPrimitiveOnNavigationEvent3 = initRenderFinish.onNavigationEvent(jsonElement4);
                            if (jsonPrimitiveOnNavigationEvent3 != null) {
                            }
                        }
                    }
                    JsonElement jsonElement5 = (JsonElement) jsonObjectOnExtraCallbackWithResult2.get("lineNumber");
                    if (jsonElement5 != null) {
                        int i12 = onWarmupCompleted + 107;
                        IAuthTabCallbackDefault = i12 % 128;
                        if (i12 % 2 == 0) {
                            jsonPrimitiveOnNavigationEvent2 = initRenderFinish.onNavigationEvent(jsonElement5);
                            int i13 = 54 / 0;
                            strOnWarmupCompleted4 = jsonPrimitiveOnNavigationEvent2 != null ? jsonPrimitiveOnNavigationEvent2.onWarmupCompleted() : null;
                        } else {
                            jsonPrimitiveOnNavigationEvent2 = initRenderFinish.onNavigationEvent(jsonElement5);
                            if (jsonPrimitiveOnNavigationEvent2 != null) {
                            }
                        }
                    }
                    JsonElement jsonElement6 = (JsonElement) jsonObjectOnExtraCallbackWithResult2.get("lineNumber");
                    if (jsonElement6 != null) {
                        int i14 = onWarmupCompleted + 75;
                        IAuthTabCallbackDefault = i14 % 128;
                        if (i14 % 2 == 0) {
                            jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement6);
                            int i15 = 20 / 0;
                            strOnWarmupCompleted5 = jsonPrimitiveOnNavigationEvent != null ? jsonPrimitiveOnNavigationEvent.onWarmupCompleted() : null;
                        } else {
                            jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement6);
                            if (jsonPrimitiveOnNavigationEvent != null) {
                            }
                        }
                    }
                    arrayList.add(strOnWarmupCompleted3 + "\n" + strOnWarmupCompleted2 + "@" + strOnWarmupCompleted4 + ":" + strOnWarmupCompleted5);
                }
            }
            if (arrayList != null) {
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((String) it2.next()) + "\n");
                }
            }
            return StringsKt.trimIndent("\n            " + strOnWarmupCompleted + "\n\n            " + arrayList2 + "\n        ");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object obj = Result.constructor-impl(ResultKt.createFailure(th));
            return (String) (Result.onExtraCallback(obj) ? "" : obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[PHI: r1
      0x0067: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v36 java.lang.String) binds: [B:12:0x0063, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallback() throws Throwable {
        String str;
        int i = 2 % 2;
        String str2 = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        if (!StringsKt.startsWith$default(str2, "generic", false, 2, (Object) null)) {
            int i2 = IAuthTabCallbackDefault + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            Object[] objArr = new Object[1];
            a(new char[]{3642, 39878, 28588, 52340, 16893, 37029, 20026, 33005}, ImageFormat.getBitsPerPixel(0) + 8, objArr);
            if (!StringsKt.startsWith$default(str2, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
                int i4 = IAuthTabCallbackDefault + 5;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    str = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    if (!StringsKt.contains$default(str, "google_sdk", false, 5, (Object) null)) {
                        int i5 = IAuthTabCallbackDefault + 105;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        Locale locale = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        String lowerCase = str.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        if (!StringsKt.contains$default(lowerCase, "droid4x", false, 2, (Object) null)) {
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            if (!StringsKt.contains$default(str, "Emulator", false, 2, (Object) null)) {
                                Intrinsics.checkNotNullExpressionValue(str, "");
                                if (!StringsKt.contains$default(str, "Android SDK built for x86", false, 2, (Object) null)) {
                                    int i7 = onWarmupCompleted + 87;
                                    IAuthTabCallbackDefault = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        String str3 = Build.MANUFACTURER;
                                        Intrinsics.checkNotNullExpressionValue(str3, "");
                                        if (!StringsKt.contains$default(str3, "Genymotion", false, 2, (Object) null)) {
                                            String str4 = Build.HARDWARE;
                                            Intrinsics.checkNotNullExpressionValue(str4, "");
                                            if (!StringsKt.contains$default(str4, "goldfish", false, 2, (Object) null)) {
                                                Intrinsics.checkNotNullExpressionValue(str4, "");
                                                if (!StringsKt.contains$default(str4, "ranchu", false, 2, (Object) null)) {
                                                    int i8 = onWarmupCompleted + 71;
                                                    IAuthTabCallbackDefault = i8 % 128;
                                                    int i9 = i8 % 2;
                                                    Intrinsics.checkNotNullExpressionValue(str4, "");
                                                    if (!StringsKt.contains$default(str4, "vbox86", false, 2, (Object) null)) {
                                                        String str5 = Build.PRODUCT;
                                                        Intrinsics.checkNotNullExpressionValue(str5, "");
                                                        if (!StringsKt.contains$default(str5, "sdk", false, 2, (Object) null)) {
                                                            int i10 = IAuthTabCallbackDefault + 17;
                                                            onWarmupCompleted = i10 % 128;
                                                            if (i10 % 2 != 0) {
                                                                Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                if (!StringsKt.contains$default(str5, "google_sdk", true, 3, (Object) null)) {
                                                                    Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                    if (!StringsKt.contains$default(str5, "sdk_google", false, 2, (Object) null)) {
                                                                        Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                        if (!StringsKt.contains$default(str5, "sdk_x86", false, 2, (Object) null)) {
                                                                            Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                            if (!StringsKt.contains$default(str5, "vbox86p", false, 2, (Object) null)) {
                                                                                Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                                if (!StringsKt.contains$default(str5, "emulator", false, 2, (Object) null)) {
                                                                                    Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                                    if (!StringsKt.contains$default(str5, "simulator", false, 2, (Object) null)) {
                                                                                        String str6 = Build.BOARD;
                                                                                        Intrinsics.checkNotNullExpressionValue(str6, "");
                                                                                        Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                        String lowerCase2 = str6.toLowerCase(locale);
                                                                                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                                                                                        if (!StringsKt.contains$default(lowerCase2, "nox", false, 2, (Object) null)) {
                                                                                            int i11 = IAuthTabCallbackDefault + 93;
                                                                                            onWarmupCompleted = i11 % 128;
                                                                                            if (i11 % 2 != 0) {
                                                                                                String str7 = Build.BOOTLOADER;
                                                                                                Intrinsics.checkNotNullExpressionValue(str7, "");
                                                                                                Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                                String lowerCase3 = str7.toLowerCase(locale);
                                                                                                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                                                                                                if (!StringsKt.contains$default(lowerCase3, "nox", true, 5, (Object) null)) {
                                                                                                    Intrinsics.checkNotNullExpressionValue(str4, "");
                                                                                                    Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                                    String lowerCase4 = str4.toLowerCase(locale);
                                                                                                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                                                                                                    if (!StringsKt.contains$default(lowerCase4, "nox", false, 2, (Object) null)) {
                                                                                                        Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                                                        Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                                        String lowerCase5 = str5.toLowerCase(locale);
                                                                                                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
                                                                                                        if (!StringsKt.contains$default(lowerCase5, "nox", false, 2, (Object) null)) {
                                                                                                            int i12 = onWarmupCompleted + 107;
                                                                                                            IAuthTabCallbackDefault = i12 % 128;
                                                                                                            if (i12 % 2 == 0) {
                                                                                                                String str8 = Build.SERIAL;
                                                                                                                Intrinsics.checkNotNullExpressionValue(str8, "");
                                                                                                                Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                                                String lowerCase6 = str8.toLowerCase(locale);
                                                                                                                Intrinsics.checkNotNullExpressionValue(lowerCase6, "");
                                                                                                                if (!StringsKt.contains$default(lowerCase6, "nox", false, 4, (Object) null)) {
                                                                                                                    String str9 = Build.BRAND;
                                                                                                                    Intrinsics.checkNotNullExpressionValue(str9, "");
                                                                                                                    if (StringsKt.startsWith$default(str9, "generic", false, 2, (Object) null)) {
                                                                                                                        int i13 = IAuthTabCallbackDefault + 55;
                                                                                                                        onWarmupCompleted = i13 % 128;
                                                                                                                        if (i13 % 2 != 0) {
                                                                                                                            String str10 = Build.DEVICE;
                                                                                                                            Intrinsics.checkNotNullExpressionValue(str10, "");
                                                                                                                            if (!StringsKt.startsWith$default(str10, "generic", false, 3, (Object) null)) {
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            String str11 = Build.DEVICE;
                                                                                                                            Intrinsics.checkNotNullExpressionValue(str11, "");
                                                                                                                            if (!StringsKt.startsWith$default(str11, "generic", false, 2, (Object) null)) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    return false;
                                                                                                                }
                                                                                                            } else {
                                                                                                                String str12 = Build.SERIAL;
                                                                                                                Intrinsics.checkNotNullExpressionValue(str12, "");
                                                                                                                Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                                                String lowerCase7 = str12.toLowerCase(locale);
                                                                                                                Intrinsics.checkNotNullExpressionValue(lowerCase7, "");
                                                                                                                if (!StringsKt.contains$default(lowerCase7, "nox", false, 2, (Object) null)) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                String str13 = Build.BOOTLOADER;
                                                                                                Intrinsics.checkNotNullExpressionValue(str13, "");
                                                                                                Intrinsics.checkNotNullExpressionValue(locale, "");
                                                                                                String lowerCase8 = str13.toLowerCase(locale);
                                                                                                Intrinsics.checkNotNullExpressionValue(lowerCase8, "");
                                                                                                if (!StringsKt.contains$default(lowerCase8, "nox", false, 2, (Object) null)) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                Intrinsics.checkNotNullExpressionValue(str5, "");
                                                                if (!StringsKt.contains$default(str5, "google_sdk", false, 2, (Object) null)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        String str14 = Build.MANUFACTURER;
                                        Intrinsics.checkNotNullExpressionValue(str14, "");
                                        if (!StringsKt.contains$default(str14, "Genymotion", false, 2, (Object) null)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    if (!StringsKt.contains$default(str, "google_sdk", false, 2, (Object) null)) {
                    }
                }
            }
        }
        return true;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $11 + 113;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cArgb = (char) Color.argb(i3, i3, i3, i3);
                        int iResolveSizeAndState = View.resolveSizeAndState(i3, i3, i3) + 10;
                        int i12 = 12434 - (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cArgb, iResolveSizeAndState, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Process.getGidForName("") + 11, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 14, (ViewConfiguration.getJumpTapTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
