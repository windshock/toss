package o;

import android.content.res.AssetManager;
import android.graphics.Point;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.geometry.RectKt;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import im.toss.tds.graphics.gl.compose.RenderObject;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonContextMenuAreaKtExternalSyntheticLambda7;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.basic;
import o.findExistingCallWithHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class findExistingCallWithHost {
    private static int extraCallbackWithResult = 1;
    private static int writeTypedObject;
    private Integer IAuthTabCallback;
    private final View IAuthTabCallbackDefault;
    private final AtomicBoolean IAuthTabCallbackStub;
    private CookieJarCompanion IAuthTabCallbackStubProxy;
    private final deprecated_hostOnly IAuthTabCallback_Parcel;
    private Credentials access000;
    private final getSupportsTlsExtensionsokhttp access100;
    private final Function0<Unit> asBinder;
    private final CommonContextMenuAreaKtExternalSyntheticLambda7 asInterface;
    private final String extraCallback;
    private final deprecated_persistent getInterfaceDescriptor;
    private final loadForRequest onExtraCallback;
    private secure onExtraCallbackWithResult;
    private final AtomicBoolean onNavigationEvent;
    private CookieJarCompanionNoCookies onTransact;
    private final int onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = (~(i7 | i4)) | i3;
        int i9 = ~i4;
        int i10 = i7 | i3;
        int i11 = (~(i6 | i9 | i3)) | (~(i10 | i4));
        int i12 = (~i10) | (~(i9 | (~i3)));
        int i13 = i3 + i4 + i + (1353909401 * i2) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i3) + 799145984 + ((-1483212659) * i4) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i) + (337379328 * i2) + ((-1540358144) * i5) + (669122560 * i14);
        int i16 = ((i3 * 521834465) - 1171472169) + (i4 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i * 521834041) + (i2 * 1123214353) + (i5 * (-684621612)) + (i14 * 1028784128);
        switch (i15 + (i16 * i16 * 1635647488)) {
            case 1:
                CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent = (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) objArr[0];
                int i17 = 2 % 2;
                int i18 = extraCallbackWithResult + 21;
                writeTypedObject = i18 % 128;
                if (i18 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(onnavigationevent, "");
                } else {
                    Intrinsics.checkNotNullParameter(onnavigationevent, "");
                }
                CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent, (Function1) null, 1, (Object) null);
                return Unit.INSTANCE;
            case 2:
                CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent2 = (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) objArr[0];
                int i19 = 2 % 2;
                int i20 = writeTypedObject + 29;
                extraCallbackWithResult = i20 % 128;
                if (i20 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(onnavigationevent2, "");
                } else {
                    Intrinsics.checkNotNullParameter(onnavigationevent2, "");
                }
                CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent2, (Function1) null, 1, (Object) null);
                return Unit.INSTANCE;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent3 = (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) objArr[0];
                int i21 = 2 % 2;
                int i22 = writeTypedObject + 71;
                extraCallbackWithResult = i22 % 128;
                if (i22 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(onnavigationevent3, "");
                    CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent3, (Function1) null, 0, (Object) null);
                } else {
                    Intrinsics.checkNotNullParameter(onnavigationevent3, "");
                    CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent3, (Function1) null, 1, (Object) null);
                }
                Unit unit = Unit.INSTANCE;
                int i23 = extraCallbackWithResult + 65;
                writeTypedObject = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 7:
                return onNavigationEvent(objArr);
            case 8:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RenderObject renderObject = (RenderObject) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(renderObject);
        }
        onExtraCallbackWithResult(renderObject);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(findExistingCallWithHost findexistingcallwithhost) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(findexistingcallwithhost);
        int i4 = extraCallbackWithResult + 75;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ void IAuthTabCallback(findExistingCallWithHost findexistingcallwithhost, String str, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 832529043, -832529035, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{findexistingcallwithhost, str, Float.valueOf(f)});
            throw null;
        }
        IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 832529043, -832529035, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{findexistingcallwithhost, str, Float.valueOf(f)});
        int i3 = extraCallbackWithResult + 43;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(findExistingCallWithHost findexistingcallwithhost, String str, basic.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(findexistingcallwithhost, str, onnavigationevent);
        int i4 = writeTypedObject + 17;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 105;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(onnavigationevent);
        int i4 = writeTypedObject + 103;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess000;
        }
        throw null;
    }

    public static /* synthetic */ Unit asInterface(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            return (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -648697141, 648697147, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent});
        }
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 908807272, -908807270, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent});
        int i4 = extraCallbackWithResult + 17;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent = (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 518970464, -518970463, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent});
        int i4 = extraCallbackWithResult + 31;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(onnavigationevent);
        int i4 = writeTypedObject + 53;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(findExistingCallWithHost findexistingcallwithhost, String str, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(findexistingcallwithhost, str, f, f2, f3);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 107;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(onnavigationevent);
        int i4 = writeTypedObject + 9;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(findExistingCallWithHost findexistingcallwithhost) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        asInterface(findexistingcallwithhost);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        findExistingCallWithHost findexistingcallwithhost = (findExistingCallWithHost) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(findexistingcallwithhost, str);
        int i4 = writeTypedObject + 91;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(onnavigationevent);
        int i4 = writeTypedObject + 87;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(findExistingCallWithHost findexistingcallwithhost, String str, basic.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(findexistingcallwithhost, str, onwarmupcompleted);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 125;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public findExistingCallWithHost(@NotNull View view, int i, @NotNull String str, @NotNull AssetManager assetManager, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(assetManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallbackDefault = view;
        this.onWarmupCompleted = i;
        this.extraCallback = str;
        this.asBinder = function0;
        this.IAuthTabCallback_Parcel = new deprecated_hostOnly(assetManager);
        this.getInterfaceDescriptor = new deprecated_persistent();
        this.access100 = new getSupportsTlsExtensionsokhttp();
        this.onExtraCallback = new loadForRequest();
        CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7 = new CommonContextMenuAreaKtExternalSyntheticLambda7((Function0) null, (Function1) null, 3, (DefaultConstructorMarker) null);
        commonContextMenuAreaKtExternalSyntheticLambda7.IAuthTabCallback("BlurCore-View");
        this.asInterface = commonContextMenuAreaKtExternalSyntheticLambda7;
        this.IAuthTabCallbackStub = new AtomicBoolean(false);
        this.onNavigationEvent = new AtomicBoolean(false);
        onExtraCallbackWithResult();
    }

    public static final /* synthetic */ CookieJarCompanion onExtraCallback(findExistingCallWithHost findexistingcallwithhost) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 115;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        CookieJarCompanion cookieJarCompanion = findexistingcallwithhost.IAuthTabCallbackStubProxy;
        int i5 = i2 + 39;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return cookieJarCompanion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ CommonContextMenuAreaKtExternalSyntheticLambda7 onExtraCallbackWithResult(findExistingCallWithHost findexistingcallwithhost) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 105;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7 = findexistingcallwithhost.asInterface;
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        int i6 = i2 + 17;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 43 / 0;
        }
        return commonContextMenuAreaKtExternalSyntheticLambda7;
    }

    public static final /* synthetic */ View onWarmupCompleted(findExistingCallWithHost findexistingcallwithhost) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        View view = findexistingcallwithhost.IAuthTabCallbackDefault;
        int i5 = i3 + 105;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    private static final void asInterface(findExistingCallWithHost findexistingcallwithhost) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RenderCommand.IAuthTabCallback.onExtraCallbackWithResult();
        findexistingcallwithhost.access100.onExtraCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(findExistingCallWithHost findexistingcallwithhost) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0 ? !(!findexistingcallwithhost.onNavigationEvent.compareAndSet(false, true)) : findexistingcallwithhost.onNavigationEvent.compareAndSet(false, false)) {
            findexistingcallwithhost.asBinder.invoke();
        }
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = findexistingcallwithhost.onTransact;
        if (cookieJarCompanionNoCookies == null) {
            int i3 = writeTypedObject + 23;
            extraCallbackWithResult = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 7;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnExtraCallback = findExistingCallWithHost.onExtraCallback((CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj2);
                if (i6 == 0) {
                    int i7 = 71 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 59;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onExtraCallbackWithResult implements r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final float onExtraCallbackWithResult;
        private final float onWarmupCompleted = 1.0f;

        onExtraCallbackWithResult(int i) {
            this.onExtraCallbackWithResult = i / 160.0f;
        }

        public /* bridge */ float IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                super.IAuthTabCallback(f);
                throw null;
            }
            float fIAuthTabCallback = super.IAuthTabCallback(f);
            int i3 = IAuthTabCallback + 79;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return fIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public /* bridge */ int a_(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iA_ = super.a_(j);
            int i4 = IAuthTabCallback + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iA_;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ long b_(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return super.b_(j);
            }
            super.b_(j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ float c_(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            float fC_ = super.c_(i);
            int i5 = onNavigationEvent + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return fC_;
        }

        public /* bridge */ float c_(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            float fC_ = super.c_(j);
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
            return fC_;
        }

        public /* bridge */ long d_(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            long jD_ = super.d_(j);
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return jD_;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ float e_(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float fE_ = super/*o.ExtensionsManagerExternalSyntheticLambda0*/.e_(j);
            int i4 = onNavigationEvent + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 69 / 0;
            }
            return fE_;
        }

        public /* bridge */ float onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            float fOnExtraCallback = super.onExtraCallback(f);
            if (i3 == 0) {
                int i4 = 19 / 0;
            }
            return fOnExtraCallback;
        }

        public /* bridge */ int onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return super.onExtraCallbackWithResult(f);
            }
            super.onExtraCallbackWithResult(f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ long onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            long jOnNavigationEvent = super/*o.ExtensionsManagerExternalSyntheticLambda0*/.onNavigationEvent(f);
            int i4 = onNavigationEvent + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return jOnNavigationEvent;
        }

        public /* bridge */ long onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            long jOnWarmupCompleted = super.onWarmupCompleted(f);
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return jOnWarmupCompleted;
        }

        public float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 83 / 0;
            }
            return f;
        }

        public float onNavigationEvent() {
            float f;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 57;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                f = this.onWarmupCompleted;
                int i4 = 96 / 0;
            } else {
                f = this.onWarmupCompleted;
            }
            int i5 = i2 + 23;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
            return f;
        }
    }

    public static final class IAuthTabCallback implements ViewTreeObserver.OnGlobalLayoutListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onGlobalLayout() {
            CookieJarCompanion cookieJarCompanionOnExtraCallback;
            int i = 2 % 2;
            if (findExistingCallWithHost.onWarmupCompleted(findExistingCallWithHost.this).getWidth() <= 0 || findExistingCallWithHost.onWarmupCompleted(findExistingCallWithHost.this).getHeight() <= 0) {
                return;
            }
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                findExistingCallWithHost.onWarmupCompleted(findExistingCallWithHost.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                cookieJarCompanionOnExtraCallback = findExistingCallWithHost.onExtraCallback(findExistingCallWithHost.this);
                int i3 = 56 / 0;
                if (cookieJarCompanionOnExtraCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = onExtraCallbackWithResult + 75;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    cookieJarCompanionOnExtraCallback = null;
                }
            } else {
                findExistingCallWithHost.onWarmupCompleted(findExistingCallWithHost.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                cookieJarCompanionOnExtraCallback = findExistingCallWithHost.onExtraCallback(findExistingCallWithHost.this);
                if (cookieJarCompanionOnExtraCallback == null) {
                }
            }
            Object[] objArr = {cookieJarCompanionOnExtraCallback, findExistingCallWithHost.onExtraCallbackWithResult(findExistingCallWithHost.this)};
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            CookieJarCompanion.onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), objArr, 1830662025, -1830662022, iOnNavigationEvent);
        }
    }

    private final void onWarmupCompleted() {
        CookieJarCompanion cookieJarCompanion;
        Credentials credentials;
        int i = 2 % 2;
        this.asInterface.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 63;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    findExistingCallWithHost.onNavigationEvent(this.f$0);
                    int i4 = 59 / 0;
                } else {
                    findExistingCallWithHost.onNavigationEvent(this.f$0);
                }
                int i5 = onExtraCallback + 63;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 82 / 0;
                }
            }
        });
        Credentials credentials2 = new Credentials(this.IAuthTabCallback_Parcel, this.access100, this.getInterfaceDescriptor);
        this.access000 = credentials2;
        CookieJarCompanion cookieJarCompanion2 = new CookieJarCompanion(this.IAuthTabCallbackDefault, this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor, credentials2, this.onWarmupCompleted, this.extraCallback, new Function0() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 117;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                findExistingCallWithHost findexistingcallwithhost = this.f$0;
                if (i4 == 0) {
                    return findExistingCallWithHost.IAuthTabCallback(findexistingcallwithhost);
                }
                findExistingCallWithHost.IAuthTabCallback(findexistingcallwithhost);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.IAuthTabCallbackStubProxy = cookieJarCompanion2;
        cookieJarCompanion2.onNavigationEvent(this.IAuthTabCallback);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.IAuthTabCallbackDefault.getResources().getDisplayMetrics().densityDpi);
        loadForRequest loadforrequest = this.onExtraCallback;
        CookieJarCompanion cookieJarCompanion3 = this.IAuthTabCallbackStubProxy;
        CookieJarCompanion cookieJarCompanion4 = null;
        if (cookieJarCompanion3 == null) {
            int i2 = extraCallbackWithResult + 39;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = writeTypedObject + 25;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            cookieJarCompanion = null;
        } else {
            cookieJarCompanion = cookieJarCompanion3;
        }
        Credentials credentials3 = this.access000;
        if (credentials3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            credentials = null;
        } else {
            credentials = credentials3;
        }
        secure secureVar = new secure(onextracallbackwithresult, loadforrequest, cookieJarCompanion, credentials, this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor);
        this.onExtraCallbackWithResult = secureVar;
        this.onTransact = new CookieJarCompanionNoCookies(secureVar, this.asInterface);
        if (this.IAuthTabCallbackDefault.getWidth() != 0) {
            int i6 = extraCallbackWithResult + 57;
            writeTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                this.IAuthTabCallbackDefault.getHeight();
                throw null;
            }
            if (this.IAuthTabCallbackDefault.getHeight() != 0) {
                CookieJarCompanion cookieJarCompanion5 = this.IAuthTabCallbackStubProxy;
                if (cookieJarCompanion5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    cookieJarCompanion4 = cookieJarCompanion5;
                }
                CookieJarCompanion.onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{cookieJarCompanion4, this.asInterface}, 1830662025, -1830662022, RNSScreenManagerDelegate.onNavigationEvent());
                return;
            }
        }
        this.IAuthTabCallbackDefault.getViewTreeObserver().addOnGlobalLayoutListener(new IAuthTabCallback());
    }

    public static final class onWarmupCompleted implements View.OnAttachStateChangeListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
            int i5 = onExtraCallback + 103;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
        }

        onWarmupCompleted() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Object[] objArr = {findExistingCallWithHost.this};
            findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1156102849, 1156102856, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr);
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackStub.compareAndSet(false, true)) {
            onWarmupCompleted();
            this.IAuthTabCallbackDefault.addOnAttachStateChangeListener(new onWarmupCompleted());
            int i2 = writeTypedObject + 37;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = writeTypedObject + 117;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(RenderObject renderObject) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(renderObject, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(renderObject, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RenderObject onWarmupCompleted(@NotNull String str, @NotNull Surface surface, @NotNull Point point) {
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        writeTypedObject = i2 % 128;
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(surface, "");
            Intrinsics.checkNotNullParameter(point, "");
            cookieJarCompanionNoCookies = this.onTransact;
            int i3 = 30 / 0;
            if (cookieJarCompanionNoCookies == null) {
                int i4 = extraCallbackWithResult + 3;
                writeTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i5 = 55 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                cookieJarCompanionNoCookies = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(surface, "");
            Intrinsics.checkNotNullParameter(point, "");
            cookieJarCompanionNoCookies = this.onTransact;
            if (cookieJarCompanionNoCookies == null) {
            }
        }
        RenderObject renderObjectIAuthTabCallback = cookieJarCompanionNoCookies.IAuthTabCallback(str);
        if (renderObjectIAuthTabCallback != null) {
            return renderObjectIAuthTabCallback;
        }
        RenderObject.Companion companion = RenderObject.Companion;
        CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7 = this.asInterface;
        long jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
        float f = point.x;
        float f2 = point.y;
        RenderObject renderObjectOnExtraCallback = companion.onExtraCallback(str, commonContextMenuAreaKtExternalSyntheticLambda7, surface, RectKt.IAuthTabCallback(jIAuthTabCallback, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L))));
        renderObjectOnExtraCallback.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 31;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                Unit unit = (Unit) findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 178663019, -178663014, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{(RenderObject) obj});
                int i9 = IAuthTabCallback + 37;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
        });
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies3 = this.onTransact;
        if (cookieJarCompanionNoCookies3 == null) {
            int i6 = extraCallbackWithResult + 11;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            cookieJarCompanionNoCookies2 = cookieJarCompanionNoCookies3;
        }
        cookieJarCompanionNoCookies2.onExtraCallback(renderObjectOnExtraCallback);
        return renderObjectOnExtraCallback;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = this.onTransact;
        if (cookieJarCompanionNoCookies == null) {
            int i4 = extraCallbackWithResult + 1;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                int i6 = 66 / 0;
            }
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.onExtraCallback(str);
        int i7 = writeTypedObject + 27;
        extraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 91 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull String str, float f, float f2) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = this.onTransact;
        if (cookieJarCompanionNoCookies == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = writeTypedObject + 29;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.IAuthTabCallback(str, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull deprecated_secure deprecated_secureVar) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        extraCallbackWithResult = i2 % 128;
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
            cookieJarCompanionNoCookies.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deprecated_secureVar, "");
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies2 = this.onTransact;
        if (cookieJarCompanionNoCookies2 == null) {
            int i3 = writeTypedObject + 67;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 == 0) {
                throw null;
            }
        } else {
            cookieJarCompanionNoCookies = cookieJarCompanionNoCookies2;
        }
        cookieJarCompanionNoCookies.onNavigationEvent(str, deprecated_secureVar);
        int i5 = writeTypedObject + 3;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable Integer num) {
        int i = 2 % 2;
        this.IAuthTabCallback = num;
        CookieJarCompanion cookieJarCompanion = this.IAuthTabCallbackStubProxy;
        Object obj = null;
        if (cookieJarCompanion != null) {
            int i2 = extraCallbackWithResult + 57;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (cookieJarCompanion == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cookieJarCompanion = null;
            }
            cookieJarCompanion.onNavigationEvent(num);
        }
        int i3 = writeTypedObject + 99;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(findExistingCallWithHost findexistingcallwithhost, String str, basic.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        secure secureVar = findexistingcallwithhost.onExtraCallbackWithResult;
        if (secureVar == null) {
            int i2 = extraCallbackWithResult + 75;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            int i4 = writeTypedObject + 11;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            secureVar = null;
        }
        secure.onWarmupCompleted(915914795, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -915914795, new Object[]{secureVar, str, onwarmupcompleted});
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final findExistingCallWithHost findexistingcallwithhost = (findExistingCallWithHost) objArr[0];
        final String str = (String) objArr[1];
        final basic.onWarmupCompleted onwarmupcompleted = (basic.onWarmupCompleted) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        findexistingcallwithhost.asInterface.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 99;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findExistingCallWithHost.onWarmupCompleted(this.f$0, str, onwarmupcompleted);
                int i5 = onExtraCallback + 71;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = findexistingcallwithhost.onTransact;
        Object obj = null;
        if (cookieJarCompanionNoCookies == null) {
            int i2 = extraCallbackWithResult + 121;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                int i4 = 53 / 0;
            }
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda14
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 69;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                Unit unitAsInterface = findExistingCallWithHost.asInterface((CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj2);
                if (i7 == 0) {
                    int i8 = 39 / 0;
                }
                int i9 = onWarmupCompleted + 93;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 71 / 0;
                }
                return unitAsInterface;
            }
        });
        int i5 = writeTypedObject + 51;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(findExistingCallWithHost findexistingcallwithhost, String str, basic.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        secure secureVar = findexistingcallwithhost.onExtraCallbackWithResult;
        if (secureVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = extraCallbackWithResult + 63;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            secureVar = null;
        }
        secureVar.onNavigationEvent(str, onnavigationevent);
    }

    private static final Unit IAuthTabCallbackStubProxy(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Object obj = null;
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent, (Function1) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 35;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull final String str, @Nullable final basic.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    findExistingCallWithHost.IAuthTabCallback(this.f$0, str, onnavigationevent);
                    throw null;
                }
                findExistingCallWithHost.IAuthTabCallback(this.f$0, str, onnavigationevent);
                int i4 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = this.onTransact;
        if (cookieJarCompanionNoCookies == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = extraCallbackWithResult + 21;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i5 % 128;
                CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent2 = (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj;
                if (i5 % 2 == 0) {
                    return findExistingCallWithHost.onExtraCallbackWithResult(onnavigationevent2);
                }
                findExistingCallWithHost.onExtraCallbackWithResult(onnavigationevent2);
                throw null;
            }
        });
        int i4 = extraCallbackWithResult + 117;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = null;
        if (i2 % 2 == 0) {
            CookieJarCompanion cookieJarCompanion = this.IAuthTabCallbackStubProxy;
            if (cookieJarCompanion == null) {
                int i4 = i3 + 77;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                cookieJarCompanion = null;
            }
            cookieJarCompanion.onExtraCallback(true);
            CookieJarCompanionNoCookies cookieJarCompanionNoCookies2 = this.onTransact;
            if (cookieJarCompanionNoCookies2 == null) {
                int i6 = extraCallbackWithResult + 63;
                writeTypedObject = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                cookieJarCompanionNoCookies = cookieJarCompanionNoCookies2;
            }
            cookieJarCompanionNoCookies.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda12
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i9 % 128;
                    CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent = (CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj;
                    if (i9 % 2 != 0) {
                        findExistingCallWithHost.onWarmupCompleted(onnavigationevent);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = findExistingCallWithHost.onWarmupCompleted(onnavigationevent);
                    int i10 = onExtraCallbackWithResult + 125;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 61 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            });
            return;
        }
        cookieJarCompanionNoCookies.hashCode();
        throw null;
    }

    private static final Unit onTransact(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 43;
        writeTypedObject = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            i = 0;
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            i = 1;
        }
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent, (Function1) null, i, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 25;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        secure secureVar;
        findExistingCallWithHost findexistingcallwithhost = (findExistingCallWithHost) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            secure secureVar2 = findexistingcallwithhost.onExtraCallbackWithResult;
            throw null;
        }
        secure secureVar3 = findexistingcallwithhost.onExtraCallbackWithResult;
        if (secureVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            secureVar = null;
        } else {
            secureVar = secureVar3;
        }
        secure.onNavigationEvent(secureVar, str, fFloatValue, 0.0f, 0.0f, 12, null);
        int i3 = writeTypedObject + 93;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static final Unit getInterfaceDescriptor(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 23;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            i = 0;
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            i = 1;
        }
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent, (Function1) null, i, (Object) null);
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@NotNull final String str, final float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 73;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                findExistingCallWithHost findexistingcallwithhost = this.f$0;
                if (i4 != 0) {
                    findExistingCallWithHost.IAuthTabCallback(findexistingcallwithhost, str, f);
                    return;
                }
                findExistingCallWithHost.IAuthTabCallback(findexistingcallwithhost, str, f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = this.onTransact;
        if (cookieJarCompanionNoCookies == null) {
            int i2 = extraCallbackWithResult + 81;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 111;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnNavigationEvent = findExistingCallWithHost.onNavigationEvent((CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj);
                int i7 = onWarmupCompleted + 125;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return unitOnNavigationEvent;
            }
        });
        int i4 = extraCallbackWithResult + 125;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(findExistingCallWithHost findexistingcallwithhost, String str, float f, float f2, float f3) {
        secure secureVar;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        secure secureVar2 = findexistingcallwithhost.onExtraCallbackWithResult;
        if (secureVar2 == null) {
            int i5 = i3 + 79;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
            secureVar = null;
        } else {
            secureVar = secureVar2;
        }
        secure.IAuthTabCallback(secureVar, str, f, f2, f3, 0.0f, 16, null);
    }

    private static final Unit access000(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent.onWarmupCompleted(onnavigationevent, (Function1) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 81;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onWarmupCompleted(@NotNull final String str, final float f, final float f2, final float f3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda10
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 107;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    findExistingCallWithHost.onExtraCallbackWithResult(this.f$0, str, f, f2, f3);
                    throw null;
                }
                findExistingCallWithHost.onExtraCallbackWithResult(this.f$0, str, f, f2, f3);
                int i4 = onNavigationEvent + 51;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = this.onTransact;
        if (cookieJarCompanionNoCookies == null) {
            int i2 = extraCallbackWithResult + 45;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = writeTypedObject + 115;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 85;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitAsBinder = findExistingCallWithHost.asBinder((CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj);
                if (i8 == 0) {
                    int i9 = 98 / 0;
                }
                int i10 = onExtraCallback + 13;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    return unitAsBinder;
                }
                throw null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(findExistingCallWithHost findexistingcallwithhost, String str) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        secure secureVar = findexistingcallwithhost.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 85 / 0;
            if (secureVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = extraCallbackWithResult + 117;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                secureVar = null;
            }
        } else if (secureVar == null) {
        }
        secureVar.IAuthTabCallback(str);
    }

    public final void onExtraCallbackWithResult(@NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.asInterface.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findExistingCallWithHost findexistingcallwithhost = this.f$0;
                if (i4 != 0) {
                    Object[] objArr = {findexistingcallwithhost, str};
                    findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1978006661, 1978006664, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr);
                } else {
                    Object[] objArr2 = {findexistingcallwithhost, str};
                    findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1978006661, 1978006664, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr2);
                    throw null;
                }
            }
        });
        CookieJarCompanionNoCookies cookieJarCompanionNoCookies = this.onTransact;
        if (cookieJarCompanionNoCookies == null) {
            int i2 = writeTypedObject + 67;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = extraCallbackWithResult + 9;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            cookieJarCompanionNoCookies = null;
        }
        cookieJarCompanionNoCookies.onWarmupCompleted(new Function1() { // from class: im.toss.tds.graphics.gl.view.ViewUiLayerRenderer$$ExternalSyntheticLambda9
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 45;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                Unit unit = (Unit) findExistingCallWithHost.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 94862728, -94862724, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent) obj2});
                int i9 = onExtraCallback + 19;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
        });
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findExistingCallWithHost findexistingcallwithhost = (findExistingCallWithHost) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0 ? findexistingcallwithhost.IAuthTabCallbackStub.compareAndSet(true, false) : findexistingcallwithhost.IAuthTabCallbackStub.compareAndSet(false, false)) {
            CookieJarCompanionNoCookies cookieJarCompanionNoCookies = findexistingcallwithhost.onTransact;
            if (cookieJarCompanionNoCookies == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cookieJarCompanionNoCookies = null;
            }
            CookieJarCompanionNoCookies.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1836639166, new Object[]{cookieJarCompanionNoCookies}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1836639167);
            CookieJarCompanion cookieJarCompanion = findexistingcallwithhost.IAuthTabCallbackStubProxy;
            if (cookieJarCompanion == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = writeTypedObject + 55;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                cookieJarCompanion = null;
            }
            cookieJarCompanion.onExtraCallback();
            CommonContextMenuAreaKtExternalSyntheticLambda7.IAuthTabCallback(findexistingcallwithhost.asInterface, true, (Function1) null, 2, (Object) null);
            int i5 = extraCallbackWithResult + 117;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = extraCallbackWithResult + 41;
        writeTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(findExistingCallWithHost findexistingcallwithhost, String str) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1978006661, 1978006664, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{findexistingcallwithhost, str});
    }

    public static /* synthetic */ Unit IAuthTabCallback(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 94862728, -94862724, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent});
    }

    public static /* synthetic */ Unit onExtraCallback(RenderObject renderObject) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 178663019, -178663014, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{renderObject});
    }

    private static final Unit IAuthTabCallbackStub(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 518970464, -518970463, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent});
    }

    private static final Unit IAuthTabCallbackDefault(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 908807272, -908807270, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent});
    }

    private static final void onExtraCallback(findExistingCallWithHost findexistingcallwithhost, String str, float f) {
        Object[] objArr = {findexistingcallwithhost, str, Float.valueOf(f)};
        IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 832529043, -832529035, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr);
    }

    private static final Unit IAuthTabCallback_Parcel(CommonContextMenuAreaKtExternalSyntheticLambda7.onNavigationEvent onnavigationevent) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -648697141, 648697147, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{onnavigationevent});
    }

    public final void onExtraCallback() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1156102849, 1156102856, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{this});
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable basic.onWarmupCompleted onwarmupcompleted) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1103942702, -1103942702, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, str, onwarmupcompleted});
    }
}
