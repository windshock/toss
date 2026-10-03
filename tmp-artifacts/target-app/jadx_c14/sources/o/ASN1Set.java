package o;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import viva.republica.toss.R;
import viva.republica.toss.account.notification.AccountNotificationSuggestActivity;
import viva.republica.toss.signup.AccountSmsIntroActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ASN1Set {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static boolean onExtraCallback = false;
    private static boolean onExtraCallbackWithResult = false;
    public static final ASN1Set onNavigationEvent;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    static {
        onWarmupCompleted();
        onNavigationEvent = new ASN1Set();
        int i = onTransact + 11;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i3)) | i8 | (~(i2 | i3));
        int i10 = (~(i7 | (~i3))) | i8;
        int i11 = (~(i3 | i6)) | (~((~i2) | i6));
        int i12 = i6 + i2 + i5 + (929125522 * i) + (1849324972 * i4);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i6) + 1146290176 + ((-1462591364) * i2) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i5) + ((-291241984) * i) + (1012400128 * i4) + ((-1810169856) * i13);
        int i15 = ((i6 * (-2058557531)) - 518432259) + (i2 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i5 * (-2058558961)) + (i * 548722830) + (i4 * 1549712660) + (i13 * (-2087387136));
        return i14 + ((i15 * i15) * (-343605248)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, Context context, boolean z2, List list, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, boolean z3, Function0 function0, getSignedData getsigneddata, AdComponentViewParentApi adComponentViewParentApi) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, context, z2, list, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, z3, function0, getsigneddata, adComponentViewParentApi);
        int i4 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 393109975, new Object[]{function1, obj}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -393109974);
            int i3 = 93 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 393109975, new Object[]{function1, obj}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -393109974);
        }
        int i4 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private ASN1Set() {
    }

    static /* synthetic */ Intent onWarmupCompleted(Context context, List list, getSignedData getsigneddata, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 8) != 0) {
            int i6 = i3 + 15;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 61;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            str = null;
        }
        return onNavigationEvent(context, list, getsigneddata, str);
    }

    private static final Intent onNavigationEvent(Context context, List<? extends TabBarInfoQueryPointOnTabBarInfoQueryListener> list, getSignedData getsigneddata, String str) {
        int i = 2 % 2;
        AccountSmsIntroActivity.onExtraCallbackWithResult onextracallbackwithresult = AccountSmsIntroActivity.Companion;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) next).requestPostMessageChannelWithExtras()) {
                arrayList.add(next);
                int i4 = IAuthTabCallbackDefault + 61;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i6 = IAuthTabCallbackStub + 87;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            Integer intOrNull = StringsKt.toIntOrNull(((TabBarInfoQueryPointOnTabBarInfoQueryListener) it2.next()).asInterface());
            if (intOrNull != null) {
                int i8 = IAuthTabCallbackDefault + 75;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 == 0) {
                    arrayList2.add(intOrNull);
                    int i9 = 33 / 0;
                } else {
                    arrayList2.add(intOrNull);
                }
            }
        }
        return onextracallbackwithresult.onWarmupCompleted(context, CollectionsKt.distinct(arrayList2), "", str, getsigneddata);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onExtraCallback(boolean z, Context context, boolean z2, List list, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, boolean z3, Function0 function0, getSignedData getsigneddata, AdComponentViewParentApi adComponentViewParentApi) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (!(!z)) {
            resumeForClick resumeforclick = resumeForClick.asBinder;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-122, -114, -126, -121, -115, -115, -116, -119, -124, -117, -121, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, objArr);
            SessionTrackerb.onExtraCallbackWithResult(resumeforclick, context, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        } else if (z2) {
            int i5 = i2 + 29;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            TdsToastV1.onWarmupCompleted onwarmupcompleted = TdsToastV1.Companion;
            String string = context.getString(R.string.account_agreement_complete_toast, issueCertV3.IAuthTabCallback(list, (String) null, 1, (Object) null));
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent.onNavigationEvent(isShowTransAnimate.onWarmupCompleted(onwarmupcompleted, string), R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
        }
        if (((Boolean) AdComponentViewParentApi.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1147437524, 1147437524, new Object[]{adComponentViewParentApi})).booleanValue()) {
            PageAnimStore.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, AccountNotificationSuggestActivity.onExtraCallbackWithResult.IAuthTabCallback(AccountNotificationSuggestActivity.Companion, context, adComponentViewParentApi.onExtraCallbackWithResult(), null, 4, null), (Bundle) null, 2, (Object) null);
        }
        if (z3) {
            PageAnimStore.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onWarmupCompleted(context, list, getsigneddata, null, 8, null), (Bundle) null, 2, (Object) null);
            int i7 = IAuthTabCallbackDefault + 3;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull final o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r24, @org.jetbrains.annotations.NotNull final java.util.List<? extends o.TabBarInfoQueryPointOnTabBarInfoQueryListener> r25, boolean r26, final boolean r27, @org.jetbrains.annotations.NotNull final o.getSignedData r28, final boolean r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ASN1Set.onExtraCallbackWithResult(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, java.util.List, boolean, boolean, o.getSignedData, boolean, kotlin.jvm.functions.Function0):void");
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String stringExtra;
        Intent intent = (Intent) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        if (intent != null) {
            int i4 = i3 + 11;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                stringExtra = intent.getStringExtra("skipNextAction");
                int i5 = 18 / 0;
            } else {
                stringExtra = intent.getStringExtra("skipNextAction");
            }
        } else {
            int i6 = i3 + 65;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            stringExtra = null;
        }
        if (stringExtra == null) {
            int i8 = IAuthTabCallbackDefault + 53;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 30 / 0;
            }
            stringExtra = "";
        }
        if (!Boolean.parseBoolean(stringExtra)) {
            if (!Intrinsics.areEqual(intent != null ? intent.getStringExtra("funnelPurpose") : null, "subscriptionDeposit")) {
                return false;
            }
        }
        return true;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.keyCodeFromString("") + 77, View.resolveSizeAndState(0, 0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (Process.myTid() >> 22) + 75, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 63 - (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr5);
            int i5 = $10 + 63;
            $11 = i5 % 128;
            if (i5 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                int i6 = 58 / 0;
                objArr[0] = str;
                return;
            }
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 115;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $10 + 117;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 63 - TextUtils.getOffsetBefore("", 0), 12214 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i4 = 1052772399;
        }
        objArr[0] = new String(cArr2);
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 393109975, new Object[]{function1, obj}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -393109974);
    }

    private final boolean onWarmupCompleted(Intent intent) {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1111064757, new Object[]{this, intent}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1111064757)).booleanValue();
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{32628, 32618, 32631, 32634, 32629, 32619, 32624, 32557, 32560, 32639, 32626, 32582, 32580, 32625, 32635, 32638, 32586, 32627, 32562, 32633};
        onWarmupCompleted = -1184333849;
        onExtraCallback = true;
        onExtraCallbackWithResult = true;
    }
}
