package viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzaq;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.SetDetectableSize;
import o.access15300;
import o.getAdService;
import o.getDispatcherokhttp;
import o.getPrivacyDestinationUri;
import o.getSpecialFeatureOptInStatus;
import o.getSupportedHighSpeedResolutionsFor;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.readType;
import o.setByteOrder;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueIdCardNotHaveDialogFragment extends Hilt_CardIssueIdCardNotHaveDialogFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;

    @Inject
    public readType ocrIntent;
    private static char[] onExtraCallbackWithResult = {64967, 64986, 64991, 64982};
    private static char onExtraCallback = 51243;
    private final Lazy onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOcrIntroV2ViewModel.class), new IAuthTabCallback(this), new onExtraCallback(null, this), new IAuthTabCallbackDefault(this));
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda7
        public final Object invoke() {
            return CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted(this.f$0);
        }
    });

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[onWarmupCompleted.values().length];
            try {
                iArr[onWarmupCompleted.MANUAL_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onWarmupCompleted.BLOCK_MANUAL_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -963066709, 963066712, C40Encoder.onExtraCallback(), new Object[]{cardIssueIdCardNotHaveDialogFragment, Integer.valueOf(i)}, C40Encoder.onExtraCallback());
        int i4 = IAuthTabCallbackDefault + 55;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, cardIssueIdCardNotHaveDialogFragment, view);
        int i4 = IAuthTabCallbackDefault + 85;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueIdCardNotHaveDialogFragment, setDetectableSize);
        int i4 = onTransact + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment = (CardIssueIdCardNotHaveDialogFragment) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, cardIssueIdCardNotHaveDialogFragment, view);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = onTransact + 41;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, int i, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(cardIssueIdCardNotHaveDialogFragment, i, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueIdCardNotHaveDialogFragment, i, setDetectableSize);
        int i4 = onTransact + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(function1, cardIssueIdCardNotHaveDialogFragment, view);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cardIssueIdCardNotHaveDialogFragment, dialogInterface);
        int i4 = IAuthTabCallbackDefault + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i3) | i4);
        int i11 = i9 | i10 | (~(i4 | i));
        int i12 = (~(i | i3)) | (~(i7 | i3));
        int i13 = i8 | i10;
        int i14 = i3 + i4 + i2 + (793188503 * i5) + (2090109681 * i6);
        int i15 = i14 * i14;
        int i16 = (837707615 * i3) + 1286602752 + ((-1676358574) * i4) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i2) + (1186463744 * i5) + (1166540800 * i6) + ((-1956446208) * i15);
        int i17 = ((i3 * 1389925299) - 652765764) + (i4 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i2 * 1389926445) + (i5 * (-1551828341)) + (i6 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(view);
        int i4 = IAuthTabCallbackDefault + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ onWarmupCompleted onWarmupCompleted(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompletedOnNavigationEvent = onNavigationEvent(cardIssueIdCardNotHaveDialogFragment);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 25;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return onwarmupcompletedOnNavigationEvent;
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private final CardIssueOcrIntroV2ViewModel onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOcrIntroV2ViewModel cardIssueOcrIntroV2ViewModel = (CardIssueOcrIntroV2ViewModel) this.onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackDefault + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return cardIssueOcrIntroV2ViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final onWarmupCompleted IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) this.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    private static final onWarmupCompleted onNavigationEvent(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (cardIssueIdCardNotHaveDialogFragment.onExtraCallbackWithResult().onExtraCallbackWithResult()) {
            int i4 = IAuthTabCallbackDefault + 37;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return onWarmupCompleted.MANUAL_INPUT;
        }
        return onWarmupCompleted.BLOCK_MANUAL_INPUT;
    }

    public void setupDialog(@NotNull Dialog dialog, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(dialog, "");
        super/*androidx.appcompat.app.AppCompatDialogFragment*/.setupDialog(dialog, i);
        dialog.setContentView(R.layout.card_ocr_bottom_sheet_dialog);
        onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1565911727, -1565911727, C40Encoder.onExtraCallback(), new Object[]{this, dialog}, C40Encoder.onExtraCallback());
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CardIssueIdCardNotHaveDialogFragment.onNavigationEvent(this.f$0, dialogInterface);
            }
        });
        int i3 = onTransact + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onExtraCallback(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385804L, false, (String) null, (Map) null, new CardIssueIdCardNotHaveDialogFragment$.ExternalSyntheticLambda5(cardIssueIdCardNotHaveDialogFragment), 14, (Object) null);
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, SetDetectableSize setDetectableSize) throws Throwable {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity;
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        Map<String, Object> mapOnWarmupCompleted = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            boolean z = cardIssueIdCardNotHaveDialogFragment.getActivity() instanceof CardIssueOcrIntroV2Activity;
            mapOnWarmupCompleted.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        CardIssueOcrIntroV2Activity activity = cardIssueIdCardNotHaveDialogFragment.getActivity();
        if (activity instanceof CardIssueOcrIntroV2Activity) {
            cardIssueOcrIntroV2Activity = activity;
            int i3 = IAuthTabCallbackDefault + 63;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        } else {
            cardIssueOcrIntroV2Activity = null;
        }
        if (cardIssueOcrIntroV2Activity != null) {
            int i5 = IAuthTabCallbackDefault + 57;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            mapOnWarmupCompleted = cardIssueOcrIntroV2Activity.onWarmupCompleted(cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackStub());
        }
        setDetectableSize.onExtraCallback(mapOnWarmupCompleted);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, int i, SetDetectableSize setDetectableSize) throws Throwable {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        CardIssueOcrIntroV2Activity activity = cardIssueIdCardNotHaveDialogFragment.getActivity();
        Map<String, Object> mapOnWarmupCompleted = null;
        if (activity instanceof CardIssueOcrIntroV2Activity) {
            cardIssueOcrIntroV2Activity = activity;
            int i3 = onTransact + 115;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            cardIssueOcrIntroV2Activity = null;
        }
        if (cardIssueOcrIntroV2Activity != null) {
            int i5 = IAuthTabCallbackDefault + 125;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            mapOnWarmupCompleted = cardIssueOcrIntroV2Activity.onWarmupCompleted(cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackStub());
        }
        setDetectableSize.onExtraCallback(mapOnWarmupCompleted);
        Object[] objArr = new Object[1];
        a(new char[]{1, 0, 2, 0, 13926}, (byte) (103 - Drawable.resolveOpacity(0, 0)), 6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), cardIssueIdCardNotHaveDialogFragment.requireContext().getString(i));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment = (CardIssueIdCardNotHaveDialogFragment) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385810L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return CardIssueIdCardNotHaveDialogFragment.onExtraCallbackWithResult(this.f$0, iIntValue, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(Function1 function1, CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        function1.invoke(Integer.valueOf(R.string.card_ocr_impl_id_card_not_have_secondary_title));
        cardIssueIdCardNotHaveDialogFragment.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        public static final onWarmupCompleted BLOCK_MANUAL_INPUT;
        private static char IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        public static final onWarmupCompleted MANUAL_INPUT;
        private static int asInterface = 1;
        private static char onExtraCallback;
        private static char onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static int onWarmupCompleted;

        public static final /* synthetic */ class onNavigationEvent {
            public static final /* synthetic */ int[] onExtraCallback;

            static {
                int[] iArr = new int[onWarmupCompleted.values().length];
                try {
                    iArr[onWarmupCompleted.MANUAL_INPUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onWarmupCompleted.BLOCK_MANUAL_INPUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallback = iArr;
            }
        }

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = MANUAL_INPUT;
            if (i3 != 0) {
                return new onWarmupCompleted[]{onwarmupcompleted, BLOCK_MANUAL_INPUT};
            }
            onWarmupCompleted onwarmupcompleted2 = BLOCK_MANUAL_INPUT;
            onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[5];
            onwarmupcompletedArr[0] = onwarmupcompleted;
            onwarmupcompletedArr[0] = onwarmupcompleted2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 61;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 65;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public static onWarmupCompleted[] values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
                int i3 = 54 / 0;
            } else {
                onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            }
            int i4 = onWarmupCompleted + 103;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i4 = 58224;
                int i5 = i3;
                while (i5 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                    int i7 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(IAuthTabCallback);
                        objArr2[2] = Integer.valueOf(i7);
                        objArr2[1] = Integer.valueOf(i6);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            int mirror = ':' - AndroidCharacter.getMirror('0');
                            int longPressTimeout = 12434 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), mirror, longPressTimeout, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5++;
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 16015), 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = $11 + 37;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i10 = $11 + 71;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onExtraCallback();
            MANUAL_INPUT = new onWarmupCompleted("MANUAL_INPUT", 0);
            BLOCK_MANUAL_INPUT = new onWarmupCompleted("BLOCK_MANUAL_INPUT", 1);
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallbackDefault + 59;
            asInterface = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final String getIdCardTypeName(Context context) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(context.getString(R.string.card_ocr_impl_ocr_identity_document_type_id_card), "");
                throw null;
            }
            String string = context.getString(R.string.card_ocr_impl_ocr_identity_document_type_id_card);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String lottieUrl() throws Throwable {
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 87;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0 ? (i = onNavigationEvent.onExtraCallback[ordinal()]) == 1 : (i = onNavigationEvent.onExtraCallback[ordinal()]) == 0) {
                int i4 = IAuthTabCallbackStub + 105;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return "";
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Object[] objArr = new Object[1];
            a(new char[]{37898, 29856, 3524, 25118, 51160, 43387, 56103, 44261, 32878, 29548, 27029, 28766, 2134, 58295, 5971, 37479, 59249, 566, 8436, 6437, 23618, 21225, 54690, 42555, 59146, 39610, 29899, 23391, 16231, 2431, 6801, 17242, 657, 41106, 23420, 3861, 40651, 53657, 54879, 44447, 48124, 35936, 3433, 15990, 2931, 5436, 32354, 20184, 59146, 39610, 24589, 34807, 39103, 48987, 3181, 63869}, 56 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            return ((String) objArr[0]).intern();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        
            r6 = r6.getString(viva.republica.toss.R.string.card_ocr_impl_id_card_not_have_title, getIdCardTypeName(r6));
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.onNavigationEvent.onExtraCallback[ordinal()] == 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            if (viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.onNavigationEvent.onExtraCallback[ordinal()] == 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        
            r6 = r6.getString(viva.republica.toss.R.string.card_ocr_impl_manual_input_bottom_sheet_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "");
            r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.onWarmupCompleted + 113;
            viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.IAuthTabCallbackStub = r1 % 128;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String title(@org.jetbrains.annotations.NotNull android.content.Context r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.onWarmupCompleted
                int r1 = r1 + 29
                int r2 = r1 % 128
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.IAuthTabCallbackStub = r2
                int r1 = r1 % r0
                r2 = 1
                java.lang.String r3 = ""
                if (r1 != 0) goto L1f
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
                int[] r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.onNavigationEvent.onExtraCallback
                int r4 = r5.ordinal()
                r1 = r1[r4]
                if (r1 != r2) goto L3f
                goto L2c
            L1f:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
                int[] r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.onNavigationEvent.onExtraCallback
                int r4 = r5.ordinal()
                r1 = r1[r4]
                if (r1 != r2) goto L3f
            L2c:
                int r1 = viva.republica.toss.R.string.card_ocr_impl_manual_input_bottom_sheet_title
                java.lang.String r6 = r6.getString(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
                int r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.onWarmupCompleted
                int r1 = r1 + 113
                int r2 = r1 % 128
                viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.IAuthTabCallbackStub = r2
                int r1 = r1 % r0
                return r6
            L3f:
                java.lang.String r0 = r5.getIdCardTypeName(r6)
                int r1 = viva.republica.toss.R.string.card_ocr_impl_id_card_not_have_title
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r6 = r6.getString(r1, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted.title(android.content.Context):java.lang.String");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final String description(@NotNull Context context) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            String idCardTypeName = getIdCardTypeName(context);
            int i4 = onNavigationEvent.onExtraCallback[ordinal()];
            if (i4 == 1) {
                String string = context.getString(R.string.card_ocr_impl_manual_input_bottom_sheet_description);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String string2 = context.getString(R.string.card_ocr_impl_id_card_not_have_description2, idCardTypeName);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int i5 = IAuthTabCallbackStub + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return string2;
            }
            throw null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int ctaTitleRes() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = onNavigationEvent.onExtraCallback[ordinal()];
            if (i4 == 1) {
                int i5 = R.string.card_ocr_impl_manual_input_bottom_sheet_cta;
                int i6 = IAuthTabCallbackStub + 33;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                throw null;
            }
            int i7 = onWarmupCompleted + 53;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0 ? i4 != 2 : i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = R.string.card_ocr_impl_id_card_not_have_cta_title2;
            int i9 = IAuthTabCallbackStub + 101;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return i8;
        }

        static void onExtraCallback() {
            onExtraCallback = (char) 7086;
            onExtraCallbackWithResult = (char) 16400;
            onNavigationEvent = (char) 8898;
            IAuthTabCallback = (char) 38887;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        final CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment = (CardIssueIdCardNotHaveDialogFragment) objArr[0];
        Dialog dialog = (Dialog) objArr[1];
        int i = 2 % 2;
        TdsTopV2View tdsTopV2ViewFindViewById = dialog.findViewById(R.id.header);
        if (tdsTopV2ViewFindViewById != null) {
            int i2 = IAuthTabCallbackDefault + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackDefault() != onWarmupCompleted.MANUAL_INPUT) {
                tdsTopV2ViewFindViewById.setUpperType(TdsTopV2View.onTransact.ASSET_V1);
                getDispatcherokhttp getdispatcherokhttpAccess100 = tdsTopV2ViewFindViewById.access100();
                if (getdispatcherokhttpAccess100 != null) {
                    int i4 = IAuthTabCallbackDefault + 17;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    getdispatcherokhttpAccess100.onExtraCallbackWithResult().IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onNavigationEvent());
                    getdispatcherokhttpAccess100.IAuthTabCallback(cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackDefault().lottieUrl());
                    getdispatcherokhttpAccess100.onExtraCallbackWithResult(1);
                    int iOnNavigationEvent = zzaq.onNavigationEvent();
                    ((getSupportedHighSpeedResolutionsFor) getDispatcherokhttp.IAuthTabCallback(-1880973595, new Object[]{getdispatcherokhttpAccess100}, zzaq.onNavigationEvent(), 1880973596, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent)).IAuthTabCallback(setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault()));
                }
            }
            tdsTopV2ViewFindViewById.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
            onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackDefault();
            Context context = tdsTopV2ViewFindViewById.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            tdsTopV2ViewFindViewById.setTitleText(onwarmupcompletedIAuthTabCallbackDefault.title(context));
            tdsTopV2ViewFindViewById.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
            Context context2 = tdsTopV2ViewFindViewById.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsTopV2ViewFindViewById.setTitleTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).onUnminimized());
            tdsTopV2ViewFindViewById.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault2 = cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackDefault();
            Context context3 = tdsTopV2ViewFindViewById.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            tdsTopV2ViewFindViewById.setSubtitle2Text(onwarmupcompletedIAuthTabCallbackDefault2.description(context3));
            tdsTopV2ViewFindViewById.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        }
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueIdCardNotHaveDialogFragment.IAuthTabCallback(this.f$0, ((Integer) obj).intValue());
            }
        };
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = dialog.findViewById(R.id.confirmButton);
        if (tdsBottomCtaV1ViewFindViewById != null) {
            int iCtaTitleRes = cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackDefault().ctaTitleRes();
            TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub = TdsButtonV1View.IAuthTabCallbackStub.PRIMARY;
            TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault = TdsButtonV1View.IAuthTabCallbackDefault.FILL;
            TdsButtonV1View.onWarmupCompleted onwarmupcompleted = TdsButtonV1View.onWarmupCompleted.XLARGE;
            TdsButtonV1View.IAuthTabCallback iAuthTabCallback = TdsButtonV1View.IAuthTabCallback.INLINE;
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewFindViewById, iCtaTitleRes, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted((View) obj);
                }
            }, new TdsButtonV1View.asInterface(iAuthTabCallbackStub, iAuthTabCallbackDefault, onwarmupcompleted, iAuthTabCallback), false, 8, (Object) null);
            tdsBottomCtaV1ViewFindViewById.setSecondary(R.string.card_ocr_impl_id_card_not_have_secondary_title, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return (Unit) CardIssueIdCardNotHaveDialogFragment.onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1640753951, 1640753952, C40Encoder.onExtraCallback(), new Object[]{function1, cardIssueIdCardNotHaveDialogFragment, (View) obj}, C40Encoder.onExtraCallback());
                }
            }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, onwarmupcompleted, iAuthTabCallback));
            TdsButtonV1View tdsButtonV1ViewAsInterface = tdsBottomCtaV1ViewFindViewById.asInterface();
            int i6 = onExtraCallbackWithResult.onNavigationEvent[cardIssueIdCardNotHaveDialogFragment.IAuthTabCallbackDefault().ordinal()];
            if (i6 != 1) {
                int i7 = IAuthTabCallbackDefault + 51;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                tdsButtonV1ViewAsInterface.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CardIssueIdCardNotHaveDialogFragment.IAuthTabCallback(function1, cardIssueIdCardNotHaveDialogFragment, view);
                    }
                });
                return null;
            }
            tdsButtonV1ViewAsInterface.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.screen.CardIssueIdCardNotHaveDialogFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CardIssueIdCardNotHaveDialogFragment.onExtraCallbackWithResult(function1, cardIssueIdCardNotHaveDialogFragment, view);
                }
            });
        }
        return null;
    }

    private static final void onExtraCallback(Function1 function1, CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(Integer.valueOf(onWarmupCompleted.MANUAL_INPUT.ctaTitleRes()));
            onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1377150689, 1377150691, C40Encoder.onExtraCallback(), new Object[]{cardIssueIdCardNotHaveDialogFragment}, C40Encoder.onExtraCallback());
            int i3 = IAuthTabCallbackDefault + 125;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
                return;
            }
            return;
        }
        function1.invoke(Integer.valueOf(onWarmupCompleted.MANUAL_INPUT.ctaTitleRes()));
        onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1377150689, 1377150691, C40Encoder.onExtraCallback(), new Object[]{cardIssueIdCardNotHaveDialogFragment}, C40Encoder.onExtraCallback());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(Integer.valueOf(onWarmupCompleted.BLOCK_MANUAL_INPUT.ctaTitleRes()));
            cardIssueIdCardNotHaveDialogFragment.dismiss();
            int i3 = 14 / 0;
        } else {
            function1.invoke(Integer.valueOf(onWarmupCompleted.BLOCK_MANUAL_INPUT.ctaTitleRes()));
            cardIssueIdCardNotHaveDialogFragment.dismiss();
        }
        int i4 = onTransact + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        FragmentActivity fragmentActivityRequireActivity;
        int i;
        CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment = (CardIssueIdCardNotHaveDialogFragment) objArr[0];
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            fragmentActivityRequireActivity = cardIssueIdCardNotHaveDialogFragment.requireActivity();
            i = 105;
        } else {
            fragmentActivityRequireActivity = cardIssueIdCardNotHaveDialogFragment.requireActivity();
            i = 9;
        }
        fragmentActivityRequireActivity.setResult(i);
        fragmentActivityRequireActivity.finish();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String IAuthTabCallbackStub() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onExtraCallbackWithResult.onNavigationEvent[IAuthTabCallbackDefault().ordinal()];
        if (i4 != 1) {
            int i5 = onTransact;
            int i6 = i5 + 87;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = i5 + 27;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 != 0) {
                return "prepare_idcard_noti";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i9 = IAuthTabCallbackDefault + 117;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return "direct_input";
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onExtraCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $11 + 99;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 67;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 26, (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 26 - TextUtils.indexOf("", "", 0), 23138 - ImageFormat.getBitsPerPixel(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                f = 0.0f;
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            char c2 = '0';
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i8 = $11 + 41;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        c = c2;
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 74 - Color.argb(0, 0, 0, 0), MotionEvent.axisFromString("") + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i10 = $11 + 121;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                c = '0';
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 29 - TextUtils.lastIndexOf("", '0', 0, 0), 19487 - ((byte) KeyEvent.getModifierMetaStateMask()), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '0';
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            c = '0';
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                int i15 = $11 + 13;
                                $10 = i15 % 128;
                                int i16 = i15 % 2;
                            } else {
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    c2 = c;
                    obj2 = obj;
                }
            }
            for (int i19 = 0; i19 < i; i19++) {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, View view) {
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1640753951, 1640753952, C40Encoder.onExtraCallback(), new Object[]{function1, cardIssueIdCardNotHaveDialogFragment, view}, C40Encoder.onExtraCallback());
    }

    private final void onExtraCallback(Dialog dialog) {
        onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1565911727, -1565911727, C40Encoder.onExtraCallback(), new Object[]{this, dialog}, C40Encoder.onExtraCallback());
    }

    private static final Unit onExtraCallbackWithResult(CardIssueIdCardNotHaveDialogFragment cardIssueIdCardNotHaveDialogFragment, int i) {
        return (Unit) onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -963066709, 963066712, C40Encoder.onExtraCallback(), new Object[]{cardIssueIdCardNotHaveDialogFragment, Integer.valueOf(i)}, C40Encoder.onExtraCallback());
    }

    private final void asInterface() {
        onWarmupCompleted(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1377150689, 1377150691, C40Encoder.onExtraCallback(), new Object[]{this}, C40Encoder.onExtraCallback());
    }
}
