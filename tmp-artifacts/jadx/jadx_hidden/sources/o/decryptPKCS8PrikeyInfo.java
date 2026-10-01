package o;

import android.content.pm.PackageManager;
import android.view.ViewConfiguration;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.base.UIKitBaseActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PKCS58;
import o.s3c;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.dev.overlay.ScreenInfoOverlayController$Companion$;

/* loaded from: classes.dex */
public final class decryptPKCS8PrikeyInfo implements AppLovinExceptionHandler {
    private static boolean onExtraCallbackWithResult;
    private final PKCS58 IAuthTabCallback;
    private final boolean onExtraCallback;
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(decryptPKCS8PrikeyInfo.class);
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onWarmupCompleted = 8;

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i6);
        int i8 = ~((~i6) | i5);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i5) | i6));
        int i11 = i6 + i5 + i4 + (762724209 * i3) + (1201824936 * i2);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i6) + 43253760 + (1339426419 * i5) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i4) + (1302855680 * i3) + (1514143744 * i2) + (1905524736 * i12);
        int i14 = ((i6 * 162561953) - 555857873) + (i5 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i4 * 162560975) + (i3 * 701011807) + (i2 * 237771736) + (i12 * (-223608832));
        return i13 + ((i14 * i14) * 703332352) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private decryptPKCS8PrikeyInfo(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r5, o.L_ r6) {
        /*
            r4 = this;
            r4.<init>()
            o.zzad r0 = o.zzaj.onNavigationEvent()
            boolean r0 = r0.MediaBrowserCompatMediaItem()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L34
            o.zzad r0 = o.zzaj.onNavigationEvent()
            boolean r0 = r0.onActivityLayout()
            r0 = r0 ^ r2
            if (r0 == r2) goto L1b
            goto L34
        L1b:
            r0 = 629(0x275, float:8.81E-43)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
            o.zzad r0 = o.zzaj.onNavigationEvent()
            boolean r0 = r0.RemoteActionCompatParcelizer()
            r0 = r0 ^ r2
            if (r0 == r2) goto L2c
            goto L34
        L2c:
            r0 = 2336(0x920, float:3.273E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
            int r1 = r1 % r1
            r0 = 0
            goto L3b
        L34:
            r0 = 3656(0xe48, float:5.123E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
            int r1 = r1 % r1
            r0 = r2
        L3b:
            r4.onExtraCallback = r0
            o.PKCS58 r0 = new o.PKCS58
            r0.<init>(r5, r6)
            int r5 = o.decryptPKCS8PrikeyInfo.onNavigationEvent
            r6 = 2782(0xade, float:3.898E-42)
            int r6 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r6)
            int r1 = ~r6
            r1 = r1 & r5
            int r5 = ~r5
            r5 = r5 & r6
            r6 = r1 ^ r5
            r5 = r5 & r1
            r5 = r5 | r6
            int r5 = r5 >> 15
            r5 = r5 & r2
            r6 = 0
            r4.IAuthTabCallback = r0
            if (r5 == 0) goto L6f
            int r5 = o.decryptPKCS8PrikeyInfo.onNavigationEvent
            r0 = 3887(0xf2f, float:5.447E-42)
            int r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
            r1 = r5 & r0
            int r3 = ~r1
            r5 = r5 ^ r0
            r5 = r5 | r1
            r5 = r5 & r3
            int r5 = r5 >> 23
            r5 = r5 & r2
            if (r5 != 0) goto L6e
            return
        L6e:
            throw r6
        L6f:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.decryptPKCS8PrikeyInfo.<init>(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, o.L_):void");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(832);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 23) & 1;
        Object obj = null;
        onExtraCallbackWithResult = zBooleanValue;
        if (i4 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
        boolean z = onExtraCallbackWithResult;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(601);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 14) & 1) != 0) {
            return Boolean.valueOf(z);
        }
        int i5 = 93 / 0;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public decryptPKCS8PrikeyInfo(@NotNull UIKitBaseActivity uIKitBaseActivity) {
        this(uIKitBaseActivity, uIKitBaseActivity);
        Intrinsics.checkNotNullParameter(uIKitBaseActivity, "");
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 7837;
        private static int asBinder = 1;
        private static char onExtraCallback = 20007;
        private static char onExtraCallbackWithResult = 48343;
        private static char onNavigationEvent = 11369;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Unit onNavigationEvent(deInitialize deinitialize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(deinitialize);
            int i4 = asBinder + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 59 / 0;
                if (decryptPKCS8PrikeyInfo.IAuthTabCallback()) {
                    return;
                }
            } else if (decryptPKCS8PrikeyInfo.IAuthTabCallback()) {
                return;
            }
            decryptPKCS8PrikeyInfo.onExtraCallbackWithResult(true);
            GetFeatureExtension.onWarmupCompleted.onNavigationEvent(new ScreenInfoOverlayController$Companion$.ExternalSyntheticLambda0());
            int i4 = onWarmupCompleted + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final Unit IAuthTabCallback(deInitialize deinitialize) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(deinitialize, "");
            GetAttributeExtension getAttributeExtensionOnExtraCallback = GetDetectableSize.onExtraCallback(deinitialize);
            if (getAttributeExtensionOnExtraCallback.onExtraCallback()) {
                int i4 = asBinder + 95;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    PKCS58.onNavigationEvent onnavigationevent = PKCS58.Companion;
                    getAttributeExtensionOnExtraCallback.onNavigationEvent();
                    getAttributeExtensionOnExtraCallback.onWarmupCompleted();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                PKCS58.onNavigationEvent onnavigationevent2 = PKCS58.Companion;
                String strOnNavigationEvent = getAttributeExtensionOnExtraCallback.onNavigationEvent();
                String strOnWarmupCompleted = getAttributeExtensionOnExtraCallback.onWarmupCompleted();
                if (strOnWarmupCompleted == null) {
                    Object[] objArr = new Object[1];
                    a(new char[]{7658, 39589, 51836, 45772}, 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                    strOnWarmupCompleted = ((String) objArr[0]).intern();
                }
                Map<String, ? extends Object> mapOnExtraCallbackWithResult = getAttributeExtensionOnExtraCallback.onExtraCallbackWithResult();
                if (mapOnExtraCallbackWithResult == null) {
                    mapOnExtraCallbackWithResult = access8100.onNavigationEvent();
                }
                onnavigationevent2.onWarmupCompleted(strOnNavigationEvent, strOnWarmupCompleted, mapOnExtraCallbackWithResult);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = asBinder + 105;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 58 / 0;
            }
            return unit;
        }

        private static void a(char[] cArr, int i, Object[] objArr) {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i3 = $11 + 117;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
                } else {
                    cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                }
                int i4 = $11 + 107;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 58224;
                for (int i7 = 0; i7 < 16; i7++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char C = AppNode5.C(c, (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), c2 >>> 5, onExtraCallback);
                    cArr3[1] = C;
                    cArr3[0] = AppNode5.C(cArr3[0], (C + i6) ^ ((C << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L))), C >>> 5, onExtraCallbackWithResult);
                    i6 -= 40503;
                }
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public void onExtraCallbackWithResult() throws PackageManager.NameNotFoundException {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
        if (this.onExtraCallback) {
            Companion.IAuthTabCallback();
            this.IAuthTabCallback.onExtraCallbackWithResult();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(601);
            return;
        }
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5772);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 2) & 1) != 0) {
            int i5 = 64 / 0;
        }
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3679);
        if (this.onExtraCallback) {
            this.IAuthTabCallback.onExtraCallback();
            int i2 = onNavigationEvent;
            int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
            if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 16) & 1) != 0) {
                throw null;
            }
            return;
        }
        int i3 = onNavigationEvent;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
        int i4 = (~iOnWarmupCompleted2) & i3;
        int i5 = (~i3) & iOnWarmupCompleted2;
        if (((((i5 & i4) | (i4 ^ i5)) >> 6) & 1) == 0) {
            int i6 = 76 / 0;
        }
    }

    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3045);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        Object obj = null;
        if (((((i4 & i3) | (i3 ^ i4)) >> 8) & 1) != 0) {
            if (!this.onExtraCallback) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
                return;
            }
            this.IAuthTabCallback.onWarmupCompleted();
            int i5 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
            if ((((((~i5) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i5)) >> 22) & 1) != 0) {
                throw null;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(new Object[0], iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -1528806533, 1528806534)).booleanValue();
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onNavigationEvent(objArr, iOnWarmupCompleted, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, -2142921204, 2142921204);
    }
}
