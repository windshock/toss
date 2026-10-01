package im.toss.devtool.runtime.data.util;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.iap.ac.android.acs.operation.R$string;
import com.mbridge.msdk.config.component.status.StatusCpt$$ExternalSyntheticLambda0;
import im.toss.devtool.runtime.data.util.SchemeExecutorActivity$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textField.TextField;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.TimelineExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.enableModuleArgumentNSNullConversionIOS;
import o.getTypedExportedConstants;
import o.logAndOpenStore;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.widget.dialog.ListItemBottomSheetDialog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SchemeExecutorActivity extends Hilt_SchemeExecutorActivity {
    public static final Object Companion;
    private static final String IAuthTabCallbackDefault;
    private static final String IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static long access000;
    private static int access100;
    private static final String asBinder;
    private static final String asInterface;
    private static int onMessageChannelReady;
    public static final int onTransact;
    private static byte[] readTypedObject;
    private static short[] writeTypedObject;
    private Dialog getInterfaceDescriptor;

    @Inject
    public Object schemeRepository;
    private static final byte[] $$a = {106, -23, 12, Byte.MIN_VALUE};
    private static final int $$b = 238;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallbackWithResult = 0;
    private static int extraCallback = 0;
    private static int ICustomTabsCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, byte b) {
        int i2;
        int i3 = (b * 2) + 115;
        byte[] bArr = $$a;
        int i4 = 4 - (s * 2);
        int i5 = i * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            int i9 = i4 + i7;
            int i10 = i6 + 1;
            i2 = i8;
            i3 = i9;
            i4 = i10;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i11 = i3;
            i6 = i4;
            i4 = bArr[i4];
            i8 = i2 + 1;
            i7 = i11;
            int i92 = i4 + i7;
            int i102 = i6 + 1;
            i2 = i8;
            i3 = i92;
            i4 = i102;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    static {
        onMessageChannelReady = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{1126, 5711, 48752, 1045, 55348, 28647, 8744, 1482, 15467, 4178, 27327, 52515, 29903, 10468, 45812}, ViewConfiguration.getTapTimeout() >> 16, objArr);
        IAuthTabCallbackDefault = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2078644483, (byte) (View.MeasureSpec.getSize(0) - 81), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1966543943, (short) (Process.myTid() >> 22), TextUtils.indexOf("", "") - 3076, objArr2);
        IAuthTabCallbackStub = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{43234, 45301, 59644, 43147, 32387, 21523, 29884, 15918, 37110}, (-1) - MotionEvent.axisFromString(""), objArr3);
        asBinder = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        c(((byte) KeyEvent.getModifierMetaStateMask()) + 2078644494, (byte) (MotionEvent.axisFromString("") + 76), TextUtils.getOffsetAfter("", 0) - 1966543956, (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.red(0) - 3076, objArr4);
        asInterface = ((String) objArr4[0]).intern();
        try {
            Object[] objArr5 = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2007047121);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1162 - Process.getGidForName("")), 73 - Color.red(0), 12286 - TextUtils.indexOf((CharSequence) "", '0', 0), -1189209409, false, (String) null, new Class[]{DefaultConstructorMarker.class});
            }
            Companion = ((Constructor) objOnExtraCallback).newInstance(objArr5);
            onTransact = 8;
            int i = extraCallbackWithResult + 83;
            onMessageChannelReady = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SchemeExecutorActivity schemeExecutorActivity = (SchemeExecutorActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(schemeExecutorActivity, dialogInterface);
        int i4 = ICustomTabsCallback + 125;
        extraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030a  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context, im.toss.devtool.runtime.data.util.SchemeExecutorActivity] */
    /* JADX WARN: Type inference failed for: r4v52, types: [android.widget.TextView, im.toss.uikit.widget.textField.BaseEditText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        ?? string;
        ClipData.Item itemAt;
        CharSequence text;
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i5));
        int i11 = ~(i9 | i3);
        int i12 = i10 | i11;
        int i13 = ~i5;
        int i14 = i11 | (~(i13 | i3));
        int i15 = (~(i6 | i7 | i13)) | (~(i13 | i9 | i3));
        int i16 = i5 + i3 + i2 + ((-1369571145) * i) + ((-720088171) * i4);
        int i17 = i16 * i16;
        int i18 = ((i5 * (-1931095572)) - 2087550970) + (i3 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + ((-1931095207) * i2) + ((-789048161) * i) + (356376013 * i4) + (i17 * 423362560);
        int i19 = (((-954023988) * i5) - 252706816) + ((-260227018) * i3) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i2) + (565182464 * i) + (1611661312 * i4) + ((-409206784) * i17) + (i18 * i18 * (-1901854720));
        if (i19 != 1) {
            return i19 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }
        ?? r3 = (SchemeExecutorActivity) objArr[0];
        int i20 = 2 % 2;
        Object objOnExtraCallback$9f4917e = r3.onExtraCallback$9f4917e();
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-315650475);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11122), TextUtils.indexOf((CharSequence) "", '0') + 17, Color.red(0) + 11103, -596676411, false, "onExtraCallback", new Class[0]);
            }
            CharSequence charSequence = (CharSequence) ((Method) objOnExtraCallback).invoke(objOnExtraCallback$9f4917e, null);
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                Object[] objArr2 = new Object[1];
                a(new char[]{37282, 32431, 34537, 37329, 45250, 34744, 6825, 60821, 43440, 30883, 21014, 9571, 57617, 16461, 35382, 23711}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132020646).substring(0, 3).length() - 3, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                int i21 = extraCallback + 117;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                charSequence2 = strIntern;
            }
            CharSequence charSequence3 = charSequence2;
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1880017180);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 21835), 74 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12360, -1095645068, false, "onExtraCallbackWithResult", (Class[]) null);
            }
            Function1 function1 = (Function1) ((Field) objOnExtraCallback2).get(null);
            logAndOpenStore.IAuthTabCallback((Context) r3, (Long) null);
            getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants((Context) r3, 0, false, false, -1L, function1, 14, (DefaultConstructorMarker) null);
            Context context = gettypedexportedconstants.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            Object[] objArr3 = new Object[1];
            a(new char[]{17966, 4826, 10912, 33930, 3190, 40363, 29140, 63427, 47563, 44167, 11112, 65083, 61562}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, objArr3);
            bottomSheetHeader.setTitle(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a(new char[]{27824, 38321, 54066, 27792, 15652}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132023908).substring(0, 4).codePointAt(3) - 48, objArr4);
            bottomSheetHeader.setDescription(((String) objArr4[0]).intern());
            bottomSheetHeader.setShowCloseIcon(false);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            TextField textField = new TextField(context3);
            DisplayMetrics displayMetrics = textField.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -520433888, new Object[]{textField, Integer.valueOf(varyMatches.onNavigationEvent(24, displayMetrics))}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 520433888);
            DisplayMetrics displayMetrics2 = textField.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            setMinWebSocketMessageToCompressokhttp.onExtraCallbackWithResult(textField, varyMatches.onNavigationEvent(24, displayMetrics2));
            textField.IAuthTabCallback().setInputType(1);
            textField.IAuthTabCallback().setImeOptions(6);
            textField.IAuthTabCallback().setOnEditorActionListener(new SchemeExecutorActivity$.ExternalSyntheticLambda0(textField, gettypedexportedconstants, (SchemeExecutorActivity) r3));
            Object[] objArr5 = new Object[1];
            a(new char[]{22324, 17271, 7297, 22359, 36099, 35857, 32984, 58921, 28470, 17760, 51312, 11979, 10128}, View.MeasureSpec.getMode(0), objArr5);
            Object systemService = r3.getSystemService(((String) objArr5[0]).intern());
            Intrinsics.checkNotNull(systemService, "");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) {
                string = charSequence3;
            } else {
                int i23 = extraCallback + 71;
                ICustomTabsCallback = i23 % 128;
                int i24 = i23 % 2;
                string = text.toString();
                if (string != null) {
                    int i25 = extraCallback + 77;
                    ICustomTabsCallback = i25 % 128;
                    int i26 = i25 % 2;
                    if (!enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault((String) string)) {
                        string = null;
                    }
                    if (string == null) {
                    }
                }
            }
            textField.IAuthTabCallback().setText(string);
            linearLayout.addView(textField);
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
            Object[] objArr6 = new Object[1];
            c(TextUtils.indexOf("", "", 0) + 2078644512, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031232).substring(0, 2).codePointAt(1) - 197), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 1966494262, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021838).substring(0, 4).length() - 3080, objArr6);
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, ((String) objArr6[0]).intern(), new SchemeExecutorActivity$.ExternalSyntheticLambda1((SchemeExecutorActivity) r3, textField, gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
            gettypedexportedconstants.setContentView(linearLayout);
            gettypedexportedconstants.setOnDismissListener(new SchemeExecutorActivity$.ExternalSyntheticLambda2((SchemeExecutorActivity) r3));
            gettypedexportedconstants.show();
            ((SchemeExecutorActivity) r3).getInterfaceDescriptor = gettypedexportedconstants;
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(SchemeExecutorActivity schemeExecutorActivity, ListItemBottomSheetDialog listItemBottomSheetDialog, ListItemBottomSheetDialog.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(schemeExecutorActivity, listItemBottomSheetDialog, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = ICustomTabsCallback + 17;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        TextField textField = (TextField) objArr[0];
        getTypedExportedConstants gettypedexportedconstants = (getTypedExportedConstants) objArr[1];
        SchemeExecutorActivity schemeExecutorActivity = (SchemeExecutorActivity) objArr[2];
        TextView textView = (TextView) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        KeyEvent keyEvent = (KeyEvent) objArr[5];
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(onExtraCallbackWithResult(textField, gettypedexportedconstants, schemeExecutorActivity, textView, iIntValue, keyEvent));
        }
        onExtraCallbackWithResult(textField, gettypedexportedconstants, schemeExecutorActivity, textView, iIntValue, keyEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SchemeExecutorActivity schemeExecutorActivity, TextField textField, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(schemeExecutorActivity, textField, gettypedexportedconstants, view);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ListItemBottomSheetDialog listItemBottomSheetDialog, View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(listItemBottomSheetDialog, view);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = ICustomTabsCallback + 41;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(SchemeExecutorActivity schemeExecutorActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(schemeExecutorActivity, dialogInterface);
        int i4 = extraCallback + 37;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object onExtraCallback$9f4917e() {
        int i = 2 % 2;
        Object obj = this.schemeRepository;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = extraCallback + 43;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        String action;
        int i = 2 % 2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Object obj = null;
        if (intent != null) {
            int i2 = extraCallback + 121;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                intent.getAction();
                obj.hashCode();
                throw null;
            }
            action = intent.getAction();
            int i3 = extraCallback + 73;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 3;
            }
        } else {
            action = null;
        }
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 2078644474, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025702).substring(0, 2).length() + 73), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022813).substring(0, 138).length() - 1966544094, (short) Drawable.resolveOpacity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022702).substring(0, 9).codePointAt(1) - 3186, new Object[1]);
        if (!(!Intrinsics.areEqual(action, ((String) r2[0]).intern()))) {
            int i5 = extraCallback + 89;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            onNavigationEvent();
            finish();
        }
        int i7 = extraCallback + 85;
        ICustomTabsCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 38 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) throws Throwable {
        int i = 2 % 2;
        if (z && this.getInterfaceDescriptor == null) {
            int i2 = extraCallback + 59;
            ICustomTabsCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getIntent();
                obj.hashCode();
                throw null;
            }
            Intent intent = getIntent();
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1903565664) {
                    if (iHashCode == 100358090) {
                        int i3 = extraCallback + 29;
                        ICustomTabsCallback = i3 % 128;
                        int i4 = i3 % 2;
                        Object[] objArr = new Object[1];
                        a(new char[]{43234, 45301, 59644, 43147, 32387, 21523, 29884, 15918, 37110}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022773).substring(0, 8).codePointAt(4) - 32, objArr);
                        if (action.equals(((String) objArr[0]).intern())) {
                            int i5 = ICustomTabsCallback + 15;
                            extraCallback = i5 % 128;
                            if (i5 % 2 == 0) {
                                onExtraCallback(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 1622156136, StatusCpt$$ExternalSyntheticLambda0.onExtraCallback(), -643383155, StatusCpt$$ExternalSyntheticLambda0.onExtraCallback(), 643383156, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 38806170);
                                return;
                            } else {
                                onExtraCallback(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 1622156136, StatusCpt$$ExternalSyntheticLambda0.onExtraCallback(), -643383155, StatusCpt$$ExternalSyntheticLambda0.onExtraCallback(), 643383156, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 38806170);
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
                Object[] objArr2 = new Object[1];
                c(2078644484 - KeyEvent.normalizeMetaState(0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 100), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022343).substring(2, 3).codePointAt(0) - 1966544050, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R$string.griver_open_specific_permission).substring(9, 10).codePointAt(0) - 3108, objArr2);
                if (action.equals(((String) objArr2[0]).intern())) {
                    Intent intent2 = getIntent();
                    Object[] objArr3 = new Object[1];
                    a(new char[]{1126, 5711, 48752, 1045, 55348, 28647, 8744, 1482, 15467, 4178, 27327, 52515, 29903, 10468, 45812}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022726).substring(0, 4).length() - 4, objArr3);
                    String stringExtra = intent2.getStringExtra(((String) objArr3[0]).intern());
                    if (stringExtra != null) {
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-228604968);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 12, 12444 - (ViewConfiguration.getPressedStateDuration() >> 16), -1021362872, false, "IAuthTabCallback", (Class[]) null);
                        }
                        Object obj2 = ((Field) objOnExtraCallback).get(null);
                        try {
                            Object[] objArr4 = {stringExtra};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1745361239);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 12 - TextUtils.indexOf("", ""), 12445 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1497950151, false, "IAuthTabCallback", new Class[]{String.class});
                            }
                            onNavigationEvent((List<Object>) ((Method) objOnExtraCallback2).invoke(obj2, objArr4));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                }
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access000 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 113;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(access000)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 84 - TextUtils.indexOf("", "", 0, 0), 21234 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - MotionEvent.axisFromString("")), View.MeasureSpec.makeMeasureSpec(0, 0) + 19, 8808 - (ViewConfiguration.getTouchSlop() >> 8), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 93;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final boolean onExtraCallbackWithResult(TextField textField, getTypedExportedConstants gettypedexportedconstants, SchemeExecutorActivity schemeExecutorActivity, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 105;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            if (i != 86) {
                return false;
            }
        } else if (i != 6) {
            return false;
        }
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (StringsKt.isBlank((Editable) TextField.onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{textField}, -450491624, iIAuthTabCallback, iIAuthTabCallback3))) {
            return false;
        }
        int i4 = extraCallback + 29;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback5 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback6 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        schemeExecutorActivity.onNavigationEvent(StringsKt.trim(((Editable) TextField.onExtraCallbackWithResult(iIAuthTabCallback5, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{textField}, -450491624, iIAuthTabCallback4, iIAuthTabCallback6)).toString()).toString());
        gettypedexportedconstants.dismiss();
        return true;
    }

    private static final Unit IAuthTabCallback(SchemeExecutorActivity schemeExecutorActivity, TextField textField, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        schemeExecutorActivity.onNavigationEvent(((Editable) TextField.onExtraCallbackWithResult(iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{textField}, -450491624, iIAuthTabCallback, iIAuthTabCallback3)).toString());
        gettypedexportedconstants.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 15;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }

    private static final void onExtraCallback(SchemeExecutorActivity schemeExecutorActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        schemeExecutorActivity.finish();
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = extraCallback + 77;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(List<Object> list) throws Throwable {
        int i = 2 % 2;
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-329625418);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, 12276 - TextUtils.indexOf((CharSequence) "", '0', 0), -585454042, false, "onExtraCallback", new Class[0]);
                }
                String str = (String) ((Method) objOnExtraCallback).invoke(obj, null);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2092989772);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10 - View.resolveSizeAndState(0, 0, 0), 12278 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1300267996, false, "onWarmupCompleted", new Class[0]);
                }
                arrayList.add(new ListItemBottomSheetDialog.onExtraCallbackWithResult(str, (String) ((Method) objOnExtraCallback2).invoke(obj, null)));
                int i2 = extraCallback + 49;
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
        Object[] objArr = new Object[1];
        c(2078644514 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((-53) - Color.argb(0, 0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132024686).substring(2, 6).length() - 1966498489, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021835).substring(0, 4).codePointAt(3) - 115), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 3173, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c(2078644523 - Color.argb(0, 0, 0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 150), (-1966489189) - TextUtils.lastIndexOf("", '0', 0, 0), (short) View.combineMeasuredStates(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025031).substring(0, 2).codePointAt(0) - 3113, objArr2);
        ListItemBottomSheetDialog listItemBottomSheetDialog = new ListItemBottomSheetDialog(this, strIntern, arrayList, ((String) objArr2[0]).intern(), (String) null, (Map) null, 48, (DefaultConstructorMarker) null);
        listItemBottomSheetDialog.onExtraCallbackWithResult(new SchemeExecutorActivity$.ExternalSyntheticLambda3(this, listItemBottomSheetDialog));
        listItemBottomSheetDialog.onWarmupCompleted(new SchemeExecutorActivity$.ExternalSyntheticLambda4(listItemBottomSheetDialog));
        listItemBottomSheetDialog.setOnDismissListener(new SchemeExecutorActivity$.ExternalSyntheticLambda5(this));
        listItemBottomSheetDialog.show();
        this.getInterfaceDescriptor = listItemBottomSheetDialog;
    }

    private static final Unit onNavigationEvent(SchemeExecutorActivity schemeExecutorActivity, ListItemBottomSheetDialog listItemBottomSheetDialog, ListItemBottomSheetDialog.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            schemeExecutorActivity.onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult());
            listItemBottomSheetDialog.dismiss();
            unit = Unit.INSTANCE;
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            schemeExecutorActivity.onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult());
            listItemBottomSheetDialog.dismiss();
            unit = Unit.INSTANCE;
        }
        int i4 = ICustomTabsCallback + 23;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(ListItemBottomSheetDialog listItemBottomSheetDialog, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        listItemBottomSheetDialog.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 59;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(SchemeExecutorActivity schemeExecutorActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        schemeExecutorActivity.finish();
        int i4 = extraCallback + 51;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        if (enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(str)) {
            Object objOnExtraCallback$9f4917e = onExtraCallback$9f4917e();
            try {
                Object[] objArr = {str};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1530099694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 11123), 16 - View.MeasureSpec.getSize(0), 11103 - (Process.myPid() >> 22), 1785956734, false, "onExtraCallbackWithResult", new Class[]{String.class});
                }
                ((Method) objOnExtraCallback).invoke(objOnExtraCallback$9f4917e, objArr);
                Object[] objArr2 = new Object[1];
                a(new char[]{5214, 1473, 38942, 5183, 52151, 20391, 1098, 9629, 11345, 976, 19690, 60705, 25847, 15223, 38042, 38090, 48400, 29325, 56672, 23726, 62909, 43565, 58823, 1024, 3536, 57879, 11864, 52166, 18011, 9678}, Color.alpha(0), objArr2);
                Intent intent = new Intent(((String) objArr2[0]).intern()).setData(Uri.parse(str)).setPackage(getPackageName());
                Intrinsics.checkNotNullExpressionValue(intent, "");
                startActivity(intent);
                int i2 = extraCallback + 107;
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
        int i4 = extraCallback + 11;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 9;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback$9f4917e = onExtraCallback$9f4917e();
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-315650475);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11122), (ViewConfiguration.getTapTimeout() >> 16) + 16, 11103 - TextUtils.getCapsMode("", 0, 0), -596676411, false, "onExtraCallback", new Class[0]);
            }
            String str = (String) ((Method) objOnExtraCallback).invoke(objOnExtraCallback$9f4917e, null);
            if (str != null) {
                int i4 = ICustomTabsCallback + 19;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                onNavigationEvent(str);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void c(int i, byte b, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 43425), (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, ((Process.getThreadPriority(0) + 20) >> 6) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i7 = $11 + 87;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 4;
                }
                z = false;
            }
            if (z) {
                byte[] bArr = readTypedObject;
                if (bArr != null) {
                    int i9 = $10 + 65;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 12843), 55 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 2167 - (ViewConfiguration.getPressedStateDuration() >> 16), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = readTypedObject;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback_Parcel)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSize(0, 0)), 42 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 22439 - (ViewConfiguration.getTouchSlop() >> 8), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (writeTypedObject[i + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStubProxy ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback_Parcel ^ j));
                if (z) {
                    int i13 = $11 + 47;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i12 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(access100), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 86, 9567 - (ViewConfiguration.getPressedStateDuration() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = readTypedObject;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        int i16 = $11 + 115;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        int i18 = $10 + 103;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            byte[] bArr6 = readTypedObject;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback / (((byte) (((byte) (bArr6[r8] & (-4629411779493505016L))) + s)) ^ b);
                        } else {
                            byte[] bArr7 = readTypedObject;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = writeTypedObject;
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

    public static /* synthetic */ boolean IAuthTabCallback(TextField textField, getTypedExportedConstants gettypedexportedconstants, SchemeExecutorActivity schemeExecutorActivity, TextView textView, int i, KeyEvent keyEvent) {
        Object[] objArr = {textField, gettypedexportedconstants, schemeExecutorActivity, textView, Integer.valueOf(i), keyEvent};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return ((Boolean) onExtraCallback(objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 569166236, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -569166236, iIAuthTabCallback)).booleanValue();
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SchemeExecutorActivity schemeExecutorActivity, DialogInterface dialogInterface) throws Throwable {
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        onExtraCallback(new Object[]{schemeExecutorActivity, dialogInterface}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1905641086, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1905641084, iIAuthTabCallback);
    }

    private final void setEngagementSignalsCallback() throws Throwable {
        onExtraCallback(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 1622156136, StatusCpt$$ExternalSyntheticLambda0.onExtraCallback(), -643383155, StatusCpt$$ExternalSyntheticLambda0.onExtraCallback(), 643383156, (-38806170) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length());
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallback + 81;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallback + 43;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = ICustomTabsCallback + 39;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void IAuthTabCallback() {
        access000 = -7697796861434677996L;
        IAuthTabCallback_Parcel = 543014644;
        IAuthTabCallbackStubProxy = -1538796533;
        access100 = -781136719;
        writeTypedObject = new short[]{11278, 10150, 10157, -10150, 10154, -10161, 10159, 10144, -10158, 11288, 10171, -10165, 10174, -10170, 10163, -10153, 10152, -10174, -10159, 10166, -10162, 10169, 10162, 10172, -10159, 10173, 10158, -10160, 11255, 13571, 11278, 10207, -9892, 10131, -13402, -8041, 25199, 9923, 8371, 11255, -10504};
    }
}
