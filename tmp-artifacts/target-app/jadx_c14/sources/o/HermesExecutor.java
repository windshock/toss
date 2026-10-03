package o;

import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.init.v2.CheckoutResult;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HermesExecutor {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final setExceptionHandlerEnabled IAuthTabCallback(@NotNull CheckoutResult checkoutResult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(checkoutResult, "");
        long jICustomTabsCallback = checkoutResult.ICustomTabsCallback();
        String strAccess100 = checkoutResult.access100();
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        String str = (String) CheckoutResult.onNavigationEvent(651634805, -651634803, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent3);
        String strOnActivityResized = checkoutResult.onActivityResized();
        String strAsInterface = checkoutResult.asInterface();
        String interfaceDescriptor = checkoutResult.getInterfaceDescriptor();
        boolean zIAuthTabCallback_Parcel = checkoutResult.IAuthTabCallback_Parcel();
        Set<String> setOnActivityLayout = checkoutResult.onActivityLayout();
        Set<String> setOnMessageChannelReady = checkoutResult.onMessageChannelReady();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        boolean zBooleanValue = ((Boolean) CheckoutResult.onNavigationEvent(1738607546, -1738607543, iOnNavigationEvent5, iOnNavigationEvent4, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent6)).booleanValue();
        String strAsBinder = checkoutResult.asBinder();
        String strWriteTypedObject = checkoutResult.writeTypedObject();
        int iExtraCallback = checkoutResult.extraCallback();
        setPluginVersion setpluginversionOnWarmupCompleted = accesssetIndexp.onWarmupCompleted(checkoutResult.onTransact());
        String typedObject = checkoutResult.readTypedObject();
        int iOnNavigationEvent7 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent8 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent9 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        setExceptionHandlerEnabled setexceptionhandlerenabled = new setExceptionHandlerEnabled(jICustomTabsCallback, strAccess100, str, strOnActivityResized, strAsInterface, interfaceDescriptor, zIAuthTabCallback_Parcel, setOnActivityLayout, setOnMessageChannelReady, zBooleanValue, strAsBinder, strWriteTypedObject, iExtraCallback, setpluginversionOnWarmupCompleted, typedObject, (String) CheckoutResult.onNavigationEvent(824555286, -824555286, iOnNavigationEvent8, iOnNavigationEvent7, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{checkoutResult}, iOnNavigationEvent9), checkoutResult.IAuthTabCallbackStubProxy());
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return setexceptionhandlerenabled;
        }
        throw null;
    }
}
