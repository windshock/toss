package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.FileProvider;
import com.google.gson.JsonObject;
import im.toss.base.BaseActivity;
import im.toss.utils.RxUtils;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;
import viva.republica.toss.common.web.message.handlers.ShareToSNSHandler$;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class X509Extension implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 49917;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 33834;
    private static char onExtraCallbackWithResult = 8699;
    private static char onNavigationEvent = 47695;
    private static char[] onWarmupCompleted = {64983, 65065, 64980, 64963, 65068, 64967, 65057, 64991, 64960, 64993, 64961, 65069, 64978, 65015, 64976, 64981, 64986, 65066, 65071, 64999, 64953, 64965, 64905, 64985, 65009, 65067, 65070, 64966, 65064, 64987, 64982, 64927, 64977, 64989, 64915, 64988};
    private static char asInterface = 51247;

    public static /* synthetic */ Unit onExtraCallback(X509Extension x509Extension, BaseActivity baseActivity, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(new Object[]{x509Extension, baseActivity, list, str, str2, str3, str4, str5, str6, str7, str8, str9, setonoutofmemeryerrorcallback, uri}, -1938328960, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1938328960, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent2);
        int i3 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(setonoutofmemeryerrorcallback, dialogInterface);
        int i4 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Uri uriIAuthTabCallback = IAuthTabCallback(context, str);
        int i4 = IAuthTabCallbackStub + 21;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return uriIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(th);
        int i4 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i7 | i3;
        int i9 = (~i8) | (~(i7 | i6));
        int i10 = (~((~i6) | i7 | (~i3))) | (~(i | i3));
        int i11 = i + i3 + i4 + ((-540997959) * i5) + (162607451 * i2);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i) + 1723858944 + (1667710703 * i3) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i4) + ((-672137216) * i5) + (483393536 * i2) + (377683968 * i12);
        int i14 = (i * 228155117) + 240245784 + (i3 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i4 * 228155391) + (i5 * (-329950905)) + (i2 * (-2026639707)) + (i12 * 159186944);
        int i15 = i13 + (i14 * i14 * (-1451425792));
        return i15 != 1 ? i15 != 2 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(BaseActivity baseActivity, X509Extension x509Extension, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(baseActivity, x509Extension, list, str, str2, str3, str4, str5, str6, str7, str8, str9, setonoutofmemeryerrorcallback);
        if (i3 == 0) {
            throw null;
        }
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 59;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 39 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        int i4 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    private static final void IAuthTabCallback(BaseActivity baseActivity, X509Extension x509Extension, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (baseActivity.isFinishing()) {
            return;
        }
        x509Extension.IAuthTabCallback(baseActivity, (List<? extends MessageQueueThreadSpec>) list, str, str2, str3, str4, str5, (Uri) null, str6, str7, str8, str9, setonoutofmemeryerrorcallback);
        int i4 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        X509Extension x509Extension = (X509Extension) objArr[0];
        BaseActivity baseActivity = (BaseActivity) objArr[1];
        List<? extends MessageQueueThreadSpec> list = (List) objArr[2];
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        String str3 = (String) objArr[5];
        String str4 = (String) objArr[6];
        String str5 = (String) objArr[7];
        String str6 = (String) objArr[8];
        String str7 = (String) objArr[9];
        String str8 = (String) objArr[10];
        String str9 = (String) objArr[11];
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[12];
        Uri uri = (Uri) objArr[13];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            x509Extension.IAuthTabCallback(baseActivity, list, str, str2, str3, str4, str5, uri, str6, str7, str8, str9, setonoutofmemeryerrorcallback);
            return Unit.INSTANCE;
        }
        x509Extension.IAuthTabCallback(baseActivity, list, str, str2, str3, str4, str5, uri, str6, str7, str8, str9, setonoutofmemeryerrorcallback);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        BaseActivity baseActivity;
        String str2;
        String str3;
        MessageQueueThreadSpec messageQueueThreadSpec;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        BaseActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity instanceof BaseActivity) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 51;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            baseActivity = activity;
            int i5 = i2 + 125;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        Object[] objArr = new Object[1];
        b((byte) (Color.red(0) + 11), TextUtils.getOffsetAfter("", 0) + 16, new char[]{11, 26, 16, 6, 31, '\f', 17, '\r', 11, 31, 1, 20, 17, 4, 6, 31}, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b((byte) (54 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 11 - TextUtils.getOffsetAfter("", 0), new char[]{24, '#', 18, 6, '\"', 6, 22, '\r', 1, 11, 13876}, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        a(new char[]{16953, 35496, 55121, 58071, 4907, 32787, 20546, 8175}, KeyEvent.getDeadChar(0, 0) + 8, objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 50), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{13799}, objArr4);
        List<String> listSplit$default = StringsKt.split$default(strOnNavigationEvent3, new String[]{((String) objArr4[0]).intern()}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (String str4 : listSplit$default) {
            int i7 = IAuthTabCallbackDefault + 121;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            MessageQueueThreadSpec[] messageQueueThreadSpecArrValues = MessageQueueThreadSpec.values();
            int length = messageQueueThreadSpecArrValues.length;
            int i9 = IAuthTabCallbackStub + 45;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    messageQueueThreadSpec = null;
                    break;
                }
                messageQueueThreadSpec = messageQueueThreadSpecArrValues[i11];
                if (Intrinsics.areEqual(accessgetMAIN_UI_SPECcp.onWarmupCompleted(messageQueueThreadSpec).getId(), str4)) {
                    break;
                }
                int i12 = IAuthTabCallbackStub + 77;
                IAuthTabCallbackDefault = i12 % 128;
                i11 = i12 % 2 != 0 ? i11 + 24 : i11 + 1;
            }
            if (messageQueueThreadSpec != null) {
                arrayList.add(messageQueueThreadSpec);
            }
        }
        Object[] objArr5 = new Object[1];
        b((byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{'\t', 26, '#', 20, ' ', '\f', 13806}, objArr5);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        Object[] objArr6 = new Object[1];
        a(new char[]{2393, 8158, 9721, 43506, 39724, 9572, 64373, 37632}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, objArr6);
        String strOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr6[0]).intern(), "");
        Object[] objArr7 = new Object[1];
        b((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 66), 3 - View.MeasureSpec.getMode(0), new char[]{28, '\t', 13880}, objArr7);
        String strOnNavigationEvent6 = settext.onNavigationEvent(((String) objArr7[0]).intern(), "");
        Object[] objArr8 = new Object[1];
        a(new char[]{2485, 6134, 10162, 34696, 32090, 34429, 11439, 52585, 13761, 32094, 11439, 52585, 30068, 26043, 64373, 37632}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr8);
        String strOnNavigationEvent7 = settext.onNavigationEvent(((String) objArr8[0]).intern(), "");
        Object[] objArr9 = new Object[1];
        a(new char[]{28345, 54516, 39724, 9572, 7388, 46908, 55475, 39905, 4468, 8858}, 9 - TextUtils.indexOf("", ""), objArr9);
        String strOnNavigationEvent8 = settext.onNavigationEvent(((String) objArr9[0]).intern(), "");
        Object[] objArr10 = new Object[1];
        a(new char[]{11439, 52585, 13761, 32094, 28863, 7138, 64115, 28653}, ((Process.getThreadPriority(0) + 20) >> 6) + 8, objArr10);
        String strOnNavigationEvent9 = settext.onNavigationEvent(((String) objArr10[0]).intern(), "");
        String str5 = strOnNavigationEvent9.length() <= 0 ? null : strOnNavigationEvent9;
        Object[] objArr11 = new Object[1];
        b((byte) (84 - (Process.myPid() >> 22)), ((Process.getThreadPriority(0) + 20) >> 6) + 15, new char[]{6, ' ', '\t', 22, 17, 15, '!', 6, '!', '\f', '\"', 6, 6, '\"', 13884}, objArr11);
        String strOnNavigationEvent10 = settext.onNavigationEvent(((String) objArr11[0]).intern(), "");
        if (strOnNavigationEvent10.length() <= 0) {
            int i13 = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i13 % 128;
            int i14 = i13 % 2;
            str2 = null;
        } else {
            str2 = strOnNavigationEvent10;
        }
        Object[] objArr12 = new Object[1];
        b((byte) (8 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, new char[]{6, '\"', '\f', '!', 13808, 13808, '\"', 6, 25, 28, 13814, 13814, 30, '\"'}, objArr12);
        String strOnNavigationEvent11 = settext.onNavigationEvent(((String) objArr12[0]).intern(), "");
        if (strOnNavigationEvent11.length() <= 0) {
            int i15 = IAuthTabCallbackDefault + 111;
            IAuthTabCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            str3 = null;
        } else {
            str3 = strOnNavigationEvent11;
        }
        if (strOnNavigationEvent8.length() == 0) {
            baseActivity.runOnUiThread(new ShareToSNSHandler$.ExternalSyntheticLambda2(baseActivity, this, arrayList, strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent4, strOnNavigationEvent5, strOnNavigationEvent6, strOnNavigationEvent7, str5, str2, str3, setonoutofmemeryerrorcallback));
            return;
        }
        writeRaw writerawIAuthTabCallback = onExtraCallback((Context) baseActivity, strOnNavigationEvent8).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new ShareToSNSHandler$.ExternalSyntheticLambda4(new ShareToSNSHandler$.ExternalSyntheticLambda3(this, baseActivity, arrayList, strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent4, strOnNavigationEvent5, strOnNavigationEvent6, strOnNavigationEvent7, str5, str2, str3, setonoutofmemeryerrorcallback)), new ShareToSNSHandler$.ExternalSyntheticLambda6(new ShareToSNSHandler$.ExternalSyntheticLambda5()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 83;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 5;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 10;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, packedPositionType, fadingEdgeLength, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Color.red(0) + 10, 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 16014), 14 - TextUtils.getCapsMode("", 0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 39;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, DialogInterface dialogInterface) throws Throwable {
        String strIntern;
        String str;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            b((byte) ((ViewConfiguration.getScrollBarSize() >>> 111) * 25), 107 >>> TextUtils.indexOf((CharSequence) "", '(', 1), new char[]{15, '\r', ' ', 15, 31, 6, 6, 31, 13937}, objArr);
            strIntern = ((String) objArr[0]).intern();
            str = null;
            map = null;
            i = 82;
        } else {
            Object[] objArr2 = new Object[1];
            b((byte) (115 - (ViewConfiguration.getScrollBarSize() >> 8)), 8 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{15, '\r', ' ', 15, 31, 6, 6, 31, 13937}, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            str = null;
            map = null;
            i = 6;
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, str, map, i, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(im.toss.base.BaseActivity r28, java.util.List<? extends o.MessageQueueThreadSpec> r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, android.net.Uri r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, o.setOnOutOfMemeryErrorCallback r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X509Extension.IAuthTabCallback(im.toss.base.BaseActivity, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.setOnOutOfMemeryErrorCallback):void");
    }

    private final writeRaw<Uri> onExtraCallback(Context context, String str) {
        int i = 2 % 2;
        writeRaw<Uri> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new ShareToSNSHandler$.ExternalSyntheticLambda1(context, str));
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return writerawOnNavigationEvent;
    }

    private static final Uri IAuthTabCallback(Context context, String str) throws Throwable {
        int i = 2 % 2;
        File cacheDir = context.getCacheDir();
        Object[] objArr = new Object[1];
        a(new char[]{28345, 54516, 39724, 9572, 20546, 8175}, View.getDefaultSize(0, 0) + 6, objArr);
        File file = new File(cacheDir, ((String) objArr[0]).intern());
        file.mkdirs();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(new char[]{23630, 57103, 9721, 43506, 1059, 24780, 12017, 24061, 6587, 45508, 19735, 25314, 61847, 54435, 53125, 51669}, 15 - Color.argb(0, 0, 0, 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(jCurrentTimeMillis);
        Object[] objArr3 = new Object[1];
        a(new char[]{31601, 41847, 51319, 5598}, Color.red(0) + 4, objArr3);
        sb.append(((String) objArr3[0]).intern());
        File file2 = new File(file, sb.toString());
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Cookies_clearByName.onWarmupCompleted(Base64.decode(bytes, 0), file2);
        Uri uriForFile = FileProvider.getUriForFile(context, zzaj.onNavigationEvent().onUnminimized(), file2);
        int i2 = IAuthTabCallbackDefault + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return uriForFile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Color.red(0) + 26, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.lastIndexOf("", '0', 0, 0) + 75, ImageFormat.getBitsPerPixel(0) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i5 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i5];
                        int i6 = $11 + 107;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i8 = $10 + 19;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            int i14 = $11 + 103;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $10 + 107;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 24753);
                i16 += 40;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        onWarmupCompleted(new Object[]{function1, obj}, -1523736858, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1523736860, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent);
    }

    public static /* synthetic */ Uri onNavigationEvent(Context context, String str) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Uri) onWarmupCompleted(new Object[]{context, str}, 1790631494, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1790631493, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(X509Extension x509Extension, BaseActivity baseActivity, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Uri uri) {
        Object[] objArr = {x509Extension, baseActivity, list, str, str2, str3, str4, str5, str6, str7, str8, str9, setonoutofmemeryerrorcallback, uri};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onWarmupCompleted(objArr, -1938328960, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1938328960, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent);
    }
}
