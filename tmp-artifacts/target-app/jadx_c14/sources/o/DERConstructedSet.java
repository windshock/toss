package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.extensions.RxPermissionsKt;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.DERConstructedSet;
import o.PageShowPoint;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.verifySign;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.util.AccountHelper$;
import viva.republica.toss.signup.SelectBankActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERConstructedSet {
    private static final Lazy IAuthTabCallback;
    private static long IAuthTabCallbackDefault;
    private static char[] IAuthTabCallbackStub;
    private static int asBinder;
    private static final Lazy onExtraCallback;
    public static final int onExtraCallbackWithResult;
    public static final DERConstructedSet onNavigationEvent;
    private static final Lazy onWarmupCompleted;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onCollectWhenDestroy.values().length];
            try {
                iArr[onCollectWhenDestroy.BANK_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onCollectWhenDestroy.TOSS_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[getPadBits.values().length];
            try {
                iArr2[getPadBits.MYDATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[getPadBits.OPEN_BANKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[getPadBits.DEPOSIT_1WON.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r9 = r9 * 4
            int r9 = r9 + 4
            byte[] r0 = o.DERConstructedSet.$$a
            int r7 = r7 * 4
            int r7 = 97 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + 1
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.$$c(short, short, int):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseApiResponse);
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        int i5 = onTransact + 113;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, NativeAdView nativeAdView) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (Unit) onWarmupCompleted(801970215, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -801970206, new Object[]{str, nativeAdView});
        }
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(801970215, iOnNavigationEvent4, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent6, -801970206, new Object[]{str, nativeAdView});
        int i3 = 74 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(1869062494, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1869062487, new Object[]{th});
        int i4 = asInterface + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, getPadBits getpadbits, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Function1 function1, String str8, String str9, boolean z2) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, Boolean.valueOf(z), function1, str8, str9, Boolean.valueOf(z2)};
            throw null;
        }
        Object[] objArr2 = {checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, Boolean.valueOf(z), function1, str8, str9, Boolean.valueOf(z2)};
        Unit unit = (Unit) onWarmupCompleted(-877130789, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 877130804, objArr2);
        int i3 = onTransact + 25;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(TextView textView, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(textView, tabBarInfoQueryPointOnTabBarInfoQueryListener, view);
        int i4 = onTransact + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, bool);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = asInterface + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ICustomTabsCallback(function1, obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Integer num, FragmentActivity fragmentActivity, Function0 function0, Intent intent) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (Unit) onWarmupCompleted(73130694, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -73130676, new Object[]{num, fragmentActivity, function0, intent});
        }
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(101109587, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -101109579, new Object[]{function1, th});
        int i4 = onTransact + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, th);
        int i4 = asInterface + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, getPadBits getpadbits, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Function1 function1, String str8, String str9, boolean z2) throws Throwable {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = onWarmupCompleted(checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, z, function1, str8, str9, z2);
            int i3 = 75 / 0;
        } else {
            unitOnWarmupCompleted = onWarmupCompleted(checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, z, function1, str8, str9, z2);
        }
        int i4 = asInterface + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ PageShowPoint onExtraCallbackWithResult() {
        PageShowPoint pageShowPoint;
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            pageShowPoint = (PageShowPoint) onWarmupCompleted(-169968539, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 169968539, new Object[0]);
            int i3 = 24 / 0;
        } else {
            int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            pageShowPoint = (PageShowPoint) onWarmupCompleted(-169968539, iOnNavigationEvent4, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent6, 169968539, new Object[0]);
        }
        int i4 = asInterface + 101;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return pageShowPoint;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(th);
        }
        onExtraCallback(th);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, Boolean bool) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(function1, bool);
        }
        onWarmupCompleted(function1, bool);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel();
        }
        IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = asInterface + 35;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i2));
        int i12 = (~(i2 | i7)) | (~(i8 | i10));
        int i13 = ~(i | i6);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i + i6 + i4 + ((-1585779005) * i5) + (640148872 * i3);
        int i17 = i16 * i16;
        int i18 = (i * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i4) + (1159200768 * i5) + ((-734003200) * i3) + (2089549824 * i17);
        int i19 = (i * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i4 * (-1291221671)) + (i5 * (-1079815989)) + (i3 * 669414472) + (i17 * 145489920);
        switch (i18 + (i19 * i19 * (-1699479552))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                int i20 = 2 % 2;
                int i21 = asInterface + 3;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
                if (IAuthTabCallback() == null) {
                    return false;
                }
                int i23 = onTransact + 15;
                asInterface = i23 % 128;
                int i24 = i23 % 2;
                return true;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                String str = (String) objArr[0];
                NativeAdView nativeAdView = (NativeAdView) objArr[1];
                int i25 = 2 % 2;
                int i26 = asInterface + 93;
                onTransact = i26 % 128;
                int i27 = i26 % 2;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (!(true ^ ((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{nativeAdView}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue())) {
                    DERConstructedSet dERConstructedSet = onNavigationEvent;
                    dERConstructedSet.onNavigationEvent(str);
                    dERConstructedSet.access000().IAuthTabCallbackStub();
                }
                Unit unit = Unit.INSTANCE;
                int i28 = asInterface + 83;
                onTransact = i28 % 128;
                int i29 = i28 % 2;
                return unit;
            case 10:
                return onTransact(objArr);
            case 11:
                return asBinder(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return access000(objArr);
            case 16:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i30 = 2 % 2;
                int i31 = onTransact + 67;
                asInterface = i31 % 128;
                int i32 = i31 % 2;
                access100(function1, obj);
                int i33 = asInterface + 1;
                onTransact = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 17:
                return IAuthTabCallback_Parcel(objArr);
            case 18:
                return ICustomTabsCallback(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(1109721107, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1109721093, new Object[]{function1, obj});
        int i4 = onTransact + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Integer num, Fragment fragment, Intent intent) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            return (Unit) onWarmupCompleted(-631862717, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 631862721, new Object[]{num, fragment, intent});
        }
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(-631862717, iOnNavigationEvent4, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent6, 631862721, new Object[]{num, fragment, intent});
        int i3 = 19 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CollectPerformancePoint collectPerformancePoint) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(collectPerformancePoint);
        int i4 = onTransact + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ DomainConfigProxy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        DomainConfigProxy domainConfigProxyWriteTypedObject = writeTypedObject();
        int i4 = asInterface + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return domainConfigProxyWriteTypedObject;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(-1463687815, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 1463687832, new Object[]{function1, obj});
        int i4 = onTransact + 3;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    private DERConstructedSet() {
    }

    static {
        asBinder = 0;
        asInterface();
        onNavigationEvent = new DERConstructedSet();
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda13
            public final Object invoke() {
                return DERConstructedSet.onWarmupCompleted();
            }
        });
        onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda14
            public final Object invoke() {
                return DERConstructedSet.onExtraCallbackWithResult();
            }
        });
        onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda15
            public final Object invoke() {
                return DERConstructedSet.onNavigationEvent();
            }
        });
        onExtraCallbackWithResult = 8;
        int i = getInterfaceDescriptor + 75;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 79 / 0;
        }
    }

    private final DomainConfigProxy access000() {
        DomainConfigProxy domainConfigProxy;
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            domainConfigProxy = (DomainConfigProxy) IAuthTabCallback.getValue();
            int i3 = 89 / 0;
        } else {
            domainConfigProxy = (DomainConfigProxy) IAuthTabCallback.getValue();
        }
        int i4 = asInterface + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return domainConfigProxy;
        }
        throw null;
    }

    private static final DomainConfigProxy writeTypedObject() {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
        if (i3 != 0) {
            return ((isPartnerDomains) Response.onExtraCallback(contextOnExtraCallback, isPartnerDomains.class)).ITrustedWebActivityCallbackDefault();
        }
        int i4 = 88 / 0;
        return ((isPartnerDomains) Response.onExtraCallback(contextOnExtraCallback, isPartnerDomains.class)).ITrustedWebActivityCallbackDefault();
    }

    private final PageShowPoint access100() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        PageShowPoint pageShowPoint = (PageShowPoint) onExtraCallback.getValue();
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return pageShowPoint;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        PageShowPoint pageShowPointMayLaunchUrl = ((PageShowPoint.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), PageShowPoint.onExtraCallback.class)).mayLaunchUrl();
        int i4 = asInterface + 73;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return pageShowPointMayLaunchUrl;
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 15;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $11 + 103;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackStub[i * i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 10973 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallbackDefault), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - ((Process.getThreadPriority(0) + 20) >> 6)), KeyEvent.getDeadChar(0, 0) + 31, 20220 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122);
                        int iRed = Color.red(0) + 44;
                        int touchSlop = 1494 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b = (byte) ($$a[0] - 1);
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iRed, touchSlop, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallbackStub[i + i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.indexOf((CharSequence) "", '0')), View.getDefaultSize(0, 0) + 17, 10972 - TextUtils.indexOf((CharSequence) "", '0'), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(IAuthTabCallbackDefault), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 46135), 31 - Color.argb(0, 0, 0, 0), 20221 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback6 == null) {
                            char c3 = (char) (49124 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43;
                            int iIndexOf = 1494 - TextUtils.indexOf("", "");
                            byte b3 = (byte) ($$a[0] - 1);
                            byte b4 = b3;
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, i9, iIndexOf, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback6).invoke(null, objArr7);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i10 = $10 + 119;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 49123);
                int gidForName = 43 - Process.getGidForName("");
                int maxKeyCode = 1494 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b5 = (byte) ($$a[0] - 1);
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, gidForName, maxKeyCode, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<o.KeyBoardVisiblePoint> onExtraCallback() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.onExtraCallback():java.util.List");
    }

    public final List<KeyBoardVisiblePoint> asBinder() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener : access100().IAuthTabCallback()) {
            int i2 = asInterface + 27;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (tabBarInfoQueryPointOnTabBarInfoQueryListener.requestPostMessageChannelWithExtras()) {
                int i4 = onTransact + 73;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 84 / 0;
                    if (!tabBarInfoQueryPointOnTabBarInfoQueryListener.requestPostMessageChannel()) {
                        int i6 = asInterface + 61;
                        onTransact = i6 % 128;
                        int i7 = i6 % 2;
                        arrayList.add(tabBarInfoQueryPointOnTabBarInfoQueryListener);
                    }
                } else if (!tabBarInfoQueryPointOnTabBarInfoQueryListener.requestPostMessageChannel()) {
                    int i62 = asInterface + 61;
                    onTransact = i62 % 128;
                    int i72 = i62 % 2;
                    arrayList.add(tabBarInfoQueryPointOnTabBarInfoQueryListener);
                }
            }
        }
        return arrayList;
    }

    public static final onDisclaimerClick IAuthTabCallback() {
        Iterator it;
        Object next;
        int i = 2 % 2;
        int i2 = asInterface + 61;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            it = setTestMode.asInterface().iterator();
            int i3 = 60 / 0;
        } else {
            it = setTestMode.asInterface().iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = onTransact + 115;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            if (((onDisclaimerClick) next).access000()) {
                break;
            }
        }
        return (onDisclaimerClick) next;
    }

    public final onDisclaimerClick IAuthTabCallbackStub() {
        Object next;
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Iterator<T> it = setTestMode.asInterface().iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            int i4 = onTransact + 89;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                ((onDisclaimerClick) it.next()).ICustomTabsCallbackDefault();
                throw null;
            }
            next = it.next();
        } while (!((onDisclaimerClick) next).ICustomTabsCallbackDefault());
        return (onDisclaimerClick) next;
    }

    private final TextRoundCornerProgressBarSavedState1 getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onWarmupCompleted.getValue();
        int i4 = onTransact + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            Context applicationContext = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsService = ((requestSync) Response.onExtraCallback(applicationContext, requestSync.class)).ICustomTabsService();
            int i3 = 79 / 0;
            return textRoundCornerProgressBarSavedState1ICustomTabsService;
        }
        Response response2 = Response.onNavigationEvent;
        Context applicationContext2 = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        return ((requestSync) Response.onExtraCallback(applicationContext2, requestSync.class)).ICustomTabsService();
    }

    public static final void onNavigationEvent(boolean z) throws Throwable {
        TextRoundCornerProgressBarSavedState1 interfaceDescriptor;
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            interfaceDescriptor = onNavigationEvent.getInterfaceDescriptor();
            Object[] objArr = new Object[1];
            a(21 - (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) * 18, (char) TextUtils.indexOf("", ""), objArr);
            obj = objArr[0];
        } else {
            interfaceDescriptor = onNavigationEvent.getInterfaceDescriptor();
            Object[] objArr2 = new Object[1];
            a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, (char) TextUtils.indexOf("", ""), objArr2);
            obj = objArr2[0];
        }
        interfaceDescriptor.onNavigationEvent(((String) obj).intern(), z);
    }

    @JvmStatic
    public static final boolean onExtraCallback(@Nullable checkNavigationBarBySystemProperties checknavigationbarbysystemproperties) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (checknavigationbarbysystemproperties == null) {
            return false;
        }
        int i5 = i3 + 83;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return (checknavigationbarbysystemproperties.onActivityLayout() || onNavigationEvent(checknavigationbarbysystemproperties) == null) ? false : true;
    }

    @JvmStatic
    public static final verifySign onNavigationEvent(@Nullable checkNavigationBarBySystemProperties checknavigationbarbysystemproperties) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (checknavigationbarbysystemproperties == null || checknavigationbarbysystemproperties.onActivityLayout()) {
            int i3 = onTransact + 7;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        verifySign.onExtraCallbackWithResult onextracallbackwithresult = verifySign.Companion;
        TextRoundCornerProgressBarSavedState1 interfaceDescriptor = onNavigationEvent.getInterfaceDescriptor();
        String strExtraCallbackWithResult = checknavigationbarbysystemproperties.extraCallbackWithResult();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(11 - View.getDefaultSize(0, 0), 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strExtraCallbackWithResult);
        return onextracallbackwithresult.IAuthTabCallback(interfaceDescriptor.onExtraCallbackWithResult(sb.toString(), ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onNavigationEvent(@org.jetbrains.annotations.Nullable o.KeyBoardVisiblePoint r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.DERConstructedSet.onTransact
            int r1 = r1 + 19
            int r2 = r1 % 128
            o.DERConstructedSet.asInterface = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 36
            int r1 = r1 / r2
            if (r4 == 0) goto L2f
            goto L17
        L15:
            if (r4 == 0) goto L2f
        L17:
            boolean r1 = r4.IAuthTabCallback_Parcel()
            if (r1 != 0) goto L2f
            int r1 = o.DERConstructedSet.asInterface
            int r1 = r1 + 37
            int r2 = r1 % 128
            o.DERConstructedSet.onTransact = r2
            int r1 = r1 % r0
            java.lang.String r4 = r4.onExtraCallbackWithResult()
            boolean r4 = r3.onExtraCallback(r4)
            return r4
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.onNavigationEvent(o.KeyBoardVisiblePoint):boolean");
    }

    public final boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return false;
        }
        for (onDisclaimerClick ondisclaimerclick : setTestMode.asInterface()) {
            if (!Intrinsics.areEqual(str, ondisclaimerclick.onExtraCallbackWithResult()) && ondisclaimerclick.ax_()) {
                int i2 = asInterface;
                int i3 = i2 + 37;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 43;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        Iterator it = access100().IAuthTabCallback().iterator();
        int i7 = asInterface + 65;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        while (it.hasNext()) {
            if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).requestPostMessageChannelWithExtras()) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final onDisclaimerClick IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        if (GraniteModule_onEventListenerRemoved.onExtraCallback(str)) {
            int i2 = onTransact + 67;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            for (onDisclaimerClick ondisclaimerclick : setTestMode.asInterface()) {
                if (Intrinsics.areEqual(ondisclaimerclick.onExtraCallbackWithResult(), str)) {
                    return ondisclaimerclick;
                }
            }
        }
        int i4 = onTransact + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return null;
    }

    @JvmStatic
    public static final KeyBoardVisiblePoint onWarmupCompleted(@NotNull String str, @Nullable onCollectWhenDestroy oncollectwhendestroy) {
        Iterator<onDisclaimerClick> it;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = oncollectwhendestroy == null ? -1 : onExtraCallbackWithResult.onNavigationEvent[oncollectwhendestroy.ordinal()];
        if (i2 == 1) {
            Iterator it2 = onNavigationEvent.access100().IAuthTabCallback().iterator();
            while (!(!it2.hasNext())) {
                TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) it2.next();
                if (Intrinsics.areEqual(tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult(), str)) {
                    int i3 = asInterface + 33;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                    return tabBarInfoQueryPointOnTabBarInfoQueryListener;
                }
            }
            return null;
        }
        if (i2 != 2) {
            return null;
        }
        int i5 = asInterface + 109;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            it = setTestMode.asInterface().iterator();
            int i6 = 78 / 0;
        } else {
            it = setTestMode.asInterface().iterator();
        }
        while (it.hasNext()) {
            onDisclaimerClick next = it.next();
            if (Intrinsics.areEqual(next.onExtraCallbackWithResult(), str)) {
                return next;
            }
        }
        return null;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 77;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.text.AndroidCharacter.getMirror('0') - 26, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r2 = ((java.lang.reflect.Field) r2).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        r6 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-984205844);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (r6 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        r6 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.text.TextUtils.getCapsMode("", 0, 0) + 29426), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 22, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 24734, -199832708, false, "writeTypedObject", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
    
        r2 = ((o.disengageSeek) ((java.lang.reflect.Method) r6).invoke(r2, null)).onWarmupCompleted(r12).onWarmupCompleted(im.toss.utils.RxUtils.IAuthTabCallback((java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r4 = new viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda10(r21);
        r0 = r2.onNavigationEvent(new viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda11(r4));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r2 = o.DERConstructedSet.asInterface + 121;
        o.DERConstructedSet.onTransact = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        r0 = new o.NativeAdView();
        r0.onExtraCallback("FAIl");
        im.toss.network.model.BaseApiResponse.onExtraCallbackWithResult(new java.lang.Object[]{r0, null}, im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1206905449, im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1206905448, im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        r0.IAuthTabCallback(new im.toss.network.throwable.ApiServerError());
        r0 = o.JsonReaderUnknownNumberParsing.onExtraCallback(r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r12 = new o.setInset(o.onCollectWhenDestroy.TOSS_ACCOUNT, r2.onExtraCallbackWithResult(), null, 4, null);
        r2 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.JsonReaderUnknownNumberParsing<o.NativeAdView> onWarmupCompleted(@org.jetbrains.annotations.NotNull final java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.onWarmupCompleted(java.lang.String):o.JsonReaderUnknownNumberParsing");
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!TextUtils.isEmpty(str)) {
            access100().IAuthTabCallback(str);
            return;
        }
        int i4 = onTransact + 91;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    @JvmStatic
    public static final void onNavigationEvent(@NotNull List<? extends onDisclaimerClick> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ReactNativeFeatureFlagsCxxInterop reactNativeFeatureFlagsCxxInterop = ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted;
        if (reactNativeFeatureFlagsCxxInterop.onNavigationEvent(list)) {
            return;
        }
        List<onDisclaimerClick> listAsInterface = setTestMode.asInterface();
        if (!reactNativeFeatureFlagsCxxInterop.onNavigationEvent(listAsInterface)) {
            Iterator<onDisclaimerClick> it = listAsInterface.iterator();
            while (!(!it.hasNext())) {
                onDisclaimerClick next = it.next();
                for (onDisclaimerClick ondisclaimerclick : list) {
                    if (ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback(next.onExtraCallbackWithResult(), ondisclaimerclick.onExtraCallbackWithResult())) {
                        int i2 = asInterface + 59;
                        onTransact = i2 % 128;
                        int i3 = i2 % 2;
                        ondisclaimerclick.onExtraCallbackWithResult(next.onPostMessage());
                    }
                }
            }
        }
        PageShowPoint.onWarmupCompleted(onNavigationEvent.access100(), list, false, 2, (Object) null);
        int i4 = onTransact + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(DERConstructedSet dERConstructedSet, Activity activity, ArrayList arrayList, ReactQueueConfigurationImplCompanion reactQueueConfigurationImplCompanion, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 91;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        if ((i & 4) != 0) {
            int i5 = onTransact + 87;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            reactQueueConfigurationImplCompanion = ReactQueueConfigurationImplCompanion.NORMAL;
        }
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(393062728, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -393062718, new Object[]{dERConstructedSet, activity, arrayList, reactQueueConfigurationImplCompanion, str});
        int i7 = onTransact + 95;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Activity activity = (Activity) objArr[1];
        ArrayList arrayList = (ArrayList) objArr[2];
        ReactQueueConfigurationImplCompanion reactQueueConfigurationImplCompanion = (ReactQueueConfigurationImplCompanion) objArr[3];
        String str = (String) objArr[4];
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(reactQueueConfigurationImplCompanion, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (activity != null) {
            activity.startActivityForResult(SelectBankActivity.onExtraCallbackWithResult.onExtraCallbackWithResult(SelectBankActivity.Companion, activity, reactQueueConfigurationImplCompanion, str, (String) null, (String) null, (String) null, (Integer[]) arrayList.toArray(new Integer[0]), (String) null, (getPadBits) null, (String) null, (String) null, (String) null, false, 8120, (Object) null), 30001);
            return null;
        }
        int i4 = onTransact + 35;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 0 / 0;
        return null;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void onExtraCallback(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, @NotNull String str) throws Throwable {
        String str2;
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.ID_PW == onextracallbackwithresult) {
            str2 = "hasBankCredentialId";
        } else if (TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.CERTIFICATION == onextracallbackwithresult) {
            int i4 = asInterface + 43;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str2 = "hasBankCredentialCert";
        } else {
            str2 = null;
        }
        AssertionException assertionException = new AssertionException(null, false, 3, null);
        if (str2 != null) {
            int i5 = asInterface + 27;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (str2.length() != 0) {
                int i7 = onTransact + 29;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    assertionException.onExtraCallbackWithResult(str2, str);
                    int i8 = 69 / 0;
                } else {
                    assertionException.onExtraCallbackWithResult(str2, str);
                }
            }
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29425), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getScrollBarSize() >> 8)), Color.red(0) + 22, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24734, -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawOnNavigationEvent = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback(assertionException).onNavigationEvent(clearTid.onExtraCallback());
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda21
                public final Object invoke(Object obj2) {
                    return DERConstructedSet.IAuthTabCallback((BaseApiResponse) obj2);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda22
                public final void accept(Object obj2) {
                    DERConstructedSet.IAuthTabCallback(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda23
                public final Object invoke(Object obj2) {
                    return DERConstructedSet.onNavigationEvent((Throwable) obj2);
                }
            };
            writerawOnNavigationEvent.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda24
                public final void accept(Object obj2) {
                    Object[] objArr = {function12, obj2};
                    DERConstructedSet.onWarmupCompleted(-751634191, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 751634196, objArr);
                }
            });
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final Unit onExtraCallbackWithResult(BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 75;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r4) {
        /*
            r4 = 2
            int r0 = r4 % r4
            o.DERConstructedSet r0 = o.DERConstructedSet.onNavigationEvent
            o.PageShowPoint r0 = r0.access100()
            java.util.List r0 = r0.IAuthTabCallback()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L5a
            int r1 = o.DERConstructedSet.onTransact
            int r1 = r1 + 67
            int r3 = r1 % 128
            o.DERConstructedSet.asInterface = r3
            int r1 = r1 % r4
            if (r1 != 0) goto L56
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            int r1 = o.DERConstructedSet.onTransact
            int r1 = r1 + 7
            int r3 = r1 % 128
            o.DERConstructedSet.asInterface = r3
            int r1 = r1 % r4
            if (r1 != 0) goto L49
            java.lang.Object r1 = r0.next()
            o.TabBarInfoQueryPointOnTabBarInfoQueryListener r1 = (o.TabBarInfoQueryPointOnTabBarInfoQueryListener) r1
            boolean r1 = r1.requestPostMessageChannelWithExtras()
            if (r1 == 0) goto L26
            r4 = 1
        L44:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L49:
            java.lang.Object r4 = r0.next()
            o.TabBarInfoQueryPointOnTabBarInfoQueryListener r4 = (o.TabBarInfoQueryPointOnTabBarInfoQueryListener) r4
            r4.requestPostMessageChannelWithExtras()
            r2.hashCode()
            throw r2
        L56:
            r0.iterator()
            throw r2
        L5a:
            int r0 = o.DERConstructedSet.asInterface
            int r0 = r0 + 65
            int r1 = r0 % 128
            o.DERConstructedSet.onTransact = r1
            int r0 = r0 % r4
            if (r0 == 0) goto L67
            r4 = 0
            goto L44
        L67:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.asBinder(java.lang.Object[]):java.lang.Object");
    }

    static /* synthetic */ void onExtraCallbackWithResult(DERConstructedSet dERConstructedSet, View view, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 93;
        onTransact = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 4) != 0) {
            int i5 = i3 + 11;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
            z = false;
        }
        Object[] objArr = {dERConstructedSet, view, str, Boolean.valueOf(z)};
        onWarmupCompleted(1079527615, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1079527614, objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        View view = (View) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("accountNo", str));
        if (!zBooleanValue) {
            i = R.string.account_no_copied_to_clipboard;
        } else {
            int i4 = onTransact + 123;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            i = R.string.phone_number_copied_to_clipboard;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        new TdsToastV1.onNavigationEvent(view, string).onNavigationEvent();
        int i6 = onTransact + 91;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void IAuthTabCallback(View view, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        String str = (String) issueCertV3.onExtraCallback(-212427217, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 212427218, new Object[]{tabBarInfoQueryPointOnTabBarInfoQueryListener}, zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        for (int i4 = 0; i4 < str.length(); i4++) {
            int i5 = onTransact + 45;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                if (Character.isDigit(str.charAt(i4))) {
                    onExtraCallbackWithResult(this, view, tabBarInfoQueryPointOnTabBarInfoQueryListener.postMessage(), false, 4, null);
                    return;
                }
            } else {
                Character.isDigit(str.charAt(i4));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(CollectPerformancePoint collectPerformancePoint) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 31;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 13;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onNavigationEvent(DERConstructedSet dERConstructedSet, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 39;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 107;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        boolean zOnExtraCallback = dERConstructedSet.onExtraCallback(str, str2, z);
        int i8 = asInterface + 69;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return zOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (o.clearFaultAdjacentMetadata.onExtraCallback(new java.lang.Integer[]{1, 7, 8}).contains(java.lang.Integer.valueOf(r5.newSession())) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onExtraCallback(@org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r5 == 0) goto L76
            int r2 = r5.length()
            if (r2 == 0) goto L76
            if (r6 == 0) goto L76
            int r2 = o.DERConstructedSet.onTransact
            int r2 = r2 + 59
            int r3 = r2 % 128
            o.DERConstructedSet.asInterface = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L23
            int r2 = r6.length()
            r3 = 79
            int r3 = r3 / r1
            if (r2 == 0) goto L76
            goto L29
        L23:
            int r2 = r6.length()
            if (r2 == 0) goto L76
        L29:
            o.PageShowPoint r2 = r4.access100()
            o.TabBarInfoQueryPointOnTabBarInfoQueryListener r5 = r2.onExtraCallback(r5, r6)
            if (r5 == 0) goto L76
            int r6 = o.DERConstructedSet.onTransact
            int r6 = r6 + 115
            int r2 = r6 % 128
            o.DERConstructedSet.asInterface = r2
            int r6 = r6 % r0
            r2 = 1
            if (r6 == 0) goto L45
            r6 = 42
            int r6 = r6 / r1
            if (r7 == 0) goto L6c
            goto L47
        L45:
            if (r7 == 0) goto L6c
        L47:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r6 = new java.lang.Integer[]{r6, r7, r3}
            java.util.Set r6 = o.clearFaultAdjacentMetadata.onExtraCallback(r6)
            int r5 = r5.newSession()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L76
        L6c:
            int r5 = o.DERConstructedSet.asInterface
            int r5 = r5 + 31
            int r6 = r5 % 128
            o.DERConstructedSet.onTransact = r6
            int r5 = r5 % r0
            return r2
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.onExtraCallback(java.lang.String, java.lang.String, boolean):boolean");
    }

    public static /* synthetic */ boolean IAuthTabCallback(DERConstructedSet dERConstructedSet, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onTransact + 5;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        boolean zOnWarmupCompleted = dERConstructedSet.onWarmupCompleted(str, str2, z);
        int i5 = onTransact + 21;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return zOnWarmupCompleted;
    }

    public final boolean onWarmupCompleted(@Nullable String str, @Nullable String str2, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(str, str2, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(str, str2, z);
        int i3 = asInterface + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    public final KeyBoardVisiblePoint onWarmupCompleted(@Nullable String str, @Nullable String str2) {
        int i = 2 % 2;
        Object obj = null;
        if (!onWarmupCompleted(str, str2, true)) {
            int i2 = asInterface + 33;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        PageShowPoint pageShowPointAccess100 = access100();
        if (str == null) {
            int i4 = asInterface + 41;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        return pageShowPointAccess100.onExtraCallback(str, str2);
    }

    public static /* synthetic */ void IAuthTabCallback(boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface + 17;
        int i4 = i3 % 128;
        onTransact = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 49;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        IAuthTabCallback(z);
        int i8 = asInterface + 99;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @JvmStatic
    public static final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z2 = false;
        if (z) {
            int i5 = i3 + 97;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            setTestMode.onExtraCallback(-1688500272, 1688500278, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{true}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
            int i7 = asInterface + 105;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 99 / 0;
                return;
            }
            return;
        }
        List listIAuthTabCallback = onNavigationEvent.access100().IAuthTabCallback();
        if (!(listIAuthTabCallback instanceof Collection) || !listIAuthTabCallback.isEmpty()) {
            Iterator it = listIAuthTabCallback.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((TabBarInfoQueryPointOnTabBarInfoQueryListener) it.next()).requestPostMessageChannelWithExtras()) {
                    int i9 = asInterface + 81;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    z2 = true;
                    break;
                }
            }
        }
        setTestMode.onExtraCallback(-1688500272, 1688500278, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), new Object[]{Boolean.valueOf(z2)}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static /* synthetic */ void onExtraCallback(DERConstructedSet dERConstructedSet, FragmentActivity fragmentActivity, String str, String str2, String str3, getPadBits getpadbits, String str4, Integer num, String str5, String str6, String str7, boolean z, String str8, boolean z2, String str9, Function0 function0, int i, Object obj) {
        String str10;
        String str11;
        boolean z3;
        int i2 = 2 % 2;
        String str12 = (i & 4) != 0 ? "" : str2;
        String str13 = (i & 8) != 0 ? "" : str3;
        getPadBits getpadbits2 = (i & 16) != 0 ? null : getpadbits;
        String str14 = (i & 32) != 0 ? null : str4;
        Integer num2 = (i & 64) != 0 ? null : num;
        if ((i & 128) != 0) {
            int i3 = asInterface + 47;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            str10 = null;
        } else {
            str10 = str5;
        }
        String str15 = (i & 256) != 0 ? null : str6;
        String str16 = (i & 512) != 0 ? null : str7;
        boolean z4 = (i & 1024) != 0 ? true : z;
        if ((i & 2048) != 0) {
            int i5 = asInterface + 111;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            str11 = null;
        } else {
            str11 = str8;
        }
        if ((i & 4096) != 0) {
            int i7 = asInterface + 49;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        dERConstructedSet.IAuthTabCallback(fragmentActivity, str, str12, str13, getpadbits2, str14, num2, str10, str15, str16, z4, str11, z3, (i & 8192) != 0 ? null : str9, (Function0<Unit>) ((i & 16384) != 0 ? null : function0));
    }

    public final void IAuthTabCallback(@NotNull final FragmentActivity fragmentActivity, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable getPadBits getpadbits, @Nullable String str4, @Nullable final Integer num, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z, @Nullable String str8, boolean z2, @Nullable String str9, @Nullable final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        onWarmupCompleted(fragmentActivity, str, str2, str3, getpadbits, str4, str5, str6, str7, z, str8, str9, z2, new Function1() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                return DERConstructedSet.onExtraCallback(num, fragmentActivity, function0, (Intent) obj);
            }
        });
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        Integer num = (Integer) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Intent intent = (Intent) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        if (num == null) {
            int i4 = onTransact + 91;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            fragmentActivity.startActivity(intent);
        } else {
            fragmentActivity.startActivityForResult(intent, num.intValue());
        }
        if (function0 != null) {
            int i6 = asInterface + 125;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                function0.invoke();
                throw null;
            }
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 1
            r2 = r6[r2]
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r3 = 2
            r6 = r6[r3]
            android.content.Intent r6 = (android.content.Intent) r6
            int r4 = r3 % r3
            int r4 = o.DERConstructedSet.onTransact
            int r4 = r4 + 17
            int r5 = r4 % 128
            o.DERConstructedSet.asInterface = r5
            int r4 = r4 % r3
            java.lang.String r5 = ""
            if (r4 == 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            r4 = 50
            int r4 = r4 / r0
            if (r1 != 0) goto L39
            goto L2c
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            if (r1 != 0) goto L39
        L2c:
            int r0 = o.DERConstructedSet.onTransact
            int r0 = r0 + 19
            int r1 = r0 % 128
            o.DERConstructedSet.asInterface = r1
            int r0 = r0 % r3
            r2.startActivity(r6)
            goto L40
        L39:
            int r0 = r1.intValue()
            r2.startActivityForResult(r6, r0)
        L40:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    public final void onWarmupCompleted(@NotNull final FragmentActivity fragmentActivity, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @Nullable final getPadBits getpadbits, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final String str7, final boolean z, @Nullable final String str8, @Nullable final String str9, boolean z2, @NotNull final Function1<? super Intent, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallbackWithResult = bindApp.onExtraCallbackWithResult(send.Companion.onWarmupCompleted(), str);
        if (checknavigationbarbysystempropertiesOnExtraCallbackWithResult.onActivityLayout()) {
            return;
        }
        int i2 = onTransact + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentActivity.isFinishing();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (fragmentActivity.isFinishing()) {
            return;
        }
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        if (addExtra.extraCallback(playerErrorCode)) {
            int i3 = asInterface + 95;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Toast.makeText((Context) fragmentActivity, (CharSequence) fragmentActivity.getString(R.string.visitor_block_service_message), 0).show();
            fragmentActivity.finish();
            return;
        }
        if (addExtra.writeTypedObject(playerErrorCode) && !z2) {
            int i5 = asInterface + 25;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Toast.makeText((Context) fragmentActivity, (CharSequence) fragmentActivity.getString(R.string.teens_age_block_service), 0).show();
            fragmentActivity.finish();
            return;
        }
        if (addExtra.IAuthTabCallback(playerErrorCode) && getpadbits != getPadBits.DEPOSIT_1WON && getpadbits != getPadBits.OPEN_BANKING) {
            function1.invoke(onNavigationEvent(checknavigationbarbysystempropertiesOnExtraCallbackWithResult, str4 != null ? str4 : ""));
        } else {
            onWarmupCompleted(1664648634, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1664648621, new Object[]{this, fragmentActivity, new Function1() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda9
                public final Object invoke(Object obj2) {
                    return DERConstructedSet.onExtraCallbackWithResult(checknavigationbarbysystempropertiesOnExtraCallbackWithResult, getpadbits, fragmentActivity, str4, str7, str, str2, str3, str5, str6, z, function1, str8, str9, ((Boolean) obj2).booleanValue());
                }
            }});
        }
    }

    private static final Unit onWarmupCompleted(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, getPadBits getpadbits, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Function1 function1, String str8, String str9, boolean z2) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent.IAuthTabCallback(checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, z, function1, str8, str9);
            unit = Unit.INSTANCE;
            int i3 = 73 / 0;
        } else {
            onNavigationEvent.IAuthTabCallback(checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, z, function1, str8, str9);
            unit = Unit.INSTANCE;
        }
        int i4 = asInterface + 95;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws Throwable {
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = (checkNavigationBarBySystemProperties) objArr[0];
        getPadBits getpadbits = (getPadBits) objArr[1];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[2];
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        String str3 = (String) objArr[5];
        String str4 = (String) objArr[6];
        String str5 = (String) objArr[7];
        String str6 = (String) objArr[8];
        String str7 = (String) objArr[9];
        boolean zBooleanValue = ((Boolean) objArr[10]).booleanValue();
        Function1<? super Intent, Unit> function1 = (Function1) objArr[11];
        String str8 = (String) objArr[12];
        String str9 = (String) objArr[13];
        ((Boolean) objArr[14]).booleanValue();
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent.IAuthTabCallback(checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, zBooleanValue, function1, str8, str9);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 83;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean onExtraCallback(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, getPadBits getpadbits) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 123;
        asInterface = i3 % 128;
        if (i3 % 2 == 0 ? (i = onExtraCallbackWithResult.onWarmupCompleted[getpadbits.ordinal()]) == 1 : (i = onExtraCallbackWithResult.onWarmupCompleted[getpadbits.ordinal()]) == 0) {
            return addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted);
        }
        if (i != 2) {
            int i4 = onTransact + 91;
            asInterface = i4 % 128;
            if (i4 % 2 == 0 ? i != 3 : i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return checknavigationbarbysystemproperties.IAuthTabCallbackDefault();
        }
        if (!addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) {
            boolean zWriteTypedObject = checknavigationbarbysystemproperties.writeTypedObject();
            int i5 = asInterface + 107;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return zWriteTypedObject;
        }
        return checknavigationbarbysystemproperties.readTypedObject().contains(checkNavigationBarByResourcesId.OPEN_BANKING);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = (checkNavigationBarBySystemProperties) objArr[0];
        getPadBits getpadbits = (getPadBits) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onExtraCallbackWithResult.onWarmupCompleted[getpadbits.ordinal()];
        if (i4 == 1) {
            return Boolean.valueOf(addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted));
        }
        int i5 = onTransact + 119;
        int i6 = i5 % 128;
        asInterface = i6;
        int i7 = i5 % 2;
        if (i4 == 2) {
            return true;
        }
        int i8 = i6 + 31;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = i6 + 45;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            return Boolean.valueOf(checknavigationbarbysystemproperties.IAuthTabCallbackDefault());
        }
        checknavigationbarbysystemproperties.IAuthTabCallbackDefault();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(o.checkNavigationBarBySystemProperties r24, o.getPadBits r25, androidx.fragment.app.FragmentActivity r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> r35, java.lang.String r36, java.lang.String r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERConstructedSet.IAuthTabCallback(o.checkNavigationBarBySystemProperties, o.getPadBits, androidx.fragment.app.FragmentActivity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String):void");
    }

    private final Intent onNavigationEvent(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, String str) throws Throwable {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.setPackage(UserChoiceBillingListener.onExtraCallback.onExtraCallback().getPackageName());
        intent.setAction("android.intent.action.VIEW");
        int iIAuthTabCallbackStub = checknavigationbarbysystemproperties.IAuthTabCallbackStub();
        if (str.length() == 0) {
            int i2 = asInterface + 93;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            str = "account_register";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25, 38 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 65350), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(iIAuthTabCallbackStub);
        sb.append("&referrer=");
        sb.append((Object) str);
        intent.setData(Uri.parse(sb.toString()));
        int i4 = asInterface + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        writeRaw writerawOnExtraCallbackWithResult = RxPermissionsKt.onExtraCallbackWithResult(new RxPermissions(fragmentActivity), fragmentActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return DERConstructedSet.onNavigationEvent(function1, (Boolean) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                DERConstructedSet.onNavigationEvent(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return DERConstructedSet.onExtraCallbackWithResult(function1, (Throwable) obj);
            }
        };
        writerawOnExtraCallbackWithResult.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.util.AccountHelper$$ExternalSyntheticLambda7
            public final void accept(Object obj) {
                DERConstructedSet.onWarmupCompleted(function13, obj);
            }
        });
        int i2 = asInterface + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(Function1 function1, Boolean bool) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(bool);
        function1.invoke(bool);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Function1 function1, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            function1.invoke(Boolean.FALSE);
            Unit unit = Unit.INSTANCE;
            int i3 = onTransact + 115;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        function1.invoke(Boolean.FALSE);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(Function1 function1, Boolean bool) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(bool);
            function1.invoke(bool);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(bool);
        function1.invoke(bool);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(Boolean.FALSE);
            Unit unit = Unit.INSTANCE;
            int i3 = asInterface + 41;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        function1.invoke(Boolean.FALSE);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    public final void onExtraCallback(@Nullable TextView textView, @Nullable TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (textView == null) {
            return;
        }
        if (tabBarInfoQueryPointOnTabBarInfoQueryListener == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        SpannableString spannableString = new SpannableString(tabBarInfoQueryPointOnTabBarInfoQueryListener.onMessageChannelReady() + " " + tabBarInfoQueryPointOnTabBarInfoQueryListener.onPostMessage());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        textView.setOnClickListener(new AccountHelper$.ExternalSyntheticLambda20(textView, tabBarInfoQueryPointOnTabBarInfoQueryListener));
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(TextView textView, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent.IAuthTabCallback(textView, tabBarInfoQueryPointOnTabBarInfoQueryListener);
            int i3 = 45 / 0;
        } else {
            onNavigationEvent.IAuthTabCallback(textView, tabBarInfoQueryPointOnTabBarInfoQueryListener);
        }
        int i4 = onTransact + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        List listIAuthTabCallback = send.Companion.onWarmupCompleted().IAuthTabCallback();
        if (!(!Intrinsics.areEqual(r1.onWarmupCompleted(listIAuthTabCallback, str), r1.onWarmupCompleted(listIAuthTabCallback, str3)))) {
            int i2 = asInterface + 59;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(str2, str4);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Intrinsics.areEqual(str2, str4)) {
                int i3 = asInterface + 103;
                int i4 = i3 % 128;
                onTransact = i4;
                boolean z = i3 % 2 != 0;
                int i5 = i4 + 37;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }
        }
        return false;
    }

    public final getPadBits IAuthTabCallback(@NotNull checkNavigationBarBySystemProperties checknavigationbarbysystemproperties) {
        Object next;
        int i = 2 % 2;
        int i2 = onTransact + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(checknavigationbarbysystemproperties, "");
        Iterator it = CollectionsKt.listOf(new getPadBits[]{getPadBits.MYDATA, getPadBits.OPEN_BANKING, getPadBits.DEPOSIT_1WON}).iterator();
        while (true) {
            if (!it.hasNext()) {
                int i4 = onTransact + 37;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                next = null;
                break;
            }
            next = it.next();
            if (onExtraCallback(checknavigationbarbysystemproperties, (getPadBits) next)) {
                int i6 = asInterface + 45;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
        }
        return (getPadBits) next;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, Boolean bool) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(1876186990, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1876186978, new Object[]{function1, bool});
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(1950492419, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1950492413, new Object[]{function1, obj});
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(-2040512827, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 2040512843, new Object[]{function1, obj});
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(-751634191, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 751634196, new Object[]{function1, obj});
    }

    private static final PageShowPoint IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (PageShowPoint) onWarmupCompleted(-169968539, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 169968539, new Object[0]);
    }

    private final void onExtraCallbackWithResult(FragmentActivity fragmentActivity, Function1<? super Boolean, Unit> function1) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(1664648634, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1664648621, new Object[]{this, fragmentActivity, function1});
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(-1463687815, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 1463687832, new Object[]{function1, obj});
    }

    private static final Unit onNavigationEvent(Function1 function1, Throwable th) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(101109587, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -101109579, new Object[]{function1, th});
    }

    private final void onExtraCallback(View view, String str, boolean z) {
        Object[] objArr = {this, view, str, Boolean.valueOf(z)};
        onWarmupCompleted(1079527615, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1079527614, objArr);
    }

    private static final Unit onExtraCallback(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, getPadBits getpadbits, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Function1 function1, String str8, String str9, boolean z2) {
        Object[] objArr = {checknavigationbarbysystemproperties, getpadbits, fragmentActivity, str, str2, str3, str4, str5, str6, str7, Boolean.valueOf(z), function1, str8, str9, Boolean.valueOf(z2)};
        return (Unit) onWarmupCompleted(-877130789, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 877130804, objArr);
    }

    private static final boolean onNavigationEvent(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, getPadBits getpadbits) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(-979028527, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 979028529, new Object[]{checknavigationbarbysystemproperties, getpadbits})).booleanValue();
    }

    private static final Unit onWarmupCompleted(String str, NativeAdView nativeAdView) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(801970215, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -801970206, new Object[]{str, nativeAdView});
    }

    @JvmStatic
    public static final boolean IAuthTabCallbackDefault() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(1404184340, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1404184329, new Object[0])).booleanValue();
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(1109721107, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1109721093, new Object[]{function1, obj});
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(1869062494, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1869062487, new Object[]{th});
    }

    private static final Unit onWarmupCompleted(Integer num, FragmentActivity fragmentActivity, Function0 function0, Intent intent) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(73130694, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -73130676, new Object[]{num, fragmentActivity, function0, intent});
    }

    private static final Unit IAuthTabCallback(Integer num, Fragment fragment, Intent intent) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(-631862717, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 631862721, new Object[]{num, fragment, intent});
    }

    public final boolean onTransact() {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(-480293531, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, 480293534, new Object[]{this})).booleanValue();
    }

    public final void onNavigationEvent(@Nullable Activity activity, @NotNull ArrayList<Integer> arrayList, @NotNull ReactQueueConfigurationImplCompanion reactQueueConfigurationImplCompanion, @NotNull String str) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        onWarmupCompleted(393062728, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -393062718, new Object[]{this, activity, arrayList, reactQueueConfigurationImplCompanion, str});
    }

    static void asInterface() {
        IAuthTabCallbackStub = new char[]{65015, 6332, 14169, 19960, 26759, 34604, 40398, 47221, 55088, 60875, 2161, 60854, 2281, 9986, 23979, 30949, 38765, 36232, 43064, 51035, 64922, 6181, 14164, 11773, 18471, 4834, 63416, 55385, 41696, 34707, 26665, 29398, 22374, 14338, 663, 59174, 51274, 53932, 46916, 39421, 25236, 18213, 10732, 12998, 5943, 63940, 49786, 42768, 35238, 37445, 30472, 22971, 8730, 1251, 59804, 62007, 54494, 47442, 33314, 25805, 18784, 21010, 13536, 60863, 2285, 10005, 23967, 30919, 38777, 36238, 43060, 51051, 64897, 6207, 14163, 11761, 18461, 26296};
        IAuthTabCallbackDefault = 1329320707029797000L;
    }
}
