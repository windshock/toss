package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsNestedScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textField.TextFieldSpinner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.SetDetectableSize;
import o.getCountryName;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCountryName extends isSignaturePolicyImplied implements getSigPolicyId, RequireInput, SignerLocation, getCertifiedAttributes {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int[] getInterfaceDescriptor = {-627987798, -1492016150, -1394089935, -2125537751, -479235779, 2054749444, -1784562194, -622042302, 1967609628, 117293705, -179788596, -658962014, 1098955097, 1458474411, 699900308, 1343207473, 1701554734, -2140532559};
    private final getDigestAlgorithms<?> IAuthTabCallback;
    private getSigPolicyId IAuthTabCallbackDefault;
    private DynamicLoaderFactory IAuthTabCallbackStub;
    private final CardIssueOverviewViewModel access100;
    private TextFieldSpinner asBinder;
    private final createNativeBannerAdApi asInterface;
    private final TypographyKtExternalSyntheticLambda0 onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private Function0<Unit> onNavigationEvent;
    private LinearLayout onTransact;
    private List<? extends isSignaturePolicyImplied> onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getCountryName getcountryname = (getCountryName) objArr[0];
        TextFieldSpinner textFieldSpinner = (TextFieldSpinner) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {getcountryname, textFieldSpinner, view};
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted4 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        if (i3 != 0) {
            onNavigationEvent(2005328509, iOnWarmupCompleted4, iOnWarmupCompleted2, iOnWarmupCompleted3, -2005328506, iOnWarmupCompleted, objArr2);
            obj.hashCode();
            throw null;
        }
        onNavigationEvent(2005328509, iOnWarmupCompleted4, iOnWarmupCompleted2, iOnWarmupCompleted3, -2005328506, iOnWarmupCompleted, objArr2);
        int i4 = IAuthTabCallback_Parcel + 73;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(getCountryName getcountryname, DynamicLoaderFactory dynamicLoaderFactory, getTypedExportedConstants gettypedexportedconstants, TdsListRowV1View tdsListRowV1View, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getcountryname, dynamicLoaderFactory, gettypedexportedconstants, tdsListRowV1View, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(view, suspendAnimationKtExternalSyntheticLambda4);
        int i4 = access000 + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(createNativeAdBaseApi createnativeadbaseapi, getCountryName getcountryname, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(createnativeadbaseapi, getcountryname, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = access000 + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        getCountryName getcountryname = (getCountryName) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getcountryname, setDetectableSize);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i6 | i | i5);
        int i13 = i11 | i12;
        int i14 = i10 | i;
        int i15 = i + i5 + i3 + (112060874 * i4) + ((-1891258303) * i2);
        int i16 = i15 * i15;
        int i17 = (i * 1286644997) + 1783103488 + (1286644997 * i5) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i3) + ((-1427111936) * i4) + (1712848896 * i2) + (159514624 * i16);
        int i18 = ((i * (-1669307009)) - 1771304782) + (i5 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i3 * (-1669306445)) + (i4 * (-1582645698)) + (i2 * (-198941581)) + (i16 * (-203030528));
        int i19 = i17 + (i18 * i18 * (-2008154112));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ void onNavigationEvent(getCountryName getcountryname, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getcountryname, dialogInterface);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 43;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        getCountryName getcountryname = (getCountryName) objArr[0];
        DynamicLoaderFactory dynamicLoaderFactory = (DynamicLoaderFactory) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(getcountryname, dynamicLoaderFactory, setDetectableSize);
        }
        onNavigationEvent(getcountryname, dynamicLoaderFactory, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i4 = access000 + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getCountryName getcountryname, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getcountryname, view);
        int i4 = IAuthTabCallback_Parcel + 81;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static final class onWarmupCompleted implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        public final void onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public getCountryName(@NotNull Context context, @NotNull createNativeBannerAdApi createnativebanneradapi, @NotNull getDigestAlgorithms<?> getdigestalgorithms, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(createnativebanneradapi, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        this.onExtraCallbackWithResult = context;
        this.asInterface = createnativebanneradapi;
        this.IAuthTabCallback = getdigestalgorithms;
        this.onExtraCallback = typographyKtExternalSyntheticLambda0;
        this.access100 = cardIssueOverviewViewModel;
        Iterator<T> it = createnativebanneradapi.asBinder().iterator();
        int i = 2 % 2;
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((DynamicLoaderFactory) next).asBinder(), this.asInterface.onWarmupCompleted())) {
                    break;
                }
            } else {
                int i2 = IAuthTabCallback_Parcel + 113;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                next = null;
                break;
            }
        }
        this.IAuthTabCallbackStub = (DynamicLoaderFactory) next;
        this.onTransact = asBinder();
        this.asBinder = asInterface();
        int i4 = access000 + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public getSigPolicyId onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getSigPolicyId getsigpolicyid = this.IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return getsigpolicyid;
    }

    @Override // o.getSigPolicyId
    public void onExtraCallbackWithResult(@Nullable getSigPolicyId getsigpolicyid) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 87;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = getsigpolicyid;
        int i5 = i2 + 43;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
    }

    private static final Unit onNavigationEvent(getCountryName getcountryname, View view) {
        int i = 2 % 2;
        int i2 = access000 + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            getDigestAlgorithms.onExtraCallbackWithResult(getcountryname.IAuthTabCallback, getcountryname.onExtraCallback, getcountryname.asInterface.onExtraCallback(), getcountryname.access100, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 113, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            getDigestAlgorithms.onExtraCallbackWithResult(getcountryname.IAuthTabCallback, getcountryname.onExtraCallback, getcountryname.asInterface.onExtraCallback(), getcountryname.access100, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 117;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onExtraCallback(Spinner.class.getName());
            int i3 = IAuthTabCallback_Parcel + 13;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 61;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getInterfaceDescriptor;
        long j = 0;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                int i7 = $10 + 71;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), ExpandableListView.getPackedPositionType(j) + 72, 8849 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 72, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                j = 0;
            }
            int i8 = $11 + 87;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 % 3;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getInterfaceDescriptor;
        if (iArr6 != null) {
            int i10 = $10 + 95;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i11 = 0;
            while (i11 < length) {
                int i12 = $10 + 25;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr6[i11]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 72 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetAfter("", i5) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr6[i11])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 72 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTapTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i11++;
                }
                i4 = -1469660336;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i13 = i5;
        System.arraycopy(iArr6, i13, iArr5, i13, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i13] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i14];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf("", "", 0) + 39, ImageFormat.getBitsPerPixel(0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 4033), View.MeasureSpec.getMode(0) + 78, 7397 - ExpandableListView.getPackedPositionChild(0L), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final void onExtraCallback(getCountryName getcountryname, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getcountryname.IAuthTabCallbackStubProxy();
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(createNativeAdBaseApi createnativeadbaseapi, final getCountryName getcountryname, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(createnativeadbaseapi.IAuthTabCallback());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(createnativeadbaseapi.onExtraCallback());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, createnativeadbaseapi.onExtraCallbackWithResult(), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.SelectView$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return getCountryName.onWarmupCompleted((DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.SelectView$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                getCountryName.onNavigationEvent(this.f$0, dialogInterface);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final getCountryName getcountryname = (getCountryName) objArr[0];
        TextFieldSpinner textFieldSpinner = (TextFieldSpinner) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((Boolean) createNativeBannerAdApi.onExtraCallback(1524197547, new Object[]{getcountryname.asInterface}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1524197547, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue();
            obj.hashCode();
            throw null;
        }
        if (!((Boolean) createNativeBannerAdApi.onExtraCallback(1524197547, new Object[]{getcountryname.asInterface}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1524197547, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue()) {
            final createNativeAdBaseApi createnativeadbaseapiOnExtraCallbackWithResult = getcountryname.asInterface.onExtraCallbackWithResult();
            if (createnativeadbaseapiOnExtraCallbackWithResult != null) {
                Context context = textFieldSpinner.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.SelectView$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj2) {
                        return getCountryName.onExtraCallback(createnativeadbaseapiOnExtraCallbackWithResult, getcountryname, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                    }
                });
                return null;
            }
            getcountryname.IAuthTabCallbackStubProxy();
            return null;
        }
        createAdSizeApi createadsizeapiOnTransact = getcountryname.asInterface.onTransact();
        if (createadsizeapiOnTransact != null) {
            getDigestAlgorithms.onExtraCallbackWithResult(getcountryname.IAuthTabCallback, getcountryname.onExtraCallback, createadsizeapiOnTransact, getcountryname.access100, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
        }
        int i3 = IAuthTabCallback_Parcel + 65;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final im.toss.uikit.widget.textField.TextFieldSpinner asInterface() {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCountryName.asInterface():im.toss.uikit.widget.textField.TextFieldSpinner");
    }

    private static final Unit IAuthTabCallback(getCountryName getcountryname, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", getcountryname.access100.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", getcountryname.access100.getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", getcountryname.access100.ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getcountryname.IAuthTabCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallback());
        Object[] objArr = new Object[1];
        a(new int[]{-1583013601, -589839016}, 3 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), getcountryname.asInterface.IAuthTabCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 97;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(getCountryName getcountryname, DynamicLoaderFactory dynamicLoaderFactory, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", getcountryname.access100.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", getcountryname.access100.getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", getcountryname.access100.ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{getcountryname.IAuthTabCallback}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onExtraCallback());
        Object[] objArr = new Object[1];
        a(new int[]{-1583013601, -589839016}, 4 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), getcountryname.asInterface.IAuthTabCallbackDefault());
        Object[] objArr2 = new Object[1];
        a(new int[]{-1407184740, 1872380257, -1059890213, -661971215}, 5 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), dynamicLoaderFactory.asInterface());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(final getCountryName getcountryname, final DynamicLoaderFactory dynamicLoaderFactory, getTypedExportedConstants gettypedexportedconstants, TdsListRowV1View tdsListRowV1View, View view) {
        Object next;
        Function0<Unit> function0;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385810L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.SelectView$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, dynamicLoaderFactory, (SetDetectableSize) obj};
                int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                return (Unit) getCountryName.onNavigationEvent(1378908972, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1378908970, iOnWarmupCompleted, objArr);
            }
        }, 14, (Object) null);
        getcountryname.IAuthTabCallbackStub = dynamicLoaderFactory;
        getcountryname.asBinder.setTextFieldSpinnerTitle(dynamicLoaderFactory.asInterface());
        getcountryname.onTransact.removeAllViews();
        List<createNativeAdRatingApi> listOnExtraCallbackWithResult = dynamicLoaderFactory.onExtraCallbackWithResult();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallbackWithResult, 10));
        Iterator<T> it = listOnExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            int i2 = access000 + 105;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                arrayList.add(getSubjectPublicKeyInfo.onExtraCallback((createNativeAdRatingApi) it.next(), tdsListRowV1View.getContext(), getcountryname.onExtraCallback, getcountryname.access100, getcountryname.IAuthTabCallback));
                int i3 = 70 / 0;
            } else {
                arrayList.add(getSubjectPublicKeyInfo.onExtraCallback((createNativeAdRatingApi) it.next(), tdsListRowV1View.getContext(), getcountryname.onExtraCallback, getcountryname.access100, getcountryname.IAuthTabCallback));
            }
        }
        getcountryname.onWarmupCompleted = arrayList;
        int i4 = 0;
        for (Object obj : arrayList) {
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            isSignaturePolicyImplied issignaturepolicyimplied = (isSignaturePolicyImplied) obj;
            View viewOnWarmupCompleted = issignaturepolicyimplied.onWarmupCompleted();
            if (i4 == 0) {
                DisplayMetrics displayMetrics = viewOnWarmupCompleted.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(viewOnWarmupCompleted, varyMatches.onNavigationEvent(24, displayMetrics));
            }
            getClaimedAttributes getclaimedattributes = getClaimedAttributes.onExtraCallback;
            List<? extends isSignaturePolicyImplied> listEmptyList = getcountryname.onWarmupCompleted;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            setMinWebSocketMessageToCompressokhttp.onNavigationEvent(viewOnWarmupCompleted, getclaimedattributes.onWarmupCompleted(listEmptyList, i4, issignaturepolicyimplied, true));
            getcountryname.onTransact.addView(viewOnWarmupCompleted);
            if ((issignaturepolicyimplied instanceof RequireInput) && (function0 = getcountryname.onNavigationEvent) != null) {
                ((RequireInput) issignaturepolicyimplied).onExtraCallbackWithResult(function0);
            }
            i4++;
        }
        List<? extends isSignaturePolicyImplied> list = getcountryname.onWarmupCompleted;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                int i5 = IAuthTabCallback_Parcel + 29;
                access000 = i5 % 128;
                if (i5 % 2 != 0) {
                    next = it2.next();
                    int i6 = 19 / 0;
                    if (next instanceof getSigPolicyId) {
                        arrayList2.add(next);
                    }
                } else {
                    next = it2.next();
                    if (next instanceof getSigPolicyId) {
                        arrayList2.add(next);
                    }
                }
            }
            getSigPolicyId getsigpolicyid = (getSigPolicyId) CollectionsKt.firstOrNull(arrayList2);
            if (getsigpolicyid != null) {
                getsigpolicyid.IAuthTabCallbackDefault();
            }
        }
        getSigPolicyId getsigpolicyidOnExtraCallbackWithResult = getcountryname.onExtraCallbackWithResult();
        if (getsigpolicyidOnExtraCallbackWithResult != null) {
            getsigpolicyidOnExtraCallbackWithResult.IAuthTabCallbackDefault();
        }
        Function0<Unit> function02 = getcountryname.onNavigationEvent;
        if (function02 != null) {
            int i7 = IAuthTabCallback_Parcel + 1;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            function02.invoke();
        }
        gettypedexportedconstants.dismiss();
    }

    private final void IAuthTabCallbackStubProxy() {
        boolean z;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385804L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.SelectView$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
                return (Unit) getCountryName.onNavigationEvent(238396092, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -238396092, iOnWarmupCompleted, objArr);
            }
        }, 14, (Object) null);
        Context context = this.onExtraCallbackWithResult;
        onWarmupCompleted onwarmupcompleted = onWarmupCompleted.onWarmupCompleted;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onwarmupcompleted, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.IAuthTabCallback(true);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        DisplayMetrics displayMetrics = linearLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        setMinWebSocketMessageToCompressokhttp.onNavigationEvent(linearLayout, varyMatches.onNavigationEvent(24, displayMetrics));
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(this.asInterface.access000());
        bottomSheetHeader.setDescription(this.asInterface.IAuthTabCallbackStubProxy());
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsNestedScrollView tdsNestedScrollView = new TdsNestedScrollView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Context context5 = tdsNestedScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        LinearLayout linearLayout2 = new LinearLayout(context5);
        linearLayout2.setOrientation(1);
        for (final DynamicLoaderFactory dynamicLoaderFactory : this.asInterface.asBinder()) {
            Context context6 = linearLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            final TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context6, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            if (dynamicLoaderFactory.onWarmupCompleted() != null) {
                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
            } else {
                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
                int i2 = access000 + 57;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 5;
                }
            }
            CardRecommendCardImage cardRecommendCardImageOnExtraCallback = dynamicLoaderFactory.onExtraCallback();
            if (cardRecommendCardImageOnExtraCallback != null) {
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                tdsListRowV1View.setLeftImage(cardRecommendCardImageOnExtraCallback.onNavigationEvent());
            }
            tdsListRowV1View.setCenterText1(dynamicLoaderFactory.asInterface());
            tdsListRowV1View.setCenterText2(dynamicLoaderFactory.onWarmupCompleted());
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, dynamicLoaderFactory)) {
                z = true;
            } else {
                int i4 = access000 + 93;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
                tdsListRowV1View.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE);
                z = true;
                tdsListRowV1View.setRightCheckBoxCheckedState(true);
            }
            tdsListRowV1View.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.freeform.SelectView$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getCountryName.IAuthTabCallback(this.f$0, dynamicLoaderFactory, gettypedexportedconstants, tdsListRowV1View, view);
                }
            });
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsListRowV1View);
        }
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), varyMatches.onNavigationEvent(24, displayMetrics2));
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsNestedScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsNestedScrollView);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    private final void IAuthTabCallback_Parcel() {
        Iterator it;
        int i = 2 % 2;
        List<? extends isSignaturePolicyImplied> list = this.onWarmupCompleted;
        if (list != null) {
            int i2 = IAuthTabCallback_Parcel + 13;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                it = list.iterator();
                int i3 = 35 / 0;
            } else {
                it = list.iterator();
            }
            while (it.hasNext()) {
                int i4 = access000 + 25;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                Object obj = (isSignaturePolicyImplied) it.next();
                if (!(!(obj instanceof RequireInput))) {
                    int i6 = access000;
                    int i7 = i6 + 71;
                    IAuthTabCallback_Parcel = i7 % 128;
                    if (i7 % 2 != 0) {
                        Function0<Unit> function0 = this.onNavigationEvent;
                        if (function0 != null) {
                            int i8 = i6 + 17;
                            IAuthTabCallback_Parcel = i8 % 128;
                            int i9 = i8 % 2;
                            ((RequireInput) obj).onExtraCallbackWithResult(function0);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public Pair<String, Object> onNavigationEvent() {
        String strAsBinder;
        int i = 2 % 2;
        String strIAuthTabCallbackDefault = this.asInterface.IAuthTabCallbackDefault();
        DynamicLoaderFactory dynamicLoaderFactory = this.IAuthTabCallbackStub;
        if (dynamicLoaderFactory != null) {
            int i2 = IAuthTabCallback_Parcel + 105;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            strAsBinder = dynamicLoaderFactory.asBinder();
        } else {
            int i4 = access000 + 79;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 4;
            }
            strAsBinder = null;
        }
        return getWrite.IAuthTabCallback(strIAuthTabCallbackDefault, strAsBinder);
    }

    @Override // o.getSigPolicyId
    public void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackStub == null) {
            if (!((Boolean) createNativeBannerAdApi.onExtraCallback(1524197547, new Object[]{this.asInterface}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1524197547, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue()) {
                int i2 = IAuthTabCallback_Parcel + 49;
                access000 = i2 % 128;
                if (i2 % 2 == 0) {
                    IAuthTabCallbackStubProxy();
                    return;
                }
                IAuthTabCallbackStubProxy();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        getSigPolicyId getsigpolicyidOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (getsigpolicyidOnExtraCallbackWithResult != null) {
            int i3 = access000 + 79;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            getsigpolicyidOnExtraCallbackWithResult.IAuthTabCallbackDefault();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r1.isEmpty() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return true;
     */
    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean IAuthTabCallback() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            o.createNativeBannerAdApi r1 = r6.asInterface
            boolean r1 = r1.getInterfaceDescriptor()
            r2 = 1
            if (r1 == 0) goto L16
            int r1 = o.getCountryName.access000
            int r1 = r1 + 27
            int r3 = r1 % 128
            o.getCountryName.IAuthTabCallback_Parcel = r3
            int r1 = r1 % r0
            return r2
        L16:
            o.DynamicLoaderFactory r1 = r6.IAuthTabCallbackStub
            r3 = 0
            if (r1 != 0) goto L1c
            return r3
        L1c:
            java.util.List<? extends o.isSignaturePolicyImplied> r1 = r6.onWarmupCompleted
            if (r1 != 0) goto L21
            return r2
        L21:
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L7b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L52
            int r4 = o.getCountryName.access000
            int r4 = r4 + 99
            int r5 = r4 % 128
            o.getCountryName.IAuthTabCallback_Parcel = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L48
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r5 = 58
            int r5 = r5 / r3
            if (r4 == 0) goto L52
            goto L51
        L48:
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L52
        L51:
            return r2
        L52:
            java.util.Iterator r1 = r1.iterator()
            int r4 = o.getCountryName.access000
            int r4 = r4 + 123
            int r5 = r4 % 128
            o.getCountryName.IAuthTabCallback_Parcel = r5
            int r4 = r4 % r0
        L5f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r1.next()
            o.isSignaturePolicyImplied r4 = (o.isSignaturePolicyImplied) r4
            boolean r4 = r4.onTransact()
            if (r4 != 0) goto L5f
            int r1 = o.getCountryName.access000
            int r1 = r1 + 73
            int r2 = r1 % 128
            o.getCountryName.IAuthTabCallback_Parcel = r2
            int r1 = r1 % r0
            return r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCountryName.IAuthTabCallback():boolean");
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput
    public void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.onNavigationEvent = function0;
            IAuthTabCallback_Parcel();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = function0;
        IAuthTabCallback_Parcel();
        int i3 = access000 + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.SignerLocation
    public createAdSizeApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 45;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DynamicLoaderFactory dynamicLoaderFactory = this.IAuthTabCallbackStub;
        if (dynamicLoaderFactory == null) {
            int i5 = i4 + 5;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i2 + 23;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
        createAdSizeApi createadsizeapiIAuthTabCallback = dynamicLoaderFactory.IAuthTabCallback();
        int i9 = IAuthTabCallback_Parcel + 29;
        access000 = i9 % 128;
        int i10 = i9 % 2;
        return createadsizeapiIAuthTabCallback;
    }

    @Override // o.getCertifiedAttributes
    public List<isSignaturePolicyImplied> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access000 + 11;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            List<? extends isSignaturePolicyImplied> listEmptyList = this.onWarmupCompleted;
            if (listEmptyList == null) {
                int i4 = i3 + 115;
                access000 = i4 % 128;
                int i5 = i4 % 2;
                listEmptyList = CollectionsKt.emptyList();
            }
            List listFilterIsInstance = CollectionsKt.filterIsInstance(listEmptyList, getCertifiedAttributes.class);
            ArrayList arrayList = new ArrayList();
            Iterator it = listFilterIsInstance.iterator();
            while (it.hasNext()) {
                List<isSignaturePolicyImplied> listIAuthTabCallbackStub = ((getCertifiedAttributes) it.next()).IAuthTabCallbackStub();
                if (listIAuthTabCallbackStub == null) {
                    listIAuthTabCallbackStub = CollectionsKt.emptyList();
                }
                CollectionsKt.addAll(arrayList, listIAuthTabCallbackStub);
            }
            return CollectionsKt.plus(listEmptyList, arrayList);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isSignaturePolicyImplied
    public View onWarmupCompleted() {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this.onExtraCallbackWithResult);
        linearLayout.setOrientation(1);
        if (!this.asInterface.getInterfaceDescriptor()) {
            this.onTransact = asBinder();
            TextFieldSpinner textFieldSpinnerAsInterface = asInterface();
            this.asBinder = textFieldSpinnerAsInterface;
            linearLayout.addView(textFieldSpinnerAsInterface);
            createNativeBannerAdViewApi createnativebanneradviewapiIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
            if (createnativebanneradviewapiIAuthTabCallbackStub != null) {
                int i2 = access000 + 87;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LinearLayout linearLayoutOnWarmupCompleted = getSubjectPublicKeyInfo.onWarmupCompleted(createnativebanneradviewapiIAuthTabCallbackStub, context, this.onExtraCallback, this.access100, this.IAuthTabCallback);
                if (linearLayoutOnWarmupCompleted != null) {
                    linearLayout.addView(linearLayoutOnWarmupCompleted);
                }
            }
            linearLayout.addView(this.onTransact);
            return linearLayout;
        }
        for (DynamicLoaderFactory dynamicLoaderFactory : this.asInterface.asBinder()) {
            Context context2 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context2, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
            if (dynamicLoaderFactory.onWarmupCompleted() != null) {
                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
                int i4 = access000 + 15;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
            }
            CardRecommendCardImage cardRecommendCardImageOnExtraCallback = dynamicLoaderFactory.onExtraCallback();
            if (cardRecommendCardImageOnExtraCallback != null) {
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                tdsListRowV1View.setLeftImage(cardRecommendCardImageOnExtraCallback.onNavigationEvent());
            }
            tdsListRowV1View.setCenterText1(dynamicLoaderFactory.asInterface());
            tdsListRowV1View.setCenterText2(dynamicLoaderFactory.onWarmupCompleted());
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        }
        return linearLayout;
    }

    private final LinearLayout asBinder() {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this.onExtraCallbackWithResult);
        linearLayout.setOrientation(1);
        int i2 = access000 + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getCountryName getcountryname, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onNavigationEvent(238396092, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, -238396092, iOnWarmupCompleted, new Object[]{getcountryname, setDetectableSize});
    }

    public static /* synthetic */ void onNavigationEvent(getCountryName getcountryname, TextFieldSpinner textFieldSpinner, View view) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onNavigationEvent(-1225624826, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, 1225624827, iOnWarmupCompleted, new Object[]{getcountryname, textFieldSpinner, view});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getCountryName getcountryname, DynamicLoaderFactory dynamicLoaderFactory, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onNavigationEvent(1378908972, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, -1378908970, iOnWarmupCompleted, new Object[]{getcountryname, dynamicLoaderFactory, setDetectableSize});
    }

    private static final void IAuthTabCallback(getCountryName getcountryname, TextFieldSpinner textFieldSpinner, View view) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted3 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        onNavigationEvent(2005328509, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, -2005328506, iOnWarmupCompleted, new Object[]{getcountryname, textFieldSpinner, view});
    }
}
