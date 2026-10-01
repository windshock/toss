package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.JsonElement;
import im.toss.core.webkit.MessageCallbackProxyKt$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import o.ALCFaceBox;
import o.startRunning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceBox {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = -3475142950233010185L;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(jsonElement, startrunning);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(jsonElement, startrunning);
        int i3 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Boolean bool, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-1065014678, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{bool, startrunning}, iIAuthTabCallback2, 1065014679);
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Long l, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(l, startrunning);
        int i4 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onPreviewFrame onpreviewframe, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onpreviewframe, startrunning);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Integer num = (Integer) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(num, startrunning);
        }
        onWarmupCompleted(num, startrunning);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Integer num, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(num, startrunning);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(str, startrunning);
        }
        onNavigationEvent(str, startrunning);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Boolean bool, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback5 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback6 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-376619952, iIAuthTabCallback4, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{bool, startrunning}, iIAuthTabCallback5, 376619957);
        int i3 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Double d, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(d, startrunning);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(d, startrunning);
        int i3 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(kotlinx.serialization.json.JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(jsonElement, startrunning);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(kotlinx.serialization.json.JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(jsonElement, startrunning);
        int i4 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(onPreviewFrame onpreviewframe, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(onpreviewframe, startrunning);
        }
        onExtraCallback(onpreviewframe, startrunning);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i);
        int i9 = ~i6;
        int i10 = ~i;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i2 | i)) | (~(i7 | i9 | i10));
        int i13 = i6 + i + i5 + ((-1136091917) * i4) + (376669458 * i3);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i6) + 1718550528 + ((-1748215485) * i) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i5) + ((-2044854272) * i4) + (41156608 * i3) + (1721171968 * i14);
        int i16 = ((i6 * (-924404593)) - 1636593565) + (i * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i5 * (-924404175)) + (i4 * (-2083730301)) + (i3 * 182666354) + (i14 * (-51970048));
        switch (i15 + (i16 * i16 * (-653721600))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(jsonElement, startrunning);
        }
        onNavigationEvent(jsonElement, startrunning);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Double d, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(90365791, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{d, startrunning}, iIAuthTabCallback2, -90365785);
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Long l, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(l, startrunning);
        int i4 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, startrunning);
        int i4 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static final JsonObject onWarmupCompleted(@Nullable String str, @Nullable String str2, @NotNull Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            Object[] objArr = new Object[1];
            a(new char[]{2733, 22172, 45761, 7704, 31301, 51130, 9203}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23608, objArr);
            linkedHashMap.put(((String) objArr[0]).intern(), initRenderFinish.onNavigationEvent(str));
        }
        if (str2 != null) {
            int i2 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.put("code", initRenderFinish.onNavigationEvent(str2));
        }
        int i4 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object[] objArr2 = new Object[1];
            a(new char[]{2733, 22172, 45761, 7704, 31301, 51130, 9203}, 23609 - (Process.myPid() >> 22), objArr2);
            if (!Intrinsics.areEqual(key, ((String) objArr2[0]).intern())) {
                int i6 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (!Intrinsics.areEqual(key, "code")) {
                    int i8 = onWarmupCompleted + 117;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    linkedHashMap.put(key, value != null ? initRenderFinish.onNavigationEvent(value) : JsonNull.INSTANCE);
                }
            }
            throw new IllegalArgumentException(("extras 에 '" + key + "' 키 사용 금지 — onError(message, code) 전용 파라미터를 사용하세요.").toString());
        }
        return new JsonObject(linkedHashMap);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        final onPreviewFrame onpreviewframe = (onPreviewFrame) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Intrinsics.checkNotNullParameter(onpreviewframe, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxyKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = ALCFaceBox.IAuthTabCallback(onpreviewframe, (startRunning) obj);
                int i5 = onExtraCallback + 41;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 95 / 0;
                }
                return unitIAuthTabCallback;
            }
        });
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(onPreviewFrame onpreviewframe, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.IAuthTabCallback(onpreviewframe);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback(onpreviewframe);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static final void onExtraCallback(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxyKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 43;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = ALCFaceBox.onExtraCallback(str, (startRunning) obj);
                int i5 = onExtraCallback + 121;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(String str, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onNavigationEvent(bool);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        final Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxyKt$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = ALCFaceBox.onExtraCallbackWithResult(bool, (startRunning) obj);
                int i5 = onWarmupCompleted + 25;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return null;
    }

    public static final void onExtraCallback(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable Integer num) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new MessageCallbackProxyKt$.ExternalSyntheticLambda2(num));
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(Integer num, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onExtraCallbackWithResult(num);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void IAuthTabCallback(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable Long l) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new MessageCallbackProxyKt$.ExternalSyntheticLambda11(l));
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
    }

    private static final Unit onExtraCallback(Long l, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.onExtraCallback(l);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onExtraCallback(l);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(Double d, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onNavigationEvent(d);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void onWarmupCompleted(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable Double d) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new MessageCallbackProxyKt$.ExternalSyntheticLambda6(d));
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        final kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxyKt$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 63;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                kotlinx.serialization.json.JsonElement jsonElement2 = jsonElement;
                startRunning startrunning = (startRunning) obj;
                if (i4 != 0) {
                    return ALCFaceBox.onNavigationEvent(jsonElement2, startrunning);
                }
                ALCFaceBox.onNavigationEvent(jsonElement2, startrunning);
                throw null;
            }
        });
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(kotlinx.serialization.json.JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback(jsonElement);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Deprecated
    public static final void onWarmupCompleted(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable final JsonElement jsonElement) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setonoutofmemeryerrorcallback.IAuthTabCallback(new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxyKt$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 95;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                JsonElement jsonElement2 = jsonElement;
                startRunning startrunning = (startRunning) obj;
                if (i4 == 0) {
                    return ALCFaceBox.onWarmupCompleted(jsonElement2, startrunning);
                }
                ALCFaceBox.onWarmupCompleted(jsonElement2, startrunning);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 4) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            map = access8100.onNavigationEvent();
        }
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(-1961690496, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{setonoutofmemeryerrorcallback, th, str, map}, iIAuthTabCallback2, 1961690500);
        int i4 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        Throwable th = (Throwable) objArr[1];
        String str = (String) objArr[2];
        Map<String, String> map = (Map) objArr[3];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(map, "");
        setonoutofmemeryerrorcallback.onExtraCallbackWithResult(th.getMessage(), str, map);
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallback(onPreviewFrame onpreviewframe, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.IAuthTabCallback(onpreviewframe);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback(onpreviewframe);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallback(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        setonoutofmemeryerrorcallback.onNavigationEvent(str, (Function1<? super startRunning, Unit>) new MessageCallbackProxyKt$.ExternalSyntheticLambda5(str2));
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(String str, startRunning startrunning) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            unit = Unit.INSTANCE;
            int i3 = 66 / 0;
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, str}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 525269328, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unit;
        Boolean bool = (Boolean) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.onNavigationEvent(bool);
            unit = Unit.INSTANCE;
            int i3 = 1 / 0;
        } else {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.onNavigationEvent(bool);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Integer num, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onExtraCallbackWithResult(num);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Long l, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onExtraCallback(l);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Double d = (Double) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.onNavigationEvent(d);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.onNavigationEvent(d);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback(kotlinx.serialization.json.JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback(jsonElement);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    public static final void onNavigationEvent(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull String str, @Nullable final kotlinx.serialization.json.JsonElement jsonElement) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        setonoutofmemeryerrorcallback.onNavigationEvent(str, new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxyKt$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = ALCFaceBox.onExtraCallbackWithResult(jsonElement, (startRunning) obj);
                int i5 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 91 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(JsonElement jsonElement, startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonElement}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        String str = (String) objArr[1];
        final JsonElement jsonElement = (JsonElement) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        setonoutofmemeryerrorcallback.onNavigationEvent(str, new Function1() { // from class: im.toss.core.webkit.MessageCallbackProxyKt$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 45;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = ALCFaceBox.IAuthTabCallback(jsonElement, (startRunning) obj);
                int i5 = onExtraCallback + 1;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 99;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19627 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * (onNavigationEvent | 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 59 - Color.argb(0, 0, 0, 0), 6383 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 24 - View.getDefaultSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = (onNavigationEvent ^ 5407414049857832247L) ^ ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue();
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myTid() >> 22) + 59, 6382 - TextUtils.indexOf((CharSequence) "", '0', 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 60 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getTrimmedLength("") + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i8 = $10 + 103;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Integer num, startRunning startrunning) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-994893637, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{num, startrunning}, iIAuthTabCallback2, 994893640);
    }

    @Deprecated
    public static final void onWarmupCompleted(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull String str, @Nullable JsonElement jsonElement) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(-908557745, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{setonoutofmemeryerrorcallback, str, jsonElement}, iIAuthTabCallback2, 908557753);
    }

    private static final Unit onNavigationEvent(Boolean bool, startRunning startrunning) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1065014678, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{bool, startrunning}, iIAuthTabCallback2, 1065014679);
    }

    private static final Unit onExtraCallback(Double d, startRunning startrunning) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onWarmupCompleted(90365791, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{d, startrunning}, iIAuthTabCallback2, -90365785);
    }

    public static final void onWarmupCompleted(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull Throwable th, @Nullable String str, @NotNull Map<String, String> map) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(-1961690496, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{setonoutofmemeryerrorcallback, th, str, map}, iIAuthTabCallback2, 1961690500);
    }

    public static final void IAuthTabCallback(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @NotNull onPreviewFrame onpreviewframe) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(1684873911, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{setonoutofmemeryerrorcallback, onpreviewframe}, iIAuthTabCallback2, -1684873909);
    }

    public static final void IAuthTabCallback(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable Boolean bool) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(-2103726265, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{setonoutofmemeryerrorcallback, bool}, iIAuthTabCallback2, 2103726265);
    }

    public static final void onExtraCallbackWithResult(@NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, @Nullable kotlinx.serialization.json.JsonElement jsonElement) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        onWarmupCompleted(291820722, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{setonoutofmemeryerrorcallback, jsonElement}, iIAuthTabCallback2, -291820715);
    }

    private static final Unit onExtraCallback(Boolean bool, startRunning startrunning) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-376619952, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{bool, startrunning}, iIAuthTabCallback2, 376619957);
    }
}
