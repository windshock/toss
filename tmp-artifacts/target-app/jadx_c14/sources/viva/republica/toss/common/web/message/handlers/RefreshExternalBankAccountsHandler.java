package viva.republica.toss.common.web.message.handlers;

import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CollectPerformancePoint;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.IconRoundCornerProgressBarSavedState;
import o.JsonReaderUnknownNumberParsing;
import o.PageShowPoint;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.access27400;
import o.alertWithArgs;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.genSignatureValue;
import o.onOutOfMemory;
import o.queryTabBarInfo;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setSymmetricKey;
import o.setText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.RefreshExternalBankAccountsHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefreshExternalBankAccountsHandler implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent;
    private static char[] onExtraCallback = {32595, 32607, 32580, 32627, 32624, 32583, 32581, 32597, 32626, 32582, 32577, 32630};
    private static int onExtraCallbackWithResult = -1184333854;
    private static boolean IAuthTabCallback = true;
    private static boolean onWarmupCompleted = true;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = IAuthTabCallbackDefault + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = (~(i7 | i8 | (~i6))) | (~(i2 | i3 | i6));
        int i10 = (~(i8 | i6)) | (~(i8 | i2));
        int i11 = (~(i6 | i3)) | i2;
        int i12 = i2 + i3 + i + (1661237432 * i5) + (961048624 * i4);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i2) - 281083904) + ((-1329838950) * i3) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i) + ((-1559232512) * i5) + (1553989632 * i4) + (2020540416 * i13);
        int i15 = (i2 * (-2040814728)) + 92927091 + (i3 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i * (-2040814133)) + (i5 * (-1614655000)) + (i4 * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        return i16 != 1 ? i16 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ List onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallback = onExtraCallback(function1, obj);
        int i4 = onNavigationEvent + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallback;
    }

    public static /* synthetic */ Set onNavigationEvent(List list, List list2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Set setOnExtraCallbackWithResult = onExtraCallbackWithResult(list, list2);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = onNavigationEvent + 53;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return setOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setonoutofmemeryerrorcallback, th);
        int i4 = IAuthTabCallbackDefault + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(z, setonoutofmemeryerrorcallback, pair);
        }
        onExtraCallback(z, setonoutofmemeryerrorcallback, pair);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        List list;
        CollectPerformancePoint collectPerformancePoint = (CollectPerformancePoint) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {collectPerformancePoint};
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = alertWithArgs.onExtraCallbackWithResult();
        if (i3 == 0) {
            list = (List) IAuthTabCallback(objArr2, iOnExtraCallbackWithResult2, 841488464, -841488463, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
            int i4 = 37 / 0;
        } else {
            list = (List) IAuthTabCallback(objArr2, iOnExtraCallbackWithResult2, 841488464, -841488463, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult);
        }
        int i5 = IAuthTabCallbackDefault + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = IAuthTabCallbackDefault + 45;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            int i6 = 1 / 0;
        }
        int i7 = IAuthTabCallbackDefault + 115;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 53 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onNavigationEvent + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onNavigationEvent + 1;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final List onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return list;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CollectPerformancePoint collectPerformancePoint = (CollectPerformancePoint) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(collectPerformancePoint, "");
        List listOnNavigationEvent = collectPerformancePoint.onNavigationEvent();
        int i4 = onNavigationEvent + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnNavigationEvent;
        }
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onNavigationEvent + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -116, -117, -118, -119, -120, -121, -122, -123, -124, -125}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        Object[] objArr2 = {settext, ((String) objArr[0]).intern(), false};
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr2)).booleanValue();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = PageShowPoint.Companion.onNavigationEvent();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent2 = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onNavigationEvent(true).onNavigationEvent(new RefreshExternalBankAccountsHandler$.ExternalSyntheticLambda1(new RefreshExternalBankAccountsHandler$.ExternalSyntheticLambda0()));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent2, "");
        access27400.onWarmupCompleted(jsonReaderUnknownNumberParsingOnNavigationEvent, jsonReaderUnknownNumberParsingOnNavigationEvent2).onWarmupCompleted(new RefreshExternalBankAccountsHandler$.ExternalSyntheticLambda3(new RefreshExternalBankAccountsHandler$.ExternalSyntheticLambda2(zBooleanValue, setonoutofmemeryerrorcallback)), new RefreshExternalBankAccountsHandler$.ExternalSyntheticLambda5(new RefreshExternalBankAccountsHandler$.ExternalSyntheticLambda4(setonoutofmemeryerrorcallback)));
        int i2 = IAuthTabCallbackDefault + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Set<TabBarInfoQueryPointOnTabBarInfoQueryListener> IAuthTabCallback(Lazy<? extends Set<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>> lazy) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Set<TabBarInfoQueryPointOnTabBarInfoQueryListener> set = (Set) lazy.getValue();
        int i4 = IAuthTabCallbackDefault + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return set;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Set onExtraCallbackWithResult(List list, List list2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(list);
        Set setSubtract = CollectionsKt.subtract(list, list2);
        int i4 = IAuthTabCallbackDefault + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return setSubtract;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    private static final Unit onExtraCallback(boolean z, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Pair pair) throws Throwable {
        int i;
        int i2 = 2 % 2;
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        Set<TabBarInfoQueryPointOnTabBarInfoQueryListener> setIAuthTabCallback = !(z ^ true) ? list2 : IAuthTabCallback((Lazy<? extends Set<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>>) LazyKt.onExtraCallbackWithResult(new RefreshExternalBankAccountsHandler$.ExternalSyntheticLambda6(list2, list)));
        Intrinsics.checkNotNull(setIAuthTabCallback);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = onNavigationEvent + 29;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        for (Object obj : setIAuthTabCallback) {
            queryTabBarInfo querytabbarinfoICustomTabsCallbackDefault = ((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj).ICustomTabsCallbackDefault();
            Object arrayList = linkedHashMap.get(querytabbarinfoICustomTabsCallbackDefault);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(querytabbarinfoICustomTabsCallbackDefault, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            queryTabBarInfo querytabbarinfo = (queryTabBarInfo) entry.getKey();
            if (querytabbarinfo == null) {
                i = -1;
            } else {
                i = WhenMappings.IAuthTabCallback[querytabbarinfo.ordinal()];
                int i5 = IAuthTabCallbackDefault + 109;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            if (i != 2) {
                if (i != 3) {
                    int i7 = IAuthTabCallbackDefault + 29;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        if (i == 4) {
                        }
                    } else if (i == 4) {
                    }
                }
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(genSignatureValue.onExtraCallbackWithResult.onNavigationEvent((List) entry.getValue()), (String) null, 1, (Object) null);
            } else {
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(setSymmetricKey.onExtraCallbackWithResult.onNavigationEvent((List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener>) entry.getValue()), (String) null, 1, (Object) null);
            }
        }
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -127}, (ViewConfiguration.getTouchSlop() >> 8) + 127, objArr);
        ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr[0]).intern());
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 99, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 101;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 77, 20952 - KeyEvent.normalizeMetaState(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    int i9 = $11 + 89;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 3;
                    }
                    i2 = 2;
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
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 75, 16037 - View.resolveSize(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            long j = 0;
            if (onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 62 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 12214 - View.MeasureSpec.getSize(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    j = 0;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $10 + 61;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 63 - (ViewConfiguration.getScrollBarSize() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 63 - (KeyEvent.getMaxKeyCode() >> 16), 12215 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ List onNavigationEvent(CollectPerformancePoint collectPerformancePoint) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (List) IAuthTabCallback(new Object[]{collectPerformancePoint}, alertWithArgs.onExtraCallbackWithResult(), 2060872985, -2060872983, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(new Object[]{function1, obj}, alertWithArgs.onExtraCallbackWithResult(), -1165002287, 1165002287, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final List IAuthTabCallback(CollectPerformancePoint collectPerformancePoint) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (List) IAuthTabCallback(new Object[]{collectPerformancePoint}, alertWithArgs.onExtraCallbackWithResult(), 841488464, -841488463, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
