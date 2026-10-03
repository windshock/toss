package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ASN1OutputStream;
import o.attachAdComponentViewApi;
import o.deserializeUriNullableCollection;
import o.forceDomainCheck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ASN1OutputStream extends isTestMode {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallback;
    private static int ICustomTabsCallback = 1;
    private static char extraCallback = 0;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static int onMessageChannelReady = 1;
    private static int onMinimized;
    private static int readTypedObject;
    private static char[] writeTypedObject;
    private S2SRewardedVideoAdExtendedListener IAuthTabCallbackDefault;
    private final Rmipmap<Boolean> IAuthTabCallbackStub;
    private final Rmipmap<Boolean> IAuthTabCallbackStubProxy;
    private final LiveData<Throwable> IAuthTabCallback_Parcel;
    private String access000;
    private final LiveData<Boolean> access100;
    private List<VideoStartReason> asBinder;
    private int asInterface;
    private final LiveData<attachAdComponentViewApi> extraCallbackWithResult;
    private String getInterfaceDescriptor;
    private final Lazy onNavigationEvent;
    private final Rmipmap<attachAdComponentViewApi> onTransact;
    private final Rmipmap<Throwable> onWarmupCompleted;

    static {
        writeTypedObject();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 0, 22, 14, 14, 24, 22, '\r', 16, 20, 15, 24, 5, 18, '\f', 14, 14, 3, '\f', 20}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 69), Color.argb(0, 0, 0, 0) + 20, objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{'\n', 0, 22, 14, 14, 24, 22, '\r', 19, 23, 5, 19, '\t', 1, 2, 6, 24, '\n', 20, 4, 6, '\r', 11, 14, 2, 18, 18, 6, 16, '\n', 13900, 13900, 0, 14, 13899}, (byte) (TextUtils.getOffsetAfter("", 0) + 78), TextUtils.indexOf((CharSequence) "", '0', 0) + 36, objArr2);
        onExtraCallback = ((String) objArr2[0]).intern();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallback = 8;
        int i = onMessageChannelReady + 95;
        onMinimized = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ checkNavigationBarBySystemProperties IAuthTabCallback(ASN1OutputStream aSN1OutputStream) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnNavigationEvent = onNavigationEvent(aSN1OutputStream);
        int i4 = readTypedObject + 121;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return checknavigationbarbysystempropertiesOnNavigationEvent;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(ASN1OutputStream aSN1OutputStream, List list) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            deserializeip = (deserializeIp) onNavigationEvent(503182340, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -503182331, new Object[]{aSN1OutputStream, list}, iIAuthTabCallback3);
            int i3 = 57 / 0;
        } else {
            int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
            deserializeip = (deserializeIp) onNavigationEvent(503182340, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback5, -503182331, new Object[]{aSN1OutputStream, list}, iIAuthTabCallback6);
        }
        int i4 = ICustomTabsCallback + 43;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return deserializeip;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }

    public static /* synthetic */ deserializeIp IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            return (deserializeIp) onNavigationEvent(1820524241, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1820524230, new Object[]{function1, obj}, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(aSN1OutputStream, th);
        }
        onNavigationEvent(aSN1OutputStream, th);
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        access100(function1, obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = ICustomTabsCallback + 61;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ASN1OutputStream aSN1OutputStream, Throwable th) {
        int i = 2 % 2;
        int i2 = readTypedObject + 95;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(aSN1OutputStream, th);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(aSN1OutputStream, th);
        int i3 = readTypedObject + 109;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ASN1OutputStream aSN1OutputStream, List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(aSN1OutputStream, list);
        }
        onExtraCallback(aSN1OutputStream, list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ASN1OutputStream aSN1OutputStream, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 103;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(aSN1OutputStream, deserializeurinullablecollection);
        int i4 = ICustomTabsCallback + 71;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            onNavigationEvent(1205901072, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1205901065, new Object[]{function1, obj}, iIAuthTabCallback3);
            return;
        }
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
        onNavigationEvent(1205901072, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback5, -1205901065, new Object[]{function1, obj}, iIAuthTabCallback6);
        int i3 = 86 / 0;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ASN1OutputStream aSN1OutputStream) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            onNavigationEvent(1558508439, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1558508439, new Object[]{aSN1OutputStream}, iIAuthTabCallback3);
            int i3 = 5 / 0;
        } else {
            int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
            onNavigationEvent(1558508439, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback5, -1558508439, new Object[]{aSN1OutputStream}, iIAuthTabCallback6);
        }
        int i4 = ICustomTabsCallback + 93;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = (~((~i5) | i)) | (~(i | i3));
        int i8 = (~i) | (~i3);
        int i9 = i7 | (~(i8 | i5));
        int i10 = (~i8) | i5;
        int i11 = ~(i3 | i5);
        int i12 = i5 + i + i4 + ((-417414852) * i6) + (1247522396 * i2);
        int i13 = i12 * i12;
        int i14 = (i5 * (-1219797419)) + 1526988800 + ((-1219797419) * i) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i4) + ((-2135949312) * i6) + ((-953155584) * i2) + ((-430374912) * i13);
        int i15 = ((i5 * 184508743) - 476012450) + (i * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i4 * 184509739) + (i6 * (-953474796)) + (i2 * (-288057996)) + (i13 * (-839712768));
        switch (i14 + (i15 * i15 * 1709113344)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) objArr[0];
                int i16 = 2 % 2;
                int i17 = ICustomTabsCallback + 15;
                int i18 = i17 % 128;
                readTypedObject = i18;
                if (i17 % 2 == 0 ? aSN1OutputStream.asInterface != 34 : aSN1OutputStream.asInterface != 31) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{'\n', 0, 22, 14, 14, 24, 22, '\r', 19, 23, 5, 19, '\t', 1, 2, 6, 24, '\n', 20, 4, 6, '\r', 11, 14, 2, 18, 18, 6, 16, '\n', 13900, 13900, 0, 14, 13899}, (byte) (79 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 35 - View.MeasureSpec.getSize(0), objArr2);
                    return ((String) objArr2[0]).intern();
                }
                int i19 = i18 + 105;
                ICustomTabsCallback = i19 % 128;
                int i20 = i19 % 2;
                Object[] objArr3 = new Object[1];
                a(new char[]{'\n', 0, 22, 14, 14, 24, 22, '\r', 16, 20, 15, 24, 5, 18, '\f', 14, 14, 3, '\f', 20}, (byte) (69 - View.getDefaultSize(0, 0)), View.getDefaultSize(0, 0) + 20, objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                int i21 = readTypedObject + 49;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                return strIntern;
            case 6:
                ASN1OutputStream aSN1OutputStream2 = (ASN1OutputStream) objArr[0];
                attachAdComponentViewApi attachadcomponentviewapi = (attachAdComponentViewApi) objArr[1];
                int i23 = 2 % 2;
                int i24 = ICustomTabsCallback + 67;
                readTypedObject = i24 % 128;
                int i25 = i24 % 2;
                Unit unit = (Unit) onNavigationEvent(1485939138, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1485939137, new Object[]{aSN1OutputStream2, attachadcomponentviewapi}, forceDomainCheck.IAuthTabCallback());
                int i26 = readTypedObject + 93;
                ICustomTabsCallback = i26 % 128;
                int i27 = i26 % 2;
                return unit;
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return onTransact(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(ASN1OutputStream aSN1OutputStream, Boolean bool) {
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(aSN1OutputStream, bool);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(aSN1OutputStream, bool);
        int i3 = ICustomTabsCallback + 79;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(ASN1OutputStream aSN1OutputStream, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(aSN1OutputStream, deserializeurinullablecollection);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(aSN1OutputStream, deserializeurinullablecollection);
        int i3 = readTypedObject + 73;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            onNavigationEvent(1923470636, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1923470626, new Object[]{aSN1OutputStream}, iIAuthTabCallback3);
            return null;
        }
        int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback5 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback6 = forceDomainCheck.IAuthTabCallback();
        onNavigationEvent(1923470636, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback5, -1923470626, new Object[]{aSN1OutputStream}, iIAuthTabCallback6);
        int i3 = 9 / 0;
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        int i4 = ICustomTabsCallback + 15;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public ASN1OutputStream() {
        Rmipmap<Boolean> rmipmap = new Rmipmap<>();
        this.IAuthTabCallbackStub = rmipmap;
        this.access100 = onNavigationEvent((MutableLiveData) rmipmap);
        this.IAuthTabCallbackStubProxy = new Rmipmap<>();
        Rmipmap<Throwable> rmipmap2 = new Rmipmap<>();
        this.onWarmupCompleted = rmipmap2;
        this.IAuthTabCallback_Parcel = onNavigationEvent((MutableLiveData) rmipmap2);
        Rmipmap<attachAdComponentViewApi> rmipmap3 = new Rmipmap<>();
        this.onTransact = rmipmap3;
        this.extraCallbackWithResult = onNavigationEvent((MutableLiveData) rmipmap3);
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda7
            public final Object invoke() {
                return ASN1OutputStream.IAuthTabCallback(this.f$0);
            }
        });
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 107;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.asInterface;
        int i6 = i2 + 17;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 47;
        int i4 = i3 % 128;
        readTypedObject = i4;
        int i5 = i3 % 2;
        this.asInterface = i;
        int i6 = i4 + 25;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final S2SRewardedVideoAdExtendedListener onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 41;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener = this.IAuthTabCallbackDefault;
        int i5 = i3 + 31;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return s2SRewardedVideoAdExtendedListener;
    }

    public final void onNavigationEvent(@Nullable S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener) {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackDefault = s2SRewardedVideoAdExtendedListener;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 53;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    public final LiveData<Boolean> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.access100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Rmipmap<Boolean> access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Rmipmap<Boolean> rmipmap = this.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return rmipmap;
    }

    public final LiveData<Throwable> IAuthTabCallbackStub() {
        LiveData<Throwable> liveData;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 119;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            liveData = this.IAuthTabCallback_Parcel;
            int i4 = 67 / 0;
        } else {
            liveData = this.IAuthTabCallback_Parcel;
        }
        int i5 = i2 + 9;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return liveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<VideoStartReason> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 107;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        List<VideoStartReason> list = this.asBinder;
        int i5 = i2 + 125;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        public final deserializeIp<List<? extends VideoStartReason>> apply(writeRaw<BaseApiResponse<List<? extends VideoStartReason>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass1 anonymousClass1 = new Function1<BaseApiResponse<List<? extends VideoStartReason>>, deserializeIp<? extends List<? extends VideoStartReason>>>() { // from class: o.ASN1OutputStream.onExtraCallbackWithResult.1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends VideoStartReason>> invoke(BaseApiResponse<List<? extends VideoStartReason>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass1) { // from class: o.UtilsKtExternalSyntheticLambda17$onConfigurationChanged
                private final /* synthetic */ Function1 onExtraCallbackWithResult;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass1, "");
                    this.onExtraCallbackWithResult = anonymousClass1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onExtraCallbackWithResult.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public final LiveData<attachAdComponentViewApi> readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 55;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        LiveData<attachAdComponentViewApi> liveData = this.extraCallbackWithResult;
        int i5 = i2 + 45;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final String IAuthTabCallbackDefault() {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = readTypedObject + 123;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        attachAdComponentViewApi attachadcomponentviewapi = (attachAdComponentViewApi) this.extraCallbackWithResult.getValue();
        if (attachadcomponentviewapi != null && (strOnExtraCallback = attachadcomponentviewapi.onExtraCallback()) != null) {
            if (strOnExtraCallback.length() <= 0) {
                int i3 = readTypedObject + 45;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
                strOnExtraCallback = null;
            }
            if (strOnExtraCallback != null) {
                int i5 = ICustomTabsCallback + 39;
                readTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    return strOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }
        }
        String string = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getString(R.string.app_contact_bank);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean asBinder() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ASN1OutputStream.readTypedObject
            int r1 = r1 + 75
            int r2 = r1 % 128
            o.ASN1OutputStream.ICustomTabsCallback = r2
            int r1 = r1 % r0
            o.S2SRewardedVideoAdExtendedListener r1 = r10.IAuthTabCallbackDefault
            if (r1 == 0) goto L38
            int r2 = r2 + 97
            int r3 = r2 % 128
            o.ASN1OutputStream.readTypedObject = r3
            int r2 = r2 % r0
            java.lang.Object[] r9 = new java.lang.Object[]{r1}
            int r5 = o.getKekid.onExtraCallback()
            int r7 = o.getKekid.onExtraCallback()
            int r3 = o.getKekid.onExtraCallback()
            int r4 = o.getKekid.onExtraCallback()
            r6 = -1068057786(0xffffffffc056bb46, float:-3.3551803)
            r8 = 1068057787(0x3fa944bb, float:1.32241)
            java.lang.Object r1 = o.S2SRewardedVideoAdExtendedListener.onExtraCallbackWithResult(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = (java.lang.String) r1
            goto L39
        L38:
            r1 = 0
        L39:
            r2 = 1
            if (r1 == 0) goto L4c
            int r3 = o.ASN1OutputStream.ICustomTabsCallback
            int r3 = r3 + r2
            int r4 = r3 % 128
            o.ASN1OutputStream.readTypedObject = r4
            int r3 = r3 % r0
            int r0 = r1.length()
            if (r0 == 0) goto L4c
            r0 = 0
            goto L4d
        L4c:
            r0 = r2
        L4d:
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ASN1OutputStream.asBinder():boolean");
    }

    private final checkNavigationBarBySystemProperties extraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystemproperties = (checkNavigationBarBySystemProperties) this.onNavigationEvent.getValue();
        int i4 = readTypedObject + 37;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return checknavigationbarbysystemproperties;
    }

    private static final checkNavigationBarBySystemProperties onNavigationEvent(ASN1OutputStream aSN1OutputStream) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        send sendVarOnWarmupCompleted = send.Companion.onWarmupCompleted();
        String strValueOf = String.valueOf(aSN1OutputStream.asInterface);
        if (i3 != 0) {
            return sendVarOnWarmupCompleted.onExtraCallback(strValueOf);
        }
        sendVarOnWarmupCompleted.onExtraCallback(strValueOf);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesExtraCallback = extraCallback();
        if (checknavigationbarbysystempropertiesExtraCallback != null) {
            int i2 = readTypedObject + 61;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            String interfaceDescriptor = checknavigationbarbysystempropertiesExtraCallback.getInterfaceDescriptor();
            if (interfaceDescriptor != null) {
                int i4 = ICustomTabsCallback + 59;
                readTypedObject = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 89 / 0;
                }
                return interfaceDescriptor;
            }
        }
        int i6 = ICustomTabsCallback + 5;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.checkNavigationBarBySystemProperties) = (r1v4 o.checkNavigationBarBySystemProperties), (r1v10 o.checkNavigationBarBySystemProperties) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String onNavigationEvent() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ASN1OutputStream.ICustomTabsCallback
            int r1 = r1 + 113
            int r2 = r1 % 128
            o.ASN1OutputStream.readTypedObject = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            o.checkNavigationBarBySystemProperties r1 = r3.extraCallback()
            r2 = 18
            int r2 = r2 / 0
            if (r1 == 0) goto L26
            goto L1f
        L19:
            o.checkNavigationBarBySystemProperties r1 = r3.extraCallback()
            if (r1 == 0) goto L26
        L1f:
            java.lang.String r1 = r1.access000()
            if (r1 == 0) goto L26
            return r1
        L26:
            int r1 = o.ASN1OutputStream.readTypedObject
            int r1 = r1 + 9
            int r2 = r1 % 128
            o.ASN1OutputStream.ICustomTabsCallback = r2
            int r1 = r1 % r0
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ASN1OutputStream.onNavigationEvent():java.lang.String");
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesExtraCallback = extraCallback();
        if (checknavigationbarbysystempropertiesExtraCallback == null) {
            int i4 = readTypedObject + 11;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String strIAuthTabCallbackStubProxy = checknavigationbarbysystempropertiesExtraCallback.IAuthTabCallbackStubProxy();
        int i5 = readTypedObject + 43;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return strIAuthTabCallbackStubProxy;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 51;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.access000;
        int i5 = i2 + 69;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 91;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.access000 = str;
        int i5 = i2 + 25;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 95;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getInterfaceDescriptor;
        int i5 = i2 + 43;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 59;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        this.getInterfaceDescriptor = str;
        int i5 = i2 + 47;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 15;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
    }

    private static final Unit onExtraCallback(ASN1OutputStream aSN1OutputStream, List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        aSN1OutputStream.asBinder = list;
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 1;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = ICustomTabsCallback + 31;
        readTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        List<String> listEmptyList;
        int iOnWarmupCompleted = 0;
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(new attachAdComponentViewApi(Boolean.FALSE, null, null, 6, null));
            Intrinsics.checkNotNull(writerawOnExtraCallback);
            return writerawOnExtraCallback;
        }
        ASN1ObjectParser aSN1ObjectParser = ASN1ObjectParser.IAuthTabCallback;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener = aSN1OutputStream.IAuthTabCallbackDefault;
        if (s2SRewardedVideoAdExtendedListener != null) {
            int i2 = ICustomTabsCallback + 115;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 24 / 0;
                iOnWarmupCompleted = s2SRewardedVideoAdExtendedListener.onWarmupCompleted();
            } else {
                iOnWarmupCompleted = s2SRewardedVideoAdExtendedListener.onWarmupCompleted();
            }
        }
        List<VideoStartReason> list2 = aSN1OutputStream.asBinder;
        if (list2 != null) {
            listEmptyList = new ArrayList<>();
            Iterator<T> it = list2.iterator();
            while (!(!it.hasNext())) {
                String strOnWarmupCompleted = ((VideoStartReason) it.next()).onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                    int i4 = ICustomTabsCallback + 101;
                    readTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    listEmptyList.add(strOnWarmupCompleted);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return aSN1ObjectParser.onExtraCallbackWithResult(true, iOnWarmupCompleted, listEmptyList);
    }

    private static final Unit IAuthTabCallback(ASN1OutputStream aSN1OutputStream, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        aSN1OutputStream.IAuthTabCallbackStubProxy.postValue(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 95;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 57;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 15;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        aSN1OutputStream.IAuthTabCallbackStubProxy.postValue(Boolean.FALSE);
        int i4 = readTypedObject + 85;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return null;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) objArr[0];
        attachAdComponentViewApi attachadcomponentviewapi = (attachAdComponentViewApi) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        aSN1OutputStream.onTransact.setValue(attachadcomponentviewapi);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 65;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(ASN1OutputStream aSN1OutputStream, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationJoinViewModel::subscribe", th);
            aSN1OutputStream.onWarmupCompleted.setValue(th);
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationJoinViewModel::subscribe", th);
        aSN1OutputStream.onWarmupCompleted.setValue(th);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final void ICustomTabsCallback() throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29427), KeyEvent.keyCodeFromString("") + 22, 24735 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 24734, -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            writeRaw<BaseApiResponse<List<VideoStartReason>>> writerawOnNavigationEvent = ((BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent(new onRewardServerSuccess(this.asInterface));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda8
                public final Object invoke(Object obj2) {
                    return ASN1OutputStream.onExtraCallbackWithResult(this.f$0, (List) obj2);
                }
            };
            writeRaw writerawOnNavigationEvent2 = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda10
                public final void accept(Object obj2) {
                    ASN1OutputStream.IAuthTabCallback(function1, obj2);
                }
            });
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda11
                public final Object invoke(Object obj2) {
                    return ASN1OutputStream.IAuthTabCallback(this.f$0, (List) obj2);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writerawOnNavigationEvent2.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda12
                public final Object apply(Object obj2) {
                    return ASN1OutputStream.IAuthTabCallbackDefault(function12, obj2);
                }
            });
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda13
                public final Object invoke(Object obj2) {
                    return ASN1OutputStream.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj2);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawOnExtraCallbackWithResult.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda14
                public final void accept(Object obj2) throws Throwable {
                    ASN1OutputStream.onExtraCallbackWithResult(function13, obj2);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda15
                public final void run() throws Throwable {
                    ASN1OutputStream.onExtraCallbackWithResult(this.f$0);
                }
            });
            final Function1 function14 = new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda16
                public final Object invoke(Object obj2) {
                    Object[] objArr = {this.f$0, (attachAdComponentViewApi) obj2};
                    return (Unit) ASN1OutputStream.onNavigationEvent(774017153, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -774017147, objArr, forceDomainCheck.IAuthTabCallback());
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda17
                public final void accept(Object obj2) {
                    ASN1OutputStream.onNavigationEvent(function14, obj2);
                }
            };
            final Function1 function15 = new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda18
                public final Object invoke(Object obj2) {
                    Object[] objArr = {this.f$0, (Throwable) obj2};
                    return (Unit) ASN1OutputStream.onNavigationEvent(275181048, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -275181040, objArr, forceDomainCheck.IAuthTabCallback());
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinViewModel$$ExternalSyntheticLambda9
                public final void accept(Object obj2) throws Throwable {
                    Object[] objArr = {function15, obj2};
                    ASN1OutputStream.onNavigationEvent(-1756148060, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 1756148062, objArr, forceDomainCheck.IAuthTabCallback());
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onExtraCallbackWithResult(deserializeurinullablecollectionOnNavigationEvent);
            int i2 = readTypedObject + 105;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 111;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(ASN1OutputStream aSN1OutputStream, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 121;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        aSN1OutputStream.IAuthTabCallbackStubProxy.postValue(Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Rmipmap<Boolean> rmipmap = aSN1OutputStream.IAuthTabCallbackStubProxy;
        if (i3 != 0) {
            rmipmap.postValue(Boolean.FALSE);
            int i4 = 11 / 0;
        } else {
            rmipmap.postValue(Boolean.FALSE);
        }
        int i5 = ICustomTabsCallback + 79;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 77;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    private static final Unit IAuthTabCallback(ASN1OutputStream aSN1OutputStream, Boolean bool) {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        aSN1OutputStream.IAuthTabCallbackStub.setValue(bool);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 111;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
    }

    private static final Unit IAuthTabCallback(ASN1OutputStream aSN1OutputStream, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationJoinViewModel::setCi", th);
            aSN1OutputStream.onWarmupCompleted.setValue(th);
            Unit unit = Unit.INSTANCE;
            int i3 = readTypedObject + 73;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationJoinViewModel::setCi", th);
        aSN1OutputStream.onWarmupCompleted.setValue(th);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    public final void IAuthTabCallback(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, 24734 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1343130439);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getTouchSlop() >> 8) + 22, Color.green(0) + 24734, -1632531927, false, "IAuthTabCallbackStub", new Class[0]);
            }
            writeRaw<BaseApiResponse<Boolean>> writerawOnNavigationEvent = ((BidderTokenProvider) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent(new onRewardServerFailed(str));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onExtraCallback(new AccountNotificationJoinViewModel$.ExternalSyntheticLambda1(new AccountNotificationJoinViewModel$.ExternalSyntheticLambda0(this))).onWarmupCompleted(new AccountNotificationJoinViewModel$.ExternalSyntheticLambda2(this)).onNavigationEvent(new AccountNotificationJoinViewModel$.ExternalSyntheticLambda4(new AccountNotificationJoinViewModel$.ExternalSyntheticLambda3(this)), new AccountNotificationJoinViewModel$.ExternalSyntheticLambda6(new AccountNotificationJoinViewModel$.ExternalSyntheticLambda5(this)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            onExtraCallbackWithResult(deserializeurinullablecollectionOnNavigationEvent);
            int i2 = ICustomTabsCallback + 27;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0106 A[PHI: r15
      0x0106: PHI (r15v11 java.lang.String) = (r15v10 java.lang.String), (r15v13 java.lang.String) binds: [B:22:0x0104, B:19:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ASN1OutputStream.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final List<VideoStartReason> asInterface() {
        List<VideoStartReason> listOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        attachAdComponentViewApi attachadcomponentviewapi = (attachAdComponentViewApi) this.extraCallbackWithResult.getValue();
        if (attachadcomponentviewapi == null || (listOnExtraCallbackWithResult = attachadcomponentviewapi.onExtraCallbackWithResult()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            int i4 = readTypedObject + 89;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Object next = it.next();
                if (!((VideoStartReason) next).IAuthTabCallback_Parcel()) {
                    int i5 = ICustomTabsCallback + 77;
                    readTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList.add(next);
                }
            } else {
                ((VideoStartReason) it.next()).IAuthTabCallback_Parcel();
                throw null;
            }
        }
        int i7 = ICustomTabsCallback + 47;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return arrayList;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = writeTypedObject;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 119;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), KeyEvent.keyCodeFromString("") + 26, ExpandableListView.getPackedPositionType(j) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(extraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777242, 23139 - TextUtils.getOffsetBefore("", 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i7 = $10 + 3;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i9 = $11 + 51;
                $10 = i9 % 128;
                int i10 = i9 % 2;
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 24824), 75 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29, 19488 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onWarmupCompleted(ASN1OutputStream aSN1OutputStream, Throwable th) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onNavigationEvent(275181048, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -275181040, new Object[]{aSN1OutputStream, th}, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(ASN1OutputStream aSN1OutputStream, attachAdComponentViewApi attachadcomponentviewapi) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onNavigationEvent(774017153, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -774017147, new Object[]{aSN1OutputStream, attachadcomponentviewapi}, iIAuthTabCallback3);
    }

    public static /* synthetic */ void onWarmupCompleted(ASN1OutputStream aSN1OutputStream) throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        onNavigationEvent(-410909967, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 410909970, new Object[]{aSN1OutputStream}, iIAuthTabCallback3);
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        onNavigationEvent(-1756148060, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, 1756148062, new Object[]{function1, obj}, iIAuthTabCallback3);
    }

    private final String extraCallbackWithResult() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (String) onNavigationEvent(578253971, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -578253966, new Object[]{this}, iIAuthTabCallback3);
    }

    private static final void onExtraCallback(ASN1OutputStream aSN1OutputStream) throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        onNavigationEvent(1923470636, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1923470626, new Object[]{aSN1OutputStream}, iIAuthTabCallback3);
    }

    private static final deserializeIp onNavigationEvent(ASN1OutputStream aSN1OutputStream, List list) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (deserializeIp) onNavigationEvent(503182340, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -503182331, new Object[]{aSN1OutputStream, list}, iIAuthTabCallback3);
    }

    private static final deserializeIp getInterfaceDescriptor(Function1 function1, Object obj) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (deserializeIp) onNavigationEvent(1820524241, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1820524230, new Object[]{function1, obj}, iIAuthTabCallback3);
    }

    private static final void access000(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        onNavigationEvent(1205901072, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1205901065, new Object[]{function1, obj}, iIAuthTabCallback3);
    }

    private static final void IAuthTabCallbackDefault(ASN1OutputStream aSN1OutputStream) throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        onNavigationEvent(1558508439, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1558508439, new Object[]{aSN1OutputStream}, iIAuthTabCallback3);
    }

    private static final Unit onNavigationEvent(ASN1OutputStream aSN1OutputStream, attachAdComponentViewApi attachadcomponentviewapi) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onNavigationEvent(1485939138, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -1485939137, new Object[]{aSN1OutputStream, attachadcomponentviewapi}, iIAuthTabCallback3);
    }

    public final String onTransact() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
        return (String) onNavigationEvent(841939549, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback2, -841939545, new Object[]{this}, iIAuthTabCallback3);
    }

    static void writeTypedObject() {
        writeTypedObject = new char[]{64926, 64967, 64913, 65022, 64986, 64993, 64964, 64987, 64898, 65014, 64989, 64978, 64924, 64983, 65019, 64995, 65013, 65012, 65020, 65008, 64992, 65016, 64980, 65009, 65010};
        extraCallback = (char) 51244;
    }
}
