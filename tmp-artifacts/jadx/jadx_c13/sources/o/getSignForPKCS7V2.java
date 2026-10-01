package o;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.getSignForPKCS7V2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7V2 {
    public static final getSignForPKCS7V2 onWarmupCompleted = new getSignForPKCS7V2();
    private static final Lazy onNavigationEvent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: util.BankInfoUtil$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return getSignForPKCS7V2.onNavigationEvent();
        }
    });
    public static final int onExtraCallbackWithResult = 8;

    private getSignForPKCS7V2() {
    }

    public final send onExtraCallbackWithResult() {
        return (send) onNavigationEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final send onNavigationEvent() {
        return send.Companion.onWarmupCompleted();
    }

    public final String IAuthTabCallback(@NotNull String str) {
        NavigationBarCompat navigationBarCompatOnNavigationEvent;
        List listOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(str, "");
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = onExtraCallbackWithResult().onExtraCallback(str);
        if (checknavigationbarbysystempropertiesOnExtraCallback == null || (navigationBarCompatOnNavigationEvent = checknavigationbarbysystempropertiesOnExtraCallback.onNavigationEvent()) == null || (listOnExtraCallbackWithResult = navigationBarCompatOnNavigationEvent.onExtraCallbackWithResult()) == null) {
            return null;
        }
        return (String) CollectionsKt___CollectionsKt.firstOrNull(listOnExtraCallbackWithResult);
    }

    public final String onWarmupCompleted(@NotNull Context context, @NotNull String str) {
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback;
        NavigationBarCompat navigationBarCompatOnNavigationEvent;
        List listBT_;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (!onWarmupCompleted(str) || (checknavigationbarbysystempropertiesOnExtraCallback = onExtraCallbackWithResult().onExtraCallback(str)) == null || (navigationBarCompatOnNavigationEvent = checknavigationbarbysystempropertiesOnExtraCallback.onNavigationEvent()) == null || (listBT_ = navigationBarCompatOnNavigationEvent.bT_()) == null) {
            return null;
        }
        Iterator it = listBT_.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallbackWithResult(context, (String) next)) {
                obj = next;
                break;
            }
        }
        return (String) obj;
    }

    @JvmStatic
    public static final String onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return onExtraCallback(str, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    @JvmStatic
    public static final String onExtraCallback(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = onWarmupCompleted.onExtraCallbackWithResult().onExtraCallback(str);
        if (checknavigationbarbysystempropertiesOnExtraCallback == null) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return checknavigationbarbysystempropertiesOnExtraCallback.onActivityLayout() ? str2 : checknavigationbarbysystempropertiesOnExtraCallback.access000();
    }

    public final String asBinder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = onExtraCallbackWithResult().onExtraCallback(str);
        return (checknavigationbarbysystempropertiesOnExtraCallback == null || checknavigationbarbysystempropertiesOnExtraCallback.onActivityLayout()) ? _UrlKt.FRAGMENT_ENCODE_SET : checknavigationbarbysystempropertiesOnExtraCallback.IAuthTabCallbackStubProxy();
    }

    @JvmStatic
    public static final boolean onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !TextUtils.isEmpty(str) && Integer.parseInt(str) > 0;
    }

    public final String IAuthTabCallbackStub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case -1185226400:
                if (!lowerCase.equals("imbank")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.DAEGU.getCode(), "IM뱅크(대구)");
            case -120078448:
                if (!lowerCase.equals("스탠다드차타드")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.SC.getCode(), "SC");
            case 3364:
                if (!lowerCase.equals("im")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.DAEGU.getCode(), "IM뱅크(대구)");
            case 3415:
                if (!lowerCase.equals("kb")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KB.getCode(), "KB국민");
            case 3514:
                if (!lowerCase.equals("nh")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.NH.getCode(), "NH농협");
            case 3664:
                if (!lowerCase.equals("sc")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.SC.getCode(), "SC");
            case 103422:
                return lowerCase.equals("hmc") ? onExtraCallback(checkNavigationBarByWindowManagerService.HMC.getCode(), "HMC투자") : str;
            case 104050:
                if (!lowerCase.equals("ibk")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.IBK.getCode(), "IBK기업");
            case 106025:
                if (!lowerCase.equals("kdb")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KDB.getCode(), "KDB산업");
            case 106056:
                if (!lowerCase.equals("keb")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.HANA.getCode(), "하나");
            case 107146:
                if (!lowerCase.equals("lig")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.LIG.getCode(), "케이프투자");
            case 113658:
                if (!lowerCase.equals("sbi")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.SBI.getCode(), "SBI저축");
            case 1424431:
                if (!lowerCase.equals("국민")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KB.getCode(), "KB국민");
            case 1432981:
                if (!lowerCase.equals("기업")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.IBK.getCode(), "IBK기업");
            case 1463844:
                if (!lowerCase.equals("농협")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.NH.getCode(), "NH농협");
            case 1464940:
                if (!lowerCase.equals("대구")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.DAEGU.getCode(), "IM뱅크(대구)");
            case 1579797:
                if (!lowerCase.equals("산업")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KDB.getCode(), "KDB산업");
            case 1600404:
                if (!lowerCase.equals("시티")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.CITY.getCode(), "씨티");
            case 1639136:
                if (!lowerCase.equals("제일")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.SC.getCode(), "SC");
            case 1686609:
                if (!lowerCase.equals("카뱅")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KAKAO.getCode(), "카카오뱅크");
            case 1690949:
                if (!lowerCase.equals("케뱅")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KBANK.getCode(), "케이뱅크");
            case 1715197:
                return lowerCase.equals("토증") ? onExtraCallback(checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode(), "토스증권") : str;
            case 4780267:
                if (!lowerCase.equals("im뱅크")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.DAEGU.getCode(), "IM뱅크(대구)");
            case 5095966:
                if (!lowerCase.equals("nh투자")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.NHQV.getCode(), "NH투자");
            case 5157017:
                if (!lowerCase.equals("sc은행")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.SC.getCode(), "SC");
            case 5160240:
                if (!lowerCase.equals("sc제일")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.SC.getCode(), "SC");
            case 50164016:
                if (!lowerCase.equals("아이엠")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.DAEGU.getCode(), "IM뱅크(대구)");
            case 52479908:
                if (!lowerCase.equals("카카오")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KAKAO.getCode(), "카카오뱅크");
            case 52562704:
                if (!lowerCase.equals("케이프")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.LIG.getCode(), "케이프투자");
            case 101832999:
                if (!lowerCase.equals("kbank")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.KBANK.getCode(), "케이뱅크");
            case 103658120:
                if (!lowerCase.equals("keb하나")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.HANA.getCode(), "하나");
            case 110865167:
                if (!lowerCase.equals("sbi저축")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.SBI.getCode(), "SBI저축");
            case 363415539:
                return lowerCase.equals("신용협동조합은행") ? onExtraCallback(checkNavigationBarByWindowManagerService.SHINHYUB.getCode(), "신협") : str;
            case 964526583:
                if (!lowerCase.equals("아이엠뱅크")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.DAEGU.getCode(), "IM뱅크(대구)");
            case 1408473096:
                if (!lowerCase.equals("농협투자")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.NHQV.getCode(), "NH투자");
            case 1409443253:
                if (!lowerCase.equals("대구은행")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.DAEGU.getCode(), "IM뱅크(대구)");
            case 1414729583:
                return lowerCase.equals("대신증권") ? onExtraCallback(checkNavigationBarByWindowManagerService.DAESHIN.getCode(), "대신") : str;
            case 1671450341:
                if (!lowerCase.equals("한국시티")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.CITY.getCode(), "씨티");
            case 1671468569:
                if (!lowerCase.equals("한국씨티")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.CITY.getCode(), "씨티");
            case 1671945060:
                if (!lowerCase.equals("하나금투")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.HANAQV.getCode(), "하나금융");
            case 1671984492:
                if (!lowerCase.equals("하나대투")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.HANAQV.getCode(), "하나금융");
            case 1672154575:
                if (!lowerCase.equals("하나증권")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.HANAQV.getCode(), "하나금융");
            case 1672229156:
                if (!lowerCase.equals("하나투자")) {
                    return str;
                }
                return onExtraCallback(checkNavigationBarByWindowManagerService.HANAQV.getCode(), "하나금융");
            default:
                return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onExtraCallback(@NotNull String str) {
        String strAccess000;
        Intrinsics.checkNotNullParameter(str, "");
        if (TextUtils.isEmpty(str)) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        List listIAuthTabCallback = send.Companion.onWarmupCompleted().IAuthTabCallback();
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(str);
        if (!ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onWarmupCompleted(listIAuthTabCallback)) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        Iterator it = listIAuthTabCallback.iterator();
        while (true) {
            if (!it.hasNext()) {
                strAccess000 = _UrlKt.FRAGMENT_ENCODE_SET;
                break;
            }
            strAccess000 = ((checkNavigationBarBySystemProperties) it.next()).access000();
            if (strAccess000.length() == strIAuthTabCallbackStub.length()) {
                Locale locale = Locale.ROOT;
                String lowerCase = strAccess000.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                String lowerCase2 = strIAuthTabCallbackStub.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(strAccess000)) {
            Iterator it2 = listIAuthTabCallback.iterator();
            while (it2.hasNext()) {
                String strAccess0002 = ((checkNavigationBarBySystemProperties) it2.next()).access000();
                if (strAccess0002.length() > strIAuthTabCallbackStub.length()) {
                    Locale locale2 = Locale.ROOT;
                    String lowerCase3 = strAccess0002.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                    String lowerCase4 = strIAuthTabCallbackStub.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                    if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase4, false, 2, (Object) null)) {
                        Locale locale3 = Locale.ROOT;
                        String lowerCase5 = strIAuthTabCallbackStub.toLowerCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
                        String lowerCase6 = strAccess0002.toLowerCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "");
                        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase5, (CharSequence) lowerCase6, false, 2, (Object) null)) {
                        }
                    }
                }
                return strAccess0002;
            }
        }
        return strAccess000;
    }

    public final boolean onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = onExtraCallbackWithResult().onExtraCallback(str);
        return checknavigationbarbysystempropertiesOnExtraCallback != null && checknavigationbarbysystempropertiesOnExtraCallback.bV_();
    }
}
