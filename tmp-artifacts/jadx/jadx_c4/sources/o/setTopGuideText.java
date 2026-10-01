package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tmoney.LiveCheckConstants;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebMessageHandlerManager$;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.core.workerservice.WorkerService$Companion$$ExternalSyntheticLambda9;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ALCFaceValidation;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.setTopGuideText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setTopGuideText {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String IAuthTabCallback;
    private static getBacktraceNote<? super String, ? super String, ? super String, Unit> IAuthTabCallbackDefault = null;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char[] IAuthTabCallback_Parcel = null;
    private static char access000 = 0;
    private static char access100 = 0;
    private static char asBinder = 0;
    private static calculateMaxTextSize asInterface = null;
    private static int extraCallbackWithResult = 0;
    private static int getInterfaceDescriptor = 0;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final AppSetIdAndScope1 onNavigationEvent;
    private static ALCOcclusion onTransact = null;
    public static final setTopGuideText onWarmupCompleted;
    private static int writeTypedObject = 1;

    public static /* synthetic */ void onExtraCallback(WebViewContentOwner webViewContentOwner, String str, JsonObject jsonObject, String str2, drawTextBox drawtextbox, int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            onWarmupCompleted(-1175343880, new Object[]{webViewContentOwner, str, jsonObject, str2, drawtextbox, Integer.valueOf(i), Integer.valueOf(i2), intent}, 1175343880, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted(-1175343880, new Object[]{webViewContentOwner, str, jsonObject, str2, drawtextbox, Integer.valueOf(i), Integer.valueOf(i2), intent}, 1175343880, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        int i5 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(str, str2, str3);
        int i4 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i7 | i2)) | (~(i8 | i2));
        int i10 = ~i2;
        int i11 = (~(i10 | i)) | (~(i8 | i));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i2 + i + i5 + ((-2109949842) * i4) + (2078889904 * i6);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i2) + 932184064 + (61854959 * i) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i5) + (610271232 * i4) + (922746880 * i6) + (671350784 * i14);
        int i16 = (i2 * (-573803825)) + 196542130 + (i * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i5 * (-573803307)) + (i4 * (-843101306)) + (i6 * (-1524517520)) + (i14 * 458489856);
        return i15 + ((i16 * i16) * 64749568) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(WebViewContentOwner webViewContentOwner, drawTextBox drawtextbox, String str, String str2, JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(webViewContentOwner, drawtextbox, str, str2, jsonObject);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private setTopGuideText() {
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{54878, 61415, 5594, 4552, 42582, 56837, 1031, 45804, 9586, 18951, 1244, 5486}, 12 - (Process.myPid() >> 22), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(false, new byte[]{1, 0, 0, 1}, new int[]{0, 4, 0, 3}, objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(false, new byte[]{1, 1, 1, 1}, new int[]{4, 4, 0, 1}, objArr3);
        IAuthTabCallback = ((String) objArr3[0]).intern();
        onWarmupCompleted = new setTopGuideText();
        Object[] objArr4 = new Object[1];
        a(new char[]{51527, 16437, 52674, 60019, 42582, 56837, 37783, 53561, 35652, 58813}, 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
        onNavigationEvent = ea10.onExtraCallbackWithResult(((String) objArr4[0]).intern());
        asInterface = new calculateMaxTextSize(new ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1[0]);
        onTransact = ALCOcclusion.Companion.onNavigationEvent();
        int i = writeTypedObject + 39;
        extraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0055 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0004, B:6:0x004f, B:9:0x0057, B:8:0x0055), top: B:19:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ALCFaceValidation IAuthTabCallback(String str, JsonObject jsonObject) {
        Object obj;
        int i = 2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            ALCFaceValidation.onExtraCallbackWithResult onextracallbackwithresult = ALCFaceValidation.Companion;
            setText settext = new setText(jsonObject);
            Object[] objArr = {asInterface, str, false, 2, null};
            int iIAuthTabCallback = WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback();
            drawTextBox drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, objArr, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback);
            if (drawtextbox != null) {
                int i2 = getInterfaceDescriptor + 89;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                ALCFaceValidation aLCFaceValidationOnWarmupCompleted = drawtextbox.onWarmupCompleted(str);
                if (aLCFaceValidationOnWarmupCompleted == null) {
                    aLCFaceValidationOnWarmupCompleted = ALCFaceValidation.WITHOUT_CONTENTS;
                }
                obj = kotlin.Result.constructor-impl(onextracallbackwithresult.onExtraCallbackWithResult(settext, aLCFaceValidationOnWarmupCompleted));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i4 = IAuthTabCallbackStubProxy + 87;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        } else {
            obj2 = obj;
        }
        return (ALCFaceValidation) obj2;
    }

    public final void onWarmupCompleted(@NotNull calculateMaxTextSize calculatemaxtextsize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(calculatemaxtextsize, "");
            asInterface = calculatemaxtextsize;
            int i3 = 90 / 0;
        } else {
            Intrinsics.checkNotNullParameter(calculatemaxtextsize, "");
            asInterface = calculatemaxtextsize;
        }
        int i4 = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Class<? extends drawTextBox> cls) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(cls, "");
            asInterface.IAuthTabCallback((TextFieldScrollKtExternalSyntheticLambda0) r8lambdakrhaimf1bm5cgjbilhp45vln_xq, cls);
        } else {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(cls, "");
            asInterface.IAuthTabCallback((TextFieldScrollKtExternalSyntheticLambda0) r8lambdakrhaimf1bm5cgjbilhp45vln_xq, cls);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ALCOcclusion aLCOcclusion = (ALCOcclusion) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aLCOcclusion, "");
            onTransact = aLCOcclusion;
            throw null;
        }
        Intrinsics.checkNotNullParameter(aLCOcclusion, "");
        onTransact = aLCOcclusion;
        int i3 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return null;
    }

    public final void onExtraCallback(@NotNull getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            IAuthTabCallbackDefault = getbacktracenote;
            throw null;
        }
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        IAuthTabCallbackDefault = getbacktracenote;
        int i3 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onExtraCallback(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 69;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<? super String, ? super String, ? super String, Unit> getbacktracenote = IAuthTabCallbackDefault;
        if (getbacktracenote != null) {
            int i5 = i2 + 95;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            getbacktracenote.invoke(str, str2, str3);
            if (i6 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096 A[PHI: r1 r2
      0x0096: PHI (r1v71 o.drawTextBox) = (r1v6 o.drawTextBox), (r1v7 o.drawTextBox), (r1v74 o.drawTextBox) binds: [B:8:0x0089, B:10:0x008f, B:5:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r2v32 im.toss.core.webkit.TossCoreWebView) = 
      (r2v2 im.toss.core.webkit.TossCoreWebView)
      (r2v3 im.toss.core.webkit.TossCoreWebView)
      (r2v34 im.toss.core.webkit.TossCoreWebView)
     binds: [B:8:0x0089, B:10:0x008f, B:5:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x040e A[PHI: r1
      0x040e: PHI (r1v18 android.net.Uri) = (r1v17 android.net.Uri), (r1v46 android.net.Uri) binds: [B:80:0x040c, B:77:0x03e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b A[PHI: r1 r2
      0x008b: PHI (r1v7 o.drawTextBox) = (r1v6 o.drawTextBox), (r1v74 o.drawTextBox) binds: [B:8:0x0089, B:5:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r2v3 im.toss.core.webkit.TossCoreWebView) = (r2v2 im.toss.core.webkit.TossCoreWebView), (r2v34 im.toss.core.webkit.TossCoreWebView) binds: [B:8:0x0089, B:5:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject) throws Throwable {
        drawTextBox drawtextbox;
        TossCoreWebView webView;
        drawTextBox drawtextbox2;
        TossCoreWebView tossCoreWebView;
        String str2;
        int i;
        String strName;
        String str3;
        Uri uri;
        String host;
        int i2;
        int i3;
        byte[] bArr;
        JsonObject jsonObject2;
        String strOnExtraCallbackWithResult;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 105;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{asInterface, str, false, 2, null}, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback());
            webView = webViewContentOwner.getWebView();
            if (webView != null) {
                String strIAuthTabCallbackStubProxy = webView.IAuthTabCallbackStubProxy();
                if (strIAuthTabCallbackStubProxy == null) {
                    drawtextbox2 = drawtextbox;
                    tossCoreWebView = webView;
                    str2 = "";
                } else {
                    drawtextbox2 = drawtextbox;
                    tossCoreWebView = webView;
                    str2 = strIAuthTabCallbackStubProxy;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{asInterface, str, false, 2, null}, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback());
            webView = webViewContentOwner.getWebView();
            if (webView != null) {
            }
        }
        String str4 = (tossCoreWebView == null || (strOnExtraCallbackWithResult = tossCoreWebView.onExtraCallbackWithResult()) == null) ? "" : strOnExtraCallbackWithResult;
        if (drawtextbox2 == null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            b(true, new byte[]{1, 1, 1, 1}, new int[]{60, 4, 0, 0}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{1, 0, 1}, new int[]{64, 3, 0, 2}, objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            b(false, new byte[]{1, 0, 0, 1}, new int[]{0, 4, 0, 3}, objArr3);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), str);
            Object[] objArr4 = new Object[1];
            b(false, new byte[]{1, 1, 1}, new int[]{67, 3, 121, 1}, objArr4);
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), str2);
            Object[] objArr5 = new Object[1];
            b(false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0}, new int[]{70, 10, 62, 10}, objArr5);
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), str4);
            String str5 = tossCoreWebView != null ? (String) TossBridgeWebView.onWarmupCompleted(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{tossCoreWebView}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -157751857, 157751867, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback()) : null;
            Object[] objArr6 = new Object[1];
            b(false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0}, new int[]{80, 11, 0, 1}, objArr6);
            Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr6[0]).intern(), str5)});
            if (ALCFaceValidation.ALL == onWarmupCompleted.IAuthTabCallback(str, jsonObject)) {
                Object[] objArr7 = new Object[1];
                a(new char[]{64592, 62249, 14575, 47692, 1881, 9477}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6, objArr7);
                JsonObject jsonObject3 = jsonObject.get(((String) objArr7[0]).intern());
                if (jsonObject3 instanceof JsonObject) {
                    int i6 = IAuthTabCallbackStubProxy + 23;
                    getInterfaceDescriptor = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    jsonObject2 = jsonObject3;
                } else {
                    jsonObject2 = null;
                }
                if (jsonObject2 != null) {
                    Object[] objArr8 = new Object[1];
                    a(new char[]{64592, 62249, 14575, 47692, 1881, 9477}, TextUtils.getOffsetAfter("", 0) + 6, objArr8);
                    mapIAuthTabCallback.put(((String) objArr8[0]).intern(), jsonObject2.toString());
                }
            }
            Unit unit = Unit.INSTANCE;
            Object[] objArr9 = new Object[1];
            b(false, new byte[]{1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0}, new int[]{91, 19, 0, 0}, objArr9);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr9[0]).intern(), (String) null, mapIAuthTabCallback, (String) null, false, (String) null, 58, (Object) null);
            Object[] objArr10 = new Object[1];
            a(new char[]{19554, 30428, 208, 37741, 44327, 45631, 25265, 6396, 52283, 22167, 23564, 11695, 12014, 8058, 46418, 52180, 62908, 16032, 45467, 31635, 38719, 11182, 31571, 44500, 45148, 15696, 15746, 10394, 21824, 44455}, 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr10);
            ((String) objArr10[0]).intern();
            Object[] objArr11 = new Object[1];
            a(new char[]{28385, 4543, 1175, 15560, 43581, 22327, 21824, 44455}, 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr11);
            ((String) objArr11[0]).intern();
            Objects.toString(jsonObject);
            return false;
        }
        ALCLiveness aLCLivenessOnExtraCallbackWithResult = onTransact.onExtraCallbackWithResult(str);
        TossCoreWebView.onExtraCallbackWithResult onextracallbackwithresult = TossCoreWebView.Companion;
        boolean zOnNavigationEvent = onextracallbackwithresult.onNavigationEvent();
        String str6 = str4;
        boolean zOnExtraCallbackWithResult = ALCPreviewView.onExtraCallbackWithResult.onExtraCallbackWithResult(str, drawtextbox2, aLCLivenessOnExtraCallbackWithResult, str2, str4);
        if (tossCoreWebView != null && (zOnNavigationEvent || zOnExtraCallbackWithResult)) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 34 - Drawable.resolveOpacity(0, 0), 7095 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1088743663, false, "Companion", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object[] objArr12 = {str6};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1421773909);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (63468 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52, 7129 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1711174341, false, "IAuthTabCallback", new Class[]{String.class});
                }
                Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj, objArr12);
                if (objInvoke != null) {
                    int i7 = IAuthTabCallbackStubProxy + 83;
                    getInterfaceDescriptor = i7 % 128;
                    if (i7 % 2 != 0) {
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(174793451);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 34 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7094, 992730235, false, "getAffiliate", new Class[0]);
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    i = 8;
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(174793451);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 33 - MotionEvent.axisFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7093, 992730235, false, "getAffiliate", new Class[0]);
                    }
                    Enum r2 = (Enum) ((Method) objOnExtraCallback4).invoke(objInvoke, null);
                    if (r2 != null) {
                        int i8 = IAuthTabCallbackStubProxy + 95;
                        getInterfaceDescriptor = i8 % 128;
                        int i9 = i8 % 2;
                        strName = r2.name();
                        int i10 = IAuthTabCallbackStubProxy + 41;
                        getInterfaceDescriptor = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    Object[] objArr13 = new Object[1];
                    a(new char[]{37493, 40803, 64392, 9764, 45467, 31635, 35289, 61397, 42106, 51050, 17283, 54866, 44492, 31653, 60498, 6912, 43428, 11208}, Drawable.resolveOpacity(0, 0) + 17, objArr13);
                    jsonObject.addProperty(((String) objArr13[0]).intern(), strName);
                    if (onextracallbackwithresult.onNavigationEvent() || zOnExtraCallbackWithResult) {
                        str3 = str6;
                        tossCoreWebView.post(trimMetadataStringsTo.onExtraCallback().onExtraCallbackWithResult(new WebMessageHandlerManager$.ExternalSyntheticLambda1(webViewContentOwner, drawtextbox2, str, str3, jsonObject)));
                    } else {
                        int i12 = getInterfaceDescriptor + 71;
                        IAuthTabCallbackStubProxy = i12 % 128;
                        if (i12 % 2 == 0) {
                            uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str6});
                            int i13 = 88 / 0;
                            if (uri != null) {
                                host = uri.getHost();
                                i2 = 3;
                            } else {
                                int i14 = IAuthTabCallbackStubProxy + 71;
                                getInterfaceDescriptor = i14 % 128;
                                if (i14 % 2 != 0) {
                                    i2 = 3;
                                    int i15 = 3 / 3;
                                } else {
                                    i2 = 3;
                                }
                                host = null;
                            }
                        } else {
                            uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str6});
                            if (uri != null) {
                            }
                        }
                        if (host != null) {
                            int i16 = IAuthTabCallbackStubProxy + 95;
                            getInterfaceDescriptor = i16 % 128;
                            if (i16 % 2 != 0) {
                                Object[] objArr14 = new Object[1];
                                bArr = null;
                                b(true, null, new int[]{152, i, 56, 1}, objArr14);
                                if (!StringsKt.startsWith$default(host, ((String) objArr14[0]).intern(), true, i2, (Object) null)) {
                                    i3 = 2;
                                }
                                str3 = str6;
                                tossCoreWebView.post(trimMetadataStringsTo.onExtraCallback().onExtraCallbackWithResult(new WebMessageHandlerManager$.ExternalSyntheticLambda1(webViewContentOwner, drawtextbox2, str, str3, jsonObject)));
                            } else {
                                bArr = null;
                                Object[] objArr15 = new Object[1];
                                b(true, null, new int[]{152, i, 56, 1}, objArr15);
                                String strIntern2 = ((String) objArr15[0]).intern();
                                i3 = 2;
                                if (!StringsKt.startsWith$default(host, strIntern2, false, 2, (Object) null)) {
                                }
                            }
                        } else {
                            i3 = 2;
                            bArr = null;
                        }
                        int[] iArr = {160, 9, 131, i3};
                        Object[] objArr16 = new Object[1];
                        b(true, bArr, iArr, objArr16);
                        String strIntern3 = ((String) objArr16[0]).intern();
                        Object[] objArr17 = new Object[1];
                        a(new char[]{55735, 57511, 21881, 7644, 19841, 34035, 19841, 34035, 19827, 13249}, 9 - (ViewConfiguration.getScrollBarSize() >> 8), objArr17);
                        if (!CollectionsKt.contains(clearFaultAdjacentMetadata.onExtraCallback(new String[]{strIntern3, ((String) objArr17[0]).intern()}), host)) {
                            str3 = str6;
                            tossCoreWebView.post(new WebMessageHandlerManager$.ExternalSyntheticLambda0(str, str2, str3));
                        }
                        tossCoreWebView.post(trimMetadataStringsTo.onExtraCallback().onExtraCallbackWithResult(new WebMessageHandlerManager$.ExternalSyntheticLambda1(webViewContentOwner, drawtextbox2, str, str3, jsonObject)));
                    }
                } else {
                    i = 8;
                }
                strName = null;
                Object[] objArr132 = new Object[1];
                a(new char[]{37493, 40803, 64392, 9764, 45467, 31635, 35289, 61397, 42106, 51050, 17283, 54866, 44492, 31653, 60498, 6912, 43428, 11208}, Drawable.resolveOpacity(0, 0) + 17, objArr132);
                jsonObject.addProperty(((String) objArr132[0]).intern(), strName);
                if (onextracallbackwithresult.onNavigationEvent()) {
                    str3 = str6;
                    tossCoreWebView.post(trimMetadataStringsTo.onExtraCallback().onExtraCallbackWithResult(new WebMessageHandlerManager$.ExternalSyntheticLambda1(webViewContentOwner, drawtextbox2, str, str3, jsonObject)));
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
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
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $11 + 9;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (access000 ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access100);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int deadChar = KeyEvent.getDeadChar(i3, i3) + 10;
                        int iIndexOf = 12433 - TextUtils.indexOf((CharSequence) "", '0');
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAxisFromString, deadChar, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.resolveSize(0, 0) + 10, TextUtils.indexOf((CharSequence) "", '0', 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i10 = $11 + 101;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 2 / 4;
                    }
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (Process.myTid() >> 22)), 13 - TextUtils.lastIndexOf("", '0'), 19901 - Gravity.getAbsoluteGravity(0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $11 + 19;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final void onExtraCallbackWithResult(WebViewContentOwner webViewContentOwner, drawTextBox drawtextbox, String str, String str2, JsonObject jsonObject) throws Throwable {
        int i;
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            FragmentActivity activity = webViewContentOwner.getActivity();
            if (activity != null && activity.isFinishing()) {
                return;
            }
            if (!webViewContentOwner.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED)) {
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback = webViewContentOwner.getLifecycle().IAuthTabCallback();
                Object[] objArr = new Object[1];
                a(new char[]{60525, 14340, 26667, 14650, 61442, 49911, 43096, 385, 21108, 17155, 29002, 62421, 40442, 31782, 58736, 51519, 23564, 11695, 21964, 24174, 19642, 59915, 8410, 64587, 43581, 22327, 1031, 45804, 21796, 36995, 20376, 52505, 51091, 15734, 16952, 64280, 1495, 41565, 37387, 18185, 24875, 38869, 56064, 32532, 12330, 58801, 3315, 50384, 1827, 47008, 44492, 31653, 59351, 42361}, (ViewConfiguration.getScrollBarSize() >> 8) + 54, objArr);
                ((String) objArr[0]).intern();
                Objects.toString(onextracallbackIAuthTabCallback);
                return;
            }
            if (drawtextbox.onNavigationEvent()) {
                Bundle bundle = new Bundle();
                Object[] objArr2 = new Object[1];
                b(false, new byte[]{1, 0, 0, 1}, new int[]{0, 4, 0, 3}, objArr2);
                bundle.putString(((String) objArr2[0]).intern(), str);
                Object[] objArr3 = new Object[1];
                a(new char[]{54878, 61415, 5594, 4552, 42582, 56837, 1031, 45804, 9586, 18951, 1244, 5486}, Color.blue(0) + 12, objArr3);
                bundle.putString(((String) objArr3[0]).intern(), str2);
                if (drawtextbox.onExtraCallbackWithResult()) {
                    int i5 = getInterfaceDescriptor + 85;
                    IAuthTabCallbackStubProxy = i5 % 128;
                    if (i5 % 2 == 0) {
                        Object[] objArr4 = new Object[1];
                        b(true, new byte[]{1, 1, 1, 1}, new int[]{4, 4, 0, 1}, objArr4);
                        obj = objArr4[0];
                    } else {
                        Object[] objArr5 = new Object[1];
                        b(false, new byte[]{1, 1, 1, 1}, new int[]{4, 4, 0, 1}, objArr5);
                        obj = objArr5[0];
                    }
                    bundle.putString(((String) obj).intern(), getEmbedViewManager.onNavigationEvent(jsonObject));
                } else {
                    Object[] objArr6 = new Object[1];
                    b(false, new byte[]{1, 1, 1, 1}, new int[]{4, 4, 0, 1}, objArr6);
                    bundle.putString(((String) objArr6[0]).intern(), getEmbedViewManager.onNavigationEvent(onWarmupCompleted.onWarmupCompleted(str, jsonObject)));
                }
                webViewContentOwner.putInstanceStateData(-1, bundle);
            }
            if (drawtextbox instanceof ALCFaceResult) {
                try {
                    i = 11;
                    i2 = 38;
                    try {
                        ((ALCFaceResult) drawtextbox).onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, new setTopGuideBackgroundColor(str, jsonObject, webViewContentOwner, str2, drawtextbox));
                        int i6 = getInterfaceDescriptor + 51;
                        IAuthTabCallbackStubProxy = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        th = th;
                        byte[] bArr = new byte[i];
                        // fill-array-data instruction
                        bArr[0] = 1;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        bArr[3] = 1;
                        bArr[4] = 1;
                        bArr[5] = 0;
                        bArr[6] = 0;
                        bArr[7] = 0;
                        bArr[8] = 0;
                        bArr[9] = 0;
                        bArr[10] = 0;
                        Object[] objArr7 = new Object[1];
                        b(true, bArr, new int[]{i2, i, 138, 0}, objArr7);
                        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), str);
                        byte[] bArr2 = new byte[i];
                        // fill-array-data instruction
                        bArr2[0] = 0;
                        bArr2[1] = 1;
                        bArr2[2] = 1;
                        bArr2[3] = 1;
                        bArr2[4] = 1;
                        bArr2[5] = 0;
                        bArr2[6] = 0;
                        bArr2[7] = 0;
                        bArr2[8] = 0;
                        bArr2[9] = 0;
                        bArr2[10] = 0;
                        Object[] objArr8 = new Object[1];
                        b(true, bArr2, new int[]{49, i, 127, 0}, objArr8);
                        ALCDetectionMode.IAuthTabCallback(th, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr8[0]).intern(), jsonObject)}));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 11;
                    i2 = 38;
                }
            } else if (drawtextbox instanceof ALCFaceQuality) {
                try {
                    ((ALCFaceQuality) drawtextbox).onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, new setTopGuideBackgroundColor(str, jsonObject, webViewContentOwner, str2, drawtextbox));
                } catch (Throwable th3) {
                    Object[] objArr9 = new Object[1];
                    b(true, new byte[]{1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, new int[]{38, 11, 138, 0}, objArr9);
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr9[0]).intern(), str);
                    Object[] objArr10 = new Object[1];
                    b(true, new byte[]{0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, new int[]{49, 11, 127, 0}, objArr10);
                    ALCDetectionMode.IAuthTabCallback(th3, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr10[0]).intern(), jsonObject)}));
                }
            }
        } else {
            webViewContentOwner.getActivity();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final JsonObject onWarmupCompleted(String str, JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject2 = new JsonObject();
        Object[] objArr = new Object[1];
        b(false, new byte[]{1, 0, 0, 1}, new int[]{0, 4, 0, 3}, objArr);
        jsonObject2.addProperty(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a(new char[]{64592, 62249, 14575, 47692, 1881, 9477}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5, objArr2);
        JsonObject jsonObject3 = jsonObject.get(((String) objArr2[0]).intern());
        JsonObject jsonObject4 = jsonObject3 instanceof JsonObject ? jsonObject3 : null;
        if (jsonObject4 != null) {
            Object[] objArr3 = new Object[1];
            a(new char[]{885, 5352, 61687, 28352, 9461, 44955, 12692, 62631}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7, objArr3);
            JsonElement jsonElement = jsonObject4.get(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            b(false, new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 0}, new int[]{8, 9, 88, 5}, objArr4);
            JsonElement jsonElement2 = jsonObject4.get(((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a(new char[]{39809, 4651, 49647, 45363, 2008, 43650, 24317, 56442}, KeyEvent.keyCodeFromString("") + 7, objArr5);
            JsonElement jsonElement3 = jsonObject4.get(((String) objArr5[0]).intern());
            JsonObject jsonObject5 = new JsonObject();
            if (jsonElement != null) {
                String string = jsonElement.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                Object[] objArr6 = new Object[1];
                a(new char[]{885, 5352, 61687, 28352, 9461, 44955, 12692, 62631}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, objArr6);
                String strIntern = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                a(new char[]{23437, 62837}, 1 - (Process.myTid() >> 22), objArr7);
                jsonObject5.addProperty(strIntern, StringsKt.replace$default(string, ((String) objArr7[0]).intern(), "", false, 4, (Object) null));
                int i2 = getInterfaceDescriptor + 51;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            }
            if (jsonElement2 != null) {
                String string2 = jsonElement2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Object[] objArr8 = new Object[1];
                b(false, new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 0}, new int[]{8, 9, 88, 5}, objArr8);
                String strIntern2 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                a(new char[]{23437, 62837}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
                jsonObject5.addProperty(strIntern2, StringsKt.replace$default(string2, ((String) objArr9[0]).intern(), "", false, 4, (Object) null));
            }
            if (jsonElement3 != null) {
                int i4 = getInterfaceDescriptor + 15;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                String string3 = jsonElement3.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                Object[] objArr10 = new Object[1];
                a(new char[]{39809, 4651, 49647, 45363, 2008, 43650, 24317, 56442}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, objArr10);
                String strIntern3 = ((String) objArr10[0]).intern();
                Object[] objArr11 = new Object[1];
                a(new char[]{23437, 62837}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr11);
                jsonObject5.addProperty(strIntern3, StringsKt.replace$default(string3, ((String) objArr11[0]).intern(), "", false, 4, (Object) null));
            }
            Object[] objArr12 = new Object[1];
            a(new char[]{64592, 62249, 14575, 47692, 1881, 9477}, 6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12);
            jsonObject2.add(((String) objArr12[0]).intern(), jsonObject5);
        }
        return jsonObject2;
    }

    public final boolean onExtraCallbackWithResult(@NotNull final WebViewContentOwner webViewContentOwner, final int i, final int i2, @Nullable final Intent intent) throws Throwable {
        Bundle extras;
        Object obj;
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        if (intent != null) {
            int i6 = IAuthTabCallbackStubProxy + 25;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                intent.getExtras();
                throw null;
            }
            extras = intent.getExtras();
        } else {
            int i7 = getInterfaceDescriptor + 43;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            extras = null;
        }
        Parcelable instanceStateData = webViewContentOwner.getInstanceStateData(-1);
        Bundle bundle = instanceStateData instanceof Bundle ? (Bundle) instanceStateData : null;
        if (bundle == null) {
            return false;
        }
        int i9 = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i9 % 128;
        int i10 = i9 % 2;
        Object[] objArr = new Object[1];
        b(false, new byte[]{1, 0, 0, 1}, new int[]{0, 4, 0, 3}, objArr);
        final String string = bundle.getString(((String) objArr[0]).intern());
        if (string == null) {
            int i11 = getInterfaceDescriptor;
            int i12 = i11 + 43;
            IAuthTabCallbackStubProxy = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 121;
            IAuthTabCallbackStubProxy = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{54878, 61415, 5594, 4552, 42582, 56837, 1031, 45804, 9586, 18951, 1244, 5486}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11, objArr2);
        final String string2 = bundle.getString(((String) objArr2[0]).intern());
        if (string2 == null) {
            return false;
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            Object[] objArr3 = new Object[1];
            b(false, new byte[]{1, 1, 1, 1}, new int[]{4, 4, 0, 1}, objArr3);
            obj = kotlin.Result.constructor-impl(JsonParser.parseString(bundle.getString(((String) objArr3[0]).intern())).getAsJsonObject());
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            obj = null;
        }
        final JsonObject jsonObject = (JsonObject) obj;
        if (jsonObject == null) {
            int i16 = getInterfaceDescriptor + 25;
            IAuthTabCallbackStubProxy = i16 % 128;
            return i16 % 2 == 0;
        }
        final drawTextBox drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{asInterface, string, false, 2, null}, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$$ExternalSyntheticLambda9.IAuthTabCallback());
        if (drawtextbox == null) {
            Object[] objArr4 = new Object[1];
            b(false, new byte[]{1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, new int[]{169, 36, 119, 0}, objArr4);
            ((String) objArr4[0]).intern();
            return false;
        }
        new Object[]{string, Integer.valueOf(i), Integer.valueOf(i2), extras};
        ExpandableListView.getPackedPositionGroup(0L);
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView != null) {
            webView.post(new Runnable() { // from class: im.toss.core.webkit.WebMessageHandlerManager$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallback + 31;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    setTopGuideText.onExtraCallback(webViewContentOwner, string, jsonObject, string2, drawtextbox, i, i2, intent);
                    if (i19 == 0) {
                        throw null;
                    }
                    int i20 = onWarmupCompleted + 83;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                }
            });
        }
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[0];
        String str = (String) objArr[1];
        JsonObject jsonObject = (JsonObject) objArr[2];
        String str2 = (String) objArr[3];
        drawTextBox drawtextbox = (drawTextBox) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        Intent intent = (Intent) objArr[7];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = webViewContentOwner.getActivity();
        if (activity != null && activity.isFinishing()) {
            return null;
        }
        setTopGuideBackgroundColor settopguidebackgroundcolorOnWarmupCompleted = setTopGuideBackgroundColor.Companion.onWarmupCompleted(str, jsonObject, webViewContentOwner, str2, drawtextbox);
        if (!(drawtextbox instanceof ALCFaceResult)) {
            if (drawtextbox instanceof ALCFaceQuality) {
                int i4 = getInterfaceDescriptor + 115;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    ((ALCFaceQuality) drawtextbox).onWarmupCompleted(webViewContentOwner, str, jsonObject, settopguidebackgroundcolorOnWarmupCompleted, iIntValue, iIntValue2, intent);
                    int i5 = 85 / 0;
                } else {
                    ((ALCFaceQuality) drawtextbox).onWarmupCompleted(webViewContentOwner, str, jsonObject, settopguidebackgroundcolorOnWarmupCompleted, iIntValue, iIntValue2, intent);
                }
                int i6 = IAuthTabCallbackStubProxy + 105;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
            }
            return null;
        }
        int i8 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
        ((ALCFaceResult) drawtextbox).onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolorOnWarmupCompleted, iIntValue, iIntValue2, intent);
        return null;
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = IAuthTabCallback_Parcel;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.resolveSizeAndState(i3, i3, i3)), 35 - Drawable.resolveOpacity(i3, i3), 14240 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                    j = 0;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10935), ExpandableListView.getPackedPositionGroup(0L) + 65, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') - 19, 17657 - TextUtils.indexOf("", "", 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49466), 70 - Color.alpha(0), 12487 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i11, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i5) {
                    break;
                }
                int i12 = $11 + 119;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i5 >> trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent / 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i13 = $11 + 35;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 0;
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i15;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i5) {
                    break;
                }
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final void onNavigationEvent(WebViewContentOwner webViewContentOwner, String str, JsonObject jsonObject, String str2, drawTextBox drawtextbox, int i, int i2, Intent intent) {
        onWarmupCompleted(-1175343880, new Object[]{webViewContentOwner, str, jsonObject, str2, drawtextbox, Integer.valueOf(i), Integer.valueOf(i2), intent}, 1175343880, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
    }

    public final void IAuthTabCallback(@NotNull ALCOcclusion aLCOcclusion) {
        onWarmupCompleted(375967420, new Object[]{this, aLCOcclusion}, -375967419, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = (char) 720;
        asBinder = (char) 36958;
        access000 = (char) 22836;
        access100 = (char) 4847;
        IAuthTabCallback_Parcel = new char[]{27262, 27177, 27175, 27175, 27262, 27180, 27180, 27172, 27155, 27381, 27378, 27274, 27269, 27271, 27272, 27382, 27378, 27178, 27266, 27267, 27268, 27265, 27294, 27267, 27267, 27271, 27371, 27365, 27294, 27368, 27360, 27286, 27294, 27295, 27295, 27294, 27267, 27274, 27193, 27325, 27327, 27311, 27309, 27326, 27296, 27322, 27315, 27320, 27325, 27198, 27303, 27303, 27295, 27293, 27307, 27309, 27303, 27324, 27301, 27302, 27260, 27172, 27194, 27192, 27260, 27168, 27170, 27196, 27303, 27298, 27166, 27364, 27391, 27390, 27367, 27369, 27361, 27372, 27375, 27363, 27260, 27183, 27173, 27168, 27181, 27170, 27169, 27177, 27168, 27173, 27178, 27262, 27174, 27198, 27175, 27172, 27171, 27176, 27179, 27176, 27180, 27176, 27168, 27199, 27175, 27180, 27172, 27196, 27199, 27175, 27339, 27464, 27296, 27319, 27479, 27327, 27277, 27281, 27313, 27465, 27465, 27298, 27319, 27479, 27297, 27307, 27471, 27466, 27464, 27467, 27467, 27306, 27279, 27306, 27461, 27315, 27318, 27471, 27471, 27466, 27458, 27460, 27320, 27320, 27463, 27486, 27465, 27471, 27469, 27281, 27306, 27466, 27175, 27176, 27198, 27168, 27175, 27176, 27172, 27199, 27324, 27297, 27321, 27320, 27324, 27301, 27297, 27306, 27304, 27137, 27274, 27304, 27311, 27309, 27277, 27349, 27376, 27307, 27264, 27271, 27308, 27307, 27304, 27304, 27307, 27299, 27282, 27292, 27309, 27301, 27305, 27305, 27284, 27292, 27285, 27285, 27280, 27304, 27306, 27383, 27376, 27280, 27280, 27310, 27270};
    }
}
