package o;

import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.interceptor.UnhandledInterceptorException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class tagView implements Interceptor {
    public Response intercept(@NotNull Interceptor.Chain chain) throws InterruptedException, IOException {
        Intrinsics.checkNotNullParameter(chain, "");
        try {
            return chain.proceed(chain.request());
        } catch (IOException e) {
            throw e;
        } catch (InterruptedException e2) {
            throw e2;
        } catch (Exception e3) {
            UnhandledInterceptorException unhandledInterceptorException = new UnhandledInterceptorException(e3);
            auth.IAuthTabCallback(-1588674344, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{auth.onNavigationEvent, unhandledInterceptorException, null, 2, null}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 1588674346, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
            throw unhandledInterceptorException;
        }
    }
}
