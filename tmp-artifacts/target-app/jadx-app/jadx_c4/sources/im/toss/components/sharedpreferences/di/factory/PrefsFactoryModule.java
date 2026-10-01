package im.toss.components.sharedpreferences.di.factory;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BaseRoundCornerProgressBar;
import o.ConvertFloatArrayToByteArray;
import o.GifDecoderExternalSyntheticLambda0;
import o.MemoryCacheBuilderExternalSyntheticLambda0;
import o.RealStrongMemoryCache;
import o.SubcomposeAsyncImageKtExternalSyntheticLambda0;
import o.TextRoundCornerProgressBarSavedState;
import o.TextRoundCornerProgressBarSavedState1;
import o.getMax;
import o.getProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PrefsFactoryModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final PrefsFactoryModule onNavigationEvent = new PrefsFactoryModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 113;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(BaseRoundCornerProgressBar baseRoundCornerProgressBar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(baseRoundCornerProgressBar);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseRoundCornerProgressBar);
        int i3 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private PrefsFactoryModule() {
    }

    @Singleton
    public final GifDecoderExternalSyntheticLambda0 onExtraCallback(@NotNull Context context, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull RealStrongMemoryCache realStrongMemoryCache) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(realStrongMemoryCache, "");
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = new GifDecoderExternalSyntheticLambda0(context, realStrongMemoryCache, textRoundCornerProgressBarSavedState1);
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return gifDecoderExternalSyntheticLambda0;
    }

    @Singleton
    public final RealStrongMemoryCache onExtraCallback(@NotNull Context context, @NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull SubcomposeAsyncImageKtExternalSyntheticLambda0 subcomposeAsyncImageKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(subcomposeAsyncImageKtExternalSyntheticLambda0, "");
        RealStrongMemoryCache realStrongMemoryCache = new RealStrongMemoryCache(context, textRoundCornerProgressBarSavedState1, subcomposeAsyncImageKtExternalSyntheticLambda0);
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return realStrongMemoryCache;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onNavigationEvent(@NotNull Context context, @NotNull getProgressColor getprogresscolor, @NotNull getMax getmax) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getprogresscolor, "");
        Intrinsics.checkNotNullParameter(getmax, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = MemoryCacheBuilderExternalSyntheticLambda0.onExtraCallback(context, "PrefsCipherMetaStore", getprogresscolor, getmax, new onExtraCallback(), null, new Function1() { // from class: im.toss.components.sharedpreferences.di.factory.PrefsFactoryModule$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 29;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = PrefsFactoryModule.onNavigationEvent((BaseRoundCornerProgressBar) obj);
                if (i4 == 0) {
                    int i5 = 8 / 0;
                }
                return unitOnNavigationEvent;
            }
        }, 32, null);
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public static final class onExtraCallback implements TextRoundCornerProgressBarSavedState {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallback() {
        }

        @Override // o.TextRoundCornerProgressBarSavedState
        public void onNavigationEvent(String str, Throwable th) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(th, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[PrefsMetaStore] onCipherError " + str, th, (Map) null, 8, (Object) null);
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    private static final Unit onExtraCallbackWithResult(BaseRoundCornerProgressBar baseRoundCornerProgressBar) {
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseRoundCornerProgressBar, "");
        if (baseRoundCornerProgressBar.getInt("__pf_meta_version__", 0) == 0) {
            int i2 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SharedPreferences sharedPreferencesOnNavigationEvent = baseRoundCornerProgressBar.onNavigationEvent();
            SharedPreferences.Editor editorEdit = baseRoundCornerProgressBar.edit();
            SharedPreferences.Editor editorEdit2 = sharedPreferencesOnNavigationEvent.edit();
            Map<String, ?> all = sharedPreferencesOnNavigationEvent.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                int i4 = IAuthTabCallback + 39;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    Map.Entry<String, ?> next = it.next();
                    next.getKey();
                    next.getValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Map.Entry<String, ?> next2 = it.next();
                String key = next2.getKey();
                Object value = next2.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                editorEdit.putString(key, string);
                editorEdit2.remove(next2.getKey());
            }
            editorEdit2.apply();
            editorEdit.putInt("__pf_meta_version__", 1);
            editorEdit.apply();
            int i5 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }
}
