package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cookies_removeSessionCookies;
import o.DynamicLoader;
import o.DynamicLoaderFactory;
import o.ExoPlayerImplExternalSyntheticLambda31;
import o.MultithreadedBundleWrapper;
import o.PageContext;
import o.Protocol;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.access502;
import o.addAllCommandLine;
import o.createAdSizeApi;
import o.createNativeBannerAdViewApi;
import o.exitAllPages;
import o.getAlgorithmId;
import o.getBacktraceNote;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getSubjectPublicKeyInfo;
import o.getX509Certificate;
import o.preFillDefault;
import o.response;
import o.setBodyokhttp;
import o.setRouteDatabaseokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment;
import viva.republica.toss.network.model.cardsales.recommend.CardRecommendCardImage;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CreditCardIssueSelectFormFragment extends CardIssueBaseFragment<getAlgorithmId> {
    private final PageContext onNavigationEvent;
    private final onNavigationEvent onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(CreditCardIssueSelectFormFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentCreditCardIssueSelectFormBinding;", 0)};
    public static final int IAuthTabCallback = 8;

    public final class onNavigationEvent extends exitAllPages<Object> {
        private List<DynamicLoaderFactory> IAuthTabCallback = new ArrayList();
        private static final byte[] $$a = {66, -42, -1, 80};
        private static final int $$b = 192;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        private static long onTransact = 1282223855567294604L;
        private static int IAuthTabCallbackDefault = -1776194565;
        private static char asInterface = 27643;

        /* renamed from: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final /* synthetic */ class C0025onNavigationEvent {
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[CardRecommendCardImage.onNavigationEvent.values().length];
                try {
                    iArr[CardRecommendCardImage.onNavigationEvent.LOGO_FILL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CardRecommendCardImage.onNavigationEvent.HORIZONTAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onWarmupCompleted = iArr;
            }
        }

        private static String $$c(byte b, byte b2, byte b3) {
            int i = b2 + 4;
            int i2 = b3 * 3;
            byte[] bArr = $$a;
            int i3 = 110 - b;
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i3 = i2 + i;
                i = i;
                i4 = -1;
            }
            while (true) {
                int i5 = i + 1;
                int i6 = i4 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i2) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i5];
                i = i5;
                i4 = i6;
            }
        }

        public static /* synthetic */ Unit IAuthTabCallback(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, DynamicLoaderFactory dynamicLoaderFactory, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 83;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(creditCardIssueSelectFormFragment, dynamicLoaderFactory, setDetectableSize);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(creditCardIssueSelectFormFragment, dynamicLoaderFactory, setDetectableSize);
            int i3 = asBinder + 117;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, DynamicLoaderFactory dynamicLoaderFactory, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 105;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(creditCardIssueSelectFormFragment, dynamicLoaderFactory, setDetectableSize);
            int i4 = IAuthTabCallbackStub + 73;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~(i2 | i7);
            int i9 = i6 | i8;
            int i10 = ~i6;
            int i11 = i8 | (~(i7 | i10));
            int i12 = (~(i7 | i6)) | (~(i10 | i));
            int i13 = i + i6 + i4 + (513088896 * i3) + ((-1342203445) * i5);
            int i14 = i13 * i13;
            int i15 = (665020156 * i) + 661520384 + (1303681286 * i6) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i4) + ((-771751936) * i3) + (1382285312 * i5) + ((-350355456) * i14);
            int i16 = ((i * (-363642324)) - 614971735) + (i6 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i4 * (-363641803)) + (i3 * (-2127225984)) + (i5 * (-1080704249)) + (i14 * (-1523187712));
            int i17 = i15 + (i16 * i16 * (-227409920));
            if (i17 == 1) {
                return onWarmupCompleted(objArr);
            }
            if (i17 != 2) {
                return onExtraCallback(objArr);
            }
            Context context = (Context) objArr[0];
            int i18 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            LinearLayout linearLayout = new LinearLayout(context);
            int i19 = asBinder + 11;
            IAuthTabCallbackStub = i19 % 128;
            int i20 = i19 % 2;
            return linearLayout;
        }

        public static final class IAuthTabCallback implements Function1<Object, Boolean> {
            public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof String);
            }
        }

        public static final class onExtraCallback implements Function1<Object, Boolean> {
            public static final onExtraCallback onNavigationEvent = new onExtraCallback();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof DynamicLoaderFactory);
            }
        }

        public static final class onWarmupCompleted implements Function1<Object, Boolean> {
            public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof createNativeBannerAdViewApi);
            }
        }

        public onNavigationEvent() {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_row_v1);
            onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$ListAdapter$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return CreditCardIssueSelectFormFragment.onNavigationEvent.onExtraCallbackWithResult((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$ListAdapter$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CreditCardIssueSelectFormFragment.onNavigationEvent.onWarmupCompleted(this.f$0, (AppMsgReceiver2) obj, (DynamicLoaderFactory) obj2, (List) obj3);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                int i = asBinder + 125;
                IAuthTabCallbackStub = i % 128;
                if (i % 2 != 0) {
                    onextracallbackwithresult.onExtraCallback(onExtraCallback.onNavigationEvent);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                onextracallbackwithresult.onExtraCallback(onExtraCallback.onNavigationEvent);
                int i2 = 2 % 2;
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult2.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$ListAdapter$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2) {
                    int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                    int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                    return (View) CreditCardIssueSelectFormFragment.onNavigationEvent.onNavigationEvent(-742797659, iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{(Context) obj2}, OverseasRrnInputTextField.IAuthTabCallback(), 742797661);
                }
            });
            onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$ListAdapter$$ExternalSyntheticLambda5
                public final Object invoke(Object obj2, Object obj3) {
                    return CreditCardIssueSelectFormFragment.onNavigationEvent.onWarmupCompleted(creditCardIssueSelectFormFragment, (AppMsgReceiver2) obj2, (createNativeBannerAdViewApi) obj3);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
                onextracallbackwithresult2.onExtraCallback(onWarmupCompleted.IAuthTabCallback);
                int i3 = IAuthTabCallbackStub + 101;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            }
            onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult3.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$ListAdapter$$ExternalSyntheticLambda6
                public final Object invoke(Object obj2) {
                    return CreditCardIssueSelectFormFragment.onNavigationEvent.IAuthTabCallback(creditCardIssueSelectFormFragment, (Context) obj2);
                }
            });
            onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$ListAdapter$$ExternalSyntheticLambda7
                public final Object invoke(Object obj2, Object obj3) {
                    return CreditCardIssueSelectFormFragment.onNavigationEvent.onWarmupCompleted((AppMsgReceiver2) obj2, (String) obj3);
                }
            });
            if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
                onextracallbackwithresult3.onExtraCallback(IAuthTabCallback.IAuthTabCallback);
                int i6 = 2 % 2;
            }
            onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallbackWithResult());
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            List<DynamicLoaderFactory> list = (List) objArr[1];
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 17;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                onnavigationevent.IAuthTabCallback = list;
                int i3 = 93 / 0;
            } else {
                Intrinsics.checkNotNullParameter(list, "");
                onnavigationevent.IAuthTabCallback = list;
            }
            int i4 = asBinder + 17;
            IAuthTabCallbackStub = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public final List<DynamicLoaderFactory> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 109;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            List<DynamicLoaderFactory> list = this.IAuthTabCallback;
            int i5 = i3 + 25;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
            int i = 2 % 2;
            int i2 = asBinder + 99;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                Float.valueOf(16.0f);
                Intrinsics.checkNotNullParameter(viewHolder, "");
                TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
                Intrinsics.checkNotNull(tdsListRowV1View, "");
                TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
                tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
                tdsListRowV1View2.prefetchWithMultipleUrls();
                throw null;
            }
            Float fValueOf = Float.valueOf(16.0f);
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsListRowV1View tdsListRowV1View3 = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View3, "");
            TdsListRowV1View tdsListRowV1View4 = tdsListRowV1View3;
            tdsListRowV1View4.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View4.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setType(TdsCheckBoxV2View.onNavigationEvent.LINE);
                int i3 = asBinder + 23;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = tdsListRowV1View4.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
                int i5 = IAuthTabCallbackStub + 93;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setClickable(true);
                } else {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setClickable(false);
                }
            }
            DisplayMetrics displayMetrics = tdsListRowV1View4.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            tdsListRowV1View4.setPaddingTop(varyMatches.onNavigationEvent(fValueOf, displayMetrics));
            DisplayMetrics displayMetrics2 = tdsListRowV1View4.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            tdsListRowV1View4.setPaddingBottom(varyMatches.onNavigationEvent(fValueOf, displayMetrics2));
            return Unit.INSTANCE;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            char c2 = 2;
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
                int i3 = $11 + 19;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 43;
                        int iGreen = Color.green(0) + 1451;
                        byte b = $$a[c2];
                        byte b2 = (byte) (b + 1);
                        byte b3 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, iIndexOf, iGreen, 228868077, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122);
                        int absoluteGravity = 44 - Gravity.getAbsoluteGravity(0, 0);
                        int mirror = 1542 - AndroidCharacter.getMirror('0');
                        byte b4 = $$a[2];
                        byte b5 = (byte) (-b4);
                        byte b6 = b4;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, absoluteGravity, mirror, 1533236389, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf("", "", 0) + 50, 22939 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45849), Color.green(0) + 29, 12576 - ExpandableListView.getPackedPositionChild(0L), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    c2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            objArr[0] = str;
        }

        public static void IAuthTabCallback(onNavigationEvent onnavigationevent, DynamicLoaderFactory dynamicLoaderFactory, View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 71;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onnavigationevent.IAuthTabCallback(dynamicLoaderFactory);
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
        }

        public static Unit onWarmupCompleted(final onNavigationEvent onnavigationevent, AppMsgReceiver2 appMsgReceiver2, final DynamicLoaderFactory dynamicLoaderFactory, List list) {
            response responseVar;
            SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnWarmupCompleted;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(dynamicLoaderFactory, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                CardRecommendCardImage cardRecommendCardImageOnExtraCallback = dynamicLoaderFactory.onExtraCallback();
                if (cardRecommendCardImageOnExtraCallback != null) {
                    tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                    int i2 = C0025onNavigationEvent.onWarmupCompleted[cardRecommendCardImageOnExtraCallback.onExtraCallbackWithResult().ordinal()];
                    if (i2 != 1) {
                        int i3 = IAuthTabCallbackStub + 1;
                        int i4 = i3 % 128;
                        asBinder = i4;
                        int i5 = i3 % 2;
                        if (i2 != 2) {
                            int i6 = i4 + 67;
                            IAuthTabCallbackStub = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 12 / 0;
                            }
                            singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnWarmupCompleted = null;
                        } else {
                            singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnWarmupCompleted = new Cookies_removeSessionCookies(tdsListRowV1View2 + "$1", true);
                        }
                    } else {
                        Context context = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnWarmupCompleted = Protocol.onWarmupCompleted(new setRouteDatabaseokhttp(context, 0.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 90, (DefaultConstructorMarker) null));
                    }
                    tdsListRowV1View2.setLeftImageTransformation(singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1OnWarmupCompleted);
                    tdsListRowV1View2.setLeftImage(cardRecommendCardImageOnExtraCallback.onNavigationEvent());
                }
                if (dynamicLoaderFactory.onWarmupCompleted() == null) {
                    tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
                    tdsListRowV1View2.setCenterText1(dynamicLoaderFactory.asInterface());
                } else {
                    tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
                    tdsListRowV1View2.setCenterText1(dynamicLoaderFactory.asInterface());
                    tdsListRowV1View2.setCenterText2MaxLines(3);
                    tdsListRowV1View2.setCenterText2(dynamicLoaderFactory.onWarmupCompleted());
                }
                BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View2.ICustomTabsCallbackDefault();
                if (baseTextViewICustomTabsCallbackDefault != null) {
                    if (dynamicLoaderFactory.onNavigationEvent() == DynamicLoaderFactory.onExtraCallback.BOLD) {
                        int i8 = IAuthTabCallbackStub + 57;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
                        responseVar = response.Bold;
                    } else {
                        responseVar = response.Medium;
                    }
                    baseTextViewICustomTabsCallbackDefault.onNavigationEvent(responseVar);
                }
                tdsListRowV1View2.setCenterText1(dynamicLoaderFactory.asInterface());
                tdsListRowV1View2.setCenterText2(dynamicLoaderFactory.onWarmupCompleted());
                tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$ListAdapter$$ExternalSyntheticLambda8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CreditCardIssueSelectFormFragment.onNavigationEvent.IAuthTabCallback(this.f$0, dynamicLoaderFactory, view);
                    }
                });
            }
            tdsListRowV1View2.setRightCheckBoxChecked(onnavigationevent.onExtraCallback(dynamicLoaderFactory));
            Unit unit = Unit.INSTANCE;
            int i10 = asBinder + 17;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }

        public static Unit onWarmupCompleted(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, AppMsgReceiver2 appMsgReceiver2, createNativeBannerAdViewApi createnativebanneradviewapi) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 1;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(createnativebanneradviewapi, "");
            View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(view, "");
            LinearLayout linearLayout = (LinearLayout) view;
            linearLayout.removeAllViews();
            Context context = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            linearLayout.addView(getSubjectPublicKeyInfo.onWarmupCompleted(createnativebanneradviewapi, context, RippleNode.onNavigationEvent(creditCardIssueSelectFormFragment), creditCardIssueSelectFormFragment.extraCallback(), creditCardIssueSelectFormFragment.writeTypedObject()));
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallbackStub + 103;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public static View IAuthTabCallback(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Typography7 typography7 = new Typography7(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            DisplayMetrics displayMetrics = typography7.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
            DisplayMetrics displayMetrics2 = typography7.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics2);
            DisplayMetrics displayMetrics3 = typography7.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            typography7.setPadding(iOnNavigationEvent, typography7.getPaddingTop(), iOnNavigationEvent2, varyMatches.onNavigationEvent(40, displayMetrics3));
            typography7.setTextColor(setBodyokhttp.onExtraCallback(creditCardIssueSelectFormFragment).ICustomTabsCallbackStubProxy());
            int i2 = IAuthTabCallbackStub + 51;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
            }
            return typography7;
        }

        public static Unit onWarmupCompleted(AppMsgReceiver2 appMsgReceiver2, String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 107;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Typography7 typography7 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(typography7, "");
            typography7.setText(str);
            Unit unit = Unit.INSTANCE;
            int i4 = asBinder + 87;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private final boolean onExtraCallback(DynamicLoaderFactory dynamicLoaderFactory) {
            int i = 2 % 2;
            List<DynamicLoaderFactory> list = this.IAuthTabCallback;
            if (list instanceof Collection) {
                int i2 = asBinder + 85;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                if (list.isEmpty()) {
                    return false;
                }
            }
            Iterator<T> it = list.iterator();
            int i4 = IAuthTabCallbackStub + 83;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            while (!(!it.hasNext())) {
                if (Intrinsics.areEqual(((DynamicLoaderFactory) it.next()).asBinder(), dynamicLoaderFactory.asBinder())) {
                    int i6 = IAuthTabCallbackStub + 79;
                    int i7 = i6 % 128;
                    asBinder = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 67;
                    IAuthTabCallbackStub = i9 % 128;
                    if (i9 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
            int i10 = IAuthTabCallbackStub + 33;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        private static final Unit onWarmupCompleted(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, DynamicLoaderFactory dynamicLoaderFactory, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = asBinder + 73;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("card_id", creditCardIssueSelectFormFragment.extraCallback().IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("funnel_id", creditCardIssueSelectFormFragment.extraCallback().getInterfaceDescriptor());
            setDetectableSize.onExtraCallback("session_id", creditCardIssueSelectFormFragment.extraCallback().ICustomTabsCallbackStubProxy());
            setDetectableSize.onExtraCallback("screen_type", ((getAlgorithmId) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{creditCardIssueSelectFormFragment.writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallback());
            Object[] objArr = new Object[1];
            a((char) (25389 - View.MeasureSpec.getSize(0)), Color.argb(0, 0, 0, 0) - 1490443320, new char[]{29063, 9096, 47830, 22272, 11961}, new char[]{47991, 4031, 21499, 32241}, new char[]{51385, 10659, 11687, 19299}, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), dynamicLoaderFactory.asInterface());
            Unit unit = Unit.INSTANCE;
            int i4 = asBinder + 27;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static final Unit onExtraCallback(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, DynamicLoaderFactory dynamicLoaderFactory, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 67;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("card_id", creditCardIssueSelectFormFragment.extraCallback().IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("funnel_id", creditCardIssueSelectFormFragment.extraCallback().getInterfaceDescriptor());
            setDetectableSize.onExtraCallback("session_id", creditCardIssueSelectFormFragment.extraCallback().ICustomTabsCallbackStubProxy());
            setDetectableSize.onExtraCallback("screen_type", ((getAlgorithmId) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{creditCardIssueSelectFormFragment.writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallback());
            Object[] objArr = new Object[1];
            a((char) (25389 - TextUtils.indexOf("", "", 0)), (-1490443320) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{29063, 9096, 47830, 22272, 11961}, new char[]{47991, 4031, 21499, 32241}, new char[]{51385, 10659, 11687, 19299}, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), dynamicLoaderFactory.asInterface());
            Unit unit = Unit.INSTANCE;
            int i4 = asBinder + 23;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x023c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void IAuthTabCallback(@org.jetbrains.annotations.NotNull final o.DynamicLoaderFactory r20) {
            /*
                Method dump skipped, instructions count: 884
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment.onNavigationEvent.IAuthTabCallback(o.DynamicLoaderFactory):void");
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[0];
            DynamicLoaderFactory dynamicLoaderFactory = (DynamicLoaderFactory) objArr[1];
            int i = 2 % 2;
            int i2 = asBinder + 21;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dynamicLoaderFactory, "");
                return Integer.valueOf(((List) ((ExoPlayerImplExternalSyntheticLambda31) onnavigationevent).onWarmupCompleted).indexOf(dynamicLoaderFactory));
            }
            Intrinsics.checkNotNullParameter(dynamicLoaderFactory, "");
            ((List) ((ExoPlayerImplExternalSyntheticLambda31) onnavigationevent).onWarmupCompleted).indexOf(dynamicLoaderFactory);
            throw null;
        }

        public static View onExtraCallbackWithResult(Context context) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            return (View) onNavigationEvent(-742797659, iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{context}, OverseasRrnInputTextField.IAuthTabCallback(), 742797661);
        }

        public final int onExtraCallbackWithResult(@NotNull DynamicLoaderFactory dynamicLoaderFactory) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            return ((Integer) onNavigationEvent(178512865, iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, dynamicLoaderFactory}, OverseasRrnInputTextField.IAuthTabCallback(), -178512864)).intValue();
        }

        public final void IAuthTabCallback(@NotNull List<DynamicLoaderFactory> list) {
            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
            onNavigationEvent(200618549, iIAuthTabCallback, OverseasRrnInputTextField.IAuthTabCallback(), iIAuthTabCallback2, new Object[]{this, list}, OverseasRrnInputTextField.IAuthTabCallback(), -200618549);
        }
    }

    public CreditCardIssueSelectFormFragment() {
        super(R.layout.fragment_credit_card_issue_select_form);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallback);
        this.onWarmupCompleted = new onNavigationEvent();
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, getX509Certificate> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, getX509Certificate.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentCreditCardIssueSelectFormBinding;", 0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final getX509Certificate invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return getX509Certificate.onNavigationEvent(view);
        }
    }

    private final getX509Certificate onExtraCallback() {
        return (getX509Certificate) this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallback[0]);
    }

    private final TdsTopV1View IAuthTabCallback() {
        TdsTopV1View tdsTopV1View = onExtraCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
        return tdsTopV1View;
    }

    private final TdsBottomCtaV1View onExtraCallbackWithResult() {
        TdsBottomCtaV1View tdsBottomCtaV1View = onExtraCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        return tdsBottomCtaV1View;
    }

    private final RecyclerView onWarmupCompleted() {
        RecyclerView recyclerView = onExtraCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Object mutableList;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final getAlgorithmId getalgorithmid = (getAlgorithmId) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        IAuthTabCallback().setUpperText(getalgorithmid.access000());
        if (getalgorithmid.asInterface() != null) {
            IAuthTabCallback().setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
            IAuthTabCallback().setLowerText(getalgorithmid.asInterface());
        }
        TdsBottomCtaV1View.setCta$default(onExtraCallbackWithResult(), getalgorithmid.onExtraCallbackWithResult().onExtraCallback().onNavigationEvent(), new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreditCardIssueSelectFormFragment.onWarmupCompleted(this.f$0, getalgorithmid, view2);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        final DynamicLoader dynamicLoaderOnNavigationEvent = getalgorithmid.onExtraCallbackWithResult().onNavigationEvent();
        if (dynamicLoaderOnNavigationEvent != null) {
            TdsBottomCtaV1View.setSecondary$default(onExtraCallbackWithResult(), dynamicLoaderOnNavigationEvent.onNavigationEvent(), new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CreditCardIssueSelectFormFragment.onExtraCallbackWithResult(this.f$0, dynamicLoaderOnNavigationEvent, view2);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        }
        String strOnWarmupCompleted = getalgorithmid.onExtraCallbackWithResult().onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            onExtraCallbackWithResult().setTopDescription(strOnWarmupCompleted);
        }
        onNavigationEvent onnavigationevent = this.onWarmupCompleted;
        List<DynamicLoaderFactory> listExtraCallbackWithResult = getalgorithmid.extraCallbackWithResult();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listExtraCallbackWithResult.iterator();
        while (true) {
            mutableList = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            DynamicLoaderFactory dynamicLoaderFactory = (DynamicLoaderFactory) next;
            List<String> listOnWarmupCompleted = getalgorithmid.onWarmupCompleted();
            if (listOnWarmupCompleted != null) {
                Iterator<T> it2 = listOnWarmupCompleted.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.areEqual((String) next2, dynamicLoaderFactory.asBinder())) {
                        mutableList = next2;
                        break;
                    }
                }
                mutableList = (String) mutableList;
            }
            if (mutableList != null) {
                arrayList.add(next);
            }
        }
        Object mutableList2 = CollectionsKt.toMutableList(arrayList);
        if (extraCallback().access000().containsKey(getalgorithmid.onExtraCallback())) {
            RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 = extraCallback().access000().get(getalgorithmid.onExtraCallback());
            MultithreadedBundleWrapper multithreadedBundleWrapper = rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 instanceof MultithreadedBundleWrapper ? (MultithreadedBundleWrapper) rCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 : null;
            List<String> listIAuthTabCallback = multithreadedBundleWrapper != null ? multithreadedBundleWrapper.IAuthTabCallback() : null;
            List<String> list = listIAuthTabCallback;
            if (list != null && !list.isEmpty()) {
                List<DynamicLoaderFactory> listExtraCallbackWithResult2 = getalgorithmid.extraCallbackWithResult();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listExtraCallbackWithResult2) {
                    if (listIAuthTabCallback.contains(((DynamicLoaderFactory) obj).asBinder())) {
                        arrayList2.add(obj);
                    }
                }
                mutableList = CollectionsKt.toMutableList(arrayList2);
            }
        }
        if (mutableList != null) {
            mutableList2 = mutableList;
        }
        onNavigationEvent.onNavigationEvent(200618549, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{onnavigationevent, mutableList2}, OverseasRrnInputTextField.IAuthTabCallback(), -200618549);
        ArrayList arrayList3 = new ArrayList();
        if (getalgorithmid.IAuthTabCallbackStub() != null) {
            arrayList3.add(getalgorithmid.IAuthTabCallbackStub());
        }
        arrayList3.addAll(getalgorithmid.extraCallbackWithResult());
        if (getalgorithmid.extraCallback() != null) {
            arrayList3.add(getalgorithmid.extraCallback());
        }
        if (getalgorithmid.onTransact() != null) {
            arrayList3.add(getalgorithmid.onTransact());
        }
        onnavigationevent.onNavigationEvent(arrayList3);
        onWarmupCompleted().setAdapter(onnavigationevent);
        onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, getAlgorithmId getalgorithmid, View view) {
        List<DynamicLoaderFactory> listOnNavigationEvent = creditCardIssueSelectFormFragment.onWarmupCompleted.onNavigationEvent();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            createAdSizeApi createadsizeapiIAuthTabCallback = ((DynamicLoaderFactory) it.next()).IAuthTabCallback();
            if (createadsizeapiIAuthTabCallback != null) {
                arrayList.add(createadsizeapiIAuthTabCallback);
            }
        }
        getDigestAlgorithms<getAlgorithmId> getdigestalgorithmsWriteTypedObject = creditCardIssueSelectFormFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueSelectFormFragment);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueSelectFormFragment.extraCallback();
        List<DynamicLoaderFactory> listOnNavigationEvent2 = creditCardIssueSelectFormFragment.onWarmupCompleted.onNavigationEvent();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent2, 10));
        Iterator<T> it2 = listOnNavigationEvent2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DynamicLoaderFactory) it2.next()).asBinder());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper = new MultithreadedBundleWrapper(arrayList2);
        String strOnNavigationEvent = getalgorithmid.onExtraCallbackWithResult().onExtraCallback().onNavigationEvent();
        createAdSizeApi createadsizeapiOnWarmupCompleted = getalgorithmid.onExtraCallbackWithResult().onExtraCallback().onWarmupCompleted();
        getdigestalgorithmsWriteTypedObject.IAuthTabCallback(typographyKtExternalSyntheticLambda0OnNavigationEvent, arrayList, cardIssueOverviewViewModelExtraCallback, multithreadedBundleWrapper, strOnNavigationEvent, createadsizeapiOnWarmupCompleted != null ? createadsizeapiOnWarmupCompleted.IAuthTabCallback() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(CreditCardIssueSelectFormFragment creditCardIssueSelectFormFragment, DynamicLoader dynamicLoader, View view) {
        List<DynamicLoaderFactory> listOnNavigationEvent = creditCardIssueSelectFormFragment.onWarmupCompleted.onNavigationEvent();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            createAdSizeApi createadsizeapiIAuthTabCallback = ((DynamicLoaderFactory) it.next()).IAuthTabCallback();
            if (createadsizeapiIAuthTabCallback != null) {
                arrayList.add(createadsizeapiIAuthTabCallback);
            }
        }
        getDigestAlgorithms<getAlgorithmId> getdigestalgorithmsWriteTypedObject = creditCardIssueSelectFormFragment.writeTypedObject();
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(creditCardIssueSelectFormFragment);
        CardIssueOverviewViewModel cardIssueOverviewViewModelExtraCallback = creditCardIssueSelectFormFragment.extraCallback();
        List<DynamicLoaderFactory> listOnNavigationEvent2 = creditCardIssueSelectFormFragment.onWarmupCompleted.onNavigationEvent();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent2, 10));
        Iterator<T> it2 = listOnNavigationEvent2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DynamicLoaderFactory) it2.next()).asBinder());
        }
        MultithreadedBundleWrapper multithreadedBundleWrapper = new MultithreadedBundleWrapper(arrayList2);
        String strOnNavigationEvent = dynamicLoader.onNavigationEvent();
        createAdSizeApi createadsizeapiOnWarmupCompleted = dynamicLoader.onWarmupCompleted();
        getdigestalgorithmsWriteTypedObject.IAuthTabCallback(typographyKtExternalSyntheticLambda0OnNavigationEvent, arrayList, cardIssueOverviewViewModelExtraCallback, multithreadedBundleWrapper, strOnNavigationEvent, createadsizeapiOnWarmupCompleted != null ? createadsizeapiOnWarmupCompleted.IAuthTabCallback() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNavigationEvent() {
        /*
            r17 = this;
            r0 = r17
            im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View r1 = r17.onExtraCallbackWithResult()
            o.getDigestAlgorithms r2 = r17.writeTypedObject()
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            int r8 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            int r9 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            int r5 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            int r7 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            r13 = -1377327352(0xffffffffade7a708, float:-2.6335836E-11)
            r10 = 1377327355(0x521858fb, float:1.6358197E11)
            r3 = r10
            r6 = r13
            java.lang.Object r2 = o.getDigestAlgorithms.IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
            o.getEncryptedData r2 = (o.getEncryptedData) r2
            o.getAlgorithmId r2 = (o.getAlgorithmId) r2
            int r2 = r2.writeTypedObject()
            viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$onNavigationEvent r3 = r0.onWarmupCompleted
            java.util.List r3 = r3.onNavigationEvent()
            int r3 = r3.size()
            if (r2 > r3) goto L70
            viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment$onNavigationEvent r2 = r0.onWarmupCompleted
            java.util.List r2 = r2.onNavigationEvent()
            int r2 = r2.size()
            o.getDigestAlgorithms r3 = r17.writeTypedObject()
            java.lang.Object[] r11 = new java.lang.Object[]{r3}
            int r15 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            int r16 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            int r12 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            int r14 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
            java.lang.Object r3 = o.getDigestAlgorithms.IAuthTabCallback(r10, r11, r12, r13, r14, r15, r16)
            o.getEncryptedData r3 = (o.getEncryptedData) r3
            o.getAlgorithmId r3 = (o.getAlgorithmId) r3
            int r3 = r3.ICustomTabsCallback()
            if (r2 > r3) goto L70
            r2 = 1
            goto L71
        L70:
            r2 = 0
        L71:
            r1.setEnabledCta(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CreditCardIssueSelectFormFragment.onNavigationEvent():void");
    }
}
