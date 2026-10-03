package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.edoc.register.AptPasswordActivity$;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.genSignatureValueWithDigest;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$;
import viva.republica.toss.password.BankPasswordActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getGivenName extends getSemanticsIdentifier {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int newAuthTabSession = 0;
    private static int newSessionWithExtras = 1;
    private static char[] extraCommand = {65010, 65012, 64961, 65014, 64996, 65015, 64986, 64990, 64968, 64993, 65004, 64973, 64992, 64989, 64983, 64982, 64960, 64925, 64972, 65009, 64970, 64965, 65018, 64971, 64974, 65021, 64975, 64995, 64988, 64969, 65020, 64978, 65016, 65013, 64991, 64967};
    private static char newSession = 51247;
    private static int[] postMessage = {-377577808, 216067271, 520859290, -1797780955, 1352237439, 2070007247, 1244705709, -1334113475, 1192496287, -709894904, 167756387, -619726604, 830414463, -240375707, 975226573, 234064988, -1618932680, 1663920424};

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 101;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i4 = newAuthTabSession + 125;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newAuthTabSession + 33;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = newAuthTabSession + 37;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return null;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 121;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallback = onExtraCallback(bundle);
        int i4 = newSessionWithExtras + 15;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 97;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(settopguidebackgroundcolor, th);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(settopguidebackgroundcolor, th);
        int i3 = newAuthTabSession + 37;
        newSessionWithExtras = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 115;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(settopguidebackgroundcolor, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settopguidebackgroundcolor, str);
        int i3 = newSessionWithExtras + 73;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~i4) | i8;
        int i10 = ~(i4 | i8);
        int i11 = i + i3 + i6 + ((-714989572) * i5) + (1142003473 * i2);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i) - 1983905792) + (1136689320 * i3) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i6) + ((-1891631104) * i5) + ((-1355808768) * i2) + ((-1882259456) * i12);
        int i14 = (i * (-1158907614)) + 1427560840 + (i3 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i6 * (-1158906635)) + (i5 * 1387703340) + (i2 * 1202573125) + (i12 * (-451215360));
        int i15 = i13 + (i14 * i14 * (-310837248));
        if (i15 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i15 != 2) {
            return onExtraCallback(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i16 = 2 % 2;
        int i17 = newSessionWithExtras + 29;
        newAuthTabSession = i17 % 128;
        int i18 = i17 % 2;
        asInterface(function1, obj);
        int i19 = newSessionWithExtras + 37;
        newAuthTabSession = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(WebViewContentOwner webViewContentOwner, FragmentActivity fragmentActivity, String str, setTopGuideBackgroundColor settopguidebackgroundcolor, String str2, List list) throws Throwable {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 39;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(webViewContentOwner, fragmentActivity, str, settopguidebackgroundcolor, str2, list);
        }
        IAuthTabCallback(webViewContentOwner, fragmentActivity, str, settopguidebackgroundcolor, str2, list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 115;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(settopguidebackgroundcolor, th);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(settopguidebackgroundcolor, th);
        int i3 = newSessionWithExtras + 1;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 121;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onWarmupCompleted(1052006159, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1052006158, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, obj});
        int i4 = newAuthTabSession + 107;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.getSemanticsIdentifier
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = newSessionWithExtras;
        int i3 = i2 + 13;
        newAuthTabSession = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        newAuthTabSession = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 67;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newSessionWithExtras + 81;
        newAuthTabSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(WebViewContentOwner webViewContentOwner, FragmentActivity fragmentActivity, String str, setTopGuideBackgroundColor settopguidebackgroundcolor, String str2, List list) throws Throwable {
        Object next;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        int i2 = newSessionWithExtras + 5;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((RSASSAPSSparams) next).IAuthTabCallback(), str2)) {
                int i4 = newSessionWithExtras + 39;
                newAuthTabSession = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 13 / 0;
                }
            }
        }
        RSASSAPSSparams rSASSAPSSparams = (RSASSAPSSparams) next;
        String strOnExtraCallback = rSASSAPSSparams != null ? rSASSAPSSparams.onExtraCallback() : null;
        String str4 = strOnExtraCallback == null ? "" : strOnExtraCallback;
        String strIAuthTabCallbackDefault = rSASSAPSSparams != null ? rSASSAPSSparams.IAuthTabCallbackDefault() : null;
        if (strIAuthTabCallbackDefault == null) {
            int i6 = newSessionWithExtras + 7;
            newAuthTabSession = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 58 / 0;
            }
            str3 = "";
        } else {
            str3 = strIAuthTabCallbackDefault;
        }
        if (str4.length() <= 0 || str3.length() <= 0) {
            Object[] objArr = new Object[1];
            c((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 82), 16 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{19, 16, 19, '!', 30, '\n', 15, 26, ' ', 1, 1, '\r', 17, '!', 14, 3}, objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
        } else {
            int i8 = newSessionWithExtras + 103;
            newAuthTabSession = i8 % 128;
            int i9 = i8 % 2;
            BankPasswordActivity.onWarmupCompleted onwarmupcompleted = BankPasswordActivity.Companion;
            Object[] objArr2 = new Object[1];
            d(new int[]{148939974, -1775575313, -190739375, 364400125, -1208078838, 1610123421, -1317690767, 104195373}, 15 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            PageAnimStore.onWarmupCompleted(webViewContentOwner, BankPasswordActivity.onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted, fragmentActivity, str4, str3, (String) null, str, (String) null, 0L, ((String) objArr2[0]).intern(), (HashMap) null, false, false, 1896, (Object) null), 1, (Bundle) null, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 69;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newAuthTabSession + 13;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 75;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, th.getMessage(), (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = newAuthTabSession + 109;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        FragmentActivity activity;
        int i = 2 % 2;
        int i2 = newAuthTabSession + 69;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            activity = webViewContentOwner.getActivity();
            int i3 = 37 / 0;
            if (activity == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            activity = webViewContentOwner.getActivity();
            if (activity == null) {
                return;
            }
        }
        FragmentActivity fragmentActivity = activity;
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        d(new int[]{250146922, -34165685, -489063684, 328318413}, (ViewConfiguration.getTapTimeout() >> 16) + 6, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        d(new int[]{1180960205, 1728791752, -1833731212, 251693190}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        if (strOnNavigationEvent2.length() == 0) {
            strOnNavigationEvent2 = fragmentActivity.getString(R.string.app_common_web_message_handlers_cascraping___342fb3e275);
            Intrinsics.checkNotNullExpressionValue(strOnNavigationEvent2, "");
            int i4 = newAuthTabSession + 27;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = genSignatureValueWithDigest.onExtraCallbackWithResult.onWarmupCompleted.IAuthTabCallback().IAuthTabCallback(NetConverter3.onExtraCallback()).onNavigationEvent(new CheckCertificateMessageHandler$.ExternalSyntheticLambda1(new CheckCertificateMessageHandler$.ExternalSyntheticLambda0(webViewContentOwner, fragmentActivity, strOnNavigationEvent2, settopguidebackgroundcolor, strOnNavigationEvent)), new CheckCertificateMessageHandler$.ExternalSyntheticLambda3(new CheckCertificateMessageHandler$.ExternalSyntheticLambda2(settopguidebackgroundcolor)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, webViewContentOwner);
    }

    private static final String onExtraCallback(Bundle bundle) throws Throwable {
        String string;
        Object obj;
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 5;
        newAuthTabSession = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1451190375);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (Process.myTid() >> 22) + 22, 6883 - TextUtils.getOffsetAfter("", 0), 1732220663, false, "onExtraCallback", (Class[]) null);
            }
            ((Field) objOnExtraCallback).get(null);
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, (-16752329) - Color.rgb(0, 0, 0), -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            ((Field) objOnExtraCallback2).get(null);
            obj2.hashCode();
            throw null;
        }
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1451190375);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 21 - TextUtils.indexOf((CharSequence) "", '0'), 6883 - ExpandableListView.getPackedPositionGroup(0L), 1732220663, false, "onExtraCallback", (Class[]) null);
        }
        Object obj3 = ((Field) objOnExtraCallback3).get(null);
        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
        if (objOnExtraCallback4 == null) {
            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 29 - Process.getGidForName(""), 24887 - (ViewConfiguration.getScrollBarSize() >> 8), -265239605, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj4 = ((Field) objOnExtraCallback4).get(null);
        if (bundle != null) {
            int i3 = newSessionWithExtras + 39;
            newAuthTabSession = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                c((byte) (93 - ExpandableListView.getPackedPositionType(1L)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) * 101, new char[]{'\"', 29, 13898, 13898, '\f', 11, 17, 31, 16, 14, 5, 23, 17, 21, ' ', 5, '#', '\r', 18, 1, 26, 31, '\t', 28, 6, 18, 16, 0, '!', 6, 13887}, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                c((byte) (97 - ExpandableListView.getPackedPositionType(0L)), 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{'\"', 29, 13898, 13898, '\f', 11, 17, 31, 16, 14, 5, 23, 17, 21, ' ', 5, '#', '\r', 18, 1, 26, 31, '\t', 28, 6, 18, 16, 0, '!', 6, 13887}, objArr2);
                obj = objArr2[0];
            }
            string = bundle.getString(((String) obj).intern(), "");
        } else {
            int i4 = newAuthTabSession + 5;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
            string = null;
        }
        if (string == null) {
            int i6 = newSessionWithExtras + 3;
            newAuthTabSession = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            string = "";
        }
        try {
            Object[] objArr3 = {string};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1484186951);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 30 - View.MeasureSpec.getMode(0), 24887 - (ViewConfiguration.getLongPressTimeout() >> 16), 1765153751, false, "onNavigationEvent", new Class[]{String.class});
            }
            Object[] objArr4 = {((Method) objOnExtraCallback5).invoke(obj4, objArr3)};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1944146761);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, TextUtils.getTrimmedLength("") + 6883, -1117892057, false, "IAuthTabCallback", new Class[]{String.class});
            }
            return (String) ((Method) objOnExtraCallback6).invoke(obj3, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 93;
        newAuthTabSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newSessionWithExtras + 19;
        newAuthTabSession = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 81;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = newAuthTabSession + 65;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, String str) throws Throwable {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        d(new int[]{1932894260, -138215988, -1171132497, -1649673229}, 6 - Color.argb(0, 0, 0, 0), objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), str);
        ALCFaceBox.onWarmupCompleted(settopguidebackgroundcolor, jsonObject);
        Unit unit = Unit.INSTANCE;
        int i2 = newSessionWithExtras + 119;
        newAuthTabSession = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = newAuthTabSession + 7;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, th.getMessage(), (String) null, (Map) null, 116, (Object) null);
        } else {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, th.getMessage(), (String) null, (Map) null, 6, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = newSessionWithExtras + 121;
        newAuthTabSession = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // o.getSemanticsIdentifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNavigationEvent(@org.jetbrains.annotations.NotNull im.toss.core.webkit.WebViewContentOwner r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r8, @org.jetbrains.annotations.NotNull final o.setTopGuideBackgroundColor r9, int r10, int r11, @org.jetbrains.annotations.Nullable final android.os.Bundle r12) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getGivenName.newAuthTabSession
            int r1 = r1 + 121
            int r2 = r1 % 128
            o.getGivenName.newSessionWithExtras = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            if (r1 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            if (r10 != r3) goto L9f
            goto L2f
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            if (r10 != r3) goto L9f
        L2f:
            int r7 = o.getGivenName.newSessionWithExtras
            int r7 = r7 + 31
            int r8 = r7 % 128
            o.getGivenName.newAuthTabSession = r8
            int r7 = r7 % r0
            if (r7 != 0) goto L9b
            r7 = -1
            if (r11 != r7) goto L75
            viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda4 r7 = new viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda4
            r7.<init>()
            o.writeRaw r7 = o.writeRaw.onNavigationEvent(r7)
            o.MapConverter r8 = o.clearTid.onNavigationEvent()
            o.writeRaw r7 = r7.onNavigationEvent(r8)
            o.MapConverter r8 = o.NetConverter3.onExtraCallback()
            o.writeRaw r7 = r7.IAuthTabCallback(r8)
            viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda6 r8 = new viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda6
            viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda5 r10 = new viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda5
            r10.<init>()
            r8.<init>()
            viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda7 r10 = new viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda7
            r10.<init>()
            viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda8 r9 = new viva.republica.toss.common.web.message.handlers.cascraping.CheckCertificateMessageHandler$$ExternalSyntheticLambda8
            r9.<init>()
            o.deserializeUriNullableCollection r7 = r7.onNavigationEvent(r8, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            o.IconRoundCornerProgressBarSavedState.IAuthTabCallback(r7, r6)
            return
        L75:
            r6 = 6
            int[] r6 = new int[r6]
            r6 = {x00ac: FILL_ARRAY_DATA , data: [2099763601, 2050307914, 1005954820, -2010070984, 1724742096, -1624652655} // fill-array
            r7 = 0
            int r7 = android.widget.ExpandableListView.getPackedPositionChild(r7)
            int r7 = 9 - r7
            java.lang.Object[] r8 = new java.lang.Object[r3]
            d(r6, r7, r8)
            r6 = 0
            r6 = r8[r6]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r6.intern()
            r6 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r9
            r9 = r6
            o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r7, r8, r9, r10, r11, r12)
            goto L9f
        L9b:
            r2.hashCode()
            throw r2
        L9f:
            int r6 = o.getGivenName.newSessionWithExtras
            int r6 = r6 + 87
            int r7 = r6 % 128
            o.getGivenName.newAuthTabSession = r7
            int r6 = r6 % r0
            if (r6 != 0) goto Lab
            return
        Lab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getGivenName.onNavigationEvent(im.toss.core.webkit.WebViewContentOwner, java.lang.String, com.google.gson.JsonObject, o.setTopGuideBackgroundColor, int, int, android.os.Bundle):void");
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = postMessage;
        int i4 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 89;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 72 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = postMessage;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i8])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 73, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i8++;
                i4 = -1469660336;
                j = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i9 = $11 + 63;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 % 3;
            }
            for (int i11 = 0; i11 < 16; i11++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionType(0L)), 39 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 78 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 7398 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r33, int r34, char[] r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getGivenName.c(byte, int, char[], java.lang.Object[]):void");
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onWarmupCompleted(331753324, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -331753324, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, obj});
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onWarmupCompleted(-101032193, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 101032195, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, obj});
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onWarmupCompleted(1052006159, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1052006158, iOnWarmupCompleted, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{function1, obj});
    }
}
