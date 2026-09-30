package im.toss.securities.widget.common.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.securities.widget.common.ui.TossSecWidgetBridgeActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AFLogger4;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.getKekid;
import o.q8a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossSecWidgetBridgeActivity extends Hilt_TossSecWidgetBridgeActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static char access100;
    private static char asBinder;
    private static char asInterface;
    private static int getInterfaceDescriptor;
    public static final int onTransact;
    private TdsDialogV1 IAuthTabCallbackStub;

    @Inject
    public AFLogger4 widgetNavigationPort;

    static {
        onExtraCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        onTransact = 8;
        int i = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        TossSecWidgetBridgeActivity tossSecWidgetBridgeActivity = (TossSecWidgetBridgeActivity) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        String str5 = (String) objArr[6];
        String str6 = (String) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        DialogInterface dialogInterface = (DialogInterface) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(str, str2, tossSecWidgetBridgeActivity, str3, str4, iIntValue, str5, str6, zBooleanValue, dialogInterface, iIntValue2);
        if (i3 != 0) {
            return null;
        }
        int i4 = 42 / 0;
        return null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i4);
        int i9 = ~i2;
        int i10 = (~(i9 | i)) | i8;
        int i11 = ~i4;
        int i12 = i11 | i;
        int i13 = i10 | (~i12);
        int i14 = i7 | i2;
        int i15 = i8 | (~i14);
        int i16 = (~(i4 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i2));
        int i17 = i + i2 + i6 + ((-1254723898) * i5) + ((-1667789834) * i3);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i) + 1379663872 + ((-481802647) * i2) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i6) + ((-1033371648) * i5) + ((-106430464) * i3) + (1552875520 * i18);
        int i20 = ((i * (-402395399)) - 1316031342) + (i2 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i6 * (-402393527)) + (i5 * (-1219896714)) + (i3 * (-610841306)) + (i18 * (-825819136));
        if (i19 + (i20 * i20 * (-1063190528)) != 1) {
            return onExtraCallbackWithResult(objArr);
        }
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        DialogInterface dialogInterface = (DialogInterface) objArr[7];
        ((Number) objArr[8]).intValue();
        int i21 = 2 % 2;
        int i22 = getInterfaceDescriptor + 31;
        access000 = i22 % 128;
        int i23 = i22 % 2;
        onNavigationEvent(iIntValue, str2, str3, zBooleanValue, str4, str5, str);
        dialogInterface.dismiss();
        int i24 = getInterfaceDescriptor + 121;
        access000 = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(TossSecWidgetBridgeActivity tossSecWidgetBridgeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tossSecWidgetBridgeActivity, dialogInterface);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(String str, int i, String str2, String str3, boolean z, String str4, String str5, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, Boolean.valueOf(z), str4, str5, dialogInterface, Integer.valueOf(i2)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(-202136096, objArr, 202136097, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), iOnExtraCallback2);
        int i6 = getInterfaceDescriptor + 51;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final AFLogger4 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 27;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        AFLogger4 aFLogger4 = this.widgetNavigationPort;
        if (aFLogger4 != null) {
            return aFLogger4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = access000 + 107;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.securities.widget.common.ui.Hilt_TossSecWidgetBridgeActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            onExtraCallbackWithResult(intent);
            int i3 = 79 / 0;
        } else {
            super.onCreate(bundle);
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "");
            onExtraCallbackWithResult(intent2);
        }
        int i4 = access000 + 57;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        onExtraCallbackWithResult(intent);
        int i4 = access000 + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.securities.widget.common.ui.Hilt_TossSecWidgetBridgeActivity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = access000 + 69;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        TdsDialogV1 tdsDialogV1 = this.IAuthTabCallbackStub;
        Object obj = null;
        if (tdsDialogV1 != null) {
            int i5 = i3 + 39;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                tdsDialogV1.setOnDismissListener(null);
                obj.hashCode();
                throw null;
            }
            tdsDialogV1.setOnDismissListener(null);
        }
        TdsDialogV1 tdsDialogV12 = this.IAuthTabCallbackStub;
        if (tdsDialogV12 != null) {
            int i6 = getInterfaceDescriptor + 5;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            tdsDialogV12.dismiss();
        }
        this.IAuthTabCallbackStub = null;
        super.onDestroy();
        int i8 = getInterfaceDescriptor + 15;
        access000 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r2
      0x006f: PHI (r2v2 int) = (r2v1 int), (r2v6 int) binds: [B:16:0x006d, B:13:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[PHI: r2 r3
      0x0082: PHI (r2v5 int) = (r2v1 int), (r2v6 int) binds: [B:16:0x006d, B:13:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r3v15 java.lang.String) = (r3v10 java.lang.String), (r3v16 java.lang.String) binds: [B:16:0x006d, B:13:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Intent intent) throws Throwable {
        int intExtra;
        String stringExtra;
        int i;
        String str;
        int i2 = 2 % 2;
        if (intent.hasExtra("dialog_message")) {
            onWarmupCompleted(intent);
            int i3 = access000 + 53;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Object[] objArr = new Object[1];
        a(new char[]{58684, 31224, 36651, 38348}, Color.green(0) + 3, objArr);
        String stringExtra2 = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra2 != null) {
            int i5 = getInterfaceDescriptor + 67;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            if (!StringsKt.isBlank(stringExtra2)) {
                int i7 = access000 + 79;
                getInterfaceDescriptor = i7 % 128;
                if (i7 % 2 != 0) {
                    intExtra = intent.getIntExtra("appWidgetId", 0);
                    stringExtra = intent.getStringExtra("widget_type");
                    if (stringExtra == null) {
                        int i8 = getInterfaceDescriptor + 115;
                        access000 = i8 % 128;
                        if (i8 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        i = intExtra;
                        str = "";
                    } else {
                        i = intExtra;
                        str = stringExtra;
                    }
                } else {
                    intExtra = intent.getIntExtra("appWidgetId", 0);
                    stringExtra = intent.getStringExtra("widget_type");
                    if (stringExtra == null) {
                    }
                }
                String stringExtra3 = intent.getStringExtra("widget_size");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                q8a q8aVar = q8a.onNavigationEvent;
                q8aVar.onExtraCallbackWithResult(i, "위젯컨텐츠", stringExtra2, str, stringExtra3);
                q8aVar.onNavigationEvent(this, i, "위젯사용현황", str, stringExtra3);
                IAuthTabCallback(stringExtra2, str, stringExtra3);
            }
        }
        finish();
    }

    private static final void onNavigationEvent(int i, String str, String str2, boolean z, String str3, String str4, String str5) {
        int i2 = 2 % 2;
        int i3 = access000 + 43;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        q8a.onNavigationEvent.onNavigationEvent(i, str5, str, str2, z, str3, str4);
        if (i4 != 0) {
            throw null;
        }
        int i5 = access000 + 23;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onNavigationEvent(String str, String str2, TossSecWidgetBridgeActivity tossSecWidgetBridgeActivity, String str3, String str4, int i, String str5, String str6, boolean z, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(i, str5, str6, z, str3, str4, str);
        if (str2 != null) {
            int i6 = access000 + 75;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            tossSecWidgetBridgeActivity.IAuthTabCallback(str2, str3, str4);
            int i8 = getInterfaceDescriptor + 25;
            access000 = i8 % 128;
            int i9 = i8 % 2;
        }
        dialogInterface.dismiss();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i5 = $11 + 121;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = i3;
            while (i8 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i7) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access100);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i3);
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', i3, i3);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, iLastIndexOf, iLastIndexOf2, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (asBinder ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 10 - (ViewConfiguration.getTouchSlop() >> 8), 12434 - KeyEvent.keyCodeFromString(""), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 16014), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(TossSecWidgetBridgeActivity tossSecWidgetBridgeActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        tossSecWidgetBridgeActivity.IAuthTabCallbackStub = null;
        if (!tossSecWidgetBridgeActivity.isFinishing()) {
            tossSecWidgetBridgeActivity.finish();
        }
        int i4 = access000 + 123;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(Intent intent) throws Throwable {
        String str;
        String str2;
        int i = 2 % 2;
        String stringExtra = intent.getStringExtra("dialog_positive_button");
        if (stringExtra == null) {
            Object[] objArr = new Object[1];
            a(new char[]{30124, 42040}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1, objArr);
            stringExtra = ((String) objArr[0]).intern();
        }
        String str3 = stringExtra;
        String stringExtra2 = intent.getStringExtra("dialog_positive_landing_url");
        String stringExtra3 = intent.getStringExtra("dialog_negative_button");
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        String stringExtra4 = intent.getStringExtra("widget_type");
        String str4 = stringExtra4 == null ? "" : stringExtra4;
        String stringExtra5 = intent.getStringExtra("widget_size");
        String str5 = stringExtra5 == null ? "" : stringExtra5;
        String stringExtra6 = intent.getStringExtra("dialog_product_code");
        Object obj = null;
        if (stringExtra6 == null) {
            int i2 = access000 + 67;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        } else {
            str = stringExtra6;
        }
        String stringExtra7 = intent.getStringExtra("dialog_product_type");
        if (stringExtra7 == null) {
            int i3 = access000 + 113;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            str2 = "";
        } else {
            str2 = stringExtra7;
        }
        boolean booleanExtra = intent.getBooleanExtra("dialog_has_notice", false);
        TdsDialogV1 tdsDialogV1 = this.IAuthTabCallbackStub;
        if (tdsDialogV1 != null) {
            tdsDialogV1.setOnDismissListener(null);
        }
        TdsDialogV1 tdsDialogV12 = this.IAuthTabCallbackStub;
        if (tdsDialogV12 != null) {
            int i5 = getInterfaceDescriptor + 55;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                tdsDialogV12.dismiss();
                obj.hashCode();
                throw null;
            }
            tdsDialogV12.dismiss();
        }
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(this);
        String stringExtra8 = intent.getStringExtra("dialog_title");
        if (stringExtra8 == null) {
            stringExtra8 = "";
        }
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback.onNavigationEvent(stringExtra8);
        String stringExtra9 = intent.getStringExtra("dialog_message");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback2 = TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onExtraCallbackWithResult(stringExtra9 != null ? stringExtra9 : ""), str3, new TossSecWidgetBridgeActivity$.ExternalSyntheticLambda0(str3, stringExtra2, this, str4, str5, intExtra, str, str2, booleanExtra), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        if (stringExtra3 != null) {
        }
        this.IAuthTabCallbackStub = ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback2.IAuthTabCallback(new TossSecWidgetBridgeActivity$.ExternalSyntheticLambda2(this))).readTypedObject();
        q8a.onNavigationEvent.onWarmupCompleted(intExtra, str, str2, booleanExtra, str4, str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = access000 + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            startActivity(onExtraCallbackWithResult().onExtraCallbackWithResult(this, Uri.parse(str), str2, str3));
        } else {
            startActivity(onExtraCallbackWithResult().onExtraCallbackWithResult(this, Uri.parse(str), str2, str3));
            int i3 = 5 / 0;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static /* synthetic */ void onExtraCallback(String str, String str2, TossSecWidgetBridgeActivity tossSecWidgetBridgeActivity, String str3, String str4, int i, String str5, String str6, boolean z, DialogInterface dialogInterface, int i2) {
        Object[] objArr = {str, str2, tossSecWidgetBridgeActivity, str3, str4, Integer.valueOf(i), str5, str6, Boolean.valueOf(z), dialogInterface, Integer.valueOf(i2)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(-599462091, objArr, 599462091, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), iOnExtraCallback2);
    }

    private static final void onNavigationEvent(String str, int i, String str2, String str3, boolean z, String str4, String str5, DialogInterface dialogInterface, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, Boolean.valueOf(z), str4, str5, dialogInterface, Integer.valueOf(i2)};
        int iOnExtraCallback = getKekid.onExtraCallback();
        int iOnExtraCallback2 = getKekid.onExtraCallback();
        onWarmupCompleted(-202136096, objArr, 202136097, getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), iOnExtraCallback2);
    }

    @Override // im.toss.securities.widget.common.ui.Hilt_TossSecWidgetBridgeActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 3;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.securities.widget.common.ui.Hilt_TossSecWidgetBridgeActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
    }

    @Override // im.toss.securities.widget.common.ui.Hilt_TossSecWidgetBridgeActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // im.toss.securities.widget.common.ui.Hilt_TossSecWidgetBridgeActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 103;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onExtraCallback() {
        asBinder = (char) 15459;
        IAuthTabCallbackDefault = (char) 30494;
        asInterface = (char) 24775;
        access100 = (char) 23565;
    }
}
