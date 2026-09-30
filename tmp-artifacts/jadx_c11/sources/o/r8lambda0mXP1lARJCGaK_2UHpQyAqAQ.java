package o;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.view.R;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda0mXP1lARJCGaK_2UHpQyAqAQ {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static final accessisMonitoringp<y2> onWarmupCompleted = setPostviewFormatSelector.IAuthTabCallback(new Function0() { // from class: im.toss.tds.compose.component.theme.TdsColorSchemeKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted();
            }
            r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[authParams.values().length];
            try {
                iArr[authParams.BackgroundUpper.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[authParams.BackgroundDefault.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[authParams.BackgroundFloated100.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[authParams.BackgroundLower.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[authParams.BackgroundDim.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[authParams.BackgroundFloated200.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[authParams.IconWarning.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[authParams.IconDanger.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[authParams.IconSuccess.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[authParams.IconPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[authParams.IconSecondary.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[authParams.IconTertiary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[authParams.IconQuaternary.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[authParams.IconBrand.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[authParams.IconOnFill.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[authParams.IconOnFillBrand.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[authParams.IconOnFillWarning.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[authParams.IconUnselected.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[authParams.TextOnFillWarning.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[authParams.TextOnFill.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[authParams.TextWarning.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[authParams.TextSuccess.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[authParams.TextBrand.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[authParams.TextSecondary.ordinal()] = 24;
                int i = onExtraCallback + 101;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[authParams.TextStrong.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[authParams.TextDanger.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[authParams.TextPrimary.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[authParams.TextTertiary.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[authParams.TextQuaternary.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[authParams.TextOnFillBrand.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[authParams.FillBrand.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[authParams.FillBrandWeak.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[authParams.FillSuccess.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[authParams.FillSuccessWeak.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[authParams.FillWarning.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[authParams.FillWarningWeak.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[authParams.FillDanger.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[authParams.FillDangerWeak.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[authParams.FillNeutralWeak.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[authParams.FillNeutral.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[authParams.FillInverse.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[authParams.FillInverseWeak.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[authParams.FillPressed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[authParams.FillBrandHover.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[authParams.FillBrandWeakHover.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[authParams.FillBrandClearHover.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[authParams.FillNeutralWeakHover.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[authParams.FillDangerHover.ordinal()] = 48;
                int i3 = onWarmupCompleted + 1;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[authParams.FillDangerWeakHover.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[authParams.FillDangerClearHover.ordinal()] = 50;
                int i6 = onWarmupCompleted + 33;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 % 5;
                } else {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[authParams.FillHover.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[authParams.FillSuccessHover.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[authParams.FillWarningHover.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[authParams.BorderDefault.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[authParams.BorderFocusRingInner.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[authParams.BorderFocusRingOuter.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[authParams.ShadowWeak.ordinal()] = 57;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[authParams.ShadowMedium.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[authParams.ShadowTiny.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[authParams.NewShadowMedium.ordinal()] = 60;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[authParams.NewShadowStrong.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[authParams.NewShadowWeak.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = i | i5 | i4;
        int i8 = (~((~i4) | i5)) | i;
        int i9 = ~((~i) | i5);
        int i10 = i + i5 + i6 + (1132004924 * i3) + ((-2047965933) * i2);
        int i11 = i10 * i10;
        int i12 = ((1650805025 * i) - 289800192) + ((-1513965855) * i5) + ((-565098208) * i7) + (i8 * 565098208) + (565098208 * i9) + ((-2079064064) * i6) + (1823473664 * i3) + (830210048 * i2) + ((-1143341056) * i11);
        int i13 = ((i * (-767560105)) - 1188649921) + (i5 * (-767559017)) + (i7 * (-544)) + (i8 * 544) + (i9 * 544) + (i6 * (-767559561)) + (i3 * 1544553956) + (i2 * (-1468578859)) + (i11 * (-2108293120));
        int i14 = i12 + (i13 * i13 * (-2075787264));
        if (i14 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i14 != 2) {
            return IAuthTabCallback(objArr);
        }
        int i15 = 2 % 2;
        int i16 = IAuthTabCallback + 123;
        int i17 = i16 % 128;
        onExtraCallbackWithResult = i17;
        int i18 = i16 % 2;
        int i19 = i17 + 103;
        IAuthTabCallback = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ y2 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        y2 y2Var = (y2) onNavigationEvent(2054558071, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[0], -2054558069, iOnWarmupCompleted2);
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return y2Var;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        addFixedPosition addfixedpositionOnExtraCallbackWithResult = (addFixedPosition) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long jLongValue3 = ((Number) objArr[3]).longValue();
        long jLongValue4 = ((Number) objArr[4]).longValue();
        long jLongValue5 = ((Number) objArr[5]).longValue();
        long jLongValue6 = ((Number) objArr[6]).longValue();
        long jLongValue7 = ((Number) objArr[7]).longValue();
        long jLongValue8 = ((Number) objArr[8]).longValue();
        long jLongValue9 = ((Number) objArr[9]).longValue();
        long jLongValue10 = ((Number) objArr[10]).longValue();
        long jLongValue11 = ((Number) objArr[11]).longValue();
        long jLongValue12 = ((Number) objArr[12]).longValue();
        long jLongValue13 = ((Number) objArr[13]).longValue();
        long jLongValue14 = ((Number) objArr[14]).longValue();
        long jLongValue15 = ((Number) objArr[15]).longValue();
        long jLongValue16 = ((Number) objArr[16]).longValue();
        long jLongValue17 = ((Number) objArr[17]).longValue();
        long jLongValue18 = ((Number) objArr[18]).longValue();
        long jLongValue19 = ((Number) objArr[19]).longValue();
        long jLongValue20 = ((Number) objArr[20]).longValue();
        long jLongValue21 = ((Number) objArr[21]).longValue();
        long jLongValue22 = ((Number) objArr[22]).longValue();
        long jLongValue23 = ((Number) objArr[23]).longValue();
        long jLongValue24 = ((Number) objArr[24]).longValue();
        long jLongValue25 = ((Number) objArr[25]).longValue();
        long jLongValue26 = ((Number) objArr[26]).longValue();
        long jLongValue27 = ((Number) objArr[27]).longValue();
        long jLongValue28 = ((Number) objArr[28]).longValue();
        long jLongValue29 = ((Number) objArr[29]).longValue();
        long jLongValue30 = ((Number) objArr[30]).longValue();
        long jLongValue31 = ((Number) objArr[31]).longValue();
        long jLongValue32 = ((Number) objArr[32]).longValue();
        long jLongValue33 = ((Number) objArr[33]).longValue();
        long jLongValue34 = ((Number) objArr[34]).longValue();
        long jLongValue35 = ((Number) objArr[35]).longValue();
        long jLongValue36 = ((Number) objArr[36]).longValue();
        long jLongValue37 = ((Number) objArr[37]).longValue();
        long jLongValue38 = ((Number) objArr[38]).longValue();
        long jLongValue39 = ((Number) objArr[39]).longValue();
        long jLongValue40 = ((Number) objArr[40]).longValue();
        long jLongValue41 = ((Number) objArr[41]).longValue();
        long jLongValue42 = ((Number) objArr[42]).longValue();
        long jLongValue43 = ((Number) objArr[43]).longValue();
        long jLongValue44 = ((Number) objArr[44]).longValue();
        long jLongValue45 = ((Number) objArr[45]).longValue();
        long jLongValue46 = ((Number) objArr[46]).longValue();
        long jLongValue47 = ((Number) objArr[47]).longValue();
        long jLongValue48 = ((Number) objArr[48]).longValue();
        long jLongValue49 = ((Number) objArr[49]).longValue();
        long jLongValue50 = ((Number) objArr[50]).longValue();
        long jLongValue51 = ((Number) objArr[51]).longValue();
        long jLongValue52 = ((Number) objArr[52]).longValue();
        long jLongValue53 = ((Number) objArr[53]).longValue();
        long jLongValue54 = ((Number) objArr[54]).longValue();
        long jLongValue55 = ((Number) objArr[55]).longValue();
        long jLongValue56 = ((Number) objArr[56]).longValue();
        long jLongValue57 = ((Number) objArr[57]).longValue();
        long jLongValue58 = ((Number) objArr[58]).longValue();
        long jLongValue59 = ((Number) objArr[59]).longValue();
        long jLongValue60 = ((Number) objArr[60]).longValue();
        long jLongValue61 = ((Number) objArr[61]).longValue();
        long jLongValue62 = ((Number) objArr[62]).longValue();
        NestfgetadViewWrapper nestfgetadViewWrapperOnExtraCallbackWithResult = (NestfgetadViewWrapper) objArr[63];
        int iIntValue = ((Number) objArr[64]).intValue();
        int iIntValue2 = ((Number) objArr[65]).intValue();
        Object obj = objArr[66];
        int i = 2 % 2;
        if ((iIntValue & 1) != 0) {
            addfixedpositionOnExtraCallbackWithResult = onAdRemoved.onExtraCallbackWithResult();
        }
        addFixedPosition addfixedposition = addfixedpositionOnExtraCallbackWithResult;
        if ((iIntValue & 2) != 0) {
            jLongValue = AppLovinAdVideoPlaybackListener.onWarmupCompleted.asBinder();
        }
        long j = jLongValue;
        if ((iIntValue & 4) != 0) {
            jLongValue2 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onExtraCallback();
        }
        long j2 = jLongValue2;
        if ((iIntValue & 8) != 0) {
            jLongValue3 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onExtraCallbackWithResult();
        }
        long j3 = jLongValue3;
        if ((iIntValue & 16) != 0) {
            jLongValue4 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.IAuthTabCallback();
        }
        long j4 = jLongValue4;
        if ((iIntValue & 32) != 0) {
            jLongValue5 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onNavigationEvent();
        }
        long j5 = jLongValue5;
        Object obj2 = null;
        if ((iIntValue & 64) != 0) {
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                AppLovinAdVideoPlaybackListener.onWarmupCompleted.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            jLongValue6 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onWarmupCompleted();
        }
        long j6 = jLongValue6;
        if ((iIntValue & 128) != 0) {
            jLongValue7 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, 494395829, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -494395825, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j7 = jLongValue7;
        if ((iIntValue & 256) != 0) {
            jLongValue8 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsCallback_Parcel();
        }
        long j8 = jLongValue8;
        if ((iIntValue & 512) != 0) {
            jLongValue9 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.receiveFile();
        }
        long j9 = jLongValue9;
        if ((iIntValue & 1024) != 0) {
            jLongValue10 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.prefetch();
        }
        long j10 = jLongValue10;
        if ((iIntValue & 2048) != 0) {
            int i3 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            jLongValue11 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.newSessionWithExtras();
        }
        long j11 = jLongValue11;
        if ((iIntValue & 4096) != 0) {
            jLongValue12 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.requestPostMessageChannelWithExtras();
        }
        long j12 = jLongValue12;
        if ((iIntValue & 8192) != 0) {
            int i5 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                AppLovinAdVideoPlaybackListener.onWarmupCompleted.newAuthTabSession();
                throw null;
            }
            jLongValue13 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.newAuthTabSession();
        }
        long j13 = jLongValue13;
        if ((iIntValue & 16384) != 0) {
            jLongValue14 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -360594748, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 360594753, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j14 = jLongValue14;
        if ((iIntValue & 32768) != 0) {
            jLongValue15 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsService();
        }
        long j15 = jLongValue15;
        if ((iIntValue & 65536) != 0) {
            jLongValue16 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.newSession();
        }
        long j16 = jLongValue16;
        if ((131072 & iIntValue) != 0) {
            jLongValue17 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.postMessage();
        }
        long j17 = jLongValue17;
        if ((262144 & iIntValue) != 0) {
            jLongValue18 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.setEngagementSignalsCallback();
        }
        long j18 = jLongValue18;
        if ((524288 & iIntValue) != 0) {
            jLongValue19 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -509649674, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 509649683, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j19 = jLongValue19;
        if ((1048576 & iIntValue) != 0) {
            jLongValue20 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, 243089643, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -243089637, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j20 = jLongValue20;
        if ((2097152 & iIntValue) != 0) {
            jLongValue21 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.IPostMessageServiceStub();
        }
        long j21 = jLongValue21;
        if ((4194304 & iIntValue) != 0) {
            jLongValue22 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onVerticalScrollEvent();
        }
        long j22 = jLongValue22;
        if ((8388608 & iIntValue) != 0) {
            jLongValue23 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -449878337, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 449878347, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j23 = jLongValue23;
        if ((16777216 & iIntValue) != 0) {
            jLongValue24 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.IEngagementSignalsCallbackStub();
        }
        long j24 = jLongValue24;
        if ((33554432 & iIntValue) != 0) {
            jLongValue25 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onGreatestScrollPercentageIncreased();
        }
        long j25 = jLongValue25;
        if ((67108864 & iIntValue) != 0) {
            jLongValue26 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsServiceStubProxy();
        }
        long j26 = jLongValue26;
        if ((134217728 & iIntValue) != 0) {
            jLongValue27 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.IEngagementSignalsCallbackDefault();
        }
        long j27 = jLongValue27;
        if ((268435456 & iIntValue) != 0) {
            int i6 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -1015260589, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1015260600, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
                throw null;
            }
            jLongValue28 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -1015260589, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1015260600, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j28 = jLongValue28;
        if ((536870912 & iIntValue) != 0) {
            jLongValue29 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onSessionEnded();
        }
        long j29 = jLongValue29;
        if ((1073741824 & iIntValue) != 0) {
            jLongValue30 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, 1954118157, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1954118155, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j30 = jLongValue30;
        if ((iIntValue & Integer.MIN_VALUE) != 0) {
            jLongValue31 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onTransact();
        }
        long j31 = jLongValue31;
        if ((iIntValue2 & 1) != 0) {
            jLongValue32 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -803525791, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 803525791, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j32 = jLongValue32;
        if ((iIntValue2 & 2) != 0) {
            jLongValue33 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsCallbackStub();
        }
        long j33 = jLongValue33;
        if ((iIntValue2 & 4) != 0) {
            jLongValue34 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsCallbackDefault();
        }
        long j34 = jLongValue34;
        if ((iIntValue2 & 8) != 0) {
            int i7 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -1461567052, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1461567059, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
                obj2.hashCode();
                throw null;
            }
            jLongValue35 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -1461567052, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1461567059, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j35 = jLongValue35;
        if ((iIntValue2 & 16) != 0) {
            jLongValue36 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.mayLaunchUrl();
        }
        long j36 = jLongValue36;
        if ((iIntValue2 & 32) != 0) {
            jLongValue37 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.access100();
        }
        long j37 = jLongValue37;
        if ((iIntValue2 & 64) != 0) {
            jLongValue38 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.extraCallback();
        }
        long j38 = jLongValue38;
        if ((iIntValue2 & 128) != 0) {
            jLongValue39 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onActivityResized();
        }
        long j39 = jLongValue39;
        if ((iIntValue2 & 256) != 0) {
            jLongValue40 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onPostMessage();
        }
        long j40 = jLongValue40;
        if ((iIntValue2 & 512) != 0) {
            jLongValue41 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onActivityLayout();
        }
        long j41 = jLongValue41;
        if ((iIntValue2 & 1024) != 0) {
            int i8 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            jLongValue42 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onMinimized();
        }
        long j42 = jLongValue42;
        if ((iIntValue2 & 2048) != 0) {
            jLongValue43 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onUnminimized();
        }
        long j43 = jLongValue43;
        if ((iIntValue2 & 4096) != 0) {
            jLongValue44 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.getInterfaceDescriptor();
        }
        long j44 = jLongValue44;
        if ((iIntValue2 & 8192) != 0) {
            jLongValue45 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.IAuthTabCallbackStubProxy();
        }
        long j45 = jLongValue45;
        if ((iIntValue2 & 16384) != 0) {
            jLongValue46 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.access000();
        }
        long j46 = jLongValue46;
        if ((32768 & iIntValue2) != 0) {
            jLongValue47 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onMessageChannelReady();
        }
        long j47 = jLongValue47;
        if ((iIntValue2 & 65536) != 0) {
            jLongValue48 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsCallback();
        }
        long j48 = jLongValue48;
        if ((131072 & iIntValue2) != 0) {
            int i10 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            jLongValue49 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -844964567, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 844964570, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j49 = jLongValue49;
        if ((262144 & iIntValue2) != 0) {
            jLongValue50 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.readTypedObject();
        }
        long j50 = jLongValue50;
        if ((524288 & iIntValue2) != 0) {
            jLongValue51 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -1932474406, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1932474414, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j51 = jLongValue51;
        if ((1048576 & iIntValue2) != 0) {
            jLongValue52 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsCallbackStubProxy();
        }
        long j52 = jLongValue52;
        if ((2097152 & iIntValue2) != 0) {
            jLongValue53 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.isEngagementSignalsApiAvailable();
        }
        long j53 = jLongValue53;
        if ((4194304 & iIntValue2) != 0) {
            int i12 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            jLongValue54 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.asInterface();
        }
        long j54 = jLongValue54;
        if ((8388608 & iIntValue2) != 0) {
            int i14 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            jLongValue55 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.IAuthTabCallbackDefault();
        }
        long j55 = jLongValue55;
        if ((16777216 & iIntValue2) != 0) {
            jLongValue56 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.IAuthTabCallbackStub();
        }
        long j56 = jLongValue56;
        if ((33554432 & iIntValue2) != 0) {
            jLongValue57 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsServiceStub();
        }
        long j57 = jLongValue57;
        if ((67108864 & iIntValue2) != 0) {
            jLongValue58 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.ICustomTabsServiceDefault();
        }
        long j58 = jLongValue58;
        if ((134217728 & iIntValue2) != 0) {
            jLongValue59 = ((Long) AppLovinAdVideoPlaybackListener.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{AppLovinAdVideoPlaybackListener.onWarmupCompleted}, -710244353, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 710244354, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        }
        long j59 = jLongValue59;
        if ((268435456 & iIntValue2) != 0) {
            jLongValue60 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.prefetchWithMultipleUrls();
        }
        long j60 = jLongValue60;
        if ((536870912 & iIntValue2) != 0) {
            jLongValue61 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.warmup();
        }
        long j61 = jLongValue61;
        if ((1073741824 & iIntValue2) != 0) {
            jLongValue62 = AppLovinAdVideoPlaybackListener.onWarmupCompleted.validateRelationship();
        }
        long j62 = jLongValue62;
        if ((Integer.MIN_VALUE & iIntValue2) != 0) {
            int i16 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 == 0) {
                getBannerView.onExtraCallbackWithResult(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
                throw null;
            }
            nestfgetadViewWrapperOnExtraCallbackWithResult = getBannerView.onExtraCallbackWithResult(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
        }
        return IAuthTabCallback(addfixedposition, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, nestfgetadViewWrapperOnExtraCallbackWithResult);
    }

    public static final y2 IAuthTabCallback(@NotNull addFixedPosition addfixedposition, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, @NotNull NestfgetadViewWrapper nestfgetadViewWrapper) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(addfixedposition, "");
        Intrinsics.checkNotNullParameter(nestfgetadViewWrapper, "");
        y2 y2Var = new y2(addfixedposition, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, nestfgetadViewWrapper, null);
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return y2Var;
    }

    public static /* synthetic */ y2 onExtraCallbackWithResult(addFixedPosition addfixedposition, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, NestfgetadViewWrapper nestfgetadViewWrapper, int i, int i2, Object obj) {
        long jOnNavigationEvent;
        long jLongValue;
        long j63;
        long jRequestPostMessageChannel;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long j64;
        long jICustomTabsService_Parcel;
        long jLongValue5;
        long jLongValue6;
        long jIAuthTabCallback_Parcel;
        long jLongValue7;
        long jLongValue8;
        long jExtraCallbackWithResult;
        long jLongValue9;
        long jAccess000;
        long jWriteTypedObject;
        long jLongValue10;
        long jLongValue11;
        long jRequestPostMessageChannelWithExtras;
        long jLongValue12;
        int i3 = 2 % 2;
        addFixedPosition addfixedpositionIAuthTabCallback = (i & 1) != 0 ? onAdRemoved.IAuthTabCallback() : addfixedposition;
        long jAsBinder = (i & 2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.asBinder() : j;
        long jOnWarmupCompleted = (i & 4) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onWarmupCompleted() : j2;
        long jIAuthTabCallback = (i & 8) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.IAuthTabCallback() : j3;
        long jOnExtraCallbackWithResult = (i & 16) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onExtraCallbackWithResult() : j4;
        long jOnExtraCallback = (i & 32) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onExtraCallback() : j5;
        if ((i & 64) != 0) {
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            jOnNavigationEvent = AppLovinAdRewardListener.onExtraCallbackWithResult.onNavigationEvent();
        } else {
            jOnNavigationEvent = j6;
        }
        long engagementSignalsCallback = (i & 128) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.setEngagementSignalsCallback() : j7;
        if ((i & 256) != 0) {
            jLongValue = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -619771457, 619771461, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue = j8;
        }
        if ((i & 512) != 0) {
            int i6 = IAuthTabCallback + 121;
            j63 = jOnNavigationEvent;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            jRequestPostMessageChannel = AppLovinAdRewardListener.onExtraCallbackWithResult.requestPostMessageChannel();
        } else {
            j63 = jOnNavigationEvent;
            jRequestPostMessageChannel = j9;
        }
        long jPostMessage = (i & 1024) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.postMessage() : j10;
        if ((i & 2048) != 0) {
            jLongValue2 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1539836845, 1539836846, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue2 = j11;
        }
        long jPrefetchWithMultipleUrls = (i & 4096) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.prefetchWithMultipleUrls() : j12;
        long jNewSessionWithExtras = (i & 8192) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.newSessionWithExtras() : j13;
        long jICustomTabsCallback_Parcel = (i & 16384) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsCallback_Parcel() : j14;
        long jExtraCommand = (i & 32768) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.extraCommand() : j15;
        long jNewAuthTabSession = (i & 65536) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.newAuthTabSession() : j16;
        if ((i & 131072) != 0) {
            jLongValue3 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 746582986, -746582986, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue3 = j17;
        }
        long jReceiveFile = (i & 262144) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.receiveFile() : j18;
        if ((i & 524288) != 0) {
            jLongValue4 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -59582777, 59582779, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue4 = j19;
        }
        Object obj2 = null;
        if ((i & 1048576) != 0) {
            int i8 = onExtraCallbackWithResult + 43;
            j64 = jRequestPostMessageChannel;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsService_Parcel();
                obj2.hashCode();
                throw null;
            }
            jICustomTabsService_Parcel = AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsService_Parcel();
        } else {
            j64 = jRequestPostMessageChannel;
            jICustomTabsService_Parcel = j20;
        }
        long jIPostMessageServiceStub = (2097152 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.IPostMessageServiceStub() : j21;
        long jOnSessionEnded = (4194304 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onSessionEnded() : j22;
        long jAccess200 = (8388608 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.access200() : j23;
        long jIEngagementSignalsCallbackDefault = (16777216 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.IEngagementSignalsCallbackDefault() : j24;
        long jICustomTabsServiceStubProxy = (33554432 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsServiceStubProxy() : j25;
        long jOnGreatestScrollPercentageIncreased = (67108864 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onGreatestScrollPercentageIncreased() : j26;
        long jOnVerticalScrollEvent = (134217728 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onVerticalScrollEvent() : j27;
        long jIPostMessageService = (268435456 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.IPostMessageService() : j28;
        long jIEngagementSignalsCallbackStub = (536870912 & i) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.IEngagementSignalsCallbackStub() : j29;
        if ((1073741824 & i) != 0) {
            jLongValue5 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1749204687, -1749204681, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue5 = j30;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            jLongValue6 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1464128911, -1464128903, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue6 = j31;
        }
        if ((i2 & 1) != 0) {
            int i9 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                AppLovinAdRewardListener.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                throw null;
            }
            jIAuthTabCallback_Parcel = AppLovinAdRewardListener.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
        } else {
            jIAuthTabCallback_Parcel = j32;
        }
        long jICustomTabsCallbackDefault = (i2 & 2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsCallbackDefault() : j33;
        long jICustomTabsCallbackStub = (i2 & 4) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsCallbackStub() : j34;
        if ((i2 & 8) != 0) {
            jLongValue7 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1138741354, -1138741351, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue7 = j35;
        }
        if ((i2 & 16) != 0) {
            int i10 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            jLongValue8 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1620974811, 1620974816, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue8 = j36;
        }
        long interfaceDescriptor = (i2 & 32) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.getInterfaceDescriptor() : j37;
        if ((i2 & 64) != 0) {
            int i12 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                AppLovinAdRewardListener.onExtraCallbackWithResult.extraCallbackWithResult();
                throw null;
            }
            jExtraCallbackWithResult = AppLovinAdRewardListener.onExtraCallbackWithResult.extraCallbackWithResult();
        } else {
            jExtraCallbackWithResult = j38;
        }
        long jOnMessageChannelReady = (i2 & 128) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onMessageChannelReady() : j39;
        if ((i2 & 256) != 0) {
            int i13 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 877756528, -877756518, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
                obj2.hashCode();
                throw null;
            }
            jLongValue9 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 877756528, -877756518, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue9 = j40;
        }
        long jOnMinimized = (i2 & 512) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onMinimized() : j41;
        long jOnPostMessage = (i2 & 1024) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onPostMessage() : j42;
        long jOnRelationshipValidationResult = (i2 & 2048) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onRelationshipValidationResult() : j43;
        long jAccess100 = (i2 & 4096) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.access100() : j44;
        if ((i2 & 8192) != 0) {
            int i14 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            jAccess000 = AppLovinAdRewardListener.onExtraCallbackWithResult.access000();
        } else {
            jAccess000 = j45;
        }
        long jIAuthTabCallbackStubProxy = (i2 & 16384) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.IAuthTabCallbackStubProxy() : j46;
        long jOnActivityLayout = (32768 & i2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onActivityLayout() : j47;
        if ((i2 & 65536) != 0) {
            int i16 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            jWriteTypedObject = AppLovinAdRewardListener.onExtraCallbackWithResult.writeTypedObject();
        } else {
            jWriteTypedObject = j48;
        }
        long jICustomTabsCallback = (i2 & 131072) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsCallback() : j49;
        long jExtraCallback = (i2 & 262144) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.extraCallback() : j50;
        long typedObject = (i2 & 524288) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.readTypedObject() : j51;
        long jOnUnminimized = (i2 & 1048576) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onUnminimized() : j52;
        long jMayLaunchUrl = (2097152 & i2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.mayLaunchUrl() : j53;
        long jIAuthTabCallbackDefault = (4194304 & i2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.IAuthTabCallbackDefault() : j54;
        long jOnTransact = (8388608 & i2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.onTransact() : j55;
        if ((16777216 & i2) != 0) {
            jLongValue10 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -295862787, 295862794, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue10 = j56;
        }
        long jValidateRelationship = (33554432 & i2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.validateRelationship() : j57;
        if ((67108864 & i2) != 0) {
            jLongValue11 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -150235219, 150235228, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue11 = j58;
        }
        long jICustomTabsServiceDefault = (134217728 & i2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsServiceDefault() : j59;
        if ((268435456 & i2) != 0) {
            int i18 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i18 % 128;
            if (i18 % 2 != 0) {
                AppLovinAdRewardListener.onExtraCallbackWithResult.requestPostMessageChannelWithExtras();
                obj2.hashCode();
                throw null;
            }
            jRequestPostMessageChannelWithExtras = AppLovinAdRewardListener.onExtraCallbackWithResult.requestPostMessageChannelWithExtras();
        } else {
            jRequestPostMessageChannelWithExtras = j60;
        }
        if ((536870912 & i2) != 0) {
            jLongValue12 = ((Long) AppLovinAdRewardListener.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 811209426, -811209415, new Object[]{AppLovinAdRewardListener.onExtraCallbackWithResult})).longValue();
        } else {
            jLongValue12 = j61;
        }
        return onExtraCallback(addfixedpositionIAuthTabCallback, jAsBinder, jOnWarmupCompleted, jIAuthTabCallback, jOnExtraCallbackWithResult, jOnExtraCallback, j63, engagementSignalsCallback, jLongValue, j64, jPostMessage, jLongValue2, jPrefetchWithMultipleUrls, jNewSessionWithExtras, jICustomTabsCallback_Parcel, jExtraCommand, jNewAuthTabSession, jLongValue3, jReceiveFile, jLongValue4, jICustomTabsService_Parcel, jIPostMessageServiceStub, jOnSessionEnded, jAccess200, jIEngagementSignalsCallbackDefault, jICustomTabsServiceStubProxy, jOnGreatestScrollPercentageIncreased, jOnVerticalScrollEvent, jIPostMessageService, jIEngagementSignalsCallbackStub, jLongValue5, jLongValue6, jIAuthTabCallback_Parcel, jICustomTabsCallbackDefault, jICustomTabsCallbackStub, jLongValue7, jLongValue8, interfaceDescriptor, jExtraCallbackWithResult, jOnMessageChannelReady, jLongValue9, jOnMinimized, jOnPostMessage, jOnRelationshipValidationResult, jAccess100, jAccess000, jIAuthTabCallbackStubProxy, jOnActivityLayout, jWriteTypedObject, jICustomTabsCallback, jExtraCallback, typedObject, jOnUnminimized, jMayLaunchUrl, jIAuthTabCallbackDefault, jOnTransact, jLongValue10, jValidateRelationship, jLongValue11, jICustomTabsServiceDefault, jRequestPostMessageChannelWithExtras, jLongValue12, (1073741824 & i2) != 0 ? AppLovinAdRewardListener.onExtraCallbackWithResult.ICustomTabsServiceStub() : j62, (Integer.MIN_VALUE & i2) != 0 ? getBannerView.IAuthTabCallback(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null) : nestfgetadViewWrapper);
    }

    public static final y2 onExtraCallback(@NotNull addFixedPosition addfixedposition, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, @NotNull NestfgetadViewWrapper nestfgetadViewWrapper) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(addfixedposition, "");
        Intrinsics.checkNotNullParameter(nestfgetadViewWrapper, "");
        y2 y2Var = new y2(addfixedposition, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j27, j24, j25, j26, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, nestfgetadViewWrapper, null);
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return y2Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        y2 y2Var = (y2) objArr[0];
        authParams authparams = (authParams) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        Intrinsics.checkNotNullParameter(authparams, "");
        switch (onWarmupCompleted.onNavigationEvent[authparams.ordinal()]) {
            case 1:
                return Long.valueOf(y2Var.onTransact());
            case 2:
                return Long.valueOf(y2Var.onNavigationEvent());
            case 3:
                return Long.valueOf(y2Var.onWarmupCompleted());
            case 4:
                return Long.valueOf(y2Var.onExtraCallbackWithResult());
            case 5:
                long jOnExtraCallback = y2Var.onExtraCallback();
                int i2 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return Long.valueOf(jOnExtraCallback);
            case 6:
                return Long.valueOf(y2Var.IAuthTabCallback());
            case 7:
                return Long.valueOf(y2Var.ITrustedWebActivityServiceDefault());
            case 8:
                return Long.valueOf(y2Var.ITrustedWebActivityCallbackDefault());
            case 9:
                return Long.valueOf(y2Var.getSmallIconId());
            case 10:
                return Long.valueOf(y2Var.cancelNotification());
            case 11:
                int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, 1510658777, iOnWarmupCompleted, iOnWarmupCompleted2, -1510658776, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case 12:
                return Long.valueOf(y2Var.getSmallIconBitmap());
            case 13:
                return Long.valueOf(y2Var.areNotificationsEnabled());
            case 14:
                return Long.valueOf(y2Var.ITrustedWebActivityCallbackStub());
            case 15:
                int iOnWarmupCompleted3 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted4 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -602759334, iOnWarmupCompleted3, iOnWarmupCompleted4, 602759348, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return Long.valueOf(y2Var.ITrustedWebActivityService());
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                return Long.valueOf(y2Var.ITrustedWebActivityCallback_Parcel());
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                int iOnWarmupCompleted5 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted6 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -1790852836, iOnWarmupCompleted5, iOnWarmupCompleted6, 1790852843, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return Long.valueOf(y2Var.MediaBrowserCompatMediaItem());
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return Long.valueOf(y2Var.AudioAttributesImplApi21Parcelizer());
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                return Long.valueOf(y2Var.RatingCompatApi19Impl());
            case R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return Long.valueOf(y2Var.MediaSessionCompatQueueItem());
            case R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                int iOnWarmupCompleted7 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted8 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -320693169, iOnWarmupCompleted7, iOnWarmupCompleted8, 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return Long.valueOf(y2Var.RatingCompat());
            case R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return Long.valueOf(y2Var.RatingCompatStarStyle());
            case R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                return Long.valueOf(y2Var.write());
            case R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                long jAudioAttributesImplBaseParcelizer = y2Var.AudioAttributesImplBaseParcelizer();
                int i4 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return Long.valueOf(jAudioAttributesImplBaseParcelizer);
                }
                int i5 = 96 / 0;
                return Long.valueOf(jAudioAttributesImplBaseParcelizer);
            case R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                return Long.valueOf(y2Var.RatingCompat1());
            case R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return Long.valueOf(y2Var.MediaMetadataCompat());
            case R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                int iOnWarmupCompleted9 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted10 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -1159030540, iOnWarmupCompleted9, iOnWarmupCompleted10, 1159030555, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_leftRank /* 31 */:
                return Long.valueOf(y2Var.warmup());
            case R.styleable.TdsListRowV1View_leftType /* 32 */:
                int iOnWarmupCompleted11 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted12 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -980417895, iOnWarmupCompleted11, iOnWarmupCompleted12, 980417918, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_rightArrow /* 33 */:
                return Long.valueOf(y2Var.IPostMessageService());
            case R.styleable.TdsListRowV1View_rightBadgeText /* 34 */:
                return Long.valueOf(y2Var.IEngagementSignalsCallback_Parcel());
            case R.styleable.TdsListRowV1View_rightBreakEnabled /* 35 */:
                return Long.valueOf(y2Var.ITrustedWebActivityCallback());
            case R.styleable.TdsListRowV1View_rightButtonDisplay /* 36 */:
                return Long.valueOf(y2Var.IPostMessageServiceStubProxy());
            case R.styleable.TdsListRowV1View_rightButtonLabel /* 37 */:
                return Long.valueOf(y2Var.IEngagementSignalsCallback());
            case R.styleable.TdsListRowV1View_rightButtonSize /* 38 */:
                return Long.valueOf(y2Var.writeTypedList());
            case R.styleable.TdsListRowV1View_rightButtonStyle /* 39 */:
                return Long.valueOf(y2Var.IEngagementSignalsCallbackDefault());
            case R.styleable.TdsListRowV1View_rightButtonType /* 40 */:
                return Long.valueOf(y2Var.onSessionEnded());
            case R.styleable.TdsListRowV1View_rightCheckBoxChecked /* 41 */:
                return Long.valueOf(y2Var.IEngagementSignalsCallbackStub());
            case R.styleable.TdsListRowV1View_rightCheckBoxType /* 42 */:
                return Long.valueOf(y2Var.onVerticalScrollEvent());
            case R.styleable.TdsListRowV1View_rightIcon /* 43 */:
                return Long.valueOf(y2Var.IPostMessageServiceStub());
            case R.styleable.TdsListRowV1View_rightIconButtonIconColor /* 44 */:
                return Long.valueOf(y2Var.updateVisuals());
            case R.styleable.TdsListRowV1View_rightIconButtonIconUrl /* 45 */:
                return Long.valueOf(y2Var.ICustomTabsServiceStub());
            case R.styleable.TdsListRowV1View_rightIconButtonSize /* 46 */:
                return Long.valueOf(y2Var.ICustomTabsServiceDefault());
            case R.styleable.TdsListRowV1View_rightIconColor /* 47 */:
                int iOnWarmupCompleted13 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted14 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -315930479, iOnWarmupCompleted13, iOnWarmupCompleted14, 315930490, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_rightIconHeight /* 48 */:
                int iOnWarmupCompleted15 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted16 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -328674717, iOnWarmupCompleted15, iOnWarmupCompleted16, 328674727, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_rightIconWidth /* 49 */:
                int iOnWarmupCompleted17 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted18 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, 1639774791, iOnWarmupCompleted17, iOnWarmupCompleted18, -1639774783, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_rightOnButtonClick /* 50 */:
                return Long.valueOf(y2Var.access200());
            case R.styleable.TdsListRowV1View_rightOnIconButtonClick /* 51 */:
                return Long.valueOf(y2Var.onGreatestScrollPercentageIncreased());
            case R.styleable.TdsListRowV1View_rightOnIconClick /* 52 */:
                return Long.valueOf(y2Var.IEngagementSignalsCallbackStubProxy());
            case R.styleable.TdsListRowV1View_rightSwitchChecked /* 53 */:
                int iOnWarmupCompleted19 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted20 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, 1073202389, iOnWarmupCompleted19, iOnWarmupCompleted20, -1073202377, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_rightText1 /* 54 */:
                return Long.valueOf(y2Var.IAuthTabCallbackStub());
            case R.styleable.TdsListRowV1View_rightText1Color /* 55 */:
                return Long.valueOf(y2Var.asBinder());
            case R.styleable.TdsListRowV1View_rightText1MaxLines /* 56 */:
                return Long.valueOf(y2Var.asInterface());
            case R.styleable.TdsListRowV1View_rightText2 /* 57 */:
                return Long.valueOf(y2Var.AudioAttributesCompatParcelizer());
            case R.styleable.TdsListRowV1View_rightText2Color /* 58 */:
                int iOnWarmupCompleted21 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted22 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, 426223906, iOnWarmupCompleted21, iOnWarmupCompleted22, -426223887, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_rightText2MaxLines /* 59 */:
                int iOnWarmupCompleted23 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted24 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
                return Long.valueOf(((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y2Var}, -238890612, iOnWarmupCompleted23, iOnWarmupCompleted24, 238890634, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue());
            case R.styleable.TdsListRowV1View_rightType /* 60 */:
                return Long.valueOf(y2Var.RemoteActionCompatParcelizer());
            case 61:
                return Long.valueOf(y2Var.read());
            case 62:
                return Long.valueOf(y2Var.ITrustedWebActivityService_Parcel());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final long onExtraCallback(@NotNull y2 y2Var, @NotNull eExternalSyntheticLambda0 eexternalsyntheticlambda0) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        Intrinsics.checkNotNullParameter(eexternalsyntheticlambda0, "");
        long jOnExtraCallbackWithResult = getBannerView.onExtraCallbackWithResult(y2Var.IAuthTabCallbackDefault(), eexternalsyntheticlambda0);
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return jOnExtraCallbackWithResult;
    }

    static {
        int i = onNavigationEvent + 69;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static final accessisMonitoringp<y2> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final long onExtraCallback(@NotNull authParams authparams, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(authparams, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(187950463, i, -1, "im.toss.tds.compose.component.theme.<get-value> (TdsColorScheme.kt:692)");
        }
        Object[] objArr = {y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6), authparams};
        long jLongValue = ((Long) onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), objArr, -1868498688, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return jLongValue;
    }

    public static final long onWarmupCompleted(@NotNull eExternalSyntheticLambda0 eexternalsyntheticlambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eexternalsyntheticlambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(989677906, i, -1, "im.toss.tds.compose.component.theme.<get-value> (TdsColorScheme.kt:695)");
        }
        long jOnExtraCallback = onExtraCallback(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6), eexternalsyntheticlambda0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 != 0) {
                int i9 = 44 / 0;
            }
        }
        return jOnExtraCallback;
    }

    public static final long IAuthTabCallback(long j, @NotNull addFixedPosition addfixedposition) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(addfixedposition, "");
            i = 83;
        } else {
            Intrinsics.checkNotNullParameter(addfixedposition, "");
            i = 100;
        }
        return onNavigationEvent(j, addfixedposition, i);
    }

    public static final long onWarmupCompleted(long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(535356599, i, -1, "im.toss.tds.compose.component.theme.nextShade (TdsColorScheme.kt:701)");
            if (i4 == 0) {
                throw null;
            }
        }
        long jOnNavigationEvent = onNavigationEvent(j, 100, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 48);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnNavigationEvent;
    }

    public static final long onNavigationEvent(long j, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-51559373, i2, -1, "im.toss.tds.compose.component.theme.shiftShade (TdsColorScheme.kt:711)");
        }
        long jOnNavigationEvent = onNavigationEvent(j, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).ITrustedWebActivityServiceStubProxy(), i);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return jOnNavigationEvent;
    }

    public static final long onNavigationEvent(long j, @NotNull addFixedPosition addfixedposition, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(addfixedposition, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(addfixedposition, "");
        if (j == 16) {
            int i4 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return setByteOrder.Companion.onTransact();
            }
            setByteOrder.Companion.onTransact();
            obj.hashCode();
            throw null;
        }
        getRepeatingInterval getrepeatinginterval = (getRepeatingInterval) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{addfixedposition, Long.valueOf(j)}, -1496133642, OverseasRrnInputTextField.IAuthTabCallback(), 1496133653);
        if (getrepeatinginterval != null) {
            return getrepeatinginterval.IAuthTabCallback(j, i);
        }
        int i5 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    private static final y2 onExtraCallback() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (y2) onNavigationEvent(2054558071, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[0], -2054558069, iOnWarmupCompleted2);
    }

    public static final long onWarmupCompleted(@NotNull y2 y2Var, @NotNull authParams authparams) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Long) onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[]{y2Var, authparams}, -1868498688, iOnWarmupCompleted2)).longValue();
    }

    public static /* synthetic */ y2 IAuthTabCallback(addFixedPosition addfixedposition, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, NestfgetadViewWrapper nestfgetadViewWrapper, int i, int i2, Object obj) {
        Object[] objArr = {addfixedposition, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14), Long.valueOf(j15), Long.valueOf(j16), Long.valueOf(j17), Long.valueOf(j18), Long.valueOf(j19), Long.valueOf(j20), Long.valueOf(j21), Long.valueOf(j22), Long.valueOf(j23), Long.valueOf(j24), Long.valueOf(j25), Long.valueOf(j26), Long.valueOf(j27), Long.valueOf(j28), Long.valueOf(j29), Long.valueOf(j30), Long.valueOf(j31), Long.valueOf(j32), Long.valueOf(j33), Long.valueOf(j34), Long.valueOf(j35), Long.valueOf(j36), Long.valueOf(j37), Long.valueOf(j38), Long.valueOf(j39), Long.valueOf(j40), Long.valueOf(j41), Long.valueOf(j42), Long.valueOf(j43), Long.valueOf(j44), Long.valueOf(j45), Long.valueOf(j46), Long.valueOf(j47), Long.valueOf(j48), Long.valueOf(j49), Long.valueOf(j50), Long.valueOf(j51), Long.valueOf(j52), Long.valueOf(j53), Long.valueOf(j54), Long.valueOf(j55), Long.valueOf(j56), Long.valueOf(j57), Long.valueOf(j58), Long.valueOf(j59), Long.valueOf(j60), Long.valueOf(j61), Long.valueOf(j62), nestfgetadViewWrapper, Integer.valueOf(i), Integer.valueOf(i2), obj};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (y2) onNavigationEvent(1976743403, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1976743403, iOnWarmupCompleted2);
    }
}
