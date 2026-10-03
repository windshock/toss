package o;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toHashtable extends getAttrValues {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] onExtraCallback = {27263, 27173, 27194, 27194, 27199, 27168};
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private IAuthTabCallback onExtraCallbackWithResult;

    public interface IAuthTabCallback {
        void onExtraCallback(@NotNull getInitializationType getinitializationtype);

        void onExtraCallbackWithResult(@NotNull KEKIdentifier kEKIdentifier);
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[toASN1EncodableVector.values().length];
            try {
                iArr[toASN1EncodableVector.TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[toASN1EncodableVector.PLCC_CARD_TRANSACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[toASN1EncodableVector.PLCC_CARD_BILL_TRANSACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[toASN1EncodableVector.TRANSACTION_DETAIL_HEADER_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[toASN1EncodableVector.PLCC_CARD_TRANSACTION_DETAIL_HEADER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[toASN1EncodableVector.TRANSACTION_SUMMARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[toASN1EncodableVector.EMPTY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[toASN1EncodableVector.DIVIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[toASN1EncodableVector.THIN_DIVIDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[toASN1EncodableVector.THICK_DIVIDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[toASN1EncodableVector.PLCC_CARD_BANNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[toASN1EncodableVector.TDS_BANNER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[toASN1EncodableVector.PLCC_NOTICE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[toASN1EncodableVector.LIST_ROW.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[toASN1EncodableVector.SAVING_BOX_BANNER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseActivity baseActivity, setPackageVerifier setpackageverifier, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(baseActivity, setpackageverifier, setDetectableSize);
        }
        onExtraCallback(baseActivity, setpackageverifier, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(toHashtable tohashtable, BaseActivity baseActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(tohashtable, baseActivity, dialogInterface, i);
        int i5 = onNavigationEvent + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(View view, toHashtable tohashtable, View view2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(view, tohashtable, view2);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent((RecipientIdentifier) viewHolder, i);
        if (i4 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@Nullable IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = iAuthTabCallback;
        int i5 = i3 + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getAttrValues
    public RecipientIdentifier<getOther> onExtraCallbackWithResult(@NotNull final View view, @NotNull toASN1EncodableVector toasn1encodablevector) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(toasn1encodablevector, "");
        switch (onExtraCallbackWithResult.IAuthTabCallback[toasn1encodablevector.ordinal()]) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return new getKeyDerivationAlgorithm(view);
            case 2:
                OriginatorPublicKey originatorPublicKey = new OriginatorPublicKey(view);
                int i2 = onWarmupCompleted + 31;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return originatorPublicKey;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 3:
                return new getRecipientIdentifier(view);
            case 4:
                return new getKeyAttr(view);
            case 5:
                return new getCRLs(view);
            case 6:
                isTagged istagged = new isTagged(view);
                int i3 = onNavigationEvent + 69;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return istagged;
            case 7:
                return new KeyTransRecipientInfo(view);
            case 8:
                return new getAlgorithm(view);
            case 9:
                return new getKeyAttrId(view);
            case 10:
                return new OtherRecipientInfo(view);
            case 11:
                return new getUserKeyingMaterial(view);
            case 12:
                return new getOriginatorKey(view);
            case 13:
                return new OriginatorInfo(view);
            case 14:
                return new OtherKeyAttribute(view);
            case 15:
                return new PasswordRecipientInfo(view, new View.OnClickListener() { // from class: viva.republica.toss.card.UserCardTransactionAdapter$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        toHashtable.onExtraCallback(view, this, view2);
                    }
                });
            default:
                return new RecipientInfo(view);
        }
    }

    private static final void onNavigationEvent(toHashtable tohashtable, final BaseActivity baseActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Iterator<getOther> it = tohashtable.onExtraCallbackWithResult().iterator();
        int i5 = onNavigationEvent + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            int i8 = onNavigationEvent + 111;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                boolean z = it.next() instanceof setPackageVerifier;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (it.next() instanceof setPackageVerifier) {
                break;
            } else {
                i7++;
            }
        }
        getOther getother = tohashtable.onExtraCallbackWithResult().get(i7);
        Intrinsics.checkNotNull(getother, "");
        final setPackageVerifier setpackageverifier = (setPackageVerifier) getother;
        tohashtable.onWarmupCompleted(i7);
        setPackageVerifier.Companion.IAuthTabCallback();
        ConvertByteArrayToFloatArray.onWarmupCompleted("click_button", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.card.UserCardTransactionAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj2) {
                return toHashtable.IAuthTabCallback(baseActivity, setpackageverifier, (SetDetectableSize) obj2);
            }
        }, 30, (Object) null);
    }

    private static final Unit onExtraCallback(BaseActivity baseActivity, setPackageVerifier setpackageverifier, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 6, 0, 0}, false, new byte[]{0, 1, 1, 0, 1, 1}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), "autosave_later");
        setDetectableSize.onExtraCallback().put("service_id", "101");
        Object obj = null;
        setDetectableSize.onExtraCallback().put("view", baseActivity != null ? baseActivity.getScreenName() : null);
        setDetectableSize.onExtraCallback().put("amount", Long.valueOf(setpackageverifier.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(View view, final toHashtable tohashtable, View view2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity context = view.getContext();
        final BaseActivity baseActivity = null;
        if (!(context instanceof BaseActivity)) {
            int i4 = onWarmupCompleted + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 4;
            }
        } else {
            int i6 = onWarmupCompleted + 47;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            baseActivity = context;
        }
        TdsDialogV1.onExtraCallbackWithResult onextracallbackwithresult = TdsDialogV1.Companion;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = onextracallbackwithresult.onExtraCallback(context2);
        String string = view.getContext().getString(R.string.app_later_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback.onNavigationEvent(string);
        String string2 = view.getContext().getString(R.string.app_later_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted2 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompleted.onExtraCallbackWithResult(string2);
        String string3 = view.getContext().getString(R.string.app_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted3 = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), new Object[]{onwarmupcompleted2, string3, null, null, false, 14, null}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, -1871975236, 1871975236, iOnExtraCallbackWithResult2);
        String string4 = view.getContext().getString(R.string.app_later);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted3, string4, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.card.UserCardTransactionAdapter$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                toHashtable.IAuthTabCallback(this.f$0, baseActivity, dialogInterface, i7);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
    }

    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
            if (i < 0) {
                return;
            }
        } else if (i < 0) {
            return;
        }
        onExtraCallbackWithResult().remove(i);
        notifyItemRemoved(i);
        int i5 = onWarmupCompleted + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void onNavigationEvent(@NotNull RecipientIdentifier<getOther> recipientIdentifier, int i) {
        TdsListRowV1View tdsListRowV1View;
        BaseTextView baseTextViewICustomTabsCallback_Parcel;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(recipientIdentifier, "");
        getOther getother = (getOther) CollectionsKt.getOrNull(onExtraCallbackWithResult(), i);
        if (getother != null) {
            recipientIdentifier.onExtraCallbackWithResult(getother, this.onExtraCallbackWithResult);
            if (getother instanceof KEKIdentifier) {
                int i3 = onWarmupCompleted + 33;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                TdsListRowV1View tdsListRowV1View2 = ((RecyclerView.ViewHolder) recipientIdentifier).onNavigationEvent;
                Object obj = null;
                if (!(tdsListRowV1View2 instanceof TdsListRowV1View)) {
                    tdsListRowV1View = null;
                } else {
                    int i5 = onWarmupCompleted + 75;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    tdsListRowV1View = tdsListRowV1View2;
                }
                if (tdsListRowV1View != null) {
                    int i7 = onWarmupCompleted + 5;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        baseTextViewICustomTabsCallback_Parcel = tdsListRowV1View.ICustomTabsCallback_Parcel();
                        int i8 = 54 / 0;
                        if (baseTextViewICustomTabsCallback_Parcel == null) {
                            return;
                        }
                    } else {
                        baseTextViewICustomTabsCallback_Parcel = tdsListRowV1View.ICustomTabsCallback_Parcel();
                        if (baseTextViewICustomTabsCallback_Parcel == null) {
                            return;
                        }
                    }
                    baseTextViewICustomTabsCallback_Parcel.setVisibility(0);
                    getOther getother2 = (getOther) CollectionsKt.getOrNull(onExtraCallbackWithResult(), i - 1);
                    if (getother2 != null) {
                        int i9 = onWarmupCompleted + 91;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 != 0) {
                            boolean z = getother2 instanceof KEKIdentifier;
                            obj.hashCode();
                            throw null;
                        }
                        if ((getother2 instanceof KEKIdentifier) && Intrinsics.areEqual(((KEKIdentifier) getother2).IAuthTabCallbackStub(), ((KEKIdentifier) getother).IAuthTabCallbackStub())) {
                            baseTextViewICustomTabsCallback_Parcel.setVisibility(4);
                        }
                    }
                }
            }
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35, View.MeasureSpec.makeMeasureSpec(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - Process.getGidForName("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 66, 16718 - ExpandableListView.getPackedPositionType(0L), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 17657 - (ViewConfiguration.getTapTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 70, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i9 = $11 + 55;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i11 = $11 + 71;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 25;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i16 = $10 + 3;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
