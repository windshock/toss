package viva.republica.toss.dev.screencapture;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.post.ParagraphSmall;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography12;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.AppsFlyerConsentCompanion;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.GeckoHubImp;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addPolicy;
import o.doGet;
import o.filterCreatePageParams;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getDelegateokhttp;
import o.getHasConsentForAdsPersonalization;
import o.getNotAfterTime;
import o.getUrlokhttp;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onTextViewSizeChanged;
import o.putChannelInfo;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.response;
import o.setCookieJarokhttp;
import o.setDnsokhttp;
import o.setDone;
import o.setMenus;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.varyMatches;
import o.verifySignatureValue_NoAlgorithmInfo;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.SchemeManagerInfoResponse;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ScreenCaptureAlertDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    public static final Object Companion;
    private static int IAuthTabCallbackDefault;
    private static boolean IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static int ICustomTabsCallback;
    private static int access000;
    private static boolean access100;
    private static char[] asBinder;
    private static byte[] extraCallbackWithResult;
    private static int getInterfaceDescriptor;
    public static final String onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static short[] readTypedObject;
    private final Activity IAuthTabCallback;
    private final Object asInterface;
    private final Enum onNavigationEvent;
    private final Long onTransact;
    private static final byte[] $$a = {110, ISOFileInfo.CHANNEL_SECURITY, 93, -109};
    private static final int $$b = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMinimized = 1;
    private static int writeTypedObject = 0;
    private static int extraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3;
        int i4 = (s2 * 2) + 4;
        int i5 = i * 4;
        byte[] bArr = $$a;
        int i6 = (s * 2) + 115;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            i6 = i7;
            int i8 = i4;
            int i9 = 0;
            int i10 = i4;
            i6 += -i8;
            i2 = i9;
            i3 = i10 + 1;
            bArr2[i2] = (byte) i6;
            i9 = i2 + 1;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i10 = i3;
            i6 += -i8;
            i2 = i9;
            i3 = i10 + 1;
            bArr2[i2] = (byte) i6;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            bArr2[i2] = (byte) i6;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        }
    }

    static {
        ICustomTabsCallback = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-112, -124, ISOFileInfo.SECURITY_ATTR_COMPACT, -113, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.PROP_INFO, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.FCI_EXT, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, -119, -120, ISOFileInfo.FCI_EXT, -122, ISOFileInfo.DATA_BYTES2, ISOFileInfo.PROP_INFO, -124, -124, ISOFileInfo.FILE_IDENTIFIER, -126, ISOFileInfo.DATA_BYTES2}, 127 - Color.red(0), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        try {
            Object[] objArr2 = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-482594544);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 79 - (ViewConfiguration.getPressedStateDuration() >> 16), 23380 - (Process.myTid() >> 22), -763572352, false, (String) null, new Class[]{DefaultConstructorMarker.class});
            }
            Companion = ((Constructor) objOnExtraCallback).newInstance(objArr2);
            onExtraCallbackWithResult = 8;
            int i = onMinimized + 3;
            ICustomTabsCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(TdsBottomCtaV1View tdsBottomCtaV1View, getNotAfterTime getnotaftertime, ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(new Object[]{tdsBottomCtaV1View, getnotaftertime, screenCaptureAlertDialog, view}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1657709642, -1657709641, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{screenCaptureAlertDialog, view}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -51629261, 51629263, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
        int i4 = extraCallback + 79;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = ~i3;
        int i10 = ~i5;
        int i11 = i8 | (~(i9 | i10 | i4));
        int i12 = (~(i5 | i9 | i4)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i3 + i4 + i6 + (762713021 * i) + (1579510587 * i2);
        int i15 = i14 * i14;
        int i16 = ((i3 * (-1846875272)) - 1480523776) + ((-1846875272) * i4) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i6) + ((-750387200) * i) + ((-523632640) * i2) + ((-1971257344) * i15);
        int i17 = ((i3 * (-1364308824)) - 1074288667) + (i4 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i6 * (-1364308165)) + (i * (-893132913)) + (i2 * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(screenCaptureAlertDialog, view);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = extraCallback + 81;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 55;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(screenCaptureAlertDialog, view);
        }
        onExtraCallbackWithResult(screenCaptureAlertDialog, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getDelegateokhttp onWarmupCompleted(Context context, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        getDelegateokhttp getdelegateokhttpIAuthTabCallback = IAuthTabCallback(context, f);
        int i4 = extraCallback + 33;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return getdelegateokhttpIAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCaptureAlertDialog(@NotNull Activity activity, @Nullable Long l) throws Throwable {
        super(activity, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(activity, BuildConfig.FLAVOR);
        this.IAuthTabCallback = activity;
        this.onTransact = l;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1701919771);
        try {
            Object[] objArr = {((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 21402), View.MeasureSpec.makeMeasureSpec(0, 0) + 15, View.MeasureSpec.getMode(0) + 23274, 1412547211, false, "Companion", (Class[]) null) : objOnExtraCallback)).get(null), activity};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1823625800);
            Enum r1 = (Enum) ((Method) (objOnExtraCallback2 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (30264 - ExpandableListView.getPackedPositionType(0L)), 11 - Drawable.resolveOpacity(0, 0), 23323 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1576185048, false, "onNavigationEvent", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19923), 32 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), 23288 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), Activity.class}) : objOnExtraCallback2)).invoke(null, objArr);
            this.onNavigationEvent = r1;
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1512542164);
            Object obj = ((Field) (objOnExtraCallback3 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 14889), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 24, 24283 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1801941316, false, "Companion", (Class[]) null) : objOnExtraCallback3)).get(null);
            Object[] objArr2 = {r1, activity};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1141030343);
            this.asInterface = ((Method) (objOnExtraCallback4 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (15983 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), 41 - (Process.myTid() >> 22), 24347 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 1967276887, false, "onNavigationEvent", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((KeyEvent.getMaxKeyCode() >> 16) + 21401), 15 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23274), Activity.class}) : objOnExtraCallback4)).invoke(obj, objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static final /* synthetic */ Long onExtraCallbackWithResult(ScreenCaptureAlertDialog screenCaptureAlertDialog) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        Long l = screenCaptureAlertDialog.onTransact;
        int i5 = i3 + 107;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(ScreenCaptureAlertDialog screenCaptureAlertDialog, Long l, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = screenCaptureAlertDialog.IAuthTabCallback(l, (access13800<? super SchemeManagerInfoResponse>) access13800Var);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        int i5 = extraCallback + 1;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        ScreenCaptureAlertDialog screenCaptureAlertDialog = (ScreenCaptureAlertDialog) objArr[0];
        access13800<? super String> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 15;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = screenCaptureAlertDialog.onExtraCallback(access13800Var);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = writeTypedObject + 125;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return objOnExtraCallback;
    }

    public static final /* synthetic */ boolean onNavigationEvent(ScreenCaptureAlertDialog screenCaptureAlertDialog) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 67;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            screenCaptureAlertDialog.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = screenCaptureAlertDialog.onExtraCallbackWithResult();
        int i3 = writeTypedObject + 63;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this);
        try {
            Object[] objArr = {this, null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(201120256);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 73 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 24186, 985408656, false, (String) null, new Class[]{ScreenCaptureAlertDialog.class, access13800.class});
            }
            maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr), 3, (Object) null);
            int i2 = extraCallback + 103;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 26 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(Long l, access13800<? super SchemeManagerInfoResponse> access13800Var) throws Throwable {
        Object obj;
        access13800<? super SchemeManagerInfoResponse> access13800Var2 = access13800Var;
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(!((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 10359), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 86, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23942)).isInstance(access13800Var2))) {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(184070444);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 85 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 23942 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1001934780, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
            }
            int i4 = ((Field) objOnExtraCallback).getInt(access13800Var2);
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                int i5 = extraCallback + 73;
                writeTypedObject = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + PKIFailureInfo.systemUnavail;
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(184070444);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10357), 86 - Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23943, 1001934780, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
                }
                ((Field) objOnExtraCallback2).setInt(access13800Var2, i7);
            } else {
                try {
                    Object[] objArr = {this, access13800Var2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1971943603);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - (ViewConfiguration.getTouchSlop() >> 8)), 86 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23941 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 1154057763, false, (String) null, new Class[]{ScreenCaptureAlertDialog.class, access13800.class});
                    }
                    access13800Var2 = (access13800) ((Constructor) objOnExtraCallback3).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1819212141);
        if (objOnExtraCallback4 == null) {
            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - KeyEvent.getDeadChar(0, 0)), 86 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.rgb(0, 0, 0) + 16801158, -1563297789, false, verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_RESULT, (Class[]) null);
        }
        Object objOnExtraCallback5 = ((Field) objOnExtraCallback4).get(access13800Var2);
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(184070444);
        if (objOnExtraCallback6 == null) {
            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - View.resolveSize(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 87, 23941 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 1001934780, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
        }
        int i8 = ((Field) objOnExtraCallback6).getInt(access13800Var2);
        try {
            if (i8 != 0) {
                int i9 = writeTypedObject;
                int i10 = i9 + 61;
                extraCallback = i10 % 128;
                int i11 = i10 % 2;
                if (i8 != 1) {
                    Object[] objArr2 = new Object[1];
                    b((byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (short) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getLongPressTimeout() >> 16) + 610485885, (-17139) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1380671123, objArr2);
                    throw new IllegalStateException(((String) objArr2[0]).intern());
                }
                int i12 = i9 + 5;
                extraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-430419503);
                    if (objOnExtraCallback7 == null) {
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10357 - ExpandableListView.getPackedPositionChild(0L)), 86 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 23942 - Color.blue(0), -686248127, false, "L$1", (Class[]) null);
                    }
                    Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-431343024);
                    if (objOnExtraCallback8 == null) {
                        objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10358), (ViewConfiguration.getPressedStateDuration() >> 16) + 86, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 23942, -687160128, false, "L$0", (Class[]) null);
                    }
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                    int i13 = 96 / 0;
                } else {
                    Object objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-430419503);
                    if (objOnExtraCallback9 == null) {
                        objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - KeyEvent.normalizeMetaState(0)), 86 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23943 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -686248127, false, "L$1", (Class[]) null);
                    }
                    Object objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-431343024);
                    if (objOnExtraCallback10 == null) {
                        objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - View.combineMeasuredStates(0, 0)), 86 - (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 23942, -687160128, false, "L$0", (Class[]) null);
                    }
                    ResultKt.onNavigationEvent(objOnExtraCallback5);
                }
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallback5);
                if (l == null || l.longValue() == -1) {
                    return null;
                }
                Result.Companion companion = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                try {
                    Object[] objArr3 = {null, l};
                    Object objOnExtraCallback11 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1578090078);
                    if (objOnExtraCallback11 == null) {
                        objOnExtraCallback11 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (3075 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), 74 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23868 - View.MeasureSpec.getMode(0), 1867464910, false, (String) null, new Class[]{access13800.class, Long.class});
                    }
                    Function2 function2 = (Function2) ((Constructor) objOnExtraCallback11).newInstance(objArr3);
                    Object objOnNavigationEvent = access15400.onNavigationEvent(l);
                    Object objOnExtraCallback12 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-431343024);
                    if (objOnExtraCallback12 == null) {
                        objOnExtraCallback12 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 10358), 86 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 23942 - View.MeasureSpec.getSize(0), -687160128, false, "L$0", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback12).set(access13800Var2, objOnNavigationEvent);
                    Object objOnNavigationEvent2 = access15400.onNavigationEvent(access13800Var2);
                    Object objOnExtraCallback13 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-430419503);
                    if (objOnExtraCallback13 == null) {
                        objOnExtraCallback13 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - (Process.myTid() >> 22)), 86 - (ViewConfiguration.getEdgeSlop() >> 16), 23942 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), -686248127, false, "L$1", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback13).set(access13800Var2, objOnNavigationEvent2);
                    Object objOnExtraCallback14 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1201113229);
                    if (objOnExtraCallback14 == null) {
                        objOnExtraCallback14 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - (Process.myTid() >> 22)), 86 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 23942 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1993831965, false, "I$0", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback14).setInt(access13800Var2, 0);
                    Object objOnExtraCallback15 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1202036750);
                    if (objOnExtraCallback15 == null) {
                        objOnExtraCallback15 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10358 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 86, 23942 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1994743454, false, "I$1", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback15).setInt(access13800Var2, 0);
                    Object objOnExtraCallback16 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1202960271);
                    if (objOnExtraCallback16 == null) {
                        objOnExtraCallback16 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10359 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 87, 23942 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1995655455, false, "I$2", (Class[]) null);
                    }
                    ((Field) objOnExtraCallback16).setInt(access13800Var2, 0);
                    Object objOnExtraCallback17 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(184070444);
                    if (objOnExtraCallback17 == null) {
                        objOnExtraCallback17 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 10358), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 86, 23942 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1001934780, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
                    }
                    ((Field) objOnExtraCallback17).setInt(access13800Var2, 1);
                    objOnExtraCallback5 = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, function2, access13800Var2);
                    if (objOnExtraCallback5 == objOnWarmupCompleted) {
                        int i14 = writeTypedObject + 27;
                        extraCallback = i14 % 128;
                        int i15 = i14 % 2;
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            obj = Result.constructor-impl(objOnExtraCallback5);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (WebResourceResponseModel e3) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(e3));
        }
        if (Result.exceptionOrNull-impl(obj) == null) {
            return (SchemeManagerInfoResponse) obj;
        }
        return null;
    }

    private final boolean onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        Object obj = this.asInterface;
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1530829774);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14889 - View.getDefaultSize(0, 0)), 24 - KeyEvent.normalizeMetaState(0), 24283 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1786668382, false, "onTransact", new Class[0]);
            }
            Object obj2 = null;
            Object objInvoke = ((Method) objOnExtraCallback).invoke(obj, null);
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-756916776);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 7094, -475880632, false, "CORE", (Class[]) null);
            }
            if (objInvoke != ((Field) objOnExtraCallback2).get(null)) {
                return false;
            }
            int i2 = extraCallback;
            int i3 = i2 + 71;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private final Object onExtraCallback(access13800<? super String> access13800Var) throws Throwable {
        int i = 2 % 2;
        View decorView = this.IAuthTabCallback.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, BuildConfig.FLAVOR);
        WebView webViewOnWarmupCompleted = onWarmupCompleted(decorView);
        if (webViewOnWarmupCompleted != null) {
            String url = webViewOnWarmupCompleted.getUrl();
            if (url != null) {
                Uri uri = Uri.parse(url);
                Intrinsics.checkNotNullExpressionValue(uri, BuildConfig.FLAVOR);
                if (filterCreatePageParams.IAuthTabCallbackStub(uri)) {
                    try {
                        Object[] objArr = {webViewOnWarmupCompleted, null};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(288555737);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (61916 - View.getDefaultSize(0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 71, 24028 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 544472137, false, (String) null, new Class[]{WebView.class, access13800.class});
                        }
                        return doGet.onWarmupCompleted(500L, (Function2) ((Constructor) objOnExtraCallback).newInstance(objArr), access13800Var);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            int i2 = extraCallback + 79;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
            }
            return null;
        }
        int i4 = writeTypedObject + 53;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final WebView onWarmupCompleted(View view) {
        int i = 2 % 2;
        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            if (webView.isShown()) {
                int i2 = writeTypedObject + 3;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                return webView;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i4 = extraCallback + 107;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            Intrinsics.checkNotNullExpressionValue(childAt, BuildConfig.FLAVOR);
            WebView webViewOnWarmupCompleted = onWarmupCompleted(childAt);
            if (webViewOnWarmupCompleted != null) {
                int i7 = extraCallback + 95;
                writeTypedObject = i7 % 128;
                int i8 = i7 % 2;
                return webViewOnWarmupCompleted;
            }
        }
        return null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = asBinder;
        if (cArr2 != null) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), KeyEvent.normalizeMetaState(0) + 77, 20952 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 76, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (IAuthTabCallbackStubProxy) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i7 = $10 + 41;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 15;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), Color.alpha(0) + 63, 12214 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr4);
            int i11 = $10 + 87;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        if (!access100) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i12 = $11 + 79;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 4 % 3;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = $11 + 37;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getTapTimeout() >> 16) + 63, (ViewConfiguration.getPressedStateDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i6 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    private static final getDelegateokhttp IAuthTabCallback(Context context, float f) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 125;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
            getDelegateokhttp.Companion.onExtraCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        getDelegateokhttp getdelegateokhttpOnExtraCallback = getDelegateokhttp.Companion.onExtraCallback();
        int i3 = writeTypedObject + 67;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return getdelegateokhttpOnExtraCallback;
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        boolean z2;
        int length;
        byte[] bArr;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(getInterfaceDescriptor)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 42 - Color.blue(0), Drawable.resolveOpacity(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 73;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = extraCallbackWithResult;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = $11 + 31;
                        $10 = i9 % 128;
                        if (i9 % i4 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.getDefaultSize(0, 0)), View.resolveSizeAndState(0, 0, 0) + 55, 2167 - (Process.myPid() >> 22), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8--;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - ((Process.getThreadPriority(0) + 20) >> 6)), View.getDefaultSize(0, 0) + 55, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 2167, -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr3[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i4 = 2;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = extraCallbackWithResult;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(access000)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43424), 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22438 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (readTypedObject[i + ((int) (access000 ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (access000 ^ j)) + (!z ? 0 : 1);
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(IAuthTabCallback_Parcel), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (KeyEvent.getMaxKeyCode() >> 16) + 86, ExpandableListView.getPackedPositionGroup(0L) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = extraCallbackWithResult;
                if (bArr5 != null) {
                    int i10 = $11 + 89;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        bArr[i11] = (byte) (bArr5[i11] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i12 = $10 + 71;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        int i14 = $11 + 57;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        byte[] bArr6 = extraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = readTypedObject;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[0];
        getNotAfterTime getnotaftertime = (getNotAfterTime) objArr[1];
        ScreenCaptureAlertDialog screenCaptureAlertDialog = (ScreenCaptureAlertDialog) objArr[2];
        View view = (View) objArr[3];
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        ReactNativeFeatureFlagsCxxInterop reactNativeFeatureFlagsCxxInterop = ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted;
        Context context = tdsBottomCtaV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
        reactNativeFeatureFlagsCxxInterop.onExtraCallback(context, getnotaftertime.toString());
        Activity activity = screenCaptureAlertDialog.IAuthTabCallback;
        Object[] objArr2 = new Object[1];
        b((byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 610485879, MotionEvent.axisFromString(BuildConfig.FLAVOR) - 17138, (ViewConfiguration.getScrollBarSize() >> 8) + 1380719397, objArr2);
        onJsBridgeReady.onNavigationEvent(activity, ((String) objArr2[0]).intern(), 0, 2, (Object) null);
        screenCaptureAlertDialog.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 97;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            screenCaptureAlertDialog.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        screenCaptureAlertDialog.dismiss();
        int i3 = 54 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        ScreenCaptureAlertDialog screenCaptureAlertDialog = (ScreenCaptureAlertDialog) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        Object obj = screenCaptureAlertDialog.asInterface;
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1120216);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43259 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 81 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 23537 - Color.blue(0), 827451720, false, "onExtraCallback", new Class[0]);
            }
            Object obj2 = null;
            ((Function1) ((Method) objOnExtraCallback).invoke(obj, null)).invoke(screenCaptureAlertDialog.IAuthTabCallback);
            screenCaptureAlertDialog.dismiss();
            Unit unit = Unit.INSTANCE;
            int i4 = extraCallback + 31;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Unit IAuthTabCallbackDefault(ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 37;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            Object obj = screenCaptureAlertDialog.asInterface;
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-308760899);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (8736 - View.resolveSize(0, 0)), Color.red(0) + 78, Color.red(0) + 23459, -589803475, false, "onWarmupCompleted", new Class[0]);
                }
                ((Function1) ((Method) objOnExtraCallback).invoke(obj, null)).invoke(screenCaptureAlertDialog.IAuthTabCallback);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        Object obj2 = screenCaptureAlertDialog.asInterface;
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-308760899);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (8736 - Color.alpha(0)), MotionEvent.axisFromString(BuildConfig.FLAVOR) + 79, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 23459, -589803475, false, "onWarmupCompleted", new Class[0]);
            }
            ((Function1) ((Method) objOnExtraCallback2).invoke(obj2, null)).invoke(screenCaptureAlertDialog.IAuthTabCallback);
            Unit unit = Unit.INSTANCE;
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@Nullable SchemeManagerInfoResponse schemeManagerInfoResponse, @Nullable String str, @NotNull access13800<? super View> access13800Var) throws Throwable {
        String strIntern;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        SchemeManagerInfoResponse schemeManagerInfoResponse2;
        char[] cArr;
        char[] cArr2;
        String strIntern2;
        String strIntern3;
        access13800<? super View> access13800Var2 = access13800Var;
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((ViewConfiguration.getTouchSlop() >> 8) + 50687), 80 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 23617 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0))).isInstance(access13800Var2);
            throw null;
        }
        if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50686), AndroidCharacter.getMirror('0') + ' ', View.MeasureSpec.getMode(0) + 23617)).isInstance(access13800Var2)) {
            int i3 = extraCallback + 59;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-478427456);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 50687), 80 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 23617 - View.MeasureSpec.getSize(0), -767870896, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
            }
            int i5 = ((Field) objOnExtraCallback).getInt(access13800Var2);
            if ((Integer.MIN_VALUE & i5) != 0) {
                int i6 = i5 + PKIFailureInfo.systemUnavail;
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-478427456);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 80, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 23617, -767870896, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
                }
                ((Field) objOnExtraCallback2).setInt(access13800Var2, i6);
            } else {
                try {
                    Object[] objArr = {this, access13800Var2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(171984455);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50687), (Process.myPid() >> 22) + 80, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23617, 989903063, false, (String) null, new Class[]{ScreenCaptureAlertDialog.class, access13800.class});
                    }
                    access13800Var2 = (access13800) ((Constructor) objOnExtraCallback3).newInstance(objArr);
                    int i7 = extraCallback + 27;
                    writeTypedObject = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-881810561);
        if (objOnExtraCallback4 == null) {
            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 50687), 80 - (ViewConfiguration.getEdgeSlop() >> 16), 23617 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), -97493521, false, verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_RESULT, (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback4).get(access13800Var2);
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-478427456);
        if (objOnExtraCallback5 == null) {
            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - Gravity.getAbsoluteGravity(0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 80, (ViewConfiguration.getTouchSlop() >> 8) + 23617, -767870896, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
        }
        int i9 = ((Field) objOnExtraCallback5).getInt(access13800Var2);
        if (i9 == 0) {
            ResultKt.onNavigationEvent(obj);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(1);
            Context context2 = linearLayout3.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
            BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            Object[] objArr2 = new Object[1];
            b((byte) ExpandableListView.getPackedPositionType(0L), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 610485933, (-17139) - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), (ViewConfiguration.getTouchSlop() >> 8) + 1380724688, objArr2);
            bottomSheetHeader.setTitle(((String) objArr2[0]).intern());
            bottomSheetHeader.readTypedObject().setTextSize(1, 20.0f);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.A5, -92, ISO7816.INS_GET_RESPONSE, -99, -106, -65, -86, -66, -67, PSSSigner.TRAILER_IMPLICIT, -106, -111, -69, -106, -70, -71, -72, -106, -75, -73, ISOFileInfo.A5, -92, ISO7816.INS_READ_RECORD_STAMPED, -106, -75, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_READ_RECORD2, -106, -78, -106, ISO7816.INS_READ_BINARY2, ISO7816.INS_READ_BINARY, -83, -81, ISOFileInfo.A1, -106, -82, -83, -84, ISOFileInfo.AB, -106, -86, -87, -88, -106, -98, -89, -90, -106, ISOFileInfo.A5, -92, -93, -94, ISOFileInfo.A1, ISOFileInfo.A0, -97, -106, -104, -105, -106, -98, -99, -100, -106, -101, -102, -103, -106, -104, -105, -106, -107, -108, -109, -110, -111}, (ViewConfiguration.getScrollBarSize() >> 8) + CertificateBody.profileType, objArr3);
            bottomSheetHeader.setDescription(((String) objArr3[0]).intern());
            bottomSheetHeader.asInterface().setTextSize(1, 15.0f);
            bottomSheetHeader.setShowCloseIcon(false);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout3, bottomSheetHeader);
            onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-570579740);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - ExpandableListView.getPackedPositionType(0L)), View.combineMeasuredStates(0, 0) + 80, TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 23617, -323134860, false, "L$0", (Class[]) null);
            }
            ((Field) objOnExtraCallback6).set(access13800Var2, schemeManagerInfoResponse);
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-569656219);
            if (objOnExtraCallback7 == null) {
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 50687), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 80, 23617 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -280280331, false, "L$1", (Class[]) null);
            }
            strIntern = str;
            ((Field) objOnExtraCallback7).set(access13800Var2, strIntern);
            Object objOnNavigationEvent = access15400.onNavigationEvent(this);
            Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-568732698);
            if (objOnExtraCallback8 == null) {
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 50687), 79 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 23617 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -279368330, false, "L$2", (Class[]) null);
            }
            ((Field) objOnExtraCallback8).set(access13800Var2, objOnNavigationEvent);
            Object objOnNavigationEvent2 = access15400.onNavigationEvent(context);
            Object objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-567809177);
            if (objOnExtraCallback9 == null) {
                objOnExtraCallback9 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 50687), 80 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23617, -278456841, false, "L$3", (Class[]) null);
            }
            ((Field) objOnExtraCallback9).set(access13800Var2, objOnNavigationEvent2);
            Object objOnNavigationEvent3 = access15400.onNavigationEvent(context);
            Object objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-566885656);
            if (objOnExtraCallback10 == null) {
                objOnExtraCallback10 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - Color.alpha(0)), 79 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 23618, -277414792, false, "L$4", (Class[]) null);
            }
            ((Field) objOnExtraCallback10).set(access13800Var2, objOnNavigationEvent3);
            Object objOnExtraCallback11 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-565962135);
            if (objOnExtraCallback11 == null) {
                objOnExtraCallback11 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 50687), 80 - (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23616, -284891911, false, "L$5", (Class[]) null);
            }
            ((Field) objOnExtraCallback11).set(access13800Var2, linearLayout3);
            Object objOnExtraCallback12 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-565038614);
            if (objOnExtraCallback12 == null) {
                objOnExtraCallback12 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50686 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), Gravity.getAbsoluteGravity(0, 0) + 80, 23617 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -283979910, false, "L$6", (Class[]) null);
            }
            ((Field) objOnExtraCallback12).set(access13800Var2, linearLayout3);
            Object objOnExtraCallback13 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1061876513);
            if (objOnExtraCallback13 == null) {
                objOnExtraCallback13 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50687), 80 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23616, 235539889, false, "I$0", (Class[]) null);
            }
            ((Field) objOnExtraCallback13).setInt(access13800Var2, 0);
            Object objOnExtraCallback14 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1062800034);
            if (objOnExtraCallback14 == null) {
                objOnExtraCallback14 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - View.combineMeasuredStates(0, 0)), 80 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 23617 - Color.red(0), 236581938, false, "I$1", (Class[]) null);
            }
            ((Field) objOnExtraCallback14).setInt(access13800Var2, 0);
            Object objOnExtraCallback15 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1063723555);
            if (objOnExtraCallback15 == null) {
                objOnExtraCallback15 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 50687), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 80, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23616, 237493427, false, "I$2", (Class[]) null);
            }
            ((Field) objOnExtraCallback15).setInt(access13800Var2, 1);
            Object objOnExtraCallback16 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1064647076);
            if (objOnExtraCallback16 == null) {
                objOnExtraCallback16 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - View.getDefaultSize(0, 0)), 80 - Drawable.resolveOpacity(0, 0), 23618 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 238405428, false, "I$3", (Class[]) null);
            }
            ((Field) objOnExtraCallback16).setInt(access13800Var2, 0);
            Object objOnExtraCallback17 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1065570597);
            if (objOnExtraCallback17 == null) {
                objOnExtraCallback17 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50688 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 80 - (ViewConfiguration.getLongPressTimeout() >> 16), 23618 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 247705525, false, "I$4", (Class[]) null);
            }
            ((Field) objOnExtraCallback17).setInt(access13800Var2, 0);
            Object objOnExtraCallback18 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-478427456);
            if (objOnExtraCallback18 == null) {
                objOnExtraCallback18 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50686 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), Color.argb(0, 0, 0, 0) + 80, 23617 - View.resolveSize(0, 0), -767870896, false, AnnotatedPrivateKey.LABEL, (Class[]) null);
            }
            ((Field) objOnExtraCallback18).setInt(access13800Var2, 1);
            Object objOnExtraCallbackWithResult = ontextviewsizechanged.onExtraCallbackWithResult(access13800Var2);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                int i10 = extraCallback + 85;
                writeTypedObject = i10 % 128;
                if (i10 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
            linearLayout = linearLayout3;
            linearLayout2 = linearLayout;
            obj = objOnExtraCallbackWithResult;
            schemeManagerInfoResponse2 = schemeManagerInfoResponse;
        } else {
            if (i9 != 1) {
                Object[] objArr4 = new Object[1];
                b((byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.green(0) + 610485885, (-17140) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1380671122, objArr4);
                throw new IllegalStateException(((String) objArr4[0]).intern());
            }
            int i11 = extraCallback + 83;
            writeTypedObject = i11 % 128;
            int i12 = i11 % 2;
            Object objOnExtraCallback19 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-565038614);
            if (objOnExtraCallback19 == null) {
                objOnExtraCallback19 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - View.MeasureSpec.getSize(0)), 79 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 23616 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), -283979910, false, "L$6", (Class[]) null);
            }
            linearLayout2 = (LinearLayout) ((Field) objOnExtraCallback19).get(access13800Var2);
            Object objOnExtraCallback20 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-565962135);
            if (objOnExtraCallback20 == null) {
                objOnExtraCallback20 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - View.MeasureSpec.getMode(0)), AndroidCharacter.getMirror('0') + ' ', TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 23617, -284891911, false, "L$5", (Class[]) null);
            }
            linearLayout = (LinearLayout) ((Field) objOnExtraCallback20).get(access13800Var2);
            Object objOnExtraCallback21 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-566885656);
            if (objOnExtraCallback21 == null) {
                objOnExtraCallback21 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50686 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 80, 23618 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -277414792, false, "L$4", (Class[]) null);
            }
            Object objOnExtraCallback22 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-567809177);
            if (objOnExtraCallback22 == null) {
                objOnExtraCallback22 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - Color.alpha(0)), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 80, Color.rgb(0, 0, 0) + 16800833, -278456841, false, "L$3", (Class[]) null);
            }
            Object objOnExtraCallback23 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-568732698);
            if (objOnExtraCallback23 == null) {
                objOnExtraCallback23 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 50687), 80 - KeyEvent.normalizeMetaState(0), 23616 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -279368330, false, "L$2", (Class[]) null);
            }
            Object objOnExtraCallback24 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-569656219);
            if (objOnExtraCallback24 == null) {
                objOnExtraCallback24 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50688 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 79, 23616 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), -280280331, false, "L$1", (Class[]) null);
            }
            String str2 = (String) ((Field) objOnExtraCallback24).get(access13800Var2);
            Object objOnExtraCallback25 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-570579740);
            if (objOnExtraCallback25 == null) {
                objOnExtraCallback25 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (50687 - Color.alpha(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 80, 23617 - (ViewConfiguration.getLongPressTimeout() >> 16), -323134860, false, "L$0", (Class[]) null);
            }
            schemeManagerInfoResponse2 = (SchemeManagerInfoResponse) ((Field) objOnExtraCallback25).get(access13800Var2);
            ResultKt.onNavigationEvent(obj);
            strIntern = str2;
        }
        onTextViewSizeChanged.onExtraCallback onextracallback = (onTextViewSizeChanged.onExtraCallback) obj;
        if (onextracallback != null) {
            Context context3 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, BuildConfig.FLAVOR);
            LinearLayout linearLayout4 = new LinearLayout(context3);
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(1);
            Context context4 = linearLayout4.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, BuildConfig.FLAVOR);
            TdsBadgeV1View tdsBadgeV1View = new TdsBadgeV1View(context4);
            tdsBadgeV1View.setTheme(new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.RED, TdsBadgeV1View.onExtraCallback.WEAK_ROUND, TdsBadgeV1View.IAuthTabCallback.SMALL));
            String strName = onextracallback.name();
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            b((byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1), (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 610485945, (-17139) - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 1380720851 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb.append(strName);
            tdsBadgeV1View.setText(sb.toString());
            linearLayout4.addView(tdsBadgeV1View);
            BaseTextView baseTextView = (BaseTextView) Typography7.class.getDeclaredConstructor(Context.class).newInstance(linearLayout4.getContext());
            Intrinsics.checkNotNull(baseTextView);
            Object[] objArr6 = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.A5, -92, -58, -59, -106, -82, -83, -60, -61, -106, -66, ISO7816.INS_ENVELOPE, -63, -106}, 126 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), objArr6);
            baseTextView.setText(((String) objArr6[0]).intern());
            Intrinsics.checkNotNull(baseTextView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout4, baseTextView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, linearLayout4);
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback = addPolicy.ITrustedWebActivityCallback();
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-56, -52, ISOFileInfo.CHANNEL_SECURITY, -50, -53, ISOFileInfo.CHANNEL_SECURITY, -51, -52, -55, -53, ISO7816.INS_GET_DATA, -55, ISOFileInfo.CHANNEL_SECURITY, -56, -57}, 127 - Color.blue(0), objArr7);
        if (!StringsKt.isBlank(textRoundCornerProgressBarSavedState1ITrustedWebActivityCallback.onExtraCallbackWithResult(((String) objArr7[0]).intern(), BuildConfig.FLAVOR))) {
            BaseTextView baseTextView2 = (BaseTextView) SubTypography12.class.getDeclaredConstructor(Context.class).newInstance(linearLayout2.getContext());
            Intrinsics.checkNotNull(baseTextView2);
            baseTextView2.setGravity(1);
            setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(baseTextView2, varyMatches.IAuthTabCallback(baseTextView2, access14000.onNavigationEvent(8)));
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -935338024, new Object[]{baseTextView2, Integer.valueOf(varyMatches.IAuthTabCallback(baseTextView2, access14000.onNavigationEvent(16))), Integer.valueOf(varyMatches.IAuthTabCallback(baseTextView2, access14000.onNavigationEvent(16)))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 935338026);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context5 = baseTextView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, BuildConfig.FLAVOR);
            Typeface typeface$default = response.toTypeface$default(response.Bold, context5, (setDone) null, 2, (Object) null);
            if (typeface$default != null) {
                setCookieJarokhttp setcookiejarokhttp = new setCookieJarokhttp(typeface$default);
                int length = spannableStringBuilder.length();
                Object[] objArr8 = new Object[1];
                b((byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 610485950 - View.MeasureSpec.makeMeasureSpec(0, 0), (-17140) - ImageFormat.getBitsPerPixel(0), Color.red(0) + 1380680224, objArr8);
                spannableStringBuilder.append((CharSequence) ((String) objArr8[0]).intern());
                spannableStringBuilder.setSpan(setcookiejarokhttp, length, spannableStringBuilder.length(), 17);
            }
            baseTextView2.setText(new SpannedString(spannableStringBuilder));
            Intrinsics.checkNotNull(baseTextView2);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, baseTextView2);
        }
        getHasConsentForAdsPersonalization.onNavigationEvent onnavigationeventIAuthTabCallback = getHasConsentForAdsPersonalization.onWarmupCompleted.IAuthTabCallback();
        Map mapOnExtraCallback = access8100.onExtraCallback();
        Object[] objArr9 = new Object[1];
        a(null, null, new byte[]{ISO7816.INS_WRITE_BINARY, -49}, 127 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr9);
        String strIntern4 = ((String) objArr9[0]).intern();
        if (strIntern == null) {
            int i13 = writeTypedObject + 7;
            extraCallback = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr10 = new Object[1];
            cArr = null;
            a(null, null, new byte[]{ISO7816.INS_WRITE_BINARY, -49}, ((byte) KeyEvent.getModifierMetaStateMask()) + ISOFileInfo.DATA_BYTES1, objArr10);
            strIntern = ((String) objArr10[0]).intern();
        } else {
            cArr = null;
        }
        Object[] objArr11 = new Object[1];
        a(cArr, cArr, new byte[]{ISOFileInfo.PROP_INFO, ISOFileInfo.FCI_EXT, ISOFileInfo.LCS_BYTE, ISOFileInfo.DATA_BYTES2, ISOFileInfo.FILE_IDENTIFIER, -124, -43, -44, -44, -52, -113, -124, -45, -106, ISO7816.INS_WRITE_RECORD, -47}, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr11);
        mapOnExtraCallback.put(((String) objArr11[0]).intern(), strIntern);
        Integer numOnNavigationEvent = onnavigationeventIAuthTabCallback.onNavigationEvent();
        if (numOnNavigationEvent != null) {
            int i15 = writeTypedObject + 125;
            extraCallback = i15 % 128;
            if (i15 % 2 == 0) {
                String.valueOf(numOnNavigationEvent.intValue());
                throw null;
            }
            String strValueOf = String.valueOf(numOnNavigationEvent.intValue());
            if (strValueOf == null) {
                cArr2 = null;
                Object[] objArr12 = new Object[1];
                a(null, null, new byte[]{ISO7816.INS_WRITE_BINARY, -49}, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr12);
                strIntern2 = ((String) objArr12[0]).intern();
            } else {
                strIntern2 = strValueOf;
                cArr2 = null;
            }
        }
        Object[] objArr13 = new Object[1];
        a(cArr2, cArr2, new byte[]{-112, -41, ISOFileInfo.FILE_IDENTIFIER, -124, ISOFileInfo.DATA_BYTES2, ISO7816.INS_UPDATE_BINARY}, KeyEvent.getDeadChar(0, 0) + CertificateBody.profileType, objArr13);
        mapOnExtraCallback.put(((String) objArr13[0]).intern(), strIntern2);
        Integer numOnWarmupCompleted = onnavigationeventIAuthTabCallback.onWarmupCompleted();
        if (numOnWarmupCompleted == null || (strIntern3 = String.valueOf(numOnWarmupCompleted.intValue())) == null) {
            Object[] objArr14 = new Object[1];
            a(null, null, new byte[]{ISO7816.INS_WRITE_BINARY, -49}, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr14);
            strIntern3 = ((String) objArr14[0]).intern();
        }
        Object[] objArr15 = new Object[1];
        b((byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (short) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), Color.argb(0, 0, 0, 0) + 610485980, (-17140) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 1380671127 - View.resolveSizeAndState(0, 0, 0), objArr15);
        mapOnExtraCallback.put(((String) objArr15[0]).intern(), strIntern3);
        Object obj2 = this.asInterface;
        Object objOnExtraCallback26 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1530829774);
        if (objOnExtraCallback26 == null) {
            objOnExtraCallback26 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14889 - (ViewConfiguration.getLongPressTimeout() >> 16)), 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24283 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1786668382, false, "onTransact", new Class[0]);
        }
        Object objInvoke = ((Method) objOnExtraCallback26).invoke(obj2, null);
        Object objOnExtraCallback27 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(953707182);
        if (objOnExtraCallback27 == null) {
            objOnExtraCallback27 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 33 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 7094 - View.MeasureSpec.getSize(0), 160994366, false, "INVEST", (Class[]) null);
        }
        if (objInvoke == ((Field) objOnExtraCallback27).get(null)) {
            CharSequence charSequence = (CharSequence) AppsFlyerConsentCompanion.IAuthTabCallback.IAuthTabCallback().get();
            if (StringsKt.isBlank(charSequence)) {
                int i16 = writeTypedObject + 101;
                extraCallback = i16 % 128;
                int i17 = i16 % 2;
            } else {
                strIntern4 = charSequence;
            }
            Object[] objArr16 = new Object[1];
            a(null, null, new byte[]{-124, -120, ISO7816.INS_UPDATE_BINARY, ISOFileInfo.FCI_EXT, -56, -126, -124, ISO7816.INS_GET_DATA, ISOFileInfo.DATA_BYTES2, ISOFileInfo.DATA_BYTES2, ISOFileInfo.FCI_EXT, ISO7816.INS_LOAD_KEY_FILE}, 127 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr16);
            mapOnExtraCallback.put(((String) objArr16[0]).intern(), strIntern4);
        }
        Map mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
        Object obj3 = this.asInterface;
        Object[] objArr17 = {this.onTransact, schemeManagerInfoResponse2, setMenus.onExtraCallbackWithResult(this.IAuthTabCallback), mapOnExtraCallbackWithResult, onnavigationeventIAuthTabCallback.onExtraCallback()};
        Object objOnExtraCallback28 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1028619014);
        if (objOnExtraCallback28 == null) {
            objOnExtraCallback28 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14889 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), AndroidCharacter.getMirror('0') - 24, 24282 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), -202343830, false, "onExtraCallbackWithResult", new Class[]{Long.class, SchemeManagerInfoResponse.class, String.class, Map.class, String.class});
        }
        final getNotAfterTime getnotaftertime = (getNotAfterTime) ((Method) objOnExtraCallback28).invoke(obj3, objArr17);
        Context context6 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, BuildConfig.FLAVOR);
        TdsScrollView tdsScrollView = new TdsScrollView(context6, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(access14000.onNavigationEvent(-1), access14000.onNavigationEvent(-2));
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context7 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, BuildConfig.FLAVOR);
        LinearLayout linearLayout5 = new LinearLayout(context7);
        linearLayout5.setOrientation(1);
        Context context8 = linearLayout5.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, BuildConfig.FLAVOR);
        TdsRoundLayout tdsRoundLayout = new TdsRoundLayout(context8, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(tdsRoundLayout, varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(16)), varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(16)), varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(16)), varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(16)));
        tdsRoundLayout.setRadius(varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(24)));
        tdsRoundLayout.setPadding(varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(0)), varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(16)), varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(0)), varyMatches.IAuthTabCallback(tdsRoundLayout, access14000.onNavigationEvent(0)));
        Context context9 = tdsRoundLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, BuildConfig.FLAVOR);
        Resources resources = context9.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, BuildConfig.FLAVOR);
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
        Object[] objArr18 = {configuration};
        Object objOnExtraCallback29 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(127914530);
        if (objOnExtraCallback29 == null) {
            objOnExtraCallback29 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), 88 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23696 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 920595634, false, (String) null, new Class[]{Configuration.class});
        }
        tdsRoundLayout.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp((getAdService) ((Constructor) objOnExtraCallback29).newInstance(objArr18)).onExtraCallbackWithResult());
        BaseTextView baseTextView3 = (BaseTextView) ParagraphSmall.class.getDeclaredConstructor(Context.class).newInstance(tdsRoundLayout.getContext());
        Intrinsics.checkNotNull(baseTextView3);
        baseTextView3.onNavigationEvent(new setDnsokhttp() { // from class: viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final getDelegateokhttp resolve(Context context10, float f) {
                int i18 = 2 % 2;
                int i19 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i19 % 128;
                if (i19 % 2 == 0) {
                    ScreenCaptureAlertDialog.onWarmupCompleted(context10, f);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                getDelegateokhttp getdelegateokhttpOnWarmupCompleted = ScreenCaptureAlertDialog.onWarmupCompleted(context10, f);
                int i20 = onExtraCallbackWithResult;
                int i21 = i20 & 87;
                int i22 = -(-((i20 ^ 87) | i21));
                int i23 = (i21 & i22) + (i22 | i21);
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                return getdelegateokhttpOnWarmupCompleted;
            }
        });
        baseTextView3.setTextSize(1, 14.0f);
        baseTextView3.setText(getnotaftertime.toString());
        Intrinsics.checkNotNull(baseTextView3);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsRoundLayout, baseTextView3);
        linearLayout5.addView(tdsRoundLayout);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout5);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsScrollView);
        Context context10 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context10, BuildConfig.FLAVOR);
        final TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context10);
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, tdsScrollView, false, 0, 6, (Object) null);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Object[] objArr19 = new Object[1];
        b((byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 610485984, (-17139) - View.getDefaultSize(0, 0), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 1380722672, objArr19);
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder2.append((CharSequence) ((String) objArr19[0]).intern());
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, BuildConfig.FLAVOR);
        Context context11 = tdsBottomCtaV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context11, BuildConfig.FLAVOR);
        Configuration configuration2 = context11.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
        Object[] objArr20 = {configuration2};
        Object objOnExtraCallback30 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(308043292);
        if (objOnExtraCallback30 == null) {
            objOnExtraCallback30 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 84 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 23786 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 589078668, false, (String) null, new Class[]{Configuration.class});
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(new getUrlokhttp((getAdService) ((Constructor) objOnExtraCallback30).newInstance(objArr20)).asBinder());
        int length2 = spannableStringBuilderAppend.length();
        Object obj4 = this.asInterface;
        Object objOnExtraCallback31 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1530829774);
        if (objOnExtraCallback31 == null) {
            objOnExtraCallback31 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14937 - AndroidCharacter.getMirror('0')), 24 - View.MeasureSpec.makeMeasureSpec(0, 0), AndroidCharacter.getMirror('0') + 24235, -1786668382, false, "onTransact", new Class[0]);
        }
        Object objInvoke2 = ((Method) objOnExtraCallback31).invoke(obj4, null);
        Object objOnExtraCallback32 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1588706133);
        if (objOnExtraCallback32 == null) {
            objOnExtraCallback32 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 34 - (KeyEvent.getMaxKeyCode() >> 16), 7095 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1878083013, false, "getKoreanName", new Class[0]);
        }
        String str3 = (String) ((Method) objOnExtraCallback32).invoke(objInvoke2, null);
        Enum r11 = this.onNavigationEvent;
        Object objOnExtraCallback33 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1498269531);
        if (objOnExtraCallback33 == null) {
            objOnExtraCallback33 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 21401), 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23274, -1745697227, false, "getTypeName", new Class[0]);
        }
        String str4 = (String) ((Method) objOnExtraCallback33).invoke(r11, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        LinearLayout linearLayout6 = linearLayout;
        Object[] objArr21 = new Object[1];
        a(null, null, new byte[]{-106}, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr21);
        sb2.append(((String) objArr21[0]).intern());
        sb2.append(str4);
        spannableStringBuilderAppend.append((CharSequence) sb2.toString());
        spannableStringBuilderAppend.setSpan(foregroundColorSpan, length2, spannableStringBuilderAppend.length(), 17);
        Object[] objArr22 = new Object[1];
        a(null, null, new byte[]{ISOFileInfo.A5, -92, -66, -75, -71, -72, -106}, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr22);
        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((CharSequence) ((String) objArr22[0]).intern());
        Object[] objArr23 = new Object[1];
        a(null, null, new byte[]{-73}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + CertificateBody.profileType, objArr23);
        SpannableStringBuilder spannableStringBuilderAppend3 = spannableStringBuilderAppend2.append((CharSequence) ((String) objArr23[0]).intern());
        String strOnExtraCallback = getnotaftertime.onExtraCallback();
        if (strOnExtraCallback != null) {
            int i18 = writeTypedObject + 1;
            extraCallback = i18 % 128;
            if (i18 % 2 == 0) {
                spannableStringBuilderAppend3.append((CharSequence) strOnExtraCallback);
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            spannableStringBuilderAppend3.append((CharSequence) strOnExtraCallback);
        }
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend3, BuildConfig.FLAVOR);
        tdsBottomCtaV1View.setTopDescription(spannableStringBuilderAppend3);
        Object[] objArr24 = new Object[1];
        a(null, null, new byte[]{-37, -83, ISO7816.INS_PUT_DATA, -39}, 127 - ExpandableListView.getPackedPositionType(0L), objArr24);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, ((String) objArr24[0]).intern(), new Function1() { // from class: viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj6) {
                int i19 = 2 % 2;
                int i20 = onWarmupCompleted;
                int i21 = ((((i20 ^ 75) | (i20 & 75)) << 1) - (~(-((i20 & (-76)) | ((~i20) & 75))))) - 1;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                TdsBottomCtaV1View tdsBottomCtaV1View2 = tdsBottomCtaV1View;
                getNotAfterTime getnotaftertime2 = getnotaftertime;
                ScreenCaptureAlertDialog screenCaptureAlertDialog = this;
                int i23 = ((i20 | 77) << 1) - (i20 ^ 77);
                onExtraCallbackWithResult = i23 % 128;
                int i24 = i23 % 2;
                Unit unitIAuthTabCallback = ScreenCaptureAlertDialog.IAuthTabCallback(tdsBottomCtaV1View2, getnotaftertime2, screenCaptureAlertDialog, (View) obj6);
                int i25 = onExtraCallbackWithResult;
                int i26 = i25 & 111;
                int i27 = (i25 ^ 111) | i26;
                int i28 = (i26 & i27) + (i27 | i26);
                onWarmupCompleted = i28 % 128;
                int i29 = i28 % 2;
                return unitIAuthTabCallback;
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        Object[] objArr25 = new Object[1];
        b((byte) KeyEvent.normalizeMetaState(0), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 610485994, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 17140, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1380716827, objArr25);
        TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, ((String) objArr25[0]).intern(), new Function1() { // from class: viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj6) {
                int i19 = 2 % 2;
                int i20 = onExtraCallbackWithResult;
                int i21 = (i20 & 45) + (i20 | 45);
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                Unit unitOnWarmupCompleted = ScreenCaptureAlertDialog.onWarmupCompleted(this.f$0, (View) obj6);
                int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                int i23 = (~(((~iOnExtraCallbackWithResult) & 1470594037) | (iOnExtraCallbackWithResult & (-1470594038)) | (1470594037 & iOnExtraCallbackWithResult))) * 623;
                int i24 = 1759290228 & i23;
                int i25 = (i24 - (~((i23 ^ 1759290228) | i24))) - 1;
                int i26 = ~iOnExtraCallbackWithResult;
                int i27 = i26 & 2121872;
                int i28 = (i26 | 2121872) & (~i27);
                int i29 = ((i28 & i27) | (i28 ^ i27)) * (-623);
                int i30 = i25 & i29;
                int i31 = i30 + ((i29 ^ i25) | i30);
                int i32 = (1193701781 & iOnExtraCallbackWithResult) | (1193701781 ^ iOnExtraCallbackWithResult);
                int i33 = (i32 | (~i32)) & (~i32);
                int i34 = (-1470594038) & i33;
                int i35 = (i33 | (-1470594038)) & (~i34);
                int i36 = (i35 & i34) | (i35 ^ i34);
                int i37 = ~((iOnExtraCallbackWithResult & 279014128) | (279014128 ^ iOnExtraCallbackWithResult));
                int i38 = -(-(((i37 & i36) | ((~i37) & i36) | ((~i36) & i37)) * 623));
                int i39 = (i31 | i38) << 1;
                int i40 = -(i38 ^ i31);
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
                int i42 = (-531356427) ^ iOnExtraCallbackWithResult2;
                int i43 = (-531356427) & iOnExtraCallbackWithResult2;
                int i44 = (i42 & i43) | (i42 ^ i43);
                int i45 = (i44 | (~i44)) & (~i44);
                int i46 = (-2146164716) & i45;
                int i47 = -(-((((i45 | (-2146164716)) & (~i46)) | i46) * (-196)));
                int i48 = (-1404264774) & i47;
                int i49 = (i48 - (~(-(-((i47 ^ (-1404264774)) | i48))))) - (-198713127);
                int i50 = (iOnExtraCallbackWithResult2 | (-531356427)) & (~i43);
                int i51 = ~((i50 & i43) | (i50 ^ i43));
                int i52 = 1614808289 ^ i51;
                int i53 = i51 & 1614808289;
                int i54 = ((i53 & i52) | (i52 ^ i53)) * 196;
                int i55 = i49 & i54;
                int i56 = (i54 ^ i49) | i55;
                if (i41 <= ((i55 | i56) << 1) - (i56 ^ i55)) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        Object obj6 = this.asInterface;
        if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 43258), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 80, 23537 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR))).isInstance(obj6)) {
            Object objOnExtraCallback34 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-994839493);
            if (objOnExtraCallback34 == null) {
                objOnExtraCallback34 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 43258), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 80, 23537 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -168621397, false, "onExtraCallbackWithResult", new Class[0]);
            }
            tdsBottomCtaV1View.setBottomButton((CharSequence) ((Method) objOnExtraCallback34).invoke(obj6, null), new Function1() { // from class: viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj7) {
                    int i19 = 2 % 2;
                    int i20 = onWarmupCompleted;
                    int i21 = i20 & 119;
                    int i22 = -(-((i20 ^ 119) | i21));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                    Unit unitOnExtraCallback = ScreenCaptureAlertDialog.onExtraCallback(this.f$0, (View) obj7);
                    int i25 = onWarmupCompleted;
                    int i26 = ((i25 ^ 66) + ((i25 & 66) << 1)) - 1;
                    onNavigationEvent = i26 % 128;
                    if (i26 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            });
            tdsBottomCtaV1View.setBottomButtonType(TdsTextButtonV0View.IAuthTabCallback.UNDERLINE);
            tdsBottomCtaV1View.setBottomButtonArrow(false);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsBottomCtaV1View);
        if (((Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (8736 - ExpandableListView.getPackedPositionGroup(0L)), 77 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), View.combineMeasuredStates(0, 0) + 23459)).isInstance(this.asInterface)) {
            TdsTextButtonV0View.IAuthTabCallback iAuthTabCallback = TdsTextButtonV0View.IAuthTabCallback.GREY;
            Context context12 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context12, BuildConfig.FLAVOR);
            TdsTextButtonV0View tdsTextButtonV0View = new TdsTextButtonV0View(context12, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            tdsTextButtonV0View.setType(iAuthTabCallback);
            Object obj7 = this.asInterface;
            Object objOnExtraCallback35 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1527268712);
            if (objOnExtraCallback35 == null) {
                objOnExtraCallback35 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8736), 79 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 23459 - ExpandableListView.getPackedPositionType(0L), -1783151608, false, "onNavigationEvent", new Class[0]);
            }
            tdsTextButtonV0View.setText((CharSequence) ((Method) objOnExtraCallback35).invoke(obj7, null));
            tdsTextButtonV0View.setGravity(1);
            tdsTextButtonV0View.setType(TdsTextButtonV0View.IAuthTabCallback.PRIMARY);
            ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(access14000.onNavigationEvent(-1), access14000.onNavigationEvent(-2));
            Intrinsics.checkNotNull(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = varyMatches.IAuthTabCallback(tdsTextButtonV0View, access14000.onNavigationEvent(8));
            layoutParams4.bottomMargin = varyMatches.IAuthTabCallback(tdsTextButtonV0View, access14000.onNavigationEvent(16));
            layoutParams4.width = -2;
            layoutParams4.height = -2;
            layoutParams4.gravity = 1;
            tdsTextButtonV0View.setLayoutParams(layoutParams3);
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1916499490, new Object[]{tdsTextButtonV0View, new Function1() { // from class: viva.republica.toss.dev.screencapture.ScreenCaptureAlertDialog$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj8) throws Throwable {
                    int i19 = 2 % 2;
                    int i20 = IAuthTabCallback;
                    int i21 = (i20 & (-66)) | ((~i20) & 65);
                    int i22 = -(-((i20 & 65) << 1));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    onExtraCallbackWithResult = i23 % 128;
                    if (i23 % 2 == 0) {
                        ScreenCaptureAlertDialog.onNavigationEvent(this.f$0, (View) obj8);
                        Object obj9 = null;
                        obj9.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = ScreenCaptureAlertDialog.onNavigationEvent(this.f$0, (View) obj8);
                    int i24 = onExtraCallbackWithResult + 55;
                    IAuthTabCallback = i24 % 128;
                    if (i24 % 2 != 0) {
                        int i25 = 90 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            }}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1916499491);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsTextButtonV0View);
        }
        return linearLayout6;
    }

    private static final Unit onExtraCallback(TdsBottomCtaV1View tdsBottomCtaV1View, getNotAfterTime getnotaftertime, ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) {
        return (Unit) onExtraCallbackWithResult(new Object[]{tdsBottomCtaV1View, getnotaftertime, screenCaptureAlertDialog, view}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1657709642, -1657709641, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(ScreenCaptureAlertDialog screenCaptureAlertDialog, View view) {
        return (Unit) onExtraCallbackWithResult(new Object[]{screenCaptureAlertDialog, view}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -51629261, 51629263, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult());
    }

    static void onWarmupCompleted() {
        asBinder = new char[]{32432, 32384, 32433, 32390, 32445, 32443, 32444, 32439, 32615, 32442, 32386, 32447, 32388, 32614, 32385, 32391, 48327, 44735, 50675, 48692, 53807, 32579, 43451, 53259, 47719, 51147, 46987, 46934, 49719, 50607, 53814, 47171, 43447, 46639, 48747, 47319, 32637, 50283, 46927, 49283, 50615, 53983, 44127, 47718, 43403, 53763, 54003, 52439, 52147, 44723, 52199, 47331, 47031, 52015, 32601, 43159, 50359, 47203, 44483, 46562, 47123, 47379, 50463, 47423, 48719, 49831, 46930, 48606, 47067, 47607, 32403, 32401, 32613, 32400, 32396, 32610, 32408, 32394, 47589, 47007, 46542, 53727, 32404, 32435, 32405, 32438, 32410, 32407, 49718, 48895, 53619};
        IAuthTabCallbackDefault = -1184334045;
        access100 = true;
        IAuthTabCallbackStubProxy = true;
        access000 = 2145083777;
        getInterfaceDescriptor = -1538811142;
        IAuthTabCallback_Parcel = 166951384;
        readTypedObject = new short[]{25884, -7790, -10008, 10276, -13100, -9281, 25909, 10239, -10227, 10237, 10231, -10226, 10229, -10229, -10236, -10165, 10160, 10236, -10237, 10234, -10145, 10225, 10186, 10226, 10228, 10225, -10240, -10227, -10166, -10225, 10163, 10235, -10229, -10239, -10231, -10229, -10166, 10225, 10186, 10224, 10224, -10230, -10234, 10235, -10173, -10225, 10169, 10227, -10148, 10172, -10232, -10237, 10230, 25875, -7773, -12812, -9260, 13271, 6325, -29656, 15340, -11028, 25360, -7592, -9436, 10508, 25883, -4541, -9623, 11808, -10592, 25892, -7790, -10008, 9764, -9764, -13932, 27632, -3644, -13013, 13021, 3636, -8028, -15496, 12576, 6836, -4532, -14892, 29672, -7592, -13708, 1400, 3532, -2328, -10604, 11208, 5836, -8068, 10656, 3564, 1080, 25882, -10221, 10208, 10226, 25872, -7960, -11068, 15400, 3644, -27260, 11688, 25820, -30192, 15424, 25880, 9037};
    }
}
