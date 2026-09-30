package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.AFj1wSDK4;
import o.Address;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.M_;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TossBundleLoader_loadBundle;
import o.access13800;
import o.access14100;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.findResAndMsg;
import o.formatMsgs;
import o.generateLink;
import o.getAdService;
import o.getExtraParameters;
import o.getPackageType;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.nSetPosition;
import o.onLoadStarted;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setAuthenticatorokhttp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setVisitUrl;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import o.varyFields;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsPointToastV2View extends ConstraintLayout {
    private static int ICustomTabsCallback = 1;
    private static int onActivityLayout = 1;
    private static int onMessageChannelReady;
    private static int readTypedObject;
    private float IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private getPackageType IAuthTabCallbackStubProxy;
    private runOnUiThreadDelayed IAuthTabCallback_Parcel;
    private final Lazy access000;
    private ViewGroup access100;
    private runOnUiThreadDelayed asBinder;
    private boolean asInterface;
    private int extraCallback;
    private final Lazy extraCallbackWithResult;
    private Function0<Unit> getInterfaceDescriptor;
    private final AFj1wSDK4 onExtraCallback;
    private final Lazy onNavigationEvent;
    private Function0<Unit> onTransact;
    private float onWarmupCompleted;
    private int writeTypedObject;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = onMessageChannelReady + 109;
        onActivityLayout = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int IAuthTabCallback(TdsPointToastV2View tdsPointToastV2View) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnPostMessage = onPostMessage(tdsPointToastV2View);
        int i4 = readTypedObject + 47;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady(attachapplovinsdk);
        int i4 = readTypedObject + 87;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unitOnMessageChannelReady;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        Ref.FloatRef floatRef = (Ref.FloatRef) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        View view = (View) objArr[3];
        MotionEvent motionEvent = (MotionEvent) objArr[4];
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(tdsPointToastV2View, floatRef, iIntValue, view, motionEvent);
        int i4 = ICustomTabsCallback + 7;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = onPostMessage(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = ICustomTabsCallback + 53;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(attachapplovinsdk);
        int i4 = ICustomTabsCallback + 15;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackStub;
    }

    public static /* synthetic */ Unit access000(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityResized = onActivityResized(attachapplovinsdk);
        int i4 = readTypedObject + 15;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityResized;
    }

    public static /* synthetic */ Unit access100(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(attachapplovinsdk);
        int i4 = readTypedObject + 37;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackDefault;
    }

    public static /* synthetic */ Unit asBinder(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return unitICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Unit asInterface(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnUnminimized = onUnminimized(attachapplovinsdk);
        int i4 = ICustomTabsCallback + 79;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnUnminimized;
        }
        throw null;
    }

    public static /* synthetic */ Unit extraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMinimized = onMinimized(attachapplovinsdk);
        int i4 = ICustomTabsCallback + 39;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return unitOnMinimized;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallbackWithResult(attachapplovinsdk);
        }
        extraCallbackWithResult(attachapplovinsdk);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onExtraCallback() {
        int iExtraCallback;
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iExtraCallback = extraCallback();
            int i3 = 36 / 0;
        } else {
            iExtraCallback = extraCallback();
        }
        int i4 = readTypedObject + 107;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return iExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return readTypedObject(tdsPointToastV2View);
        }
        readTypedObject(tdsPointToastV2View);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnActivityLayout = onActivityLayout(attachapplovinsdk);
        int i4 = ICustomTabsCallback + 33;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnActivityLayout;
    }

    public static /* synthetic */ void onExtraCallback(ViewGroup viewGroup, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(viewGroup, charSequence);
        int i4 = readTypedObject + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (Unit) onNavigationEvent(iOnNavigationEvent, 823784777, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, -823784767, new Object[]{attachapplovinsdk}, iOnNavigationEvent2);
        }
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent5 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent6 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int i3 = 2 / 0;
        return (Unit) onNavigationEvent(iOnNavigationEvent4, 823784777, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent6, -823784767, new Object[]{attachapplovinsdk}, iOnNavigationEvent5);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(attachapplovinsdk);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = readTypedObject + 83;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback(tdsPointToastV2View);
            throw null;
        }
        boolean zICustomTabsCallback = ICustomTabsCallback(tdsPointToastV2View);
        int i3 = ICustomTabsCallback + 51;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return zICustomTabsCallback;
    }

    public static /* synthetic */ int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iIntValue = ((Integer) onNavigationEvent(iOnNavigationEvent, -961357596, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 961357611, new Object[0], iOnNavigationEvent2)).intValue();
        int i4 = ICustomTabsCallback + 123;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [android.view.View, im.toss.uikit.widget.TdsPointToastV2View] */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i) | i7);
        int i9 = (~i2) | (~(i7 | i));
        int i10 = i | i2 | i7;
        int i11 = i2 + i5 + i6 + (1635157569 * i4) + ((-1141649966) * i3);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i2) - 711983104) + (488484398 * i5) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i6) + (1462763520 * i4) + (1566572544 * i3) + (1631846400 * i12);
        int i14 = (i2 * 1521345644) + 2088555610 + (i5 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i6 * 1521345871) + (i4 * (-1382509809)) + (i3 * 37969358) + (i12 * (-671350784));
        switch (i13 + (i14 * i14 * (-1069809664))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
                int i15 = 2 % 2;
                Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
                attachapplovinsdk.onExtraCallback(Imgproc.COLOR_BGR2YUV_YVYU);
                attachapplovinsdk.IAuthTabCallback(new deprecated_dns(300.0d, 27.0d));
                Unit unit = Unit.INSTANCE;
                int i16 = ICustomTabsCallback + 29;
                readTypedObject = i16 % 128;
                int i17 = i16 % 2;
                return unit;
            case 11:
                return asInterface(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return access100(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return IAuthTabCallbackStubProxy(objArr);
            case 16:
                return access000(objArr);
            default:
                final ?? r6 = (TdsPointToastV2View) objArr[0];
                int i18 = 2 % 2;
                final int scaledTouchSlop = ViewConfiguration.get(r6.getContext()).getScaledTouchSlop();
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                r6.IAuthTabCallbackStub().setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda11
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i19 = 2 % 2;
                        int i20 = onWarmupCompleted + 109;
                        onExtraCallbackWithResult = i20 % 128;
                        int i21 = i20 % 2;
                        Object[] objArr2 = {this.f$0, floatRef, Integer.valueOf(scaledTouchSlop), view, motionEvent};
                        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        boolean zBooleanValue = ((Boolean) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, 991510806, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -991510798, objArr2, iOnNavigationEvent2)).booleanValue();
                        int i22 = onExtraCallbackWithResult + 65;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        return zBooleanValue;
                    }
                });
                int i19 = ICustomTabsCallback + 109;
                readTypedObject = i19 % 128;
                int i20 = i19 % 2;
                return null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(attachapplovinsdk);
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return unitICustomTabsCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return extraCallback(tdsPointToastV2View);
        }
        extraCallback(tdsPointToastV2View);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            readTypedObject(attachapplovinsdk);
            throw null;
        }
        Unit typedObject = readTypedObject(attachapplovinsdk);
        int i3 = readTypedObject + 31;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return typedObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(iOnNavigationEvent, -575012081, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 575012095, new Object[]{attachapplovinsdk}, iOnNavigationEvent2);
        int i4 = readTypedObject + 11;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return writeTypedObject(tdsPointToastV2View);
        }
        writeTypedObject(tdsPointToastV2View);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            extraCommand(attachapplovinsdk);
            throw null;
        }
        Unit unitExtraCommand = extraCommand(attachapplovinsdk);
        int i3 = ICustomTabsCallback + 93;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return unitExtraCommand;
        }
        obj.hashCode();
        throw null;
    }

    public static final class access000 implements View.OnLayoutChangeListener {
        private static int IAuthTabCallbackDefault = 1;
        private static int onTransact;
        final /* synthetic */ ViewGroup onExtraCallback;
        final /* synthetic */ CharSequence onExtraCallbackWithResult;
        final /* synthetic */ long onNavigationEvent;
        final /* synthetic */ int onWarmupCompleted;

        public access000(CharSequence charSequence, long j, int i, ViewGroup viewGroup) {
            this.onExtraCallbackWithResult = charSequence;
            this.onNavigationEvent = j;
            this.onWarmupCompleted = i;
            this.onExtraCallback = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
            int i9 = 2 % 2;
            int i10 = IAuthTabCallbackDefault + 31;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            view.removeOnLayoutChangeListener(this);
            getPackageType getpackagetypeAccess100 = TdsPointToastV2View.access100(TdsPointToastV2View.this);
            getPackageType getpackagetypeOnExtraCallback = null;
            if (getpackagetypeAccess100 != null) {
                int i12 = IAuthTabCallbackDefault + 41;
                onTransact = i12 % 128;
                if (i12 % 2 != 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeAccess100, null, 1, null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeAccess100, null, 1, null);
                }
            }
            ConstraintLayout constraintLayout = TdsPointToastV2View.this;
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(constraintLayout);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) != null) {
                getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, TdsPointToastV2View.this.new getInterfaceDescriptor(this.onExtraCallbackWithResult, this.onNavigationEvent, this.onWarmupCompleted, this.onExtraCallback, null), 3, null);
                int i13 = IAuthTabCallbackDefault + 41;
                onTransact = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 3;
                }
            }
            Object[] objArr = {constraintLayout, getpackagetypeOnExtraCallback};
            TdsPointToastV2View.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 827363075, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -827363074, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TdsPointToastV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AFj1wSDK4 aFj1wSDK4OnWarmupCompleted = AFj1wSDK4.onWarmupCompleted(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(aFj1wSDK4OnWarmupCompleted, "");
        this.onExtraCallback = aFj1wSDK4OnWarmupCompleted;
        this.access000 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 47;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Integer numValueOf = Integer.valueOf(TdsPointToastV2View.onExtraCallback());
                if (i4 != 0) {
                    int i5 = 21 / 0;
                }
                return numValueOf;
            }
        });
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Integer numValueOf = Integer.valueOf(TdsPointToastV2View.onNavigationEvent());
                int i5 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return numValueOf;
            }
        });
        this.extraCallbackWithResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Resources.NotFoundException {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 101;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int iIAuthTabCallback = TdsPointToastV2View.IAuthTabCallback(this.f$0);
                if (i4 != 0) {
                    return Integer.valueOf(iIAuthTabCallback);
                }
                Integer.valueOf(iIAuthTabCallback);
                throw null;
            }
        });
        this.writeTypedObject = 50;
        this.onWarmupCompleted = 1.0f;
        this.IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 21;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Boolean.valueOf(TdsPointToastV2View.onExtraCallbackWithResult(this.f$0));
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(TdsPointToastV2View.onExtraCallbackWithResult(this.f$0));
                int i4 = onExtraCallback + 123;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return boolValueOf;
                }
                throw null;
            }
        });
        writeTypedObject();
        IAuthTabCallback().setTextSize(15.0f);
        IAuthTabCallback().setFont(response.SemiBold);
        AnimateText animateTextIAuthTabCallback = IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        animateTextIAuthTabCallback.setMaxTextSize(varyMatches.onNavigationEvent(25, r3));
        AnimateText animateTextIAuthTabCallback2 = IAuthTabCallback();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateTextIAuthTabCallback2.setTextColor(new getUrlokhttp(new access100(configuration)).newSessionWithExtras());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ TdsPointToastV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = readTypedObject;
            int i4 = i3 + 17;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
            int i6 = i3 + 17;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = ICustomTabsCallback + 27;
            readTypedObject = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        getPackageType getpackagetype = (getPackageType) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 3;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        tdsPointToastV2View.IAuthTabCallbackStubProxy = getpackagetype;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 27;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void IAuthTabCallback(TdsPointToastV2View tdsPointToastV2View, Function0 function0) {
        int i = 2 % 2;
        int i2 = readTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        tdsPointToastV2View.onTransact = function0;
        int i5 = i3 + 39;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 95;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        float f = tdsPointToastV2View.IAuthTabCallback;
        int i5 = i2 + 47;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(f);
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewIAuthTabCallbackDefault = tdsPointToastV2View.IAuthTabCallbackDefault();
        int i4 = ICustomTabsCallback + 7;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return tdsImageViewIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ View access000(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return tdsPointToastV2View.getInterfaceDescriptor();
        }
        tdsPointToastV2View.getInterfaceDescriptor();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 5;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        tdsPointToastV2View.IAuthTabCallback = fFloatValue;
        int i5 = i2 + 113;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ getPackageType access100(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 33;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = tdsPointToastV2View.IAuthTabCallbackStubProxy;
        int i5 = i2 + 55;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return getpackagetype;
    }

    public static final /* synthetic */ AnimateText asBinder(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            tdsPointToastV2View.IAuthTabCallback();
            throw null;
        }
        AnimateText animateTextIAuthTabCallback = tdsPointToastV2View.IAuthTabCallback();
        int i3 = ICustomTabsCallback + 45;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return animateTextIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return tdsPointToastV2View.IAuthTabCallbackStub();
        }
        tdsPointToastV2View.IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ TdsImageView asInterface(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            tdsPointToastV2View.asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsImageView tdsImageViewAsInterface = tdsPointToastV2View.asInterface();
        int i3 = readTypedObject + 63;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 64 / 0;
        }
        return tdsImageViewAsInterface;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        readTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            tdsPointToastV2View.asBinder();
            obj.hashCode();
            throw null;
        }
        TdsImageView tdsImageViewAsBinder = tdsPointToastV2View.asBinder();
        int i3 = ICustomTabsCallback + 97;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return tdsImageViewAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void extraCallbackWithResult(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        tdsPointToastV2View.readTypedObject();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 1;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    public static final /* synthetic */ Function0 getInterfaceDescriptor(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 57;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = tdsPointToastV2View.onTransact;
        if (i4 != 0) {
            int i5 = 82 / 0;
        }
        int i6 = i2 + 65;
        readTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            return function0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(TdsPointToastV2View tdsPointToastV2View, float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 65;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        tdsPointToastV2View.onWarmupCompleted = f;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 9;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ runOnUiThreadDelayed onNavigationEvent(TdsPointToastV2View tdsPointToastV2View, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 105;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback = tdsPointToastV2View.onExtraCallback(i);
        if (i4 == 0) {
            int i5 = 56 / 0;
        }
        return runonuithreaddelayedOnExtraCallback;
    }

    public static final /* synthetic */ float onTransact(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 99;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        float f = tdsPointToastV2View.onWarmupCompleted;
        int i5 = i2 + 105;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(TdsPointToastV2View tdsPointToastV2View, Function0 function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        tdsPointToastV2View.getInterfaceDescriptor = function0;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int extraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iAsInterface = M_.onExtraCallback.asInterface();
        int i4 = readTypedObject + 35;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) tdsPointToastV2View.access000.getValue()).intValue();
        int i4 = ICustomTabsCallback + 13;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        M_ m_ = M_.onExtraCallback;
        if (i3 != 0) {
            return Integer.valueOf(m_.IAuthTabCallbackStub());
        }
        m_.IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onNavigationEvent.getValue()).intValue();
        int i4 = readTypedObject + 33;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return iIntValue;
    }

    private final int IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.extraCallbackWithResult.getValue()).intValue();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int onPostMessage(TdsPointToastV2View tdsPointToastV2View) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelSize = tdsPointToastV2View.getResources().getDimensionPixelSize(R.dimen.tds_toast_top_horizontal_margin);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return dimensionPixelSize;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ long $duration;
        final /* synthetic */ CharSequence $message;
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ int $topDistance;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(CharSequence charSequence, long j, int i, ViewGroup viewGroup, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$message = charSequence;
            this.$duration = j;
            this.$topDistance = i;
            this.$parent = viewGroup;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getInterfaceDescriptor) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = TdsPointToastV2View.this.new getInterfaceDescriptor(this.$message, this.$duration, this.$topDistance, this.$parent, access13800Var);
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return getinterfacedescriptor;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                IAuthTabCallback(findresandmsg2, access13800Var2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg2, access13800Var2);
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        public static final class IAuthTabCallback implements getAdService {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Configuration IAuthTabCallback;

            public IAuthTabCallback(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                        return getSpecialFeatureOptInStatus.Light;
                    }
                    int i3 = onExtraCallbackWithResult + 71;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    if (i4 == 0) {
                        return getspecialfeatureoptinstatus;
                    }
                    obj.hashCode();
                    throw null;
                }
                readIntokhttp.onExtraCallback(this.IAuthTabCallback);
                throw null;
            }
        }

        public static final class onWarmupCompleted implements getAdService {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Configuration onExtraCallbackWithResult;

            public onWarmupCompleted(Configuration configuration) {
                this.onExtraCallbackWithResult = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                        return getSpecialFeatureOptInStatus.Dark;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = onWarmupCompleted + 123;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 11;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 19;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                AnimateText animateTextAsBinder = TdsPointToastV2View.asBinder(TdsPointToastV2View.this);
                CharSequence charSequence = this.$message;
                Context context = TdsPointToastV2View.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                int iNewSessionWithExtras = new getUrlokhttp(new IAuthTabCallback(configuration)).newSessionWithExtras();
                Context context2 = TdsPointToastV2View.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                AnimateText.onWarmupCompleted(animateTextAsBinder, charSequence, new setAuthenticatorokhttp.onNavigationEvent.onExtraCallback(iNewSessionWithExtras, new getUrlokhttp(new onWarmupCompleted(configuration2)).asBinder()), 0, false, (String) null, AnimateText.onNavigationEvent.CENTER_LEFT, (Function0) null, (Function0) null, (Function0) null, 476, (Object) null);
                TdsPointToastV2View.extraCallbackWithResult(TdsPointToastV2View.this);
                long j = this.$duration;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = TdsPointToastV2View.onNavigationEvent(TdsPointToastV2View.this, this.$topDistance);
            final ViewGroup viewGroup = this.$parent;
            final TdsPointToastV2View tdsPointToastV2View = TdsPointToastV2View.this;
            isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnNavigationEvent, (Object) null, new Function0<Unit>() { // from class: im.toss.uikit.widget.TdsPointToastV2View.getInterfaceDescriptor.3
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 27;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    onExtraCallback();
                    Unit unit = Unit.INSTANCE;
                    int i11 = onExtraCallback + 125;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unit;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final void onExtraCallback() {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 45;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    viewGroup.removeView(tdsPointToastV2View);
                    Function0 interfaceDescriptor = TdsPointToastV2View.getInterfaceDescriptor(tdsPointToastV2View);
                    if (interfaceDescriptor != null) {
                        int i11 = onWarmupCompleted + 103;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        interfaceDescriptor.invoke();
                        if (i12 != 0) {
                            int i13 = 84 / 0;
                        }
                    }
                }
            }, 1, (Object) null), false, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public static final class access100 implements getAdService {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public access100(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i2 = onWarmupCompleted + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    int i3 = onWarmupCompleted + 115;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i5 = onExtraCallback + 39;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if (r1 != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            r2 = 91 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != true) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onNavigationEvent) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = im.toss.uikit.widget.TdsPointToastV2View.onWarmupCompleted.onWarmupCompleted + 91;
            im.toss.uikit.widget.TdsPointToastV2View.onWarmupCompleted.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 41 / 0;
            }
        }
    }

    private final TdsImageView asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = this.onExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = readTypedObject + 77;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageView;
    }

    private final TdsImageView IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + Imgproc.COLOR_YUV2RGB_YVYU;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TdsImageView tdsImageView = this.onExtraCallback.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            return tdsImageView;
        }
        Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.IAuthTabCallback, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsImageView asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TdsImageView tdsImageView = this.onExtraCallback.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            return tdsImageView;
        }
        Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.onExtraCallbackWithResult, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final TdsRoundLayout IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(this.onExtraCallback.asInterface, "");
            obj.hashCode();
            throw null;
        }
        TdsRoundLayout tdsRoundLayout = this.onExtraCallback.asInterface;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        int i3 = readTypedObject + 59;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return tdsRoundLayout;
        }
        throw null;
    }

    private final View getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.onExtraCallback.onTransact;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i4 = readTypedObject + 49;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return constraintLayout;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageView = tdsPointToastV2View.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i4 = ICustomTabsCallback + 91;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return tdsImageView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AnimateText IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        AnimateText animateText = this.onExtraCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(animateText, "");
        int i4 = ICustomTabsCallback + 113;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return animateText;
    }

    private final BaseTextView access000() {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Typography6 typography6 = this.onExtraCallback.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(typography6, "");
            return typography6;
        }
        Typography6 typography62 = this.onExtraCallback.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(typography62, "");
        int i3 = 83 / 0;
        return typography62;
    }

    private final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallbackDefault.getValue()).booleanValue();
        int i4 = ICustomTabsCallback + 1;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean ICustomTabsCallback(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = tdsPointToastV2View.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resources);
        int i4 = readTypedObject + 43;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        int iIntValue;
        TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int iIntValue3 = ((Number) objArr[2]).intValue();
        int iIntValue4 = ((Number) objArr[3]).intValue();
        ViewGroup viewGroup = (ViewGroup) objArr[4];
        int i = 2 % 2;
        float f = iIntValue3;
        int i2 = (int) (14.0f * f);
        float f2 = i2 / 2.0f;
        tdsPointToastV2View.asInterface().setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
        tdsPointToastV2View.IAuthTabCallbackDefault().setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
        tdsPointToastV2View.asBinder().setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
        tdsPointToastV2View.asInterface().setPivotX(f2);
        tdsPointToastV2View.asInterface().setPivotY(f2);
        tdsPointToastV2View.IAuthTabCallbackDefault().setPivotX(f2);
        tdsPointToastV2View.IAuthTabCallbackDefault().setPivotY(f2);
        tdsPointToastV2View.asBinder().setPivotX(f2);
        tdsPointToastV2View.asBinder().setPivotY(f2);
        float f3 = f / 2.0f;
        float fOnTransact = ((tdsPointToastV2View.onTransact() + iIntValue4) + f3) - f2;
        Integer numValueOf = Integer.valueOf(viewGroup.getWidth());
        Object obj = null;
        if (numValueOf.intValue() <= 0) {
            int i3 = ICustomTabsCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i4 = ICustomTabsCallback + 63;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                numValueOf.intValue();
                obj.hashCode();
                throw null;
            }
            iIntValue = numValueOf.intValue();
        } else {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            iIntValue = ((Integer) onNavigationEvent(iOnNavigationEvent, -1647897133, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1647897135, new Object[]{tdsPointToastV2View}, iOnNavigationEvent2)).intValue();
        }
        float f4 = (iIntValue / 2.0f) - f2;
        float f5 = iIntValue2 / 2.0f;
        tdsPointToastV2View.asInterface().setX(f4 - f5);
        tdsPointToastV2View.IAuthTabCallbackDefault().setX(f4);
        tdsPointToastV2View.asBinder().setX(f4 + f5);
        tdsPointToastV2View.asInterface().setY(fOnTransact - f3);
        tdsPointToastV2View.IAuthTabCallbackDefault().setY(fOnTransact);
        tdsPointToastV2View.asBinder().setY(fOnTransact + f3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        AFj1wSDK4 aFj1wSDK4 = this.onExtraCallback;
        if (extraCallbackWithResult()) {
            aFj1wSDK4.asInterface.setElevation(0.0f);
            TdsRoundLayout tdsRoundLayout = aFj1wSDK4.asInterface;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsRoundLayout.setBackgroundColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration))}, -880609169, 880609173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        } else {
            TdsRoundLayout tdsRoundLayout2 = aFj1wSDK4.asInterface;
            Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
            tdsRoundLayout2.setElevation(varyMatches.onNavigationEvent(11, r5));
            TdsRoundLayout tdsRoundLayout3 = aFj1wSDK4.asInterface;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsRoundLayout3.setBackgroundColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onTransact(configuration2))}, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            int i4 = ICustomTabsCallback + 37;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
        }
        aFj1wSDK4.asInterface.setCornerCircular(true);
        aFj1wSDK4.asInterface.setShadowAlpha(0.0f);
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent, -1546487596, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1546487596, new Object[]{this}, iOnNavigationEvent2);
        int i6 = readTypedObject + 103;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int access000 = 1;
        private long IAuthTabCallback;
        private String onExtraCallback;
        private CharSequence onExtraCallbackWithResult;
        private final Context onNavigationEvent;
        private int onWarmupCompleted;
        private static char[] IAuthTabCallbackStub = {32627, 32623, 32619, 32616, 32545, 32564, 32634, 32626, 32632, 32565, 32628, 32630, 32629, 32636, 32559, 32611, 32566, 32617, 32631, 32638};
        private static int asInterface = -1184334053;
        private static boolean asBinder = true;
        private static boolean onTransact = true;

        public static /* synthetic */ Unit onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, TdsPointToastV2View tdsPointToastV2View, ViewGroup viewGroup, TossBundleLoader_loadBundle tossBundleLoader_loadBundle) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 69;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult, tdsPointToastV2View, viewGroup, tossBundleLoader_loadBundle);
            int i4 = access000 + 115;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallbackStub;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 76 - ((byte) KeyEvent.getModifierMetaStateMask()), 20952 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
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
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), Color.green(0) + 75, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            char c = '0';
            if (onTransact) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i5 = $11 + 93;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] * iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), KeyEvent.getDeadChar(0, 0) + 63, View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!asBinder) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $11 + 69;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] % iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted >> 1;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i7 = $10 + 81;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0) + 64, TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                c = '0';
            }
            objArr[0] = new String(cArr6);
        }

        public onExtraCallbackWithResult(@NotNull Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "");
            this.onNavigationEvent = context;
            this.IAuthTabCallback = 3000L;
            this.onExtraCallbackWithResult = _UrlKt.FRAGMENT_ENCODE_SET;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-114, -115, -125, -118, -108, -109, -119, -110, -120, -119, -111, -126, -115, -120, -117, -125, -111, -115, -117, -119, -120, -122, -112, -113, -122, -114, -115, -125, -122, -124, -115, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 127, objArr);
            this.onExtraCallback = ((String) objArr[0]).intern();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            this.onWarmupCompleted = varyMatches.onNavigationEvent(46, displayMetrics);
        }

        public final onExtraCallbackWithResult onExtraCallback(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 55;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback = j;
            if (i3 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onExtraCallbackWithResult onNavigationEvent(@NotNull CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = access000 + 111;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(charSequence, "");
                this.onExtraCallbackWithResult = charSequence;
                int i3 = 71 / 0;
            } else {
                Intrinsics.checkNotNullParameter(charSequence, "");
                this.onExtraCallbackWithResult = charSequence;
            }
            int i4 = access000 + 21;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 33 / 0;
            }
            return this;
        }

        public final onExtraCallbackWithResult onNavigationEvent(@NotNull String str) {
            int i = 2 % 2;
            int i2 = access000 + 45;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallback = str;
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            int i3 = IAuthTabCallbackDefault + 1;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final onExtraCallbackWithResult onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 35;
            int i4 = i3 % 128;
            access000 = i4;
            int i5 = i3 % 2;
            this.onWarmupCompleted = i;
            if (i5 == 0) {
                int i6 = 12 / 0;
            }
            int i7 = i4 + 55;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TdsPointToastV2View onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, Function0 function0, Function1 function1, TossBundleLoader_loadBundle tossBundleLoader_loadBundle, int i, Object obj) {
            int i2 = 2 % 2;
            Object obj2 = null;
            if ((i & 1) != 0) {
                int i3 = access000 + 83;
                IAuthTabCallbackDefault = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 17 / 0;
                }
                function0 = null;
            }
            if ((i & 2) != 0) {
                int i5 = IAuthTabCallbackDefault + 49;
                access000 = i5 % 128;
                if (i5 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                function1 = null;
            }
            if ((i & 4) != 0) {
                tossBundleLoader_loadBundle = TossBundleLoader_loadBundle.onExtraCallbackWithResult.onExtraCallback;
            }
            return onextracallbackwithresult.IAuthTabCallback(function0, function1, tossBundleLoader_loadBundle);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, TdsPointToastV2View tdsPointToastV2View, ViewGroup viewGroup, TossBundleLoader_loadBundle tossBundleLoader_loadBundle) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 31;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                tdsPointToastV2View.IAuthTabCallback(viewGroup, onextracallbackwithresult.IAuthTabCallback, onextracallbackwithresult.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallback, onextracallbackwithresult.onWarmupCompleted, tossBundleLoader_loadBundle, false);
            } else {
                tdsPointToastV2View.IAuthTabCallback(viewGroup, onextracallbackwithresult.IAuthTabCallback, onextracallbackwithresult.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallback, onextracallbackwithresult.onWarmupCompleted, tossBundleLoader_loadBundle, false);
            }
            viewGroup.addView(tdsPointToastV2View);
            return Unit.INSTANCE;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 ??, still in use, count: 1, list:
              (r6v3 ?? I:android.view.View) from 0x0105: INVOKE (r6v3 ?? I:android.view.View), (r2v13 ?? I:java.lang.Object) VIRTUAL call: android.view.View.setTag(java.lang.Object):void A[MD:(java.lang.Object):void (c)] (LINE:603)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final im.toss.uikit.widget.TdsPointToastV2View IAuthTabCallback(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 ??, still in use, count: 1, list:
              (r6v3 ?? I:android.view.View) from 0x0105: INVOKE (r6v3 ?? I:android.view.View), (r2v13 ?? I:java.lang.Object) VIRTUAL call: android.view.View.setTag(java.lang.Object):void A[MD:(java.lang.Object):void (c)] (LINE:603)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
            */
    }

    private static final boolean IAuthTabCallback(TdsPointToastV2View tdsPointToastV2View, Ref.FloatRef floatRef, int i, View view, MotionEvent motionEvent) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 23;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        boolean z = tdsPointToastV2View.asInterface;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            floatRef.element = motionEvent.getRawY();
            return true;
        }
        int i5 = readTypedObject + 17;
        ICustomTabsCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0 ? actionMasked == 1 : actionMasked == 1) {
            Function0<Unit> function0 = tdsPointToastV2View.getInterfaceDescriptor;
            if (function0 != null) {
                function0.invoke();
            }
            int i6 = ICustomTabsCallback + 43;
            readTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (actionMasked != 2) {
            return false;
        }
        float f = floatRef.element;
        float rawY = motionEvent.getRawY();
        if (tdsPointToastV2View.IAuthTabCallbackStub || f - rawY <= i) {
            return true;
        }
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent, -1012034189, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1012034196, new Object[]{tdsPointToastV2View}, iOnNavigationEvent2);
        int i7 = readTypedObject + 67;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r1 = im.toss.uikit.widget.TdsPointToastV2View.readTypedObject;
        r2 = r1 + 43;
        im.toss.uikit.widget.TdsPointToastV2View.ICustomTabsCallback = r2 % 128;
        r2 = r2 % 2;
        r2 = r13.IAuthTabCallback_Parcel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1 = r1 + 41;
        im.toss.uikit.widget.TdsPointToastV2View.ICustomTabsCallback = r1 % 128;
        r1 = r1 % 2;
        r2.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r1 = r13.onTransact();
        r2 = r13.extraCallback;
        r18 = o.pxToDp.IAuthTabCallback.onExtraCallback;
        r23 = (im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r13.IAuthTabCallbackStub(), o.isMuted.getInterfaceDescriptor(new o.AppLovinSdkSettings(), (java.lang.Float) null, java.lang.Float.valueOf((-(r1 + r2)) - r13.writeTypedObject), new im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda0(), 1, (java.lang.Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025);
        r24 = im.toss.tds.foundation.anim.rally.RallysKt.IAuthTabCallback(new im.toss.uikit.widget.TdsPointToastV2View.IAuthTabCallback(r13), o.isMuted.onExtraCallback(new o.AppLovinSdkSettings(), java.lang.Float.valueOf(1.0f), r11, new im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda1()), 0, (o.getExtraParameters) null, 0, (android.view.animation.Interpolator) null, (java.lang.Integer) null, (java.lang.Boolean) null, 0, 0, false, 2044, (java.lang.Object) null);
        r1 = r13.asInterface();
        r25 = o.deprecated_certificatePinner.onExtraCallbackWithResult;
        r0 = o.runOnUiThreadDelayed.onWarmupCompleted(im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted((android.view.View) null, r18, kotlin.collections.CollectionsKt__CollectionsKt.listOf((java.lang.Object[]) new im.toss.tds.foundation.anim.rally.Rally[]{r23, r24, (im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r1, o.isMuted.onNavigationEvent((o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r25.onNavigationEvent()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368), (java.lang.Float) null, r11, (kotlin.jvm.functions.Function1) null, 5, (java.lang.Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025), (im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r13.IAuthTabCallbackDefault(), o.isMuted.onNavigationEvent((o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r25.onNavigationEvent()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368), (java.lang.Float) null, r11, (kotlin.jvm.functions.Function1) null, 5, (java.lang.Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025), (im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r13.asBinder(), o.isMuted.onNavigationEvent((o.AppLovinSdkSettings) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r25.onNavigationEvent()}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -26725365, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 26725368), (java.lang.Float) null, r11, (kotlin.jvm.functions.Function1) null, 5, (java.lang.Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025)}), 0, (o.getExtraParameters) null, 0, (android.view.animation.Interpolator) null, (java.lang.Integer) null, (java.lang.Boolean) null, 0, 0, false, 4089, (java.lang.Object) null), (java.lang.Object) null, new im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda2(r13), 1, (java.lang.Object) null);
        r13.asBinder = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0243, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0245, code lost:
    
        r1 = im.toss.uikit.widget.TdsPointToastV2View.readTypedObject + 113;
        im.toss.uikit.widget.TdsPointToastV2View.ICustomTabsCallback = r1 % 128;
        r1 = r1 % 2;
        r0 = o.isFireOS.onExtraCallbackWithResult(r0, false, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0256, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r13.IAuthTabCallbackStub == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r13.IAuthTabCallbackStub == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        final TdsPointToastV2View tdsPointToastV2View = (TdsPointToastV2View) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 67;
        ICustomTabsCallback = i2 % 128;
        Float fValueOf = i2 % 2 == 0 ? Float.valueOf(0.0f) : Float.valueOf(0.0f);
    }

    private static final Unit extraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 47;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class IAuthTabCallback implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        IAuthTabCallback() {
        }

        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            if (i3 == 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            int i4 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TdsPointToastV2View.access000(TdsPointToastV2View.this).setAlpha(f);
            Object[] objArr = {TdsPointToastV2View.this};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((TdsRoundLayout) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, 1281724631, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1281724622, objArr, iOnNavigationEvent2)).setShadowAlpha(f);
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit ICustomTabsCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 93;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit readTypedObject(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        ViewGroup viewGroup = tdsPointToastV2View.access100;
        if (viewGroup != null) {
            int i2 = readTypedObject + 85;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.removeView(tdsPointToastV2View);
            int i4 = readTypedObject + 59;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        Function0<Unit> function0 = tdsPointToastV2View.onTransact;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final Pair<Integer, Integer> IAuthTabCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = 0;
        if (StringsKt__StringsKt.isBlank(charSequence)) {
            return new Pair<>(0, 0);
        }
        StaticLayout staticLayoutOnNavigationEvent = onNavigationEvent(this, charSequence, access000(), 0, 4, null);
        int lineCount = staticLayoutOnNavigationEvent.getLineCount();
        int iCeil = 0;
        while (i2 < lineCount) {
            int i3 = ICustomTabsCallback + 75;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                staticLayoutOnNavigationEvent.getLineWidth(i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float lineWidth = staticLayoutOnNavigationEvent.getLineWidth(i2);
            if (lineWidth > iCeil) {
                iCeil = (int) Math.ceil(lineWidth);
            }
            i2++;
            int i4 = readTypedObject + 3;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return new Pair<>(Integer.valueOf(iCeil), Integer.valueOf(staticLayoutOnNavigationEvent.getHeight()));
    }

    static /* synthetic */ StaticLayout onNavigationEvent(TdsPointToastV2View tdsPointToastV2View, CharSequence charSequence, BaseTextView baseTextView, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 51;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            i = (((Integer) onNavigationEvent(iOnNavigationEvent, -1647897133, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1647897135, new Object[]{tdsPointToastV2View}, iOnNavigationEvent2)).intValue() - tdsPointToastV2View.IAuthTabCallback_Parcel()) - tdsPointToastV2View.IAuthTabCallback_Parcel();
        }
        StaticLayout staticLayoutIAuthTabCallback = tdsPointToastV2View.IAuthTabCallback(charSequence, baseTextView, i);
        int i5 = readTypedObject + 125;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return staticLayoutIAuthTabCallback;
    }

    private final StaticLayout IAuthTabCallback(CharSequence charSequence, BaseTextView baseTextView, int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 21;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), baseTextView.getPaint(), i).setIncludePad(baseTextView.getIncludeFontPadding()).setLineSpacing(baseTextView.getLineSpacingExtra(), baseTextView.getLineSpacingMultiplier()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        return staticLayoutBuild;
    }

    private static final void onNavigationEvent(ViewGroup viewGroup, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            viewGroup.announceForAccessibility(charSequence.toString());
            int i4 = readTypedObject + 33;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0044 A[PHI: r2 r3 r4 r5 r6
      0x0044: PHI (r2v5 java.lang.Float) = (r2v4 java.lang.Float), (r2v11 java.lang.Float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r3v3 java.lang.Float) = (r3v2 java.lang.Float), (r3v16 java.lang.Float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r4v2 java.lang.Float) = (r4v1 java.lang.Float), (r4v7 java.lang.Float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r5v3 java.lang.Float) = (r5v2 java.lang.Float), (r5v12 java.lang.Float) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r6v1 o.runOnUiThreadDelayed) = (r6v0 o.runOnUiThreadDelayed), (r6v7 o.runOnUiThreadDelayed) binds: [B:8:0x0042, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void readTypedObject() {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        runOnUiThreadDelayed runonuithreaddelayed;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 39;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(0.6f);
            fValueOf2 = Float.valueOf(0.4f);
            fValueOf3 = Float.valueOf(2.0f);
            fValueOf4 = Float.valueOf(0.0f);
            runonuithreaddelayed = this.IAuthTabCallback_Parcel;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
        } else {
            fValueOf = Float.valueOf(0.6f);
            fValueOf2 = Float.valueOf(0.4f);
            fValueOf3 = Float.valueOf(1.0f);
            fValueOf4 = Float.valueOf(0.0f);
            runonuithreaddelayed = this.IAuthTabCallback_Parcel;
            if (runonuithreaddelayed != null) {
            }
        }
        Float f = fValueOf4;
        Float f2 = fValueOf2;
        Float f3 = fValueOf3;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{IAuthTabCallbackStub(), isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), (Float) null, f, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitAccess000 = TdsPointToastV2View.access000((attachAppLovinSdk) obj);
                int i6 = onExtraCallback + 43;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitAccess000;
            }
        }, 1, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        Object[] objArr = {RallysKt.IAuthTabCallback(new IAuthTabCallbackDefault(), isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(getInterfaceDescriptor().getAlpha()), f3, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 11;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallbackStubProxy = TdsPointToastV2View.IAuthTabCallbackStubProxy((attachAppLovinSdk) obj);
                if (i5 == 0) {
                    int i6 = 19 / 0;
                }
                return unitIAuthTabCallbackStubProxy;
            }
        }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), null, new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda17
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 33;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = TdsPointToastV2View.onWarmupCompleted(this.f$0);
                int i6 = onExtraCallback + 3;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return unitOnWarmupCompleted;
            }
        }, 1, null};
        Rally rally2 = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 2128644226);
        Rally rallyIAuthTabCallback = RallysKt.IAuthTabCallback(new asInterface(), isMuted.onTransact(isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(asInterface().getAlpha()), f2, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda18
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitAsBinder = TdsPointToastV2View.asBinder((attachAppLovinSdk) obj);
                int i6 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitAsBinder;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), Float.valueOf(asInterface().getScaleX()), fValueOf, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda19
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 99;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitAsInterface = TdsPointToastV2View.asInterface((attachAppLovinSdk) obj);
                if (i5 == 0) {
                    int i6 = 30 / 0;
                }
                int i7 = onExtraCallback + 71;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    return unitAsInterface;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyIAuthTabCallback2 = RallysKt.IAuthTabCallback(new IAuthTabCallbackStubProxy(), isMuted.onTransact(isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(IAuthTabCallbackDefault().getAlpha()), f2, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda20
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 91;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback_Parcel = TdsPointToastV2View.IAuthTabCallback_Parcel((attachAppLovinSdk) obj);
                if (i5 != 0) {
                    int i6 = 74 / 0;
                }
                int i7 = onNavigationEvent + 21;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return unitIAuthTabCallback_Parcel;
            }
        }), Float.valueOf(IAuthTabCallbackDefault().getScaleX()), fValueOf, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                Unit unit = (Unit) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, -1587832196, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1587832201, new Object[]{(attachAppLovinSdk) obj}, iOnNavigationEvent2);
                int i6 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyIAuthTabCallback3 = RallysKt.IAuthTabCallback(new IAuthTabCallbackStub(), isMuted.onTransact(isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(asBinder().getAlpha()), f2, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitAccess100 = TdsPointToastV2View.access100((attachAppLovinSdk) obj);
                int i6 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return unitAccess100;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), Float.valueOf(asBinder().getScaleX()), fValueOf, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda23
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 17;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnTransact = TdsPointToastV2View.onTransact((attachAppLovinSdk) obj);
                int i6 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return unitOnTransact;
            }
        }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        Rally rallyIAuthTabCallback4 = RallysKt.IAuthTabCallback(new asBinder(), isMuted.onExtraCallback(isMuted.onTransact(new AppLovinSdkSettings(), Float.valueOf(this.IAuthTabCallback), f3, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = TdsPointToastV2View.onWarmupCompleted((attachAppLovinSdk) obj);
                int i6 = onNavigationEvent + 125;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitOnWarmupCompleted;
            }
        }), Float.valueOf(this.onWarmupCompleted), f, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 95;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = TdsPointToastV2View.IAuthTabCallback((attachAppLovinSdk) obj);
                int i6 = IAuthTabCallback + 53;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null);
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        this.IAuthTabCallback_Parcel = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{rally, rally2, rallyIAuthTabCallback, rallyIAuthTabCallback2, rallyIAuthTabCallback3, rallyIAuthTabCallback4, (Rally) RallysKt.onWarmupCompleted(new Object[]{(TdsImageView) onNavigationEvent(iOnNavigationEvent, -1634721559, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1634721562, new Object[]{this}, iOnNavigationEvent2), isMuted.onExtraCallback(isMuted.onExtraCallbackWithResult((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), f, Float.valueOf(360.0f), new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 65;
                onNavigationEvent = i4 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i4 % 2 != 0) {
                    return TdsPointToastV2View.extraCallback(attachapplovinsdk);
                }
                TdsPointToastV2View.extraCallback(attachapplovinsdk);
                throw null;
            }
        }), f, f3, new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallback = TdsPointToastV2View.onExtraCallback((attachAppLovinSdk) obj);
                int i6 = onExtraCallbackWithResult + 87;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unitOnExtraCallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.TRUE, 0, 0L, false, 3833, (Object) null), false, 1, (Object) null);
        int i3 = readTypedObject + 49;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onActivityResized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(new deprecated_dns(300.0d, 21.0d));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 59;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallbackDefault() {
        }

        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            if (i3 == 0) {
                int i4 = 83 / 0;
            }
            int i5 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                TdsPointToastV2View.access000(TdsPointToastV2View.this).setAlpha(f);
                Object[] objArr = {TdsPointToastV2View.this};
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                ((TdsRoundLayout) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, 1281724631, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1281724622, objArr, iOnNavigationEvent2)).setShadowAlpha(f);
                int i3 = 94 / 0;
            } else {
                TdsPointToastV2View.access000(TdsPointToastV2View.this).setAlpha(f);
                Object[] objArr2 = {TdsPointToastV2View.this};
                int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                ((TdsRoundLayout) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent3, 1281724631, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1281724622, objArr2, iOnNavigationEvent4)).setShadowAlpha(f);
            }
            int i4 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onPostMessage(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.asBinder());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.asBinder());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit writeTypedObject(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        tdsPointToastV2View.asInterface = true;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 9;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class asInterface implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        asInterface() {
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            super.onExtraCallbackWithResult(f);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 == 0) {
                int i4 = 99 / 0;
            }
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            TdsPointToastV2View.asInterface(TdsPointToastV2View.this).setAlpha(i2 % 2 != 0 ? f / TdsPointToastV2View.onTransact(TdsPointToastV2View.this) : f * TdsPointToastV2View.onTransact(TdsPointToastV2View.this));
        }

        public void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TdsImageView tdsImageViewAsInterface = TdsPointToastV2View.asInterface(TdsPointToastV2View.this);
            Object[] objArr = {TdsPointToastV2View.this};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            tdsImageViewAsInterface.setScaleX(((Float) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, -543203825, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 543203831, objArr, iOnNavigationEvent2)).floatValue() * f);
            TdsImageView tdsImageViewAsInterface2 = TdsPointToastV2View.asInterface(TdsPointToastV2View.this);
            Object[] objArr2 = {TdsPointToastV2View.this};
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            tdsImageViewAsInterface2.setScaleY(((Float) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent3, -543203825, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 543203831, objArr2, iOnNavigationEvent4)).floatValue() * f);
            int i4 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit ICustomTabsCallbackStubProxy(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(1000);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 25;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return unit;
    }

    private static final Unit onUnminimized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(50);
        attachapplovinsdk.IAuthTabCallback(new deprecated_dns(300.0d, 27.0d));
        Unit unit = Unit.INSTANCE;
        int i2 = readTypedObject + 37;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackStubProxy implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallbackStubProxy() {
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onWarmupCompleted + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            int i4 = IAuthTabCallback + 103;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void onNavigationEvent(float f) {
            TdsImageView tdsImageView;
            float fOnTransact;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {TdsPointToastV2View.this};
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                tdsImageView = (TdsImageView) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, 1450766716, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1450766704, objArr, iOnNavigationEvent2);
                fOnTransact = f % TdsPointToastV2View.onTransact(TdsPointToastV2View.this);
            } else {
                Object[] objArr2 = {TdsPointToastV2View.this};
                int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                tdsImageView = (TdsImageView) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent3, 1450766716, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1450766704, objArr2, iOnNavigationEvent4);
                fOnTransact = f * TdsPointToastV2View.onTransact(TdsPointToastV2View.this);
            }
            tdsImageView.setAlpha(fOnTransact);
            int i3 = IAuthTabCallback + 9;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {TdsPointToastV2View.this};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            TdsImageView tdsImageView = (TdsImageView) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, 1450766716, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1450766704, objArr, iOnNavigationEvent2);
            Object[] objArr2 = {TdsPointToastV2View.this};
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            tdsImageView.setScaleX(((Float) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent3, -543203825, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 543203831, objArr2, iOnNavigationEvent4)).floatValue() * f);
            Object[] objArr3 = {TdsPointToastV2View.this};
            int iOnNavigationEvent5 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent6 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            TdsImageView tdsImageView2 = (TdsImageView) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent5, 1450766716, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1450766704, objArr3, iOnNavigationEvent6);
            Object[] objArr4 = {TdsPointToastV2View.this};
            int iOnNavigationEvent7 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent8 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            tdsImageView2.setScaleY(((Float) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent7, -543203825, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 543203831, objArr4, iOnNavigationEvent8)).floatValue() * f);
            int i4 = IAuthTabCallback + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit ICustomTabsCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(200);
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.IAuthTabCallback(1000);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 123;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class IAuthTabCallbackStub implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallbackStub() {
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            if (i3 != 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = IAuthTabCallback + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            super.onWarmupCompleted(f);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {TdsPointToastV2View.this};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((TdsImageView) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, -1460733584, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1460733595, objArr, iOnNavigationEvent2)).setAlpha(f * TdsPointToastV2View.onTransact(TdsPointToastV2View.this));
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {TdsPointToastV2View.this};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            TdsImageView tdsImageView = (TdsImageView) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, -1460733584, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1460733595, objArr, iOnNavigationEvent2);
            Object[] objArr2 = {TdsPointToastV2View.this};
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            tdsImageView.setScaleX(((Float) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent3, -543203825, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 543203831, objArr2, iOnNavigationEvent4)).floatValue() * f);
            Object[] objArr3 = {TdsPointToastV2View.this};
            int iOnNavigationEvent5 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent6 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            TdsImageView tdsImageView2 = (TdsImageView) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent5, -1460733584, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1460733595, objArr3, iOnNavigationEvent6);
            Object[] objArr4 = {TdsPointToastV2View.this};
            int iOnNavigationEvent7 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent8 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            tdsImageView2.setScaleY(((Float) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent7, -543203825, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 543203831, objArr4, iOnNavigationEvent8)).floatValue() * f);
            int i4 = onWarmupCompleted + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private static final Unit ICustomTabsCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int i;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 9;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.onExtraCallback(10897);
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 8098;
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.onExtraCallback(400);
            attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
            i = 1000;
        }
        attachapplovinsdk.IAuthTabCallback(i);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.onExtraCallback(250);
        attachapplovinsdk.IAuthTabCallback(new deprecated_dns(300.0d, 27.0d));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 43;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public static final class asBinder implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        asBinder() {
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            if (i3 != 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onExtraCallback + 73;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 != 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TdsPointToastV2View.onExtraCallback(TdsPointToastV2View.this, f);
            if (i3 != 0) {
                throw null;
            }
        }

        public void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {TdsPointToastV2View.this, Float.valueOf(f)};
                TdsPointToastV2View.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 918762119, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -918762103, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
                return;
            }
            Object[] objArr2 = {TdsPointToastV2View.this, Float.valueOf(f)};
            TdsPointToastV2View.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 918762119, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -918762103, objArr2, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            int i3 = 44 / 0;
        }
    }

    private static final Unit extraCommand(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 105;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        int i3 = readTypedObject + 79;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onMessageChannelReady(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(Address.onNavigationEvent.asBinder());
        attachapplovinsdk.onExtraCallback(500);
        attachapplovinsdk.IAuthTabCallback(1200);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onMinimized(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback((Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.4f), Float.valueOf(1.32f), Float.valueOf(0.62f), Float.valueOf(1.06f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131));
        attachapplovinsdk.IAuthTabCallback(1000);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 25;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onActivityLayout(attachAppLovinSdk attachapplovinsdk) {
        deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.onExtraCallback(16469);
            deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult();
        } else {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.onExtraCallback(Imgproc.COLOR_BGR2YUV_YVYU);
            deprecated_dnsVarOnExtraCallbackWithResult = deprecated_certificatePinner.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
        attachapplovinsdk.IAuthTabCallback(deprecated_dnsVarOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 113;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit readTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 47;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onNavigationEvent implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        onNavigationEvent() {
        }

        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            int i4 = IAuthTabCallback + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onExtraCallback + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = IAuthTabCallback + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            if (i3 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            if (i3 == 0) {
                throw null;
            }
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TdsPointToastV2View.access000(TdsPointToastV2View.this).setAlpha(f);
            Object[] objArr = {TdsPointToastV2View.this};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((TdsRoundLayout) TdsPointToastV2View.onNavigationEvent(iOnNavigationEvent, 1281724631, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1281724622, objArr, iOnNavigationEvent2)).setShadowAlpha(f);
            int i4 = IAuthTabCallback + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit writeTypedObject(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 7;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit extraCallback(TdsPointToastV2View tdsPointToastV2View) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        tdsPointToastV2View.IAuthTabCallbackStub = true;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 89;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final runOnUiThreadDelayed onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = readTypedObject;
        int i4 = i3 + 105;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.asBinder;
        if (runonuithreaddelayed != null) {
            int i6 = i3 + 65;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = runOnUiThreadDelayed.onNavigationEvent(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{IAuthTabCallbackStub(), isMuted.getInterfaceDescriptor(new AppLovinSdkSettings(), (Float) null, Float.valueOf((-(onTransact() + i)) - this.writeTypedObject), new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 87;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnNavigationEvent = TdsPointToastV2View.onNavigationEvent((attachAppLovinSdk) obj);
                int i11 = onNavigationEvent + 7;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), RallysKt.IAuthTabCallback(new onNavigationEvent(), isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(1.0f), Float.valueOf(0.0f), new Function1() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 27;
                onNavigationEvent = i9 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i9 % 2 == 0) {
                    return TdsPointToastV2View.onExtraCallbackWithResult(attachapplovinsdk);
                }
                TdsPointToastV2View.onExtraCallbackWithResult(attachapplovinsdk);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 113;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnNavigationEvent = TdsPointToastV2View.onNavigationEvent(this.f$0);
                int i11 = IAuthTabCallback + 103;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, (Object) null);
        this.asBinder = runonuithreaddelayedOnNavigationEvent;
        Intrinsics.checkNotNull(runonuithreaddelayedOnNavigationEvent);
        return runonuithreaddelayedOnNavigationEvent;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final ViewGroup viewGroup, long j, @NotNull final CharSequence charSequence, @NotNull String str, int i, @NotNull TossBundleLoader_loadBundle tossBundleLoader_loadBundle, boolean z) {
        runOnUiThreadDelayed runonuithreaddelayed;
        int i2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 87;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tossBundleLoader_loadBundle, "");
        getPackageType getpackagetypeOnExtraCallback = null;
        if ((this.asInterface || this.IAuthTabCallbackStub) && (runonuithreaddelayed = this.asBinder) != null) {
            int i6 = ICustomTabsCallback + 101;
            readTypedObject = i6 % 128;
            if (i6 % 2 != 0) {
                runonuithreaddelayed.onNavigationEvent();
                getpackagetypeOnExtraCallback.hashCode();
                throw null;
            }
            runonuithreaddelayed.onNavigationEvent();
        }
        this.access100 = viewGroup;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (varyFields.onWarmupCompleted(context)) {
            viewGroup.post(new Runnable() { // from class: im.toss.uikit.widget.TdsPointToastV2View$$ExternalSyntheticLambda10
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // java.lang.Runnable
                public final void run() {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    TdsPointToastV2View.onExtraCallback(viewGroup, charSequence);
                    int i10 = onExtraCallbackWithResult + 49;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                }
            });
        }
        int iIntValue = ((Integer) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1647897133, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1647897135, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).intValue();
        int iIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int iIAuthTabCallback_Parcel2 = IAuthTabCallback_Parcel();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = ((iIntValue - iIAuthTabCallback_Parcel) - iIAuthTabCallback_Parcel2) - varyMatches.onNavigationEvent(60, displayMetrics);
        Pair<Integer, Integer> pairIAuthTabCallback = IAuthTabCallback(charSequence);
        int iIntValue2 = pairIAuthTabCallback.onExtraCallbackWithResult().intValue();
        int iIntValue3 = pairIAuthTabCallback.IAuthTabCallback().intValue();
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(36, displayMetrics2);
        DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = iIntValue3 + varyMatches.onNavigationEvent(24, displayMetrics3);
        if (iIntValue2 >= iOnNavigationEvent) {
            AnimateText animateTextIAuthTabCallback = IAuthTabCallback();
            ViewGroup.LayoutParams layoutParams = animateTextIAuthTabCallback.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iOnNavigationEvent;
            animateTextIAuthTabCallback.setLayoutParams(layoutParams);
        } else {
            AnimateText animateTextIAuthTabCallback2 = IAuthTabCallback();
            ViewGroup.LayoutParams layoutParams2 = animateTextIAuthTabCallback2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            animateTextIAuthTabCallback2.setLayoutParams(layoutParams2);
        }
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -288295433, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 288295446, new Object[]{this, Integer.valueOf(iOnNavigationEvent2 + iIntValue2), Integer.valueOf(iOnNavigationEvent3), Integer.valueOf(i), viewGroup}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        this.writeTypedObject = iOnNavigationEvent3;
        IAuthTabCallbackStub().setMaxWidth((((Integer) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1647897133, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1647897135, new Object[]{this}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).intValue() - IAuthTabCallback_Parcel()) - IAuthTabCallback_Parcel());
        this.extraCallback = i;
        int iOnTransact = onTransact() + i;
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(IAuthTabCallbackStub(), iOnTransact);
        if (!(!z)) {
            int i7 = ICustomTabsCallback + 21;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            if (Intrinsics.areEqual(tossBundleLoader_loadBundle, TossBundleLoader_loadBundle.onExtraCallbackWithResult.onExtraCallback)) {
                int i9 = ICustomTabsCallback + 103;
                readTypedObject = i9 % 128;
                if (i9 % 2 != 0) {
                    IAuthTabCallback().extraCallbackWithResult();
                    throw null;
                }
                IAuthTabCallback().extraCallbackWithResult();
            } else {
                IAuthTabCallbackStub().setTranslationY((-iOnTransact) - iOnNavigationEvent3);
            }
        }
        if (StringsKt__StringsKt.isBlank(str)) {
            i2 = 1;
        } else {
            int i10 = ICustomTabsCallback + 109;
            readTypedObject = i10 % 128;
            if (i10 % 2 != 0) {
                TdsImageView tdsImageView = this.onExtraCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
                i2 = 1;
                TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 120, (Object) null);
            } else {
                i2 = 1;
                TdsImageView tdsImageView2 = this.onExtraCallback.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsImageView2, "");
                TdsImageView.setImage$default(tdsImageView2, str, (Function1) null, (Function1) null, 6, (Object) null);
            }
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new access000(charSequence, j, i, viewGroup));
            return;
        }
        getPackageType getpackagetypeAccess100 = access100(this);
        if (getpackagetypeAccess100 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeAccess100, null, i2, null);
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i11 = readTypedObject + 83;
            ICustomTabsCallback = i11 % 128;
            if (i11 % 2 == 0) {
                TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                getpackagetypeOnExtraCallback.hashCode();
                throw null;
            }
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new getInterfaceDescriptor(charSequence, j, i, viewGroup, null), 3, null);
            }
        }
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 827363075, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -827363074, new Object[]{this, getpackagetypeOnExtraCallback}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
        int i12 = readTypedObject + 11;
        ICustomTabsCallback = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(TdsPointToastV2View tdsPointToastV2View, Ref.FloatRef floatRef, int i, View view, MotionEvent motionEvent) {
        Object[] objArr = {tdsPointToastV2View, floatRef, Integer.valueOf(i), view, motionEvent};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onNavigationEvent(iOnNavigationEvent, 991510806, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -991510798, objArr, iOnNavigationEvent2)).booleanValue();
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(iOnNavigationEvent, -1587832196, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1587832201, new Object[]{attachapplovinsdk}, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(iOnNavigationEvent, 1204093388, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, -1204093384, new Object[]{attachapplovinsdk}, iOnNavigationEvent2);
    }

    public static final /* synthetic */ float IAuthTabCallbackStub(TdsPointToastV2View tdsPointToastV2View) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Float) onNavigationEvent(iOnNavigationEvent, -543203825, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 543203831, new Object[]{tdsPointToastV2View}, iOnNavigationEvent2)).floatValue();
    }

    public static final /* synthetic */ TdsImageView IAuthTabCallbackDefault(TdsPointToastV2View tdsPointToastV2View) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (TdsImageView) onNavigationEvent(iOnNavigationEvent, -1460733584, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1460733595, new Object[]{tdsPointToastV2View}, iOnNavigationEvent2);
    }

    public static final /* synthetic */ TdsImageView IAuthTabCallback_Parcel(TdsPointToastV2View tdsPointToastV2View) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (TdsImageView) onNavigationEvent(iOnNavigationEvent, 1450766716, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, -1450766704, new Object[]{tdsPointToastV2View}, iOnNavigationEvent2);
    }

    public static final /* synthetic */ TdsRoundLayout IAuthTabCallbackStubProxy(TdsPointToastV2View tdsPointToastV2View) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (TdsRoundLayout) onNavigationEvent(iOnNavigationEvent, 1281724631, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, -1281724622, new Object[]{tdsPointToastV2View}, iOnNavigationEvent2);
    }

    public static final /* synthetic */ void onNavigationEvent(TdsPointToastV2View tdsPointToastV2View, float f) {
        Object[] objArr = {tdsPointToastV2View, Float.valueOf(f)};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent, 918762119, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -918762103, objArr, iOnNavigationEvent2);
    }

    public static final /* synthetic */ void IAuthTabCallback(TdsPointToastV2View tdsPointToastV2View, getPackageType getpackagetype) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent, 827363075, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, -827363074, new Object[]{tdsPointToastV2View, getpackagetype}, iOnNavigationEvent2);
    }

    private static final int onExtraCallbackWithResult() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Integer) onNavigationEvent(iOnNavigationEvent, -961357596, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 961357611, new Object[0], iOnNavigationEvent2)).intValue();
    }

    private final TdsImageView IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (TdsImageView) onNavigationEvent(iOnNavigationEvent, -1634721559, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1634721562, new Object[]{this}, iOnNavigationEvent2);
    }

    private final int access100() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Integer) onNavigationEvent(iOnNavigationEvent, -1647897133, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1647897135, new Object[]{this}, iOnNavigationEvent2)).intValue();
    }

    private final void onExtraCallback(int i, int i2, int i3, ViewGroup viewGroup) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), viewGroup};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent, -288295433, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 288295446, objArr, iOnNavigationEvent2);
    }

    private final void ICustomTabsCallback() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent, -1546487596, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1546487596, new Object[]{this}, iOnNavigationEvent2);
    }

    private static final Unit onRelationshipValidationResult(attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(iOnNavigationEvent, 823784777, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, -823784767, new Object[]{attachapplovinsdk}, iOnNavigationEvent2);
    }

    private static final Unit mayLaunchUrl(attachAppLovinSdk attachapplovinsdk) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(iOnNavigationEvent, -575012081, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 575012095, new Object[]{attachapplovinsdk}, iOnNavigationEvent2);
    }

    public final void onWarmupCompleted() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(iOnNavigationEvent, -1012034189, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent3, 1012034196, new Object[]{this}, iOnNavigationEvent2);
    }
}
