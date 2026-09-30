package im.toss.features.credit.ui.plus.gift.send;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.provider.ContactsContract;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.features.credit.data.request.CreditPlusGiftPaymentRequest;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftSelectContactActivity$;
import im.toss.features.credit.ui.plus.gift.send.CreditPlusSelectViewModel;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import im.toss.uikit.widget.TdsResultV0View;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.GeckoHubImp;
import o.H5TinyPopMenuTitleBarTheme;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.ImageMatcher5;
import o.NetConverter3;
import o.PageAnimStore;
import o.ParamUtils;
import o.RightClickGesturesKtonRightClickDown2;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackera;
import o.SetDetectingInterval;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.checkRelativePath;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getDummyAd;
import o.getLastTrimMemoryLevel;
import o.getUserData;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.nSetPosition;
import o.onPageExit;
import o.onSwitchToDarkTheme;
import o.setH5MenuList;
import o.setRandomHost;
import o.setRubIn;
import o.shouldBeKeptAsChild;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusGiftSelectContactActivity extends Hilt_CreditPlusGiftSelectContactActivity implements SetDetectingInterval {

    @Inject
    public getLastTrimMemoryLevel permissionHandler;

    @Inject
    public getDummyAd standardTermsV2Intent;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int writeTypedObject = 1;
    private static char[] IAuthTabCallbackStubProxy = {60860, 63825, 50242, 54135, 48739, 34139, 36957, 32620, 18991, 20953, 15583, 3067, 5873, 64906, 51412, 55231, 41643, 35238, 38229, 24601, 20329, 23164, 8525, 3103, 6947, 58921, 52698, 55510, 42989, 45802, 39365, 25736, 29572, 24234, 9634, 12554, 7253, 60268, 63074, 56599, 43013, 46947, 33332, 27100, 29911, 17383, 43805, 49136, 33507, 38358, 63682, 50170, 55036, 14797, 3214, 6008, 31358, 19802, 20560, 47915, 36469, 37150, 58378, 52999, 54260, 9912, 2504, 7389, 26604, 19134, 23938, 41096, 35707, 40567, 57676, 62539, 57188, 8746, 13616, 6166, 25348, 30697, 23295, 44481, 45212, 39858, 61112, 61854, 50316, 12129, 12919, 1353, 26646, 29498, 17975, 43323, 48129, 34591, 60397, 65269, 49549, 54488, 16318, 691, 5505};
    private static long access000 = -5596431765295597275L;
    private final SessionTrackera IAuthTabCallbackStub = setH5MenuList.onWarmupCompleted(this, new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda2(this), (Function1) null, 2, (Object) null);
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onNavigationEvent(this));
    private final Lazy getInterfaceDescriptor = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditPlusSelectViewModel.class), new IAuthTabCallbackStub(this), new IAuthTabCallbackDefault(this), new onTransact(null, this));
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda3(this));
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda4(this));
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda5(this));
    private final Lazy onTransact = isStopUpload.onNavigationEvent(this, 1392239, (Function1) null, (Function1) null, 6, (Object) null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 + 4;
        int i7 = (i * 4) + 97;
        byte[] bArr = $$a;
        int i8 = 1 - (s * 4);
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i8;
            i4 = i6;
            i5 = 0;
            i6 += i9;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i4];
            i6 += i9;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i8) {
            }
        } else {
            i3 = 0;
            i6 = i7;
            i4 = i6;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i5 == i8) {
            }
        }
    }

    public static /* synthetic */ CreditPlusGiftPaymentRequest IAuthTabCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequestIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(creditPlusGiftSelectContactActivity);
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 111;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return creditPlusGiftPaymentRequestIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity = (CreditPlusGiftSelectContactActivity) objArr[0];
        onSwitchToDarkTheme onswitchtodarktheme = (onSwitchToDarkTheme) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(creditPlusGiftSelectContactActivity, onswitchtodarktheme);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditPlusGiftSelectContactActivity, onswitchtodarktheme);
        int i3 = writeTypedObject + 89;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = writeTypedObject + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity = (CreditPlusGiftSelectContactActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(creditPlusGiftSelectContactActivity, view);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(creditPlusGiftSelectContactActivity, view);
        int i3 = IAuthTabCallback_Parcel + 7;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity = (CreditPlusGiftSelectContactActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 613613277, -613613269, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, new Object[]{creditPlusGiftSelectContactActivity, view}, nSetPosition.onExtraCallbackWithResult());
        int i3 = writeTypedObject + 37;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Activity getInterfaceDescriptor(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 89;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return creditPlusGiftSelectContactActivity;
    }

    public static /* synthetic */ ImageMatcher5 onExtraCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ImageMatcher5 imageMatcher5IAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(creditPlusGiftSelectContactActivity);
        int i4 = writeTypedObject + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return imageMatcher5IAuthTabCallbackStubProxy;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.Context, im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftSelectContactActivity] */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = i3 | i5;
        int i8 = ~((~i5) | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i2 | i5));
        int i11 = i2 | (~(i5 | i9));
        int i12 = i3 + i2 + i4 + (2127773517 * i) + (1026174006 * i6);
        int i13 = i12 * i12;
        int i14 = (i3 * 21308160) + 1622758390 + (21308160 * i2) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (21309107 * i4) + (1708896471 * i) + (664464834 * i6) + (i13 * 287244288);
        switch ((i3 * (-484454144)) + 743702528 + ((-484454144) * i2) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i4) + (367263744 * i) + ((-1434976256) * i6) + (1105526784 * i13) + (i14 * i14 * 966983680)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                ?? r3 = (CreditPlusGiftSelectContactActivity) objArr[0];
                int i15 = 2 % 2;
                int i16 = writeTypedObject + 113;
                IAuthTabCallback_Parcel = i16 % 128;
                int i17 = i16 % 2;
                r3.ITrustedWebActivityCallback_Parcel();
                LottieAnimationView lottieAnimationView = r3.IEngagementSignalsCallbackDefault().onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
                Object[] objArr2 = new Object[1];
                a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 46 - View.MeasureSpec.getSize(0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
                Object[] objArr3 = {lottieAnimationView, ((String) objArr2[0]).intern(), false, 0L, null, null, null, 62, null};
                zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, objArr3, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
                r3.IEngagementSignalsCallbackDefault().onExtraCallbackWithResult.playAnimation();
                TdsResultV0View tdsResultV0View = r3.IEngagementSignalsCallbackDefault().onNavigationEvent;
                tdsResultV0View.setTitle(r3.getString(R.string.credit_ui_plus_gift_empty_contact_title));
                tdsResultV0View.setSubtitle(r3.getString(R.string.credit_ui_plus_gift_search_result_empty_subtitle));
                tdsResultV0View.setButtonLabel((CharSequence) null);
                int i18 = IAuthTabCallback_Parcel + 77;
                writeTypedObject = i18 % 128;
                int i19 = i18 % 2;
                return null;
            case 7:
                return asBinder(objArr);
            case 8:
                CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity = (CreditPlusGiftSelectContactActivity) objArr[0];
                View view = (View) objArr[1];
                int i20 = 2 % 2;
                int i21 = IAuthTabCallback_Parcel + 73;
                writeTypedObject = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(view, "");
                creditPlusGiftSelectContactActivity.ITrustedWebActivityCallbackDefault();
                Unit unit = Unit.INSTANCE;
                int i23 = writeTypedObject + 101;
                IAuthTabCallback_Parcel = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 9:
                CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity2 = (CreditPlusGiftSelectContactActivity) objArr[0];
                IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
                int i25 = 2 % 2;
                int i26 = IAuthTabCallback_Parcel + 35;
                writeTypedObject = i26 % 128;
                int i27 = i26 % 2;
                Unit unitOnExtraCallback = onExtraCallback(creditPlusGiftSelectContactActivity2, iEngagementSignalsCallbackDefault);
                int i28 = IAuthTabCallback_Parcel + 125;
                writeTypedObject = i28 % 128;
                int i29 = i28 % 2;
                return unitOnExtraCallback;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Activity onNavigationEvent(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Activity interfaceDescriptor = getInterfaceDescriptor(creditPlusGiftSelectContactActivity);
        int i4 = writeTypedObject + 83;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CharSequence charSequence = (CharSequence) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        CharSequence charSequence2 = (CharSequence) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -2013194279, 2013194280, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{charSequence}, nSetPosition.onExtraCallbackWithResult());
        int i4 = writeTypedObject + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return charSequence2;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(creditPlusGiftSelectContactActivity, view);
        int i4 = IAuthTabCallback_Parcel + 11;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditPlusGiftSelectContactActivity, charSequence);
        int i4 = IAuthTabCallback_Parcel + 65;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceAsInterface = asInterface(function1, obj);
        int i4 = IAuthTabCallback_Parcel + 95;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceAsInterface;
    }

    public static final class onNavigationEvent implements Function0<checkRelativePath> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Activity onWarmupCompleted;

        public onNavigationEvent(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = onExtraCallbackWithResult();
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            return searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        }

        public final checkRelativePath onExtraCallbackWithResult() {
            checkRelativePath checkrelativepathIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                checkrelativepathIAuthTabCallback = checkRelativePath.IAuthTabCallback(layoutInflater);
                int i3 = 60 / 0;
            } else {
                LayoutInflater layoutInflater2 = this.onWarmupCompleted.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
                checkrelativepathIAuthTabCallback = checkRelativePath.IAuthTabCallback(layoutInflater2);
            }
            int i4 = onNavigationEvent + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return checkrelativepathIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ CreditPlusGiftPaymentRequest IAuthTabCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequest, CreditPlusSelectViewModel$onExtraCallbackWithResult creditPlusSelectViewModel$onExtraCallbackWithResult) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequest2 = (CreditPlusGiftPaymentRequest) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1984915328, -1984915324, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditPlusGiftSelectContactActivity, creditPlusGiftPaymentRequest, creditPlusSelectViewModel$onExtraCallbackWithResult}, nSetPosition.onExtraCallbackWithResult());
        int i4 = writeTypedObject + 35;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return creditPlusGiftPaymentRequest2;
    }

    public static final /* synthetic */ CreditPlusGiftPaymentRequest IAuthTabCallbackDefault(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return creditPlusGiftSelectContactActivity.onVerticalScrollEvent();
        }
        creditPlusGiftSelectContactActivity.onVerticalScrollEvent();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftSelectContactActivity.IEngagementSignalsCallbackStubProxy();
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access000(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftSelectContactActivity.IPostMessageService_Parcel();
        int i4 = writeTypedObject + 61;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void access100(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftSelectContactActivity.ITrustedWebActivityCallback();
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void asBinder(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftSelectContactActivity.IPostMessageService();
        int i4 = IAuthTabCallback_Parcel + 65;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ CreditPlusSelectViewModel asInterface(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusSelectViewModel creditPlusSelectViewModelIEngagementSignalsCallback_Parcel = creditPlusGiftSelectContactActivity.IEngagementSignalsCallback_Parcel();
        int i4 = IAuthTabCallback_Parcel + 67;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return creditPlusSelectViewModelIEngagementSignalsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onExtraCallbackWithResult(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = creditPlusGiftSelectContactActivity.asBinder;
        int i5 = i3 + 15;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return iEngagementSignalsCallback_Parcel;
    }

    public static final /* synthetic */ void onTransact(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        creditPlusGiftSelectContactActivity.IPostMessageServiceDefault();
        int i4 = writeTypedObject + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ checkRelativePath onWarmupCompleted(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        checkRelativePath checkrelativepathIEngagementSignalsCallbackDefault = creditPlusGiftSelectContactActivity.IEngagementSignalsCallbackDefault();
        int i4 = IAuthTabCallback_Parcel + 3;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return checkrelativepathIEngagementSignalsCallbackDefault;
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, CreditPlusSelectViewModel.IAuthTabCallback.onExtraCallback onextracallback) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1296997964, 1296997964, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditPlusGiftSelectContactActivity, onextracallback}, nSetPosition.onExtraCallbackWithResult());
        int i4 = writeTypedObject + 77;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = writeTypedObject + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = writeTypedObject + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ long access200() {
        long jAccess200;
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
            int i3 = 11 / 0;
        } else {
            jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        }
        int i4 = writeTypedObject + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess200;
        }
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 63;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = writeTypedObject + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return viewAq_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Map<String, Object> ar_() {
        Map<String, Object> mapAr_;
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
            int i3 = 1 / 0;
        } else {
            mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        }
        int i4 = writeTypedObject + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = writeTypedObject + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return findresandmsgAs_;
    }

    public /* bridge */ long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        long screenId = super.getScreenId();
        int i4 = writeTypedObject + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return screenId;
    }

    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = writeTypedObject + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return screenParams;
        }
        throw null;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 1;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = writeTypedObject + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = IAuthTabCallback_Parcel + 25;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsServiceDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i3 = writeTypedObject + 69;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashICustomTabsServiceStub = ICustomTabsServiceStub();
        int i4 = writeTypedObject + 63;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashICustomTabsServiceStub;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.openJavaCrashMonitor*/.validateRelationship();
            throw null;
        }
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i3 = writeTypedObject + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return setrubinValidateRelationship;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = IAuthTabCallback_Parcel + 47;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final getDummyAd ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad != null) {
            int i5 = i3 + 63;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = IAuthTabCallback_Parcel + 39;
        writeTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private final checkRelativePath IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        checkRelativePath checkrelativepath = (checkRelativePath) this.asInterface.getValue();
        int i4 = IAuthTabCallback_Parcel + 27;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return checkrelativepath;
    }

    private final CreditPlusSelectViewModel IEngagementSignalsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusSelectViewModel creditPlusSelectViewModel = (CreditPlusSelectViewModel) this.getInterfaceDescriptor.getValue();
        int i4 = IAuthTabCallback_Parcel + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return creditPlusSelectViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i2 = writeTypedObject + 65;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                creditPlusGiftSelectContactActivity.setResult(-1);
                creditPlusGiftSelectContactActivity.finish();
                throw null;
            }
            creditPlusGiftSelectContactActivity.setResult(-1);
            creditPlusGiftSelectContactActivity.finish();
            int i3 = writeTypedObject + 121;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    private final CreditPlusGiftPaymentRequest onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequest = (CreditPlusGiftPaymentRequest) this.IAuthTabCallbackDefault.getValue();
        int i4 = writeTypedObject + 31;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return creditPlusGiftPaymentRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final CreditPlusGiftPaymentRequest IAuthTabCallback_Parcel(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftPaymentRequest parcelableExtra = creditPlusGiftSelectContactActivity.getIntent().getParcelableExtra("funnelData");
        if (!(parcelableExtra instanceof CreditPlusGiftPaymentRequest)) {
            return null;
        }
        CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequest = parcelableExtra;
        int i4 = IAuthTabCallback_Parcel + 91;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return creditPlusGiftPaymentRequest;
    }

    private final ImageMatcher5 onSessionEnded() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ImageMatcher5 imageMatcher5 = (ImageMatcher5) this.access100.getValue();
        int i3 = writeTypedObject + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return imageMatcher5;
    }

    private static final ImageMatcher5 IAuthTabCallbackStubProxy(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity) {
        int i = 2 % 2;
        ImageMatcher5 imageMatcher5 = new ImageMatcher5(new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda7(creditPlusGiftSelectContactActivity));
        int i2 = IAuthTabCallback_Parcel + 75;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return imageMatcher5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, onSwitchToDarkTheme onswitchtodarktheme) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onswitchtodarktheme, "");
            creditPlusGiftSelectContactActivity.IEngagementSignalsCallback_Parcel().onNavigationEvent(onswitchtodarktheme);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onswitchtodarktheme, "");
        creditPlusGiftSelectContactActivity.IEngagementSignalsCallback_Parcel().onNavigationEvent(onswitchtodarktheme);
        Unit unit2 = Unit.INSTANCE;
        int i3 = writeTypedObject + 77;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final class IAuthTabCallbackDefault implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public IAuthTabCallbackDefault(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.IAuthTabCallback.getDefaultViewModelProviderFactory();
            int i4 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return defaultViewModelProviderFactory;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public hasCrashWhenJavaCrash ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onTransact.getValue();
        if (i3 == 0) {
            return (hasCrashWhenJavaCrash) value;
        }
        throw null;
    }

    private final CharSequence IEngagementSignalsCallbackStub() {
        Editable text;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            text = IEngagementSignalsCallbackDefault().asBinder.IAuthTabCallback().getText();
            int i3 = 60 / 0;
        } else {
            text = IEngagementSignalsCallbackDefault().asBinder.IAuthTabCallback().getText();
        }
        int i4 = IAuthTabCallback_Parcel + 3;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return text;
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
                int i3 = 97 / 0;
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            }
            int i4 = onExtraCallback + 53;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onWarmupCompleted.getViewModelStore();
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return viewModelStore;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onNavigationEvent;

        public onTransact(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.IAuthTabCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Function0 function0 = this.onNavigationEvent;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                int i4 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.IAuthTabCallback.getDefaultViewModelCreationExtras();
            int i6 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return defaultViewModelCreationExtras;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftSelectContactActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(IEngagementSignalsCallbackDefault().IAuthTabCallback());
        LinearLayout linearLayoutIAuthTabCallback = IEngagementSignalsCallbackDefault().IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(linearLayoutIAuthTabCallback, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(linearLayoutIAuthTabCallback, IEngagementSignalsCallbackDefault().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        ITrustedWebActivityCallbackStub();
        IPostMessageServiceStubProxy();
        int i4 = IAuthTabCallback_Parcel + 117;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    private static final CharSequence asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        CharSequence charSequence = (CharSequence) function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 125;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return charSequence;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CharSequence charSequence = (CharSequence) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        CharSequence charSequenceTrim = StringsKt.trim(charSequence);
        int i4 = IAuthTabCallback_Parcel + 63;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceTrim;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackStubProxy[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - KeyEvent.normalizeMetaState(0)), View.resolveSize(0, 0) + 17, 10973 - Gravity.getAbsoluteGravity(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(access000), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46134), 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 20172, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "")), 44 - (ViewConfiguration.getPressedStateDuration() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 125;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 49123), (ViewConfiguration.getScrollBarSize() >> 8) + 44, 1494 - View.getDefaultSize(0, 0), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $10 + 97;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback_Parcel + 47;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusSelectViewModel.onExtraCallbackWithResult(creditPlusGiftSelectContactActivity.IEngagementSignalsCallback_Parcel(), charSequence, false, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1
      0x0030: PHI (r1v7 o.IPostMessageServiceStubProxy) = (r1v6 o.IPostMessageServiceStubProxy), (r1v25 o.IPostMessageServiceStubProxy) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ITrustedWebActivityCallbackStub() {
        IPostMessageServiceStubProxy supportActionBar;
        int i = 2 % 2;
        int i2 = writeTypedObject + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            setSupportActionBar(IEngagementSignalsCallbackDefault().asInterface);
            supportActionBar = getSupportActionBar();
            int i3 = 1 / 0;
            if (supportActionBar != null) {
                supportActionBar.IAuthTabCallbackStub(false);
            }
        } else {
            setSupportActionBar(IEngagementSignalsCallbackDefault().asInterface);
            supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
            }
        }
        IEngagementSignalsCallbackDefault().IAuthTabCallback.setAdapter(onSessionEnded());
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxTextView.IAuthTabCallback(IEngagementSignalsCallbackDefault().asBinder.IAuthTabCallback()).onExtraCallbackWithResult().asInterface(new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda9(new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda8())).asBinder().onExtraCallback(200L, TimeUnit.MILLISECONDS).onExtraCallbackWithResult(NetConverter3.onExtraCallback()).IAuthTabCallback(new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda11(new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda10(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
        int i4 = writeTypedObject + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceDefault() throws Throwable {
        int i = 2 % 2;
        TdsResultV0View tdsResultV0View = IEngagementSignalsCallbackDefault().onNavigationEvent;
        ITrustedWebActivityCallback_Parcel();
        LottieAnimationView lottieAnimationView = IEngagementSignalsCallbackDefault().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Object[] objArr = new Object[1];
        a(Color.blue(0) + 46, Color.blue(0) + 59, (char) (Color.argb(0, 0, 0, 0) + 18081), objArr);
        zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, new Object[]{lottieAnimationView, ((String) objArr[0]).intern(), false, 0L, null, null, null, 62, null}, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        IEngagementSignalsCallbackDefault().onExtraCallbackWithResult.playAnimation();
        tdsResultV0View.setTitle(getString(R.string.credit_ui_plus_gift_load_contact_title));
        tdsResultV0View.setSubtitle(getString(R.string.credit_ui_plus_gift_load_contact_subtitle));
        tdsResultV0View.setButtonLabel(getString(R.string.credit_ui_plus_gift_button_label));
        Object[] objArr2 = {tdsResultV0View.asInterface(), ParamUtils.NORMAL, new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda6(this)};
        int i2 = IAuthTabCallback_Parcel + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void ITrustedWebActivityCallbackDefault() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 79;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = CreditPlusGiftSelectContactActivity.this.new onExtraCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftSelectContactActivity] */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            Object obj3 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity = CreditPlusGiftSelectContactActivity.this;
                    Result.Companion companion = Result.Companion;
                    getByteBuffer getbytebufferOnExtraCallbackWithResult = PageAnimStore.onExtraCallback(creditPlusGiftSelectContactActivity).onExtraCallbackWithResult(new String[]{"android.permission.READ_CONTACTS"});
                    Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = RxAwaitKt.onNavigationEvent(getbytebufferOnExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 15;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 48 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (Result.onExtraCallback(obj2)) {
                int i8 = onExtraCallbackWithResult + 121;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                obj2 = null;
            }
            shouldBeKeptAsChild shouldbekeptaschild = (shouldBeKeptAsChild) obj2;
            if (shouldbekeptaschild == null || !shouldbekeptaschild.onNavigationEvent) {
                H5TinyPopMenuTitleBarTheme h5TinyPopMenuTitleBarTheme = H5TinyPopMenuTitleBarTheme.IAuthTabCallback;
                ?? r0 = CreditPlusGiftSelectContactActivity.this;
                LinearLayout linearLayoutIAuthTabCallback = CreditPlusGiftSelectContactActivity.onWarmupCompleted((CreditPlusGiftSelectContactActivity) r0).IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(linearLayoutIAuthTabCallback, "");
                h5TinyPopMenuTitleBarTheme.onExtraCallbackWithResult((Activity) r0, linearLayoutIAuthTabCallback);
            } else {
                if (((Boolean) H5TinyPopMenuTitleBarTheme.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{H5TinyPopMenuTitleBarTheme.IAuthTabCallback, 2}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -517567782, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 517567785)).booleanValue()) {
                    CreditPlusGiftSelectContactActivity.access000(CreditPlusGiftSelectContactActivity.this);
                } else {
                    int i10 = onExtraCallback + 67;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        CreditPlusGiftSelectContactActivity.IAuthTabCallbackStub(CreditPlusGiftSelectContactActivity.this);
                        CreditPlusGiftSelectContactActivity.access100(CreditPlusGiftSelectContactActivity.this);
                        throw null;
                    }
                    CreditPlusGiftSelectContactActivity.IAuthTabCallbackStub(CreditPlusGiftSelectContactActivity.this);
                    CreditPlusGiftSelectContactActivity.access100(CreditPlusGiftSelectContactActivity.this);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageService() throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityCallback_Parcel();
        LottieAnimationView lottieAnimationView = IEngagementSignalsCallbackDefault().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Object[] objArr = new Object[1];
        a((Process.getThreadPriority(0) + 20) >> 6, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr);
        Object[] objArr2 = {lottieAnimationView, ((String) objArr[0]).intern(), false, 0L, null, null, null, 62, null};
        zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, objArr2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        IEngagementSignalsCallbackDefault().onExtraCallbackWithResult.playAnimation();
        TdsResultV0View tdsResultV0View = IEngagementSignalsCallbackDefault().onNavigationEvent;
        tdsResultV0View.setTitle(getString(R.string.credit_ui_plus_gift_empty_contact_title));
        tdsResultV0View.setSubtitle(getString(R.string.credit_ui_plus_gift_empty_contact_subtitle));
        tdsResultV0View.setButtonLabel(getString(R.string.credit_ui_plus_gift_empty_contact_button_label));
        Object[] objArr3 = {tdsResultV0View.asInterface(), ParamUtils.NORMAL, new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda1(this)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int i2 = writeTypedObject + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        creditPlusGiftSelectContactActivity.startActivity(new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 33;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityCallback_Parcel();
        LottieAnimationView lottieAnimationView = IEngagementSignalsCallbackDefault().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        Object[] objArr = new Object[1];
        a(46 - Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, (char) (18082 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        Object[] objArr2 = {lottieAnimationView, ((String) objArr[0]).intern(), false, 0L, null, null, null, 62, null};
        zzck.onWarmupCompleted(-59676451, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), 59676451, objArr2, EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent());
        IEngagementSignalsCallbackDefault().onExtraCallbackWithResult.playAnimation();
        TdsResultV0View tdsResultV0View = IEngagementSignalsCallbackDefault().onNavigationEvent;
        tdsResultV0View.setTitle(getString(R.string.credit_ui_plus_gift_load_contact_title));
        tdsResultV0View.setSubtitle(getString(R.string.credit_ui_plus_gift_need_contact_terms));
        tdsResultV0View.setButtonLabel(getString(R.string.credit_ui_plus_gift_button_label));
        Object[] objArr3 = {tdsResultV0View.asInterface(), ParamUtils.NORMAL, new CreditPlusGiftSelectContactActivity$.ExternalSyntheticLambda0(this)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int i2 = writeTypedObject + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        creditPlusGiftSelectContactActivity.ITrustedWebActivityCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 117;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return unit;
    }

    private final void ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onNavigationEvent(this, ICustomTabsService_Parcel(), this.IAuthTabCallbackStub, "credit_plus");
            return;
        }
        H5TinyPopMenuTitleBarTheme.IAuthTabCallback.onNavigationEvent(this, ICustomTabsService_Parcel(), this.IAuthTabCallbackStub, "credit_plus");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftSelectContactActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        IEngagementSignalsCallback_Parcel().onWarmupCompleted(IEngagementSignalsCallbackStub());
        int i4 = writeTypedObject + 103;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 31;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if ((r12 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r9 = o.nSetPosition.onExtraCallbackWithResult();
        r8 = o.nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(o.nSetPosition.onExtraCallbackWithResult(), -603554597, 603554603, r8, r9, new java.lang.Object[]{r1}, o.nSetPosition.onExtraCallbackWithResult());
        r12 = 72 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r9 = o.nSetPosition.onExtraCallbackWithResult();
        r8 = o.nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(o.nSetPosition.onExtraCallbackWithResult(), -603554597, 603554603, r8, r9, new java.lang.Object[]{r1}, o.nSetPosition.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        r1.IPostMessageService_Parcel();
        r1.onSessionEnded().submitList(r12.IAuthTabCallback());
        r12 = im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftSelectContactActivity.writeTypedObject + 107;
        im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftSelectContactActivity.IAuthTabCallback_Parcel = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
    
        if ((r12 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r12.IAuthTabCallback().isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r12.IAuthTabCallback().isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r12 = im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftSelectContactActivity.writeTypedObject + 71;
        im.toss.features.credit.ui.plus.gift.send.CreditPlusGiftSelectContactActivity.IAuthTabCallback_Parcel = r12 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity = (CreditPlusGiftSelectContactActivity) objArr[0];
        CreditPlusSelectViewModel.IAuthTabCallback.onExtraCallback onextracallback = (CreditPlusSelectViewModel.IAuthTabCallback.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String strOnWarmupCompleted;
        Long lOnExtraCallback;
        long j;
        String str;
        String str2;
        boolean z;
        int i;
        CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequest = (CreditPlusGiftPaymentRequest) objArr[1];
        CreditPlusSelectViewModel$onExtraCallbackWithResult creditPlusSelectViewModel$onExtraCallbackWithResult = (CreditPlusSelectViewModel$onExtraCallbackWithResult) objArr[2];
        int i2 = 2 % 2;
        int i3 = writeTypedObject;
        int i4 = i3 + 97;
        int i5 = i4 % 128;
        IAuthTabCallback_Parcel = i5;
        int i6 = i4 % 2;
        if (creditPlusGiftPaymentRequest != null) {
            int i7 = i5 + 39;
            writeTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                strOnWarmupCompleted = creditPlusSelectViewModel$onExtraCallbackWithResult.onWarmupCompleted();
                lOnExtraCallback = creditPlusSelectViewModel$onExtraCallbackWithResult.onExtraCallback();
                j = 1;
                str = null;
                str2 = null;
                z = false;
                i = 18;
            } else {
                strOnWarmupCompleted = creditPlusSelectViewModel$onExtraCallbackWithResult.onWarmupCompleted();
                lOnExtraCallback = creditPlusSelectViewModel$onExtraCallbackWithResult.onExtraCallback();
                j = 0;
                str = null;
                str2 = null;
                z = false;
                i = 57;
            }
            return CreditPlusGiftPaymentRequest.IAuthTabCallback(creditPlusGiftPaymentRequest, j, lOnExtraCallback, strOnWarmupCompleted, str, str2, z, i, (Object) null);
        }
        int i8 = i3 + 101;
        IAuthTabCallback_Parcel = i8 % 128;
        Object obj = null;
        if (i8 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ScrollView scrollView = IEngagementSignalsCallbackDefault().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(scrollView, "");
        scrollView.setVisibility(0);
        RecyclerView recyclerView = IEngagementSignalsCallbackDefault().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        int i4 = IAuthTabCallback_Parcel + 59;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void IPostMessageService_Parcel() {
        ScrollView scrollView;
        int i;
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 21;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            scrollView = IEngagementSignalsCallbackDefault().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            i = 114;
        } else {
            scrollView = IEngagementSignalsCallbackDefault().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            i = 8;
        }
        scrollView.setVisibility(i);
        RecyclerView recyclerView = IEngagementSignalsCallbackDefault().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(0);
        int i4 = IAuthTabCallback_Parcel + 91;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 83800417, -83800410, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditPlusGiftSelectContactActivity, view}, nSetPosition.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1066257201, 1066257210, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditPlusGiftSelectContactActivity, iEngagementSignalsCallbackDefault}, nSetPosition.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -504806960, 504806965, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditPlusGiftSelectContactActivity, view}, nSetPosition.onExtraCallbackWithResult());
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(CharSequence charSequence) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (CharSequence) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -704943681, 704943684, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{charSequence}, nSetPosition.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, onSwitchToDarkTheme onswitchtodarktheme) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 429204635, -429204633, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditPlusGiftSelectContactActivity, onswitchtodarktheme}, nSetPosition.onExtraCallbackWithResult());
    }

    private final CreditPlusGiftPaymentRequest onNavigationEvent(CreditPlusGiftPaymentRequest creditPlusGiftPaymentRequest, CreditPlusSelectViewModel$onExtraCallbackWithResult creditPlusSelectViewModel$onExtraCallbackWithResult) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (CreditPlusGiftPaymentRequest) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 1984915328, -1984915324, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, creditPlusGiftPaymentRequest, creditPlusSelectViewModel$onExtraCallbackWithResult}, nSetPosition.onExtraCallbackWithResult());
    }

    private final void IPostMessageServiceStub() throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -603554597, 603554603, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, nSetPosition.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(CreditPlusGiftSelectContactActivity creditPlusGiftSelectContactActivity, View view) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), 613613277, -613613269, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{creditPlusGiftSelectContactActivity, view}, nSetPosition.onExtraCallbackWithResult());
    }

    private static final CharSequence onWarmupCompleted(CharSequence charSequence) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (CharSequence) onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -2013194279, 2013194280, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{charSequence}, nSetPosition.onExtraCallbackWithResult());
    }

    private final void onExtraCallback(CreditPlusSelectViewModel.IAuthTabCallback.onExtraCallback onextracallback) throws Throwable {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -1296997964, 1296997964, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, onextracallback}, nSetPosition.onExtraCallbackWithResult());
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftSelectContactActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = writeTypedObject + 63;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftSelectContactActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallback_Parcel + 1;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.features.credit.ui.plus.gift.send.Hilt_CreditPlusGiftSelectContactActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = writeTypedObject + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
