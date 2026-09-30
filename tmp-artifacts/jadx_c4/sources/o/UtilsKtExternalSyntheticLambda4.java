package o;

import android.content.Context;
import im.toss.features.edoc.register.AptPasswordActivity$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TextRoundCornerProgressBarSavedState1;
import o.UtilsKtExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class UtilsKtExternalSyntheticLambda4 {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact;
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Context onNavigationEvent;
    private final Lazy onWarmupCompleted;

    static {
        int i = asBinder + 5;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallback(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        }
        asBinder(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i2));
        int i11 = ~(i7 | i9);
        int i12 = i6 | i11;
        int i13 = (~(i2 | i3)) | i11 | (~(i8 | i3));
        int i14 = i3 + i6 + i + (296844165 * i4) + (1729652556 * i5);
        int i15 = i14 * i14;
        int i16 = ((i3 * 599922083) - 580124672) + (599922083 * i6) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i) + ((-279707648) * i4) + ((-265289728) * i5) + (2117271552 * i15);
        int i17 = (i3 * (-1181628991)) + 1322814002 + (i6 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i * (-1181629109)) + (i4 * (-698251017)) + (i5 * 1773125444) + (i15 * 938541056);
        int i18 = i16 + (i17 * i17 * (-109772800));
        return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallback(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnTransact = onTransact(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        int i3 = IAuthTabCallbackStub + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnTransact;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallbackStub = IAuthTabCallbackStub(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = onTransact + 109;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1IAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onNavigationEvent(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0}, -1890633613, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1890633613);
        int i4 = onTransact + 43;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onWarmupCompleted(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        }
        IAuthTabCallbackDefault(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
        throw null;
    }

    public UtilsKtExternalSyntheticLambda4(@NotNull Context context, @NotNull final ResourceMetadata resourceMetadata, @NotNull final StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(resourceMetadata, "");
        Intrinsics.checkNotNullParameter(staticImageDecoderKtExternalSyntheticLambda0, "");
        this.onNavigationEvent = context;
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.prefs.TubaPrefs$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4 = this.f$0;
                if (i3 == 0) {
                    return UtilsKtExternalSyntheticLambda4.onWarmupCompleted(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
                }
                UtilsKtExternalSyntheticLambda4.onWarmupCompleted(utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
                throw null;
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.prefs.TubaPrefs$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent = UtilsKtExternalSyntheticLambda4.onNavigationEvent(this.f$0, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1OnNavigationEvent;
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.prefs.TubaPrefs$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 3;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = UtilsKtExternalSyntheticLambda4.onExtraCallback(this.f$0, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1OnExtraCallback;
            }
        });
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.prefs.TubaPrefs$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    UtilsKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.f$0, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.f$0, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
                int i3 = onNavigationEvent + 115;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1OnExtraCallbackWithResult;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.tuba.prefs.TubaPrefs$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = UtilsKtExternalSyntheticLambda4.IAuthTabCallback(this.f$0, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0);
                int i4 = onExtraCallback + 33;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 15 / 0;
                }
                return textRoundCornerProgressBarSavedState1IAuthTabCallback;
            }
        });
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public final TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.IAuthTabCallbackDefault.getValue();
        int i3 = IAuthTabCallbackStub + 79;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackDefault(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(utilsKtExternalSyntheticLambda4.onNavigationEvent, "Tuba_Vars", resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0, null, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 80, null);
        int i4 = onTransact + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4 = (UtilsKtExternalSyntheticLambda4) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) utilsKtExternalSyntheticLambda4.onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallbackStub + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4 = (UtilsKtExternalSyntheticLambda4) objArr[0];
        ResourceMetadata resourceMetadata = (ResourceMetadata) objArr[1];
        StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0 = (StaticImageDecoderKtExternalSyntheticLambda0) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(utilsKtExternalSyntheticLambda4.onNavigationEvent, "Tuba_Vars_ORIGIN", resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0, null, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 80, null);
        int i4 = IAuthTabCallbackStub + 83;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.IAuthTabCallback.getValue();
        if (i3 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 onTransact(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = i2 % 2 != 0 ? MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(utilsKtExternalSyntheticLambda4.onNavigationEvent, "Tuba_Triggers", resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0, null, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 19, null) : MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(utilsKtExternalSyntheticLambda4.onNavigationEvent, "Tuba_Triggers", resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0, null, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 80, null);
        int i3 = onTransact + 99;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onWarmupCompleted.getValue();
        int i4 = onTransact + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStub(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(utilsKtExternalSyntheticLambda4.onNavigationEvent, "Tuba_Triggers_Bank", resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0, null, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 80, null);
        int i4 = onTransact + 93;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4 = (UtilsKtExternalSyntheticLambda4) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) utilsKtExternalSyntheticLambda4.onExtraCallback.getValue();
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = IAuthTabCallbackStub + 65;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 asBinder(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(utilsKtExternalSyntheticLambda4.onNavigationEvent, "Tuba_Distribution_Cache", resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0, null, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 80, null);
        int i4 = onTransact + 99;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    private static final TextRoundCornerProgressBarSavedState1 asInterface(UtilsKtExternalSyntheticLambda4 utilsKtExternalSyntheticLambda4, ResourceMetadata resourceMetadata, StaticImageDecoderKtExternalSyntheticLambda0 staticImageDecoderKtExternalSyntheticLambda0) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{utilsKtExternalSyntheticLambda4, resourceMetadata, staticImageDecoderKtExternalSyntheticLambda0}, -1890633613, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1890633613);
    }

    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, 775920774, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -775920773);
    }

    public final TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{this}, 848737949, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -848737947);
    }
}
