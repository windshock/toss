package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import im.toss.base.BaseFragment;
import im.toss.features.main.ui.MainTabFragment;
import im.toss.features.main.ui.tab.MainTabManager$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.teens.benefit.UssBenefitFragment;
import im.toss.features.teens.social.TeensSocialFragment;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.getEventInstanceId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class openFd {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static char access000 = 0;
    private static char access100 = 0;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static long getInterfaceDescriptor = 0;
    public static final int onExtraCallback;
    private static int writeTypedObject = 1;
    private final getBillingPeriod IAuthTabCallback;
    private final BigDataAIDLMainService IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final Lazy asBinder;
    private final SessionTrackerb asInterface;
    private getEventInstanceId onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final zzag onTransact;
    private final CacheStrategy onWarmupCompleted;

    static {
        onTransact();
        Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
        onExtraCallback = 8;
        int i = ICustomTabsCallback + 109;
        extraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 61 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Bundle bundle, Fragment fragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(bundle, fragment);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        int i5 = writeTypedObject + 15;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(Bundle bundle, Fragment fragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(bundle, fragment);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel();
        }
        IAuthTabCallback_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Bundle bundle, openFd openfd, Context context, String str2, String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(str, bundle, openfd, context, str2, str3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, bundle, openfd, context, str2, str3);
        int i3 = extraCallback + 85;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getEventInstanceId.onWarmupCompleted onwarmupcompleted, openFd openfd, Context context, String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
            return (Unit) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, -1985610052, ACPayResult.onWarmupCompleted(), 1985610056, new Object[]{onwarmupcompleted, openfd, context, str}, iOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted6 = ACPayResult.onWarmupCompleted();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(openFd openfd, Uri uri, Fragment fragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(openfd, uri, fragment);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~(i3 | i2);
        int i8 = i5 | i7;
        int i9 = (~(i2 | (~i5))) | i3;
        int i10 = i3 + i5 + i + ((-1932811043) * i6) + (1521317780 * i4);
        int i11 = i10 * i10;
        int i12 = ((i3 * (-919556932)) - 154402816) + ((-919556932) * i5) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i) + ((-2098724864) * i6) + ((-1398800384) * i4) + ((-1444151296) * i11);
        int i13 = (i3 * 1794637580) + 2133191799 + (i5 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i * 1794637741) + (i6 * (-1844343719)) + (i4 * (-1188939004)) + (i11 * (-394526720));
        switch (i12 + (i13 * i13 * 821297152)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                openFd openfd = (openFd) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i14 = 2 % 2;
                int i15 = writeTypedObject + 93;
                extraCallback = i15 % 128;
                int i16 = i15 % 2;
                openfd.IAuthTabCallbackStub = iIntValue;
                TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
                Object[] objArr2 = new Object[1];
                a(new char[]{9622, 39028, 24151, 7235, 53781, 36916, 22028, 5142, 51937, 35049, 20169, 3291, 49795, 32952, 18049, 1173, 64350, 47428, 32598}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 48623, objArr2);
                smallIconBitmap.onExtraCallbackWithResult(((String) objArr2[0]).intern(), iIntValue);
                TextRoundCornerProgressBarSavedState1 smallIconBitmap2 = addPolicy.getSmallIconBitmap();
                long jIAuthTabCallbackDefault = openfd.onTransact.IAuthTabCallbackDefault();
                Object[] objArr3 = new Object[1];
                b(new char[]{65334, 57360, 63028, 36838, 7996, 38073, 31669, 28133, 25226, 22085, 62090, 6704, 15365, 27838, 14044, 54769, 37321, 62449, 38041, 46293, 18285, 15082, 62090, 6704, 55103, 57416}, (-16777190) - Color.rgb(0, 0, 0), objArr3);
                smallIconBitmap2.onNavigationEvent(((String) objArr3[0]).intern(), jIAuthTabCallbackDefault);
                int i17 = writeTypedObject + 103;
                extraCallback = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 8:
                Bundle bundle = (Bundle) objArr[0];
                String str = (String) objArr[1];
                Uri uri = (Uri) objArr[2];
                Fragment fragment = (Fragment) objArr[3];
                int i19 = 2 % 2;
                int i20 = extraCallback + 107;
                writeTypedObject = i20 % 128;
                int i21 = i20 % 2;
                onNavigationEvent(bundle, str, uri, fragment);
                int i22 = writeTypedObject + 49;
                extraCallback = i22 % 128;
                int i23 = i22 % 2;
                return null;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Bundle bundle = (Bundle) objArr[0];
        Fragment fragment = (Fragment) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asBinder(bundle, fragment);
        int i4 = extraCallback + 57;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ List onNavigationEvent(openFd openfd) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        List listOnWarmupCompleted = onWarmupCompleted(openfd);
        int i4 = extraCallback + 105;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return listOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Uri uri, openFd openfd, Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 83;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(uri, openfd, context);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        int i5 = writeTypedObject + 51;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(Bundle bundle, Fragment fragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(bundle, fragment);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 25;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(Bundle bundle, Fragment fragment) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
            onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, -1671510750, ACPayResult.onWarmupCompleted(), 1671510755, new Object[]{bundle, fragment}, iOnWarmupCompleted3);
            int i3 = 22 / 0;
        } else {
            int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted6 = ACPayResult.onWarmupCompleted();
            onNavigationEvent(iOnWarmupCompleted5, iOnWarmupCompleted4, -1671510750, ACPayResult.onWarmupCompleted(), 1671510755, new Object[]{bundle, fragment}, iOnWarmupCompleted6);
        }
        int i4 = writeTypedObject + 17;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public openFd(@NotNull zzag zzagVar, @NotNull SessionTrackerb sessionTrackerb, @NotNull CacheStrategy cacheStrategy, @NotNull BigDataAIDLMainService bigDataAIDLMainService, @NotNull getBillingPeriod getbillingperiod) {
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        Intrinsics.checkNotNullParameter(bigDataAIDLMainService, "");
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        this.onTransact = zzagVar;
        this.asInterface = sessionTrackerb;
        this.onWarmupCompleted = cacheStrategy;
        this.IAuthTabCallbackDefault = bigDataAIDLMainService;
        this.IAuthTabCallback = getbillingperiod;
        this.asBinder = LazyKt.onExtraCallbackWithResult(new MainTabManager$.ExternalSyntheticLambda1(this));
        this.IAuthTabCallbackStub = onNavigationEvent();
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        openFd openfd = (openFd) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = openfd.asBinder.getValue();
        if (i3 == 0) {
            return (List) value;
        }
        int i4 = 75 / 0;
        return (List) value;
    }

    private static final List onWarmupCompleted(openFd openfd) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<ExtHubPageContext> listIAuthTabCallbackDefault = openfd.IAuthTabCallbackDefault();
        int i4 = writeTypedObject + 11;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return listIAuthTabCallbackDefault;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        openFd openfd = (openFd) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getEventInstanceId geteventinstanceid = openfd.onExtraCallbackWithResult;
        if (i3 == 0) {
            return geteventinstanceid;
        }
        throw null;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 73;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = z;
        int i5 = i2 + 63;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallbackStub;
        int i6 = i3 + 47;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $11 + 81;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            i2 = -2014642380;
            j = 0;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 19627 - TextUtils.indexOf("", "", 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (getInterfaceDescriptor ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, 6384 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i2);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), 58 - TextUtils.lastIndexOf("", '0', 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = 60 / 0;
                j = 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i2);
                if (objOnExtraCallback4 == null) {
                    j = 0;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 59 - Color.alpha(0), 6383 - Gravity.getAbsoluteGravity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                } else {
                    j = 0;
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i2 = -2014642380;
            }
        }
        objArr[0] = new String(cArr2);
    }

    private final List<ExtHubPageContext> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (!addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            int i4 = extraCallback + 23;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            DERSet dERSet = DERSet.onExtraCallback;
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "SetTabInfo", (String) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("securities.openTab", Boolean.valueOf(dERSet.addOnContextAvailableListener())), getWrite.IAuthTabCallback("securities.searchTabScheme", (String) DERSet.onExtraCallback(894478694, new Object[]{dERSet}, -894478655, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback())), getWrite.IAuthTabCallback("benefit.showTab", Boolean.valueOf(dERSet.invalidateMenu())), getWrite.IAuthTabCallback("transfer.showMainTab", Boolean.valueOf(dERSet.onActivityResult())), getWrite.IAuthTabCallback("TubaVarSyncState", AppStateManager.onExtraCallbackWithResult.onMinimized().onExtraCallbackWithResult().toString())}), (String) null, false, (String) null, 58, (Object) null);
        }
        return this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 35;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = i7;
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (access100 ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback_Parcel);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", i3);
                        int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int modifierMetaStateMask = 12433 - ((byte) KeyEvent.getModifierMetaStateMask());
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, scrollBarFadeDuration, modifierMetaStateMask, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (access000 ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackStubProxy)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), KeyEvent.normalizeMetaState(0) + 10, TextUtils.indexOf("", "") + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i8 + 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - KeyEvent.getDeadChar(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 14, 19901 - Color.red(0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $11 + 25;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getEventInstanceId.onWarmupCompleted onwarmupcompleted = (getEventInstanceId.onWarmupCompleted) objArr[0];
        openFd openfd = (openFd) objArr[1];
        Context context = (Context) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onwarmupcompleted.asInterface().invoke();
        SessionTrackerb.onExtraCallbackWithResult(openfd.asInterface, context, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 101;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getEventInstanceId onExtraCallbackWithResult(@Nullable Context context, @Nullable Bundle bundle) throws Throwable {
        Object[] objArr;
        int iAsInterface;
        String host;
        String strAsBinder;
        int i = 2 % 2;
        if (bundle == null || !bundle.getBoolean("EXTRA_KEY_STARTED_BY_LAUNCHER")) {
            objArr = false;
        } else {
            int i2 = extraCallback + 71;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            objArr = true;
        }
        String string = null;
        Uri uriIAuthTabCallback = bundle != null ? MainTabFragment.Companion.IAuthTabCallback(bundle) : null;
        if (bundle != null && objArr == false) {
            int i4 = extraCallback + 95;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (uriIAuthTabCallback != null) {
                String host2 = uriIAuthTabCallback.getHost();
                if (host2 != null) {
                    strAsBinder = "shopping";
                    switch (host2.hashCode()) {
                        case -1136178003:
                            if (!host2.equals("tosspay")) {
                                host = uriIAuthTabCallback.getHost();
                                if (host != null && host.length() != 0) {
                                    strAsBinder = host;
                                    break;
                                } else {
                                    strAsBinder = asBinder();
                                    break;
                                }
                            }
                            break;
                        case -344460952:
                            if (!host2.equals("shopping")) {
                            }
                            break;
                        case 3208415:
                            Object[] objArr2 = new Object[1];
                            a(new char[]{9618, 51854, 64417, 59598}, 61211 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                            if (host2.equals(((String) objArr2[0]).intern())) {
                                String path = uriIAuthTabCallback.getPath();
                                if (path != null) {
                                    int i5 = extraCallback + 9;
                                    writeTypedObject = i5 % 128;
                                    int i6 = i5 % 2;
                                    if (path.hashCode() == -769109237 && !(!path.equals("/asset-home"))) {
                                        int i7 = extraCallback + 35;
                                        writeTypedObject = i7 % 128;
                                        int i8 = i7 % 2;
                                        strAsBinder = "global_account";
                                        break;
                                    } else if (!getBillingCycleCount.onExtraCallback(this.IAuthTabCallback.onExtraCallbackWithResult())) {
                                        int i9 = extraCallback + 95;
                                        writeTypedObject = i9 % 128;
                                        int i10 = i9 % 2;
                                        strAsBinder = "global_home";
                                        break;
                                    } else {
                                        strAsBinder = "dashboard";
                                        break;
                                    }
                                }
                            }
                            break;
                        case 3343801:
                            Object[] objArr3 = new Object[1];
                            b(new char[]{11662, 34264, 14044, 54769}, 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                            if (host2.equals(((String) objArr3[0]).intern())) {
                                Object[] objArr4 = new Object[1];
                                b(new char[]{13912, 14233, 24088, 12249}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr4);
                                host = bundle.getString(((String) objArr4[0]).intern(), "");
                                if (host.length() == 0) {
                                    int i11 = extraCallback + 83;
                                    writeTypedObject = i11 % 128;
                                    int i12 = i11 % 2;
                                    Integer interfaceDescriptor = getInterfaceDescriptor();
                                    if (interfaceDescriptor == null || (host = createClient.onExtraCallback.onExtraCallback(interfaceDescriptor.intValue())) == null) {
                                        host = asBinder();
                                    }
                                }
                            }
                            strAsBinder = host;
                            break;
                        case 3526536:
                            Object[] objArr5 = new Object[1];
                            a(new char[]{9609, 15756, 5554, 28071}, 6163 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
                            if (host2.equals(((String) objArr5[0]).intern())) {
                                strAsBinder = "transfer";
                                break;
                            }
                            break;
                        case 1121604878:
                            Object[] objArr6 = new Object[1];
                            a(new char[]{9627, 51495, 64720, 58320, 38716, 47860, 43419, 23861}, (ViewConfiguration.getTouchSlop() >> 8) + 60589, objArr6);
                            if (host2.equals(((String) objArr6[0]).intern())) {
                                strAsBinder = IAuthTabCallbackStub();
                                break;
                            }
                            break;
                    }
                }
                String host3 = uriIAuthTabCallback.getHost();
                Object[] objArr7 = new Object[1];
                a(new char[]{9627, 51495, 64720, 58320, 38716, 47860, 43419, 23861}, View.MeasureSpec.makeMeasureSpec(0, 0) + 60589, objArr7);
                if (Intrinsics.areEqual(host3, ((String) objArr7[0]).intern())) {
                    Object[] objArr8 = new Object[1];
                    b(new char[]{13912, 14233, 24088, 12249}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr8);
                    bundle.remove(((String) objArr8[0]).intern());
                    Object[] objArr9 = new Object[1];
                    b(new char[]{502, 52548, 3283, 41725}, (Process.myTid() >> 22) + 3, objArr9);
                    string = bundle.getString(((String) objArr9[0]).intern());
                    Object[] objArr10 = new Object[1];
                    b(new char[]{502, 52548, 3283, 41725}, TextUtils.lastIndexOf("", '0', 0, 0) + 4, objArr10);
                    bundle.remove(((String) objArr10[0]).intern());
                }
                Intrinsics.checkNotNull(strAsBinder);
                getEventInstanceId.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(context, bundle, uriIAuthTabCallback, strAsBinder);
                if (string != null) {
                    int i13 = writeTypedObject + 107;
                    extraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    if (!StringsKt.isBlank(string)) {
                        onwarmupcompletedOnExtraCallbackWithResult = getEventInstanceId.onWarmupCompleted.IAuthTabCallback(onwarmupcompletedOnExtraCallbackWithResult, (String) null, 0, (getContentPaddingRight) null, false, new MainTabManager$.ExternalSyntheticLambda0(onwarmupcompletedOnExtraCallbackWithResult, this, context, string), 15, (Object) null);
                    }
                }
                if (this.onExtraCallbackWithResult == null) {
                    this.onExtraCallbackWithResult = onwarmupcompletedOnExtraCallbackWithResult;
                }
                return onwarmupcompletedOnExtraCallbackWithResult;
            }
        }
        if (this.onExtraCallbackWithResult == null) {
            int i15 = extraCallback;
            int i16 = i15 + 111;
            writeTypedObject = i16 % 128;
            int i17 = i16 % 2;
            if (!this.onNavigationEvent) {
                int i18 = i15 + 57;
                writeTypedObject = i18 % 128;
                int i19 = i18 % 2;
                List list = (List) onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, ACPayResult.onWarmupCompleted());
                if (list instanceof Collection) {
                    int i20 = writeTypedObject + 9;
                    extraCallback = i20 % 128;
                    if (i20 % 2 != 0) {
                        list.isEmpty();
                        throw null;
                    }
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((ExtHubPageContext) it.next()).onWarmupCompleted() == 55) {
                                getEventInstanceId.IAuthTabCallback iAuthTabCallback = new getEventInstanceId.IAuthTabCallback("launcher", 55);
                                this.onExtraCallbackWithResult = iAuthTabCallback;
                                return iAuthTabCallback;
                            }
                        }
                    }
                }
            }
        }
        if (this.onExtraCallbackWithResult == null && !this.onNavigationEvent) {
            ExtHubAppContext extHubAppContextOnWarmupCompleted = ExtHubApiContext.onWarmupCompleted(ExtHubApiContext.Companion.onExtraCallback(DERSet.onExtraCallback.ICustomTabsCallbackStubProxy()), this.onTransact.onWarmupCompleted());
            if (extHubAppContextOnWarmupCompleted != null) {
                createClient createclient = createClient.onExtraCallback;
                Integer numIAuthTabCallback = createclient.IAuthTabCallback(extHubAppContextOnWarmupCompleted.onWarmupCompleted());
                if (numIAuthTabCallback == null) {
                    iAsInterface = asInterface();
                } else {
                    Integer num = onWarmupCompleted(numIAuthTabCallback.intValue()) ? numIAuthTabCallback : null;
                    if (num != null) {
                        iAsInterface = num.intValue();
                    }
                }
                String strOnExtraCallback = createclient.onExtraCallback(iAsInterface);
                if (strOnExtraCallback == null) {
                    strOnExtraCallback = asBinder();
                }
                getEventInstanceId.onExtraCallbackWithResult onextracallbackwithresult = new getEventInstanceId.onExtraCallbackWithResult(strOnExtraCallback, iAsInterface);
                this.onExtraCallbackWithResult = onextracallbackwithresult;
                return onextracallbackwithresult;
            }
        }
        Integer interfaceDescriptor2 = getInterfaceDescriptor();
        String strOnExtraCallback2 = interfaceDescriptor2 != null ? createClient.onExtraCallback.onExtraCallback(interfaceDescriptor2.intValue()) : null;
        if (strOnExtraCallback2 != null) {
            Integer numIAuthTabCallback2 = createClient.onExtraCallback.IAuthTabCallback(strOnExtraCallback2);
            getEventInstanceId.onExtraCallback onextracallback = new getEventInstanceId.onExtraCallback(strOnExtraCallback2, numIAuthTabCallback2 != null ? numIAuthTabCallback2.intValue() : 8);
            this.onExtraCallbackWithResult = onextracallback;
            return onextracallback;
        }
        String strAsBinder2 = asBinder();
        Integer numIAuthTabCallback3 = createClient.onExtraCallback.IAuthTabCallback(strAsBinder2);
        getEventInstanceId.IAuthTabCallback iAuthTabCallback2 = new getEventInstanceId.IAuthTabCallback(strAsBinder2, numIAuthTabCallback3 != null ? numIAuthTabCallback3.intValue() : 8);
        this.onExtraCallbackWithResult = iAuthTabCallback2;
        return iAuthTabCallback2;
    }

    private final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        ExtHubPageContext extHubPageContext = (ExtHubPageContext) CollectionsKt.firstOrNull((List) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, iOnWarmupCompleted3));
        if (extHubPageContext != null) {
            String strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(extHubPageContext.onWarmupCompleted());
            if (strOnExtraCallback != null) {
                int i4 = writeTypedObject + 107;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                return strOnExtraCallback;
            }
        }
        return asBinder();
    }

    private final String asBinder() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            String strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(asInterface());
            int i3 = 31 / 0;
            if (strOnExtraCallback != null) {
                return strOnExtraCallback;
            }
        } else {
            String strOnExtraCallback2 = createClient.onExtraCallback.onExtraCallback(asInterface());
            if (strOnExtraCallback2 != null) {
                return strOnExtraCallback2;
            }
        }
        int i4 = writeTypedObject + 7;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 2;
        }
        return "dashboard";
    }

    private final int asInterface() {
        int i = 2 % 2;
        Integer num = 8;
        if (!onWarmupCompleted(num.intValue())) {
            int i2 = writeTypedObject + 37;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            num = null;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            int i3 = extraCallback + 33;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return iIntValue;
            }
            numValueOf.hashCode();
            throw null;
        }
        ExtHubPageContext extHubPageContext = (ExtHubPageContext) CollectionsKt.firstOrNull((List) onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, ACPayResult.onWarmupCompleted()));
        numValueOf = extHubPageContext != null ? Integer.valueOf(extHubPageContext.onWarmupCompleted()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 8;
    }

    private final boolean onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        List list = (List) onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, ACPayResult.onWarmupCompleted());
        if (list instanceof Collection) {
            int i3 = writeTypedObject + 113;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                list.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (list.isEmpty()) {
                int i4 = writeTypedObject + 59;
                extraCallback = i4 % 128;
                return !(i4 % 2 == 0);
            }
        }
        Iterator it = list.iterator();
        int i5 = writeTypedObject + 103;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            if (((ExtHubPageContext) it.next()).onWarmupCompleted() == i) {
                return true;
            }
        }
        return false;
    }

    private static final Unit IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Uri uri, openFd openfd, Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{9609, 27470, 47112, 51676, 7820, 44107, 64787, 718, 21377, 57609, 13919, 18334, 38021, 55890, 27418, 47313}, 20161 - View.MeasureSpec.getMode(0), objArr);
        Uri uri2 = Uri.parse(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b(new char[]{13912, 14233, 24088, 12249}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr2);
        Uri uri3 = (Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, ((String) objArr2[0]).intern()}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
        Intrinsics.checkNotNull(uri2);
        SessionTrackerb.onExtraCallbackWithResult(openfd.asInterface, context, processTransparent.onWarmupCompleted(uri3, uri2), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 13;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallbackStub(Bundle bundle, Fragment fragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Bundle bundle2 = new Bundle(bundle);
        bundle2.remove("intentData");
        fragment.setArguments(bundle2);
        if (fragment instanceof BaseFragment) {
            int i2 = writeTypedObject + 67;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            ((BaseFragment) fragment).onNewArgument(bundle2);
            int i4 = extraCallback + 95;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Bundle bundle = (Bundle) objArr[0];
        BaseFragment baseFragment = (Fragment) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseFragment, "");
        baseFragment.setArguments(bundle);
        if (!(baseFragment instanceof BaseFragment)) {
            return null;
        }
        int i2 = writeTypedObject + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        baseFragment.onNewArgument(bundle);
        int i4 = extraCallback + 77;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void IAuthTabCallbackDefault(Bundle bundle, Fragment fragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            fragment.setArguments(bundle);
            throw null;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        fragment.setArguments(bundle);
        int i3 = writeTypedObject + 89;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onNavigationEvent(Bundle bundle, String str, Uri uri, Fragment fragment) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragment, "");
        Bundle bundle2 = new Bundle(bundle);
        Object[] objArr = new Object[1];
        a(new char[]{9608, 7898, 21270, 37968, 51356, 3537, 17921, 47979}, KeyEvent.normalizeMetaState(0) + 15173, objArr);
        bundle2.putString(((String) objArr[0]).intern(), str);
        bundle2.putBoolean("from_home_launcher", Intrinsics.areEqual(uri.getQueryParameter("from_home_launcher"), "true"));
        fragment.setArguments(bundle2);
        Object obj = null;
        if (fragment instanceof BaseFragment) {
            int i2 = extraCallback + 71;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            ((BaseFragment) fragment).onNewArgument(bundle2);
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = extraCallback + 57;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, Bundle bundle, openFd openfd, Context context, String str2, String str3) throws Throwable {
        String strIAuthTabCallback = str;
        int i = 2 % 2;
        if (strIAuthTabCallback != null) {
            int i2 = extraCallback + 79;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                StringsKt.isBlank(str);
                throw null;
            }
            if (!StringsKt.isBlank(str)) {
                int i3 = writeTypedObject + 3;
                extraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                b(new char[]{36485, 15648, 12704, 23268, 36485, 15648, 25226, 22085, 55779, 44319, 3283, 41725}, TextUtils.indexOf("", "", 0, 0) + 11, objArr);
                bundle.putString(((String) objArr[0]).intern(), null);
                SessionTrackerb sessionTrackerb = openfd.asInterface;
                if (str2 != null) {
                    int i5 = extraCallback + 57;
                    writeTypedObject = i5 % 128;
                    int i6 = i5 % 2;
                    if (StringsKt.isBlank(str2)) {
                        if (str3 != null) {
                            int i7 = extraCallback + 77;
                            writeTypedObject = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 19 / 0;
                                if (!StringsKt.isBlank(str3)) {
                                    Object[] objArr2 = new Object[1];
                                    a(new char[]{9608, 7898, 21270, 37968, 51356, 3537, 17921, 47979}, 15173 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
                                    strIAuthTabCallback = convertAnyToMap.IAuthTabCallback(strIAuthTabCallback, ((String) objArr2[0]).intern(), str3);
                                }
                            } else if (!StringsKt.isBlank(str3)) {
                            }
                        }
                    }
                    SessionTrackerb.onExtraCallbackWithResult(sessionTrackerb, context, strIAuthTabCallback, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = extraCallback + 63;
        writeTypedObject = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void asBinder(Bundle bundle, Fragment fragment) {
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            fragment.setArguments(bundle);
            boolean z = fragment instanceof BaseFragment;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        fragment.setArguments(bundle);
        if (fragment instanceof BaseFragment) {
            ((BaseFragment) fragment).onNewArgument(bundle);
            int i3 = extraCallback + 103;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 3;
            }
        }
    }

    private static final void asInterface(Bundle bundle, Fragment fragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            fragment.setArguments(bundle);
        } else {
            Intrinsics.checkNotNullParameter(fragment, "");
            fragment.setArguments(bundle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0346, code lost:
    
        if (r24.equals("dashboard") != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x034c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r24, "global_home") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0354, code lost:
    
        if (onWarmupCompleted(100) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0356, code lost:
    
        r5 = o.openFd.extraCallback + 89;
        o.openFd.writeTypedObject = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x035f, code lost:
    
        if ((r5 % 2) != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0361, code lost:
    
        r9 = 92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0364, code lost:
    
        r9 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x036a, code lost:
    
        if (onWarmupCompleted(8) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x036c, code lost:
    
        r9 = asInterface();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0370, code lost:
    
        r11 = onExtraCallbackWithResult(r20, r23, false, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x037a, code lost:
    
        if (o.addExtra.writeTypedObject(o.PlayerErrorCode.onWarmupCompleted) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x037c, code lost:
    
        r12 = new im.toss.features.main.ui.tab.MainTabManager$.ExternalSyntheticLambda5<>(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02e5, code lost:
    
        if (r24.equals("global_home") == false) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final getEventInstanceId.onWarmupCompleted onExtraCallbackWithResult(Context context, Bundle bundle, Uri uri, String str) throws Throwable {
        Uri uriIAuthTabCallback;
        boolean zOnExtraCallbackWithResult;
        getContentPaddingRight<Fragment> externalSyntheticLambda11;
        int i;
        Function0 externalSyntheticLambda9;
        int i2;
        int i3;
        boolean z;
        getContentPaddingRight<Fragment> getcontentpaddingright;
        String queryParameter;
        String str2;
        boolean z2;
        getContentPaddingRight<Fragment> getcontentpaddingright2;
        String strOnExtraCallback;
        int i4;
        int i5 = 2 % 2;
        Function0 externalSyntheticLambda3 = new MainTabManager$.ExternalSyntheticLambda3();
        int iAsInterface = 101;
        int iAsInterface2 = 8;
        boolean zOnExtraCallbackWithResult2 = false;
        getContentPaddingRight<Fragment> externalSyntheticLambda5 = null;
        switch (str.hashCode()) {
            case -1927531417:
                iAsInterface = !str.equals("foreignerPay") ? asInterface() : 21;
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                    strOnExtraCallback = asBinder();
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case -1407250528:
                if (str.equals("launcher")) {
                    List list = (List) onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, ACPayResult.onWarmupCompleted());
                    if ((list instanceof Collection) && list.isEmpty()) {
                        int i6 = extraCallback + 77;
                        writeTypedObject = i6 % 128;
                        if (i6 % 2 == 0) {
                            iAsInterface2 = 92;
                        }
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((ExtHubPageContext) it.next()).onWarmupCompleted() == 55) {
                                    iAsInterface2 = 55;
                                }
                            }
                        }
                    }
                    externalSyntheticLambda9 = externalSyntheticLambda3;
                    i2 = iAsInterface2;
                    z = zOnExtraCallbackWithResult2;
                    getcontentpaddingright = externalSyntheticLambda5;
                    strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                    if (strOnExtraCallback == null) {
                    }
                    return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case -1047860588:
                break;
            case -897050771:
                if (str.equals("social")) {
                    int i7 = extraCallback + 33;
                    writeTypedObject = i7 % 128;
                    if (i7 % 2 == 0) {
                        uriIAuthTabCallback = MainTabFragment.Companion.IAuthTabCallback(bundle);
                        int i8 = 73 / 0;
                        if (uriIAuthTabCallback == null) {
                            uriIAuthTabCallback = Uri.EMPTY;
                        }
                        if (onWarmupCompleted(45)) {
                            iAsInterface = asInterface();
                        } else {
                            TeensSocialFragment.onExtraCallback onextracallback = TeensSocialFragment.Companion;
                            Intrinsics.checkNotNull(uriIAuthTabCallback);
                            Bundle bundleOnExtraCallback = onextracallback.onExtraCallback(uriIAuthTabCallback);
                            zOnExtraCallbackWithResult = onExtraCallbackWithResult(this, uri, false, 1, null);
                            externalSyntheticLambda11 = new MainTabManager$.ExternalSyntheticLambda11<>(bundleOnExtraCallback);
                            i = 45;
                            i3 = i;
                            externalSyntheticLambda9 = externalSyntheticLambda3;
                            z = zOnExtraCallbackWithResult;
                            getcontentpaddingright = externalSyntheticLambda11;
                            i2 = i3;
                        }
                    } else {
                        uriIAuthTabCallback = MainTabFragment.Companion.IAuthTabCallback(bundle);
                        if (uriIAuthTabCallback == null) {
                        }
                        if (onWarmupCompleted(45)) {
                        }
                    }
                    strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                    if (strOnExtraCallback == null) {
                    }
                    return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case -841844741:
                break;
            case -344460952:
                if (str.equals("shopping")) {
                    int i9 = extraCallback + 1;
                    writeTypedObject = i9 % 128;
                    if (i9 % 2 == 0) {
                        MainTabFragment.Companion.IAuthTabCallback(bundle);
                        externalSyntheticLambda5.hashCode();
                        throw null;
                    }
                    Uri uriIAuthTabCallback2 = MainTabFragment.Companion.IAuthTabCallback(bundle);
                    if (uriIAuthTabCallback2 == null) {
                        uriIAuthTabCallback2 = Uri.EMPTY;
                    }
                    if (onWarmupCompleted(52)) {
                        GriverSessionDataExtension griverSessionDataExtension = GriverSessionDataExtension.onExtraCallback;
                        Intrinsics.checkNotNull(uriIAuthTabCallback2);
                        Bundle bundleOnExtraCallbackWithResult = GriverSessionDataExtension.onExtraCallbackWithResult(griverSessionDataExtension, uriIAuthTabCallback2, false, 2, (Object) null);
                        zOnExtraCallbackWithResult = onExtraCallbackWithResult(this, uri, false, 1, null);
                        externalSyntheticLambda11 = new MainTabManager$.ExternalSyntheticLambda10<>(bundleOnExtraCallbackWithResult);
                        i = 52;
                        i3 = i;
                        externalSyntheticLambda9 = externalSyntheticLambda3;
                        z = zOnExtraCallbackWithResult;
                        getcontentpaddingright = externalSyntheticLambda11;
                        i2 = i3;
                        strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                        if (strOnExtraCallback == null) {
                        }
                        return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
                    }
                    iAsInterface = asInterface();
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case -222710633:
                if (str.equals("benefit")) {
                    Uri uriIAuthTabCallback3 = MainTabFragment.Companion.IAuthTabCallback(bundle);
                    if (uriIAuthTabCallback3 == null) {
                        int i10 = extraCallback + 33;
                        writeTypedObject = i10 % 128;
                        int i11 = i10 % 2;
                        uriIAuthTabCallback3 = Uri.EMPTY;
                    }
                    Object[] objArr = new Object[1];
                    a(new char[]{9608, 7898, 21270, 37968, 51356, 3537, 17921, 47979}, 15173 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                    String queryParameter2 = uriIAuthTabCallback3.getQueryParameter(((String) objArr[0]).intern());
                    Object[] objArr2 = new Object[1];
                    b(new char[]{36485, 15648, 12704, 23268, 36485, 15648, 25226, 22085, 55779, 44319, 3283, 41725}, View.getDefaultSize(0, 0) + 11, objArr2);
                    String string = bundle.getString(((String) objArr2[0]).intern());
                    if (string != null) {
                        Uri uri2 = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{string});
                        if (uri2 != null) {
                            Object[] objArr3 = new Object[1];
                            a(new char[]{9608, 7898, 21270, 37968, 51356, 3537, 17921, 47979}, View.MeasureSpec.getSize(0) + 15173, objArr3);
                            queryParameter = uri2.getQueryParameter(((String) objArr3[0]).intern());
                        } else {
                            queryParameter = null;
                        }
                        boolean zContains = CollectionsKt.listOf(new Integer[]{17, 103}).contains(Integer.valueOf(onNavigationEvent()));
                        if (queryParameter2 != null && queryParameter2.length() != 0) {
                            str2 = queryParameter2;
                        } else if (queryParameter != null && queryParameter.length() != 0) {
                            str2 = queryParameter;
                        } else if (zContains) {
                            str2 = "last_tab";
                        } else {
                            int i12 = extraCallback + 13;
                            writeTypedObject = i12 % 128;
                            int i13 = i12 % 2;
                            str2 = "tab";
                        }
                        if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
                            UssBenefitFragment.onNavigationEvent onnavigationevent = UssBenefitFragment.Companion;
                            Intrinsics.checkNotNull(uriIAuthTabCallback3);
                            Bundle bundleIAuthTabCallback = onnavigationevent.IAuthTabCallback(uriIAuthTabCallback3);
                            boolean zOnExtraCallbackWithResult3 = onExtraCallbackWithResult(this, uri, false, 1, null);
                            getContentPaddingRight<Fragment> externalSyntheticLambda7 = new MainTabManager$.ExternalSyntheticLambda7<>(bundleIAuthTabCallback);
                            int i14 = writeTypedObject + 59;
                            extraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            getcontentpaddingright2 = externalSyntheticLambda7;
                            z2 = zOnExtraCallbackWithResult3;
                        } else {
                            i3 = getBillingCycleCount.onExtraCallback(this.IAuthTabCallback.onExtraCallbackWithResult()) ? 17 : 103;
                            boolean zOnExtraCallbackWithResult4 = onExtraCallbackWithResult(this, uri, false, 1, null);
                            getContentPaddingRight<Fragment> externalSyntheticLambda8 = new MainTabManager$.ExternalSyntheticLambda8<>(bundle, str2, uriIAuthTabCallback3);
                            z2 = zOnExtraCallbackWithResult4;
                            getcontentpaddingright2 = externalSyntheticLambda8;
                        }
                        z = z2;
                        getcontentpaddingright = getcontentpaddingright2;
                        externalSyntheticLambda9 = new MainTabManager$.ExternalSyntheticLambda9(string, bundle, this, context, queryParameter, queryParameter2);
                        i2 = i3;
                    }
                    strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                    if (strOnExtraCallback == null) {
                    }
                    return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case 464397511:
                if (str.equals("total-services")) {
                    externalSyntheticLambda5 = onExtraCallback(uri);
                    iAsInterface = 1;
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case 942399889:
                if (!str.equals("global_account")) {
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case 1280882667:
                if (str.equals("transfer")) {
                    if (onWarmupCompleted(18)) {
                        iAsInterface = 18;
                    } else {
                        iAsInterface = asInterface();
                        externalSyntheticLambda3 = new MainTabManager$.ExternalSyntheticLambda4(uri, this, context);
                    }
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case 1574008798:
                Object[] objArr4 = new Object[1];
                a(new char[]{9609, 28930, 36003, 55384, 30716, 33410, 56864, 30168, 33143, 56332}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21661, objArr4);
                if (str.equals(((String) objArr4[0]).intern())) {
                    int i16 = writeTypedObject + 101;
                    extraCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        MainTabFragment.Companion.IAuthTabCallback(bundle);
                        throw null;
                    }
                    Uri uriIAuthTabCallback4 = MainTabFragment.Companion.IAuthTabCallback(bundle);
                    if (uriIAuthTabCallback4 == null) {
                        uriIAuthTabCallback4 = Uri.EMPTY;
                    }
                    BigDataAIDLLiteServiceStubProxy bigDataAIDLLiteServiceStubProxy = BigDataAIDLLiteServiceStubProxy.onExtraCallbackWithResult;
                    Intrinsics.checkNotNull(uriIAuthTabCallback4);
                    if (bigDataAIDLLiteServiceStubProxy.onWarmupCompleted(uriIAuthTabCallback4, ((Boolean) isUserSubjectToGDPR.onNavigationEvent(new Object[]{isUserSubjectToGDPR.onWarmupCompleted}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 655245496, -655245488, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).booleanValue())) {
                        int i17 = extraCallback + 93;
                        writeTypedObject = i17 % 128;
                        if (i17 % 2 == 0) {
                            NestfgetmDriveCxxAnimations.onExtraCallbackWithResult.onWarmupCompleted();
                            externalSyntheticLambda5.hashCode();
                            throw null;
                        }
                        uriIAuthTabCallback4 = NestfgetmDriveCxxAnimations.onExtraCallbackWithResult.onWarmupCompleted();
                    }
                    setDebugLog setdebuglog = setDebugLog.onNavigationEvent;
                    Intrinsics.checkNotNull(uriIAuthTabCallback4);
                    Bundle bundleOnExtraCallback2 = setdebuglog.onExtraCallback(uriIAuthTabCallback4);
                    zOnExtraCallbackWithResult2 = ((Boolean) onNavigationEvent(ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -2017573501, ACPayResult.onWarmupCompleted(), 2017573501, new Object[]{this, uri, true}, ACPayResult.onWarmupCompleted())).booleanValue();
                    externalSyntheticLambda5 = new MainTabManager$.ExternalSyntheticLambda6<>(bundleOnExtraCallback2);
                    iAsInterface = 13;
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case 1984153269:
                if (!str.equals("service")) {
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
            case 1985941072:
                if (str.equals("setting")) {
                    int i18 = onWarmupCompleted.IAuthTabCallback[this.IAuthTabCallback.onExtraCallbackWithResult().ordinal()];
                    if (i18 != 1) {
                        int i19 = extraCallback + 11;
                        writeTypedObject = i19 % 128;
                        int i20 = i19 % 2;
                        if (i18 != 2 && i18 != 3 && i18 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = 106;
                    } else {
                        i4 = 20;
                    }
                    iAsInterface = i4;
                }
                externalSyntheticLambda9 = externalSyntheticLambda3;
                i2 = iAsInterface;
                z = zOnExtraCallbackWithResult2;
                getcontentpaddingright = externalSyntheticLambda5;
                strOnExtraCallback = createClient.onExtraCallback.onExtraCallback(i2);
                if (strOnExtraCallback == null) {
                }
                return new getEventInstanceId.onWarmupCompleted(strOnExtraCallback, i2, getcontentpaddingright, z, externalSyntheticLambda9);
        }
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(openFd openfd, Uri uri, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 103;
        int i4 = i3 % 128;
        extraCallback = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            int i5 = i4 + 57;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 4;
            }
            z = false;
        }
        Object[] objArr = {openfd, uri, Boolean.valueOf(z)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(ACPayResult.onWarmupCompleted(), iOnWarmupCompleted, -2017573501, ACPayResult.onWarmupCompleted(), 2017573501, objArr, ACPayResult.onWarmupCompleted())).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        r8 = kotlin.text.StringsKt.equals(r2, "true", true);
        r1 = o.openFd.writeTypedObject + 77;
        o.openFd.extraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        r1 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r2 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        String queryParameter;
        Uri uri = (Uri) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (uri != null) {
            int i4 = i3 + 53;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                b(new char[]{60044, 60991, 41417, 34199, 36055, 19047, 27607, 35265, 29537, 38129, 7130, 9956}, 61 >> ExpandableListView.getPackedPositionGroup(0L), objArr2);
                queryParameter = uri.getQueryParameter(((String) objArr2[0]).intern());
            } else {
                Object[] objArr3 = new Object[1];
                b(new char[]{60044, 60991, 41417, 34199, 36055, 19047, 27607, 35265, 29537, 38129, 7130, 9956}, 12 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
                queryParameter = uri.getQueryParameter(((String) objArr3[0]).intern());
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final int onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Integer interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor == null) {
            int iAsInterface = asInterface();
            int i4 = writeTypedObject + 97;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAsInterface;
        }
        int i6 = extraCallback + 57;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return interfaceDescriptor.intValue();
        }
        interfaceDescriptor.intValue();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (onWarmupCompleted(r1.intValue()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (onWarmupCompleted(r1.intValue()) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Integer getInterfaceDescriptor() throws Throwable {
        int i = 2 % 2;
        Integer numAccess100 = access100();
        if (numAccess100 != null) {
            int i2 = extraCallback + 117;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 87 / 0;
            }
        }
        int i4 = writeTypedObject + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final Integer access100() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = addPolicy.getSmallIconBitmap();
        boolean z = true;
        Object[] objArr = new Object[1];
        a(new char[]{9622, 39028, 24151, 7235, 53781, 36916, 22028, 5142, 51937, 35049, 20169, 3291, 49795, 32952, 18049, 1173, 64350, 47428, 32598}, 48671 - AndroidCharacter.getMirror('0'), objArr);
        Integer numValueOf = Integer.valueOf(smallIconBitmap.onWarmupCompleted(((String) objArr[0]).intern(), 0));
        int iIntValue = numValueOf.intValue();
        long jIAuthTabCallbackDefault = this.onTransact.IAuthTabCallbackDefault();
        TextRoundCornerProgressBarSavedState1 smallIconBitmap2 = addPolicy.getSmallIconBitmap();
        Object[] objArr2 = new Object[1];
        b(new char[]{65334, 57360, 63028, 36838, 7996, 38073, 31669, 28133, 25226, 22085, 62090, 6704, 15365, 27838, 14044, 54769, 37321, 62449, 38041, 46293, 18285, 15082, 62090, 6704, 55103, 57416}, View.resolveSize(0, 0) + 26, objArr2);
        if (jIAuthTabCallbackDefault - smallIconBitmap2.onExtraCallback(((String) objArr2[0]).intern(), 0L) > 1800000) {
            int i4 = writeTypedObject + 107;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        if (iIntValue <= 0 || z) {
            return null;
        }
        return numValueOf;
    }

    public final int onExtraCallback(int i) {
        int i2 = 2 % 2;
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        ExtHubPageContext extHubPageContext = (ExtHubPageContext) CollectionsKt.getOrNull((List) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, iOnWarmupCompleted3), i);
        if (extHubPageContext != null) {
            int i3 = extraCallback + 111;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            return extHubPageContext.onWarmupCompleted();
        }
        int i5 = writeTypedObject + 7;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 117;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        boolean zIsEmpty = ((List) onNavigationEvent(ACPayResult.onWarmupCompleted(), iOnWarmupCompleted, 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, ACPayResult.onWarmupCompleted())).isEmpty();
        if (!zIsEmpty) {
            int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
            int size = ((List) onNavigationEvent(ACPayResult.onWarmupCompleted(), iOnWarmupCompleted2, 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, ACPayResult.onWarmupCompleted())).size();
            for (int i5 = 0; i5 < size; i5++) {
                if (onExtraCallback(i5) == i) {
                    return i5;
                }
            }
            int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
            int size2 = ((List) onNavigationEvent(ACPayResult.onWarmupCompleted(), iOnWarmupCompleted3, 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, ACPayResult.onWarmupCompleted())).size();
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                if (onExtraCallback(i7) == asInterface()) {
                    int i8 = extraCallback + 29;
                    writeTypedObject = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    i6 = i7;
                }
            }
            int i9 = writeTypedObject + 7;
            extraCallback = i9 % 128;
            int i10 = i9 % 2;
            return i6;
        }
        int i11 = writeTypedObject + 17;
        extraCallback = i11 % 128;
        int i12 = i11 % 2;
        return 0;
    }

    private final getContentPaddingRight<Fragment> onExtraCallback(Uri uri) {
        int i = 2 % 2;
        MainTabManager$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new MainTabManager$.ExternalSyntheticLambda2(this, uri);
        int i2 = writeTypedObject + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return externalSyntheticLambda2;
    }

    private static final void onExtraCallback(openFd openfd, Uri uri, Fragment fragment) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        extraCallback = i2 % 128;
        BaseFragment baseFragment = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fragment, "");
            int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
            int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
            fragment.setArguments((Bundle) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, -2004884858, ACPayResult.onWarmupCompleted(), 2004884859, new Object[]{openfd, uri}, iOnWarmupCompleted3));
            boolean z = fragment instanceof BaseFragment;
            baseFragment.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        int iOnWarmupCompleted4 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted5 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted6 = ACPayResult.onWarmupCompleted();
        Bundle bundle = (Bundle) onNavigationEvent(iOnWarmupCompleted5, iOnWarmupCompleted4, -2004884858, ACPayResult.onWarmupCompleted(), 2004884859, new Object[]{openfd, uri}, iOnWarmupCompleted6);
        fragment.setArguments(bundle);
        if (fragment instanceof BaseFragment) {
            int i3 = extraCallback + 81;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                baseFragment.hashCode();
                throw null;
            }
            baseFragment = (BaseFragment) fragment;
        }
        if (baseFragment != null) {
            baseFragment.onNewArgument(new Bundle(bundle));
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        String str;
        Uri uri = (Uri) objArr[1];
        int i = 2 % 2;
        String strOnNavigationEvent = filterCreatePageParams.onNavigationEvent(uri, "redirect", (String) null, 2, (Object) null);
        if (!(!StringsKt.isBlank(strOnNavigationEvent))) {
            strOnNavigationEvent = null;
        }
        String strOnNavigationEvent2 = filterCreatePageParams.onNavigationEvent(uri, "openMiniAppUrl", (String) null, 2, (Object) null);
        String strOnNavigationEvent3 = filterCreatePageParams.onNavigationEvent(uri, "openMiniAppReturnAction", (String) null, 2, (Object) null);
        String strOnNavigationEvent4 = filterCreatePageParams.onNavigationEvent(uri, "openMiniAppFrom", (String) null, 2, (Object) null);
        String strOnNavigationEvent5 = filterCreatePageParams.onNavigationEvent(uri, "playAtTossOverlayId", (String) null, 2, (Object) null);
        if (StringsKt.isBlank(strOnNavigationEvent5)) {
            int i2 = extraCallback + 41;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            strOnNavigationEvent5 = null;
        }
        String strOnNavigationEvent6 = filterCreatePageParams.onNavigationEvent(uri, "playAtTossOverlayRewardType", (String) null, 2, (Object) null);
        if (StringsKt.isBlank(strOnNavigationEvent6)) {
            int i4 = writeTypedObject + 105;
            extraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            strOnNavigationEvent6 = null;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{9608, 7898, 21270, 37968, 51356, 3537, 17921, 47979}, ImageFormat.getBitsPerPixel(0) + 15174, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        String str2 = strOnNavigationEvent6;
        Object[] objArr3 = new Object[1];
        a(new char[]{9608, 7898, 21270, 37968, 51356, 3537, 17921, 47979}, 15173 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, filterCreatePageParams.onNavigationEvent(uri, ((String) objArr3[0]).intern(), (String) null, 2, (Object) null));
        if (strOnNavigationEvent != null || StringsKt.isBlank(strOnNavigationEvent2)) {
            str = null;
        } else {
            int i6 = writeTypedObject + 3;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            str = strOnNavigationEvent2;
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("openMiniAppUrl", str);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("openMiniAppReturnAction", strOnNavigationEvent3);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("openMiniAppFrom", strOnNavigationEvent4);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("inorganicId", Long.valueOf(((Long) filterCreatePageParams.onWarmupCompleted(new Object[]{uri, "inorganicId", 0L}, -1773045567, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1773045570)).longValue()));
        Object[] objArr4 = new Object[1];
        b(new char[]{36485, 15648, 12704, 23268, 36485, 15648, 25226, 22085, 55779, 44319, 3283, 41725}, 11 - (KeyEvent.getMaxKeyCode() >> 16), objArr4);
        return RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), strOnNavigationEvent), getWrite.IAuthTabCallback("playAtTossOverlayId", strOnNavigationEvent5), getWrite.IAuthTabCallback("playAtTossOverlayRewardType", str2)});
    }

    public static /* synthetic */ void IAuthTabCallback(Bundle bundle, String str, Uri uri, Fragment fragment) throws Throwable {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, 369739835, ACPayResult.onWarmupCompleted(), -369739827, new Object[]{bundle, str, uri, fragment}, iOnWarmupCompleted3);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Bundle bundle, Fragment fragment) throws Throwable {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, 410243687, ACPayResult.onWarmupCompleted(), -410243685, new Object[]{bundle, fragment}, iOnWarmupCompleted3);
    }

    private final Bundle IAuthTabCallback(Uri uri) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (Bundle) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, -2004884858, ACPayResult.onWarmupCompleted(), 2004884859, new Object[]{this, uri}, iOnWarmupCompleted3);
    }

    private final boolean onExtraCallback(Uri uri, boolean z) {
        Object[] objArr = {this, uri, Boolean.valueOf(z)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(ACPayResult.onWarmupCompleted(), iOnWarmupCompleted, -2017573501, ACPayResult.onWarmupCompleted(), 2017573501, objArr, ACPayResult.onWarmupCompleted())).booleanValue();
    }

    private static final void onTransact(Bundle bundle, Fragment fragment) throws Throwable {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, -1671510750, ACPayResult.onWarmupCompleted(), 1671510755, new Object[]{bundle, fragment}, iOnWarmupCompleted3);
    }

    private static final Unit onNavigationEvent(getEventInstanceId.onWarmupCompleted onwarmupcompleted, openFd openfd, Context context, String str) {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (Unit) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, -1985610052, ACPayResult.onWarmupCompleted(), 1985610056, new Object[]{onwarmupcompleted, openfd, context, str}, iOnWarmupCompleted3);
    }

    public final getEventInstanceId onWarmupCompleted() {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (getEventInstanceId) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, -880470252, ACPayResult.onWarmupCompleted(), 880470255, new Object[]{this}, iOnWarmupCompleted3);
    }

    public final List<ExtHubPageContext> IAuthTabCallback() {
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted2 = ACPayResult.onWarmupCompleted();
        int iOnWarmupCompleted3 = ACPayResult.onWarmupCompleted();
        return (List) onNavigationEvent(iOnWarmupCompleted2, iOnWarmupCompleted, 1339148817, ACPayResult.onWarmupCompleted(), -1339148811, new Object[]{this}, iOnWarmupCompleted3);
    }

    public final void IAuthTabCallback(int i) throws Throwable {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iOnWarmupCompleted = ACPayResult.onWarmupCompleted();
        onNavigationEvent(ACPayResult.onWarmupCompleted(), iOnWarmupCompleted, 926495754, ACPayResult.onWarmupCompleted(), -926495747, objArr, ACPayResult.onWarmupCompleted());
    }

    static void onTransact() {
        getInterfaceDescriptor = -4402326954769735475L;
        access000 = (char) 41619;
        IAuthTabCallbackStubProxy = (char) 2547;
        access100 = (char) 35492;
        IAuthTabCallback_Parcel = (char) 20263;
    }
}
