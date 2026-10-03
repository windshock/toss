package viva.republica.toss.send.dutch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseActivity;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulesListExternalSyntheticLambda0;
import o.CMS_EnvelopedDataWithEncryptKey;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.EncoderImplExternalSyntheticLambda3;
import o.IPostMessageServiceStubProxy;
import o.PlayerErrorCode;
import o.Plugin;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access502;
import o.access8100;
import o.accessgetReactApplicationContextIfActiveOrWarn;
import o.addOperation;
import o.addUnbatchedOperation;
import o.callTimeoutMillis;
import o.certificateChainCleaner;
import o.disableImageViewPreallocationAndroid;
import o.getAdService;
import o.getNavigationBar;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.makeAlignFaceBitmap;
import o.onCallBack;
import o.readIntokhttp;
import o.transparentBackground;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.send.dutch.TransferDutchCompleteActivity;
import viva.republica.toss.send.dutch.TransferDutchCompleteActivity$;
import viva.republica.toss.send.dutch.TransferDutchHistoryActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferDutchCompleteActivity extends BaseActivity {
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static final List<String> IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static int asInterface;
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onTransact(this));
    private final onExtraCallback onTransact = new onExtraCallback();
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int access100 = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    interface IAuthTabCallbackStub {
    }

    private static String $$c(int i, short s, short s2) {
        int i2 = (s * 2) + 4;
        int i3 = s2 * 2;
        byte[] bArr = $$a;
        int i4 = 105 - (i * 2);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i4 = i2 + i3;
        }
        while (true) {
            int i6 = i2;
            int i7 = i4;
            i5++;
            bArr2[i5] = (byte) i7;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i2 = i6 + 1;
            i4 = i7 + bArr[i6];
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(addOperation addoperation, TransferDutchCompleteActivity transferDutchCompleteActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(addoperation, transferDutchCompleteActivity, setDetectableSize);
        }
        onExtraCallback(addoperation, transferDutchCompleteActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferDutchCompleteActivity transferDutchCompleteActivity, View view) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(transferDutchCompleteActivity, view);
        int i4 = IAuthTabCallbackStubProxy + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferDutchCompleteActivity transferDutchCompleteActivity, addOperation addoperation, String str, View view) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(transferDutchCompleteActivity, addoperation, str, view);
        int i4 = access100 + 21;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (~(i6 | i4)) | i3;
        int i8 = i4 | i6 | i3;
        int i9 = ~i6;
        int i10 = i6 + i3 + i + ((-421447895) * i2) + ((-859425246) * i5);
        int i11 = i10 * i10;
        int i12 = (i6 * (-629045104)) + 1817116672 + ((-629045104) * i3) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i) + ((-2125594624) * i2) + (888930304 * i5) + (441384960 * i11);
        int i13 = (i6 * 1303038832) + 2077918271 + (i3 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i * 1303038783) + (i2 * 1583617559) + (i5 * (-1102559138)) + (i11 * 510722048);
        return i12 + ((i13 * i13) * 607191040) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(RecyclerView recyclerView, Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 111;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(recyclerView, rect, view, recyclerView2, state, i);
        }
        onNavigationEvent(recyclerView, rect, view, recyclerView2, state, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 85;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = i2 + 53;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    static final class onExtraCallback extends onCallBack<IAuthTabCallbackStub> {

        public static final class onExtraCallbackWithResult implements Function1<Object, Boolean> {
            public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onNavigationEvent);
            }
        }

        public static final class onNavigationEvent implements Function1<Object, Boolean> {
            public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onWarmupCompleted);
            }
        }

        public static final class onWarmupCompleted implements Function1<Object, Boolean> {
            public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onExtraCallbackWithResult);
            }
        }

        public static final class IAuthTabCallback implements getAdService {
            final /* synthetic */ Configuration onWarmupCompleted;

            public IAuthTabCallback(Configuration configuration) {
                this.onWarmupCompleted = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public onExtraCallback() {
            super(new DiffUtil.ItemCallback<IAuthTabCallbackStub>() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity.onExtraCallback.1
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public boolean areItemsTheSame(IAuthTabCallbackStub iAuthTabCallbackStub, IAuthTabCallbackStub iAuthTabCallbackStub2) {
                    Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
                    Intrinsics.checkNotNullParameter(iAuthTabCallbackStub2, "");
                    return iAuthTabCallbackStub == iAuthTabCallbackStub2;
                }

                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public boolean areContentsTheSame(IAuthTabCallbackStub iAuthTabCallbackStub, IAuthTabCallbackStub iAuthTabCallbackStub2) {
                    Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
                    Intrinsics.checkNotNullParameter(iAuthTabCallbackStub2, "");
                    return Intrinsics.areEqual(iAuthTabCallbackStub, iAuthTabCallbackStub2);
                }
            });
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return TransferDutchCompleteActivity.onExtraCallback.onWarmupCompleted((Context) obj);
                }
            });
            onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return TransferDutchCompleteActivity.onExtraCallback.IAuthTabCallback((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferDutchCompleteActivity.onExtraCallback.onWarmupCompleted((AppMsgReceiver2) obj, (TransferDutchCompleteActivity.onWarmupCompleted) obj2);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(onNavigationEvent.onExtraCallbackWithResult);
            }
            onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult2.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return TransferDutchCompleteActivity.onExtraCallback.IAuthTabCallback((Context) obj);
                }
            });
            onextracallbackwithresult2.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return TransferDutchCompleteActivity.onExtraCallback.onExtraCallbackWithResult((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2) {
                    return TransferDutchCompleteActivity.onExtraCallback.onWarmupCompleted((AppMsgReceiver2) obj, (TransferDutchCompleteActivity.onNavigationEvent) obj2);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
                onextracallbackwithresult2.onExtraCallback(onExtraCallbackWithResult.onNavigationEvent);
            }
            onNavigationEvent(onextracallbackwithresult2.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult3.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda6
                public final Object invoke(Object obj) {
                    return TransferDutchCompleteActivity.onExtraCallback.onExtraCallback((Context) obj);
                }
            });
            onextracallbackwithresult3.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda7
                public final Object invoke(Object obj) {
                    return TransferDutchCompleteActivity.onExtraCallback.onNavigationEvent((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.dutch.TransferDutchCompleteActivity$ListAdapter$$ExternalSyntheticLambda8
                public final Object invoke(Object obj, Object obj2) {
                    return TransferDutchCompleteActivity.onExtraCallback.onWarmupCompleted((AppMsgReceiver2) obj, (TransferDutchCompleteActivity.onExtraCallbackWithResult) obj2);
                }
            });
            if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
                onextracallbackwithresult3.onExtraCallback(onWarmupCompleted.onExtraCallbackWithResult);
            }
            onNavigationEvent(onextracallbackwithresult3.onExtraCallbackWithResult());
        }

        public static View onWarmupCompleted(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        }

        public static Unit IAuthTabCallback(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View2.setLeftImageTransformation(new Plugin(0.0f, 0.0f, 0.0f, 0, 0, 31, (DefaultConstructorMarker) null));
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
            Context context = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new IAuthTabCallback(configuration)).ICustomTabsCallbackStubProxy());
            DisplayMetrics displayMetrics = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            tdsListRowV1View2.setPaddingTop(varyMatches.onNavigationEvent(8, displayMetrics));
            DisplayMetrics displayMetrics2 = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            tdsListRowV1View2.setPaddingBottom(varyMatches.onNavigationEvent(8, displayMetrics2));
            return Unit.INSTANCE;
        }

        public static Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            tdsListRowV1View2.setLeftImage(onwarmupcompleted.onNavigationEvent());
            tdsListRowV1View2.setCenterText1(onwarmupcompleted.IAuthTabCallback());
            return Unit.INSTANCE;
        }

        public static View IAuthTabCallback(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new TdsTopV2View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }

        public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsTopV2View tdsTopV2View = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNull(tdsTopV2View, "");
            tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
            return Unit.INSTANCE;
        }

        public static Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            TdsTopV2View tdsTopV2View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsTopV2View, "");
            TdsTopV2View tdsTopV2View2 = tdsTopV2View;
            String string = tdsTopV2View2.getContext().getString(onnavigationevent.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(string, "");
            tdsTopV2View2.setTitleText(string);
            return Unit.INSTANCE;
        }

        public static View onExtraCallback(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new TdsTopV2View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }

        public static Unit onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsTopV2View tdsTopV2View = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNull(tdsTopV2View, "");
            TdsTopV2View tdsTopV2View2 = tdsTopV2View;
            tdsTopV2View2.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
            tdsTopV2View2.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            tdsTopV2View2.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
            return Unit.INSTANCE;
        }

        public static Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            TdsTopV2View tdsTopV2View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsTopV2View, "");
            TdsTopV2View tdsTopV2View2 = tdsTopV2View;
            String string = tdsTopV2View2.getContext().getString(onextracallbackwithresult.onWarmupCompleted());
            Intrinsics.checkNotNullExpressionValue(string, "");
            tdsTopV2View2.setTitleText(string);
            String string2 = tdsTopV2View2.getContext().getString(onextracallbackwithresult.onExtraCallback(), makeAlignFaceBitmap.IAuthTabCallback(PlayerErrorCode.onPostMessage()));
            Intrinsics.checkNotNullExpressionValue(string2, "");
            tdsTopV2View2.setSubtitle2Text(string2);
            return Unit.INSTANCE;
        }
    }

    public static final class onTransact implements Function0<CMS_EnvelopedDataWithEncryptKey> {
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public onTransact(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CMS_EnvelopedDataWithEncryptKey invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_EnvelopedDataWithEncryptKey.onNavigationEvent(layoutInflater);
        }
    }

    public static final class asInterface implements View.OnLayoutChangeListener {
        public asInterface() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            TdsBottomCtaV1View tdsBottomCtaV1View = ((CMS_EnvelopedDataWithEncryptKey) TransferDutchCompleteActivity.onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{TransferDutchCompleteActivity.this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1699426559, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1699426559)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
            TdsToastV1.onNavigationEvent onnavigationeventOnWarmupCompleted = new TdsToastV1.onNavigationEvent(tdsBottomCtaV1View, R.string.transfer_dutch_complete_toast).onWarmupCompleted(0);
            TdsBottomCtaV1View tdsBottomCtaV1View2 = ((CMS_EnvelopedDataWithEncryptKey) TransferDutchCompleteActivity.onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{TransferDutchCompleteActivity.this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1699426559, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1699426559)).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
            onnavigationeventOnWarmupCompleted.onNavigationEvent(tdsBottomCtaV1View2).onNavigationEvent();
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TransferDutchCompleteActivity transferDutchCompleteActivity = (TransferDutchCompleteActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        CMS_EnvelopedDataWithEncryptKey cMS_EnvelopedDataWithEncryptKeyOnNavigationEvent = transferDutchCompleteActivity.onNavigationEvent();
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return cMS_EnvelopedDataWithEncryptKeyOnNavigationEvent;
        }
        throw null;
    }

    private final CMS_EnvelopedDataWithEncryptKey onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        CMS_EnvelopedDataWithEncryptKey cMS_EnvelopedDataWithEncryptKey = (CMS_EnvelopedDataWithEncryptKey) this.asBinder.getValue();
        int i4 = access100 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return cMS_EnvelopedDataWithEncryptKey;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return "dutch__send_request";
        }
        int i3 = 52 / 0;
        return "dutch__send_request";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(8 - ExpandableListView.getPackedPositionGroup(0L), 6 - ExpandableListView.getPackedPositionChild(0L), new char[]{65530, 65531, 65530, 7, 7, 65530, 7, 7}, false, 267 - TextUtils.getOffsetAfter("", 0), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), getIntent().getStringExtra("extra.referrer"))});
        int i4 = access100 + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(RecyclerView recyclerView, Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state, int i) {
        DisplayMetrics displayMetrics;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView2, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (i > 0 && (view instanceof TdsTopV2View)) {
            int i4 = access100 + 107;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                displayMetrics = recyclerView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i2 = 92;
            } else {
                displayMetrics = recyclerView.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                i2 = 32;
            }
            rect.top = varyMatches.onNavigationEvent(Integer.valueOf(i2), displayMetrics);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = access100 + 17;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(addOperation addoperation, TransferDutchCompleteActivity transferDutchCompleteActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        setDetectableSize.onExtraCallback().put("method", "show_more");
        setDetectableSize.onExtraCallback().put("dutchId", addoperation.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback().put("screen_name", transferDutchCompleteActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 31;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(TransferDutchCompleteActivity transferDutchCompleteActivity, addOperation addoperation, String str, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted("click__share_method", false, (String) null, (List) null, (Map) null, new TransferDutchCompleteActivity$.ExternalSyntheticLambda0(addoperation, transferDutchCompleteActivity), 30, (Object) null);
        callTimeoutMillis.onNavigationEvent.onExtraCallbackWithResult(callTimeoutMillis.Companion, transferDutchCompleteActivity, BrickModulesListExternalSyntheticLambda0.onNavigationEvent(addoperation.asInterface(), false, 1, (Object) null).toString(), new certificateChainCleaner(str, "dutch", (String) null, 4, (DefaultConstructorMarker) null), (List) null, (String) null, (String) null, (Function1) null, (Function1) null, 248, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(TransferDutchCompleteActivity transferDutchCompleteActivity, View view) {
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        transferDutchCompleteActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 121;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.finish();
        if (getIntent().getBooleanExtra("extra.routeToListOnCompleted", false)) {
            getNavigationBar.IAuthTabCallback(TransferDutchHistoryActivity.IAuthTabCallback.onWarmupCompleted(TransferDutchHistoryActivity.Companion, this, false, 2, null), this);
        }
        int i4 = access100 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            c = 3;
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(asInterface)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 35125), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, (ViewConfiguration.getJumpTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 12843);
                    int iIndexOf = 54 - TextUtils.indexOf((CharSequence) "", '0');
                    int iResolveSizeAndState = 2167 - View.resolveSizeAndState(0, 0, 0);
                    byte b = (byte) ($$a[3] + 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, iIndexOf, iResolveSizeAndState, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 41;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char cCombineMeasuredStates = (char) (12843 - View.combineMeasuredStates(0, 0));
                        int minimumFlingVelocity = 55 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i11 = 2168 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte b3 = (byte) ($$a[c] + 1);
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cCombineMeasuredStates, minimumFlingVelocity, i11, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    c = 3;
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final List<IAuthTabCallbackStub> onExtraCallback(List<addUnbatchedOperation> list, List<accessgetReactApplicationContextIfActiveOrWarn> list2) {
        int i = 2 % 2;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (((addUnbatchedOperation) next).onTransact()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
                int i2 = access100 + 67;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list3 = (List) pair.onExtraCallbackWithResult();
        List list4 = (List) pair.IAuthTabCallback();
        List list5 = list3;
        int i4 = 0;
        if (!list5.isEmpty()) {
            listCreateListBuilder.add(new onNavigationEvent(R.string.transfer_dutch_title_notified_to_toss_members));
            List list6 = list3;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            int i5 = 0;
            for (Object obj : list6) {
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList3.add((onWarmupCompleted) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this, (addUnbatchedOperation) obj, Integer.valueOf(i5), list2}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -637699822, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 637699823));
                i5++;
            }
            listCreateListBuilder.addAll(arrayList3);
        }
        if (!list4.isEmpty()) {
            listCreateListBuilder.add(new onExtraCallbackWithResult(!list5.isEmpty() ? list4.size() == 1 ? R.string.transfer_dutch_title_please_share_link_with_a_friend_exceptionally : R.string.transfer_dutch_title_please_share_link_with_friends_exceptionally : list4.size() == 1 ? R.string.transfer_dutch_title_please_share_link_with_a_friend : R.string.transfer_dutch_title_please_share_link_with_friends, R.string.transfer_dutch_description_share_link_to_non_toss_users));
            List list7 = list4;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            for (Object obj2 : list7) {
                int i6 = access100 + 109;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                    int i8 = access100 + 47;
                    IAuthTabCallbackStubProxy = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 % 4;
                    }
                }
                arrayList4.add((onWarmupCompleted) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this, (addUnbatchedOperation) obj2, Integer.valueOf(i4), list2}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -637699822, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 637699823));
                i4++;
            }
            listCreateListBuilder.addAll(arrayList4);
            int i10 = IAuthTabCallbackStubProxy + 9;
            access100 = i10 % 128;
            int i11 = i10 % 2;
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    static final class onWarmupCompleted implements IAuthTabCallbackStub {
        private final String IAuthTabCallback;
        private final String onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback);
        }

        public int hashCode() {
            return (this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode();
        }

        public String toString() {
            return "MemberUiModel(iconUrl=" + this.onExtraCallback + ", name=" + this.IAuthTabCallback + ")";
        }

        public onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallback = str;
            this.IAuthTabCallback = str2;
        }

        public final String onNavigationEvent() {
            return this.onExtraCallback;
        }

        public final String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }
    }

    static final class onNavigationEvent implements IAuthTabCallbackStub {
        private final int onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onNavigationEvent) && this.onExtraCallbackWithResult == ((onNavigationEvent) obj).onExtraCallbackWithResult;
        }

        public int hashCode() {
            return Integer.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            return "TopUiModel(titleId=" + this.onExtraCallbackWithResult + ")";
        }

        public onNavigationEvent(int i) {
            this.onExtraCallbackWithResult = i;
        }

        public final int onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }
    }

    static final class onExtraCallbackWithResult implements IAuthTabCallbackStub {
        private final int IAuthTabCallback;
        private final int onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.IAuthTabCallback == onextracallbackwithresult.IAuthTabCallback && this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult;
        }

        public int hashCode() {
            return (Integer.hashCode(this.IAuthTabCallback) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            return "TopWithDescriptionUiModel(titleId=" + this.IAuthTabCallback + ", descriptionId=" + this.onExtraCallbackWithResult + ")";
        }

        public onExtraCallbackWithResult(int i, int i2) {
            this.IAuthTabCallback = i;
            this.onExtraCallbackWithResult = i2;
        }

        public final int onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        public final int onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.dutch.TransferDutchCompleteActivity.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull addOperation addoperation, @NotNull List<accessgetReactApplicationContextIfActiveOrWarn> list, boolean z, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(addoperation, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) TransferDutchCompleteActivity.class).putExtra("extra.dutchPay", addoperation).putParcelableArrayListExtra("extra.invitations", new ArrayList<>(list)).putExtra("extra.routeToListOnCompleted", z).putExtra("extra.referrer", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    static {
        IAuthTabCallback_Parcel = 1;
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackDefault = 8;
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 65, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, new char[]{65487, 16, 14, 7, 65487, 65492, 24, 65487, '\t', 3, 15, 14, 65485, 17, 21, 5, 19, 20, '\t', 15, 14, 65485, 25, 5, '\f', '\f', 15, 23, 65485, 6, '\t', '\f', '\f', 65486, 16, 14, 7, '\b', 20, 20, 16, 19, 65498, 65487, 65487, 19, 20, 1, 20, '\t', 3, 65486, 20, 15, 19, 19, 65486, '\t', '\r', 65487, '\t', 3, 15, 14, 19}, false, 257 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(63 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 37, new char[]{'\n', 65488, 25, 65493, 65488, '\b', 15, 17, 65488, 20, 15, 16, 4, '\n', 65488, 14, '\n', 65487, 20, 20, 16, 21, 65487, 4, '\n', 21, 2, 21, 20, 65488, 65488, 65499, 20, 17, 21, 21, '\t', '\b', 15, 17, 65487, '\r', '\r', '\n', 7, 65486, 26, 2, 19, '\b', 65486, 15, 16, '\n', 21, 20, 6, 22, 18, 65486, 15, 16, 4}, true, Color.alpha(0) + 255, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(63 - View.MeasureSpec.getMode(0), 47 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{'\n', 21, 20, 6, 22, 18, 65486, 15, 16, 4, '\n', 65488, 25, 65493, 65488, '\b', 15, 17, 65488, 20, 15, 16, 4, '\n', 65488, 14, '\n', 65487, 20, 20, 16, 21, 65487, 4, '\n', 21, 2, 21, 20, 65488, 65488, 65499, 20, 17, 21, 21, '\t', '\b', 15, 17, 65487, '\r', '\r', '\n', 7, 65486, 21, 15, '\n', 14, 65486, 15, 16}, true, 255 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 65, 20 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{65486, 19, 19, 15, 20, 65486, 3, '\t', 20, 1, 20, 19, 65487, 65487, 65498, 19, 16, 20, 20, '\b', 7, 14, 16, 65486, '\f', '\f', '\t', 6, 65485, 5, '\f', 16, 18, 21, 16, 65485, 14, 15, '\t', 20, 19, 5, 21, 17, 65485, 14, 15, 3, '\t', 65487, 24, 65492, 65487, 7, 14, 16, 65487, 19, 14, 15, 3, '\t', 65487, '\r', '\t'}, true, 304 - AndroidCharacter.getMirror('0'), objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 65, (ViewConfiguration.getJumpTapTimeout() >> 16) + 30, new char[]{25, 65488, '\n', 4, 16, 15, 65486, 18, 22, 6, 20, 21, '\n', 16, 15, 65486, '\b', 19, 6, 6, 15, 65486, 7, '\n', '\r', '\r', 65487, 17, 15, '\b', '\t', 21, 21, 17, 20, 65499, 65488, 65488, 20, 21, 2, 21, '\n', 4, 65487, 21, 16, 20, 20, 65487, '\n', 14, 65488, '\n', 4, 16, 15, 20, 65488, 17, 15, '\b', 65488, 65493}, false, (Process.myPid() >> 22) + 255, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 64, 10 - Color.green(0), new char[]{6, 65486, 7, '\n', '\r', '\r', 65487, 17, 15, '\b', '\t', 21, 21, 17, 20, 65499, 65488, 65488, 20, 21, 2, 21, '\n', 4, 65487, 21, 16, 20, 20, 65487, '\n', 14, 65488, '\n', 4, 16, 15, 20, 65488, 17, 15, '\b', 65488, 65493, 25, 65488, '\n', 4, 16, 15, 65486, 18, 22, 6, 20, 21, '\n', 16, 15, 65486, 3, '\r', 22}, false, TextUtils.lastIndexOf("", '0') + 256, objArr6);
        IAuthTabCallbackStub = CollectionsKt.listOf(new String[]{strIntern, strIntern2, strIntern3, strIntern4, strIntern5, ((String) objArr6[0]).intern()});
        int i = access000 + 27;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        setContentView(onNavigationEvent().getRoot());
        LinearLayout root = onNavigationEvent().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, onNavigationEvent().onExtraCallback, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i3 = IAuthTabCallbackStubProxy + 89;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                supportActionBar.onNavigationEvent(false);
            } else {
                supportActionBar.onNavigationEvent(true);
            }
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        addOperation addoperation = (addOperation) ((Parcelable) EncoderImplExternalSyntheticLambda3.onWarmupCompleted(intent, "extra.dutchPay", addOperation.class));
        if (addoperation == null) {
            int i4 = IAuthTabCallbackStubProxy + 87;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TransferDutchCompleteActivity", "dutchPay is null", null, null, false, null, 100, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            } else {
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TransferDutchCompleteActivity", "dutchPay is null", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            }
            finish();
            return;
        }
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "");
        ArrayList arrayListOnNavigationEvent = EncoderImplExternalSyntheticLambda3.onNavigationEvent(intent2, "extra.invitations", accessgetReactApplicationContextIfActiveOrWarn.class);
        String stringExtra = getIntent().getStringExtra("extra.referrer");
        List<addUnbatchedOperation> listIAuthTabCallback_Parcel = addoperation.IAuthTabCallback_Parcel();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listIAuthTabCallback_Parcel) {
            if (!((Boolean) addUnbatchedOperation.IAuthTabCallback(new Object[]{(addUnbatchedOperation) obj}, -1260277224, 1260277225, CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        RecyclerView recyclerView = onNavigationEvent().IAuthTabCallback;
        recyclerView.setAdapter(this.onTransact);
        Intrinsics.checkNotNull(recyclerView);
        transparentBackground.onExtraCallbackWithResult(recyclerView, new TransferDutchCompleteActivity$.ExternalSyntheticLambda1(recyclerView));
        this.onTransact.onExtraCallbackWithResult(onExtraCallback(arrayList, arrayListOnNavigationEvent));
        TdsBottomCtaV1View tdsBottomCtaV1View = onNavigationEvent().onNavigationEvent;
        if (arrayList.isEmpty()) {
            int i5 = access100 + 95;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                z = false;
                break;
            }
            z = true;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((addUnbatchedOperation) it.next()).onTransact()) {
                    int i6 = IAuthTabCallbackStubProxy + 65;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                    break;
                }
            }
            z = true;
        }
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        if (z) {
            i = R.string.transfer_dutch_complete_link_share_again_button;
        } else {
            int i8 = R.string.transfer_dutch_complete_link_share_button;
            int i9 = IAuthTabCallbackStubProxy + 1;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            i = i8;
        }
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, i, new TransferDutchCompleteActivity$.ExternalSyntheticLambda2(this, addoperation, stringExtra), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        tdsBottomCtaV1View.setBottomButton(R.string.close, new TransferDutchCompleteActivity$.ExternalSyntheticLambda3(this));
        TdsBottomCtaV1View tdsBottomCtaV1View2 = onNavigationEvent().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
        if (!tdsBottomCtaV1View2.isLaidOut() || tdsBottomCtaV1View2.isLayoutRequested()) {
            tdsBottomCtaV1View2.addOnLayoutChangeListener(new asInterface());
            return;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View3 = ((CMS_EnvelopedDataWithEncryptKey) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1699426559, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1699426559)).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View3, "");
        TdsToastV1.onNavigationEvent onnavigationeventOnWarmupCompleted = new TdsToastV1.onNavigationEvent(tdsBottomCtaV1View3, R.string.transfer_dutch_complete_toast).onWarmupCompleted(0);
        TdsBottomCtaV1View tdsBottomCtaV1View4 = ((CMS_EnvelopedDataWithEncryptKey) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1699426559, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1699426559)).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View4, "");
        onnavigationeventOnWarmupCompleted.onNavigationEvent(tdsBottomCtaV1View4).onNavigationEvent();
    }

    public static final /* synthetic */ CMS_EnvelopedDataWithEncryptKey onNavigationEvent(TransferDutchCompleteActivity transferDutchCompleteActivity) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (CMS_EnvelopedDataWithEncryptKey) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{transferDutchCompleteActivity}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1699426559, iOnExtraCallbackWithResult, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -1699426559);
    }

    private final onWarmupCompleted onNavigationEvent(addUnbatchedOperation addunbatchedoperation, int i, List<accessgetReactApplicationContextIfActiveOrWarn> list) {
        return (onWarmupCompleted) onExtraCallbackWithResult(TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{this, addunbatchedoperation, Integer.valueOf(i), list}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -637699822, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 637699823);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 117;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = access100 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        asInterface = 478309001;
    }
}
