package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.SubcomposeAsyncImageKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GifDecoderExternalSyntheticLambda0 {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact = 1;
    private final RealWeakMemoryCache IAuthTabCallback;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallback;
    private final RealStrongMemoryCache onExtraCallbackWithResult;
    private final List<RealWeakMemoryCacheInternalValue> onNavigationEvent;
    private final Context onWarmupCompleted;

    static {
        int i = onTransact + 1;
        asBinder = i % 128;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent;
        int i7 = ~i;
        int i8 = ~((~i6) | i7);
        int i9 = ~i2;
        int i10 = ~(i9 | i);
        int i11 = ~(i7 | i2);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i6);
        int i14 = (~(i6 | i7)) | i10 | i11;
        int i15 = i2 + i + i4 + (2052055731 * i5) + (1687666023 * i3);
        int i16 = i15 * i15;
        int i17 = (i2 * (-1966771951)) + 1000013824 + ((-1966771951) * i) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i4) + (632946688 * i5) + ((-741212160) * i3) + (2121465856 * i16);
        int i18 = (i2 * 1533266457) + 1248777597 + (i * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (i4 * 1533266057) + (i5 * 706030027) + (i3 * 1023530015) + (i16 * (-2088042496));
        int i19 = i17 + (i18 * i18 * 1434255360);
        if (i19 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i19 == 2) {
            return onWarmupCompleted(objArr);
        }
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent2 = (SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent) objArr[3];
        TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState = (TextRoundCornerProgressBarSavedState) objArr[4];
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1 = (MemoryCacheBuilderExternalSyntheticLambda1) objArr[5];
        Function1<? super BaseRoundCornerProgressBar, Unit> function1 = (Function1) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        Object obj = objArr[8];
        int i20 = 2 % 2;
        int i21 = asInterface + 107;
        int i22 = i21 % 128;
        IAuthTabCallbackDefault = i22;
        int i23 = i21 % 2;
        if ((iIntValue & 4) != 0) {
            int i24 = i22 + 115;
            asInterface = i24 % 128;
            int i25 = i24 % 2;
            onnavigationevent = null;
        } else {
            onnavigationevent = onnavigationevent2;
        }
        if ((iIntValue & 8) != 0) {
            textRoundCornerProgressBarSavedState = null;
        }
        return gifDecoderExternalSyntheticLambda0.onWarmupCompleted(context, str, onnavigationevent, textRoundCornerProgressBarSavedState, (iIntValue & 16) != 0 ? MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT : memoryCacheBuilderExternalSyntheticLambda1, (iIntValue & 32) != 0 ? null : function1);
    }

    public GifDecoderExternalSyntheticLambda0(@NotNull Context context, @NotNull RealStrongMemoryCache realStrongMemoryCache, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(realStrongMemoryCache, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onWarmupCompleted = context;
        this.onExtraCallbackWithResult = realStrongMemoryCache;
        this.onExtraCallback = textRoundCornerProgressBarSavedState1;
        this.onNavigationEvent = CollectionsKt.listOf(new RealWeakMemoryCacheInternalValue[]{new NetworkFetcherFactoryExternalSyntheticLambda0(), new RealWeakMemoryCacheCompanion(), new ConnectivityCheckerExternalSyntheticLambda0(), new NetworkFetcherFactoryExternalSyntheticLambda1(), new isOnline()});
        this.IAuthTabCallback = new RealWeakMemoryCache();
    }

    public static final /* synthetic */ void IAuthTabCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, String str, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        gifDecoderExternalSyntheticLambda0.onWarmupCompleted(str, i);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallbackDefault + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = gifDecoderExternalSyntheticLambda0.onExtraCallbackWithResult(str);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 107;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, String str, int i, boolean z, MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, Function1 function1, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallbackDefault + 105;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            i = -99;
        }
        int i6 = i;
        if ((i2 & 4) != 0) {
            int i7 = asInterface + 47;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            int i9 = IAuthTabCallbackDefault + 125;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda12 = MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT;
                throw null;
            }
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT;
        }
        return gifDecoderExternalSyntheticLambda0.IAuthTabCallback(str, i6, z2, memoryCacheBuilderExternalSyntheticLambda1, (i2 & 16) != 0 ? null : function1);
    }

    public static final class onExtraCallback implements TextRoundCornerProgressBarSavedState {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String onExtraCallback;

        onExtraCallback(String str) {
            this.onExtraCallback = str;
        }

        @Override // o.TextRoundCornerProgressBarSavedState
        public void onNavigationEvent(String str, Throwable th) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(th, "");
            int iIntValue = ((Integer) GifDecoderExternalSyntheticLambda0.onExtraCallback(-75654560, 75654562, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{GifDecoderExternalSyntheticLambda0.this, this.onExtraCallback}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback())).intValue();
            if (iIntValue == 2) {
                int i2 = onNavigationEvent + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                GifDecoderExternalSyntheticLambda0.IAuthTabCallback(GifDecoderExternalSyntheticLambda0.this, this.onExtraCallback, 3);
            } else {
                GifDecoderExternalSyntheticLambda0.IAuthTabCallback(GifDecoderExternalSyntheticLambda0.this, this.onExtraCallback, 1);
                int i4 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("TossKeyStore", "[PrefsFactory] onCipherError - '" + this.onExtraCallback + "' with tag '" + str + "')", th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("originalStatus", Integer.valueOf(iIntValue)), getWrite.IAuthTabCallback("updatedStatus", Integer.valueOf(((Integer) GifDecoderExternalSyntheticLambda0.onExtraCallback(-75654560, 75654562, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{GifDecoderExternalSyntheticLambda0.this, this.onExtraCallback}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback())).intValue()))}));
        }
    }

    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback(@NotNull String str, int i, boolean z, @NotNull MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, @Nullable Function1<? super BaseRoundCornerProgressBar, Unit> function1) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memoryCacheBuilderExternalSyntheticLambda1, "");
        onExtraCallback onextracallback = new onExtraCallback(str);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(onExtraCallback(str, i, z, memoryCacheBuilderExternalSyntheticLambda1, function1, onextracallback));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            try {
                Result.Companion companion3 = kotlin.Result.Companion;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[PrefsFactory] Restore target '" + str + "'", th2, (Map) null, 8, (Object) null);
                if (!onExtraCallbackWithResult(str, th2)) {
                    throw th2;
                }
                onWarmupCompleted(str, 2);
                obj = kotlin.Result.constructor-impl(onExtraCallback(str, i, z, memoryCacheBuilderExternalSyntheticLambda1, function1, onextracallback));
            } catch (Throwable th3) {
                Result.Companion companion4 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th3));
            }
        }
        Throwable th4 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th4 != null) {
            if (th4 instanceof RealMemoryCache) {
                throw th4;
            }
            int i3 = asInterface + 41;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z2 = th4 instanceof RealStrongMemoryCachecache1;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (th4 instanceof RealStrongMemoryCachecache1) {
                throw th4;
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[PrefsFactory] Fallback to stable generation, target '" + str + "'", th4, (Map) null, 8, (Object) null);
            this.IAuthTabCallback.onWarmupCompleted(this.onWarmupCompleted, str, th4);
            onWarmupCompleted(str, -2);
            obj = (TextRoundCornerProgressBarSavedState1) onExtraCallback(-1614327165, 1614327165, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{this, this.onWarmupCompleted, str, this.onExtraCallbackWithResult.onWarmupCompleted(str), null, memoryCacheBuilderExternalSyntheticLambda1, function1, 8, null}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
            int i4 = asInterface + 35;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 5;
            }
        }
        return (TextRoundCornerProgressBarSavedState1) obj;
    }

    private final TextRoundCornerProgressBarSavedState1 onExtraCallback(String str, int i, boolean z, MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, Function1<? super BaseRoundCornerProgressBar, Unit> function1, TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState) throws Throwable {
        int i2 = 2 % 2;
        IAuthTabCallback(str);
        SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onNavigationEvent = RealStrongMemoryCache.onNavigationEvent(this.onExtraCallbackWithResult, str, 0, i, z, 2, null);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted, str, onNavigationEvent, textRoundCornerProgressBarSavedState, memoryCacheBuilderExternalSyntheticLambda1, function1);
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (iOnExtraCallbackWithResult != -2) {
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 23;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (iOnExtraCallbackWithResult == -1) {
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[PrefsFactory] Prefs('" + str + "') initialized with cipher '" + onNavigationEvent.IAuthTabCallback() + "'", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("originalGeneration", Integer.valueOf(i)), getWrite.IAuthTabCallback("forceOriginalGeneration", Boolean.valueOf(z))}), (String) null, false, (String) null, 56, (Object) null);
                onWarmupCompleted(str, 0);
            } else if (iOnExtraCallbackWithResult != 0) {
                int i5 = i3 + 29;
                asInterface = i5 % 128;
                if (i5 % 2 != 0 ? iOnExtraCallbackWithResult != 2 : iOnExtraCallbackWithResult != 5) {
                    int i6 = i3 + 107;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnExtraCallbackWithResult == 3) {
                        throw new ExifOrientationStrategyExternalSyntheticLambda1("Unrecoverable error after workaround in Prefs '" + str + "'.");
                    }
                    throw new onPostProcess("Invalid status flag(" + iOnExtraCallbackWithResult + ") detected in Prefs '" + str + "'.");
                }
            }
        }
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        String str = (String) objArr[1];
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1 = (MemoryCacheBuilderExternalSyntheticLambda1) objArr[2];
        Function1<? super BaseRoundCornerProgressBar, Unit> function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 2) != 0) {
            int i5 = i3 + 77;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT;
                int i6 = 26 / 0;
            } else {
                memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT;
            }
        }
        if ((iIntValue & 4) != 0) {
            int i7 = asInterface + 73;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 0;
            }
            function1 = null;
        }
        return gifDecoderExternalSyntheticLambda0.onExtraCallback(str, memoryCacheBuilderExternalSyntheticLambda1, function1);
    }

    public final TextRoundCornerProgressBarSavedState1 onExtraCallback(@NotNull String str, @NotNull MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, @Nullable Function1<? super BaseRoundCornerProgressBar, Unit> function1) throws ResourceIntMapper, RealStrongMemoryCachecache1 {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(memoryCacheBuilderExternalSyntheticLambda1, "");
            return onWarmupCompleted(this.onWarmupCompleted, str, this.onExtraCallbackWithResult.onExtraCallback(str), null, memoryCacheBuilderExternalSyntheticLambda1, function1);
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memoryCacheBuilderExternalSyntheticLambda1, "");
        onWarmupCompleted(this.onWarmupCompleted, str, this.onExtraCallbackWithResult.onExtraCallback(str), null, memoryCacheBuilderExternalSyntheticLambda1, function1);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, String str, int i, MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, Function1 function1, int i2, Object obj) {
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 4) != 0) {
            int i4 = asInterface + 123;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda12 = MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT;
                obj2.hashCode();
                throw null;
            }
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT;
        }
        if ((i2 & 8) != 0) {
            int i5 = IAuthTabCallbackDefault + 21;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            function1 = null;
        }
        return gifDecoderExternalSyntheticLambda0.onWarmupCompleted(str, i, memoryCacheBuilderExternalSyntheticLambda1, function1);
    }

    @Deprecated
    public final TextRoundCornerProgressBarSavedState1 onWarmupCompleted(@NotNull String str, int i, @NotNull MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, @Nullable Function1<? super BaseRoundCornerProgressBar, Unit> function1) throws RealMemoryCache, ResourceIntMapper, RealStrongMemoryCachecache1 {
        Object objOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 19;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(memoryCacheBuilderExternalSyntheticLambda1, "");
            Object[] objArr = {this, this.onWarmupCompleted, str, this.onExtraCallbackWithResult.onExtraCallback(str, i), null, memoryCacheBuilderExternalSyntheticLambda1, function1, 79, null};
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = onExtraCallback(-1614327165, 1614327165, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(memoryCacheBuilderExternalSyntheticLambda1, "");
            Object[] objArr2 = {this, this.onWarmupCompleted, str, this.onExtraCallbackWithResult.onExtraCallback(str, i), null, memoryCacheBuilderExternalSyntheticLambda1, function1, 8, null};
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = onExtraCallback(-1614327165, 1614327165, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr2, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    private final TextRoundCornerProgressBarSavedState1 onWarmupCompleted(Context context, String str, SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState, MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, Function1<? super BaseRoundCornerProgressBar, Unit> function1) {
        int i = 2 % 2;
        BaseRoundCornerProgressBar baseRoundCornerProgressBar = new BaseRoundCornerProgressBar(context, str, 0);
        if (onnavigationevent != null) {
            int i2 = IAuthTabCallbackDefault + 95;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            baseRoundCornerProgressBar.onWarmupCompleted(onnavigationevent.onWarmupCompleted(), textRoundCornerProgressBarSavedState);
            baseRoundCornerProgressBar.onExtraCallback(onnavigationevent.onExtraCallbackWithResult(), textRoundCornerProgressBarSavedState);
        }
        if (function1 != null) {
            function1.invoke(baseRoundCornerProgressBar);
        }
        drawSecondaryProgress drawsecondaryprogress = new drawSecondaryProgress(baseRoundCornerProgressBar, new getProgressBackgroundColor(ALCEyeBlink.onExtraCallback()));
        if (memoryCacheBuilderExternalSyntheticLambda1 != MemoryCacheBuilderExternalSyntheticLambda1.NONE) {
            int i4 = asInterface + 7;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallbackWithResult().put(drawsecondaryprogress, memoryCacheBuilderExternalSyntheticLambda1);
        }
        if (memoryCacheBuilderExternalSyntheticLambda1 == MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT) {
            MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback().add(str);
        }
        return drawsecondaryprogress;
    }

    private final void IAuthTabCallback(String str) throws Throwable {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (iOnExtraCallbackWithResult != -2) {
            int i2 = asInterface;
            int i3 = i2 + 87;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (iOnExtraCallbackWithResult == -1 || iOnExtraCallbackWithResult == 0) {
                return;
            }
            int i5 = i2 + 87;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                if (iOnExtraCallbackWithResult == 2) {
                    return;
                }
            } else if (iOnExtraCallbackWithResult == 2) {
                return;
            }
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[PrefsFactory] Abnormal status flag(" + iOnExtraCallbackWithResult + ") detected in Prefs '" + str + "'.", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            if (iOnExtraCallbackWithResult == 1) {
                throw new UtilsKtExternalSyntheticLambda1("Crypto operation exception detected in Prefs '" + str + "'.");
            }
            int i6 = asInterface + 111;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0 ? iOnExtraCallbackWithResult == 3 : iOnExtraCallbackWithResult == 2) {
                throw new ExifOrientationStrategyExternalSyntheticLambda1("Unrecoverable error after workaround in Prefs '" + str + "'.");
            }
            throw new UtilsKtExternalSyntheticLambda0("Unknown status flag(" + iOnExtraCallbackWithResult + ") detected in Prefs '" + str + "'.");
        }
    }

    private final String onExtraCallback(String str) {
        int i = 2 % 2;
        String str2 = str + "_status_flag";
        int i2 = IAuthTabCallbackDefault + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.onWarmupCompleted(onExtraCallback(str), -1);
            throw null;
        }
        int iOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(onExtraCallback(str), -1);
        int i3 = asInterface + 103;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return iOnWarmupCompleted;
    }

    private final void onWarmupCompleted(String str, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 87;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback.onExtraCallback(onExtraCallback(str), i, true);
        int i5 = asInterface + 99;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private final boolean onExtraCallbackWithResult(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0 ? onExtraCallbackWithResult(str) == 3 : onExtraCallbackWithResult(str) == 2) {
            return false;
        }
        List<RealWeakMemoryCacheInternalValue> list = this.onNavigationEvent;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i3 = asInterface + 111;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                arrayList.add(Boolean.valueOf(((RealWeakMemoryCacheInternalValue) it.next()).onWarmupCompleted(this.onWarmupCompleted, str, th)));
                throw null;
            }
            arrayList.add(Boolean.valueOf(((RealWeakMemoryCacheInternalValue) it.next()).onWarmupCompleted(this.onWarmupCompleted, str, th)));
            int i4 = IAuthTabCallbackDefault + 93;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int i6 = IAuthTabCallbackDefault + 31;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (!(!((Boolean) it2.next()).booleanValue())) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ int onNavigationEvent(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, String str) {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return ((Integer) onExtraCallback(-75654560, 75654562, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, str}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback)).intValue();
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, String str, MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, Function1 function1, int i, Object obj) {
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, str, memoryCacheBuilderExternalSyntheticLambda1, function1, Integer.valueOf(i), obj};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
    }

    static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, Context context, String str, SubcomposeAsyncImageKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextRoundCornerProgressBarSavedState textRoundCornerProgressBarSavedState, MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1, Function1 function1, int i, Object obj) {
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, context, str, onnavigationevent, textRoundCornerProgressBarSavedState, memoryCacheBuilderExternalSyntheticLambda1, function1, Integer.valueOf(i), obj};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(-1614327165, 1614327165, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
    }
}
