package viva.republica.toss.send.dutch;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.MaxHeightRecyclerView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulesListExternalSyntheticLambda0;
import o.CRYPT_VerifySign;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.M_;
import o.ParamImpl;
import o.PluginInfo;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access502;
import o.accesssetEnqueuedAnimationOnFramep;
import o.exitAllPages;
import o.getLongName;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.send.dutch.TransferDutchPaymentsBottomSheet$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferDutchPaymentsBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private final Lazy onExtraCallbackWithResult;
    private final List<accesssetEnqueuedAnimationOnFramep> onNavigationEvent;
    private static char[] IAuthTabCallback = {32613, 32401, 32413, 32402, 32587, 32606, 32620, 32612, 32610, 32607, 32414, 32408, 32609, 32415, 32614, 32593, 32405, 32600, 32615, 32409, 32611, 32608};
    private static int onExtraCallback = -1184334067;
    private static boolean asInterface = true;
    private static boolean asBinder = true;

    public static /* synthetic */ Unit onExtraCallback(AppMsgReceiver2 appMsgReceiver2, accesssetEnqueuedAnimationOnFramep accesssetenqueuedanimationonframep) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(appMsgReceiver2, accesssetenqueuedanimationonframep);
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = onTransact + 73;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(viewHolder);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(viewHolder);
        int i3 = IAuthTabCallbackDefault + 123;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransferDutchPaymentsBottomSheet transferDutchPaymentsBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(transferDutchPaymentsBottomSheet, view);
        int i4 = IAuthTabCallbackDefault + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransferDutchPaymentsBottomSheet(@NotNull Context context, @NotNull List<accesssetEnqueuedAnimationOnFramep> list) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
        this.onExtraCallbackWithResult = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));
    }

    public static final class onExtraCallback implements Function0<CRYPT_VerifySign> {
        final /* synthetic */ Dialog onExtraCallback;

        public onExtraCallback(Dialog dialog) {
            this.onExtraCallback = dialog;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CRYPT_VerifySign invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CRYPT_VerifySign.onWarmupCompleted(layoutInflater);
        }
    }

    private final CRYPT_VerifySign onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CRYPT_VerifySign cRYPT_VerifySign = (CRYPT_VerifySign) this.onExtraCallbackWithResult.getValue();
        if (i3 != 0) {
            return cRYPT_VerifySign;
        }
        throw null;
    }

    public static final class onNavigationEvent implements Function1<Object, Boolean> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof accesssetEnqueuedAnimationOnFramep);
        }
    }

    private static final Unit onExtraCallback(RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
        DisplayMetrics displayMetrics = tdsListRowV1View2.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(20.0f), displayMetrics);
        tdsListRowV1View2.setPaddingTop(iOnNavigationEvent);
        tdsListRowV1View2.setPaddingBottom(iOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(AppMsgReceiver2 appMsgReceiver2, accesssetEnqueuedAnimationOnFramep accesssetenqueuedanimationonframep) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(accesssetenqueuedanimationonframep, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        Spanned spannedOnNavigationEvent = null;
        if (accesssetenqueuedanimationonframep.onWarmupCompleted()) {
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.LOTTIE);
            TdsListRowV1View.setLeftLottieUrl$default(tdsListRowV1View2, accesssetenqueuedanimationonframep.onNavigationEvent(), 0, 2, (Object) null);
            int i2 = IAuthTabCallbackDefault + 113;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
        } else {
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View2.getContext());
            String strOnExtraCallback = accesssetenqueuedanimationonframep.onExtraCallback();
            if (strOnExtraCallback == null) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-113, -114, -125, -118, -106, -119, -114, -121, -108, -121, -107, -110, -108, -108, -120, -109, -110, -114, -119, -120, -122, -111, -112, -122, -113, -114, -125, -122, -114, -117, -119, -120, -122, -124, -115, -126, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - Color.blue(0), objArr);
                strOnExtraCallback = ((String) objArr[0]).intern();
                int i4 = IAuthTabCallbackDefault + 123;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
            tdsListRowV1View2.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationevent.onExtraCallback(strOnExtraCallback), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 61, (DefaultConstructorMarker) null)}));
        }
        tdsListRowV1View2.setCenterText1(getLongName.onNavigationEvent(accesssetenqueuedanimationonframep.IAuthTabCallback(), (ParamImpl) null, 1, (Object) null));
        String strOnExtraCallbackWithResult = accesssetenqueuedanimationonframep.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            int i6 = onTransact + 79;
            IAuthTabCallbackDefault = i6 % 128;
            spannedOnNavigationEvent = i6 % 2 == 0 ? BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallbackWithResult, false, 1, (Object) null) : BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallbackWithResult, false, 1, (Object) null);
        }
        tdsListRowV1View2.setCenterText2(spannedOnNavigationEvent);
        return Unit.INSTANCE;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        LinearLayout root = onWarmupCompleted().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        setContentView(root);
        MaxHeightRecyclerView maxHeightRecyclerView = onWarmupCompleted().onNavigationEvent;
        maxHeightRecyclerView.setMaxHeight((int) (M_.onExtraCallback.IAuthTabCallbackDefault() * 0.6f));
        exitAllPages exitallpages = new exitAllPages();
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_row_v1);
        onextracallbackwithresult.onExtraCallbackWithResult(new TransferDutchPaymentsBottomSheet$.ExternalSyntheticLambda0());
        onextracallbackwithresult.IAuthTabCallback(new TransferDutchPaymentsBottomSheet$.ExternalSyntheticLambda1());
        if (onextracallbackwithresult.onWarmupCompleted() == null) {
            int i2 = onTransact + 77;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackwithresult.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(onNavigationEvent.onNavigationEvent);
                int i3 = IAuthTabCallbackDefault + 23;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        exitallpages.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        exitallpages.onNavigationEvent(this.onNavigationEvent);
        maxHeightRecyclerView.setAdapter(exitallpages);
        TdsBottomCtaV1View tdsBottomCtaV1View = onWarmupCompleted().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, im.toss.uikit.R.string.uikit_confirm, new TransferDutchPaymentsBottomSheet$.ExternalSyntheticLambda2(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
    }

    private static final Unit onExtraCallback(TransferDutchPaymentsBottomSheet transferDutchPaymentsBottomSheet, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            transferDutchPaymentsBottomSheet.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        transferDutchPaymentsBottomSheet.dismiss();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        char c = '0';
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 77 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 20951 - TextUtils.indexOf("", c), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = $11 + 25;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 75, 16037 - View.getDefaultSize(0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (asBinder) {
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 3;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.red(0) + 63, 12214 - Drawable.resolveOpacity(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i10 = $11 + 85;
                $10 = i10 % 128;
                int i11 = i10 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = $11 + 41;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i14 = $11 + 25;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i16 = $11 + 9;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] % iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 62 - Process.getGidForName(""), 12213 - Process.getGidForName(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 63 - Color.blue(0), TextUtils.lastIndexOf("", '0') + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }
}
