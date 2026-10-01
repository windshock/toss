package o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.BiFunction;
import o.captureThreadTracetoBugsnagThread;
import o.component12;
import o.getOr;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class component12 implements captureThreadTrace {
    public void onExtraCallbackWithResult(ThreadSendPolicy threadSendPolicy) {
        threadSendPolicy.IAuthTabCallback(new BiFunction() { // from class: io.opentelemetry.sdk.extension.incubator.metric.viewconfig.ViewConfigCustomizer$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return component12.onExtraCallbackWithResult((getOr) obj, (captureThreadTracetoBugsnagThread) obj2);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.allThreadsbugsnag_android_core_release */
    public static getOr onExtraCallbackWithResult(getOr getor, captureThreadTracetoBugsnagThread capturethreadtracetobugsnagthread) throws allThreadsbugsnag_android_core_release, IOException {
        for (String str : capturethreadtracetobugsnagthread.IAuthTabCallback("otel.experimental.metrics.view.config")) {
            if (str.startsWith("classpath:")) {
                String strSubstring = str.substring(10);
                try {
                    InputStream resourceAsStream = component12.class.getResourceAsStream(strSubstring);
                    if (resourceAsStream == null) {
                        throw new allThreadsbugsnag_android_core_release("Resource " + strSubstring + " not found on classpath of classloader " + component12.class.getClassLoader().getClass().getName());
                    }
                    try {
                        getStartupTimebugsnag_android_core_release.onNavigationEvent(getor, resourceAsStream);
                        resourceAsStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    throw new allThreadsbugsnag_android_core_release("An error occurred reading view config resource on classpath: " + strSubstring, e);
                }
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(str);
                    try {
                        getStartupTimebugsnag_android_core_release.onNavigationEvent(getor, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } catch (FileNotFoundException e2) {
                    throw new allThreadsbugsnag_android_core_release("View config file not found: " + str, e2);
                } catch (IOException e3) {
                    throw new allThreadsbugsnag_android_core_release("An error occurred reading view config file: " + str, e3);
                }
            }
        }
        return getor;
    }
}
