package im.toss.di;

import com.google.android.gms.internal.ads.zzaq;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.GifDecoderExternalSyntheticLambda0;
import o.RealSubcomposeAsyncImageScope;
import o.ResourceUriFetcherFactory;
import o.TextRoundCornerProgressBarSavedState1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PrefsModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final PrefsModule onWarmupCompleted = new PrefsModule();

    static {
        int i = onExtraCallback + 53;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i11 = ~i;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i2;
        int i14 = i4 + i2 + i5 + ((-700610695) * i3) + ((-1151578525) * i6);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i4) + 1030029312 + ((-1366800679) * i2) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i5) + ((-665714688) * i3) + (367394816 * i6) + (374145024 * i15);
        int i17 = ((i4 * 323709325) - 650539883) + (i2 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i5 * 323709601) + (i3 * (-499299047)) + (i6 * 1568885315) + (i15 * (-395509760));
        switch (i16 + (i17 * i17 * (-772603904))) {
            case 1:
                ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[1];
                int i18 = 2 % 2;
                int i19 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnMinimized = resourceUriFetcherFactory.onMinimized();
                int i21 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                return textRoundCornerProgressBarSavedState1OnMinimized;
            case 2:
                ResourceUriFetcherFactory resourceUriFetcherFactory2 = (ResourceUriFetcherFactory) objArr[1];
                int i23 = 2 % 2;
                int i24 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i24 % 128;
                int i25 = i24 % 2;
                Intrinsics.checkNotNullParameter(resourceUriFetcherFactory2, "");
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -306003695, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 306003722, new Object[]{resourceUriFetcherFactory2});
                int i26 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i26 % 128;
                int i27 = i26 % 2;
                return textRoundCornerProgressBarSavedState1;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) objArr[1];
                int i28 = 2 % 2;
                int i29 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i29 % 128;
                int i30 = i29 % 2;
                Intrinsics.checkNotNullParameter(realSubcomposeAsyncImageScope, "");
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = realSubcomposeAsyncImageScope.onExtraCallback();
                int i31 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i31 % 128;
                int i32 = i31 % 2;
                return textRoundCornerProgressBarSavedState1OnExtraCallback;
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return onWarmupCompleted(objArr);
            case 8:
                return onNavigationEvent(objArr);
            default:
                ResourceUriFetcherFactory resourceUriFetcherFactory3 = (ResourceUriFetcherFactory) objArr[1];
                int i33 = 2 % 2;
                int i34 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i34 % 128;
                int i35 = i34 % 2;
                Intrinsics.checkNotNullParameter(resourceUriFetcherFactory3, "");
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnActivityResized = resourceUriFetcherFactory3.onActivityResized();
                int i36 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i36 % 128;
                int i37 = i36 % 2;
                return textRoundCornerProgressBarSavedState1OnActivityResized;
        }
    }

    private PrefsModule() {
    }

    @Singleton
    public final ResourceUriFetcherFactory onWarmupCompleted(@NotNull GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gifDecoderExternalSyntheticLambda0, "");
        ResourceUriFetcherFactory resourceUriFetcherFactory = new ResourceUriFetcherFactory(gifDecoderExternalSyntheticLambda0);
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return resourceUriFetcherFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            resourceUriFetcherFactory.ICustomTabsService();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsService = resourceUriFetcherFactory.ICustomTabsService();
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1ICustomTabsService;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsCallbackStubProxy;
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            textRoundCornerProgressBarSavedState1ICustomTabsCallbackStubProxy = resourceUriFetcherFactory.ICustomTabsCallbackStubProxy();
            int i3 = 69 / 0;
        } else {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            textRoundCornerProgressBarSavedState1ICustomTabsCallbackStubProxy = resourceUriFetcherFactory.ICustomTabsCallbackStubProxy();
        }
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1ICustomTabsCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 getInterfaceDescriptor(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access000 = resourceUriFetcherFactory.access000();
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1Access000;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onTransact(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            resourceUriFetcherFactory.IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallbackDefault = resourceUriFetcherFactory.IAuthTabCallbackDefault();
        int i3 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1IAuthTabCallbackDefault;
        }
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 newAuthTabSession(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.requestPostMessageChannel();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        resourceUriFetcherFactory.requestPostMessageChannel();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 prefetchWithMultipleUrls(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.IEngagementSignalsCallbackDefault();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        resourceUriFetcherFactory.IEngagementSignalsCallbackDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 newSessionWithExtras(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 engagementSignalsCallback = resourceUriFetcherFactory.setEngagementSignalsCallback();
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return engagementSignalsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 requestPostMessageChannelWithExtras(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            resourceUriFetcherFactory.IEngagementSignalsCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackStub = resourceUriFetcherFactory.IEngagementSignalsCallbackStub();
        int i3 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
        return textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackStub;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 receiveFile(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            resourceUriFetcherFactory.ICustomTabsServiceStubProxy();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsServiceStubProxy = resourceUriFetcherFactory.ICustomTabsServiceStubProxy();
        int i3 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1ICustomTabsServiceStubProxy;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ValidateRelationship = resourceUriFetcherFactory.validateRelationship();
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1ValidateRelationship;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback_Parcel(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1050120187, iOnExtraCallback, 1050120188, new Object[]{resourceUriFetcherFactory});
        int i4 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.prefetchWithMultipleUrls();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        resourceUriFetcherFactory.prefetchWithMultipleUrls();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStubProxy(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -994495188, iOnExtraCallback, 994495216, new Object[]{resourceUriFetcherFactory});
        int i4 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 access100(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallbackStubProxy = resourceUriFetcherFactory.IAuthTabCallbackStubProxy();
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -339593442, iOnExtraCallback, 339593477, new Object[]{resourceUriFetcherFactory});
        int i4 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onPostMessage(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1253848547, iOnExtraCallback, -1253848521, new Object[]{resourceUriFetcherFactory});
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackStub(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ExtraCommand = resourceUriFetcherFactory.extraCommand();
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1ExtraCommand;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 prefetch(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RequestPostMessageChannelWithExtras = resourceUriFetcherFactory.requestPostMessageChannelWithExtras();
        int i4 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1RequestPostMessageChannelWithExtras;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 extraCommand(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IsEngagementSignalsApiAvailable = resourceUriFetcherFactory.isEngagementSignalsApiAvailable();
        int i4 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return textRoundCornerProgressBarSavedState1IsEngagementSignalsApiAvailable;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onActivityResized(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.onMessageChannelReady();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        resourceUriFetcherFactory.onMessageChannelReady();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onMessageChannelReady(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.onActivityLayout();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        resourceUriFetcherFactory.onActivityLayout();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 asBinder(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallbackStub = resourceUriFetcherFactory.IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallbackStub;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 interfaceDescriptor = resourceUriFetcherFactory.getInterfaceDescriptor();
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return interfaceDescriptor;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 mayLaunchUrl(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1320628468, iOnExtraCallback, 1320628473, new Object[]{resourceUriFetcherFactory});
            int i3 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1320628468, iOnExtraCallback2, 1320628473, new Object[]{resourceUriFetcherFactory});
        }
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 isEngagementSignalsApiAvailable(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1285944127, iOnExtraCallback, -1285944114, new Object[]{resourceUriFetcherFactory});
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackStubProxy(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MayLaunchUrl = resourceUriFetcherFactory.mayLaunchUrl();
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return textRoundCornerProgressBarSavedState1MayLaunchUrl;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onUnminimized(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -987761047, iOnExtraCallback, 987761061, new Object[]{resourceUriFetcherFactory});
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 asInterface(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = resourceUriFetcherFactory.IAuthTabCallback();
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 extraCallback(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -320476741, iOnExtraCallback, 320476752, new Object[]{resourceUriFetcherFactory});
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = resourceUriFetcherFactory.onExtraCallback();
        int i4 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 setEngagementSignalsCallback(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access200 = resourceUriFetcherFactory.access200();
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1Access200;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 warmup(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 551107339, iOnExtraCallback2, -551107332, new Object[]{resourceUriFetcherFactory});
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 postMessage(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.ICustomTabsService_Parcel();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        resourceUriFetcherFactory.ICustomTabsService_Parcel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackDefault(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnTransact = resourceUriFetcherFactory.onTransact();
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnTransact;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallback(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            resourceUriFetcherFactory.IAuthTabCallback_Parcel();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback_Parcel = resourceUriFetcherFactory.IAuthTabCallback_Parcel();
        int i3 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1IAuthTabCallback_Parcel;
        }
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onMinimized(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.onUnminimized();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int i3 = 57 / 0;
        return resourceUriFetcherFactory.onUnminimized();
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 readTypedObject(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            return resourceUriFetcherFactory.writeTypedObject();
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        resourceUriFetcherFactory.writeTypedObject();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onRelationshipValidationResult(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsCallbackDefault = resourceUriFetcherFactory.ICustomTabsCallbackDefault();
        int i4 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1ICustomTabsCallbackDefault;
        }
        throw null;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onWarmupCompleted(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = resourceUriFetcherFactory.onWarmupCompleted();
        int i4 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 requestPostMessageChannel(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1367725844, iOnExtraCallback, 1367725875, new Object[]{resourceUriFetcherFactory});
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 writeTypedObject(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ExtraCallbackWithResult = resourceUriFetcherFactory.extraCallbackWithResult();
        int i4 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1ExtraCallbackWithResult;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onNavigationEvent(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 645211264, iOnExtraCallback, -645211262, new Object[]{resourceUriFetcherFactory});
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallback(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(resourceUriFetcherFactory, "");
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1023734169, iOnExtraCallback2, 1023734202, new Object[]{resourceUriFetcherFactory});
        int i3 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 55 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(@NotNull RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), 1726783244, new Object[]{this, realSubcomposeAsyncImageScope}, zzaq.onNavigationEvent(), -1726783240, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStub(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), 1205384165, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), -1205384158, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 access000(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), -1553948992, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), 1553948998, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 extraCallbackWithResult(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), 1281121744, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), -1281121743, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onActivityLayout(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), -1884390689, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), 1884390689, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackDefault(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), -491720216, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), 491720221, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallback_Parcel(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), 638121143, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), -638121141, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 ICustomTabsService(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), -95364575, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), 95364583, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 newSession(@NotNull ResourceUriFetcherFactory resourceUriFetcherFactory) {
        return (TextRoundCornerProgressBarSavedState1) onWarmupCompleted(zzaq.onNavigationEvent(), -9939198, new Object[]{this, resourceUriFetcherFactory}, zzaq.onNavigationEvent(), 9939201, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }
}
