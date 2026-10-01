package o;

import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.compose.component.theme.component.RatingColorScheme;
import im.toss.tds.compose.component.theme.component.RatingColorSchemeKt;
import im.toss.tds.compose.component.theme.component.RedDotColorScheme;
import im.toss.tds.compose.component.theme.component.RedDotColorSchemeKt;
import im.toss.tds.view.R;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getBannerView {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[eExternalSyntheticLambda0.values().length];
            try {
                iArr[eExternalSyntheticLambda0.RedDotFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipBorderInverseSelected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipBorderInverseUnselected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipBorderInverseWeakSelected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipBorderSelected.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipBorderUnselected.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipBorderWeakSelected.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipFillInverseSelected.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipFillInverseWeakSelected.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipFillSelected.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipFillWeakSelected.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillInverseSelectedGradientEnd.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillInverseSelectedGradientStart.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillInverseWeakSelectedGradientEnd.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillInverseWeakSelectedGradientStart.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillSelectedGradientEnd.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillSelectedGradientStart.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillWeakSelectedGradientEnd.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipGradientLayerFillWeakSelectedGradientStart.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipIconInverseSelected.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipIconInverseSelectedWeak.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipIconInverseUnselected.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipIconInverseWeakSelected.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipIconInverseWeakSelectedWeak.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipIconSelected.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipIconWeakSelected.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipNumberTextInverseSelected.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipNumberTextInverseUnselected.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipNumberTextInverseWeakSelected.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipNumberTextSelected.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipNumberTextWeakSelected.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipRedDotBorder.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipRedDotBorderInverse.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipRedDotFill.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipRedDotFillInverse.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipStateLayerFillInverseSelected.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipStateLayerFillInverseUnselected.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipStateLayerFillInverseWeakSelected.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipStateLayerFillSelected.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipStateLayerFillUnselected.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipStateLayerFillWeakSelected.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipTextInverseSelected.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipTextInverseUnselected.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipTextSelected.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ChipTextWeakSelected.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperCompactIndicatorActiveOuterFill.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperCompactIndicatorDefaultBorder.ordinal()] = 47;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperFullIndicatorActiveIconFill.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperFullIndicatorActiveOuterFill.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperFullIndicatorCompletedIconFill.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperProgressGradientEnd.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperProgressGradientStart.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperProgressShadow.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperTrackBorder.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressStepperTrackFill.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressBarIndicatorFill.ordinal()] = 56;
                int i2 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ProgressBarTrackFill.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NumericSpinnerIconPressed.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NumericSpinnerNumberFieldFill.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NumericSpinnerNumberFieldText.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[eExternalSyntheticLambda0.RatingIconDefault.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[eExternalSyntheticLambda0.RatingIconFilled.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[eExternalSyntheticLambda0.RatingIconGradientLayerFillGradientEnd.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BadgeFillGrey.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BadgeFillTeal.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BadgeFillTealWeak.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BadgeTextOnTealWeak.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BadgeTextOnWarning.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TextFieldBoxFieldFillDefault.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TextFieldBoxFieldFillDisabled.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TextFieldBoxFieldFillError.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TextFieldBoxFieldFillFocused.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TextFieldBoxFieldTextDisabled.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TextFieldLineBorderError.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TextFieldLineBorderFocused.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillBrandGradientEnd.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillBrandGradientStart.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillBrandWeakGradientEnd.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillBrandWeakGradientStart.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDangerGradientEnd.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDangerGradientStart.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDangerWeakGradientEnd.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDangerWeakGradientStart.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDarkGradientEnd.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDarkGradientStart.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDarkWeakGradientEnd.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillDarkWeakGradientStart.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillInverseGradientEnd.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillInverseGradientStart.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillInverseWeakGradientEnd.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonGradientLayerFillInverseWeakGradientStart.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonLoaderFill.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonLoaderFillBrandWeak.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonLoaderFillDangerWeak.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonLoaderFillInverse.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonLoaderFillNeutralWeak.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonStateLayer.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonStateLayerFill.ordinal()] = 98;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ButtonTextInverse.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SwitchContainerFillCheckedPressed.ordinal()] = 100;
                int i6 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 4;
                } else {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SwitchContainerFillUncheckedEnabled.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SwitchContainerFillUncheckedPressed.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SwitchHandleFill.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SliderHandleBorder.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SliderHandleFill.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SliderHandleShadow.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SliderProgressFillGrey.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SliderTrackFill.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[eExternalSyntheticLambda0.LoaderWhiteFill.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[eExternalSyntheticLambda0.LoaderWhiteText.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationAppsInTossIconContainerFillDark.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationAppsInTossIconContainerFillLight.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationAppsInTossIconContainerIconDark.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationAppsInTossIconContainerIconLight.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationBackButtonIcon.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationIconBackButtonIconStaticWhite.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationRightItemIcon.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[eExternalSyntheticLambda0.NavigationRightItemTextStaticWhite.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[eExternalSyntheticLambda0.GridListFill.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SearchFieldFill.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SearchFieldGradientLayerFillGradientEnd.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[eExternalSyntheticLambda0.MenuBorder.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[eExternalSyntheticLambda0.MenuFill.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[eExternalSyntheticLambda0.MenuFillAndroid.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[eExternalSyntheticLambda0.MenuGradientLayerFillGradientEnd.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[eExternalSyntheticLambda0.MenuGradientLayerFillGradientStart.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[eExternalSyntheticLambda0.StepperAssetFill.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TooltipDefaultFill.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TooltipFullFill.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TooltipFullText.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SegmentedControlArrowButtonFill.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SegmentedControlGradientLayerFillGradientEnd.ordinal()] = 132;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SegmentedControlGradientLayerFillGradientStart.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SegmentedControlItemFillSelected.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SegmentedControlItemGradientLayerFillGradientEnd.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SegmentedControlItemGradientLayerFillGradientStart.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SegmentedControlItemTextSelected.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastBottomButtonFill.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastBottomButtonText.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastBottomFill.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastBottomText.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastFill.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastText.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastTopFill.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[eExternalSyntheticLambda0.ToastTopText.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BoardRowContentFill.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabBarBorder.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabBarIconSelected.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabBarIconUnselected.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabBarRedDotFill.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabIndicatorFill.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabSquareBorder.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabSquareFill.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabSquareGradientLayerFillGradientEnd.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[eExternalSyntheticLambda0.TabSquareGradientLayerFillGradientStart.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BubbleFillGrey.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BottomSheetHandleFill.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[eExternalSyntheticLambda0.CheckBoxCircleBackgroundFillCheckedPressed.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[eExternalSyntheticLambda0.CheckBoxCircleCheckFillCheckedEnabled.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[eExternalSyntheticLambda0.CheckBoxCircleCheckFillCheckedPressed.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[eExternalSyntheticLambda0.CheckBoxFillCheckedPressed.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[eExternalSyntheticLambda0.CheckBoxLineCheckFillCheckedPressed.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BottomInfoGradientLayerFillGradientEnd.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BottomInfoGradientLayerFillGradientStart.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BottomInfoText.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillBlueGradientEnd.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillBlueGradientStart.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillGreenGradientEnd.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillGreenGradientStart.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillGreyGradientEnd.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillGreyGradientStart.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillOrangeGradientEnd.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillOrangeGradientStart.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillRedGradientEnd.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillRedGradientStart.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillYellowGradientEnd.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartBarFillYellowGradientStart.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[eExternalSyntheticLambda0.BarChartValueTextOrange.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[eExternalSyntheticLambda0.SkeletonFill.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            onExtraCallback = iArr;
        }
    }

    public static /* synthetic */ NestfgetadViewWrapper onExtraCallbackWithResult(RedDotColorScheme redDotColorScheme, z2 z2Var, AppLovinBannerAdListener2 appLovinBannerAdListener2, AppLovinBannerAdListener appLovinBannerAdListener, Nestfgetadapter nestfgetadapter, RatingColorScheme ratingColorScheme, y5 y5Var, Nestfputsdk nestfputsdk, z1ExternalSyntheticLambda1 z1externalsyntheticlambda1, isChildUser ischilduser, appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsize, z5 z5Var, z7 z7Var, z1ExternalSyntheticLambda3 z1externalsyntheticlambda3, setMuteAudio setmuteaudio, z5a z5aVar, isMultiAdsEnabled ismultiadsenabled, onInitializeSuccess oninitializesuccess, getChildUserError getchildusererror, NestfputzoneId nestfputzoneId, r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoy, NestfgetzoneId nestfgetzoneId, NestfgetadView nestfgetadView, z1ExternalSyntheticLambda0 z1externalsyntheticlambda0, r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw r8lambdachre81lwts2kcwdgdi1m2a4dmw, z3a z3aVar, y7 y7Var, y5b y5bVar, getAdError getaderror, int i, Object obj) {
        AppLovinBannerAdListener2 appLovinBannerAdListener2OnNavigationEvent;
        AppLovinBannerAdListener appLovinBannerAdListenerOnExtraCallback;
        y5 y5VarOnWarmupCompleted;
        z5 z5VarIAuthTabCallback;
        z5 z5Var2;
        z7 z7Var2;
        z1ExternalSyntheticLambda3 z1externalsyntheticlambda3OnExtraCallbackWithResult;
        setMuteAudio setmuteaudioOnExtraCallback;
        z5a z5aVarOnWarmupCompleted;
        NestfgetzoneId nestfgetzoneIdOnExtraCallback;
        NestfgetzoneId nestfgetzoneId2;
        NestfgetadView nestfgetadView2;
        z1ExternalSyntheticLambda0 z1externalsyntheticlambda0OnWarmupCompleted;
        r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw r8lambdachre81lwts2kcwdgdi1m2a4dmwOnExtraCallbackWithResult;
        y5b y5bVarIAuthTabCallback;
        y7 y7Var2;
        y5b y5bVar2;
        getAdError getaderrorOnExtraCallback;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = 2 % 2;
        RedDotColorScheme redDotColorSchemeOnWarmupCompleted = (i & 1) != 0 ? RedDotColorSchemeKt.onWarmupCompleted(0L, 1, null) : redDotColorScheme;
        z2 z2VarOnExtraCallbackWithResult = (i & 2) != 0 ? z3.onExtraCallbackWithResult(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 4095, null) : z2Var;
        if ((i & 4) != 0) {
            int i4 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            appLovinBannerAdListener2OnNavigationEvent = AppLovinBannerAdListener1.onNavigationEvent(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 1023, null);
        } else {
            appLovinBannerAdListener2OnNavigationEvent = appLovinBannerAdListener2;
        }
        if ((i & 8) != 0) {
            int i6 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            appLovinBannerAdListenerOnExtraCallback = AppLovinExtrasBuilder.onExtraCallback(0L, 0L, 3, null);
        } else {
            appLovinBannerAdListenerOnExtraCallback = appLovinBannerAdListener;
        }
        Nestfgetadapter nestfgetadapterOnNavigationEvent = (i & 16) != 0 ? NestfgetmediationBannerListener.onNavigationEvent(0L, 0L, 0L, 7, null) : nestfgetadapter;
        RatingColorScheme ratingColorSchemeOnNavigationEvent = (i & 32) != 0 ? RatingColorSchemeKt.onNavigationEvent(0L, 0L, 0L, 7, null) : ratingColorScheme;
        if ((i & 64) != 0) {
            int i8 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                j = 0;
                j2 = 1;
                j3 = 1;
                j4 = 0;
                j5 = 0;
                i2 = 125;
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
                j4 = 0;
                j5 = 0;
                i2 = 31;
            }
            y5VarOnWarmupCompleted = y5a.onWarmupCompleted(j, j2, j3, j4, j5, i2, null);
        } else {
            y5VarOnWarmupCompleted = y5Var;
        }
        Nestfputsdk nestfputsdkOnNavigationEvent = (i & 128) != 0 ? requestBannerAd.onNavigationEvent(0L, 0L, 0L, 0L, 0L, 0L, 0L, 127, null) : nestfputsdk;
        z1ExternalSyntheticLambda1 z1externalsyntheticlambda1IAuthTabCallback = (i & 256) != 0 ? r8lambdaqXesdZD8q4kVd1oMLFTgBkz6vo.IAuthTabCallback(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 16777215, null) : z1externalsyntheticlambda1;
        isChildUser ischilduserOnExtraCallback = (i & 512) != 0 ? AppLovinUtilsServerParameterKeys.onExtraCallback(0L, 0L, 0L, 0L, 15, null) : ischilduser;
        appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsizeIAuthTabCallback = (i & 1024) != 0 ? retrieveZoneId.IAuthTabCallback(0L, 0L, 0L, 0L, 0L, 31, null) : applovinadsizefromadmobadsize;
        if ((i & 2048) != 0) {
            int i9 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z5VarIAuthTabCallback = z5b.IAuthTabCallback(0L, 0L, 3, null);
        } else {
            z5VarIAuthTabCallback = z5Var;
        }
        z7 z7VarOnWarmupCompleted = (i & 4096) != 0 ? z6.onWarmupCompleted(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 255, null) : z7Var;
        if ((i & 8192) != 0) {
            z5Var2 = z5VarIAuthTabCallback;
            z7Var2 = z7VarOnWarmupCompleted;
            z1externalsyntheticlambda3OnExtraCallbackWithResult = z4.onExtraCallbackWithResult(0L, 1, null);
        } else {
            z5Var2 = z5VarIAuthTabCallback;
            z7Var2 = z7VarOnWarmupCompleted;
            z1externalsyntheticlambda3OnExtraCallbackWithResult = z1externalsyntheticlambda3;
        }
        if ((i & 16384) != 0) {
            int i11 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            setmuteaudioOnExtraCallback = AppLovinExtras.onExtraCallback(0L, 0L, 3, null);
        } else {
            setmuteaudioOnExtraCallback = setmuteaudio;
        }
        if ((32768 & i) != 0) {
            int i13 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            z5aVarOnWarmupCompleted = z4a.onWarmupCompleted(0L, 0L, 0L, 0L, 0L, 31, null);
        } else {
            z5aVarOnWarmupCompleted = z5aVar;
        }
        appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsize2 = applovinadsizefromadmobadsizeIAuthTabCallback;
        z5a z5aVar2 = z5aVarOnWarmupCompleted;
        isMultiAdsEnabled ismultiadsenabledOnExtraCallback = (65536 & i) != 0 ? shouldMuteAudio.onExtraCallback(0L, 1, null) : ismultiadsenabled;
        onInitializeSuccess oninitializesuccessOnExtraCallbackWithResult = (131072 & i) != 0 ? onExpiredAdReloaded.onExtraCallbackWithResult(0L, 0L, 0L, 7, null) : oninitializesuccess;
        onInitializeSuccess oninitializesuccess2 = oninitializesuccessOnExtraCallbackWithResult;
        getChildUserError getchildusererrorIAuthTabCallback = (262144 & i) != 0 ? AppLovinExtrasKeys.IAuthTabCallback(0L, 0L, 0L, 0L, 0L, 0L, 0L, 127, null) : getchildusererror;
        NestfputzoneId nestfputzoneIdOnNavigationEvent = (524288 & i) != 0 ? NestfputadView.onNavigationEvent(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 255, null) : nestfputzoneId;
        r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoyOnWarmupCompleted = (i & 1048576) != 0 ? y6a.onWarmupCompleted(0L, 1, null) : r8lambdaeoavtgql0mwpnfumztknwmywoy;
        if ((2097152 & i) != 0) {
            int i15 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            nestfgetzoneIdOnExtraCallback = ApplovinAdapter.onExtraCallback(0L, 0L, 0L, 0L, 15, null);
        } else {
            nestfgetzoneIdOnExtraCallback = nestfgetzoneId;
        }
        NestfgetadView nestfgetadViewOnNavigationEvent = (4194304 & i) != 0 ? Nestfgetsdk.onNavigationEvent(0L, 0L, 0L, 0L, 0L, 31, null) : nestfgetadView;
        if ((8388608 & i) != 0) {
            nestfgetzoneId2 = nestfgetzoneIdOnExtraCallback;
            nestfgetadView2 = nestfgetadViewOnNavigationEvent;
            z1externalsyntheticlambda0OnWarmupCompleted = z1ExternalSyntheticLambda2.onWarmupCompleted(0L, 1, null);
        } else {
            nestfgetzoneId2 = nestfgetzoneIdOnExtraCallback;
            nestfgetadView2 = nestfgetadViewOnNavigationEvent;
            z1externalsyntheticlambda0OnWarmupCompleted = z1externalsyntheticlambda0;
        }
        if ((16777216 & i) != 0) {
            int i17 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            r8lambdachre81lwts2kcwdgdi1m2a4dmwOnExtraCallbackWithResult = r8lambdaiFRlVXBxBjjB9qs3Eolq8577zk8.onExtraCallbackWithResult(0L, 1, null);
        } else {
            r8lambdachre81lwts2kcwdgdi1m2a4dmwOnExtraCallbackWithResult = r8lambdachre81lwts2kcwdgdi1m2a4dmw;
        }
        z3a z3aVarOnExtraCallback = (33554432 & i) != 0 ? z1a.onExtraCallback(0L, 0L, 0L, 0L, 0L, 31, null) : z3aVar;
        y7 y7VarOnExtraCallbackWithResult = (67108864 & i) != 0 ? z1.onExtraCallbackWithResult(0L, 0L, 0L, 7, null) : y7Var;
        if ((134217728 & i) != 0) {
            int i19 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i19 % 128;
            int i20 = i19 % 2;
            y5bVarIAuthTabCallback = y5c.IAuthTabCallback(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8191, null);
        } else {
            y5bVarIAuthTabCallback = y5bVar;
        }
        if ((i & 268435456) != 0) {
            int i21 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i21 % 128;
            int i22 = i21 % 2;
            y7Var2 = y7VarOnExtraCallbackWithResult;
            y5bVar2 = y5bVarIAuthTabCallback;
            getaderrorOnExtraCallback = AppLovinUtils.onExtraCallback(0L, 1, null);
        } else {
            y7Var2 = y7VarOnExtraCallbackWithResult;
            y5bVar2 = y5bVarIAuthTabCallback;
            getaderrorOnExtraCallback = getaderror;
        }
        return IAuthTabCallback(redDotColorSchemeOnWarmupCompleted, z2VarOnExtraCallbackWithResult, appLovinBannerAdListener2OnNavigationEvent, appLovinBannerAdListenerOnExtraCallback, nestfgetadapterOnNavigationEvent, ratingColorSchemeOnNavigationEvent, y5VarOnWarmupCompleted, nestfputsdkOnNavigationEvent, z1externalsyntheticlambda1IAuthTabCallback, ischilduserOnExtraCallback, applovinadsizefromadmobadsize2, z5Var2, z7Var2, z1externalsyntheticlambda3OnExtraCallbackWithResult, setmuteaudioOnExtraCallback, z5aVar2, ismultiadsenabledOnExtraCallback, oninitializesuccess2, getchildusererrorIAuthTabCallback, nestfputzoneIdOnNavigationEvent, r8lambdaeoavtgql0mwpnfumztknwmywoyOnWarmupCompleted, nestfgetzoneId2, nestfgetadView2, z1externalsyntheticlambda0OnWarmupCompleted, r8lambdachre81lwts2kcwdgdi1m2a4dmwOnExtraCallbackWithResult, z3aVarOnExtraCallback, y7Var2, y5bVar2, getaderrorOnExtraCallback);
    }

    public static final NestfgetadViewWrapper IAuthTabCallback(@NotNull RedDotColorScheme redDotColorScheme, @NotNull z2 z2Var, @NotNull AppLovinBannerAdListener2 appLovinBannerAdListener2, @NotNull AppLovinBannerAdListener appLovinBannerAdListener, @NotNull Nestfgetadapter nestfgetadapter, @NotNull RatingColorScheme ratingColorScheme, @NotNull y5 y5Var, @NotNull Nestfputsdk nestfputsdk, @NotNull z1ExternalSyntheticLambda1 z1externalsyntheticlambda1, @NotNull isChildUser ischilduser, @NotNull appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsize, @NotNull z5 z5Var, @NotNull z7 z7Var, @NotNull z1ExternalSyntheticLambda3 z1externalsyntheticlambda3, @NotNull setMuteAudio setmuteaudio, @NotNull z5a z5aVar, @NotNull isMultiAdsEnabled ismultiadsenabled, @NotNull onInitializeSuccess oninitializesuccess, @NotNull getChildUserError getchildusererror, @NotNull NestfputzoneId nestfputzoneId, @NotNull r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoy, @NotNull NestfgetzoneId nestfgetzoneId, @NotNull NestfgetadView nestfgetadView, @NotNull z1ExternalSyntheticLambda0 z1externalsyntheticlambda0, @NotNull r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw r8lambdachre81lwts2kcwdgdi1m2a4dmw, @NotNull z3a z3aVar, @NotNull y7 y7Var, @NotNull y5b y5bVar, @NotNull getAdError getaderror) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(redDotColorScheme, "");
        Intrinsics.checkNotNullParameter(z2Var, "");
        Intrinsics.checkNotNullParameter(appLovinBannerAdListener2, "");
        Intrinsics.checkNotNullParameter(appLovinBannerAdListener, "");
        Intrinsics.checkNotNullParameter(nestfgetadapter, "");
        Intrinsics.checkNotNullParameter(ratingColorScheme, "");
        Intrinsics.checkNotNullParameter(y5Var, "");
        Intrinsics.checkNotNullParameter(nestfputsdk, "");
        Intrinsics.checkNotNullParameter(z1externalsyntheticlambda1, "");
        Intrinsics.checkNotNullParameter(ischilduser, "");
        Intrinsics.checkNotNullParameter(applovinadsizefromadmobadsize, "");
        Intrinsics.checkNotNullParameter(z5Var, "");
        Intrinsics.checkNotNullParameter(z7Var, "");
        Intrinsics.checkNotNullParameter(z1externalsyntheticlambda3, "");
        Intrinsics.checkNotNullParameter(setmuteaudio, "");
        Intrinsics.checkNotNullParameter(z5aVar, "");
        Intrinsics.checkNotNullParameter(ismultiadsenabled, "");
        Intrinsics.checkNotNullParameter(oninitializesuccess, "");
        Intrinsics.checkNotNullParameter(getchildusererror, "");
        Intrinsics.checkNotNullParameter(nestfputzoneId, "");
        Intrinsics.checkNotNullParameter(r8lambdaeoavtgql0mwpnfumztknwmywoy, "");
        Intrinsics.checkNotNullParameter(nestfgetzoneId, "");
        Intrinsics.checkNotNullParameter(nestfgetadView, "");
        Intrinsics.checkNotNullParameter(z1externalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(r8lambdachre81lwts2kcwdgdi1m2a4dmw, "");
        Intrinsics.checkNotNullParameter(z3aVar, "");
        Intrinsics.checkNotNullParameter(y7Var, "");
        Intrinsics.checkNotNullParameter(y5bVar, "");
        Intrinsics.checkNotNullParameter(getaderror, "");
        NestfgetadViewWrapper nestfgetadViewWrapper = new NestfgetadViewWrapper(redDotColorScheme, z2Var, appLovinBannerAdListener2, appLovinBannerAdListener, nestfgetadapter, ratingColorScheme, y5Var, nestfputsdk, z1externalsyntheticlambda1, ischilduser, applovinadsizefromadmobadsize, z5Var, z7Var, z1externalsyntheticlambda3, setmuteaudio, z5aVar, ismultiadsenabled, oninitializesuccess, getchildusererror, nestfputzoneId, r8lambdaeoavtgql0mwpnfumztknwmywoy, nestfgetzoneId, nestfgetadView, z1externalsyntheticlambda0, r8lambdachre81lwts2kcwdgdi1m2a4dmw, z3aVar, y7Var, y5bVar, getaderror);
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return nestfgetadViewWrapper;
    }

    public static /* synthetic */ NestfgetadViewWrapper IAuthTabCallback(RedDotColorScheme redDotColorScheme, z2 z2Var, AppLovinBannerAdListener2 appLovinBannerAdListener2, AppLovinBannerAdListener appLovinBannerAdListener, Nestfgetadapter nestfgetadapter, RatingColorScheme ratingColorScheme, y5 y5Var, Nestfputsdk nestfputsdk, z1ExternalSyntheticLambda1 z1externalsyntheticlambda1, isChildUser ischilduser, appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsize, z5 z5Var, z7 z7Var, z1ExternalSyntheticLambda3 z1externalsyntheticlambda3, setMuteAudio setmuteaudio, z5a z5aVar, isMultiAdsEnabled ismultiadsenabled, onInitializeSuccess oninitializesuccess, getChildUserError getchildusererror, NestfputzoneId nestfputzoneId, r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoy, NestfgetzoneId nestfgetzoneId, NestfgetadView nestfgetadView, z1ExternalSyntheticLambda0 z1externalsyntheticlambda0, r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw r8lambdachre81lwts2kcwdgdi1m2a4dmw, z3a z3aVar, y7 y7Var, y5b y5bVar, getAdError getaderror, int i, Object obj) {
        RatingColorScheme ratingColorSchemeOnWarmupCompleted;
        y5 y5VarOnExtraCallback;
        z5 z5VarOnExtraCallbackWithResult;
        RedDotColorScheme redDotColorScheme2;
        z7 z7Var2;
        z1ExternalSyntheticLambda3 z1externalsyntheticlambda3OnNavigationEvent;
        setMuteAudio setmuteaudio2;
        z5a z5aVar2;
        isMultiAdsEnabled ismultiadsenabledOnWarmupCompleted;
        getChildUserError getchildusererror2;
        NestfputzoneId nestfputzoneId2;
        z2 z2Var2;
        r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoyOnNavigationEvent;
        long j;
        z1ExternalSyntheticLambda0 z1externalsyntheticlambda0OnNavigationEvent;
        y7 y7Var2;
        y5b y5bVar2;
        getAdError getaderrorOnNavigationEvent;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i4 % 128;
        RedDotColorScheme redDotColorSchemeIAuthTabCallback = (i4 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? redDotColorScheme : RedDotColorSchemeKt.IAuthTabCallback(0L, 1, null);
        z2 z2VarOnWarmupCompleted = (i & 2) != 0 ? z3.onWarmupCompleted(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 4095, null) : z2Var;
        AppLovinBannerAdListener2 appLovinBannerAdListener2OnWarmupCompleted = (i & 4) != 0 ? AppLovinBannerAdListener1.onWarmupCompleted(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 1023, null) : appLovinBannerAdListener2;
        AppLovinBannerAdListener appLovinBannerAdListenerOnWarmupCompleted = (i & 8) != 0 ? AppLovinExtrasBuilder.onWarmupCompleted(0L, 0L, 3, null) : appLovinBannerAdListener;
        Nestfgetadapter nestfgetadapterIAuthTabCallback = (i & 16) != 0 ? NestfgetmediationBannerListener.IAuthTabCallback(0L, 0L, 0L, 7, null) : nestfgetadapter;
        if ((i & 32) != 0) {
            int i5 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            ratingColorSchemeOnWarmupCompleted = RatingColorSchemeKt.onWarmupCompleted(0L, 0L, 0L, 7, null);
        } else {
            ratingColorSchemeOnWarmupCompleted = ratingColorScheme;
        }
        if ((i & 64) != 0) {
            int i7 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                j2 = 1;
                j3 = 1;
                j4 = 0;
                j5 = 0;
                j6 = 0;
                i2 = 104;
            } else {
                j2 = 0;
                j3 = 0;
                j4 = 0;
                j5 = 0;
                j6 = 0;
                i2 = 31;
            }
            y5VarOnExtraCallback = y5a.onExtraCallback(j2, j3, j4, j5, j6, i2, null);
        } else {
            y5VarOnExtraCallback = y5Var;
        }
        Nestfputsdk nestfputsdkOnWarmupCompleted = (i & 128) != 0 ? requestBannerAd.onWarmupCompleted(0L, 0L, 0L, 0L, 0L, 0L, 0L, 127, null) : nestfputsdk;
        z1ExternalSyntheticLambda1 z1externalsyntheticlambda1OnNavigationEvent = (i & 256) != 0 ? r8lambdaqXesdZD8q4kVd1oMLFTgBkz6vo.onNavigationEvent(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 16777215, null) : z1externalsyntheticlambda1;
        isChildUser ischilduserOnExtraCallbackWithResult = (i & 512) != 0 ? AppLovinUtilsServerParameterKeys.onExtraCallbackWithResult(0L, 0L, 0L, 0L, 15, null) : ischilduser;
        appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsizeOnExtraCallbackWithResult = (i & 1024) != 0 ? retrieveZoneId.onExtraCallbackWithResult(0L, 0L, 0L, 0L, 0L, 31, null) : applovinadsizefromadmobadsize;
        if ((i & 2048) != 0) {
            z5VarOnExtraCallbackWithResult = z5b.onExtraCallbackWithResult(0L, 0L, 3, null);
            int i8 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 4 % 5;
            }
        } else {
            z5VarOnExtraCallbackWithResult = z5Var;
        }
        z7 z7VarOnExtraCallbackWithResult = (i & 4096) != 0 ? z6.onExtraCallbackWithResult(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 255, null) : z7Var;
        if ((i & 8192) != 0) {
            redDotColorScheme2 = redDotColorSchemeIAuthTabCallback;
            z7Var2 = z7VarOnExtraCallbackWithResult;
            z1externalsyntheticlambda3OnNavigationEvent = z4.onNavigationEvent(0L, 1, null);
        } else {
            redDotColorScheme2 = redDotColorSchemeIAuthTabCallback;
            z7Var2 = z7VarOnExtraCallbackWithResult;
            z1externalsyntheticlambda3OnNavigationEvent = z1externalsyntheticlambda3;
        }
        setMuteAudio setmuteaudioOnNavigationEvent = (i & 16384) != 0 ? AppLovinExtras.onNavigationEvent(0L, 0L, 3, null) : setmuteaudio;
        z5a z5aVarOnExtraCallbackWithResult = (32768 & i) != 0 ? z4a.onExtraCallbackWithResult(0L, 0L, 0L, 0L, 0L, 31, null) : z5aVar;
        if ((65536 & i) != 0) {
            setmuteaudio2 = setmuteaudioOnNavigationEvent;
            z5aVar2 = z5aVarOnExtraCallbackWithResult;
            ismultiadsenabledOnWarmupCompleted = shouldMuteAudio.onWarmupCompleted(0L, 1, null);
        } else {
            setmuteaudio2 = setmuteaudioOnNavigationEvent;
            z5aVar2 = z5aVarOnExtraCallbackWithResult;
            ismultiadsenabledOnWarmupCompleted = ismultiadsenabled;
        }
        onInitializeSuccess oninitializesuccessOnExtraCallback = (131072 & i) != 0 ? onExpiredAdReloaded.onExtraCallback(0L, 0L, 0L, 7, null) : oninitializesuccess;
        getChildUserError getchildusererrorOnExtraCallbackWithResult = (262144 & i) != 0 ? AppLovinExtrasKeys.onExtraCallbackWithResult(0L, 0L, 0L, 0L, 0L, 0L, 0L, 127, null) : getchildusererror;
        NestfputzoneId nestfputzoneIdOnExtraCallbackWithResult = (524288 & i) != 0 ? NestfputadView.onExtraCallbackWithResult(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 255, null) : nestfputzoneId;
        if ((1048576 & i) != 0) {
            int i10 = onWarmupCompleted + 99;
            nestfputzoneId2 = nestfputzoneIdOnExtraCallbackWithResult;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                z2Var2 = z2VarOnWarmupCompleted;
                getchildusererror2 = getchildusererrorOnExtraCallbackWithResult;
                r8lambdaeoavtgql0mwpnfumztknwmywoyOnNavigationEvent = y6a.onNavigationEvent(1L, 1, null);
            } else {
                getchildusererror2 = getchildusererrorOnExtraCallbackWithResult;
                z2Var2 = z2VarOnWarmupCompleted;
                r8lambdaeoavtgql0mwpnfumztknwmywoyOnNavigationEvent = y6a.onNavigationEvent(0L, 1, null);
            }
        } else {
            getchildusererror2 = getchildusererrorOnExtraCallbackWithResult;
            nestfputzoneId2 = nestfputzoneIdOnExtraCallbackWithResult;
            z2Var2 = z2VarOnWarmupCompleted;
            r8lambdaeoavtgql0mwpnfumztknwmywoyOnNavigationEvent = r8lambdaeoavtgql0mwpnfumztknwmywoy;
        }
        NestfgetzoneId nestfgetzoneIdIAuthTabCallback = (2097152 & i) != 0 ? ApplovinAdapter.IAuthTabCallback(0L, 0L, 0L, 0L, 15, null) : nestfgetzoneId;
        NestfgetadView nestfgetadViewOnWarmupCompleted = (4194304 & i) != 0 ? Nestfgetsdk.onWarmupCompleted(0L, 0L, 0L, 0L, 0L, 31, null) : nestfgetadView;
        if ((8388608 & i) != 0) {
            j = 0;
            z1externalsyntheticlambda0OnNavigationEvent = z1ExternalSyntheticLambda2.onNavigationEvent(0L, 1, null);
        } else {
            j = 0;
            z1externalsyntheticlambda0OnNavigationEvent = z1externalsyntheticlambda0;
        }
        r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw r8lambdachre81lwts2kcwdgdi1m2a4dmwIAuthTabCallback = (i & 16777216) != 0 ? r8lambdaiFRlVXBxBjjB9qs3Eolq8577zk8.IAuthTabCallback(j, 1, null) : r8lambdachre81lwts2kcwdgdi1m2a4dmw;
        z3a z3aVarOnNavigationEvent = (33554432 & i) != 0 ? z1a.onNavigationEvent(0L, 0L, 0L, 0L, 0L, 31, null) : z3aVar;
        y7 y7VarOnExtraCallback = (67108864 & i) != 0 ? z1.onExtraCallback(0L, 0L, 0L, 7, null) : y7Var;
        y5b y5bVarOnNavigationEvent = (134217728 & i) != 0 ? y5c.onNavigationEvent(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8191, null) : y5bVar;
        if ((i & 268435456) != 0) {
            int i11 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            y7Var2 = y7VarOnExtraCallback;
            y5bVar2 = y5bVarOnNavigationEvent;
            getaderrorOnNavigationEvent = AppLovinUtils.onNavigationEvent(0L, 1, null);
        } else {
            y7Var2 = y7VarOnExtraCallback;
            y5bVar2 = y5bVarOnNavigationEvent;
            getaderrorOnNavigationEvent = getaderror;
        }
        return onWarmupCompleted(redDotColorScheme2, z2Var2, appLovinBannerAdListener2OnWarmupCompleted, appLovinBannerAdListenerOnWarmupCompleted, nestfgetadapterIAuthTabCallback, ratingColorSchemeOnWarmupCompleted, y5VarOnExtraCallback, nestfputsdkOnWarmupCompleted, z1externalsyntheticlambda1OnNavigationEvent, ischilduserOnExtraCallbackWithResult, applovinadsizefromadmobadsizeOnExtraCallbackWithResult, z5VarOnExtraCallbackWithResult, z7Var2, z1externalsyntheticlambda3OnNavigationEvent, setmuteaudio2, z5aVar2, ismultiadsenabledOnWarmupCompleted, oninitializesuccessOnExtraCallback, getchildusererror2, nestfputzoneId2, r8lambdaeoavtgql0mwpnfumztknwmywoyOnNavigationEvent, nestfgetzoneIdIAuthTabCallback, nestfgetadViewOnWarmupCompleted, z1externalsyntheticlambda0OnNavigationEvent, r8lambdachre81lwts2kcwdgdi1m2a4dmwIAuthTabCallback, z3aVarOnNavigationEvent, y7Var2, y5bVar2, getaderrorOnNavigationEvent);
    }

    public static final NestfgetadViewWrapper onWarmupCompleted(@NotNull RedDotColorScheme redDotColorScheme, @NotNull z2 z2Var, @NotNull AppLovinBannerAdListener2 appLovinBannerAdListener2, @NotNull AppLovinBannerAdListener appLovinBannerAdListener, @NotNull Nestfgetadapter nestfgetadapter, @NotNull RatingColorScheme ratingColorScheme, @NotNull y5 y5Var, @NotNull Nestfputsdk nestfputsdk, @NotNull z1ExternalSyntheticLambda1 z1externalsyntheticlambda1, @NotNull isChildUser ischilduser, @NotNull appLovinAdSizeFromAdMobAdSize applovinadsizefromadmobadsize, @NotNull z5 z5Var, @NotNull z7 z7Var, @NotNull z1ExternalSyntheticLambda3 z1externalsyntheticlambda3, @NotNull setMuteAudio setmuteaudio, @NotNull z5a z5aVar, @NotNull isMultiAdsEnabled ismultiadsenabled, @NotNull onInitializeSuccess oninitializesuccess, @NotNull getChildUserError getchildusererror, @NotNull NestfputzoneId nestfputzoneId, @NotNull r8lambdaeOaVtgql0MWPnFumztkNWmywOY r8lambdaeoavtgql0mwpnfumztknwmywoy, @NotNull NestfgetzoneId nestfgetzoneId, @NotNull NestfgetadView nestfgetadView, @NotNull z1ExternalSyntheticLambda0 z1externalsyntheticlambda0, @NotNull r8lambdacHRE81Lwts2KcwdgDI1M2A4dMw r8lambdachre81lwts2kcwdgdi1m2a4dmw, @NotNull z3a z3aVar, @NotNull y7 y7Var, @NotNull y5b y5bVar, @NotNull getAdError getaderror) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(redDotColorScheme, "");
        Intrinsics.checkNotNullParameter(z2Var, "");
        Intrinsics.checkNotNullParameter(appLovinBannerAdListener2, "");
        Intrinsics.checkNotNullParameter(appLovinBannerAdListener, "");
        Intrinsics.checkNotNullParameter(nestfgetadapter, "");
        Intrinsics.checkNotNullParameter(ratingColorScheme, "");
        Intrinsics.checkNotNullParameter(y5Var, "");
        Intrinsics.checkNotNullParameter(nestfputsdk, "");
        Intrinsics.checkNotNullParameter(z1externalsyntheticlambda1, "");
        Intrinsics.checkNotNullParameter(ischilduser, "");
        Intrinsics.checkNotNullParameter(applovinadsizefromadmobadsize, "");
        Intrinsics.checkNotNullParameter(z5Var, "");
        Intrinsics.checkNotNullParameter(z7Var, "");
        Intrinsics.checkNotNullParameter(z1externalsyntheticlambda3, "");
        Intrinsics.checkNotNullParameter(setmuteaudio, "");
        Intrinsics.checkNotNullParameter(z5aVar, "");
        Intrinsics.checkNotNullParameter(ismultiadsenabled, "");
        Intrinsics.checkNotNullParameter(oninitializesuccess, "");
        Intrinsics.checkNotNullParameter(getchildusererror, "");
        Intrinsics.checkNotNullParameter(nestfputzoneId, "");
        Intrinsics.checkNotNullParameter(r8lambdaeoavtgql0mwpnfumztknwmywoy, "");
        Intrinsics.checkNotNullParameter(nestfgetzoneId, "");
        Intrinsics.checkNotNullParameter(nestfgetadView, "");
        Intrinsics.checkNotNullParameter(z1externalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(r8lambdachre81lwts2kcwdgdi1m2a4dmw, "");
        Intrinsics.checkNotNullParameter(z3aVar, "");
        Intrinsics.checkNotNullParameter(y7Var, "");
        Intrinsics.checkNotNullParameter(y5bVar, "");
        Intrinsics.checkNotNullParameter(getaderror, "");
        NestfgetadViewWrapper nestfgetadViewWrapper = new NestfgetadViewWrapper(redDotColorScheme, z2Var, appLovinBannerAdListener2, appLovinBannerAdListener, nestfgetadapter, ratingColorScheme, y5Var, nestfputsdk, z1externalsyntheticlambda1, ischilduser, applovinadsizefromadmobadsize, z5Var, z7Var, z1externalsyntheticlambda3, setmuteaudio, z5aVar, ismultiadsenabled, oninitializesuccess, getchildusererror, nestfputzoneId, r8lambdaeoavtgql0mwpnfumztknwmywoy, nestfgetzoneId, nestfgetadView, z1externalsyntheticlambda0, r8lambdachre81lwts2kcwdgdi1m2a4dmw, z3aVar, y7Var, y5bVar, getaderror);
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return nestfgetadViewWrapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long onExtraCallbackWithResult(@NotNull NestfgetadViewWrapper nestfgetadViewWrapper, @NotNull eExternalSyntheticLambda0 eexternalsyntheticlambda0) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nestfgetadViewWrapper, "");
        Intrinsics.checkNotNullParameter(eexternalsyntheticlambda0, "");
        switch (onNavigationEvent.onExtraCallback[eexternalsyntheticlambda0.ordinal()]) {
            case 1:
                return nestfgetadViewWrapper.extraCallbackWithResult().IAuthTabCallback();
            case 2:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onNavigationEvent();
            case 3:
                Object[] objArr = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(1812990735, objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1812990734, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
            case 4:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onExtraCallback();
            case 5:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().IAuthTabCallback();
            case 6:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onWarmupCompleted();
            case 7:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().IAuthTabCallbackDefault();
            case 8:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onTransact();
            case 9:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().IAuthTabCallbackStub();
            case 10:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().asInterface();
            case 11:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().asBinder();
            case 12:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().getInterfaceDescriptor();
            case 13:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().IAuthTabCallback_Parcel();
            case 14:
                Object[] objArr2 = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(1953372339, objArr2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1953372333, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3)).longValue();
            case 15:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().access000();
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().IAuthTabCallbackStubProxy();
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().extraCallbackWithResult();
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().readTypedObject();
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                Object[] objArr3 = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult5 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult6 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(-286734247, objArr3, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 286734247, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5)).longValue();
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                Object[] objArr4 = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult7 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult8 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(617942460, objArr4, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -617942453, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult8, iOnExtraCallbackWithResult7)).longValue();
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().ICustomTabsCallback();
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onMessageChannelReady();
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onPostMessage();
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onMinimized();
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onActivityResized();
            case R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onActivityLayout();
            case R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onRelationshipValidationResult();
            case R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().onUnminimized();
            case R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().ICustomTabsCallbackStub();
            case R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                Object[] objArr5 = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult9 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult10 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(1067679211, objArr5, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1067679206, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult10, iOnExtraCallbackWithResult9)).longValue();
            case R.styleable.TdsListRowV1View_leftRank /* 31 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().ICustomTabsCallbackStubProxy();
            case R.styleable.TdsListRowV1View_leftType /* 32 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().isEngagementSignalsApiAvailable();
            case R.styleable.TdsListRowV1View_rightArrow /* 33 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().extraCommand();
            case R.styleable.TdsListRowV1View_rightBadgeText /* 34 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().ICustomTabsService();
            case R.styleable.TdsListRowV1View_rightBreakEnabled /* 35 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().mayLaunchUrl();
            case R.styleable.TdsListRowV1View_rightButtonDisplay /* 36 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().ICustomTabsCallback_Parcel();
            case R.styleable.TdsListRowV1View_rightButtonLabel /* 37 */:
                Object[] objArr6 = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult11 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult12 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(75420437, objArr6, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -75420433, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult12, iOnExtraCallbackWithResult11)).longValue();
            case R.styleable.TdsListRowV1View_rightButtonSize /* 38 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().newSessionWithExtras();
            case R.styleable.TdsListRowV1View_rightButtonStyle /* 39 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().postMessage();
            case R.styleable.TdsListRowV1View_rightButtonType /* 40 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().newAuthTabSession();
            case R.styleable.TdsListRowV1View_rightCheckBoxChecked /* 41 */:
                Object[] objArr7 = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult13 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult14 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(473482027, objArr7, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -473482025, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult14, iOnExtraCallbackWithResult13)).longValue();
            case R.styleable.TdsListRowV1View_rightCheckBoxType /* 42 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().receiveFile();
            case R.styleable.TdsListRowV1View_rightIcon /* 43 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().prefetchWithMultipleUrls();
            case R.styleable.TdsListRowV1View_rightIconButtonIconColor /* 44 */:
                return nestfgetadViewWrapper.IAuthTabCallbackDefault().requestPostMessageChannel();
            case R.styleable.TdsListRowV1View_rightIconButtonIconUrl /* 45 */:
                Object[] objArr8 = {nestfgetadViewWrapper.IAuthTabCallbackDefault()};
                int iOnExtraCallbackWithResult15 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult16 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                return ((Long) z2.onExtraCallback(829938199, objArr8, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -829938196, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult16, iOnExtraCallbackWithResult15)).longValue();
            case R.styleable.TdsListRowV1View_rightIconButtonSize /* 46 */:
                return nestfgetadViewWrapper.extraCallback().onExtraCallback();
            case R.styleable.TdsListRowV1View_rightIconColor /* 47 */:
                return nestfgetadViewWrapper.extraCallback().IAuthTabCallback();
            case R.styleable.TdsListRowV1View_rightIconHeight /* 48 */:
                return nestfgetadViewWrapper.extraCallback().onExtraCallbackWithResult();
            case R.styleable.TdsListRowV1View_rightIconWidth /* 49 */:
                return nestfgetadViewWrapper.extraCallback().onNavigationEvent();
            case R.styleable.TdsListRowV1View_rightOnButtonClick /* 50 */:
                Object[] objArr9 = {nestfgetadViewWrapper.extraCallback()};
                return ((Long) AppLovinBannerAdListener2.onExtraCallbackWithResult(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1300365546, 1300365547, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr9)).longValue();
            case R.styleable.TdsListRowV1View_rightOnIconButtonClick /* 51 */:
                return nestfgetadViewWrapper.extraCallback().onTransact();
            case R.styleable.TdsListRowV1View_rightOnIconClick /* 52 */:
                return nestfgetadViewWrapper.extraCallback().asInterface();
            case R.styleable.TdsListRowV1View_rightSwitchChecked /* 53 */:
                Object[] objArr10 = {nestfgetadViewWrapper.extraCallback()};
                return ((Long) AppLovinBannerAdListener2.onExtraCallbackWithResult(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -262598584, 262598584, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr10)).longValue();
            case R.styleable.TdsListRowV1View_rightText1 /* 54 */:
                return nestfgetadViewWrapper.extraCallback().asBinder();
            case R.styleable.TdsListRowV1View_rightText1Color /* 55 */:
                return nestfgetadViewWrapper.extraCallback().IAuthTabCallbackDefault();
            case R.styleable.TdsListRowV1View_rightText1MaxLines /* 56 */:
                return nestfgetadViewWrapper.IAuthTabCallback_Parcel().IAuthTabCallback();
            case R.styleable.TdsListRowV1View_rightText2 /* 57 */:
                return nestfgetadViewWrapper.IAuthTabCallback_Parcel().onExtraCallback();
            case R.styleable.TdsListRowV1View_rightText2Color /* 58 */:
                return nestfgetadViewWrapper.IAuthTabCallbackStubProxy().onExtraCallback();
            case R.styleable.TdsListRowV1View_rightText2MaxLines /* 59 */:
                return nestfgetadViewWrapper.IAuthTabCallbackStubProxy().onWarmupCompleted();
            case R.styleable.TdsListRowV1View_rightType /* 60 */:
                return nestfgetadViewWrapper.IAuthTabCallbackStubProxy().onExtraCallbackWithResult();
            case 61:
                int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((RatingColorScheme) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1570373544, 1570373544, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback)).IAuthTabCallback();
            case 62:
                int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((RatingColorScheme) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1570373544, 1570373544, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2)).onNavigationEvent();
            case 63:
                int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((RatingColorScheme) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1570373544, 1570373544, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback3)).onExtraCallback();
            case 64:
                return nestfgetadViewWrapper.IAuthTabCallback().IAuthTabCallback();
            case 65:
                return nestfgetadViewWrapper.IAuthTabCallback().onNavigationEvent();
            case 66:
                return nestfgetadViewWrapper.IAuthTabCallback().onWarmupCompleted();
            case 67:
                return nestfgetadViewWrapper.IAuthTabCallback().onExtraCallback();
            case 68:
                return nestfgetadViewWrapper.IAuthTabCallback().onExtraCallbackWithResult();
            case 69:
                return nestfgetadViewWrapper.ICustomTabsCallbackDefault().onExtraCallbackWithResult();
            case 70:
                return nestfgetadViewWrapper.ICustomTabsCallbackDefault().onWarmupCompleted();
            case 71:
                return nestfgetadViewWrapper.ICustomTabsCallbackDefault().IAuthTabCallback();
            case 72:
                return nestfgetadViewWrapper.ICustomTabsCallbackDefault().onNavigationEvent();
            case 73:
                return nestfgetadViewWrapper.ICustomTabsCallbackDefault().onExtraCallback();
            case 74:
                return nestfgetadViewWrapper.ICustomTabsCallbackDefault().onTransact();
            case 75:
                return nestfgetadViewWrapper.ICustomTabsCallbackDefault().asInterface();
            case 76:
                Object[] objArr11 = {nestfgetadViewWrapper.onTransact()};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                return ((Long) z1ExternalSyntheticLambda1.onWarmupCompleted(2057822330, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr11, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2057822328, iIAuthTabCallback)).longValue();
            case 77:
                Object[] objArr12 = {nestfgetadViewWrapper.onTransact()};
                int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                return ((Long) z1ExternalSyntheticLambda1.onWarmupCompleted(853738281, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr12, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -853738281, iIAuthTabCallback2)).longValue();
            case 78:
                return nestfgetadViewWrapper.onTransact().onNavigationEvent();
            case 79:
                return nestfgetadViewWrapper.onTransact().IAuthTabCallback();
            case 80:
                return nestfgetadViewWrapper.onTransact().onWarmupCompleted();
            case 81:
                return nestfgetadViewWrapper.onTransact().IAuthTabCallbackDefault();
            case 82:
                return nestfgetadViewWrapper.onTransact().onTransact();
            case 83:
                return nestfgetadViewWrapper.onTransact().asInterface();
            case 84:
                return nestfgetadViewWrapper.onTransact().asBinder();
            case 85:
                return nestfgetadViewWrapper.onTransact().IAuthTabCallbackStub();
            case 86:
                return nestfgetadViewWrapper.onTransact().IAuthTabCallback_Parcel();
            case 87:
                return nestfgetadViewWrapper.onTransact().access000();
            case 88:
                return nestfgetadViewWrapper.onTransact().IAuthTabCallbackStubProxy();
            case 89:
                return nestfgetadViewWrapper.onTransact().getInterfaceDescriptor();
            case 90:
                return nestfgetadViewWrapper.onTransact().access100();
            case 91:
                return nestfgetadViewWrapper.onTransact().extraCallbackWithResult();
            case 92:
                return nestfgetadViewWrapper.onTransact().readTypedObject();
            case 93:
                Object[] objArr13 = {nestfgetadViewWrapper.onTransact()};
                int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                long jLongValue = ((Long) z1ExternalSyntheticLambda1.onWarmupCompleted(303341694, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr13, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -303341693, iIAuthTabCallback3)).longValue();
                int i2 = onWarmupCompleted + 9;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return jLongValue;
            case 94:
                return nestfgetadViewWrapper.onTransact().writeTypedObject();
            case 95:
                return nestfgetadViewWrapper.onTransact().ICustomTabsCallback();
            case 96:
                return nestfgetadViewWrapper.onTransact().onMessageChannelReady();
            case 97:
                return nestfgetadViewWrapper.onTransact().onActivityResized();
            case 98:
                Object[] objArr14 = {nestfgetadViewWrapper.onTransact()};
                int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                return ((Long) z1ExternalSyntheticLambda1.onWarmupCompleted(808675825, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr14, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -808675822, iIAuthTabCallback4)).longValue();
            case 99:
                return nestfgetadViewWrapper.onTransact().onMinimized();
            case 100:
                return nestfgetadViewWrapper.onPostMessage().onExtraCallbackWithResult();
            case 101:
                return nestfgetadViewWrapper.onPostMessage().onNavigationEvent();
            case 102:
                return nestfgetadViewWrapper.onPostMessage().IAuthTabCallback();
            case 103:
                return nestfgetadViewWrapper.onPostMessage().onWarmupCompleted();
            case 104:
                return nestfgetadViewWrapper.onMessageChannelReady().onExtraCallbackWithResult();
            case 105:
                return nestfgetadViewWrapper.onMessageChannelReady().IAuthTabCallback();
            case 106:
                return nestfgetadViewWrapper.onMessageChannelReady().onWarmupCompleted();
            case 107:
                return nestfgetadViewWrapper.onMessageChannelReady().onNavigationEvent();
            case 108:
                return nestfgetadViewWrapper.onMessageChannelReady().onExtraCallback();
            case 109:
                int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((z5) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1356119298, 1356119300, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback4)).onNavigationEvent();
            case 110:
                int iOnExtraCallback5 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((z5) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1356119298, 1356119300, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback5)).onExtraCallbackWithResult();
            case 111:
                return nestfgetadViewWrapper.access100().onNavigationEvent();
            case 112:
                return nestfgetadViewWrapper.access100().onExtraCallback();
            case 113:
                return nestfgetadViewWrapper.access100().onWarmupCompleted();
            case 114:
                return nestfgetadViewWrapper.access100().IAuthTabCallback();
            case 115:
                return nestfgetadViewWrapper.access100().onExtraCallbackWithResult();
            case 116:
                long jIAuthTabCallbackDefault = nestfgetadViewWrapper.access100().IAuthTabCallbackDefault();
                int i4 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return jIAuthTabCallbackDefault;
            case 117:
                return nestfgetadViewWrapper.access100().onTransact();
            case 118:
                return nestfgetadViewWrapper.access100().IAuthTabCallbackStub();
            case 119:
                return nestfgetadViewWrapper.IAuthTabCallbackStub().onExtraCallback();
            case 120:
                int iOnExtraCallback6 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((setMuteAudio) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 607812642, -607812639, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback6)).onExtraCallback();
            case 121:
                int iOnExtraCallback7 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((setMuteAudio) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 607812642, -607812639, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback7)).onNavigationEvent();
            case 122:
                return nestfgetadViewWrapper.getInterfaceDescriptor().onWarmupCompleted();
            case 123:
                return nestfgetadViewWrapper.getInterfaceDescriptor().onNavigationEvent();
            case 124:
                return nestfgetadViewWrapper.getInterfaceDescriptor().onExtraCallbackWithResult();
            case 125:
                return nestfgetadViewWrapper.getInterfaceDescriptor().onExtraCallback();
            case 126:
                return nestfgetadViewWrapper.getInterfaceDescriptor().IAuthTabCallback();
            case 127:
                return nestfgetadViewWrapper.onActivityLayout().IAuthTabCallback();
            case 128:
                return nestfgetadViewWrapper.onUnminimized().onNavigationEvent();
            case 129:
                return nestfgetadViewWrapper.onUnminimized().onExtraCallbackWithResult();
            case 130:
                return nestfgetadViewWrapper.onUnminimized().onExtraCallback();
            case 131:
                return nestfgetadViewWrapper.writeTypedObject().onExtraCallbackWithResult();
            case 132:
                return nestfgetadViewWrapper.writeTypedObject().onExtraCallback();
            case 133:
                return nestfgetadViewWrapper.writeTypedObject().onNavigationEvent();
            case 134:
                return nestfgetadViewWrapper.writeTypedObject().onWarmupCompleted();
            case 135:
                return nestfgetadViewWrapper.writeTypedObject().IAuthTabCallback();
            case 136:
                return nestfgetadViewWrapper.writeTypedObject().onTransact();
            case 137:
                return nestfgetadViewWrapper.writeTypedObject().IAuthTabCallbackDefault();
            case 138:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().IAuthTabCallback();
            case 139:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().onExtraCallback();
            case 140:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().onNavigationEvent();
            case 141:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().onWarmupCompleted();
            case 142:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().onExtraCallbackWithResult();
            case 143:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().IAuthTabCallbackDefault();
            case 144:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().IAuthTabCallbackStub();
            case 145:
                return nestfgetadViewWrapper.ICustomTabsCallbackStub().asBinder();
            case 146:
                return nestfgetadViewWrapper.onExtraCallback().onExtraCallbackWithResult();
            case 147:
                return nestfgetadViewWrapper.ICustomTabsCallbackStubProxy().onWarmupCompleted();
            case 148:
                return nestfgetadViewWrapper.ICustomTabsCallbackStubProxy().onExtraCallbackWithResult();
            case 149:
                return nestfgetadViewWrapper.ICustomTabsCallbackStubProxy().onNavigationEvent();
            case 150:
                return nestfgetadViewWrapper.ICustomTabsCallbackStubProxy().IAuthTabCallback();
            case 151:
                return nestfgetadViewWrapper.onActivityResized().IAuthTabCallback();
            case 152:
                return nestfgetadViewWrapper.onActivityResized().onExtraCallback();
            case 153:
                return nestfgetadViewWrapper.onActivityResized().onNavigationEvent();
            case 154:
                return nestfgetadViewWrapper.onActivityResized().onExtraCallbackWithResult();
            case 155:
                return nestfgetadViewWrapper.onActivityResized().onWarmupCompleted();
            case 156:
                int iOnExtraCallback8 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((z1ExternalSyntheticLambda0) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 798647473, -798647472, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback8)).onExtraCallbackWithResult();
            case 157:
                return nestfgetadViewWrapper.onExtraCallbackWithResult().onExtraCallback();
            case 158:
                return nestfgetadViewWrapper.asInterface().onNavigationEvent();
            case 159:
                return nestfgetadViewWrapper.asInterface().onExtraCallbackWithResult();
            case 160:
                return nestfgetadViewWrapper.asInterface().onExtraCallback();
            case 161:
                return nestfgetadViewWrapper.asInterface().onWarmupCompleted();
            case 162:
                return nestfgetadViewWrapper.asInterface().IAuthTabCallback();
            case 163:
                return nestfgetadViewWrapper.onWarmupCompleted().onExtraCallbackWithResult();
            case 164:
                return nestfgetadViewWrapper.onWarmupCompleted().IAuthTabCallback();
            case 165:
                return nestfgetadViewWrapper.onWarmupCompleted().onNavigationEvent();
            case 166:
                return nestfgetadViewWrapper.onNavigationEvent().onWarmupCompleted();
            case 167:
                return nestfgetadViewWrapper.onNavigationEvent().IAuthTabCallback();
            case 168:
                Object[] objArr15 = {nestfgetadViewWrapper.onNavigationEvent()};
                int iOnExtraCallback9 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                return ((Long) y5b.onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr15, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback9, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1580134568, 1580134568)).longValue();
            case 169:
                return nestfgetadViewWrapper.onNavigationEvent().onNavigationEvent();
            case 170:
                return nestfgetadViewWrapper.onNavigationEvent().onExtraCallback();
            case 171:
                return nestfgetadViewWrapper.onNavigationEvent().asBinder();
            case 172:
                return nestfgetadViewWrapper.onNavigationEvent().IAuthTabCallbackDefault();
            case 173:
                Object[] objArr16 = {nestfgetadViewWrapper.onNavigationEvent()};
                int iOnExtraCallback10 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                return ((Long) y5b.onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), objArr16, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback10, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1359263887, 1359263888)).longValue();
            case 174:
                return nestfgetadViewWrapper.onNavigationEvent().onTransact();
            case 175:
                return nestfgetadViewWrapper.onNavigationEvent().IAuthTabCallbackStub();
            case 176:
                return nestfgetadViewWrapper.onNavigationEvent().IAuthTabCallback_Parcel();
            case 177:
                return nestfgetadViewWrapper.onNavigationEvent().access000();
            case 178:
                return nestfgetadViewWrapper.onNavigationEvent().getInterfaceDescriptor();
            case 179:
                int iOnExtraCallback11 = ICustomTabsCallbackStubProxy.onExtraCallback();
                return ((getAdError) NestfgetadViewWrapper.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 153491854, -153491850, new Object[]{nestfgetadViewWrapper}, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback11)).onNavigationEvent();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
