package o;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CarouselKtExternalSyntheticLambda13;
import o.TTBaseLandingPageActivity;
import o.TextFieldImplKtExternalSyntheticLambda5;
import o.createLayoutState;
import o.directory;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class directory implements TextFieldImplKtExternalSyntheticLambda5 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final RecomposerrunRecomposeAndApplyChanges2 IAuthTabCallback;
    private final PullToRefreshDefaultsExternalSyntheticLambda1 onExtraCallback;

    public static /* synthetic */ TextFieldImplKtExternalSyntheticLambda10 onExtraCallbackWithResult(directory directoryVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(directoryVar);
            throw null;
        }
        TextFieldImplKtExternalSyntheticLambda10 textFieldImplKtExternalSyntheticLambda10IAuthTabCallback = IAuthTabCallback(directoryVar);
        int i3 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return textFieldImplKtExternalSyntheticLambda10IAuthTabCallback;
        }
        throw null;
    }

    public directory(@NotNull PullToRefreshDefaultsExternalSyntheticLambda1 pullToRefreshDefaultsExternalSyntheticLambda1, @NotNull RecomposerrunRecomposeAndApplyChanges2 recomposerrunRecomposeAndApplyChanges2) {
        Intrinsics.checkNotNullParameter(pullToRefreshDefaultsExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(recomposerrunRecomposeAndApplyChanges2, "");
        this.onExtraCallback = pullToRefreshDefaultsExternalSyntheticLambda1;
        this.IAuthTabCallback = recomposerrunRecomposeAndApplyChanges2;
    }

    public Object onWarmupCompleted(@NotNull access13800<? super TextFieldImplKtExternalSyntheticLambda10> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallbackWithResult = getChannelIndex.onExtraCallbackWithResult(putChannelInfo.onWarmupCompleted(), new Function0() { // from class: im.toss.tds.foundation.coil.APNGDecoder$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                directory directoryVar = this.f$0;
                if (i4 == 0) {
                    return directory.onExtraCallbackWithResult(directoryVar);
                }
                directory.onExtraCallbackWithResult(directoryVar);
                throw null;
            }
        }, access13800Var);
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextFieldImplKtExternalSyntheticLambda10 IAuthTabCallback(directory directoryVar) {
        int i = 2 % 2;
        createLayoutState createlayoutstateOnExtraCallback = createLayoutState.onExtraCallbackWithResult.onExtraCallback(createLayoutState.Companion, directoryVar.onExtraCallback.asInterface().IAuthTabCallbackStubProxy(), (Integer) null, (Integer) null, 6, (Object) null);
        directoryVar.IAuthTabCallback(createlayoutstateOnExtraCallback, directoryVar.IAuthTabCallback.onNavigationEvent());
        TextFieldImplKtExternalSyntheticLambda10 textFieldImplKtExternalSyntheticLambda10 = new TextFieldImplKtExternalSyntheticLambda10(CarouselPagerStateExternalSyntheticLambda1.onNavigationEvent(createlayoutstateOnExtraCallback), false);
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return textFieldImplKtExternalSyntheticLambda10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(createLayoutState createlayoutstate, CarouselKtExternalSyntheticLambda13 carouselKtExternalSyntheticLambda13) {
        int i = 2 % 2;
        Integer numOnNavigationEvent = networkCount.onNavigationEvent(carouselKtExternalSyntheticLambda13);
        if (numOnNavigationEvent != null) {
            createlayoutstate.onExtraCallbackWithResult(numOnNavigationEvent.intValue());
            return;
        }
        Integer num = (Integer) this.IAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult(EffectsKtExternalSyntheticLambda0.onWarmupCompleted(CarouselKtExternalSyntheticLambda13.onNavigationEvent.Companion));
        if (num != null) {
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iIntValue = num.intValue();
            int i4 = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                int i5 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0 ? iIntValue != -2 : iIntValue != 110) {
                    i4 = iIntValue == -1 ? 0 : iIntValue + 1;
                }
            }
            createlayoutstate.onExtraCallbackWithResult(i4);
        }
    }

    public static final class onNavigationEvent implements TextFieldImplKtExternalSyntheticLambda5.onExtraCallback {
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        private static final TTBaseLandingPageActivity IAuthTabCallback;
        private static int IAuthTabCallbackStub = 0;
        private static final TTBaseLandingPageActivity onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static final CarouselKtExternalSyntheticLambda13.onNavigationEvent<Integer> onNavigationEvent;
        private static int onTransact = 1;
        private static int onWarmupCompleted = 1;

        public static final /* synthetic */ CarouselKtExternalSyntheticLambda13.onNavigationEvent onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 125;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            CarouselKtExternalSyntheticLambda13.onNavigationEvent<Integer> onnavigationevent = onNavigationEvent;
            int i5 = i3 + 25;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationevent;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
        
            if (IAuthTabCallback(r4.onExtraCallbackWithResult().asInterface()) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
        
            return new o.directory(r4.onExtraCallbackWithResult(), r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
        
            if (IAuthTabCallback(r4.onExtraCallbackWithResult().asInterface()) != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TextFieldImplKtExternalSyntheticLambda5 create(@NotNull ComposableSingletonsCompositionKtExternalSyntheticLambda1 composableSingletonsCompositionKtExternalSyntheticLambda1, @NotNull RecomposerrunRecomposeAndApplyChanges2 recomposerrunRecomposeAndApplyChanges2, @NotNull CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8) {
            int i = 2 % 2;
            int i2 = onTransact + 103;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(composableSingletonsCompositionKtExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(recomposerrunRecomposeAndApplyChanges2, "");
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda8, "");
            if (Intrinsics.areEqual(composableSingletonsCompositionKtExternalSyntheticLambda1.onWarmupCompleted(), "image/png")) {
                int i4 = IAuthTabCallbackStub + 119;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 51 / 0;
                }
            }
            int i6 = IAuthTabCallbackStub + 41;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 91 / 0;
            }
            return null;
        }

        private final boolean IAuthTabCallback(TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
            int i = 2 % 2;
            if (!tTAppOpenAdTransActivity.onNavigationEvent(0L, onExtraCallback)) {
                return false;
            }
            if (tTAppOpenAdTransActivity.onExtraCallback(IAuthTabCallback, r1.access100()) < 0) {
                int i2 = onTransact + 11;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = onTransact + 33;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public static final class IAuthTabCallback {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }

            public final CarouselKtExternalSyntheticLambda13.onNavigationEvent<Integer> IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 117;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return onNavigationEvent.onWarmupCompleted();
                }
                onNavigationEvent.onWarmupCompleted();
                throw null;
            }
        }

        static {
            TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
            onExtraCallback = TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10}, 0, 0, 3, (Object) null);
            IAuthTabCallback = iAuthTabCallback.IAuthTabCallback("acTL");
            onNavigationEvent = new CarouselKtExternalSyntheticLambda13.onNavigationEvent<>((Object) null);
            int i = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }
}
