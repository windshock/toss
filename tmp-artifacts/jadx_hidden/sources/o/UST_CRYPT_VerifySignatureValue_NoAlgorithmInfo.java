package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.crosscert.android.core.Cert;
import com.crosscert.android.selfauth.ToolkitManager;
import com.crosscert.android.selfauth.model.ResultDTO;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.AppNode61;
import o.DERDump;
import o.bindContext;
import o.makePFX_WINS;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.crosscert.PrivateCrossCert$;

/* loaded from: classes.dex */
public final class UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static long IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static char asInterface;
    private static int getInterfaceDescriptor;
    public static final String onNavigationEvent;
    public static final int onWarmupCompleted;
    private final access27100<DERDump> IAuthTabCallback;
    private final access27100<DERDump> asBinder;
    private String onExtraCallback;
    private final ToolkitManager onExtraCallbackWithResult;
    private final access27100<DERDump> onTransact;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a((char) (61532 - View.MeasureSpec.getMode(0)), KeyEvent.getMaxKeyCode() >> 16, new char[]{405, 38445, 55829, 10972, 51328, 16710, 36109, 3095, 10119, 62552, 48015, 39699, 56107, 40191, 27822, 59837}, new char[]{39051, 30395, 57087, 9460}, new char[]{35501, 44523, 23802, 24560}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent((DefaultConstructorMarker) null);
        onWarmupCompleted = 8;
        int i = access000 + 95;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo = (UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo) objArr[0];
        Message message = (Message) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(onExtraCallback(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, message));
        }
        onExtraCallback(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, message);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8 | i4);
        int i10 = ~((~i4) | i8 | i3);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i3);
        int i13 = (~(i4 | i7)) | (~(i7 | i6)) | i10;
        int i14 = i3 + i6 + i2 + (1787548100 * i) + (1101416392 * i5);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i3) - 623378432) + (561581232 * i6) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i2) + ((-778043392) * i) + ((-46137344) * i5) + (324403200 * i15);
        int i17 = (i3 * (-930662234)) + 656878810 + (i6 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i2 * (-930661477)) + (i * 2052861356) + (i5 * 749768216) + (i15 * (-2028863488));
        int i18 = i16 + (i17 * i17 * (-1850081280));
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ boolean onNavigationEvent(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, Message message) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, message);
            throw null;
        }
        boolean zIAuthTabCallback = IAuthTabCallback(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, message);
        int i3 = access100 + 93;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }

    public static /* synthetic */ boolean onWarmupCompleted(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, Message message) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, message);
        int i4 = getInterfaceDescriptor + 93;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackDefault;
    }

    public UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ToolkitManager toolkitManager = new ToolkitManager(context);
        this.onExtraCallbackWithResult = toolkitManager;
        DERDump.onExtraCallback onextracallback = DERDump.Companion;
        access27100<DERDump> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(onextracallback.onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.IAuthTabCallback = access27100VarIAuthTabCallback;
        this.onExtraCallback = "";
        access27100<DERDump> access27100VarIAuthTabCallback2 = access27100.IAuthTabCallback(onextracallback.onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback2, "");
        this.onTransact = access27100VarIAuthTabCallback2;
        access27100<DERDump> access27100VarIAuthTabCallback3 = access27100.IAuthTabCallback(onextracallback.onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback3, "");
        this.asBinder = access27100VarIAuthTabCallback3;
        Companion.onExtraCallbackWithResult(toolkitManager);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo = (UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        access27100<DERDump> access27100Var = uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.IAuthTabCallback;
        if (i3 != 0) {
            return access27100Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            str = this.onExtraCallback;
            int i4 = 57 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i3 + 41;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final access27100<DERDump> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        access27100<DERDump> access27100Var = this.onTransact;
        int i5 = i3 + 87;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return access27100Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final access27100<DERDump> onExtraCallbackWithResult() {
        access27100<DERDump> access27100Var;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 25;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            access27100Var = this.asBinder;
            int i4 = 0 / 0;
        } else {
            access27100Var = this.asBinder;
        }
        int i5 = i2 + 9;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return access27100Var;
        }
        throw null;
    }

    private static final boolean IAuthTabCallback(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, Message message) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(message, "");
        Bundle data = message.getData();
        Object[] objArr = new Object[1];
        a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{61145, 17095, 61852, 60665, 2004, 17131, 26248, 62553}, new char[]{39051, 30395, 57087, 9460}, new char[]{30331, 38604, 40141, 1395}, objArr);
        Serializable serializable = data.getSerializable(((String) objArr[0]).intern());
        ResultDTO resultDTO = serializable instanceof ResultDTO ? (ResultDTO) serializable : null;
        if (resultDTO != null) {
            if (resultDTO.getResultCode() != 1200) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                int resultCode = resultDTO.getResultCode();
                String resultMsg = resultDTO.getResultMsg();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a((char) Color.alpha(0), Process.myTid() >> 22, new char[]{21665, 48249, 40442, 47518, 11128, 30049, 32869, 56120, 15353, 935, 49165, 61205}, new char[]{39051, 30395, 57087, 9460}, new char[]{37829, 17508, 34778, 48156}, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(resultCode);
                Object[] objArr3 = new Object[1];
                b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, new char[]{31, 65506}, 96 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(resultMsg);
                Object[] objArr4 = new Object[1];
                b(3 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 9, new char[]{5, 7, 65526, 5, 2, 6, 6, 65526, 65528}, 143 - TextUtils.indexOf("", "", 0, 0), false, objArr4);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            }
            uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.IAuthTabCallback.onWarmupCompleted(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.IAuthTabCallback(resultDTO));
            String authcode = resultDTO.getAuthcode();
            if (authcode == null) {
                int i4 = access100 + 63;
                int i5 = i4 % 128;
                getInterfaceDescriptor = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 97;
                access100 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                str = authcode;
            }
            uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.onExtraCallback = str;
        } else {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr5 = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 3, View.getDefaultSize(0, 0) + 9, new char[]{5, 7, 65526, 5, 2, 6, 6, 65526, 65528}, KeyEvent.normalizeMetaState(0) + 143, false, objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a((char) (KeyEvent.getMaxKeyCode() >> 16), (-402737074) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{48754, 21332, 24819, 36956, 26383, 33830, 44114, 7748, 60542, 21946, 40137, 39902, 655, 63962, 22502, 11151, 46490, 42472, 5628, 47165, 5213, 19128, 53363, 34987, 32659, 44402, 55384, 31320, 34317, 30575, 53304, 43990, 34592}, new char[]{39051, 30395, 57087, 9460}, new char[]{20442, 65208, 49895, 6378}, objArr6);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, strIntern, ((String) objArr6[0]).intern(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            access27100<DERDump> access27100Var = uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.IAuthTabCallback;
            Object[] objArr7 = new Object[1];
            a((char) (Process.myTid() >> 22), View.resolveSize(0, 0), new char[]{4117, 43324, 65211, 45336, 10508, 22152, 63803, 6472, 7842, 1980}, new char[]{39051, 30395, 57087, 9460}, new char[]{47084, 50623, 4063, 35645}, objArr7);
            access27100Var.onWarmupCompleted(new NullPointerException(((String) objArr7[0]).intern()));
        }
        return false;
    }

    private static final boolean onExtraCallback(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, Message message) {
        ResultDTO resultDTO;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        Bundle data = message.getData();
        Object[] objArr = new Object[1];
        a((char) TextUtils.getOffsetBefore("", 0), (-1) - Process.getGidForName(""), new char[]{61145, 17095, 61852, 60665, 2004, 17131, 26248, 62553}, new char[]{39051, 30395, 57087, 9460}, new char[]{30331, 38604, 40141, 1395}, objArr);
        Serializable serializable = data.getSerializable(((String) objArr[0]).intern());
        if (serializable instanceof ResultDTO) {
            int i2 = getInterfaceDescriptor + 1;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            resultDTO = (ResultDTO) serializable;
        } else {
            resultDTO = null;
        }
        if (resultDTO != null) {
            int i4 = access100 + 1;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0 ? resultDTO.getResultCode() != 1200 : resultDTO.getResultCode() != 18354) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                int resultCode = resultDTO.getResultCode();
                String resultMsg = resultDTO.getResultMsg();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                b(5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.makeMeasureSpec(0, 0) + 10, new char[]{29, 65481, 65494, 65481, 4, 14, '!', 25, 24, 27}, TextUtils.indexOf("", "") + 121, false, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(resultCode);
                Object[] objArr3 = new Object[1];
                b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2 - ExpandableListView.getPackedPositionGroup(0L), new char[]{31, 65506}, 96 - ExpandableListView.getPackedPositionGroup(0L), true, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(resultMsg);
                Object[] objArr4 = new Object[1];
                b(1 - TextUtils.lastIndexOf("", '0'), 9 - TextUtils.getCapsMode("", 0, 0), new char[]{5, 7, 65526, 5, 2, 6, 6, 65526, 65528}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 142, false, objArr4);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            a((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16417), (ViewConfiguration.getLongPressTimeout() >> 16) - 1599715444, new char[]{13206, 50221, 32129, 45818, 14816, 28241, 5805, 51301, 51098, 54016, 65333, 19040, 28402}, new char[]{39051, 30395, 57087, 9460}, new char[]{35855, 42567, 8608, 1856}, objArr5);
            sb2.append(((String) objArr5[0]).intern());
            sb2.append(resultDTO);
            Object[] objArr6 = new Object[1];
            a((char) (14839 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf("", "", 0), new char[]{47754, 49907, 18300, 9892, 35429, 19954, 50922, 52920, 45734, 17318, 42031, 58945, 9377, 19746, 30451, 10806}, new char[]{39051, 30395, 57087, 9460}, new char[]{17945, 51450, 63385, 27961}, objArr6);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, ((String) objArr6[0]).intern(), sb2.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.onTransact.onWarmupCompleted(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.IAuthTabCallback(resultDTO));
        } else {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr7 = new Object[1];
            b(1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 9, new char[]{5, 7, 65526, 5, 2, 6, 6, 65526, 65528}, 143 - KeyEvent.keyCodeFromString(""), false, objArr7);
            String strIntern = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            b(Drawable.resolveOpacity(0, 0) + 5, TextUtils.indexOf((CharSequence) "", '0') + 32, new char[]{25, 22, 23, 31, '\f', 19, 19, 28, 21, 65479, 26, 16, 65479, 22, 27, 65515, 27, 19, 28, 26, '\f', 25, 65479, 4, 65496, 65492, 2, 65479, 65492, 65479, 27}, TextUtils.getOffsetAfter("", 0) + 123, true, objArr8);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, strIntern, ((String) objArr8[0]).intern(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            access27100<DERDump> access27100Var = uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.onTransact;
            Object[] objArr9 = new Object[1];
            a((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0, 0), new char[]{4117, 43324, 65211, 45336, 10508, 22152, 63803, 6472, 7842, 1980}, new char[]{39051, 30395, 57087, 9460}, new char[]{47084, 50623, 4063, 35645}, objArr9);
            access27100Var.onWarmupCompleted(new NullPointerException(((String) objArr9[0]).intern()));
        }
        return false;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Object obj = null;
        Iterator it = onExtraCallbackWithResult(this, false, 1, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Cert cert = (Cert) next;
            if (new File(cert.getFilePath(), cert.getSignCertFilename()).compareTo(new File(str)) == 0) {
                obj = next;
                break;
            }
        }
        Cert cert2 = (Cert) obj;
        if (cert2 != null) {
            this.onExtraCallback = "";
            try {
                Handler handler = new Handler((Handler.Callback) new PrivateCrossCert$.ExternalSyntheticLambda1(this));
                Handler handler2 = new Handler((Handler.Callback) new PrivateCrossCert$.ExternalSyntheticLambda2(this));
                ToolkitManager toolkitManager = this.onExtraCallbackWithResult;
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                toolkitManager.exportAppCert(bytes, cert2, handler, handler2);
                int i4 = access100 + 105;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr = new Object[1];
                a((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61532), ViewConfiguration.getEdgeSlop() >> 16, new char[]{405, 38445, 55829, 10972, 51328, 16710, 36109, 3095, 10119, 62552, 48015, 39699, 56107, 40191, 27822, 59837}, new char[]{39051, 30395, 57087, 9460}, new char[]{35501, 44523, 23802, 24560}, objArr);
                convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), e);
                access27100<DERDump> access27100Var = this.onTransact;
                Object[] objArr2 = new Object[1];
                a((char) Color.green(0), (-1244662991) - (KeyEvent.getMaxKeyCode() >> 16), new char[]{4988, 57672, 12398, 17374, 37656, 60615, 15837, 24089, 10535, 41678, 37951}, new char[]{39051, 30395, 57087, 9460}, new char[]{12600, 53235, 60341, 60635}, objArr2);
                access27100Var.onWarmupCompleted(new RuntimeException(((String) objArr2[0]).intern()));
            }
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100 + 83;
        int i4 = i3 % 128;
        getInterfaceDescriptor = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 83;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                getBagAttributes.onExtraCallback.onNavigationEvent();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z = getBagAttributes.onExtraCallback.onNavigationEvent();
        }
        uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.onExtraCallbackWithResult(str, z);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $10 + 17;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int iN = HttpDataSourceInvalidContentTypeException.n(trackSelectionParametersBuilderExternalSyntheticLambda0);
            int iM = HttpDataSourceInvalidResponseCodeException.m(trackSelectionParametersBuilderExternalSyntheticLambda0);
            makePFX_WINS.onNavigationEvent.C0003onNavigationEvent.k(trackSelectionParametersBuilderExternalSyntheticLambda0, cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718, cArr5[iN]);
            cArr5[iM] = AppNode61.onNavigationEvent.l(cArr4[iM] * 32718, cArr5[iN]);
            cArr4[iM] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iM] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
        }
        String str = new String(cArr6);
        int i5 = $10 + 27;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i5 = $11 + 59;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr2[i7] = bindContext.access000.g(cArr2[i7], IAuthTabCallback_Parcel);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i8 = $10 + 7;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i10 = $10 + 31;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final boolean IAuthTabCallbackDefault(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, Message message) {
        ResultDTO resultDTO;
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        Bundle data = message.getData();
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{61145, 17095, 61852, 60665, 2004, 17131, 26248, 62553}, new char[]{39051, 30395, 57087, 9460}, new char[]{30331, 38604, 40141, 1395}, objArr);
        Serializable serializable = data.getSerializable(((String) objArr[0]).intern());
        if (serializable instanceof ResultDTO) {
            int i4 = access100 + 99;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                resultDTO = (ResultDTO) serializable;
                int i5 = 17 / 0;
            } else {
                resultDTO = (ResultDTO) serializable;
            }
        } else {
            resultDTO = null;
        }
        if (resultDTO != null) {
            if (resultDTO.getResultCode() != 1200) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                int resultCode = resultDTO.getResultCode();
                String resultMsg = resultDTO.getResultMsg();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a((char) View.combineMeasuredStates(0, 0), KeyEvent.getMaxKeyCode() >> 16, new char[]{62671, 63576, 30471, 24962, 3108, 22119, 28233, 46673, 4444, 5567}, new char[]{39051, 30395, 57087, 9460}, new char[]{62157, 51372, 37780, 23666}, objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(resultCode);
                Object[] objArr3 = new Object[1];
                b(1 - KeyEvent.getDeadChar(0, 0), KeyEvent.keyCodeFromString("") + 2, new char[]{31, 65506}, 95 - ((byte) KeyEvent.getModifierMetaStateMask()), true, objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(resultMsg);
                Object[] objArr4 = new Object[1];
                b(Color.rgb(0, 0, 0) + 16777218, 9 - View.getDefaultSize(0, 0), new char[]{5, 7, 65526, 5, 2, 6, 6, 65526, 65528}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 143, false, objArr4);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr4[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            b(2 - View.resolveSize(0, 0), 20 - TextUtils.getOffsetAfter("", 0), new char[]{'\f', '\b', 65471, 65497, 4, 19, 0, 2, '\b', 5, '\b', 19, 17, 4, 2, 65471, 19, 17, 14, 15}, KeyEvent.keyCodeFromString("") + 131, true, objArr5);
            sb2.append(((String) objArr5[0]).intern());
            sb2.append(resultDTO);
            Object[] objArr6 = new Object[1];
            b((ViewConfiguration.getJumpTapTimeout() >> 16) + 13, 16 - Color.argb(0, 0, 0, 0), new char[]{3, 0, 65532, 65522, 7, 5, 65528, 65526, 6, 6, 2, 5, 65526, 7, 5, 2}, (ViewConfiguration.getPressedStateDuration() >> 16) + 143, true, objArr6);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, ((String) objArr6[0]).intern(), sb2.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.asBinder.onWarmupCompleted(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.IAuthTabCallback(resultDTO));
        } else {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr7 = new Object[1];
            b(TextUtils.indexOf("", "", 0) + 2, (ViewConfiguration.getTouchSlop() >> 8) + 9, new char[]{5, 7, 65526, 5, 2, 6, 6, 65526, 65528}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 143, false, objArr7);
            String strIntern = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a((char) (22366 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1668788366, new char[]{61806, 56450, 18151, 19454, 28098, 56035, 51423, 7021, 14406, 29472, 48513, 4749, 14944, 14830, 42228, 1237, 3825, 44114, 539, 991, 34428, 52208, 33690, 17686, 9497, 9864, 20971, 18798, 792, 60469, 49773}, new char[]{39051, 30395, 57087, 9460}, new char[]{36519, 30640, 23907, 53847}, objArr8);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray3, strIntern, ((String) objArr8[0]).intern(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            access27100<DERDump> access27100Var = uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.asBinder;
            Object[] objArr9 = new Object[1];
            a((char) Color.red(0), TextUtils.indexOf("", "", 0), new char[]{4117, 43324, 65211, 45336, 10508, 22152, 63803, 6472, 7842, 1980}, new char[]{39051, 30395, 57087, 9460}, new char[]{47084, 50623, 4063, 35645}, objArr9);
            access27100Var.onWarmupCompleted(new NullPointerException(((String) objArr9[0]).intern()));
        }
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo = (UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.onExtraCallbackWithResult.importAppCert(str, (String) SafeBag.onWarmupCompleted(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{SafeBag.onExtraCallbackWithResult, Boolean.valueOf(zBooleanValue)}, -707833084, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 707833089), new Handler((Handler.Callback) new PrivateCrossCert$.ExternalSyntheticLambda0(uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo)));
            int i2 = getInterfaceDescriptor + 13;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a((char) (61532 - (ViewConfiguration.getWindowTouchSlop() >> 8)), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{405, 38445, 55829, 10972, 51328, 16710, 36109, 3095, 10119, 62552, 48015, 39699, 56107, 40191, 27822, 59837}, new char[]{39051, 30395, 57087, 9460}, new char[]{35501, 44523, 23802, 24560}, objArr2);
            convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr2[0]).intern(), e);
            access27100<DERDump> access27100Var = uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.asBinder;
            Object[] objArr3 = new Object[1];
            a((char) (Process.myPid() >> 22), (-1244662992) - TextUtils.lastIndexOf("", '0', 0), new char[]{4988, 57672, 12398, 17374, 37656, 60615, 15837, 24089, 10535, 41678, 37951}, new char[]{39051, 30395, 57087, 9460}, new char[]{12600, 53235, 60341, 60635}, objArr3);
            access27100Var.onWarmupCompleted(new RuntimeException(((String) objArr3[0]).intern()));
            return null;
        }
    }

    public final boolean onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        List listOnExtraCallbackWithResult;
        boolean zIsAppCertPassCorrect;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            listOnExtraCallbackWithResult = onExtraCallbackWithResult(this, true, 0, null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            listOnExtraCallbackWithResult = onExtraCallbackWithResult(this, false, 1, null);
        }
        Iterator it = listOnExtraCallbackWithResult.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Cert cert = (Cert) next;
            if (new File(cert.getFilePath(), cert.getSignCertFilename()).compareTo(new File(str)) == 0) {
                obj = next;
                break;
            }
        }
        Cert cert2 = (Cert) obj;
        if (cert2 == null) {
            return false;
        }
        int i3 = access100 + 59;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            ToolkitManager toolkitManager = this.onExtraCallbackWithResult;
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            zIsAppCertPassCorrect = toolkitManager.isAppCertPassCorrect(bytes, cert2);
            int i4 = 4 / 0;
        } else {
            ToolkitManager toolkitManager2 = this.onExtraCallbackWithResult;
            byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            zIsAppCertPassCorrect = toolkitManager2.isAppCertPassCorrect(bytes2, cert2);
        }
        int i5 = getInterfaceDescriptor + 59;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return zIsAppCertPassCorrect;
    }

    public static /* synthetic */ List onExtraCallbackWithResult(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100 + 23;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            z = getBagAttributes.onExtraCallback.onNavigationEvent();
            int i5 = getInterfaceDescriptor + 79;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        return uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.onExtraCallback(z);
    }

    public final List<Cert> onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {SafeBag.onExtraCallbackWithResult, Boolean.valueOf(z)};
        List<Cert> appCertList = this.onExtraCallbackWithResult.getAppCertList((String) SafeBag.onWarmupCompleted(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), objArr, -707833084, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 707833089));
        Intrinsics.checkNotNullExpressionValue(appCertList, "");
        int i4 = access100 + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return appCertList;
    }

    private final DERDump IAuthTabCallback(ResultDTO resultDTO) {
        int i = 2 % 2;
        int resultCode = resultDTO.getResultCode();
        String resultMsg = resultDTO.getResultMsg();
        Intrinsics.checkNotNullExpressionValue(resultMsg, "");
        DERDump dERDump = new DERDump(resultCode, resultMsg);
        int i2 = getInterfaceDescriptor + 107;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return dERDump;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, Message message) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) onExtraCallback(new Object[]{uST_CRYPT_VerifySignatureValue_NoAlgorithmInfo, message}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -614179080, iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 614179082)).booleanValue();
    }

    public final access27100<DERDump> IAuthTabCallback() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (access27100) onExtraCallback(new Object[]{this}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1858147810, iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1858147810);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, boolean z) {
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1376087862, iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1376087861);
    }

    static void onExtraCallback() {
        IAuthTabCallbackStub = 5246362380431717232L;
        IAuthTabCallbackDefault = -1776194565;
        asInterface = (char) 27643;
        IAuthTabCallback_Parcel = 478308875;
    }
}
