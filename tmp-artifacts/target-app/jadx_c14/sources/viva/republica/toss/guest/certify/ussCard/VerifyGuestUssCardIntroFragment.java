package viva.republica.toss.guest.certify.ussCard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda8;
import o.ConvertByteArrayToFloatArray;
import o.N_;
import o.PageContext;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.RecomposerrecompositionRunner2;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access8100;
import o.addAllCommandLine;
import o.getWrite;
import o.onAdViewAdDisplayFailed;
import o.preFillDefault;
import o.verifyEnvelopeVID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VerifyGuestUssCardIntroFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static long IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult;
    private static int onTransact;
    private onExtraCallback onExtraCallback;
    private final Lazy onNavigationEvent;
    private final PageContext onWarmupCompleted;

    public interface onExtraCallback {
        void IEngagementSignalsCallbackStub();

        void IEngagementSignalsCallbackStubProxy();
    }

    static {
        onWarmupCompleted();
        onExtraCallbackWithResult = new addAllCommandLine[]{new PropertyReference1Impl<>(VerifyGuestUssCardIntroFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUssCardAuthIntroBinding;", 0)};
        Companion = new onNavigationEvent(null);
        IAuthTabCallback = 8;
        int i = asBinder + 15;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(verifyGuestUssCardIntroFragment, view);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(verifyGuestUssCardIntroFragment, view);
        int i3 = onTransact + 71;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~((~i5) | i8 | i);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i);
        int i13 = (~(i5 | i7)) | (~(i7 | i3)) | i10;
        int i14 = i + i3 + i6 + (1787548100 * i4) + (1101416392 * i2);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i) - 623378432) + (561581232 * i3) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i6) + ((-778043392) * i4) + ((-46137344) * i2) + (324403200 * i15);
        int i17 = (i * (-930662234)) + 656878810 + (i3 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i6 * (-930661477)) + (i4 * 2052861356) + (i2 * 749768216) + (i15 * (-2028863488));
        return i16 + ((i17 * i17) * (-1850081280)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(-1792044216, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1792044216, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult5, new Object[]{verifyGuestUssCardIntroFragment, view});
        int i3 = asInterface + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(verifyGuestUssCardIntroFragment, setDetectableSize);
        int i4 = asInterface + 33;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(verifyGuestUssCardIntroFragment, setDetectableSize);
        }
        onWarmupCompleted(verifyGuestUssCardIntroFragment, setDetectableSize);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment = (VerifyGuestUssCardIntroFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(verifyGuestUssCardIntroFragment);
            throw null;
        }
        long jOnExtraCallback = onExtraCallback(verifyGuestUssCardIntroFragment);
        int i3 = asInterface + 115;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return Long.valueOf(jOnExtraCallback);
        }
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 19;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 125;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return 1265511L;
    }

    public VerifyGuestUssCardIntroFragment() {
        super(R.layout.fragment_uss_card_auth_intro);
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.onWarmupCompleted);
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment$$ExternalSyntheticLambda0
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                return Long.valueOf(((Long) VerifyGuestUssCardIntroFragment.onExtraCallback(-1143269847, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1143269848, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, objArr)).longValue());
            }
        });
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{43697, 43717, 5976, 59666, 5699, 60290, 60771, 59737, 44828}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), getString(R.string.teens_uss_card_auth_intro_title));
        Object[] objArr2 = new Object[1];
        a(new char[]{38363, 38332, 58756, 9462, 58499, 9847, 58601, 57548, 36967, 58081, 11305, 60087, 40504, 59637, 10987, 61253, 34029, 63249, 12451, 62726}, KeyEvent.getMaxKeyCode() >> 16, objArr2);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), Long.valueOf(onExtraCallbackWithResult()))});
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, verifyEnvelopeVID> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1, verifyEnvelopeVID.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUssCardAuthIntroBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final verifyEnvelopeVID invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return verifyEnvelopeVID.onExtraCallbackWithResult(view);
        }
    }

    private final verifyEnvelopeVID onNavigationEvent() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = asInterface + 1;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            pageContext = this.onWarmupCompleted;
            addallcommandline = onExtraCallbackWithResult[0];
        } else {
            pageContext = this.onWarmupCompleted;
            addallcommandline = onExtraCallbackWithResult[0];
        }
        verifyEnvelopeVID verifyenvelopevid = (verifyEnvelopeVID) pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = asInterface + 49;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return verifyenvelopevid;
    }

    private final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.onNavigationEvent.getValue()).longValue();
        int i4 = asInterface + 29;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return jLongValue;
        }
        throw null;
    }

    private static final long onExtraCallback(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            verifyGuestUssCardIntroFragment.getArguments();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Bundle arguments = verifyGuestUssCardIntroFragment.getArguments();
        if (arguments == null) {
            return -1L;
        }
        int i3 = asInterface + 77;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{38152, 38221, 56572, 27280, 56790, 26656, 7038, 8058, 36993, 56217, 25211, 5425, 40669, 53677, 25776, 4291, 33795, 52851, 32511, 2695, 33377, 50209, 28890, 1107, 35241, 49890}, Drawable.resolveOpacity(0, 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{38152, 38221, 56572, 27280, 56790, 26656, 7038, 8058, 36993, 56217, 25211, 5425, 40669, 53677, 25776, 4291, 33795, 52851, 32511, 2695, 33377, 50209, 28890, 1107, 35241, 49890}, Drawable.resolveOpacity(0, 0), objArr2);
            obj = objArr2[0];
        }
        return arguments.getLong(((String) obj).intern());
    }

    private static final Unit onWarmupCompleted(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{23974, 24004, 19784, 1179, 19535, 1547, 37838, 38892, 22529, 18972, 3176, 40326, 22111, 16446, 2691, 39023}, 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyGuestUssCardIntroFragment.getString(R.string.yes_ne));
        Object[] objArr2 = new Object[1];
        a(new char[]{38363, 38332, 58756, 9462, 58499, 9847, 58601, 57548, 36967, 58081, 11305, 60087, 40504, 59637, 10987, 61253, 34029, 63249, 12451, 62726}, ViewConfiguration.getScrollBarSize() >> 8, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), Long.valueOf(verifyGuestUssCardIntroFragment.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 13;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(final VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1265513L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardIntroFragment.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        onExtraCallback onextracallback = verifyGuestUssCardIntroFragment.onExtraCallback;
        if (onextracallback == null) {
            int i2 = asInterface + 91;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = asInterface + 35;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            onextracallback = null;
        }
        onextracallback.IEngagementSignalsCallbackStub();
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        TdsImageView tdsImageView = onNavigationEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(tdsImageView.getContext());
        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(tdsImageView.getContext());
        Object[] objArr = new Object[1];
        a(new char[]{49166, 49254, 49377, 6586, 49639, 6954, 15080, 16078, 50613, 51169, 4409, 13567, 52205, 52631, 6063, 12636, 53567, 53832, 3496, 11028, 55105, 55296, 973, 9622, 56463, 57046, 1625, 8131, 58074, 58604, 15451, 6587, 59397, 59752, 12935, 4722, 60970, 61310, 10477, 3124, 62575, 62975, 12083, 1725, 63922, 64460, 9569, 152, 65467, 33245, 23542, 32013, 34140, 34334, 20895, 30472, 35656, 35868, 22424, 29120, 37008, 37604}, Color.alpha(0), objArr);
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = Recomposerjoin2.onExtraCallback(onnavigationevent.onExtraCallback(((String) objArr[0]).intern()), tdsImageView);
        RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, true);
        N_.onExtraCallback(onnavigationeventOnExtraCallback, 0);
        carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallbackWithResult());
        TdsBottomCtaV1View tdsBottomCtaV1View = onNavigationEvent().onNavigationEvent;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string = getString(R.string.yes_ne);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardIntroFragment.IAuthTabCallback(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String string2 = getString(im.toss.uikit.R.string.uikit_no);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, string2, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardIntroFragment.onExtraCallbackWithResult(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, 4, (Object) null);
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackStub ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 69;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i5 = $10 + 1;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 84 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Gravity.getAbsoluteGravity(0, 0) + 19, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i8 = $11 + 71;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{23974, 24004, 19784, 1179, 19535, 1547, 37838, 38892, 22529, 18972, 3176, 40326, 22111, 16446, 2691, 39023}, (-1) - Process.getGidForName(""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyGuestUssCardIntroFragment.getString(im.toss.uikit.R.string.uikit_no));
        Object[] objArr2 = new Object[1];
        a(new char[]{38363, 38332, 58756, 9462, 58499, 9847, 58601, 57548, 36967, 58081, 11305, 60087, 40504, 59637, 10987, 61253, 34029, 63249, 12451, 62726}, Color.blue(0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), Long.valueOf(verifyGuestUssCardIntroFragment.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 13;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment = (VerifyGuestUssCardIntroFragment) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        ConvertByteArrayToFloatArray.onExtraCallback(1265513L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardIntroFragment.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        onExtraCallback onextracallback = verifyGuestUssCardIntroFragment.onExtraCallback;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = asInterface + 75;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = null;
        }
        onextracallback.IEngagementSignalsCallbackStubProxy();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 75;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        private static final byte[] $$a = {51, -39, 98, -44};
        private static final int $$b = 133;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private static char[] IAuthTabCallback = {16305, 4865, 26362, 47521, 36097, 57546, 13245, 1818, 23257, 44466, 33122, 54468, 10171, 31608, 20177, 41348, 62829, 51398, 7056, 28540, 16953, 38273};
        private static long onExtraCallbackWithResult = -6924796015286173319L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, int r7, short r8) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 4
                int r7 = r7 * 2
                int r7 = r7 + 1
                int r8 = r8 * 3
                int r8 = r8 + 97
                byte[] r0 = viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment.onNavigationEvent.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r6
                r4 = r7
                r3 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L28:
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2d:
                int r6 = r6 + 1
                int r4 = -r4
                int r8 = r8 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment.onNavigationEvent.$$c(int, int, short):java.lang.String");
        }

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final VerifyGuestUssCardIntroFragment onNavigationEvent(long j) throws Throwable {
            int i = 2 % 2;
            VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment = new VerifyGuestUssCardIntroFragment();
            Bundle bundle = new Bundle();
            Object[] objArr = new Object[1];
            a(Process.myPid() >> 22, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 53792), objArr);
            bundle.putLong(((String) objArr[0]).intern(), j);
            verifyGuestUssCardIntroFragment.setArguments(bundle);
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
            return verifyGuestUssCardIntroFragment;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 33;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i / i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.getSize(0)), 17 - View.combineMeasuredStates(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16823350), 31 - (ViewConfiguration.getTouchSlop() >> 8), 20221 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 49123), TextUtils.indexOf((CharSequence) "", '0') + 45, 1494 - View.MeasureSpec.makeMeasureSpec(0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.indexOf((CharSequence) "", '0', 0)), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 10972 - TextUtils.lastIndexOf("", '0', 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46134), (KeyEvent.getMaxKeyCode() >> 16) + 31, 20220 - ((Process.getThreadPriority(0) + 20) >> 6), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1493 - TextUtils.lastIndexOf("", '0', 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i9 = $11 + 11;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.blue(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, AndroidCharacter.getMirror('0') + 1446, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
            objArr[0] = new String(cArr);
        }
    }

    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z = !(context instanceof onExtraCallback);
        Object obj = context;
        if (z) {
            int i4 = asInterface + 23;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (!(getParentFragment() instanceof onExtraCallback)) {
                throw new IllegalStateException("Must implement callback from parent Activity or Fragment");
            }
            onExtraCallback parentFragment = getParentFragment();
            if (parentFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment.Callback");
            }
            obj = parentFragment;
        }
        this.onExtraCallback = (onExtraCallback) obj;
    }

    public static /* synthetic */ long onNavigationEvent(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(-1143269847, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1143269848, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{verifyGuestUssCardIntroFragment})).longValue();
    }

    private static final Unit onNavigationEvent(VerifyGuestUssCardIntroFragment verifyGuestUssCardIntroFragment, View view) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(-1792044216, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1792044216, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{verifyGuestUssCardIntroFragment, view});
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = 5782900206795127422L;
    }
}
