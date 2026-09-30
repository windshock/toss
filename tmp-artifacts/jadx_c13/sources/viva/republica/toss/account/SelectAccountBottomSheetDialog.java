package viva.republica.toss.account;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EasingFunctionsKtExternalSyntheticLambda0;
import o.KeyBoardVisiblePoint;
import o.RecomposerawaitIdle2;
import o.SetDetectableSize;
import o.clearProcessUptime;
import o.issueCertV3;
import o.onJsBridgeReady;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.setDoubleTapZoomDpi;
import o.setProxySelectorokhttp;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.SelectAccountBottomSheetDialog$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SelectAccountBottomSheetDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackStubProxy = 1988;
    private static int ICustomTabsCallback = 0;
    private static char extraCallback = 12160;
    private static char extraCallbackWithResult = 13550;
    private static int readTypedObject = 1;
    private static char writeTypedObject = 54096;
    private TdsCheckBoxV2View.onNavigationEvent IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private KeyBoardVisiblePoint IAuthTabCallback_Parcel;
    private final String access000;
    private boolean access100;
    private final String asBinder;
    private final Function2<String, KeyBoardVisiblePoint, Unit> asInterface;
    private final String getInterfaceDescriptor;
    private final String onExtraCallback;
    private final List<KeyBoardVisiblePoint> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Function1<String, Unit> onTransact;

    public static /* synthetic */ Unit IAuthTabCallback(SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{selectAccountBottomSheetDialog, tdsBottomCtaV1View, view}, -555793961, 555793962, R.drawable.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback2, R.drawable.IAuthTabCallback(), new Object[]{selectAccountBottomSheetDialog, tdsBottomCtaV1View, view}, -555793961, 555793962, R.drawable.IAuthTabCallback());
        int i3 = 27 / 0;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i4 | i9;
        int i11 = ~i4;
        int i12 = i9 | (~(i11 | i5));
        int i13 = (~(i2 | i7 | i4)) | (~(i8 | i11 | i7));
        int i14 = i5 + i4 + i + ((-619979367) * i3) + (68302741 * i6);
        int i15 = i14 * i14;
        int i16 = (i5 * 561304900) + 382271488 + (561304900 * i4) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i) + (1615200256 * i3) + ((-1821507584) * i6) + (428933120 * i15);
        int i17 = ((i5 * (-96142684)) - 56799437) + (i4 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i * (-96141863)) + (i3 * (-1380774991)) + (i6 * (-1175232947)) + (i15 * (-118947840));
        if (i16 + (i17 * i17 * (-1369505792)) == 1) {
            return IAuthTabCallback(objArr);
        }
        SelectAccountBottomSheetDialog selectAccountBottomSheetDialog = (SelectAccountBottomSheetDialog) objArr[0];
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i18 = 2 % 2;
        int i19 = readTypedObject + 75;
        ICustomTabsCallback = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{6841, 58999, 28816, 32038, 53011, 44970, 8658, 5979}, 8 - Color.argb(0, 0, 0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), selectAccountBottomSheetDialog.asBinder);
        setDetectableSize.onExtraCallback("receive_bank_code", selectAccountBottomSheetDialog.IAuthTabCallbackDefault);
        setDetectableSize.onExtraCallback("send_bank_code", keyBoardVisiblePoint.asInterface());
        Unit unit = Unit.INSTANCE;
        int i21 = readTypedObject + 15;
        ICustomTabsCallback = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(selectAccountBottomSheetDialog, tdsBottomCtaV1View, view);
        int i4 = readTypedObject + 33;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, KeyBoardVisiblePoint keyBoardVisiblePoint, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{selectAccountBottomSheetDialog, keyBoardVisiblePoint, setDetectableSize}, -759445610, 759445610, R.drawable.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(KeyBoardVisiblePoint keyBoardVisiblePoint, SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, LinearLayout linearLayout, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(keyBoardVisiblePoint, selectAccountBottomSheetDialog, linearLayout, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 31;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return 4994910L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectAccountBottomSheetDialog(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<? extends KeyBoardVisiblePoint> list, @Nullable KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, @Nullable TdsCheckBoxV2View.onNavigationEvent onnavigationevent, @NotNull Function2<? super String, ? super KeyBoardVisiblePoint, Unit> function2, @Nullable Function1<? super String, Unit> function1, @Nullable String str5, @Nullable String str6) {
        super(context, 0, false, false, 10, null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.access000 = str;
        this.getInterfaceDescriptor = str2;
        this.onNavigationEvent = str3;
        this.onExtraCallback = str4;
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback_Parcel = keyBoardVisiblePoint;
        this.access100 = z;
        this.IAuthTabCallback = onnavigationevent;
        this.asInterface = function2;
        this.onTransact = function1;
        this.IAuthTabCallbackDefault = str5;
        this.asBinder = str6;
        IAuthTabCallback(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SelectAccountBottomSheetDialog(Context context, String str, String str2, String str3, String str4, List list, KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z, TdsCheckBoxV2View.onNavigationEvent onnavigationevent, Function2 function2, Function1 function1, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        KeyBoardVisiblePoint keyBoardVisiblePoint2;
        boolean z2;
        Function1 function12;
        if ((i & 4) != 0) {
            int i2 = 2 % 2;
            str7 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str7 = str2;
        }
        String str9 = (i & 8) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str3;
        if ((i & 16) != 0) {
            int i3 = 2 % 2;
            str8 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str8 = str4;
        }
        if ((i & 64) != 0) {
            int i4 = readTypedObject + 5;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            keyBoardVisiblePoint2 = null;
        } else {
            keyBoardVisiblePoint2 = keyBoardVisiblePoint;
        }
        if ((i & 128) != 0) {
            int i7 = ICustomTabsCallback + 21;
            readTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 5;
            } else {
                int i9 = 2 % 2;
            }
            z2 = true;
        } else {
            z2 = z;
        }
        TdsCheckBoxV2View.onNavigationEvent onnavigationevent2 = (i & 256) != 0 ? null : onnavigationevent;
        if ((i & 1024) != 0) {
            int i10 = readTypedObject + 5;
            ICustomTabsCallback = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            function12 = null;
        } else {
            function12 = function1;
        }
        this(context, str, str7, str9, str8, list, keyBoardVisiblePoint2, z2, onnavigationevent2, function2, function12, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6);
    }

    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] objArr = new Object[1];
        a(new char[]{6841, 58999, 28816, 32038, 53011, 44970, 8658, 5979}, 8 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), this.asBinder);
        linkedHashMap.put("receive_bank_code", this.IAuthTabCallbackDefault);
        int i2 = readTypedObject + 19;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return linkedHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = null;
        if (this.access100) {
            Iterator<T> it = this.onExtraCallbackWithResult.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i2 = readTypedObject + 113;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
                Object next = it.next();
                String strOnExtraCallbackWithResult = KeyBoardVisiblePoint.onExtraCallbackWithResult((KeyBoardVisiblePoint) next, (String) null, 1, (Object) null);
                KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.IAuthTabCallback_Parcel;
                if (Intrinsics.areEqual(strOnExtraCallbackWithResult, keyBoardVisiblePoint2 != null ? KeyBoardVisiblePoint.onExtraCallbackWithResult(keyBoardVisiblePoint2, (String) null, 1, (Object) null) : null)) {
                    int i4 = ICustomTabsCallback + 37;
                    int i5 = i4 % 128;
                    readTypedObject = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 87;
                    ICustomTabsCallback = i7 % 128;
                    int i8 = i7 % 2;
                    keyBoardVisiblePoint = next;
                    break;
                }
            }
            keyBoardVisiblePoint = keyBoardVisiblePoint;
            if (keyBoardVisiblePoint == null) {
                keyBoardVisiblePoint = (KeyBoardVisiblePoint) CollectionsKt___CollectionsKt.firstOrNull((List) this.onExtraCallbackWithResult);
            }
        }
        this.IAuthTabCallback_Parcel = keyBoardVisiblePoint;
        setContentView(onWarmupCompleted());
        super.onCreate(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, LinearLayout linearLayout, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        boolean z;
        int i = 2 % 2;
        if (selectAccountBottomSheetDialog.access100) {
            selectAccountBottomSheetDialog.IAuthTabCallback_Parcel = keyBoardVisiblePoint;
            Iterator itIAuthTabCallback = clearProcessUptime.onExtraCallback((Sequence<?>) EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(linearLayout), TdsListRowV1View.class).IAuthTabCallback();
            int i2 = readTypedObject + 99;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 0;
            while (itIAuthTabCallback.hasNext()) {
                Object next = itIAuthTabCallback.next();
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                TdsListRowV1View tdsListRowV1View = (TdsListRowV1View) next;
                if (keyBoardVisiblePoint != null) {
                    KeyBoardVisiblePoint keyBoardVisiblePoint2 = (KeyBoardVisiblePoint) CollectionsKt___CollectionsKt.getOrNull(selectAccountBottomSheetDialog.onExtraCallbackWithResult, i4);
                    z = true;
                    if (!Intrinsics.areEqual(keyBoardVisiblePoint2 != null ? KeyBoardVisiblePoint.onExtraCallbackWithResult(keyBoardVisiblePoint2, (String) null, 1, (Object) null) : null, KeyBoardVisiblePoint.onExtraCallbackWithResult(keyBoardVisiblePoint, (String) null, 1, (Object) null))) {
                        int i5 = ICustomTabsCallback + 85;
                        readTypedObject = i5 % 128;
                        int i6 = i5 % 2;
                        z = false;
                    }
                }
                tdsListRowV1View.setRightCheckBoxChecked(z);
                i4++;
            }
        } else if (keyBoardVisiblePoint != null) {
            setDoubleTapZoomDpi.onExtraCallbackWithResult(setDoubleTapZoomDpi.IAuthTabCallback, selectAccountBottomSheetDialog, 0L, 1, (Object) null);
            selectAccountBottomSheetDialog.asInterface.invoke(_UrlKt.FRAGMENT_ENCODE_SET, keyBoardVisiblePoint);
        }
        int i7 = readTypedObject + 47;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final void IAuthTabCallback(KeyBoardVisiblePoint keyBoardVisiblePoint, SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, LinearLayout linearLayout, View view) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 4994912L, false, (String) null, (Map) null, new SelectAccountBottomSheetDialog$.ExternalSyntheticLambda3(selectAccountBottomSheetDialog, keyBoardVisiblePoint), 14, (Object) null);
        onExtraCallbackWithResult(selectAccountBottomSheetDialog, linearLayout, keyBoardVisiblePoint);
        int i2 = readTypedObject + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 111;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                int i5 = defaultGainProviderExternalSyntheticLambda1.onNavigationEvent;
                cArr3[1] = cArr[i3];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (extraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(extraCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iMyTid = (Process.myTid() >> 22) + 10;
                        int iLastIndexOf = TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', i3, i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, iMyTid, iLastIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(writeTypedObject)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 10 - Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 16014), 14 - Color.green(0), 19901 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SelectAccountBottomSheetDialog selectAccountBottomSheetDialog = (SelectAccountBottomSheetDialog) objArr[0];
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[2], "");
        KeyBoardVisiblePoint keyBoardVisiblePoint = selectAccountBottomSheetDialog.IAuthTabCallback_Parcel;
        if (keyBoardVisiblePoint != null) {
            int i2 = readTypedObject + 17;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            selectAccountBottomSheetDialog.dismiss();
            selectAccountBottomSheetDialog.asInterface.invoke(tdsBottomCtaV1View.asInterface().getText().toString(), keyBoardVisiblePoint);
        } else {
            Context context = tdsBottomCtaV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            onJsBridgeReady.onNavigationEvent(context, tdsBottomCtaV1View.getContext().getString(viva.republica.toss.R.string.app_account___30112661d6), 0, 2, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 125;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 35;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            selectAccountBottomSheetDialog.dismiss();
            Function1<String, Unit> function1 = selectAccountBottomSheetDialog.onTransact;
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            function1.invoke(((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getText().toString());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        selectAccountBottomSheetDialog.dismiss();
        Function1<String, Unit> function12 = selectAccountBottomSheetDialog.onTransact;
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        function12.invoke(((TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, iIAuthTabCallback3, new Object[]{tdsBottomCtaV1View}, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).getText().toString());
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 9;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TdsListRowV1View onNavigationEvent(KeyBoardVisiblePoint keyBoardVisiblePoint, boolean z) {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2F);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        Object obj = null;
        if (!(!this.access100)) {
            int i2 = readTypedObject + 29;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
                TdsCheckBoxV2View.onNavigationEvent onnavigationevent = this.IAuthTabCallback;
                if (onnavigationevent != null) {
                    tdsListRowV1View.setRightCheckBoxType(onnavigationevent);
                }
            } else {
                tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
                obj.hashCode();
                throw null;
            }
        }
        tdsListRowV1View.setCenterText1(keyBoardVisiblePoint.asBinder());
        tdsListRowV1View.setCenterText2(issueCertV3.IAuthTabCallback(keyBoardVisiblePoint));
        if (this.access100) {
            tdsListRowV1View.setRightCheckBoxChecked(z);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                int i3 = readTypedObject + 7;
                ICustomTabsCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
                } else {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
                }
            }
        }
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback = issueCertV3.IAuthTabCallback(keyBoardVisiblePoint, tdsListRowV1View.getContext(), 0.0f, 2, null);
        if (onnavigationeventIAuthTabCallback != null) {
            tdsListRowV1View.setLeftImage(onnavigationeventIAuthTabCallback);
        }
        tdsListRowV1View.setContentDescription(keyBoardVisiblePoint.IAuthTabCallbackDefault() + " " + keyBoardVisiblePoint.asBinder() + " " + issueCertV3.IAuthTabCallback(keyBoardVisiblePoint));
        return tdsListRowV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final View onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int iOnNavigationEvent = -2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        int i2 = 1;
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, null, 0, 6, null);
        bottomSheetHeader.setShowCloseIcon(false);
        if (this.onExtraCallbackWithResult.size() <= 1) {
            int i3 = readTypedObject + 109;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.getInterfaceDescriptor.length() != 0) {
                int i5 = ICustomTabsCallback + 17;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                str = this.getInterfaceDescriptor;
            } else {
                str = this.access000;
            }
        }
        bottomSheetHeader.setTitle(str);
        bottomSheetHeader.setDescription(this.onNavigationEvent);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        NestedScrollView nestedScrollView = new NestedScrollView(linearLayout.getContext());
        nestedScrollView.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics = nestedScrollView.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        nestedScrollView.setFadingEdgeLength(varyMatches.onNavigationEvent(Float.valueOf(34.0f), displayMetrics));
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        if (this.onExtraCallbackWithResult.size() > 3) {
            int i7 = ICustomTabsCallback;
            int i8 = i7 + 67;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            if (this.access100) {
                int i10 = i7 + 73;
                readTypedObject = i10 % 128;
                int i11 = i10 % 2;
                DisplayMetrics displayMetrics2 = nestedScrollView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(260.0f), displayMetrics2);
            }
        }
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = iOnNavigationEvent;
        nestedScrollView.setLayoutParams(onextracallbackwithresult);
        Context context3 = nestedScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        LinearLayout linearLayout2 = new LinearLayout(context3);
        linearLayout2.setOrientation(1);
        linearLayout2.removeAllViews();
        for (KeyBoardVisiblePoint keyBoardVisiblePoint : this.onExtraCallbackWithResult) {
            String strOnExtraCallbackWithResult = null;
            String strOnExtraCallbackWithResult2 = KeyBoardVisiblePoint.onExtraCallbackWithResult(keyBoardVisiblePoint, (String) null, i2, (Object) null);
            KeyBoardVisiblePoint keyBoardVisiblePoint2 = this.IAuthTabCallback_Parcel;
            if (keyBoardVisiblePoint2 != null) {
                int i12 = ICustomTabsCallback + 79;
                readTypedObject = i12 % 128;
                int i13 = i12 % 2;
                i2 = 1;
                strOnExtraCallbackWithResult = KeyBoardVisiblePoint.onExtraCallbackWithResult(keyBoardVisiblePoint2, (String) null, 1, (Object) null);
            }
            TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = onNavigationEvent(keyBoardVisiblePoint, Intrinsics.areEqual(strOnExtraCallbackWithResult2, strOnExtraCallbackWithResult));
            tdsListRowV1ViewOnNavigationEvent.setOnClickListener(new SelectAccountBottomSheetDialog$.ExternalSyntheticLambda0(keyBoardVisiblePoint, this, linearLayout2));
            linearLayout2.addView(tdsListRowV1ViewOnNavigationEvent);
        }
        if (!this.access100) {
            View view = new View(linearLayout2.getContext());
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            DisplayMetrics displayMetrics3 = view.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            layoutParams.height = varyMatches.onNavigationEvent(24, displayMetrics3);
            view.setLayoutParams(layoutParams);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, view);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(nestedScrollView, linearLayout2);
        linearLayout.addView(nestedScrollView);
        if (this.access100) {
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
            String string = this.onExtraCallback;
            if (string.length() == 0) {
                string = tdsBottomCtaV1View.getContext().getString(viva.republica.toss.R.string.next);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new SelectAccountBottomSheetDialog$.ExternalSyntheticLambda1(this, tdsBottomCtaV1View), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            if (this.onTransact != null) {
                String string2 = tdsBottomCtaV1View.getContext().getString(viva.republica.toss.R.string.app_account___5ddf883a19);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, string2, new SelectAccountBottomSheetDialog$.ExternalSyntheticLambda2(this, tdsBottomCtaV1View), (TdsButtonV1View.asInterface) null, 4, (Object) null);
                int i14 = readTypedObject + 3;
                ICustomTabsCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 5 % 4;
                }
            }
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        }
        return linearLayout;
    }

    private static final Unit onExtraCallback(SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, KeyBoardVisiblePoint keyBoardVisiblePoint, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{selectAccountBottomSheetDialog, keyBoardVisiblePoint, setDetectableSize}, -759445610, 759445610, R.drawable.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(SelectAccountBottomSheetDialog selectAccountBottomSheetDialog, TdsBottomCtaV1View tdsBottomCtaV1View, View view) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(R.drawable.IAuthTabCallback(), iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{selectAccountBottomSheetDialog, tdsBottomCtaV1View, view}, -555793961, 555793962, R.drawable.IAuthTabCallback());
    }
}
